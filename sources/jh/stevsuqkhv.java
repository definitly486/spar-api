package jh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class stevsuqkhv implements tzroggbefp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Collection f51341iobyxmoadg;

    public stevsuqkhv(Collection packageFragments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragments, "packageFragments");
        this.f51341iobyxmoadg = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ii.ppxfxbqfkf gxszxtbevo(hkdspvbjdz it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return it.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lqeggnwhkg(ii.ppxfxbqfkf ppxfxbqfkfVar, ii.ppxfxbqfkf it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return !it.wkgbmnqykc() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(it.eablkybsjg(), ppxfxbqfkfVar);
    }

    @Override // jh.tzroggbefp
    public boolean iobyxmoadg(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        Collection collection = this.f51341iobyxmoadg;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((hkdspvbjdz) it.next()).gxszxtbevo(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // jh.cllcsxoeiz
    public Collection oxmwwwfdhm(ii.ppxfxbqfkf fqName, tg.draadjrbmk nameFilter) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameFilter, "nameFilter");
        return lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.istkbnxepw(lj.wflxmlrfwp.dsvhmnatus(hg.jyumaefscl.ikoacuggdj(this.f51341iobyxmoadg), dsvhmnatus.f51298zdlpuopuiu), new wypolnanlu(fqName)));
    }

    @Override // jh.tzroggbefp
    public void ppxfxbqfkf(ii.ppxfxbqfkf fqName, Collection packageFragments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageFragments, "packageFragments");
        for (Object obj : this.f51341iobyxmoadg) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((hkdspvbjdz) obj).gxszxtbevo(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // jh.cllcsxoeiz
    public List zoijcleaow(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        Collection collection = this.f51341iobyxmoadg;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((hkdspvbjdz) obj).gxszxtbevo(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
