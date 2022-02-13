import java.util.Scanner;

public class Main {    
 
    Scanner sc = new Scanner(System.in);
    public void checkPalindrome(){
        
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        int val = num;
        int rem, rev= 0;
        while(val<0){
            rem = val%10;
            rev= rev*10+rem;
            val = val/10;
        }
        if(num == rev){

            System.out.println("The number given is a palindrome: ");
        }
        else {

            System.out.println("The number given is not a palindrome");
        }

    }
    
    public void printPattern(){

        System.out.println("Please enter the number for the lines of pattern: ");
        int num = sc.nextInt();
        for(int i=num;i>=0;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }

    public void isPrime(){

        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("The number is not a Prime number");
        }
        else{
            System.out.println("The number is a Prime number");
        }
    }

    public void fibonacci(){

        System.out.println("Please enter the value for the number of Fibonacci Series");
        int num = sc.nextInt();
        int num1=0;
        int num2= 1;
        int sum=0;
        for(int i=0;i<=num;i++){
            System.out.println(sum);
            sum = num1+num2;
            num1=num2;
            num2=sum;
        }
    }
    
     public static void main(String[] args)    
     {
        
        Main obj = new Main();
        int choice;
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Please enter the options for the following operations: 1 -> check the Palindrome Number, 2 -> Print the Patern of the stars,3 -> Check whether the number is Prime or not, 4 -> Print the Fibonacci series,0 -> To exit");
            System.out.println();
            choice=sc.nextInt();
            switch(choice){

            case 0:{
            choice =0;
            }
            break;
            case 1:{
            obj.checkPalindrome();
            }
            break;
            case 2:
            {
                obj.printPattern();
            }
            break;
            case 3:
            {
                obj.isPrime();
            }
            break;
            case 4:
            {
                obj.fibonacci();
            }
            break;
            }
        }while(choice!=0);
        System.out.println("Exited Successfully!!!");
       sc.close();
    
    }
}