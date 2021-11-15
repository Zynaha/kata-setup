package kata;

public class PassWord {
	
	private Boolean  isSizeSupperThen6(String pwd) {
	  return pwd.size()>6;
	}
	private Boolean  isContaineCaractere(String pwd) {
		return pwd.conatain("A..Z");
	}
	private Boolean  isContaineDigit(String pwd) {
		return pwd.conatain("1..9");
	}

}
