package java3_1;

public class Computer {
	
	public String manufacturer;
	public String processor;
	public int ramSize;
	public int diskSize;
	public double processorSpeed;

	public Computer() {}
	public Computer(String man, String proc, int ram, int disk,double procSpeed){
		manufacturer=man;
		processor=proc;
		ramSize=ram;
		diskSize=disk;
		processorSpeed=procSpeed;
		
	}
	public double computerPower() {
		return ramSize*processorSpeed;
	}
	
	public double getRamSize() {
		return ramSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public String toString() {
		String result = "Manufacturer: "+ manufacturer +
						"\nCPU: " + processor +
						"\nRAM: " +ramSize + " megabytes" +
						"\nDisk: " + diskSize + " gigabytes" +
						"\nProcessor speed: " + processorSpeed + " gigahertz";
		return result;
	}
}



//private -> 오직 그 클래스에서만 접근 할 수 있다.
//protect  -> 자식 클래스에서는 접근 할 수 없다.