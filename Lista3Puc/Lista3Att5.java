package Lista3Puc;
import java.util.Scanner;
public class Lista3Att5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double Media;
        String Nome;
        System.out.println("---------------------------");
        System.out.println("Programa Bolsa de estudos");
        System.out.println("---------------------------");

        System.out.println("Informe o nome do aluno");
            Nome = ler.nextLine();

        System.out.println("Informe a médio do aluno: ");
            Media = ler.nextDouble();

            if(Media>=9){
                System.out.println("O aluno "+Nome+" obteve media "+Media+"e é altamente  recomendado");
            }
            else if(Media>=8 ){
                System.out.println("O aluno "+Nome+" obteve media "+Media+"e é Fortemente  recomendado");
        }
            else if(Media>=7){
                System.out.println("O aluno "+Nome+" obteve media "+Media+"e é recomendado");
            }
            else{
                System.out.println("O aluno "+Nome+" obteve media "+Media+" e não é recomendado para a vaga ");
            }

        }
    }

