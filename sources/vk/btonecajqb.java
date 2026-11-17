package vk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;
import org.conscrypt.Conscrypt;
import uk.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f117457iobyxmoadg = new zoijcleaow(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gtknphoqwx.iobyxmoadg f117458zoijcleaow = new iobyxmoadg();

    public static final class iobyxmoadg implements gtknphoqwx.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // vk.gtknphoqwx.iobyxmoadg
        public draadjrbmk ppxfxbqfkf(SSLSocket sslSocket) {
            zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
            return new btonecajqb();
        }

        @Override // vk.gtknphoqwx.iobyxmoadg
        public boolean zoijcleaow(SSLSocket sslSocket) {
            zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
            return uk.nufgyqmvbu.f113775eablkybsjg.ppxfxbqfkf() && Conscrypt.isConscrypt(sslSocket);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gtknphoqwx.iobyxmoadg iobyxmoadg() {
            return btonecajqb.f117458zoijcleaow;
        }

        private zoijcleaow() {
        }
    }

    @Override // vk.draadjrbmk
    public boolean iobyxmoadg() {
        return uk.nufgyqmvbu.f113775eablkybsjg.ppxfxbqfkf();
    }

    @Override // vk.draadjrbmk
    public String ppxfxbqfkf(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        if (zoijcleaow(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // vk.draadjrbmk
    public void wkgbmnqykc(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        if (zoijcleaow(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = agtfadlqog.f113749iobyxmoadg.zoijcleaow(protocols).toArray(new String[0]);
            zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }

    @Override // vk.draadjrbmk
    public boolean zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }
}
