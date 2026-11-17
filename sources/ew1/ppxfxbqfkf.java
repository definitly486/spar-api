package ew1;

import aw1.AuthTokenResponse;
import gg.wwaezpbzkn;
import gk.btonecajqb;
import gk.eablkybsjg;
import gk.jyumaefscl;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;
import sj.zynmafqrjb;
import tg.draadjrbmk;
import zv1.AuthNewTokenRequest;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gk.zoijcleaow f32282iobyxmoadg = jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: ew1.zoijcleaow
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return ppxfxbqfkf.nufgyqmvbu((eablkybsjg) obj);
        }
    }, 1, null);

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f32283cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f32284iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f32285jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32286yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32287zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32284iwizpuwonk = obj;
            this.f32283cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.gtknphoqwx(null, null, null, this);
        }
    }

    public static final void btonecajqb(zynmafqrjb zynmafqrjbVar) {
        Object value;
        zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<this>");
        do {
            value = zynmafqrjbVar.getValue();
            ((Number) value).intValue();
        } while (!zynmafqrjbVar.compareAndSet(value, 0));
    }

    public static final lk.zynmafqrjb draadjrbmk(lk.zynmafqrjb zynmafqrjbVar, String str) {
        zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<this>");
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarNufgyqmvbu = zynmafqrjbVar.nufgyqmvbu();
        if (str != null) {
            iobyxmoadgVarNufgyqmvbu = iobyxmoadgVarNufgyqmvbu.dxjokdxxww("Authorization", "Bearer " + str);
        }
        return iobyxmoadgVarNufgyqmvbu.zoijcleaow();
    }

    public static final cdpycssgdh dxjokdxxww(iwizpuwonk.iobyxmoadg iobyxmoadgVar, lk.zynmafqrjb request) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(request, "request");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return iobyxmoadgVar.ppxfxbqfkf(5, timeUnit).eablkybsjg(5, timeUnit).iobyxmoadg(5, timeUnit).zoijcleaow(request);
    }

    public static final boolean eablkybsjg(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return TokenInfo.INSTANCE.iobyxmoadg(localDateTime);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object gtknphoqwx(iwizpuwonk iwizpuwonkVar, iwizpuwonk.iobyxmoadg iobyxmoadgVar, zynmafqrjb zynmafqrjbVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar2;
        Object value;
        Integer numWkgbmnqykc;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar2.f32283cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar2.f32283cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar2.f32284iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar2.f32283cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar2.f32287zdlpuopuiu = iwizpuwonkVar;
            iobyxmoadgVar2.f32286yggfygwlhe = iobyxmoadgVar;
            iobyxmoadgVar2.f32285jyumaefscl = zynmafqrjbVar;
            iobyxmoadgVar2.f32283cqumvgiudr = 1;
            if (crxdokpmqz.zoijcleaow(100L, iobyxmoadgVar2) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zynmafqrjbVar = (zynmafqrjb) iobyxmoadgVar2.f32285jyumaefscl;
            iobyxmoadgVar = (iwizpuwonk.iobyxmoadg) iobyxmoadgVar2.f32286yggfygwlhe;
            iwizpuwonkVar = (iwizpuwonk) iobyxmoadgVar2.f32287zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        do {
            value = zynmafqrjbVar.getValue();
            numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(((Number) value).intValue() + 1);
        } while (!zynmafqrjbVar.compareAndSet(value, numWkgbmnqykc));
        if (numWkgbmnqykc.intValue() >= 50) {
            return null;
        }
        return iwizpuwonkVar.intercept(iobyxmoadgVar);
    }

    public static final boolean gxszxtbevo(BasicResponse basicResponse) {
        ErrorResponse error;
        if (basicResponse == null || (error = basicResponse.getError()) == null) {
            return false;
        }
        return zdlpuopuiu.eablkybsjg(error.getCode(), "requireLogout");
    }

    public static final boolean lqeggnwhkg(BasicResponse basicResponse) {
        ErrorResponse error;
        if (basicResponse == null || (error = basicResponse.getError()) == null) {
            return false;
        }
        return zdlpuopuiu.eablkybsjg(error.getCode(), "tokenExpired");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final BasicResponse ppxfxbqfkf(cdpycssgdh cdpycssgdhVar) {
        zdlpuopuiu.btonecajqb(cdpycssgdhVar, "<this>");
        gk.zoijcleaow zoijcleaowVar = f32282iobyxmoadg;
        String strAgtfadlqog = cdpycssgdhVar.lereixgezr(Long.MAX_VALUE).agtfadlqog();
        zoijcleaowVar.iobyxmoadg();
        return (BasicResponse) zoijcleaowVar.ppxfxbqfkf(BasicResponse.INSTANCE.serializer(btonecajqb.INSTANCE.serializer()), strAgtfadlqog);
    }

    public static final lk.zynmafqrjb wflxmlrfwp(lk.zynmafqrjb zynmafqrjbVar, String endPoint, String refreshToken) {
        zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<this>");
        zdlpuopuiu.btonecajqb(endPoint, "endPoint");
        zdlpuopuiu.btonecajqb(refreshToken, "refreshToken");
        istkbnxepw.iobyxmoadg iobyxmoadgVar = istkbnxepw.f63065iobyxmoadg;
        gk.zoijcleaow zoijcleaowVar = f32282iobyxmoadg;
        AuthNewTokenRequest authNewTokenRequest = new AuthNewTokenRequest(refreshToken);
        zoijcleaowVar.iobyxmoadg();
        return zynmafqrjbVar.nufgyqmvbu().draadjrbmk(iobyxmoadgVar.zoijcleaow(zoijcleaowVar.zoijcleaow(AuthNewTokenRequest.INSTANCE.serializer(), authNewTokenRequest), cqumvgiudr.f62887eablkybsjg.iobyxmoadg(PaymentFlowNetworkModuleKt.REQUEST_TYPE))).kcexrzcfyt(endPoint + "spar-auth/token/refresh").zoijcleaow();
    }

    public static final boolean wkgbmnqykc(fw1.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return iobyxmoadgVar.pmvmpeiblj() != null;
    }

    public static final BasicResponse zoijcleaow(cdpycssgdh cdpycssgdhVar) {
        zdlpuopuiu.btonecajqb(cdpycssgdhVar, "<this>");
        gk.zoijcleaow zoijcleaowVar = f32282iobyxmoadg;
        String strAgtfadlqog = cdpycssgdhVar.lereixgezr(Long.MAX_VALUE).agtfadlqog();
        zoijcleaowVar.iobyxmoadg();
        return (BasicResponse) zoijcleaowVar.ppxfxbqfkf(BasicResponse.INSTANCE.serializer(AuthTokenResponse.INSTANCE.serializer()), strAgtfadlqog);
    }
}
