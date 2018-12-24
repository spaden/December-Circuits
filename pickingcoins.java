class TestClass {
    
    public static  int T;
    
    public static void main(String args[] ) throws Exception {
       winner();

    }
    
    
    public static void winner() {
        int N[], K[];
    	
    	try{
    	
    	  Scanner sc= new Scanner(System.in);
    	
    	
    	T=sc.nextInt();
    	System.out.println();
    	
    	int Z=T, i=0;
    	N = new int[Z];
    	K = new int[Z];
    	while(Z>0) {
    		N[i]=sc.nextInt(); K[i]=sc.nextInt();
        	//System.out.println(" ");	
            i++;
        	Z--;
    	}
    	
    	for(int j=0; j< T; j++) {
    		mem(N[j], K[j] );
    	}
    	
    	
    	    
    	}catch(Exception e){
    	    
    	}
    	
    	
    	
    	
    	
    }
    
    public static void mem(int N, int K) {
    	int Coins= N, diff=K;
    	int Alice, Bob;
    	double a=10, b=18;
    	
    	try{
    	    
    	    if(N>=1 && K<= Math.pow(a, b)) {
    			

    	    	for(int i=0; i<N; i++) {
    	    		
    	    		Alice= Coins-diff;
    	    		Coins=Coins-diff;
    	    		//System.out.println(" Coins reamining after Alice turn "+Coins);
    	    		if(Alice <0) {
    	    			System.out.println("Bob");
    	    		    break;
    	    		}
    	    		
    	    		Bob= Coins - diff;
    	    		Coins= Coins - diff;
    	    		//System.out.println("Coins reamaining after bobs turn "+ Coins);
    	    		if(Bob<0) {
    	    			System.out.println("Alice");
    	    		    break;
    	    		}
    	    		
    	    		//Coins= Coins - diff;
    	    		//System.out.println("difference is "+diff);
    	    		
    	    		diff= diff * diff;	
    	    		//System.out.println("2 difference is "+ diff);
    	    	}  
    	    	
    	    
    			
    		}
    	    
    	    
    	}catch(Exception e){
    	    
    	}
    	
    		
       
    }
    
    
    
    
}
