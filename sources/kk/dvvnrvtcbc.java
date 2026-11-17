package kk;

import npi.spay.Cn;
import npi.spay.Dn;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class dvvnrvtcbc extends ed {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final d80 f56334agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final qz f56335btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final boolean f56336cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final fj f56337draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final g4 f56338dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final xf f56339eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final k8 f56340gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final pc f56341gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public PaymentResult f56342iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public sd f56343jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final sj.wypolnanlu f56344kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final de0 f56345lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final hf0 f56346nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final wc0 f56347ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final sj.zynmafqrjb f56348oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final m60 f56349rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final tc f56350vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final wy f56351wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final sj.wypolnanlu f56352yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final sj.wypolnanlu f56353zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvvnrvtcbc(xf sPayStorage, jlmebxxoox sPayDataContract, pc sPaySdkReducer, bt metricFacade, h7 clearUtil, de0 authHandler, hf0 fullEmissionUseCase, g4 bankAuthenticator, qz biometricAuthenticator, k8 createSdkOtpCodeUseCase, fj resourceManager, wy appNameUtil, d80 getDeviceInfoUseCase, wc0 featuresHandler, ka spaySdkMerchantOptionsRepository, m60 sPaySdkConfigRepository, tc userIdManager) {
        super(metricFacade, sPayDataContract, clearUtil, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearUtil, "clearUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fullEmissionUseCase, "fullEmissionUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bankAuthenticator, "bankAuthenticator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(biometricAuthenticator, "biometricAuthenticator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createSdkOtpCodeUseCase, "createSdkOtpCodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appNameUtil, "appNameUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDeviceInfoUseCase, "getDeviceInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spaySdkMerchantOptionsRepository, "spaySdkMerchantOptionsRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userIdManager, "userIdManager");
        this.f56339eablkybsjg = sPayStorage;
        this.f56341gxszxtbevo = sPaySdkReducer;
        this.f56345lqeggnwhkg = authHandler;
        this.f56346nufgyqmvbu = fullEmissionUseCase;
        this.f56338dxjokdxxww = bankAuthenticator;
        this.f56335btonecajqb = biometricAuthenticator;
        this.f56340gtknphoqwx = createSdkOtpCodeUseCase;
        this.f56337draadjrbmk = resourceManager;
        this.f56351wflxmlrfwp = appNameUtil;
        this.f56334agtfadlqog = getDeviceInfoUseCase;
        this.f56347ojitshcjhn = featuresHandler;
        this.f56349rgvfuqvkyq = sPaySdkConfigRepository;
        this.f56350vdvldrhtss = userIdManager;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(new hg(new qd0(d6.f56230iobyxmoadg)));
        this.f56348oxmwwwfdhm = zynmafqrjbVarIobyxmoadg;
        this.f56344kcexrzcfyt = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        ij ijVar = (ij) sPayStorage;
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(ijVar.f57056zoijcleaow, new vipkmwdibw(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        this.f56353zdlpuopuiu = sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), Boolean.TRUE);
        this.f56352yggfygwlhe = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(ijVar.f57056zoijcleaow, new yf0(this, sPayDataContract, null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        SPaySdkInitConfig sPaySdkInitConfig = ((nb) spaySdkMerchantOptionsRepository).f57752iobyxmoadg;
        if (sPaySdkInitConfig == null) {
            throw Dn.f70543zdlpuopuiu;
        }
        this.f56336cqumvgiudr = sPaySdkInitConfig.getEnableOutsideTouchCancelling();
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), pj.ikoacuggdj.iobyxmoadg(), null, new se0(this, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object draadjrbmk(dvvnrvtcbc dvvnrvtcbcVar, a10 a10Var, y0 y0Var, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        esjtqupxsv esjtqupxsvVar;
        SdkAuthRequestBody sdkAuthRequestBody;
        String authorization;
        ListOfCardsRequestBody listOfCardsRequestBody;
        a10 a10Var2;
        String str;
        MerchantData merchantData;
        ListOfCardsRequestBody listOfCardsRequestBody2;
        String str2;
        String str3;
        String str4;
        dvvnrvtcbcVar.getClass();
        if (wkgbmnqykcVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) wkgbmnqykcVar;
            int i13 = esjtqupxsvVar.f56454istkbnxepw;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f56454istkbnxepw = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(dvvnrvtcbcVar, wkgbmnqykcVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(dvvnrvtcbcVar, wkgbmnqykcVar);
        }
        Object obj = esjtqupxsvVar.f56458pmvmpeiblj;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar.f56454istkbnxepw;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sdkAuthRequestBody = null;
            if (((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding) {
                return null;
            }
            MerchantData merchantData2 = ((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).f55859lmojexxdyd;
            if (merchantData2 == null) {
                throw Cn.f70541zdlpuopuiu;
            }
            authorization = merchantData2.getAuthorization();
            listOfCardsRequestBody = new ListOfCardsRequestBody(((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).gtknphoqwx(), merchantData2.getMerchantLogin(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false), merchantData2.getOrderId());
            if (y0Var != null) {
                dh0 dh0Var = (dh0) y0Var.f59357iobyxmoadg;
                String strGtknphoqwx = ((auzgnhcxok) dvvnrvtcbcVar.f56063zoijcleaow).gtknphoqwx();
                String str5 = dh0Var != null ? dh0Var.f56295zoijcleaow : null;
                d80 d80Var = dvvnrvtcbcVar.f56334agtfadlqog;
                esjtqupxsvVar.f56460zdlpuopuiu = merchantData2;
                esjtqupxsvVar.f56459yggfygwlhe = listOfCardsRequestBody;
                esjtqupxsvVar.f56456jyumaefscl = a10Var;
                esjtqupxsvVar.f56455iwizpuwonk = authorization;
                esjtqupxsvVar.f56452cqumvgiudr = str5;
                esjtqupxsvVar.f56453esjtqupxsv = strGtknphoqwx;
                esjtqupxsvVar.f56457lereixgezr = "spaysdk://payment";
                esjtqupxsvVar.f56454istkbnxepw = 1;
                Object objIobyxmoadg = d80Var.iobyxmoadg(pj.ikoacuggdj.zoijcleaow(), esjtqupxsvVar);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str = str5;
                merchantData = merchantData2;
                a10Var2 = a10Var;
                obj = objIobyxmoadg;
                listOfCardsRequestBody2 = listOfCardsRequestBody;
                str2 = strGtknphoqwx;
                str3 = "spaysdk://payment";
                str4 = authorization;
            } else {
                a10Var2 = a10Var;
            }
            return new lg0(authorization, a10Var2, listOfCardsRequestBody, sdkAuthRequestBody);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str6 = esjtqupxsvVar.f56457lereixgezr;
        String str7 = esjtqupxsvVar.f56453esjtqupxsv;
        String str8 = esjtqupxsvVar.f56452cqumvgiudr;
        str4 = esjtqupxsvVar.f56455iwizpuwonk;
        a10Var2 = esjtqupxsvVar.f56456jyumaefscl;
        ListOfCardsRequestBody listOfCardsRequestBody3 = esjtqupxsvVar.f56459yggfygwlhe;
        merchantData = esjtqupxsvVar.f56460zdlpuopuiu;
        gg.zdlpuopuiu.zoijcleaow(obj);
        str3 = str6;
        str2 = str7;
        str = str8;
        listOfCardsRequestBody2 = listOfCardsRequestBody3;
        SdkAuthRequestBody sdkAuthRequestBody2 = new SdkAuthRequestBody(str3, null, str2, str, (String) obj, merchantData.getOrderId(), merchantData.getMerchantLogin(), merchantData.getAppPackage(), SdkAuthRequestBody.AuthMethod.SBOL.getValue(), 2, null);
        listOfCardsRequestBody = listOfCardsRequestBody2;
        authorization = str4;
        sdkAuthRequestBody = sdkAuthRequestBody2;
        return new lg0(authorization, a10Var2, listOfCardsRequestBody, sdkAuthRequestBody);
    }

    public final void agtfadlqog(sh0 authResult) {
        kz za0Var;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authResult, "authResult");
        if (!authResult.a()) {
            ((ve) this.f56341gxszxtbevo).zoijcleaow(wf.f59159iobyxmoadg);
            return;
        }
        jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("FullEmissionAuthResult").iobyxmoadg("authResult: " + authResult, new Object[0]);
        if (authResult instanceof y0) {
            za0Var = new za0(ek.f56434iobyxmoadg, authResult, true);
        } else {
            za0Var = authResult instanceof fx ? new za0(ek.f56434iobyxmoadg, null, false) : zw.f59634iobyxmoadg;
        }
        ((ve) this.f56341gxszxtbevo).zoijcleaow(za0Var);
    }

    @Override // kk.ed, kk.bw
    public final void gtknphoqwx(xu event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        super.gtknphoqwx(event);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, bc.f55967iobyxmoadg)) {
            od0 od0Var = r80.f58284ppxfxbqfkf;
            if (od0Var != null) {
                Object cancel = this.f56342iwizpuwonk;
                if (cancel == null) {
                    boolean z13 = ((auzgnhcxok) this.f56063zoijcleaow).f55853iozdgvuglv.getValue() instanceof BnplMethod;
                    cancel = new PaymentResult.Cancel(this.f56350vdvldrhtss.iobyxmoadg(), (String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) this.f56063zoijcleaow).f55858lereixgezr).getValue());
                }
                od0Var.invoke(cancel);
            }
            if (!(((ij) this.f56339eablkybsjg).iobyxmoadg().f57485iobyxmoadg instanceof yq)) {
                ((ve) this.f56341gxszxtbevo).zoijcleaow(ec0.f56401iobyxmoadg);
            }
            q8 q8Var = this.f56402ppxfxbqfkf;
            if (q8Var != null) {
                q8Var.invoke();
            }
        }
    }

    public final Boolean ojitshcjhn() {
        cr crVar = this.f56347ojitshcjhn.f59130zoijcleaow;
        if (crVar != null) {
            return Boolean.valueOf(crVar.f56181iobyxmoadg);
        }
        return null;
    }
}
