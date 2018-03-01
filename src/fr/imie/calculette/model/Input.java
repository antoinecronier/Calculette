package fr.imie.calculette.model;

public class Input extends MotherInput {
	
	private float val1;
	private String operateur;
	private float val2;
	
	public Input(float val1, String operateur, float val2) {
		super();
		this.val1 = val1;
		this.operateur = operateur;
		this.val2 = val2;
	}
	
	public float getVal1() {
		return val1;
	}
	public void setVal1(float val1) {
		this.val1 = val1;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	public float getVal2() {
		return val2;
	}
	public void setVal2(float val2) {
		this.val2 = val2;
	}
	
	

}
