import java.util.ArrayList; 
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
    int[] num={11,12,8,53,5,85,2,89,44,92};
    ArrayList<Integer> B1= new ArrayList<>();
    ArrayList<Integer> B2= new ArrayList<>();
    ArrayList<Integer> B3= new ArrayList<>();
    
    for(int i=0;i<num.length;i++){
        if(num[i]>=0 && num[i]<=5){
            B1.add(num[i]);
        }
        else if(num[i]>=6 && num[i]<=65){
            B2.add(num[i]);
        }
        else if(num[i]>=66 && num[i]<=100){
            B3.add(num[i]);
        }
        
    }System.out.println("B1 - "+B1);
    System.out.println("B2 - "+B2);
    System.out.println("B3 - "+B3);
    }
    }
