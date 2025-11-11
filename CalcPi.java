// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberofactions = Integer.parseInt(args[0]);
		double Pi = Math.PI;
		int i = 0;
		double Calculate = 0;
        while(i < numberofactions){
			if(i%2== 0){
			Calculate = Calculate + (1.0 /(1+ 2.0*i));	
			}else{
              Calculate = Calculate - (1.0 /(1+ 2.0*i));
			}
			i++;
		}
		double approxPi = Calculate * 4;
		System.out.println("pi according to Java: " +Pi);
		System.out.println("pi, approximated:     "+ approxPi);
	}
}
