import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class MyInteger_Test {

	@Test
	public void testisEven() {
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}
	@Test
	public void testisOdd(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		assertFalse(x.isOdd());
		assertTrue(y.isOdd());
	}
	@Test
	public void testisPrime(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		MyInteger z=new MyInteger(1);
		assertTrue(z.isPrime());
		assertFalse(x.isPrime());
		assertTrue(y.isPrime());
	}
	@Test
	public void teststaticisEven(){
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
	}
	@Test
	public void teststaticisOdd(){
		assertFalse(MyInteger.isOdd(4));
		assertTrue(MyInteger.isOdd(5));
	}
	@Test
	public void teststaticisPrime(){
		assertFalse(MyInteger.isPrime(4));
		assertTrue(MyInteger.isPrime(5));
		assertTrue(MyInteger.isPrime(1));
	}
	@Test
	public void teststaticisEvenmi(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		assertTrue(MyInteger.isEven(x));
		assertFalse(MyInteger.isEven(y));
	}
	@Test
	public void teststaticisOddmi(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		assertFalse(MyInteger.isOdd(x));
		assertTrue(MyInteger.isOdd(y));
	}
	@Test
	public void teststaticisPrimemi(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		MyInteger z= new MyInteger(1);
		assertFalse(MyInteger.isPrime(x));
		assertTrue(MyInteger.isPrime(y));
		assertTrue(MyInteger.isPrime(z));
	}
	@Test
	public void testequals(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		assertFalse(x.equals(7));
		assertTrue(y.equals(5));
	}
	@Test
	public void testequals2(){
		MyInteger x= new MyInteger(4);
		MyInteger y= new MyInteger(5);
		MyInteger z= new MyInteger(5);
		assertFalse(x.equals(z));
		assertTrue(y.equals(z));
	}
	

}
