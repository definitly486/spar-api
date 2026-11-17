package ixidwrxhsl;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb extends hg.btonecajqb implements Set, ug.gxszxtbevo {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f49979zdlpuopuiu;

    public btonecajqb(gxszxtbevo gxszxtbevoVar) {
        this.f49979zdlpuopuiu = gxszxtbevoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49979zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f49979zdlpuopuiu.containsKey(obj);
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f49979zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new gtknphoqwx(this.f49979zdlpuopuiu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f49979zdlpuopuiu.containsKey(obj)) {
            return false;
        }
        this.f49979zdlpuopuiu.remove(obj);
        return true;
    }
}
