/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author pikac
 */
import java.util.*;

public class Alumnado implements Comparable<Alumnado>{
    
    private String nomAlumno;
    private Map <String, String> calificaciones = new TreeMap<>();

    public Alumnado() {                       
    }

    public Alumnado(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public Map<String, String> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<String, String> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumnado{" + "nomAlumno=" + nomAlumno + ", calificaciones=" + calificaciones + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nomAlumno);
        hash = 31 * hash + Objects.hashCode(this.calificaciones);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnado other = (Alumnado) obj;
        if (!Objects.equals(this.nomAlumno, other.nomAlumno)) {
            return false;
        }
        if (!Objects.equals(this.calificaciones, other.calificaciones)) {
            return false;
        }
        return true;
    }
        
    @Override
    public int compareTo(Alumnado a) {
        return this.nomAlumno.compareTo(a.getNomAlumno());
    }
    
}
