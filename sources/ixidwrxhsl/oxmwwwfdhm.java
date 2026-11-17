package ixidwrxhsl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm extends hg.zoijcleaow implements grlcpdaxtj.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f49997zdlpuopuiu;

    public oxmwwwfdhm(wkgbmnqykc wkgbmnqykcVar) {
        this.f49997zdlpuopuiu = wkgbmnqykcVar;
    }

    @Override // hg.zoijcleaow, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f49997zdlpuopuiu.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new kcexrzcfyt(this.f49997zdlpuopuiu.vdvldrhtss());
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f49997zdlpuopuiu.size();
    }
}
