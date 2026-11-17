package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f4260jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f4261yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f4262zdlpuopuiu;

    public dxjokdxxww(int i13) {
        this.f4262zdlpuopuiu = i13;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4261yggfygwlhe < this.f4262zdlpuopuiu;
    }

    protected abstract Object iobyxmoadg(int i13);

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objIobyxmoadg = iobyxmoadg(this.f4261yggfygwlhe);
        this.f4261yggfygwlhe++;
        this.f4260jyumaefscl = true;
        return objIobyxmoadg;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f4260jyumaefscl) {
            jlmebxxoox.wkgbmnqykc.zoijcleaow("Call next() before removing an element.");
        }
        int i13 = this.f4261yggfygwlhe - 1;
        this.f4261yggfygwlhe = i13;
        zoijcleaow(i13);
        this.f4262zdlpuopuiu--;
        this.f4260jyumaefscl = false;
    }

    protected abstract void zoijcleaow(int i13);
}
