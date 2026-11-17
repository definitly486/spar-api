package qk;

import bl.iozdgvuglv;
import bl.wwaezpbzkn;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.istkbnxepw;
import lk.oxmwwwfdhm;
import lk.yadqdtsiqt;
import lk.yggfygwlhe;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f79036eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f79037gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f79038iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f79039ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rk.wkgbmnqykc f79040wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oxmwwwfdhm f79041zoijcleaow;

    private final class iobyxmoadg extends bl.gtknphoqwx {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f79042cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f79043esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private long f79044iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f79045jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final long f79046yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iozdgvuglv delegate, long j13) {
            super(delegate);
            zdlpuopuiu.btonecajqb(delegate, "delegate");
            this.f79043esjtqupxsv = ppxfxbqfkfVar;
            this.f79046yggfygwlhe = j13;
        }

        private final IOException iobyxmoadg(IOException iOException) {
            if (this.f79045jyumaefscl) {
                return iOException;
            }
            this.f79045jyumaefscl = true;
            return this.f79043esjtqupxsv.iobyxmoadg(this.f79044iwizpuwonk, false, true, iOException);
        }

        @Override // bl.gtknphoqwx, bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f79042cqumvgiudr) {
                return;
            }
            this.f79042cqumvgiudr = true;
            long j13 = this.f79046yggfygwlhe;
            if (j13 != -1 && this.f79044iwizpuwonk != j13) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                iobyxmoadg(null);
            } catch (IOException e13) {
                throw iobyxmoadg(e13);
            }
        }

        @Override // bl.gtknphoqwx, bl.iozdgvuglv, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e13) {
                throw iobyxmoadg(e13);
            }
        }

        @Override // bl.gtknphoqwx, bl.iozdgvuglv
        public void zeieaojujs(bl.ppxfxbqfkf source, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(source, "source");
            if (this.f79042cqumvgiudr) {
                throw new IllegalStateException("closed");
            }
            long j14 = this.f79046yggfygwlhe;
            if (j14 == -1 || this.f79044iwizpuwonk + j13 <= j14) {
                try {
                    super.zeieaojujs(source, j13);
                    this.f79044iwizpuwonk += j13;
                    return;
                } catch (IOException e13) {
                    throw iobyxmoadg(e13);
                }
            }
            throw new ProtocolException("expected " + this.f79046yggfygwlhe + " bytes but received " + (this.f79044iwizpuwonk + j13));
        }
    }

    public final class zoijcleaow extends bl.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f79047cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private boolean f79048esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f79049iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private long f79050jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f79051lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final long f79052yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, wwaezpbzkn delegate, long j13) {
            super(delegate);
            zdlpuopuiu.btonecajqb(delegate, "delegate");
            this.f79051lereixgezr = ppxfxbqfkfVar;
            this.f79052yggfygwlhe = j13;
            this.f79049iwizpuwonk = true;
            if (j13 == 0) {
                wkgbmnqykc(null);
            }
        }

        @Override // bl.draadjrbmk, bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f79048esjtqupxsv) {
                return;
            }
            this.f79048esjtqupxsv = true;
            try {
                super.close();
                wkgbmnqykc(null);
            } catch (IOException e13) {
                throw wkgbmnqykc(e13);
            }
        }

        @Override // bl.draadjrbmk, bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(sink, "sink");
            if (this.f79048esjtqupxsv) {
                throw new IllegalStateException("closed");
            }
            try {
                long jFmlbqenlif = iobyxmoadg().fmlbqenlif(sink, j13);
                if (this.f79049iwizpuwonk) {
                    this.f79049iwizpuwonk = false;
                    this.f79051lereixgezr.dxjokdxxww().jyumaefscl(this.f79051lereixgezr.lqeggnwhkg());
                }
                if (jFmlbqenlif == -1) {
                    wkgbmnqykc(null);
                    return -1L;
                }
                long j14 = this.f79050jyumaefscl + jFmlbqenlif;
                long j15 = this.f79052yggfygwlhe;
                if (j15 != -1 && j14 > j15) {
                    throw new ProtocolException("expected " + this.f79052yggfygwlhe + " bytes but received " + j14);
                }
                this.f79050jyumaefscl = j14;
                if (j14 == j15) {
                    wkgbmnqykc(null);
                }
                return jFmlbqenlif;
            } catch (IOException e13) {
                throw wkgbmnqykc(e13);
            }
        }

        public final IOException wkgbmnqykc(IOException iOException) {
            if (this.f79047cqumvgiudr) {
                return iOException;
            }
            this.f79047cqumvgiudr = true;
            if (iOException == null && this.f79049iwizpuwonk) {
                this.f79049iwizpuwonk = false;
                this.f79051lereixgezr.dxjokdxxww().jyumaefscl(this.f79051lereixgezr.lqeggnwhkg());
            }
            return this.f79051lereixgezr.iobyxmoadg(this.f79050jyumaefscl, true, false, iOException);
        }
    }

    public ppxfxbqfkf(nufgyqmvbu call, oxmwwwfdhm eventListener, wkgbmnqykc finder, rk.wkgbmnqykc codec) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(eventListener, "eventListener");
        zdlpuopuiu.btonecajqb(finder, "finder");
        zdlpuopuiu.btonecajqb(codec, "codec");
        this.f79038iobyxmoadg = call;
        this.f79041zoijcleaow = eventListener;
        this.f79039ppxfxbqfkf = finder;
        this.f79040wkgbmnqykc = codec;
    }

    private final void zdlpuopuiu(IOException iOException) {
        this.f79037gxszxtbevo = true;
        this.f79040wkgbmnqykc.nufgyqmvbu().eablkybsjg(this.f79038iobyxmoadg, iOException);
    }

    public final void agtfadlqog() {
        this.f79040wkgbmnqykc.nufgyqmvbu().zoijcleaow();
    }

    public final wkgbmnqykc btonecajqb() {
        return this.f79039ppxfxbqfkf;
    }

    public final boolean draadjrbmk() {
        return !zdlpuopuiu.eablkybsjg(this.f79039ppxfxbqfkf.zoijcleaow().iobyxmoadg().draadjrbmk().dxjokdxxww(), this.f79040wkgbmnqykc.nufgyqmvbu().gxszxtbevo().iobyxmoadg().draadjrbmk().dxjokdxxww());
    }

    public final oxmwwwfdhm dxjokdxxww() {
        return this.f79041zoijcleaow;
    }

    public final void eablkybsjg() throws IOException {
        try {
            this.f79040wkgbmnqykc.iobyxmoadg();
        } catch (IOException e13) {
            this.f79041zoijcleaow.oxmwwwfdhm(this.f79038iobyxmoadg, e13);
            zdlpuopuiu(e13);
            throw e13;
        }
    }

    public final boolean gtknphoqwx() {
        return this.f79037gxszxtbevo;
    }

    public final void gxszxtbevo() throws IOException {
        try {
            this.f79040wkgbmnqykc.lqeggnwhkg();
        } catch (IOException e13) {
            this.f79041zoijcleaow.oxmwwwfdhm(this.f79038iobyxmoadg, e13);
            zdlpuopuiu(e13);
            throw e13;
        }
    }

    public final IOException iobyxmoadg(long j13, boolean z13, boolean z14, IOException iOException) {
        if (iOException != null) {
            zdlpuopuiu(iOException);
        }
        if (z14) {
            if (iOException != null) {
                this.f79041zoijcleaow.oxmwwwfdhm(this.f79038iobyxmoadg, iOException);
            } else {
                this.f79041zoijcleaow.rgvfuqvkyq(this.f79038iobyxmoadg, j13);
            }
        }
        if (z13) {
            if (iOException != null) {
                this.f79041zoijcleaow.iwizpuwonk(this.f79038iobyxmoadg, iOException);
            } else {
                this.f79041zoijcleaow.yggfygwlhe(this.f79038iobyxmoadg, j13);
            }
        }
        return this.f79038iobyxmoadg.yggfygwlhe(this, z14, z13, iOException);
    }

    public final void jyumaefscl(zynmafqrjb request) throws IOException {
        zdlpuopuiu.btonecajqb(request, "request");
        try {
            this.f79041zoijcleaow.zdlpuopuiu(this.f79038iobyxmoadg);
            this.f79040wkgbmnqykc.eablkybsjg(request);
            this.f79041zoijcleaow.kcexrzcfyt(this.f79038iobyxmoadg, request);
        } catch (IOException e13) {
            this.f79041zoijcleaow.oxmwwwfdhm(this.f79038iobyxmoadg, e13);
            zdlpuopuiu(e13);
            throw e13;
        }
    }

    public final void kcexrzcfyt() {
        this.f79041zoijcleaow.esjtqupxsv(this.f79038iobyxmoadg);
    }

    public final nufgyqmvbu lqeggnwhkg() {
        return this.f79038iobyxmoadg;
    }

    public final dxjokdxxww nufgyqmvbu() {
        rk.wkgbmnqykc.iobyxmoadg iobyxmoadgVarNufgyqmvbu = this.f79040wkgbmnqykc.nufgyqmvbu();
        dxjokdxxww dxjokdxxwwVar = iobyxmoadgVarNufgyqmvbu instanceof dxjokdxxww ? (dxjokdxxww) iobyxmoadgVarNufgyqmvbu : null;
        if (dxjokdxxwwVar != null) {
            return dxjokdxxwwVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final void ojitshcjhn() {
        this.f79038iobyxmoadg.yggfygwlhe(this, true, false, null);
    }

    public final void oxmwwwfdhm(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        this.f79041zoijcleaow.cqumvgiudr(this.f79038iobyxmoadg, response);
    }

    public final iozdgvuglv ppxfxbqfkf(zynmafqrjb request, boolean z13) {
        zdlpuopuiu.btonecajqb(request, "request");
        this.f79036eablkybsjg = z13;
        istkbnxepw istkbnxepwVarIobyxmoadg = request.iobyxmoadg();
        zdlpuopuiu.lqeggnwhkg(istkbnxepwVarIobyxmoadg);
        long jIobyxmoadg = istkbnxepwVarIobyxmoadg.iobyxmoadg();
        this.f79041zoijcleaow.vdvldrhtss(this.f79038iobyxmoadg);
        return new iobyxmoadg(this, this.f79040wkgbmnqykc.wkgbmnqykc(request, jIobyxmoadg), jIobyxmoadg);
    }

    public final yadqdtsiqt rgvfuqvkyq(cdpycssgdh response) throws IOException {
        zdlpuopuiu.btonecajqb(response, "response");
        try {
            String strVdvldrhtss = cdpycssgdh.vdvldrhtss(response, "Content-Type", null, 2, null);
            long jPpxfxbqfkf = this.f79040wkgbmnqykc.ppxfxbqfkf(response);
            return new rk.nufgyqmvbu(strVdvldrhtss, jPpxfxbqfkf, bl.zdlpuopuiu.ppxfxbqfkf(new zoijcleaow(this, this.f79040wkgbmnqykc.zoijcleaow(response), jPpxfxbqfkf)));
        } catch (IOException e13) {
            this.f79041zoijcleaow.iwizpuwonk(this.f79038iobyxmoadg, e13);
            zdlpuopuiu(e13);
            throw e13;
        }
    }

    public final cdpycssgdh.iobyxmoadg vdvldrhtss(boolean z13) throws IOException {
        try {
            cdpycssgdh.iobyxmoadg iobyxmoadgVarGxszxtbevo = this.f79040wkgbmnqykc.gxszxtbevo(z13);
            if (iobyxmoadgVarGxszxtbevo != null) {
                iobyxmoadgVarGxszxtbevo.gtknphoqwx(this);
            }
            return iobyxmoadgVarGxszxtbevo;
        } catch (IOException e13) {
            this.f79041zoijcleaow.iwizpuwonk(this.f79038iobyxmoadg, e13);
            zdlpuopuiu(e13);
            throw e13;
        }
    }

    public final boolean wflxmlrfwp() {
        return this.f79036eablkybsjg;
    }

    public final void wkgbmnqykc() {
        this.f79040wkgbmnqykc.cancel();
        this.f79038iobyxmoadg.yggfygwlhe(this, true, true, null);
    }

    public final yggfygwlhe yggfygwlhe() {
        return this.f79040wkgbmnqykc.dxjokdxxww();
    }

    public final void zoijcleaow() {
        this.f79040wkgbmnqykc.cancel();
    }
}
