package com.xpert.practice;

 

public class PracticePkg {

 	void s2() {
		int arr[] = { 4, 5, 2, 1, 7, 6 };
		 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		PracticePkg p1 = new PracticePkg();
		p1.s2();

	}

}
