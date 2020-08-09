package insertion;
import java.util.Arrays;
public class MergeSort {

	public static void sort(int a[], int left, int right){
		if(left<right) {
		int mid = (left +right)/2;
		sort (a,left,mid);
		sort (a,mid+1, right);
		merge(a,left,mid,right);
		}
	}
	public static void merge(int a[], int left,int mid,int right) {
		int leftSubAr[];
		int rightSubAr[];
		
		leftSubAr = new int [mid-left+1];
		rightSubAr= new int [right-mid];
		
		int leftIndex = 0;
	    int rightIndex = 0;
		for(int i=left;i<=mid;i++) {
			leftSubAr[leftIndex] = a[i];
			leftIndex++;
		}
		for(int i=mid+1;i<=right;i++) {
			rightSubAr[rightIndex]=a[i];
			rightIndex++;
		}
	    leftIndex=0;
	    rightIndex=0;
	    int i = left;
	    for (; i <= right&&rightIndex<rightSubAr.length&&leftIndex<leftSubAr.length; i++) {
	        if (leftSubAr[leftIndex] < rightSubAr[rightIndex]) {
	            a[i] = leftSubAr[leftIndex];
	            leftIndex++;
	        } else {
	            a[i] = rightSubAr[rightIndex];
	            rightIndex++;
	        }
	    }
	        
	    while(leftIndex>=leftSubAr.length&&rightIndex<rightSubAr.length) {
	    	a[i] = rightSubAr[rightIndex];
	    	i++;
	    	rightIndex++;
	    }
	    while(rightIndex>=rightSubAr.length&&leftIndex<leftSubAr.length) {
	    	a[i] = leftSubAr[leftIndex];
	    	i++;
	    	leftIndex++;
	    }
		
	    
	}
	public static void main(String[] args) {
		int a[] = {442,463,123,922,843,562,1238,244,241,65};
		
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	
	}

}
