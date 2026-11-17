package modern.payments.ecomAndroid;

import ag.wkgbmnqykc;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.reducer.Reducer;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomActivityViewModel_Factory implements wkgbmnqykc {
    private final fg.iobyxmoadg ecomMetricUtilProvider;
    private final fg.iobyxmoadg reducerProvider;

    public EcomActivityViewModel_Factory(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        this.reducerProvider = iobyxmoadgVar;
        this.ecomMetricUtilProvider = iobyxmoadgVar2;
    }

    public static EcomActivityViewModel_Factory create(fg.iobyxmoadg iobyxmoadgVar, fg.iobyxmoadg iobyxmoadgVar2) {
        return new EcomActivityViewModel_Factory(iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static EcomActivityViewModel newInstance(Reducer reducer, EcomMetricUtil ecomMetricUtil) {
        return new EcomActivityViewModel(reducer, ecomMetricUtil);
    }

    @Override // fg.iobyxmoadg
    public EcomActivityViewModel get() {
        return newInstance((Reducer) this.reducerProvider.get(), (EcomMetricUtil) this.ecomMetricUtilProvider.get());
    }
}
