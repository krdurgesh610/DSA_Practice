package org.dugu;

class Complex {
		private double real;
		private double imaginary;
		public Complex(double real, double imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}
		
		public Complex add(Complex c) {
			double resultReal = this.real+c.real;
			double resultImaginary = this.imaginary+c.imaginary;
			return new Complex(resultReal, resultImaginary);
		}
		
		public Complex multiply(Complex c) {
			double resultReal = this.real*c.real;
			double resultImaginary = this.imaginary*c.imaginary;
			return new Complex(resultReal, resultImaginary);
		}

		@Override
		public String toString() {
			return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
		}

	}

public class ComplexTest {

	public static void main(String[] args) {
		Complex x = new Complex(3, 4);
		Complex y = new Complex(2, 3);
		
		x=x.add(y);
		System.err.println(x);
		
		x=x.multiply(y);
		System.err.println(x);
	}

}