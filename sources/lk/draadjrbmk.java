package lk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final draadjrbmk f62892btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final draadjrbmk f62893dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final zoijcleaow f62894eablkybsjg = new zoijcleaow(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final draadjrbmk f62895gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final dxjokdxxww[] f62896gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final dxjokdxxww[] f62897lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final draadjrbmk f62898nufgyqmvbu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f62899iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String[] f62900ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String[] f62901wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f62902zoijcleaow;

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    static {
        dxjokdxxww dxjokdxxwwVar = dxjokdxxww.f62999t;
        dxjokdxxww dxjokdxxwwVar2 = dxjokdxxww.f63002u;
        dxjokdxxww dxjokdxxwwVar3 = dxjokdxxww.f63006v;
        dxjokdxxww dxjokdxxwwVar4 = dxjokdxxww.f62930f;
        dxjokdxxww dxjokdxxwwVar5 = dxjokdxxww.f62952j;
        dxjokdxxww dxjokdxxwwVar6 = dxjokdxxww.f62934g;
        dxjokdxxww dxjokdxxwwVar7 = dxjokdxxww.f62959k;
        dxjokdxxww dxjokdxxwwVar8 = dxjokdxxww.f62987q;
        dxjokdxxww dxjokdxxwwVar9 = dxjokdxxww.f62983p;
        dxjokdxxww[] dxjokdxxwwVarArr = {dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVar3, dxjokdxxwwVar4, dxjokdxxwwVar5, dxjokdxxwwVar6, dxjokdxxwwVar7, dxjokdxxwwVar8, dxjokdxxwwVar9};
        f62896gxszxtbevo = dxjokdxxwwVarArr;
        dxjokdxxww[] dxjokdxxwwVarArr2 = {dxjokdxxwwVar, dxjokdxxwwVar2, dxjokdxxwwVar3, dxjokdxxwwVar4, dxjokdxxwwVar5, dxjokdxxwwVar6, dxjokdxxwwVar7, dxjokdxxwwVar8, dxjokdxxwwVar9, dxjokdxxww.f62935grlcpdaxtj, dxjokdxxww.f62972mhtqkkgtqm, dxjokdxxww.f63005uwvvkdfqfp, dxjokdxxww.f63020yfnezrywwk, dxjokdxxww.f63014wwaezpbzkn, dxjokdxxww.f62955jpowsppfya, dxjokdxxww.f62921draadjrbmk};
        f62897lqeggnwhkg = dxjokdxxwwVarArr2;
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf = new iobyxmoadg(true).ppxfxbqfkf((dxjokdxxww[]) Arrays.copyOf(dxjokdxxwwVarArr, dxjokdxxwwVarArr.length));
        lmojexxdyd lmojexxdydVar = lmojexxdyd.TLS_1_3;
        lmojexxdyd lmojexxdydVar2 = lmojexxdyd.TLS_1_2;
        f62898nufgyqmvbu = iobyxmoadgVarPpxfxbqfkf.gxszxtbevo(lmojexxdydVar, lmojexxdydVar2).wkgbmnqykc(true).iobyxmoadg();
        f62893dxjokdxxww = new iobyxmoadg(true).ppxfxbqfkf((dxjokdxxww[]) Arrays.copyOf(dxjokdxxwwVarArr2, dxjokdxxwwVarArr2.length)).gxszxtbevo(lmojexxdydVar, lmojexxdydVar2).wkgbmnqykc(true).iobyxmoadg();
        f62892btonecajqb = new iobyxmoadg(true).ppxfxbqfkf((dxjokdxxww[]) Arrays.copyOf(dxjokdxxwwVarArr2, dxjokdxxwwVarArr2.length)).gxszxtbevo(lmojexxdydVar, lmojexxdydVar2, lmojexxdyd.TLS_1_1, lmojexxdyd.TLS_1_0).wkgbmnqykc(true).iobyxmoadg();
        f62895gtknphoqwx = new iobyxmoadg(false).iobyxmoadg();
    }

    public draadjrbmk(boolean z13, boolean z14, String[] strArr, String[] strArr2) {
        this.f62899iobyxmoadg = z13;
        this.f62902zoijcleaow = z14;
        this.f62900ppxfxbqfkf = strArr;
        this.f62901wkgbmnqykc = strArr2;
    }

    private final draadjrbmk lqeggnwhkg(SSLSocket sSLSocket, boolean z13) throws CloneNotSupportedException {
        String[] tlsVersionsIntersection;
        String[] socketEnabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        String[] strArrWkgbmnqykc = mk.iobyxmoadg.wkgbmnqykc(this, socketEnabledCipherSuites);
        if (this.f62901wkgbmnqykc != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = mk.wflxmlrfwp.cqumvgiudr(enabledProtocols, this.f62901wkgbmnqykc, kg.iobyxmoadg.lqeggnwhkg());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(supportedCipherSuites, "supportedCipherSuites");
        int iRgvfuqvkyq = mk.wflxmlrfwp.rgvfuqvkyq(supportedCipherSuites, "TLS_FALLBACK_SCSV", dxjokdxxww.f63027zoijcleaow.ppxfxbqfkf());
        if (z13 && iRgvfuqvkyq != -1) {
            String str = supportedCipherSuites[iRgvfuqvkyq];
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArrWkgbmnqykc = mk.wflxmlrfwp.lqeggnwhkg(strArrWkgbmnqykc, str);
        }
        iobyxmoadg iobyxmoadgVarZoijcleaow = new iobyxmoadg(this).zoijcleaow((String[]) Arrays.copyOf(strArrWkgbmnqykc, strArrWkgbmnqykc.length));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tlsVersionsIntersection, "tlsVersionsIntersection");
        return iobyxmoadgVarZoijcleaow.eablkybsjg((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).iobyxmoadg();
    }

    public final List dxjokdxxww() {
        String[] strArr = this.f62901wkgbmnqykc;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(lmojexxdyd.f63165yggfygwlhe.iobyxmoadg(str));
        }
        return hg.jyumaefscl.m(arrayList);
    }

    public final boolean eablkybsjg(SSLSocket socket) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(socket, "socket");
        if (!this.f62899iobyxmoadg) {
            return false;
        }
        String[] strArr = this.f62901wkgbmnqykc;
        if (strArr != null && !mk.wflxmlrfwp.ojitshcjhn(strArr, socket.getEnabledProtocols(), kg.iobyxmoadg.lqeggnwhkg())) {
            return false;
        }
        String[] strArr2 = this.f62900ppxfxbqfkf;
        return strArr2 == null || mk.wflxmlrfwp.ojitshcjhn(strArr2, socket.getEnabledCipherSuites(), dxjokdxxww.f63027zoijcleaow.ppxfxbqfkf());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z13 = this.f62899iobyxmoadg;
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        if (z13 != draadjrbmkVar.f62899iobyxmoadg) {
            return false;
        }
        return !z13 || (Arrays.equals(this.f62900ppxfxbqfkf, draadjrbmkVar.f62900ppxfxbqfkf) && Arrays.equals(this.f62901wkgbmnqykc, draadjrbmkVar.f62901wkgbmnqykc) && this.f62902zoijcleaow == draadjrbmkVar.f62902zoijcleaow);
    }

    public final boolean gxszxtbevo() {
        return this.f62899iobyxmoadg;
    }

    public int hashCode() {
        if (!this.f62899iobyxmoadg) {
            return 17;
        }
        String[] strArr = this.f62900ppxfxbqfkf;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f62901wkgbmnqykc;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f62902zoijcleaow ? 1 : 0);
    }

    public final boolean nufgyqmvbu() {
        return this.f62902zoijcleaow;
    }

    public final List ppxfxbqfkf() {
        String[] strArr = this.f62900ppxfxbqfkf;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(dxjokdxxww.f63027zoijcleaow.zoijcleaow(str));
        }
        return hg.jyumaefscl.m(arrayList);
    }

    public String toString() {
        if (!this.f62899iobyxmoadg) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(ppxfxbqfkf(), "[all enabled]") + ", tlsVersions=" + Objects.toString(dxjokdxxww(), "[all enabled]") + ", supportsTlsExtensions=" + this.f62902zoijcleaow + ')';
    }

    public final String[] wkgbmnqykc() {
        return this.f62900ppxfxbqfkf;
    }

    public final void zoijcleaow(SSLSocket sslSocket, boolean z13) throws CloneNotSupportedException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        draadjrbmk draadjrbmkVarLqeggnwhkg = lqeggnwhkg(sslSocket, z13);
        if (draadjrbmkVarLqeggnwhkg.dxjokdxxww() != null) {
            sslSocket.setEnabledProtocols(draadjrbmkVarLqeggnwhkg.f62901wkgbmnqykc);
        }
        if (draadjrbmkVarLqeggnwhkg.ppxfxbqfkf() != null) {
            sslSocket.setEnabledCipherSuites(draadjrbmkVarLqeggnwhkg.f62900ppxfxbqfkf);
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f62903iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String[] f62904ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f62905wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String[] f62906zoijcleaow;

        public iobyxmoadg(boolean z13) {
            this.f62903iobyxmoadg = z13;
        }

        public final iobyxmoadg eablkybsjg(String... tlsVersions) throws CloneNotSupportedException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tlsVersions, "tlsVersions");
            if (!this.f62903iobyxmoadg) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object objClone = tlsVersions.clone();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f62904ppxfxbqfkf = (String[]) objClone;
            return this;
        }

        public final iobyxmoadg gxszxtbevo(lmojexxdyd... tlsVersions) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tlsVersions, "tlsVersions");
            if (!this.f62903iobyxmoadg) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (lmojexxdyd lmojexxdydVar : tlsVersions) {
                arrayList.add(lmojexxdydVar.wkgbmnqykc());
            }
            Object[] array = arrayList.toArray(new String[0]);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return eablkybsjg((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final draadjrbmk iobyxmoadg() {
            return new draadjrbmk(this.f62903iobyxmoadg, this.f62905wkgbmnqykc, this.f62906zoijcleaow, this.f62904ppxfxbqfkf);
        }

        public final iobyxmoadg ppxfxbqfkf(dxjokdxxww... cipherSuites) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cipherSuites, "cipherSuites");
            if (!this.f62903iobyxmoadg) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (dxjokdxxww dxjokdxxwwVar : cipherSuites) {
                arrayList.add(dxjokdxxwwVar.ppxfxbqfkf());
            }
            Object[] array = arrayList.toArray(new String[0]);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return zoijcleaow((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final iobyxmoadg wkgbmnqykc(boolean z13) {
            if (!this.f62903iobyxmoadg) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f62905wkgbmnqykc = z13;
            return this;
        }

        public final iobyxmoadg zoijcleaow(String... cipherSuites) throws CloneNotSupportedException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cipherSuites, "cipherSuites");
            if (!this.f62903iobyxmoadg) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object objClone = cipherSuites.clone();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f62906zoijcleaow = (String[]) objClone;
            return this;
        }

        public iobyxmoadg(draadjrbmk connectionSpec) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectionSpec, "connectionSpec");
            this.f62903iobyxmoadg = connectionSpec.gxszxtbevo();
            this.f62906zoijcleaow = connectionSpec.wkgbmnqykc();
            this.f62904ppxfxbqfkf = connectionSpec.f62901wkgbmnqykc;
            this.f62905wkgbmnqykc = connectionSpec.nufgyqmvbu();
        }
    }
}
