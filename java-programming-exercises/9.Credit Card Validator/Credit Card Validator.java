// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter your credit card number");
        Scanner scanner =new Scanner(System.in);
        String CreditCard=scanner.nextLine();
        





        int Number;
        int last;
        int remain;
        int add;
        int total=0;



        String splittedArray[] =CreditCard.split("");
        int size= splittedArray.length;
        
       
        
        
        
        if(size<16||size>16){
            System.out.println("Card number is inValid");
        }
        
        
        
        else{
            
        
        int valid[] =new int[size];





        





        int[] intArray = new int[splittedArray.length];
        for(int i=0;i<size;i++){
            intArray[i] = Integer.parseInt(splittedArray[i]);
        }





        for(int i=0;i<intArray.length;i++){
            if(i%2 == 0){
                Number=intArray[i]*2;
                if(Number>9){
                    last=Number%10;
                    remain=Number/10;
                    add=last+remain;
                    valid[i]=add;
                }
                else{
                    valid[i]=Number;
                }
            }
            else{
                valid[i]=intArray[i];
            }
            //System.out.println(valid[i]);
        }
        for(int i=0;i<valid.length;i++){
            total =total+valid[i];
        }
        if(total%10==0){
            System.out.println("Card is Valid");
        }
        else{
            System.out.println("Card is not Valid");
        }
        System.out.println(total);



    }}
    
}