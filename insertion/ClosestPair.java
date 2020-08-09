package insertion;
import java.util.ArrayList;
import java.util.Arrays;
public class ClosestPair extends MergeSort {

	
	static int[] closestPair(int P_x[],int P_y[], int left, int right){
		
		int mid = (left+right)/2;
		int Q_x[] = Arrays.copyOfRange(P_x,left, mid);
		int Q_y[] =Arrays.copyOfRange(P_y,left, mid);
		
		int R_x[] = Arrays.copyOfRange(P_x,mid, right);
		int R_y[] = Arrays.copyOfRange(P_y, mid, right);
		
		int a[] = closestPair(Q_x,Q_y,left,mid);
		int b[] = closestPair(R_x, R_y, mid, right);
		int c[] = closestSplitPair()
		
		
	}
	public static void main(String[] args) {
	int points = 10;
	int array[] = {14,21,5,24,6,13,28,34,9,10,3,7,2,8,15,6,7,8,11,1};
	int arr[][] = new int [points][2];
	for(int i = 0, po = 0; i<points; i++) {
		for(int j=0; j<2;j++) {
			arr[i][j] = array[po];
			po++;
		}
	}
	int x_coord[] = new int[points];
	int y_coord[] = new int[points];
	for (int i =0,j=0,k=1; i<x_coord.length;i++) {
		x_coord[i] = array[j];
		y_coord[i] = array[k];
		j=j+2;
		k=k+2;
	}
	sort(x_coord,0,x_coord.length-1);
	sort(y_coord,0,y_coord.length-1);
	closestPair(x_coord,y_coord,0,points);
	}
	private double eDist (double a, double b, double c, double d ) {
		double dif1 = Math.abs(b-a);
		double dif2 = Math.abs(d-c);
		return Math.sqrt(dif1*dif1+dif2*dif2);
		
	}

}
