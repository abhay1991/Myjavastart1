   class FirstDemo {
    	
    	public static void main (String args[]){
    		First myobj1 =new First(20,13,20);
    		First myobj2 =new First(3,5,9);
    		
    		double vol;
    		vol = myobj1.volume();
    		System.out.println("Volume is" + vol);
    		vol = myobj2.volume();
    		System.out.println("Volume is " + vol);
    		
    		
    	}
    }
 
   