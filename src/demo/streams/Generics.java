package demo.streams;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		double d = 10;
		Double obj = new Double(20);
		
		ArrayList<Number> number = new ArrayList<Number>();
		number.add(d);
		number.add(obj);
		testListAssignment();
		/*
		 * for(Number num : number) { System.out.println(num); }
		 */
	}
	
	
	public static void testListAssignment() {
		  List<Number> numberList = new ArrayList<Number>();
		  numberList.add(new Double(2500000000));
		  accept(numberList);
		}
		private static void accept(List<? super Integer> inputList) {
		//	inputList.
//		  inputList.add(new Integer(1));   // guaranteed to be fine
		 Object object = inputList.get(0);// return type is Object
		 Double doubleVal = (Double) object;
		 doubleVal += 29;
		 System.out.println(doubleVal);
		  List<Integer> num = new ArrayList<Integer>();
		  num.add(20);
		  inputList.addAll(num); // compile failure - unbounded type
		}
}
