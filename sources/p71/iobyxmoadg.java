package p71;

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
    private final nufgyqmvbu f75920eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dr0.iobyxmoadg f75921ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zdlpuopuiu f75922wkgbmnqykc;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f75923cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75925jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f75926yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75927zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75925jyumaefscl = obj;
            this.f75923cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.czzsidtyhn(false, this);
        }
    }

    /* JADX INFO: renamed from: p71.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1672iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f75928jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ p71.ppxfxbqfkf f75929yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75930zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1672iobyxmoadg(p71.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75929yggfygwlhe = ppxfxbqfkfVar;
            this.f75928jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1672iobyxmoadg(this.f75929yggfygwlhe, this.f75928jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75930zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75929yggfygwlhe, p71.ppxfxbqfkf.iobyxmoadg.f75947iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f75928jyumaefscl;
                this.f75930zdlpuopuiu = 1;
                if (iobyxmoadgVar.xrmfcynszj(this) == objGxszxtbevo) {
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
            return ((C1672iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75931iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75933yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75934zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75933yggfygwlhe = obj;
            this.f75931iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f75935cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f75937iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f75938jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f75939lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f75940yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75941zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75935cqumvgiudr = obj;
            this.f75939lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(false, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f75942jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ p71.wkgbmnqykc f75943yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75944zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(p71.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75943yggfygwlhe = wkgbmnqykcVar;
            this.f75942jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f75943yggfygwlhe, this.f75942jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75944zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                p71.wkgbmnqykc wkgbmnqykcVar = this.f75943yggfygwlhe;
                if (wkgbmnqykcVar instanceof p71.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f75942jyumaefscl;
                    boolean zIobyxmoadg = ((p71.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg();
                    this.f75944zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(zIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, p71.wkgbmnqykc.iobyxmoadg.f75948iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f75942jyumaefscl.crxdokpmqz(p71.eablkybsjg.iobyxmoadg.f75912iobyxmoadg);
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
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, zdlpuopuiu getUserInfoUseCase, nufgyqmvbu editIsEReceiptAcceptedUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editIsEReceiptAcceptedUseCase, "editIsEReceiptAcceptedUseCase");
        this.f75921ppxfxbqfkf = dispatchersProvider;
        this.f75922wkgbmnqykc = getUserInfoUseCase;
        this.f75920eablkybsjg = editIsEReceiptAcceptedUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object czzsidtyhn(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f75923cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f75923cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f75925jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f75923cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                zdlpuopuiu zdlpuopuiuVar = this.f75922wkgbmnqykc;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                eablkybsjgVar.f75927zdlpuopuiu = this;
                eablkybsjgVar.f75926yggfygwlhe = z13;
                eablkybsjgVar.f75923cqumvgiudr = 1;
                objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = eablkybsjgVar.f75926yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) eablkybsjgVar.f75927zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        UserInfo userInfo = (UserInfo) objZoijcleaow;
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(userInfo != null ? userInfo.getEmail() : null);
        String str = (String) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        if (z13) {
            iobyxmoadgVar.crxdokpmqz(new p71.eablkybsjg.zoijcleaow(str == null ? "" : str));
        }
        if (str == null) {
            str = "";
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(z13, str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
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
            int i13 = wkgbmnqykcVar.f75939lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f75939lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj2 = wkgbmnqykcVar.f75935cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f75939lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                z13 = wkgbmnqykcVar.f75937iwizpuwonk;
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f75941zdlpuopuiu;
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
                obj = wkgbmnqykcVar.f75940yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f75941zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.rlfsiqarku(thDxjokdxxww);
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            nufgyqmvbu nufgyqmvbuVar = this.f75920eablkybsjg;
            nufgyqmvbu.zoijcleaow zoijcleaowVar = new nufgyqmvbu.zoijcleaow(z13);
            wkgbmnqykcVar.f75941zdlpuopuiu = this;
            wkgbmnqykcVar.f75937iwizpuwonk = z13;
            wkgbmnqykcVar.f75939lereixgezr = 1;
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
            wkgbmnqykcVar.f75941zdlpuopuiu = iobyxmoadgVar;
            wkgbmnqykcVar.f75940yggfygwlhe = obj;
            wkgbmnqykcVar.f75938jyumaefscl = obj;
            wkgbmnqykcVar.f75939lereixgezr = 2;
            if (iobyxmoadgVar.czzsidtyhn(z14, wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(obj);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.rlfsiqarku(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f75931iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f75931iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f75933yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f75931iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                zdlpuopuiu zdlpuopuiuVar = this.f75922wkgbmnqykc;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f75934zdlpuopuiu = this;
                ppxfxbqfkfVar.f75931iwizpuwonk = 1;
                objZoijcleaow = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f75934zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((UserInfo) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            UserInfo userInfo = (UserInfo) objWkgbmnqykc;
            String email = userInfo != null ? userInfo.getEmail() : null;
            if (email == null) {
                email = "";
            }
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.zoijcleaow(email, userInfo != null ? userInfo.getIsEReceiptAccepted() : false));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.rlfsiqarku(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(p71.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(p71.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1672iobyxmoadg(action, this, null), 3, null);
    }

    public final void rlfsiqarku(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new p71.eablkybsjg.ppxfxbqfkf(error));
    }
}
