package dartagnan.utils;

public class Timer {

    private long startTime;

    public void restart() {
        startTime = System.currentTimeMillis();
    }

    public double currentTime() {
        return (System.currentTimeMillis() - startTime) * 1.0 / 1000;
    }
}
