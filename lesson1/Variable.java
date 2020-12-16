package lesson1;

public class Variable {
	public static void main(String[] args) {
		byte windows = 10;
		short kernels = 4;
		int ddr = 16;
		long hdd = 1700l;
		float cpuFrequency = 3.1f;
		double quantityMonitors = 2.0;
		char quantityPc = '1';
		boolean work = true;

		System.out.println("i have " + quantityPc + " PC");
		System.out.println("My PC parametrs: cpu " + kernels + " kernels / Frequency " + cpuFrequency
				+ "Mhz / RAM DDR3 " + ddr + "Gb / hard drive " + hdd + "Gb");
		System.out.println(quantityMonitors + " monitors connected, OS Windows " + windows + ". End it work - " + work + ". =)");
	}
}
