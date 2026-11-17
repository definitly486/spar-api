package dh1;

import eh1.PopupConfirmRequest;
import eh1.PopupGetRequest;
import eh1.PopupsGetRequest;
import fh1.BannersDto;
import fh1.PopupDto;
import fh1.PopupsDto;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements dh1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ch1.iobyxmoadg f28417iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bh1.zoijcleaow f28418ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bh1.iobyxmoadg f28419zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f28420iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f28422yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f28423zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28422yggfygwlhe = obj;
            this.f28420iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f28424jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f28426zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28426zdlpuopuiu = obj;
            this.f28424jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.wkgbmnqykc(null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f28427jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f28429zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28429zdlpuopuiu = obj;
            this.f28427jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(null, this);
        }
    }

    /* JADX INFO: renamed from: dh1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0568zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f28430iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f28432yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f28433zdlpuopuiu;

        C0568zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28432yggfygwlhe = obj;
            this.f28430iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.ppxfxbqfkf(null, this);
        }
    }

    public zoijcleaow(ch1.iobyxmoadg bannerMapper, bh1.iobyxmoadg popupApiService, bh1.zoijcleaow popupOldApiService) {
        zdlpuopuiu.btonecajqb(bannerMapper, "bannerMapper");
        zdlpuopuiu.btonecajqb(popupApiService, "popupApiService");
        zdlpuopuiu.btonecajqb(popupOldApiService, "popupOldApiService");
        this.f28417iobyxmoadg = bannerMapper;
        this.f28419zoijcleaow = popupApiService;
        this.f28418ppxfxbqfkf = popupOldApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dh1.iobyxmoadg
    public Object iobyxmoadg(String str, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f28420iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f28420iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f28422yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f28420iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            bh1.zoijcleaow zoijcleaowVar2 = this.f28418ppxfxbqfkf;
            if (str == null) {
                str = "";
            }
            PopupsGetRequest popupsGetRequest = new PopupsGetRequest(str);
            iobyxmoadgVar.f28423zdlpuopuiu = this;
            iobyxmoadgVar.f28420iwizpuwonk = 1;
            objIobyxmoadg = zoijcleaowVar2.iobyxmoadg(popupsGetRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f28423zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return zoijcleaowVar.f28417iobyxmoadg.gxszxtbevo((PopupsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dh1.iobyxmoadg
    public Object ppxfxbqfkf(String str, gxszxtbevo gxszxtbevoVar) {
        C0568zoijcleaow c0568zoijcleaow;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C0568zoijcleaow) {
            c0568zoijcleaow = (C0568zoijcleaow) gxszxtbevoVar;
            int i13 = c0568zoijcleaow.f28430iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0568zoijcleaow.f28430iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0568zoijcleaow = new C0568zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0568zoijcleaow = new C0568zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0568zoijcleaow.f28432yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0568zoijcleaow.f28430iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            bh1.zoijcleaow zoijcleaowVar2 = this.f28418ppxfxbqfkf;
            if (str == null) {
                str = "";
            }
            PopupsGetRequest popupsGetRequest = new PopupsGetRequest(str);
            c0568zoijcleaow.f28433zdlpuopuiu = this;
            c0568zoijcleaow.f28430iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar2.zoijcleaow(popupsGetRequest, c0568zoijcleaow);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) c0568zoijcleaow.f28433zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return zoijcleaowVar.f28417iobyxmoadg.wkgbmnqykc((BannersDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dh1.iobyxmoadg
    public Object wkgbmnqykc(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f28424jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f28424jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f28426zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f28424jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            bh1.iobyxmoadg iobyxmoadgVar = this.f28419zoijcleaow;
            PopupGetRequest popupGetRequest = new PopupGetRequest(str, str2);
            ppxfxbqfkfVar.f28424jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(popupGetRequest, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        PopupDto popupDto = (PopupDto) x21.wkgbmnqykc.draadjrbmk((BasicResponse) objIobyxmoadg, null, 1, null);
        if (popupDto != null) {
            return ch1.zoijcleaow.iobyxmoadg(popupDto);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dh1.iobyxmoadg
    public Object zoijcleaow(String str, gxszxtbevo gxszxtbevoVar) throws Throwable {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f28427jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f28427jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f28429zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f28427jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            bh1.iobyxmoadg iobyxmoadgVar = this.f28419zoijcleaow;
            PopupConfirmRequest popupConfirmRequest = new PopupConfirmRequest(str);
            wkgbmnqykcVar.f28427jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(popupConfirmRequest, wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
