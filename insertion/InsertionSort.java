package insertion;

public class InsertionSort {
	static int[] sort(int a[]){
		int key;
		int i;
		for(int j=1; j<a.length;j++) {
			key = a[j];
			i = j-1; 
			while (i>-1 && a[i]>key) {
				a[i+1]=a[i];
				i=i-1;
				a[i+1]=key;
			}
		}
		return a;
	}
	static int[] sortrev(int a[]) {
		int key;
		int i;
		for(int j=a.length-1; j>-1;j--) {
			key = a[j];
			i = j+1; 
			while (i<a.length && a[i]>key) {
				a[i-1]=a[i];
				i=i+1;
				a[i-1]=key;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {4,1,5,2,9,3,3,7};
		int[] m = sort(a);
		for(int i =0;i<m.length;i++) {
			System.out.print(m[i] + ", ");
		}
		System.out.println();
		m=sortrev(a);
		for(int i =0;i<m.length;i++) {
			System.out.print(m[i] + ", ");
		}
	}

}
