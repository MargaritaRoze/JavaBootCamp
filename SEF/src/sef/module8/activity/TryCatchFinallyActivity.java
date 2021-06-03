package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan();
}

void catchMeIfYouCan() {
	try {


		int[] arr = {0, 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		for (int i = 0; i <= 20; i++) {

			System.out.println(arr[i]);
		}

	} catch (Exception e) {
		System.out.println("This should be catched"+ "-1/0");
	}
finally {

		System.out.println("This should be blocked");
	}
	System.out.println("This should be shown with an exception");

}

}
