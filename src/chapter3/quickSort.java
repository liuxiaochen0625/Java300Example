package chapter3;

public class quickSort {
	public static void main(String []args){
		int[]a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		sort(a, 0, a.length-1);
		for(int b:a)
			System.out.print(b+" ");
	}
	public static void sort(int arr[],int low,int high){
		int l=low;
		int h=high;
		int povit=arr[low];
		while(l<h){
			while(l<h&&arr[h]>=povit)
				h--;
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				l++;
				}
			while(l<h&&arr[l]<=povit)
				l++;
			if(l<h){
				int temp=arr[h];
				arr[h]=arr[l];
				arr[l]=temp;
				h--;
				}
			}
		if(l>low)
			sort(arr,low,l-1);
		if(h<high)
			sort(arr,l+1,high);
		}
}
