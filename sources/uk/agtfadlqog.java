package uk;

import hg.jyumaefscl;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.lereixgezr;
import lk.pmvmpeiblj;

/* JADX INFO: loaded from: classes3.dex */
public class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f113749iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Logger f113750ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static volatile agtfadlqog f113751zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final boolean btonecajqb() {
            return zdlpuopuiu.eablkybsjg("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean dxjokdxxww() {
            return zdlpuopuiu.eablkybsjg("BC", Security.getProviders()[0].getName());
        }

        private final agtfadlqog eablkybsjg() {
            wflxmlrfwp wflxmlrfwpVarIobyxmoadg;
            lqeggnwhkg lqeggnwhkgVarIobyxmoadg;
            nufgyqmvbu nufgyqmvbuVarZoijcleaow;
            if (btonecajqb() && (nufgyqmvbuVarZoijcleaow = nufgyqmvbu.f113775eablkybsjg.zoijcleaow()) != null) {
                return nufgyqmvbuVarZoijcleaow;
            }
            if (dxjokdxxww() && (lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.f113772eablkybsjg.iobyxmoadg()) != null) {
                return lqeggnwhkgVarIobyxmoadg;
            }
            if (gtknphoqwx() && (wflxmlrfwpVarIobyxmoadg = wflxmlrfwp.f113779eablkybsjg.iobyxmoadg()) != null) {
                return wflxmlrfwpVarIobyxmoadg;
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = draadjrbmk.f113754wkgbmnqykc.iobyxmoadg();
            if (draadjrbmkVarIobyxmoadg != null) {
                return draadjrbmkVarIobyxmoadg;
            }
            agtfadlqog agtfadlqogVarIobyxmoadg = dxjokdxxww.f113755dxjokdxxww.iobyxmoadg();
            return agtfadlqogVarIobyxmoadg != null ? agtfadlqogVarIobyxmoadg : new agtfadlqog();
        }

        private final boolean gtknphoqwx() {
            return zdlpuopuiu.eablkybsjg("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final agtfadlqog gxszxtbevo() {
            return nufgyqmvbu() ? wkgbmnqykc() : eablkybsjg();
        }

        private final agtfadlqog wkgbmnqykc() {
            vk.eablkybsjg.f117461iobyxmoadg.zoijcleaow();
            agtfadlqog agtfadlqogVarIobyxmoadg = eablkybsjg.f113764eablkybsjg.iobyxmoadg();
            if (agtfadlqogVarIobyxmoadg != null) {
                return agtfadlqogVarIobyxmoadg;
            }
            agtfadlqog agtfadlqogVarIobyxmoadg2 = gxszxtbevo.f113767eablkybsjg.iobyxmoadg();
            zdlpuopuiu.lqeggnwhkg(agtfadlqogVarIobyxmoadg2);
            return agtfadlqogVarIobyxmoadg2;
        }

        public final agtfadlqog lqeggnwhkg() {
            return agtfadlqog.f113751zoijcleaow;
        }

        public final boolean nufgyqmvbu() {
            return zdlpuopuiu.eablkybsjg("Dalvik", System.getProperty("java.vm.name"));
        }

        public final byte[] ppxfxbqfkf(List protocols) {
            zdlpuopuiu.btonecajqb(protocols, "protocols");
            bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
            for (String str : zoijcleaow(protocols)) {
                ppxfxbqfkfVar.o(str.length());
                ppxfxbqfkfVar.metgxyhuhe(str);
            }
            return ppxfxbqfkfVar.jyumaefscl();
        }

        public final List zoijcleaow(List protocols) {
            zdlpuopuiu.btonecajqb(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((pmvmpeiblj) obj) != pmvmpeiblj.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((pmvmpeiblj) it.next()).toString());
            }
            return arrayList2;
        }

        private iobyxmoadg() {
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null);
        f113749iobyxmoadg = iobyxmoadgVar;
        f113751zoijcleaow = iobyxmoadgVar.gxszxtbevo();
        f113750ppxfxbqfkf = Logger.getLogger(lereixgezr.class.getName());
    }

    public static /* synthetic */ void gtknphoqwx(agtfadlqog agtfadlqogVar, String str, int i13, Throwable th2, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i14 & 2) != 0) {
            i13 = 4;
        }
        if ((i14 & 4) != 0) {
            th2 = null;
        }
        agtfadlqogVar.btonecajqb(str, i13, th2);
    }

    public SSLSocketFactory agtfadlqog(X509TrustManager trustManager) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        try {
            SSLContext sSLContextWflxmlrfwp = wflxmlrfwp();
            sSLContextWflxmlrfwp.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextWflxmlrfwp.getSocketFactory();
            zdlpuopuiu.dxjokdxxww(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e13) {
            throw new AssertionError("No System TLS: " + e13, e13);
        }
    }

    public void btonecajqb(String message, int i13, Throwable th2) {
        zdlpuopuiu.btonecajqb(message, "message");
        f113750ppxfxbqfkf.log(i13 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void draadjrbmk(String message, Object obj) {
        zdlpuopuiu.btonecajqb(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        btonecajqb(message, 5, (Throwable) obj);
    }

    public boolean dxjokdxxww(String hostname) {
        zdlpuopuiu.btonecajqb(hostname, "hostname");
        return true;
    }

    public void eablkybsjg(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
    }

    public void gxszxtbevo(Socket socket, InetSocketAddress address, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(socket, "socket");
        zdlpuopuiu.btonecajqb(address, "address");
        socket.connect(address, i13);
    }

    public String lqeggnwhkg(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return null;
    }

    public Object nufgyqmvbu(String closer) {
        zdlpuopuiu.btonecajqb(closer, "closer");
        if (f113750ppxfxbqfkf.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public X509TrustManager ojitshcjhn() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public yk.ppxfxbqfkf ppxfxbqfkf(X509TrustManager trustManager) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        return new yk.iobyxmoadg(wkgbmnqykc(trustManager));
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        zdlpuopuiu.dxjokdxxww(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public SSLContext wflxmlrfwp() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        zdlpuopuiu.dxjokdxxww(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public yk.eablkybsjg wkgbmnqykc(X509TrustManager trustManager) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        zdlpuopuiu.dxjokdxxww(acceptedIssuers, "trustManager.acceptedIssuers");
        return new yk.zoijcleaow((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
    }
}
