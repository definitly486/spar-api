package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import b3.draadjrbmk;
import b3.wflxmlrfwp;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements androidx.media3.datasource.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f9929agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private b3.lqeggnwhkg f9930btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg f9931draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Uri f9932dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c3.zoijcleaow f9933eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private b3.lqeggnwhkg f9934gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f9935gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Cache f9936iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f9937kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f9938lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f9939nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f9940ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f9941oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f9942ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private c3.ppxfxbqfkf f9943rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f9944vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f9945wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f9946wkgbmnqykc;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f9947zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f9948zoijcleaow;

    public static final class ppxfxbqfkf implements androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f9949eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f9950gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Cache f9951iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f9952lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f9953nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private b3.wkgbmnqykc.iobyxmoadg f9954ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f9956zoijcleaow = new FileDataSource.iobyxmoadg();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private c3.zoijcleaow f9955wkgbmnqykc = c3.zoijcleaow.f18645iobyxmoadg;

        private iobyxmoadg ppxfxbqfkf(androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
            b3.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
            Cache cache = (Cache) y2.iobyxmoadg.eablkybsjg(this.f9951iobyxmoadg);
            if (this.f9949eablkybsjg || iobyxmoadgVar == null) {
                wkgbmnqykcVarIobyxmoadg = null;
            } else {
                b3.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = this.f9954ppxfxbqfkf;
                wkgbmnqykcVarIobyxmoadg = iobyxmoadgVar2 != null ? iobyxmoadgVar2.iobyxmoadg() : new CacheDataSink.iobyxmoadg().zoijcleaow(cache).iobyxmoadg();
            }
            return new iobyxmoadg(cache, iobyxmoadgVar, this.f9956zoijcleaow.iobyxmoadg(), wkgbmnqykcVarIobyxmoadg, this.f9955wkgbmnqykc, i13, null, i14, null);
        }

        public ppxfxbqfkf eablkybsjg(int i13) {
            this.f9953nufgyqmvbu = i13;
            return this;
        }

        public ppxfxbqfkf gxszxtbevo(androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
            this.f9950gxszxtbevo = interfaceC0162iobyxmoadg;
            return this;
        }

        public ppxfxbqfkf wkgbmnqykc(Cache cache) {
            this.f9951iobyxmoadg = cache;
            return this;
        }

        @Override // androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg iobyxmoadg() {
            androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg = this.f9950gxszxtbevo;
            return ppxfxbqfkf(interfaceC0162iobyxmoadg != null ? interfaceC0162iobyxmoadg.iobyxmoadg() : null, this.f9953nufgyqmvbu, this.f9952lqeggnwhkg);
        }
    }

    public interface zoijcleaow {
    }

    private void cqumvgiudr(int i13) {
    }

    private void esjtqupxsv(b3.lqeggnwhkg lqeggnwhkgVar, boolean z13) throws InterruptedIOException {
        c3.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg;
        long jMin;
        b3.lqeggnwhkg lqeggnwhkgVarIobyxmoadg;
        androidx.media3.datasource.iobyxmoadg iobyxmoadgVar;
        String str = (String) stevsuqkhv.nufgyqmvbu(lqeggnwhkgVar.f15053dxjokdxxww);
        if (this.f9941oxmwwwfdhm) {
            ppxfxbqfkfVarLqeggnwhkg = null;
        } else if (this.f9935gxszxtbevo) {
            try {
                ppxfxbqfkfVarLqeggnwhkg = this.f9936iobyxmoadg.lqeggnwhkg(str, this.f9929agtfadlqog, this.f9940ojitshcjhn);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            ppxfxbqfkfVarLqeggnwhkg = this.f9936iobyxmoadg.wkgbmnqykc(str, this.f9929agtfadlqog, this.f9940ojitshcjhn);
        }
        if (ppxfxbqfkfVarLqeggnwhkg == null) {
            iobyxmoadgVar = this.f9946wkgbmnqykc;
            lqeggnwhkgVarIobyxmoadg = lqeggnwhkgVar.iobyxmoadg().nufgyqmvbu(this.f9929agtfadlqog).lqeggnwhkg(this.f9940ojitshcjhn).iobyxmoadg();
        } else if (ppxfxbqfkfVarLqeggnwhkg.f18641iwizpuwonk) {
            Uri uriFromFile = Uri.fromFile((File) stevsuqkhv.nufgyqmvbu(ppxfxbqfkfVarLqeggnwhkg.f18639cqumvgiudr));
            long j13 = ppxfxbqfkfVarLqeggnwhkg.f18643yggfygwlhe;
            long j14 = this.f9929agtfadlqog - j13;
            long jMin2 = ppxfxbqfkfVarLqeggnwhkg.f18642jyumaefscl - j14;
            long j15 = this.f9940ojitshcjhn;
            if (j15 != -1) {
                jMin2 = Math.min(jMin2, j15);
            }
            lqeggnwhkgVarIobyxmoadg = lqeggnwhkgVar.iobyxmoadg().dxjokdxxww(uriFromFile).gtknphoqwx(j13).nufgyqmvbu(j14).lqeggnwhkg(jMin2).iobyxmoadg();
            iobyxmoadgVar = this.f9948zoijcleaow;
        } else {
            if (ppxfxbqfkfVarLqeggnwhkg.ppxfxbqfkf()) {
                jMin = this.f9940ojitshcjhn;
            } else {
                jMin = ppxfxbqfkfVarLqeggnwhkg.f18642jyumaefscl;
                long j16 = this.f9940ojitshcjhn;
                if (j16 != -1) {
                    jMin = Math.min(jMin, j16);
                }
            }
            lqeggnwhkgVarIobyxmoadg = lqeggnwhkgVar.iobyxmoadg().nufgyqmvbu(this.f9929agtfadlqog).lqeggnwhkg(jMin).iobyxmoadg();
            iobyxmoadgVar = this.f9942ppxfxbqfkf;
            if (iobyxmoadgVar == null) {
                iobyxmoadgVar = this.f9946wkgbmnqykc;
                this.f9936iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarLqeggnwhkg);
                ppxfxbqfkfVarLqeggnwhkg = null;
            }
        }
        this.f9947zdlpuopuiu = (this.f9941oxmwwwfdhm || iobyxmoadgVar != this.f9946wkgbmnqykc) ? Long.MAX_VALUE : this.f9929agtfadlqog + 102400;
        if (z13) {
            y2.iobyxmoadg.lqeggnwhkg(kcexrzcfyt());
            if (iobyxmoadgVar == this.f9946wkgbmnqykc) {
                return;
            }
            try {
                rgvfuqvkyq();
            } catch (Throwable th2) {
                if (!((c3.ppxfxbqfkf) stevsuqkhv.nufgyqmvbu(ppxfxbqfkfVarLqeggnwhkg)).zoijcleaow()) {
                    throw th2;
                }
                this.f9936iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVarLqeggnwhkg);
                throw th2;
            }
        }
        if (ppxfxbqfkfVarLqeggnwhkg != null && ppxfxbqfkfVarLqeggnwhkg.zoijcleaow()) {
            this.f9943rgvfuqvkyq = ppxfxbqfkfVarLqeggnwhkg;
        }
        this.f9931draadjrbmk = iobyxmoadgVar;
        this.f9934gtknphoqwx = lqeggnwhkgVarIobyxmoadg;
        this.f9945wflxmlrfwp = 0L;
        long jIobyxmoadg = iobyxmoadgVar.iobyxmoadg(lqeggnwhkgVarIobyxmoadg);
        c3.eablkybsjg eablkybsjgVar = new c3.eablkybsjg();
        if (lqeggnwhkgVarIobyxmoadg.f15059nufgyqmvbu == -1 && jIobyxmoadg != -1) {
            this.f9940ojitshcjhn = jIobyxmoadg;
            c3.eablkybsjg.lqeggnwhkg(eablkybsjgVar, this.f9929agtfadlqog + jIobyxmoadg);
        }
        if (yggfygwlhe()) {
            Uri uriAgtfadlqog = iobyxmoadgVar.agtfadlqog();
            this.f9932dxjokdxxww = uriAgtfadlqog;
            c3.eablkybsjg.nufgyqmvbu(eablkybsjgVar, lqeggnwhkgVar.f15057iobyxmoadg.equals(uriAgtfadlqog) ? null : this.f9932dxjokdxxww);
        }
        if (jyumaefscl()) {
            this.f9936iobyxmoadg.eablkybsjg(str, eablkybsjgVar);
        }
    }

    private void iwizpuwonk() {
    }

    private boolean jyumaefscl() {
        return this.f9931draadjrbmk == this.f9942ppxfxbqfkf;
    }

    private boolean kcexrzcfyt() {
        return this.f9931draadjrbmk == this.f9946wkgbmnqykc;
    }

    private void lereixgezr(String str) {
        this.f9940ojitshcjhn = 0L;
        if (jyumaefscl()) {
            c3.eablkybsjg eablkybsjgVar = new c3.eablkybsjg();
            c3.eablkybsjg.lqeggnwhkg(eablkybsjgVar, this.f9929agtfadlqog);
            this.f9936iobyxmoadg.eablkybsjg(str, eablkybsjgVar);
        }
    }

    private void oxmwwwfdhm(Throwable th2) {
        if (zdlpuopuiu() || (th2 instanceof Cache.CacheException)) {
            this.f9944vdvldrhtss = true;
        }
    }

    private int pmvmpeiblj(b3.lqeggnwhkg lqeggnwhkgVar) {
        if (this.f9938lqeggnwhkg && this.f9944vdvldrhtss) {
            return 0;
        }
        return (this.f9939nufgyqmvbu && lqeggnwhkgVar.f15059nufgyqmvbu == -1) ? 1 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void rgvfuqvkyq() {
        androidx.media3.datasource.iobyxmoadg iobyxmoadgVar = this.f9931draadjrbmk;
        if (iobyxmoadgVar == null) {
            return;
        }
        try {
            iobyxmoadgVar.close();
        } finally {
            this.f9934gtknphoqwx = null;
            this.f9931draadjrbmk = null;
            c3.ppxfxbqfkf ppxfxbqfkfVar = this.f9943rgvfuqvkyq;
            if (ppxfxbqfkfVar != null) {
                this.f9936iobyxmoadg.ppxfxbqfkf(ppxfxbqfkfVar);
                this.f9943rgvfuqvkyq = null;
            }
        }
    }

    private static Uri vdvldrhtss(Cache cache, String str, Uri uri) {
        Uri uriZoijcleaow = c3.wkgbmnqykc.zoijcleaow(cache.zoijcleaow(str));
        return uriZoijcleaow != null ? uriZoijcleaow : uri;
    }

    private boolean yggfygwlhe() {
        return !zdlpuopuiu();
    }

    private boolean zdlpuopuiu() {
        return this.f9931draadjrbmk == this.f9948zoijcleaow;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f9932dxjokdxxww;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        this.f9930btonecajqb = null;
        this.f9932dxjokdxxww = null;
        this.f9929agtfadlqog = 0L;
        iwizpuwonk();
        try {
            rgvfuqvkyq();
        } catch (Throwable th2) {
            oxmwwwfdhm(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void eablkybsjg(wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.eablkybsjg(wflxmlrfwpVar);
        this.f9948zoijcleaow.eablkybsjg(wflxmlrfwpVar);
        this.f9946wkgbmnqykc.eablkybsjg(wflxmlrfwpVar);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(b3.lqeggnwhkg lqeggnwhkgVar) {
        try {
            String strPpxfxbqfkf = this.f9933eablkybsjg.ppxfxbqfkf(lqeggnwhkgVar);
            b3.lqeggnwhkg lqeggnwhkgVarIobyxmoadg = lqeggnwhkgVar.iobyxmoadg().gxszxtbevo(strPpxfxbqfkf).iobyxmoadg();
            this.f9930btonecajqb = lqeggnwhkgVarIobyxmoadg;
            this.f9932dxjokdxxww = vdvldrhtss(this.f9936iobyxmoadg, strPpxfxbqfkf, lqeggnwhkgVarIobyxmoadg.f15057iobyxmoadg);
            this.f9929agtfadlqog = lqeggnwhkgVar.f15058lqeggnwhkg;
            int iPmvmpeiblj = pmvmpeiblj(lqeggnwhkgVar);
            boolean z13 = iPmvmpeiblj != -1;
            this.f9941oxmwwwfdhm = z13;
            if (z13) {
                cqumvgiudr(iPmvmpeiblj);
            }
            if (this.f9941oxmwwwfdhm) {
                this.f9940ojitshcjhn = -1L;
            } else {
                long jIobyxmoadg = c3.wkgbmnqykc.iobyxmoadg(this.f9936iobyxmoadg.zoijcleaow(strPpxfxbqfkf));
                this.f9940ojitshcjhn = jIobyxmoadg;
                if (jIobyxmoadg != -1) {
                    long j13 = jIobyxmoadg - lqeggnwhkgVar.f15058lqeggnwhkg;
                    this.f9940ojitshcjhn = j13;
                    if (j13 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = lqeggnwhkgVar.f15059nufgyqmvbu;
            if (jMin != -1) {
                long j14 = this.f9940ojitshcjhn;
                if (j14 != -1) {
                    jMin = Math.min(j14, jMin);
                }
                this.f9940ojitshcjhn = jMin;
            }
            long j15 = this.f9940ojitshcjhn;
            if (j15 > 0 || j15 == -1) {
                esjtqupxsv(lqeggnwhkgVarIobyxmoadg, false);
            }
            long j16 = lqeggnwhkgVar.f15059nufgyqmvbu;
            return j16 != -1 ? j16 : this.f9940ojitshcjhn;
        } catch (Throwable th2) {
            oxmwwwfdhm(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Map wkgbmnqykc() {
        return yggfygwlhe() ? this.f9946wkgbmnqykc.wkgbmnqykc() : Collections.emptyMap();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:9:0x0021, B:11:0x0029, B:14:0x0030, B:16:0x0044, B:18:0x004a, B:19:0x0050, B:21:0x0061, B:22:0x0065, B:24:0x006b, B:26:0x0071, B:28:0x0077, B:29:0x0083, B:35:0x0091), top: B:39:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) {
        long j13;
        if (i14 == 0) {
            return 0;
        }
        if (this.f9940ojitshcjhn == 0) {
            return -1;
        }
        b3.lqeggnwhkg lqeggnwhkgVar = (b3.lqeggnwhkg) y2.iobyxmoadg.eablkybsjg(this.f9930btonecajqb);
        b3.lqeggnwhkg lqeggnwhkgVar2 = (b3.lqeggnwhkg) y2.iobyxmoadg.eablkybsjg(this.f9934gtknphoqwx);
        try {
            if (this.f9929agtfadlqog >= this.f9947zdlpuopuiu) {
                esjtqupxsv(lqeggnwhkgVar, true);
            }
            int iZoijcleaow = ((androidx.media3.datasource.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f9931draadjrbmk)).zoijcleaow(bArr, i13, i14);
            if (iZoijcleaow != -1) {
                if (zdlpuopuiu()) {
                    this.f9937kcexrzcfyt += (long) iZoijcleaow;
                }
                long j14 = iZoijcleaow;
                this.f9929agtfadlqog += j14;
                this.f9945wflxmlrfwp += j14;
                long j15 = this.f9940ojitshcjhn;
                if (j15 != -1) {
                    this.f9940ojitshcjhn = j15 - j14;
                }
            } else {
                if (!yggfygwlhe()) {
                    j13 = this.f9940ojitshcjhn;
                    if (j13 <= 0) {
                        if (j13 == -1) {
                        }
                    }
                    rgvfuqvkyq();
                    esjtqupxsv(lqeggnwhkgVar, false);
                    return zoijcleaow(bArr, i13, i14);
                }
                long j16 = lqeggnwhkgVar2.f15059nufgyqmvbu;
                if (j16 != -1 && this.f9945wflxmlrfwp >= j16) {
                    j13 = this.f9940ojitshcjhn;
                    if (j13 <= 0) {
                        if (j13 == -1) {
                        }
                    }
                    rgvfuqvkyq();
                    esjtqupxsv(lqeggnwhkgVar, false);
                    return zoijcleaow(bArr, i13, i14);
                }
                lereixgezr((String) stevsuqkhv.nufgyqmvbu(lqeggnwhkgVar.f15053dxjokdxxww));
            }
            return iZoijcleaow;
        } catch (Throwable th2) {
            oxmwwwfdhm(th2);
            throw th2;
        }
    }

    private iobyxmoadg(Cache cache, androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, androidx.media3.datasource.iobyxmoadg iobyxmoadgVar2, b3.wkgbmnqykc wkgbmnqykcVar, c3.zoijcleaow zoijcleaowVar, int i13, PriorityTaskManager priorityTaskManager, int i14, zoijcleaow zoijcleaowVar2) {
        this.f9936iobyxmoadg = cache;
        this.f9948zoijcleaow = iobyxmoadgVar2;
        this.f9933eablkybsjg = zoijcleaowVar == null ? c3.zoijcleaow.f18645iobyxmoadg : zoijcleaowVar;
        this.f9935gxszxtbevo = (i13 & 1) != 0;
        this.f9938lqeggnwhkg = (i13 & 2) != 0;
        this.f9939nufgyqmvbu = (i13 & 4) != 0;
        if (iobyxmoadgVar != null) {
            this.f9946wkgbmnqykc = iobyxmoadgVar;
            this.f9942ppxfxbqfkf = wkgbmnqykcVar != null ? new draadjrbmk(iobyxmoadgVar, wkgbmnqykcVar) : null;
        } else {
            this.f9946wkgbmnqykc = androidx.media3.datasource.gxszxtbevo.f9977iobyxmoadg;
            this.f9942ppxfxbqfkf = null;
        }
    }
}
