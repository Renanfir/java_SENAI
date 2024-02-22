
package classepessoa;

import java.util.Scanner;

public class ClassePessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaFisica pf1 = new PessoaFisica();
        
        System.out.print("Digite seu nome: ");
        pf1.nomePessoa = sc.next();
        
        System.out.print("Digite seu CPF: ");
        pf1.cpfPessoa = sc.next();
        
        System.out.print("Digite sua idade: ");
        pf1.idadePessoa = sc.nextInt();
        
        System.out.println(pf1.nomePessoa);
        System.out.println(pf1.idadePessoa);
        System.out.println(pf1.cpfPessoa);


    }
    
}
