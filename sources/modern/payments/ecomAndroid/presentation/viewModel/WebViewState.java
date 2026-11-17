package modern.payments.ecomAndroid.presentation.viewModel;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState;", "", "LoadingUrl", "OTPViewOpened", "PaymentViewOpened", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState$LoadingUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState$OTPViewOpened;", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState$PaymentViewOpened;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface WebViewState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState$LoadingUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState;", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingUrl implements WebViewState {
        public static final LoadingUrl INSTANCE = new LoadingUrl();

        private LoadingUrl() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState$OTPViewOpened;", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState;", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OTPViewOpened implements WebViewState {
        public static final OTPViewOpened INSTANCE = new OTPViewOpened();

        private OTPViewOpened() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState$PaymentViewOpened;", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState;", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PaymentViewOpened implements WebViewState {
        public static final PaymentViewOpened INSTANCE = new PaymentViewOpened();

        private PaymentViewOpened() {
        }
    }
}
