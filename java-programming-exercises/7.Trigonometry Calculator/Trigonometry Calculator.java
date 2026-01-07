// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class MyClass {
    public void solution(float p,float b,float h){
 
            System.out.println("Sin theta ="+ p+"/"+h);
            System.out.println("Cos theta ="+ b+"/"+h);
            System.out.println("Tan theta ="+ p+"/"+b);
            System.out.println("Cosec theta ="+ h+"/"+p);
            System.out.println("Sec theta ="+ h+"/"+b);
            System.out.println("Cot theta ="+ b+"/"+p);
 
        }
    public static void main(String[] args) {
 
        System.out.println("write sin or cos or tan or cosec or sec or cot");
        Scanner scanner = new Scanner(System.in);
        String Trignometry =scanner.nextLine();
        switch(Trignometry){
            case "sin":
                {
                System.out.println("Write value of P");
                float p=scanner.nextFloat();
                
                System.out.println("Write value of h");
                float h=scanner.nextFloat();
                
                float value =p/h;
                if(value>=-1 && value<=1){
                    float number = (h*h)-(p*p);
                    float b = (float)Math.sqrt(number);
                    System.out.println(b);
                    MyClass obj = new MyClass();
                    obj.solution(p,b,h);
                }
                else{
                    System.out.println("Write valid value");
                }
                break;}
                
            case "cos":
                {System.out.println("Write value of b");
                float b=scanner.nextFloat();
                
                System.out.println("Write value of h");
                float h=scanner.nextFloat();
                
                float value =b/h;
                if(value>=-1 && value<=1){
                    float number = (h*h)-(b*b);
                    float p = (float)Math.sqrt(number);
                    System.out.println(p);
                    MyClass obj = new MyClass();
                    obj.solution(p,b,h);
                }
                else{
                    System.out.println("Write valid value");
                }
                break;}
                
            case "tan":
                {System.out.println("Write value of p");
                float p=scanner.nextFloat();
                
                System.out.println("Write value of b");
                float b=scanner.nextFloat();
                
                float number = (p*p)+(b*b);
                float h = (float)Math.sqrt(number);
                System.out.println(h);
                MyClass obj = new MyClass();
                obj.solution(p,b,h);
                break;}
                
            case "cosec":
                {System.out.println("Write value of h");
                float h=scanner.nextFloat();
                
                System.out.println("Write value of p");
                float p=scanner.nextFloat();
                
                float value=h/p;
                if(value>=1 || value<=-1){
                    float number = (h*h)-(p*p);
                    float b = (float)Math.sqrt(number);
                    System.out.println(b);
                    MyClass obj = new MyClass();
                    obj.solution(p,b,h);
                }
                else{
                    System.out.println("Write valid value");
                }
                
                
                break;}
                
            case "sec":
                {System.out.println("Write value of h");
                float h=scanner.nextFloat();
                System.out.println("Write value of b");
                float b=scanner.nextFloat();
                
                float value=h/b;
                if(value>=1 || value<=-1){
                    float number = (h*h)-(b*b);
                    float p = (float)Math.sqrt(number);
                    System.out.println(p);
                    MyClass obj = new MyClass();
                    obj.solution(p,b,h);
                }
                else{
                    System.out.println("Write valid value");
                }
                break;}
                
            case "cot":
                {System.out.println("Write value of b");
                float b=scanner.nextFloat();
                
                System.out.println("Write value of p");
                float p=scanner.nextFloat();
                
                float number = (p*p)+(b*b);
                float h = (float)Math.sqrt(number);
                System.out.println(h);
                MyClass obj = new MyClass();
                obj.solution(p,b,h);
                break;}
        }
        
    }
}