public class Marks{
public static void main(String[] args)
{
	System.out.println("Output");
	arrayOfGrades();
}
public static void arrayOfGrades()
{
System.out.println("invoking method");
char firstStudentGrade='A';
char secondStudentGrade='B';
char thirdStudentGrade='C';
char fourthStudentGrade='D';
char fifthStudentGrade='E';
char sixthStudentGrade='F';
char seventhStudentGrade='G';
char eighthStudentGrade='H';
char ninthStudentGrade='C';
char tenthStudentGrade='A';

char[] grades ={firstStudentGrade,secondStudentGrade,thirdStudentGrade,fourthStudentGrade,fifthStudentGrade,sixthStudentGrade,seventhStudentGrade,eighthStudentGrade,ninthStudentGrade,tenthStudentGrade};
int sizeOfArray=grades.length;
System.out.println("Total elements=" +sizeOfArray);
char elementAtIndex3=grades[3];
System.out.println("elementAtIndex three=" +elementAtIndex3);
}
}