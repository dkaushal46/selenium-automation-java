class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i] + "," + arr[arr.length - 1 - i]);
            
            if(i!= (arr.length/2)-1){
                System.out.print(",");
            }
        }
    }
}