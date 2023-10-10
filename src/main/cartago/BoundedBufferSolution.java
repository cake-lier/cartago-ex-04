import cartago.Artifact;
import cartago.GUARD;
import cartago.OPERATION;

public class BoundedBufferSolution extends Artifact {
    private int bufferCount;
    private int size;

    void init(final int size) {
        this.bufferCount = 0;
        this.size = size;
    }

    @OPERATION(guard = "suspendWhileFull")
    void put() {
        this.bufferCount++;
        System.out.println(this.bufferCount);
    }

    @OPERATION(guard = "suspendWhileEmpty")
    void take() {
        this.bufferCount--;
        System.out.println(this.bufferCount);
    }

    @GUARD
    boolean suspendWhileFull() {
        return this.bufferCount < this.size;
    }

    @GUARD
    boolean suspendWhileEmpty() {
        return this.bufferCount > 0;
    }
}
