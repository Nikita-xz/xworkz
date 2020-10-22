public class States{
	public static void main(String[] args){
		System.out.println("JVM invokes main");
		String[] nameOfStatesArray={"Karnataka", "Sikkim", "Tamil Nadu", "Gujarat", "Haryana", "Kerala", "Mizoram", "Nagaland", "Odisha", "Punjab", "Tripura", "West Bengal",
		"Uttarakhand", "Goa", "Bihar"};
		statesName(nameOfStatesArray);
		statesName(null);
		System.out.println("exit name");
		}
		public static void statesName(String[] names)
		{
			System.out.println("statesName "+ names);
			int size=names.length;
			System.out.println(size);
			String elementAtIndex0=names[0];
			System.out.println("statesName @ index 0 " +elementAtIndex0);
			System.out.println("statesName @ index 1 " +names[1]);
			System.out.println("statesName @ index 2 " +names[2]);
			System.out.println("statesName @ index 3 " +names[3]);
			System.out.println("statesName @ index 4 " +names[4]);
			System.out.println("statesName @ index 5 " +names[5]);
			System.out.println("statesName @ index 6 " +names[6]);
			System.out.println("statesName @ index 7 " +names[7]);
			System.out.println("statesName @ index 8 " +names[8]);
			System.out.println("statesName @ index 9 " +names[9]);
			System.out.println("statesName @ index 10 " +names[10]);
			System.out.println("statesName @ index 11 " +names[11]);
			System.out.println("statesName @ index 12 " +names[12]);
			System.out.println("statesName @ index 13 " +names[13]);
			System.out.println("statesName @ index 14 " +names[14]);
		}
	}
			
			
		
		
		
		
	