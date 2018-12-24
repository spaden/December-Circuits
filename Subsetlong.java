import java.io.*;
import java.util.*;

public class test {
  public static int div;  
  public static void main(String[] args){  
     Scanner sc = new Scanner(System.in);
	 
	  int T=0, len=0;
     String str="";
     double t1=10, t2=5;
     try {
		T=sc.nextInt();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
	}
     if(T>= 1 && T<=10){
    	 while(T > 0 ){
    	 	   try {
    	 		  len=sc.nextInt();
    	 		   str=sc.next();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
    	 	   //System.out.print("Length "+len);
    	 	   if(len>=1 && len<=Math.pow(t1, t2)){
    	 		if(check(str)){
    	 			//System.out.println("ok");
    	 			totsub(str);	
    	 		}
     	 	     
    	 	    }
    	 	   
    	     T--;
    	 }	 
     }
       
	  //div=14/2; 
     //totsub("abcde");
     //int ln[] = new int[1];
      //System.out.println( un("aabad"));
     //System.out.println(ln[0]);
     
  }
  public static boolean check(String str){
	  char arr[] = str.toCharArray();
	  for( int i=0;i<arr.length; i++){	
		  if(!Character.isAlphabetic(arr[i]) && !Character.isLowerCase(arr[i])){
			  return false;
		  }
		  
	  }
	  return true;
  }
	  public static void totsub(String str){
		  ArrayList<Character> set= new ArrayList<Character>();
           for(int k=0; k<str.length(); k++){
		    	 set.add(str.charAt(k));
		   }
		     
		     ArrayList<ArrayList<Character>>  subsets= getSubsets(set);
		     int longLength[] = new int[subsets.size()];
		     
		     for(int i=0;i<subsets.size(); i++){
		    	 ArrayList<Character> st= subsets.get(i);
		    	 char tn[] = new char[st.size()];
		    	 for(int j=0; j< st.size(); j++){
		    		 tn[j]=st.get(j);
		    		 
		    	 }
		    	 String tt=String.valueOf(tn);
		    	 longLength[i] =  un(tt);
		    	 //System.out.println(un(tt));
		     }
		     Arrays.sort(longLength);
		     System.out.println(longLength[subsets.size()-1]);
	  }
	  
	  public static int un(String tn){
		     //System.out.println("in un method");
		     //String tt=tn;
		     int len=tn.length()/2;
		     int uniq[]= new int[tn.length()];
		     int uncnt[] = new int[tn.length()];
		     
		     for(int i=0; i<tn.length(); i++){
		    	 uncnt[i]=1;
		    	 for(int j=i+1; j<tn.length(); j++){
		    		 
		    		 if(uniq[i]!=1){
		    			 uniq[i]=0;
		    			 if(tn.charAt(i)== tn.charAt(j)){
		        			 uniq[j]=1;
		        			 uncnt[i]++;
		    		      }else {
		    		    	  continue;
		    		      }
		    		 }
		    	 }
		    	 
		    	 if(uncnt[i] >= len){
				    //System.out.println(uncnt[i]); 	
		    	    return uncnt.length;
		    	 }
		     }
		 
		    /* for(int k=0;k<tt.length(); k++){ 
		    	 uncnt[k]=0;
		    	 if(uniq[k] == 0){
		    		 for(int l=1; l<tt.length(); l++){
		    			 if(tt.charAt(k) == tt.charAt(l)){
		    				 uncnt[k]++;
		    			 }
		    		 }
		    	 }else {
		    		 uncnt[k]=0;
		    	 }
		    	 if(uncnt[k] >= len){
		    		 //System.out.println(uncnt.length);
		    	     return uncnt.length;
		    	 }
		    	 
		     } */
		     
		     //for(int h=0; h<uncnt.length; h++){
		    	 
		     //}
		     return 0;
	  }
	
	  
	  public static ArrayList<ArrayList<Character>> getSubsets(ArrayList<Character> set){
		  ArrayList<ArrayList<Character>> allsubsets = new ArrayList<ArrayList<Character>>();
		  
		  int max = 1 << set.size();
		  
		  for(int k=0; k< max; k++){
			  ArrayList<Character> subset = convertToInt(k, set);
			  allsubsets.add(subset);
		  }
		  return allsubsets;
	  }
	  
	  public static ArrayList<Character> convertToInt(int x, ArrayList<Character> set){
	  ArrayList<Character> subset = new ArrayList<Character>();
	  int index = 0;
	  for(int k=x; k> 0; k>>=1){
		  if((k & 1)==1){
			  subset.add(set.get(index));  
		  }
		  index++;
	  }
	  return subset;
  }
}