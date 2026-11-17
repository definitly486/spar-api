package uk;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.zdlpuopuiu;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f113779eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final boolean f113780gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Provider f113781wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wflxmlrfwp iobyxmoadg() {
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
            if (zoijcleaow()) {
                return new wflxmlrfwp(gtknphoqwxVar);
            }
            return null;
        }

        public final boolean zoijcleaow() {
            return wflxmlrfwp.f113780gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null);
        f113779eablkybsjg = iobyxmoadgVar;
        boolean z13 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, iobyxmoadgVar.getClass().getClassLoader());
            z13 = true;
        } catch (ClassNotFoundException unused) {
        }
        f113780gxszxtbevo = z13;
    }

    public /* synthetic */ wflxmlrfwp(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    @Override // uk.agtfadlqog
    public void eablkybsjg(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        super.eablkybsjg(sslSocket, str, protocols);
    }

    @Override // uk.agtfadlqog
    public String lqeggnwhkg(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return super.lqeggnwhkg(sslSocket);
    }

    @Override // uk.agtfadlqog
    public X509TrustManager ojitshcjhn() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f113781wkgbmnqykc);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        zdlpuopuiu.lqeggnwhkg(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                zdlpuopuiu.nufgyqmvbu(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        zdlpuopuiu.dxjokdxxww(string, "toString(this)");
        sb3.append(string);
        throw new IllegalStateException(sb3.toString().toString());
    }

    @Override // uk.agtfadlqog
    public SSLContext wflxmlrfwp() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f113781wkgbmnqykc);
        zdlpuopuiu.dxjokdxxww(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    private wflxmlrfwp() {
        this.f113781wkgbmnqykc = new OpenJSSE();
    }
}
