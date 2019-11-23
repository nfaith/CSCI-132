package lastInLab;

public class ProblemA {
	boolean answer = false;
	public boolean palandrom(String stringIn) {

		if(stringIn.length()== 1 || stringIn.length() == 0) {
			answer = true;
		} else if(stringIn.charAt(0) == stringIn.charAt(stringIn.length()-1)){
			palandrom(stringIn.substring(1, stringIn.length()-1));
		}else {
			answer = false;
		}
		return answer;
	}
	
	public void math(int firstNum, int secondNum) {
		
		int mod = firstNum%secondNum;
		
		if(mod == 0) {
			System.out.println("GCF = " + secondNum); 
		} else {
			math(secondNum, mod);
		}
	}
	
}
