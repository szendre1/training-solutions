package week12d02;

public class FencesStat {
    private Fence fence;
    private int fenceCount;

    public FencesStat(Fence fence) {
        this.fence = fence;
        this.fenceCount = 1;
    }

    public Fence getFence() {
        return fence;
    }

    public int getFenceCount() {
        return fenceCount;
    }

    public void setFenceCount() {
        this.fenceCount++;
    }
}
