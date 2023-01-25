import java.util.Scanner;
public class EmailCheck {
public static void main(String[] args) {

    String email;
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o seu e-mail: ");
    email = sc.nextLine();

    if (email.contains("@")) {
        System.out.println("E-mail é valido!");
        System.out.println(email.contains("br") ? "É brasilero" : "Não é brasileiro");
        int indice = email.indexOf("@");
        String usuario = email.substring(0, indice);
        String dominio = email.substring(indice + 1);
        System.out.println("Seu usuario: " + usuario);
        System.out.println("Seu dominio: " + dominio);

}   else {
        System.out.println("E-mail NÃO valido, favor enserir um e-mail valido");

}

}
}
