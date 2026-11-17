package kk;

import java.util.List;
import spay.sdk.data.dto.response.SPayErrorDto;
import spay.sdk.domain.model.PayStrategy;
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
import spay.sdk.domain.model.response.ContentResponse;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.PartsPaymentPlanBnplResponseBodyKt;
import spay.sdk.domain.model.response.PaymentOrderResponseBody;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.SdkAuthResponseBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import spay.sdk.domain.model.response.bnpl.PartsGraphBnpl;
import spay.sdk.domain.model.response.bnpl.SixPartPay;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.otp.ConfirmOtpResponseBody;
import spay.sdk.domain.model.response.otp.CreateBindingOtpResponseBody;
import spay.sdk.domain.model.response.otp.CreateOtpSdkResponseBody;
import spay.sdk.domain.model.response.paymentToken.successResponse.PaymentTokenResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class o70 extends qh implements ll {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final wc0 f57900eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final bt f57901gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final zc f57902lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final f f57903ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final jlmebxxoox f57904wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(f sPayDataSource, jlmebxxoox sPayDataContract, wc0 featuresHandler, bt metricUtil, zc networkErrorHandler, vx networkErrorHandlerImpl, lw apiResponseErrorHandlerImpl) {
        super(networkErrorHandlerImpl, apiResponseErrorHandlerImpl);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataSource, "sPayDataSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricUtil, "metricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandler, "networkErrorHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkErrorHandlerImpl, "networkErrorHandlerImpl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiResponseErrorHandlerImpl, "apiResponseErrorHandlerImpl");
        this.f57903ppxfxbqfkf = sPayDataSource;
        this.f57904wkgbmnqykc = sPayDataContract;
        this.f57900eablkybsjg = featuresHandler;
        this.f57901gxszxtbevo = metricUtil;
        this.f57902lqeggnwhkg = networkErrorHandler;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0090, please report this as an issue */
    public final Object agtfadlqog(PaymentTokenRequestBody paymentTokenRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        jz jzVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof jz) {
            jzVar = (jz) wkgbmnqykcVar;
            int i13 = jzVar.f57238iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jzVar.f57238iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                jzVar = new jz(this, wkgbmnqykcVar);
            }
        } else {
            jzVar = new jz(this, wkgbmnqykcVar);
        }
        Object objRgvfuqvkyq = jzVar.f57240yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = jzVar.f57238iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = jzVar.f57241zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objRgvfuqvkyq);
                kcexrzcfytVar = (lm.kcexrzcfyt) objRgvfuqvkyq;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    nd ndVar = nd.RQ_GOOD_PAYMENT_TOKEN;
                    we0 we0Var = we0.PAY_VIEW;
                    btVar.iobyxmoadg(new ow(ndVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((PaymentTokenResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nd.RS_GOOD_PAYMENT_TOKEN, nd.RS_FAIL_PAYMENT_TOKEN, we0Var));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                nd ndVar2 = nd.RQ_FAIL_PAYMENT_TOKEN;
                we0 we0Var2 = we0.PAY_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(ndVar2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objRgvfuqvkyq);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(nd.RQ_PAYMENT_TOKEN, we0.PAY_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            jzVar.f57241zdlpuopuiu = this;
            jzVar.f57238iwizpuwonk = 1;
            objRgvfuqvkyq = fVar.rgvfuqvkyq(paymentTokenRequestBody, jzVar);
            if (objRgvfuqvkyq == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objRgvfuqvkyq;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                nd ndVar3 = nd.RQ_GOOD_PAYMENT_TOKEN;
                we0 we0Var3 = we0.PAY_VIEW;
                btVar3.iobyxmoadg(new ow(ndVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success((PaymentTokenResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nd.RS_GOOD_PAYMENT_TOKEN, nd.RS_FAIL_PAYMENT_TOKEN, we0Var3));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            nd ndVar4 = nd.RQ_FAIL_PAYMENT_TOKEN;
            we0 we0Var4 = we0.PAY_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(ndVar4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009e A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object btonecajqb(PayBindingOtpRequestBody payBindingOtpRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        f40 f40Var;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof f40) {
            f40Var = (f40) wkgbmnqykcVar;
            int i13 = f40Var.f56490iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                f40Var.f56490iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                f40Var = new f40(this, wkgbmnqykcVar);
            }
        } else {
            f40Var = new f40(this, wkgbmnqykcVar);
        }
        Object objNufgyqmvbu = f40Var.f56492yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = f40Var.f56490iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = f40Var.f56493zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
                kcexrzcfytVar = (lm.kcexrzcfyt) objNufgyqmvbu;
                if (kcexrzcfytVar.gxszxtbevo()) {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_GOOD_PAY_BINDING, we0.OTP_VIEW, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(null, 1, null);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                ErrorEntity errorEntityZoijcleaow = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
                bt btVar = o70Var.f57901gxszxtbevo;
                uw uwVar = uw.RQ_FAIL_PAY_BINDING;
                we0 we0Var = we0.OTP_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar.iobyxmoadg(new ow(uwVar, we0Var, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(errorEntityZoijcleaow);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_PAY_BINDING, we0.OTP_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            f40Var.f56493zdlpuopuiu = this;
            f40Var.f56490iwizpuwonk = 1;
            objNufgyqmvbu = fVar.nufgyqmvbu(payBindingOtpRequestBody, f40Var);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objNufgyqmvbu;
            if (kcexrzcfytVar.gxszxtbevo()) {
                o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_GOOD_PAY_BINDING, we0.OTP_VIEW, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success(null, 1, null);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            ErrorEntity errorEntityZoijcleaow2 = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
            bt btVar2 = o70Var.f57901gxszxtbevo;
            uw uwVar2 = uw.RQ_FAIL_PAY_BINDING;
            we0 we0Var2 = we0.OTP_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar2.iobyxmoadg(new ow(uwVar2, we0Var2, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(errorEntityZoijcleaow2);
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x009c, B:29:0x00b3, B:33:0x00be, B:36:0x00c6), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x009c A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x009c, B:29:0x00b3, B:33:0x00be, B:36:0x00c6), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x009c, B:29:0x00b3, B:33:0x00be, B:36:0x00c6), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x009c, B:29:0x00b3, B:33:0x00be, B:36:0x00c6), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x009c, please report this as an issue */
    public final Object draadjrbmk(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        is isVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof is) {
            isVar = (is) wkgbmnqykcVar;
            int i13 = isVar.f57092iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                isVar.f57092iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                isVar = new is(this, wkgbmnqykcVar);
            }
        } else {
            isVar = new is(this, wkgbmnqykcVar);
        }
        Object objGxszxtbevo = isVar.f57094yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = isVar.f57092iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = isVar.f57095zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
                kcexrzcfytVar = (lm.kcexrzcfyt) objGxszxtbevo;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    gtknphoqwx gtknphoqwxVar = gtknphoqwx.RQ_GOOD_PAYMENT_PLAN_BNPL;
                    we0 we0Var = we0.AUTH_VIEW;
                    btVar.iobyxmoadg(new ow(gtknphoqwxVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_PAYMENT_PLAN_BNPL, gtknphoqwx.RS_FAIL_PAYMENT_PLAN_BNPL, we0Var);
                    ((auzgnhcxok) o70Var.f57904wkgbmnqykc).wkgbmnqykc(new ContentResponse.Success(paymentPlanBnplResponseBody));
                    return new ContentResponse.Success(paymentPlanBnplResponseBody);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.RQ_FAIL_PAYMENT_PLAN_BNPL;
                we0 we0Var2 = we0.AUTH_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(gtknphoqwxVar2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        try {
            this.f57901gxszxtbevo.iobyxmoadg(new ow(gtknphoqwx.RQ_PAYMENT_PLAN_BNPL, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
            f fVar = this.f57903ppxfxbqfkf;
            isVar.f57095zdlpuopuiu = this;
            isVar.f57092iwizpuwonk = 1;
            objGxszxtbevo = fVar.gxszxtbevo(paymentBnplPlanRequestBody, isVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objGxszxtbevo;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar3 = gtknphoqwx.RQ_GOOD_PAYMENT_PLAN_BNPL;
                we0 we0Var3 = we0.AUTH_VIEW;
                btVar3.iobyxmoadg(new ow(gtknphoqwxVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                PaymentPlanBnplResponseBody paymentPlanBnplResponseBody2 = (PaymentPlanBnplResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_PAYMENT_PLAN_BNPL, gtknphoqwx.RS_FAIL_PAYMENT_PLAN_BNPL, we0Var3);
                ((auzgnhcxok) o70Var.f57904wkgbmnqykc).wkgbmnqykc(new ContentResponse.Success(paymentPlanBnplResponseBody2));
                return new ContentResponse.Success(paymentPlanBnplResponseBody2);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.RQ_FAIL_PAYMENT_PLAN_BNPL;
            we0 we0Var4 = we0.AUTH_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(gtknphoqwxVar4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fc A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0131 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0134 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0144 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0147 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x017d A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0181 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0192 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0196 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1 A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ac A[Catch: Exception -> 0x0035, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x0030, B:44:0x00c9, B:46:0x00d1, B:48:0x00e3, B:51:0x00ea, B:53:0x00f8, B:56:0x00ff, B:58:0x011e, B:60:0x0123, B:62:0x0131, B:64:0x0136, B:66:0x0144, B:68:0x0149, B:67:0x0147, B:63:0x0134, B:59:0x0121, B:55:0x00fc, B:50:0x00e7, B:70:0x0165, B:72:0x017d, B:75:0x0184, B:77:0x0192, B:80:0x0199, B:82:0x01a1, B:86:0x01ac, B:89:0x01b4, B:79:0x0196, B:74:0x0181), top: B:97:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    public final Object dxjokdxxww(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        mt mtVar;
        o70 o70Var;
        List listNufgyqmvbu;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        io ioVar;
        we0 we0Var;
        String errorCode;
        String description;
        io ioVar2;
        we0 we0Var2;
        io ioVar3;
        io ioVar4;
        we0 we0Var3;
        ListOfCardsRequestBody listOfCardsRequestBody2 = listOfCardsRequestBody;
        if (wkgbmnqykcVar instanceof mt) {
            mtVar = (mt) wkgbmnqykcVar;
            int i13 = mtVar.f57691cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mtVar.f57691cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                mtVar = new mt(this, wkgbmnqykcVar);
            }
        } else {
            mtVar = new mt(this, wkgbmnqykcVar);
        }
        Object objLqeggnwhkg = mtVar.f57693jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = mtVar.f57691cqumvgiudr;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listOfCardsRequestBody2 = mtVar.f57694yggfygwlhe;
            o70Var = mtVar.f57695zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                kcexrzcfytVar = (lm.kcexrzcfyt) objLqeggnwhkg;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                    bt btVar = o70Var.f57901gxszxtbevo;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                        ioVar = gtknphoqwx.RQ_FAIL_LIST_CARDS;
                    } else {
                        ioVar = nd.RQ_FAIL_LIST_CARDS;
                    }
                    io ioVar5 = ioVar;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                        we0Var = we0.AUTH_VIEW;
                    } else {
                        we0Var = we0.PAY_VIEW;
                    }
                    we0 we0Var4 = we0Var;
                    mp mpVar = mp.RQ_FAIL;
                    int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                    if (sPayErrorDtoIobyxmoadg != null) {
                        errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                    } else {
                        errorCode = null;
                    }
                    description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                    if (description == null) {
                        description = "";
                    }
                    btVar.iobyxmoadg(new ow(ioVar5, we0Var4, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                    return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
                }
                bt btVar2 = o70Var.f57901gxszxtbevo;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    ioVar2 = gtknphoqwx.RQ_GOOD_LIST_CARDS;
                } else {
                    ioVar2 = nd.RQ_GOOD_LIST_CARDS;
                }
                io ioVar6 = ioVar2;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    we0Var2 = we0.AUTH_VIEW;
                } else {
                    we0Var2 = we0.PAY_VIEW;
                }
                btVar2.iobyxmoadg(new ow(ioVar6, we0Var2, mp.RQ_GOOD, null, null, null, null, 120));
                bt btVar3 = o70Var.f57901gxszxtbevo;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    ioVar3 = gtknphoqwx.RS_GOOD_LIST_CARDS;
                } else {
                    ioVar3 = nd.RS_GOOD_LIST_CARDS;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    ioVar4 = gtknphoqwx.RS_FAIL_LIST_CARDS;
                } else {
                    ioVar4 = nd.RS_FAIL_LIST_CARDS;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    we0Var3 = we0.AUTH_VIEW;
                } else {
                    we0Var3 = we0.PAY_VIEW;
                }
                ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) qh.iobyxmoadg(kcexrzcfytVar, btVar3, ioVar3, ioVar4, we0Var3);
                ((auzgnhcxok) o70Var.f57904wkgbmnqykc).eablkybsjg(new ContentResponse.Success(listOfCardsResponseBody), listOfCardsRequestBody2.getPriorityCardOnly());
                return new ContentResponse.Success(listOfCardsResponseBody);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        if (zd0.iobyxmoadg(this.f57900eablkybsjg, uc0.USE_CACHED_CARDS_LIST, null) && (listNufgyqmvbu = ((auzgnhcxok) this.f57904wkgbmnqykc).nufgyqmvbu()) != null && !listNufgyqmvbu.isEmpty()) {
            if (((auzgnhcxok) this.f57904wkgbmnqykc).zoijcleaow(listOfCardsRequestBody.getPriorityCardOnly()) != null) {
                ContentResponse.Success successZoijcleaow = ((auzgnhcxok) this.f57904wkgbmnqykc).zoijcleaow(listOfCardsRequestBody.getPriorityCardOnly());
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(successZoijcleaow);
                return successZoijcleaow;
            }
        }
        this.f57901gxszxtbevo.iobyxmoadg(new ow(kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true)) ? gtknphoqwx.RQ_LIST_CARDS : nd.RQ_LIST_CARDS, kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true)) ? we0.AUTH_VIEW : we0.PAY_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            mtVar.f57695zdlpuopuiu = this;
            mtVar.f57694yggfygwlhe = listOfCardsRequestBody2;
            mtVar.f57691cqumvgiudr = 1;
            objLqeggnwhkg = fVar.lqeggnwhkg(listOfCardsRequestBody2, mtVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objLqeggnwhkg;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar4 = o70Var.f57901gxszxtbevo;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    ioVar = gtknphoqwx.RQ_FAIL_LIST_CARDS;
                } else {
                    ioVar = nd.RQ_FAIL_LIST_CARDS;
                }
                io ioVar7 = ioVar;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                    we0Var = we0.AUTH_VIEW;
                } else {
                    we0Var = we0.PAY_VIEW;
                }
                we0 we0Var5 = we0Var;
                mp mpVar2 = mp.RQ_FAIL;
                int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                if (sPayErrorDtoIobyxmoadg != null) {
                }
                if (description == null) {
                    description = "";
                }
                btVar4.iobyxmoadg(new ow(ioVar7, we0Var5, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            }
            bt btVar5 = o70Var.f57901gxszxtbevo;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                ioVar2 = gtknphoqwx.RQ_GOOD_LIST_CARDS;
            } else {
                ioVar2 = nd.RQ_GOOD_LIST_CARDS;
            }
            io ioVar8 = ioVar2;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                we0Var2 = we0.AUTH_VIEW;
            } else {
                we0Var2 = we0.PAY_VIEW;
            }
            btVar5.iobyxmoadg(new ow(ioVar8, we0Var2, mp.RQ_GOOD, null, null, null, null, 120));
            bt btVar6 = o70Var.f57901gxszxtbevo;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                ioVar3 = gtknphoqwx.RS_GOOD_LIST_CARDS;
            } else {
                ioVar3 = nd.RS_GOOD_LIST_CARDS;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                ioVar4 = gtknphoqwx.RS_FAIL_LIST_CARDS;
            } else {
                ioVar4 = nd.RS_FAIL_LIST_CARDS;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody2.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
                we0Var3 = we0.AUTH_VIEW;
            } else {
                we0Var3 = we0.PAY_VIEW;
            }
            ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) qh.iobyxmoadg(kcexrzcfytVar, btVar6, ioVar3, ioVar4, we0Var3);
            ((auzgnhcxok) o70Var.f57904wkgbmnqykc).eablkybsjg(new ContentResponse.Success(listOfCardsResponseBody2), listOfCardsRequestBody2.getPriorityCardOnly());
            return new ContentResponse.Success(listOfCardsResponseBody2);
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009e A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0084, B:29:0x009e, B:33:0x00a9, B:36:0x00b1), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        om omVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof om) {
            omVar = (om) wkgbmnqykcVar;
            int i13 = omVar.f57974iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                omVar.f57974iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                omVar = new om(this, wkgbmnqykcVar);
            }
        } else {
            omVar = new om(this, wkgbmnqykcVar);
        }
        Object objPpxfxbqfkf = omVar.f57976yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = omVar.f57974iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = omVar.f57977zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                kcexrzcfytVar = (lm.kcexrzcfyt) objPpxfxbqfkf;
                if (kcexrzcfytVar.gxszxtbevo()) {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_GOOD_CONFIRM_BINDING, we0.OTP_VIEW, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(null, 1, null);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                ErrorEntity errorEntityZoijcleaow = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
                bt btVar = o70Var.f57901gxszxtbevo;
                uw uwVar = uw.RQ_FAIL_CONFIRM_BINDING;
                we0 we0Var = we0.OTP_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar.iobyxmoadg(new ow(uwVar, we0Var, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(errorEntityZoijcleaow);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_CONFIRM_BINDING, we0.OTP_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            omVar.f57977zdlpuopuiu = this;
            omVar.f57974iwizpuwonk = 1;
            objPpxfxbqfkf = fVar.ppxfxbqfkf(confirmBindingOtpRequestBody, omVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objPpxfxbqfkf;
            if (kcexrzcfytVar.gxszxtbevo()) {
                o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_GOOD_CONFIRM_BINDING, we0.OTP_VIEW, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success(null, 1, null);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            ErrorEntity errorEntityZoijcleaow2 = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
            bt btVar2 = o70Var.f57901gxszxtbevo;
            uw uwVar2 = uw.RQ_FAIL_CONFIRM_BINDING;
            we0 we0Var2 = we0.OTP_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar2.iobyxmoadg(new ow(uwVar2, we0Var2, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(errorEntityZoijcleaow2);
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0091 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00db A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0073, B:30:0x007b, B:32:0x0091, B:35:0x0098, B:34:0x0095, B:37:0x00af, B:40:0x00cc, B:43:0x00d4, B:45:0x00d8, B:47:0x00df, B:42:0x00d2, B:46:0x00db), top: B:56:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(PayOnlineRequestBody payOnlineRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        uv uvVar;
        o70 o70Var;
        ErrorEntity errorEntityA;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        ErrorEntity errorEntityZoijcleaow;
        we0 we0Var;
        if (wkgbmnqykcVar instanceof uv) {
            uvVar = (uv) wkgbmnqykcVar;
            int i13 = uvVar.f58892iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                uvVar.f58892iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                uvVar = new uv(this, wkgbmnqykcVar);
            }
        } else {
            uvVar = new uv(this, wkgbmnqykcVar);
        }
        Object objDraadjrbmk = uvVar.f58894yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = uvVar.f58892iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = uvVar.f58895zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
                kcexrzcfytVar = (lm.kcexrzcfyt) objDraadjrbmk;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    x7 x7Var = x7.RQ_GOOD_PAY_ONLINE;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) o70Var.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PartsStartPay.INSTANCE)) {
                        we0Var = we0.PAY_VIEW;
                    } else {
                        we0Var = we0.BNPL_PARTS_VIEW;
                    }
                    btVar.iobyxmoadg(new ow(x7Var, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(gg.wwaezpbzkn.f37140iobyxmoadg);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                o70Var.yggfygwlhe(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) o70Var.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
                    if (sPayErrorDtoIobyxmoadg != null || (errorEntityZoijcleaow = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg)) == null) {
                        errorEntityZoijcleaow = ErrorEntity.PayBnplPartsFail.INSTANCE;
                    }
                    if (errorEntityZoijcleaow instanceof ErrorEntity.Unknown) {
                        errorEntityZoijcleaow = ErrorEntity.PayBnplPartsFail.INSTANCE;
                    }
                } else {
                    errorEntityZoijcleaow = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
                }
                return new ContentResponse.Failure(errorEntityZoijcleaow);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                errorEntityA = o70Var.f57902lqeggnwhkg.a(e);
                if (errorEntityA instanceof ErrorEntity.Unknown) {
                    errorEntityA = ErrorEntity.PayBnplPartsFail.INSTANCE;
                }
                return new ContentResponse.Failure(errorEntityA);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(x7.RQ_PAY_ONLINE, kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PartsStartPay.INSTANCE) ? we0.PAY_VIEW : we0.BNPL_PARTS_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            uvVar.f58895zdlpuopuiu = this;
            uvVar.f58892iwizpuwonk = 1;
            objDraadjrbmk = fVar.draadjrbmk(payOnlineRequestBody, uvVar);
            if (objDraadjrbmk == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objDraadjrbmk;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar2 = o70Var.f57901gxszxtbevo;
                x7 x7Var2 = x7.RQ_GOOD_PAY_ONLINE;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) o70Var.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PartsStartPay.INSTANCE)) {
                    we0Var = we0.PAY_VIEW;
                } else {
                    we0Var = we0.BNPL_PARTS_VIEW;
                }
                btVar2.iobyxmoadg(new ow(x7Var2, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            o70Var.yggfygwlhe(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) o70Var.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorEntityZoijcleaow = ErrorEntity.PayBnplPartsFail.INSTANCE;
                } else {
                    errorEntityZoijcleaow = ErrorEntity.PayBnplPartsFail.INSTANCE;
                }
                if (errorEntityZoijcleaow instanceof ErrorEntity.Unknown) {
                    errorEntityZoijcleaow = ErrorEntity.PayBnplPartsFail.INSTANCE;
                }
            } else {
                errorEntityZoijcleaow = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
            }
            return new ContentResponse.Failure(errorEntityZoijcleaow);
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            errorEntityA = o70Var.f57902lqeggnwhkg.a(e);
            if (errorEntityA instanceof ErrorEntity.Unknown) {
                errorEntityA = ErrorEntity.PayBnplPartsFail.INSTANCE;
            }
            return new ContentResponse.Failure(errorEntityA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0090, please report this as an issue */
    public final Object gxszxtbevo(ConfirmOtpRequestBody confirmOtpRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        qn qnVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof qn) {
            qnVar = (qn) wkgbmnqykcVar;
            int i13 = qnVar.f58215iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qnVar.f58215iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                qnVar = new qn(this, wkgbmnqykcVar);
            }
        } else {
            qnVar = new qn(this, wkgbmnqykcVar);
        }
        Object objDxjokdxxww = qnVar.f58217yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = qnVar.f58215iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = qnVar.f58218zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
                kcexrzcfytVar = (lm.kcexrzcfyt) objDxjokdxxww;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    nf0 nf0Var = nf0.RQ_GOOD_CONFIRM_OTP;
                    we0 we0Var = we0.OTP_VIEW;
                    btVar.iobyxmoadg(new ow(nf0Var, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((ConfirmOtpResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nf0.RS_GOOD_CONFIRM_OTP, nf0.RS_FAIL_CONFIRM_OTP, we0Var));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                nf0 nf0Var2 = nf0.RQ_FAIL_CONFIRM_OTP;
                we0 we0Var2 = we0.OTP_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(nf0Var2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(nf0.RQ_CONFIRM_OTP, we0.OTP_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            qnVar.f58218zdlpuopuiu = this;
            qnVar.f58215iwizpuwonk = 1;
            objDxjokdxxww = fVar.dxjokdxxww(confirmOtpRequestBody, qnVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objDxjokdxxww;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                nf0 nf0Var3 = nf0.RQ_GOOD_CONFIRM_OTP;
                we0 we0Var3 = we0.OTP_VIEW;
                btVar3.iobyxmoadg(new ow(nf0Var3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success((ConfirmOtpResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nf0.RS_GOOD_CONFIRM_OTP, nf0.RS_FAIL_CONFIRM_OTP, we0Var3));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            nf0 nf0Var4 = nf0.RQ_FAIL_CONFIRM_OTP;
            we0 we0Var4 = we0.OTP_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(nf0Var4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0062, B:25:0x006a, B:27:0x00a4, B:29:0x00bb, B:33:0x00c6, B:36:0x00ce), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0062, B:25:0x006a, B:27:0x00a4, B:29:0x00bb, B:33:0x00c6, B:36:0x00ce), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0062, B:25:0x006a, B:27:0x00a4, B:29:0x00bb, B:33:0x00c6, B:36:0x00ce), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0062, B:25:0x006a, B:27:0x00a4, B:29:0x00bb, B:33:0x00c6, B:36:0x00ce), top: B:44:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a4, please report this as an issue */
    public final Object kcexrzcfyt(ListOfCardsRequestBody listOfCardsRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        yw ywVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof yw) {
            ywVar = (yw) wkgbmnqykcVar;
            int i13 = ywVar.f59490cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ywVar.f59490cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ywVar = new yw(this, wkgbmnqykcVar);
            }
        } else {
            ywVar = new yw(this, wkgbmnqykcVar);
        }
        Object objEablkybsjg = ywVar.f59492jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ywVar.f59490cqumvgiudr;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listOfCardsRequestBody = ywVar.f59493yggfygwlhe;
            o70Var = ywVar.f59494zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                kcexrzcfytVar = (lm.kcexrzcfyt) objEablkybsjg;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    nd ndVar = nd.RQ_GOOD_PAYMENT_ACCOUNTS;
                    we0 we0Var = we0.AUTH_VIEW;
                    btVar.iobyxmoadg(new ow(ndVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nd.RS_GOOD_PAYMENT_ACCOUNTS, nd.RS_FAIL_PAYMENT_ACCOUNTS, we0Var);
                    ((auzgnhcxok) o70Var.f57904wkgbmnqykc).eablkybsjg(new ContentResponse.Success(listOfCardsResponseBody), listOfCardsRequestBody.getPriorityCardOnly());
                    return new ContentResponse.Success(listOfCardsResponseBody);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                nd ndVar2 = nd.RQ_FAIL_PAYMENT_ACCOUNTS;
                we0 we0Var2 = we0.AUTH_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(ndVar2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(nd.RQ_PAYMENT_ACCOUNTS, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            ywVar.f59494zdlpuopuiu = this;
            ywVar.f59493yggfygwlhe = listOfCardsRequestBody;
            ywVar.f59490cqumvgiudr = 1;
            objEablkybsjg = fVar.eablkybsjg(listOfCardsRequestBody, ywVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objEablkybsjg;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                nd ndVar3 = nd.RQ_GOOD_PAYMENT_ACCOUNTS;
                we0 we0Var3 = we0.AUTH_VIEW;
                btVar3.iobyxmoadg(new ow(ndVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nd.RS_GOOD_PAYMENT_ACCOUNTS, nd.RS_FAIL_PAYMENT_ACCOUNTS, we0Var3);
                ((auzgnhcxok) o70Var.f57904wkgbmnqykc).eablkybsjg(new ContentResponse.Success(listOfCardsResponseBody2), listOfCardsRequestBody.getPriorityCardOnly());
                return new ContentResponse.Success(listOfCardsResponseBody2);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            nd ndVar4 = nd.RQ_FAIL_PAYMENT_ACCOUNTS;
            we0 we0Var4 = we0.AUTH_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(ndVar4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[Catch: Exception -> 0x0033, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002f, B:28:0x0071, B:30:0x0079, B:32:0x0081, B:35:0x0088, B:34:0x0085, B:37:0x00ab, B:39:0x00b9, B:42:0x00c0, B:44:0x00c9, B:48:0x00d4, B:51:0x00dc, B:41:0x00bd), top: B:59:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object lqeggnwhkg(CreateBindingOtpRequestBody createBindingOtpRequestBody, boolean z13, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        vo voVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        we0 we0Var;
        String errorCode;
        String description;
        we0 we0Var2;
        boolean z14 = z13;
        if (wkgbmnqykcVar instanceof vo) {
            voVar = (vo) wkgbmnqykcVar;
            int i13 = voVar.f59047cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                voVar.f59047cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                voVar = new vo(this, wkgbmnqykcVar);
            }
        } else {
            voVar = new vo(this, wkgbmnqykcVar);
        }
        Object objGtknphoqwx = voVar.f59049jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = voVar.f59047cqumvgiudr;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14 = voVar.f59050yggfygwlhe;
            o70Var = voVar.f59051zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
                kcexrzcfytVar = (lm.kcexrzcfyt) objGtknphoqwx;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    uw uwVar = uw.RQ_GOOD_CREATE_BINDING;
                    if (z14) {
                        we0Var2 = we0.OTP_VIEW;
                    } else {
                        we0Var2 = we0.MERCHANT_VIEW;
                    }
                    btVar.iobyxmoadg(new ow(uwVar, we0Var2, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((CreateBindingOtpResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, uw.RS_GOOD_CREATE_BINDING, uw.RS_FAIL_CREATE_BINDING, we0.MERCHANT_VIEW));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                uw uwVar2 = uw.RQ_FAIL_CREATE_BINDING;
                if (z14) {
                    we0Var = we0.OTP_VIEW;
                } else {
                    we0Var = we0.MERCHANT_VIEW;
                }
                we0 we0Var3 = we0Var;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(uwVar2, we0Var3, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_CREATE_BINDING, z14 ? we0.OTP_VIEW : we0.MERCHANT_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            voVar.f59051zdlpuopuiu = this;
            voVar.f59050yggfygwlhe = z14;
            voVar.f59047cqumvgiudr = 1;
            objGtknphoqwx = fVar.gtknphoqwx(createBindingOtpRequestBody, voVar);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objGtknphoqwx;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                uw uwVar3 = uw.RQ_GOOD_CREATE_BINDING;
                if (z14) {
                    we0Var2 = we0.OTP_VIEW;
                } else {
                    we0Var2 = we0.MERCHANT_VIEW;
                }
                btVar3.iobyxmoadg(new ow(uwVar3, we0Var2, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success((CreateBindingOtpResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, uw.RS_GOOD_CREATE_BINDING, uw.RS_FAIL_CREATE_BINDING, we0.MERCHANT_VIEW));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            uw uwVar4 = uw.RQ_FAIL_CREATE_BINDING;
            if (z14) {
                we0Var = we0.OTP_VIEW;
            } else {
                we0Var = we0.MERCHANT_VIEW;
            }
            we0 we0Var4 = we0Var;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(uwVar4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0090, please report this as an issue */
    public final Object nufgyqmvbu(CreateOtpSdkRequestBody createOtpSdkRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        zp zpVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof zp) {
            zpVar = (zp) wkgbmnqykcVar;
            int i13 = zpVar.f59618iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zpVar.f59618iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zpVar = new zp(this, wkgbmnqykcVar);
            }
        } else {
            zpVar = new zp(this, wkgbmnqykcVar);
        }
        Object objAgtfadlqog = zpVar.f59620yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zpVar.f59618iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = zpVar.f59621zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objAgtfadlqog);
                kcexrzcfytVar = (lm.kcexrzcfyt) objAgtfadlqog;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    nf0 nf0Var = nf0.RQ_GOOD_CREATE_OTP;
                    we0 we0Var = we0.OTP_VIEW;
                    btVar.iobyxmoadg(new ow(nf0Var, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((CreateOtpSdkResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nf0.RS_GOOD_CREATE_OTP, nf0.RS_FAIL_CREATE_OTP, we0Var));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                nf0 nf0Var2 = nf0.RQ_FAIL_CREATE_OTP;
                we0 we0Var2 = we0.OTP_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(nf0Var2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objAgtfadlqog);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(nf0.RQ_CREATE_OTP, we0.OTP_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            zpVar.f59621zdlpuopuiu = this;
            zpVar.f59618iwizpuwonk = 1;
            objAgtfadlqog = fVar.agtfadlqog(createOtpSdkRequestBody, zpVar);
            if (objAgtfadlqog == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objAgtfadlqog;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                nf0 nf0Var3 = nf0.RQ_GOOD_CREATE_OTP;
                we0 we0Var3 = we0.OTP_VIEW;
                btVar3.iobyxmoadg(new ow(nf0Var3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success((CreateOtpSdkResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nf0.RS_GOOD_CREATE_OTP, nf0.RS_FAIL_CREATE_OTP, we0Var3));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            nf0 nf0Var4 = nf0.RQ_FAIL_CREATE_OTP;
            we0 we0Var4 = we0.OTP_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(nf0Var4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ojitshcjhn(PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        j50 j50Var;
        if (gxszxtbevoVar instanceof j50) {
            j50Var = (j50) gxszxtbevoVar;
            int i13 = j50Var.f57154jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                j50Var.f57154jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                j50Var = new j50(this, gxszxtbevoVar);
            }
        } else {
            j50Var = new j50(this, gxszxtbevoVar);
        }
        Object obj = j50Var.f57156zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = j50Var.f57154jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                f fVar = this.f57903ppxfxbqfkf;
                j50Var.f57154jyumaefscl = 1;
                if (fVar.vdvldrhtss(paymentTokenRequestBody, j50Var) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
        } catch (Exception e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e13);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:36:0x00ba), top: B:44:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0090, please report this as an issue */
    public final Object oxmwwwfdhm(SpasiboBonusesRequestBody spasiboBonusesRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        b30 b30Var;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof b30) {
            b30Var = (b30) wkgbmnqykcVar;
            int i13 = b30Var.f55896iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                b30Var.f55896iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                b30Var = new b30(this, wkgbmnqykcVar);
            }
        } else {
            b30Var = new b30(this, wkgbmnqykcVar);
        }
        Object objOxmwwwfdhm = b30Var.f55898yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = b30Var.f55896iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = b30Var.f55899zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
                kcexrzcfytVar = (lm.kcexrzcfyt) objOxmwwwfdhm;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    gtknphoqwx gtknphoqwxVar = gtknphoqwx.RQ_GOOD_SPASIBO_BONUSES;
                    we0 we0Var = we0.AUTH_VIEW;
                    btVar.iobyxmoadg(new ow(gtknphoqwxVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((SpasiboBonusesResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_SPASIBO_BONUSES, gtknphoqwx.RS_FAIL_SPASIBO_BONUSES, we0Var));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.RQ_FAIL_SPASIBO_BONUSES;
                we0 we0Var2 = we0.AUTH_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar2.iobyxmoadg(new ow(gtknphoqwxVar2, we0Var2, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(nd.RQ_ORDER_SPASIBO_BONUSES, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            b30Var.f55899zdlpuopuiu = this;
            b30Var.f55896iwizpuwonk = 1;
            objOxmwwwfdhm = fVar.oxmwwwfdhm(spasiboBonusesRequestBody, b30Var);
            if (objOxmwwwfdhm == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objOxmwwwfdhm;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar3 = gtknphoqwx.RQ_GOOD_SPASIBO_BONUSES;
                we0 we0Var3 = we0.AUTH_VIEW;
                btVar3.iobyxmoadg(new ow(gtknphoqwxVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success((SpasiboBonusesResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_SPASIBO_BONUSES, gtknphoqwx.RS_FAIL_SPASIBO_BONUSES, we0Var3));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.RQ_FAIL_SPASIBO_BONUSES;
            we0 we0Var4 = we0.AUTH_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar4.iobyxmoadg(new ow(gtknphoqwxVar4, we0Var4, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x0047, B:25:0x0050, B:27:0x006d, B:29:0x0087, B:33:0x0092, B:36:0x009a), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x0047, B:25:0x0050, B:27:0x006d, B:29:0x0087, B:33:0x0092, B:36:0x009a), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x0047, B:25:0x0050, B:27:0x006d, B:29:0x0087, B:33:0x0092, B:36:0x009a), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x0047, B:25:0x0050, B:27:0x006d, B:29:0x0087, B:33:0x0092, B:36:0x009a), top: B:42:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        l60 l60Var;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof l60) {
            l60Var = (l60) wkgbmnqykcVar;
            int i13 = l60Var.f57407iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                l60Var.f57407iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                l60Var = new l60(this, wkgbmnqykcVar);
            }
        } else {
            l60Var = new l60(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = l60Var.f57409yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = l60Var.f57407iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = l60Var.f57410zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                kcexrzcfytVar = (lm.kcexrzcfyt) objIobyxmoadg;
                if (kcexrzcfytVar.gxszxtbevo()) {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(lc.RQ_GOOD_REVOKE_TOKEN_SDK, we0.PROFILE_VIEW, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success(null, 1, null);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                ErrorEntity errorEntityZoijcleaow = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
                bt btVar = o70Var.f57901gxszxtbevo;
                lc lcVar = lc.RQ_FAIL_REVOKE_TOKEN_SDK;
                we0 we0Var = we0.PROFILE_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                if (description == null) {
                    description = "";
                }
                btVar.iobyxmoadg(new ow(lcVar, we0Var, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(errorEntityZoijcleaow);
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        try {
            f fVar = this.f57903ppxfxbqfkf;
            l60Var.f57410zdlpuopuiu = this;
            l60Var.f57407iwizpuwonk = 1;
            objIobyxmoadg = fVar.iobyxmoadg(l60Var);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objIobyxmoadg;
            if (kcexrzcfytVar.gxszxtbevo()) {
                o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(lc.RQ_GOOD_REVOKE_TOKEN_SDK, we0.PROFILE_VIEW, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success(null, 1, null);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            ErrorEntity errorEntityZoijcleaow2 = o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg);
            bt btVar2 = o70Var.f57901gxszxtbevo;
            lc lcVar2 = lc.RQ_FAIL_REVOKE_TOKEN_SDK;
            we0 we0Var2 = we0.PROFILE_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (description == null) {
                description = "";
            }
            btVar2.iobyxmoadg(new ow(lcVar2, we0Var2, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(errorEntityZoijcleaow2);
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:23:0x0065, B:25:0x0085, B:26:0x00ae, B:28:0x00c2, B:32:0x00cd, B:36:0x00d7), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:23:0x0065, B:25:0x0085, B:26:0x00ae, B:28:0x00c2, B:32:0x00cd, B:36:0x00d7), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:23:0x0065, B:25:0x0085, B:26:0x00ae, B:28:0x00c2, B:32:0x00cd, B:36:0x00d7), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:23:0x0065, B:25:0x0085, B:26:0x00ae, B:28:0x00c2, B:32:0x00cd, B:36:0x00d7), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object rgvfuqvkyq(SdkAuthRequestBody sdkAuthRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        q00 q00Var;
        o70 o70Var;
        Object sdkAuthResponseBody;
        SdkAuthResponseBody sdkAuthResponseBody2;
        lm.kcexrzcfyt kcexrzcfytVar;
        we0 we0Var;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        if (wkgbmnqykcVar instanceof q00) {
            q00Var = (q00) wkgbmnqykcVar;
            int i13 = q00Var.f58132iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                q00Var.f58132iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                q00Var = new q00(this, wkgbmnqykcVar);
            }
        } else {
            q00Var = new q00(this, wkgbmnqykcVar);
        }
        Object objWkgbmnqykc = q00Var.f58134yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = q00Var.f58132iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            this.f57901gxszxtbevo.iobyxmoadg(new ow(gtknphoqwx.RQ_SDK_AUTH, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
            try {
                f fVar = this.f57903ppxfxbqfkf;
                q00Var.f58135zdlpuopuiu = this;
                q00Var.f58132iwizpuwonk = 1;
                objWkgbmnqykc = fVar.wkgbmnqykc(sdkAuthRequestBody, q00Var);
                if (objWkgbmnqykc == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                o70Var = this;
                kcexrzcfytVar = (lm.kcexrzcfyt) objWkgbmnqykc;
                bt btVar = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar = gtknphoqwx.ST_SAVE_REFRESH;
                we0Var = we0.AUTH_VIEW;
                btVar.iobyxmoadg(new ow(gtknphoqwxVar, we0Var, mp.ST_SAVE, null, null, null, null, 120));
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(gtknphoqwx.RQ_GOOD_SDK_AUTH, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    sdkAuthResponseBody = new ContentResponse.Success((SdkAuthResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_SDK_AUTH, gtknphoqwx.RS_FAIL_SDK_AUTH, we0Var));
                } else {
                    sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                    bt btVar2 = o70Var.f57901gxszxtbevo;
                    gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.RQ_FAIL_SDK_AUTH;
                    mp mpVar = mp.RQ_FAIL;
                    int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                    if (sPayErrorDtoIobyxmoadg != null) {
                        errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                    } else {
                        errorCode = null;
                    }
                    if (sPayErrorDtoIobyxmoadg != null) {
                        description = sPayErrorDtoIobyxmoadg.getDescription();
                    } else {
                        description = null;
                    }
                    if (description == null) {
                        description = "";
                    }
                    btVar2.iobyxmoadg(new ow(gtknphoqwxVar2, we0Var, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                    sdkAuthResponseBody = new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
                }
            } catch (Exception e13) {
                e = e13;
                o70Var = this;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                sdkAuthResponseBody = new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = q00Var.f58135zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
                kcexrzcfytVar = (lm.kcexrzcfyt) objWkgbmnqykc;
                bt btVar3 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar3 = gtknphoqwx.ST_SAVE_REFRESH;
                we0Var = we0.AUTH_VIEW;
                btVar3.iobyxmoadg(new ow(gtknphoqwxVar3, we0Var, mp.ST_SAVE, null, null, null, null, 120));
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(gtknphoqwx.RQ_GOOD_SDK_AUTH, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    sdkAuthResponseBody = new ContentResponse.Success((SdkAuthResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_SDK_AUTH, gtknphoqwx.RS_FAIL_SDK_AUTH, we0Var));
                } else {
                    sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                    bt btVar4 = o70Var.f57901gxszxtbevo;
                    gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.RQ_FAIL_SDK_AUTH;
                    mp mpVar2 = mp.RQ_FAIL;
                    int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
                    if (sPayErrorDtoIobyxmoadg != null) {
                        errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                    } else {
                        errorCode = null;
                    }
                    if (sPayErrorDtoIobyxmoadg != null) {
                        description = sPayErrorDtoIobyxmoadg.getDescription();
                    } else {
                        description = null;
                    }
                    if (description == null) {
                        description = "";
                    }
                    btVar4.iobyxmoadg(new ow(gtknphoqwxVar4, we0Var, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
                    sdkAuthResponseBody = new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
                }
            } catch (Exception e14) {
                e = e14;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                sdkAuthResponseBody = new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) o70Var.f57904wkgbmnqykc;
        auzgnhcxokVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sdkAuthResponseBody, "sdkAuthResponseBody");
        ContentResponse.Success success = sdkAuthResponseBody instanceof ContentResponse.Success ? (ContentResponse.Success) sdkAuthResponseBody : null;
        if (success != null && (sdkAuthResponseBody2 = (SdkAuthResponseBody) success.getData()) != null) {
            auzgnhcxokVar.f55851gxszxtbevo.setValue(sdkAuthResponseBody2.getUserInfo().toModel());
        }
        return sdkAuthResponseBody;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a3, please report this as an issue */
    public final Object vdvldrhtss(SessionIdRequestBody sessionIdRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        u10 u10Var;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        String str;
        String info;
        if (wkgbmnqykcVar instanceof u10) {
            u10Var = (u10) wkgbmnqykcVar;
            int i13 = u10Var.f58755iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                u10Var.f58755iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                u10Var = new u10(this, wkgbmnqykcVar);
            }
        } else {
            u10Var = new u10(this, wkgbmnqykcVar);
        }
        Object objBtonecajqb = u10Var.f58757yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = u10Var.f58755iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = u10Var.f58758zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
                kcexrzcfytVar = (lm.kcexrzcfyt) objBtonecajqb;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    gtknphoqwx gtknphoqwxVar = gtknphoqwx.RQ_GOOD_SESSION_ID;
                    we0 we0Var = we0.AUTH_VIEW;
                    btVar.iobyxmoadg(new ow(gtknphoqwxVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_SESSION_ID, gtknphoqwx.RS_FAIL_SESSION_ID, we0Var);
                    jlmebxxoox jlmebxxooxVar = o70Var.f57904wkgbmnqykc;
                    ContentResponse.Success response = new ContentResponse.Success(sessionIdResponseBody);
                    auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar;
                    auzgnhcxokVar.getClass();
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
                    auzgnhcxokVar.f55865ppxfxbqfkf = response;
                    return new ContentResponse.Success(sessionIdResponseBody);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.RQ_FAIL_SESSION_ID;
                we0 we0Var2 = we0.AUTH_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                if (sPayErrorDtoIobyxmoadg != null) {
                    description = sPayErrorDtoIobyxmoadg.getDescription();
                } else {
                    description = null;
                }
                str = "";
                if (description == null) {
                    description = "";
                }
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg("Description", description);
                info = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getInfo() : null;
                if (info == null) {
                    str = info;
                }
                btVar2.iobyxmoadg(new ow(gtknphoqwxVar2, we0Var2, mpVar, hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, gg.cqumvgiudr.iobyxmoadg("Info", str)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(gtknphoqwx.RQ_SESSION_ID, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            u10Var.f58758zdlpuopuiu = this;
            u10Var.f58755iwizpuwonk = 1;
            objBtonecajqb = fVar.btonecajqb(sessionIdRequestBody, u10Var);
            if (objBtonecajqb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objBtonecajqb;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar3 = gtknphoqwx.RQ_GOOD_SESSION_ID;
                we0 we0Var3 = we0.AUTH_VIEW;
                btVar3.iobyxmoadg(new ow(gtknphoqwxVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                SessionIdResponseBody sessionIdResponseBody2 = (SessionIdResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_SESSION_ID, gtknphoqwx.RS_FAIL_SESSION_ID, we0Var3);
                jlmebxxoox jlmebxxooxVar2 = o70Var.f57904wkgbmnqykc;
                ContentResponse.Success response2 = new ContentResponse.Success(sessionIdResponseBody2);
                auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) jlmebxxooxVar2;
                auzgnhcxokVar2.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response2, "response");
                auzgnhcxokVar2.f55865ppxfxbqfkf = response2;
                return new ContentResponse.Success(sessionIdResponseBody2);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.RQ_FAIL_SESSION_ID;
            we0 we0Var4 = we0.AUTH_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
                description = sPayErrorDtoIobyxmoadg.getDescription();
            } else {
                description = null;
            }
            str = "";
            if (description == null) {
                description = "";
            }
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg("Description", description);
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (info == null) {
                str = info;
            }
            btVar4.iobyxmoadg(new ow(gtknphoqwxVar4, we0Var4, mpVar2, hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg2, gg.cqumvgiudr.iobyxmoadg("Info", str)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:39:0x00bd, B:41:0x00c5, B:45:0x00cd), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:39:0x00bd, B:41:0x00c5, B:45:0x00cd), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:39:0x00bd, B:41:0x00c5, B:45:0x00cd), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:39:0x00bd, B:41:0x00c5, B:45:0x00cd), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x0090, B:29:0x00a7, B:33:0x00b2, B:39:0x00bd, B:41:0x00c5, B:45:0x00cd), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0090, please report this as an issue */
    public final Object wflxmlrfwp(PaymentOrderRequestBody paymentOrderRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        gy gyVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        String str;
        String info;
        if (wkgbmnqykcVar instanceof gy) {
            gyVar = (gy) wkgbmnqykcVar;
            int i13 = gyVar.f56790iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gyVar.f56790iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gyVar = new gy(this, wkgbmnqykcVar);
            }
        } else {
            gyVar = new gy(this, wkgbmnqykcVar);
        }
        Object objOjitshcjhn = gyVar.f56792yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gyVar.f56790iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = gyVar.f56793zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
                kcexrzcfytVar = (lm.kcexrzcfyt) objOjitshcjhn;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    nd ndVar = nd.RQ_GOOD_PAYMENT_ORDER;
                    we0 we0Var = we0.PAY_VIEW;
                    btVar.iobyxmoadg(new ow(ndVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    return new ContentResponse.Success((PaymentOrderResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nd.RS_GOOD_PAYMENT_ORDER, nd.RS_FAIL_PAYMENT_ORDER, we0Var));
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                nd ndVar2 = nd.RQ_FAIL_PAYMENT_ORDER;
                we0 we0Var2 = we0.PAY_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                if (sPayErrorDtoIobyxmoadg != null) {
                    description = sPayErrorDtoIobyxmoadg.getDescription();
                } else {
                    description = null;
                }
                str = "";
                if (description == null) {
                    description = "";
                }
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg("Description", description);
                info = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getInfo() : null;
                if (info == null) {
                    str = info;
                }
                btVar2.iobyxmoadg(new ow(ndVar2, we0Var2, mpVar, hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, gg.cqumvgiudr.iobyxmoadg("Info", str)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(nd.RQ_PAYMENT_ORDER, we0.PAY_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            gyVar.f56793zdlpuopuiu = this;
            gyVar.f56790iwizpuwonk = 1;
            objOjitshcjhn = fVar.ojitshcjhn(paymentOrderRequestBody, gyVar);
            if (objOjitshcjhn == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objOjitshcjhn;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                nd ndVar3 = nd.RQ_GOOD_PAYMENT_ORDER;
                we0 we0Var3 = we0.PAY_VIEW;
                btVar3.iobyxmoadg(new ow(ndVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                return new ContentResponse.Success((PaymentOrderResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, nd.RS_GOOD_PAYMENT_ORDER, nd.RS_FAIL_PAYMENT_ORDER, we0Var3));
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            nd ndVar4 = nd.RQ_FAIL_PAYMENT_ORDER;
            we0 we0Var4 = we0.PAY_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
                description = sPayErrorDtoIobyxmoadg.getDescription();
            } else {
                description = null;
            }
            str = "";
            if (description == null) {
                description = "";
            }
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg("Description", description);
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (info == null) {
                str = info;
            }
            btVar4.iobyxmoadg(new ow(ndVar4, we0Var4, mpVar2, hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg2, gg.cqumvgiudr.iobyxmoadg("Info", str)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0066, B:27:0x00a3, B:29:0x00ba, B:33:0x00c5, B:39:0x00d0, B:41:0x00d8, B:45:0x00e0), top: B:51:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00a3, please report this as an issue */
    public final Object wkgbmnqykc(BindingSessionIdRequestBody bindingSessionIdRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        dr drVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        String str;
        String info;
        if (wkgbmnqykcVar instanceof dr) {
            drVar = (dr) wkgbmnqykcVar;
            int i13 = drVar.f56314iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                drVar.f56314iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                drVar = new dr(this, wkgbmnqykcVar);
            }
        } else {
            drVar = new dr(this, wkgbmnqykcVar);
        }
        Object objWflxmlrfwp = drVar.f56316yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = drVar.f56314iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = drVar.f56317zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
                kcexrzcfytVar = (lm.kcexrzcfyt) objWflxmlrfwp;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    bt btVar = o70Var.f57901gxszxtbevo;
                    uw uwVar = uw.RQ_GOOD_BINDING_SESSION_ID;
                    we0 we0Var = we0.MERCHANT_VIEW;
                    btVar.iobyxmoadg(new ow(uwVar, we0Var, mp.RQ_GOOD, null, null, null, null, 120));
                    SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, uw.RS_GOOD_BINDING_SESSION_ID, uw.RS_FAIL_BINDING_SESSION_ID, we0Var);
                    jlmebxxoox jlmebxxooxVar = o70Var.f57904wkgbmnqykc;
                    ContentResponse.Success response = new ContentResponse.Success(sessionIdResponseBody);
                    auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar;
                    auzgnhcxokVar.getClass();
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
                    auzgnhcxokVar.f55865ppxfxbqfkf = response;
                    return new ContentResponse.Success(sessionIdResponseBody);
                }
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar2 = o70Var.f57901gxszxtbevo;
                uw uwVar2 = uw.RQ_FAIL_BINDING_SESSION_ID;
                we0 we0Var2 = we0.MERCHANT_VIEW;
                mp mpVar = mp.RQ_FAIL;
                int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                if (sPayErrorDtoIobyxmoadg != null) {
                    description = sPayErrorDtoIobyxmoadg.getDescription();
                } else {
                    description = null;
                }
                str = "";
                if (description == null) {
                    description = "";
                }
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg("Description", description);
                info = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getInfo() : null;
                if (info == null) {
                    str = info;
                }
                btVar2.iobyxmoadg(new ow(uwVar2, we0Var2, mpVar, hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, gg.cqumvgiudr.iobyxmoadg("Info", str)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
        this.f57901gxszxtbevo.iobyxmoadg(new ow(uw.RQ_BINDING_SESSION_ID, we0.MERCHANT_VIEW, mp.RQ, null, null, null, null, 120));
        try {
            f fVar = this.f57903ppxfxbqfkf;
            drVar.f56317zdlpuopuiu = this;
            drVar.f56314iwizpuwonk = 1;
            objWflxmlrfwp = fVar.wflxmlrfwp(bindingSessionIdRequestBody, drVar);
            if (objWflxmlrfwp == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objWflxmlrfwp;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                bt btVar3 = o70Var.f57901gxszxtbevo;
                uw uwVar3 = uw.RQ_GOOD_BINDING_SESSION_ID;
                we0 we0Var3 = we0.MERCHANT_VIEW;
                btVar3.iobyxmoadg(new ow(uwVar3, we0Var3, mp.RQ_GOOD, null, null, null, null, 120));
                SessionIdResponseBody sessionIdResponseBody2 = (SessionIdResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, uw.RS_GOOD_BINDING_SESSION_ID, uw.RS_FAIL_BINDING_SESSION_ID, we0Var3);
                jlmebxxoox jlmebxxooxVar2 = o70Var.f57904wkgbmnqykc;
                ContentResponse.Success response2 = new ContentResponse.Success(sessionIdResponseBody2);
                auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) jlmebxxooxVar2;
                auzgnhcxokVar2.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response2, "response");
                auzgnhcxokVar2.f55865ppxfxbqfkf = response2;
                return new ContentResponse.Success(sessionIdResponseBody2);
            }
            sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
            bt btVar4 = o70Var.f57901gxszxtbevo;
            uw uwVar4 = uw.RQ_FAIL_BINDING_SESSION_ID;
            we0 we0Var4 = we0.MERCHANT_VIEW;
            mp mpVar2 = mp.RQ_FAIL;
            int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
            if (sPayErrorDtoIobyxmoadg != null) {
                errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
            } else {
                errorCode = null;
            }
            if (sPayErrorDtoIobyxmoadg != null) {
                description = sPayErrorDtoIobyxmoadg.getDescription();
            } else {
                description = null;
            }
            str = "";
            if (description == null) {
                description = "";
            }
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg("Description", description);
            if (sPayErrorDtoIobyxmoadg != null) {
            }
            if (info == null) {
                str = info;
            }
            btVar4.iobyxmoadg(new ow(uwVar4, we0Var4, mpVar2, hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg2, gg.cqumvgiudr.iobyxmoadg("Info", str)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
            return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }

    public final void yggfygwlhe(lm.kcexrzcfyt kcexrzcfytVar, SPayErrorDto sPayErrorDto) {
        bt btVar = this.f57901gxszxtbevo;
        x7 x7Var = x7.RQ_FAIL_PAY_ONLINE;
        we0 we0Var = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) this.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PartsStartPay.INSTANCE) ? we0.PAY_VIEW : we0.BNPL_PARTS_VIEW;
        mp mpVar = mp.RQ_FAIL;
        int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
        String errorCode = sPayErrorDto != null ? sPayErrorDto.getErrorCode() : null;
        String description = sPayErrorDto != null ? sPayErrorDto.getDescription() : null;
        if (description == null) {
            description = "";
        }
        btVar.iobyxmoadg(new ow(x7Var, we0Var, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), Integer.valueOf(iZoijcleaow), errorCode, null, 64));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0104 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0114 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x012a A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:23:0x005e, B:25:0x0067, B:27:0x0091, B:29:0x00c0, B:31:0x00c6, B:33:0x00d6, B:35:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fa, B:43:0x0104, B:44:0x0108, B:28:0x00a9, B:46:0x0114, B:48:0x012a, B:52:0x0135, B:55:0x013d), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zdlpuopuiu(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        qu quVar;
        o70 o70Var;
        lm.kcexrzcfyt kcexrzcfytVar;
        SPayErrorDto sPayErrorDtoIobyxmoadg;
        String errorCode;
        String description;
        PartsPaymentPlanBnplResponseBody partsPaymentPlanBnplResponseBody;
        PartsGraphBnpl graphBnpl;
        Integer numWkgbmnqykc;
        List<SixPartPay> sixPartPay;
        SixPartPay sixPartPay2;
        if (wkgbmnqykcVar instanceof qu) {
            quVar = (qu) wkgbmnqykcVar;
            int i13 = quVar.f58239iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                quVar.f58239iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                quVar = new qu(this, wkgbmnqykcVar);
            }
        } else {
            quVar = new qu(this, wkgbmnqykcVar);
        }
        Object objZoijcleaow = quVar.f58241yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = quVar.f58239iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o70Var = quVar.f58242zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                kcexrzcfytVar = (lm.kcexrzcfyt) objZoijcleaow;
                numWkgbmnqykc = null;
                numWkgbmnqykc = null;
                numWkgbmnqykc = null;
                if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                    sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                    bt btVar = o70Var.f57901gxszxtbevo;
                    gtknphoqwx gtknphoqwxVar = gtknphoqwx.RQ_FAIL_CREATE_PAYMENT_PLAN;
                    we0 we0Var = we0.AUTH_VIEW;
                    mp mpVar = mp.RQ_FAIL;
                    int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
                    if (sPayErrorDtoIobyxmoadg != null) {
                        errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                    } else {
                        errorCode = null;
                    }
                    description = sPayErrorDtoIobyxmoadg != null ? sPayErrorDtoIobyxmoadg.getDescription() : null;
                    if (description == null) {
                        description = "";
                    }
                    btVar.iobyxmoadg(new ow(gtknphoqwxVar, we0Var, mpVar, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow), errorCode, null, 64));
                    return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
                }
                bt btVar2 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.RQ_GOOD_CREATE_PAYMENT_PLAN;
                we0 we0Var2 = we0.AUTH_VIEW;
                btVar2.iobyxmoadg(new ow(gtknphoqwxVar2, we0Var2, mp.RQ_GOOD, null, null, null, null, 120));
                partsPaymentPlanBnplResponseBody = (PartsPaymentPlanBnplResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_CREATE_PAYMENT_PLAN, gtknphoqwx.RS_FAIL_CREATE_PAYMENT_PLAN, we0Var2);
                if (partsPaymentPlanBnplResponseBody.isBnplEnabled()) {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(nd.LC_PAY_BNPL_AVAILABLE, we0.NONE, mp.LC, null, null, null, null, 120));
                } else {
                    o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(nd.LC_PAY_BNPL_UNAVAILABLE, we0.NONE, mp.LC, null, null, null, null, 120));
                }
                if (partsPaymentPlanBnplResponseBody.isBnplEnabled() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((auzgnhcxok) o70Var.f57904wkgbmnqykc).btonecajqb(), PayStrategy.PayWithPartsOnly.INSTANCE)) {
                    return new ContentResponse.Failure(ErrorEntity.Unknown.INSTANCE);
                }
                auzgnhcxok auzgnhcxokVar = (auzgnhcxok) o70Var.f57904wkgbmnqykc;
                auzgnhcxokVar.lqeggnwhkg(partsPaymentPlanBnplResponseBody);
                graphBnpl = partsPaymentPlanBnplResponseBody.getGraphBnpl();
                if (graphBnpl != null && (sixPartPay = graphBnpl.getSixPartPay()) != null && (sixPartPay2 = sixPartPay.get(0)) != null) {
                    numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(sixPartPay2.getClientCommission());
                }
                auzgnhcxokVar.f55855iwizpuwonk = numWkgbmnqykc != null ? numWkgbmnqykc.intValue() : 0;
                return new ContentResponse.Success(PartsPaymentPlanBnplResponseBodyKt.mapToPaymentPlanBnplResponseBody(partsPaymentPlanBnplResponseBody));
            } catch (Exception e13) {
                e = e13;
                jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
                return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        try {
            this.f57901gxszxtbevo.iobyxmoadg(new ow(gtknphoqwx.RQ_CREATE_PAYMENT_PLAN, we0.AUTH_VIEW, mp.RQ, null, null, null, null, 120));
            f fVar = this.f57903ppxfxbqfkf;
            quVar.f58242zdlpuopuiu = this;
            quVar.f58239iwizpuwonk = 1;
            objZoijcleaow = fVar.zoijcleaow(paymentBnplPlanRequestBody, quVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            o70Var = this;
            kcexrzcfytVar = (lm.kcexrzcfyt) objZoijcleaow;
            numWkgbmnqykc = null;
            numWkgbmnqykc = null;
            numWkgbmnqykc = null;
            if (zy.ppxfxbqfkf(kcexrzcfytVar)) {
                sPayErrorDtoIobyxmoadg = nm.iobyxmoadg(kcexrzcfytVar.eablkybsjg());
                bt btVar3 = o70Var.f57901gxszxtbevo;
                gtknphoqwx gtknphoqwxVar3 = gtknphoqwx.RQ_FAIL_CREATE_PAYMENT_PLAN;
                we0 we0Var3 = we0.AUTH_VIEW;
                mp mpVar2 = mp.RQ_FAIL;
                int iZoijcleaow2 = kcexrzcfytVar.zoijcleaow();
                if (sPayErrorDtoIobyxmoadg != null) {
                    errorCode = sPayErrorDtoIobyxmoadg.getErrorCode();
                } else {
                    errorCode = null;
                }
                if (sPayErrorDtoIobyxmoadg != null) {
                }
                if (description == null) {
                    description = "";
                }
                btVar3.iobyxmoadg(new ow(gtknphoqwxVar3, we0Var3, mpVar2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("Description", description)), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iZoijcleaow2), errorCode, null, 64));
                return new ContentResponse.Failure(o70Var.zoijcleaow(kcexrzcfytVar, sPayErrorDtoIobyxmoadg));
            }
            bt btVar4 = o70Var.f57901gxszxtbevo;
            gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.RQ_GOOD_CREATE_PAYMENT_PLAN;
            we0 we0Var4 = we0.AUTH_VIEW;
            btVar4.iobyxmoadg(new ow(gtknphoqwxVar4, we0Var4, mp.RQ_GOOD, null, null, null, null, 120));
            partsPaymentPlanBnplResponseBody = (PartsPaymentPlanBnplResponseBody) qh.iobyxmoadg(kcexrzcfytVar, o70Var.f57901gxszxtbevo, gtknphoqwx.RS_GOOD_CREATE_PAYMENT_PLAN, gtknphoqwx.RS_FAIL_CREATE_PAYMENT_PLAN, we0Var4);
            if (partsPaymentPlanBnplResponseBody.isBnplEnabled()) {
                o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(nd.LC_PAY_BNPL_AVAILABLE, we0.NONE, mp.LC, null, null, null, null, 120));
            } else {
                o70Var.f57901gxszxtbevo.iobyxmoadg(new ow(nd.LC_PAY_BNPL_UNAVAILABLE, we0.NONE, mp.LC, null, null, null, null, 120));
            }
            if (partsPaymentPlanBnplResponseBody.isBnplEnabled()) {
            }
            auzgnhcxok auzgnhcxokVar2 = (auzgnhcxok) o70Var.f57904wkgbmnqykc;
            auzgnhcxokVar2.lqeggnwhkg(partsPaymentPlanBnplResponseBody);
            graphBnpl = partsPaymentPlanBnplResponseBody.getGraphBnpl();
            if (graphBnpl != null) {
                numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(sixPartPay2.getClientCommission());
            }
            auzgnhcxokVar2.f55855iwizpuwonk = numWkgbmnqykc != null ? numWkgbmnqykc.intValue() : 0;
            return new ContentResponse.Success(PartsPaymentPlanBnplResponseBodyKt.mapToPaymentPlanBnplResponseBody(partsPaymentPlanBnplResponseBody));
        } catch (Exception e14) {
            e = e14;
            o70Var = this;
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("SPAY_REPO_EXCEPTION").ppxfxbqfkf(e);
            return new ContentResponse.Failure(o70Var.f57902lqeggnwhkg.a(e));
        }
    }
}
