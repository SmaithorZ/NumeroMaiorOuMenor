
import java.util.Scanner;

public class Main {

public static void main(String[]args){

String pegar = "";

    int n1,n2,n3;
   // pegar = entrada.nextLine();
          Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    n1 = Integer.parseInt(entrada.nextLine());
    System.out.println("Digite o segundo numero!:");
    n2 = Integer.parseInt(entrada.nextLine());
    System.out.println("Digite o terceiro numero!:");
    n3= Integer.parseInt(entrada.nextLine());
    if(n1>n2){
        System.out.println("O primeiro numero é maior do que o segundo!");
    }else{
        System.out.println("O segundo numero é maior do que o primeiro!");

    }if(n1>n3){
        System.out.println("O primeiro numero é maior do que o terceiro!");
    }else{
        System.out.println("O terceiro numero é maior do que o primeiro!");
    }if(n1<n2 && n1<n3){
        System.out.println("O primeiro numero é menor que o segundo e o terceiro");

    }else{
        System.out.println("O primeiro numero é maior que o segundo e o terceiro!");
    }if(n2<n1&& n2<n3){
        System.out.println("O segundo numero é menor que o primeiro e o terceiro!");
    }else{
        System.out.println("O segundo numero é maior que o primeiro e o terceiro!");
    }if(n3<n1&&n3<n2){
        System.out.println("O terceiro numero é menor que o primeiro e o segundo!");
    }else{
        System.out.println("O terceiro numero é maior que o primeiro e o segundo!");
    }


    //System.out.println("Digite o terceiro numero!:");
   // n3= Integer.parseInt(entrada.nextLine());












}


}
