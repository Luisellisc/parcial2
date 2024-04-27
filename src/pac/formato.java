package pac;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class formato {
    private String usuario;
    private String gmail;
    private String password;

    public formato(String user, String mail, String password){
        this.usuario = user;
        this.gmail = mail;
        this.password = password;
    }

    public String getuser(){
        return this.usuario;
    }
    public String getMail(){
        return this.gmail;
    }
    public String getPassword(){
        return this.password;
    }

    public String Info(){
        return "Nombre de usuario: " + usuario + "\nCorreo: " + gmail + "\nContrasena " + password;
    }

    public void LogIn(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario");
        String usuario = sc.nextLine();

        System.out.println("Ingrese su correo: ");
        String correo = sc.nextLine();

        System.out.println("Ingrese su contrasena");
        String contrasena = sc.nextLine();

        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher(contrasena);
        if (matcher.find()) {
            System.out.println("Ha iniciado sesion");
        }
        else {System.out.println("Contrasena o correo incorrecto");}
    }


}