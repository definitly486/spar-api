package vk;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;
import uk.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f117475iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final draadjrbmk iobyxmoadg() {
            if (zoijcleaow()) {
                return new ppxfxbqfkf();
            }
            return null;
        }

        public final boolean zoijcleaow() {
            return agtfadlqog.f113749iobyxmoadg.nufgyqmvbu() && Build.VERSION.SDK_INT >= 29;
        }

        private iobyxmoadg() {
        }
    }

    @Override // vk.draadjrbmk
    public boolean iobyxmoadg() {
        return f117475iobyxmoadg.zoijcleaow();
    }

    @Override // vk.draadjrbmk
    public String ppxfxbqfkf(SSLSocket sslSocket) {
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

    @Override // vk.draadjrbmk
    public void wkgbmnqykc(SSLSocket sslSocket, String str, List protocols) throws IOException {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = agtfadlqog.f113749iobyxmoadg.zoijcleaow(protocols).toArray(new String[0]);
            zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e13) {
            throw new IOException("Android internal error", e13);
        }
    }

    @Override // vk.draadjrbmk
    public boolean zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }
}
