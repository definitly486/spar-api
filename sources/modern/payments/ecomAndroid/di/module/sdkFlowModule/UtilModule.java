package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.util.clearSdkUtil.ClearSdkUtilImpl;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.AppNameUtil;
import modern.payments.ecomAndroid.util.analytics.EcomMetricFacade;
import modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/UtilModule;", "", "()V", "provideAppNameUtil", "Lmodern/payments/ecomAndroid/util/AppNameUtil;", "context", "Landroid/content/Context;", "provideClearSdkUtil", "Lmodern/payments/ecomAndroid/util/clearSdkUtil/ClearSdkUtil;", "setCookieHandler", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "ipAddressProvider", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "provideMetricUtil", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appNameUtil", "tracker", "Lmodern/payments/tracker/ITracker;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UtilModule {
    public final AppNameUtil provideAppNameUtil(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new AppNameUtil(context);
    }

    @SdkFlowScope
    public final ClearSdkUtil provideClearSdkUtil(SetCookieHandler setCookieHandler, IpAddressProvider ipAddressProvider, MerchantDataProvider merchantDataProvider) {
        zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        return new ClearSdkUtilImpl(setCookieHandler, ipAddressProvider, merchantDataProvider);
    }

    @SdkFlowScope
    public final EcomMetricUtil provideMetricUtil(Context context, EcomSdkOptionsRepository optionsRepository, AppDataRepository appDataRepository, AppNameUtil appNameUtil, ITracker tracker) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(appNameUtil, "appNameUtil");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        return new EcomMetricFacade(context, optionsRepository, appDataRepository, appNameUtil, tracker);
    }
}
