package Lista3Puc;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lista3Att2 {
    public static void main(String[] args) {
        float n1,n2,media;
        String aluno;
        Scanner ler = new Scanner (System.in);
        System.out.println("Programa para saber sua média de notas e se passou ou não");

        System.out.println("Informe Seu nome: ");
            aluno = ler.nextLine();
        System.out.print("Digite sua nota 1 :");
            n1 = ler.nextFloat();
        System.out.print("Digite sua nota 2 :");
            n2 = ler.nextFloat();

media=((n1*2)+(n2*3))/5;
if(media>=7){
    System.out.println("O aluno "+aluno+" Obteve media de "+media+" e esta aprovado ");
}
else if (media<3){
    System.out.println("O aluno "+aluno+" obteve media de "+media+" e esta reprovado");
}
else{
    System.out.println("O aluno"+aluno+" obteve media de "+media+" e esta de recuperação");
}
    }
}
