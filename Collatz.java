// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int numbermaxtocal = Integer.parseInt(args[0]);
		String vc = args[1];
		int i = 0;
		int j = 0;
		int nextnumber;
		String c = "c";
		String v = "v";
if(vc.equals(v)){
	 	while (i< numbermaxtocal){ //לופ של שורות
			nextnumber = i + 1;
			j = 0;
			System.out.print(nextnumber+ " ");// קורה בכל תחילת שורה
			do {//לופ של עמודות
				// עמודה אחר עמודה ,מה קורה עכשיו בשורה
				if(nextnumber%2 == 0){
					nextnumber = nextnumber /2;
				}else{
					nextnumber = nextnumber*3 +1;
				}
				System.out.print(nextnumber + " ");
				j++;
			} while (nextnumber != 1);
			System.out.println("("+j+")");//סוף השורה
			i++;//אינדקס שורות
		}//לופ של שורות
		System.out.println("Every one of the first " + i + " hailstone sequences reached 1.");
	}else if(vc.equals(c)){//עכשיו צריך לעשות אותו דבר בלי להדפיס, עד המשפט האחרון
		while (i< numbermaxtocal){ //לופ של שורות
			nextnumber = i + 1;
			j = 0;
			do {//לופ של עמודות
				// עמודה אחר עמודה ,מה קורה עכשיו בשורה
				if(nextnumber%2 == 0){
					nextnumber = nextnumber /2;
				}else{
					nextnumber = nextnumber*3 +1;
				}
				j++;
			} while (nextnumber != 1);
			i++;//אינדקס שורות
		}//לופ של שורות
		System.out.println("Every one of the first " + i + " hailstone sequences reached 1.");
	}
}
}
