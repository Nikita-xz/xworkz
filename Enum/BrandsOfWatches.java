enum BrandsOfWatches{
	TITAN,TIMEX,CASIO,ROLEX,GIORDANO,HUBLOT
}

public class WatchTester{

public static void main(String[] names)
{
	BrandsOfWatches[] allBrands=BrandsOfWatches.values();
	System.out.println(allBrands.length);
	for(int initial=0;initial<allBrands.length;initial++){
		System.out.println("index " + initial);
		BrandTester brandsValue=allBrands[initial];
		System.out.println("brands enum Value " + brandsValue);
		
	}
}

}