public class TestaLacos {
    public static void main(String[] args) {
        for(int multiplicador =1; multiplicador <= 10; multiplicador++ ){
          for(int contador= 0; contador <= 10; contador++){
            int calculo = contador * multiplicador;
            System.out.println(calculo);
            System.out.println(" ");
          }  
          System.out.println();
        }
    }
}
