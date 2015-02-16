

/** Class: Data
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Feb 9, 2015
 * 
 * 
 * This will 
 * 
 * Purpose is 
 * 
 */

public class Data {

	protected Phone gs5 = new Phone("Galaxy S5", 579.99, 3);
	protected Phone gs4 = new Phone("Galaxy S4", 429.99, 2);
	protected Phone iPhone6 = new Phone("iPhone 6", 649.99, 0);
	protected Phone iPhone5s = new Phone("iPhone 5s", 549.99, 1);
	protected Phone motoG = new Phone("Moto G", 149.99, 8);
	protected Phone htc510 = new Phone("HTC Desire 510", 149.99, 10);
	protected Phone nokia635 = new Phone("Nokia Lumia 635", 99.99, 6);
	protected Phone nokia1320 = new Phone("Nokia Lumia 1320", 279.99, 4);
	
	protected Phone[] phones = { gs5, gs4, iPhone6, iPhone5s, motoG, htc510, nokia635, nokia1320 };
	
	protected Plan basic = new Plan("Basic", 40, "Unlimited Talk\nUnlimited Text\nUnlimited Data\n1 GB of High Speed Data\n");
	protected Plan smart = new Plan("Smart", 50, "Unlimited Talk\nUnlimited Text\nUnlimited Data\n3 GB of High Speed Data\n");
	protected Plan pro = new Plan("Pro", 60, "Unlimited Talk\nUnlimited Text\nUnlimited Data\n10 GB of High Speed Data\n");
	
	protected Plan[] plans = { basic, smart, pro };
	
	protected Employee joe = new Employee("Joe Smith");
	protected Employee steve = new Employee("Steve the Player");
	protected Employee mike = new Employee("Mike Bell");
	
	protected Employee[] employees = { joe, steve, mike };
	
}
