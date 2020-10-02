
import java.util.Scanner;

class over_under_flow extends Exception {
	//Class that extends Exception
	//Meant for declaring custom-type exceptions
}

class Stack_Array {

	static int max_size = 5;
	int Stack[] = new int[max_size];

	int sp = -1;

	void Push(int value) throws over_under_flow {
		if (this.sp == max_size - 1) {
			throw new over_under_flow();
		}
		this.sp++;
		this.Stack[sp] = value;
	}

	void Pop() throws over_under_flow {
		int temp;
		if (this.sp < 0) {
			throw new over_under_flow();
		}

		else {
			System.out.println("The element being popped is:" + this.Stack[this.sp]);
			temp = this.Stack[this.sp];
			this.sp--;
		}
	}

	void PrintStack() {
		int sp1 = this.sp;
		if (sp1 < 0) {
			System.out.println("Stack is empty\n");
		} else {
			System.out.print("\nThe Stack is laid as follows:\n[");
			while (sp1 >= 0) {
				System.out.print("\t\t" + this.Stack[sp1]);
				sp1--;
			}
			System.out.print("\t\t]\n");
		}
	}

}

public class StackMain {
	public static void main(String[] args) {

		Stack_Array obj = new Stack_Array();

		obj.sp = -1;
		Scanner read = new Scanner(System.in);
		int choice = 0;
		while (choice != 4) {
			for (int i = 0; i < 70; i++) {
				System.out.print("*");
			}

			System.out.println("\n\t\t\t1.Push");
			System.out.println("\n\t\t\t2.Pop");
			System.out.println("\n\t\t\t3.Print");
			System.out.println("\n\t\t\t4.Quit\n");

			for (int j = 0; j < 70; j++) {
				System.out.print("*");
			}
			System.out.println("\nEnter your choice\n");
			choice = read.nextInt();

			switch (choice) {
			case 1:
				try{
					int value;
				
				System.out.println("\nEnter the value to be added:\n");
				value = read.nextInt();
				obj.Push(value);
				}catch(over_under_flow ob) {
					System.out.println("Stack overflow exception");
				}
				break;
			case 2:
				try
				{obj.Pop();
				}catch(over_under_flow ob) {
					System.out.println("Stack underflow exception");
				}
				break;
			case 3:
				obj.PrintStack();
				break;

			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("\nEnter a valid choice\n");
				break;
			}
		}

	}
}
