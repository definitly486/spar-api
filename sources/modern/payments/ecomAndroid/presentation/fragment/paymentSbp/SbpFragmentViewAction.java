package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction;", "", "TryToOpenBankApp", "TryToOpenBankWebApp", "TryToOpenNspkBankUri", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction$TryToOpenBankApp;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction$TryToOpenBankWebApp;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction$TryToOpenNspkBankUri;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SbpFragmentViewAction {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction$TryToOpenBankApp;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction;", ImagesContract.URL, "", "packageName", "(Ljava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getUrl", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TryToOpenBankApp implements SbpFragmentViewAction {
        private final String packageName;
        private final String url;

        public TryToOpenBankApp(String url, String str) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.url = url;
            this.packageName = str;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction$TryToOpenBankWebApp;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction;", ImagesContract.URL, "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TryToOpenBankWebApp implements SbpFragmentViewAction {
        private final String url;

        public TryToOpenBankWebApp(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction$TryToOpenNspkBankUri;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction;", ImagesContract.URL, "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TryToOpenNspkBankUri implements SbpFragmentViewAction {
        private final String url;

        public TryToOpenNspkBankUri(String url) {
            zdlpuopuiu.btonecajqb(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }
}
