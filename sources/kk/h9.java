package kk;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import npi.spay.Bn;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class h9 implements nl {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public HostnameVerifier f56850eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final m60 f56851iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public TrustManager[] f56852ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public X509TrustManager f56853wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public SSLContext f56854zoijcleaow;

    public h9(m60 sPaySdkConfigRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f56851iobyxmoadg = sPaySdkConfigRepository;
    }

    public static final boolean iobyxmoadg(ArrayList trustedHostsList, h9 this$0, ArrayList trustedPins, String str, SSLSession sSLSession) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(trustedHostsList, "$trustedHostsList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(trustedPins, "$trustedPins");
        if (!trustedHostsList.contains(str)) {
            return false;
        }
        Certificate[] peerCertificates = sSLSession.getPeerCertificates();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(peerCertificates, "session.peerCertificates");
        for (Certificate certificate : peerCertificates) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            this$0.getClass();
            if (trustedPins.contains(kk.iobyxmoadg((X509Certificate) certificate))) {
                return true;
            }
        }
        return false;
    }

    @Override // kk.nl
    public final X509TrustManager a() {
        X509TrustManager x509TrustManager = this.f56853wkgbmnqykc;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("customX509TrustManager");
        return null;
    }

    @Override // kk.nl
    public final SSLContext b() {
        SSLContext sSLContext = this.f56854zoijcleaow;
        if (sSLContext != null) {
            return sSLContext;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("customSSLContext");
        return null;
    }

    @Override // kk.nl
    public final HostnameVerifier c() {
        HostnameVerifier hostnameVerifier = this.f56850eablkybsjg;
        if (hostnameVerifier != null) {
            return hostnameVerifier;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("hostnameVerifier");
        return null;
    }

    public final HostnameVerifier zoijcleaow() {
        final ArrayList arrayListLqeggnwhkg = hg.jyumaefscl.lqeggnwhkg(PaymentFlowNetworkModuleKt.PROD_DOMAIN, PaymentFlowNetworkModuleKt.CARD_LOGO_DOMAIN, PaymentFlowNetworkModuleKt.CARD_LOGO_WEB_DOMAIN, PaymentFlowNetworkModuleKt.PSI_DOMAIN, PaymentFlowNetworkModuleKt.IFT_DOMAIN, PaymentFlowNetworkModuleKt.MERCHANT_LOGO_DOMAIN, PaymentFlowNetworkModuleKt.BASE_CERTIFICATE_DOMAIN, PaymentFlowNetworkModuleKt.SANDBOX_DOMAIN, PaymentFlowNetworkModuleKt.BNPL_DOCS_DOMAIN, "aWZ0bXBjbGlja3N0cmVhbS50ZXN0b25saW5lLnNiZXJiYW5rLnJ1", "cHNpY2xpY2tzdHJlYW0udGVzdG9ubGluZS5zYmVyYmFuay5ydQ==", "ZXh0LmNsaWNrc3RyZWFtLnNiZXJiYW5rLnJ1", "aHR0cHM6Ly9pZC1pZnQuc2Jlci5ydS8=");
        SPaySdkConfig sPaySdkConfig = ((s80) this.f56851iobyxmoadg).f58531ppxfxbqfkf;
        if (sPaySdkConfig == null) {
            throw Bn.f70538zdlpuopuiu;
        }
        final ArrayList<String> sslPins = sPaySdkConfig.getSslPins();
        if (sslPins == null) {
            sslPins = new ArrayList<>();
        }
        return new HostnameVerifier() { // from class: kk.g9
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return h9.iobyxmoadg(arrayListLqeggnwhkg, this, sslPins, str, sSLSession);
            }
        };
    }
}
