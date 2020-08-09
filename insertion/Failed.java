package insertion;

public class Failed {
	public static void sort(int input[]) {
		if (input.length<=1) {
			return;
		}else { 
		int a[] = new int[input.length/2];
		int b[] = new int[input.length-a.length];
		for(int i =0;i<a.length;i++) {
			a[i] = input[i];
		}
		for(int i=0;i<b.length;i++) {
			b[i] = input[i+a.length];
		}
		sort(a);
		sort(b);
		merge(input,a,b);
		}
	}
	public static void merge(int output[],int a[], int b[]) {
		int i=0;
		int j=0;
		for(int k=1; k<output.length;k++) {
			if(a[i]<b[j]) {
				output[k]=a[i];
				i++;
			}else {
				output[k]=b[j];
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {4,6,1,7,3,8};
		sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	static void name () {
		System.out.println("Change made");
	}

}
