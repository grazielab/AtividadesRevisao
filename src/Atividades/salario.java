package src.Atividades;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = Double.parseDouble(sc.nextLine());

        while(salario <= 0 ){
        System.out.println("O salário não pode ser igual ou menor que zero. Digite seu salário novamente: \n");
        salario = Double.parseDouble(sc.nextLine());    
        }
        if(salario > 1997.58){
            System.out.println("O valor do seu salário maior que R$1997.58, sendo no valor de R$" + salario);
        }
        else if(salario > 5339.99){
            System.out.println("O valor do seu salário é maior que R$5339.99, sendo no valor de R$" + salario);
        }
        else{
            System.out.println("Obrigada por informar o valor do seu salário, que é de R$" + salario);
            System.out.println("Programa finalizado!");
        }
    }
}    