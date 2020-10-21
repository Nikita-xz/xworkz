public class Animals{
public static void main(String[] args)
{
	System.out.println("Result");
	arrayOfAnimals();
}
public static void arrayOfAnimals()
{
System.out.println("invoking method");
boolean dogIsDomesticAnimal =true;
boolean lionIsWildAnimal =false;
boolean tigerIsWildAnimal =true;
boolean cowIsDomesticAnimal =true;


boolean[] animals ={dogIsDomesticAnimal,lionIsWildAnimal,tigerIsWildAnimal,cowIsDomesticAnimal};
int sizeOfArray=animals.length;
System.out.println("Total elements=" +sizeOfArray);
boolean elementAtIndex2=animals[2];
System.out.println("elementAtIndex two=" +elementAtIndex2);
}
}
