
public class TestEffBVector {
	
	public static void main(String[] args) {
		
		// test constructor1; invalid dimension
		EffBVector a1 = new EffBVector(-7);
		System.out.println("Test costructor1--invalid vector dimension:" );
		System.out.println(a1.toString());
		
		// test constructor1; valid dimension
		EffBVector b1 = new EffBVector(5);
		System.out.println("\nTest costructor1--valid dimension:" );
		System.out.println(b1.toString());
			
		//test - vector starts with false
		boolean[] temp = {false, false, true, false, true, true}; 
		EffBVector a = new EffBVector(temp);
		System.out.println("vector starts with false" );
		System.out.println(a.toString());
		System.out.println(a.getBVectorSize());
		System.out.println(a.getListSize());

		System.out.println("" );
		System.out.println("test convert \n" );
		temp = a.convert();
		for(int i=0; i<temp.length;i++)
			System.out.print(temp[i]+" ");
		System.out.println("" );	

		//test - vector starts with true
		boolean[] temp1 = {true, true, true, true, false}; 
		EffBVector b = new EffBVector(temp1);
		System.out.println("" );
		System.out.println("vector starts with true" );
		System.out.println(b.toString());
		System.out.println(b.getBVectorSize());
		System.out.println(b.getListSize());

		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp3 = b.convert();
		for(int i=0; i<temp3.length;i++)
			System.out.print(temp3[i]+" ");
		System.out.println("" );


		//test - all true vector
		EffBVector c = new EffBVector(10);
		System.out.println("" );
		System.out.println("all true vector" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp4 = c.convert();
		for(int i=0; i<temp4.length;i++)
			System.out.print(temp4[i]+" ");
		System.out.println("" );

		//test - set
		c.set(temp1);
		System.out.println("" );
		System.out.println("test set" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp5 = c.convert();
		for(int i=0; i<temp5.length;i++)
			System.out.print(temp5[i]+" ");
		System.out.println("" );

		//test set
		c.set(temp);
		System.out.println("" );
		System.out.println("test set" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		boolean[] temp6 = c.convert();
		for(int i=0; i<temp6.length;i++)
			System.out.print(temp6[i]+" ");
		System.out.println("" );

		
		//test all false vector
		boolean[] temp2 = new boolean[25];
		c.set(temp2);
		System.out.println("" );
		System.out.println("all false vector" );
		System.out.println(c.toString());
		System.out.println(c.getBVectorSize());
		System.out.println(c.getListSize());

		
		System.out.println("" );
		System.out.println("test convert \n" );
		temp2 = c.convert();
		int j=0;
		for(int i=0; i<temp2.length;i++)
			if(temp2[i]==false) j++;
		System.out.println(""+j );
		
		

		
		
		
    }

}
