package io.github.cakelier;

import cartago.Artifact;
import cartago.GUARD;
import cartago.OPERATION;

public class BoundedBufferSolution extends Artifact {
    private int bufferCount;
    private int size;

    private void init(final int size) {
        this.bufferCount = 0;
        this.size = size;
    }

    @OPERATION(guard = "suspendWhileFull")
    public void put() {
        this.bufferCount++;
        System.out.println(this.bufferCount);
    }

    @OPERATION(guard = "suspendWhileEmpty")
    public void take() {
        this.bufferCount--;
        System.out.println(this.bufferCount);
    }

    @GUARD
    private boolean suspendWhileFull() {
        return this.bufferCount < this.size;
    }

    @GUARD
    private boolean suspendWhileEmpty() {
        return this.bufferCount > 0;
    }
}
