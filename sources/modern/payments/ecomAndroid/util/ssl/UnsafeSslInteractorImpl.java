package modern.payments.ecomAndroid.util.ssl;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\bH\u0002J\b\u0010\u001c\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/util/ssl/UnsafeSslInteractorImpl;", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "()V", "customSSLContext", "Ljavax/net/ssl/SSLContext;", "getCustomSSLContext", "()Ljavax/net/ssl/SSLContext;", "customX509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "getCustomX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "keyStore", "Ljava/security/KeyStore;", "getKeyStore", "()Ljava/security/KeyStore;", "trustManages", "", "Ljavax/net/ssl/TrustManager;", "[Ljavax/net/ssl/TrustManager;", "getHostNameVerifier", "getKS", "getTrustManagers", "()[Ljavax/net/ssl/TrustManager;", "getX509TrustManager", "initSslContext", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnsafeSslInteractorImpl implements SSLInteractor {
    private final KeyStore keyStore = getKS();
    private final TrustManager[] trustManages = getTrustManagers();
    private final X509TrustManager customX509TrustManager = getX509TrustManager();
    private final SSLContext customSSLContext = initSslContext();
    private final HostnameVerifier hostnameVerifier = getHostNameVerifier();

    private final HostnameVerifier getHostNameVerifier() {
        return new HostnameVerifier() { // from class: modern.payments.ecomAndroid.util.ssl.zoijcleaow
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return UnsafeSslInteractorImpl.getHostNameVerifier$lambda$0(str, sSLSession);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHostNameVerifier$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }

    private final KeyStore getKS() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        String defaultType = KeyStore.getDefaultType();
        zdlpuopuiu.dxjokdxxww(defaultType, "getDefaultType(...)");
        KeyStore keyStore = KeyStore.getInstance(defaultType);
        keyStore.load(null, null);
        zdlpuopuiu.lqeggnwhkg(keyStore);
        return keyStore;
    }

    private final TrustManager[] getTrustManagers() {
        return new TrustManager[]{new X509TrustManager() { // from class: modern.payments.ecomAndroid.util.ssl.UnsafeSslInteractorImpl$getTrustManagers$trustAllCerts$1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] chain, String authType) {
                zdlpuopuiu.btonecajqb(chain, "chain");
                zdlpuopuiu.btonecajqb(authType, "authType");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] chain, String authType) {
                zdlpuopuiu.btonecajqb(chain, "chain");
                zdlpuopuiu.btonecajqb(authType, "authType");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
    }

    private final X509TrustManager getX509TrustManager() {
        TrustManager trustManager = this.trustManages[0];
        zdlpuopuiu.nufgyqmvbu(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (X509TrustManager) trustManager;
    }

    private final SSLContext initSslContext() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, this.trustManages, null);
        zdlpuopuiu.lqeggnwhkg(sSLContext);
        return sSLContext;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public SSLContext getCustomSSLContext() {
        return this.customSSLContext;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public X509TrustManager getCustomX509TrustManager() {
        return this.customX509TrustManager;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public KeyStore getKeyStore() {
        return this.keyStore;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public String pinSha256(X509Certificate x509Certificate) {
        return SSLInteractor.DefaultImpls.pinSha256(this, x509Certificate);
    }
}
