/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agustin
 */
public class Libro {
    String titulo,autor,editorial,año,tipo,numero,ultimoprestamo,fechaultimoprestamo,DNI;

    public Libro(String titulo, String autor, String editorial, String año, String tipo, String numero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.año = año;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUltimoprestamo() {
        return ultimoprestamo;
    }

    public void setUltimoprestamo(String ultimoprestamo) {
        this.ultimoprestamo = ultimoprestamo;
    }

    public String getFechaultimoprestamo() {
        return fechaultimoprestamo;
    }

    public void setFechaultimoprestamo(String fechaultimoprestamo) {
        this.fechaultimoprestamo = fechaultimoprestamo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
}
