package ixidwrxhsl;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu extends iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f49996zdlpuopuiu;

    public nufgyqmvbu(gxszxtbevo gxszxtbevoVar) {
        this.f49996zdlpuopuiu = gxszxtbevoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f49996zdlpuopuiu.clear();
    }

    @Override // ixidwrxhsl.iobyxmoadg
    public boolean draadjrbmk(Map.Entry entry) {
        return this.f49996zdlpuopuiu.remove(entry.getKey(), entry.getValue());
    }

    @Override // ixidwrxhsl.iobyxmoadg
    public boolean dxjokdxxww(Map.Entry entry) {
        Object obj = this.f49996zdlpuopuiu.get(entry.getKey());
        if (obj != null) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f49996zdlpuopuiu.containsKey(entry.getKey());
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f49996zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new dxjokdxxww(this.f49996zdlpuopuiu);
    }
}
