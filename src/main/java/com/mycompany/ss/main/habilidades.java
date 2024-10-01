/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ss.main;

import jakarta.faces.bean.RequestScoped;
import jakarta.inject.Named;
@RequestScoped
@Named
/**
 *
 * @author acer
 */
public class habilidades {

    public habilidades() {
        nombre = "Nicolas Rivera Samano";
        carrera = "Tegnologias de la informacion y comunicacion";
        correo = "nr112173@gmail.com";
        celular = "466-115-1093";
        direccion = "Maravatio del encinal calle mariano matamoros #305B";
        lenguajes = "[ JAVA ]--" +  "[ C++ ]--" + "[ PYTON ]--" + "[ C# ]";
        bd = "[MYSQL]--[SQLSERVER]--[ORACLE DATABASE]";
        proyectos = "1.Creacion de un software para una tienda";
        proyecto2 = "2.Como programar un brazo robotico KUKA";
        calificacion = "91";
    }
    
    
    private String nombre;
    private String carrera;
    private String correo;
    private String celular;
    private String direccion;
    private String lenguajes;
    private String bd;
    private String proyectos;
    private String calificacion;
    private String proyecto2;

    public String getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(String proyecto2) {
        this.proyecto2 = proyecto2;
    }

    
    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getProyectos() {
        return proyectos;
    }

    public void setProyectos(String proyectos) {
        this.proyectos = proyectos;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
