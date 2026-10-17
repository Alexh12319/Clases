import java.util.Scanner;

public class SaluteScanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Nombre = sc.nextLine();
        if(Nombre == ""){
            System.out.println("Hola mundo");
        }else{
            System.out.println("Hola " + Nombre);
        }
    }
}