
public class Operators_One {

	/*
	 * Unary	postfix	expr++ expr--
	prefix	++expr --expr +expr -expr ~ !
	Arithmetic	multiplicative	* / %
	additive	+ -
	Shift	shift	<< >> >>>
	Relational	comparison	< > <= >= instanceof
	equality	== !=
	Bitwise	bitwise AND	&
	bitwise exclusive OR	^
	bitwise inclusive OR	|
	Logical	logical AND	&&
	logical OR	||
	Ternary	ternary	? :
	Assignment	assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=*/

	public static void main(String[] args) {
		int a =10,b=12;
		boolean c=true;  
		boolean d=false;  	
		
		System.out.println(a++);//10
		System.out.println(++a);//12
		System.out.println(~a);//-13 (minus of total positive value which starts from 0)  
		System.out.println(~b);//-13 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true 
		
		//
		System.out.println(a+b);//24  
		System.out.println(a-b);//0 
		System.out.println(a*b);//144  
		System.out.println(a/b);//1 
		System.out.println(a%b);//0
		
		
		System.out.println(10*10/5+3-1*4/2);//21
	
		//left shift operators
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		System.out.println(15<<1);//15*2^4=15*16=240  
		
		//right shift operator
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2 
		
		System.out.println("///////////////////////////////////"); 
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	}

}
