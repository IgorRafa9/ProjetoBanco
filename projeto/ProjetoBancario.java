
package banco;

import java.util.Calendar;
import java.util.Scanner;

public class ProjetoBancario {

  public static void main(String[] args) {
     //Data e Hora
      Calendar c=Calendar.getInstance();
      System.out.println(c.getTime());
   
       //Informações do Bancos
       String resp="S";
       String resp2; 
       int escolha;
       
       //Informar Nome
       Scanner tecla=new Scanner(System.in);
       System.out.println("Informe nome: ");
       String nomeTitular=tecla.nextLine();
       
       //Informações da Conta
       ContaBancaria cb=new ContaBancaria(nomeTitular,"0000000","00000000","XXXXXXXXXXXX");
       String conf="S";
       String conf2;
       
       //Limite
       int n_saque=3;
       
      do{
        System.out.println("Escolha a opção desejada: ");
        System.out.println("1- Depósito");
        System.out.println("2- Sacar");
        System.out.println("3- Verificar Saldo");
        escolha=tecla.nextInt();
        switch(escolha){
        
        case 1:
            System.out.println("Valor a depositar:");
            float deposito=tecla.nextFloat();
            System.out.println("Confirmar deposito?");
            conf2=tecla.next();
            if(conf2.equalsIgnoreCase(conf)){
                cb.getDepositar(deposito);
                System.out.println("Deposito de R$"+deposito+" realizado");
                System.out.println("Saldo R$"+cb.getSaldo());
            }else{
                 
            }
             System.out.println("Encerrar operação?");
             System.out.println("1- Sim");
             System.out.println("2- Não");
             escolha=tecla.nextInt();
               if(escolha==1){
                  System.out.println("Fim.");
               }
            break;
        
        case 2: 
            if(n_saque>0){
            System.out.println("Limite de saque diários "+n_saque);
            n_saque--;
            System.out.println("Sacar:");
            float saque=tecla.nextFloat();
            
            System.out.println("Confirmar saque?");
            conf2=tecla.next();
            
            if(conf2.equalsIgnoreCase(conf)){
                if(saque<cb.getSaldo()){
                cb.getSacar(saque);
                System.out.println("Saque de R$"+saque+" realizado");
                System.out.printf("Saldo: %.2f\n",cb.getSaldo());
              }else{
                    System.out.println("Saldo insuficiente.");
                } 
                System.out.println("Você ainda possui "+n_saque+" saques diários");
            }
             System.out.println("Encerrar operação?");
             System.out.println("1- Sim");
             System.out.println("2- Não");
             escolha=tecla.nextInt();
               if(escolha==1){
                  System.out.println("Fim.");
               }
              }else{
                System.out.println("Limite de saque diário excedido.");
            }
            break;
            
        case 3:
            System.out.println("Verificar saldo:");
            System.out.println("Nome do titular: "+nomeTitular);
            System.out.println("Banco: "+cb.getNomeBanco());
            System.out.println("Nº da conta: "+cb.numeroConta());
            System.out.println("Nº Agencia: "+cb.numeroAgencia()); 
            System.out.println("Saldo:"+cb.getSaldo());
            
            
             System.out.println("Encerrar operação?");
             System.out.println("1- Sim");
             System.out.println("2- Não");
             escolha=tecla.nextInt();
               if(escolha==1){
                  System.out.println("Fim.");
               }
            break;
            
        case 4:
              System.out.println("Sair.");
              break;
              
        default:
            System.out.println("Opção inválida.");
    }
        
           System.out.println("Fazer nova operação?");
           resp2=tecla.next();
  }while(resp2.equalsIgnoreCase(resp));
        System.out.println("Operações Finalizadas.");
       
  }
  
}
       

    

    