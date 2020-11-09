enum BrandsOfWatches{
TITAN,TIMEX,CASIO,ROLEX,GIORDANO,HUBLOT
}

public class BrandTester{

public static void main(String[] names)
{
	BrandsOfWatches[] allBrands=BrandsOfWatches.values();
	System.out.println(allBrands.length);
	//length will be +1 of index
	for(int initial=0;initial<allBrands.length;initial++){
		System.out.println("index " + initial);
		BrandsOfWatches brandsValue=allBrands[initial];
		System.out.println("brands enum Value " + brandsValue);
		
	}
}

}