package lk;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f63062iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final InetSocketAddress f63063ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Proxy f63064zoijcleaow;

    public iozdgvuglv(iobyxmoadg address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(address, "address");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proxy, "proxy");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(socketAddress, "socketAddress");
        this.f63062iobyxmoadg = address;
        this.f63064zoijcleaow = proxy;
        this.f63063ppxfxbqfkf = socketAddress;
    }

    public boolean equals(Object obj) {
        if (obj instanceof iozdgvuglv) {
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iozdgvuglvVar.f63062iobyxmoadg, this.f63062iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iozdgvuglvVar.f63064zoijcleaow, this.f63064zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iozdgvuglvVar.f63063ppxfxbqfkf, this.f63063ppxfxbqfkf)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f63062iobyxmoadg.hashCode()) * 31) + this.f63064zoijcleaow.hashCode()) * 31) + this.f63063ppxfxbqfkf.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f63062iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        if (this.f63064zoijcleaow.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f63062iobyxmoadg.gtknphoqwx() != null || this.f63062iobyxmoadg.gxszxtbevo().contains(pmvmpeiblj.H2_PRIOR_KNOWLEDGE);
    }

    public String toString() {
        String strIobyxmoadg;
        String hostAddress;
        StringBuilder sb3 = new StringBuilder();
        String strDxjokdxxww = this.f63062iobyxmoadg.draadjrbmk().dxjokdxxww();
        InetAddress address = this.f63063ppxfxbqfkf.getAddress();
        if (address == null || (hostAddress = address.getHostAddress()) == null) {
            strIobyxmoadg = null;
        } else {
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(hostAddress, "hostAddress");
            strIobyxmoadg = mk.lqeggnwhkg.iobyxmoadg(hostAddress);
        }
        if (mj.kcexrzcfyt.ulzqkzuiru(strDxjokdxxww, ':', false, 2, null)) {
            sb3.append("[");
            sb3.append(strDxjokdxxww);
            sb3.append("]");
        } else {
            sb3.append(strDxjokdxxww);
        }
        if (this.f63062iobyxmoadg.draadjrbmk().rgvfuqvkyq() != this.f63063ppxfxbqfkf.getPort() || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strDxjokdxxww, strIobyxmoadg)) {
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append(this.f63062iobyxmoadg.draadjrbmk().rgvfuqvkyq());
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strDxjokdxxww, strIobyxmoadg)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f63064zoijcleaow, Proxy.NO_PROXY)) {
                sb3.append(" at ");
            } else {
                sb3.append(" via proxy ");
            }
            if (strIobyxmoadg == null) {
                sb3.append("<unresolved>");
            } else if (mj.kcexrzcfyt.ulzqkzuiru(strIobyxmoadg, ':', false, 2, null)) {
                sb3.append("[");
                sb3.append(strIobyxmoadg);
                sb3.append("]");
            } else {
                sb3.append(strIobyxmoadg);
            }
            sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append(this.f63063ppxfxbqfkf.getPort());
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final InetSocketAddress wkgbmnqykc() {
        return this.f63063ppxfxbqfkf;
    }

    public final Proxy zoijcleaow() {
        return this.f63064zoijcleaow;
    }
}
