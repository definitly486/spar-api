package modern.payments.ecomAndroid.util.ssl;

import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "", "customSSLContext", "Ljavax/net/ssl/SSLContext;", "getCustomSSLContext", "()Ljavax/net/ssl/SSLContext;", "customX509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "getCustomX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "keyStore", "Ljava/security/KeyStore;", "getKeyStore", "()Ljava/security/KeyStore;", "pinSha256", "", "Ljava/security/cert/X509Certificate;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SSLInteractor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String PROTOCOL = "TLS";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor$Companion;", "", "()V", "PROTOCOL", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PROTOCOL = "TLS";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String pinSha256(SSLInteractor sSLInteractor, X509Certificate receiver) {
            zdlpuopuiu.btonecajqb(receiver, "$receiver");
            return "sha256/" + lqeggnwhkg.f63167ppxfxbqfkf.zoijcleaow(receiver).wkgbmnqykc();
        }
    }

    SSLContext getCustomSSLContext();

    X509TrustManager getCustomX509TrustManager();

    HostnameVerifier getHostnameVerifier();

    KeyStore getKeyStore();

    String pinSha256(X509Certificate x509Certificate);
}
