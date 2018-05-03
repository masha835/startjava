public class Calculator {
public static void main(String args[]){
	int a = 5;
	int b = 6;
	double c = 5.0;
	double d = 6.0;
	if(a<0 || b<0) {
	System.out.println("Вы ввели недопустимое значение. Запросите ответ без отрицательного знака");
} else {
	
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(c*d);
	System.out.println(c/d);
	//System.out.println();//
        System.out.println(c/100);
	System.out.println(Math.pow(c,d));
	System.out.println(a%b);

	}
 

 }
}