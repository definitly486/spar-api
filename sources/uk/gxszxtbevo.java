package uk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import hg.jyumaefscl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f113767eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final boolean f113768gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f113769wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final agtfadlqog iobyxmoadg() {
            if (zoijcleaow()) {
                return new gxszxtbevo();
            }
            return null;
        }

        public final boolean zoijcleaow() {
            return gxszxtbevo.f113768gxszxtbevo;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements yk.eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final X509TrustManager f113770iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Method f113771zoijcleaow;

        public zoijcleaow(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            zdlpuopuiu.btonecajqb(trustManager, "trustManager");
            zdlpuopuiu.btonecajqb(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f113770iobyxmoadg = trustManager;
            this.f113771zoijcleaow = findByIssuerAndSignatureMethod;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f113770iobyxmoadg, zoijcleaowVar.f113770iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f113771zoijcleaow, zoijcleaowVar.f113771zoijcleaow);
        }

        public int hashCode() {
            return (this.f113770iobyxmoadg.hashCode() * 31) + this.f113771zoijcleaow.hashCode();
        }

        @Override // yk.eablkybsjg
        public X509Certificate iobyxmoadg(X509Certificate cert) {
            zdlpuopuiu.btonecajqb(cert, "cert");
            try {
                Object objInvoke = this.f113771zoijcleaow.invoke(this.f113770iobyxmoadg, cert);
                zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e13) {
                throw new AssertionError("unable to get issues and signature", e13);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f113770iobyxmoadg + ", findByIssuerAndSignatureMethod=" + this.f113771zoijcleaow + ')';
        }
    }

    static {
        boolean z13 = false;
        if (agtfadlqog.f113749iobyxmoadg.nufgyqmvbu() && Build.VERSION.SDK_INT < 30) {
            z13 = true;
        }
        f113768gxszxtbevo = z13;
    }

    public gxszxtbevo() {
        List listOxmwwwfdhm = jyumaefscl.oxmwwwfdhm(vk.wflxmlrfwp.iobyxmoadg.zoijcleaow(vk.wflxmlrfwp.f117476btonecajqb, null, 1, null), new vk.gtknphoqwx(vk.nufgyqmvbu.f117467gxszxtbevo.wkgbmnqykc()), new vk.gtknphoqwx(vk.btonecajqb.f117457iobyxmoadg.iobyxmoadg()), new vk.gtknphoqwx(vk.dxjokdxxww.f117459iobyxmoadg.iobyxmoadg()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOxmwwwfdhm) {
            if (((vk.draadjrbmk) obj).iobyxmoadg()) {
                arrayList.add(obj);
            }
        }
        this.f113769wkgbmnqykc = arrayList;
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
        Iterator it = this.f113769wkgbmnqykc.iterator();
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
    public void gxszxtbevo(Socket socket, InetSocketAddress address, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(socket, "socket");
        zdlpuopuiu.btonecajqb(address, "address");
        try {
            socket.connect(address, i13);
        } catch (ClassCastException e13) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e13;
            }
            throw new IOException("Exception in connect", e13);
        }
    }

    @Override // uk.agtfadlqog
    public String lqeggnwhkg(SSLSocket sslSocket) {
        Object next;
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        Iterator it = this.f113769wkgbmnqykc.iterator();
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
    public yk.ppxfxbqfkf ppxfxbqfkf(X509TrustManager trustManager) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        vk.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = vk.wkgbmnqykc.f117479wkgbmnqykc.iobyxmoadg(trustManager);
        return wkgbmnqykcVarIobyxmoadg != null ? wkgbmnqykcVarIobyxmoadg : super.ppxfxbqfkf(trustManager);
    }

    @Override // uk.agtfadlqog
    public yk.eablkybsjg wkgbmnqykc(X509TrustManager trustManager) {
        zdlpuopuiu.btonecajqb(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            zdlpuopuiu.dxjokdxxww(method, "method");
            return new zoijcleaow(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.wkgbmnqykc(trustManager);
        }
    }
}
