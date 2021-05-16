package Lista3Puc;
import java.util.Scanner;
public class Lista3Att6 {
    public static void main(String[] args) {
        double salario,aumento,novoSalario;
        String nome;
        Scanner ler = new Scanner (System.in);
        System.out.println("informe o salario atual do jogador: ");
            nome = ler.nextLine();

        System.out.println("Infome o Salario do jogador: ");
        salario = ler.nextDouble();
        if(salario<=900){
            aumento=salario*0.20;
        }
        else if(salario<=1300){
            aumento=salario*0.15;
        }
        else if(salario<=1800){
            aumento=salario*0.10;
        }else{
            aumento=salario*0.05;
        }
        novoSalario=salario+aumento;
        System.out.println("O jogador " +nome+ " tera um aumento de R$:" +aumento+ " e passara receberR$:" +novoSalario);




    }
}
