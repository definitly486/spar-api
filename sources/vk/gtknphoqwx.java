package vk;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f117464iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private draadjrbmk f117465zoijcleaow;

    public interface iobyxmoadg {
        draadjrbmk ppxfxbqfkf(SSLSocket sSLSocket);

        boolean zoijcleaow(SSLSocket sSLSocket);
    }

    public gtknphoqwx(iobyxmoadg socketAdapterFactory) {
        zdlpuopuiu.btonecajqb(socketAdapterFactory, "socketAdapterFactory");
        this.f117464iobyxmoadg = socketAdapterFactory;
    }

    private final synchronized draadjrbmk eablkybsjg(SSLSocket sSLSocket) {
        try {
            if (this.f117465zoijcleaow == null && this.f117464iobyxmoadg.zoijcleaow(sSLSocket)) {
                this.f117465zoijcleaow = this.f117464iobyxmoadg.ppxfxbqfkf(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f117465zoijcleaow;
    }

    @Override // vk.draadjrbmk
    public boolean iobyxmoadg() {
        return true;
    }

    @Override // vk.draadjrbmk
    public String ppxfxbqfkf(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        draadjrbmk draadjrbmkVarEablkybsjg = eablkybsjg(sslSocket);
        if (draadjrbmkVarEablkybsjg != null) {
            return draadjrbmkVarEablkybsjg.ppxfxbqfkf(sslSocket);
        }
        return null;
    }

    @Override // vk.draadjrbmk
    public void wkgbmnqykc(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        draadjrbmk draadjrbmkVarEablkybsjg = eablkybsjg(sslSocket);
        if (draadjrbmkVarEablkybsjg != null) {
            draadjrbmkVarEablkybsjg.wkgbmnqykc(sslSocket, str, protocols);
        }
    }

    @Override // vk.draadjrbmk
    public boolean zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return this.f117464iobyxmoadg.zoijcleaow(sslSocket);
    }
}
