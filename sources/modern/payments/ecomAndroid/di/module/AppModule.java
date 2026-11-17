package modern.payments.ecomAndroid.di.module;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.StateHandlerImpl;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.helper.SPayFlowHelper;
import modern.payments.ecomAndroid.domain.helper.impl.SPayFlowHelperImpl;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.reducer.impl.ReducerImpl;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;
import modern.payments.ecomAndroid.domain.storage.impl.DefaultSharedPreferencesImpl;
import modern.payments.ecomAndroid.util.clearSdkUtil.ClearSdkUtil;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0007J\b\u0010\u001a\u001a\u00020\nH\u0007¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/AppModule;", "", "()V", "provideDefaultSharedPreferences", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "context", "Landroid/content/Context;", "provideReducer", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "stateHandler", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "clearSdkUtil", "Lmodern/payments/ecomAndroid/util/clearSdkUtil/ClearSdkUtil;", "configRepository", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "sdkOptionsRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "provideSPayFlowHelper", "Lmodern/payments/ecomAndroid/domain/helper/SPayFlowHelper;", "tracker", "Lmodern/payments/tracker/ITracker;", "ecomSdkOptionsRepository", "provideStateHandler", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppModule {
    @SdkFlowScope
    public final CustomSharedPreferences provideDefaultSharedPreferences(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new DefaultSharedPreferencesImpl(context);
    }

    @SdkFlowScope
    public final Reducer provideReducer(StateHandler stateHandler, AppDataRepository appDataRepository, ClearSdkUtil clearSdkUtil, ConfigRepository configRepository, EcomSdkOptionsRepository sdkOptionsRepository, MerchantAnalyticRepository merchantAnalyticRepository) {
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(clearSdkUtil, "clearSdkUtil");
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        zdlpuopuiu.btonecajqb(sdkOptionsRepository, "sdkOptionsRepository");
        zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        return new ReducerImpl(stateHandler, appDataRepository, clearSdkUtil, configRepository, sdkOptionsRepository, merchantAnalyticRepository);
    }

    @SdkFlowScope
    public final SPayFlowHelper provideSPayFlowHelper(ConfigRepository configRepository, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        return new SPayFlowHelperImpl(configRepository, tracker, ecomSdkOptionsRepository);
    }

    @SdkFlowScope
    public final StateHandler provideStateHandler() {
        return new StateHandlerImpl();
    }
}
