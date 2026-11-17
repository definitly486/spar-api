package sk;

import bl.iozdgvuglv;
import bl.wflxmlrfwp;
import bl.wwaezpbzkn;
import bl.ylkuphrtab;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.agtfadlqog;
import lk.cdpycssgdh;
import lk.istkbnxepw;
import lk.lereixgezr;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import mk.rgvfuqvkyq;
import rk.dxjokdxxww;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow implements rk.wkgbmnqykc {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final wkgbmnqykc f107191nufgyqmvbu = new wkgbmnqykc(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f107192eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final sk.iobyxmoadg f107193gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lereixgezr f107194iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private yggfygwlhe f107195lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bl.eablkybsjg f107196ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final bl.wkgbmnqykc f107197wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rk.wkgbmnqykc.iobyxmoadg f107198zoijcleaow;

    private final class eablkybsjg extends iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private long f107200iwizpuwonk;

        public eablkybsjg(long j13) {
            super();
            this.f107200iwizpuwonk = j13;
            if (j13 == 0) {
                wkgbmnqykc();
            }
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (iobyxmoadg()) {
                return;
            }
            if (this.f107200iwizpuwonk != 0 && !rgvfuqvkyq.nufgyqmvbu(this, 100, TimeUnit.MILLISECONDS)) {
                zoijcleaow.this.nufgyqmvbu().zoijcleaow();
                wkgbmnqykc();
            }
            lqeggnwhkg(true);
        }

        @Override // sk.zoijcleaow.iobyxmoadg, bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(sink, "sink");
            if (j13 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
            }
            if (iobyxmoadg()) {
                throw new IllegalStateException("closed");
            }
            long j14 = this.f107200iwizpuwonk;
            if (j14 == 0) {
                return -1L;
            }
            long jFmlbqenlif = super.fmlbqenlif(sink, Math.min(j14, j13));
            if (jFmlbqenlif == -1) {
                zoijcleaow.this.nufgyqmvbu().zoijcleaow();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                wkgbmnqykc();
                throw protocolException;
            }
            long j15 = this.f107200iwizpuwonk - jFmlbqenlif;
            this.f107200iwizpuwonk = j15;
            if (j15 == 0) {
                wkgbmnqykc();
            }
            return jFmlbqenlif;
        }
    }

    private final class gxszxtbevo implements iozdgvuglv {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f107202yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final wflxmlrfwp f107203zdlpuopuiu;

        public gxszxtbevo() {
            this.f107203zdlpuopuiu = new wflxmlrfwp(zoijcleaow.this.f107197wkgbmnqykc.ppxfxbqfkf());
        }

        @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f107202yggfygwlhe) {
                return;
            }
            this.f107202yggfygwlhe = true;
            zoijcleaow.this.kcexrzcfyt(this.f107203zdlpuopuiu);
            zoijcleaow.this.f107192eablkybsjg = 3;
        }

        @Override // bl.iozdgvuglv, java.io.Flushable
        public void flush() {
            if (this.f107202yggfygwlhe) {
                return;
            }
            zoijcleaow.this.f107197wkgbmnqykc.flush();
        }

        @Override // bl.iozdgvuglv
        public ylkuphrtab ppxfxbqfkf() {
            return this.f107203zdlpuopuiu;
        }

        @Override // bl.iozdgvuglv
        public void zeieaojujs(bl.ppxfxbqfkf source, long j13) {
            zdlpuopuiu.btonecajqb(source, "source");
            if (this.f107202yggfygwlhe) {
                throw new IllegalStateException("closed");
            }
            mk.wflxmlrfwp.eablkybsjg(source.dsvhmnatus(), 0L, j13);
            zoijcleaow.this.f107197wkgbmnqykc.zeieaojujs(source, j13);
        }
    }

    private abstract class iobyxmoadg implements wwaezpbzkn {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f107205yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final wflxmlrfwp f107206zdlpuopuiu;

        public iobyxmoadg() {
            this.f107206zdlpuopuiu = new wflxmlrfwp(zoijcleaow.this.f107196ppxfxbqfkf.ppxfxbqfkf());
        }

        @Override // bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(sink, "sink");
            try {
                return zoijcleaow.this.f107196ppxfxbqfkf.fmlbqenlif(sink, j13);
            } catch (IOException e13) {
                zoijcleaow.this.nufgyqmvbu().zoijcleaow();
                wkgbmnqykc();
                throw e13;
            }
        }

        protected final boolean iobyxmoadg() {
            return this.f107205yggfygwlhe;
        }

        protected final void lqeggnwhkg(boolean z13) {
            this.f107205yggfygwlhe = z13;
        }

        @Override // bl.wwaezpbzkn
        public ylkuphrtab ppxfxbqfkf() {
            return this.f107206zdlpuopuiu;
        }

        public final void wkgbmnqykc() {
            if (zoijcleaow.this.f107192eablkybsjg == 6) {
                return;
            }
            if (zoijcleaow.this.f107192eablkybsjg == 5) {
                zoijcleaow.this.kcexrzcfyt(this.f107206zdlpuopuiu);
                zoijcleaow.this.f107192eablkybsjg = 6;
            } else {
                throw new IllegalStateException("state: " + zoijcleaow.this.f107192eablkybsjg);
            }
        }
    }

    private final class lqeggnwhkg extends iobyxmoadg {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f107208iwizpuwonk;

        public lqeggnwhkg() {
            super();
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (iobyxmoadg()) {
                return;
            }
            if (!this.f107208iwizpuwonk) {
                wkgbmnqykc();
            }
            lqeggnwhkg(true);
        }

        @Override // sk.zoijcleaow.iobyxmoadg, bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(sink, "sink");
            if (j13 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
            }
            if (iobyxmoadg()) {
                throw new IllegalStateException("closed");
            }
            if (this.f107208iwizpuwonk) {
                return -1L;
            }
            long jFmlbqenlif = super.fmlbqenlif(sink, j13);
            if (jFmlbqenlif != -1) {
                return jFmlbqenlif;
            }
            this.f107208iwizpuwonk = true;
            wkgbmnqykc();
            return -1L;
        }
    }

    static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final nufgyqmvbu f107209zdlpuopuiu = new nufgyqmvbu();

        nufgyqmvbu() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yggfygwlhe invoke() {
            throw new IllegalStateException("trailers not available");
        }
    }

    private final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private long f107210cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private boolean f107211esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final lk.jyumaefscl f107212iwizpuwonk;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f107213lereixgezr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(zoijcleaow zoijcleaowVar, lk.jyumaefscl url) {
            super();
            zdlpuopuiu.btonecajqb(url, "url");
            this.f107213lereixgezr = zoijcleaowVar;
            this.f107212iwizpuwonk = url;
            this.f107210cqumvgiudr = -1L;
            this.f107211esjtqupxsv = true;
        }

        private final void nufgyqmvbu() throws ProtocolException {
            if (this.f107210cqumvgiudr != -1) {
                this.f107213lereixgezr.f107196ppxfxbqfkf.roivzttewh();
            }
            try {
                this.f107210cqumvgiudr = this.f107213lereixgezr.f107196ppxfxbqfkf.i0();
                String string = kcexrzcfyt.p(this.f107213lereixgezr.f107196ppxfxbqfkf.roivzttewh()).toString();
                if (this.f107210cqumvgiudr < 0 || (string.length() > 0 && !kcexrzcfyt.stevsuqkhv(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f107210cqumvgiudr + string + '\"');
                }
                if (this.f107210cqumvgiudr == 0) {
                    this.f107211esjtqupxsv = false;
                    zoijcleaow zoijcleaowVar = this.f107213lereixgezr;
                    zoijcleaowVar.f107195lqeggnwhkg = zoijcleaowVar.f107193gxszxtbevo.iobyxmoadg();
                    lereixgezr lereixgezrVar = this.f107213lereixgezr.f107194iobyxmoadg;
                    zdlpuopuiu.lqeggnwhkg(lereixgezrVar);
                    agtfadlqog agtfadlqogVarWflxmlrfwp = lereixgezrVar.wflxmlrfwp();
                    lk.jyumaefscl jyumaefsclVar = this.f107212iwizpuwonk;
                    yggfygwlhe yggfygwlheVar = this.f107213lereixgezr.f107195lqeggnwhkg;
                    zdlpuopuiu.lqeggnwhkg(yggfygwlheVar);
                    rk.eablkybsjg.gxszxtbevo(agtfadlqogVarWflxmlrfwp, jyumaefsclVar, yggfygwlheVar);
                    wkgbmnqykc();
                }
            } catch (NumberFormatException e13) {
                throw new ProtocolException(e13.getMessage());
            }
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (iobyxmoadg()) {
                return;
            }
            if (this.f107211esjtqupxsv && !rgvfuqvkyq.nufgyqmvbu(this, 100, TimeUnit.MILLISECONDS)) {
                this.f107213lereixgezr.nufgyqmvbu().zoijcleaow();
                wkgbmnqykc();
            }
            lqeggnwhkg(true);
        }

        @Override // sk.zoijcleaow.iobyxmoadg, bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(sink, "sink");
            if (j13 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
            }
            if (iobyxmoadg()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f107211esjtqupxsv) {
                return -1L;
            }
            long j14 = this.f107210cqumvgiudr;
            if (j14 == 0 || j14 == -1) {
                nufgyqmvbu();
                if (!this.f107211esjtqupxsv) {
                    return -1L;
                }
            }
            long jFmlbqenlif = super.fmlbqenlif(sink, Math.min(j13, this.f107210cqumvgiudr));
            if (jFmlbqenlif != -1) {
                this.f107210cqumvgiudr -= jFmlbqenlif;
                return jFmlbqenlif;
            }
            this.f107213lereixgezr.nufgyqmvbu().zoijcleaow();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            wkgbmnqykc();
            throw protocolException;
        }
    }

    public static final class wkgbmnqykc {
        public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private wkgbmnqykc() {
        }
    }

    /* JADX INFO: renamed from: sk.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    private final class C2633zoijcleaow implements iozdgvuglv {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f107215yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final wflxmlrfwp f107216zdlpuopuiu;

        public C2633zoijcleaow() {
            this.f107216zdlpuopuiu = new wflxmlrfwp(zoijcleaow.this.f107197wkgbmnqykc.ppxfxbqfkf());
        }

        @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f107215yggfygwlhe) {
                return;
            }
            this.f107215yggfygwlhe = true;
            zoijcleaow.this.f107197wkgbmnqykc.metgxyhuhe("0\r\n\r\n");
            zoijcleaow.this.kcexrzcfyt(this.f107216zdlpuopuiu);
            zoijcleaow.this.f107192eablkybsjg = 3;
        }

        @Override // bl.iozdgvuglv, java.io.Flushable
        public synchronized void flush() {
            if (this.f107215yggfygwlhe) {
                return;
            }
            zoijcleaow.this.f107197wkgbmnqykc.flush();
        }

        @Override // bl.iozdgvuglv
        public ylkuphrtab ppxfxbqfkf() {
            return this.f107216zdlpuopuiu;
        }

        @Override // bl.iozdgvuglv
        public void zeieaojujs(bl.ppxfxbqfkf source, long j13) {
            zdlpuopuiu.btonecajqb(source, "source");
            if (this.f107215yggfygwlhe) {
                throw new IllegalStateException("closed");
            }
            if (j13 == 0) {
                return;
            }
            zoijcleaow.this.f107197wkgbmnqykc.I(j13);
            zoijcleaow.this.f107197wkgbmnqykc.metgxyhuhe("\r\n");
            zoijcleaow.this.f107197wkgbmnqykc.zeieaojujs(source, j13);
            zoijcleaow.this.f107197wkgbmnqykc.metgxyhuhe("\r\n");
        }
    }

    public zoijcleaow(lereixgezr lereixgezrVar, rk.wkgbmnqykc.iobyxmoadg carrier, bl.eablkybsjg source, bl.wkgbmnqykc sink) {
        zdlpuopuiu.btonecajqb(carrier, "carrier");
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(sink, "sink");
        this.f107194iobyxmoadg = lereixgezrVar;
        this.f107198zoijcleaow = carrier;
        this.f107196ppxfxbqfkf = source;
        this.f107197wkgbmnqykc = sink;
        this.f107193gxszxtbevo = new sk.iobyxmoadg(source);
    }

    private final wwaezpbzkn cqumvgiudr(long j13) {
        if (this.f107192eablkybsjg == 4) {
            this.f107192eablkybsjg = 5;
            return new eablkybsjg(j13);
        }
        throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
    }

    private final iozdgvuglv esjtqupxsv() {
        if (this.f107192eablkybsjg == 1) {
            this.f107192eablkybsjg = 2;
            return new gxszxtbevo();
        }
        throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
    }

    private final wwaezpbzkn iwizpuwonk(lk.jyumaefscl jyumaefsclVar) {
        if (this.f107192eablkybsjg == 4) {
            this.f107192eablkybsjg = 5;
            return new ppxfxbqfkf(this, jyumaefsclVar);
        }
        throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
    }

    private final iozdgvuglv jyumaefscl() {
        if (this.f107192eablkybsjg == 1) {
            this.f107192eablkybsjg = 2;
            return new C2633zoijcleaow();
        }
        throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void kcexrzcfyt(wflxmlrfwp wflxmlrfwpVar) {
        ylkuphrtab ylkuphrtabVarDxjokdxxww = wflxmlrfwpVar.dxjokdxxww();
        wflxmlrfwpVar.btonecajqb(ylkuphrtab.f16756eablkybsjg);
        ylkuphrtabVarDxjokdxxww.iobyxmoadg();
        ylkuphrtabVarDxjokdxxww.zoijcleaow();
    }

    private final wwaezpbzkn lereixgezr() {
        if (this.f107192eablkybsjg == 4) {
            this.f107192eablkybsjg = 5;
            nufgyqmvbu().zoijcleaow();
            return new lqeggnwhkg();
        }
        throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
    }

    private final boolean yggfygwlhe(cdpycssgdh cdpycssgdhVar) {
        return kcexrzcfyt.istkbnxepw("chunked", cdpycssgdh.vdvldrhtss(cdpycssgdhVar, "Transfer-Encoding", null, 2, null), true);
    }

    private final boolean zdlpuopuiu(zynmafqrjb zynmafqrjbVar) {
        return kcexrzcfyt.istkbnxepw("chunked", zynmafqrjbVar.wkgbmnqykc("Transfer-Encoding"), true);
    }

    @Override // rk.wkgbmnqykc
    public void cancel() {
        nufgyqmvbu().cancel();
    }

    @Override // rk.wkgbmnqykc
    public yggfygwlhe dxjokdxxww() {
        if (this.f107192eablkybsjg != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        yggfygwlhe yggfygwlheVar = this.f107195lqeggnwhkg;
        return yggfygwlheVar == null ? rgvfuqvkyq.f67372iobyxmoadg : yggfygwlheVar;
    }

    @Override // rk.wkgbmnqykc
    public void eablkybsjg(zynmafqrjb request) {
        zdlpuopuiu.btonecajqb(request, "request");
        dxjokdxxww dxjokdxxwwVar = dxjokdxxww.f82947iobyxmoadg;
        Proxy.Type type = nufgyqmvbu().gxszxtbevo().zoijcleaow().type();
        zdlpuopuiu.dxjokdxxww(type, "carrier.route.proxy.type()");
        zynmafqrjb(request.eablkybsjg(), dxjokdxxwwVar.iobyxmoadg(request, type));
    }

    @Override // rk.wkgbmnqykc
    public cdpycssgdh.iobyxmoadg gxszxtbevo(boolean z13) throws IOException {
        int i13 = this.f107192eablkybsjg;
        if (i13 != 1 && i13 != 2 && i13 != 3) {
            throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
        }
        try {
            rk.gtknphoqwx gtknphoqwxVarIobyxmoadg = rk.gtknphoqwx.f82950wkgbmnqykc.iobyxmoadg(this.f107193gxszxtbevo.zoijcleaow());
            cdpycssgdh.iobyxmoadg iobyxmoadgVarIstkbnxepw = new cdpycssgdh.iobyxmoadg().ojitshcjhn(gtknphoqwxVarIobyxmoadg.f82951iobyxmoadg).eablkybsjg(gtknphoqwxVarIobyxmoadg.f82953zoijcleaow).draadjrbmk(gtknphoqwxVarIobyxmoadg.f82952ppxfxbqfkf).btonecajqb(this.f107193gxszxtbevo.iobyxmoadg()).istkbnxepw(nufgyqmvbu.f107209zdlpuopuiu);
            if (z13 && gtknphoqwxVarIobyxmoadg.f82953zoijcleaow == 100) {
                return null;
            }
            int i14 = gtknphoqwxVarIobyxmoadg.f82953zoijcleaow;
            if (i14 == 100) {
                this.f107192eablkybsjg = 3;
                return iobyxmoadgVarIstkbnxepw;
            }
            if (i14 == 103) {
                this.f107192eablkybsjg = 3;
                return iobyxmoadgVarIstkbnxepw;
            }
            this.f107192eablkybsjg = 4;
            return iobyxmoadgVarIstkbnxepw;
        } catch (EOFException e13) {
            throw new IOException("unexpected end of stream on " + nufgyqmvbu().gxszxtbevo().iobyxmoadg().draadjrbmk().oxmwwwfdhm(), e13);
        }
    }

    @Override // rk.wkgbmnqykc
    public void iobyxmoadg() {
        this.f107197wkgbmnqykc.flush();
    }

    @Override // rk.wkgbmnqykc
    public void lqeggnwhkg() {
        this.f107197wkgbmnqykc.flush();
    }

    @Override // rk.wkgbmnqykc
    public rk.wkgbmnqykc.iobyxmoadg nufgyqmvbu() {
        return this.f107198zoijcleaow;
    }

    public final void pmvmpeiblj(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        long jBtonecajqb = rgvfuqvkyq.btonecajqb(response);
        if (jBtonecajqb == -1) {
            return;
        }
        wwaezpbzkn wwaezpbzknVarCqumvgiudr = cqumvgiudr(jBtonecajqb);
        rgvfuqvkyq.agtfadlqog(wwaezpbzknVarCqumvgiudr, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        wwaezpbzknVarCqumvgiudr.close();
    }

    @Override // rk.wkgbmnqykc
    public long ppxfxbqfkf(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        if (!rk.eablkybsjg.zoijcleaow(response)) {
            return 0L;
        }
        if (yggfygwlhe(response)) {
            return -1L;
        }
        return rgvfuqvkyq.btonecajqb(response);
    }

    @Override // rk.wkgbmnqykc
    public iozdgvuglv wkgbmnqykc(zynmafqrjb request, long j13) throws ProtocolException {
        zdlpuopuiu.btonecajqb(request, "request");
        istkbnxepw istkbnxepwVarIobyxmoadg = request.iobyxmoadg();
        if (istkbnxepwVarIobyxmoadg != null && istkbnxepwVarIobyxmoadg.lqeggnwhkg()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (zdlpuopuiu(request)) {
            return jyumaefscl();
        }
        if (j13 != -1) {
            return esjtqupxsv();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // rk.wkgbmnqykc
    public wwaezpbzkn zoijcleaow(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        if (!rk.eablkybsjg.zoijcleaow(response)) {
            return cqumvgiudr(0L);
        }
        if (yggfygwlhe(response)) {
            return iwizpuwonk(response.cdpycssgdh().gtknphoqwx());
        }
        long jBtonecajqb = rgvfuqvkyq.btonecajqb(response);
        return jBtonecajqb != -1 ? cqumvgiudr(jBtonecajqb) : lereixgezr();
    }

    public final void zynmafqrjb(yggfygwlhe headers, String requestLine) {
        zdlpuopuiu.btonecajqb(headers, "headers");
        zdlpuopuiu.btonecajqb(requestLine, "requestLine");
        if (this.f107192eablkybsjg != 0) {
            throw new IllegalStateException(("state: " + this.f107192eablkybsjg).toString());
        }
        this.f107197wkgbmnqykc.metgxyhuhe(requestLine).metgxyhuhe("\r\n");
        int size = headers.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f107197wkgbmnqykc.metgxyhuhe(headers.wkgbmnqykc(i13)).metgxyhuhe(": ").metgxyhuhe(headers.btonecajqb(i13)).metgxyhuhe("\r\n");
        }
        this.f107197wkgbmnqykc.metgxyhuhe("\r\n");
        this.f107192eablkybsjg = 1;
    }
}
