package com.ucenfotec.examen2.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Futbolista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String fechaNacimiento;
    private String posicion;
    private String ramaJuega;
    private String direccion;
    private String provincia;
    private String canton;
    private String distrito;
    private String telefono;
    private String email;
    private double altura;
    private double peso;
    private double masaMuscular;
    private String ultimoPesaje;

    public String getUltimoPesaje() {
        return ultimoPesaje;
    }

    public void setUltimoPesaje(String ultimoPesaje) {
        this.ultimoPesaje = ultimoPesaje;
    }

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

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getRamaJuega() {
        return ramaJuega;
    }

    public void setRamaJuega(String ramaJuega) {
        this.ramaJuega = ramaJuega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(double masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public Futbolista(long id, String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String posicion, String ramaJuega, String direccion, String provincia, String canton, String distrito, String telefono, String email, double altura, double peso,String ultimoPesaje, double masaMuscular) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.ramaJuega = ramaJuega;
        this.direccion = direccion;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.telefono = telefono;
        this.email = email;
        this.altura = altura;
        this.peso = peso;
        this.ultimoPesaje = ultimoPesaje;
        this.masaMuscular = masaMuscular;
    }

    public Futbolista() {

    }
}
