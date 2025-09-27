package demo;

public class A03_CoreJavaBrushup2 {

	public static void main(String[] args) {
		
		int[] arr2 = {9,1,8,6,2,122,5,87,3,46,4};
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);
				break; // i use this to only find one number which is multiple of 2
				// break will exit the loop
			}
			else {
				System.out.println(arr2[i]+" Is not multiple of 2");
			}
		}
	}
 
}
