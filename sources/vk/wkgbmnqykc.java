package vk;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc extends yk.ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f117479wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final X509TrustManagerExtensions f117480ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final X509TrustManager f117481zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wkgbmnqykc iobyxmoadg(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            zdlpuopuiu.btonecajqb(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new wkgbmnqykc(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        zdlpuopuiu.btonecajqb(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f117481zoijcleaow = trustManager;
        this.f117480ppxfxbqfkf = x509TrustManagerExtensions;
    }

    public boolean equals(Object obj) {
        return (obj instanceof wkgbmnqykc) && ((wkgbmnqykc) obj).f117481zoijcleaow == this.f117481zoijcleaow;
    }

    public int hashCode() {
        return System.identityHashCode(this.f117481zoijcleaow);
    }

    @Override // yk.ppxfxbqfkf
    public List iobyxmoadg(List chain, String hostname) throws SSLPeerUnverifiedException {
        zdlpuopuiu.btonecajqb(chain, "chain");
        zdlpuopuiu.btonecajqb(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f117480ppxfxbqfkf.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            zdlpuopuiu.dxjokdxxww(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e13) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e13.getMessage());
            sSLPeerUnverifiedException.initCause(e13);
            throw sSLPeerUnverifiedException;
        }
    }
}
