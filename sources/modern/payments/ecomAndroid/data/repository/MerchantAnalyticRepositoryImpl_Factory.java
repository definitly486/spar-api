package modern.payments.ecomAndroid.data.repository;

import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.api.analytic.MerchantAnalyticManager;

/* JADX INFO: loaded from: classes3.dex */
public final class MerchantAnalyticRepositoryImpl_Factory implements wkgbmnqykc {
    private final iobyxmoadg merchantAnalyticManagerProvider;

    public MerchantAnalyticRepositoryImpl_Factory(iobyxmoadg iobyxmoadgVar) {
        this.merchantAnalyticManagerProvider = iobyxmoadgVar;
    }

    public static MerchantAnalyticRepositoryImpl_Factory create(iobyxmoadg iobyxmoadgVar) {
        return new MerchantAnalyticRepositoryImpl_Factory(iobyxmoadgVar);
    }

    public static MerchantAnalyticRepositoryImpl newInstance(MerchantAnalyticManager merchantAnalyticManager) {
        return new MerchantAnalyticRepositoryImpl(merchantAnalyticManager);
    }

    @Override // fg.iobyxmoadg
    public MerchantAnalyticRepositoryImpl get() {
        return newInstance((MerchantAnalyticManager) this.merchantAnalyticManagerProvider.get());
    }
}
