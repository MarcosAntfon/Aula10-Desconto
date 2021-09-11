import java.util.Scanner;
 
public class DescontoNasCompras {
	
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
     
    // vamos solicitar o c�digo e o pre�o atual do produto
    
    System.out.print("Informe o c�digo do produto: ");
    int codigo = Integer.parseInt(entrada.nextLine());
    
    System.out.print("Informe o pre�o atual do produto: ");
    double precoAtual = Double.parseDouble(entrada.nextLine());
     
    // vamos calcular o desconto
    
    double desconto;
    
    // o pre�o � menor que 30.00?
    
    if(precoAtual < 30){
    	
      desconto = 0.0; // n�o h� desconto  
    }
    
    // Igual ou superior a R$ 30,00 e menor que R$ 100,00
    
    else if((precoAtual >= 30.00) && (precoAtual < 100.00)){
      desconto = precoAtual * 0.1; // desconto de 10%
    }
    
    // Igual ou acima de R$ 100,00
    
    else{
      desconto = precoAtual * 0.15; // desconto de 15%
    }
     
    // mostra o resultado
    
    System.out.println("Pre�o Atual: " + precoAtual);
    System.out.println("Desconto: " + desconto);
    System.out.println("Novo Pre�o: " + (precoAtual - desconto));
     
    System.out.println("\n");
  }
}

