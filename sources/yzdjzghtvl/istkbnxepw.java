package yzdjzghtvl;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import gg.wwaezpbzkn;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class istkbnxepw implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f126926cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Object f126927iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object f126928jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Iterator f126929yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final SnapshotStateSet f126930zdlpuopuiu;

    public istkbnxepw(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f126930zdlpuopuiu = snapshotStateSet;
        this.f126929yggfygwlhe = it;
        this.f126926cqumvgiudr = androidx.compose.runtime.snapshots.draadjrbmk.ppxfxbqfkf(snapshotStateSet);
        iobyxmoadg();
    }

    private final void iobyxmoadg() {
        this.f126928jyumaefscl = this.f126927iwizpuwonk;
        this.f126927iwizpuwonk = this.f126929yggfygwlhe.hasNext() ? this.f126929yggfygwlhe.next() : null;
    }

    private final void zoijcleaow() {
        if (androidx.compose.runtime.snapshots.draadjrbmk.ppxfxbqfkf(this.f126930zdlpuopuiu) != this.f126926cqumvgiudr) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f126927iwizpuwonk != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        zoijcleaow();
        iobyxmoadg();
        Object obj = this.f126928jyumaefscl;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        zoijcleaow();
        Object obj = this.f126928jyumaefscl;
        if (obj == null) {
            throw new IllegalStateException();
        }
        this.f126930zdlpuopuiu.remove(obj);
        this.f126928jyumaefscl = null;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        this.f126926cqumvgiudr = androidx.compose.runtime.snapshots.draadjrbmk.ppxfxbqfkf(this.f126930zdlpuopuiu);
    }
}
