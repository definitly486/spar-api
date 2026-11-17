package qk;

import hg.jyumaefscl;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.iozdgvuglv;
import lk.oxmwwwfdhm;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final iobyxmoadg f79024btonecajqb = new iobyxmoadg(null);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final List f79025dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final oxmwwwfdhm f79026eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private List f79027gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lk.iobyxmoadg f79028iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f79029lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private List f79030nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lk.eablkybsjg f79031ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f79032wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f79033zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg(InetSocketAddress inetSocketAddress) {
            zdlpuopuiu.btonecajqb(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                zdlpuopuiu.dxjokdxxww(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            zdlpuopuiu.dxjokdxxww(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f79034iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f79035zoijcleaow;

        public zoijcleaow(List routes) {
            zdlpuopuiu.btonecajqb(routes, "routes");
            this.f79034iobyxmoadg = routes;
        }

        public final List iobyxmoadg() {
            return this.f79034iobyxmoadg;
        }

        public final iozdgvuglv ppxfxbqfkf() {
            if (!zoijcleaow()) {
                throw new NoSuchElementException();
            }
            List list = this.f79034iobyxmoadg;
            int i13 = this.f79035zoijcleaow;
            this.f79035zoijcleaow = i13 + 1;
            return (iozdgvuglv) list.get(i13);
        }

        public final boolean zoijcleaow() {
            return this.f79035zoijcleaow < this.f79034iobyxmoadg.size();
        }
    }

    public ojitshcjhn(lk.iobyxmoadg address, wflxmlrfwp routeDatabase, lk.eablkybsjg call, boolean z13, oxmwwwfdhm eventListener) {
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(routeDatabase, "routeDatabase");
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(eventListener, "eventListener");
        this.f79028iobyxmoadg = address;
        this.f79033zoijcleaow = routeDatabase;
        this.f79031ppxfxbqfkf = call;
        this.f79032wkgbmnqykc = z13;
        this.f79026eablkybsjg = eventListener;
        this.f79027gxszxtbevo = jyumaefscl.wflxmlrfwp();
        this.f79030nufgyqmvbu = jyumaefscl.wflxmlrfwp();
        this.f79025dxjokdxxww = new ArrayList();
        gxszxtbevo(address.draadjrbmk(), address.lqeggnwhkg());
    }

    private final void eablkybsjg(Proxy proxy) throws SocketException, UnknownHostException {
        String strDxjokdxxww;
        int iRgvfuqvkyq;
        List listIobyxmoadg;
        ArrayList arrayList = new ArrayList();
        this.f79030nufgyqmvbu = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strDxjokdxxww = this.f79028iobyxmoadg.draadjrbmk().dxjokdxxww();
            iRgvfuqvkyq = this.f79028iobyxmoadg.draadjrbmk().rgvfuqvkyq();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
            iobyxmoadg iobyxmoadgVar = f79024btonecajqb;
            zdlpuopuiu.dxjokdxxww(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strDxjokdxxww = iobyxmoadgVar.iobyxmoadg(inetSocketAddress);
            iRgvfuqvkyq = inetSocketAddress.getPort();
        }
        if (1 > iRgvfuqvkyq || iRgvfuqvkyq >= 65536) {
            throw new SocketException("No route to " + strDxjokdxxww + ':' + iRgvfuqvkyq + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strDxjokdxxww, iRgvfuqvkyq));
            return;
        }
        if (mk.gxszxtbevo.iobyxmoadg(strDxjokdxxww)) {
            listIobyxmoadg = jyumaefscl.eablkybsjg(InetAddress.getByName(strDxjokdxxww));
        } else {
            this.f79026eablkybsjg.wflxmlrfwp(this.f79031ppxfxbqfkf, strDxjokdxxww);
            listIobyxmoadg = this.f79028iobyxmoadg.ppxfxbqfkf().iobyxmoadg(strDxjokdxxww);
            if (listIobyxmoadg.isEmpty()) {
                throw new UnknownHostException(this.f79028iobyxmoadg.ppxfxbqfkf() + " returned no addresses for " + strDxjokdxxww);
            }
            this.f79026eablkybsjg.draadjrbmk(this.f79031ppxfxbqfkf, strDxjokdxxww, listIobyxmoadg);
        }
        if (this.f79032wkgbmnqykc) {
            listIobyxmoadg = lqeggnwhkg.iobyxmoadg(listIobyxmoadg);
        }
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iRgvfuqvkyq));
        }
    }

    private final void gxszxtbevo(lk.jyumaefscl jyumaefsclVar, Proxy proxy) {
        this.f79026eablkybsjg.ojitshcjhn(this.f79031ppxfxbqfkf, jyumaefsclVar);
        List listLqeggnwhkg = lqeggnwhkg(proxy, jyumaefsclVar, this);
        this.f79027gxszxtbevo = listLqeggnwhkg;
        this.f79029lqeggnwhkg = 0;
        this.f79026eablkybsjg.agtfadlqog(this.f79031ppxfxbqfkf, jyumaefsclVar, listLqeggnwhkg);
    }

    private static final List lqeggnwhkg(Proxy proxy, lk.jyumaefscl jyumaefsclVar, ojitshcjhn ojitshcjhnVar) {
        if (proxy != null) {
            return jyumaefscl.eablkybsjg(proxy);
        }
        URI uriYggfygwlhe = jyumaefsclVar.yggfygwlhe();
        if (uriYggfygwlhe.getHost() == null) {
            return mk.rgvfuqvkyq.gtknphoqwx(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = ojitshcjhnVar.f79028iobyxmoadg.dxjokdxxww().select(uriYggfygwlhe);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return mk.rgvfuqvkyq.gtknphoqwx(Proxy.NO_PROXY);
        }
        zdlpuopuiu.dxjokdxxww(proxiesOrNull, "proxiesOrNull");
        return mk.rgvfuqvkyq.yggfygwlhe(proxiesOrNull);
    }

    private final Proxy wkgbmnqykc() throws SocketException, UnknownHostException {
        if (zoijcleaow()) {
            List list = this.f79027gxszxtbevo;
            int i13 = this.f79029lqeggnwhkg;
            this.f79029lqeggnwhkg = i13 + 1;
            Proxy proxy = (Proxy) list.get(i13);
            eablkybsjg(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f79028iobyxmoadg.draadjrbmk().dxjokdxxww() + "; exhausted proxy configurations: " + this.f79027gxszxtbevo);
    }

    private final boolean zoijcleaow() {
        return this.f79029lqeggnwhkg < this.f79027gxszxtbevo.size();
    }

    public final boolean iobyxmoadg() {
        return zoijcleaow() || !this.f79025dxjokdxxww.isEmpty();
    }

    public final zoijcleaow ppxfxbqfkf() {
        if (!iobyxmoadg()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (zoijcleaow()) {
            Proxy proxyWkgbmnqykc = wkgbmnqykc();
            Iterator it = this.f79030nufgyqmvbu.iterator();
            while (it.hasNext()) {
                iozdgvuglv iozdgvuglvVar = new iozdgvuglv(this.f79028iobyxmoadg, proxyWkgbmnqykc, (InetSocketAddress) it.next());
                if (this.f79033zoijcleaow.ppxfxbqfkf(iozdgvuglvVar)) {
                    this.f79025dxjokdxxww.add(iozdgvuglvVar);
                } else {
                    arrayList.add(iozdgvuglvVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            jyumaefscl.istkbnxepw(arrayList, this.f79025dxjokdxxww);
            this.f79025dxjokdxxww.clear();
        }
        return new zoijcleaow(arrayList);
    }
}
