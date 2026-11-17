package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.hkdspvbjdz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.kcexrzcfyt;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.pkzmftpjix;
import androidx.lifecycle.ribwqtqdhb;
import androidx.lifecycle.stevsuqkhv;
import androidx.lifecycle.vdvldrhtss;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements vdvldrhtss, ribwqtqdhb, androidx.lifecycle.dxjokdxxww, q5.dxjokdxxww {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final iobyxmoadg f12220wwaezpbzkn = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gg.gtknphoqwx f12221cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final h5.gtknphoqwx f12222cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f12223esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private androidx.lifecycle.gtknphoqwx.zoijcleaow f12224iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f12225istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private androidx.lifecycle.gtknphoqwx.zoijcleaow f12226iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Bundle f12227jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Bundle f12228lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final crxdokpmqz.ppxfxbqfkf f12229lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private kcexrzcfyt f12230pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final gg.gtknphoqwx f12231yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private lqeggnwhkg f12232yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f12233zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final q5.nufgyqmvbu f12234zynmafqrjb;

    static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {
        eablkybsjg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final pkzmftpjix invoke() {
            if (!ppxfxbqfkf.this.f12225istkbnxepw) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (ppxfxbqfkf.this.getLifecycle().zoijcleaow() != androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED) {
                return ((C0177ppxfxbqfkf) new crxdokpmqz(ppxfxbqfkf.this, new zoijcleaow(ppxfxbqfkf.this)).zoijcleaow(C0177ppxfxbqfkf.class)).gtknphoqwx();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ ppxfxbqfkf zoijcleaow(iobyxmoadg iobyxmoadgVar, Context context, lqeggnwhkg lqeggnwhkgVar, Bundle bundle, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, h5.gtknphoqwx gtknphoqwxVar, String str, Bundle bundle2, int i13, Object obj) {
            String str2;
            Bundle bundle3 = (i13 & 4) != 0 ? null : bundle;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar2 = (i13 & 8) != 0 ? androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED : zoijcleaowVar;
            h5.gtknphoqwx gtknphoqwxVar2 = (i13 & 16) != 0 ? null : gtknphoqwxVar;
            if ((i13 & 32) != 0) {
                String string = UUID.randomUUID().toString();
                zdlpuopuiu.dxjokdxxww(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return iobyxmoadgVar.iobyxmoadg(context, lqeggnwhkgVar, bundle3, zoijcleaowVar2, gtknphoqwxVar2, str2, (i13 & 64) != 0 ? null : bundle2);
        }

        public final ppxfxbqfkf iobyxmoadg(Context context, lqeggnwhkg destination, Bundle bundle, androidx.lifecycle.gtknphoqwx.zoijcleaow hostLifecycleState, h5.gtknphoqwx gtknphoqwxVar, String id2, Bundle bundle2) {
            zdlpuopuiu.btonecajqb(destination, "destination");
            zdlpuopuiu.btonecajqb(hostLifecycleState, "hostLifecycleState");
            zdlpuopuiu.btonecajqb(id2, "id");
            return new ppxfxbqfkf(context, destination, bundle, hostLifecycleState, gtknphoqwxVar, id2, bundle2, null);
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class C0177ppxfxbqfkf extends ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final pkzmftpjix f12236iobyxmoadg;

        public C0177ppxfxbqfkf(pkzmftpjix handle) {
            zdlpuopuiu.btonecajqb(handle, "handle");
            this.f12236iobyxmoadg = handle;
        }

        public final pkzmftpjix gtknphoqwx() {
            return this.f12236iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {
        wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final stevsuqkhv invoke() {
            Context context = ppxfxbqfkf.this.f12233zdlpuopuiu;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
            return new stevsuqkhv(application, ppxfxbqfkfVar, ppxfxbqfkfVar.ppxfxbqfkf());
        }
    }

    private static final class zoijcleaow extends androidx.lifecycle.iobyxmoadg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(q5.dxjokdxxww owner) {
            super(owner, null);
            zdlpuopuiu.btonecajqb(owner, "owner");
        }

        @Override // androidx.lifecycle.iobyxmoadg
        protected ntlheqmsrt ppxfxbqfkf(String key, Class modelClass, pkzmftpjix handle) {
            zdlpuopuiu.btonecajqb(key, "key");
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            zdlpuopuiu.btonecajqb(handle, "handle");
            return new C0177ppxfxbqfkf(handle);
        }
    }

    public /* synthetic */ ppxfxbqfkf(Context context, lqeggnwhkg lqeggnwhkgVar, Bundle bundle, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, h5.gtknphoqwx gtknphoqwxVar, String str, Bundle bundle2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(context, lqeggnwhkgVar, bundle, zoijcleaowVar, gtknphoqwxVar, str, bundle2);
    }

    private final stevsuqkhv wkgbmnqykc() {
        return (stevsuqkhv) this.f12221cdpycssgdh.getValue();
    }

    public final void btonecajqb(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<set-?>");
        this.f12232yggfygwlhe = lqeggnwhkgVar;
    }

    public final void draadjrbmk() {
        if (!this.f12225istkbnxepw) {
            this.f12234zynmafqrjb.ppxfxbqfkf();
            this.f12225istkbnxepw = true;
            if (this.f12222cqumvgiudr != null) {
                hkdspvbjdz.ppxfxbqfkf(this);
            }
            this.f12234zynmafqrjb.wkgbmnqykc(this.f12228lereixgezr);
        }
        if (this.f12226iwizpuwonk.ordinal() < this.f12224iozdgvuglv.ordinal()) {
            this.f12230pmvmpeiblj.agtfadlqog(this.f12226iwizpuwonk);
        } else {
            this.f12230pmvmpeiblj.agtfadlqog(this.f12224iozdgvuglv);
        }
    }

    public final void dxjokdxxww(Bundle outBundle) {
        zdlpuopuiu.btonecajqb(outBundle, "outBundle");
        this.f12234zynmafqrjb.eablkybsjg(outBundle);
    }

    public final lqeggnwhkg eablkybsjg() {
        return this.f12232yggfygwlhe;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        if (!zdlpuopuiu.eablkybsjg(this.f12223esjtqupxsv, ppxfxbqfkfVar.f12223esjtqupxsv) || !zdlpuopuiu.eablkybsjg(this.f12232yggfygwlhe, ppxfxbqfkfVar.f12232yggfygwlhe) || !zdlpuopuiu.eablkybsjg(getLifecycle(), ppxfxbqfkfVar.getLifecycle()) || !zdlpuopuiu.eablkybsjg(getSavedStateRegistry(), ppxfxbqfkfVar.getSavedStateRegistry())) {
            return false;
        }
        if (!zdlpuopuiu.eablkybsjg(this.f12227jyumaefscl, ppxfxbqfkfVar.f12227jyumaefscl)) {
            Bundle bundle = this.f12227jyumaefscl;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj2 = this.f12227jyumaefscl.get(str);
                    Bundle bundle2 = ppxfxbqfkfVar.f12227jyumaefscl;
                    if (!zdlpuopuiu.eablkybsjg(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public t2.iobyxmoadg getDefaultViewModelCreationExtras() {
        t2.wkgbmnqykc wkgbmnqykcVar = new t2.wkgbmnqykc(null, 1, null);
        Context context = this.f12233zdlpuopuiu;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            wkgbmnqykcVar.ppxfxbqfkf(crxdokpmqz.iobyxmoadg.f9449nufgyqmvbu, application);
        }
        wkgbmnqykcVar.ppxfxbqfkf(hkdspvbjdz.f9476iobyxmoadg, this);
        wkgbmnqykcVar.ppxfxbqfkf(hkdspvbjdz.f9478zoijcleaow, this);
        Bundle bundlePpxfxbqfkf = ppxfxbqfkf();
        if (bundlePpxfxbqfkf != null) {
            wkgbmnqykcVar.ppxfxbqfkf(hkdspvbjdz.f9477ppxfxbqfkf, bundlePpxfxbqfkf);
        }
        return wkgbmnqykcVar;
    }

    @Override // androidx.lifecycle.dxjokdxxww
    public crxdokpmqz.ppxfxbqfkf getDefaultViewModelProviderFactory() {
        return this.f12229lmojexxdyd;
    }

    @Override // androidx.lifecycle.vdvldrhtss
    public androidx.lifecycle.gtknphoqwx getLifecycle() {
        return this.f12230pmvmpeiblj;
    }

    @Override // q5.dxjokdxxww
    public q5.gxszxtbevo getSavedStateRegistry() {
        return this.f12234zynmafqrjb.zoijcleaow();
    }

    @Override // androidx.lifecycle.ribwqtqdhb
    public jlmebxxoox getViewModelStore() {
        if (!this.f12225istkbnxepw) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().zoijcleaow() == androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        h5.gtknphoqwx gtknphoqwxVar = this.f12222cqumvgiudr;
        if (gtknphoqwxVar != null) {
            return gtknphoqwxVar.lqeggnwhkg(this.f12223esjtqupxsv);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final void gtknphoqwx(androidx.lifecycle.gtknphoqwx.zoijcleaow maxState) {
        zdlpuopuiu.btonecajqb(maxState, "maxState");
        this.f12224iozdgvuglv = maxState;
        draadjrbmk();
    }

    public final String gxszxtbevo() {
        return this.f12223esjtqupxsv;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f12223esjtqupxsv.hashCode() * 31) + this.f12232yggfygwlhe.hashCode();
        Bundle bundle = this.f12227jyumaefscl;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i13 = iHashCode * 31;
                Object obj = this.f12227jyumaefscl.get((String) it.next());
                iHashCode = i13 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final androidx.lifecycle.gtknphoqwx.zoijcleaow lqeggnwhkg() {
        return this.f12224iozdgvuglv;
    }

    public final void nufgyqmvbu(androidx.lifecycle.gtknphoqwx.iobyxmoadg event) {
        zdlpuopuiu.btonecajqb(event, "event");
        this.f12226iwizpuwonk = event.lqeggnwhkg();
        draadjrbmk();
    }

    public final Bundle ppxfxbqfkf() {
        if (this.f12227jyumaefscl == null) {
            return null;
        }
        return new Bundle(this.f12227jyumaefscl);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(ppxfxbqfkf.class.getSimpleName());
        sb3.append('(' + this.f12223esjtqupxsv + ')');
        sb3.append(" destination=");
        sb3.append(this.f12232yggfygwlhe);
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }

    private ppxfxbqfkf(Context context, lqeggnwhkg lqeggnwhkgVar, Bundle bundle, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, h5.gtknphoqwx gtknphoqwxVar, String str, Bundle bundle2) {
        this.f12233zdlpuopuiu = context;
        this.f12232yggfygwlhe = lqeggnwhkgVar;
        this.f12227jyumaefscl = bundle;
        this.f12226iwizpuwonk = zoijcleaowVar;
        this.f12222cqumvgiudr = gtknphoqwxVar;
        this.f12223esjtqupxsv = str;
        this.f12228lereixgezr = bundle2;
        this.f12230pmvmpeiblj = new kcexrzcfyt(this);
        this.f12234zynmafqrjb = q5.nufgyqmvbu.f77857ppxfxbqfkf.zoijcleaow(this);
        this.f12221cdpycssgdh = gg.draadjrbmk.zoijcleaow(new wkgbmnqykc());
        this.f12231yadqdtsiqt = gg.draadjrbmk.zoijcleaow(new eablkybsjg());
        this.f12224iozdgvuglv = androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED;
        this.f12229lmojexxdyd = wkgbmnqykc();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ppxfxbqfkf entry, Bundle bundle) {
        this(entry.f12233zdlpuopuiu, entry.f12232yggfygwlhe, bundle, entry.f12226iwizpuwonk, entry.f12222cqumvgiudr, entry.f12223esjtqupxsv, entry.f12228lereixgezr);
        zdlpuopuiu.btonecajqb(entry, "entry");
        this.f12226iwizpuwonk = entry.f12226iwizpuwonk;
        gtknphoqwx(entry.f12224iozdgvuglv);
    }
}
