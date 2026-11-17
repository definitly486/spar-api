package uk;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public class draadjrbmk extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final boolean f113752eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Integer f113753gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f113754wkgbmnqykc = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final draadjrbmk iobyxmoadg() {
            if (zoijcleaow()) {
                return new draadjrbmk();
            }
            return null;
        }

        public final boolean zoijcleaow() {
            return draadjrbmk.f113752eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numVdvldrhtss = property != null ? kcexrzcfyt.vdvldrhtss(property) : null;
        f113753gxszxtbevo = numVdvldrhtss;
        boolean z13 = false;
        if (numVdvldrhtss == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z13 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numVdvldrhtss.intValue() >= 9) {
            z13 = true;
        }
        f113752eablkybsjg = z13;
    }

    @Override // uk.agtfadlqog
    public void eablkybsjg(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = agtfadlqog.f113749iobyxmoadg.zoijcleaow(protocols).toArray(new String[0]);
        zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // uk.agtfadlqog
    public String lqeggnwhkg(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : zdlpuopuiu.eablkybsjg(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // uk.agtfadlqog
    public SSLContext wflxmlrfwp() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        Integer num = f113753gxszxtbevo;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            zdlpuopuiu.dxjokdxxww(sSLContext2, "getInstance(\"TLS\")");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        zdlpuopuiu.dxjokdxxww(sSLContext, "try {\n          // Based…Instance(\"TLS\")\n        }");
        return sSLContext;
    }
}
