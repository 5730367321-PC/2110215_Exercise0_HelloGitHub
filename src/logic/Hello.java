package logic;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println(Hello.greetingMessage());
		
		int[] array = {5,4,3,2,1};
		
		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(){
		// TODO Implement this method to return string "Hello GitHub".
		return "Hello Github";
	}
	
	public static int[] bubbleSort(int[] array){
		int test = 0;
		// TODO Implement this method to sort the given array in an ascending order and return the sorted array.
		for(int i=0;i<array.length-1;i++)
			for(int j=i;j<array.length-1;j++){
				if(array[i]>array[j])
				{
				test = array[i];
				array[i] = array[j];
				array[j] = test;
				}
				
			}
		return array;
	}
	
	public static String arrayToString(String title,int[] array){
		
		String str = title + " : ";
		for (int i = 0;i < array.length;i++)
		{
			str += array[i] + " ";
		}
		return str;
	}
}
