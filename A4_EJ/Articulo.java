package A4_EJ;

public class Articulo {

    private String nombre;
    private float Precio, pvp, iva = 1.21f;


    Articulo(String nombre, float precio, float iva, int quedanUnidades){
        if (nombre.equals("")){
            System.out.println("ERROR, NOMBRE VACIO");
        }
        if (precio < 0.0f){
            System.out.println("ERROR, PRECIO POR DEBAJO DE 0 EUROS");
        }
        if ((iva < 1.0f) || (iva > 2.0f)){
            System.out.println("ERROR, IVA INADECUADO");
        }
        if ((quedanUnidades == 0)){
            System.out.println("NO QUEDAN UNIDADES");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public void setPvp(){

        pvp = Precio * iva;
    }

    public float getPvp(){
        return pvp;
    }

    public void imprimirTodo(){
        System.out.println(getNombre() + " - Precio: " + getPrecio() + " - IVA: 21% - PVP: " + getPvp() + "€");
    }
}
