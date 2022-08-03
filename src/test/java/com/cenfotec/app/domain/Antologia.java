package com.cenfotec.app.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Antologia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;

    @OneToMany(fetch= FetchType.LAZY, mappedBy="antologia")
    private Set<Articulo> articulos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
}
