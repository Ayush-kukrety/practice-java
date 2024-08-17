import java.util.Scanner;
import java.util.Random;



 class GuessGame{
 
     private  int randomNumber;


      public void setRandomNumber() {
         Random random = new Random();
         randomNumber = random.nextInt(100);
     }



     public int getRandomNumber() {
         return randomNumber;
     } 



     public void compare (){
         
         Scanner sc = new Scanner(System.in);
         int number=-1;                                     
         System.out.println("enter no betw 1 to 100");
         
          
          int count=0;



      while (number!=randomNumber) {
        System.out.println("enter your guess");
           number =sc.nextInt();


        if (number < randomNumber) {
            System.out.println("number is too small");
            }
            else if(number>randomNumber){
                System.out.println("number is too big");
            }
            else{
                System.out.println("number is correct");
            }
            count++;

        } 
        System.out.println("number of steps to taken guees are :::::"+count);
        
        
        sc.close();
    }
 }

public class gamerep1 {
    public static void main(String[] args) {
        GuessGame g= new GuessGame();
       g.setRandomNumber();
        g.compare();

        // System.out.println("you have gueed the numeber in count ::"+count); was trying to get the value here but have to make a method for it ;

        System.out.println("the numeber guess my computer is :::"+g.getRandomNumber());
    }
}
