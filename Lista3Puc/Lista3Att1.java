package Lista3Puc;
import java.util.Scanner;
public class Lista3Att1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
float M,N,ResultadoDaDivisao,RestoDeMN;

        System.out.println("Programa para saber Se M é divisivel por N");

        System.out.println("Informe o número M : ");
        M = ler.nextFloat();

        System.out.println("Informe o número N : ");
        N = ler.nextFloat();

        ResultadoDaDivisao=M/N;
        RestoDeMN=M%N;
        if(RestoDeMN==0){
            System.out.println("O numero "+M+" é divisivel por "+N);
        }else{
            System.out.println("O numero "+M+" não é divisivel por "+N);
        }
        System.out.println("O cociente da divisão de M/N é "+ResultadoDaDivisao);
        System.out.println("O resto da divisão M%N é "+RestoDeMN);
    }
}
