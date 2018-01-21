package accessmodifiertesting;

public class JavaBeanExercise {

	public static void main(String[] args) {
		CreditCard C= new CreditCard ();
		C.setName("Fatema Tuj Zohra");
		System.out.println(C.getName());
		C.setCardNo(123456);
		System.out.println(C.getCardNo());

}

}

   class CreditCard {

	private int CardNo;
	private String Name;
	public CreditCard() {

	}

	public int getCardNo() {
		return CardNo;
	}
	public void setCardNo(int cardno) {
		CardNo = cardno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}



