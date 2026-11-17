package lm;

import bl.wwaezpbzkn;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import lk.cdpycssgdh;
import lk.yadqdtsiqt;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp implements lm.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private volatile boolean f63569cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private lk.eablkybsjg f63570esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gxszxtbevo f63571iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lk.eablkybsjg.iobyxmoadg f63572jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Throwable f63573lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f63574pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object[] f63575yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final oxmwwwfdhm f63576zdlpuopuiu;

    class iobyxmoadg implements lk.gxszxtbevo {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f63578zdlpuopuiu;

        iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            this.f63578zdlpuopuiu = wkgbmnqykcVar;
        }

        private void iobyxmoadg(Throwable th2) {
            try {
                this.f63578zdlpuopuiu.zoijcleaow(wflxmlrfwp.this, th2);
            } catch (Throwable th3) {
                cqumvgiudr.kcexrzcfyt(th3);
                th3.printStackTrace();
            }
        }

        @Override // lk.gxszxtbevo
        public void gxszxtbevo(lk.eablkybsjg eablkybsjgVar, IOException iOException) {
            iobyxmoadg(iOException);
        }

        @Override // lk.gxszxtbevo
        public void ppxfxbqfkf(lk.eablkybsjg eablkybsjgVar, cdpycssgdh cdpycssgdhVar) {
            try {
                try {
                    this.f63578zdlpuopuiu.iobyxmoadg(wflxmlrfwp.this, wflxmlrfwp.this.wkgbmnqykc(cdpycssgdhVar));
                } catch (Throwable th2) {
                    cqumvgiudr.kcexrzcfyt(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                cqumvgiudr.kcexrzcfyt(th3);
                iobyxmoadg(th3);
            }
        }
    }

    static final class ppxfxbqfkf extends yadqdtsiqt {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final long f63579iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final lk.cqumvgiudr f63580jyumaefscl;

        ppxfxbqfkf(lk.cqumvgiudr cqumvgiudrVar, long j13) {
            this.f63580jyumaefscl = cqumvgiudrVar;
            this.f63579iwizpuwonk = j13;
        }

        @Override // lk.yadqdtsiqt
        public bl.eablkybsjg draadjrbmk() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // lk.yadqdtsiqt
        public lk.cqumvgiudr dxjokdxxww() {
            return this.f63580jyumaefscl;
        }

        @Override // lk.yadqdtsiqt
        public long nufgyqmvbu() {
            return this.f63579iwizpuwonk;
        }
    }

    static final class zoijcleaow extends yadqdtsiqt {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        IOException f63581cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final bl.eablkybsjg f63582iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final yadqdtsiqt f63583jyumaefscl;

        class iobyxmoadg extends bl.draadjrbmk {
            iobyxmoadg(wwaezpbzkn wwaezpbzknVar) {
                super(wwaezpbzknVar);
            }

            @Override // bl.draadjrbmk, bl.wwaezpbzkn
            public long fmlbqenlif(bl.ppxfxbqfkf ppxfxbqfkfVar, long j13) throws IOException {
                try {
                    return super.fmlbqenlif(ppxfxbqfkfVar, j13);
                } catch (IOException e13) {
                    zoijcleaow.this.f63581cqumvgiudr = e13;
                    throw e13;
                }
            }
        }

        zoijcleaow(yadqdtsiqt yadqdtsiqtVar) {
            this.f63583jyumaefscl = yadqdtsiqtVar;
            this.f63582iwizpuwonk = bl.zdlpuopuiu.ppxfxbqfkf(new iobyxmoadg(yadqdtsiqtVar.draadjrbmk()));
        }

        @Override // lk.yadqdtsiqt, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f63583jyumaefscl.close();
        }

        @Override // lk.yadqdtsiqt
        public bl.eablkybsjg draadjrbmk() {
            return this.f63582iwizpuwonk;
        }

        @Override // lk.yadqdtsiqt
        public lk.cqumvgiudr dxjokdxxww() {
            return this.f63583jyumaefscl.dxjokdxxww();
        }

        @Override // lk.yadqdtsiqt
        public long nufgyqmvbu() {
            return this.f63583jyumaefscl.nufgyqmvbu();
        }

        void ojitshcjhn() throws IOException {
            IOException iOException = this.f63581cqumvgiudr;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    wflxmlrfwp(oxmwwwfdhm oxmwwwfdhmVar, Object[] objArr, lk.eablkybsjg.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        this.f63576zdlpuopuiu = oxmwwwfdhmVar;
        this.f63575yggfygwlhe = objArr;
        this.f63572jyumaefscl = iobyxmoadgVar;
        this.f63571iwizpuwonk = gxszxtbevoVar;
    }

    private lk.eablkybsjg ppxfxbqfkf() throws IOException {
        lk.eablkybsjg eablkybsjgVar = this.f63570esjtqupxsv;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        Throwable th2 = this.f63573lereixgezr;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            lk.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
            this.f63570esjtqupxsv = eablkybsjgVarZoijcleaow;
            return eablkybsjgVarZoijcleaow;
        } catch (IOException | Error | RuntimeException e13) {
            cqumvgiudr.kcexrzcfyt(e13);
            this.f63573lereixgezr = e13;
            throw e13;
        }
    }

    private lk.eablkybsjg zoijcleaow() {
        lk.eablkybsjg eablkybsjgVarIobyxmoadg = this.f63572jyumaefscl.iobyxmoadg(this.f63576zdlpuopuiu.iobyxmoadg(this.f63575yggfygwlhe));
        if (eablkybsjgVarIobyxmoadg != null) {
            return eablkybsjgVarIobyxmoadg;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // lm.zoijcleaow
    public boolean btonecajqb() {
        boolean z13 = true;
        if (this.f63569cqumvgiudr) {
            return true;
        }
        synchronized (this) {
            try {
                lk.eablkybsjg eablkybsjgVar = this.f63570esjtqupxsv;
                if (eablkybsjgVar == null || !eablkybsjgVar.btonecajqb()) {
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    @Override // lm.zoijcleaow
    public void cancel() {
        lk.eablkybsjg eablkybsjgVar;
        this.f63569cqumvgiudr = true;
        synchronized (this) {
            eablkybsjgVar = this.f63570esjtqupxsv;
        }
        if (eablkybsjgVar != null) {
            eablkybsjgVar.cancel();
        }
    }

    @Override // lm.zoijcleaow
    public synchronized zynmafqrjb dxjokdxxww() {
        try {
        } catch (IOException e13) {
            throw new RuntimeException("Unable to create request.", e13);
        }
        return ppxfxbqfkf().dxjokdxxww();
    }

    @Override // lm.zoijcleaow
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public wflxmlrfwp clone() {
        return new wflxmlrfwp(this.f63576zdlpuopuiu, this.f63575yggfygwlhe, this.f63572jyumaefscl, this.f63571iwizpuwonk);
    }

    @Override // lm.zoijcleaow
    public void m(wkgbmnqykc wkgbmnqykcVar) {
        lk.eablkybsjg eablkybsjgVar;
        Throwable th2;
        Objects.requireNonNull(wkgbmnqykcVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f63574pmvmpeiblj) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f63574pmvmpeiblj = true;
                eablkybsjgVar = this.f63570esjtqupxsv;
                th2 = this.f63573lereixgezr;
                if (eablkybsjgVar == null && th2 == null) {
                    try {
                        lk.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow();
                        this.f63570esjtqupxsv = eablkybsjgVarZoijcleaow;
                        eablkybsjgVar = eablkybsjgVarZoijcleaow;
                    } catch (Throwable th3) {
                        th2 = th3;
                        cqumvgiudr.kcexrzcfyt(th2);
                        this.f63573lereixgezr = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            wkgbmnqykcVar.zoijcleaow(this, th2);
            return;
        }
        if (this.f63569cqumvgiudr) {
            eablkybsjgVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eablkybsjgVar, new iobyxmoadg(wkgbmnqykcVar));
    }

    kcexrzcfyt wkgbmnqykc(cdpycssgdh cdpycssgdhVar) throws IOException {
        yadqdtsiqt yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc();
        cdpycssgdh cdpycssgdhVarPpxfxbqfkf = cdpycssgdhVar.cqumvgiudr().zoijcleaow(new ppxfxbqfkf(yadqdtsiqtVarWkgbmnqykc.dxjokdxxww(), yadqdtsiqtVarWkgbmnqykc.nufgyqmvbu())).ppxfxbqfkf();
        int iBtonecajqb = cdpycssgdhVarPpxfxbqfkf.btonecajqb();
        if (iBtonecajqb < 200 || iBtonecajqb >= 300) {
            try {
                return kcexrzcfyt.wkgbmnqykc(cqumvgiudr.iobyxmoadg(yadqdtsiqtVarWkgbmnqykc), cdpycssgdhVarPpxfxbqfkf);
            } finally {
                yadqdtsiqtVarWkgbmnqykc.close();
            }
        }
        if (iBtonecajqb == 204 || iBtonecajqb == 205) {
            yadqdtsiqtVarWkgbmnqykc.close();
            return kcexrzcfyt.gtknphoqwx(null, cdpycssgdhVarPpxfxbqfkf);
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(yadqdtsiqtVarWkgbmnqykc);
        try {
            return kcexrzcfyt.gtknphoqwx(this.f63571iwizpuwonk.convert(zoijcleaowVar), cdpycssgdhVarPpxfxbqfkf);
        } catch (RuntimeException e13) {
            zoijcleaowVar.ojitshcjhn();
            throw e13;
        }
    }
}
