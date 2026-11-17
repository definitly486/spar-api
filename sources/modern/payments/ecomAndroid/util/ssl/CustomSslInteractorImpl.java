package modern.payments.ecomAndroid.util.ssl;

import hg.jyumaefscl;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00138\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00108\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00068\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lmodern/payments/ecomAndroid/util/ssl/CustomSslInteractorImpl;", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;)V", "Ljavax/net/ssl/HostnameVerifier;", "getHostNameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "Ljava/security/KeyStore;", "getKS", "()Ljava/security/KeyStore;", "", "Ljavax/net/ssl/TrustManager;", "getTrustManagers", "()[Ljavax/net/ssl/TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLContext;", "initSslContext", "()Ljavax/net/ssl/SSLContext;", "Lgg/wwaezpbzkn;", "initSslInteractor", "()V", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "keyStore", "Ljava/security/KeyStore;", "getKeyStore", "setKeyStore", "(Ljava/security/KeyStore;)V", "customSSLContext", "Ljavax/net/ssl/SSLContext;", "getCustomSSLContext", "setCustomSSLContext", "(Ljavax/net/ssl/SSLContext;)V", "trustManages", "[Ljavax/net/ssl/TrustManager;", "customX509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "getCustomX509TrustManager", "setCustomX509TrustManager", "(Ljavax/net/ssl/X509TrustManager;)V", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier", "setHostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CustomSslInteractorImpl implements SSLInteractor {
    private final ConfigRepository configRepository;
    public SSLContext customSSLContext;
    public X509TrustManager customX509TrustManager;
    public HostnameVerifier hostnameVerifier;
    public KeyStore keyStore;
    private TrustManager[] trustManages;

    public CustomSslInteractorImpl(ConfigRepository configRepository) {
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        this.configRepository = configRepository;
    }

    private final HostnameVerifier getHostNameVerifier() {
        final ArrayList arrayListLqeggnwhkg = jyumaefscl.lqeggnwhkg(StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.PROD_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.CARD_LOGO_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.CARD_LOGO_WEB_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.PSI_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.IFT_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.MERCHANT_LOGO_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.BASE_CERTIFICATE_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.SANDBOX_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.BNPL_DOCS_DOMAIN), StringExtensionsKt.decodeBase64(PaymentFlowNetworkModuleKt.PROM_CLICKSTREAM_DOMAIN));
        final List<String> sslPins = this.configRepository.getEcomSdkConfig().getSslPins();
        if (sslPins == null) {
            sslPins = new ArrayList<>();
        }
        return new HostnameVerifier() { // from class: modern.payments.ecomAndroid.util.ssl.iobyxmoadg
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return CustomSslInteractorImpl.getHostNameVerifier$lambda$1(arrayListLqeggnwhkg, this, sslPins, str, sSLSession);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHostNameVerifier$lambda$1(ArrayList trustedHostsList, CustomSslInteractorImpl this$0, List trustedPins, String str, SSLSession sSLSession) throws SSLPeerUnverifiedException {
        zdlpuopuiu.btonecajqb(trustedHostsList, "$trustedHostsList");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(trustedPins, "$trustedPins");
        if (!trustedHostsList.contains(str)) {
            return false;
        }
        Certificate[] peerCertificates = sSLSession.getPeerCertificates();
        zdlpuopuiu.dxjokdxxww(peerCertificates, "getPeerCertificates(...)");
        for (Certificate certificate : peerCertificates) {
            zdlpuopuiu.nufgyqmvbu(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (trustedPins.contains(this$0.pinSha256((X509Certificate) certificate))) {
                return true;
            }
        }
        return false;
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
        return new TrustManager[]{new X509TrustManager() { // from class: modern.payments.ecomAndroid.util.ssl.CustomSslInteractorImpl$getTrustManagers$trustAllCerts$1
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
        TrustManager[] trustManagerArr = this.trustManages;
        if (trustManagerArr == null) {
            zdlpuopuiu.pmvmpeiblj("trustManages");
            trustManagerArr = null;
        }
        TrustManager trustManager = trustManagerArr[0];
        zdlpuopuiu.nufgyqmvbu(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (X509TrustManager) trustManager;
    }

    private final SSLContext initSslContext() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagerArr = this.trustManages;
        if (trustManagerArr == null) {
            zdlpuopuiu.pmvmpeiblj("trustManages");
            trustManagerArr = null;
        }
        sSLContext.init(null, trustManagerArr, null);
        zdlpuopuiu.lqeggnwhkg(sSLContext);
        return sSLContext;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public SSLContext getCustomSSLContext() {
        SSLContext sSLContext = this.customSSLContext;
        if (sSLContext != null) {
            return sSLContext;
        }
        zdlpuopuiu.pmvmpeiblj("customSSLContext");
        return null;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public X509TrustManager getCustomX509TrustManager() {
        X509TrustManager x509TrustManager = this.customX509TrustManager;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        zdlpuopuiu.pmvmpeiblj("customX509TrustManager");
        return null;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public HostnameVerifier getHostnameVerifier() {
        HostnameVerifier hostnameVerifier = this.hostnameVerifier;
        if (hostnameVerifier != null) {
            return hostnameVerifier;
        }
        zdlpuopuiu.pmvmpeiblj("hostnameVerifier");
        return null;
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public KeyStore getKeyStore() {
        KeyStore keyStore = this.keyStore;
        if (keyStore != null) {
            return keyStore;
        }
        zdlpuopuiu.pmvmpeiblj("keyStore");
        return null;
    }

    public final void initSslInteractor() {
        setKeyStore(getKS());
        this.trustManages = getTrustManagers();
        setCustomX509TrustManager(getX509TrustManager());
        setCustomSSLContext(initSslContext());
        setHostnameVerifier(getHostNameVerifier());
    }

    @Override // modern.payments.ecomAndroid.util.ssl.SSLInteractor
    public String pinSha256(X509Certificate x509Certificate) {
        return SSLInteractor.DefaultImpls.pinSha256(this, x509Certificate);
    }

    public void setCustomSSLContext(SSLContext sSLContext) {
        zdlpuopuiu.btonecajqb(sSLContext, "<set-?>");
        this.customSSLContext = sSLContext;
    }

    public void setCustomX509TrustManager(X509TrustManager x509TrustManager) {
        zdlpuopuiu.btonecajqb(x509TrustManager, "<set-?>");
        this.customX509TrustManager = x509TrustManager;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        zdlpuopuiu.btonecajqb(hostnameVerifier, "<set-?>");
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setKeyStore(KeyStore keyStore) {
        zdlpuopuiu.btonecajqb(keyStore, "<set-?>");
        this.keyStore = keyStore;
    }
}
