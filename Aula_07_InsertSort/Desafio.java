package Aula_07;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Desafio {
	

		public static void Pi(){
		    int precisao = 100;
		    MathContext mx                   = new MathContext(precisao, RoundingMode.HALF_EVEN);

		    BigDecimal quatro                = new BigDecimal( 4, mx);
		    BigDecimal pi                    = new BigDecimal( 0, mx);
		    BigDecimal sinal                 = new BigDecimal( 1, mx);
		    BigDecimal incrementoDenominador = new BigDecimal( 2, mx);
		    BigDecimal denominador           = new BigDecimal( 1, mx);

		    for (int i = 0 ; i < precisao ; i++) {
		      BigDecimal tmp  = quatro.divide(denominador, mx);
		      tmp = tmp.multiply(sinal, mx);
		      pi = pi.add(tmp, mx);

		      sinal = sinal.negate();
		      denominador = denominador.add(incrementoDenominador);
		    }
		   
		    String pii = String.valueOf(pi);
		    
		    	 System.out.println(pi);
		    
		    //System.out.println(String.format("%.100f", pi));
		}
		
		    
		    public static void main(String[] args) {
		    	Pi();
		    }
}

