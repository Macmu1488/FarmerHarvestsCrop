package Exercise3_99Threads;

public class FarmerHarvestsCrop3 implements Runnable {

    // Variables to store the crop name and harvest time
    private String cropName;
    private int harvestTime;

    // Constructor to set up the crop name and harvest time
    public FarmerHarvestsCrop3(String cropName, int harvestTime) {
        this.cropName = cropName;
        this.harvestTime = harvestTime;
    }

    // This is what each thread will do when it runs
    @Override
    public void run() {
        // Print a message saying the harvest has started
        System.out.println(cropName + " harvest started.");
        try {
            // Simulate the harvest time by putting the thread to sleep
            Thread.sleep(harvestTime * 1000L);
        } catch (InterruptedException e) {
            // If the thread gets interrupted, let’s print a message
            System.out.println(cropName + " harvest was interrupted.");
        }


        // Print a message saying the harvest has finished
        System.out.println(cropName + " harvest finished.");
    }

    public static void main(String[] args) {
        // Create one crop
        FarmerHarvestsCrop3 crop = new FarmerHarvestsCrop3("Rice", 1);

        // Create a bunch of threads
        int numberOfThreads = 99;
        Thread[] threads = new Thread[numberOfThreads];

        // Initialize and start all the threads
        for (int i = 0; i < 99; i++) {
            threads[i] = new Thread(crop); // All threads share the same task
            threads[i].start();
        }

        // Wait for all threads to finish their work
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}