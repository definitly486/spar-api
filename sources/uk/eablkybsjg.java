package uk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f113764eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final boolean f113765gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f113766wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final agtfadlqog iobyxmoadg() {
            if (zoijcleaow()) {
                return new eablkybsjg();
            }
            return null;
        }

        public final boolean zoijcleaow() {
            return eablkybsjg.f113765gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    static {
        f113765gxszxtbevo = agtfadlqog.f113749iobyxmoadg.nufgyqmvbu() && Build.VERSION.SDK_INT >= 29;
    }

    public eablkybsjg() {
        List listOxmwwwfdhm = jyumaefscl.oxmwwwfdhm(vk.ppxfxbqfkf.f117475iobyxmoadg.iobyxmoadg(), new vk.gtknphoqwx(vk.nufgyqmvbu.f117467gxszxtbevo.wkgbmnqykc()), new vk.gtknphoqwx(vk.btonecajqb.f117457iobyxmoadg.iobyxmoadg()), new vk.gtknphoqwx(vk.dxjokdxxww.f117459iobyxmoadg.iobyxmoadg()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOxmwwwfdhm) {
            if (((vk.draadjrbmk) obj).iobyxmoadg()) {
                arrayList.add(obj);
            }
        }
        this.f113766wkgbmnqykc = arrayList;
    }

    @Override // uk.agtfadlqog
    public void draadjrbmk(String message, Object obj) {
        zdlpuopuiu.btonecajqb(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.draadjrbmk(message, obj);
        } else {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            zoijcleaow.iobyxmoadg(obj).warnIfOpen();
        }
    }

    @Override // uk.agtfadlqog
    public boolean dxjokdxxww(String hostname) {
        zdlpuopuiu.btonecajqb(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // uk.agtfadlqog
    public void eablkybsjg(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        Iterator it = this.f113766wkgbmnqykc.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((vk.draadjrbmk) next).zoijcleaow(sslSocket));
        vk.draadjrbmk draadjrbmkVar = (vk.draadjrbmk) next;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.wkgbmnqykc(sslSocket, str, protocols);
        }
    }

    @Override // uk.agtfadlqog
    public String lqeggnwhkg(SSLSocket sslSocket) {
        Object next;
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        Iterator it = this.f113766wkgbmnqykc.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((vk.draadjrbmk) next).zoijcleaow(sslSocket));
        vk.draadjrbmk draadjrbmkVar = (vk.draadjrbmk) next;
        if (draadjrbmkVar != null) {
            return draadjrbmkVar.ppxfxbqfkf(sslSocket);
        }
        return null;
    }

    @Override // uk.agtfadlqog
    public Object nufgyqmvbu(String closer) {
        zdlpuopuiu.btonecajqb(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.nufgyqmvbu(closer);
        }
        CloseGuard closeGuardIobyxmoadg = wkgbmnqykc.iobyxmoadg();
        closeGuardIobyxmoadg.open(closer);
        return closeGuardIobyxmoadg;
    }

    @Override // uk.agtfadlqog
    public yk.ppxfxbqfkf ppxfxbqfkf(X509TrustManager trustManager) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        vk.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = vk.wkgbmnqykc.f117479wkgbmnqykc.iobyxmoadg(trustManager);
        return wkgbmnqykcVarIobyxmoadg != null ? wkgbmnqykcVarIobyxmoadg : super.ppxfxbqfkf(trustManager);
    }
}
