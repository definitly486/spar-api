package modern.payments.ecomAndroid.presentation.viewModel;

import android.webkit.WebResourceError;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent;", "", "()V", "ProcessUrl", "StartTimer", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent$ProcessUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent$StartTimer;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Ecom3dsMethodEvent {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent$ProcessUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent;", ImagesContract.URL, "", "error", "Landroid/webkit/WebResourceError;", "(Ljava/lang/String;Landroid/webkit/WebResourceError;)V", "getError", "()Landroid/webkit/WebResourceError;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProcessUrl extends Ecom3dsMethodEvent {
        private final WebResourceError error;
        private final String url;

        public /* synthetic */ ProcessUrl(String str, WebResourceError webResourceError, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : webResourceError);
        }

        public static /* synthetic */ ProcessUrl copy$default(ProcessUrl processUrl, String str, WebResourceError webResourceError, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = processUrl.url;
            }
            if ((i13 & 2) != 0) {
                webResourceError = processUrl.error;
            }
            return processUrl.copy(str, webResourceError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final WebResourceError getError() {
            return this.error;
        }

        public final ProcessUrl copy(String url, WebResourceError error) {
            return new ProcessUrl(url, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProcessUrl)) {
                return false;
            }
            ProcessUrl processUrl = (ProcessUrl) other;
            return zdlpuopuiu.eablkybsjg(this.url, processUrl.url) && zdlpuopuiu.eablkybsjg(this.error, processUrl.error);
        }

        public final WebResourceError getError() {
            return this.error;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            WebResourceError webResourceError = this.error;
            return iHashCode + (webResourceError != null ? webResourceError.hashCode() : 0);
        }

        public String toString() {
            return "ProcessUrl(url=" + this.url + ", error=" + this.error + ')';
        }

        public ProcessUrl(String str, WebResourceError webResourceError) {
            super(null);
            this.url = str;
            this.error = webResourceError;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent$StartTimer;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartTimer extends Ecom3dsMethodEvent {
        public static final StartTimer INSTANCE = new StartTimer();

        private StartTimer() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StartTimer);
        }

        public int hashCode() {
            return 1465902093;
        }

        public String toString() {
            return "StartTimer";
        }
    }

    public /* synthetic */ Ecom3dsMethodEvent(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private Ecom3dsMethodEvent() {
    }
}
