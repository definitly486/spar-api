package qk;

import bl.ylkuphrtab;
import gg.wwaezpbzkn;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.jyumaefscl;
import lk.cdpycssgdh;
import lk.iozdgvuglv;
import lk.lereixgezr;
import lk.oxmwwwfdhm;
import lk.pmvmpeiblj;
import lk.zdlpuopuiu;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements agtfadlqog.zoijcleaow, rk.wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    public static final iobyxmoadg f79055kcexrzcfyt = new iobyxmoadg(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private zdlpuopuiu f79056agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final oxmwwwfdhm f79057btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Socket f79058draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f79059dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f79060eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private volatile boolean f79061gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f79062gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f79063iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zynmafqrjb f79064lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f79065nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private pmvmpeiblj f79066ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private dxjokdxxww f79067oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f79068ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private bl.eablkybsjg f79069rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private bl.wkgbmnqykc f79070vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Socket f79071wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iozdgvuglv f79072wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f79073zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ zdlpuopuiu f79074zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar) {
            super(0);
            this.f79074zdlpuopuiu = zdlpuopuiuVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listWkgbmnqykc = this.f79074zdlpuopuiu.wkgbmnqykc();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listWkgbmnqykc, 10));
            for (Certificate certificate : listWkgbmnqykc) {
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lk.iobyxmoadg f79075jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zdlpuopuiu f79076yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lk.lqeggnwhkg f79077zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(lk.lqeggnwhkg lqeggnwhkgVar, zdlpuopuiu zdlpuopuiuVar, lk.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f79077zdlpuopuiu = lqeggnwhkgVar;
            this.f79076yggfygwlhe = zdlpuopuiuVar;
            this.f79075jyumaefscl = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            yk.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = this.f79077zdlpuopuiu.wkgbmnqykc();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ppxfxbqfkfVarWkgbmnqykc);
            return ppxfxbqfkfVarWkgbmnqykc.iobyxmoadg(this.f79076yggfygwlhe.wkgbmnqykc(), this.f79075jyumaefscl.draadjrbmk().dxjokdxxww());
        }
    }

    /* JADX INFO: renamed from: qk.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public /* synthetic */ class C1768zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f79078iobyxmoadg;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f79078iobyxmoadg = iArr;
        }
    }

    public zoijcleaow(lereixgezr client, nufgyqmvbu call, gtknphoqwx routePlanner, iozdgvuglv route, List list, int i13, zynmafqrjb zynmafqrjbVar, int i14, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(client, "client");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(routePlanner, "routePlanner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(route, "route");
        this.f79063iobyxmoadg = client;
        this.f79073zoijcleaow = call;
        this.f79068ppxfxbqfkf = routePlanner;
        this.f79072wkgbmnqykc = route;
        this.f79060eablkybsjg = list;
        this.f79062gxszxtbevo = i13;
        this.f79064lqeggnwhkg = zynmafqrjbVar;
        this.f79065nufgyqmvbu = i14;
        this.f79059dxjokdxxww = z13;
        this.f79057btonecajqb = call.agtfadlqog();
    }

    static /* synthetic */ zoijcleaow agtfadlqog(zoijcleaow zoijcleaowVar, int i13, zynmafqrjb zynmafqrjbVar, int i14, boolean z13, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = zoijcleaowVar.f79062gxszxtbevo;
        }
        if ((i15 & 2) != 0) {
            zynmafqrjbVar = zoijcleaowVar.f79064lqeggnwhkg;
        }
        if ((i15 & 4) != 0) {
            i14 = zoijcleaowVar.f79065nufgyqmvbu;
        }
        if ((i15 & 8) != 0) {
            z13 = zoijcleaowVar.f79059dxjokdxxww;
        }
        return zoijcleaowVar.wflxmlrfwp(i13, zynmafqrjbVar, i14, z13);
    }

    private final void btonecajqb() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = gxszxtbevo().zoijcleaow().type();
        int i13 = type == null ? -1 : C1768zoijcleaow.f79078iobyxmoadg[type.ordinal()];
        if (i13 == 1 || i13 == 2) {
            socketCreateSocket = gxszxtbevo().iobyxmoadg().btonecajqb().createSocket();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(gxszxtbevo().zoijcleaow());
        }
        this.f79058draadjrbmk = socketCreateSocket;
        if (this.f79061gtknphoqwx) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f79063iobyxmoadg.iozdgvuglv());
        try {
            uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().gxszxtbevo(socketCreateSocket, gxszxtbevo().wkgbmnqykc(), this.f79063iobyxmoadg.btonecajqb());
            try {
                this.f79069rgvfuqvkyq = bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.gtknphoqwx(socketCreateSocket));
                this.f79070vdvldrhtss = bl.zdlpuopuiu.zoijcleaow(bl.zdlpuopuiu.lqeggnwhkg(socketCreateSocket));
            } catch (NullPointerException e13) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(e13.getMessage(), "throw with null exception")) {
                    throw new IOException(e13);
                }
            }
        } catch (ConnectException e14) {
            ConnectException connectException = new ConnectException("Failed to connect to " + gxszxtbevo().wkgbmnqykc());
            connectException.initCause(e14);
            throw connectException;
        }
    }

    private final void gtknphoqwx(SSLSocket sSLSocket, lk.draadjrbmk draadjrbmkVar) {
        lk.iobyxmoadg iobyxmoadgVarIobyxmoadg = gxszxtbevo().iobyxmoadg();
        try {
            if (draadjrbmkVar.nufgyqmvbu()) {
                uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().eablkybsjg(sSLSocket, iobyxmoadgVarIobyxmoadg.draadjrbmk().dxjokdxxww(), iobyxmoadgVarIobyxmoadg.gxszxtbevo());
            }
            sSLSocket.startHandshake();
            SSLSession sslSocketSession = sSLSocket.getSession();
            zdlpuopuiu.iobyxmoadg iobyxmoadgVar = zdlpuopuiu.f63247eablkybsjg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sslSocketSession, "sslSocketSession");
            zdlpuopuiu zdlpuopuiuVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(sslSocketSession);
            HostnameVerifier hostnameVerifierEablkybsjg = iobyxmoadgVarIobyxmoadg.eablkybsjg();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(hostnameVerifierEablkybsjg);
            if (hostnameVerifierEablkybsjg.verify(iobyxmoadgVarIobyxmoadg.draadjrbmk().dxjokdxxww(), sslSocketSession)) {
                lk.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVarIobyxmoadg);
                zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(zdlpuopuiuVarIobyxmoadg.eablkybsjg(), zdlpuopuiuVarIobyxmoadg.iobyxmoadg(), zdlpuopuiuVarIobyxmoadg.ppxfxbqfkf(), new wkgbmnqykc(lqeggnwhkgVarIobyxmoadg, zdlpuopuiuVarIobyxmoadg, iobyxmoadgVarIobyxmoadg));
                this.f79056agtfadlqog = zdlpuopuiuVar;
                lqeggnwhkgVarIobyxmoadg.zoijcleaow(iobyxmoadgVarIobyxmoadg.draadjrbmk().dxjokdxxww(), new ppxfxbqfkf(zdlpuopuiuVar));
                String strLqeggnwhkg = draadjrbmkVar.nufgyqmvbu() ? uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().lqeggnwhkg(sSLSocket) : null;
                this.f79071wflxmlrfwp = sSLSocket;
                this.f79069rgvfuqvkyq = bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.gtknphoqwx(sSLSocket));
                this.f79070vdvldrhtss = bl.zdlpuopuiu.zoijcleaow(bl.zdlpuopuiu.lqeggnwhkg(sSLSocket));
                this.f79066ojitshcjhn = strLqeggnwhkg != null ? pmvmpeiblj.f63187yggfygwlhe.iobyxmoadg(strLqeggnwhkg) : pmvmpeiblj.HTTP_1_1;
                uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().zoijcleaow(sSLSocket);
                return;
            }
            List listWkgbmnqykc = zdlpuopuiuVarIobyxmoadg.wkgbmnqykc();
            if (listWkgbmnqykc.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + iobyxmoadgVarIobyxmoadg.draadjrbmk().dxjokdxxww() + " not verified (no certificates)");
            }
            Object obj = listWkgbmnqykc.get(0);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(kcexrzcfyt.draadjrbmk("\n            |Hostname " + iobyxmoadgVarIobyxmoadg.draadjrbmk().dxjokdxxww() + " not verified:\n            |    certificate: " + lk.lqeggnwhkg.f63167ppxfxbqfkf.iobyxmoadg(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + yk.wkgbmnqykc.f125538iobyxmoadg.iobyxmoadg(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th2) {
            uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().zoijcleaow(sSLSocket);
            mk.rgvfuqvkyq.lqeggnwhkg(sSLSocket);
            throw th2;
        }
    }

    private final zynmafqrjb ojitshcjhn() throws IOException {
        zynmafqrjb zynmafqrjbVar = this.f79064lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(zynmafqrjbVar);
        String str = "CONNECT " + mk.rgvfuqvkyq.kcexrzcfyt(gxszxtbevo().iobyxmoadg().draadjrbmk(), true) + " HTTP/1.1";
        while (true) {
            bl.eablkybsjg eablkybsjgVar = this.f79069rgvfuqvkyq;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(eablkybsjgVar);
            bl.wkgbmnqykc wkgbmnqykcVar = this.f79070vdvldrhtss;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            sk.zoijcleaow zoijcleaowVar = new sk.zoijcleaow(null, this, eablkybsjgVar, wkgbmnqykcVar);
            ylkuphrtab ylkuphrtabVarPpxfxbqfkf = eablkybsjgVar.ppxfxbqfkf();
            long jIozdgvuglv = this.f79063iobyxmoadg.iozdgvuglv();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ylkuphrtabVarPpxfxbqfkf.lqeggnwhkg(jIozdgvuglv, timeUnit);
            wkgbmnqykcVar.ppxfxbqfkf().lqeggnwhkg(this.f79063iobyxmoadg.hcddaimhww(), timeUnit);
            zoijcleaowVar.zynmafqrjb(zynmafqrjbVar.eablkybsjg(), str);
            zoijcleaowVar.iobyxmoadg();
            cdpycssgdh.iobyxmoadg iobyxmoadgVarGxszxtbevo = zoijcleaowVar.gxszxtbevo(false);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarGxszxtbevo);
            cdpycssgdh cdpycssgdhVarPpxfxbqfkf = iobyxmoadgVarGxszxtbevo.vdvldrhtss(zynmafqrjbVar).ppxfxbqfkf();
            zoijcleaowVar.pmvmpeiblj(cdpycssgdhVarPpxfxbqfkf);
            int iBtonecajqb = cdpycssgdhVarPpxfxbqfkf.btonecajqb();
            if (iBtonecajqb == 200) {
                return null;
            }
            if (iBtonecajqb != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + cdpycssgdhVarPpxfxbqfkf.btonecajqb());
            }
            zynmafqrjb zynmafqrjbVarIobyxmoadg = gxszxtbevo().iobyxmoadg().nufgyqmvbu().iobyxmoadg(gxszxtbevo(), cdpycssgdhVarPpxfxbqfkf);
            if (zynmafqrjbVarIobyxmoadg == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (kcexrzcfyt.istkbnxepw("close", cdpycssgdh.vdvldrhtss(cdpycssgdhVarPpxfxbqfkf, "Connection", null, 2, null), true)) {
                return zynmafqrjbVarIobyxmoadg;
            }
            zynmafqrjbVar = zynmafqrjbVarIobyxmoadg;
        }
    }

    private final zoijcleaow wflxmlrfwp(int i13, zynmafqrjb zynmafqrjbVar, int i14, boolean z13) {
        return new zoijcleaow(this.f79063iobyxmoadg, this.f79073zoijcleaow, this.f79068ppxfxbqfkf, gxszxtbevo(), this.f79060eablkybsjg, i13, zynmafqrjbVar, i14, z13);
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public void cancel() {
        this.f79061gtknphoqwx = true;
        Socket socket = this.f79058draadjrbmk;
        if (socket != null) {
            mk.rgvfuqvkyq.lqeggnwhkg(socket);
        }
    }

    public final agtfadlqog.iobyxmoadg draadjrbmk() throws IOException {
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        if (zynmafqrjbVarOjitshcjhn == null) {
            return new agtfadlqog.iobyxmoadg(this, null, null, 6, null);
        }
        Socket socket = this.f79058draadjrbmk;
        if (socket != null) {
            mk.rgvfuqvkyq.lqeggnwhkg(socket);
        }
        int i13 = this.f79062gxszxtbevo + 1;
        if (i13 < 21) {
            this.f79057btonecajqb.lqeggnwhkg(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow(), null);
            return new agtfadlqog.iobyxmoadg(this, agtfadlqog(this, i13, zynmafqrjbVarOjitshcjhn, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f79057btonecajqb.nufgyqmvbu(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow(), null, protocolException);
        return new agtfadlqog.iobyxmoadg(this, null, protocolException, 2, null);
    }

    public final void dxjokdxxww() {
        Socket socket = this.f79071wflxmlrfwp;
        if (socket != null) {
            mk.rgvfuqvkyq.lqeggnwhkg(socket);
        }
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public void eablkybsjg(nufgyqmvbu call, IOException iOException) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public iozdgvuglv gxszxtbevo() {
        return this.f79072wkgbmnqykc;
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public dxjokdxxww iobyxmoadg() {
        this.f79073zoijcleaow.draadjrbmk().zdlpuopuiu().iobyxmoadg(gxszxtbevo());
        draadjrbmk draadjrbmkVarWflxmlrfwp = this.f79068ppxfxbqfkf.wflxmlrfwp(this, this.f79060eablkybsjg);
        if (draadjrbmkVarWflxmlrfwp != null) {
            return draadjrbmkVarWflxmlrfwp.dxjokdxxww();
        }
        dxjokdxxww dxjokdxxwwVar = this.f79067oxmwwwfdhm;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(dxjokdxxwwVar);
        synchronized (dxjokdxxwwVar) {
            this.f79063iobyxmoadg.gtknphoqwx().iobyxmoadg().eablkybsjg(dxjokdxxwwVar);
            this.f79073zoijcleaow.ppxfxbqfkf(dxjokdxxwwVar);
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        this.f79057btonecajqb.btonecajqb(this.f79073zoijcleaow, dxjokdxxwwVar);
        return dxjokdxxwwVar;
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public agtfadlqog.zoijcleaow lqeggnwhkg() {
        return new zoijcleaow(this.f79063iobyxmoadg, this.f79073zoijcleaow, this.f79068ppxfxbqfkf, gxszxtbevo(), this.f79060eablkybsjg, this.f79062gxszxtbevo, this.f79064lqeggnwhkg, this.f79065nufgyqmvbu, this.f79059dxjokdxxww);
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public agtfadlqog.iobyxmoadg nufgyqmvbu() {
        Socket socket;
        Socket socket2;
        if (this.f79058draadjrbmk != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.f79073zoijcleaow.oxmwwwfdhm().add(this);
        boolean z13 = false;
        try {
            try {
                this.f79057btonecajqb.dxjokdxxww(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow());
                btonecajqb();
                z13 = true;
                agtfadlqog.iobyxmoadg iobyxmoadgVar = new agtfadlqog.iobyxmoadg(this, null, null, 6, null);
                this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                return iobyxmoadgVar;
            } catch (IOException e13) {
                this.f79057btonecajqb.nufgyqmvbu(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow(), null, e13);
                agtfadlqog.iobyxmoadg iobyxmoadgVar2 = new agtfadlqog.iobyxmoadg(this, null, e13, 2, null);
                this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                if (!z13 && (socket2 = this.f79058draadjrbmk) != null) {
                    mk.rgvfuqvkyq.lqeggnwhkg(socket2);
                }
                return iobyxmoadgVar2;
            }
        } catch (Throwable th2) {
            this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
            if (!z13 && (socket = this.f79058draadjrbmk) != null) {
                mk.rgvfuqvkyq.lqeggnwhkg(socket);
            }
            throw th2;
        }
    }

    public final zoijcleaow oxmwwwfdhm(List connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        if (this.f79065nufgyqmvbu != -1) {
            return this;
        }
        zoijcleaow zoijcleaowVarVdvldrhtss = vdvldrhtss(connectionSpecs, sslSocket);
        if (zoijcleaowVarVdvldrhtss != null) {
            return zoijcleaowVarVdvldrhtss;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unable to find acceptable protocols. isFallback=");
        sb3.append(this.f79059dxjokdxxww);
        sb3.append(", modes=");
        sb3.append(connectionSpecs);
        sb3.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(this)");
        sb3.append(string);
        throw new UnknownServiceException(sb3.toString());
    }

    @Override // qk.agtfadlqog.zoijcleaow
    public boolean ppxfxbqfkf() {
        return this.f79066ojitshcjhn != null;
    }

    public final List rgvfuqvkyq() {
        return this.f79060eablkybsjg;
    }

    public final zoijcleaow vdvldrhtss(List connectionSpecs, SSLSocket sslSocket) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sslSocket, "sslSocket");
        int i13 = this.f79065nufgyqmvbu + 1;
        int size = connectionSpecs.size();
        for (int i14 = i13; i14 < size; i14++) {
            if (((lk.draadjrbmk) connectionSpecs.get(i14)).eablkybsjg(sslSocket)) {
                return agtfadlqog(this, 0, null, i14, this.f79065nufgyqmvbu != -1, 3, null);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca  */
    @Override // qk.agtfadlqog.zoijcleaow
    public agtfadlqog.iobyxmoadg wkgbmnqykc() throws Throwable {
        zoijcleaow zoijcleaowVarVdvldrhtss;
        Socket socket;
        Socket socket2;
        zoijcleaow zoijcleaowVar;
        bl.wkgbmnqykc wkgbmnqykcVar;
        bl.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow;
        bl.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow2;
        if (this.f79058draadjrbmk == null) {
            throw new IllegalStateException("TCP not connected");
        }
        if (ppxfxbqfkf()) {
            throw new IllegalStateException("already connected");
        }
        List listZoijcleaow = gxszxtbevo().iobyxmoadg().zoijcleaow();
        this.f79073zoijcleaow.oxmwwwfdhm().add(this);
        zoijcleaow zoijcleaowVar2 = null;
        boolean z13 = false;
        try {
            try {
                if (this.f79064lqeggnwhkg != null) {
                    agtfadlqog.iobyxmoadg iobyxmoadgVarDraadjrbmk = draadjrbmk();
                    if (iobyxmoadgVarDraadjrbmk.ppxfxbqfkf() != null || iobyxmoadgVarDraadjrbmk.eablkybsjg() != null) {
                        this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                        Socket socket3 = this.f79071wflxmlrfwp;
                        if (socket3 != null) {
                            mk.rgvfuqvkyq.lqeggnwhkg(socket3);
                        }
                        Socket socket4 = this.f79058draadjrbmk;
                        if (socket4 != null) {
                            mk.rgvfuqvkyq.lqeggnwhkg(socket4);
                        }
                        return iobyxmoadgVarDraadjrbmk;
                    }
                }
                if (gxszxtbevo().iobyxmoadg().gtknphoqwx() != null) {
                    bl.eablkybsjg eablkybsjgVar = this.f79069rgvfuqvkyq;
                    if ((eablkybsjgVar != null && (ppxfxbqfkfVarZoijcleaow2 = eablkybsjgVar.zoijcleaow()) != null && !ppxfxbqfkfVarZoijcleaow2.n()) || ((wkgbmnqykcVar = this.f79070vdvldrhtss) != null && (ppxfxbqfkfVarZoijcleaow = wkgbmnqykcVar.zoijcleaow()) != null && !ppxfxbqfkfVarZoijcleaow.n())) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    this.f79057btonecajqb.zynmafqrjb(this.f79073zoijcleaow);
                    Socket socketCreateSocket = gxszxtbevo().iobyxmoadg().gtknphoqwx().createSocket(this.f79058draadjrbmk, gxszxtbevo().iobyxmoadg().draadjrbmk().dxjokdxxww(), gxszxtbevo().iobyxmoadg().draadjrbmk().rgvfuqvkyq(), true);
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                    SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                    zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm(listZoijcleaow, sSLSocket);
                    lk.draadjrbmk draadjrbmkVar = (lk.draadjrbmk) listZoijcleaow.get(zoijcleaowVarOxmwwwfdhm.f79065nufgyqmvbu);
                    zoijcleaowVarVdvldrhtss = zoijcleaowVarOxmwwwfdhm.vdvldrhtss(listZoijcleaow, sSLSocket);
                    try {
                        draadjrbmkVar.zoijcleaow(sSLSocket, zoijcleaowVarOxmwwwfdhm.f79059dxjokdxxww);
                        gtknphoqwx(sSLSocket, draadjrbmkVar);
                        this.f79057btonecajqb.pmvmpeiblj(this.f79073zoijcleaow, this.f79056agtfadlqog);
                        zoijcleaowVar = zoijcleaowVarVdvldrhtss;
                    } catch (IOException e13) {
                        e = e13;
                        this.f79057btonecajqb.nufgyqmvbu(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow(), null, e);
                        if (this.f79063iobyxmoadg.lmojexxdyd() && vdvldrhtss.iobyxmoadg(e)) {
                            zoijcleaowVar2 = zoijcleaowVarVdvldrhtss;
                        }
                        agtfadlqog.iobyxmoadg iobyxmoadgVar = new agtfadlqog.iobyxmoadg(this, zoijcleaowVar2, e);
                        this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                        if (!z13) {
                            socket = this.f79071wflxmlrfwp;
                            if (socket != null) {
                                mk.rgvfuqvkyq.lqeggnwhkg(socket);
                            }
                            socket2 = this.f79058draadjrbmk;
                            if (socket2 != null) {
                                mk.rgvfuqvkyq.lqeggnwhkg(socket2);
                            }
                        }
                        return iobyxmoadgVar;
                    }
                } else {
                    this.f79071wflxmlrfwp = this.f79058draadjrbmk;
                    List listGxszxtbevo = gxszxtbevo().iobyxmoadg().gxszxtbevo();
                    pmvmpeiblj pmvmpeibljVar = pmvmpeiblj.H2_PRIOR_KNOWLEDGE;
                    if (!listGxszxtbevo.contains(pmvmpeibljVar)) {
                        pmvmpeibljVar = pmvmpeiblj.HTTP_1_1;
                    }
                    this.f79066ojitshcjhn = pmvmpeibljVar;
                    zoijcleaowVar = null;
                }
                try {
                    dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this.f79063iobyxmoadg.yggfygwlhe(), this.f79063iobyxmoadg.gtknphoqwx().iobyxmoadg(), gxszxtbevo(), this.f79058draadjrbmk, this.f79071wflxmlrfwp, this.f79056agtfadlqog, this.f79066ojitshcjhn, this.f79069rgvfuqvkyq, this.f79070vdvldrhtss, this.f79063iobyxmoadg.pmvmpeiblj());
                    this.f79067oxmwwwfdhm = dxjokdxxwwVar;
                    dxjokdxxwwVar.esjtqupxsv();
                    this.f79057btonecajqb.lqeggnwhkg(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow(), this.f79066ojitshcjhn);
                    try {
                        agtfadlqog.iobyxmoadg iobyxmoadgVar2 = new agtfadlqog.iobyxmoadg(this, null, null, 6, null);
                        this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                        return iobyxmoadgVar2;
                    } catch (IOException e14) {
                        e = e14;
                        z13 = true;
                        zoijcleaowVarVdvldrhtss = zoijcleaowVar;
                        this.f79057btonecajqb.nufgyqmvbu(this.f79073zoijcleaow, gxszxtbevo().wkgbmnqykc(), gxszxtbevo().zoijcleaow(), null, e);
                        if (this.f79063iobyxmoadg.lmojexxdyd()) {
                            zoijcleaowVar2 = zoijcleaowVarVdvldrhtss;
                        }
                        agtfadlqog.iobyxmoadg iobyxmoadgVar3 = new agtfadlqog.iobyxmoadg(this, zoijcleaowVar2, e);
                        this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                        if (!z13) {
                            socket = this.f79071wflxmlrfwp;
                            if (socket != null) {
                                mk.rgvfuqvkyq.lqeggnwhkg(socket);
                            }
                            socket2 = this.f79058draadjrbmk;
                            if (socket2 != null) {
                                mk.rgvfuqvkyq.lqeggnwhkg(socket2);
                            }
                        }
                        return iobyxmoadgVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        z13 = true;
                        this.f79073zoijcleaow.oxmwwwfdhm().remove(this);
                        if (!z13) {
                            Socket socket5 = this.f79071wflxmlrfwp;
                            if (socket5 != null) {
                                mk.rgvfuqvkyq.lqeggnwhkg(socket5);
                            }
                            Socket socket6 = this.f79058draadjrbmk;
                            if (socket6 != null) {
                                mk.rgvfuqvkyq.lqeggnwhkg(socket6);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e15) {
                    e = e15;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e16) {
            e = e16;
            zoijcleaowVarVdvldrhtss = null;
        }
    }

    @Override // rk.wkgbmnqykc.iobyxmoadg
    public void zoijcleaow() {
    }
}
