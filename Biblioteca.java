package Default;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca{

	
    public static ArrayList<Libro> Catalogo;

    public static boolean registrar_libro(String a, String b, String c, int d, String e, String f, int g, String h, String i, String j){
        boolean result = false;
        if(Catalogo != null) {
	        for (Libro x : Catalogo){
	            if(x.getTitle().equalsIgnoreCase(a)){
	                System.out.println("El libro ya está registrado");
	                result = true;
	                break;
	            }
	        }
        }
        if(!result){
            Libro book = new Libro(a,b,c,d,e,f,g,h,i,j);
            System.out.println("Libro registrado exitosamente");
            Catalogo.add(book);
            result = true;
        }
        return result;
    }

    public static boolean buscar_libro(int i, String a){
        boolean result = false;
        List<String> Resultados = new ArrayList<String>();

        switch(i){
            case 1:
                for(Libro x: Catalogo){
                    if (x.getTitle().equalsIgnoreCase(a)){
                        Resultados.add(x.getTitle());
                        result = true;
                        break;
                    }
                }
                break;
            case 2:
                for(Libro x: Catalogo){
                    if (x.getAuthor().equalsIgnoreCase(a)){
                        Resultados.add(x.getTitle());
                        result = true;
                    }
                }
                break;
            case 3:
                for(Libro x: Catalogo){
                    if (x.getISBN() == Integer.parseInt(a)){
                        Resultados.add(x.getTitle());
                        result = true;
                        break;
                    }
                }
                break;
            default:
                System.out.println("Error, id fuera de rango");
                break;
                
        }
        
        if(!result){
            System.out.println("Libro(s) no Encontrado(s)");
        }
        else{
            System.out.println("Libro(s) encontrado(s): ");
            for(String x: Resultados){
                System.out.println(x);
            }
        }
        return result;
    }

    public static boolean editar_libro_String(String a, int i, String b){
        boolean result = false;
        for(Libro x : Catalogo){
            if(x.getTitle().equalsIgnoreCase(a)){
                switch(i){
                    case 1:
                        result = true;
                        x.setTitle(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 2:
                        result = true;
                        x.setAuthor(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 3:
                        result = true;
                        x.setDate(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 5:
                        result = true;
                        x.setEdit(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 6:
                        result = true;
                        x.setGender(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 8:
                        result = true;
                        x.setlocation(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 9:
                        result = true;
                        x.setDesc(b);
                        System.out.println("Libro editado correctamente");
                        break;
                    case 4:
                        result = true;
                        x.setPages(Integer.parseInt(b));
                        System.out.println("Libro editado exitosamente");
                        break;
                    case 7:
                        result = true;
                        x.setISBN(Integer.parseInt(b));
                        System.out.println("Libro editado exitosamente");
                        break;
                    default:
                        System.out.println("Error, id fuera de rango");
                        break;
                }
                break;
            }
        }
        if(!result){
            System.out.println("Libro no Encontrado");
        }
        return result;
    }

    public static boolean eliminar_libro(String a){
        boolean result = false;
        int i = 0;
        for(Libro x: Catalogo){
            if(x.getTitle().equalsIgnoreCase(a)){
                result = true;
                Catalogo.remove(i);
                System.out.println("Libro eliminado exitosamente");
                break;
            }
            else {
            	i++;
            }
        }
        if (!result){
            System.out.println("Libro no encontrado");
        }
        return result;
    }
    
    public static boolean change_state(String a, int i){
        boolean result = false;
        for(Libro x: Catalogo){
            if(x.getTitle().equalsIgnoreCase((a))){
                switch(i){
                    case 1:
                        if(x.getState().equalsIgnoreCase("Prestado")){ 
                            System.out.println("El libro ya está prestado");
                            
                            break;
                        }
                        if(x.getState().equalsIgnoreCase("Extraviado")){
                            System.out.println("El libro se encuentra extraviado");
                            
                            break;
                        }
                        else{
                            x.setState("Prestado");
                            System.out.println("Recoja el libro en " + x.getlocation());
                            result = true;
                            break;
                        }
                    case 2:
                        if(x.getState().equalsIgnoreCase("Disponible")){ 
                            System.out.println("El libro ya se encuentra disponible");
                            
                        }
                        else{
                            x.setState("Disponible");
                            System.out.println("Deposite el libro en " + x.getlocation());
                            result = true;
                        }
                        break;
                    case 3:
                        if(x.getState().equalsIgnoreCase("Extraviado")){ 
                            System.out.println("El libro ya se encuentra extraviado");
                            
                        }
                        else{
                            x.setState("Extraviado");
                            System.out.println("Gracias por su colaboración, conseguiremos un nuevo ejemplar proximamente");
                            result = true;
                        }
                        break;
                    case 4:
                        if(x.getState().equalsIgnoreCase("Prestado") || x.getState().equalsIgnoreCase("Disponible")){ 
                            System.out.println("El libro no se encuenta extraviado");
                            
                        }
                        else{
                            x.setState("Disponible");
                            System.out.println("Muchas gracias por su colaboración");
                            result = true;
                        }
                        break;
                    default:
                        System.out.println("Error, id fuera de rango");
                        break;
                }
            
            }
        }
        if(!result){
            System.out.println("Libro no encontrado");
        }
        return result;
    }

    public static void main(String args[]){
        Catalogo = new ArrayList<Libro>();
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Le doy la bienvenida a nuestra biblioteca");
        boolean B = true;
        while(B){
            System.out.println("1) Registrar Libro");
            System.out.println("2) Buscar Libro");
            System.out.println("3) Editar Libro");
            System.out.println("4) Eliminar Libro");
            System.out.println("5) Pedir Libro");
            System.out.println("6) Devolver Libro");
            System.out.println("7) Devolver Libro Extraviado");
            System.out.println("8) Salir");
            
            int choice = myObj.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Ingrese datos del libro");
                    System.out.println("Título:");
                    String A = myObj.nextLine();
                    System.out.println("Autor");
                    String BB = myObj.nextLine();
                    System.out.println("Fecha");
                    String C = myObj.nextLine();
                    System.out.println("Número de páginas");
                    int D = myObj.nextInt();
                    System.out.println("Editorial");
                    String E = myObj.nextLine();
                    System.out.println("Género(s)");
                    String F = myObj.nextLine();
                    System.out.println("ISBN");
                    int G = myObj.nextInt();
                    System.out.println("Ubicación");
                    String H = myObj.nextLine();
                    String I = "Disponible";
                    System.out.println("Descipción");
                    String J = myObj.nextLine();
                    
                    registrar_libro(A,BB,C,D,E,F,G,H,I,J);
                    break;
                case 2:
                    System.out.println("¿Cómo quieres buscar el/los libros?");
                    System.out.println("1) Titulo");
                    System.out.println("2) Autor");
                    System.out.println("3) ISBN");
                    choice = myObj.nextInt();
                    System.out.println("Ingrese dato a buscar");
                    String T = myObj.nextLine();
                    buscar_libro(choice, T);
                    break;
                case 3:
                    System.out.println("¿Qué dato quiere cambiar?");
                    System.out.println("1) Titulo");
                    System.out.println("2) Autor");
                    System.out.println("3) Fecha");
                    System.out.println("4) Paginas");
                    System.out.println("5) Editorial");
                    System.out.println("6) Genero");
                    System.out.println("7) ISBN");
                    System.out.println("8) Ubicacion?");
                    System.out.println("9) Descripción");
                    
                    int Data = myObj.nextInt();
                    System.out.println("Indique Título del Libro");
                    String BookE = myObj.nextLine();
                    change_state(BookE, Data);
                    break;
                case 4:
                    System.out.println("Indique Título del Libro");
                    String Del = myObj.nextLine();
                    eliminar_libro(Del);
                    break;
                case 5:
                    System.out.println("Indique Título del Libro");
                    String Book1 = myObj.nextLine();
                    change_state(Book1, 1);
                    break;
                case 6:
                    System.out.println("Indique Título del Libro");
                    String Book2 = myObj.nextLine();
                    change_state(Book2, 2);
                    break;
                case 7:
                    System.out.println("Indique Título del Libro");
                    String Book3 = myObj.nextLine();
                    change_state(Book3, 3);
                    break;
                case 8:
                    B = false;
                    break;
                default:
                    break;
            }
        System.out.println("");
        }
        System.out.println("Muchas gracias por su visita");
        myObj.close();
    }
}