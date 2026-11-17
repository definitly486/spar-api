package yzdjzghtvl;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr implements ListIterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f126908iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f126909jyumaefscl = -1;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f126910yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final SnapshotStateList f126911zdlpuopuiu;

    public cqumvgiudr(SnapshotStateList snapshotStateList, int i13) {
        this.f126911zdlpuopuiu = snapshotStateList;
        this.f126910yggfygwlhe = i13 - 1;
        this.f126908iwizpuwonk = vdvldrhtss.nufgyqmvbu(snapshotStateList);
    }

    private final void iobyxmoadg() {
        if (vdvldrhtss.nufgyqmvbu(this.f126911zdlpuopuiu) != this.f126908iwizpuwonk) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        iobyxmoadg();
        this.f126911zdlpuopuiu.add(this.f126910yggfygwlhe + 1, obj);
        this.f126909jyumaefscl = -1;
        this.f126910yggfygwlhe++;
        this.f126908iwizpuwonk = vdvldrhtss.nufgyqmvbu(this.f126911zdlpuopuiu);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f126910yggfygwlhe < this.f126911zdlpuopuiu.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f126910yggfygwlhe >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        iobyxmoadg();
        int i13 = this.f126910yggfygwlhe + 1;
        this.f126909jyumaefscl = i13;
        vdvldrhtss.wflxmlrfwp(i13, this.f126911zdlpuopuiu.size());
        Object obj = this.f126911zdlpuopuiu.get(i13);
        this.f126910yggfygwlhe = i13;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f126910yggfygwlhe + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        iobyxmoadg();
        vdvldrhtss.wflxmlrfwp(this.f126910yggfygwlhe, this.f126911zdlpuopuiu.size());
        int i13 = this.f126910yggfygwlhe;
        this.f126909jyumaefscl = i13;
        Object obj = this.f126911zdlpuopuiu.get(i13);
        this.f126910yggfygwlhe--;
        return obj;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f126910yggfygwlhe;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        iobyxmoadg();
        this.f126911zdlpuopuiu.remove(this.f126909jyumaefscl);
        this.f126910yggfygwlhe--;
        this.f126909jyumaefscl = -1;
        this.f126908iwizpuwonk = vdvldrhtss.nufgyqmvbu(this.f126911zdlpuopuiu);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        iobyxmoadg();
        int i13 = this.f126909jyumaefscl;
        if (i13 < 0) {
            vdvldrhtss.dxjokdxxww();
            throw new KotlinNothingValueException();
        }
        this.f126911zdlpuopuiu.set(i13, obj);
        this.f126908iwizpuwonk = vdvldrhtss.nufgyqmvbu(this.f126911zdlpuopuiu);
    }
}
