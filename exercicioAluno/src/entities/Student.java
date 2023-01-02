package entities;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String situation() {
		if (finalGrade() >= 60.0) {
			return "PASS";
		}
		else {
			double result = 60 - finalGrade();
			return "FAILED\n" +
					"MISSING " +
					result +
					" POINTS";
		}
	}
}