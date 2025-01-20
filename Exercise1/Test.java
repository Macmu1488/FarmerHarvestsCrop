package EJercicio1;

public class Test {
	 public static void main(String[] args) {
	        FarmerHarvestsCrop crop1 = new FarmerHarvestsCrop("Wheat", 3);
	        FarmerHarvestsCrop crop2 = new FarmerHarvestsCrop("Corn", 2);
	        FarmerHarvestsCrop crop3 = new FarmerHarvestsCrop("Rice", 1);

	        crop1.start();
	        crop2.start();
	        crop3.start();

	        System.out.println("All crops are being harvested...");
	    }
	}


