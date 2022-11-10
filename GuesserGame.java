package guesserGame;
import java.util.*;

//Guesser Class

class Guesser{
	int guessNum;
	
	
	int guessNum(){
		Scanner sc=new Scanner(System.in);
		boolean a =true;
		 
		 while (a) {
			 System.out.println("\nGuesser, kindly Guess the number? ");
			
			 guessNum=sc.nextInt();
		 
			 if(guessNum>=1 && guessNum<=10) {
			      a=false;
		 }else {
			 System.out.println("warning !!");
		 }
			 
	}

		
	
		
		
		
		return guessNum;     
	}
}

// class for Players

class Players{
	int guessNum;
	
	
	int guessNum1() {
		boolean a=true;
		Scanner sc=new Scanner(System.in);
		while(a) {
			System.out.println("Player1, kindly Guess the number?");
			guessNum=sc.nextInt();
			
			if(guessNum>=1 && guessNum<=10) {
				a=false;
			}else {
				System.out.println("Warning !");
			}
		}
		
		
		
		
		
		return guessNum;
		}
		
	 int guessNum2() {
		    boolean a=true;
			Scanner sc=new Scanner(System.in);
			while(a) {
				System.out.println("Player2, kindly Guess the number? ");
				guessNum=sc.nextInt();
				
				if(guessNum>=1 && guessNum<=10) {
					a=false;
				}else {
					System.out.println("Warning !");
				}
			}
			
			
		
		return guessNum;
	}
	 
	 int guessNum3() {
		 Scanner sc=new Scanner(System.in);
		 boolean a=true;
		 while(a) {
				System.out.println("Player3, kindly Guess the number?");
				guessNum=sc.nextInt();
				
				if(guessNum>=1 && guessNum<=10) {
					a=false;
				}else {
					System.out.println("Warning !");
				}
			}
		 
		
		 return guessNum;
	 }
	
}

// class for Umpire

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collcetNumFromGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
    void collcetNumFromPlayers() {
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		
		 numFromPlayer1=p1.guessNum1();
		 numFromPlayer2=p2.guessNum2();
		 numFromPlayer3=p3.guessNum3();
	}
    
    void compare() {
    	if(numFromGuesser==numFromPlayer1) {
    		if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 ) {
    			System.out.println("Game tied between all three players .");
    		}else if(numFromGuesser==numFromPlayer2) {
    			System.out.println("Player1 and Player2 won the Game .");
    		}else if(numFromGuesser==numFromPlayer3) {
    			System.out.println("Player1 and Player3 won the Game .");
    		}else {
    		System.out.println("Player1 won the Game..");
    	   }
    	}
    	else if(numFromGuesser==numFromPlayer2) {
    		if(numFromGuesser==numFromPlayer3) {
    			
    		System.out.println("Player2 and Player3 won the Game.");
    	   }else {
    		   System.out.println("Player2 won the Game..");
    	   }
    	}
    		   
    	   
    	else if(numFromGuesser==numFromPlayer3) {
    		System.out.println("Player3 won the Game..");
    	}
    	
    	else {
    		System.out.println("Game over,Try it again !!");
    	}
    	
    }
}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 System.out.println("Welcome to the GuesserGame");
		 System.out.println("You can guess the number between 1-10 only ! ");
		
		Umpire u=new Umpire();
		u.collcetNumFromGuesser();
		u.collcetNumFromPlayers();
		u.compare();

	}

 }

