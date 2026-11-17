package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow extends ulzqkzuiru {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f23753yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private iobyxmoadg f23754zdlpuopuiu = iobyxmoadg.NOT_READY;

    private enum iobyxmoadg {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected zoijcleaow() {
    }

    private boolean ppxfxbqfkf() {
        this.f23754zdlpuopuiu = iobyxmoadg.FAILED;
        this.f23753yggfygwlhe = iobyxmoadg();
        if (this.f23754zdlpuopuiu == iobyxmoadg.DONE) {
            return false;
        }
        this.f23754zdlpuopuiu = iobyxmoadg.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        xa.draadjrbmk.ojitshcjhn(this.f23754zdlpuopuiu != iobyxmoadg.FAILED);
        int iOrdinal = this.f23754zdlpuopuiu.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return ppxfxbqfkf();
        }
        return false;
    }

    protected abstract Object iobyxmoadg();

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f23754zdlpuopuiu = iobyxmoadg.NOT_READY;
        Object objIobyxmoadg = wwaezpbzkn.iobyxmoadg(this.f23753yggfygwlhe);
        this.f23753yggfygwlhe = null;
        return objIobyxmoadg;
    }

    protected final Object zoijcleaow() {
        this.f23754zdlpuopuiu = iobyxmoadg.DONE;
        return null;
    }
}
