package accessmodifiertesting;

public class Testofusingexistingclass {

	public static void main(String[] args) {
		CreditCard C= new CreditCard ();
		C.setName("Fatema Tuj Zohra");
		System.out.println(C.getName());
		C.setCardNo(123456);
		System.out.println(C.getCardNo());

	}

}

//Here I just called a class from another file. There is no class file named CreditCard here.
// This class exists in another file of this package (accessmodifiertesting)