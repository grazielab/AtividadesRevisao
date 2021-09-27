package src.Atividades;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean invalido = false;
        byte idade = 0;

        System.out.println("Digite sua idade: ");
        idade = Byte.parseByte(sc.nextLine());
        
        while(idade < 0){
            System.out.println("A idade não pode ser um valor negativo! Digite novamente: ");
            idade = Byte.parseByte(sc.nextLine());
        }
        if( idade > 25){
            System.out.println("Passou dos 25 anos. \n");
        }else if(idade < 25){
            System.out.println("Menor de 25 anos.");
        }
        else{
            System.out.println("Idade igual a 25 anos.");
        }
    }
}