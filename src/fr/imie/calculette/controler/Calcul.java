package fr.imie.calculette.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.imie.calculette.vue.Vue;

public class Calcul {
	private Vue maVue;
	
	public Calcul(Vue maVue) {
		this.maVue = maVue;
		
		this.maVue.addCalculationListener(new CalculateListener());
		
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
