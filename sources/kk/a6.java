package kk;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a6 implements nl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final SSLContext f55778iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final HostnameVerifier f55779ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final X509TrustManager f55780zoijcleaow;

    public a6() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        String defaultType = KeyStore.getDefaultType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(defaultType, "getDefaultType()");
        KeyStore keyStore = KeyStore.getInstance(defaultType);
        keyStore.load(null, null);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(keyStore, "keyStore");
        TrustManager[] trustManagerArr = {new x4()};
        TrustManager trustManager = trustManagerArr[0];
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        this.f55780zoijcleaow = (X509TrustManager) trustManager;
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustManagerArr, null);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sslContext, "sslContext");
        this.f55778iobyxmoadg = sslContext;
        this.f55779ppxfxbqfkf = zoijcleaow();
    }

    public static final boolean iobyxmoadg(String str, SSLSession sSLSession) {
        return true;
    }

    public static HostnameVerifier zoijcleaow() {
        return new HostnameVerifier() { // from class: kk.z5
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return a6.iobyxmoadg(str, sSLSession);
            }
        };
    }

    @Override // kk.nl
    public final X509TrustManager a() {
        return this.f55780zoijcleaow;
    }

    @Override // kk.nl
    public final SSLContext b() {
        return this.f55778iobyxmoadg;
    }

    @Override // kk.nl
    public final HostnameVerifier c() {
        return this.f55779ppxfxbqfkf;
    }
}
