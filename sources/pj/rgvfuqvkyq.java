package pj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes3.dex */
public class rgvfuqvkyq extends ribwqtqdhb implements agtfadlqog, kotlin.coroutines.jvm.internal.eablkybsjg, j {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76762esjtqupxsv = AtomicIntegerFieldUpdater.newUpdater(rgvfuqvkyq.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76763lereixgezr = AtomicReferenceFieldUpdater.newUpdater(rgvfuqvkyq.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76764pmvmpeiblj = AtomicReferenceFieldUpdater.newUpdater(rgvfuqvkyq.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final lg.btonecajqb f76765cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final lg.gxszxtbevo f76766iwizpuwonk;

    public rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar, int i13) {
        super(i13);
        this.f76766iwizpuwonk = gxszxtbevoVar;
        this.f76765cqumvgiudr = gxszxtbevoVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = wkgbmnqykc.f76798zdlpuopuiu;
    }

    private final void draadjrbmk(uj.lereixgezr lereixgezrVar, Throwable th2) {
        int i13 = f76762esjtqupxsv.get(this) & 536870911;
        if (i13 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            lereixgezrVar.kcexrzcfyt(i13, th2, getContext());
        } catch (Throwable th3) {
            jpowsppfya.iobyxmoadg(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final Void dxjokdxxww(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final boolean iozdgvuglv() {
        if (vipkmwdibw.ppxfxbqfkf(this.f76767jyumaefscl)) {
            lg.gxszxtbevo gxszxtbevoVar = this.f76766iwizpuwonk;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((uj.lqeggnwhkg) gxszxtbevoVar).wflxmlrfwp()) {
                return true;
            }
        }
        return false;
    }

    private final void istkbnxepw(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76763lereixgezr;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof wkgbmnqykc) {
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof wflxmlrfwp) || (obj2 instanceof uj.lereixgezr)) {
                wwaezpbzkn(obj, obj2);
            } else {
                if (obj2 instanceof istkbnxepw) {
                    istkbnxepw istkbnxepwVar = (istkbnxepw) obj2;
                    if (!istkbnxepwVar.ppxfxbqfkf()) {
                        wwaezpbzkn(obj, obj2);
                    }
                    if (obj2 instanceof kcexrzcfyt) {
                        if (!(obj2 instanceof istkbnxepw)) {
                            istkbnxepwVar = null;
                        }
                        Throwable th2 = istkbnxepwVar != null ? istkbnxepwVar.f76725iobyxmoadg : null;
                        if (obj instanceof wflxmlrfwp) {
                            btonecajqb((wflxmlrfwp) obj, th2);
                            return;
                        } else {
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            draadjrbmk((uj.lereixgezr) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof zynmafqrjb) {
                    zynmafqrjb zynmafqrjbVar = (zynmafqrjb) obj2;
                    if (zynmafqrjbVar.f76812zoijcleaow != null) {
                        wwaezpbzkn(obj, obj2);
                    }
                    if (obj instanceof uj.lereixgezr) {
                        return;
                    }
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
                    if (zynmafqrjbVar.ppxfxbqfkf()) {
                        btonecajqb(wflxmlrfwpVar, zynmafqrjbVar.f76808eablkybsjg);
                        return;
                    } else {
                        if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj2, zynmafqrjb.zoijcleaow(zynmafqrjbVar, null, wflxmlrfwpVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof uj.lereixgezr) {
                        return;
                    }
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj2, new zynmafqrjb(obj2, (wflxmlrfwp) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final String jyumaefscl() {
        Object objYggfygwlhe = yggfygwlhe();
        if (objYggfygwlhe instanceof mhtqkkgtqm) {
            return "Active";
        }
        return objYggfygwlhe instanceof kcexrzcfyt ? "Cancelled" : "Completed";
    }

    private final jztzpxfvev kcexrzcfyt() {
        return (jztzpxfvev) f76764pmvmpeiblj.get(this);
    }

    private final Object mbcevpiqjq(mhtqkkgtqm mhtqkkgtqmVar, Object obj, int i13, tg.vdvldrhtss vdvldrhtssVar, Object obj2) {
        if (obj instanceof istkbnxepw) {
            return obj;
        }
        if (!vipkmwdibw.zoijcleaow(i13) && obj2 == null) {
            return obj;
        }
        if (vdvldrhtssVar == null && !(mhtqkkgtqmVar instanceof wflxmlrfwp) && obj2 == null) {
            return obj;
        }
        return new zynmafqrjb(obj, mhtqkkgtqmVar instanceof wflxmlrfwp ? (wflxmlrfwp) mhtqkkgtqmVar : null, vdvldrhtssVar, obj2, null, 16, null);
    }

    private final boolean ntlheqmsrt() {
        int i13;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76762esjtqupxsv;
        do {
            i13 = atomicIntegerFieldUpdater.get(this);
            int i14 = i13 >> 29;
            if (i14 != 0) {
                if (i14 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f76762esjtqupxsv.compareAndSet(this, i13, 1073741824 + (536870911 & i13)));
        return true;
    }

    private final jztzpxfvev pmvmpeiblj() {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) getContext().get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar == null) {
            return null;
        }
        jztzpxfvev jztzpxfvevVarWflxmlrfwp = skhdrjzrfn.wflxmlrfwp(auzgnhcxokVar, false, new zdlpuopuiu(this), 1, null);
        androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76764pmvmpeiblj, this, null, jztzpxfvevVarWflxmlrfwp);
        return jztzpxfvevVarWflxmlrfwp;
    }

    private final void rgvfuqvkyq() {
        if (iozdgvuglv()) {
            return;
        }
        ojitshcjhn();
    }

    private final boolean sopmlzcsov() {
        int i13;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76762esjtqupxsv;
        do {
            i13 = atomicIntegerFieldUpdater.get(this);
            int i14 = i13 >> 29;
            if (i14 != 0) {
                if (i14 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f76762esjtqupxsv.compareAndSet(this, i13, 536870912 + (536870911 & i13)));
        return true;
    }

    public static /* synthetic */ void tzroggbefp(rgvfuqvkyq rgvfuqvkyqVar, Object obj, int i13, tg.vdvldrhtss vdvldrhtssVar, int i14, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i14 & 4) != 0) {
            vdvldrhtssVar = null;
        }
        rgvfuqvkyqVar.kegysxyocb(obj, i13, vdvldrhtssVar);
    }

    private final uj.istkbnxepw ulzqkzuiru(Object obj, Object obj2, tg.vdvldrhtss vdvldrhtssVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76763lereixgezr;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof mhtqkkgtqm)) {
                if ((obj3 instanceof zynmafqrjb) && obj2 != null && ((zynmafqrjb) obj3).f76811wkgbmnqykc == obj2) {
                    return vdvldrhtss.f76788iobyxmoadg;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj3, mbcevpiqjq((mhtqkkgtqm) obj3, obj, this.f76767jyumaefscl, vdvldrhtssVar, obj2)));
        rgvfuqvkyq();
        return vdvldrhtss.f76788iobyxmoadg;
    }

    private final void vdvldrhtss(int i13) {
        if (ntlheqmsrt()) {
            return;
        }
        vipkmwdibw.iobyxmoadg(this, i13);
    }

    private final boolean wflxmlrfwp(Throwable th2) {
        if (!iozdgvuglv()) {
            return false;
        }
        lg.gxszxtbevo gxszxtbevoVar = this.f76766iwizpuwonk;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((uj.lqeggnwhkg) gxszxtbevoVar).ojitshcjhn(th2);
    }

    private final void wwaezpbzkn(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wypolnanlu(tg.draadjrbmk draadjrbmkVar, Throwable th2, Object obj, lg.btonecajqb btonecajqbVar) {
        draadjrbmkVar.invoke(th2);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // pj.agtfadlqog
    public boolean agtfadlqog() {
        return !(yggfygwlhe() instanceof mhtqkkgtqm);
    }

    public final void btonecajqb(wflxmlrfwp wflxmlrfwpVar, Throwable th2) {
        try {
            wflxmlrfwpVar.ppxfxbqfkf(th2);
        } catch (Throwable th3) {
            jpowsppfya.iobyxmoadg(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // pj.agtfadlqog
    public void cdpycssgdh(pkzmftpjix pkzmftpjixVar, Object obj) {
        lg.gxszxtbevo gxszxtbevoVar = this.f76766iwizpuwonk;
        uj.lqeggnwhkg lqeggnwhkgVar = gxszxtbevoVar instanceof uj.lqeggnwhkg ? (uj.lqeggnwhkg) gxszxtbevoVar : null;
        tzroggbefp(this, obj, (lqeggnwhkgVar != null ? lqeggnwhkgVar.f113656iwizpuwonk : null) == pkzmftpjixVar ? 4 : this.f76767jyumaefscl, null, 4, null);
    }

    @Override // pj.agtfadlqog
    public void cllcsxoeiz(Object obj, final tg.draadjrbmk draadjrbmkVar) {
        kegysxyocb(obj, this.f76767jyumaefscl, draadjrbmkVar != null ? new tg.vdvldrhtss() { // from class: pj.ojitshcjhn
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return rgvfuqvkyq.wypolnanlu(draadjrbmkVar, (Throwable) obj2, obj3, (lg.btonecajqb) obj4);
            }
        } : null);
    }

    @Override // pj.agtfadlqog
    public void dsvhmnatus(Object obj, tg.vdvldrhtss vdvldrhtssVar) {
        kegysxyocb(obj, this.f76767jyumaefscl, vdvldrhtssVar);
    }

    @Override // pj.j
    public void eablkybsjg(uj.lereixgezr lereixgezrVar, int i13) {
        int i14;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f76762esjtqupxsv;
        do {
            i14 = atomicIntegerFieldUpdater.get(this);
            if ((i14 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, ((i14 >> 29) << 29) + i13));
        istkbnxepw(lereixgezrVar);
    }

    @Override // kotlin.coroutines.jvm.internal.eablkybsjg
    public kotlin.coroutines.jvm.internal.eablkybsjg getCallerFrame() {
        lg.gxszxtbevo gxszxtbevoVar = this.f76766iwizpuwonk;
        if (gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) {
            return (kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        return this.f76765cqumvgiudr;
    }

    public final void gtknphoqwx(tg.vdvldrhtss vdvldrhtssVar, Throwable th2, Object obj) {
        try {
            vdvldrhtssVar.invoke(th2, obj, getContext());
        } catch (Throwable th3) {
            jpowsppfya.iobyxmoadg(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void hcddaimhww() {
        Throwable thVdvldrhtss;
        lg.gxszxtbevo gxszxtbevoVar = this.f76766iwizpuwonk;
        uj.lqeggnwhkg lqeggnwhkgVar = gxszxtbevoVar instanceof uj.lqeggnwhkg ? (uj.lqeggnwhkg) gxszxtbevoVar : null;
        if (lqeggnwhkgVar == null || (thVdvldrhtss = lqeggnwhkgVar.vdvldrhtss(this)) == null) {
            return;
        }
        ojitshcjhn();
        hkdspvbjdz(thVdvldrhtss);
    }

    @Override // pj.agtfadlqog
    public boolean hkdspvbjdz(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76763lereixgezr;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof mhtqkkgtqm)) {
                return false;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj, new kcexrzcfyt(this, th2, (obj instanceof wflxmlrfwp) || (obj instanceof uj.lereixgezr))));
        mhtqkkgtqm mhtqkkgtqmVar = (mhtqkkgtqm) obj;
        if (mhtqkkgtqmVar instanceof wflxmlrfwp) {
            btonecajqb((wflxmlrfwp) obj, th2);
        } else if (mhtqkkgtqmVar instanceof uj.lereixgezr) {
            draadjrbmk((uj.lereixgezr) obj, th2);
        }
        rgvfuqvkyq();
        vdvldrhtss(this.f76767jyumaefscl);
        return true;
    }

    @Override // pj.ribwqtqdhb
    public void iobyxmoadg(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76763lereixgezr;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof mhtqkkgtqm) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof istkbnxepw) {
                return;
            }
            if (obj2 instanceof zynmafqrjb) {
                zynmafqrjb zynmafqrjbVar = (zynmafqrjb) obj2;
                if (zynmafqrjbVar.ppxfxbqfkf()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj2, zynmafqrjb.zoijcleaow(zynmafqrjbVar, null, null, null, null, th2, 15, null))) {
                    zynmafqrjbVar.wkgbmnqykc(this, th2);
                    return;
                }
            } else if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj2, new zynmafqrjb(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // pj.agtfadlqog
    public boolean isActive() {
        return yggfygwlhe() instanceof mhtqkkgtqm;
    }

    public final boolean jpowsppfya() {
        Object obj = f76763lereixgezr.get(this);
        if ((obj instanceof zynmafqrjb) && ((zynmafqrjb) obj).f76811wkgbmnqykc != null) {
            ojitshcjhn();
            return false;
        }
        f76762esjtqupxsv.set(this, 536870911);
        f76763lereixgezr.set(this, wkgbmnqykc.f76798zdlpuopuiu);
        return true;
    }

    public final void kegysxyocb(Object obj, int i13, tg.vdvldrhtss vdvldrhtssVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f76763lereixgezr;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof mhtqkkgtqm)) {
                if (obj2 instanceof kcexrzcfyt) {
                    kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj2;
                    if (kcexrzcfytVar.eablkybsjg()) {
                        if (vdvldrhtssVar != null) {
                            gtknphoqwx(vdvldrhtssVar, kcexrzcfytVar.f76725iobyxmoadg, obj);
                            return;
                        }
                        return;
                    }
                }
                dxjokdxxww(obj);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76763lereixgezr, this, obj2, mbcevpiqjq((mhtqkkgtqm) obj2, obj, i13, vdvldrhtssVar, null)));
        rgvfuqvkyq();
        vdvldrhtss(i13);
    }

    public void lereixgezr() {
        jztzpxfvev jztzpxfvevVarPmvmpeiblj = pmvmpeiblj();
        if (jztzpxfvevVarPmvmpeiblj != null && agtfadlqog()) {
            jztzpxfvevVarPmvmpeiblj.iobyxmoadg();
            f76764pmvmpeiblj.set(this, grlcpdaxtj.f76704zdlpuopuiu);
        }
    }

    @Override // pj.agtfadlqog
    public Object lmojexxdyd(Throwable th2) {
        return ulzqkzuiru(new istkbnxepw(th2, false, 2, null), null, null);
    }

    @Override // pj.ribwqtqdhb
    public Object lqeggnwhkg() {
        return yggfygwlhe();
    }

    @Override // pj.agtfadlqog
    public void metgxyhuhe(Object obj) {
        vdvldrhtss(this.f76767jyumaefscl);
    }

    public final void ojitshcjhn() {
        jztzpxfvev jztzpxfvevVarKcexrzcfyt = kcexrzcfyt();
        if (jztzpxfvevVarKcexrzcfyt == null) {
            return;
        }
        jztzpxfvevVarKcexrzcfyt.iobyxmoadg();
        f76764pmvmpeiblj.set(this, grlcpdaxtj.f76704zdlpuopuiu);
    }

    public Throwable oxmwwwfdhm(auzgnhcxok auzgnhcxokVar) {
        return auzgnhcxokVar.vdvldrhtss();
    }

    public final void pkzmftpjix(Throwable th2) {
        if (wflxmlrfwp(th2)) {
            return;
        }
        hkdspvbjdz(th2);
        rgvfuqvkyq();
    }

    @Override // pj.ribwqtqdhb
    public Throwable ppxfxbqfkf(Object obj) {
        Throwable thPpxfxbqfkf = super.ppxfxbqfkf(obj);
        if (thPpxfxbqfkf != null) {
            return thPpxfxbqfkf;
        }
        return null;
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        tzroggbefp(this, cdpycssgdh.ppxfxbqfkf(obj, this), this.f76767jyumaefscl, null, 4, null);
    }

    @Override // pj.agtfadlqog
    public void stevsuqkhv(tg.draadjrbmk draadjrbmkVar) {
        oxmwwwfdhm.ppxfxbqfkf(this, new wflxmlrfwp.iobyxmoadg(draadjrbmkVar));
    }

    public String toString() {
        return ylkuphrtab() + '(' + kegysxyocb.ppxfxbqfkf(this.f76766iwizpuwonk) + "){" + jyumaefscl() + "}@" + kegysxyocb.zoijcleaow(this);
    }

    @Override // pj.ribwqtqdhb
    public Object wkgbmnqykc(Object obj) {
        return obj instanceof zynmafqrjb ? ((zynmafqrjb) obj).f76809iobyxmoadg : obj;
    }

    public final void yadqdtsiqt(wflxmlrfwp wflxmlrfwpVar) {
        istkbnxepw(wflxmlrfwpVar);
    }

    public final Object yggfygwlhe() {
        return f76763lereixgezr.get(this);
    }

    protected String ylkuphrtab() {
        return "CancellableContinuation";
    }

    public final Object zdlpuopuiu() {
        auzgnhcxok auzgnhcxokVar;
        boolean zIozdgvuglv = iozdgvuglv();
        if (sopmlzcsov()) {
            if (kcexrzcfyt() == null) {
                pmvmpeiblj();
            }
            if (zIozdgvuglv) {
                hcddaimhww();
            }
            return mg.zoijcleaow.gxszxtbevo();
        }
        if (zIozdgvuglv) {
            hcddaimhww();
        }
        Object objYggfygwlhe = yggfygwlhe();
        if (objYggfygwlhe instanceof istkbnxepw) {
            throw ((istkbnxepw) objYggfygwlhe).f76725iobyxmoadg;
        }
        if (!vipkmwdibw.zoijcleaow(this.f76767jyumaefscl) || (auzgnhcxokVar = (auzgnhcxok) getContext().get(auzgnhcxok.f76671gtknphoqwx)) == null || auzgnhcxokVar.isActive()) {
            return wkgbmnqykc(objYggfygwlhe);
        }
        CancellationException cancellationExceptionVdvldrhtss = auzgnhcxokVar.vdvldrhtss();
        iobyxmoadg(objYggfygwlhe, cancellationExceptionVdvldrhtss);
        throw cancellationExceptionVdvldrhtss;
    }

    @Override // pj.ribwqtqdhb
    public final lg.gxszxtbevo zoijcleaow() {
        return this.f76766iwizpuwonk;
    }

    @Override // pj.agtfadlqog
    public Object zynmafqrjb(Object obj, Object obj2, tg.vdvldrhtss vdvldrhtssVar) {
        return ulzqkzuiru(obj, obj2, vdvldrhtssVar);
    }
}
