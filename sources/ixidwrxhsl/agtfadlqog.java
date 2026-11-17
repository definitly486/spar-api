package ixidwrxhsl;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog extends hg.gtknphoqwx implements grlcpdaxtj.wkgbmnqykc {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wkgbmnqykc f49978yggfygwlhe;

    public agtfadlqog(wkgbmnqykc wkgbmnqykcVar) {
        this.f49978yggfygwlhe = wkgbmnqykcVar;
    }

    public boolean btonecajqb(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f49978yggfygwlhe.get(entry.getKey());
        if (obj != null) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, entry.getValue());
        }
        return entry.getValue() == null && this.f49978yggfygwlhe.containsKey(entry.getKey());
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return btonecajqb((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new ojitshcjhn(this.f49978yggfygwlhe.vdvldrhtss());
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f49978yggfygwlhe.size();
    }
}
