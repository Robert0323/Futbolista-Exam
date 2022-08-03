package com.cenfotec.app.controller;

import com.cenfotec.app.domain.Antologia;
import com.cenfotec.app.domain.Articulo;
import com.cenfotec.app.service.AntologiaService;
import com.cenfotec.app.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Optional;


@Controller
public class AntologiaController {

        @Autowired
        AntologiaService anthologiaService;

        @Autowired
        ArticuloService articuloService;

        @RequestMapping("/")
        public String home(Model model) {
            return "index";
        }

        @RequestMapping(value = "/insertar",  method = RequestMethod.GET)
        public String insertarPage(Model model) {
            model.addAttribute(new Antologia());
            return "insertar";
        }

        @RequestMapping(value = "/insertar",  method = RequestMethod.POST)
        public String insertarAction(Antologia antologia, BindingResult result, Model model) {
            anthologiaService.save(antologia);
            return "index";
        }

        @RequestMapping("/listar")
        public String listar(Model model) {
            model.addAttribute("antologias",anthologiaService.getAll());
            return "listar";
        }

        @RequestMapping("/agregarArticulo/{id}")
        public String recuperarAntologiaParaArticulo(Model model, @PathVariable long id){
            Optional<Antologia> antologia = anthologiaService.get(id);
            Articulo articulo = new Articulo();
            if (antologia.isPresent()){
                model.addAttribute("nombreAntologia", antologia.get().getNombre());
                model.addAttribute("idAntologia",antologia.get().getId());
                model.addAttribute("articulo", articulo);
                return "agregarArticulo";
            }
            return "notFound";
        }

        @RequestMapping(value = "/agregarArticulo/{id}", method = RequestMethod.POST)
        public String guardarArticulo(Articulo articulo, Model model, @PathVariable long id) {
            Optional<Antologia> antologia = anthologiaService.get(id);
            if (antologia.isPresent()){
                articulo.setAntologia(antologia.get());
                articuloService.save(articulo);
                return "index";
            }
            return "error";
        }
}
