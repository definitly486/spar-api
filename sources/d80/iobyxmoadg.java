package d80;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.crxdokpmqz;
import ru.myspar.analytics.api.model.AnalyticsPage;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final at.iobyxmoadg f27168eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f27169gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f27170ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lo.zoijcleaow f27171wkgbmnqykc;

    /* JADX INFO: renamed from: d80.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0503iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f27172iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f27174yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f27175zdlpuopuiu;

        C0503iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f27174yggfygwlhe = obj;
            this.f27172iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f27177yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f27178zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
            zoijcleaowVar.f27177yggfygwlhe = ((Boolean) obj).booleanValue();
            return zoijcleaowVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f27178zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (this.f27177yggfygwlhe) {
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    this.f27178zdlpuopuiu = 1;
                    if (iobyxmoadgVar.jztzpxfvev(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lo.zoijcleaow analyticsTracker, at.iobyxmoadg permissionManager, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f27170ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f27171wkgbmnqykc = analyticsTracker;
        this.f27168eablkybsjg = permissionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(lg.gxszxtbevo gxszxtbevoVar) {
        C0503iobyxmoadg c0503iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof C0503iobyxmoadg) {
            c0503iobyxmoadg = (C0503iobyxmoadg) gxszxtbevoVar;
            int i13 = c0503iobyxmoadg.f27172iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0503iobyxmoadg.f27172iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0503iobyxmoadg = new C0503iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0503iobyxmoadg = new C0503iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0503iobyxmoadg.f27174yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0503iobyxmoadg.f27172iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c0503iobyxmoadg.f27175zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (iobyxmoadg) c0503iobyxmoadg.f27175zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.crxdokpmqz(eablkybsjg.wkgbmnqykc.f27164iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        at.iobyxmoadg iobyxmoadgVar3 = this.f27168eablkybsjg;
        String name = iobyxmoadg.class.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        c0503iobyxmoadg.f27175zdlpuopuiu = this;
        c0503iobyxmoadg.f27172iwizpuwonk = 1;
        objZoijcleaow = iobyxmoadgVar3.zoijcleaow(name, "android.permission.CAMERA", c0503iobyxmoadg);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        at.ppxfxbqfkf ppxfxbqfkfVar = (at.ppxfxbqfkf) objZoijcleaow;
        if (ppxfxbqfkfVar instanceof at.ppxfxbqfkf.zoijcleaow) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.nufgyqmvbu(!iobyxmoadgVar.f27169gxszxtbevo));
            if (iobyxmoadgVar.f27169gxszxtbevo) {
                c0503iobyxmoadg.f27175zdlpuopuiu = iobyxmoadgVar;
                c0503iobyxmoadg.f27172iwizpuwonk = 2;
                if (crxdokpmqz.zoijcleaow(2500L, c0503iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar2.crxdokpmqz(eablkybsjg.wkgbmnqykc.f27164iobyxmoadg);
            } else {
                iobyxmoadgVar.f27169gxszxtbevo = true;
            }
        } else {
            if (!(ppxfxbqfkfVar instanceof at.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.lqeggnwhkg.f27161iobyxmoadg);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void okpsazkaxt(String str) {
        this.f27171wkgbmnqykc.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Scan.f84344iwizpuwonk, new AnalyticsPage.ItemDetail(str, k30.draadjrbmk.ppxfxbqfkf()), null, null, null, 28, null)));
        crxdokpmqz(new eablkybsjg.zoijcleaow(str));
    }

    private final void rlfsiqarku() {
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(ikoacuggdj(), new zoijcleaow(null)), sopmlzcsov());
    }

    public sj.lqeggnwhkg ikoacuggdj() {
        return this.f27170ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f27185iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f27160iobyxmoadg);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.eablkybsjg.f27183iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.gxszxtbevo.f27159iobyxmoadg);
            wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.C0504wkgbmnqykc.f27189iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.C0502eablkybsjg.f27158iobyxmoadg);
            wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.dxjokdxxww.f27182iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.dxjokdxxww.f27157iobyxmoadg);
            wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
            return;
        }
        if (intent instanceof wkgbmnqykc.zoijcleaow) {
            okpsazkaxt(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg());
            wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
            return;
        }
        if (intent instanceof wkgbmnqykc.ppxfxbqfkf) {
            new gxszxtbevo.iobyxmoadg(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof wkgbmnqykc.gxszxtbevo) {
            new gxszxtbevo.zoijcleaow(((wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof wkgbmnqykc.lqeggnwhkg) {
            xrmfcynszj(((wkgbmnqykc.lqeggnwhkg) intent).iobyxmoadg());
            wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
        } else {
            if (!(intent instanceof wkgbmnqykc.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe(((wkgbmnqykc.nufgyqmvbu) intent).iobyxmoadg());
            wwaezpbzkn wwaezpbzknVar7 = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public void metgxyhuhe(boolean z13) {
        this.f27170ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f27181iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        rlfsiqarku();
    }

    public void xrmfcynszj(boolean z13) {
        this.f27170ppxfxbqfkf.eablkybsjg(z13);
    }
}
