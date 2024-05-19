public class Main {
    public static void main(String[] args) {
       
        Ave ave1 = new Ave("Águila", "Marrón", 5);
        Ave ave2 = new Ave("Colibrí", "Verde", 1);
        Ave ave3 = new Ave("Búho", "Gris", 3);
        Ave ave4 = new Ave("Loro", "Rojo", 10);
        Ave ave5 = new Ave("Pingüino", "Negro y Blanco", 7);

        
        ave1.imprimirInformacion();
        ave1.volar();

        System.out.println();

        ave2.imprimirInformacion();
        ave2.volar();

        System.out.println();

        ave3.imprimirInformacion();
        ave3.cantar();

        System.out.println();

        ave4.imprimirInformacion();
        ave4.cantar();

        System.out.println();

        ave5.imprimirInformacion();
        ave5.volar();
    }
}
