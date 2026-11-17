package kn1;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.scan.impl.scan_screen.domain.State;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ur0.iobyxmoadg f59884eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f59885gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f59886ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vm0.zoijcleaow f59887wkgbmnqykc;

    /* JADX INFO: renamed from: kn1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1192iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f59888iobyxmoadg;

        static {
            int[] iArr = new int[in1.iobyxmoadg.values().length];
            try {
                iArr[in1.iobyxmoadg.Product.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in1.iobyxmoadg.ActivationCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59888iobyxmoadg = iArr;
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f59890yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f59891zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f59890yggfygwlhe = ((Boolean) obj).booleanValue();
            return ppxfxbqfkfVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f59891zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (this.f59890yggfygwlhe) {
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    this.f59891zdlpuopuiu = 1;
                    if (iobyxmoadgVar.xrmfcynszj(this) == objGxszxtbevo) {
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
            return ((ppxfxbqfkf) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f59892iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f59894yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f59895zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f59894yggfygwlhe = obj;
            this.f59892iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(vm0.zoijcleaow analyticsTracker, ur0.iobyxmoadg permissionManager, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(permissionManager, "permissionManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f59886ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f59887wkgbmnqykc = analyticsTracker;
        this.f59884eablkybsjg = permissionManager;
    }

    private final void czzsidtyhn() {
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(ikoacuggdj(), new ppxfxbqfkf(null)), sopmlzcsov());
    }

    private final void jztzpxfvev(String str) {
        this.f59887wkgbmnqykc.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.Scan.f92372iwizpuwonk, new AnalyticsPage.ItemDetail(str, q11.dxjokdxxww.ppxfxbqfkf()), null, null, null, 28, null)));
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(str));
    }

    private final void okpsazkaxt(String str) {
        crxdokpmqz(new eablkybsjg.zoijcleaow(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f59892iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f59892iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f59894yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f59892iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f59895zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f59895zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.crxdokpmqz(eablkybsjg.C1191eablkybsjg.f59874iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        ur0.iobyxmoadg iobyxmoadgVar3 = this.f59884eablkybsjg;
        String name = iobyxmoadg.class.getName();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        zoijcleaowVar.f59895zdlpuopuiu = this;
        zoijcleaowVar.f59892iwizpuwonk = 1;
        objZoijcleaow = iobyxmoadgVar3.zoijcleaow(name, "android.permission.CAMERA", zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        ur0.ppxfxbqfkf ppxfxbqfkfVar = (ur0.ppxfxbqfkf) objZoijcleaow;
        if (ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.zoijcleaow) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.dxjokdxxww(!iobyxmoadgVar.f59885gxszxtbevo));
            if (iobyxmoadgVar.f59885gxszxtbevo) {
                zoijcleaowVar.f59895zdlpuopuiu = iobyxmoadgVar;
                zoijcleaowVar.f59892iwizpuwonk = 2;
                if (crxdokpmqz.zoijcleaow(2500L, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar2.crxdokpmqz(eablkybsjg.C1191eablkybsjg.f59874iobyxmoadg);
            } else {
                iobyxmoadgVar.f59885gxszxtbevo = true;
            }
        } else {
            if (!(ppxfxbqfkfVar instanceof ur0.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.nufgyqmvbu.f59878iobyxmoadg);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public sj.lqeggnwhkg ikoacuggdj() {
        return this.f59886ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f59903iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f59876iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.eablkybsjg.f59901iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.lqeggnwhkg.f59877iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.C1193wkgbmnqykc.f59907iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.gxszxtbevo.f59875iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.dxjokdxxww.f59900iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.btonecajqb.f59872iobyxmoadg);
            return;
        }
        if (intent instanceof wkgbmnqykc.zoijcleaow) {
            int i13 = C1192iobyxmoadg.f59888iobyxmoadg[((State) jlmebxxoox()).getArgs().getType().ordinal()];
            if (i13 == 1) {
                jztzpxfvev(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg());
                return;
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                okpsazkaxt(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg());
                return;
            }
        }
        if (intent instanceof wkgbmnqykc.ppxfxbqfkf) {
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg()));
            return;
        }
        if (intent instanceof wkgbmnqykc.gxszxtbevo) {
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(((wkgbmnqykc.gxszxtbevo) intent).iobyxmoadg()));
        } else if (intent instanceof wkgbmnqykc.lqeggnwhkg) {
            metgxyhuhe(((wkgbmnqykc.lqeggnwhkg) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof wkgbmnqykc.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            rlfsiqarku(((wkgbmnqykc.nufgyqmvbu) intent).iobyxmoadg());
        }
    }

    public void metgxyhuhe(boolean z13) {
        this.f59886ppxfxbqfkf.eablkybsjg(z13);
    }

    public void rlfsiqarku(boolean z13) {
        this.f59886ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(kn1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, kn1.ppxfxbqfkf.iobyxmoadg.f59899iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn();
    }
}
