package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.AppNameUtil;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilModule_ProvideMetricUtilFactory implements wkgbmnqykc {
    private final iobyxmoadg appDataRepositoryProvider;
    private final iobyxmoadg appNameUtilProvider;
    private final iobyxmoadg contextProvider;
    private final UtilModule module;
    private final iobyxmoadg optionsRepositoryProvider;
    private final iobyxmoadg trackerProvider;

    public UtilModule_ProvideMetricUtilFactory(UtilModule utilModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        this.module = utilModule;
        this.contextProvider = iobyxmoadgVar;
        this.optionsRepositoryProvider = iobyxmoadgVar2;
        this.appDataRepositoryProvider = iobyxmoadgVar3;
        this.appNameUtilProvider = iobyxmoadgVar4;
        this.trackerProvider = iobyxmoadgVar5;
    }

    public static UtilModule_ProvideMetricUtilFactory create(UtilModule utilModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        return new UtilModule_ProvideMetricUtilFactory(utilModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static EcomMetricUtil provideMetricUtil(UtilModule utilModule, Context context, EcomSdkOptionsRepository ecomSdkOptionsRepository, AppDataRepository appDataRepository, AppNameUtil appNameUtil, ITracker iTracker) {
        return (EcomMetricUtil) dxjokdxxww.eablkybsjg(utilModule.provideMetricUtil(context, ecomSdkOptionsRepository, appDataRepository, appNameUtil, iTracker));
    }

    @Override // fg.iobyxmoadg
    public EcomMetricUtil get() {
        return provideMetricUtil(this.module, (Context) this.contextProvider.get(), (EcomSdkOptionsRepository) this.optionsRepositoryProvider.get(), (AppDataRepository) this.appDataRepositoryProvider.get(), (AppNameUtil) this.appNameUtilProvider.get(), (ITracker) this.trackerProvider.get());
    }
}
