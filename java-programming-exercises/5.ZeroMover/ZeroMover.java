class Main {
    public static void main(String[] args) {
       int Array[]={0,0,1,3,4,2,1,4,9,0,5,6,0,0};
       int Number=0;
       int last=Array.length-1;
       for(int i=0;i<last;i++){
           if(Array[i]==0){
               for(int j=i;j<Array.length-1;j++){
                   Array[j]=Array[j+1];
                   Array[last]=Number;
                   
               }
               last--;
               i--;
           }
       }
       for(int i=0;i<Array.length-1;i++){
           System.out.println(Array[i]);
       }
    }
}