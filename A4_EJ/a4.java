package A4_EJ;

public class a4 {

    public static void main(String[] args) {
        Articulo art1 = new Articulo("Hola", 14.5f,1.76f,4 );

        Articulo art2 = new Articulo("", -12.0f,2.76f,0 );

        art1.setNombre("Parrilla");
        art1.setPrecio(44.4f);
        art1.setPvp();
        art1.getPvp();

        art1.imprimirTodo();

    }


}
