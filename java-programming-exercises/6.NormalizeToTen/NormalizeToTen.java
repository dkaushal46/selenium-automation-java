// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        
        int Number;
        String Value;
        int Array[] ={0,8,22,6,2,10,-11};
        int size =Array.length;
        String[] list = new String[size];
        for(int i=0;i<size;i++){
            if(Array[i]<=10){
                Number=10-Array[i];
                Array[i]=Array[i]+Number;
                Value= "+"+Number;
                list[i]=Value;
            }
            else{
                Number=Array[i]-10;
                Array[i]=Array[i]-Number;
                Value= "-"+Number;
                list[i]=Value;
            }
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
            
        }
        for(int i=0;i<Array.length;i++){
            System.out.println(Array[i]);
            
        }
    }
}