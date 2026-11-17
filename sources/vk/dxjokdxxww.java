package vk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import uk.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f117459iobyxmoadg = new zoijcleaow(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gtknphoqwx.iobyxmoadg f117460zoijcleaow = new iobyxmoadg();

    public static final class iobyxmoadg implements gtknphoqwx.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // vk.gtknphoqwx.iobyxmoadg
        public draadjrbmk ppxfxbqfkf(SSLSocket sslSocket) {
            zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
            return new dxjokdxxww();
        }

        @Override // vk.gtknphoqwx.iobyxmoadg
        public boolean zoijcleaow(SSLSocket sslSocket) {
            zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
            uk.lqeggnwhkg.f113772eablkybsjg.zoijcleaow();
            return false;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gtknphoqwx.iobyxmoadg iobyxmoadg() {
            return dxjokdxxww.f117460zoijcleaow;
        }

        private zoijcleaow() {
        }
    }

    @Override // vk.draadjrbmk
    public boolean iobyxmoadg() {
        return uk.lqeggnwhkg.f113772eablkybsjg.zoijcleaow();
    }

    @Override // vk.draadjrbmk
    public String ppxfxbqfkf(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : zdlpuopuiu.eablkybsjg(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // vk.draadjrbmk
    public void wkgbmnqykc(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        if (zoijcleaow(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = agtfadlqog.f113749iobyxmoadg.zoijcleaow(protocols).toArray(new String[0]);
            zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // vk.draadjrbmk
    public boolean zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return false;
    }
}
