package kk;

import android.content.Context;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import modern.payments.ecomAndroid.data.common.MockConstants;
import spay.sdk.data.dto.response.PartsPaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentOrderResponseBodyDto;
import spay.sdk.data.dto.response.PaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentTokenResponseBodyDto;
import spay.sdk.data.dto.response.SdkAuthResponseBodyDto;
import spay.sdk.data.dto.response.SessionIdResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingSessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.CreateBindingOtpResponseBodyDto;
import spay.sdk.data.dto.response.listOfCards.ListOfCardsResponseBodyDto;
import spay.sdk.data.dto.response.otp.ConfirmOtpResponseBodyDto;
import spay.sdk.data.dto.response.otp.CreateOtpSdkResponseBodyDto;
import spay.sdk.data.dto.response.spasibo.SpasiboBonusesResponseBodyDto;
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
public final class gj implements f {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final LinkedHashMap f56714wkgbmnqykc = new LinkedHashMap();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f56715iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final wc0 f56716ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final btonecajqb f56717zoijcleaow;

    public gj(Context context, btonecajqb hashUtility, wc0 featuresHandler) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hashUtility, "hashUtility");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featuresHandler, "featuresHandler");
        this.f56715iobyxmoadg = context;
        this.f56717zoijcleaow = hashUtility;
        this.f56716ppxfxbqfkf = featuresHandler;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object agtfadlqog(CreateOtpSdkRequestBody createOtpSdkRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        o3 o3Var;
        int iIntValue;
        gj gjVar;
        if (gxszxtbevoVar instanceof o3) {
            o3Var = (o3) gxszxtbevoVar;
            int i13 = o3Var.f57881iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                o3Var.f57881iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                o3Var = new o3(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            o3Var = new o3(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = o3Var.f57883yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = o3Var.f57881iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            LinkedHashMap linkedHashMap = f56714wkgbmnqykc;
            if (linkedHashMap.get("createOtpSdk") == null) {
                iIntValue = 1;
            } else {
                Object obj2 = linkedHashMap.get("createOtpSdk");
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj2);
                iIntValue = ((Number) obj2).intValue() + 1;
            }
            linkedHashMap.put("createOtpSdk", kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iIntValue));
            o3Var.f57884zdlpuopuiu = this;
            o3Var.f57881iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(1000L, o3Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = o3Var.f57884zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        Gson gson = new Gson();
        Integer num = (Integer) f56714wkgbmnqykc.get("createOtpSdk");
        CreateOtpSdkResponseBodyDto createOtpSdkResponseBodyDto = (CreateOtpSdkResponseBodyDto) gson.gtknphoqwx(gjVar.kcexrzcfyt((num != null ? num.intValue() : 1) < 4 ? "create_otp_sdk_response.json" : "create_otp_response_attempts_exhausted.json"), CreateOtpSdkResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(createOtpSdkResponseBodyDto, "createOtpSdkResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(createOtpSdkResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object btonecajqb(SessionIdRequestBody sessionIdRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        qd qdVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof qd) {
            qdVar = (qd) gxszxtbevoVar;
            int i13 = qdVar.f58175iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qdVar.f58175iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                qdVar = new qd(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            qdVar = new qd(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = qdVar.f58177yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = qdVar.f58175iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            f56714wkgbmnqykc.clear();
            qdVar.f58178zdlpuopuiu = this;
            qdVar.f58175iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, qdVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = qdVar.f58178zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        SessionIdResponseBodyDto sessionIdResponseBodyDto = (SessionIdResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("session_id_response.json"), SessionIdResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sessionIdResponseBodyDto, "sessionIdResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(sessionIdResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object draadjrbmk(PayOnlineRequestBody payOnlineRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        x6 x6Var;
        gj gjVar;
        if (gxszxtbevoVar instanceof x6) {
            x6Var = (x6) gxszxtbevoVar;
            int i13 = x6Var.f59258iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                x6Var.f59258iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                x6Var = new x6(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            x6Var = new x6(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = x6Var.f59260yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = x6Var.f59258iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            x6Var.f59261zdlpuopuiu = this;
            x6Var.f59258iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, x6Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = x6Var.f59261zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        gjVar.getClass();
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(wwaezpbzknVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object dxjokdxxww(ConfirmOtpRequestBody confirmOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        k1 k1Var;
        int iIntValue;
        gj gjVar;
        String str;
        if (gxszxtbevoVar instanceof k1) {
            k1Var = (k1) gxszxtbevoVar;
            int i13 = k1Var.f57247cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                k1Var.f57247cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            k1Var = new k1(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = k1Var.f57249jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = k1Var.f57247cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            LinkedHashMap linkedHashMap = f56714wkgbmnqykc;
            if (linkedHashMap.get("confirmOtp") == null) {
                iIntValue = 1;
            } else {
                Object obj2 = linkedHashMap.get("confirmOtp");
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj2);
                iIntValue = ((Number) obj2).intValue() + 1;
            }
            linkedHashMap.put("confirmOtp", Integer.valueOf(iIntValue));
            k1Var.f57251zdlpuopuiu = this;
            k1Var.f57250yggfygwlhe = confirmOtpRequestBody;
            k1Var.f57247cqumvgiudr = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, k1Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmOtpRequestBody = k1Var.f57250yggfygwlhe;
            gjVar = k1Var.f57251zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        String otpHash = confirmOtpRequestBody.getOtpHash();
        gjVar.f56717zoijcleaow.getClass();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(otpHash, btonecajqb.iobyxmoadg("119950526"))) {
            str = "confirm_otp_response.json";
        } else {
            Integer num = (Integer) f56714wkgbmnqykc.get("confirmOtp");
            str = (num != null ? num.intValue() : 1) < 4 ? "confirm_otp_response_wrong_code.json" : "confirm_otp_response_attempts_exhausted.json";
        }
        ConfirmOtpResponseBodyDto confirmOtpResponseBodyDto = (ConfirmOtpResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt(str), ConfirmOtpResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(confirmOtpResponseBodyDto, "confirmOtpResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(confirmOtpResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object eablkybsjg(ListOfCardsRequestBody listOfCardsRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        a8 a8Var;
        gj gjVar;
        if (gxszxtbevoVar instanceof a8) {
            a8Var = (a8) gxszxtbevoVar;
            int i13 = a8Var.f55784iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                a8Var.f55784iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                a8Var = new a8(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            a8Var = new a8(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = a8Var.f55786yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = a8Var.f55784iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            a8Var.f55787zdlpuopuiu = this;
            a8Var.f55784iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, a8Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = a8Var.f55787zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        ListOfCardsResponseBodyDto listOfCardsResponseBodyDto = (ListOfCardsResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("payment_accounts.json"), ListOfCardsResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listOfCardsResponseBodyDto, "listOfCardsResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(listOfCardsResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object gtknphoqwx(CreateBindingOtpRequestBody createBindingOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        m2 m2Var;
        gj gjVar;
        if (gxszxtbevoVar instanceof m2) {
            m2Var = (m2) gxszxtbevoVar;
            int i13 = m2Var.f57575iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                m2Var.f57575iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                m2Var = new m2(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            m2Var = new m2(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = m2Var.f57577yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = m2Var.f57575iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            m2Var.f57578zdlpuopuiu = this;
            m2Var.f57575iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, m2Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = m2Var.f57578zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        CreateBindingOtpResponseBodyDto createBindingResponseBodyDto = (CreateBindingOtpResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("create_binding_otp_response.json"), CreateBindingOtpResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(createBindingResponseBodyDto, "createBindingResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(createBindingResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object gxszxtbevo(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        ia iaVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof ia) {
            iaVar = (ia) gxszxtbevoVar;
            int i13 = iaVar.f57015iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iaVar.f57015iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iaVar = new ia(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            iaVar = new ia(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = iaVar.f57017yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iaVar.f57015iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iaVar.f57018zdlpuopuiu = this;
            iaVar.f57015iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, iaVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = iaVar.f57018zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        PaymentPlanBnplResponseBodyDto paymentPlanBnplResponseBodyDto = (PaymentPlanBnplResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("payment_bnpl_plan.json"), PaymentPlanBnplResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(paymentPlanBnplResponseBodyDto, "paymentPlanBnplResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(paymentPlanBnplResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        ci ciVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof ci) {
            ciVar = (ci) gxszxtbevoVar;
            int i13 = ciVar.f56164iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ciVar.f56164iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ciVar = new ci(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            ciVar = new ci(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = ciVar.f56166yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ciVar.f56164iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ciVar.f56167zdlpuopuiu = this;
            ciVar.f56164iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, ciVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = ciVar.f56167zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        gjVar.getClass();
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(wwaezpbzknVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    public final String kcexrzcfyt(String str) throws Throwable {
        String strPpxfxbqfkf;
        Throwable th2;
        try {
            InputStream inputStreamOpen = this.f56715iobyxmoadg.getAssets().open(str);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(inputStreamOpen, "context.assets.open(filenamePath)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, mj.wkgbmnqykc.f67326zoijcleaow), 8192);
            try {
                strPpxfxbqfkf = rg.gtknphoqwx.ppxfxbqfkf(bufferedReader);
                try {
                    bufferedReader.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    gg.lqeggnwhkg.iobyxmoadg(th4, th5);
                }
                th2 = th4;
                strPpxfxbqfkf = null;
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(strPpxfxbqfkf);
            if (strPpxfxbqfkf != null) {
                return strPpxfxbqfkf;
            }
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("jsonString");
            return null;
        } catch (IOException e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("JSON READ EXCEPTION").ppxfxbqfkf(e13);
            strPpxfxbqfkf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object lqeggnwhkg(ListOfCardsRequestBody listOfCardsRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        s4 s4Var;
        gj gjVar;
        String str;
        if (gxszxtbevoVar instanceof s4) {
            s4Var = (s4) gxszxtbevoVar;
            int i13 = s4Var.f58505cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                s4Var.f58505cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                s4Var = new s4(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            s4Var = new s4(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = s4Var.f58507jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = s4Var.f58505cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            s4Var.f58509zdlpuopuiu = this;
            s4Var.f58508yggfygwlhe = listOfCardsRequestBody;
            s4Var.f58505cqumvgiudr = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, s4Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listOfCardsRequestBody = s4Var.f58508yggfygwlhe;
            gjVar = s4Var.f58509zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true))) {
            str = "single_list_cards.json";
        } else {
            kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listOfCardsRequestBody.getPriorityCardOnly(), kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
            str = "list_cards.json";
        }
        ListOfCardsResponseBodyDto listOfCardsResponseBodyDto = (ListOfCardsResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt(str), ListOfCardsResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listOfCardsResponseBodyDto, "listOfCardsResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(listOfCardsResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object nufgyqmvbu(PayBindingOtpRequestBody payBindingOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        ah ahVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof ah) {
            ahVar = (ah) gxszxtbevoVar;
            int i13 = ahVar.f55817iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ahVar.f55817iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ahVar = new ah(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            ahVar = new ah(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = ahVar.f55819yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ahVar.f55817iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ahVar.f55820zdlpuopuiu = this;
            ahVar.f55817iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, ahVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = ahVar.f55820zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        gjVar.getClass();
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(wwaezpbzknVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object ojitshcjhn(PaymentOrderRequestBody paymentOrderRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        c9 c9Var;
        gj gjVar;
        if (gxszxtbevoVar instanceof c9) {
            c9Var = (c9) gxszxtbevoVar;
            int i13 = c9Var.f56110iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c9Var.f56110iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c9Var = new c9(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            c9Var = new c9(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = c9Var.f56112yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c9Var.f56110iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c9Var.f56113zdlpuopuiu = this;
            c9Var.f56110iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, c9Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = c9Var.f56113zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        PaymentOrderResponseBodyDto paymentOrderResponseDto = (PaymentOrderResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("payment_order_sdk.json"), PaymentOrderResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(paymentOrderResponseDto, "paymentOrderResponseDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(paymentOrderResponseDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object oxmwwwfdhm(SpasiboBonusesRequestBody spasiboBonusesRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        vf vfVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof vf) {
            vfVar = (vf) gxszxtbevoVar;
            int i13 = vfVar.f59003iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vfVar.f59003iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                vfVar = new vf(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            vfVar = new vf(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = vfVar.f59005yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = vfVar.f59003iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            vfVar.f59006zdlpuopuiu = this;
            vfVar.f59003iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, vfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = vfVar.f59006zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        String str = "order_spasibo_bonuses_response_v2.json";
        if (!zd0.zoijcleaow(gjVar.f56716ppxfxbqfkf, vf0.BOTH) && !zd0.zoijcleaow(gjVar.f56716ppxfxbqfkf, vf0.S_BONUSES_V2)) {
            if (!zd0.zoijcleaow(gjVar.f56716ppxfxbqfkf, vf0.S_BONUSES_V1)) {
                throw new IllegalArgumentException("SBonuses Feature disabled");
            }
            str = "order_spasibo_bonuses_response_v1.json";
        }
        SpasiboBonusesResponseBodyDto spasiboBonusesResponseBodyDto = (SpasiboBonusesResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt(str), SpasiboBonusesResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spasiboBonusesResponseBodyDto, "spasiboBonusesResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(spasiboBonusesResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object ppxfxbqfkf(ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        i0 i0Var;
        gj gjVar;
        if (gxszxtbevoVar instanceof i0) {
            i0Var = (i0) gxszxtbevoVar;
            int i13 = i0Var.f56973iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                i0Var.f56973iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            i0Var = new i0(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = i0Var.f56975yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = i0Var.f56973iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            i0Var.f56976zdlpuopuiu = this;
            i0Var.f56973iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, i0Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = i0Var.f56976zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        gjVar.getClass();
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(wwaezpbzknVar);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object rgvfuqvkyq(PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        lb lbVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof lb) {
            lbVar = (lb) gxszxtbevoVar;
            int i13 = lbVar.f57427iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lbVar.f57427iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lbVar = new lb(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            lbVar = new lb(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = lbVar.f57429yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lbVar.f57427iwizpuwonk;
        int iIntValue = 1;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            lbVar.f57430zdlpuopuiu = this;
            lbVar.f57427iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, lbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = lbVar.f57430zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        gjVar.getClass();
        LinkedHashMap linkedHashMap = f56714wkgbmnqykc;
        if (linkedHashMap.get("fraudMon") != null) {
            Object obj2 = linkedHashMap.get("fraudMon");
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj2);
            iIntValue = 1 + ((Number) obj2).intValue();
        }
        linkedHashMap.put("fraudMon", Integer.valueOf(iIntValue));
        PaymentTokenResponseBodyDto paymentTokenDto = (PaymentTokenResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("payment_token.json"), PaymentTokenResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(paymentTokenDto, "paymentTokenDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(paymentTokenDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    @Override // kk.f
    public final Object vdvldrhtss(PaymentTokenRequestBody paymentTokenRequestBody, j50 j50Var) {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object wflxmlrfwp(BindingSessionIdRequestBody bindingSessionIdRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        te teVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof te) {
            teVar = (te) gxszxtbevoVar;
            int i13 = teVar.f58651iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                teVar.f58651iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                teVar = new te(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            teVar = new te(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = teVar.f58653yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = teVar.f58651iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            teVar.f58654zdlpuopuiu = this;
            teVar.f58651iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, teVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = teVar.f58654zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        BindingSessionResponseBodyDto bindingSessionIdResponseBodyDto = (BindingSessionResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("binding_session_response.json"), BindingSessionResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bindingSessionIdResponseBodyDto, "bindingSessionIdResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(bindingSessionIdResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object wkgbmnqykc(SdkAuthRequestBody sdkAuthRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        nc ncVar;
        gj gjVar;
        if (gxszxtbevoVar instanceof nc) {
            ncVar = (nc) gxszxtbevoVar;
            int i13 = ncVar.f57753iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ncVar.f57753iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ncVar = new nc(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            ncVar = new nc(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = ncVar.f57755yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ncVar.f57753iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ncVar.f57756zdlpuopuiu = this;
            ncVar.f57753iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, ncVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = ncVar.f57756zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        SdkAuthResponseBodyDto sdkAuthResponseBodyDto = (SdkAuthResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("sdk_auth_response.json"), SdkAuthResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sdkAuthResponseBodyDto, "sdkAuthResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(sdkAuthResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kk.f
    public final Object zoijcleaow(PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, lg.gxszxtbevo gxszxtbevoVar) {
        u5 u5Var;
        gj gjVar;
        if (gxszxtbevoVar instanceof u5) {
            u5Var = (u5) gxszxtbevoVar;
            int i13 = u5Var.f58773iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                u5Var.f58773iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                u5Var = new u5(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
            }
        } else {
            u5Var = new u5(this, (kotlin.coroutines.jvm.internal.wkgbmnqykc) gxszxtbevoVar);
        }
        Object obj = u5Var.f58775yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = u5Var.f58773iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            u5Var.f58776zdlpuopuiu = this;
            u5Var.f58773iwizpuwonk = 1;
            if (pj.crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, u5Var) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gjVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gjVar = u5Var.f58776zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        PartsPaymentPlanBnplResponseBodyDto paymentPlanBnplResponseBodyDto = (PartsPaymentPlanBnplResponseBodyDto) new Gson().gtknphoqwx(gjVar.kcexrzcfyt("parts_payment_bnpl_plan.json"), PartsPaymentPlanBnplResponseBodyDto.class);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(paymentPlanBnplResponseBodyDto, "paymentPlanBnplResponseBodyDto");
        lm.kcexrzcfyt kcexrzcfytVarBtonecajqb = lm.kcexrzcfyt.btonecajqb(paymentPlanBnplResponseBodyDto);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(successfulResponseBody)");
        return kcexrzcfytVarBtonecajqb;
    }
}
