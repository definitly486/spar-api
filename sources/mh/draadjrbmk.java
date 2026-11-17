package mh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk implements jh.tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f66965iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66966zoijcleaow;

    public draadjrbmk(List providers, String debugName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(providers, "providers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(debugName, "debugName");
        this.f66965iobyxmoadg = providers;
        this.f66966zoijcleaow = debugName;
        providers.size();
        hg.jyumaefscl.r(providers).size();
    }

    @Override // jh.tzroggbefp
    public boolean iobyxmoadg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        List list = this.f66965iobyxmoadg;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!jh.kegysxyocb.zoijcleaow((jh.cllcsxoeiz) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // jh.cllcsxoeiz
    public Collection oxmwwwfdhm(ii.ppxfxbqfkf fqName, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f66965iobyxmoadg.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((jh.cllcsxoeiz) it.next()).oxmwwwfdhm(fqName, nameFilter));
        }
        return hashSet;
    }

    @Override // jh.tzroggbefp
    public void ppxfxbqfkf(ii.ppxfxbqfkf fqName, Collection packageFragments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragments, "packageFragments");
        Iterator it = this.f66965iobyxmoadg.iterator();
        while (it.hasNext()) {
            jh.kegysxyocb.iobyxmoadg((jh.cllcsxoeiz) it.next(), fqName, packageFragments);
        }
    }

    public String toString() {
        return this.f66966zoijcleaow;
    }

    @Override // jh.cllcsxoeiz
    public List zoijcleaow(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f66965iobyxmoadg.iterator();
        while (it.hasNext()) {
            jh.kegysxyocb.iobyxmoadg((jh.cllcsxoeiz) it.next(), fqName, arrayList);
        }
        return hg.jyumaefscl.m(arrayList);
    }
}
