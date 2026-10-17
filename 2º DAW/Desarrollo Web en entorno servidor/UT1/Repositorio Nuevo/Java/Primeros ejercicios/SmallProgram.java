import java.util.Scanner;

public class SmallProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Write a number between 1-10");
            int number = sc.nextInt();
            sc.nextLine(); //Consume el /n para poder pedir un nombre

            if(number >= 1 && number <= 10){
                System.out.println("Then, now tell me your name: ");
                String nombre = sc.nextLine();

                for (int i = 0; i < number; i++){
                    System.out.println("thankiu very mucho " + nombre);
                }
                System.out.println(nombre.length());
            }
        sc.close();
        }catch(Exception InputMismatchException){
            System.out.println("Write a number bruh");
        }catch(Exception e){
            System.out.println("Restart XD");
    }
}