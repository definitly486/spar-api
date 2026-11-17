package pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public class lxfrhoxuzk implements auzgnhcxok, iwizpuwonk, ixidwrxhsl {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76738zdlpuopuiu = AtomicReferenceFieldUpdater.newUpdater(lxfrhoxuzk.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f76737yggfygwlhe = AtomicReferenceFieldUpdater.newUpdater(lxfrhoxuzk.class, Object.class, "_parentHandle$volatile");

    private static final class iobyxmoadg extends rgvfuqvkyq {

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private final lxfrhoxuzk f76739zynmafqrjb;

        public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, lxfrhoxuzk lxfrhoxuzkVar) {
            super(gxszxtbevoVar, 1);
            this.f76739zynmafqrjb = lxfrhoxuzkVar;
        }

        @Override // pj.rgvfuqvkyq
        public Throwable oxmwwwfdhm(auzgnhcxok auzgnhcxokVar) {
            Throwable thEablkybsjg;
            Object objYfnezrywwk = this.f76739zynmafqrjb.yfnezrywwk();
            if (!(objYfnezrywwk instanceof ppxfxbqfkf) || (thEablkybsjg = ((ppxfxbqfkf) objYfnezrywwk).eablkybsjg()) == null) {
                return objYfnezrywwk instanceof istkbnxepw ? ((istkbnxepw) objYfnezrywwk).f76725iobyxmoadg : auzgnhcxokVar.vdvldrhtss();
            }
            return thEablkybsjg;
        }

        @Override // pj.rgvfuqvkyq
        protected String ylkuphrtab() {
            return "AwaitContinuation";
        }
    }

    private static final class ppxfxbqfkf implements zeieaojujs {
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final fyldjkxazc f76743zdlpuopuiu;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f76742yggfygwlhe = AtomicIntegerFieldUpdater.newUpdater(ppxfxbqfkf.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f76741jyumaefscl = AtomicReferenceFieldUpdater.newUpdater(ppxfxbqfkf.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f76740iwizpuwonk = AtomicReferenceFieldUpdater.newUpdater(ppxfxbqfkf.class, Object.class, "_exceptionsHolder$volatile");

        public ppxfxbqfkf(fyldjkxazc fyldjkxazcVar, boolean z13, Throwable th2) {
            this.f76743zdlpuopuiu = fyldjkxazcVar;
            this._isCompleting$volatile = z13 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final void agtfadlqog(Object obj) {
            f76740iwizpuwonk.set(this, obj);
        }

        private final Object wkgbmnqykc() {
            return f76740iwizpuwonk.get(this);
        }

        private final ArrayList zoijcleaow() {
            return new ArrayList(4);
        }

        public final boolean btonecajqb() {
            return f76742yggfygwlhe.get(this) != 0;
        }

        public final List draadjrbmk(Throwable th2) {
            ArrayList arrayListZoijcleaow;
            Object objWkgbmnqykc = wkgbmnqykc();
            if (objWkgbmnqykc == null) {
                arrayListZoijcleaow = zoijcleaow();
            } else if (objWkgbmnqykc instanceof Throwable) {
                ArrayList arrayListZoijcleaow2 = zoijcleaow();
                arrayListZoijcleaow2.add(objWkgbmnqykc);
                arrayListZoijcleaow = arrayListZoijcleaow2;
            } else {
                if (!(objWkgbmnqykc instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objWkgbmnqykc).toString());
                }
                arrayListZoijcleaow = (ArrayList) objWkgbmnqykc;
            }
            Throwable thEablkybsjg = eablkybsjg();
            if (thEablkybsjg != null) {
                arrayListZoijcleaow.add(0, thEablkybsjg);
            }
            if (th2 != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(th2, thEablkybsjg)) {
                arrayListZoijcleaow.add(th2);
            }
            agtfadlqog(wizcaqwiak.f76791eablkybsjg);
            return arrayListZoijcleaow;
        }

        public final boolean dxjokdxxww() {
            return eablkybsjg() != null;
        }

        public final Throwable eablkybsjg() {
            return (Throwable) f76741jyumaefscl.get(this);
        }

        public final boolean gtknphoqwx() {
            return wkgbmnqykc() == wizcaqwiak.f76791eablkybsjg;
        }

        public final void iobyxmoadg(Throwable th2) {
            Throwable thEablkybsjg = eablkybsjg();
            if (thEablkybsjg == null) {
                ojitshcjhn(th2);
                return;
            }
            if (th2 == thEablkybsjg) {
                return;
            }
            Object objWkgbmnqykc = wkgbmnqykc();
            if (objWkgbmnqykc == null) {
                agtfadlqog(th2);
                return;
            }
            if (objWkgbmnqykc instanceof Throwable) {
                if (th2 == objWkgbmnqykc) {
                    return;
                }
                ArrayList arrayListZoijcleaow = zoijcleaow();
                arrayListZoijcleaow.add(objWkgbmnqykc);
                arrayListZoijcleaow.add(th2);
                agtfadlqog(arrayListZoijcleaow);
                return;
            }
            if (objWkgbmnqykc instanceof ArrayList) {
                ((ArrayList) objWkgbmnqykc).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objWkgbmnqykc).toString());
        }

        @Override // pj.zeieaojujs
        public boolean isActive() {
            return eablkybsjg() == null;
        }

        public final void ojitshcjhn(Throwable th2) {
            f76741jyumaefscl.set(this, th2);
        }

        @Override // pj.zeieaojujs
        public fyldjkxazc ppxfxbqfkf() {
            return this.f76743zdlpuopuiu;
        }

        public String toString() {
            return "Finishing[cancelling=" + dxjokdxxww() + ", completing=" + btonecajqb() + ", rootCause=" + eablkybsjg() + ", exceptions=" + wkgbmnqykc() + ", list=" + ppxfxbqfkf() + ']';
        }

        public final void wflxmlrfwp(boolean z13) {
            f76742yggfygwlhe.set(this, z13 ? 1 : 0);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f76744cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f76746iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f76747jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f76748yggfygwlhe;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            wkgbmnqykc wkgbmnqykcVar = lxfrhoxuzk.this.new wkgbmnqykc(gxszxtbevoVar);
            wkgbmnqykcVar.f76744cqumvgiudr = obj;
            return wkgbmnqykcVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:24:0x006d  */
        /* JADX WARN: Code duplicated, block: B:26:0x0080 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r6.f76746iwizpuwonk
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f76747jyumaefscl
                uj.agtfadlqog r1 = (uj.agtfadlqog) r1
                java.lang.Object r3 = r6.f76748yggfygwlhe
                uj.wflxmlrfwp r3 = (uj.wflxmlrfwp) r3
                java.lang.Object r4 = r6.f76744cqumvgiudr
                lj.draadjrbmk r4 = (lj.draadjrbmk) r4
                gg.zdlpuopuiu.zoijcleaow(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                gg.zdlpuopuiu.zoijcleaow(r7)
                goto L86
            L2a:
                gg.zdlpuopuiu.zoijcleaow(r7)
                java.lang.Object r7 = r6.f76744cqumvgiudr
                lj.draadjrbmk r7 = (lj.draadjrbmk) r7
                pj.lxfrhoxuzk r1 = pj.lxfrhoxuzk.this
                java.lang.Object r1 = r1.yfnezrywwk()
                boolean r4 = r1 instanceof pj.jyumaefscl
                if (r4 == 0) goto L48
                pj.jyumaefscl r1 = (pj.jyumaefscl) r1
                pj.iwizpuwonk r1 = r1.f76730cqumvgiudr
                r6.f76746iwizpuwonk = r3
                java.lang.Object r7 = r7.iobyxmoadg(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof pj.zeieaojujs
                if (r3 == 0) goto L86
                pj.zeieaojujs r1 = (pj.zeieaojujs) r1
                pj.fyldjkxazc r1 = r1.ppxfxbqfkf()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.gtknphoqwx()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(r3, r4)
                uj.agtfadlqog r3 = (uj.agtfadlqog) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof pj.jyumaefscl
                if (r7 == 0) goto L81
                r7 = r1
                pj.jyumaefscl r7 = (pj.jyumaefscl) r7
                pj.iwizpuwonk r7 = r7.f76730cqumvgiudr
                r6.f76744cqumvgiudr = r4
                r6.f76748yggfygwlhe = r3
                r6.f76747jyumaefscl = r1
                r6.f76746iwizpuwonk = r2
                java.lang.Object r7 = r4.iobyxmoadg(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                uj.agtfadlqog r1 = r1.draadjrbmk()
                goto L63
            L86:
                gg.wwaezpbzkn r7 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pj.lxfrhoxuzk.wkgbmnqykc.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static final class zoijcleaow extends igdgnonuha {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final lxfrhoxuzk f76749cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final ppxfxbqfkf f76750esjtqupxsv;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private final jyumaefscl f76751lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private final Object f76752pmvmpeiblj;

        public zoijcleaow(lxfrhoxuzk lxfrhoxuzkVar, ppxfxbqfkf ppxfxbqfkfVar, jyumaefscl jyumaefsclVar, Object obj) {
            this.f76749cqumvgiudr = lxfrhoxuzkVar;
            this.f76750esjtqupxsv = ppxfxbqfkfVar;
            this.f76751lereixgezr = jyumaefsclVar;
            this.f76752pmvmpeiblj = obj;
        }

        @Override // pj.igdgnonuha
        public void iwizpuwonk(Throwable th2) {
            this.f76749cqumvgiudr.jlmebxxoox(this.f76750esjtqupxsv, this.f76751lereixgezr, this.f76752pmvmpeiblj);
        }

        @Override // pj.igdgnonuha
        public boolean jyumaefscl() {
            return false;
        }
    }

    public lxfrhoxuzk(boolean z13) {
        this._state$volatile = z13 ? wizcaqwiak.f76794lqeggnwhkg : wizcaqwiak.f76792gxszxtbevo;
    }

    private final int ageimvtcrz(Object obj) {
        if (obj instanceof rlfsiqarku) {
            if (((rlfsiqarku) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, obj, wizcaqwiak.f76794lqeggnwhkg)) {
                return -1;
            }
            igdgnonuha();
            return 1;
        }
        if (!(obj instanceof lrnfpwlwnk)) {
            return 0;
        }
        if (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, obj, ((lrnfpwlwnk) obj).ppxfxbqfkf())) {
            return -1;
        }
        igdgnonuha();
        return 1;
    }

    private final void auzgnhcxok(fyldjkxazc fyldjkxazcVar, Throwable th2) throws Throwable {
        dvvnrvtcbc(th2);
        fyldjkxazcVar.lqeggnwhkg(4);
        Object objGtknphoqwx = fyldjkxazcVar.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objGtknphoqwx, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (uj.agtfadlqog agtfadlqogVarDraadjrbmk = (uj.agtfadlqog) objGtknphoqwx; !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(agtfadlqogVarDraadjrbmk, fyldjkxazcVar); agtfadlqogVarDraadjrbmk = agtfadlqogVarDraadjrbmk.draadjrbmk()) {
            if ((agtfadlqogVarDraadjrbmk instanceof igdgnonuha) && ((igdgnonuha) agtfadlqogVarDraadjrbmk).jyumaefscl()) {
                try {
                    ((igdgnonuha) agtfadlqogVarDraadjrbmk).iwizpuwonk(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        gg.lqeggnwhkg.iobyxmoadg(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + agtfadlqogVarDraadjrbmk + " for " + this, th3);
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            oipsdeybqn(completionHandlerException);
        }
        ntlheqmsrt(th2);
    }

    private final void crxdokpmqz(zeieaojujs zeieaojujsVar, Object obj) throws Throwable {
        yggfygwlhe yggfygwlheVarUwvvkdfqfp = uwvvkdfqfp();
        if (yggfygwlheVarUwvvkdfqfp != null) {
            yggfygwlheVarUwvvkdfqfp.iobyxmoadg();
            fiwbwshyhd(grlcpdaxtj.f76704zdlpuopuiu);
        }
        istkbnxepw istkbnxepwVar = obj instanceof istkbnxepw ? (istkbnxepw) obj : null;
        Throwable th2 = istkbnxepwVar != null ? istkbnxepwVar.f76725iobyxmoadg : null;
        if (!(zeieaojujsVar instanceof igdgnonuha)) {
            fyldjkxazc fyldjkxazcVarPpxfxbqfkf = zeieaojujsVar.ppxfxbqfkf();
            if (fyldjkxazcVarPpxfxbqfkf != null) {
                iwxlajgraz(fyldjkxazcVarPpxfxbqfkf, th2);
                return;
            }
            return;
        }
        try {
            ((igdgnonuha) zeieaojujsVar).iwizpuwonk(th2);
        } catch (Throwable th3) {
            oipsdeybqn(new CompletionHandlerException("Exception in completion handler " + zeieaojujsVar + " for " + this, th3));
        }
    }

    private final void esjtqupxsv(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                gg.lqeggnwhkg.iobyxmoadg(th2, th3);
            }
        }
    }

    private final Object ezmngbhpjk(zeieaojujs zeieaojujsVar, Object obj) throws Throwable {
        fyldjkxazc fyldjkxazcVarRlfsiqarku = rlfsiqarku(zeieaojujsVar);
        if (fyldjkxazcVarRlfsiqarku == null) {
            return wizcaqwiak.f76795ppxfxbqfkf;
        }
        ppxfxbqfkf ppxfxbqfkfVar = zeieaojujsVar instanceof ppxfxbqfkf ? (ppxfxbqfkf) zeieaojujsVar : null;
        if (ppxfxbqfkfVar == null) {
            ppxfxbqfkfVar = new ppxfxbqfkf(fyldjkxazcVarRlfsiqarku, false, null);
        }
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        synchronized (ppxfxbqfkfVar) {
            if (ppxfxbqfkfVar.btonecajqb()) {
                return wizcaqwiak.f76793iobyxmoadg;
            }
            ppxfxbqfkfVar.wflxmlrfwp(true);
            if (ppxfxbqfkfVar != zeieaojujsVar && !androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, zeieaojujsVar, ppxfxbqfkfVar)) {
                return wizcaqwiak.f76795ppxfxbqfkf;
            }
            boolean zDxjokdxxww = ppxfxbqfkfVar.dxjokdxxww();
            istkbnxepw istkbnxepwVar = obj instanceof istkbnxepw ? (istkbnxepw) obj : null;
            if (istkbnxepwVar != null) {
                ppxfxbqfkfVar.iobyxmoadg(istkbnxepwVar.f76725iobyxmoadg);
            }
            Throwable thEablkybsjg = zDxjokdxxww ? null : ppxfxbqfkfVar.eablkybsjg();
            hkdspvbjdzVar.f60015zdlpuopuiu = thEablkybsjg;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            if (thEablkybsjg != null) {
                auzgnhcxok(fyldjkxazcVarRlfsiqarku, thEablkybsjg);
            }
            jyumaefscl jyumaefsclVarUawqvzlxes = uawqvzlxes(fyldjkxazcVarRlfsiqarku);
            if (jyumaefsclVarUawqvzlxes != null && rhgxfdycjh(ppxfxbqfkfVar, jyumaefsclVarUawqvzlxes, obj)) {
                return wizcaqwiak.f76797zoijcleaow;
            }
            fyldjkxazcVarRlfsiqarku.lqeggnwhkg(2);
            jyumaefscl jyumaefsclVarUawqvzlxes2 = uawqvzlxes(fyldjkxazcVarRlfsiqarku);
            return (jyumaefsclVarUawqvzlxes2 == null || !rhgxfdycjh(ppxfxbqfkfVar, jyumaefsclVarUawqvzlxes2, obj)) ? vipkmwdibw(ppxfxbqfkfVar, obj) : wizcaqwiak.f76797zoijcleaow;
        }
    }

    private final Object fmlbqenlif(Object obj, Object obj2) {
        if (!(obj instanceof zeieaojujs)) {
            return wizcaqwiak.f76793iobyxmoadg;
        }
        if ((!(obj instanceof rlfsiqarku) && !(obj instanceof igdgnonuha)) || (obj instanceof jyumaefscl) || (obj2 instanceof istkbnxepw)) {
            return ezmngbhpjk((zeieaojujs) obj, obj2);
        }
        return ixidwrxhsl((zeieaojujs) obj, obj2) ? obj2 : wizcaqwiak.f76795ppxfxbqfkf;
    }

    private final String fyldjkxazc(Object obj) {
        if (!(obj instanceof ppxfxbqfkf)) {
            if (obj instanceof zeieaojujs) {
                return ((zeieaojujs) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof istkbnxepw ? "Cancelled" : "Completed";
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        if (ppxfxbqfkfVar.dxjokdxxww()) {
            return "Cancelling";
        }
        return ppxfxbqfkfVar.btonecajqb() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException grlcpdaxtj(lxfrhoxuzk lxfrhoxuzkVar, Throwable th2, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        return lxfrhoxuzkVar.ipoelvxyzq(th2, str);
    }

    private final Throwable ikoacuggdj(Object obj) {
        istkbnxepw istkbnxepwVar = obj instanceof istkbnxepw ? (istkbnxepw) obj : null;
        if (istkbnxepwVar != null) {
            return istkbnxepwVar.f76725iobyxmoadg;
        }
        return null;
    }

    private final void iwxlajgraz(fyldjkxazc fyldjkxazcVar, Throwable th2) throws Throwable {
        fyldjkxazcVar.lqeggnwhkg(1);
        Object objGtknphoqwx = fyldjkxazcVar.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objGtknphoqwx, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (uj.agtfadlqog agtfadlqogVarDraadjrbmk = (uj.agtfadlqog) objGtknphoqwx; !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(agtfadlqogVarDraadjrbmk, fyldjkxazcVar); agtfadlqogVarDraadjrbmk = agtfadlqogVarDraadjrbmk.draadjrbmk()) {
            if (agtfadlqogVarDraadjrbmk instanceof igdgnonuha) {
                try {
                    ((igdgnonuha) agtfadlqogVarDraadjrbmk).iwizpuwonk(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        gg.lqeggnwhkg.iobyxmoadg(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + agtfadlqogVarDraadjrbmk + " for " + this, th3);
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            oipsdeybqn(completionHandlerException);
        }
    }

    private final boolean ixidwrxhsl(zeieaojujs zeieaojujsVar, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, zeieaojujsVar, wizcaqwiak.lqeggnwhkg(obj))) {
            return false;
        }
        dvvnrvtcbc(null);
        skhdrjzrfn(obj);
        crxdokpmqz(zeieaojujsVar, obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jlmebxxoox(ppxfxbqfkf ppxfxbqfkfVar, jyumaefscl jyumaefsclVar, Object obj) {
        jyumaefscl jyumaefsclVarUawqvzlxes = uawqvzlxes(jyumaefsclVar);
        if (jyumaefsclVarUawqvzlxes == null || !rhgxfdycjh(ppxfxbqfkfVar, jyumaefsclVarUawqvzlxes, obj)) {
            ppxfxbqfkfVar.ppxfxbqfkf().lqeggnwhkg(2);
            jyumaefscl jyumaefsclVarUawqvzlxes2 = uawqvzlxes(jyumaefsclVar);
            if (jyumaefsclVarUawqvzlxes2 == null || !rhgxfdycjh(ppxfxbqfkfVar, jyumaefsclVarUawqvzlxes2, obj)) {
                yadqdtsiqt(vipkmwdibw(ppxfxbqfkfVar, obj));
            }
        }
    }

    private final boolean jrbgnlbqoe(zeieaojujs zeieaojujsVar, Throwable th2) throws Throwable {
        fyldjkxazc fyldjkxazcVarRlfsiqarku = rlfsiqarku(zeieaojujsVar);
        if (fyldjkxazcVarRlfsiqarku == null) {
            return false;
        }
        if (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, zeieaojujsVar, new ppxfxbqfkf(fyldjkxazcVarRlfsiqarku, false, th2))) {
            return false;
        }
        auzgnhcxok(fyldjkxazcVarRlfsiqarku, th2);
        return true;
    }

    private final Object lrnfpwlwnk(lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        oxmwwwfdhm.iobyxmoadg(rgvfuqvkyqVar, skhdrjzrfn.wflxmlrfwp(this, false, new fmlbqenlif(rgvfuqvkyqVar), 1, null));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void lxfrhoxuzk(rlfsiqarku rlfsiqarkuVar) {
        fyldjkxazc fyldjkxazcVar = new fyldjkxazc();
        Object lrnfpwlwnkVar = fyldjkxazcVar;
        if (!rlfsiqarkuVar.isActive()) {
            lrnfpwlwnkVar = new lrnfpwlwnk(fyldjkxazcVar);
        }
        androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, rlfsiqarkuVar, lrnfpwlwnkVar);
    }

    private final boolean ntlheqmsrt(Throwable th2) {
        if (iyctptxqzt()) {
            return true;
        }
        boolean z13 = th2 instanceof CancellationException;
        yggfygwlhe yggfygwlheVarUwvvkdfqfp = uwvvkdfqfp();
        if (yggfygwlheVarUwvvkdfqfp == null || yggfygwlheVarUwvvkdfqfp == grlcpdaxtj.f76704zdlpuopuiu) {
            return z13;
        }
        return yggfygwlheVarUwvvkdfqfp.zoijcleaow(th2) || z13;
    }

    private final Throwable okpsazkaxt(ppxfxbqfkf ppxfxbqfkfVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (ppxfxbqfkfVar.dxjokdxxww()) {
                return new JobCancellationException(ulzqkzuiru(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            for (Object obj2 : list) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final boolean rhgxfdycjh(ppxfxbqfkf ppxfxbqfkfVar, jyumaefscl jyumaefsclVar, Object obj) {
        while (dvvnrvtcbc.draadjrbmk(jyumaefsclVar.f76730cqumvgiudr, false, new zoijcleaow(this, ppxfxbqfkfVar, jyumaefsclVar, obj)) == grlcpdaxtj.f76704zdlpuopuiu) {
            jyumaefsclVar = uawqvzlxes(jyumaefsclVar);
            if (jyumaefsclVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable ribwqtqdhb(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(ulzqkzuiru(), null, this) : th2;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ixidwrxhsl) obj).lereixgezr();
    }

    private final fyldjkxazc rlfsiqarku(zeieaojujs zeieaojujsVar) {
        fyldjkxazc fyldjkxazcVarPpxfxbqfkf = zeieaojujsVar.ppxfxbqfkf();
        if (fyldjkxazcVarPpxfxbqfkf != null) {
            return fyldjkxazcVarPpxfxbqfkf;
        }
        if (zeieaojujsVar instanceof rlfsiqarku) {
            return new fyldjkxazc();
        }
        if (zeieaojujsVar instanceof igdgnonuha) {
            wizcaqwiak((igdgnonuha) zeieaojujsVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + zeieaojujsVar).toString());
    }

    private final Object tzroggbefp(Object obj) {
        Object objFmlbqenlif;
        do {
            Object objYfnezrywwk = yfnezrywwk();
            if (!(objYfnezrywwk instanceof zeieaojujs) || ((objYfnezrywwk instanceof ppxfxbqfkf) && ((ppxfxbqfkf) objYfnezrywwk).btonecajqb())) {
                return wizcaqwiak.f76793iobyxmoadg;
            }
            objFmlbqenlif = fmlbqenlif(objYfnezrywwk, new istkbnxepw(ribwqtqdhb(obj), false, 2, null));
        } while (objFmlbqenlif == wizcaqwiak.f76795ppxfxbqfkf);
        return objFmlbqenlif;
    }

    private final jyumaefscl uawqvzlxes(uj.agtfadlqog agtfadlqogVar) {
        while (agtfadlqogVar.vdvldrhtss()) {
            agtfadlqogVar = agtfadlqogVar.wflxmlrfwp();
        }
        while (true) {
            agtfadlqogVar = agtfadlqogVar.draadjrbmk();
            if (!agtfadlqogVar.vdvldrhtss()) {
                if (agtfadlqogVar instanceof jyumaefscl) {
                    return (jyumaefscl) agtfadlqogVar;
                }
                if (agtfadlqogVar instanceof fyldjkxazc) {
                    return null;
                }
            }
        }
    }

    private final Object vipkmwdibw(ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws Throwable {
        boolean zDxjokdxxww;
        Throwable thOkpsazkaxt;
        istkbnxepw istkbnxepwVar = obj instanceof istkbnxepw ? (istkbnxepw) obj : null;
        Throwable th2 = istkbnxepwVar != null ? istkbnxepwVar.f76725iobyxmoadg : null;
        synchronized (ppxfxbqfkfVar) {
            zDxjokdxxww = ppxfxbqfkfVar.dxjokdxxww();
            List listDraadjrbmk = ppxfxbqfkfVar.draadjrbmk(th2);
            thOkpsazkaxt = okpsazkaxt(ppxfxbqfkfVar, listDraadjrbmk);
            if (thOkpsazkaxt != null) {
                esjtqupxsv(thOkpsazkaxt, listDraadjrbmk);
            }
        }
        if (thOkpsazkaxt != null && thOkpsazkaxt != th2) {
            obj = new istkbnxepw(thOkpsazkaxt, false, 2, null);
        }
        if (thOkpsazkaxt != null && (ntlheqmsrt(thOkpsazkaxt) || zfvoamnweg(thOkpsazkaxt))) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((istkbnxepw) obj).ppxfxbqfkf();
        }
        if (!zDxjokdxxww) {
            dvvnrvtcbc(thOkpsazkaxt);
        }
        skhdrjzrfn(obj);
        androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, ppxfxbqfkfVar, wizcaqwiak.lqeggnwhkg(obj));
        crxdokpmqz(ppxfxbqfkfVar, obj);
        return obj;
    }

    private final boolean weqkydbzbr() {
        Object objYfnezrywwk;
        do {
            objYfnezrywwk = yfnezrywwk();
            if (!(objYfnezrywwk instanceof zeieaojujs)) {
                return false;
            }
        } while (ageimvtcrz(objYfnezrywwk) < 0);
        return true;
    }

    private final void wizcaqwiak(igdgnonuha igdgnonuhaVar) {
        igdgnonuhaVar.gxszxtbevo(new fyldjkxazc());
        androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, igdgnonuhaVar, igdgnonuhaVar.draadjrbmk());
    }

    private final Object ylkuphrtab(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), this);
        iobyxmoadgVar.lereixgezr();
        oxmwwwfdhm.iobyxmoadg(iobyxmoadgVar, skhdrjzrfn.wflxmlrfwp(this, false, new jrbgnlbqoe(iobyxmoadgVar), 1, null));
        Object objZdlpuopuiu = iobyxmoadgVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu;
    }

    private final Object zeieaojujs(Object obj) throws Throwable {
        Throwable thRibwqtqdhb = null;
        while (true) {
            Object objYfnezrywwk = yfnezrywwk();
            if (objYfnezrywwk instanceof ppxfxbqfkf) {
                synchronized (objYfnezrywwk) {
                    if (((ppxfxbqfkf) objYfnezrywwk).gtknphoqwx()) {
                        return wizcaqwiak.f76796wkgbmnqykc;
                    }
                    boolean zDxjokdxxww = ((ppxfxbqfkf) objYfnezrywwk).dxjokdxxww();
                    if (obj != null || !zDxjokdxxww) {
                        if (thRibwqtqdhb == null) {
                            thRibwqtqdhb = ribwqtqdhb(obj);
                        }
                        ((ppxfxbqfkf) objYfnezrywwk).iobyxmoadg(thRibwqtqdhb);
                    }
                    Throwable thEablkybsjg = zDxjokdxxww ? null : ((ppxfxbqfkf) objYfnezrywwk).eablkybsjg();
                    if (thEablkybsjg != null) {
                        auzgnhcxok(((ppxfxbqfkf) objYfnezrywwk).ppxfxbqfkf(), thEablkybsjg);
                    }
                    return wizcaqwiak.f76793iobyxmoadg;
                }
            }
            if (!(objYfnezrywwk instanceof zeieaojujs)) {
                return wizcaqwiak.f76796wkgbmnqykc;
            }
            if (thRibwqtqdhb == null) {
                thRibwqtqdhb = ribwqtqdhb(obj);
            }
            zeieaojujs zeieaojujsVar = (zeieaojujs) objYfnezrywwk;
            if (!zeieaojujsVar.isActive()) {
                Object objFmlbqenlif = fmlbqenlif(objYfnezrywwk, new istkbnxepw(thRibwqtqdhb, false, 2, null));
                if (objFmlbqenlif == wizcaqwiak.f76793iobyxmoadg) {
                    throw new IllegalStateException(("Cannot happen in " + objYfnezrywwk).toString());
                }
                if (objFmlbqenlif != wizcaqwiak.f76795ppxfxbqfkf) {
                    return objFmlbqenlif;
                }
            } else if (jrbgnlbqoe(zeieaojujsVar, thRibwqtqdhb)) {
                return wizcaqwiak.f76793iobyxmoadg;
            }
        }
    }

    @Override // pj.auzgnhcxok
    public final boolean agtfadlqog() {
        return !(yfnezrywwk() instanceof zeieaojujs);
    }

    protected final void bfopjjpdmp(auzgnhcxok auzgnhcxokVar) {
        if (auzgnhcxokVar == null) {
            fiwbwshyhd(grlcpdaxtj.f76704zdlpuopuiu);
            return;
        }
        auzgnhcxokVar.start();
        yggfygwlhe yggfygwlheVarWwaezpbzkn = auzgnhcxokVar.wwaezpbzkn(this);
        fiwbwshyhd(yggfygwlheVarWwaezpbzkn);
        if (agtfadlqog()) {
            yggfygwlheVarWwaezpbzkn.iobyxmoadg();
            fiwbwshyhd(grlcpdaxtj.f76704zdlpuopuiu);
        }
    }

    public auzgnhcxok czzsidtyhn() {
        yggfygwlhe yggfygwlheVarUwvvkdfqfp = uwvvkdfqfp();
        if (yggfygwlheVarUwvvkdfqfp != null) {
            return yggfygwlheVarUwvvkdfqfp.getParent();
        }
        return null;
    }

    protected void dvvnrvtcbc(Throwable th2) {
    }

    public final void fiwbwshyhd(yggfygwlhe yggfygwlheVar) {
        f76737yggfygwlhe.set(this, yggfygwlheVar);
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return auzgnhcxok.iobyxmoadg.zoijcleaow(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return auzgnhcxok.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb.zoijcleaow
    public final lg.btonecajqb.ppxfxbqfkf getKey() {
        return auzgnhcxok.f76671gtknphoqwx;
    }

    public final boolean hcddaimhww(Object obj) throws Throwable {
        Object objZeieaojujs = wizcaqwiak.f76793iobyxmoadg;
        if (xrmfcynszj() && (objZeieaojujs = tzroggbefp(obj)) == wizcaqwiak.f76797zoijcleaow) {
            return true;
        }
        if (objZeieaojujs == wizcaqwiak.f76793iobyxmoadg) {
            objZeieaojujs = zeieaojujs(obj);
        }
        if (objZeieaojujs == wizcaqwiak.f76793iobyxmoadg || objZeieaojujs == wizcaqwiak.f76797zoijcleaow) {
            return true;
        }
        if (objZeieaojujs == wizcaqwiak.f76796wkgbmnqykc) {
            return false;
        }
        yadqdtsiqt(objZeieaojujs);
        return true;
    }

    public final void hszhottldk(igdgnonuha igdgnonuhaVar) {
        Object objYfnezrywwk;
        do {
            objYfnezrywwk = yfnezrywwk();
            if (!(objYfnezrywwk instanceof igdgnonuha)) {
                if (!(objYfnezrywwk instanceof zeieaojujs) || ((zeieaojujs) objYfnezrywwk).ppxfxbqfkf() == null) {
                    return;
                }
                igdgnonuhaVar.oxmwwwfdhm();
                return;
            }
            if (objYfnezrywwk != igdgnonuhaVar) {
                return;
            }
        } while (!androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, objYfnezrywwk, wizcaqwiak.f76794lqeggnwhkg));
    }

    protected void igdgnonuha() {
    }

    @Override // pj.auzgnhcxok
    public final lj.btonecajqb iobyxmoadg() {
        return lj.wflxmlrfwp.zoijcleaow(new wkgbmnqykc(null));
    }

    protected final Object iozdgvuglv(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        Object objYfnezrywwk;
        do {
            objYfnezrywwk = yfnezrywwk();
            if (!(objYfnezrywwk instanceof zeieaojujs)) {
                if (objYfnezrywwk instanceof istkbnxepw) {
                    throw ((istkbnxepw) objYfnezrywwk).f76725iobyxmoadg;
                }
                return wizcaqwiak.nufgyqmvbu(objYfnezrywwk);
            }
        } while (ageimvtcrz(objYfnezrywwk) < 0);
        return ylkuphrtab(gxszxtbevoVar);
    }

    protected final CancellationException ipoelvxyzq(Throwable th2, String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = ulzqkzuiru();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    @Override // pj.auzgnhcxok
    public boolean isActive() {
        Object objYfnezrywwk = yfnezrywwk();
        return (objYfnezrywwk instanceof zeieaojujs) && ((zeieaojujs) objYfnezrywwk).isActive();
    }

    @Override // pj.auzgnhcxok
    public final boolean isCancelled() {
        Object objYfnezrywwk = yfnezrywwk();
        return (objYfnezrywwk instanceof istkbnxepw) || ((objYfnezrywwk instanceof ppxfxbqfkf) && ((ppxfxbqfkf) objYfnezrywwk).dxjokdxxww());
    }

    protected boolean iyctptxqzt() {
        return false;
    }

    public final Object jhduphickx() throws Throwable {
        Object objYfnezrywwk = yfnezrywwk();
        if (objYfnezrywwk instanceof zeieaojujs) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objYfnezrywwk instanceof istkbnxepw) {
            throw ((istkbnxepw) objYfnezrywwk).f76725iobyxmoadg;
        }
        return wizcaqwiak.nufgyqmvbu(objYfnezrywwk);
    }

    public void jpowsppfya(Throwable th2) throws Throwable {
        hcddaimhww(th2);
    }

    public boolean jztzpxfvev() {
        return true;
    }

    @Override // pj.auzgnhcxok
    public final jztzpxfvev kegysxyocb(boolean z13, boolean z14, tg.draadjrbmk draadjrbmkVar) {
        return opjhrmiecq(z14, z13 ? new roivzttewh(draadjrbmkVar) : new uawqvzlxes(draadjrbmkVar));
    }

    @Override // pj.ixidwrxhsl
    public CancellationException lereixgezr() {
        Throwable thEablkybsjg;
        Object objYfnezrywwk = yfnezrywwk();
        if (objYfnezrywwk instanceof ppxfxbqfkf) {
            thEablkybsjg = ((ppxfxbqfkf) objYfnezrywwk).eablkybsjg();
        } else if (objYfnezrywwk instanceof istkbnxepw) {
            thEablkybsjg = ((istkbnxepw) objYfnezrywwk).f76725iobyxmoadg;
        } else {
            if (objYfnezrywwk instanceof zeieaojujs) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objYfnezrywwk).toString());
            }
            thEablkybsjg = null;
        }
        CancellationException cancellationException = thEablkybsjg instanceof CancellationException ? (CancellationException) thEablkybsjg : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + fyldjkxazc(objYfnezrywwk), thEablkybsjg, this);
    }

    public final String mhtqkkgtqm() {
        return roivzttewh() + '{' + fyldjkxazc(yfnezrywwk()) + '}';
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return auzgnhcxok.iobyxmoadg.wkgbmnqykc(this, ppxfxbqfkfVar);
    }

    @Override // pj.auzgnhcxok
    public void nufgyqmvbu(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(ulzqkzuiru(), null, this);
        }
        jpowsppfya(cancellationException);
    }

    public final boolean nuxfzjnpeb(Object obj) {
        Object objFmlbqenlif;
        do {
            objFmlbqenlif = fmlbqenlif(yfnezrywwk(), obj);
            if (objFmlbqenlif == wizcaqwiak.f76793iobyxmoadg) {
                return false;
            }
            if (objFmlbqenlif == wizcaqwiak.f76797zoijcleaow) {
                return true;
            }
        } while (objFmlbqenlif == wizcaqwiak.f76795ppxfxbqfkf);
        yadqdtsiqt(objFmlbqenlif);
        return true;
    }

    public void oipsdeybqn(Throwable th2) throws Throwable {
        throw th2;
    }

    public final jztzpxfvev opjhrmiecq(boolean z13, igdgnonuha igdgnonuhaVar) {
        boolean z14;
        boolean zWkgbmnqykc;
        igdgnonuhaVar.cqumvgiudr(this);
        while (true) {
            Object objYfnezrywwk = yfnezrywwk();
            z14 = true;
            if (!(objYfnezrywwk instanceof rlfsiqarku)) {
                if (!(objYfnezrywwk instanceof zeieaojujs)) {
                    z14 = false;
                    break;
                }
                zeieaojujs zeieaojujsVar = (zeieaojujs) objYfnezrywwk;
                fyldjkxazc fyldjkxazcVarPpxfxbqfkf = zeieaojujsVar.ppxfxbqfkf();
                if (fyldjkxazcVarPpxfxbqfkf == null) {
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objYfnezrywwk, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    wizcaqwiak((igdgnonuha) objYfnezrywwk);
                } else {
                    if (igdgnonuhaVar.jyumaefscl()) {
                        ppxfxbqfkf ppxfxbqfkfVar = zeieaojujsVar instanceof ppxfxbqfkf ? (ppxfxbqfkf) zeieaojujsVar : null;
                        Throwable thEablkybsjg = ppxfxbqfkfVar != null ? ppxfxbqfkfVar.eablkybsjg() : null;
                        if (thEablkybsjg != null) {
                            if (z13) {
                                igdgnonuhaVar.iwizpuwonk(thEablkybsjg);
                            }
                            return grlcpdaxtj.f76704zdlpuopuiu;
                        }
                        zWkgbmnqykc = fyldjkxazcVarPpxfxbqfkf.wkgbmnqykc(igdgnonuhaVar, 5);
                    } else {
                        zWkgbmnqykc = fyldjkxazcVarPpxfxbqfkf.wkgbmnqykc(igdgnonuhaVar, 1);
                    }
                    if (zWkgbmnqykc) {
                        break;
                    }
                }
            } else {
                rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) objYfnezrywwk;
                if (!rlfsiqarkuVar.isActive()) {
                    lxfrhoxuzk(rlfsiqarkuVar);
                } else if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, objYfnezrywwk, igdgnonuhaVar)) {
                    break;
                }
            }
        }
        if (z14) {
            return igdgnonuhaVar;
        }
        if (z13) {
            Object objYfnezrywwk2 = yfnezrywwk();
            istkbnxepw istkbnxepwVar = objYfnezrywwk2 instanceof istkbnxepw ? (istkbnxepw) objYfnezrywwk2 : null;
            igdgnonuhaVar.iwizpuwonk(istkbnxepwVar != null ? istkbnxepwVar.f76725iobyxmoadg : null);
        }
        return grlcpdaxtj.f76704zdlpuopuiu;
    }

    public final boolean pkzmftpjix(Throwable th2) {
        return hcddaimhww(th2);
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return auzgnhcxok.iobyxmoadg.eablkybsjg(this, btonecajqbVar);
    }

    @Override // pj.auzgnhcxok
    public final jztzpxfvev pmvmpeiblj(tg.draadjrbmk draadjrbmkVar) {
        return opjhrmiecq(true, new uawqvzlxes(draadjrbmkVar));
    }

    @Override // pj.iwizpuwonk
    public final void rgvfuqvkyq(ixidwrxhsl ixidwrxhslVar) throws Throwable {
        hcddaimhww(ixidwrxhslVar);
    }

    public String roivzttewh() {
        return kegysxyocb.iobyxmoadg(this);
    }

    protected void skhdrjzrfn(Object obj) {
    }

    public boolean sopmlzcsov(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return hcddaimhww(th2) && jztzpxfvev();
    }

    @Override // pj.auzgnhcxok
    public final boolean start() {
        int iAgeimvtcrz;
        do {
            iAgeimvtcrz = ageimvtcrz(yfnezrywwk());
            if (iAgeimvtcrz == 0) {
                return false;
            }
        } while (iAgeimvtcrz != 1);
        return true;
    }

    public final Object tbqsvytpvh(Object obj) {
        Object objFmlbqenlif;
        do {
            objFmlbqenlif = fmlbqenlif(yfnezrywwk(), obj);
            if (objFmlbqenlif == wizcaqwiak.f76793iobyxmoadg) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, ikoacuggdj(obj));
            }
        } while (objFmlbqenlif == wizcaqwiak.f76795ppxfxbqfkf);
        return objFmlbqenlif;
    }

    public String toString() {
        return mhtqkkgtqm() + '@' + kegysxyocb.zoijcleaow(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String ulzqkzuiru() {
        return "Job was cancelled";
    }

    public final yggfygwlhe uwvvkdfqfp() {
        return (yggfygwlhe) f76737yggfygwlhe.get(this);
    }

    @Override // pj.auzgnhcxok
    public final CancellationException vdvldrhtss() {
        Object objYfnezrywwk = yfnezrywwk();
        if (!(objYfnezrywwk instanceof ppxfxbqfkf)) {
            if (objYfnezrywwk instanceof zeieaojujs) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objYfnezrywwk instanceof istkbnxepw) {
                return grlcpdaxtj(this, ((istkbnxepw) objYfnezrywwk).f76725iobyxmoadg, null, 1, null);
            }
            return new JobCancellationException(kegysxyocb.iobyxmoadg(this) + " has completed normally", null, this);
        }
        Throwable thEablkybsjg = ((ppxfxbqfkf) objYfnezrywwk).eablkybsjg();
        if (thEablkybsjg != null) {
            CancellationException cancellationExceptionIpoelvxyzq = ipoelvxyzq(thEablkybsjg, kegysxyocb.iobyxmoadg(this) + " is cancelling");
            if (cancellationExceptionIpoelvxyzq != null) {
                return cancellationExceptionIpoelvxyzq;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // pj.auzgnhcxok
    public final yggfygwlhe wwaezpbzkn(iwizpuwonk iwizpuwonkVar) {
        jyumaefscl jyumaefsclVar = new jyumaefscl(iwizpuwonkVar);
        jyumaefsclVar.cqumvgiudr(this);
        while (true) {
            Object objYfnezrywwk = yfnezrywwk();
            if (objYfnezrywwk instanceof rlfsiqarku) {
                rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) objYfnezrywwk;
                if (!rlfsiqarkuVar.isActive()) {
                    lxfrhoxuzk(rlfsiqarkuVar);
                } else if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f76738zdlpuopuiu, this, objYfnezrywwk, jyumaefsclVar)) {
                    break;
                }
            } else {
                Throwable thEablkybsjg = null;
                if (!(objYfnezrywwk instanceof zeieaojujs)) {
                    Object objYfnezrywwk2 = yfnezrywwk();
                    istkbnxepw istkbnxepwVar = objYfnezrywwk2 instanceof istkbnxepw ? (istkbnxepw) objYfnezrywwk2 : null;
                    jyumaefsclVar.iwizpuwonk(istkbnxepwVar != null ? istkbnxepwVar.f76725iobyxmoadg : null);
                    return grlcpdaxtj.f76704zdlpuopuiu;
                }
                fyldjkxazc fyldjkxazcVarPpxfxbqfkf = ((zeieaojujs) objYfnezrywwk).ppxfxbqfkf();
                if (fyldjkxazcVarPpxfxbqfkf != null) {
                    if (!fyldjkxazcVarPpxfxbqfkf.wkgbmnqykc(jyumaefsclVar, 7)) {
                        boolean zWkgbmnqykc = fyldjkxazcVarPpxfxbqfkf.wkgbmnqykc(jyumaefsclVar, 3);
                        Object objYfnezrywwk3 = yfnezrywwk();
                        if (objYfnezrywwk3 instanceof ppxfxbqfkf) {
                            thEablkybsjg = ((ppxfxbqfkf) objYfnezrywwk3).eablkybsjg();
                        } else {
                            istkbnxepw istkbnxepwVar2 = objYfnezrywwk3 instanceof istkbnxepw ? (istkbnxepw) objYfnezrywwk3 : null;
                            if (istkbnxepwVar2 != null) {
                                thEablkybsjg = istkbnxepwVar2.f76725iobyxmoadg;
                            }
                        }
                        jyumaefsclVar.iwizpuwonk(thEablkybsjg);
                        if (zWkgbmnqykc) {
                            break;
                        }
                        return grlcpdaxtj.f76704zdlpuopuiu;
                    }
                    break;
                }
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objYfnezrywwk, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                wizcaqwiak((igdgnonuha) objYfnezrywwk);
            }
        }
        return jyumaefsclVar;
    }

    @Override // pj.auzgnhcxok
    public final Object wypolnanlu(lg.gxszxtbevo gxszxtbevoVar) {
        if (weqkydbzbr()) {
            Object objLrnfpwlwnk = lrnfpwlwnk(gxszxtbevoVar);
            return objLrnfpwlwnk == mg.zoijcleaow.gxszxtbevo() ? objLrnfpwlwnk : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        dvvnrvtcbc.dxjokdxxww(gxszxtbevoVar.getContext());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public boolean xrmfcynszj() {
        return false;
    }

    protected void yadqdtsiqt(Object obj) {
    }

    public final Object yfnezrywwk() {
        return f76738zdlpuopuiu.get(this);
    }

    protected boolean zfvoamnweg(Throwable th2) {
        return false;
    }
}
