package Ejercicio2;

public class FarmerHarvestsCrop2 implements Runnable {
    private String cropName;
    private int harvestTime;

    public FarmerHarvestsCrop2(String cropName, int harvestTime) {
        this.cropName = cropName;
        this.harvestTime = harvestTime;
    }

    @Override
    public void run() {
        System.out.println(cropName + " harvest started.");
        try {
            Thread.sleep(harvestTime * 1000L);
        } catch (InterruptedException e) {
            System.out.println(cropName + " harvest was interrupted.");
        }
        System.out.println(cropName + " harvest finished.");
    }
}