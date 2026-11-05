
import java.util.Scanner;

class BibliotecaMunicipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = sc.nextLine();
        int diasRetraso = sc.nextInt();
        double tarifaBaseMulta = sc.nextDouble();
        Libro librito = new Libro(titulo, diasRetraso, tarifaBaseMulta);
    }
}

class Libro {

    private String titulo;
    private int diasRetraso;
    protected double tarifaBaseMulta;

    public Libro(String titulo, int diasRetraso, double tarifaBaseMulta) {
        this.titulo = titulo.trim().toUpperCase();
        this.diasRetraso = diasRetraso;
        this.tarifaBaseMulta = tarifaBaseMulta;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getDiasRetraso() {
        return this.diasRetraso;
    }

    public double calcularMulta() {
        return this.diasRetraso * this.tarifaBaseMulta;
    }
}

class LibroColeccion extends Libro {

    private boolean esRaro;

    public LibroColeccion(String titulo, int diasRetraso, double tarifaBase, boolean esRaro) {
        super(titulo, diasRetraso, tarifaBase);
        this.esRaro = esRaro;
    }

    @Override
    public double calcularMulta() {
        double multaBase = super.calcularMulta();
        double recargo = Math.pow(getDiasRetraso(), 1.5);
        return multaBase + recargo;
    }
}
/**
 * ¿Qué clase de la biblioteca estándar se importa en la primera línea y para
 * qué se utilizará?
 *
 * Se usa Scanner, sirve para leer datos desde consola
 *
 * Explica la diferencia de visibilidad entre titulo y tarifaBaseMulta. ¿Podría
 * la clase LibroColeccion modificar directamente titulo sin usar métodos
 * auxiliares? Justifica tu respuesta.
 *
 * tarifaBaseMulta es protected, lo cual implica que si puede ser modificado por
 * LibroColeccion pues este hereda de libro y por tanto si tiene acceso, para
 * eso existe protected, sin embargo el atributo titulo es private, haciendo
 * necesario usar getters y setters.
 *
 * Identifica un método de instancia de la clase String y un método estático de
 * la clase Math usados en el código. Explica por qué el método de Math se pudo
 * invocar sin hacer new Math().
 *
 * Un metodo de instancia en String es trim(), que elimina los espacios en
 * blanco al principio y al final de una cadena. Un metodo estático de Math es
 * pow() que permite elevar un número a una potencia, se pueden invocar sin
 * objeto porque es un metodo static, pertenece a math y no a una instancia de
 * ella.
 *
 */
