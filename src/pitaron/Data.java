package pitaron;

public class Data {
    private boolean free;
    private int size;

    public Data(boolean free, int size) {
        this.free = free;
        this.size = size;
    }

    public Data(int totalSize) {
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
