package insertion;
import java.util.Random; 
public class RandomSelection {
	static int partition_x( int a[], int left, int right) {
		Random r = new Random();
		int temp0 = a[left];
		int pivotTemp = r.nextInt(right-left) + left;
		//Sets pivot to left-most number, as pre-processing step
		a[left] = a[pivotTemp];
		a[pivotTemp] = temp0;
		//In-place partitioning code 
		int i=left+1;
		for(int j=left+1;j<right;j++) {
			if(a[j]<a[left]) {
				int temp1 = a[j];
				a[j] = a[i];
				a[i] = temp1;
				i++;
				}
			}
		int temp2 = a[i-1];
		a[i-1] = a[left];
		a[left] = temp2;
		return i-1;
		
	}
	static int randSelect(int a[], int pivotElem, int rightMost, int o_stat) {
		if (rightMost - pivotElem ==0) return pivotElem;
		partition_x(a,pivotElem,rightMost);
		if (a[pivotElem] == a[o_stat]) { return pivotElem;
		}else if(pivotElem > o_stat) {return randSelect(a,)
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,4,2,6,7,3};
		partition_x(arr,0,arr.length);
		for (int i : arr) {
			System.out.print(i);
		}
		

	}

}
