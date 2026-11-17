package ixidwrxhsl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq extends hg.gtknphoqwx implements grlcpdaxtj.wkgbmnqykc {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final wkgbmnqykc f50000yggfygwlhe;

    public rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
        this.f50000yggfygwlhe = wkgbmnqykcVar;
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f50000yggfygwlhe.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new vdvldrhtss(this.f50000yggfygwlhe.vdvldrhtss());
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f50000yggfygwlhe.size();
    }
}
