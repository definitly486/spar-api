package nk;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iozdgvuglv;
import lk.jyumaefscl;
import lk.nufgyqmvbu;
import lk.ojitshcjhn;
import lk.vdvldrhtss;
import lk.zoijcleaow;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vdvldrhtss f70257wkgbmnqykc;

    /* JADX INFO: renamed from: nk.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1518iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f70258iobyxmoadg;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f70258iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(vdvldrhtss defaultDns) {
        zdlpuopuiu.btonecajqb(defaultDns, "defaultDns");
        this.f70257wkgbmnqykc = defaultDns;
    }

    private final InetAddress zoijcleaow(Proxy proxy, jyumaefscl jyumaefsclVar, vdvldrhtss vdvldrhtssVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C1518iobyxmoadg.f70258iobyxmoadg[type.ordinal()]) == 1) {
            return (InetAddress) hg.jyumaefscl.opjhrmiecq(vdvldrhtssVar.iobyxmoadg(jyumaefsclVar.dxjokdxxww()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        zdlpuopuiu.nufgyqmvbu(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        zdlpuopuiu.dxjokdxxww(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // lk.zoijcleaow
    public zynmafqrjb iobyxmoadg(iozdgvuglv iozdgvuglvVar, cdpycssgdh response) {
        Proxy proxy;
        vdvldrhtss vdvldrhtssVarPpxfxbqfkf;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        lk.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(response, "response");
        List<nufgyqmvbu> listDxjokdxxww = response.dxjokdxxww();
        zynmafqrjb zynmafqrjbVarCdpycssgdh = response.cdpycssgdh();
        jyumaefscl jyumaefsclVarGtknphoqwx = zynmafqrjbVarCdpycssgdh.gtknphoqwx();
        boolean z13 = response.btonecajqb() == 407;
        if (iozdgvuglvVar == null || (proxy = iozdgvuglvVar.zoijcleaow()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (nufgyqmvbu nufgyqmvbuVar : listDxjokdxxww) {
            if (kcexrzcfyt.istkbnxepw("Basic", nufgyqmvbuVar.wkgbmnqykc(), true)) {
                if (iozdgvuglvVar == null || (iobyxmoadgVarIobyxmoadg = iozdgvuglvVar.iobyxmoadg()) == null || (vdvldrhtssVarPpxfxbqfkf = iobyxmoadgVarIobyxmoadg.ppxfxbqfkf()) == null) {
                    vdvldrhtssVarPpxfxbqfkf = this.f70257wkgbmnqykc;
                }
                if (z13) {
                    SocketAddress socketAddressAddress = proxy.address();
                    zdlpuopuiu.nufgyqmvbu(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    zdlpuopuiu.dxjokdxxww(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, zoijcleaow(proxy, jyumaefsclVarGtknphoqwx, vdvldrhtssVarPpxfxbqfkf), inetSocketAddress.getPort(), jyumaefsclVarGtknphoqwx.zdlpuopuiu(), nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.wkgbmnqykc(), jyumaefsclVarGtknphoqwx.jyumaefscl(), Authenticator.RequestorType.PROXY);
                } else {
                    String strDxjokdxxww = jyumaefsclVarGtknphoqwx.dxjokdxxww();
                    zdlpuopuiu.dxjokdxxww(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strDxjokdxxww, zoijcleaow(proxy, jyumaefsclVarGtknphoqwx, vdvldrhtssVarPpxfxbqfkf), jyumaefsclVarGtknphoqwx.rgvfuqvkyq(), jyumaefsclVarGtknphoqwx.zdlpuopuiu(), nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbuVar.wkgbmnqykc(), jyumaefsclVarGtknphoqwx.jyumaefscl(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z13 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    zdlpuopuiu.dxjokdxxww(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    zdlpuopuiu.dxjokdxxww(password, "auth.password");
                    return zynmafqrjbVarCdpycssgdh.nufgyqmvbu().dxjokdxxww(str, ojitshcjhn.iobyxmoadg(userName, new String(password), nufgyqmvbuVar.zoijcleaow())).zoijcleaow();
                }
            }
        }
        return null;
    }

    public /* synthetic */ iobyxmoadg(vdvldrhtss vdvldrhtssVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? vdvldrhtss.f63198zoijcleaow : vdvldrhtssVar);
    }
}
