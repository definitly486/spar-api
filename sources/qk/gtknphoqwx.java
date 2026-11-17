package qk;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iozdgvuglv;
import lk.jyumaefscl;
import lk.lereixgezr;
import lk.pmvmpeiblj;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx implements agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ojitshcjhn.zoijcleaow f78984eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private ojitshcjhn f78985gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f78986iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private iozdgvuglv f78987lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final hg.wflxmlrfwp f78988nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu f78989ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f78990wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lk.iobyxmoadg f78991zoijcleaow;

    public gtknphoqwx(lereixgezr client, lk.iobyxmoadg address, nufgyqmvbu call, rk.lqeggnwhkg chain) {
        zdlpuopuiu.btonecajqb(client, "client");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(chain, "chain");
        this.f78986iobyxmoadg = client;
        this.f78991zoijcleaow = address;
        this.f78989ppxfxbqfkf = call;
        this.f78990wkgbmnqykc = !zdlpuopuiu.eablkybsjg(chain.draadjrbmk().lqeggnwhkg(), "GET");
        this.f78988nufgyqmvbu = new hg.wflxmlrfwp();
    }

    public static /* synthetic */ draadjrbmk agtfadlqog(gtknphoqwx gtknphoqwxVar, zoijcleaow zoijcleaowVar, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zoijcleaowVar = null;
        }
        if ((i13 & 2) != 0) {
            list = null;
        }
        return gtknphoqwxVar.wflxmlrfwp(zoijcleaowVar, list);
    }

    private final draadjrbmk draadjrbmk() {
        Socket socketCqumvgiudr;
        dxjokdxxww dxjokdxxwwVarWflxmlrfwp = this.f78989ppxfxbqfkf.wflxmlrfwp();
        if (dxjokdxxwwVarWflxmlrfwp == null) {
            return null;
        }
        boolean zRgvfuqvkyq = dxjokdxxwwVarWflxmlrfwp.rgvfuqvkyq(this.f78990wkgbmnqykc);
        synchronized (dxjokdxxwwVarWflxmlrfwp) {
            try {
                if (zRgvfuqvkyq) {
                    socketCqumvgiudr = (dxjokdxxwwVarWflxmlrfwp.gtknphoqwx() || !eablkybsjg(dxjokdxxwwVarWflxmlrfwp.zdlpuopuiu().iobyxmoadg().draadjrbmk())) ? this.f78989ppxfxbqfkf.cqumvgiudr() : null;
                } else {
                    dxjokdxxwwVarWflxmlrfwp.iwizpuwonk(true);
                    socketCqumvgiudr = this.f78989ppxfxbqfkf.cqumvgiudr();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f78989ppxfxbqfkf.wflxmlrfwp() != null) {
            if (socketCqumvgiudr == null) {
                return new draadjrbmk(dxjokdxxwwVarWflxmlrfwp);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketCqumvgiudr != null) {
            mk.rgvfuqvkyq.lqeggnwhkg(socketCqumvgiudr);
        }
        this.f78989ppxfxbqfkf.agtfadlqog().gtknphoqwx(this.f78989ppxfxbqfkf, dxjokdxxwwVarWflxmlrfwp);
        return null;
    }

    public static /* synthetic */ zoijcleaow gtknphoqwx(gtknphoqwx gtknphoqwxVar, iozdgvuglv iozdgvuglvVar, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            list = null;
        }
        return gtknphoqwxVar.dxjokdxxww(iozdgvuglvVar, list);
    }

    private final zynmafqrjb lqeggnwhkg(iozdgvuglv iozdgvuglvVar) {
        zynmafqrjb zynmafqrjbVarZoijcleaow = new zynmafqrjb.iobyxmoadg().zdlpuopuiu(iozdgvuglvVar.iobyxmoadg().draadjrbmk()).gtknphoqwx("CONNECT", null).dxjokdxxww("Host", mk.rgvfuqvkyq.kcexrzcfyt(iozdgvuglvVar.iobyxmoadg().draadjrbmk(), true)).dxjokdxxww("Proxy-Connection", "Keep-Alive").dxjokdxxww("User-Agent", "okhttp/5.0.0-alpha.11").zoijcleaow();
        zynmafqrjb zynmafqrjbVarIobyxmoadg = iozdgvuglvVar.iobyxmoadg().nufgyqmvbu().iobyxmoadg(iozdgvuglvVar, new cdpycssgdh.iobyxmoadg().vdvldrhtss(zynmafqrjbVarZoijcleaow).ojitshcjhn(pmvmpeiblj.HTTP_1_1).eablkybsjg(407).draadjrbmk("Preemptive Authenticate").oxmwwwfdhm(-1L).rgvfuqvkyq(-1L).dxjokdxxww("Proxy-Authenticate", "OkHttp-Preemptive").ppxfxbqfkf());
        return zynmafqrjbVarIobyxmoadg == null ? zynmafqrjbVarZoijcleaow : zynmafqrjbVarIobyxmoadg;
    }

    private final zoijcleaow nufgyqmvbu() throws IOException {
        iozdgvuglv iozdgvuglvVar = this.f78987lqeggnwhkg;
        if (iozdgvuglvVar != null) {
            this.f78987lqeggnwhkg = null;
            return gtknphoqwx(this, iozdgvuglvVar, null, 2, null);
        }
        ojitshcjhn.zoijcleaow zoijcleaowVar = this.f78984eablkybsjg;
        if (zoijcleaowVar != null && zoijcleaowVar.zoijcleaow()) {
            return gtknphoqwx(this, zoijcleaowVar.ppxfxbqfkf(), null, 2, null);
        }
        ojitshcjhn ojitshcjhnVar = this.f78985gxszxtbevo;
        if (ojitshcjhnVar == null) {
            ojitshcjhnVar = new ojitshcjhn(iobyxmoadg(), this.f78989ppxfxbqfkf.draadjrbmk().zdlpuopuiu(), this.f78989ppxfxbqfkf, this.f78986iobyxmoadg.vdvldrhtss(), this.f78989ppxfxbqfkf.agtfadlqog());
            this.f78985gxszxtbevo = ojitshcjhnVar;
        }
        if (!ojitshcjhnVar.iobyxmoadg()) {
            throw new IOException("exhausted all routes");
        }
        ojitshcjhn.zoijcleaow zoijcleaowVarPpxfxbqfkf = ojitshcjhnVar.ppxfxbqfkf();
        this.f78984eablkybsjg = zoijcleaowVarPpxfxbqfkf;
        if (this.f78989ppxfxbqfkf.btonecajqb()) {
            throw new IOException("Canceled");
        }
        return dxjokdxxww(zoijcleaowVarPpxfxbqfkf.ppxfxbqfkf(), zoijcleaowVarPpxfxbqfkf.iobyxmoadg());
    }

    private final iozdgvuglv ojitshcjhn(dxjokdxxww dxjokdxxwwVar) {
        synchronized (dxjokdxxwwVar) {
            if (dxjokdxxwwVar.draadjrbmk() != 0) {
                return null;
            }
            if (!dxjokdxxwwVar.gtknphoqwx()) {
                return null;
            }
            if (!mk.rgvfuqvkyq.eablkybsjg(dxjokdxxwwVar.zdlpuopuiu().iobyxmoadg().draadjrbmk(), iobyxmoadg().draadjrbmk())) {
                return null;
            }
            return dxjokdxxwwVar.zdlpuopuiu();
        }
    }

    @Override // qk.agtfadlqog
    public boolean btonecajqb() {
        return this.f78989ppxfxbqfkf.btonecajqb();
    }

    public final zoijcleaow dxjokdxxww(iozdgvuglv route, List list) throws UnknownServiceException {
        zdlpuopuiu.btonecajqb(route, "route");
        if (route.iobyxmoadg().gtknphoqwx() == null) {
            if (!route.iobyxmoadg().zoijcleaow().contains(lk.draadjrbmk.f62895gtknphoqwx)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strDxjokdxxww = route.iobyxmoadg().draadjrbmk().dxjokdxxww();
            if (!uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().dxjokdxxww(strDxjokdxxww)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strDxjokdxxww + " not permitted by network security policy");
            }
        } else if (route.iobyxmoadg().gxszxtbevo().contains(pmvmpeiblj.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new zoijcleaow(this.f78986iobyxmoadg, this.f78989ppxfxbqfkf, this, route, list, 0, route.ppxfxbqfkf() ? lqeggnwhkg(route) : null, -1, false);
    }

    @Override // qk.agtfadlqog
    public boolean eablkybsjg(jyumaefscl url) {
        zdlpuopuiu.btonecajqb(url, "url");
        jyumaefscl jyumaefsclVarDraadjrbmk = iobyxmoadg().draadjrbmk();
        return url.rgvfuqvkyq() == jyumaefsclVarDraadjrbmk.rgvfuqvkyq() && zdlpuopuiu.eablkybsjg(url.dxjokdxxww(), jyumaefsclVarDraadjrbmk.dxjokdxxww());
    }

    @Override // qk.agtfadlqog
    public boolean gxszxtbevo(dxjokdxxww dxjokdxxwwVar) {
        ojitshcjhn ojitshcjhnVar;
        iozdgvuglv iozdgvuglvVarOjitshcjhn;
        if (!zoijcleaow().isEmpty() || this.f78987lqeggnwhkg != null) {
            return true;
        }
        if (dxjokdxxwwVar != null && (iozdgvuglvVarOjitshcjhn = ojitshcjhn(dxjokdxxwwVar)) != null) {
            this.f78987lqeggnwhkg = iozdgvuglvVarOjitshcjhn;
            return true;
        }
        ojitshcjhn.zoijcleaow zoijcleaowVar = this.f78984eablkybsjg;
        if ((zoijcleaowVar == null || !zoijcleaowVar.zoijcleaow()) && (ojitshcjhnVar = this.f78985gxszxtbevo) != null) {
            return ojitshcjhnVar.iobyxmoadg();
        }
        return true;
    }

    @Override // qk.agtfadlqog
    public lk.iobyxmoadg iobyxmoadg() {
        return this.f78991zoijcleaow;
    }

    @Override // qk.agtfadlqog
    public agtfadlqog.zoijcleaow ppxfxbqfkf() throws IOException {
        draadjrbmk draadjrbmkVarDraadjrbmk = draadjrbmk();
        if (draadjrbmkVarDraadjrbmk != null) {
            return draadjrbmkVarDraadjrbmk;
        }
        draadjrbmk draadjrbmkVarAgtfadlqog = agtfadlqog(this, null, null, 3, null);
        if (draadjrbmkVarAgtfadlqog != null) {
            return draadjrbmkVarAgtfadlqog;
        }
        if (!zoijcleaow().isEmpty()) {
            return (agtfadlqog.zoijcleaow) zoijcleaow().removeFirst();
        }
        zoijcleaow zoijcleaowVarNufgyqmvbu = nufgyqmvbu();
        draadjrbmk draadjrbmkVarWflxmlrfwp = wflxmlrfwp(zoijcleaowVarNufgyqmvbu, zoijcleaowVarNufgyqmvbu.rgvfuqvkyq());
        return draadjrbmkVarWflxmlrfwp != null ? draadjrbmkVarWflxmlrfwp : zoijcleaowVarNufgyqmvbu;
    }

    public final draadjrbmk wflxmlrfwp(zoijcleaow zoijcleaowVar, List list) {
        dxjokdxxww dxjokdxxwwVarIobyxmoadg = this.f78986iobyxmoadg.gtknphoqwx().iobyxmoadg().iobyxmoadg(this.f78990wkgbmnqykc, iobyxmoadg(), this.f78989ppxfxbqfkf, list, zoijcleaowVar != null && zoijcleaowVar.ppxfxbqfkf());
        if (dxjokdxxwwVarIobyxmoadg == null) {
            return null;
        }
        if (zoijcleaowVar != null) {
            this.f78987lqeggnwhkg = zoijcleaowVar.gxszxtbevo();
            zoijcleaowVar.dxjokdxxww();
        }
        this.f78989ppxfxbqfkf.agtfadlqog().btonecajqb(this.f78989ppxfxbqfkf, dxjokdxxwwVarIobyxmoadg);
        return new draadjrbmk(dxjokdxxwwVarIobyxmoadg);
    }

    @Override // qk.agtfadlqog
    public hg.wflxmlrfwp zoijcleaow() {
        return this.f78988nufgyqmvbu;
    }
}
