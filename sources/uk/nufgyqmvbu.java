package uk;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.zdlpuopuiu;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f113775eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final boolean f113776gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Provider f113777wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg(int i13, int i14, int i15) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != i13) {
                return version.major() > i13;
            }
            if (version.minor() != i14) {
                return version.minor() > i14;
            }
            return version.patch() >= i15;
        }

        public final boolean ppxfxbqfkf() {
            return nufgyqmvbu.f113776gxszxtbevo;
        }

        public final nufgyqmvbu zoijcleaow() {
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
            if (ppxfxbqfkf()) {
                return new nufgyqmvbu(gtknphoqwxVar);
            }
            return null;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f113778iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null);
        f113775eablkybsjg = iobyxmoadgVar;
        boolean z13 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, iobyxmoadgVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && iobyxmoadgVar.iobyxmoadg(2, 1, 0)) {
                z13 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f113776gxszxtbevo = z13;
    }

    public /* synthetic */ nufgyqmvbu(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    @Override // uk.agtfadlqog
    public SSLSocketFactory agtfadlqog(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        SSLContext sSLContextWflxmlrfwp = wflxmlrfwp();
        sSLContextWflxmlrfwp.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextWflxmlrfwp.getSocketFactory();
        zdlpuopuiu.dxjokdxxww(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // uk.agtfadlqog
    public void eablkybsjg(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.eablkybsjg(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = agtfadlqog.f113749iobyxmoadg.zoijcleaow(protocols).toArray(new String[0]);
        zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // uk.agtfadlqog
    public String lqeggnwhkg(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.lqeggnwhkg(sslSocket);
    }

    @Override // uk.agtfadlqog
    public X509TrustManager ojitshcjhn() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        zdlpuopuiu.lqeggnwhkg(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                zdlpuopuiu.nufgyqmvbu(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, zoijcleaow.f113778iobyxmoadg);
                return x509TrustManager;
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
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f113777wkgbmnqykc);
        zdlpuopuiu.dxjokdxxww(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    private nufgyqmvbu() {
        Provider providerNewProvider = Conscrypt.newProvider();
        zdlpuopuiu.dxjokdxxww(providerNewProvider, "newProvider()");
        this.f113777wkgbmnqykc = providerNewProvider;
    }
}
