package Lista3Puc;
import java.util.Scanner;
public class Lista3Att3 {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner ler = new Scanner (System.in);
        System.out.println("Programa para saber é ou não maior do que 18 anos");

        System.out.println("Informe o seu nome; ");
             nome= ler.nextLine();
        System.out.println("Informe sua idade; ");
        idade= ler.nextInt();
        if(idade>18){
            System.out.println(""+nome+" Tem "+idade+" e é maior de idade");
        }else{
            System.out.println(""+nome+" tem "+idade+" e não é maior de idade");
        }


    }
}
