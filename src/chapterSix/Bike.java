package chapterSix;

public class Bike {
    private String name;

    // private int acceleration;

    private boolean isOn;
    private int speed;
    private int gear;

    public Bike(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGear() {
        if (speed >= 0 && speed <= 20) {
            gear = 1;
        }
        else if (speed >= 21 && speed <= 30){
            gear = 2;
        }
        else if (speed >= 31 && speed <= 40){
            gear = 3;
        }
        else if (speed >= 41){
            gear = 4;
        }
    }
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public int getGear() {
        return gear;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void Acceleration(int gear) {
        if (isOn) {
            if (gear == 1 ) {
                speed++;
            } else if (gear == 2) {
                speed +=2;
            } else if (gear == 3) {
                speed += 3;
            } else if (gear == 4) {
                speed += 4;
            }
        }
    }
    private void printPowerStatus() {
        String powerStatus = isOn ? "tuned on" : "turned off";
        System.out.println("Your suzuki superbike is currently " + powerStatus);
    }
    public void printBikeDetails() {
        printPowerStatus();
        System.out.println("Your gear is currently " + gear + "\n" +
                "Your speed is currently " + speed);
    }

    public int getSpeed() {
        if (speed < 0)
            return 0;
        return speed;
    }
    public void Deceleration(int gear) {
        if (isOn){
            if (gear == 1){
                speed --;
            }
            else if(gear == 2){
                speed -= 2;
            }
            else if(gear == 3){
                speed -= 3;
            }
            else if(gear == 4){
                speed -= 4;
            }
        }
    }
}

