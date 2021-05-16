package Lista3Puc;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Lista3Att7 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner ler = new Scanner (System.in);

        System.out.println("Programar que lê três valores e determina qual é o maior e o menor.");

        System.out.println("Informe o valor de A");
            a= ler.nextDouble();
        System.out.println("Informe o valor de B");
            b= ler.nextDouble();
        System.out.println("Informe o valor de C");
            c= ler.nextDouble();

            if(a>b){
                a=a+b;
                b=a-b;
                a=a-b;
            }
            if(a>c){
                a=a+c;
                c=a-c;
                a=a-c;
            }
            if(b>c){
                b=b+c;
                c=b-c;
                b=b-c;

            }
             if((a==b)&&(b==c)){
            System.out.println("Todos os numeros são iguais");
        }
            else{
                System.out.println(" o menor  é "+a+" e o marior é "+c);
            }




    }
}
