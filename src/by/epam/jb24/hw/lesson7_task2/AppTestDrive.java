package by.epam.jb24.hw.lesson7_task2;

import java.util.ArrayList;
import java.util.List;


public class AppTestDrive {
	
	public static void main(String[] args) {
		
		double totalSumOfCheck = 0;
		
		List<Product> payment = new ArrayList<Product>();
		payment.add(new Product("Apples",2,100.0));
		payment.add(new Product("Orange",1,50.0));
		payment.add(new Product("Strawberry",3,25.5));
		payment.add(new Product("Pineapple",4,30));

		
		System.out.println("Name * Price * Count * Total price");
		System.out.print(payment);
		System.out.println("");
		System.out.println("----------");
		
		for (Product x : payment){
			totalSumOfCheck = totalSumOfCheck + x.getTotalPriceOfGoods();
		}
		
		System.out.println("Total sum of your check is  " + totalSumOfCheck + "$");
		

	}
}

