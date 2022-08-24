
package Ejercicio_1;

/**
 *
 * @author FrancoSca
 */
public class Libro {
    public int isbn;
    public String nombre;
    public String autor;
    public int pag;

    public Libro() {
    }

    public Libro(int isbn, String nombre, String autor, int pag) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.pag = pag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPag() {
        return pag;
    }
    
    
}
