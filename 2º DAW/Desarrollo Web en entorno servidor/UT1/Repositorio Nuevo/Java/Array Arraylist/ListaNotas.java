import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ListaNotas{
    public static void main(String[] args){
        ArrayList<Integer> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

            int nota = 0;
            do {
                try {
                    nota = sc.nextInt();
                    if (nota >= 0) {
                        notas.add(nota);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Introduzca un número");
                    sc.next(); // descarta lo que no es entero
                }
            } while (nota >= 0);




        System.out.println(notas);


        double media = 0;
        double contador = 0;
        for (int i = 0; i < notas.size(); i++){
            media += notas.get(i);
            contador++;
        }
        media = media / contador;
        System.out.println("La media es: " + media);

        int notaMasAlta = 0;
        for (int i = 0; i < notas.size(); i++){
            if(notaMasAlta < notas.get(i)){
                notaMasAlta = notas.get(i);
            }
        }
        System.out.println("Nota mas alta: " + notaMasAlta);

    }


}