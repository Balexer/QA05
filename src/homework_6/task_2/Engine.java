package homework_6.task_2;

public class Engine {
    boolean isOn;
    public Engine() {
        this.isOn=false;
    }
    public boolean engineOn() {
        if (isOn) {
            return isOn;
        } else {
            isOn = true;
            return isOn;
        }
    }
    public boolean engineOff() {
        if (isOn) {
            isOn = false;
            return isOn;
        } else {
            return isOn;
        }
    }
    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

}
