// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        int last;
        int number;
        System.out.println("Write number you want to search");
        Scanner scanner =new Scanner(System.in);
        int k= scanner.nextInt();
        System.out.println("Write the last number");
        int n=scanner.nextInt();
        int count =0;
        
        if(n>=0){
            for(int i=k;i<=n;i++){

                if(n<k){
                    System.out.println("make n bigger");
                }
                else{
                    number=i;
                    while(number!=0){
                        last=number%10;
                        number=number/10;
                        if(last==k){
                            count++;
                        }
                    }
                }
            }
        System.out.println(count);    
        }
        else{
            System.out.println("make n positive");
        }
}}