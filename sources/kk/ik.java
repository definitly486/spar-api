package kk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PayBindingOtpRequestBody;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class ik implements f {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final g80 f57057iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wc0 f57058zoijcleaow;

    public ik(g80 lazyNetworkModule, wc0 featuresHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lazyNetworkModule, "lazyNetworkModule");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f57057iobyxmoadg = lazyNetworkModule;
        this.f57058zoijcleaow = featuresHandler;
    }

    @Override // kk.f
    public final Object agtfadlqog(CreateOtpSdkRequestBody createOtpSdkRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().agtfadlqog(createOtpSdkRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object btonecajqb(SessionIdRequestBody sessionIdRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().btonecajqb(sessionIdRequestBody, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007e  */
    @Override // kk.f
    public final Object draadjrbmk(PayOnlineRequestBody payOnlineRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        PayOnlineRequestBody payOnlineRequestBodyCopy;
        if (payOnlineRequestBody.getSumBonuses() == null) {
            payOnlineRequestBodyCopy = payOnlineRequestBody;
        } else {
            if (zd0.zoijcleaow(this.f57058zoijcleaow, vf0.BOTH) || zd0.zoijcleaow(this.f57058zoijcleaow, vf0.S_BONUSES_V2)) {
                String strValueOf = String.valueOf(payOnlineRequestBody.getSumBonuses());
                int iXrmfcynszj = mj.kcexrzcfyt.xrmfcynszj(strValueOf) - 2;
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(strValueOf, "<this>");
                StringBuilder sb3 = new StringBuilder(strValueOf);
                sb3.insert(iXrmfcynszj, '.');
                String string = sb3.toString();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "StringBuilder(this).appl…index, char) }.toString()");
                payOnlineRequestBodyCopy = payOnlineRequestBody.copy((1023 & 1) != 0 ? payOnlineRequestBody.userName : null, (1023 & 2) != 0 ? payOnlineRequestBody.sessionId : null, (1023 & 4) != 0 ? payOnlineRequestBody.merchantLogin : null, (1023 & 8) != 0 ? payOnlineRequestBody.deviceInfo : null, (1023 & 16) != 0 ? payOnlineRequestBody.paymentId : 0, (1023 & 32) != 0 ? payOnlineRequestBody.priorityCardOnly : null, (1023 & 64) != 0 ? payOnlineRequestBody.orderId : null, (1023 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? payOnlineRequestBody.isBnplEnabled : false, (1023 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? payOnlineRequestBody.fraudMonInfo : null, (1023 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? payOnlineRequestBody.paymentInBonuses : null, (1023 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? payOnlineRequestBody.sumBonuses : string);
            } else {
                payOnlineRequestBodyCopy = payOnlineRequestBody.copy((1023 & 1) != 0 ? payOnlineRequestBody.userName : null, (1023 & 2) != 0 ? payOnlineRequestBody.sessionId : null, (1023 & 4) != 0 ? payOnlineRequestBody.merchantLogin : null, (1023 & 8) != 0 ? payOnlineRequestBody.deviceInfo : null, (1023 & 16) != 0 ? payOnlineRequestBody.paymentId : 0, (1023 & 32) != 0 ? payOnlineRequestBody.priorityCardOnly : null, (1023 & 64) != 0 ? payOnlineRequestBody.orderId : null, (1023 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? payOnlineRequestBody.isBnplEnabled : false, (1023 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? payOnlineRequestBody.fraudMonInfo : null, (1023 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? payOnlineRequestBody.paymentInBonuses : null, (1023 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? payOnlineRequestBody.sumBonuses : Integer.valueOf(Integer.parseInt(String.valueOf(payOnlineRequestBody.getSumBonuses()))));
            }
            if (payOnlineRequestBodyCopy == null) {
                payOnlineRequestBodyCopy = payOnlineRequestBody;
            }
        }
        Object objDraadjrbmk = this.f57057iobyxmoadg.iobyxmoadg().draadjrbmk(payOnlineRequestBodyCopy, gxszxtbevoVar);
        return objDraadjrbmk == mg.zoijcleaow.gxszxtbevo() ? objDraadjrbmk : (lm.kcexrzcfyt) objDraadjrbmk;
    }

    @Override // kk.f
    public final Object dxjokdxxww(ConfirmOtpRequestBody confirmOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().dxjokdxxww(confirmOtpRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object eablkybsjg(ListOfCardsRequestBody listOfCardsRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().eablkybsjg(ListOfCardsRequestBody.copy$default(listOfCardsRequestBody, null, null, null, null, 11, null), gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object gtknphoqwx(CreateBindingOtpRequestBody createBindingOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().gtknphoqwx(createBindingOtpRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object gxszxtbevo(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().gxszxtbevo(paymentBnplPlanRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().iobyxmoadg(gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object lqeggnwhkg(ListOfCardsRequestBody listOfCardsRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().lqeggnwhkg(listOfCardsRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object nufgyqmvbu(PayBindingOtpRequestBody payBindingOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().nufgyqmvbu(payBindingOtpRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object ojitshcjhn(PaymentOrderRequestBody paymentOrderRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().ojitshcjhn(paymentOrderRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object oxmwwwfdhm(SpasiboBonusesRequestBody spasiboBonusesRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        String str = "v2";
        if (!zd0.zoijcleaow(this.f57058zoijcleaow, vf0.BOTH) && !zd0.zoijcleaow(this.f57058zoijcleaow, vf0.S_BONUSES_V2)) {
            if (!zd0.zoijcleaow(this.f57058zoijcleaow, vf0.S_BONUSES_V1)) {
                throw new IllegalArgumentException("SBonuses Feature disabled");
            }
            str = "v1";
        }
        Object objVdvldrhtss = this.f57057iobyxmoadg.iobyxmoadg().vdvldrhtss(spasiboBonusesRequestBody, str, gxszxtbevoVar);
        return objVdvldrhtss == mg.zoijcleaow.gxszxtbevo() ? objVdvldrhtss : (lm.kcexrzcfyt) objVdvldrhtss;
    }

    @Override // kk.f
    public final Object ppxfxbqfkf(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().ppxfxbqfkf(confirmBindingOtpRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object rgvfuqvkyq(PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().rgvfuqvkyq(paymentTokenRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object vdvldrhtss(PaymentTokenRequestBody paymentTokenRequestBody, j50 j50Var) {
        Object objOxmwwwfdhm = this.f57057iobyxmoadg.iobyxmoadg().oxmwwwfdhm(paymentTokenRequestBody, j50Var);
        return objOxmwwwfdhm == mg.zoijcleaow.gxszxtbevo() ? objOxmwwwfdhm : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // kk.f
    public final Object wflxmlrfwp(BindingSessionIdRequestBody bindingSessionIdRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().wflxmlrfwp(bindingSessionIdRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object wkgbmnqykc(SdkAuthRequestBody sdkAuthRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().wkgbmnqykc(sdkAuthRequestBody, gxszxtbevoVar);
    }

    @Override // kk.f
    public final Object zoijcleaow(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f57057iobyxmoadg.iobyxmoadg().zoijcleaow(paymentBnplPlanRequestBody, gxszxtbevoVar);
    }
}
