package vd1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wd1.lqeggnwhkg;
import xd1.NotRatedOrderDto;
import xd1.SetBonusReviewRequest;
import yd1.ConfirmPopupTypesRequest;
import zd1.BonusReviewDto;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements sc1.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f116527iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ae1.iobyxmoadg f116528ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wd1.wkgbmnqykc f116529zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116530jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116532zdlpuopuiu;

        eablkybsjg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116532zdlpuopuiu = obj;
            this.f116530jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    /* JADX INFO: renamed from: vd1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2907iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116533jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116535zdlpuopuiu;

        C2907iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116535zdlpuopuiu = obj;
            this.f116533jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f116536iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f116538yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116539zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116538yggfygwlhe = obj;
            this.f116536iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116540jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116542zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116542zdlpuopuiu = obj;
            this.f116540jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f116543iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f116545yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f116546zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116545yggfygwlhe = obj;
            this.f116543iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(this);
        }
    }

    public iobyxmoadg(lqeggnwhkg orderResponseMapper, wd1.wkgbmnqykc popupTypesResponseMapper, ae1.iobyxmoadg dialogsApiService) {
        zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        zdlpuopuiu.btonecajqb(popupTypesResponseMapper, "popupTypesResponseMapper");
        zdlpuopuiu.btonecajqb(dialogsApiService, "dialogsApiService");
        this.f116527iobyxmoadg = orderResponseMapper;
        this.f116529zoijcleaow = popupTypesResponseMapper;
        this.f116528ppxfxbqfkf = dialogsApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sc1.ppxfxbqfkf
    public Object eablkybsjg(zz0.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2907iobyxmoadg c2907iobyxmoadg;
        if (gxszxtbevoVar instanceof C2907iobyxmoadg) {
            c2907iobyxmoadg = (C2907iobyxmoadg) gxszxtbevoVar;
            int i13 = c2907iobyxmoadg.f116533jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2907iobyxmoadg.f116533jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2907iobyxmoadg = new C2907iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2907iobyxmoadg = new C2907iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = c2907iobyxmoadg.f116535zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2907iobyxmoadg.f116533jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ae1.iobyxmoadg iobyxmoadgVar2 = this.f116528ppxfxbqfkf;
            ConfirmPopupTypesRequest confirmPopupTypesRequest = new ConfirmPopupTypesRequest(iobyxmoadgVar.lqeggnwhkg());
            c2907iobyxmoadg.f116533jyumaefscl = 1;
            objWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc(confirmPopupTypesRequest, c2907iobyxmoadg);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sc1.ppxfxbqfkf
    public Object iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f116536iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f116536iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f116538yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f116536iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ae1.iobyxmoadg iobyxmoadgVar2 = this.f116528ppxfxbqfkf;
            ppxfxbqfkfVar.f116539zdlpuopuiu = this;
            ppxfxbqfkfVar.f116536iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f116539zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f116529zoijcleaow.invoke(x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sc1.ppxfxbqfkf
    public Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f116540jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f116540jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = wkgbmnqykcVar.f116542zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f116540jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ae1.iobyxmoadg iobyxmoadgVar = this.f116528ppxfxbqfkf;
            wkgbmnqykcVar.f116540jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(wkgbmnqykcVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        BonusReviewDto bonusReviewDto = (BonusReviewDto) x21.wkgbmnqykc.draadjrbmk((BasicResponse) objPpxfxbqfkf, null, 1, null);
        if (bonusReviewDto != null) {
            return wd1.iobyxmoadg.iobyxmoadg(bonusReviewDto);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sc1.ppxfxbqfkf
    public Object wkgbmnqykc(String str, gxszxtbevo gxszxtbevoVar) throws Throwable {
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f116530jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f116530jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objEablkybsjg = eablkybsjgVar.f116532zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f116530jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ae1.iobyxmoadg iobyxmoadgVar = this.f116528ppxfxbqfkf;
            SetBonusReviewRequest setBonusReviewRequest = new SetBonusReviewRequest(str);
            eablkybsjgVar.f116530jyumaefscl = 1;
            objEablkybsjg = iobyxmoadgVar.eablkybsjg(setBonusReviewRequest, eablkybsjgVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sc1.ppxfxbqfkf
    public Object zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f116543iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f116543iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f116545yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f116543iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ae1.iobyxmoadg iobyxmoadgVar2 = this.f116528ppxfxbqfkf;
            zoijcleaowVar.f116546zdlpuopuiu = this;
            zoijcleaowVar.f116543iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f116546zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f116527iobyxmoadg.gxszxtbevo((NotRatedOrderDto) x21.wkgbmnqykc.draadjrbmk((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
