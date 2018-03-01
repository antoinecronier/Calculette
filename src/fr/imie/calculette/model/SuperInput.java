package fr.imie.calculette.model;

public class SuperInput extends MotherInput {
	
	private MotherInput val1;
	private String operateur;
	private float val2;
	
	public SuperInput(MotherInput val1, String operateur, float val2) {
		super();
		this.val1 = val1;
		this.operateur = operateur;
		this.val2 = val2;
	}
	
	public MotherInput getVal1() {
		return val1;
	}
	public void setVal1(MotherInput val1) {
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
