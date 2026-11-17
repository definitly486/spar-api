package iwizpuwonk;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import istkbnxepw.jztzpxfvev;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kcexrzcfyt.e;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f49821iobyxmoadg;

    public interface iobyxmoadg {
        void iobyxmoadg(e eVar);
    }

    public nufgyqmvbu(jztzpxfvev jztzpxfvevVar) {
        this.f49821iobyxmoadg = (CaptureSessionOnClosedNotCalledQuirk) jztzpxfvevVar.zoijcleaow(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void iobyxmoadg(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.wkgbmnqykc().rgvfuqvkyq(eVar);
        }
    }

    private void zoijcleaow(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.wkgbmnqykc().vdvldrhtss(eVar);
        }
    }

    public void ppxfxbqfkf(e eVar, List list, List list2, iobyxmoadg iobyxmoadgVar) {
        e eVar2;
        e eVar3;
        if (wkgbmnqykc()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext() && (eVar3 = (e) it.next()) != eVar) {
                linkedHashSet.add(eVar3);
            }
            zoijcleaow(linkedHashSet);
        }
        iobyxmoadgVar.iobyxmoadg(eVar);
        if (wkgbmnqykc()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext() && (eVar2 = (e) it2.next()) != eVar) {
                linkedHashSet2.add(eVar2);
            }
            iobyxmoadg(linkedHashSet2);
        }
    }

    public boolean wkgbmnqykc() {
        return this.f49821iobyxmoadg != null;
    }
}
