
package biblioteca;

public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int npaginas;
    
    //Constructores
    
    public Libro(int pisbn,String ptitulo,String pautor,int numpag){
        isbn=pisbn;
        titulo=ptitulo;
        autor=pautor;
        npaginas=numpag;
    }
    
    //Metodos

    public int getIsbn() {
        return isbn;
    }
    
    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }
    
    //Metodos dicionales
    @Override
    public String toString(){
        return "El libro "+titulo+" con ISBN "+isbn+" creado por el autor "+
                autor+" tiene "+npaginas+" paginas";
    }
    
}
