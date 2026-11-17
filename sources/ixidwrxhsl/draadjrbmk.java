package ixidwrxhsl;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends hg.lqeggnwhkg implements Collection, ug.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f49980zdlpuopuiu;

    public draadjrbmk(gxszxtbevo gxszxtbevoVar) {
        this.f49980zdlpuopuiu = gxszxtbevoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f49980zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f49980zdlpuopuiu.containsValue(obj);
    }

    @Override // hg.lqeggnwhkg
    public int iobyxmoadg() {
        return this.f49980zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new wflxmlrfwp(this.f49980zdlpuopuiu);
    }
}
