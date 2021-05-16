package Lista3Puc;
import java.util.Scanner;
public class Lista3Att4 {
    public static void main(String[] args) {
        double delta,x1,x2;
        int a,b,c;

        Scanner ler = new Scanner (System.in);
        System.out.println("informe o valor de A : ");
        a = ler.nextInt();
        System.out.println("informe o valor de B : ");
        b = ler.nextInt();
        System.out.println("informe o valor de C : ");
        c = ler.nextInt();
        delta = (Math.pow(b,2))-4*a*(a*c);
        System.out.println("O valor de dela é "+delta);
        if(delta<0) {
            System.out.println("não exite raizes Reais");
        }

        else if (delta==0){
            x1=-b/(2*a);
            x2=x1;
            System.out.println("Raizes de x1 ="+x1);
        }else{
          x1=(-b+Math.sqrt(delta))/(2*a);
          x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("o valor de x1 é "+x1);
            System.out.println("o valor de x2 é "+x2);
        }



}
}
