public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        
        int idade = 18;
        int quantidadePessoas = 2;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("número de pessoas é = " + acompanhado);
        if (idade >= 18 && acompanhado){
          System.out.println("Voce pode entrar, pois está acompanhado.");  
        } else{
                System.out.println("Voce é menor de idade! " +
                "E não está acompanhado");
            }
            
        }
        
    
    }

