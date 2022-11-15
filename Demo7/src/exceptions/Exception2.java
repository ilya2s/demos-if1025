package exceptions;

public class Exception2 extends Exception1 {
	
	public String text;
	
	// initie l'attribut text
	public Exception2(String text) {
		try {
			if(text.equals("null")) {
				this.text = null;
			} else {
				this.text = text;
			}
		} catch (NullPointerException e) {
			System.out.println("Le paramètre est null");
			this.text = "";
		}
	}
	
	// Prend un String et le change en int
	public static int stringToInt(String u) {
		try {
			return Integer.parseInt(u);
		} catch (NumberFormatException e) {
			System.out.printf("%s : n'est pas un nombre\n", u);
			return 0;
		}

	}
	
	// prend un int et retourne son inverse
	public static int getInverse(int x) {
		try {
			return 1/x;
		} catch	(ArithmeticException e) {
			System.out.printf("Impossible de diviser par %d\n", x);
			return Integer.MIN_VALUE;
		}
	}
	
	// retourne la longueur du text
	public int getLength() {
		return text.length();
	}
	
	// méthode appelée pour modifier le texte
	public static void effectuerChangements(Exception1 cast) {
		try {
			((Exception2)cast).setText("bonjour");
		} catch (ClassCastException e) {
			System.out.println("Mauvaise instance!");
		}
	}

	// modifie l'attribut text
	public void setText(String text) {
		this.text = text;
	}
	
	// effetDomino1
	public static void effetDomino1() {
		try {
			effetDomino2();
		} catch (DivideByZero e) {
			e.message();
		}
	}
	
	//effetDomino2
	public static void effetDomino2() throws DivideByZero {
		try {
			effetDomino3();
		} catch (ArithmeticException e) {
			throw new DivideByZero();
		}
	}
	
	//effetDomino3
	public static void effetDomino3() throws ArithmeticException {
		lanceUneException();
	}
	
	// lance une exception de type DivideByZero
	public static double lanceUneException() throws ArithmeticException {
		return 1/0;
	}
	
	public static void main(String[] args) {
		String[] testArgs = {"l", "0", null, "Test"};

		System.out.println("=====================================");
		System.out.println(stringToInt(testArgs[0]));

		System.out.println("=====================================");
		System.out.println(getInverse(Integer.parseInt(testArgs[1])));

		System.out.println("=====================================");
		Exception2 ex2 = new Exception2(testArgs[2]);
		System.out.println(ex2.getLength());

		System.out.println("=====================================");
		effectuerChangements(new Exception1());

		System.out.println("=====================================");
		effetDomino1();

	}
}

