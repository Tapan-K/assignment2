package selectionSort;

public class SelectionSort {

	public static void selectionSort(int[] arr){ 
		
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int idx = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[idx]){  
                    idx = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[idx];   
            arr[idx] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Sorting, the array is ");  
        for(int i:arr1){ //forEach loop for easy iteration 
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//calling selection sort 
         
        System.out.println("After sorting, the Sorted array is ");  
        for(int i:arr1){  
            System.out.print(i+" ");

	}

  }
}
