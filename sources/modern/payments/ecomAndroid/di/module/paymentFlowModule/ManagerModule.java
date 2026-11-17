package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.manager.CardDataManagerImpl;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.tracker.util.logging.LogFileManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/ManagerModule;", "", "()V", "provideCardDataManager", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "provideLogFileManager", "Lmodern/payments/tracker/util/logging/LogFileManager;", "context", "Landroid/content/Context;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ManagerModule {
    @PaymentFlowScope
    public final CardDataManager provideCardDataManager() {
        return new CardDataManagerImpl();
    }

    @PaymentFlowScope
    public final LogFileManager provideLogFileManager(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new LogFileManager(context);
    }
}
