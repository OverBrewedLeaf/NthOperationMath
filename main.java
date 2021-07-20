import  java.util.*;

public class main{
    public static void main(String args[]){
        ArrayList<history> hist = new ArrayList<history>();
        Scanner scan = new Scanner(System.in);
        int type = 0;
        String sign = " ";
        int one = 0;
        int two = 0;
        int input = 2; 
        int total = 0;
        int incorrect = 0;
        boolean answer = true;
        boolean loop = false;
        boolean correct = true;
        int tempans = 0;
		int digit1 = 2;
		int digit2 = 2;
		try{
			System.out.println("Select Difficulty/Digits");
			input = scan.nextInt();
			digit1 = input;
			input = scan.nextInt();
			digit2 = input;
		}
		catch(Exception e){
		
		}
        do{
        	loop = false;
        	System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
	        try{
	        	input = scan.nextInt();
	        }catch(Exception e){}
		    if(input == 1){
		    	sign = "+";
		    }
		    else if(input == 2){
		    	sign = "-";
		    }
		    else if(input == 3){
		    	sign = "*";
		    }
		    else if(input == 4){
		    	sign = "/";
		    }
	    }
	    while(sign == " ");
	    loop = true;
        while(loop){
        	answer = true;
            one = (int)(Math.random()*(Math.pow(10,digit1)+1));
            two = (int)(Math.random()*(Math.pow(10,digit2)+1));
            if(one < two){
                int swap = one;
                one = two;
                two = swap;
            }
            if(two == 0){
            	two = 1;
            }
            do{//repeat when wrong
	            if(sign.equals("+")){
	            	tempans = one + two;
	            }
	            else if(sign.equals("-")){
	            	tempans = one - two;
	            }
	            else if(sign.equals("*")){
	            	tempans = one * two;
	            }
	            else if(sign.equals("/")){
	            	tempans = one / two;
	            	one = tempans * two;
	            }
	            System.out.println("\n" + (total+1) + ") Solve This:");
	            System.out.printf("%5d",one);
	            System.out.println();
	            System.out.printf(sign + " %3d",two);
	            System.out.println();
	            System.out.println("‾‾‾‾‾‾");
	            for(int i = 0; i < 5-(""+tempans).length();i++){
	            	System.out.print(" ");
	            }
	            try{
	                input = scan.nextInt();
	            }
	            catch(Exception e){
	            	loop = false;
	                break;
	            }
	            if(tempans == input){
            		total++;
	            	history temp = new history(one,two,input,true,sign);//ans t/f
	           		System.out.println("Correct");
	           		correct = true;
					hist.add(temp);
		        }
		        else{
		        	history temp = new history(one,two,input,false,sign);//ans t/f
		        	System.out.println("Incorrect");
		        	correct = false;
		        	incorrect++;
		            hist.add(temp);
		        }
		    }
		    while(!correct);
		}
        // for(int i = 0; i < 30; i++){//clear
        //     System.out.println();
        // }
        for(history x : hist){//print stats
        	System.out.println(x.form());
        }
        System.out.println("\nIncorrect: " + incorrect);
        System.out.println("Total: " + total);
    }
}