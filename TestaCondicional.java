public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        
        int idade = 10;
        int quantidadePessoas = 3;
        if (idade >= 18){
          System.out.println("Voce é maior de idade!");  
        } else{
            if(quantidadePessoas > 2 ){
                System.out.println("Voce pode entrar, pois está acompanhado");
            }
            else{
                System.out.println("Voce é menor de idade!");
                System.out.println("Voce não é bem-vindo");
            }
            
        }
        

    }
}
