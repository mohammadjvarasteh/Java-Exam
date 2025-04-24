
public class main {

	public static void main(String[] args) 
	{
	   System.out.println(circleArea(12.2));
	   System.out.println(circlePerimeter(12.2));
	   System.out.println(CastToInt(12.2));
       int[] numbers = {1, 99, 34, 56};  
	   System.out.println(findMax(numbers));
	}
	
	public static double circleArea(double R) 
	{
		//Calculate Circle Area
        return Math.PI * R * R;  
	}
	
	public static double circlePerimeter(double R) 
	{
		//Calculate Circle Circumference
        return 2 * Math.PI * R;  
	}
	public static int CastToInt(double x) {
		int y=0;
		//Cast x(double) to y(Integer)
        return (int) x;  
	}
	public static int findMax(int[] x) {
        int max = x[0];  
        // Find Maximum Element in Array(x)  
        for (int i = 1; i < x.length; i++) {  
            if (x[i] > max) {  
                max = x[i];  
            }  
        }  
        return max; 
	}
}
