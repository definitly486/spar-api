package kk;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import npi.spay.Cn;
import spay.sdk.domain.model.AuthMethod;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class b9 extends androidx.lifecycle.ntlheqmsrt implements n0 {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final kw f55919agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final oe f55920btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public final sj.zynmafqrjb f55921cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final a4 f55922cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final a2 f55923draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final hcddaimhww f55924dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final oh f55925eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final c f55926esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final wc0 f55927gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final o8 f55928gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public final sj.wypolnanlu f55929hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public final sj.zynmafqrjb f55930hkdspvbjdz;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final xf f55931iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public fyldjkxazc f55932iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public final sj.zynmafqrjb f55933istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final x50 f55934iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public final sj.zynmafqrjb f55935jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final ol f55936jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final nl f55937kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final gg f55938lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public long f55939lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final u2 f55940lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final d80 f55941nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final de0 f55942ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final bt f55943oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public final ld0 f55944pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public final wy f55945pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final g10 f55946ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final dj f55947rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final fj f55948vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final pc f55949wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final tr f55950wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public final long f55951wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public xs f55952yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final y1 f55953yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public final oe0 f55954ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final g80 f55955zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jlmebxxoox f55956zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public boolean f55957zynmafqrjb;

    public b9(xf sPayStorage, jlmebxxoox sPayDataContract, g10 getSessionIdUseCase, tr getPaymentTokenUseCase, oh getPaymentOrderUseCase, o8 getPayOnlineUseCase, u2 checkDeviceUseCase, d80 getDeviceInfoUseCase, hcddaimhww getIpAddressUseCase, oe orderScreenInteractor, wc0 featuresHandler, a2 bankAuthenticationContract, pc sPaySdkReducer, kw getSdkAuthUseCase, de0 authHandler, dj paymentTokenFraudMonReviewUseCase, m60 sPaySdkConfigRepository, fj resourceManager, bt metricFacade, nl sslInteractor, g80 lazyNetworkModule, y1 getLocalSessionIdUseCase, ka sPaySdkMerchantOptionsRepository, ol seamlessAuthFeature, x50 getBindingSessionIdUseCase, a4 createBindingOtpUseCase, c payBindingUseCase, gg secureSharedPreferences, wy appNameUtil) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSessionIdUseCase, "getSessionIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPaymentTokenUseCase, "getPaymentTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPaymentOrderUseCase, "getPaymentOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPayOnlineUseCase, "getPayOnlineUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkDeviceUseCase, "checkDeviceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDeviceInfoUseCase, "getDeviceInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIpAddressUseCase, "getIpAddressUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderScreenInteractor, "orderScreenInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bankAuthenticationContract, "bankAuthenticationContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSdkAuthUseCase, "getSdkAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentTokenFraudMonReviewUseCase, "paymentTokenFraudMonReviewUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lazyNetworkModule, "lazyNetworkModule");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getLocalSessionIdUseCase, "getLocalSessionIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(seamlessAuthFeature, "seamlessAuthFeature");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getBindingSessionIdUseCase, "getBindingSessionIdUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createBindingOtpUseCase, "createBindingOtpUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payBindingUseCase, "payBindingUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(secureSharedPreferences, "secureSharedPreferences");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appNameUtil, "appNameUtil");
        this.f55931iobyxmoadg = sPayStorage;
        this.f55956zoijcleaow = sPayDataContract;
        this.f55946ppxfxbqfkf = getSessionIdUseCase;
        this.f55950wkgbmnqykc = getPaymentTokenUseCase;
        this.f55925eablkybsjg = getPaymentOrderUseCase;
        this.f55928gxszxtbevo = getPayOnlineUseCase;
        this.f55940lqeggnwhkg = checkDeviceUseCase;
        this.f55941nufgyqmvbu = getDeviceInfoUseCase;
        this.f55924dxjokdxxww = getIpAddressUseCase;
        this.f55920btonecajqb = orderScreenInteractor;
        this.f55927gtknphoqwx = featuresHandler;
        this.f55923draadjrbmk = bankAuthenticationContract;
        this.f55949wflxmlrfwp = sPaySdkReducer;
        this.f55919agtfadlqog = getSdkAuthUseCase;
        this.f55942ojitshcjhn = authHandler;
        this.f55947rgvfuqvkyq = paymentTokenFraudMonReviewUseCase;
        this.f55948vdvldrhtss = resourceManager;
        this.f55943oxmwwwfdhm = metricFacade;
        this.f55937kcexrzcfyt = sslInteractor;
        this.f55955zdlpuopuiu = lazyNetworkModule;
        this.f55953yggfygwlhe = getLocalSessionIdUseCase;
        this.f55936jyumaefscl = seamlessAuthFeature;
        this.f55934iwizpuwonk = getBindingSessionIdUseCase;
        this.f55922cqumvgiudr = createBindingOtpUseCase;
        this.f55926esjtqupxsv = payBindingUseCase;
        this.f55938lereixgezr = secureSharedPreferences;
        this.f55945pmvmpeiblj = appNameUtil;
        this.f55933istkbnxepw = sj.kegysxyocb.iobyxmoadg(new hg(d6.f56230iobyxmoadg));
        this.f55921cdpycssgdh = sj.kegysxyocb.iobyxmoadg(new SessionIdResponseBody(null, null, null, null, null, null, null, null, null, null, null, 2047, null));
        this.f55939lmojexxdyd = 30000L;
        this.f55951wwaezpbzkn = 1000L;
        this.f55954ylkuphrtab = new oe0(this);
        this.f55944pkzmftpjix = new ld0(this);
        this.f55929hcddaimhww = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(((ij) sPayStorage).f57056zoijcleaow, new d40(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(sj.jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), null);
        this.f55935jpowsppfya = sj.kegysxyocb.iobyxmoadg(Boolean.FALSE);
        this.f55930hkdspvbjdz = sj.kegysxyocb.iobyxmoadg(null);
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), pj.ikoacuggdj.zoijcleaow(), null, new z20(null, this, sPaySdkConfigRepository, sPaySdkMerchantOptionsRepository), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        if (r0.iobyxmoadg(r1, pj.ikoacuggdj.zoijcleaow(), r2) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object draadjrbmk(kk.b9 r17, spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody.PaymentToolInfo.Tool r18, boolean r19, kotlin.coroutines.jvm.internal.wkgbmnqykc r20) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.b9.draadjrbmk(kk.b9, spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody$PaymentToolInfo$Tool, boolean, kotlin.coroutines.jvm.internal.wkgbmnqykc):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        if (r0.iobyxmoadg(r5, pj.ikoacuggdj.zoijcleaow(), r3) == r4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object gtknphoqwx(kk.b9 r24, kk.dh0 r25, spay.sdk.domain.model.request.SdkAuthRequestBody.AuthMethod r26, kotlin.coroutines.jvm.internal.wkgbmnqykc r27) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.b9.gtknphoqwx(kk.b9, kk.dh0, spay.sdk.domain.model.request.SdkAuthRequestBody$AuthMethod, kotlin.coroutines.jvm.internal.wkgbmnqykc):java.lang.Object");
    }

    @Override // kk.n0
    public final tg.draadjrbmk a() {
        return this.f55954ylkuphrtab;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0305  */
    /* JADX WARN: Code duplicated, block: B:102:0x0308  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0179  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0208  */
    /* JADX WARN: Code duplicated, block: B:69:0x021e  */
    /* JADX WARN: Code duplicated, block: B:72:0x023f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0290  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0302  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0391, code lost:
    
        if (r0 == r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03a5, code lost:
    
        if (vdvldrhtss(r0, r7) == r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x045a, code lost:
    
        if (zdlpuopuiu(r7) == r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r0 == r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02f8, code lost:
    
        if (r0 == r8) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object agtfadlqog(kk.ln r21, kk.m60 r22, kk.ka r23, lg.gxszxtbevo r24) throws java.security.NoSuchAlgorithmException, java.io.IOException, java.security.KeyStoreException, java.security.cert.CertificateException, java.security.KeyManagementException {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.b9.agtfadlqog(kk.ln, kk.m60, kk.ka, lg.gxszxtbevo):java.lang.Object");
    }

    @Override // kk.n0
    public final tg.iobyxmoadg b() {
        return this.f55944pkzmftpjix;
    }

    public final MerchantData jyumaefscl() {
        MerchantData merchantData = ((auzgnhcxok) this.f55956zoijcleaow).f55859lmojexxdyd;
        if (merchantData != null) {
            return merchantData;
        }
        throw Cn.f70541zdlpuopuiu;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ojitshcjhn(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        cc0 cc0Var;
        if (wkgbmnqykcVar instanceof cc0) {
            cc0Var = (cc0) wkgbmnqykcVar;
            int i13 = cc0Var.f56127jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cc0Var.f56127jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                cc0Var = new cc0(this, wkgbmnqykcVar);
            }
        } else {
            cc0Var = new cc0(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = cc0Var.f56129zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cc0Var.f56127jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            if ((((auzgnhcxok) this.f55956zoijcleaow).btonecajqb() instanceof AuthMethod.ByAuthToken) && zd0.iobyxmoadg(this.f55927gtknphoqwx, uc0.SEAMLESS_AUTHORIZATION, null)) {
                ol olVar = this.f55936jyumaefscl;
                cc0Var.f56127jyumaefscl = 1;
                objIobyxmoadg = olVar.iobyxmoadg(cc0Var);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        boolean z13 = ((Boolean) objIobyxmoadg).booleanValue();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }

    public final void oxmwwwfdhm(Uri url) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        fyldjkxazc fyldjkxazcVar = this.f55932iozdgvuglv;
        if (fyldjkxazcVar != null) {
            fyldjkxazcVar.cancel();
        }
        String queryParameter = url.getQueryParameter("state");
        String queryParameter2 = url.getQueryParameter("code");
        dh0 dh0Var = new dh0(Boolean.TRUE, queryParameter, null, queryParameter2, 52);
        if (queryParameter != null && queryParameter.length() != 0 && queryParameter2 != null && queryParameter2.length() != 0) {
            ((ve) this.f55949wflxmlrfwp).zoijcleaow(new nt(dh0Var, SdkAuthRequestBody.AuthMethod.SBOL));
            return;
        }
        n3 block = new n3(this);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        this.f55935jpowsppfya.setValue(Boolean.FALSE);
        jf0 jf0Var = (jf0) this.f55942ojitshcjhn;
        jf0Var.getClass();
        ad0 authDataMode = ad0.ALL;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authDataMode, "authDataMode");
        jf0Var.f57190ppxfxbqfkf = false;
        jf0Var.f57191wkgbmnqykc = false;
        jf0Var.f57192zoijcleaow = true;
        this.f55933istkbnxepw.setValue(new hg(rk.f58446iobyxmoadg));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        if (r7.yggfygwlhe(r2, r0) == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vdvldrhtss(spay.sdk.domain.model.response.SessionIdResponseBody r13, kotlin.coroutines.jvm.internal.wkgbmnqykc r14) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.b9.vdvldrhtss(spay.sdk.domain.model.response.SessionIdResponseBody, kotlin.coroutines.jvm.internal.wkgbmnqykc):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object yggfygwlhe(SessionIdResponseBody sessionIdResponseBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        w6 w6Var;
        b9 b9Var;
        String deeplink;
        String strLqeggnwhkg;
        String str;
        if (wkgbmnqykcVar instanceof w6) {
            w6Var = (w6) wkgbmnqykcVar;
            int i13 = w6Var.f59097iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                w6Var.f59097iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(this, wkgbmnqykcVar);
            }
        } else {
            w6Var = new w6(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = w6Var.f59099yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = w6Var.f59097iwizpuwonk;
        String queryParameter = null;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            z7 block = new z7(this);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
            ol olVar = this.f55936jyumaefscl;
            String clientId = sessionIdResponseBody.getClientId();
            w6Var.f59100zdlpuopuiu = this;
            w6Var.f59097iwizpuwonk = 1;
            zz zzVar = olVar.f57972iobyxmoadg;
            if (zzVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("getApp2SdkTokenUseCase");
                zzVar = null;
            }
            objIobyxmoadg = zzVar.iobyxmoadg(clientId, "spaysdk://payment", w6Var);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            b9Var = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9Var = w6Var.f59100zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        xl xlVar = (xl) objIobyxmoadg;
        SessionIdResponseBody sessionIdResponseBodyDraadjrbmk = ((auzgnhcxok) b9Var.f55956zoijcleaow).draadjrbmk();
        if (sessionIdResponseBodyDraadjrbmk != null && (deeplink = sessionIdResponseBodyDraadjrbmk.getDeeplink()) != null && (strLqeggnwhkg = ir.lqeggnwhkg(deeplink)) != null) {
            Uri sessionIdDeeplink = Uri.parse(strLqeggnwhkg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sessionIdDeeplink, "parse(this)");
            if (sessionIdDeeplink != null) {
                ol olVar2 = b9Var.f55936jyumaefscl;
                MerchantData merchantData = ((auzgnhcxok) b9Var.f55956zoijcleaow).f55859lmojexxdyd;
                if (merchantData == null) {
                    throw Cn.f70541zdlpuopuiu;
                }
                String appPackage = merchantData.getAppPackage();
                olVar2.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionIdDeeplink, "sessionIdDeeplink");
                if (xlVar != null && (str = xlVar.f59311iobyxmoadg) != null) {
                    Uri uri = Uri.parse(str);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri, "parse(this)");
                    if (uri != null) {
                        queryParameter = uri.getQueryParameter("token");
                    }
                }
                String queryParameter2 = sessionIdDeeplink.getQueryParameter("client_id");
                if (queryParameter2 == null) {
                    queryParameter2 = "-1";
                }
                String queryParameter3 = sessionIdDeeplink.getQueryParameter("scope");
                if (queryParameter3 == null) {
                    queryParameter3 = "-1";
                }
                String queryParameter4 = sessionIdDeeplink.getQueryParameter("state");
                if (queryParameter4 == null) {
                    queryParameter4 = "-1";
                }
                String queryParameter5 = sessionIdDeeplink.getQueryParameter("nonce");
                if (queryParameter5 == null) {
                    queryParameter5 = "-1";
                }
                String queryParameter6 = sessionIdDeeplink.getQueryParameter("code_challenge");
                String str2 = queryParameter6 == null ? "-1" : queryParameter6;
                String queryParameter7 = sessionIdDeeplink.getQueryParameter("code_challenge_method");
                b9 b9Var2 = b9Var;
                String str3 = queryParameter7 == null ? "-1" : queryParameter7;
                String queryParameter8 = sessionIdDeeplink.getQueryParameter("redirect_uri");
                if (queryParameter8 == null) {
                    queryParameter8 = "-1";
                }
                String str4 = queryParameter;
                Uri.Builder builderScheme = new Uri.Builder().scheme(HostSelectionInterceptorImpl.PROTOCOL_HTTPS);
                String str5 = "aWQtaWZ0LnNiZXIucnU=";
                switch (lq.iobyxmoadg(ag.f55814zoijcleaow)) {
                    case 0:
                    case 5:
                    case 6:
                        str5 = "aWQuc2Jlci5ydQ==";
                        break;
                    case 1:
                        str5 = "aWQtcHNpLnNiZXIucnU=";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Uri uriBuild = builderScheme.authority(ir.ppxfxbqfkf(str5)).path("CSAFront/oidc/authorize.do").appendQueryParameter("client_id", queryParameter2).appendQueryParameter("scope", queryParameter3).appendQueryParameter("code_challenge_method", str3).appendQueryParameter("nonce", queryParameter5).appendQueryParameter("state", queryParameter4).appendQueryParameter("code_challenge", str2).appendQueryParameter("redirect_uri", queryParameter8).appendQueryParameter("response_type", "code").appendQueryParameter("token", str4).appendQueryParameter("package", appPackage).build();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uriBuild, "Builder()\n            .s…age)\n            .build()");
                b9Var2.f55935jpowsppfya.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                sj.zynmafqrjb zynmafqrjbVar = b9Var2.f55933istkbnxepw;
                String string = uriBuild.toString();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "uri.toString()");
                zynmafqrjbVar.setValue(new hg(new q0(string)));
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        throw npi.spay.ip.f70575zdlpuopuiu;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zdlpuopuiu(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        di0 di0Var;
        b9 b9Var;
        if (wkgbmnqykcVar instanceof di0) {
            di0Var = (di0) wkgbmnqykcVar;
            int i13 = di0Var.f56297iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                di0Var.f56297iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                di0Var = new di0(this, wkgbmnqykcVar);
            }
        } else {
            di0Var = new di0(this, wkgbmnqykcVar);
        }
        Object obj = di0Var.f56299yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = di0Var.f56297iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            xs xsVar = this.f55952yadqdtsiqt;
            if (xsVar != null) {
                dj djVar = this.f55947rgvfuqvkyq;
                String authorization = xsVar.f59342iobyxmoadg;
                PaymentTokenRequestBody paymentTokenRequestBody = PaymentTokenRequestBody.copy$default(xsVar.f59343zoijcleaow, null, null, 0, null, null, false, ((auzgnhcxok) this.f55956zoijcleaow).f55866rgvfuqvkyq, 63, null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authorization, "authorization");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentTokenRequestBody, "paymentTokenRequestBody");
                di0Var.f56300zdlpuopuiu = this;
                di0Var.f56297iwizpuwonk = 1;
                pj.ikoacuggdj.zoijcleaow();
                djVar.getClass();
                Object objOjitshcjhn = ((o70) djVar.f56301iobyxmoadg).ojitshcjhn(paymentTokenRequestBody, di0Var);
                if (objOjitshcjhn != mg.zoijcleaow.gxszxtbevo()) {
                    objOjitshcjhn = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (objOjitshcjhn == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            b9Var = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9Var = di0Var.f56300zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        ((ve) b9Var.f55949wflxmlrfwp).zoijcleaow(ec0.f56401iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
