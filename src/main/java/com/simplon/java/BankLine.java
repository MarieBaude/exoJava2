package com.simplon.java;
//exo6/7
class BankLine {

   private int line1;
   private int line2;
   private int line3;
   private int line4;
   private int line5;
   
   
   public int getLine1() {
	return line1;
	}
	
	public void setLine1(int line1) {
		this.line1 = line1;
	}
	
	public int getLine2() {
		return line2;
	}
	
	public void setLine2(int line2) {
		this.line2 = line2;
	}
	
	public int getLine3() {
		return line3;
	}
	
	public void setLine3(int line3) {
		this.line3 = line3;
	}
	
	public int getLine4() {
		return line4;
	}
	
	public void setLine4(int line4) {
		this.line4 = line4;
	}
	
	public int getLine5() {
		return line5;
	}
	
	public void setLine5(int line5) {
		this.line5 = line5;
	}

	
	BankLine(int line1, int line2, int line3, int line4, int line5) {
	   this.line1 = line1;
	   this.line2 = line2;
	   this.line3 = line3;
	   this.line4 = line4;
	   this.line5 = line5;
   }
   

public void calculateBalance () {
	   int balanceResult = line1 + line2 + line3 + line4 + line5;
	   System.out.println(balanceResult);
   }
   
   public void calculateAverage () {
	   int averageResult = (line1 + line2 + line3 + line4 + line5) / 5;
   }
   
   public void hightLine () {
	   
   }
   
   public void lowLine () {
	   
   }

}