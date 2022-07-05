public class MyClass {
    public static void main(String args[]) {
      
      int a = 9;
      
      try {
          int divisao = a / 0;
          System.out.println(divisao);
      } catch(Exception e) {
          System.out.println("Erro: " + e.getMessage());
          System.out.println("* * Fim do Programa * *");
      }
    }
}
