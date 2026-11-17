package vk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import uk.agtfadlqog;

/* JADX INFO: loaded from: classes3.dex */
public class nufgyqmvbu implements draadjrbmk {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f117467gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final gtknphoqwx.iobyxmoadg f117468lqeggnwhkg;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Method f117469eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Class f117470iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Method f117471ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Method f117472wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Method f117473zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: vk.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2918iobyxmoadg implements gtknphoqwx.iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ String f117474iobyxmoadg;

            C2918iobyxmoadg(String str) {
                this.f117474iobyxmoadg = str;
            }

            @Override // vk.gtknphoqwx.iobyxmoadg
            public draadjrbmk ppxfxbqfkf(SSLSocket sslSocket) {
                zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
                return nufgyqmvbu.f117467gxszxtbevo.zoijcleaow(sslSocket.getClass());
            }

            @Override // vk.gtknphoqwx.iobyxmoadg
            public boolean zoijcleaow(SSLSocket sslSocket) {
                zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                zdlpuopuiu.dxjokdxxww(name, "sslSocket.javaClass.name");
                return kcexrzcfyt.stevsuqkhv(name, this.f117474iobyxmoadg + '.', false, 2, null);
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final nufgyqmvbu zoijcleaow(Class cls) {
            Class superclass = cls;
            while (superclass != null && !zdlpuopuiu.eablkybsjg(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            zdlpuopuiu.lqeggnwhkg(superclass);
            return new nufgyqmvbu(superclass);
        }

        public final gtknphoqwx.iobyxmoadg ppxfxbqfkf(String packageName) {
            zdlpuopuiu.btonecajqb(packageName, "packageName");
            return new C2918iobyxmoadg(packageName);
        }

        public final gtknphoqwx.iobyxmoadg wkgbmnqykc() {
            return nufgyqmvbu.f117468lqeggnwhkg;
        }

        private iobyxmoadg() {
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null);
        f117467gxszxtbevo = iobyxmoadgVar;
        f117468lqeggnwhkg = iobyxmoadgVar.ppxfxbqfkf("com.google.android.gms.org.conscrypt");
    }

    public nufgyqmvbu(Class sslSocketClass) throws NoSuchMethodException {
        zdlpuopuiu.btonecajqb(sslSocketClass, "sslSocketClass");
        this.f117470iobyxmoadg = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        zdlpuopuiu.dxjokdxxww(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f117473zoijcleaow = declaredMethod;
        this.f117471ppxfxbqfkf = sslSocketClass.getMethod("setHostname", String.class);
        this.f117472wkgbmnqykc = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f117469eablkybsjg = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // vk.draadjrbmk
    public boolean iobyxmoadg() {
        return uk.gxszxtbevo.f113767eablkybsjg.zoijcleaow();
    }

    @Override // vk.draadjrbmk
    public String ppxfxbqfkf(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        if (!zoijcleaow(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f117472wkgbmnqykc.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, mj.wkgbmnqykc.f67326zoijcleaow);
            }
            return null;
        } catch (IllegalAccessException e13) {
            throw new AssertionError(e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if ((cause instanceof NullPointerException) && zdlpuopuiu.eablkybsjg(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e14);
        }
    }

    @Override // vk.draadjrbmk
    public void wkgbmnqykc(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        if (zoijcleaow(sslSocket)) {
            try {
                this.f117473zoijcleaow.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f117471ppxfxbqfkf.invoke(sslSocket, str);
                }
                this.f117469eablkybsjg.invoke(sslSocket, agtfadlqog.f113749iobyxmoadg.ppxfxbqfkf(protocols));
            } catch (IllegalAccessException e13) {
                throw new AssertionError(e13);
            } catch (InvocationTargetException e14) {
                throw new AssertionError(e14);
            }
        }
    }

    @Override // vk.draadjrbmk
    public boolean zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        return this.f117470iobyxmoadg.isInstance(sslSocket);
    }
}
