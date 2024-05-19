public class Ave {
    // Propiedades
    private String especie;
    private String color;
    private int edad;

    // Constructor
    public Ave(String especie, String color, int edad) {
        this.especie = especie;
        this.color = color;
        this.edad = edad;
    }

    // Método para imprimir información de la ave
    public void imprimirInformacion() {
        System.out.println("Especie: " + especie);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
    }

    // Método para hacer que la ave vuele
    public void volar() {
        System.out.println("La ave está volando");
    }

    // Método para hacer que la ave cante
    public void cantar() {
        System.out.println("La ave está cantando");
    }

    // Getter para especie
    public String getEspecie() {
        return especie;
    }

    // Setter para especie
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Getter para color
    public String getColor() {
        return color;
    }

    // Setter para color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
