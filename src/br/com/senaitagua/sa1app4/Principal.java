package br.com.senaitagua.sa1app4;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.DivisaoBO;

public class Principal {

	public static void main(String[] args) {
		
		DivisaoBO cont = new DivisaoBO();
		
		JOptionPane.showMessageDialog(null,"Ser�o divididos R$5.000 entre 10 cientes. Cada um levar� para casa: "+ " R$" + cont.divisaoDin());
	}

}
