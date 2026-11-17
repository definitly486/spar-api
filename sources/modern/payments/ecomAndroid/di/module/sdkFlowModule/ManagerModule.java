package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManagerImpl;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.ecomAndroid.util.ResourceManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/ManagerModule;", "", "()V", "provideMerchantAnalyticManager", "Lmodern/payments/ecomAndroid/api/analytic/MerchantAnalyticManager;", "configRepository", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "provideResourceManager", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "context", "Landroid/content/Context;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ManagerModule {
    @SdkFlowScope
    public final MerchantAnalyticManager provideMerchantAnalyticManager(ConfigRepository configRepository) {
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        return new MerchantAnalyticManagerImpl(configRepository);
    }

    public final ResourceManager provideResourceManager(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new ResourceManagerImpl(context);
    }
}
