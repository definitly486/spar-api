package c00;

import b00.ResendAuthSmsDto;
import gg.wwaezpbzkn;
import iz.AuthSmsDto;
import iz.AuthTokenDto;
import ru.myspar.core.network.model.BasicResponse;
import uy.ResendAuthSmsRequest;
import vy.AuthSmsRequest;
import vy.AuthTokenRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements y10.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.rgvfuqvkyq f18026iobyxmoadg;

    /* JADX INFO: renamed from: c00.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0333iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18027jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18029zdlpuopuiu;

        C0333iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18029zdlpuopuiu = obj;
            this.f18027jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, null, null, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18030jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18032zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18032zdlpuopuiu = obj;
            this.f18030jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18033jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18035zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18035zdlpuopuiu = obj;
            this.f18033jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18036jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18038zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18038zdlpuopuiu = obj;
            this.f18036jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public iobyxmoadg(ay.rgvfuqvkyq tokenApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tokenApiService, "tokenApiService");
        this.f18026iobyxmoadg = tokenApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.iobyxmoadg
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18036jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18036jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f18038zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18036jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ay.rgvfuqvkyq rgvfuqvkyqVar = this.f18026iobyxmoadg;
            AuthSmsRequest authSmsRequest = new AuthSmsRequest(str);
            zoijcleaowVar.f18036jyumaefscl = 1;
            objEablkybsjg = rgvfuqvkyqVar.eablkybsjg(authSmsRequest, zoijcleaowVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return ky.iobyxmoadg.zoijcleaow((AuthSmsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.iobyxmoadg
    public Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18030jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18030jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f18032zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18030jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.rgvfuqvkyq rgvfuqvkyqVar = this.f18026iobyxmoadg;
            ppxfxbqfkfVar.f18030jyumaefscl = 1;
            objPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf(ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objPpxfxbqfkf, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.iobyxmoadg
    public Object wkgbmnqykc(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f18033jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f18033jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = wkgbmnqykcVar.f18035zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f18033jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ay.rgvfuqvkyq rgvfuqvkyqVar = this.f18026iobyxmoadg;
            ResendAuthSmsRequest resendAuthSmsRequest = new ResendAuthSmsRequest(str, str2);
            wkgbmnqykcVar.f18033jyumaefscl = 1;
            objWkgbmnqykc = rgvfuqvkyqVar.wkgbmnqykc(resendAuthSmsRequest, wkgbmnqykcVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return ky.iobyxmoadg.iobyxmoadg((ResendAuthSmsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objWkgbmnqykc, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // y10.iobyxmoadg
    public Object zoijcleaow(String str, String str2, String str3, String str4, String str5, lg.gxszxtbevo gxszxtbevoVar) {
        C0333iobyxmoadg c0333iobyxmoadg;
        if (gxszxtbevoVar instanceof C0333iobyxmoadg) {
            c0333iobyxmoadg = (C0333iobyxmoadg) gxszxtbevoVar;
            int i13 = c0333iobyxmoadg.f18027jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0333iobyxmoadg.f18027jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c0333iobyxmoadg = new C0333iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0333iobyxmoadg = new C0333iobyxmoadg(gxszxtbevoVar);
        }
        Object objGxszxtbevo = c0333iobyxmoadg.f18029zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0333iobyxmoadg.f18027jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ay.rgvfuqvkyq rgvfuqvkyqVar = this.f18026iobyxmoadg;
            AuthTokenRequest authTokenRequest = new AuthTokenRequest(str, str2, str3, str4, str5);
            c0333iobyxmoadg.f18027jyumaefscl = 1;
            objGxszxtbevo = rgvfuqvkyqVar.gxszxtbevo(authTokenRequest, c0333iobyxmoadg);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return ky.iobyxmoadg.eablkybsjg((AuthTokenDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objGxszxtbevo, null, 1, null));
    }
}
