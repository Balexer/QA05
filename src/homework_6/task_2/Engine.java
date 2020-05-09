package homework_6.task_2;

// форматируй код
public class Engine {
    boolean isOn;
    public Engine() {
        this.isOn=false; // поле типа boolean (примитив) по умолчанию будет false, твоя строка лишняя
    } // абзай
    public boolean engineOn() {
        if (isOn) {
            return isOn;
        } else {
            isOn = true;
            return isOn;
        }
    } // абзай
    public boolean engineOff() {
        if (isOn) {
            isOn = false;
            return isOn;
        } else {
            return isOn;
        }
    } // абзац
    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

}
