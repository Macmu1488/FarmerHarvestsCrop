package Ejercicio2;

import EJercicio1.FarmerHarvestsCrop;

public class Test {
	public static void main(String[] args) {
        FarmerHarvestsCrop crop1 = new FarmerHarvestsCrop("Wheat", 3);
        FarmerHarvestsCrop crop2 = new FarmerHarvestsCrop("Corn", 2);
        FarmerHarvestsCrop crop3 = new FarmerHarvestsCrop("Rice", 1);
        
        Thread thread1 = new Thread(crop1);
        Thread thread2 = new Thread(crop2);
        Thread thread3 = new Thread(crop3);
        

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("All crops are being harvested...");
    }
}