package uk;

import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends agtfadlqog {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final zoijcleaow f113755dxjokdxxww = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Method f113756eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Method f113757gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Class f113758lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Class f113759nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Method f113760wkgbmnqykc;

    private static final class iobyxmoadg implements InvocationHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f113761iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f113762ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f113763zoijcleaow;

        public iobyxmoadg(List protocols) {
            zdlpuopuiu.btonecajqb(protocols, "protocols");
            this.f113761iobyxmoadg = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            zdlpuopuiu.btonecajqb(proxy, "proxy");
            zdlpuopuiu.btonecajqb(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (zdlpuopuiu.eablkybsjg(name, "supports") && zdlpuopuiu.eablkybsjg(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (zdlpuopuiu.eablkybsjg(name, "unsupported") && zdlpuopuiu.eablkybsjg(Void.TYPE, returnType)) {
                this.f113763zoijcleaow = true;
                return null;
            }
            if (zdlpuopuiu.eablkybsjg(name, "protocols") && objArr.length == 0) {
                return this.f113761iobyxmoadg;
            }
            if ((zdlpuopuiu.eablkybsjg(name, "selectProtocol") || zdlpuopuiu.eablkybsjg(name, "select")) && zdlpuopuiu.eablkybsjg(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i13 = 0;
                        while (true) {
                            Object obj2 = list.get(i13);
                            zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (this.f113761iobyxmoadg.contains(str)) {
                                this.f113762ppxfxbqfkf = str;
                                return str;
                            }
                            if (i13 != size) {
                                i13++;
                            }
                        }
                    }
                    String str2 = (String) this.f113761iobyxmoadg.get(0);
                    this.f113762ppxfxbqfkf = str2;
                    return str2;
                }
            }
            if ((!zdlpuopuiu.eablkybsjg(name, "protocolSelected") && !zdlpuopuiu.eablkybsjg(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f113762ppxfxbqfkf = (String) obj3;
            return null;
        }

        public final String iobyxmoadg() {
            return this.f113762ppxfxbqfkf;
        }

        public final boolean zoijcleaow() {
            return this.f113763zoijcleaow;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final agtfadlqog iobyxmoadg() {
            String jvmVersion = System.getProperty("java.specification.version", CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
            try {
                zdlpuopuiu.dxjokdxxww(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                zdlpuopuiu.dxjokdxxww(putMethod, "putMethod");
                zdlpuopuiu.dxjokdxxww(getMethod, "getMethod");
                zdlpuopuiu.dxjokdxxww(removeMethod, "removeMethod");
                zdlpuopuiu.dxjokdxxww(clientProviderClass, "clientProviderClass");
                zdlpuopuiu.dxjokdxxww(serverProviderClass, "serverProviderClass");
                return new dxjokdxxww(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        private zoijcleaow() {
        }
    }

    public dxjokdxxww(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        zdlpuopuiu.btonecajqb(putMethod, "putMethod");
        zdlpuopuiu.btonecajqb(getMethod, "getMethod");
        zdlpuopuiu.btonecajqb(removeMethod, "removeMethod");
        zdlpuopuiu.btonecajqb(clientProviderClass, "clientProviderClass");
        zdlpuopuiu.btonecajqb(serverProviderClass, "serverProviderClass");
        this.f113760wkgbmnqykc = putMethod;
        this.f113756eablkybsjg = getMethod;
        this.f113757gxszxtbevo = removeMethod;
        this.f113758lqeggnwhkg = clientProviderClass;
        this.f113759nufgyqmvbu = serverProviderClass;
    }

    @Override // uk.agtfadlqog
    public void eablkybsjg(SSLSocket sslSocket, String str, List protocols) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        zdlpuopuiu.btonecajqb(protocols, "protocols");
        try {
            this.f113760wkgbmnqykc.invoke(null, sslSocket, Proxy.newProxyInstance(agtfadlqog.class.getClassLoader(), new Class[]{this.f113758lqeggnwhkg, this.f113759nufgyqmvbu}, new iobyxmoadg(agtfadlqog.f113749iobyxmoadg.zoijcleaow(protocols))));
        } catch (IllegalAccessException e13) {
            throw new AssertionError("failed to set ALPN", e13);
        } catch (InvocationTargetException e14) {
            throw new AssertionError("failed to set ALPN", e14);
        }
    }

    @Override // uk.agtfadlqog
    public String lqeggnwhkg(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f113756eablkybsjg.invoke(null, sslSocket));
            zdlpuopuiu.nufgyqmvbu(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) invocationHandler;
            if (!iobyxmoadgVar.zoijcleaow() && iobyxmoadgVar.iobyxmoadg() == null) {
                agtfadlqog.gtknphoqwx(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (iobyxmoadgVar.zoijcleaow()) {
                return null;
            }
            return iobyxmoadgVar.iobyxmoadg();
        } catch (IllegalAccessException e13) {
            throw new AssertionError("failed to get ALPN selected protocol", e13);
        } catch (InvocationTargetException e14) {
            throw new AssertionError("failed to get ALPN selected protocol", e14);
        }
    }

    @Override // uk.agtfadlqog
    public void zoijcleaow(SSLSocket sslSocket) {
        zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        try {
            this.f113757gxszxtbevo.invoke(null, sslSocket);
        } catch (IllegalAccessException e13) {
            throw new AssertionError("failed to remove ALPN", e13);
        } catch (InvocationTargetException e14) {
            throw new AssertionError("failed to remove ALPN", e14);
        }
    }
}
