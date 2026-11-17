package spay.sdk;

import ag.dxjokdxxww;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.content.iobyxmoadg;
import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.List;
import kk.a2;
import kk.a20;
import kk.ac;
import kk.ar;
import kk.auzgnhcxok;
import kk.b80;
import kk.bq;
import kk.bt;
import kk.de0;
import kk.df0;
import kk.fc0;
import kk.g4;
import kk.gi0;
import kk.gxszxtbevo;
import kk.h7;
import kk.ii0;
import kk.jhduphickx;
import kk.jlmebxxoox;
import kk.m60;
import kk.mh0;
import kk.mp;
import kk.ng0;
import kk.od0;
import kk.ow;
import kk.pc;
import kk.pr;
import kk.r80;
import kk.re0;
import kk.rj;
import kk.sc;
import kk.tc;
import kk.tk;
import kk.w30;
import kk.w90;
import kk.we0;
import kk.xf0;
import kk.xr;
import kk.xt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Cn;
import npi.spay.Gn;
import pj.ikoacuggdj;
import spay.sdk.api.ErrorCode;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SdkReadyCheckResult;
import spay.sdk.api.model.SPaymentRequest;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.utils.permissions.PermissionsActivity;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w90 f107839f = new w90();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile c f107840g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jlmebxxoox f107841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h7 f107842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tc f107843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g4 f107844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bt f107845e;

    public c() {
        bq sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent();
        this.f107845e = sdkComponent != null ? ((tk) sdkComponent).zoijcleaow() : null;
        a();
    }

    public final synchronized void a() {
        bq sdkComponent;
        try {
            if (r80.f58286zoijcleaow == null && (sdkComponent = SPaySdkApp.INSTANCE.getInstance().getSdkComponent()) != null) {
                r80.f58286zoijcleaow = new rj(((tk) sdkComponent).f58703wkgbmnqykc, new gxszxtbevo(), new pr(), new ng0(), new a20(), new mh0(), new w30(), new sc(), new ac(), new xt(), new b80());
            }
            rj rjVar = r80.f58286zoijcleaow;
            if (rjVar != null) {
                this.f107841a = (jlmebxxoox) rjVar.f58386iobyxmoadg.f58688gtknphoqwx.get();
                this.f107842b = rjVar.iobyxmoadg();
                this.f107843c = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
                jlmebxxoox jlmebxxooxVar = (jlmebxxoox) rjVar.f58386iobyxmoadg.f58688gtknphoqwx.get();
                bt btVarZoijcleaow = rjVar.f58386iobyxmoadg.zoijcleaow();
                a2 a2Var = (a2) rjVar.f58380esjtqupxsv.get();
                de0 de0Var = (de0) rjVar.f58386iobyxmoadg.f58687esjtqupxsv.get();
                pc pcVar = (pc) rjVar.f58369btonecajqb.get();
                m60 m60Var = (m60) rjVar.f58432wkgbmnqykc.get();
                ii0 ii0Var = rjVar.f58386iobyxmoadg.f58706zoijcleaow;
                this.f107844d = new g4(jlmebxxooxVar, btVarZoijcleaow, a2Var, de0Var, pcVar, m60Var, (jhduphickx) dxjokdxxww.eablkybsjg(new jhduphickx()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final SdkReadyCheckResult b(Context context) {
        if (this.f107844d != null) {
            return (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || Settings.Global.getInt(context.getContentResolver(), "always_finish_activities", 0) == 0) ? SdkReadyCheckResult.Ready.INSTANCE : new SdkReadyCheckResult.NotReady("Not ready for SPaySdk.");
        }
        throw Gn.f70546zdlpuopuiu;
    }

    public final void a(Context context, draadjrbmk callback) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(callback, "callback");
        r80.f58285wkgbmnqykc++;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            callback.invoke(b(context));
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
            pj.dxjokdxxww.eablkybsjg(ikoacuggdj.zoijcleaow(), new fc0(context, callback, this, null));
        } else {
            kcexrzcfyt.draadjrbmk(objWkgbmnqykc);
        }
    }

    public final void a(SPayMethod sPayMethod, SPaymentRequest sPaymentRequest) {
        Object status;
        df0 df0Var;
        zdlpuopuiu.btonecajqb(sPayMethod, "sPayMethod");
        zdlpuopuiu.btonecajqb(sPaymentRequest, "sPaymentRequest");
        draadjrbmk callback = sPaymentRequest.getCallback();
        jlmebxxoox jlmebxxooxVar = null;
        tc tcVar = null;
        tc tcVar2 = null;
        tc tcVar3 = null;
        if (r80.f58285wkgbmnqykc < 1) {
            if (callback != null) {
                tc tcVar4 = this.f107843c;
                if (tcVar4 == null) {
                    zdlpuopuiu.pmvmpeiblj("userIdManager");
                    tcVar4 = null;
                }
                callback.invoke(new PaymentResult.Error(tcVar4.iobyxmoadg(), "000000000000", new MerchantError.IsReadyCheckHasNotBeenCalled(null, 1, null)));
                return;
            }
            return;
        }
        String apiKey = sPaymentRequest.getApiKey();
        String bankInvoiceId = sPaymentRequest.getBankInvoiceId();
        String merchantLogin = sPaymentRequest.getMerchantLogin();
        jlmebxxoox jlmebxxooxVar2 = this.f107841a;
        if (jlmebxxooxVar2 == null) {
            zdlpuopuiu.pmvmpeiblj("sPayDataContract");
            jlmebxxooxVar2 = null;
        }
        if (((auzgnhcxok) jlmebxxooxVar2).f55859lmojexxdyd != null) {
            jlmebxxoox jlmebxxooxVar3 = this.f107841a;
            if (jlmebxxooxVar3 == null) {
                zdlpuopuiu.pmvmpeiblj("sPayDataContract");
                jlmebxxooxVar3 = null;
            }
            MerchantData merchantData = ((auzgnhcxok) jlmebxxooxVar3).f55859lmojexxdyd;
            if (merchantData != null) {
                String authorization = merchantData.getAuthorization();
                String orderId = merchantData.getOrderId();
                String merchantLogin2 = merchantData.getMerchantLogin();
                if (!zdlpuopuiu.eablkybsjg(apiKey, authorization) || !zdlpuopuiu.eablkybsjg(bankInvoiceId, orderId) || !zdlpuopuiu.eablkybsjg(merchantLogin, merchantLogin2)) {
                    h7 h7Var = this.f107842b;
                    if (h7Var == null) {
                        zdlpuopuiu.pmvmpeiblj("clearSdkUtil");
                        h7Var = null;
                    }
                    h7Var.iobyxmoadg(false);
                }
                a();
            } else {
                throw Cn.f70541zdlpuopuiu;
            }
        }
        if (sPaymentRequest.getBankInvoiceId().length() != 32) {
            tc tcVar5 = this.f107843c;
            if (tcVar5 != null) {
                tcVar = tcVar5;
            } else {
                zdlpuopuiu.pmvmpeiblj("userIdManager");
            }
            sPaymentRequest.getCallback().invoke(new PaymentResult.Error(tcVar.iobyxmoadg(), ErrorCode.BANK_INVOICE_ID_VALIDATION_FAILED_ERROR_CODE, new MerchantError.RequiredDataNotSent("Длина bankInvoiceId должна быть 32 символа")));
            return;
        }
        if (sPayMethod instanceof SPayMethod.WithPhoneNumber) {
            String phoneNumber = sPaymentRequest.getPhoneNumber();
            if (phoneNumber != null && !mj.kcexrzcfyt.zfvoamnweg(phoneNumber)) {
                if (phoneNumber.length() != 11 || !TextUtils.isDigitsOnly(phoneNumber) || !mj.kcexrzcfyt.stevsuqkhv(phoneNumber, "7", false, 2, null)) {
                    tc tcVar6 = this.f107843c;
                    if (tcVar6 != null) {
                        tcVar2 = tcVar6;
                    } else {
                        zdlpuopuiu.pmvmpeiblj("userIdManager");
                    }
                    sPaymentRequest.getCallback().invoke(new PaymentResult.Error(tcVar2.iobyxmoadg(), ErrorCode.PHONE_NUMBER_VALIDATION_FAILED_ERROR_CODE, new MerchantError.RequiredDataNotSent("Передан некорректный формат номера телефона. Требуемый формат 7xxxxxxxxxx")));
                    return;
                }
            } else {
                tc tcVar7 = this.f107843c;
                if (tcVar7 != null) {
                    tcVar3 = tcVar7;
                } else {
                    zdlpuopuiu.pmvmpeiblj("userIdManager");
                }
                sPaymentRequest.getCallback().invoke(new PaymentResult.Error(tcVar3.iobyxmoadg(), "-1", new MerchantError.RequiredDataNotSent("В этом способе оплты номер телефона является обязательным параметром")));
                return;
            }
        }
        jlmebxxoox jlmebxxooxVar4 = this.f107841a;
        if (jlmebxxooxVar4 == null) {
            zdlpuopuiu.pmvmpeiblj("sPayDataContract");
            jlmebxxooxVar4 = null;
        }
        boolean z13 = sPayMethod instanceof SPayMethod.WithBinding;
        MerchantData merchantData2 = new MerchantData(sPaymentRequest.getApiKey(), sPaymentRequest.getMerchantLogin(), sPaymentRequest.getBankInvoiceId(), z13 ? ((SPayMethod.WithBinding) sPayMethod).getBindingId() : null, sPaymentRequest.getOrderNumber(), sPaymentRequest.getAppPackage(), sPaymentRequest.getPhoneNumber());
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar4;
        auzgnhcxokVar.getClass();
        zdlpuopuiu.btonecajqb(merchantData2, "merchantData");
        auzgnhcxokVar.f55859lmojexxdyd = merchantData2;
        if (zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.Default.INSTANCE)) {
            status = PayStrategy.PayOnline.INSTANCE;
        } else if (zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.WithBankInvoiceId.INSTANCE)) {
            status = PayStrategy.BasePay.INSTANCE;
        } else if (z13) {
            status = PayStrategy.PayWithBinding.INSTANCE;
        } else if (zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.WithBonuses.INSTANCE)) {
            status = PayStrategy.PayWithBonuses.INSTANCE;
        } else if (zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.WithPartPay.INSTANCE)) {
            status = PayStrategy.PayWithPartsOnly.INSTANCE;
        } else if (zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.WithPaymentAccount.INSTANCE)) {
            status = PayStrategy.PayWithPaymentAccount.INSTANCE;
        } else if (zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.WithPhoneNumber.INSTANCE)) {
            status = PayStrategy.PayWithPhoneNumber.INSTANCE;
        } else {
            if (!zdlpuopuiu.eablkybsjg(sPayMethod, SPayMethod.WithoutRefresh.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            status = PayStrategy.PartsStartPay.INSTANCE;
        }
        jlmebxxoox jlmebxxooxVar5 = this.f107841a;
        if (jlmebxxooxVar5 != null) {
            jlmebxxooxVar = jlmebxxooxVar5;
        } else {
            zdlpuopuiu.pmvmpeiblj("sPayDataContract");
        }
        auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) jlmebxxooxVar;
        auzgnhcxokVar2.getClass();
        zdlpuopuiu.btonecajqb(status, "status");
        auzgnhcxokVar2.f55871yadqdtsiqt.setValue(status);
        if (zdlpuopuiu.eablkybsjg(status, PayStrategy.PayOnline.INSTANCE)) {
            df0Var = df0.MA_PAY_DEFAULT;
        } else if (zdlpuopuiu.eablkybsjg(status, PayStrategy.BasePay.INSTANCE)) {
            df0Var = df0.MA_PAY_WITH_BANK_INVOICE_ID;
        } else if (zdlpuopuiu.eablkybsjg(status, PayStrategy.PartsStartPay.INSTANCE)) {
            df0Var = df0.MA_PAY_WITHOUT_REFRESH;
        } else if (zdlpuopuiu.eablkybsjg(status, PayStrategy.PayWithBinding.INSTANCE)) {
            df0Var = df0.MA_PAY_WITH_BINDING;
        } else if (zdlpuopuiu.eablkybsjg(status, PayStrategy.PayWithBonuses.INSTANCE)) {
            df0Var = df0.MA_PAY_WITH_BONUSES;
        } else if (zdlpuopuiu.eablkybsjg(status, PayStrategy.PayWithPartsOnly.INSTANCE)) {
            df0Var = df0.MA_PAY_WITH_PART_PAY;
        } else if (zdlpuopuiu.eablkybsjg(status, PayStrategy.PayWithPaymentAccount.INSTANCE)) {
            df0Var = df0.MA_PAY_WITH_PAYMENT_ACCOUNT;
        } else {
            if (!zdlpuopuiu.eablkybsjg(status, PayStrategy.PayWithPhoneNumber.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            df0Var = df0.MA_PAY_WITH_PHONE_NUMBER;
        }
        df0 df0Var2 = df0Var;
        bt btVar = this.f107845e;
        if (btVar != null) {
            btVar.iobyxmoadg(new ow(df0Var2, null, mp.MA, null, null, null, null, 122));
        }
        Context context = sPaymentRequest.getContext();
        r80.f58284ppxfxbqfkf = new od0(sPaymentRequest, this);
        gi0 gi0Var = new gi0(context);
        if (((Boolean) a(context).lqeggnwhkg()).booleanValue()) {
            gi0Var.invoke("action_permissions_granted");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PermissionsActivity.class);
        re0 block = new re0(intent);
        zdlpuopuiu.btonecajqb(block, "block");
        context.startActivity(intent);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_permissions_granted");
        intentFilter.addAction("action_permissions_denied");
        iobyxmoadg.registerReceiver(context, new ar(new xf0(gi0Var)), intentFilter, 4);
    }

    public final vdvldrhtss a(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        List<String> listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        ArrayList arrayList = new ArrayList();
        for (String str : listRgvfuqvkyq) {
            if (iobyxmoadg.checkSelfPermission(context, str) == -1) {
                arrayList.add(str);
            }
        }
        vdvldrhtss vdvldrhtssVar = new vdvldrhtss(Boolean.valueOf(arrayList.isEmpty()), arrayList);
        if (((Boolean) vdvldrhtssVar.lqeggnwhkg()).booleanValue()) {
            bt btVar = this.f107845e;
            if (btVar != null) {
                btVar.iobyxmoadg(new ow(xr.SC_GOOD_PERMISSIONS, we0.MERCHANT_VIEW, mp.SC, null, null, null, null, 120));
                return vdvldrhtssVar;
            }
        } else {
            bt btVar2 = this.f107845e;
            if (btVar2 != null) {
                btVar2.iobyxmoadg(new ow(xr.SC_FAIL_PERMISSIONS, we0.MERCHANT_VIEW, mp.SC, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Denied", vdvldrhtssVar.nufgyqmvbu().toString())), null, null, null, 112));
            }
        }
        return vdvldrhtssVar;
    }
}
