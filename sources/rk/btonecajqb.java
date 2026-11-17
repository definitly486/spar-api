package rk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iozdgvuglv;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import lk.jyumaefscl;
import lk.lereixgezr;
import lk.zynmafqrjb;
import mj.rgvfuqvkyq;
import mk.draadjrbmk;
import mk.wflxmlrfwp;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb implements iwizpuwonk {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f82945zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f82946iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public btonecajqb(lereixgezr client) {
        zdlpuopuiu.btonecajqb(client, "client");
        this.f82946iobyxmoadg = client;
    }

    private final boolean eablkybsjg(IOException iOException, zynmafqrjb zynmafqrjbVar) {
        istkbnxepw istkbnxepwVarIobyxmoadg = zynmafqrjbVar.iobyxmoadg();
        return (istkbnxepwVarIobyxmoadg != null && istkbnxepwVarIobyxmoadg.nufgyqmvbu()) || (iOException instanceof FileNotFoundException);
    }

    private final int gxszxtbevo(cdpycssgdh cdpycssgdhVar, int i13) {
        String strVdvldrhtss = cdpycssgdh.vdvldrhtss(cdpycssgdhVar, "Retry-After", null, 2, null);
        if (strVdvldrhtss == null) {
            return i13;
        }
        if (!new rgvfuqvkyq("\\d+").ojitshcjhn(strVdvldrhtss)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strVdvldrhtss);
        zdlpuopuiu.dxjokdxxww(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    private final zynmafqrjb iobyxmoadg(cdpycssgdh cdpycssgdhVar, String str) {
        String strVdvldrhtss;
        jyumaefscl jyumaefsclVarKcexrzcfyt;
        if (!this.f82946iobyxmoadg.oxmwwwfdhm() || (strVdvldrhtss = cdpycssgdh.vdvldrhtss(cdpycssgdhVar, "Location", null, 2, null)) == null || (jyumaefsclVarKcexrzcfyt = cdpycssgdhVar.cdpycssgdh().gtknphoqwx().kcexrzcfyt(strVdvldrhtss)) == null) {
            return null;
        }
        if (!zdlpuopuiu.eablkybsjg(jyumaefsclVarKcexrzcfyt.zdlpuopuiu(), cdpycssgdhVar.cdpycssgdh().gtknphoqwx().zdlpuopuiu()) && !this.f82946iobyxmoadg.kcexrzcfyt()) {
            return null;
        }
        zynmafqrjb.iobyxmoadg iobyxmoadgVarNufgyqmvbu = cdpycssgdhVar.cdpycssgdh().nufgyqmvbu();
        if (gxszxtbevo.iobyxmoadg(str)) {
            int iBtonecajqb = cdpycssgdhVar.btonecajqb();
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.f82954iobyxmoadg;
            boolean z13 = gxszxtbevoVar.ppxfxbqfkf(str) || iBtonecajqb == 308 || iBtonecajqb == 307;
            if (!gxszxtbevoVar.zoijcleaow(str) || iBtonecajqb == 308 || iBtonecajqb == 307) {
                iobyxmoadgVarNufgyqmvbu.gtknphoqwx(str, z13 ? cdpycssgdhVar.cdpycssgdh().iobyxmoadg() : null);
            } else {
                iobyxmoadgVarNufgyqmvbu.gtknphoqwx("GET", null);
            }
            if (!z13) {
                iobyxmoadgVarNufgyqmvbu.wflxmlrfwp("Transfer-Encoding");
                iobyxmoadgVarNufgyqmvbu.wflxmlrfwp("Content-Length");
                iobyxmoadgVarNufgyqmvbu.wflxmlrfwp("Content-Type");
            }
        }
        if (!mk.rgvfuqvkyq.eablkybsjg(cdpycssgdhVar.cdpycssgdh().gtknphoqwx(), jyumaefsclVarKcexrzcfyt)) {
            iobyxmoadgVarNufgyqmvbu.wflxmlrfwp("Authorization");
        }
        return iobyxmoadgVarNufgyqmvbu.zdlpuopuiu(jyumaefsclVarKcexrzcfyt).zoijcleaow();
    }

    private final boolean ppxfxbqfkf(IOException iOException, boolean z13) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z13;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean wkgbmnqykc(IOException iOException, qk.nufgyqmvbu nufgyqmvbuVar, zynmafqrjb zynmafqrjbVar, boolean z13) {
        if (this.f82946iobyxmoadg.lmojexxdyd()) {
            return !(z13 && eablkybsjg(iOException, zynmafqrjbVar)) && ppxfxbqfkf(iOException, z13) && nufgyqmvbuVar.esjtqupxsv();
        }
        return false;
    }

    private final zynmafqrjb zoijcleaow(cdpycssgdh cdpycssgdhVar, qk.ppxfxbqfkf ppxfxbqfkfVar) throws ProtocolException {
        qk.dxjokdxxww dxjokdxxwwVarNufgyqmvbu;
        iozdgvuglv iozdgvuglvVarZdlpuopuiu = (ppxfxbqfkfVar == null || (dxjokdxxwwVarNufgyqmvbu = ppxfxbqfkfVar.nufgyqmvbu()) == null) ? null : dxjokdxxwwVarNufgyqmvbu.zdlpuopuiu();
        int iBtonecajqb = cdpycssgdhVar.btonecajqb();
        String strLqeggnwhkg = cdpycssgdhVar.cdpycssgdh().lqeggnwhkg();
        if (iBtonecajqb != 307 && iBtonecajqb != 308) {
            if (iBtonecajqb == 401) {
                return this.f82946iobyxmoadg.eablkybsjg().iobyxmoadg(iozdgvuglvVarZdlpuopuiu, cdpycssgdhVar);
            }
            if (iBtonecajqb == 421) {
                istkbnxepw istkbnxepwVarIobyxmoadg = cdpycssgdhVar.cdpycssgdh().iobyxmoadg();
                if ((istkbnxepwVarIobyxmoadg != null && istkbnxepwVarIobyxmoadg.nufgyqmvbu()) || ppxfxbqfkfVar == null || !ppxfxbqfkfVar.draadjrbmk()) {
                    return null;
                }
                ppxfxbqfkfVar.nufgyqmvbu().kcexrzcfyt();
                return cdpycssgdhVar.cdpycssgdh();
            }
            if (iBtonecajqb == 503) {
                cdpycssgdh cdpycssgdhVarPmvmpeiblj = cdpycssgdhVar.pmvmpeiblj();
                if ((cdpycssgdhVarPmvmpeiblj == null || cdpycssgdhVarPmvmpeiblj.btonecajqb() != 503) && gxszxtbevo(cdpycssgdhVar, Integer.MAX_VALUE) == 0) {
                    return cdpycssgdhVar.cdpycssgdh();
                }
                return null;
            }
            if (iBtonecajqb == 407) {
                zdlpuopuiu.lqeggnwhkg(iozdgvuglvVarZdlpuopuiu);
                if (iozdgvuglvVarZdlpuopuiu.zoijcleaow().type() == Proxy.Type.HTTP) {
                    return this.f82946iobyxmoadg.cdpycssgdh().iobyxmoadg(iozdgvuglvVarZdlpuopuiu, cdpycssgdhVar);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iBtonecajqb == 408) {
                if (!this.f82946iobyxmoadg.lmojexxdyd()) {
                    return null;
                }
                istkbnxepw istkbnxepwVarIobyxmoadg2 = cdpycssgdhVar.cdpycssgdh().iobyxmoadg();
                if (istkbnxepwVarIobyxmoadg2 != null && istkbnxepwVarIobyxmoadg2.nufgyqmvbu()) {
                    return null;
                }
                cdpycssgdh cdpycssgdhVarPmvmpeiblj2 = cdpycssgdhVar.pmvmpeiblj();
                if ((cdpycssgdhVarPmvmpeiblj2 == null || cdpycssgdhVarPmvmpeiblj2.btonecajqb() != 408) && gxszxtbevo(cdpycssgdhVar, 0) <= 0) {
                    return cdpycssgdhVar.cdpycssgdh();
                }
                return null;
            }
            switch (iBtonecajqb) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return iobyxmoadg(cdpycssgdhVar, strLqeggnwhkg);
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        zdlpuopuiu.btonecajqb(chain, "chain");
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) chain;
        zynmafqrjb zynmafqrjbVarDraadjrbmk = lqeggnwhkgVar.draadjrbmk();
        qk.nufgyqmvbu nufgyqmvbuVarNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        List listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        int i13 = 0;
        cdpycssgdh cdpycssgdhVarPpxfxbqfkf = null;
        while (true) {
            boolean z13 = true;
            while (true) {
                nufgyqmvbuVarNufgyqmvbu.nufgyqmvbu(zynmafqrjbVarDraadjrbmk, z13, lqeggnwhkgVar);
                try {
                    if (nufgyqmvbuVarNufgyqmvbu.btonecajqb()) {
                        throw new IOException("Canceled");
                    }
                    try {
                    } catch (IOException e13) {
                        if (!wkgbmnqykc(e13, nufgyqmvbuVarNufgyqmvbu, zynmafqrjbVarDraadjrbmk, !(e13 instanceof ConnectionShutdownException))) {
                            throw wflxmlrfwp.wwaezpbzkn(e13, listWflxmlrfwp);
                        }
                        listWflxmlrfwp = hg.jyumaefscl.jrbgnlbqoe(listWflxmlrfwp, e13);
                        nufgyqmvbuVarNufgyqmvbu.gtknphoqwx(true);
                        z13 = false;
                    }
                } catch (Throwable th2) {
                    nufgyqmvbuVarNufgyqmvbu.gtknphoqwx(true);
                    throw th2;
                }
            }
            cdpycssgdhVarPpxfxbqfkf = lqeggnwhkgVar.zoijcleaow(zynmafqrjbVarDraadjrbmk).cqumvgiudr().vdvldrhtss(zynmafqrjbVarDraadjrbmk).agtfadlqog(cdpycssgdhVarPpxfxbqfkf != null ? draadjrbmk.yggfygwlhe(cdpycssgdhVarPpxfxbqfkf) : null).ppxfxbqfkf();
            qk.ppxfxbqfkf ppxfxbqfkfVarRgvfuqvkyq = nufgyqmvbuVarNufgyqmvbu.rgvfuqvkyq();
            zynmafqrjb zynmafqrjbVarZoijcleaow = zoijcleaow(cdpycssgdhVarPpxfxbqfkf, ppxfxbqfkfVarRgvfuqvkyq);
            if (zynmafqrjbVarZoijcleaow == null) {
                if (ppxfxbqfkfVarRgvfuqvkyq != null && ppxfxbqfkfVarRgvfuqvkyq.wflxmlrfwp()) {
                    nufgyqmvbuVarNufgyqmvbu.lereixgezr();
                }
                nufgyqmvbuVarNufgyqmvbu.gtknphoqwx(false);
                return cdpycssgdhVarPpxfxbqfkf;
            }
            istkbnxepw istkbnxepwVarIobyxmoadg = zynmafqrjbVarZoijcleaow.iobyxmoadg();
            if (istkbnxepwVarIobyxmoadg != null && istkbnxepwVarIobyxmoadg.nufgyqmvbu()) {
                nufgyqmvbuVarNufgyqmvbu.gtknphoqwx(false);
                return cdpycssgdhVarPpxfxbqfkf;
            }
            wflxmlrfwp.gxszxtbevo(cdpycssgdhVarPpxfxbqfkf.wkgbmnqykc());
            i13++;
            if (i13 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i13);
            }
            nufgyqmvbuVarNufgyqmvbu.gtknphoqwx(true);
            zynmafqrjbVarDraadjrbmk = zynmafqrjbVarZoijcleaow;
        }
    }
}
