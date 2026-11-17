package gf0;

import gg.wwaezpbzkn;
import gk.jyumaefscl;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.iwizpuwonk;
import lk.lereixgezr;
import lm.gxszxtbevo;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f37090iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(gk.eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final lereixgezr eablkybsjg(iwizpuwonk loggingInterceptor, iwizpuwonk errorWrapperInterceptor, HostnameVerifier hostnameVerifier, p20.iobyxmoadg getCurrentApiEndPointUseCase) {
        zdlpuopuiu.btonecajqb(loggingInterceptor, "loggingInterceptor");
        zdlpuopuiu.btonecajqb(errorWrapperInterceptor, "errorWrapperInterceptor");
        zdlpuopuiu.btonecajqb(hostnameVerifier, "hostnameVerifier");
        zdlpuopuiu.btonecajqb(getCurrentApiEndPointUseCase, "getCurrentApiEndPointUseCase");
        lereixgezr.iobyxmoadg iobyxmoadgVarIobyxmoadg = new lereixgezr.iobyxmoadg().iobyxmoadg(loggingInterceptor).iobyxmoadg(errorWrapperInterceptor).iobyxmoadg(new if0.iobyxmoadg(getCurrentApiEndPointUseCase));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return iobyxmoadgVarIobyxmoadg.wypolnanlu(30L, timeUnit).eablkybsjg(30L, timeUnit).tzroggbefp(30L, timeUnit).stevsuqkhv(true).dsvhmnatus(hostnameVerifier).ppxfxbqfkf();
    }

    public final lm.zdlpuopuiu gxszxtbevo(lereixgezr okHttpClient, l40.zoijcleaow apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(okHttpClient, "okHttpClient");
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        lm.zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = new lm.zdlpuopuiu.zoijcleaow().iobyxmoadg(zoijcleaow()).iobyxmoadg(nm.gtknphoqwx.gxszxtbevo()).zoijcleaow(apiEndPointsProvider.wkgbmnqykc()).gxszxtbevo(okHttpClient).wkgbmnqykc();
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarWkgbmnqykc, "build(...)");
        return zdlpuopuiuVarWkgbmnqykc;
    }

    public final df0.iobyxmoadg wkgbmnqykc(lm.zdlpuopuiu retrofit) {
        zdlpuopuiu.btonecajqb(retrofit, "retrofit");
        Object objZoijcleaow = retrofit.zoijcleaow(df0.iobyxmoadg.class);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "create(...)");
        return (df0.iobyxmoadg) objZoijcleaow;
    }

    public final gxszxtbevo.iobyxmoadg zoijcleaow() {
        return ff.ppxfxbqfkf.iobyxmoadg(jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: gf0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.ppxfxbqfkf((gk.eablkybsjg) obj);
            }
        }, 1, null), cqumvgiudr.f62887eablkybsjg.iobyxmoadg("application/json; charset=UTF8"));
    }
}
