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
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lo.zoijcleaow f79244eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c42.zoijcleaow f79245gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f79246iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final n42.iobyxmoadg f79247lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final l40.iobyxmoadg f79248nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final m70.ppxfxbqfkf f79249ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final e42.iobyxmoadg f79250wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l20.iobyxmoadg f79251zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f79252iobyxmoadg;

        static {
            int[] iArr = new int[x00.iobyxmoadg.values().length];
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79252iobyxmoadg = iArr;
        }
    }

    public lqeggnwhkg(Context context, l20.iobyxmoadg getDarkModeStateUseCase, m70.ppxfxbqfkf debugPanel, e42.iobyxmoadg servicesInitializer, lo.zoijcleaow analyticsTracker, c42.zoijcleaow crashLogger, n42.iobyxmoadg remoteConfig, l40.iobyxmoadg apiConfig) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(getDarkModeStateUseCase, "getDarkModeStateUseCase");
        zdlpuopuiu.btonecajqb(debugPanel, "debugPanel");
        zdlpuopuiu.btonecajqb(servicesInitializer, "servicesInitializer");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(crashLogger, "crashLogger");
        zdlpuopuiu.btonecajqb(remoteConfig, "remoteConfig");
        zdlpuopuiu.btonecajqb(apiConfig, "apiConfig");
        this.f79246iobyxmoadg = context;
        this.f79251zoijcleaow = getDarkModeStateUseCase;
        this.f79249ppxfxbqfkf = debugPanel;
        this.f79250wkgbmnqykc = servicesInitializer;
        this.f79244eablkybsjg = analyticsTracker;
        this.f79245gxszxtbevo = crashLogger;
        this.f79247lqeggnwhkg = remoteConfig;
        this.f79248nufgyqmvbu = apiConfig;
    }

    private final void eablkybsjg() {
        this.f79247lqeggnwhkg.zoijcleaow();
    }

    private final void gxszxtbevo() {
        MapKitFactory.setApiKey(xx.iobyxmoadg.f123319iobyxmoadg.fiwbwshyhd());
        MapKitFactory.initialize(this.f79246iobyxmoadg);
    }

    private final void lqeggnwhkg(x00.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f79252iobyxmoadg[iobyxmoadgVar.ordinal()];
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
        EcomSdk.INSTANCE.getInstance().m12setupIoAF18A(new EcomSdkSetupConfig(this.f79246iobyxmoadg, null, this.f79248nufgyqmvbu.iobyxmoadg() == l40.ppxfxbqfkf.PROD ? EcomSdkStage.PROD : EcomSdkStage.SANDBOX, jyumaefscl.eablkybsjg(EcomSdkFeature.PAY_BY_SBP), xx.iobyxmoadg.f123319iobyxmoadg.iozdgvuglv(), new tg.draadjrbmk() { // from class: qo.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.wkgbmnqykc(((Boolean) obj).booleanValue());
            }
        }, null, 66, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(boolean z13) {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zoijcleaow() {
        if (xx.iobyxmoadg.f123319iobyxmoadg.iozdgvuglv()) {
            this.f79249ppxfxbqfkf.gxszxtbevo(this.f79246iobyxmoadg);
        }
    }

    public final void dxjokdxxww() {
        this.f79250wkgbmnqykc.iobyxmoadg(this.f79246iobyxmoadg);
    }

    public final void nufgyqmvbu() {
        i42.iobyxmoadg.f41970iobyxmoadg.iobyxmoadg(false);
        rs.wkgbmnqykc.f83693iobyxmoadg.iobyxmoadg(xx.iobyxmoadg.f123319iobyxmoadg.rlfsiqarku() ? new rs.iobyxmoadg(this.f79245gxszxtbevo, this.f79249ppxfxbqfkf) : new rs.iobyxmoadg(this.f79245gxszxtbevo, new rs.zoijcleaow[0]));
        eablkybsjg();
        lo.zoijcleaow zoijcleaowVar = this.f79244eablkybsjg;
        zoijcleaowVar.iobyxmoadg();
        zoijcleaowVar.wkgbmnqykc(oo.btonecajqb.iobyxmoadg.f73266gxszxtbevo);
        zoijcleaowVar.wkgbmnqykc(oo.eablkybsjg.iobyxmoadg.f73268gxszxtbevo);
        lqeggnwhkg((x00.iobyxmoadg) this.f79251zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg));
        gxszxtbevo();
        zoijcleaow();
        ppxfxbqfkf();
        e60.iobyxmoadg.f30600iobyxmoadg.iobyxmoadg(this.f79246iobyxmoadg);
    }
}
