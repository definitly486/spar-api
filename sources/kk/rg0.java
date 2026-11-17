package kk;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class rg0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final zk.iobyxmoadg f58333iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final m60 f58334zoijcleaow;

    public rg0(zk.iobyxmoadg loggingInterceptor, m60 sPaySdkConfigRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggingInterceptor, "loggingInterceptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f58333iobyxmoadg = loggingInterceptor;
        this.f58334zoijcleaow = sPaySdkConfigRepository;
    }

    public static final lk.lereixgezr.iobyxmoadg iobyxmoadg(rg0 rg0Var, lk.lereixgezr.iobyxmoadg iobyxmoadgVar) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        rg0Var.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iobyxmoadgVar.eablkybsjg(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
        iobyxmoadgVar.wypolnanlu(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
        iobyxmoadgVar.tzroggbefp(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
        iobyxmoadgVar.lqeggnwhkg(true);
        iobyxmoadgVar.nufgyqmvbu(true);
        h9 h9Var = new h9(rg0Var.f58334zoijcleaow);
        String defaultType = KeyStore.getDefaultType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(defaultType, "getDefaultType()");
        KeyStore keyStore = KeyStore.getInstance(defaultType);
        keyStore.load(null, null);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(keyStore, "keyStore");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keyStore, "<set-?>");
        TrustManager[] trustManagerArr = {new e8()};
        h9Var.f56852ppxfxbqfkf = trustManagerArr;
        TrustManager trustManager = trustManagerArr[0];
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(x509TrustManager, "<set-?>");
        h9Var.f56853wkgbmnqykc = x509TrustManager;
        SSLContext sslContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagerArr2 = h9Var.f56852ppxfxbqfkf;
        if (trustManagerArr2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("trustManages");
            trustManagerArr2 = null;
        }
        sslContext.init(null, trustManagerArr2, null);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sslContext, "sslContext");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslContext, "<set-?>");
        h9Var.f56854zoijcleaow = sslContext;
        HostnameVerifier hostnameVerifierZoijcleaow = h9Var.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hostnameVerifierZoijcleaow, "<set-?>");
        h9Var.f56850eablkybsjg = hostnameVerifierZoijcleaow;
        SSLSocketFactory socketFactory = h9Var.b().getSocketFactory();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(socketFactory, "interactor.customSSLContext.socketFactory");
        iobyxmoadgVar.kegysxyocb(socketFactory, h9Var.a());
        return iobyxmoadgVar.stevsuqkhv(true);
    }
}
