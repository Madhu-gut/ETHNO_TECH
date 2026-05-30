abstract class Foodorder {
    String customerName;
    int Quantity;
    double prize;
    Foodorder(String name, int quantity, double prize) {
        this.customerName = name;
        this.Quantity = quantity;
        this.prize = prize;
    }
    abstract void orderFood();
    void generateBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + Quantity);
		}
}

class FriesOrder extends Foodorder {
    FriesOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Fries worth @" + (Quantity * prize));
    }
}

class PizzaOrder extends Foodorder {
    PizzaOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Pizza worth @" + (Quantity * prize));
    }
}

class RollOrder extends Foodorder {
    RollOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Roll worth @" + (Quantity * prize));
    }
}

class ManchuriaOrder extends Foodorder {
    ManchuriaOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Manchuria worth @" + (Quantity * prize));
    }
}

class BurgerOrder extends Foodorder {
    BurgerOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Burger worth @" + (Quantity * prize));
    }
}

class PastaOrder extends Foodorder {
    PastaOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Pasta worth @" + (Quantity * prize));
    }
}

class CoffeOrder extends Foodorder {
    CoffeOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered coffee worth @" + (Quantity * prize));
    }
}

class DosaOrder extends Foodorder {
    DosaOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Dosa worth @" + (Quantity * prize));
    }
}

class IdliOrder extends Foodorder {
    IdliOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered Idli worth @" + (Quantity * prize));
    }
}

class VadapavOrder extends Foodorder {
    VadapavOrder(String name, int quantity, double prize) {
        super(name, quantity, prize);
    }
	@Override
    void orderFood() {
		super.generateBill();
        System.out.println("You Ordered vadapav worth @" + (Quantity * prize));
    }
}

public class Order {
    public static void main(String[] args) {
        FriesOrder fo = new FriesOrder("Madhu", 2, 100.00);
        fo.orderFood();
		VadapavOrder vp = new VadapavOrder("Nagaveni",1,110.8);
		vp.orderFood();
		RollOrder ro = new RollOrder("Nandini",4,150.02);
		ro.orderFood();
    }
}