package qo;

import android.content.Context;
import com.yandex.mapkit.MapKitFactory;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.EcomSdkStage;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomSdkFeature;
import modern.payments.ecomAndroid.api.EcomSdkSetupConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vm0.zoijcleaow f79235eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yp1.zoijcleaow f79236gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f79237iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final s21.iobyxmoadg f79238lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final t81.iobyxmoadg f79239nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final a51.iobyxmoadg f79240ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final aq1.iobyxmoadg f79241wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final u01.iobyxmoadg f79242zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f79243iobyxmoadg;

        static {
            int[] iArr = new int[oz0.iobyxmoadg.values().length];
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79243iobyxmoadg = iArr;
        }
    }

    public dxjokdxxww(Context context, u01.iobyxmoadg getDarkModeStateUseCase, a51.iobyxmoadg debugPanelFeatureApi, aq1.iobyxmoadg servicesInitializer, vm0.zoijcleaow analyticsTracker, yp1.zoijcleaow crashLogger, s21.iobyxmoadg apiEndPointsProvider, t81.iobyxmoadg featureManager) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(getDarkModeStateUseCase, "getDarkModeStateUseCase");
        zdlpuopuiu.btonecajqb(debugPanelFeatureApi, "debugPanelFeatureApi");
        zdlpuopuiu.btonecajqb(servicesInitializer, "servicesInitializer");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(crashLogger, "crashLogger");
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        this.f79237iobyxmoadg = context;
        this.f79242zoijcleaow = getDarkModeStateUseCase;
        this.f79240ppxfxbqfkf = debugPanelFeatureApi;
        this.f79241wkgbmnqykc = servicesInitializer;
        this.f79235eablkybsjg = analyticsTracker;
        this.f79236gxszxtbevo = crashLogger;
        this.f79238lqeggnwhkg = apiEndPointsProvider;
        this.f79239nufgyqmvbu = featureManager;
    }

    private final void eablkybsjg() {
        this.f79239nufgyqmvbu.zoijcleaow();
    }

    private final void gxszxtbevo() {
        MapKitFactory.setApiKey(uw0.ppxfxbqfkf.f114521iobyxmoadg.sopmlzcsov());
        MapKitFactory.initialize(this.f79237iobyxmoadg);
    }

    private final void lqeggnwhkg(oz0.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f79243iobyxmoadg[iobyxmoadgVar.ordinal()];
        int i14 = 2;
        if (i13 != 1) {
            if (i13 == 2) {
                i14 = 1;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = -1;
            }
        }
        androidx.appcompat.app.lqeggnwhkg.cllcsxoeiz(i14);
    }

    private final void ppxfxbqfkf() {
        EcomSdk.INSTANCE.getInstance().m12setupIoAF18A(new EcomSdkSetupConfig(this.f79237iobyxmoadg, null, this.f79238lqeggnwhkg.lqeggnwhkg() == s21.zoijcleaow.PROD ? EcomSdkStage.PROD : EcomSdkStage.SANDBOX, jyumaefscl.eablkybsjg(EcomSdkFeature.PAY_BY_SBP), uw0.ppxfxbqfkf.f114521iobyxmoadg.kcexrzcfyt(), new tg.draadjrbmk() { // from class: qo.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.wkgbmnqykc(((Boolean) obj).booleanValue());
            }
        }, null, 66, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(boolean z13) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zoijcleaow() {
        this.f79240ppxfxbqfkf.iobyxmoadg(this.f79237iobyxmoadg);
    }

    public final void dxjokdxxww() {
        this.f79241wkgbmnqykc.iobyxmoadg(this.f79237iobyxmoadg);
    }

    public final void nufgyqmvbu() {
        i42.iobyxmoadg.f41970iobyxmoadg.iobyxmoadg(false);
        kr0.wkgbmnqykc.f60450iobyxmoadg.iobyxmoadg(uw0.ppxfxbqfkf.f114521iobyxmoadg.wwaezpbzkn() ? new kr0.iobyxmoadg(this.f79236gxszxtbevo, this.f79240ppxfxbqfkf.ppxfxbqfkf()) : new kr0.iobyxmoadg(this.f79236gxszxtbevo, new kr0.zoijcleaow[0]));
        eablkybsjg();
        vm0.zoijcleaow zoijcleaowVar = this.f79235eablkybsjg;
        zoijcleaowVar.iobyxmoadg();
        zoijcleaowVar.ppxfxbqfkf(ym0.btonecajqb.iobyxmoadg.f125928gxszxtbevo);
        zoijcleaowVar.ppxfxbqfkf(ym0.eablkybsjg.iobyxmoadg.f125930gxszxtbevo);
        lqeggnwhkg((oz0.iobyxmoadg) this.f79242zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg));
        gxszxtbevo();
        zoijcleaow();
        ppxfxbqfkf();
        r41.iobyxmoadg.f81705iobyxmoadg.iobyxmoadg(this.f79237iobyxmoadg);
    }
}
