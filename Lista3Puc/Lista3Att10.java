package Lista3Puc;

import java.text.DecimalFormat;
import java.util.Scanner;					//PACKAGE
import java.text.DecimalFormat;
public class Lista3Att10 { 			//BIBLIOTECA_IMPORTADA
    public static void main(String[] args) {    //CLASSE


        Scanner in = new Scanner (System.in);
        in = new Scanner(System.in); //comando_necessário para_a leitura_de_dados


        System.out.println("Campanhia de pulverização faz tudo ltda");
        System.out.println("Escolha uma opção : ");
        System.out.println(" digite 1 para : pulverização contra ervas daninhas,  R$ 5,00 por acre");
        System.out.println(" digite 2 para : pulverização  contra gafanhotos, R$ 10,00 por acre;");
        System.out.println(" digite 3 para : pulverização contra broca, R$ 15,00 por acre");
        System.out.println(" digite 4 para : pulverização contra tudo acima, R$ 25,00");
        System.out.println();
        System.out.println("Digite seu nome :");
        String nome = in.next();
        System.out.println("Escolha o tipo de pulverização :");
        int pul = in.nextInt();

        switch (pul) {

            case 1 : System.out.println("pulverização contra ervas daninhas");
                System.out.println("Digite o valor do acre :");
                double acre1 = in.nextDouble();
                double valor1 = acre1 * 5 ;

                if( acre1 > 300) {

                    valor1 = valor1 - ( valor1 / 20 ) ;

                }

                if(valor1 > 1750) {


                    double	valor_desc1 = valor1 - 1750 ;

                    valor_desc1 = valor_desc1 / 10 ;

                    valor1 = valor1 - valor_desc1 ;

                }




                System.out.println("O fazendeiro "+nome+ " pagará pelo serviço de "
                        + "pulverização no valor de "+valor1+ " R$") ;
                break ;


            case 2 : System.out.println("pulverização  contra gafanhotos");
                System.out.println("Digite o valor do acre :");
                double acre2 = in.nextDouble();
                double valor2 = acre2 * 10 ;

                if( acre2 > 300) {

                    valor2 = valor2 - ( valor2 / 20 ) ;

                }

                if(valor2 > 1750) {


                    double	valor_desc2 = valor2 - 1750 ;

                    valor_desc2 = valor_desc2 / 10 ;

                    valor2 = valor2 - valor_desc2 ;

                }




                System.out.println("O fazendeiro "+nome+ " pagará pelo serviço de "
                        + "pulverização no valor de "+valor2+ " R$");

                break ;

            case 3 : System.out.println("pulverização contra broca");
                System.out.println("Digite o valor do acre :");
                double acre3 = in.nextDouble();
                double valor3 = acre3 * 15 ;


                if( acre3 > 300) {

                    valor3 = valor3 - ( valor3 / 20 ) ;

                }

                if(valor3 > 1750) {


                    double	valor_desc3 = valor3 - 1750 ;

                    valor_desc3 = valor_desc3 / 10 ;

                    valor3 = valor3 - valor_desc3 ;

                }




                System.out.println("O fazendeiro "+nome+ " pagará pelo serviço de "
                        + "pulverização no valor de "+valor3+ " R$");
                break ;


            case 4 : System.out.println("pulverização contra tudo");
                System.out.println("Digite o valor do acre :");
                double acre4 = in.nextDouble();
                double valor4 = acre4 * 25 ;

                if( acre4 > 300) {

                    valor4 = valor4 - ( valor4 / 20 ) ;

                }

                if(valor4 > 1750) {


                    double	valor_desc4 = valor4 - 1750 ;

                    valor_desc4 = valor_desc4 / 10 ;

                    valor4 = valor4 - valor_desc4 ;

                }




                System.out.println("O fazendeiro "+nome+ " pagará pelo serviço de "
                        + "pulverização no valor de "+valor4+ " R$");

                break ;


        }

    }

}