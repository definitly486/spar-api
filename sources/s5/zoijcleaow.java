package s5;

import android.os.Bundle;
import androidx.lifecycle.agtfadlqog;
import androidx.lifecycle.vdvldrhtss;
import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import q5.btonecajqb;
import q5.dxjokdxxww;
import q5.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final iobyxmoadg f105514dxjokdxxww = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f105515eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Bundle f105516gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f105517iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f105518lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f105519nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f105520ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f105521wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.iobyxmoadg f105522zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(dxjokdxxww owner, tg.iobyxmoadg onAttach) {
        zdlpuopuiu.btonecajqb(owner, "owner");
        zdlpuopuiu.btonecajqb(onAttach, "onAttach");
        this.f105517iobyxmoadg = owner;
        this.f105522zoijcleaow = onAttach;
        this.f105520ppxfxbqfkf = new ppxfxbqfkf();
        this.f105521wkgbmnqykc = new LinkedHashMap();
        this.f105519nufgyqmvbu = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lqeggnwhkg(zoijcleaow zoijcleaowVar, vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<unused var>");
        zdlpuopuiu.btonecajqb(event, "event");
        if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_START) {
            zoijcleaowVar.f105519nufgyqmvbu = true;
        } else if (event == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_STOP) {
            zoijcleaowVar.f105519nufgyqmvbu = false;
        }
    }

    public final void btonecajqb(String key, gxszxtbevo.zoijcleaow provider) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(provider, "provider");
        synchronized (this.f105520ppxfxbqfkf) {
            if (this.f105521wkgbmnqykc.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f105521wkgbmnqykc.put(key, provider);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final void dxjokdxxww(Bundle outBundle) {
        gg.vdvldrhtss[] vdvldrhtssVarArr;
        zdlpuopuiu.btonecajqb(outBundle, "outBundle");
        Map mapDxjokdxxww = tzroggbefp.dxjokdxxww();
        if (mapDxjokdxxww.isEmpty()) {
            vdvldrhtssVarArr = new gg.vdvldrhtss[0];
        } else {
            ArrayList arrayList = new ArrayList(mapDxjokdxxww.size());
            for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                arrayList.add(cqumvgiudr.iobyxmoadg((String) entry.getKey(), entry.getValue()));
            }
            vdvldrhtssVarArr = (gg.vdvldrhtss[]) arrayList.toArray(new gg.vdvldrhtss[0]);
        }
        Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow((gg.vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
        Bundle bundleIobyxmoadg = btonecajqb.iobyxmoadg(bundleZoijcleaow);
        Bundle bundle = this.f105516gxszxtbevo;
        if (bundle != null) {
            btonecajqb.zoijcleaow(bundleIobyxmoadg, bundle);
        }
        synchronized (this.f105520ppxfxbqfkf) {
            try {
                for (Map.Entry entry2 : this.f105521wkgbmnqykc.entrySet()) {
                    btonecajqb.ppxfxbqfkf(bundleIobyxmoadg, (String) entry2.getKey(), ((gxszxtbevo.zoijcleaow) entry2.getValue()).iobyxmoadg());
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (q5.ppxfxbqfkf.gxszxtbevo(q5.ppxfxbqfkf.iobyxmoadg(bundleZoijcleaow))) {
            return;
        }
        btonecajqb.ppxfxbqfkf(btonecajqb.iobyxmoadg(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleZoijcleaow);
    }

    public final boolean eablkybsjg() {
        return this.f105519nufgyqmvbu;
    }

    public final void gtknphoqwx(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        synchronized (this.f105520ppxfxbqfkf) {
        }
    }

    public final void gxszxtbevo() {
        if (this.f105517iobyxmoadg.getLifecycle().zoijcleaow() != androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f105515eablkybsjg) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f105522zoijcleaow.invoke();
        this.f105517iobyxmoadg.getLifecycle().iobyxmoadg(new agtfadlqog() { // from class: s5.iobyxmoadg
            @Override // androidx.lifecycle.agtfadlqog
            public final void nufgyqmvbu(vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar) {
                zoijcleaow.lqeggnwhkg(this.f105513zdlpuopuiu, vdvldrhtssVar, iobyxmoadgVar);
            }
        });
        this.f105515eablkybsjg = true;
    }

    public final void nufgyqmvbu(Bundle bundle) {
        if (!this.f105515eablkybsjg) {
            gxszxtbevo();
        }
        if (this.f105517iobyxmoadg.getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f105517iobyxmoadg.getLifecycle().zoijcleaow()).toString());
        }
        if (this.f105518lqeggnwhkg) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundlePpxfxbqfkf = null;
        if (bundle != null) {
            Bundle bundleIobyxmoadg = q5.ppxfxbqfkf.iobyxmoadg(bundle);
            if (q5.ppxfxbqfkf.zoijcleaow(bundleIobyxmoadg, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundlePpxfxbqfkf = q5.ppxfxbqfkf.ppxfxbqfkf(bundleIobyxmoadg, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f105516gxszxtbevo = bundlePpxfxbqfkf;
        this.f105518lqeggnwhkg = true;
    }

    public final Bundle ppxfxbqfkf(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        if (!this.f105518lqeggnwhkg) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f105516gxszxtbevo;
        if (bundle == null) {
            return null;
        }
        Bundle bundleIobyxmoadg = q5.ppxfxbqfkf.iobyxmoadg(bundle);
        Bundle bundlePpxfxbqfkf = q5.ppxfxbqfkf.zoijcleaow(bundleIobyxmoadg, key) ? q5.ppxfxbqfkf.ppxfxbqfkf(bundleIobyxmoadg, key) : null;
        btonecajqb.eablkybsjg(btonecajqb.iobyxmoadg(bundle), key);
        if (q5.ppxfxbqfkf.gxszxtbevo(q5.ppxfxbqfkf.iobyxmoadg(bundle))) {
            this.f105516gxszxtbevo = null;
        }
        return bundlePpxfxbqfkf;
    }

    public final gxszxtbevo.zoijcleaow wkgbmnqykc(String key) {
        gxszxtbevo.zoijcleaow zoijcleaowVar;
        zdlpuopuiu.btonecajqb(key, "key");
        synchronized (this.f105520ppxfxbqfkf) {
            Iterator it = this.f105521wkgbmnqykc.entrySet().iterator();
            do {
                zoijcleaowVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                gxszxtbevo.zoijcleaow zoijcleaowVar2 = (gxszxtbevo.zoijcleaow) entry.getValue();
                if (zdlpuopuiu.eablkybsjg(str, key)) {
                    zoijcleaowVar = zoijcleaowVar2;
                }
            } while (zoijcleaowVar == null);
        }
        return zoijcleaowVar;
    }
}
