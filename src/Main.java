import pac.formato;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        String correo = sc.nextLine();
        System.out.println("Ingrese su contrasena: ");
        String contrasena = sc.nextLine();

        formato user  = new formato(usuario, correo, contrasena);

        System.out.println("1. Ingresar");
        System.out.println("2.Olvide mi correo y contrasena");

        int e = sc.nextInt();

        switch (e){
            case 1:
                user.LogIn();
                break;
            case 2:
                System.out.println(user.Info());
        }

    }
}
