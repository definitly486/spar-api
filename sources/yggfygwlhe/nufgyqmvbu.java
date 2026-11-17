package yggfygwlhe;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lereixgezr.iwizpuwonk;

/* JADX INFO: loaded from: classes.dex */
class nufgyqmvbu implements lqeggnwhkg.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DynamicRangeProfiles f124989iobyxmoadg;

    nufgyqmvbu(Object obj) {
        this.f124989iobyxmoadg = (DynamicRangeProfiles) obj;
    }

    private static Set eablkybsjg(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(gxszxtbevo(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static iwizpuwonk gxszxtbevo(long j13) {
        return (iwizpuwonk) u1.nufgyqmvbu.lqeggnwhkg(wkgbmnqykc.zoijcleaow(j13), "Dynamic range profile cannot be converted to a DynamicRange object: " + j13);
    }

    private Long wkgbmnqykc(iwizpuwonk iwizpuwonkVar) {
        return wkgbmnqykc.iobyxmoadg(iwizpuwonkVar, this.f124989iobyxmoadg);
    }

    @Override // yggfygwlhe.lqeggnwhkg.iobyxmoadg
    public DynamicRangeProfiles iobyxmoadg() {
        return this.f124989iobyxmoadg;
    }

    @Override // yggfygwlhe.lqeggnwhkg.iobyxmoadg
    public Set ppxfxbqfkf(iwizpuwonk iwizpuwonkVar) {
        Long lWkgbmnqykc = wkgbmnqykc(iwizpuwonkVar);
        u1.nufgyqmvbu.zoijcleaow(lWkgbmnqykc != null, "DynamicRange is not supported: " + iwizpuwonkVar);
        return eablkybsjg(this.f124989iobyxmoadg.getProfileCaptureRequestConstraints(lWkgbmnqykc.longValue()));
    }

    @Override // yggfygwlhe.lqeggnwhkg.iobyxmoadg
    public Set zoijcleaow() {
        return eablkybsjg(this.f124989iobyxmoadg.getSupportedProfiles());
    }
}
