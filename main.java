import  java.util.*;

public class main{
    public static void main(String args[]){
        ArrayList<history> hist = new ArrayList<history>();
        Scanner scan = new Scanner(System.in);
        int type = 0;
        String sign = " ";
        int one = 0;
        int two = 0;
        int input = 0; 
        int total = -1;
        int incorrect = 0;
        boolean answer = true;
        boolean loop = false;
        boolean correct = true;
        int tempans = 0;
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
            one = (int)(Math.random()*100);
            two = (int)(Math.random()*100);
            if(one < two){
                int swap = one;
                one = two;
                two = swap;
            }
            do{//repeat when wrong
            	total++;
	            System.out.println("\n" + (total+1) + ") Solve This:");
	            System.out.printf("%5d",one);
	            System.out.println();
	            System.out.printf(sign + " %3d",two);
	            System.out.println();
	            System.out.println("‾‾‾‾‾‾");
	            System.out.print("  ");
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
	            }
	            try{
	                input = scan.nextInt();
	            }
	            catch(Exception e){
	            	loop = false;
	                break;
	            }
	            if(tempans == input){
	            	history temp = new history(one,two,input,true,sign);//ans t/f
	           		System.out.println("Correct");
	           		correct = true;
		        }
		        else{
		        	history temp = new history(one,two,input,false,sign);//ans t/f
		        	System.out.println("Incorrect");
		        	correct = false;
		        	incorrect++;
		            hist.add(temp);//loop
		        }
		    }
		    while(!correct);
		}
        for(int i = 0; i < 25; i++){//clear
            System.out.println();
        }
        for(history x : hist){//print stats
        	System.out.println(x.form());
        }
        System.out.println("\nIncorrect: " + incorrect);
        System.out.println("Total: " + total);
    }
}