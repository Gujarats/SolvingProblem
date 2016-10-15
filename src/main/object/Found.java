package object;

/**
 * Created by gujarat on 10/10/16.
 */
public class Found {
    private int index;
    private int value;
    private boolean isFound;

    public Found(){

    }

    public Found(int index, int value, boolean isFound) {
        this.index = index;
        this.value = value;
        this.isFound = isFound;
    }

    public Found(int o, Object o1, boolean isFound) {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isFound() {
        return isFound;
    }

    public void setFound(boolean found) {
        isFound = found;
    }
}
