package modern.payments.ecomAndroid.presentation.viewModel;

import android.webkit.WebResourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "", "()V", "LoadingUrl", "ProcessError", "ProcessHTML", "RedirectToTargetUrl", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$LoadingUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$ProcessError;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$ProcessHTML;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$RedirectToTargetUrl;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ChallengeEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$LoadingUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingUrl extends ChallengeEvent {
        public static final LoadingUrl INSTANCE = new LoadingUrl();

        private LoadingUrl() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LoadingUrl);
        }

        public int hashCode() {
            return 1984207481;
        }

        public String toString() {
            return "LoadingUrl";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$ProcessError;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "error", "Landroid/webkit/WebResourceError;", "(Landroid/webkit/WebResourceError;)V", "getError", "()Landroid/webkit/WebResourceError;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProcessError extends ChallengeEvent {
        private final WebResourceError error;

        public ProcessError(WebResourceError webResourceError) {
            super(null);
            this.error = webResourceError;
        }

        public final WebResourceError getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$ProcessHTML;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "html", "", "(Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProcessHTML extends ChallengeEvent {
        private final String html;

        public ProcessHTML(String str) {
            super(null);
            this.html = str;
        }

        public final String getHtml() {
            return this.html;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent$RedirectToTargetUrl;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RedirectToTargetUrl extends ChallengeEvent {
        public static final RedirectToTargetUrl INSTANCE = new RedirectToTargetUrl();

        private RedirectToTargetUrl() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RedirectToTargetUrl);
        }

        public int hashCode() {
            return -1771586751;
        }

        public String toString() {
            return "RedirectToTargetUrl";
        }
    }

    public /* synthetic */ ChallengeEvent(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ChallengeEvent() {
    }
}
