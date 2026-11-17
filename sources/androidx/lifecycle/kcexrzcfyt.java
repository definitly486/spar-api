package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kcexrzcfyt extends gtknphoqwx {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final iobyxmoadg f9492gtknphoqwx = new iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final sj.zynmafqrjb f9493btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ArrayList f9494dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final WeakReference f9495eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f9496gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f9497lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f9498nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private agtfadlqog.iobyxmoadg f9499ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private gtknphoqwx.zoijcleaow f9500wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f9501zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final kcexrzcfyt iobyxmoadg(vdvldrhtss owner) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(owner, "owner");
            return new kcexrzcfyt(owner, false, null);
        }

        public final gtknphoqwx.zoijcleaow zoijcleaow(gtknphoqwx.zoijcleaow state1, gtknphoqwx.zoijcleaow zoijcleaowVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state1, "state1");
            return (zoijcleaowVar == null || zoijcleaowVar.compareTo(state1) >= 0) ? state1 : zoijcleaowVar;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private gtknphoqwx.zoijcleaow f9502iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private agtfadlqog f9503zoijcleaow;

        public zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar, gtknphoqwx.zoijcleaow initialState) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initialState, "initialState");
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rgvfuqvkyqVar);
            this.f9503zoijcleaow = iwizpuwonk.gxszxtbevo(rgvfuqvkyqVar);
            this.f9502iobyxmoadg = initialState;
        }

        public final void iobyxmoadg(vdvldrhtss vdvldrhtssVar, gtknphoqwx.iobyxmoadg event) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
            gtknphoqwx.zoijcleaow zoijcleaowVarLqeggnwhkg = event.lqeggnwhkg();
            this.f9502iobyxmoadg = kcexrzcfyt.f9492gtknphoqwx.zoijcleaow(this.f9502iobyxmoadg, zoijcleaowVarLqeggnwhkg);
            agtfadlqog agtfadlqogVar = this.f9503zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(vdvldrhtssVar);
            agtfadlqogVar.nufgyqmvbu(vdvldrhtssVar, event);
            this.f9502iobyxmoadg = zoijcleaowVarLqeggnwhkg;
        }

        public final gtknphoqwx.zoijcleaow zoijcleaow() {
            return this.f9502iobyxmoadg;
        }
    }

    public /* synthetic */ kcexrzcfyt(vdvldrhtss vdvldrhtssVar, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(vdvldrhtssVar, z13);
    }

    private final boolean btonecajqb() {
        if (this.f9499ppxfxbqfkf.size() == 0) {
            return true;
        }
        Map.Entry entryIobyxmoadg = this.f9499ppxfxbqfkf.iobyxmoadg();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(entryIobyxmoadg);
        gtknphoqwx.zoijcleaow zoijcleaowVarZoijcleaow = ((zoijcleaow) entryIobyxmoadg.getValue()).zoijcleaow();
        Map.Entry entryWkgbmnqykc = this.f9499ppxfxbqfkf.wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(entryWkgbmnqykc);
        gtknphoqwx.zoijcleaow zoijcleaowVarZoijcleaow2 = ((zoijcleaow) entryWkgbmnqykc.getValue()).zoijcleaow();
        return zoijcleaowVarZoijcleaow == zoijcleaowVarZoijcleaow2 && this.f9500wkgbmnqykc == zoijcleaowVarZoijcleaow2;
    }

    private final void draadjrbmk() {
        ArrayList arrayList = this.f9494dxjokdxxww;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void eablkybsjg(vdvldrhtss vdvldrhtssVar) {
        Iterator itDescendingIterator = this.f9499ppxfxbqfkf.descendingIterator();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f9498nufgyqmvbu) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(entry);
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) entry.getKey();
            zoijcleaow zoijcleaowVar = (zoijcleaow) entry.getValue();
            while (zoijcleaowVar.zoijcleaow().compareTo(this.f9500wkgbmnqykc) > 0 && !this.f9498nufgyqmvbu && this.f9499ppxfxbqfkf.contains(rgvfuqvkyqVar)) {
                gtknphoqwx.iobyxmoadg iobyxmoadgVarIobyxmoadg = gtknphoqwx.iobyxmoadg.Companion.iobyxmoadg(zoijcleaowVar.zoijcleaow());
                if (iobyxmoadgVarIobyxmoadg == null) {
                    throw new IllegalStateException("no event down from " + zoijcleaowVar.zoijcleaow());
                }
                wflxmlrfwp(iobyxmoadgVarIobyxmoadg.lqeggnwhkg());
                zoijcleaowVar.iobyxmoadg(vdvldrhtssVar, iobyxmoadgVarIobyxmoadg);
                draadjrbmk();
            }
        }
    }

    private final void gtknphoqwx(gtknphoqwx.zoijcleaow zoijcleaowVar) {
        if (this.f9500wkgbmnqykc == zoijcleaowVar) {
            return;
        }
        zdlpuopuiu.iobyxmoadg((vdvldrhtss) this.f9495eablkybsjg.get(), this.f9500wkgbmnqykc, zoijcleaowVar);
        this.f9500wkgbmnqykc = zoijcleaowVar;
        if (this.f9497lqeggnwhkg || this.f9496gxszxtbevo != 0) {
            this.f9498nufgyqmvbu = true;
            return;
        }
        this.f9497lqeggnwhkg = true;
        ojitshcjhn();
        this.f9497lqeggnwhkg = false;
        if (this.f9500wkgbmnqykc == gtknphoqwx.zoijcleaow.DESTROYED) {
            this.f9499ppxfxbqfkf = new agtfadlqog.iobyxmoadg();
        }
    }

    private final gtknphoqwx.zoijcleaow gxszxtbevo(rgvfuqvkyq rgvfuqvkyqVar) {
        zoijcleaow zoijcleaowVar;
        Map.Entry entryBtonecajqb = this.f9499ppxfxbqfkf.btonecajqb(rgvfuqvkyqVar);
        gtknphoqwx.zoijcleaow zoijcleaowVar2 = null;
        gtknphoqwx.zoijcleaow zoijcleaowVarZoijcleaow = (entryBtonecajqb == null || (zoijcleaowVar = (zoijcleaow) entryBtonecajqb.getValue()) == null) ? null : zoijcleaowVar.zoijcleaow();
        if (!this.f9494dxjokdxxww.isEmpty()) {
            ArrayList arrayList = this.f9494dxjokdxxww;
            zoijcleaowVar2 = (gtknphoqwx.zoijcleaow) arrayList.get(arrayList.size() - 1);
        }
        iobyxmoadg iobyxmoadgVar = f9492gtknphoqwx;
        return iobyxmoadgVar.zoijcleaow(iobyxmoadgVar.zoijcleaow(this.f9500wkgbmnqykc, zoijcleaowVarZoijcleaow), zoijcleaowVar2);
    }

    private final void lqeggnwhkg(String str) {
        if (!this.f9501zoijcleaow || yggfygwlhe.iobyxmoadg()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void nufgyqmvbu(vdvldrhtss vdvldrhtssVar) {
        agtfadlqog.zoijcleaow.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = this.f9499ppxfxbqfkf.ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarPpxfxbqfkf, "iteratorWithAdditions(...)");
        while (wkgbmnqykcVarPpxfxbqfkf.hasNext() && !this.f9498nufgyqmvbu) {
            Map.Entry entry = (Map.Entry) wkgbmnqykcVarPpxfxbqfkf.next();
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) entry.getKey();
            zoijcleaow zoijcleaowVar = (zoijcleaow) entry.getValue();
            while (zoijcleaowVar.zoijcleaow().compareTo(this.f9500wkgbmnqykc) < 0 && !this.f9498nufgyqmvbu && this.f9499ppxfxbqfkf.contains(rgvfuqvkyqVar)) {
                wflxmlrfwp(zoijcleaowVar.zoijcleaow());
                gtknphoqwx.iobyxmoadg iobyxmoadgVarZoijcleaow = gtknphoqwx.iobyxmoadg.Companion.zoijcleaow(zoijcleaowVar.zoijcleaow());
                if (iobyxmoadgVarZoijcleaow == null) {
                    throw new IllegalStateException("no event up from " + zoijcleaowVar.zoijcleaow());
                }
                zoijcleaowVar.iobyxmoadg(vdvldrhtssVar, iobyxmoadgVarZoijcleaow);
                draadjrbmk();
            }
        }
    }

    private final void ojitshcjhn() {
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) this.f9495eablkybsjg.get();
        if (vdvldrhtssVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!btonecajqb()) {
            this.f9498nufgyqmvbu = false;
            gtknphoqwx.zoijcleaow zoijcleaowVar = this.f9500wkgbmnqykc;
            Map.Entry entryIobyxmoadg = this.f9499ppxfxbqfkf.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(entryIobyxmoadg);
            if (zoijcleaowVar.compareTo(((zoijcleaow) entryIobyxmoadg.getValue()).zoijcleaow()) < 0) {
                eablkybsjg(vdvldrhtssVar);
            }
            Map.Entry entryWkgbmnqykc = this.f9499ppxfxbqfkf.wkgbmnqykc();
            if (!this.f9498nufgyqmvbu && entryWkgbmnqykc != null && this.f9500wkgbmnqykc.compareTo(((zoijcleaow) entryWkgbmnqykc.getValue()).zoijcleaow()) > 0) {
                nufgyqmvbu(vdvldrhtssVar);
            }
        }
        this.f9498nufgyqmvbu = false;
        this.f9493btonecajqb.setValue(zoijcleaow());
    }

    private final void wflxmlrfwp(gtknphoqwx.zoijcleaow zoijcleaowVar) {
        this.f9494dxjokdxxww.add(zoijcleaowVar);
    }

    public void agtfadlqog(gtknphoqwx.zoijcleaow state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        lqeggnwhkg("setCurrentState");
        gtknphoqwx(state);
    }

    public void dxjokdxxww(gtknphoqwx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        lqeggnwhkg("handleLifecycleEvent");
        gtknphoqwx(event.lqeggnwhkg());
    }

    @Override // androidx.lifecycle.gtknphoqwx
    public void iobyxmoadg(rgvfuqvkyq observer) {
        vdvldrhtss vdvldrhtssVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observer, "observer");
        lqeggnwhkg("addObserver");
        gtknphoqwx.zoijcleaow zoijcleaowVar = this.f9500wkgbmnqykc;
        gtknphoqwx.zoijcleaow zoijcleaowVar2 = gtknphoqwx.zoijcleaow.DESTROYED;
        if (zoijcleaowVar != zoijcleaowVar2) {
            zoijcleaowVar2 = gtknphoqwx.zoijcleaow.INITIALIZED;
        }
        zoijcleaow zoijcleaowVar3 = new zoijcleaow(observer, zoijcleaowVar2);
        if (((zoijcleaow) this.f9499ppxfxbqfkf.gxszxtbevo(observer, zoijcleaowVar3)) == null && (vdvldrhtssVar = (vdvldrhtss) this.f9495eablkybsjg.get()) != null) {
            boolean z13 = this.f9496gxszxtbevo != 0 || this.f9497lqeggnwhkg;
            gtknphoqwx.zoijcleaow zoijcleaowVarGxszxtbevo = gxszxtbevo(observer);
            this.f9496gxszxtbevo++;
            while (zoijcleaowVar3.zoijcleaow().compareTo(zoijcleaowVarGxszxtbevo) < 0 && this.f9499ppxfxbqfkf.contains(observer)) {
                wflxmlrfwp(zoijcleaowVar3.zoijcleaow());
                gtknphoqwx.iobyxmoadg iobyxmoadgVarZoijcleaow = gtknphoqwx.iobyxmoadg.Companion.zoijcleaow(zoijcleaowVar3.zoijcleaow());
                if (iobyxmoadgVarZoijcleaow == null) {
                    throw new IllegalStateException("no event up from " + zoijcleaowVar3.zoijcleaow());
                }
                zoijcleaowVar3.iobyxmoadg(vdvldrhtssVar, iobyxmoadgVarZoijcleaow);
                draadjrbmk();
                zoijcleaowVarGxszxtbevo = gxszxtbevo(observer);
            }
            if (!z13) {
                ojitshcjhn();
            }
            this.f9496gxszxtbevo--;
        }
    }

    @Override // androidx.lifecycle.gtknphoqwx
    public void wkgbmnqykc(rgvfuqvkyq observer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observer, "observer");
        lqeggnwhkg("removeObserver");
        this.f9499ppxfxbqfkf.dxjokdxxww(observer);
    }

    @Override // androidx.lifecycle.gtknphoqwx
    public gtknphoqwx.zoijcleaow zoijcleaow() {
        return this.f9500wkgbmnqykc;
    }

    private kcexrzcfyt(vdvldrhtss vdvldrhtssVar, boolean z13) {
        this.f9501zoijcleaow = z13;
        this.f9499ppxfxbqfkf = new agtfadlqog.iobyxmoadg();
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.INITIALIZED;
        this.f9500wkgbmnqykc = zoijcleaowVar;
        this.f9494dxjokdxxww = new ArrayList();
        this.f9495eablkybsjg = new WeakReference(vdvldrhtssVar);
        this.f9493btonecajqb = sj.kegysxyocb.iobyxmoadg(zoijcleaowVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kcexrzcfyt(vdvldrhtss provider) {
        this(provider, true);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(provider, "provider");
    }
}
