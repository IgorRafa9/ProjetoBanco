package banco;

public class ContaBancaria {
   private String nomeBanco;
   private String numeroAgencia;
   private String numeroConta;
   private String nomeTitular;
   private float saldo;
  
   
    
    public ContaBancaria(String nomeBanco, String numeroAgencia, String numeroConta, String nomeTitular){
        this.nomeBanco=nomeBanco;
        this.numeroAgencia=numeroAgencia;
        this.numeroConta=numeroConta;
        this.nomeTitular=nomeTitular;
        this.saldo=saldo;
        
    }
    
    
    public float getSaldo(){
        return saldo;
    }
    public String getNomeBanco(){
        return nomeBanco;
    }
    
    public String numeroConta(){
        return numeroConta;
    }
    
     public String numeroAgencia(){
        return numeroAgencia;
    }
     
    //Metodos

    float getSacar(float quant){
        if (quant <= saldo){
          saldo = saldo-quant;
        }
        return saldo;
    }
    
    float getDepositar(float quant){
        if(quant>0.0){
            saldo=saldo+quant;
        }
        return saldo;
    }        
}
