package iducs.java.b;

public class FamilyCustomer extends Customer {
	private double RATE = 0.9;
	@Override
	double applySale(double price) {
		// TODO Auto-generated method stub
		return price * RATE;
	}
	// ��ø : overloading
	public void buy(String item, double p) {
		System.out.println(item + "�� " + applySale(p) 
				+ "�������� �����Ѵ�.");
	}
}
