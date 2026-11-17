package kk;

import kotlin.NoWhenBranchMatchedException;
import npi.spay.Cn;
import npi.spay.Mn;
import spay.sdk.R;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq extends u0 {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final sj.zynmafqrjb f58335agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final btonecajqb f58336btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final sj.wypolnanlu f58337cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final sj.zynmafqrjb f58338draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final q40 f58339dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final xf f58340eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public final sj.zynmafqrjb f58341esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public fyldjkxazc f58342gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final c90 f58343gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final sj.zynmafqrjb f58344iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final sj.wypolnanlu f58345jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public final String f58346kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final sj.wypolnanlu f58347lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final k8 f58348lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final a4 f58349nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public final sj.wypolnanlu f58350ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public final String f58351oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public final sj.wypolnanlu f58352pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public final of0 f58353rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public final ie0 f58354vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final long f58355wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f58356wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final sj.zynmafqrjb f58357yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final sj.wypolnanlu f58358zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public final sj.wypolnanlu f58359zynmafqrjb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgvfuqvkyq(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage, c90 confirmOtpCodeUseCase, k8 createOtpSdkCodeUseCase, a4 createBindingOtpUseCase, q40 confirmBindingOtpCodeUseCase, btonecajqb hashUtility) {
        String str;
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(confirmOtpCodeUseCase, "confirmOtpCodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createOtpSdkCodeUseCase, "createOtpSdkCodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createBindingOtpUseCase, "createBindingOtpUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(confirmBindingOtpCodeUseCase, "confirmBindingOtpCodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hashUtility, "hashUtility");
        this.f58356wkgbmnqykc = sPaySdkReducer;
        this.f58340eablkybsjg = sPayStorage;
        this.f58343gxszxtbevo = confirmOtpCodeUseCase;
        this.f58348lqeggnwhkg = createOtpSdkCodeUseCase;
        this.f58349nufgyqmvbu = createBindingOtpUseCase;
        this.f58339dxjokdxxww = confirmBindingOtpCodeUseCase;
        this.f58336btonecajqb = hashUtility;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(45000L);
        this.f58338draadjrbmk = zynmafqrjbVarIobyxmoadg;
        this.f58355wflxmlrfwp = 1000L;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg2 = sj.kegysxyocb.iobyxmoadg(new hg(null));
        this.f58335agtfadlqog = zynmafqrjbVarIobyxmoadg2;
        this.f58350ojitshcjhn = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
        this.f58353rgvfuqvkyq = new of0(this);
        this.f58354vdvldrhtss = new ie0(this);
        sj.lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = sj.dxjokdxxww.cllcsxoeiz(((auzgnhcxok) sPayDataContract).f55843btonecajqb, new fd0(null));
        pj.cllcsxoeiz cllcsxoeizVarIobyxmoadg = androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this);
        sj.jpowsppfya.iobyxmoadg iobyxmoadgVar = sj.jpowsppfya.f106926iobyxmoadg;
        sj.dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg3 = sj.kegysxyocb.iobyxmoadg(null);
        this.f58358zdlpuopuiu = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg3);
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg4 = sj.kegysxyocb.iobyxmoadg(null);
        this.f58357yggfygwlhe = zynmafqrjbVarIobyxmoadg4;
        sj.wypolnanlu wypolnanluVarZoijcleaow = sj.dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg4);
        this.f58345jyumaefscl = wypolnanluVarZoijcleaow;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg5 = sj.kegysxyocb.iobyxmoadg(null);
        this.f58344iwizpuwonk = zynmafqrjbVarIobyxmoadg5;
        Boolean bool = Boolean.TRUE;
        this.f58337cqumvgiudr = sj.dxjokdxxww.zoijcleaow(sj.kegysxyocb.iobyxmoadg(bool));
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg6 = sj.kegysxyocb.iobyxmoadg(null);
        this.f58341esjtqupxsv = zynmafqrjbVarIobyxmoadg6;
        this.f58347lereixgezr = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(sj.dxjokdxxww.lereixgezr(zynmafqrjbVarIobyxmoadg6), new sg0(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.f58352pmvmpeiblj = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.wflxmlrfwp(zynmafqrjbVarIobyxmoadg5, wypolnanluVarZoijcleaow, new wb0(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), Boolean.FALSE);
        this.f58359zynmafqrjb = sj.dxjokdxxww.ribwqtqdhb(sj.dxjokdxxww.cllcsxoeiz(zynmafqrjbVarIobyxmoadg, new xh0(null)), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), new m10(R.string.spay_empty_string, null, 0, null, 30));
        ij ijVar = (ij) sPayStorage;
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof zb0)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.OneTimePassword");
        zb0 zb0Var = (zb0) hlVar;
        zynmafqrjbVarIobyxmoadg.setValue(Long.valueOf(zb0Var.f59566zoijcleaow));
        jd jdVar = zb0Var.f59565iobyxmoadg;
        if (jdVar instanceof t7) {
            String str2 = jdVar.f57179iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str2);
            this.f58351oxmwwwfdhm = str2;
            this.f58346kcexrzcfyt = ((t7) zb0Var.f59565iobyxmoadg).f58625ppxfxbqfkf;
            zynmafqrjbVarIobyxmoadg2.setValue(new hg(bool));
        } else if (jdVar instanceof eslsurpljm) {
            eslsurpljm eslsurpljmVar = (eslsurpljm) jdVar;
            this.f58351oxmwwwfdhm = eslsurpljmVar.f56462ppxfxbqfkf;
            zynmafqrjbVarIobyxmoadg4.setValue(eslsurpljmVar.f56463zoijcleaow);
        } else if (jdVar instanceof g3) {
            g3 g3Var = (g3) jdVar;
            this.f58351oxmwwwfdhm = g3Var.f56624ppxfxbqfkf;
            zynmafqrjbVarIobyxmoadg4.setValue(g3Var.f56625zoijcleaow);
            zynmafqrjbVarIobyxmoadg2.setValue(new hg(bool));
        } else if ((jdVar instanceof b0) && !(((auzgnhcxok) this.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding)) {
            ((ve) sPaySdkReducer).zoijcleaow(new pm(ek.f56434iobyxmoadg, false));
        }
        int i13 = R.string.spay_otp_code_sent_message;
        String str3 = this.f58351oxmwwwfdhm;
        if (str3 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("mobilePhone");
            str = null;
        } else {
            str = str3;
        }
        Object[] args = {str};
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(args, "args");
        zynmafqrjbVarIobyxmoadg3.setValue(new ms(i13, hg.agtfadlqog.i(args)));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0098 A[PHI: r1
      0x0098: PHI (r1v63 java.lang.String) = (r1v42 java.lang.String), (r1v64 java.lang.String) binds: [B:27:0x00ac, B:20:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    public final void agtfadlqog(e2 event) {
        ja jaVar;
        String cardNumber;
        String str;
        d9 d9Var;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, wh0.f59167iobyxmoadg)) {
            ow event2 = new ow(nf0.TOUCH_BACK, we0.OTP_VIEW, mp.TOUCH, null, null, null, null, 120);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event2, "event");
            this.f56062iobyxmoadg.iobyxmoadg(event2);
            ((ve) this.f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
            return;
        }
        String str2 = null;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ojitshcjhn.f57965iobyxmoadg)) {
            if (event instanceof stevsuqkhv) {
                String str3 = ((stevsuqkhv) event).f58580iobyxmoadg;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, this.f58344iwizpuwonk.getValue())) {
                    this.f58357yggfygwlhe.setValue(null);
                    ((ve) this.f58356wkgbmnqykc).zoijcleaow(new oc());
                }
                this.f58344iwizpuwonk.setValue(str3);
                return;
            }
            if (event instanceof opjhrmiecq) {
                this.f58341esjtqupxsv.setValue(((opjhrmiecq) event).f57989iobyxmoadg);
                return;
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, c1.f56076iobyxmoadg)) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, yzdjzghtvl.f59500iobyxmoadg)) {
                    ow event3 = new ow(nf0.LC_OTP_VIEW_APPEARED, we0.OTP_VIEW, mp.LC, null, null, null, null, 120);
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event3, "event");
                    this.f56062iobyxmoadg.iobyxmoadg(event3);
                    return;
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, a0.f55759iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ow event4 = new ow(nf0.LC_OTP_VIEW_DISAPPEARED, we0.OTP_VIEW, mp.LC, null, null, null, null, 120);
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event4, "event");
                    this.f56062iobyxmoadg.iobyxmoadg(event4);
                    return;
                }
            }
            if (((auzgnhcxok) this.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding) {
                jaVar = new ja(new k80(this, ((auzgnhcxok) this.f56063zoijcleaow).gtknphoqwx()));
            } else {
                ListOfCardsResponseBody.PaymentToolInfo.Tool tool = ((ij) this.f58340eablkybsjg).iobyxmoadg().f57487zoijcleaow;
                if (tool == null) {
                    throw new npi.spay.qd();
                }
                int paymentId = tool.getPaymentId();
                MerchantData merchantData = ((auzgnhcxok) this.f56063zoijcleaow).f55859lmojexxdyd;
                if (merchantData == null) {
                    throw Cn.f70541zdlpuopuiu;
                }
                jaVar = new ja(new ra0(this, new n9(merchantData.getAuthorization(), new CreateOtpSdkRequestBody(merchantData.getOrderId(), ((auzgnhcxok) this.f56063zoijcleaow).gtknphoqwx(), paymentId))));
            }
            ((ve) this.f58356wkgbmnqykc).zoijcleaow(jaVar);
            return;
        }
        ow event5 = new ow(nf0.TOUCH_NEXT, we0.OTP_VIEW, mp.TOUCH, null, null, null, null, 120);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event5, "event");
        this.f56062iobyxmoadg.iobyxmoadg(event5);
        MerchantData merchantData2 = ((auzgnhcxok) this.f56063zoijcleaow).f55859lmojexxdyd;
        if (merchantData2 == null) {
            throw Cn.f70541zdlpuopuiu;
        }
        if (merchantData2.getBindingId() == null && (((auzgnhcxok) this.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding)) {
            throw new npi.spay.nd();
        }
        this.f58335agtfadlqog.setValue(new hg(Boolean.FALSE));
        String str4 = "";
        if (((auzgnhcxok) this.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding) {
            cardNumber = this.f58346kcexrzcfyt;
            if (cardNumber != null) {
                str4 = cardNumber;
            }
        } else {
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((ij) this.f58340eablkybsjg).iobyxmoadg().f57487zoijcleaow;
            cardNumber = tool2 != null ? tool2.getCardNumber() : null;
            if (cardNumber != null) {
                str4 = cardNumber;
            }
        }
        String strDraadjrbmk = draadjrbmk(str4);
        if (((auzgnhcxok) this.f56063zoijcleaow).btonecajqb() instanceof PayStrategy.PayWithBinding) {
            ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody = new ConfirmBindingOtpRequestBody(strDraadjrbmk, ((auzgnhcxok) this.f56063zoijcleaow).gtknphoqwx());
            String str5 = this.f58351oxmwwwfdhm;
            if (str5 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("mobilePhone");
            } else {
                str2 = str5;
            }
            d9Var = new d9(new x30(this, new u50(confirmBindingOtpRequestBody, str2, ((Number) this.f58338draadjrbmk.getValue()).longValue())));
        } else {
            MerchantData merchantData3 = ((auzgnhcxok) this.f56063zoijcleaow).f55859lmojexxdyd;
            if (merchantData3 == null) {
                throw Cn.f70541zdlpuopuiu;
            }
            String authorization = merchantData3.getAuthorization();
            ConfirmOtpRequestBody confirmOtpRequestBody = new ConfirmOtpRequestBody(merchantData3.getOrderId(), null, null, strDraadjrbmk, null, merchantData3.getMerchantLogin(), ((auzgnhcxok) this.f56063zoijcleaow).gtknphoqwx(), 22, null);
            String str6 = this.f58351oxmwwwfdhm;
            if (str6 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("mobilePhone");
                str = null;
            } else {
                str = str6;
            }
            d9Var = new d9(new d60(this, new ga0(authorization, confirmOtpRequestBody, str, ((Number) this.f58338draadjrbmk.getValue()).longValue())));
        }
        ((ve) this.f58356wkgbmnqykc).zoijcleaow(d9Var);
    }

    public final String draadjrbmk(String str) {
        String str2;
        String str3 = (String) this.f58344iwizpuwonk.getValue();
        if (str3 == null || str3.length() != 5) {
            if (this.f58344iwizpuwonk.getValue() == null) {
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("OTP CODE GENERATION EXCEPTION").zoijcleaow("Trying to generate hash code from null entered code string", new Object[0]);
                return "";
            }
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("OTP CODE GENERATION EXCEPTION").zoijcleaow("Trying to generate hash code from wrong length string " + this.f58344iwizpuwonk.getValue(), new Object[0]);
            return "";
        }
        if (ag.f55814zoijcleaow == 5) {
            str2 = "119950526";
        } else {
            String str4 = (String) this.f58344iwizpuwonk.getValue();
            if (str4 == null) {
                str4 = "";
            }
            str2 = str4 + str;
        }
        this.f58336btonecajqb.getClass();
        String strIobyxmoadg = btonecajqb.iobyxmoadg(str2);
        return strIobyxmoadg == null ? "" : strIobyxmoadg;
    }

    @Override // kk.bw
    public final void gtknphoqwx(xu viewState) {
        fyldjkxazc fyldjkxazcVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewState, "event");
        super.gtknphoqwx(viewState);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewState, "viewState");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(viewState, os.f57991iobyxmoadg)) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(viewState, cp.f56177iobyxmoadg) || (fyldjkxazcVar = this.f58342gtknphoqwx) == null) {
                return;
            }
            fyldjkxazcVar.cancel();
            return;
        }
        long j13 = this.f58355wflxmlrfwp;
        this.f58338draadjrbmk.setValue(Long.valueOf(((Number) this.f58338draadjrbmk.getValue()).longValue()));
        fyldjkxazc fyldjkxazcVar2 = new fyldjkxazc(((Number) this.f58338draadjrbmk.getValue()).longValue(), j13, new q(this), new s0(this));
        this.f58342gtknphoqwx = fyldjkxazcVar2;
        fyldjkxazcVar2.start();
        fyldjkxazc fyldjkxazcVar3 = this.f58342gtknphoqwx;
        if (fyldjkxazcVar3 != null) {
            fyldjkxazcVar3.start();
        }
    }
}
