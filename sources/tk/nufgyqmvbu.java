package tk;

import bl.iozdgvuglv;
import bl.wwaezpbzkn;
import bl.ylkuphrtab;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.yggfygwlhe;
import mk.rgvfuqvkyq;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final iobyxmoadg f110887ojitshcjhn = new iobyxmoadg(null);

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private IOException f110888agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zoijcleaow f110889btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final wkgbmnqykc f110890draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ppxfxbqfkf f110891dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f110892eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final wkgbmnqykc f110893gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f110894gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f110895iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ArrayDeque f110896lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f110897nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f110898ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private tk.iobyxmoadg f110899wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f110900wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f110901zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public final class ppxfxbqfkf implements wwaezpbzkn {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private yggfygwlhe f110902cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private boolean f110903esjtqupxsv;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f110907yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final long f110908zdlpuopuiu;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final bl.ppxfxbqfkf f110905jyumaefscl = new bl.ppxfxbqfkf();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final bl.ppxfxbqfkf f110904iwizpuwonk = new bl.ppxfxbqfkf();

        public ppxfxbqfkf(long j13, boolean z13) {
            this.f110908zdlpuopuiu = j13;
            this.f110907yggfygwlhe = z13;
        }

        private final void ojitshcjhn(long j13) {
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            if (!rgvfuqvkyq.f67370eablkybsjg || !Thread.holdsLock(nufgyqmvbuVar)) {
                nufgyqmvbu.this.dxjokdxxww().ipoelvxyzq(j13);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nufgyqmvbuVar);
        }

        public final void agtfadlqog(yggfygwlhe yggfygwlheVar) {
            this.f110902cqumvgiudr = yggfygwlheVar;
        }

        public final void btonecajqb(bl.eablkybsjg source, long j13) throws EOFException {
            boolean z13;
            boolean z14;
            long jDsvhmnatus;
            zdlpuopuiu.btonecajqb(source, "source");
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(nufgyqmvbuVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nufgyqmvbuVar);
            }
            while (j13 > 0) {
                synchronized (nufgyqmvbu.this) {
                    z13 = this.f110907yggfygwlhe;
                    z14 = this.f110904iwizpuwonk.dsvhmnatus() + j13 > this.f110908zdlpuopuiu;
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                if (z14) {
                    source.wflxmlrfwp(j13);
                    nufgyqmvbu.this.lqeggnwhkg(tk.iobyxmoadg.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z13) {
                    source.wflxmlrfwp(j13);
                    return;
                }
                long jFmlbqenlif = source.fmlbqenlif(this.f110905jyumaefscl, j13);
                if (jFmlbqenlif == -1) {
                    throw new EOFException();
                }
                j13 -= jFmlbqenlif;
                nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbu.this;
                synchronized (nufgyqmvbuVar2) {
                    try {
                        if (this.f110903esjtqupxsv) {
                            jDsvhmnatus = this.f110905jyumaefscl.dsvhmnatus();
                            this.f110905jyumaefscl.iobyxmoadg();
                        } else {
                            boolean z15 = this.f110904iwizpuwonk.dsvhmnatus() == 0;
                            this.f110904iwizpuwonk.xrmfcynszj(this.f110905jyumaefscl);
                            if (z15) {
                                zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVar2, "null cannot be cast to non-null type java.lang.Object");
                                nufgyqmvbuVar2.notifyAll();
                            }
                            jDsvhmnatus = 0;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (jDsvhmnatus > 0) {
                    ojitshcjhn(jDsvhmnatus);
                }
            }
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long jDsvhmnatus;
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            synchronized (nufgyqmvbuVar) {
                this.f110903esjtqupxsv = true;
                jDsvhmnatus = this.f110904iwizpuwonk.dsvhmnatus();
                this.f110904iwizpuwonk.iobyxmoadg();
                zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVar, "null cannot be cast to non-null type java.lang.Object");
                nufgyqmvbuVar.notifyAll();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (jDsvhmnatus > 0) {
                ojitshcjhn(jDsvhmnatus);
            }
            nufgyqmvbu.this.ppxfxbqfkf();
        }

        public final void draadjrbmk(boolean z13) {
            this.f110907yggfygwlhe = z13;
        }

        public final yggfygwlhe dxjokdxxww() {
            return this.f110902cqumvgiudr;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0014, B:8:0x001a, B:41:0x00b6, B:42:0x00bd, B:56:0x00dc, B:57:0x00e3, B:12:0x0025, B:14:0x002b, B:16:0x002f, B:18:0x0035, B:22:0x0046, B:24:0x004a, B:26:0x0056, B:28:0x0078, B:30:0x008d, B:34:0x00a6, B:37:0x00ac, B:53:0x00d2, B:54:0x00d9), top: B:64:0x0014, inners: #0 }] */
        @Override // bl.wwaezpbzkn
        public long fmlbqenlif(bl.ppxfxbqfkf sink, long j13) throws IOException {
            IOException iOExceptionGtknphoqwx;
            long j14;
            boolean z13;
            long j15;
            zdlpuopuiu.btonecajqb(sink, "sink");
            long j16 = 0;
            if (j13 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
            }
            while (true) {
                nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
                synchronized (nufgyqmvbuVar) {
                    boolean zNufgyqmvbu = nufgyqmvbuVar.nufgyqmvbu();
                    if (zNufgyqmvbu) {
                        nufgyqmvbuVar.ojitshcjhn().jyumaefscl();
                    }
                    try {
                        if (nufgyqmvbuVar.btonecajqb() == null || this.f110907yggfygwlhe) {
                            iOExceptionGtknphoqwx = null;
                        } else {
                            iOExceptionGtknphoqwx = nufgyqmvbuVar.gtknphoqwx();
                            if (iOExceptionGtknphoqwx == null) {
                                tk.iobyxmoadg iobyxmoadgVarBtonecajqb = nufgyqmvbuVar.btonecajqb();
                                zdlpuopuiu.lqeggnwhkg(iobyxmoadgVarBtonecajqb);
                                iOExceptionGtknphoqwx = new StreamResetException(iobyxmoadgVarBtonecajqb);
                            }
                        }
                        if (this.f110903esjtqupxsv) {
                            throw new IOException("stream closed");
                        }
                        if (this.f110904iwizpuwonk.dsvhmnatus() > j16) {
                            bl.ppxfxbqfkf ppxfxbqfkfVar = this.f110904iwizpuwonk;
                            long jFmlbqenlif = ppxfxbqfkfVar.fmlbqenlif(sink, Math.min(j13, ppxfxbqfkfVar.dsvhmnatus()));
                            nufgyqmvbuVar.istkbnxepw(nufgyqmvbuVar.agtfadlqog() + jFmlbqenlif);
                            long jAgtfadlqog = nufgyqmvbuVar.agtfadlqog() - nufgyqmvbuVar.wflxmlrfwp();
                            if (iOExceptionGtknphoqwx == null) {
                                j15 = jFmlbqenlif;
                                if (jAgtfadlqog >= nufgyqmvbuVar.dxjokdxxww().mbcevpiqjq().ppxfxbqfkf() / 2) {
                                    nufgyqmvbuVar.dxjokdxxww().b(nufgyqmvbuVar.draadjrbmk(), jAgtfadlqog);
                                    nufgyqmvbuVar.zynmafqrjb(nufgyqmvbuVar.agtfadlqog());
                                }
                            } else {
                                j15 = jFmlbqenlif;
                            }
                            j14 = j15;
                        } else {
                            if (this.f110907yggfygwlhe || iOExceptionGtknphoqwx != null) {
                                j14 = -1;
                            } else {
                                nufgyqmvbuVar.lmojexxdyd();
                                z13 = true;
                                j14 = -1;
                            }
                            if (zNufgyqmvbu) {
                                nufgyqmvbuVar.ojitshcjhn().istkbnxepw();
                            }
                            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                        z13 = false;
                        if (zNufgyqmvbu) {
                            nufgyqmvbuVar.ojitshcjhn().istkbnxepw();
                        }
                        gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th2) {
                        if (zNufgyqmvbu) {
                            nufgyqmvbuVar.ojitshcjhn().istkbnxepw();
                        }
                        throw th2;
                    }
                    throw th;
                }
                if (!z13) {
                    if (j14 != -1) {
                        ojitshcjhn(j14);
                        return j14;
                    }
                    if (iOExceptionGtknphoqwx == null) {
                        return -1L;
                    }
                    throw iOExceptionGtknphoqwx;
                }
                j16 = 0;
            }
        }

        public final boolean iobyxmoadg() {
            return this.f110903esjtqupxsv;
        }

        public final bl.ppxfxbqfkf lqeggnwhkg() {
            return this.f110904iwizpuwonk;
        }

        public final bl.ppxfxbqfkf nufgyqmvbu() {
            return this.f110905jyumaefscl;
        }

        @Override // bl.wwaezpbzkn
        public ylkuphrtab ppxfxbqfkf() {
            return nufgyqmvbu.this.ojitshcjhn();
        }

        public final boolean wkgbmnqykc() {
            return this.f110907yggfygwlhe;
        }
    }

    public final class wkgbmnqykc extends bl.iobyxmoadg {
        public wkgbmnqykc() {
        }

        @Override // bl.iobyxmoadg
        protected IOException cqumvgiudr(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void istkbnxepw() throws IOException {
            if (iwizpuwonk()) {
                throw cqumvgiudr(null);
            }
        }

        @Override // bl.iobyxmoadg
        protected void zynmafqrjb() {
            nufgyqmvbu.this.lqeggnwhkg(tk.iobyxmoadg.CANCEL);
            nufgyqmvbu.this.dxjokdxxww().tbqsvytpvh();
        }
    }

    public final class zoijcleaow implements iozdgvuglv {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f110911iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private yggfygwlhe f110912jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final bl.ppxfxbqfkf f110913yggfygwlhe = new bl.ppxfxbqfkf();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f110914zdlpuopuiu;

        public zoijcleaow(boolean z13) {
            this.f110914zdlpuopuiu = z13;
        }

        private final void iobyxmoadg(boolean z13) throws IOException {
            long jMin;
            boolean z14;
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            synchronized (nufgyqmvbuVar) {
                try {
                    nufgyqmvbuVar.yggfygwlhe().jyumaefscl();
                    while (nufgyqmvbuVar.zdlpuopuiu() >= nufgyqmvbuVar.kcexrzcfyt() && !this.f110914zdlpuopuiu && !this.f110911iwizpuwonk && nufgyqmvbuVar.btonecajqb() == null) {
                        try {
                            nufgyqmvbuVar.lmojexxdyd();
                        } catch (Throwable th2) {
                            nufgyqmvbuVar.yggfygwlhe().istkbnxepw();
                            throw th2;
                        }
                    }
                    nufgyqmvbuVar.yggfygwlhe().istkbnxepw();
                    nufgyqmvbuVar.wkgbmnqykc();
                    jMin = Math.min(nufgyqmvbuVar.kcexrzcfyt() - nufgyqmvbuVar.zdlpuopuiu(), this.f110913yggfygwlhe.dsvhmnatus());
                    nufgyqmvbuVar.cdpycssgdh(nufgyqmvbuVar.zdlpuopuiu() + jMin);
                    z14 = z13 && jMin == this.f110913yggfygwlhe.dsvhmnatus();
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            nufgyqmvbu.this.yggfygwlhe().jyumaefscl();
            try {
                nufgyqmvbu.this.dxjokdxxww().mhtqkkgtqm(nufgyqmvbu.this.draadjrbmk(), z14, this.f110913yggfygwlhe, jMin);
            } finally {
                nufgyqmvbu.this.yggfygwlhe().istkbnxepw();
            }
        }

        @Override // bl.iozdgvuglv, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(nufgyqmvbuVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nufgyqmvbuVar);
            }
            nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbu.this;
            synchronized (nufgyqmvbuVar2) {
                if (this.f110911iwizpuwonk) {
                    return;
                }
                boolean z13 = nufgyqmvbuVar2.btonecajqb() == null;
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                if (!nufgyqmvbu.this.vdvldrhtss().f110914zdlpuopuiu) {
                    boolean z14 = this.f110913yggfygwlhe.dsvhmnatus() > 0;
                    if (this.f110912jyumaefscl != null) {
                        while (this.f110913yggfygwlhe.dsvhmnatus() > 0) {
                            iobyxmoadg(false);
                        }
                        eablkybsjg eablkybsjgVarDxjokdxxww = nufgyqmvbu.this.dxjokdxxww();
                        int iDraadjrbmk = nufgyqmvbu.this.draadjrbmk();
                        yggfygwlhe yggfygwlheVar = this.f110912jyumaefscl;
                        zdlpuopuiu.lqeggnwhkg(yggfygwlheVar);
                        eablkybsjgVarDxjokdxxww.ezmngbhpjk(iDraadjrbmk, z13, rgvfuqvkyq.vdvldrhtss(yggfygwlheVar));
                    } else if (z14) {
                        while (this.f110913yggfygwlhe.dsvhmnatus() > 0) {
                            iobyxmoadg(true);
                        }
                    } else if (z13) {
                        nufgyqmvbu.this.dxjokdxxww().mhtqkkgtqm(nufgyqmvbu.this.draadjrbmk(), true, null, 0L);
                    }
                }
                nufgyqmvbu nufgyqmvbuVar3 = nufgyqmvbu.this;
                synchronized (nufgyqmvbuVar3) {
                    this.f110911iwizpuwonk = true;
                    zdlpuopuiu.nufgyqmvbu(nufgyqmvbuVar3, "null cannot be cast to non-null type java.lang.Object");
                    nufgyqmvbuVar3.notifyAll();
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                nufgyqmvbu.this.dxjokdxxww().flush();
                nufgyqmvbu.this.ppxfxbqfkf();
            }
        }

        @Override // bl.iozdgvuglv, java.io.Flushable
        public void flush() throws IOException {
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(nufgyqmvbuVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nufgyqmvbuVar);
            }
            nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbu.this;
            synchronized (nufgyqmvbuVar2) {
                nufgyqmvbuVar2.wkgbmnqykc();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            while (this.f110913yggfygwlhe.dsvhmnatus() > 0) {
                iobyxmoadg(false);
                nufgyqmvbu.this.dxjokdxxww().flush();
            }
        }

        public final boolean lqeggnwhkg() {
            return this.f110914zdlpuopuiu;
        }

        @Override // bl.iozdgvuglv
        public ylkuphrtab ppxfxbqfkf() {
            return nufgyqmvbu.this.yggfygwlhe();
        }

        public final boolean wkgbmnqykc() {
            return this.f110911iwizpuwonk;
        }

        @Override // bl.iozdgvuglv
        public void zeieaojujs(bl.ppxfxbqfkf source, long j13) throws IOException {
            zdlpuopuiu.btonecajqb(source, "source");
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.this;
            if (!rgvfuqvkyq.f67370eablkybsjg || !Thread.holdsLock(nufgyqmvbuVar)) {
                this.f110913yggfygwlhe.zeieaojujs(source, j13);
                while (this.f110913yggfygwlhe.dsvhmnatus() >= 16384) {
                    iobyxmoadg(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nufgyqmvbuVar);
            }
        }
    }

    public nufgyqmvbu(int i13, eablkybsjg connection, boolean z13, boolean z14, yggfygwlhe yggfygwlheVar) {
        zdlpuopuiu.btonecajqb(connection, "connection");
        this.f110895iobyxmoadg = i13;
        this.f110901zoijcleaow = connection;
        this.f110894gxszxtbevo = connection.ntlheqmsrt().ppxfxbqfkf();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f110896lqeggnwhkg = arrayDeque;
        this.f110891dxjokdxxww = new ppxfxbqfkf(connection.mbcevpiqjq().ppxfxbqfkf(), z14);
        this.f110889btonecajqb = new zoijcleaow(z13);
        this.f110893gtknphoqwx = new wkgbmnqykc();
        this.f110890draadjrbmk = new wkgbmnqykc();
        if (yggfygwlheVar == null) {
            if (!jyumaefscl()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (jyumaefscl()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(yggfygwlheVar);
        }
    }

    private final boolean gxszxtbevo(tk.iobyxmoadg iobyxmoadgVar, IOException iOException) {
        if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f110899wflxmlrfwp != null) {
                return false;
            }
            if (this.f110891dxjokdxxww.wkgbmnqykc() && this.f110889btonecajqb.lqeggnwhkg()) {
                return false;
            }
            this.f110899wflxmlrfwp = iobyxmoadgVar;
            this.f110888agtfadlqog = iOException;
            zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            this.f110901zoijcleaow.nuxfzjnpeb(this.f110895iobyxmoadg);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean nufgyqmvbu() {
        return !this.f110901zoijcleaow.wwaezpbzkn() || this.f110889btonecajqb.wkgbmnqykc() || this.f110889btonecajqb.lqeggnwhkg();
    }

    public final long agtfadlqog() {
        return this.f110898ppxfxbqfkf;
    }

    public final synchronized tk.iobyxmoadg btonecajqb() {
        return this.f110899wflxmlrfwp;
    }

    public final void cdpycssgdh(long j13) {
        this.f110892eablkybsjg = j13;
    }

    public final ylkuphrtab cqumvgiudr() {
        return this.f110893gtknphoqwx;
    }

    public final int draadjrbmk() {
        return this.f110895iobyxmoadg;
    }

    public final eablkybsjg dxjokdxxww() {
        return this.f110901zoijcleaow;
    }

    public final void eablkybsjg(tk.iobyxmoadg rstStatusCode, IOException iOException) {
        zdlpuopuiu.btonecajqb(rstStatusCode, "rstStatusCode");
        if (gxszxtbevo(rstStatusCode, iOException)) {
            this.f110901zoijcleaow.krqnebusok(this.f110895iobyxmoadg, rstStatusCode);
        }
    }

    public final void esjtqupxsv(bl.eablkybsjg source, int i13) {
        zdlpuopuiu.btonecajqb(source, "source");
        if (!rgvfuqvkyq.f67370eablkybsjg || !Thread.holdsLock(this)) {
            this.f110891dxjokdxxww.btonecajqb(source, i13);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final IOException gtknphoqwx() {
        return this.f110888agtfadlqog;
    }

    public final synchronized yggfygwlhe iozdgvuglv() throws IOException {
        yggfygwlhe yggfygwlheVarDxjokdxxww;
        if (!this.f110891dxjokdxxww.wkgbmnqykc() || !this.f110891dxjokdxxww.nufgyqmvbu().n() || !this.f110891dxjokdxxww.lqeggnwhkg().n()) {
            if (this.f110899wflxmlrfwp == null) {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
            IOException iOException = this.f110888agtfadlqog;
            if (iOException != null) {
                throw iOException;
            }
            tk.iobyxmoadg iobyxmoadgVar = this.f110899wflxmlrfwp;
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            throw new StreamResetException(iobyxmoadgVar);
        }
        yggfygwlheVarDxjokdxxww = this.f110891dxjokdxxww.dxjokdxxww();
        if (yggfygwlheVarDxjokdxxww == null) {
            yggfygwlheVarDxjokdxxww = rgvfuqvkyq.f67372iobyxmoadg;
        }
        return yggfygwlheVarDxjokdxxww;
    }

    public final void istkbnxepw(long j13) {
        this.f110898ppxfxbqfkf = j13;
    }

    public final synchronized boolean iwizpuwonk() {
        try {
            if (this.f110899wflxmlrfwp != null) {
                return false;
            }
            if (this.f110891dxjokdxxww.wkgbmnqykc() || this.f110891dxjokdxxww.iobyxmoadg()) {
                if ((this.f110889btonecajqb.lqeggnwhkg() || this.f110889btonecajqb.wkgbmnqykc()) && this.f110897nufgyqmvbu) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean jyumaefscl() {
        return this.f110901zoijcleaow.wwaezpbzkn() == ((this.f110895iobyxmoadg & 1) == 1);
    }

    public final long kcexrzcfyt() {
        return this.f110894gxszxtbevo;
    }

    public final void lereixgezr(yggfygwlhe headers, boolean z13) {
        boolean zIwizpuwonk;
        zdlpuopuiu.btonecajqb(headers, "headers");
        if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f110897nufgyqmvbu && headers.iobyxmoadg(":status") == null && headers.iobyxmoadg(":method") == null) {
                    this.f110891dxjokdxxww.agtfadlqog(headers);
                } else {
                    this.f110897nufgyqmvbu = true;
                    this.f110896lqeggnwhkg.add(headers);
                }
                if (z13) {
                    this.f110891dxjokdxxww.draadjrbmk(true);
                }
                zIwizpuwonk = iwizpuwonk();
                zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zIwizpuwonk) {
            return;
        }
        this.f110901zoijcleaow.nuxfzjnpeb(this.f110895iobyxmoadg);
    }

    public final void lmojexxdyd() throws InterruptedIOException {
        try {
            zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void lqeggnwhkg(tk.iobyxmoadg errorCode) {
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        if (gxszxtbevo(errorCode, null)) {
            this.f110901zoijcleaow.a(this.f110895iobyxmoadg, errorCode);
        }
    }

    public final wkgbmnqykc ojitshcjhn() {
        return this.f110893gtknphoqwx;
    }

    public final ppxfxbqfkf oxmwwwfdhm() {
        return this.f110891dxjokdxxww;
    }

    public final synchronized void pmvmpeiblj(tk.iobyxmoadg errorCode) {
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        if (this.f110899wflxmlrfwp == null) {
            this.f110899wflxmlrfwp = errorCode;
            zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void ppxfxbqfkf() {
        boolean z13;
        boolean zIwizpuwonk;
        if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z13 = !this.f110891dxjokdxxww.wkgbmnqykc() && this.f110891dxjokdxxww.iobyxmoadg() && (this.f110889btonecajqb.lqeggnwhkg() || this.f110889btonecajqb.wkgbmnqykc());
                zIwizpuwonk = iwizpuwonk();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z13) {
            eablkybsjg(tk.iobyxmoadg.CANCEL, null);
        } else {
            if (zIwizpuwonk) {
                return;
            }
            this.f110901zoijcleaow.nuxfzjnpeb(this.f110895iobyxmoadg);
        }
    }

    public final iozdgvuglv rgvfuqvkyq() {
        synchronized (this) {
            try {
                if (!this.f110897nufgyqmvbu && !jyumaefscl()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f110889btonecajqb;
    }

    public final zoijcleaow vdvldrhtss() {
        return this.f110889btonecajqb;
    }

    public final long wflxmlrfwp() {
        return this.f110900wkgbmnqykc;
    }

    public final void wkgbmnqykc() throws IOException {
        if (this.f110889btonecajqb.wkgbmnqykc()) {
            throw new IOException("stream closed");
        }
        if (this.f110889btonecajqb.lqeggnwhkg()) {
            throw new IOException("stream finished");
        }
        if (this.f110899wflxmlrfwp != null) {
            IOException iOException = this.f110888agtfadlqog;
            if (iOException != null) {
                throw iOException;
            }
            tk.iobyxmoadg iobyxmoadgVar = this.f110899wflxmlrfwp;
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            throw new StreamResetException(iobyxmoadgVar);
        }
    }

    public final ylkuphrtab wwaezpbzkn() {
        return this.f110890draadjrbmk;
    }

    public final synchronized yggfygwlhe yadqdtsiqt(boolean z13) {
        Object objRemoveFirst;
        while (this.f110896lqeggnwhkg.isEmpty() && this.f110899wflxmlrfwp == null) {
            try {
                boolean z14 = z13 || nufgyqmvbu();
                if (z14) {
                    this.f110893gtknphoqwx.jyumaefscl();
                }
                try {
                    lmojexxdyd();
                    if (z14) {
                        this.f110893gtknphoqwx.istkbnxepw();
                    }
                } catch (Throwable th2) {
                    if (z14) {
                        this.f110893gtknphoqwx.istkbnxepw();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f110896lqeggnwhkg.isEmpty()) {
            IOException iOException = this.f110888agtfadlqog;
            if (iOException != null) {
                throw iOException;
            }
            tk.iobyxmoadg iobyxmoadgVar = this.f110899wflxmlrfwp;
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            throw new StreamResetException(iobyxmoadgVar);
        }
        objRemoveFirst = this.f110896lqeggnwhkg.removeFirst();
        zdlpuopuiu.dxjokdxxww(objRemoveFirst, "headersQueue.removeFirst()");
        return (yggfygwlhe) objRemoveFirst;
    }

    public final wkgbmnqykc yggfygwlhe() {
        return this.f110890draadjrbmk;
    }

    public final long zdlpuopuiu() {
        return this.f110892eablkybsjg;
    }

    public final void zoijcleaow(long j13) {
        this.f110894gxszxtbevo += j13;
        if (j13 > 0) {
            zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void zynmafqrjb(long j13) {
        this.f110900wkgbmnqykc = j13;
    }
}
