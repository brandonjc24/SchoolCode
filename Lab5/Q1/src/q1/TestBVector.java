
public class TestBVector {
	
	public static void main(String[] args) {
		
		// test constructor1; invalid dimension
		BVector a = new BVector(-7);
		System.out.println("Test costructor1--invalid vector dimension:" );
		System.out.println(a.toString());
		
		// test constructor1; valid dimension
		BVector b = new BVector(5);
		System.out.println("\nTest costructor1--valid dimension:" );
		System.out.println(b.toString());

				
		//test constructor2;
		boolean[] temp = {false, false, true, false, true, true}; 
		BVector c = new BVector(temp);
		System.out.println("\nTest costructor2:" );
		System.out.println(c.toString());
		

		//test getSize();
		System.out.println("\nTest getSize():");
		System.out.println(c.getSize());


		//test getElement(); valid position
		System.out.println("\nTest getElement(), valid position:");
		System.out.println(c.getElement(3));


		//test getElement(); invalid position
		try {
			System.out.println("\nTest getElement(), invalid index" );
			System.out.println(c.getElement(6));			
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}

		
		//test getElement(); invalid position
		try {
			System.out.println("\nTest getElement(), invalid index" );
			System.out.println(c.getElement(-2));			
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}
		
		
		//test setElement() valid position
		System.out.println("\nTest setElement()" );
		c.setElement(false,4);
		System.out.println(c.toString()); 
		

		//test setElement() invalid position
		try {
			System.out.println("\nTest setElement()" );
			c.setElement(true,7); 		
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}
		
		
		//test setElement() invalid position		
		try {
			System.out.println("\nTest setElement()" );
			c.setElement(true,-10); 		
		}
		catch (IndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("\n");
		}
		
		//test logicalAND illegal
		System.out.println("\nTest logicalAnd(), illegal operation" );
		try {
			System.out.println(b.logicalAnd(c));	
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("\n");
		}

		//test logicalAND legal			
		System.out.println("Test logicalAnd(), legal operation" );
		boolean[] temp1 = {true, true, false, true}; 
		BVector d = new BVector(temp1);
		boolean[] temp2 = {true, false, false, true}; 
		BVector f = new BVector(temp2);
		System.out.println(d.logicalAnd(f));

		//d, f should not be affected
		System.out.println(d.toString());
		System.out.println(f.toString());


		//test logicalOR illegal
		System.out.println("\nTest logicalOr(), illegal operation" );
		try {
			b.logicalOr(c);	
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("\n");
		}


		//test logicalOR legal		
		System.out.println("\nTest logicalOr(), legal operation" );
		d.logicalOr(f);

		//d is changed, f is not
		System.out.println(d.toString());
		System.out.println(f.toString());


		
    }

}
