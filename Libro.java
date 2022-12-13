package Default;

public class Libro{
    String titulo;
    String autor;
    String fecha;
    int paginas;
    String editorial;
    String genero;
    int isbn;
    String ubicacion;
    String estado;
    String descripcion;

    public Libro(String a, String b, String c, int d, String e, String f, int g, String h, String i, String j) {
    	this.titulo = a;
        this.autor=b;
        this.fecha=c;
        this.paginas=d;
        this.editorial=e;
        this.genero=f;
        this.isbn=g;
        this.ubicacion=h;
        this.estado=i;
        this.descripcion=j;
    }
    
    
    public void setTitle(String a){
        this.titulo = a;
    }

    public void setAuthor(String b){
        this.autor = b;
    }

    public void setDate(String c){
        this.fecha = c;
    }

    public void setPages(int d){
        this.paginas = d;
    }

    public void setEdit(String e){
        this.editorial = e;
    }

    public void setGender(String f){
        this.genero = f;
    }

    public void setISBN(int g){
        this.isbn = g;
    }

    public void setlocation(String h){
        this.ubicacion = h;
    }

    public void setState(String i){
        this.estado = i;
    }

    public void setDesc(String j){
        this.descripcion = j;
    }

    public String getTitle(){
        return titulo;
    }

    public String getAuthor(){
        return autor;
    }

    public String getDate(){
        return fecha;
    }

    public int getPages(){
        return paginas;
    }

    public String getEdit(){
        return editorial;
    }

    public String getGender(){
        return genero;
    }

    public int getISBN(){
        return isbn;
    }

    public String getlocation(){
        return ubicacion;
    }

    public String getState(){
        return estado;
    }

    public String getDesc(){
        return descripcion;
    }
}
