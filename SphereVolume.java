import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		//Declare variables:
		Double diam, rad, vol;
		//create a scanner object
		Scanner get = new Scanner(System.in);
		//programe purpose
		System.out.println("This programe calculates Sphere volume");
		//asking the diameter
		System.out.println("Please enter the diameter:");
		//Read the diameter
		diam = get.nextDouble();
		
		if(diam>=0)
			{
			//Calculate the radius
			rad = diam/2;
			//Calculate the volume
			vol = (double)4/3 * Math.PI * Math.pow(rad, 3);
			System.out.println("The volume is: " + vol);
			}
		else
			System.out.println("Cannot calculate!! The diameter must be grater than 0");		
		System.exit(0);
	}

}
