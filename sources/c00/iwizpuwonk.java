package c00;

import b00.FetchSmsDto;
import gg.wwaezpbzkn;
import iz.AuthTokenDto;
import iz.CheckRegistrationDto;
import ru.myspar.core.error_handler.exceptions.RegPromoNotValidException;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import uy.CheckPromoRequest;
import uy.CheckRegistrationRequest;
import uy.FetchSmsRequest;
import uy.RegisterUserRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class iwizpuwonk implements y10.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.wflxmlrfwp f18039iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18040jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18042zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18042zdlpuopuiu = obj;
            this.f18040jyumaefscl |= Integer.MIN_VALUE;
            return iwizpuwonk.this.wkgbmnqykc(null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18043jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18045zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18045zdlpuopuiu = obj;
            this.f18043jyumaefscl |= Integer.MIN_VALUE;
            return iwizpuwonk.this.ppxfxbqfkf(null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18046jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18048zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18048zdlpuopuiu = obj;
            this.f18046jyumaefscl |= Integer.MIN_VALUE;
            return iwizpuwonk.this.iobyxmoadg(null, null, null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18049jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18051zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18051zdlpuopuiu = obj;
            this.f18049jyumaefscl |= Integer.MIN_VALUE;
            return iwizpuwonk.this.zoijcleaow(null, this);
        }
    }

    public iwizpuwonk(ay.wflxmlrfwp registrationApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(registrationApiService, "registrationApiService");
        this.f18039iobyxmoadg = registrationApiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable gxszxtbevo(ErrorResponse it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return new RegPromoNotValidException(it.getMessage());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // y10.ppxfxbqfkf
    public Object iobyxmoadg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f18046jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f18046jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = wkgbmnqykcVar.f18048zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f18046jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ay.wflxmlrfwp wflxmlrfwpVar = this.f18039iobyxmoadg;
            RegisterUserRequest registerUserRequest = new RegisterUserRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
            wkgbmnqykcVar.f18046jyumaefscl = 1;
            objWkgbmnqykc = wflxmlrfwpVar.wkgbmnqykc(registerUserRequest, wkgbmnqykcVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return ky.iobyxmoadg.eablkybsjg((AuthTokenDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.ppxfxbqfkf
    public Object ppxfxbqfkf(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18043jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18043jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f18045zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18043jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.wflxmlrfwp wflxmlrfwpVar = this.f18039iobyxmoadg;
            FetchSmsRequest fetchSmsRequest = new FetchSmsRequest(str, str2);
            ppxfxbqfkfVar.f18043jyumaefscl = 1;
            objPpxfxbqfkf = wflxmlrfwpVar.ppxfxbqfkf(fetchSmsRequest, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return ky.iobyxmoadg.wkgbmnqykc((FetchSmsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.ppxfxbqfkf
    public Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18040jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18040jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f18042zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18040jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.wflxmlrfwp wflxmlrfwpVar = this.f18039iobyxmoadg;
            CheckPromoRequest checkPromoRequest = new CheckPromoRequest(str);
            iobyxmoadgVar.f18040jyumaefscl = 1;
            objZoijcleaow = wflxmlrfwpVar.zoijcleaow(checkPromoRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        o40.eablkybsjg.dxjokdxxww((BasicResponse) objZoijcleaow, new tg.draadjrbmk() { // from class: c00.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return iwizpuwonk.gxszxtbevo((ErrorResponse) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.ppxfxbqfkf
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18049jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18049jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f18051zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18049jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.wflxmlrfwp wflxmlrfwpVar = this.f18039iobyxmoadg;
            CheckRegistrationRequest checkRegistrationRequest = new CheckRegistrationRequest(str, true);
            zoijcleaowVar.f18049jyumaefscl = 1;
            objIobyxmoadg = wflxmlrfwpVar.iobyxmoadg(checkRegistrationRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return ky.iobyxmoadg.ppxfxbqfkf((CheckRegistrationDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
