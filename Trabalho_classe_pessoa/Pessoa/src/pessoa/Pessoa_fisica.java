
package pessoa;

import java.util.Scanner;


public class Pessoa_fisica {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        Pessoa_fisica pf1 = new Pessoa_fisica();
        System.out.println("Digite seu CPF: ");
        pf1.cpfPessoa = sc.next();
    }
}
