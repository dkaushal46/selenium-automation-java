class Main {
    public static void main(String[] args) {
        String st[] = {"fhf", "uda", "fsaf", "fdsfa", "tsffa"};
        int size= st.length;
        for(int i=0;i<size;i++){
            String name = st[i];
            if (i%2==0){
                int wordsize= name.length();
                if(wordsize%2==0){
                    for(int j=0;j<=wordsize-1;j++){
                        System.out.println(name.charAt(wordsize-2));
                        break;
                    }}
                else{
                    for(int j=0;j<wordsize-1;j++){
                    System.out.println(name.charAt(wordsize-1));
                        break;   
                    }
                }}
            else{
                int wordsize= name.length();
                if(wordsize%2==0){
                    for(int j=0;j<=wordsize-1;j++){
                        System.out.println(name.charAt(wordsize-1));
                        break;
                    }}
                else{
                    for(int j=0;j<wordsize-1;j++){
                    System.out.println(name.charAt(wordsize-2));
                        break;   
                    }
                }
            }   
        }
    }
}