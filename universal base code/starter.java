import pkg.*;
import java.util.ArrayList;
import java.util.Random;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		double[] ad = new double[7];
		
		double min = 10;
		double max = 0;
		
		for(int n = 0;n<7;n++){
			//double x = Canvas.rand(10.0)
			ad[n] = Canvas.rand(10);
			System.out.print(ad[n]+"\t");
			if(ad[n]<min){
				min = ad[n];
			}
			if(ad[n]>max){
				max = ad[n];
			}
		}
		System.out.println();
		System.out.println(min+"\t"+max);
		
		//int count = 0;
		for(int n = 0;n<7;n++){
			if(ad[n]==max){
				ad[n] = 0;
			}
			else if(ad[n]==min){
				ad[n] = 0;
			}
			System.out.print(ad[n]+"\t");
		}
		
		double sum = 0;
		for(double d: ad){
			sum += d;
		}
		System.out.println();
		System.out.println(sum);
		double average = sum/(ad.length-2);
		System.out.println(average);
		
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
