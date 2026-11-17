package modern.payments.ecomAndroid.presentation.fragment.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.Field;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/webview/CheckServerTrustedWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/content/Context;", "context", "Ljavax/net/ssl/TrustManagerFactory;", "tmFactory", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Landroid/content/Context;Ljavax/net/ssl/TrustManagerFactory;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "Lgg/wwaezpbzkn;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Landroid/content/Context;", "Ljavax/net/ssl/TrustManagerFactory;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CheckServerTrustedWebViewClient extends WebViewClient {
    private final Context context;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final TrustManagerFactory tmFactory;
    private final ITracker tracker;

    public /* synthetic */ CheckServerTrustedWebViewClient(Context context, TrustManagerFactory trustManagerFactory, ITracker iTracker, EcomSdkOptionsRepository ecomSdkOptionsRepository, int i13, gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? CheckServerTrustedWebViewClientKt.initTrustStore(context) : trustManagerFactory, iTracker, ecomSdkOptionsRepository);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"PrivateApi", "WebViewClientOnReceivedSslError", "DiscouragedPrivateApi"})
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Exception exc;
        zdlpuopuiu.btonecajqb(view, "view");
        zdlpuopuiu.btonecajqb(handler, "handler");
        zdlpuopuiu.btonecajqb(error, "error");
        FeatureExtensionsKt.track$default(this.tracker, this.ecomSdkOptionsRepository, "Verify certificate: " + error.getCertificate() + " - " + error.getUrl(), null, ITracker.Priority.INFO, "WEB_VIEW", 4, null);
        int i13 = 0;
        if (error.getPrimaryError() == 3) {
            SslCertificate certificate = error.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                zdlpuopuiu.dxjokdxxww(declaredField, "getDeclaredField(...)");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(certificate);
                zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate[] x509CertificateArr = {(X509Certificate) obj};
                TrustManager[] trustManagers = this.tmFactory.getTrustManagers();
                zdlpuopuiu.dxjokdxxww(trustManagers, "getTrustManagers(...)");
                int length = trustManagers.length;
                int i14 = 0;
                while (true) {
                    if (i13 >= length) {
                        i13 = i14;
                        break;
                    }
                    try {
                        TrustManager trustManager = trustManagers[i13];
                        if (trustManager instanceof X509TrustManager) {
                            try {
                                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "generic");
                                i13 = 1;
                                break;
                            } catch (Exception e13) {
                                FeatureExtensionsKt.track(this.tracker, this.ecomSdkOptionsRepository, "Verify certificate fail", e13, ITracker.Priority.ERROR, "WEB_VIEW");
                                i14 = 1;
                                i13++;
                            }
                        }
                        i13++;
                    } catch (Exception e14) {
                        exc = e14;
                        i13 = i14;
                        FeatureExtensionsKt.track(this.tracker, this.ecomSdkOptionsRepository, "Verify certificate fail", exc, ITracker.Priority.ERROR, "WEB_VIEW");
                    }
                }
            } catch (Exception e15) {
                exc = e15;
            }
        }
        if (i13 != 0) {
            handler.proceed();
        } else {
            handler.cancel();
        }
    }

    public CheckServerTrustedWebViewClient(Context context, TrustManagerFactory tmFactory, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tmFactory, "tmFactory");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.context = context;
        this.tmFactory = tmFactory;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }
}
