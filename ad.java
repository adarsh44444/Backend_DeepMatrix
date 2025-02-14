public class ad {
    public static void main(String[] args) {
        Thread.getAllStackTraces().keySet().forEach(thread -> {
            System.out.println("Thread Name: " + thread.getName() + 
                               ", State: " + thread.getState() + 
                               ", Is Alive: " + thread.isAlive()+
                               ",Is thread active"+thread.isAlive());
        });
        int num=10;
        try {
          if(num==10){
            System.out.println("correct");
          }
        } catch (Exception e) {
          // TODO: handle exception
          System.err.println("wrong");
        }
        finally{
          System.out.println("finally");
        }
        try {
          int x = 10;
          int y = 0;
          int z = x / y;
      } catch (ArithmeticException e) {
          System.out.println("Arithmetic exception occurred: " + e.getMessage());
      }
    }
}

