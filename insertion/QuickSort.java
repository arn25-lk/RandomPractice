package insertion;
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.ArrayList;
public class QuickSort {
	static int comparisonCounter=0;
	//Randomized QuickSort
	static void quickSort(int a [], int left, int right) {
		if(left<right)/*base case*/{
			//recursive calls
			int pivot = choosePivot(a,left,right);
			int part = partition(a,left,right,pivot);
			quickSort(a,left,part);
			quickSort(a,part+1,right);
		}
	}
	static int choosePivot(int a[], int left, int right){
		//Generates a random number between the bounds left and right
		Random r = new Random();
		int temp0 = a[left];
		int pivotTemp = r.nextInt(right-left) + left;
		//Sets pivot to left-most number, as pre-processing step
		a[left] = a[pivotTemp];
		a[pivotTemp] = temp0;
		//Generates pivot as final element
		/*int temp = a[left];
		a[left] =a[right-1];
		a[right-1] = temp;*/
		//Median-of-three
		/*int median=(right+left)/2;
		if(median%2!=0) {
			median=median+1;
		}
		ArrayList<Integer> medianofT= new ArrayList<>();
		medianofT.add(a[median]);medianofT.add(a[left]);medianofT.add(a[right-1]);
		Collections.sort(medianofT);
		int i=0;
		int x = medianofT.get(1);
		while (a[i]!=x&&i<a.length) {
			i++;
		}
		int key = i;

		int temp = a[left];
		a[left] = a[key];
		a[key] = temp;*/
		return a[left]; 
	}
	static int partition(int a[], int left, int right, int pivot) {
		comparisonCounter += right-left-1;
		//In-place partitioning code 
		int i=left+1;
		for(int j=left+1;j<right;j++) {
			if(a[j]<pivot) {
				int temp1 = a[j];
				a[j] = a[i];
				a[i] = temp1;
				i++;
			}

		}
		//Switch the pivot to the (i-1)th element. 
		int temp2 = a[i-1];
		a[i-1] = a[left];
		a[left] = temp2;
		return i-1;
	}
	public static void main(String[] args) throws Exception {
		/*File f1 = new File ("C:\\Users\\arnav\\Documents\\quickSort.txt");
		try{
			BufferedReader  b1 = new  BufferedReader(new FileReader(f1));
			int b[] = new int [10000];
			int i=0;
			for(String s = b1.readLine(); i<b.length&&s!= null; i++) {
				b[i]=Integer.parseInt(s);
				s=b1.readLine();
			}
			quickSort(b,0,b.length);
			System.out.println(Arrays.toString(b));
			System.out.println(comparisonCounter);
		}catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}*/
		int arr [] = {1,4,2,6,7,3};
		quickSort(arr,0,arr.length);
		for(int k:arr) {
			System.out.print(k);
		}
		
	}

}
