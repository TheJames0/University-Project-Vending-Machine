import java.text.DecimalFormat;
import java.util.Dictionary;
import java.util.Hashtable;

public class VendingMachineController implements InterfaceUIController
{
	//Drink items and prices stored in dictinary
	private Dictionary<String, Double> drinkdictionary;
	// cash variable for when coins inserted
	private float cash;
	//Price of current item
	private Double price;
	//Change from transaction
	private float change;
	//The type of payment, 0 for cash, 1 for card
	private int paymenttype;
	//The saved money difference from base value and discount value
	private float savings;
	/**
	 * Constructor method initiates pre-set price values for each drink element in a dictionary so that
	 * the prices can easily be retrieved with simple methods.
	 * @param paymenttype
	 */
	public VendingMachineController(int paymenttype) {
		drinkdictionary = new Hashtable<String, Double>();
		drinkdictionary.put("Coke",1.50);
		drinkdictionary.put("Lemonade",1.20);
		drinkdictionary.put("Tango",1.40);
		drinkdictionary.put("Water",1.00);
		drinkdictionary.put("Pepsi",1.50);
		drinkdictionary.put("Sprite",1.20);
		cash = 0;
		price = 0.00;
		change = 0;
		this.paymenttype = paymenttype;
	}
	/**
	 * This method returns how much was discounted for card purchases from base price.
	 * @return
	 */
	public String returnSavings() {
		DecimalFormat dc = new DecimalFormat("0.00");
		return dc.format(savings);
	}
	/**
	 * This method checks if enough cash has been inserted into the vending machine.
	 * @return
	 */
	private boolean checkCashIsEnough() {
		if (cash < price) {
			return false;
		}
		else {
			return true;
		}
	}
	/**
	 * Resets price variables, called when transaction cancelled.
	 */
	public void resetCash() {
		cash = 0;
		price = 0.0;
		change = 0;
	}
	/**
	 * Returns cash in appropiate format.
	 * @return
	 */
	public String ReturnCash() {
		DecimalFormat dc = new DecimalFormat("0.00");
		return dc.format(cash);
	}
	/**
	 * sends price to UI, this method checks payment type and applies discount for card payments.
	 */
	@Override
	public String ReturnPrice(String drink) {
		DecimalFormat dc = new DecimalFormat("0.00");
		if (paymenttype == 1) {
			price = drinkdictionary.get(drink) * 0.7;
			savings = (float) (drinkdictionary.get(drink) * 0.3);
			
		}
		else {
			price = drinkdictionary.get(drink);
		}
		return  dc.format(price);
	}
/**
 * Adds inserted coin to cash variable
 */
	@Override
	public void InsertCash(String cash) {
		this.cash = Float.valueOf(cash) + this.cash;
	}
/**
 * calculates the change difference from cash inserted and price of item.
 */
	@Override
	public String ReturnChange() {
		change =  (float) (this.cash - this.price);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		return  "Purchase successful, your change is : £" + dc.format(change);
	}
	/**
	 * The purchase method checks conditions such as the payment type and if there is enough cash, if so it sends 
	 * transaction details such as change returned or if bank charge was accepted or not.
	 */
	@Override
	public String Purchase() {
		if (paymenttype == 0) {
			if (checkCashIsEnough())
				return ReturnChange();
			else
				return "Not enough Cash";
		}
		else {
			return "Bank Charge Accepted";
		}
			
	}



	
}
