package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.util.shaker.ShakeDetector;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilModule_ProvideShakeDetectorFactory implements wkgbmnqykc {
    private final UtilModule module;

    public UtilModule_ProvideShakeDetectorFactory(UtilModule utilModule) {
        this.module = utilModule;
    }

    public static UtilModule_ProvideShakeDetectorFactory create(UtilModule utilModule) {
        return new UtilModule_ProvideShakeDetectorFactory(utilModule);
    }

    public static ShakeDetector provideShakeDetector(UtilModule utilModule) {
        return (ShakeDetector) dxjokdxxww.eablkybsjg(utilModule.provideShakeDetector());
    }

    @Override // fg.iobyxmoadg
    public ShakeDetector get() {
        return provideShakeDetector(this.module);
    }
}
