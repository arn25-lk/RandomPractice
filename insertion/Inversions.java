package insertion;
import java.io.*;
import java.util.ArrayList;
public class Inversions {
	
	public static long countInversions(int a[], int left, int right){
		long count = 0;
		if(left<right) {
			int mid = (left +right)/2;
			count += countInversions (a,left,mid);
			count += countInversions(a,mid+1, right);
			count += countSplitInversions(a,left,mid,right);
		}
		return count;
	}
	public static long countSplitInversions(int a[], int left,int mid,int right) {

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
		long counter=0;
		for (; i <= right&&rightIndex<rightSubAr.length&&leftIndex<leftSubAr.length; i++) {
			if (leftSubAr[leftIndex] < rightSubAr[rightIndex]) {
				a[i] = leftSubAr[leftIndex];
				leftIndex++;
			} else {
				a[i] = rightSubAr[rightIndex];
				rightIndex++;
				counter += (mid+1)-(left+leftIndex);
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
		return counter;
	}



	public static void main(String[] args) throws Exception {
		
		
		File f1 = new File ("C:\\Users\\arnav\\Documents\\100,000.txt");
		try{
			BufferedReader  b1 = new  BufferedReader(new FileReader(f1));
			int b[] = new int [100000];
			int i =0;
			for(String s = b1.readLine(); i<b.length&&s!= null; i++) {
				b[i]=Integer.parseInt(s);
				s=b1.readLine();
			}
			
			long s = countInversions(b,0,b.length-1);
			System.out.println(s);
		}catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
		
		
		


	}

}
