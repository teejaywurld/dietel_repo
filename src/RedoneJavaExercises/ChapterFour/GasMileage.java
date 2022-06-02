package RedoneJavaExercises.ChapterFour;

public class GasMileage {
    private int milesDriven;
    private int gallonsUsed;
    private int totalMilesDriven = 0;
    private int totalGallonsUsed = 0;

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setTotalMilesDriven(int totalMilesDriven) {
        this.totalMilesDriven = totalMilesDriven;
    }

    public int getTotalMilesDriven() {
        return totalMilesDriven;
    }

    public void setTotalGallonsUsed(int totalGallonsUsed) {
        this.totalGallonsUsed = totalGallonsUsed;

    }

    public int getTotalGallonsUsed() {
        return totalGallonsUsed;
    }

    public double getMilesDrivenPerGallon(int milesDriven,int gallonsUsed){
        return(double) milesDriven/gallonsUsed;
    }
}

