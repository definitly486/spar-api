package kk;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] chain, String authType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chain, "chain");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authType, "authType");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] chain, String authType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chain, "chain");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authType, "authType");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
