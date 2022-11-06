package duplicateArray;

public class IsArrayDuplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[]{2,4,6,10,4,4,2,4,2};
		System.out.print("Duplicate elements in given array are ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j])
					System.out.print(a[j]+" ");
			}
		}
		
		

	}

}
