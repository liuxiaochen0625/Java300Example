package chapter3;

public class BubbleSort {
	public static void main(String []args){
		int numbers[] = new int[]{2,5,8,1,6,34,4};
		bubbleSort(numbers);
	}
	
	//冒泡排序
	public static void bubbleSort(int number[]){
		for(int i = 0;i<number.length-1;i++){
			boolean flag = true;
			
			for(int j=0;j<number.length-1-i;j++){
				if(number[j]<number[j+1]){
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					flag = false;
				}
			}
			
			System.out.print(i+1+":");
			
			for(int s:number)
				System.out.print(s+" ");
			System.out.println();

			
			if(flag)
				break;
		}
	}
	
}
