
import java.lang.Math;
import java.util.Scanner;

import static java.lang.System.exit;


class guess{
  int guess_time=1,user_guess,ran_number,min=1,max=100,istrue=0;

  Scanner sc=new Scanner(System.in);

   guess(){

       ran_number=(int) (Math.random() * (max-min+1)+min);;
   }


   public void input(){
       System.out.println("=============================================");
    System.out.println("Guess the Computer choosed number:");
    user_guess=sc.nextInt();

   }


   public void check_number(){

      if(user_guess==ran_number){
          System.out.println("\nCongratulations.....\nYou have successfully guesed the computer choosed number.\nThe computer choosed number & your gussed number is same:"+ran_number);
          System.out.println("Your guess time is : "+guess_time);
          istrue=1;
      }

      else if(user_guess<ran_number){
          System.out.println(+user_guess+" is less than the computer choosed number!\nPlease try again.");
          guess_time++;
      }
      else if(user_guess>ran_number){

          System.out.println(+user_guess+" is greater than the computer choosed number!\nPlease try again.");
          guess_time++;
      }

      else if(user_guess>max){

          System.out.println("Please choose the number between"+min+ "to "+max);
      }


   }
}



public class GuessGame {
    public static void main(String[] args) {

      guess obj=new guess();

      while(obj.istrue!=1){

          obj.input();
          obj.check_number();

      }

    }
}
