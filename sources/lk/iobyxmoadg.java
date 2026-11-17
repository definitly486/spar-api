package lk;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f63051btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final jyumaefscl f63052dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lqeggnwhkg f63053eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final List f63054gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zoijcleaow f63055gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f63056iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Proxy f63057lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ProxySelector f63058nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SSLSocketFactory f63059ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final HostnameVerifier f63060wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SocketFactory f63061zoijcleaow;

    public iobyxmoadg(String uriHost, int i13, vdvldrhtss dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, lqeggnwhkg lqeggnwhkgVar, zoijcleaow proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uriHost, "uriHost");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dns, "dns");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(socketFactory, "socketFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(protocols, "protocols");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proxySelector, "proxySelector");
        this.f63056iobyxmoadg = dns;
        this.f63061zoijcleaow = socketFactory;
        this.f63059ppxfxbqfkf = sSLSocketFactory;
        this.f63060wkgbmnqykc = hostnameVerifier;
        this.f63053eablkybsjg = lqeggnwhkgVar;
        this.f63055gxszxtbevo = proxyAuthenticator;
        this.f63057lqeggnwhkg = proxy;
        this.f63058nufgyqmvbu = proxySelector;
        this.f63052dxjokdxxww = new jyumaefscl.iobyxmoadg().kcexrzcfyt(sSLSocketFactory != null ? HostSelectionInterceptorImpl.PROTOCOL_HTTPS : HostSelectionInterceptorImpl.PROTOCOL_HTTP).nufgyqmvbu(uriHost).agtfadlqog(i13).ppxfxbqfkf();
        this.f63051btonecajqb = mk.rgvfuqvkyq.yggfygwlhe(protocols);
        this.f63054gtknphoqwx = mk.rgvfuqvkyq.yggfygwlhe(connectionSpecs);
    }

    public final SocketFactory btonecajqb() {
        return this.f63061zoijcleaow;
    }

    public final jyumaefscl draadjrbmk() {
        return this.f63052dxjokdxxww;
    }

    public final ProxySelector dxjokdxxww() {
        return this.f63058nufgyqmvbu;
    }

    public final HostnameVerifier eablkybsjg() {
        return this.f63060wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj instanceof iobyxmoadg) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63052dxjokdxxww, iobyxmoadgVar.f63052dxjokdxxww) && wkgbmnqykc(iobyxmoadgVar)) {
                return true;
            }
        }
        return false;
    }

    public final SSLSocketFactory gtknphoqwx() {
        return this.f63059ppxfxbqfkf;
    }

    public final List gxszxtbevo() {
        return this.f63051btonecajqb;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f63052dxjokdxxww.hashCode()) * 31) + this.f63056iobyxmoadg.hashCode()) * 31) + this.f63055gxszxtbevo.hashCode()) * 31) + this.f63051btonecajqb.hashCode()) * 31) + this.f63054gtknphoqwx.hashCode()) * 31) + this.f63058nufgyqmvbu.hashCode()) * 31) + Objects.hashCode(this.f63057lqeggnwhkg)) * 31) + Objects.hashCode(this.f63059ppxfxbqfkf)) * 31) + Objects.hashCode(this.f63060wkgbmnqykc)) * 31) + Objects.hashCode(this.f63053eablkybsjg);
    }

    public final lqeggnwhkg iobyxmoadg() {
        return this.f63053eablkybsjg;
    }

    public final Proxy lqeggnwhkg() {
        return this.f63057lqeggnwhkg;
    }

    public final zoijcleaow nufgyqmvbu() {
        return this.f63055gxszxtbevo;
    }

    public final vdvldrhtss ppxfxbqfkf() {
        return this.f63056iobyxmoadg;
    }

    public String toString() {
        StringBuilder sb3;
        Object obj;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Address{");
        sb4.append(this.f63052dxjokdxxww.dxjokdxxww());
        sb4.append(':');
        sb4.append(this.f63052dxjokdxxww.rgvfuqvkyq());
        sb4.append(", ");
        if (this.f63057lqeggnwhkg != null) {
            sb3 = new StringBuilder();
            sb3.append("proxy=");
            obj = this.f63057lqeggnwhkg;
        } else {
            sb3 = new StringBuilder();
            sb3.append("proxySelector=");
            obj = this.f63058nufgyqmvbu;
        }
        sb3.append(obj);
        sb4.append(sb3.toString());
        sb4.append('}');
        return sb4.toString();
    }

    public final boolean wkgbmnqykc(iobyxmoadg that) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(that, "that");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63056iobyxmoadg, that.f63056iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63055gxszxtbevo, that.f63055gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63051btonecajqb, that.f63051btonecajqb) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63054gtknphoqwx, that.f63054gtknphoqwx) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63058nufgyqmvbu, that.f63058nufgyqmvbu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63057lqeggnwhkg, that.f63057lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63059ppxfxbqfkf, that.f63059ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63060wkgbmnqykc, that.f63060wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63053eablkybsjg, that.f63053eablkybsjg) && this.f63052dxjokdxxww.rgvfuqvkyq() == that.f63052dxjokdxxww.rgvfuqvkyq();
    }

    public final List zoijcleaow() {
        return this.f63054gtknphoqwx;
    }
}
