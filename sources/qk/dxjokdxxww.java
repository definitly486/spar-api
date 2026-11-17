package qk;

import bl.ylkuphrtab;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import lk.iozdgvuglv;
import lk.jyumaefscl;
import lk.lereixgezr;
import lk.pmvmpeiblj;
import lk.zdlpuopuiu;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww extends tk.eablkybsjg.wkgbmnqykc implements lk.btonecajqb, rk.wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f78962jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f78963agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private bl.eablkybsjg f78964btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f78965draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private pmvmpeiblj f78966dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iozdgvuglv f78967eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private bl.wkgbmnqykc f78968gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Socket f78969gxszxtbevo;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f78970kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Socket f78971lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private zdlpuopuiu f78972nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f78973ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f78974oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pk.wkgbmnqykc f78975ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f78976rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f78977vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private tk.eablkybsjg f78978wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f78979wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f78980yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f78981zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public dxjokdxxww(pk.wkgbmnqykc taskRunner, btonecajqb connectionPool, iozdgvuglv route, Socket socket, Socket socket2, zdlpuopuiu zdlpuopuiuVar, pmvmpeiblj pmvmpeibljVar, bl.eablkybsjg eablkybsjgVar, bl.wkgbmnqykc wkgbmnqykcVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectionPool, "connectionPool");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(route, "route");
        this.f78975ppxfxbqfkf = taskRunner;
        this.f78979wkgbmnqykc = connectionPool;
        this.f78967eablkybsjg = route;
        this.f78969gxszxtbevo = socket;
        this.f78971lqeggnwhkg = socket2;
        this.f78972nufgyqmvbu = zdlpuopuiuVar;
        this.f78966dxjokdxxww = pmvmpeibljVar;
        this.f78964btonecajqb = eablkybsjgVar;
        this.f78968gtknphoqwx = wkgbmnqykcVar;
        this.f78965draadjrbmk = i13;
        this.f78970kcexrzcfyt = 1;
        this.f78981zdlpuopuiu = new ArrayList();
        this.f78980yggfygwlhe = Long.MAX_VALUE;
    }

    private final void lereixgezr() throws SocketException {
        Socket socket = this.f78971lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(socket);
        bl.eablkybsjg eablkybsjgVar = this.f78964btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVar);
        bl.wkgbmnqykc wkgbmnqykcVar = this.f78968gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
        socket.setSoTimeout(0);
        tk.eablkybsjg eablkybsjgVarIobyxmoadg = new tk.eablkybsjg.zoijcleaow(true, this.f78975ppxfxbqfkf).vdvldrhtss(socket, gxszxtbevo().iobyxmoadg().draadjrbmk().dxjokdxxww(), eablkybsjgVar, wkgbmnqykcVar).gtknphoqwx(this).draadjrbmk(this.f78965draadjrbmk).iobyxmoadg();
        this.f78978wflxmlrfwp = eablkybsjgVarIobyxmoadg;
        this.f78970kcexrzcfyt = tk.eablkybsjg.f110769ulzqkzuiru.iobyxmoadg().wkgbmnqykc();
        tk.eablkybsjg.ageimvtcrz(eablkybsjgVarIobyxmoadg, false, 1, null);
    }

    private final boolean lqeggnwhkg(jyumaefscl jyumaefsclVar, zdlpuopuiu zdlpuopuiuVar) {
        List listWkgbmnqykc = zdlpuopuiuVar.wkgbmnqykc();
        if (listWkgbmnqykc.isEmpty()) {
            return false;
        }
        yk.wkgbmnqykc wkgbmnqykcVar = yk.wkgbmnqykc.f125538iobyxmoadg;
        String strDxjokdxxww = jyumaefsclVar.dxjokdxxww();
        Object obj = listWkgbmnqykc.get(0);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        return wkgbmnqykcVar.eablkybsjg(strDxjokdxxww, (X509Certificate) obj);
    }

    private final boolean pmvmpeiblj(jyumaefscl jyumaefsclVar) {
        zdlpuopuiu zdlpuopuiuVar;
        if (mk.rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        jyumaefscl jyumaefsclVarDraadjrbmk = gxszxtbevo().iobyxmoadg().draadjrbmk();
        if (jyumaefsclVar.rgvfuqvkyq() != jyumaefsclVarDraadjrbmk.rgvfuqvkyq()) {
            return false;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jyumaefsclVar.dxjokdxxww(), jyumaefsclVarDraadjrbmk.dxjokdxxww())) {
            return true;
        }
        if (this.f78973ojitshcjhn || (zdlpuopuiuVar = this.f78972nufgyqmvbu) == null) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zdlpuopuiuVar);
        return lqeggnwhkg(jyumaefsclVar, zdlpuopuiuVar);
    }

    private final boolean yggfygwlhe(List list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) it.next();
            Proxy.Type type = iozdgvuglvVar.zoijcleaow().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && gxszxtbevo().zoijcleaow().type() == type2 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevo().wkgbmnqykc(), iozdgvuglvVar.wkgbmnqykc())) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void agtfadlqog() {
        this.f78977vdvldrhtss++;
    }

    public final long btonecajqb() {
        return this.f78980yggfygwlhe;
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public void cancel() {
        Socket socket = this.f78969gxszxtbevo;
        if (socket != null) {
            mk.rgvfuqvkyq.lqeggnwhkg(socket);
        }
    }

    public Socket cqumvgiudr() {
        Socket socket = this.f78971lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(socket);
        return socket;
    }

    public final int draadjrbmk() {
        return this.f78976rgvfuqvkyq;
    }

    public final List dxjokdxxww() {
        return this.f78981zdlpuopuiu;
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public synchronized void eablkybsjg(nufgyqmvbu call, IOException iOException) {
        try {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == tk.iobyxmoadg.REFUSED_STREAM) {
                    int i13 = this.f78974oxmwwwfdhm + 1;
                    this.f78974oxmwwwfdhm = i13;
                    if (i13 > 1) {
                        this.f78963agtfadlqog = true;
                        this.f78976rgvfuqvkyq++;
                    }
                } else if (((StreamResetException) iOException).errorCode != tk.iobyxmoadg.CANCEL || !call.btonecajqb()) {
                    this.f78963agtfadlqog = true;
                    this.f78976rgvfuqvkyq++;
                }
            } else if (!vdvldrhtss() || (iOException instanceof ConnectionShutdownException)) {
                this.f78963agtfadlqog = true;
                if (this.f78977vdvldrhtss == 0) {
                    if (iOException != null) {
                        nufgyqmvbu(call.draadjrbmk(), gxszxtbevo(), iOException);
                    }
                    this.f78976rgvfuqvkyq++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void esjtqupxsv() throws SocketException {
        this.f78980yggfygwlhe = System.nanoTime();
        pmvmpeiblj pmvmpeibljVar = this.f78966dxjokdxxww;
        if (pmvmpeibljVar == pmvmpeiblj.HTTP_2 || pmvmpeibljVar == pmvmpeiblj.H2_PRIOR_KNOWLEDGE) {
            lereixgezr();
        }
    }

    public final boolean gtknphoqwx() {
        return this.f78963agtfadlqog;
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public iozdgvuglv gxszxtbevo() {
        return this.f78967eablkybsjg;
    }

    @Override // lk.btonecajqb
    public pmvmpeiblj iobyxmoadg() {
        pmvmpeiblj pmvmpeibljVar = this.f78966dxjokdxxww;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(pmvmpeibljVar);
        return pmvmpeibljVar;
    }

    public final void iwizpuwonk(boolean z13) {
        this.f78963agtfadlqog = z13;
    }

    public final void jyumaefscl(long j13) {
        this.f78980yggfygwlhe = j13;
    }

    public final synchronized void kcexrzcfyt() {
        this.f78973ojitshcjhn = true;
    }

    public final void nufgyqmvbu(lereixgezr client, iozdgvuglv failedRoute, IOException failure) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(client, "client");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(failedRoute, "failedRoute");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(failure, "failure");
        if (failedRoute.zoijcleaow().type() != Proxy.Type.DIRECT) {
            lk.iobyxmoadg iobyxmoadgVarIobyxmoadg = failedRoute.iobyxmoadg();
            iobyxmoadgVarIobyxmoadg.dxjokdxxww().connectFailed(iobyxmoadgVarIobyxmoadg.draadjrbmk().yggfygwlhe(), failedRoute.zoijcleaow().address(), failure);
        }
        client.zdlpuopuiu().zoijcleaow(failedRoute);
    }

    public final boolean ojitshcjhn(lk.iobyxmoadg address, List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(address, "address");
        if (mk.rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f78981zdlpuopuiu.size() >= this.f78970kcexrzcfyt || this.f78963agtfadlqog || !gxszxtbevo().iobyxmoadg().wkgbmnqykc(address)) {
            return false;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(address.draadjrbmk().dxjokdxxww(), zdlpuopuiu().iobyxmoadg().draadjrbmk().dxjokdxxww())) {
            return true;
        }
        if (this.f78978wflxmlrfwp == null || list == null || !yggfygwlhe(list) || address.eablkybsjg() != yk.wkgbmnqykc.f125538iobyxmoadg || !pmvmpeiblj(address.draadjrbmk())) {
            return false;
        }
        try {
            lk.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = address.iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVarIobyxmoadg);
            String strDxjokdxxww = address.draadjrbmk().dxjokdxxww();
            zdlpuopuiu zdlpuopuiuVarWflxmlrfwp = wflxmlrfwp();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zdlpuopuiuVarWflxmlrfwp);
            lqeggnwhkgVarIobyxmoadg.iobyxmoadg(strDxjokdxxww, zdlpuopuiuVarWflxmlrfwp.wkgbmnqykc());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final rk.wkgbmnqykc oxmwwwfdhm(lereixgezr client, rk.lqeggnwhkg chain) throws SocketException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(client, "client");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chain, "chain");
        Socket socket = this.f78971lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(socket);
        bl.eablkybsjg eablkybsjgVar = this.f78964btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVar);
        bl.wkgbmnqykc wkgbmnqykcVar = this.f78968gtknphoqwx;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
        tk.eablkybsjg eablkybsjgVar2 = this.f78978wflxmlrfwp;
        if (eablkybsjgVar2 != null) {
            return new tk.gxszxtbevo(client, this, chain, eablkybsjgVar2);
        }
        socket.setSoTimeout(chain.agtfadlqog());
        ylkuphrtab ylkuphrtabVarPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
        long jGtknphoqwx = chain.gtknphoqwx();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ylkuphrtabVarPpxfxbqfkf.lqeggnwhkg(jGtknphoqwx, timeUnit);
        wkgbmnqykcVar.ppxfxbqfkf().lqeggnwhkg(chain.wflxmlrfwp(), timeUnit);
        return new sk.zoijcleaow(client, this, eablkybsjgVar, wkgbmnqykcVar);
    }

    @Override // tk.eablkybsjg.wkgbmnqykc
    public synchronized void ppxfxbqfkf(tk.eablkybsjg connection, tk.draadjrbmk settings) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connection, "connection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(settings, "settings");
        this.f78970kcexrzcfyt = settings.wkgbmnqykc();
    }

    public final boolean rgvfuqvkyq(boolean z13) {
        long j13;
        if (mk.rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f78969gxszxtbevo;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(socket);
        Socket socket2 = this.f78971lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(socket2);
        bl.eablkybsjg eablkybsjgVar = this.f78964btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        tk.eablkybsjg eablkybsjgVar2 = this.f78978wflxmlrfwp;
        if (eablkybsjgVar2 != null) {
            return eablkybsjgVar2.xrmfcynszj(jNanoTime);
        }
        synchronized (this) {
            j13 = jNanoTime - this.f78980yggfygwlhe;
        }
        if (j13 < 10000000000L || !z13) {
            return true;
        }
        return mk.rgvfuqvkyq.draadjrbmk(socket2, eablkybsjgVar);
    }

    public String toString() {
        Object objIobyxmoadg;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Connection{");
        sb3.append(gxszxtbevo().iobyxmoadg().draadjrbmk().dxjokdxxww());
        sb3.append(':');
        sb3.append(gxszxtbevo().iobyxmoadg().draadjrbmk().rgvfuqvkyq());
        sb3.append(", proxy=");
        sb3.append(gxszxtbevo().zoijcleaow());
        sb3.append(" hostAddress=");
        sb3.append(gxszxtbevo().wkgbmnqykc());
        sb3.append(" cipherSuite=");
        zdlpuopuiu zdlpuopuiuVar = this.f78972nufgyqmvbu;
        if (zdlpuopuiuVar == null || (objIobyxmoadg = zdlpuopuiuVar.iobyxmoadg()) == null) {
            objIobyxmoadg = DevicePublicKeyStringDef.NONE;
        }
        sb3.append(objIobyxmoadg);
        sb3.append(" protocol=");
        sb3.append(this.f78966dxjokdxxww);
        sb3.append('}');
        return sb3.toString();
    }

    public final boolean vdvldrhtss() {
        return this.f78978wflxmlrfwp != null;
    }

    public zdlpuopuiu wflxmlrfwp() {
        return this.f78972nufgyqmvbu;
    }

    @Override // tk.eablkybsjg.wkgbmnqykc
    public void wkgbmnqykc(tk.nufgyqmvbu stream) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stream, "stream");
        stream.eablkybsjg(tk.iobyxmoadg.REFUSED_STREAM, null);
    }

    public iozdgvuglv zdlpuopuiu() {
        return gxszxtbevo();
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public synchronized void zoijcleaow() {
        this.f78963agtfadlqog = true;
    }
}
