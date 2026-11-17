package modern.payments.ecomAndroid.di.component;

import android.content.Context;
import kotlin.Metadata;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.tracker.di.component.TrackerComponent;

/* JADX INFO: loaded from: classes3.dex */
@SdkFlowScope
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/di/component/EcomSdkFlowComponent;", "", "Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent$Builder;", "getPaymentFlowSubcomponent", "()Lmodern/payments/ecomAndroid/di/component/PaymentFlowSubcomponent$Builder;", "Lmodern/payments/ecomAndroid/EcomSdk;", "ecomSdk", "Lgg/wwaezpbzkn;", "inject", "(Lmodern/payments/ecomAndroid/EcomSdk;)V", "Builder", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomSdkFlowComponent {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/di/component/EcomSdkFlowComponent$Builder;", "", "build", "Lmodern/payments/ecomAndroid/di/component/EcomSdkFlowComponent;", "context", "Landroid/content/Context;", "trackerComponent", "Lmodern/payments/tracker/di/component/TrackerComponent;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Builder {
        EcomSdkFlowComponent build();

        Builder context(Context context);

        Builder trackerComponent(TrackerComponent trackerComponent);
    }

    PaymentFlowSubcomponent.Builder getPaymentFlowSubcomponent();

    void inject(EcomSdk ecomSdk);
}
