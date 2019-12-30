package prp2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class PRP {
	private static final String FILENAME1 = "unaffected.txt";
	private static final String FILENAME2 = "carrier.txt";
	private static final String FILENAME3 = "affected.txt";
	public static void main(String args[])
    {
		BufferedWriter bw = null;
		FileWriter fw = null;
		 Scanner input = new Scanner(System.in);
	        double[][] A = new double[3][3];
	        double[][] C = new double[3][3];
	        double[][] U = new double[3][3];
	        double[][] M = new double[1][3];
	        //double[][] N = new double[3][3];
	        double[][] I = new double[1][3];
	        double[][] G = new double[10][3];
	        
	        U[0][0] = 1; 
	        U[0][1] = 0; 
	        U[0][2] = 0; 
	        U[1][0] = 0.5; 
	        U[1][1] = 0.5; 
	        U[1][2] = 0; 
	        U[2][0] = 0; 
	        U[2][1] = 1; 
	        U[2][2] = 0;
	        
	        C[0][0] = 0.5; 
	        C[0][1] = 0.5; 
	        C[0][2] = 0; 
	        C[1][0] = 0.25; 
	        C[1][1] = 0.5; 
	        C[1][2] = 0.25; 
	        C[2][0] = 0; 
	        C[2][1] = 0.5; 
	        C[2][2] = 0.5;
	        
	        A[0][0] = 0; 
	        A[0][1] = 1; 
	        A[0][2] = 0; 
	        A[1][0] = 0; 
	        A[1][1] = 0.5; 
	        A[1][2] = 0.5; 
	        A[2][0] = 0; 
	        A[2][1] = 0; 
	        A[2][2] = 1;
	        
	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 3; j++)
	            {
	            	 System.out.print(U[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 3; j++)
	            {
	                System.out.print(C[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 3; j++)
	            {
	                System.out.print(A[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        System.out.println();
	       
	        System.out.println("Are you Affected , Carrier or Unaffected ??");
	        System.out.println("u : Unaffected ");
	        System.out.println("c : Carrier ");
	        System.out.println("a : Affected");
	    
	        
	        String ch = input.next();
	        switch(ch) {
	        case "u":
	        	//int x=0;
	        	double[][] A1 = new double[3][3];
	            double[][] C1 = new double[3][3];
	            double[][] U1 = new double[3][3];
	            double[][] N = new double[3][3];
	        	System.out.println("Enter values in intial matrix : ");
	             for (int i = 0; i < 3; i++)
	             {
	                    I[0][i] = input.nextDouble();
	             }
	        	for(int i=0;i<1;i++){
	        		for(int j=0;j<3;j++){
	        			for(int k=0;k<3;k++){
	        				M[i][j] = M[i][j] + I[i][k]*U[k][j];
	        				
	        				}
	        			for(int x=0;x<3;x++) {
	        				G[0][x] = M[0][x]; 
        				}
	        	}
	        }
	        	
	        multiply(M,U,C,A,I,G);
	        System.out.println();
	        for(int i=0;i<10;i++){
	        	
	        	try {


         			File file = new File(FILENAME1);

         			// if file doesnt exists, then create it
         			if (!file.exists()) {
         				file.createNewFile();
         			}

         			// true = append file
         			fw = new FileWriter(file.getAbsoluteFile(), true);
         			bw = new BufferedWriter(fw);

         			bw.write(i+1 +" ");

         		//	System.out.println("Done");

         			} catch (IOException e) {

         				e.printStackTrace();

	         		} finally {
	
	         			try {
	
	         				if (bw != null)
	         					bw.close();
	
	         				if (fw != null)
	         					fw.close();
	
	         			} catch (IOException ex) {
	
	         				ex.printStackTrace();
	
	         			}
	         		}
        		for(int j=0;j<3;j++){
				
				try {


         			File file = new File(FILENAME1);

         			// if file doesnt exists, then create it
         			if (!file.exists()) {
         				file.createNewFile();
         			}

         			// true = append file
         			fw = new FileWriter(file.getAbsoluteFile(), true);
         			bw = new BufferedWriter(fw);

         			bw.write(G[i][j] +" ");

         		//	System.out.println("Done");

         			} catch (IOException e) {

         				e.printStackTrace();

	         		} finally {
	
	         			try {
	
	         				if (bw != null)
	         					bw.close();
	
	         				if (fw != null)
	         					fw.close();
	
	         			} catch (IOException ex) {
	
	         				ex.printStackTrace();
	
	         			}
	         		}
	        			System.out.print(G[i][j]+" ");
	        		}
				try {
	
	
	         			File file = new File(FILENAME1);
	
	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}
	
	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);
	
	         			bw.newLine();
	
	         			//System.out.println("Done");
	
	         		} catch (IOException e) {
	
	         			e.printStackTrace();
	
	         		} finally {
	
	         			try {
	
	         				if (bw != null)
	         					bw.close();
	
	         				if (fw != null)
	         					fw.close();
	
	         			} catch (IOException ex) {
	
	         				ex.printStackTrace();
	
	         			}
	         		}
        		System.out.println();
             }
	        break;
	        
    		case "c":
	        	System.out.println("Enter values in intial matrix c : ");
	             for (int i = 0; i < 3; i++)
	             {
	                    I[0][i] = input.nextDouble();
	             }
	        	for(int i=0;i<1;i++){
	        		for(int j=0;j<3;j++){
	        			for(int k=0;k<3;k++){
	        				M[i][j] = M[i][j] + I[i][k]*C[k][j];
	        			}
	        			for(int x=0;x<3;x++) {
	        				G[0][x] = M[0][x]; 
        				}
	        		}
	        	}
	        	
		      /*  System.out.println();
		        for(int i=0; i<1;i++){
	        		for(int j=0;j<3;j++){
	        			System.out.print(G[i][j] +"\t");
	        		}
	        	}*/
		        multiply(M,U,C,A,I,G);
		        System.out.println();
		        for(int i=0;i<10;i++){
		        	try {


	         			File file = new File(FILENAME2);

	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}

	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);

	         			bw.write(i+1 +" ");

	         		//	System.out.println("Done");

	         			} catch (IOException e) {

	         				e.printStackTrace();

		         		} finally {
		
		         			try {
		
		         				if (bw != null)
		         					bw.close();
		
		         				if (fw != null)
		         					fw.close();
		
		         			} catch (IOException ex) {
		
		         				ex.printStackTrace();
		
		         			}
		         		}
	        		for(int j=0;j<3;j++){
					
					try {


	         			File file = new File(FILENAME2);

	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}

	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);

	         			bw.write(G[i][j] +" ");

	         		//	System.out.println("Done");

	         		} catch (IOException e) {

	         			e.printStackTrace();

	         		} finally {

	         			try {

	         				if (bw != null)
	         					bw.close();

	         				if (fw != null)
	         					fw.close();

	         			} catch (IOException ex) {

	         				ex.printStackTrace();

	         			}
	         		}
	        			System.out.print(G[i][j]+"\t\t");
	        		}
				try {


	         			File file = new File(FILENAME2);

	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}

	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);

	         			bw.newLine();

	         			//System.out.println("Done");

	         		} catch (IOException e) {

	         			e.printStackTrace();

	         		} finally {

	         			try {

	         				if (bw != null)
	         					bw.close();

	         				if (fw != null)
	         					fw.close();

	         			} catch (IOException ex) {

	         				ex.printStackTrace();

	         			}
	         		}
	        		System.out.println();
	             }
		    break;
		    
	        case "a":
	        	System.out.println("Enter values in intial matrix a : ");
	             for (int i = 0; i < 3; i++)
	             {
	                    I[0][i] = input.nextDouble();
	             }
	        	for(int i=0;i<1;i++){
	        		for(int j=0;j<3;j++){
	        			for(int k=0;k<3;k++){
	        				M[i][j] = M[i][j] + I[i][k]*A[k][j];
	        			}
	        			for(int x=0;x<3;x++) {
	        				G[0][x] = M[0][x]; 
	        			}
	        		}
	        	}
	        	
		        System.out.println();
		        /*for(int i=0; i<1;i++){
	        		for(int j=0;j<3;j++){
	        			System.out.print(G[i][j] +"\t");
	        		}
	        	}*/
		        multiply(M,U,C,A,I,G);
		        System.out.println();
		        for(int i=0;i<10;i++){
		        	try {


	         			File file = new File(FILENAME3);

	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}

	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);

	         			bw.write(i+1 +" ");

	         		//	System.out.println("Done");

	         			} catch (IOException e) {

	         				e.printStackTrace();

		         		} finally {
		
		         			try {
		
		         				if (bw != null)
		         					bw.close();
		
		         				if (fw != null)
		         					fw.close();
		
		         			} catch (IOException ex) {
		
		         				ex.printStackTrace();
		
		         			}
		         		}
	        		for(int j=0;j<3;j++){
					
					try {


	         			File file = new File(FILENAME3);

	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}

	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);

	         			bw.write(G[i][j] +" ");

	         		//	System.out.println("Done");

	         		} catch (IOException e) {

	         			e.printStackTrace();

	         		} finally {

	         			try {

	         				if (bw != null)
	         					bw.close();

	         				if (fw != null)
	         					fw.close();

	         			} catch (IOException ex) {

	         				ex.printStackTrace();

	         			}
	         		}
	        			System.out.print(G[i][j]+"\t\t");
	        		}
				try {


	         			File file = new File(FILENAME3);

	         			// if file doesnt exists, then create it
	         			if (!file.exists()) {
	         				file.createNewFile();
	         			}

	         			// true = append file
	         			fw = new FileWriter(file.getAbsoluteFile(), true);
	         			bw = new BufferedWriter(fw);

	         			bw.newLine();

	         			//System.out.println("Done");

	         		} catch (IOException e) {

	         			e.printStackTrace();

	         		} finally {

	         			try {

	         				if (bw != null)
	         					bw.close();

	         				if (fw != null)
	         					fw.close();

	         			} catch (IOException ex) {

	         				ex.printStackTrace();

	         			}
	         		}
	        		System.out.println();
	             }
		    break;
		    
	        default:
	        	System.out.println("invalid entry.....");
	        }
    }
	
	static int cnt=0;
static void multiply(double M[][],double U[][],double C[][],double A[][],double I[][],double G[][]) {
	 double[][] A1 = new double[3][3];
     double[][] C1 = new double[3][3];
     double[][] U1 = new double[3][3];
     double[][] N = new double[3][3];
     cnt++;
     if(cnt<=9) {
    		for(int j=0;j<3;j++){
    			//System.out.println("U1");
    			for(int k=0;k<3;k++){
    				U1[k][j] =M[0][0]*U[k][j];
    			}
    		}
    		for(int j=0;j<3;j++){
    			//System.out.println("C1");
    			for(int k=0;k<3;k++){
    				C1[k][j] =M[0][1]*C[k][j];
    			}
    		}
    		for(int j=0;j<3;j++){
    			//System.out.println("A1");
    			for(int k=0;k<3;k++){
    				A1[k][j] =M[0][2]*A[k][j];
    			}
    		}
    		/*for(int i=0; i<3;i++){
        		for(int j=0;j<3;j++){
        			System.out.print(U1[i][j] +"\t");
        		}
        		System.out.println();	
        	}*/
    	
    		for(int i=0; i<3;i++){
    			//System.out.println("N");
        		for(int j=0;j<3;j++){
        			N[i][j] = U1[i][j] + C1[i][j] + A1[i][j]; 
        		}
    		}
    		//System.out.println();
    		/*System.out.println("ADD "+cnt);
    		
    		for(int i=0; i<3;i++){
        		for(int j=0;j<3;j++){
        			System.out.print(N[i][j] +"\t");
        		}
        		System.out.println();	
        	}*/
    		for(int i=0; i<1;i++){
        		for(int j=0;j<3;j++){
        			M[i][j]=0;
        		}
    		}
    		for(int i=0;i<1;i++){
        		for(int j=0;j<3;j++){
        			for(int k=0;k<3;k++){
        				M[i][j] = M[i][j] + I[i][k]*N[k][j];	
        			}
        			for(int x=0;x<3;x++) {
        				G[cnt][x] = M[0][x]; 
        			}
        		}
    		}
    		System.out.println();
    		System.out.println("Prob "+ cnt);
    		for(int i=0; i<1;i++){
        		for(int j=0;j<3;j++){
        			System.out.print(M[i][j] +"\t");
        		}
        		System.out.println();	
        	}
    		 multiply(M,U,C,A,I,G);
     }
    
	}
}
