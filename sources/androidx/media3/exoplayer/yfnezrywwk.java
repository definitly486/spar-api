package androidx.media3.exoplayer;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class yfnezrywwk {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private yfnezrywwk f11635agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean[] f11636btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final o3.cdpycssgdh f11637draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public boolean f11638dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public boolean f11639eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final hszhottldk[] f11640gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public boolean f11641gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.vdvldrhtss f11642iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public boolean f11643lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public ydmasvzmpa f11644nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private m3.iwizpuwonk f11645ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final m3.oxmwwwfdhm[] f11646ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private o3.yadqdtsiqt f11647rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private long f11648vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final dvvnrvtcbc f11649wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f11650wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Object f11651zoijcleaow;

    interface iobyxmoadg {
        yfnezrywwk iobyxmoadg(ydmasvzmpa ydmasvzmpaVar, long j13);
    }

    public yfnezrywwk(hszhottldk[] hszhottldkVarArr, long j13, o3.cdpycssgdh cdpycssgdhVar, p3.zoijcleaow zoijcleaowVar, dvvnrvtcbc dvvnrvtcbcVar, ydmasvzmpa ydmasvzmpaVar, o3.yadqdtsiqt yadqdtsiqtVar, long j14) {
        this.f11640gtknphoqwx = hszhottldkVarArr;
        this.f11648vdvldrhtss = j13;
        this.f11637draadjrbmk = cdpycssgdhVar;
        this.f11649wflxmlrfwp = dvvnrvtcbcVar;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = ydmasvzmpaVar.f11629iobyxmoadg;
        this.f11651zoijcleaow = zoijcleaowVar2.f11262iobyxmoadg;
        this.f11644nufgyqmvbu = ydmasvzmpaVar;
        this.f11650wkgbmnqykc = j14;
        this.f11645ojitshcjhn = m3.iwizpuwonk.f65035wkgbmnqykc;
        this.f11647rgvfuqvkyq = yadqdtsiqtVar;
        this.f11646ppxfxbqfkf = new m3.oxmwwwfdhm[hszhottldkVarArr.length];
        this.f11636btonecajqb = new boolean[hszhottldkVarArr.length];
        this.f11642iobyxmoadg = gxszxtbevo(zoijcleaowVar2, dvvnrvtcbcVar, zoijcleaowVar, ydmasvzmpaVar.f11634zoijcleaow, ydmasvzmpaVar.f11633wkgbmnqykc, ydmasvzmpaVar.f11628gxszxtbevo);
    }

    private void dxjokdxxww() {
        if (!yggfygwlhe()) {
            return;
        }
        int i13 = 0;
        while (true) {
            o3.yadqdtsiqt yadqdtsiqtVar = this.f11647rgvfuqvkyq;
            if (i13 >= yadqdtsiqtVar.f71902iobyxmoadg) {
                return;
            }
            boolean zPpxfxbqfkf = yadqdtsiqtVar.ppxfxbqfkf(i13);
            o3.esjtqupxsv esjtqupxsvVar = this.f11647rgvfuqvkyq.f71903ppxfxbqfkf[i13];
            if (zPpxfxbqfkf && esjtqupxsvVar != null) {
                esjtqupxsvVar.btonecajqb();
            }
            i13++;
        }
    }

    private static void esjtqupxsv(dvvnrvtcbc dvvnrvtcbcVar, androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar) {
        try {
            if (vdvldrhtssVar instanceof androidx.media3.exoplayer.source.zoijcleaow) {
                dvvnrvtcbcVar.lereixgezr(((androidx.media3.exoplayer.source.zoijcleaow) vdvldrhtssVar).f11340zdlpuopuiu);
            } else {
                dvvnrvtcbcVar.lereixgezr(vdvldrhtssVar);
            }
        } catch (RuntimeException e13) {
            y2.kcexrzcfyt.wkgbmnqykc("MediaPeriodHolder", "Period release failed.", e13);
        }
    }

    private static androidx.media3.exoplayer.source.vdvldrhtss gxszxtbevo(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, dvvnrvtcbc dvvnrvtcbcVar, p3.zoijcleaow zoijcleaowVar2, long j13, long j14, boolean z13) {
        androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVarNufgyqmvbu = dvvnrvtcbcVar.nufgyqmvbu(zoijcleaowVar, zoijcleaowVar2, j13);
        return j14 != -9223372036854775807L ? new androidx.media3.exoplayer.source.zoijcleaow(vdvldrhtssVarNufgyqmvbu, !z13, 0L, j14) : vdvldrhtssVarNufgyqmvbu;
    }

    private void lqeggnwhkg() {
        if (!yggfygwlhe()) {
            return;
        }
        int i13 = 0;
        while (true) {
            o3.yadqdtsiqt yadqdtsiqtVar = this.f11647rgvfuqvkyq;
            if (i13 >= yadqdtsiqtVar.f71902iobyxmoadg) {
                return;
            }
            boolean zPpxfxbqfkf = yadqdtsiqtVar.ppxfxbqfkf(i13);
            o3.esjtqupxsv esjtqupxsvVar = this.f11647rgvfuqvkyq.f71903ppxfxbqfkf[i13];
            if (zPpxfxbqfkf && esjtqupxsvVar != null) {
                esjtqupxsvVar.gxszxtbevo();
            }
            i13++;
        }
    }

    private void nufgyqmvbu(m3.oxmwwwfdhm[] oxmwwwfdhmVarArr) {
        int i13 = 0;
        while (true) {
            hszhottldk[] hszhottldkVarArr = this.f11640gtknphoqwx;
            if (i13 >= hszhottldkVarArr.length) {
                return;
            }
            if (hszhottldkVarArr[i13].dxjokdxxww() == -2) {
                oxmwwwfdhmVarArr[i13] = null;
            }
            i13++;
        }
    }

    private void ppxfxbqfkf(m3.oxmwwwfdhm[] oxmwwwfdhmVarArr) {
        int i13 = 0;
        while (true) {
            hszhottldk[] hszhottldkVarArr = this.f11640gtknphoqwx;
            if (i13 >= hszhottldkVarArr.length) {
                return;
            }
            if (hszhottldkVarArr[i13].dxjokdxxww() == -2 && this.f11647rgvfuqvkyq.ppxfxbqfkf(i13)) {
                oxmwwwfdhmVarArr[i13] = new m3.nufgyqmvbu();
            }
            i13++;
        }
    }

    private boolean yggfygwlhe() {
        return this.f11635agtfadlqog == null;
    }

    public long agtfadlqog() {
        return this.f11644nufgyqmvbu.f11634zoijcleaow + this.f11648vdvldrhtss;
    }

    public long btonecajqb() {
        if (!this.f11641gxszxtbevo) {
            return this.f11644nufgyqmvbu.f11634zoijcleaow;
        }
        long jWkgbmnqykc = this.f11643lqeggnwhkg ? this.f11642iobyxmoadg.wkgbmnqykc() : Long.MIN_VALUE;
        return jWkgbmnqykc == Long.MIN_VALUE ? this.f11644nufgyqmvbu.f11627eablkybsjg : jWkgbmnqykc;
    }

    public long cdpycssgdh(long j13) {
        return j13 + wflxmlrfwp();
    }

    public void cqumvgiudr() {
        lqeggnwhkg();
        esjtqupxsv(this.f11649wflxmlrfwp, this.f11642iobyxmoadg);
    }

    public long draadjrbmk() {
        if (this.f11641gxszxtbevo) {
            return this.f11642iobyxmoadg.zoijcleaow();
        }
        return 0L;
    }

    public void eablkybsjg(uwvvkdfqfp uwvvkdfqfpVar) {
        y2.iobyxmoadg.lqeggnwhkg(yggfygwlhe());
        this.f11642iobyxmoadg.iobyxmoadg(uwvvkdfqfpVar);
    }

    public yfnezrywwk gtknphoqwx() {
        return this.f11635agtfadlqog;
    }

    public long iobyxmoadg(o3.yadqdtsiqt yadqdtsiqtVar, long j13, boolean z13) {
        return zoijcleaow(yadqdtsiqtVar, j13, z13, new boolean[this.f11640gtknphoqwx.length]);
    }

    public long istkbnxepw(long j13) {
        return j13 - wflxmlrfwp();
    }

    public void iwizpuwonk(long j13) {
        y2.iobyxmoadg.lqeggnwhkg(yggfygwlhe());
        if (this.f11641gxszxtbevo) {
            this.f11642iobyxmoadg.eablkybsjg(istkbnxepw(j13));
        }
    }

    public void jyumaefscl(androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        this.f11639eablkybsjg = true;
        this.f11642iobyxmoadg.rgvfuqvkyq(iobyxmoadgVar, j13);
    }

    public boolean kcexrzcfyt() {
        return this.f11641gxszxtbevo && (!this.f11643lqeggnwhkg || this.f11642iobyxmoadg.wkgbmnqykc() == Long.MIN_VALUE);
    }

    public o3.yadqdtsiqt lereixgezr(float f13, v2.cdpycssgdh cdpycssgdhVar, boolean z13) {
        o3.yadqdtsiqt yadqdtsiqtVarGtknphoqwx = this.f11637draadjrbmk.gtknphoqwx(this.f11640gtknphoqwx, ojitshcjhn(), this.f11644nufgyqmvbu.f11629iobyxmoadg, cdpycssgdhVar);
        for (int i13 = 0; i13 < yadqdtsiqtVarGtknphoqwx.f71902iobyxmoadg; i13++) {
            boolean z14 = true;
            if (yadqdtsiqtVarGtknphoqwx.ppxfxbqfkf(i13)) {
                if (yadqdtsiqtVarGtknphoqwx.f71903ppxfxbqfkf[i13] == null && this.f11640gtknphoqwx[i13].dxjokdxxww() != -2) {
                    z14 = false;
                }
                y2.iobyxmoadg.lqeggnwhkg(z14);
            } else {
                y2.iobyxmoadg.lqeggnwhkg(yadqdtsiqtVarGtknphoqwx.f71903ppxfxbqfkf[i13] == null);
            }
        }
        for (o3.esjtqupxsv esjtqupxsvVar : yadqdtsiqtVarGtknphoqwx.f71903ppxfxbqfkf) {
            if (esjtqupxsvVar != null) {
                esjtqupxsvVar.wkgbmnqykc(f13);
                esjtqupxsvVar.dxjokdxxww(z13);
            }
        }
        return yadqdtsiqtVarGtknphoqwx;
    }

    public m3.iwizpuwonk ojitshcjhn() {
        return this.f11645ojitshcjhn;
    }

    public boolean oxmwwwfdhm() {
        try {
            if (this.f11641gxszxtbevo) {
                for (m3.oxmwwwfdhm oxmwwwfdhmVar : this.f11646ppxfxbqfkf) {
                    if (oxmwwwfdhmVar != null) {
                        oxmwwwfdhmVar.iobyxmoadg();
                    }
                }
            } else {
                this.f11642iobyxmoadg.draadjrbmk();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public void pmvmpeiblj(yfnezrywwk yfnezrywwkVar) {
        if (yfnezrywwkVar == this.f11635agtfadlqog) {
            return;
        }
        lqeggnwhkg();
        this.f11635agtfadlqog = yfnezrywwkVar;
        dxjokdxxww();
    }

    public o3.yadqdtsiqt rgvfuqvkyq() {
        return this.f11647rgvfuqvkyq;
    }

    public void vdvldrhtss(float f13, v2.cdpycssgdh cdpycssgdhVar, boolean z13) {
        this.f11641gxszxtbevo = true;
        this.f11645ojitshcjhn = this.f11642iobyxmoadg.vdvldrhtss();
        o3.yadqdtsiqt yadqdtsiqtVarLereixgezr = lereixgezr(f13, cdpycssgdhVar, z13);
        ydmasvzmpa ydmasvzmpaVar = this.f11644nufgyqmvbu;
        long jMax = ydmasvzmpaVar.f11634zoijcleaow;
        long j13 = ydmasvzmpaVar.f11627eablkybsjg;
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        long jIobyxmoadg = iobyxmoadg(yadqdtsiqtVarLereixgezr, jMax, false);
        long j14 = this.f11648vdvldrhtss;
        ydmasvzmpa ydmasvzmpaVar2 = this.f11644nufgyqmvbu;
        this.f11648vdvldrhtss = j14 + (ydmasvzmpaVar2.f11634zoijcleaow - jIobyxmoadg);
        this.f11644nufgyqmvbu = ydmasvzmpaVar2.zoijcleaow(jIobyxmoadg);
    }

    public long wflxmlrfwp() {
        return this.f11648vdvldrhtss;
    }

    public boolean wkgbmnqykc(ydmasvzmpa ydmasvzmpaVar) {
        if (zfvoamnweg.eablkybsjg(this.f11644nufgyqmvbu.f11627eablkybsjg, ydmasvzmpaVar.f11627eablkybsjg)) {
            ydmasvzmpa ydmasvzmpaVar2 = this.f11644nufgyqmvbu;
            if (ydmasvzmpaVar2.f11634zoijcleaow == ydmasvzmpaVar.f11634zoijcleaow && ydmasvzmpaVar2.f11629iobyxmoadg.equals(ydmasvzmpaVar.f11629iobyxmoadg)) {
                return true;
            }
        }
        return false;
    }

    public void yadqdtsiqt() {
        androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar = this.f11642iobyxmoadg;
        if (vdvldrhtssVar instanceof androidx.media3.exoplayer.source.zoijcleaow) {
            long j13 = this.f11644nufgyqmvbu.f11633wkgbmnqykc;
            if (j13 == -9223372036854775807L) {
                j13 = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.zoijcleaow) vdvldrhtssVar).jyumaefscl(0L, j13);
        }
    }

    public boolean zdlpuopuiu() {
        return this.f11641gxszxtbevo && (kcexrzcfyt() || btonecajqb() - this.f11644nufgyqmvbu.f11634zoijcleaow >= this.f11650wkgbmnqykc);
    }

    public long zoijcleaow(o3.yadqdtsiqt yadqdtsiqtVar, long j13, boolean z13, boolean[] zArr) {
        int i13 = 0;
        while (true) {
            boolean z14 = true;
            if (i13 >= yadqdtsiqtVar.f71902iobyxmoadg) {
                break;
            }
            boolean[] zArr2 = this.f11636btonecajqb;
            if (z13 || !yadqdtsiqtVar.zoijcleaow(this.f11647rgvfuqvkyq, i13)) {
                z14 = false;
            }
            zArr2[i13] = z14;
            i13++;
        }
        nufgyqmvbu(this.f11646ppxfxbqfkf);
        lqeggnwhkg();
        this.f11647rgvfuqvkyq = yadqdtsiqtVar;
        dxjokdxxww();
        long jOjitshcjhn = this.f11642iobyxmoadg.ojitshcjhn(yadqdtsiqtVar.f71903ppxfxbqfkf, this.f11636btonecajqb, this.f11646ppxfxbqfkf, zArr, j13);
        ppxfxbqfkf(this.f11646ppxfxbqfkf);
        this.f11643lqeggnwhkg = false;
        int i14 = 0;
        while (true) {
            m3.oxmwwwfdhm[] oxmwwwfdhmVarArr = this.f11646ppxfxbqfkf;
            if (i14 >= oxmwwwfdhmVarArr.length) {
                return jOjitshcjhn;
            }
            if (oxmwwwfdhmVarArr[i14] != null) {
                y2.iobyxmoadg.lqeggnwhkg(yadqdtsiqtVar.ppxfxbqfkf(i14));
                if (this.f11640gtknphoqwx[i14].dxjokdxxww() != -2) {
                    this.f11643lqeggnwhkg = true;
                }
            } else {
                y2.iobyxmoadg.lqeggnwhkg(yadqdtsiqtVar.f71903ppxfxbqfkf[i14] == null);
            }
            i14++;
        }
    }

    public void zynmafqrjb(long j13) {
        this.f11648vdvldrhtss = j13;
    }
}
