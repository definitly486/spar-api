package n80;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.user.models.User;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c20.eablkybsjg f69353eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final n80.zoijcleaow f69354gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final j30.iobyxmoadg f69355ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ra2.zoijcleaow f69356wkgbmnqykc;

    /* JADX INFO: renamed from: n80.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1490iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f69357jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f69358yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69359zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1490iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69358yggfygwlhe = wkgbmnqykcVar;
            this.f69357jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1490iobyxmoadg(this.f69358yggfygwlhe, this.f69357jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69359zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69358yggfygwlhe, wkgbmnqykc.iobyxmoadg.f69374iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f69357jyumaefscl;
                this.f69359zdlpuopuiu = 1;
                if (iobyxmoadgVar.okpsazkaxt(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1490iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f69360iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f69362yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f69363zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f69362yggfygwlhe = obj;
            this.f69360iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.jztzpxfvev(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f69364iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f69366yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f69367zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f69366yggfygwlhe = obj;
            this.f69364iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.okpsazkaxt(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(j30.iobyxmoadg checkAppUpdateUseCase, ra2.zoijcleaow getCachedOrRemoteUserUseCase, c20.eablkybsjg isLoggedInUseCase, n80.zoijcleaow mapper, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkAppUpdateUseCase, "checkAppUpdateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCachedOrRemoteUserUseCase, "getCachedOrRemoteUserUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mapper, "mapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f69355ppxfxbqfkf = checkAppUpdateUseCase;
        this.f69356wkgbmnqykc = getCachedOrRemoteUserUseCase;
        this.f69353eablkybsjg = isLoggedInUseCase;
        this.f69354gxszxtbevo = mapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jztzpxfvev(p00.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar2;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar2.f69360iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar2.f69360iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar2 = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar2.f69362yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar2.f69360iwizpuwonk;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
                c20.eablkybsjg eablkybsjgVar = this.f69353eablkybsjg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                if (!((Boolean) eablkybsjgVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                    return new m80.iobyxmoadg(ppxfxbqfkfVar, null, 2, null);
                }
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ra2.zoijcleaow zoijcleaowVar = this.f69356wkgbmnqykc;
                ppxfxbqfkfVar2.f69363zdlpuopuiu = ppxfxbqfkfVar;
                ppxfxbqfkfVar2.f69360iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar2);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ppxfxbqfkfVar = (p00.ppxfxbqfkf) ppxfxbqfkfVar2.f69363zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((User) objZoijcleaow);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
        }
        return new m80.iobyxmoadg(ppxfxbqfkfVar, (User) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object okpsazkaxt(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f69364iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f69364iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f69366yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f69364iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f69367zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f69367zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            iobyxmoadgVar2.ulzqkzuiru(iobyxmoadgVar2.f69354gxszxtbevo.iobyxmoadg((m80.iobyxmoadg) objZoijcleaow));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objZoijcleaow);
        j30.iobyxmoadg iobyxmoadgVar3 = this.f69355ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f69367zdlpuopuiu = this;
        zoijcleaowVar.f69364iwizpuwonk = 1;
        objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        zoijcleaowVar.f69367zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f69364iwizpuwonk = 2;
        objZoijcleaow = iobyxmoadgVar.jztzpxfvev((p00.ppxfxbqfkf) objZoijcleaow, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar2.ulzqkzuiru(iobyxmoadgVar2.f69354gxszxtbevo.iobyxmoadg((m80.iobyxmoadg) objZoijcleaow));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, eablkybsjg.iobyxmoadg.f69351iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        crxdokpmqz(gxszxtbevo.iobyxmoadg.f69352iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1490iobyxmoadg(action, this, null), 3, null);
    }
}
