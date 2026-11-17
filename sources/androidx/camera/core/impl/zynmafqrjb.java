package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f3886iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f3887zoijcleaow = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {
        boolean iobyxmoadg(zoijcleaow zoijcleaowVar);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f3888eablkybsjg = false;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f3889gxszxtbevo = false;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final jyumaefscl f3890iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final iwizpuwonk f3891ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final List f3892wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final istkbnxepw f3893zoijcleaow;

        zoijcleaow(jyumaefscl jyumaefsclVar, istkbnxepw istkbnxepwVar, iwizpuwonk iwizpuwonkVar, List list) {
            this.f3890iobyxmoadg = jyumaefsclVar;
            this.f3893zoijcleaow = istkbnxepwVar;
            this.f3891ppxfxbqfkf = iwizpuwonkVar;
            this.f3892wkgbmnqykc = list;
        }

        public iwizpuwonk eablkybsjg() {
            return this.f3891ppxfxbqfkf;
        }

        public istkbnxepw gxszxtbevo() {
            return this.f3893zoijcleaow;
        }

        boolean iobyxmoadg() {
            return this.f3889gxszxtbevo;
        }

        void lqeggnwhkg(boolean z13) {
            this.f3889gxszxtbevo = z13;
        }

        void nufgyqmvbu(boolean z13) {
            this.f3888eablkybsjg = z13;
        }

        public List ppxfxbqfkf() {
            return this.f3892wkgbmnqykc;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f3890iobyxmoadg + ", mUseCaseConfig=" + this.f3893zoijcleaow + ", mStreamSpec=" + this.f3891ppxfxbqfkf + ", mCaptureTypes=" + this.f3892wkgbmnqykc + ", mAttached=" + this.f3888eablkybsjg + ", mActive=" + this.f3889gxszxtbevo + '}';
        }

        public jyumaefscl wkgbmnqykc() {
            return this.f3890iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean zoijcleaow() {
            return this.f3888eablkybsjg;
        }
    }

    public zynmafqrjb(String str) {
        this.f3886iobyxmoadg = str;
    }

    private Collection agtfadlqog(iobyxmoadg iobyxmoadgVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3887zoijcleaow.entrySet()) {
            if (iobyxmoadgVar == null || iobyxmoadgVar.iobyxmoadg((zoijcleaow) entry.getValue())) {
                arrayList.add((zoijcleaow) entry.getValue());
            }
        }
        return arrayList;
    }

    private Collection draadjrbmk(iobyxmoadg iobyxmoadgVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3887zoijcleaow.entrySet()) {
            if (iobyxmoadgVar == null || iobyxmoadgVar.iobyxmoadg((zoijcleaow) entry.getValue())) {
                arrayList.add(((zoijcleaow) entry.getValue()).wkgbmnqykc());
            }
        }
        return arrayList;
    }

    private zoijcleaow gtknphoqwx(String str, jyumaefscl jyumaefsclVar, istkbnxepw istkbnxepwVar, iwizpuwonk iwizpuwonkVar, List list) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) this.f3887zoijcleaow.get(str);
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zoijcleaow zoijcleaowVar2 = new zoijcleaow(jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
        this.f3887zoijcleaow.put(str, zoijcleaowVar2);
        return zoijcleaowVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean rgvfuqvkyq(zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.iobyxmoadg() && zoijcleaowVar.zoijcleaow();
    }

    private Collection wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3887zoijcleaow.entrySet()) {
            if (iobyxmoadgVar == null || iobyxmoadgVar.iobyxmoadg((zoijcleaow) entry.getValue())) {
                arrayList.add(((zoijcleaow) entry.getValue()).gxszxtbevo());
            }
        }
        return arrayList;
    }

    public Collection btonecajqb() {
        return Collections.unmodifiableCollection(agtfadlqog(new iobyxmoadg() { // from class: androidx.camera.core.impl.esjtqupxsv
            @Override // androidx.camera.core.impl.zynmafqrjb.iobyxmoadg
            public final boolean iobyxmoadg(zynmafqrjb.zoijcleaow zoijcleaowVar) {
                return zoijcleaowVar.zoijcleaow();
            }
        }));
    }

    public void cqumvgiudr(String str) {
        if (this.f3887zoijcleaow.containsKey(str)) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f3887zoijcleaow.get(str);
            zoijcleaowVar.lqeggnwhkg(false);
            if (zoijcleaowVar.zoijcleaow()) {
                return;
            }
            this.f3887zoijcleaow.remove(str);
        }
    }

    public Collection dxjokdxxww() {
        return Collections.unmodifiableCollection(wflxmlrfwp(new iobyxmoadg() { // from class: androidx.camera.core.impl.pmvmpeiblj
            @Override // androidx.camera.core.impl.zynmafqrjb.iobyxmoadg
            public final boolean iobyxmoadg(zynmafqrjb.zoijcleaow zoijcleaowVar) {
                return zoijcleaowVar.zoijcleaow();
            }
        }));
    }

    public jyumaefscl.nufgyqmvbu eablkybsjg() {
        jyumaefscl.nufgyqmvbu nufgyqmvbuVar = new jyumaefscl.nufgyqmvbu();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3887zoijcleaow.entrySet()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) entry.getValue();
            if (zoijcleaowVar.iobyxmoadg() && zoijcleaowVar.zoijcleaow()) {
                String str = (String) entry.getKey();
                nufgyqmvbuVar.zoijcleaow(zoijcleaowVar.wkgbmnqykc());
                arrayList.add(str);
            }
        }
        sopmlzcsov.iobyxmoadg("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f3886iobyxmoadg);
        return nufgyqmvbuVar;
    }

    public void esjtqupxsv(String str, jyumaefscl jyumaefsclVar, istkbnxepw istkbnxepwVar, iwizpuwonk iwizpuwonkVar, List list) {
        if (this.f3887zoijcleaow.containsKey(str)) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
            zoijcleaow zoijcleaowVar2 = (zoijcleaow) this.f3887zoijcleaow.get(str);
            zoijcleaowVar.nufgyqmvbu(zoijcleaowVar2.zoijcleaow());
            zoijcleaowVar.lqeggnwhkg(zoijcleaowVar2.iobyxmoadg());
            this.f3887zoijcleaow.put(str, zoijcleaowVar);
        }
    }

    public Collection gxszxtbevo() {
        return Collections.unmodifiableCollection(draadjrbmk(new iobyxmoadg() { // from class: androidx.camera.core.impl.cqumvgiudr
            @Override // androidx.camera.core.impl.zynmafqrjb.iobyxmoadg
            public final boolean iobyxmoadg(zynmafqrjb.zoijcleaow zoijcleaowVar) {
                return zynmafqrjb.rgvfuqvkyq(zoijcleaowVar);
            }
        }));
    }

    public void iwizpuwonk(String str) {
        if (this.f3887zoijcleaow.containsKey(str)) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f3887zoijcleaow.get(str);
            zoijcleaowVar.nufgyqmvbu(false);
            if (zoijcleaowVar.iobyxmoadg()) {
                return;
            }
            this.f3887zoijcleaow.remove(str);
        }
    }

    public void jyumaefscl(String str, jyumaefscl jyumaefsclVar, istkbnxepw istkbnxepwVar, iwizpuwonk iwizpuwonkVar, List list) {
        gtknphoqwx(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list).nufgyqmvbu(true);
        esjtqupxsv(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list);
    }

    public jyumaefscl.nufgyqmvbu lqeggnwhkg() {
        jyumaefscl.nufgyqmvbu nufgyqmvbuVar = new jyumaefscl.nufgyqmvbu();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3887zoijcleaow.entrySet()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) entry.getValue();
            if (zoijcleaowVar.zoijcleaow()) {
                nufgyqmvbuVar.zoijcleaow(zoijcleaowVar.wkgbmnqykc());
                arrayList.add((String) entry.getKey());
            }
        }
        sopmlzcsov.iobyxmoadg("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f3886iobyxmoadg);
        return nufgyqmvbuVar;
    }

    public Collection nufgyqmvbu() {
        return Collections.unmodifiableCollection(draadjrbmk(new iobyxmoadg() { // from class: androidx.camera.core.impl.lereixgezr
            @Override // androidx.camera.core.impl.zynmafqrjb.iobyxmoadg
            public final boolean iobyxmoadg(zynmafqrjb.zoijcleaow zoijcleaowVar) {
                return zoijcleaowVar.zoijcleaow();
            }
        }));
    }

    public boolean ojitshcjhn(String str) {
        if (this.f3887zoijcleaow.containsKey(str)) {
            return ((zoijcleaow) this.f3887zoijcleaow.get(str)).zoijcleaow();
        }
        return false;
    }

    public void yggfygwlhe(String str, jyumaefscl jyumaefsclVar, istkbnxepw istkbnxepwVar, iwizpuwonk iwizpuwonkVar, List list) {
        gtknphoqwx(str, jyumaefsclVar, istkbnxepwVar, iwizpuwonkVar, list).lqeggnwhkg(true);
    }

    public void zdlpuopuiu(String str) {
        this.f3887zoijcleaow.remove(str);
    }
}
