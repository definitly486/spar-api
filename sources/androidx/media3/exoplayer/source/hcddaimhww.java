package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.uwvvkdfqfp;
import f3.hkdspvbjdz;

/* JADX INFO: loaded from: classes.dex */
final class hcddaimhww implements vdvldrhtss, vdvldrhtss.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private vdvldrhtss.iobyxmoadg f11155jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f11156yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final vdvldrhtss f11157zdlpuopuiu;

    private static final class iobyxmoadg implements m3.oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final m3.oxmwwwfdhm f11158iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f11159zoijcleaow;

        public iobyxmoadg(m3.oxmwwwfdhm oxmwwwfdhmVar, long j13) {
            this.f11158iobyxmoadg = oxmwwwfdhmVar;
            this.f11159zoijcleaow = j13;
        }

        public m3.oxmwwwfdhm eablkybsjg() {
            return this.f11158iobyxmoadg;
        }

        @Override // m3.oxmwwwfdhm
        public void iobyxmoadg() {
            this.f11158iobyxmoadg.iobyxmoadg();
        }

        @Override // m3.oxmwwwfdhm
        public boolean ppxfxbqfkf() {
            return this.f11158iobyxmoadg.ppxfxbqfkf();
        }

        @Override // m3.oxmwwwfdhm
        public int wkgbmnqykc(long j13) {
            return this.f11158iobyxmoadg.wkgbmnqykc(j13 - this.f11159zoijcleaow);
        }

        @Override // m3.oxmwwwfdhm
        public int zoijcleaow(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13) {
            int iZoijcleaow = this.f11158iobyxmoadg.zoijcleaow(lmojexxdydVar, decoderInputBuffer, i13);
            if (iZoijcleaow == -4) {
                decoderInputBuffer.f10020esjtqupxsv += this.f11159zoijcleaow;
            }
            return iZoijcleaow;
        }
    }

    public hcddaimhww(vdvldrhtss vdvldrhtssVar, long j13) {
        this.f11157zdlpuopuiu = vdvldrhtssVar;
        this.f11156yggfygwlhe = j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long btonecajqb() {
        long jBtonecajqb = this.f11157zdlpuopuiu.btonecajqb();
        if (jBtonecajqb == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f11156yggfygwlhe + jBtonecajqb;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void draadjrbmk() {
        this.f11157zdlpuopuiu.draadjrbmk();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long dxjokdxxww(long j13) {
        return this.f11157zdlpuopuiu.dxjokdxxww(j13 - this.f11156yggfygwlhe) + this.f11156yggfygwlhe;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
        this.f11157zdlpuopuiu.eablkybsjg(j13 - this.f11156yggfygwlhe);
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11155jyumaefscl)).lqeggnwhkg(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg
    public void gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11155jyumaefscl)).gxszxtbevo(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        return this.f11157zdlpuopuiu.iobyxmoadg(uwvvkdfqfpVar.iobyxmoadg().gxszxtbevo(uwvvkdfqfpVar.f11446iobyxmoadg - this.f11156yggfygwlhe).wkgbmnqykc());
    }

    public vdvldrhtss nufgyqmvbu() {
        return this.f11157zdlpuopuiu;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        m3.oxmwwwfdhm[] oxmwwwfdhmVarArr2 = new m3.oxmwwwfdhm[oxmwwwfdhmVarArr.length];
        int i13 = 0;
        while (true) {
            m3.oxmwwwfdhm oxmwwwfdhmVarEablkybsjg = null;
            if (i13 >= oxmwwwfdhmVarArr.length) {
                break;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) oxmwwwfdhmVarArr[i13];
            if (iobyxmoadgVar != null) {
                oxmwwwfdhmVarEablkybsjg = iobyxmoadgVar.eablkybsjg();
            }
            oxmwwwfdhmVarArr2[i13] = oxmwwwfdhmVarEablkybsjg;
            i13++;
        }
        long jOjitshcjhn = this.f11157zdlpuopuiu.ojitshcjhn(esjtqupxsvVarArr, zArr, oxmwwwfdhmVarArr2, zArr2, j13 - this.f11156yggfygwlhe);
        for (int i14 = 0; i14 < oxmwwwfdhmVarArr.length; i14++) {
            m3.oxmwwwfdhm oxmwwwfdhmVar = oxmwwwfdhmVarArr2[i14];
            if (oxmwwwfdhmVar == null) {
                oxmwwwfdhmVarArr[i14] = null;
            } else {
                m3.oxmwwwfdhm oxmwwwfdhmVar2 = oxmwwwfdhmVarArr[i14];
                if (oxmwwwfdhmVar2 == null || ((iobyxmoadg) oxmwwwfdhmVar2).eablkybsjg() != oxmwwwfdhmVar) {
                    oxmwwwfdhmVarArr[i14] = new iobyxmoadg(oxmwwwfdhmVar, this.f11156yggfygwlhe);
                }
            }
        }
        return jOjitshcjhn + this.f11156yggfygwlhe;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        return this.f11157zdlpuopuiu.ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        this.f11155jyumaefscl = iobyxmoadgVar;
        this.f11157zdlpuopuiu.rgvfuqvkyq(this, j13 - this.f11156yggfygwlhe);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        return this.f11157zdlpuopuiu.vdvldrhtss();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        long jWkgbmnqykc = this.f11157zdlpuopuiu.wkgbmnqykc();
        if (jWkgbmnqykc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f11156yggfygwlhe + jWkgbmnqykc;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long yggfygwlhe(long j13, hkdspvbjdz hkdspvbjdzVar) {
        return this.f11157zdlpuopuiu.yggfygwlhe(j13 - this.f11156yggfygwlhe, hkdspvbjdzVar) + this.f11156yggfygwlhe;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void zdlpuopuiu(long j13, boolean z13) {
        this.f11157zdlpuopuiu.zdlpuopuiu(j13 - this.f11156yggfygwlhe, z13);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        long jZoijcleaow = this.f11157zdlpuopuiu.zoijcleaow();
        if (jZoijcleaow == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f11156yggfygwlhe + jZoijcleaow;
    }
}
