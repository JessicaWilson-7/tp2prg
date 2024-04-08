/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.company.tp2prg.jsf;

import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

/**
 *
 * @author USER
 */
@Named(value = "bean4")
@RequestScoped
public class Bean4 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        if (nombre != 0) {
            return "affichage_4?faces-redirect=true&nb=" + nombre;
        } else {
            return "affichage_4?faces-redirect=true";
        }
    }

    public String afficher4() {
        return "affichage__4?nb=" + nombre + "&amp;faces-redirect=true";
    }

    public String actionString(String base, String numEx, String query) {
        return base + "__" + numEx + ".xhtml" + (query != null ? "?" + query : "");
    }

}
