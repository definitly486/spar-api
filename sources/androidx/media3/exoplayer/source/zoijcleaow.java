package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.uwvvkdfqfp;
import f3.hkdspvbjdz;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements vdvldrhtss, vdvldrhtss.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    long f11334cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    long f11335esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f11336iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private iobyxmoadg[] f11337jyumaefscl = new iobyxmoadg[0];

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f11338lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private vdvldrhtss.iobyxmoadg f11339yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final vdvldrhtss f11340zdlpuopuiu;

    private final class iobyxmoadg implements m3.oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final m3.oxmwwwfdhm f11341iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f11343zoijcleaow;

        public iobyxmoadg(m3.oxmwwwfdhm oxmwwwfdhmVar) {
            this.f11341iobyxmoadg = oxmwwwfdhmVar;
        }

        public void eablkybsjg() {
            this.f11343zoijcleaow = false;
        }

        @Override // m3.oxmwwwfdhm
        public void iobyxmoadg() {
            this.f11341iobyxmoadg.iobyxmoadg();
        }

        @Override // m3.oxmwwwfdhm
        public boolean ppxfxbqfkf() {
            return !zoijcleaow.this.wflxmlrfwp() && this.f11341iobyxmoadg.ppxfxbqfkf();
        }

        @Override // m3.oxmwwwfdhm
        public int wkgbmnqykc(long j13) {
            if (zoijcleaow.this.wflxmlrfwp()) {
                return -3;
            }
            return this.f11341iobyxmoadg.wkgbmnqykc(j13);
        }

        @Override // m3.oxmwwwfdhm
        public int zoijcleaow(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13) {
            if (zoijcleaow.this.wflxmlrfwp()) {
                return -3;
            }
            if (this.f11343zoijcleaow) {
                decoderInputBuffer.agtfadlqog(4);
                return -4;
            }
            long jWkgbmnqykc = zoijcleaow.this.wkgbmnqykc();
            int iZoijcleaow = this.f11341iobyxmoadg.zoijcleaow(lmojexxdydVar, decoderInputBuffer, i13);
            if (iZoijcleaow == -5) {
                androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(lmojexxdydVar.f32682zoijcleaow);
                int i14 = iobyxmoadgVar.f9778wwaezpbzkn;
                if (i14 != 0 || iobyxmoadgVar.f9781ylkuphrtab != 0) {
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    if (zoijcleaowVar.f11334cqumvgiudr != 0) {
                        i14 = 0;
                    }
                    lmojexxdydVar.f32682zoijcleaow = iobyxmoadgVar.zoijcleaow().ribwqtqdhb(i14).vipkmwdibw(zoijcleaowVar.f11335esjtqupxsv == Long.MIN_VALUE ? iobyxmoadgVar.f9781ylkuphrtab : 0).cllcsxoeiz();
                }
                return -5;
            }
            long j13 = zoijcleaow.this.f11335esjtqupxsv;
            if (j13 == Long.MIN_VALUE || ((iZoijcleaow != -4 || decoderInputBuffer.f10020esjtqupxsv < j13) && !(iZoijcleaow == -3 && jWkgbmnqykc == Long.MIN_VALUE && !decoderInputBuffer.f10019cqumvgiudr))) {
                return iZoijcleaow;
            }
            decoderInputBuffer.gxszxtbevo();
            decoderInputBuffer.agtfadlqog(4);
            this.f11343zoijcleaow = true;
            return -4;
        }
    }

    public zoijcleaow(vdvldrhtss vdvldrhtssVar, boolean z13, long j13, long j14) {
        this.f11340zdlpuopuiu = vdvldrhtssVar;
        this.f11336iwizpuwonk = z13 ? j13 : -9223372036854775807L;
        this.f11334cqumvgiudr = j13;
        this.f11335esjtqupxsv = j14;
    }

    private static long gtknphoqwx(long j13, long j14, long j15) {
        long jMax = Math.max(j13, j14);
        return j15 != Long.MIN_VALUE ? Math.min(jMax, j15) : jMax;
    }

    private static boolean kcexrzcfyt(long j13, long j14, o3.esjtqupxsv[] esjtqupxsvVarArr) {
        if (j13 < j14) {
            return true;
        }
        if (j13 != 0) {
            for (o3.esjtqupxsv esjtqupxsvVar : esjtqupxsvVarArr) {
                if (esjtqupxsvVar != null) {
                    androidx.media3.common.iobyxmoadg iobyxmoadgVarDraadjrbmk = esjtqupxsvVar.draadjrbmk();
                    if (!v2.iwizpuwonk.iobyxmoadg(iobyxmoadgVarDraadjrbmk.f9769ojitshcjhn, iobyxmoadgVarDraadjrbmk.f9754gtknphoqwx)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private hkdspvbjdz nufgyqmvbu(long j13, hkdspvbjdz hkdspvbjdzVar) {
        long jRgvfuqvkyq = stevsuqkhv.rgvfuqvkyq(hkdspvbjdzVar.f32672iobyxmoadg, 0L, j13 - this.f11334cqumvgiudr);
        long j14 = hkdspvbjdzVar.f32673zoijcleaow;
        long j15 = this.f11335esjtqupxsv;
        long jRgvfuqvkyq2 = stevsuqkhv.rgvfuqvkyq(j14, 0L, j15 == Long.MIN_VALUE ? Long.MAX_VALUE : j15 - j13);
        return (jRgvfuqvkyq == hkdspvbjdzVar.f32672iobyxmoadg && jRgvfuqvkyq2 == hkdspvbjdzVar.f32673zoijcleaow) ? hkdspvbjdzVar : new hkdspvbjdz(jRgvfuqvkyq, jRgvfuqvkyq2);
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd.iobyxmoadg
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11339yggfygwlhe)).lqeggnwhkg(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long btonecajqb() {
        if (wflxmlrfwp()) {
            long j13 = this.f11336iwizpuwonk;
            this.f11336iwizpuwonk = -9223372036854775807L;
            long jBtonecajqb = btonecajqb();
            return jBtonecajqb != -9223372036854775807L ? jBtonecajqb : j13;
        }
        long jBtonecajqb2 = this.f11340zdlpuopuiu.btonecajqb();
        if (jBtonecajqb2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return gtknphoqwx(jBtonecajqb2, this.f11334cqumvgiudr, this.f11335esjtqupxsv);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void draadjrbmk() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f11338lereixgezr;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f11340zdlpuopuiu.draadjrbmk();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long dxjokdxxww(long j13) {
        this.f11336iwizpuwonk = -9223372036854775807L;
        for (iobyxmoadg iobyxmoadgVar : this.f11337jyumaefscl) {
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.eablkybsjg();
            }
        }
        return gtknphoqwx(this.f11340zdlpuopuiu.dxjokdxxww(j13), this.f11334cqumvgiudr, this.f11335esjtqupxsv);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
        this.f11340zdlpuopuiu.eablkybsjg(j13);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg
    public void gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
        if (this.f11338lereixgezr != null) {
            return;
        }
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11339yggfygwlhe)).gxszxtbevo(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        return this.f11340zdlpuopuiu.iobyxmoadg(uwvvkdfqfpVar);
    }

    public void jyumaefscl(long j13, long j14) {
        this.f11334cqumvgiudr = j13;
        this.f11335esjtqupxsv = j14;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        this.f11337jyumaefscl = new iobyxmoadg[oxmwwwfdhmVarArr.length];
        m3.oxmwwwfdhm[] oxmwwwfdhmVarArr2 = new m3.oxmwwwfdhm[oxmwwwfdhmVarArr.length];
        int i13 = 0;
        while (true) {
            m3.oxmwwwfdhm oxmwwwfdhmVar = null;
            if (i13 >= oxmwwwfdhmVarArr.length) {
                break;
            }
            iobyxmoadg[] iobyxmoadgVarArr = this.f11337jyumaefscl;
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVarArr[i13];
            iobyxmoadgVarArr[i13] = iobyxmoadgVar;
            if (iobyxmoadgVar != null) {
                oxmwwwfdhmVar = iobyxmoadgVar.f11341iobyxmoadg;
            }
            oxmwwwfdhmVarArr2[i13] = oxmwwwfdhmVar;
            i13++;
        }
        long jOjitshcjhn = this.f11340zdlpuopuiu.ojitshcjhn(esjtqupxsvVarArr, zArr, oxmwwwfdhmVarArr2, zArr2, j13);
        long jGtknphoqwx = gtknphoqwx(jOjitshcjhn, j13, this.f11335esjtqupxsv);
        this.f11336iwizpuwonk = (wflxmlrfwp() && kcexrzcfyt(jOjitshcjhn, j13, esjtqupxsvVarArr)) ? jGtknphoqwx : -9223372036854775807L;
        for (int i14 = 0; i14 < oxmwwwfdhmVarArr.length; i14++) {
            m3.oxmwwwfdhm oxmwwwfdhmVar2 = oxmwwwfdhmVarArr2[i14];
            if (oxmwwwfdhmVar2 == null) {
                this.f11337jyumaefscl[i14] = null;
            } else {
                iobyxmoadg[] iobyxmoadgVarArr2 = this.f11337jyumaefscl;
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVarArr2[i14];
                if (iobyxmoadgVar2 == null || iobyxmoadgVar2.f11341iobyxmoadg != oxmwwwfdhmVar2) {
                    iobyxmoadgVarArr2[i14] = new iobyxmoadg(oxmwwwfdhmVar2);
                }
            }
            oxmwwwfdhmVarArr[i14] = this.f11337jyumaefscl[i14];
        }
        return jGtknphoqwx;
    }

    public void oxmwwwfdhm(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f11338lereixgezr = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        return this.f11340zdlpuopuiu.ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        this.f11339yggfygwlhe = iobyxmoadgVar;
        this.f11340zdlpuopuiu.rgvfuqvkyq(this, j13);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        return this.f11340zdlpuopuiu.vdvldrhtss();
    }

    boolean wflxmlrfwp() {
        return this.f11336iwizpuwonk != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        long jWkgbmnqykc = this.f11340zdlpuopuiu.wkgbmnqykc();
        if (jWkgbmnqykc != Long.MIN_VALUE) {
            long j13 = this.f11335esjtqupxsv;
            if (j13 == Long.MIN_VALUE || jWkgbmnqykc < j13) {
                return jWkgbmnqykc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long yggfygwlhe(long j13, hkdspvbjdz hkdspvbjdzVar) {
        long j14 = this.f11334cqumvgiudr;
        if (j13 == j14) {
            return j14;
        }
        return this.f11340zdlpuopuiu.yggfygwlhe(j13, nufgyqmvbu(j13, hkdspvbjdzVar));
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void zdlpuopuiu(long j13, boolean z13) {
        this.f11340zdlpuopuiu.zdlpuopuiu(j13, z13);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        long jZoijcleaow = this.f11340zdlpuopuiu.zoijcleaow();
        if (jZoijcleaow != Long.MIN_VALUE) {
            long j13 = this.f11335esjtqupxsv;
            if (j13 == Long.MIN_VALUE || jZoijcleaow < j13) {
                return jZoijcleaow;
            }
        }
        return Long.MIN_VALUE;
    }
}
