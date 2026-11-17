package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e3 {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final am.iobyxmoadg f74327rgvfuqvkyq = am.zoijcleaow.dxjokdxxww(e3.class);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private e f74328agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Duration f74329btonecajqb = Duration.ofMinutes(15);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f74330draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private f0 f74331dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f74332eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f74333gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc f74334gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final auzgnhcxok f74335iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private SocketAddress f74336lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final SocketAddress f74337nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f74338ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f74339ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f74340wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f74341wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f74342zoijcleaow;

    public static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public long f74343iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public List f74344ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public List f74345wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public long f74346zoijcleaow;

        private ppxfxbqfkf() {
            this.f74344ppxfxbqfkf = new ArrayList();
            this.f74345wkgbmnqykc = new ArrayList();
        }
    }

    public interface wkgbmnqykc {
        void eablkybsjg();

        void iobyxmoadg(e eVar);

        void ppxfxbqfkf(e eVar);

        void wkgbmnqykc(e eVar);

        void zoijcleaow();
    }

    private static class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f74347iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private List f74348zoijcleaow;

        private zoijcleaow() {
        }

        @Override // org.xbill.DNS.e3.wkgbmnqykc
        public void eablkybsjg() {
            this.f74348zoijcleaow = new ArrayList();
        }

        @Override // org.xbill.DNS.e3.wkgbmnqykc
        public void iobyxmoadg(e eVar) {
            List list = this.f74348zoijcleaow;
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(list.size() - 1);
            ppxfxbqfkfVar.f74344ppxfxbqfkf.add(eVar);
            ppxfxbqfkfVar.f74346zoijcleaow = e3.dxjokdxxww(eVar);
        }

        @Override // org.xbill.DNS.e3.wkgbmnqykc
        public void ppxfxbqfkf(e eVar) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            ppxfxbqfkfVar.f74345wkgbmnqykc.add(eVar);
            ppxfxbqfkfVar.f74343iobyxmoadg = e3.dxjokdxxww(eVar);
            this.f74348zoijcleaow.add(ppxfxbqfkfVar);
        }

        @Override // org.xbill.DNS.e3.wkgbmnqykc
        public void wkgbmnqykc(e eVar) {
            List list = this.f74348zoijcleaow;
            if (list == null) {
                this.f74347iobyxmoadg.add(eVar);
                return;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(list.size() - 1);
            if (ppxfxbqfkfVar.f74344ppxfxbqfkf.isEmpty()) {
                ppxfxbqfkfVar.f74345wkgbmnqykc.add(eVar);
            } else {
                ppxfxbqfkfVar.f74344ppxfxbqfkf.add(eVar);
            }
        }

        @Override // org.xbill.DNS.e3.wkgbmnqykc
        public void zoijcleaow() {
            this.f74347iobyxmoadg = new ArrayList();
        }
    }

    e3(auzgnhcxok auzgnhcxokVar, int i13, long j13, boolean z13, SocketAddress socketAddress, i0 i0Var) {
        this.f74337nufgyqmvbu = socketAddress;
        if (auzgnhcxokVar.zdlpuopuiu()) {
            this.f74335iobyxmoadg = auzgnhcxokVar;
        } else {
            try {
                this.f74335iobyxmoadg = auzgnhcxok.draadjrbmk(auzgnhcxokVar, auzgnhcxok.f74233pmvmpeiblj);
            } catch (NameTooLongException unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.f74342zoijcleaow = i13;
        this.f74339ppxfxbqfkf = 1;
        this.f74341wkgbmnqykc = j13;
        this.f74332eablkybsjg = z13;
        this.f74333gtknphoqwx = 0;
    }

    private void agtfadlqog(e eVar) throws ZoneTransferException {
        int iZynmafqrjb = eVar.zynmafqrjb();
        switch (this.f74333gtknphoqwx) {
            case 0:
                if (iZynmafqrjb != 6) {
                    eablkybsjg("missing initial SOA");
                }
                this.f74328agtfadlqog = eVar;
                long jDxjokdxxww = dxjokdxxww(eVar);
                this.f74330draadjrbmk = jDxjokdxxww;
                if (this.f74342zoijcleaow == 251 && y.iobyxmoadg(jDxjokdxxww, this.f74341wkgbmnqykc) <= 0) {
                    btonecajqb("up to date");
                    this.f74333gtknphoqwx = 7;
                } else {
                    this.f74333gtknphoqwx = 1;
                }
                break;
            case 1:
                if (this.f74342zoijcleaow == 251 && iZynmafqrjb == 6 && dxjokdxxww(eVar) == this.f74341wkgbmnqykc) {
                    this.f74338ojitshcjhn = 251;
                    this.f74334gxszxtbevo.eablkybsjg();
                    btonecajqb("got incremental response");
                    this.f74333gtknphoqwx = 2;
                } else {
                    this.f74338ojitshcjhn = 252;
                    this.f74334gxszxtbevo.zoijcleaow();
                    this.f74334gxszxtbevo.wkgbmnqykc(this.f74328agtfadlqog);
                    btonecajqb("got nonincremental response");
                    this.f74333gtknphoqwx = 6;
                }
                agtfadlqog(eVar);
                break;
            case 2:
                this.f74334gxszxtbevo.ppxfxbqfkf(eVar);
                this.f74333gtknphoqwx = 3;
                break;
            case 3:
                if (iZynmafqrjb != 6) {
                    this.f74334gxszxtbevo.wkgbmnqykc(eVar);
                } else {
                    this.f74340wflxmlrfwp = dxjokdxxww(eVar);
                    this.f74333gtknphoqwx = 4;
                    agtfadlqog(eVar);
                }
                break;
            case 4:
                this.f74334gxszxtbevo.iobyxmoadg(eVar);
                this.f74333gtknphoqwx = 5;
                break;
            case 5:
                if (iZynmafqrjb == 6) {
                    long jDxjokdxxww2 = dxjokdxxww(eVar);
                    if (jDxjokdxxww2 == this.f74330draadjrbmk) {
                        this.f74333gtknphoqwx = 7;
                    } else if (jDxjokdxxww2 == this.f74340wflxmlrfwp) {
                        this.f74333gtknphoqwx = 2;
                        agtfadlqog(eVar);
                    } else {
                        eablkybsjg("IXFR out of sync: expected serial " + this.f74340wflxmlrfwp + " , got " + jDxjokdxxww2);
                    }
                }
                this.f74334gxszxtbevo.wkgbmnqykc(eVar);
                break;
            case 6:
                if (iZynmafqrjb != 1 || eVar.zdlpuopuiu() == this.f74339ppxfxbqfkf) {
                    this.f74334gxszxtbevo.wkgbmnqykc(eVar);
                    if (iZynmafqrjb == 6) {
                        this.f74333gtknphoqwx = 7;
                    }
                }
                break;
            case 7:
                eablkybsjg("extra data");
                break;
            default:
                eablkybsjg("invalid state");
                break;
        }
    }

    private void btonecajqb(String str) {
        f74327rgvfuqvkyq.lqeggnwhkg("{}: {}", this.f74335iobyxmoadg, str);
    }

    private void draadjrbmk() throws IOException {
        f0 f0VarPpxfxbqfkf = ppxfxbqfkf(this.f74329btonecajqb);
        this.f74331dxjokdxxww = f0VarPpxfxbqfkf;
        SocketAddress socketAddress = this.f74336lqeggnwhkg;
        if (socketAddress != null) {
            f0VarPpxfxbqfkf.wkgbmnqykc(socketAddress);
        }
        this.f74331dxjokdxxww.nufgyqmvbu(this.f74337nufgyqmvbu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long dxjokdxxww(e eVar) {
        return ((k) eVar).sopmlzcsov();
    }

    private void eablkybsjg(String str) throws ZoneTransferException {
        throw new ZoneTransferException(str);
    }

    public static e3 gtknphoqwx(auzgnhcxok auzgnhcxokVar, SocketAddress socketAddress, i0 i0Var) {
        return new e3(auzgnhcxokVar, 252, 0L, false, socketAddress, i0Var);
    }

    private void gxszxtbevo() throws ZoneTransferException {
        if (!this.f74332eablkybsjg) {
            eablkybsjg("server doesn't support IXFR");
        }
        btonecajqb("falling back to AXFR");
        this.f74342zoijcleaow = 252;
        this.f74333gtknphoqwx = 0;
    }

    private zoijcleaow nufgyqmvbu() {
        wkgbmnqykc wkgbmnqykcVar = this.f74334gxszxtbevo;
        if (wkgbmnqykcVar instanceof zoijcleaow) {
            return (zoijcleaow) wkgbmnqykcVar;
        }
        throw new IllegalArgumentException("ZoneTransferIn used callback interface");
    }

    private void vdvldrhtss() {
        e eVarIstkbnxepw = e.istkbnxepw(this.f74335iobyxmoadg, this.f74342zoijcleaow, this.f74339ppxfxbqfkf);
        zfvoamnweg zfvoamnwegVar = new zfvoamnweg();
        zfvoamnwegVar.ppxfxbqfkf().ojitshcjhn(0);
        zfvoamnwegVar.iobyxmoadg(eVarIstkbnxepw, 0);
        if (this.f74342zoijcleaow == 251) {
            auzgnhcxok auzgnhcxokVar = this.f74335iobyxmoadg;
            int i13 = this.f74339ppxfxbqfkf;
            auzgnhcxok auzgnhcxokVar2 = auzgnhcxok.f74233pmvmpeiblj;
            zfvoamnwegVar.iobyxmoadg(new k(auzgnhcxokVar, i13, 0L, auzgnhcxokVar2, auzgnhcxokVar2, this.f74341wkgbmnqykc, 0L, 0L, 0L, 0L), 2);
        }
        this.f74331dxjokdxxww.btonecajqb(zfvoamnwegVar.zdlpuopuiu(65535));
    }

    private zfvoamnweg wflxmlrfwp(byte[] bArr) throws WireParseException {
        try {
            return new zfvoamnweg(bArr);
        } catch (IOException e13) {
            if (e13 instanceof WireParseException) {
                throw ((WireParseException) e13);
            }
            throw new WireParseException("Error parsing message", e13);
        }
    }

    private void wkgbmnqykc() throws ZoneTransferException, WireParseException {
        vdvldrhtss();
        while (this.f74333gtknphoqwx != 7) {
            zfvoamnweg zfvoamnwegVarWflxmlrfwp = wflxmlrfwp(this.f74331dxjokdxxww.dxjokdxxww());
            List listLqeggnwhkg = zfvoamnwegVarWflxmlrfwp.lqeggnwhkg(1);
            zfvoamnwegVarWflxmlrfwp.ppxfxbqfkf().nufgyqmvbu();
            if (this.f74333gtknphoqwx == 0) {
                int iGxszxtbevo = zfvoamnwegVarWflxmlrfwp.gxszxtbevo();
                if (iGxszxtbevo != 0) {
                    if (this.f74342zoijcleaow == 251 && iGxszxtbevo == 4) {
                        gxszxtbevo();
                        wkgbmnqykc();
                        return;
                    }
                    eablkybsjg(d.zoijcleaow(iGxszxtbevo));
                }
                e eVarEablkybsjg = zfvoamnwegVarWflxmlrfwp.eablkybsjg();
                if (eVarEablkybsjg != null && eVarEablkybsjg.zynmafqrjb() != this.f74342zoijcleaow) {
                    eablkybsjg("invalid question section");
                }
                if (listLqeggnwhkg.isEmpty() && this.f74342zoijcleaow == 251) {
                    gxszxtbevo();
                    wkgbmnqykc();
                    return;
                }
            }
            Iterator it = listLqeggnwhkg.iterator();
            while (it.hasNext()) {
                agtfadlqog((e) it.next());
            }
        }
    }

    private void zoijcleaow() {
        try {
            f0 f0Var = this.f74331dxjokdxxww;
            if (f0Var != null) {
                f0Var.close();
            }
        } catch (IOException unused) {
        }
    }

    public void kcexrzcfyt(Duration duration) {
        this.f74329btonecajqb = duration;
    }

    public List lqeggnwhkg() {
        return nufgyqmvbu().f74347iobyxmoadg;
    }

    public void ojitshcjhn() {
        rgvfuqvkyq(new zoijcleaow());
    }

    public void oxmwwwfdhm(SocketAddress socketAddress) {
        this.f74336lqeggnwhkg = socketAddress;
    }

    f0 ppxfxbqfkf(Duration duration) {
        return new f0(duration);
    }

    public void rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar) {
        this.f74334gxszxtbevo = wkgbmnqykcVar;
        try {
            draadjrbmk();
            wkgbmnqykc();
        } finally {
            zoijcleaow();
        }
    }
}
