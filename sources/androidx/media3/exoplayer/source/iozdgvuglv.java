package androidx.media3.exoplayer.source;

import androidx.media3.common.DrmInitData;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Objects;
import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public class iozdgvuglv implements dsvhmnatus {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg f11173eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private wkgbmnqykc f11176gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f11177iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private long f11178iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f11179istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f11180iwizpuwonk;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f11182kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f11183lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f11184lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f11185lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private DrmSession f11186nufgyqmvbu;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f11188oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f11189pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f11191rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f11192vdvldrhtss;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.dxjokdxxww f11194wkgbmnqykc;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f11195yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f11199zynmafqrjb;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f11198zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f11172dxjokdxxww = 1000;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long[] f11168btonecajqb = new long[1000];

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long[] f11175gtknphoqwx = new long[1000];

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long[] f11167agtfadlqog = new long[1000];

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int[] f11193wflxmlrfwp = new int[1000];

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int[] f11171draadjrbmk = new int[1000];

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private dsvhmnatus.iobyxmoadg[] f11187ojitshcjhn = new dsvhmnatus.iobyxmoadg[1000];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f11190ppxfxbqfkf = new pkzmftpjix(new y2.wflxmlrfwp() { // from class: androidx.media3.exoplayer.source.yadqdtsiqt
        @Override // y2.wflxmlrfwp
        public final void accept(Object obj) {
            iozdgvuglv.wwaezpbzkn((iozdgvuglv.ppxfxbqfkf) obj);
        }
    });

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f11197zdlpuopuiu = Long.MIN_VALUE;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f11196yggfygwlhe = Long.MIN_VALUE;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f11181jyumaefscl = Long.MIN_VALUE;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f11174esjtqupxsv = true;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f11170cqumvgiudr = true;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f11169cdpycssgdh = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.media3.common.iobyxmoadg f11200iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.dxjokdxxww.zoijcleaow f11201zoijcleaow;

        private ppxfxbqfkf(androidx.media3.common.iobyxmoadg iobyxmoadgVar, androidx.media3.exoplayer.drm.dxjokdxxww.zoijcleaow zoijcleaowVar) {
            this.f11200iobyxmoadg = iobyxmoadgVar;
            this.f11201zoijcleaow = zoijcleaowVar;
        }
    }

    public interface wkgbmnqykc {
        void nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar);
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f11202iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public dsvhmnatus.iobyxmoadg f11203ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public long f11204zoijcleaow;

        zoijcleaow() {
        }
    }

    protected iozdgvuglv(p3.zoijcleaow zoijcleaowVar, androidx.media3.exoplayer.drm.dxjokdxxww dxjokdxxwwVar, androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        this.f11194wkgbmnqykc = dxjokdxxwwVar;
        this.f11173eablkybsjg = iobyxmoadgVar;
        this.f11177iobyxmoadg = new cdpycssgdh(zoijcleaowVar);
    }

    private synchronized long agtfadlqog() {
        int i13 = this.f11191rgvfuqvkyq;
        if (i13 == 0) {
            return -1L;
        }
        return ojitshcjhn(i13);
    }

    private synchronized void btonecajqb(long j13, int i13, long j14, int i14, dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
        try {
            int i15 = this.f11191rgvfuqvkyq;
            if (i15 > 0) {
                int iPmvmpeiblj = pmvmpeiblj(i15 - 1);
                y2.iobyxmoadg.iobyxmoadg(this.f11175gtknphoqwx[iPmvmpeiblj] + ((long) this.f11171draadjrbmk[iPmvmpeiblj]) <= j14);
            }
            this.f11180iwizpuwonk = (536870912 & i13) != 0;
            this.f11181jyumaefscl = Math.max(this.f11181jyumaefscl, j13);
            int iPmvmpeiblj2 = pmvmpeiblj(this.f11191rgvfuqvkyq);
            this.f11167agtfadlqog[iPmvmpeiblj2] = j13;
            this.f11175gtknphoqwx[iPmvmpeiblj2] = j14;
            this.f11171draadjrbmk[iPmvmpeiblj2] = i14;
            this.f11193wflxmlrfwp[iPmvmpeiblj2] = i13;
            this.f11187ojitshcjhn[iPmvmpeiblj2] = iobyxmoadgVar;
            this.f11168btonecajqb[iPmvmpeiblj2] = this.f11179istkbnxepw;
            if (this.f11190ppxfxbqfkf.lqeggnwhkg() || !((ppxfxbqfkf) this.f11190ppxfxbqfkf.gxszxtbevo()).f11200iobyxmoadg.equals(this.f11199zynmafqrjb)) {
                androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11199zynmafqrjb);
                androidx.media3.exoplayer.drm.dxjokdxxww dxjokdxxwwVar = this.f11194wkgbmnqykc;
                this.f11190ppxfxbqfkf.iobyxmoadg(cdpycssgdh(), new ppxfxbqfkf(iobyxmoadgVar2, dxjokdxxwwVar != null ? dxjokdxxwwVar.gxszxtbevo(this.f11173eablkybsjg, iobyxmoadgVar2) : androidx.media3.exoplayer.drm.dxjokdxxww.zoijcleaow.f10459iobyxmoadg));
            }
            int i16 = this.f11191rgvfuqvkyq + 1;
            this.f11191rgvfuqvkyq = i16;
            int i17 = this.f11172dxjokdxxww;
            if (i16 == i17) {
                int i18 = i17 + 1000;
                long[] jArr = new long[i18];
                long[] jArr2 = new long[i18];
                long[] jArr3 = new long[i18];
                int[] iArr = new int[i18];
                int[] iArr2 = new int[i18];
                dsvhmnatus.iobyxmoadg[] iobyxmoadgVarArr = new dsvhmnatus.iobyxmoadg[i18];
                int i19 = this.f11188oxmwwwfdhm;
                int i23 = i17 - i19;
                System.arraycopy(this.f11175gtknphoqwx, i19, jArr2, 0, i23);
                System.arraycopy(this.f11167agtfadlqog, this.f11188oxmwwwfdhm, jArr3, 0, i23);
                System.arraycopy(this.f11193wflxmlrfwp, this.f11188oxmwwwfdhm, iArr, 0, i23);
                System.arraycopy(this.f11171draadjrbmk, this.f11188oxmwwwfdhm, iArr2, 0, i23);
                System.arraycopy(this.f11187ojitshcjhn, this.f11188oxmwwwfdhm, iobyxmoadgVarArr, 0, i23);
                System.arraycopy(this.f11168btonecajqb, this.f11188oxmwwwfdhm, jArr, 0, i23);
                int i24 = this.f11188oxmwwwfdhm;
                System.arraycopy(this.f11175gtknphoqwx, 0, jArr2, i23, i24);
                System.arraycopy(this.f11167agtfadlqog, 0, jArr3, i23, i24);
                System.arraycopy(this.f11193wflxmlrfwp, 0, iArr, i23, i24);
                System.arraycopy(this.f11171draadjrbmk, 0, iArr2, i23, i24);
                System.arraycopy(this.f11187ojitshcjhn, 0, iobyxmoadgVarArr, i23, i24);
                System.arraycopy(this.f11168btonecajqb, 0, jArr, i23, i24);
                this.f11175gtknphoqwx = jArr2;
                this.f11167agtfadlqog = jArr3;
                this.f11193wflxmlrfwp = iArr;
                this.f11171draadjrbmk = iArr2;
                this.f11187ojitshcjhn = iobyxmoadgVarArr;
                this.f11168btonecajqb = jArr;
                this.f11188oxmwwwfdhm = 0;
                this.f11172dxjokdxxww = i18;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static iozdgvuglv draadjrbmk(p3.zoijcleaow zoijcleaowVar, androidx.media3.exoplayer.drm.dxjokdxxww dxjokdxxwwVar, androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        return new iozdgvuglv(zoijcleaowVar, (androidx.media3.exoplayer.drm.dxjokdxxww) y2.iobyxmoadg.eablkybsjg(dxjokdxxwwVar), (androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar));
    }

    private synchronized boolean dxjokdxxww(long j13) {
        if (this.f11191rgvfuqvkyq == 0) {
            return j13 > this.f11196yggfygwlhe;
        }
        if (cqumvgiudr() >= j13) {
            return false;
        }
        oxmwwwfdhm(this.f11192vdvldrhtss + gtknphoqwx(j13));
        return true;
    }

    private long esjtqupxsv(int i13) {
        long jMax = Long.MIN_VALUE;
        if (i13 == 0) {
            return Long.MIN_VALUE;
        }
        int iPmvmpeiblj = pmvmpeiblj(i13 - 1);
        for (int i14 = 0; i14 < i13; i14++) {
            jMax = Math.max(jMax, this.f11167agtfadlqog[iPmvmpeiblj]);
            if ((this.f11193wflxmlrfwp[iPmvmpeiblj] & 1) != 0) {
                break;
            }
            iPmvmpeiblj--;
            if (iPmvmpeiblj == -1) {
                iPmvmpeiblj = this.f11172dxjokdxxww - 1;
            }
        }
        return jMax;
    }

    private int gtknphoqwx(long j13) {
        int i13 = this.f11191rgvfuqvkyq;
        int iPmvmpeiblj = pmvmpeiblj(i13 - 1);
        while (i13 > this.f11182kcexrzcfyt && this.f11167agtfadlqog[iPmvmpeiblj] >= j13) {
            i13--;
            iPmvmpeiblj--;
            if (iPmvmpeiblj == -1) {
                iPmvmpeiblj = this.f11172dxjokdxxww - 1;
            }
        }
        return i13;
    }

    private void hcddaimhww(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.lmojexxdyd lmojexxdydVar) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f11185lqeggnwhkg;
        boolean z13 = iobyxmoadgVar2 == null;
        DrmInitData drmInitData = iobyxmoadgVar2 == null ? null : iobyxmoadgVar2.f9764kcexrzcfyt;
        this.f11185lqeggnwhkg = iobyxmoadgVar;
        DrmInitData drmInitData2 = iobyxmoadgVar.f9764kcexrzcfyt;
        androidx.media3.exoplayer.drm.dxjokdxxww dxjokdxxwwVar = this.f11194wkgbmnqykc;
        lmojexxdydVar.f32682zoijcleaow = dxjokdxxwwVar != null ? iobyxmoadgVar.ppxfxbqfkf(dxjokdxxwwVar.eablkybsjg(iobyxmoadgVar)) : iobyxmoadgVar;
        lmojexxdydVar.f32681iobyxmoadg = this.f11186nufgyqmvbu;
        if (this.f11194wkgbmnqykc == null) {
            return;
        }
        if (z13 || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f11186nufgyqmvbu;
            DrmSession drmSessionWkgbmnqykc = this.f11194wkgbmnqykc.wkgbmnqykc(this.f11173eablkybsjg, iobyxmoadgVar);
            this.f11186nufgyqmvbu = drmSessionWkgbmnqykc;
            lmojexxdydVar.f32681iobyxmoadg = drmSessionWkgbmnqykc;
            if (drmSession != null) {
                drmSession.nufgyqmvbu(this.f11173eablkybsjg);
            }
        }
    }

    private synchronized int jpowsppfya(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, boolean z13, boolean z14, zoijcleaow zoijcleaowVar) {
        try {
            decoderInputBuffer.f10019cqumvgiudr = false;
            if (!yadqdtsiqt()) {
                if (!z14 && !this.f11180iwizpuwonk) {
                    androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f11199zynmafqrjb;
                    if (iobyxmoadgVar == null || (!z13 && iobyxmoadgVar == this.f11185lqeggnwhkg)) {
                        return -3;
                    }
                    hcddaimhww((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar), lmojexxdydVar);
                    return -5;
                }
                decoderInputBuffer.agtfadlqog(4);
                decoderInputBuffer.f10020esjtqupxsv = Long.MIN_VALUE;
                return -4;
            }
            androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = ((ppxfxbqfkf) this.f11190ppxfxbqfkf.eablkybsjg(lereixgezr())).f11200iobyxmoadg;
            if (!z13 && iobyxmoadgVar2 == this.f11185lqeggnwhkg) {
                int iPmvmpeiblj = pmvmpeiblj(this.f11182kcexrzcfyt);
                if (!ylkuphrtab(iPmvmpeiblj)) {
                    decoderInputBuffer.f10019cqumvgiudr = true;
                    return -3;
                }
                decoderInputBuffer.agtfadlqog(this.f11193wflxmlrfwp[iPmvmpeiblj]);
                if (this.f11182kcexrzcfyt == this.f11191rgvfuqvkyq - 1 && (z14 || this.f11180iwizpuwonk)) {
                    decoderInputBuffer.eablkybsjg(536870912);
                }
                decoderInputBuffer.f10020esjtqupxsv = this.f11167agtfadlqog[iPmvmpeiblj];
                zoijcleaowVar.f11202iobyxmoadg = this.f11171draadjrbmk[iPmvmpeiblj];
                zoijcleaowVar.f11204zoijcleaow = this.f11175gtknphoqwx[iPmvmpeiblj];
                zoijcleaowVar.f11203ppxfxbqfkf = this.f11187ojitshcjhn[iPmvmpeiblj];
                return -4;
            }
            hcddaimhww(iobyxmoadgVar2, lmojexxdydVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private int kcexrzcfyt(int i13, int i14, long j13, boolean z13) {
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f11167agtfadlqog[i13] >= j13) {
                return i15;
            }
            i13++;
            if (i13 == this.f11172dxjokdxxww) {
                i13 = 0;
            }
        }
        if (z13) {
            return i14;
        }
        return -1;
    }

    private long ojitshcjhn(int i13) {
        this.f11196yggfygwlhe = Math.max(this.f11196yggfygwlhe, esjtqupxsv(i13));
        this.f11191rgvfuqvkyq -= i13;
        int i14 = this.f11192vdvldrhtss + i13;
        this.f11192vdvldrhtss = i14;
        int i15 = this.f11188oxmwwwfdhm + i13;
        this.f11188oxmwwwfdhm = i15;
        int i16 = this.f11172dxjokdxxww;
        if (i15 >= i16) {
            this.f11188oxmwwwfdhm = i15 - i16;
        }
        int i17 = this.f11182kcexrzcfyt - i13;
        this.f11182kcexrzcfyt = i17;
        if (i17 < 0) {
            this.f11182kcexrzcfyt = 0;
        }
        this.f11190ppxfxbqfkf.wkgbmnqykc(i14);
        if (this.f11191rgvfuqvkyq != 0) {
            return this.f11175gtknphoqwx[this.f11188oxmwwwfdhm];
        }
        int i18 = this.f11188oxmwwwfdhm;
        if (i18 == 0) {
            i18 = this.f11172dxjokdxxww;
        }
        int i19 = i18 - 1;
        return this.f11175gtknphoqwx[i19] + ((long) this.f11171draadjrbmk[i19]);
    }

    private long oxmwwwfdhm(int i13) {
        int iCdpycssgdh = cdpycssgdh() - i13;
        boolean z13 = false;
        y2.iobyxmoadg.iobyxmoadg(iCdpycssgdh >= 0 && iCdpycssgdh <= this.f11191rgvfuqvkyq - this.f11182kcexrzcfyt);
        int i14 = this.f11191rgvfuqvkyq - iCdpycssgdh;
        this.f11191rgvfuqvkyq = i14;
        this.f11181jyumaefscl = Math.max(this.f11196yggfygwlhe, esjtqupxsv(i14));
        if (iCdpycssgdh == 0 && this.f11180iwizpuwonk) {
            z13 = true;
        }
        this.f11180iwizpuwonk = z13;
        this.f11190ppxfxbqfkf.ppxfxbqfkf(i13);
        int i15 = this.f11191rgvfuqvkyq;
        if (i15 == 0) {
            return 0L;
        }
        int iPmvmpeiblj = pmvmpeiblj(i15 - 1);
        return this.f11175gtknphoqwx[iPmvmpeiblj] + ((long) this.f11171draadjrbmk[iPmvmpeiblj]);
    }

    private int pmvmpeiblj(int i13) {
        int i14 = this.f11188oxmwwwfdhm + i13;
        int i15 = this.f11172dxjokdxxww;
        return i14 < i15 ? i14 : i14 - i15;
    }

    private synchronized boolean sopmlzcsov(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        try {
            this.f11174esjtqupxsv = false;
            if (Objects.equals(iobyxmoadgVar, this.f11199zynmafqrjb)) {
                return false;
            }
            if (this.f11190ppxfxbqfkf.lqeggnwhkg() || !((ppxfxbqfkf) this.f11190ppxfxbqfkf.gxszxtbevo()).f11200iobyxmoadg.equals(iobyxmoadgVar)) {
                this.f11199zynmafqrjb = iobyxmoadgVar;
            } else {
                this.f11199zynmafqrjb = ((ppxfxbqfkf) this.f11190ppxfxbqfkf.gxszxtbevo()).f11200iobyxmoadg;
            }
            boolean z13 = this.f11169cdpycssgdh;
            androidx.media3.common.iobyxmoadg iobyxmoadgVar2 = this.f11199zynmafqrjb;
            this.f11169cdpycssgdh = z13 & v2.iwizpuwonk.iobyxmoadg(iobyxmoadgVar2.f9769ojitshcjhn, iobyxmoadgVar2.f9754gtknphoqwx);
            this.f11195yadqdtsiqt = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void tzroggbefp() {
        this.f11182kcexrzcfyt = 0;
        this.f11177iobyxmoadg.agtfadlqog();
    }

    private synchronized long wflxmlrfwp(long j13, boolean z13, boolean z14) {
        int i13;
        try {
            int i14 = this.f11191rgvfuqvkyq;
            if (i14 != 0) {
                long[] jArr = this.f11167agtfadlqog;
                int i15 = this.f11188oxmwwwfdhm;
                if (j13 >= jArr[i15]) {
                    if (z14 && (i13 = this.f11182kcexrzcfyt) != i14) {
                        i14 = i13 + 1;
                    }
                    int iZdlpuopuiu = zdlpuopuiu(i15, i14, j13, z13);
                    if (iZdlpuopuiu == -1) {
                        return -1L;
                    }
                    return ojitshcjhn(iZdlpuopuiu);
                }
            }
            return -1L;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wwaezpbzkn(ppxfxbqfkf ppxfxbqfkfVar) {
        ppxfxbqfkfVar.f11201zoijcleaow.release();
    }

    private void wypolnanlu() {
        DrmSession drmSession = this.f11186nufgyqmvbu;
        if (drmSession != null) {
            drmSession.nufgyqmvbu(this.f11173eablkybsjg);
            this.f11186nufgyqmvbu = null;
            this.f11185lqeggnwhkg = null;
        }
    }

    private boolean yadqdtsiqt() {
        return this.f11182kcexrzcfyt != this.f11191rgvfuqvkyq;
    }

    private boolean ylkuphrtab(int i13) {
        DrmSession drmSession = this.f11186nufgyqmvbu;
        return drmSession == null || drmSession.getState() == 4 || ((this.f11193wflxmlrfwp[i13] & 1073741824) == 0 && this.f11186nufgyqmvbu.zoijcleaow());
    }

    private int zdlpuopuiu(int i13, int i14, long j13, boolean z13) {
        int i15 = -1;
        for (int i16 = 0; i16 < i14; i16++) {
            long j14 = this.f11167agtfadlqog[i13];
            if (j14 > j13) {
                return i15;
            }
            if (!z13 || (this.f11193wflxmlrfwp[i13] & 1) != 0) {
                if (j14 == j13) {
                    return i16;
                }
                i15 = i16;
            }
            i13++;
            if (i13 == this.f11172dxjokdxxww) {
                i13 = 0;
            }
        }
        return i15;
    }

    public final int cdpycssgdh() {
        return this.f11192vdvldrhtss + this.f11191rgvfuqvkyq;
    }

    public int cllcsxoeiz(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13, boolean z13) {
        int iJpowsppfya = jpowsppfya(lmojexxdydVar, decoderInputBuffer, (i13 & 2) != 0, z13, this.f11198zoijcleaow);
        if (iJpowsppfya == -4 && !decoderInputBuffer.dxjokdxxww()) {
            boolean z14 = (i13 & 1) != 0;
            if ((i13 & 4) == 0) {
                if (z14) {
                    this.f11177iobyxmoadg.eablkybsjg(decoderInputBuffer, this.f11198zoijcleaow);
                } else {
                    this.f11177iobyxmoadg.draadjrbmk(decoderInputBuffer, this.f11198zoijcleaow);
                }
            }
            if (!z14) {
                this.f11182kcexrzcfyt++;
            }
        }
        return iJpowsppfya;
    }

    public final synchronized long cqumvgiudr() {
        return Math.max(this.f11196yggfygwlhe, esjtqupxsv(this.f11182kcexrzcfyt));
    }

    public final void crxdokpmqz(wkgbmnqykc wkgbmnqykcVar) {
        this.f11176gxszxtbevo = wkgbmnqykcVar;
    }

    public void dsvhmnatus() {
        kegysxyocb(true);
        wypolnanlu();
    }

    public void hkdspvbjdz() {
        vdvldrhtss();
        wypolnanlu();
    }

    @Override // t3.dsvhmnatus
    public final void iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe(iobyxmoadgVar);
        this.f11183lereixgezr = false;
        this.f11189pmvmpeiblj = iobyxmoadgVar;
        boolean zSopmlzcsov = sopmlzcsov(iobyxmoadgVarYggfygwlhe);
        wkgbmnqykc wkgbmnqykcVar = this.f11176gxszxtbevo;
        if (wkgbmnqykcVar == null || !zSopmlzcsov) {
            return;
        }
        wkgbmnqykcVar.nufgyqmvbu(iobyxmoadgVarYggfygwlhe);
    }

    public final synchronized boolean iozdgvuglv() {
        return this.f11180iwizpuwonk;
    }

    public final synchronized androidx.media3.common.iobyxmoadg istkbnxepw() {
        return this.f11174esjtqupxsv ? null : this.f11199zynmafqrjb;
    }

    public final synchronized long iwizpuwonk() {
        return this.f11181jyumaefscl;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void jlmebxxoox(int i13) {
        boolean z13;
        if (i13 >= 0) {
            try {
                if (this.f11182kcexrzcfyt + i13 <= this.f11191rgvfuqvkyq) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z13 = false;
        }
        y2.iobyxmoadg.iobyxmoadg(z13);
        this.f11182kcexrzcfyt += i13;
    }

    public final int jyumaefscl() {
        return this.f11192vdvldrhtss;
    }

    public void kegysxyocb(boolean z13) {
        this.f11177iobyxmoadg.wflxmlrfwp();
        this.f11191rgvfuqvkyq = 0;
        this.f11192vdvldrhtss = 0;
        this.f11188oxmwwwfdhm = 0;
        this.f11182kcexrzcfyt = 0;
        this.f11170cqumvgiudr = true;
        this.f11197zdlpuopuiu = Long.MIN_VALUE;
        this.f11196yggfygwlhe = Long.MIN_VALUE;
        this.f11181jyumaefscl = Long.MIN_VALUE;
        this.f11180iwizpuwonk = false;
        this.f11190ppxfxbqfkf.zoijcleaow();
        if (z13) {
            this.f11189pmvmpeiblj = null;
            this.f11199zynmafqrjb = null;
            this.f11174esjtqupxsv = true;
            this.f11169cdpycssgdh = true;
        }
    }

    public final int lereixgezr() {
        return this.f11192vdvldrhtss + this.f11182kcexrzcfyt;
    }

    public synchronized boolean lmojexxdyd(boolean z13) {
        androidx.media3.common.iobyxmoadg iobyxmoadgVar;
        boolean z14 = true;
        if (yadqdtsiqt()) {
            if (((ppxfxbqfkf) this.f11190ppxfxbqfkf.eablkybsjg(lereixgezr())).f11200iobyxmoadg != this.f11185lqeggnwhkg) {
                return true;
            }
            return ylkuphrtab(pmvmpeiblj(this.f11182kcexrzcfyt));
        }
        if (!z13 && !this.f11180iwizpuwonk && ((iobyxmoadgVar = this.f11199zynmafqrjb) == null || iobyxmoadgVar == this.f11185lqeggnwhkg)) {
            z14 = false;
        }
        return z14;
    }

    public final synchronized boolean mbcevpiqjq(int i13) {
        tzroggbefp();
        int i14 = this.f11192vdvldrhtss;
        if (i13 >= i14 && i13 <= this.f11191rgvfuqvkyq + i14) {
            this.f11197zdlpuopuiu = Long.MIN_VALUE;
            this.f11182kcexrzcfyt = i13 - i14;
            return true;
        }
        return false;
    }

    public final synchronized boolean ntlheqmsrt(long j13, boolean z13) {
        try {
            tzroggbefp();
            int iPmvmpeiblj = pmvmpeiblj(this.f11182kcexrzcfyt);
            if (yadqdtsiqt() && j13 >= this.f11167agtfadlqog[iPmvmpeiblj] && (j13 <= this.f11181jyumaefscl || z13)) {
                int iKcexrzcfyt = this.f11169cdpycssgdh ? kcexrzcfyt(iPmvmpeiblj, this.f11191rgvfuqvkyq - this.f11182kcexrzcfyt, j13, z13) : zdlpuopuiu(iPmvmpeiblj, this.f11191rgvfuqvkyq - this.f11182kcexrzcfyt, j13, true);
                if (iKcexrzcfyt == -1) {
                    return false;
                }
                this.f11197zdlpuopuiu = j13;
                this.f11182kcexrzcfyt += iKcexrzcfyt;
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void pkzmftpjix() throws DrmSession.DrmSessionException {
        DrmSession drmSession = this.f11186nufgyqmvbu;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) y2.iobyxmoadg.eablkybsjg(this.f11186nufgyqmvbu.wkgbmnqykc()));
        }
    }

    @Override // t3.dsvhmnatus
    public final int ppxfxbqfkf(v2.btonecajqb btonecajqbVar, int i13, boolean z13, int i14) {
        return this.f11177iobyxmoadg.ojitshcjhn(btonecajqbVar, i13, z13);
    }

    public final void rgvfuqvkyq(long j13, boolean z13, boolean z14) {
        this.f11177iobyxmoadg.zoijcleaow(wflxmlrfwp(j13, z13, z14));
    }

    public final void stevsuqkhv() {
        kegysxyocb(false);
    }

    public final void ulzqkzuiru(long j13) {
        this.f11197zdlpuopuiu = j13;
    }

    public final void vdvldrhtss() {
        this.f11177iobyxmoadg.zoijcleaow(agtfadlqog());
    }

    @Override // t3.dsvhmnatus
    public final void wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar, int i13, int i14) {
        this.f11177iobyxmoadg.rgvfuqvkyq(yadqdtsiqtVar, i13);
    }

    protected androidx.media3.common.iobyxmoadg yggfygwlhe(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return (this.f11178iozdgvuglv == 0 || iobyxmoadgVar.f9782zdlpuopuiu == Long.MAX_VALUE) ? iobyxmoadgVar : iobyxmoadgVar.zoijcleaow().uawqvzlxes(iobyxmoadgVar.f9782zdlpuopuiu + this.f11178iozdgvuglv).cllcsxoeiz();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    @Override // t3.dsvhmnatus
    public void zoijcleaow(long j13, int i13, int i14, int i15, dsvhmnatus.iobyxmoadg iobyxmoadgVar) {
        int i16;
        if (this.f11183lereixgezr) {
            iobyxmoadg((androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(this.f11189pmvmpeiblj));
        }
        int i17 = i13 & 1;
        boolean z13 = i17 != 0;
        if (this.f11170cqumvgiudr) {
            if (!z13) {
                return;
            } else {
                this.f11170cqumvgiudr = false;
            }
        }
        long j14 = this.f11178iozdgvuglv + j13;
        if (!this.f11169cdpycssgdh) {
            i16 = i13;
        } else {
            if (j14 < this.f11197zdlpuopuiu) {
                return;
            }
            if (i17 == 0) {
                if (!this.f11195yadqdtsiqt) {
                    y2.kcexrzcfyt.nufgyqmvbu("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f11199zynmafqrjb);
                    this.f11195yadqdtsiqt = true;
                }
                i16 = i13 | 1;
            } else {
                i16 = i13;
            }
        }
        if (this.f11184lmojexxdyd) {
            if (!z13 || !dxjokdxxww(j14)) {
                return;
            } else {
                this.f11184lmojexxdyd = false;
            }
        }
        btonecajqb(j14, i16, (this.f11177iobyxmoadg.wkgbmnqykc() - ((long) i14)) - ((long) i15), i14, iobyxmoadgVar);
    }

    public final synchronized int zynmafqrjb(long j13, boolean z13) {
        int iPmvmpeiblj = pmvmpeiblj(this.f11182kcexrzcfyt);
        if (yadqdtsiqt() && j13 >= this.f11167agtfadlqog[iPmvmpeiblj]) {
            if (j13 > this.f11181jyumaefscl && z13) {
                return this.f11191rgvfuqvkyq - this.f11182kcexrzcfyt;
            }
            int iZdlpuopuiu = zdlpuopuiu(iPmvmpeiblj, this.f11191rgvfuqvkyq - this.f11182kcexrzcfyt, j13, true);
            if (iZdlpuopuiu == -1) {
                return 0;
            }
            return iZdlpuopuiu;
        }
        return 0;
    }
}
