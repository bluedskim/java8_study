package com.kware.dskim.lab;

class FormulaTest implements Formula {
	public static void main(String args[]) {
		Formula formula = new FormulaTest(); 
		System.out.println("formula.sqrt(10)=" + formula.sqrt(2));
	}

	@Override
	public double calculate(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
}