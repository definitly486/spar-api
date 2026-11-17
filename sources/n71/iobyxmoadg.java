package n71;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.nufgyqmvbu;
import ow1.zdlpuopuiu;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zdlpuopuiu f69321eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ow1.lqeggnwhkg f69322ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nufgyqmvbu f69323wkgbmnqykc;

    /* JADX INFO: renamed from: n71.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1488iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69325zdlpuopuiu;

        C1488iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C1488iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69325zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ow1.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.f69322ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f69325zdlpuopuiu = 1;
                if (lqeggnwhkgVar.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1488iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f69326cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f69328jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f69329yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f69330zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f69328jyumaefscl = obj;
            this.f69326cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(false, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f69331cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f69333iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f69334jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f69335lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f69336yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f69337zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f69331cqumvgiudr = obj;
            this.f69335lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(false, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f69338jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ n71.wkgbmnqykc f69339yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f69340zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(n71.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f69339yggfygwlhe = wkgbmnqykcVar;
            this.f69338jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f69339yggfygwlhe, this.f69338jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f69340zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                n71.wkgbmnqykc wkgbmnqykcVar = this.f69339yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, n71.wkgbmnqykc.iobyxmoadg.f69344iobyxmoadg)) {
                    this.f69338jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f69316iobyxmoadg);
                } else {
                    if (!(wkgbmnqykcVar instanceof n71.wkgbmnqykc.zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f69338jyumaefscl;
                    boolean zIobyxmoadg = ((n71.wkgbmnqykc.zoijcleaow) this.f69339yggfygwlhe).iobyxmoadg();
                    this.f69340zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(zIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ow1.lqeggnwhkg editIsEReceiptAcceptedSetShowedStateUseCase, nufgyqmvbu editIsEReceiptAcceptedUseCase, zdlpuopuiu getUserInfoUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editIsEReceiptAcceptedSetShowedStateUseCase, "editIsEReceiptAcceptedSetShowedStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editIsEReceiptAcceptedUseCase, "editIsEReceiptAcceptedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f69322ppxfxbqfkf = editIsEReceiptAcceptedSetShowedStateUseCase;
        this.f69323wkgbmnqykc = editIsEReceiptAcceptedUseCase;
        this.f69321eablkybsjg = getUserInfoUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object metgxyhuhe(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f69335lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f69335lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj2 = wkgbmnqykcVar.f69331cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f69335lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = wkgbmnqykcVar.f69333iwizpuwonk;
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f69337zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                } catch (Throwable th2) {
                    th = th2;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = wkgbmnqykcVar.f69336yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f69337zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.crxdokpmqz(new eablkybsjg.zoijcleaow(thDxjokdxxww));
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(false));
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            nufgyqmvbu nufgyqmvbuVar = this.f69323wkgbmnqykc;
            nufgyqmvbu.zoijcleaow zoijcleaowVar = new nufgyqmvbu.zoijcleaow(z13);
            wkgbmnqykcVar.f69337zdlpuopuiu = this;
            wkgbmnqykcVar.f69333iwizpuwonk = z13;
            wkgbmnqykcVar.f69335lereixgezr = 1;
            if (nufgyqmvbuVar.zoijcleaow(zoijcleaowVar, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } catch (Throwable th3) {
            th = th3;
            iobyxmoadgVar = this;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        Object obj3 = objWkgbmnqykc;
        boolean z14 = z13;
        obj = obj3;
        if (kcexrzcfyt.agtfadlqog(obj)) {
            wkgbmnqykcVar.f69337zdlpuopuiu = iobyxmoadgVar;
            wkgbmnqykcVar.f69336yggfygwlhe = obj;
            wkgbmnqykcVar.f69334jyumaefscl = obj;
            wkgbmnqykcVar.f69335lereixgezr = 2;
            if (iobyxmoadgVar.xrmfcynszj(z14, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.zoijcleaow(thDxjokdxxww));
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.zoijcleaow(true));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f69326cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f69326cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f69328jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f69326cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            zdlpuopuiu zdlpuopuiuVar = this.f69321eablkybsjg;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            ppxfxbqfkfVar.f69330zdlpuopuiu = this;
            ppxfxbqfkfVar.f69329yggfygwlhe = z13;
            ppxfxbqfkfVar.f69326cqumvgiudr = 1;
            objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = ppxfxbqfkfVar.f69329yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f69330zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        UserInfo userInfo = (UserInfo) objZoijcleaow;
        String email = userInfo != null ? userInfo.getEmail() : null;
        if (email == null) {
            email = "";
        }
        if (z13 && email.length() > 0) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.ppxfxbqfkf(email));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(n71.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(n71.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, n71.ppxfxbqfkf.iobyxmoadg.f69343iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1488iobyxmoadg(null), 3, null);
    }
}
