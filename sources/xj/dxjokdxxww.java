package xj;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.agtfadlqog;
import pj.j;
import pj.jztzpxfvev;
import pj.oxmwwwfdhm;
import pj.wflxmlrfwp;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import uj.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
public class dxjokdxxww implements wflxmlrfwp, ppxfxbqfkf, btonecajqb, j {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f122576esjtqupxsv = AtomicReferenceFieldUpdater.newUpdater(dxjokdxxww.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Object f122579jyumaefscl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.btonecajqb f122581zdlpuopuiu;
    private volatile /* synthetic */ Object state$volatile = gtknphoqwx.f122604zoijcleaow;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List f122580yggfygwlhe = new ArrayList(2);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f122578iwizpuwonk = -1;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Object f122577cqumvgiudr = gtknphoqwx.f122599eablkybsjg;

    public final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final Object f122583eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final vdvldrhtss f122584gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Object f122585iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public Object f122586lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public int f122587nufgyqmvbu = -1;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final vdvldrhtss f122588ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Object f122589wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final vdvldrhtss f122590zoijcleaow;

        public iobyxmoadg(Object obj, vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2, Object obj2, Object obj3, vdvldrhtss vdvldrhtssVar3) {
            this.f122585iobyxmoadg = obj;
            this.f122590zoijcleaow = vdvldrhtssVar;
            this.f122588ppxfxbqfkf = vdvldrhtssVar2;
            this.f122589wkgbmnqykc = obj2;
            this.f122583eablkybsjg = obj3;
            this.f122584gxszxtbevo = vdvldrhtssVar3;
        }

        public final boolean eablkybsjg(dxjokdxxww dxjokdxxwwVar) {
            this.f122590zoijcleaow.invoke(this.f122585iobyxmoadg, dxjokdxxwwVar, this.f122589wkgbmnqykc);
            return dxjokdxxwwVar.f122577cqumvgiudr == gtknphoqwx.f122599eablkybsjg;
        }

        public final vdvldrhtss iobyxmoadg(btonecajqb btonecajqbVar, Object obj) {
            vdvldrhtss vdvldrhtssVar = this.f122584gxszxtbevo;
            if (vdvldrhtssVar != null) {
                return (vdvldrhtss) vdvldrhtssVar.invoke(btonecajqbVar, this.f122589wkgbmnqykc, obj);
            }
            return null;
        }

        public final Object ppxfxbqfkf(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object obj2 = this.f122583eablkybsjg;
            if (this.f122589wkgbmnqykc == gtknphoqwx.dxjokdxxww()) {
                zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((tg.draadjrbmk) obj2).invoke(gxszxtbevoVar);
            }
            zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((rgvfuqvkyq) obj2).invoke(obj, gxszxtbevoVar);
        }

        public final Object wkgbmnqykc(Object obj) {
            return this.f122588ppxfxbqfkf.invoke(this.f122585iobyxmoadg, this.f122589wkgbmnqykc, obj);
        }

        public final void zoijcleaow() {
            Object obj = this.f122586lqeggnwhkg;
            dxjokdxxww dxjokdxxwwVar = dxjokdxxww.this;
            if (obj instanceof lereixgezr) {
                ((lereixgezr) obj).kcexrzcfyt(this.f122587nufgyqmvbu, null, dxjokdxxwwVar.getContext());
                return;
            }
            jztzpxfvev jztzpxfvevVar = obj instanceof jztzpxfvev ? (jztzpxfvev) obj : null;
            if (jztzpxfvevVar != null) {
                jztzpxfvevVar.iobyxmoadg();
            }
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f122591iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f122593yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f122594zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f122593yggfygwlhe = obj;
            this.f122591iwizpuwonk |= Integer.MIN_VALUE;
            return dxjokdxxww.this.vdvldrhtss(this);
        }
    }

    public dxjokdxxww(lg.btonecajqb btonecajqbVar) {
        this.f122581zdlpuopuiu = btonecajqbVar;
    }

    private final void draadjrbmk(iobyxmoadg iobyxmoadgVar) {
        List<iobyxmoadg> list = this.f122580yggfygwlhe;
        if (list == null) {
            return;
        }
        for (iobyxmoadg iobyxmoadgVar2 : list) {
            if (iobyxmoadgVar2 != iobyxmoadgVar) {
                iobyxmoadgVar2.zoijcleaow();
            }
        }
        f122576esjtqupxsv.set(this, gtknphoqwx.f122602ppxfxbqfkf);
        this.f122577cqumvgiudr = gtknphoqwx.f122599eablkybsjg;
        this.f122580yggfygwlhe = null;
    }

    private final int esjtqupxsv(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f122576esjtqupxsv.get(this);
            if (obj3 instanceof agtfadlqog) {
                iobyxmoadg iobyxmoadgVarOxmwwwfdhm = oxmwwwfdhm(obj);
                if (iobyxmoadgVarOxmwwwfdhm == null) {
                    continue;
                } else {
                    vdvldrhtss vdvldrhtssVarIobyxmoadg = iobyxmoadgVarOxmwwwfdhm.iobyxmoadg(this, obj2);
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f122576esjtqupxsv, this, obj3, iobyxmoadgVarOxmwwwfdhm)) {
                        this.f122577cqumvgiudr = obj2;
                        if (gtknphoqwx.btonecajqb((agtfadlqog) obj3, vdvldrhtssVarIobyxmoadg)) {
                            return 0;
                        }
                        this.f122577cqumvgiudr = gtknphoqwx.f122599eablkybsjg;
                        return 2;
                    }
                }
            } else {
                if (zdlpuopuiu.eablkybsjg(obj3, gtknphoqwx.f122602ppxfxbqfkf) || (obj3 instanceof iobyxmoadg)) {
                    return 3;
                }
                if (zdlpuopuiu.eablkybsjg(obj3, gtknphoqwx.f122603wkgbmnqykc)) {
                    return 2;
                }
                if (zdlpuopuiu.eablkybsjg(obj3, gtknphoqwx.f122604zoijcleaow)) {
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f122576esjtqupxsv, this, obj3, jyumaefscl.eablkybsjg(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f122576esjtqupxsv, this, obj3, jyumaefscl.jrbgnlbqoe((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    private final void gtknphoqwx(Object obj) {
        List list = this.f122580yggfygwlhe;
        zdlpuopuiu.lqeggnwhkg(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((iobyxmoadg) it.next()).f122585iobyxmoadg == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwizpuwonk(Object obj) {
        iobyxmoadg iobyxmoadgVarOxmwwwfdhm = oxmwwwfdhm(obj);
        zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarOxmwwwfdhm);
        iobyxmoadgVarOxmwwwfdhm.f122586lqeggnwhkg = null;
        iobyxmoadgVarOxmwwwfdhm.f122587nufgyqmvbu = -1;
        yggfygwlhe(iobyxmoadgVarOxmwwwfdhm, true);
    }

    public static /* synthetic */ void jyumaefscl(dxjokdxxww dxjokdxxwwVar, iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        dxjokdxxwwVar.yggfygwlhe(iobyxmoadgVar, z13);
    }

    private final Object lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122576esjtqupxsv;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == gtknphoqwx.f122604zoijcleaow) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f122576esjtqupxsv, this, obj, rgvfuqvkyqVar)) {
                    oxmwwwfdhm.ppxfxbqfkf(rgvfuqvkyqVar, this);
                    break;
                }
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof iobyxmoadg) {
                        rgvfuqvkyqVar.dsvhmnatus(wwaezpbzkn.f37140iobyxmoadg, ((iobyxmoadg) obj).iobyxmoadg(this, this.f122577cqumvgiudr));
                        break;
                    }
                    throw new IllegalStateException(("unexpected state: " + obj).toString());
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f122576esjtqupxsv, this, obj, gtknphoqwx.f122604zoijcleaow)) {
                    Iterator it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        iwizpuwonk(it.next());
                    }
                }
            }
        }
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final iobyxmoadg oxmwwwfdhm(Object obj) {
        List list = this.f122580yggfygwlhe;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((iobyxmoadg) obj3).f122585iobyxmoadg == obj) {
                obj2 = obj3;
                break;
            }
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj2;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    static /* synthetic */ Object rgvfuqvkyq(dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxwwVar.zdlpuopuiu() ? dxjokdxxwwVar.wflxmlrfwp(gxszxtbevoVar) : dxjokdxxwwVar.vdvldrhtss(gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f122591iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f122591iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWflxmlrfwp = zoijcleaowVar.f122593yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f122591iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                dxjokdxxwwVar = (dxjokdxxww) zoijcleaowVar.f122594zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
        zoijcleaowVar.f122594zdlpuopuiu = this;
        zoijcleaowVar.f122591iwizpuwonk = 1;
        if (lereixgezr(zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        dxjokdxxwwVar = this;
        zoijcleaowVar.f122594zdlpuopuiu = null;
        zoijcleaowVar.f122591iwizpuwonk = 2;
        objWflxmlrfwp = dxjokdxxwwVar.wflxmlrfwp(zoijcleaowVar);
        return objWflxmlrfwp == objGxszxtbevo ? objGxszxtbevo : objWflxmlrfwp;
    }

    private final Object wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
        Object obj = f122576esjtqupxsv.get(this);
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        Object obj2 = this.f122577cqumvgiudr;
        draadjrbmk(iobyxmoadgVar);
        return iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar.wkgbmnqykc(obj2), gxszxtbevoVar);
    }

    private final boolean zdlpuopuiu() {
        return f122576esjtqupxsv.get(this) instanceof iobyxmoadg;
    }

    public void agtfadlqog(jztzpxfvev jztzpxfvevVar) {
        this.f122579jyumaefscl = jztzpxfvevVar;
    }

    public final draadjrbmk cqumvgiudr(Object obj, Object obj2) {
        return gtknphoqwx.iobyxmoadg(esjtqupxsv(obj, obj2));
    }

    @Override // pj.j
    public void eablkybsjg(lereixgezr lereixgezrVar, int i13) {
        this.f122579jyumaefscl = lereixgezrVar;
        this.f122578iwizpuwonk = i13;
    }

    @Override // xj.btonecajqb
    public lg.btonecajqb getContext() {
        return this.f122581zdlpuopuiu;
    }

    @Override // xj.btonecajqb
    public boolean gxszxtbevo(Object obj, Object obj2) {
        return esjtqupxsv(obj, obj2) == 0;
    }

    @Override // xj.ppxfxbqfkf
    public void iobyxmoadg(gxszxtbevo gxszxtbevoVar, rgvfuqvkyq rgvfuqvkyqVar) {
        jyumaefscl(this, new iobyxmoadg(gxszxtbevoVar.wkgbmnqykc(), gxszxtbevoVar.iobyxmoadg(), gxszxtbevoVar.ppxfxbqfkf(), null, rgvfuqvkyqVar, gxszxtbevoVar.zoijcleaow()), false, 1, null);
    }

    public Object ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
        return rgvfuqvkyq(this, gxszxtbevoVar);
    }

    @Override // pj.wflxmlrfwp
    public void ppxfxbqfkf(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122576esjtqupxsv;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == gtknphoqwx.f122602ppxfxbqfkf) {
                return;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(atomicReferenceFieldUpdater, this, obj, gtknphoqwx.f122603wkgbmnqykc));
        List list = this.f122580yggfygwlhe;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((iobyxmoadg) it.next()).zoijcleaow();
        }
        this.f122577cqumvgiudr = gtknphoqwx.f122599eablkybsjg;
        this.f122580yggfygwlhe = null;
    }

    @Override // xj.btonecajqb
    public void wkgbmnqykc(Object obj) {
        this.f122577cqumvgiudr = obj;
    }

    public final void yggfygwlhe(iobyxmoadg iobyxmoadgVar, boolean z13) {
        if (f122576esjtqupxsv.get(this) instanceof iobyxmoadg) {
            return;
        }
        if (!z13) {
            gtknphoqwx(iobyxmoadgVar.f122585iobyxmoadg);
        }
        if (!iobyxmoadgVar.eablkybsjg(this)) {
            f122576esjtqupxsv.set(this, iobyxmoadgVar);
            return;
        }
        if (!z13) {
            List list = this.f122580yggfygwlhe;
            zdlpuopuiu.lqeggnwhkg(list);
            list.add(iobyxmoadgVar);
        }
        iobyxmoadgVar.f122586lqeggnwhkg = this.f122579jyumaefscl;
        iobyxmoadgVar.f122587nufgyqmvbu = this.f122578iwizpuwonk;
        this.f122579jyumaefscl = null;
        this.f122578iwizpuwonk = -1;
    }

    @Override // xj.ppxfxbqfkf
    public void zoijcleaow(wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar) {
        jyumaefscl(this, new iobyxmoadg(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.ppxfxbqfkf(), gtknphoqwx.dxjokdxxww(), draadjrbmkVar, wkgbmnqykcVar.zoijcleaow()), false, 1, null);
    }
}
