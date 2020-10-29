public class PlaceFinder{
	public static void main(String[] find){
		System.out.println("JVM invoked main");
		String distInString=find[0];
	    int distance=Integer.parseInt(distInString) ;
		String placeDist=Place.finder(distance);
		System.out.println(placeDist);
	System.out.println("Exit:: main");

	}
}
			