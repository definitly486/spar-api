package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus implements q5.gxszxtbevo.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q5.gxszxtbevo f9456iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Bundle f9457ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gg.gtknphoqwx f9458wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f9459zoijcleaow;

    public dsvhmnatus(q5.gxszxtbevo savedStateRegistry, final ribwqtqdhb viewModelStoreOwner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewModelStoreOwner, "viewModelStoreOwner");
        this.f9456iobyxmoadg = savedStateRegistry;
        this.f9458wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: androidx.lifecycle.cllcsxoeiz
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return dsvhmnatus.gxszxtbevo(viewModelStoreOwner);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wypolnanlu gxszxtbevo(ribwqtqdhb ribwqtqdhbVar) {
        return hkdspvbjdz.eablkybsjg(ribwqtqdhbVar);
    }

    private final wypolnanlu wkgbmnqykc() {
        return (wypolnanlu) this.f9458wkgbmnqykc.getValue();
    }

    public final void eablkybsjg() {
        gg.vdvldrhtss[] vdvldrhtssVarArr;
        if (this.f9459zoijcleaow) {
            return;
        }
        Bundle bundleIobyxmoadg = this.f9456iobyxmoadg.iobyxmoadg("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapDxjokdxxww = hg.tzroggbefp.dxjokdxxww();
        if (mapDxjokdxxww.isEmpty()) {
            vdvldrhtssVarArr = new gg.vdvldrhtss[0];
        } else {
            ArrayList arrayList = new ArrayList(mapDxjokdxxww.size());
            for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                arrayList.add(gg.cqumvgiudr.iobyxmoadg((String) entry.getKey(), entry.getValue()));
            }
            vdvldrhtssVarArr = (gg.vdvldrhtss[]) arrayList.toArray(new gg.vdvldrhtss[0]);
        }
        Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow((gg.vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
        Bundle bundleIobyxmoadg2 = q5.btonecajqb.iobyxmoadg(bundleZoijcleaow);
        Bundle bundle = this.f9457ppxfxbqfkf;
        if (bundle != null) {
            q5.btonecajqb.zoijcleaow(bundleIobyxmoadg2, bundle);
        }
        if (bundleIobyxmoadg != null) {
            q5.btonecajqb.zoijcleaow(bundleIobyxmoadg2, bundleIobyxmoadg);
        }
        this.f9457ppxfxbqfkf = bundleZoijcleaow;
        this.f9459zoijcleaow = true;
        wkgbmnqykc();
    }

    @Override // q5.gxszxtbevo.zoijcleaow
    public Bundle iobyxmoadg() {
        gg.vdvldrhtss[] vdvldrhtssVarArr;
        Map mapDxjokdxxww = hg.tzroggbefp.dxjokdxxww();
        if (mapDxjokdxxww.isEmpty()) {
            vdvldrhtssVarArr = new gg.vdvldrhtss[0];
        } else {
            ArrayList arrayList = new ArrayList(mapDxjokdxxww.size());
            for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                arrayList.add(gg.cqumvgiudr.iobyxmoadg((String) entry.getKey(), entry.getValue()));
            }
            vdvldrhtssVarArr = (gg.vdvldrhtss[]) arrayList.toArray(new gg.vdvldrhtss[0]);
        }
        Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow((gg.vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
        Bundle bundleIobyxmoadg = q5.btonecajqb.iobyxmoadg(bundleZoijcleaow);
        Bundle bundle = this.f9457ppxfxbqfkf;
        if (bundle != null) {
            q5.btonecajqb.zoijcleaow(bundleIobyxmoadg, bundle);
        }
        for (Map.Entry entry2 : wkgbmnqykc().gtknphoqwx().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleIobyxmoadg2 = ((pkzmftpjix) entry2.getValue()).ppxfxbqfkf().iobyxmoadg();
            if (!q5.ppxfxbqfkf.gxszxtbevo(q5.ppxfxbqfkf.iobyxmoadg(bundleIobyxmoadg2))) {
                q5.btonecajqb.ppxfxbqfkf(bundleIobyxmoadg, str, bundleIobyxmoadg2);
            }
        }
        this.f9459zoijcleaow = false;
        return bundleZoijcleaow;
    }

    public final Bundle ppxfxbqfkf(String key) {
        gg.vdvldrhtss[] vdvldrhtssVarArr;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        eablkybsjg();
        Bundle bundle = this.f9457ppxfxbqfkf;
        if (bundle == null || !q5.ppxfxbqfkf.zoijcleaow(q5.ppxfxbqfkf.iobyxmoadg(bundle), key)) {
            return null;
        }
        Bundle bundleWkgbmnqykc = q5.ppxfxbqfkf.wkgbmnqykc(q5.ppxfxbqfkf.iobyxmoadg(bundle), key);
        if (bundleWkgbmnqykc == null) {
            Map mapDxjokdxxww = hg.tzroggbefp.dxjokdxxww();
            if (mapDxjokdxxww.isEmpty()) {
                vdvldrhtssVarArr = new gg.vdvldrhtss[0];
            } else {
                ArrayList arrayList = new ArrayList(mapDxjokdxxww.size());
                for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                    arrayList.add(gg.cqumvgiudr.iobyxmoadg((String) entry.getKey(), entry.getValue()));
                }
                vdvldrhtssVarArr = (gg.vdvldrhtss[]) arrayList.toArray(new gg.vdvldrhtss[0]);
            }
            bundleWkgbmnqykc = q1.ppxfxbqfkf.zoijcleaow((gg.vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
            q5.btonecajqb.iobyxmoadg(bundleWkgbmnqykc);
        }
        q5.btonecajqb.eablkybsjg(q5.btonecajqb.iobyxmoadg(bundle), key);
        if (q5.ppxfxbqfkf.gxszxtbevo(q5.ppxfxbqfkf.iobyxmoadg(bundle))) {
            this.f9457ppxfxbqfkf = null;
        }
        return bundleWkgbmnqykc;
    }
}
