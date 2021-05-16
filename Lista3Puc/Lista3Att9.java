package Lista3Puc;

import java.util.Scanner;

public class Lista3Att9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero,mc,resto,centena,invertido,milhar;
        System.out.println("Teste de Palidromo ");

        System.out.println("informe um numero de 4 algorismos para ser verificado: ");
        numero= ler.nextInt();
        if((numero<1000)||(numero>9999)){
            System.out.println("O numero deve conter 4 algorismos");
        }
        else{
            mc=numero/100;
            resto=numero%100;
            milhar=mc/10;
            centena=mc%10;
            invertido=centena*10+milhar;
            if(invertido==resto){
                System.out.println("O numero é um polindromo");
            }else{
                System.out.println("o numero não é um polindromo");
            }

        }


    }
}
