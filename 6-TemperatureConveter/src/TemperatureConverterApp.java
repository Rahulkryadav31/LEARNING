import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the temperature in degree-F");
double f=scan.nextDouble();
TemperatureConverter temperatureConverter=new TemperatureConverter();
double tempincelsius=temperatureConverter.convertFahrenheitToCelsius(f);
System.out.println(tempincelsius);
	
	}

}
