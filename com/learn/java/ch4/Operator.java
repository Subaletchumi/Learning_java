
public class Operator {
	
	
	public static  void main(String args[])
	{
		System.out.println("/*********** Arithmetic Operation ***************/");
		
		System.out.println("1.Addition");
		int a,b,c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("The addition value is :"+c);
		
		System.out.println("2.Subtraction");
		int d,e,f;
		d = 20;
		e = 13;
		f = d - e;
		System.out.println("The subtraction value is :"+f);
		
		System.out.println("3.Multiplication");
		int m1,m2,m3;
		m1 = 13;
		m2 = 20;
		m3 = m1 * m2;
		System.out.println("The multiplication value is :"+m3);
		
		System.out.println("4.Division");
		int d1,d2,d3;
		d1 = 50;
		d2 = 50;
		d3 = d1 / d2;
		System.out.println("The devision value is :"+d3);
		
		System.out.println("5.Modulus");
		int m4,m5,m6;
		m4 = 100;
		m5 = 1000;
		m6 = m4 % m5;
		System.out.println("The modulus value is :"+m6);
		
		System.out.println("6.Increment");
		int i;
		i = 5;
		i++;
		System.out.println("The increment value is :"+i);
		

		System.out.println("7.Decrement");
		int dc;
		dc = 9;
		dc--;
		System.out.println("The decrement value is :"+dc);
		
		
		System.out.println("/*********** Assignment Operator ***************/");
		
		/* \\=		+=		-=	*=	/= %=	&= |=		^=		>>=		<<=	\\	*/
		
		System.out.println("1.Addition Equal");
		int x1 = 5;
	    x1 += 3;
	    System.out.println(x1);
	    
	    System.out.println("2.Equal");
	    int x2 = 5;
	    System.out.println(x2);
	    
	    System.out.println("3.Subtract equal");
	    int x3 = 5;
	    x3 -= 3;
	    System.out.println(x3);
	    
	    System.out.println("4.Multiplication equal");
	    int x4 = 5;
	    x4 *= 3;
	    System.out.println(x4);
	    
	    System.out.println("5.Division Equal");
	    int x5 = 5;
	    x5 /= 3;
	    System.out.println(x5);
	    
	    System.out.println("6.Modulus Equal");
	    int x6 = 5;
	    x6 %= 3;
	    System.out.println(x6);
	    
	    System.out.println("AND Equal");
	    int x7 = 5;
	    x7 &= 3;
	    System.out.println(x7);
	    
	    System.out.println("OR Equal");
	    int x8 = 5;
	    x8 |= 3;
	    System.out.println(x8);
	    
	    System.out.println("NOT Equal");
	    int x9 = 5;
	    x9 ^= 3;
	    System.out.println(x9);
	    
	    System.out.println("INCREMENT Equal");
	    int x10 = 5;
	    x10 >>= 3;
	    System.out.println(x10);
	    
	    System.out.println("DECREMENT Equal");
	    int x11 = 5;
	    x11 <<= 3;
	    System.out.println(x11);
	    
	    
	    System.out.println("/*********** Relational Operator ***************/");
	    
	 // variables
	    int a11 = 7, b11 = 11;
	    System.out.println("a is " + a11 + " and b is " + b11);

	    // == Is Equal To operator
	    System.out.println(a11 == b11);

	    // != Not Equal To operator
	    System.out.println(a11 != b11);

	    // >  Greater Than operator
	    System.out.println(a11 > b11);

	    // < Less Than operator
	    System.out.println(a11 < b11); 

	    // >= Greater Than or Equal To operator
	    System.out.println(a11 >= b11);

	    // <= Less Than or Equal To	operator
	    System.out.println(a11 <= b11);
	    
	    System.out.println("/*********** Logical Operator ***************/");
	    
	    System.out.println("Logical AND");
	    
	    int la = 5;
	    System.out.println(la > 3 && la < 10); 
	    
	    System.out.println("Logical OR");
	    int lr = 5;
	    System.out.println(lr > 3 || lr < 4);
	    
	    System.out.println("Logical NOT");
	    int ln = 5;
	    System.out.println(!(ln > 3 && ln < 10));
	    
	    System.out.println("/*********** Ternary Operator ***************/");
	    int lk1=2;  
	    int lk2=5;  
	    int min=(lk1<lk2)?lk1:lk2;  
	    System.out.println(min);  
	    
	    System.out.println("/*********** Shift Operator ***************/");
	    
	    System.out.println("*******Left shift operator*******");
	    System.out.println(10<<2);//10*2^2= \\10*4=40  
	    System.out.println(10<<3);//10*2^3= \\10*(2*2*2)8=80  
	    System.out.println(20<<2);//20*2^2= \\20*4=80  
	    System.out.println(15<<4);//15*2^4= \\15*(2*2*2*2)16=240  
	    
	    System.out.println("******Right shift operator********");
	    System.out.println(10>>2);//10/2^2=10/4=2  
	    System.out.println(20>>2);//20/2^2=20/4=5  
	    System.out.println(20>>3);//20/2^3=20/8=2 
	    
	    
	  }
	    
		
	}



