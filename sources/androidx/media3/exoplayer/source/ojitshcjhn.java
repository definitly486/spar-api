package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.uwvvkdfqfp;
import f3.hkdspvbjdz;
import java.io.IOException;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn implements vdvldrhtss, vdvldrhtss.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private vdvldrhtss f11251cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private vdvldrhtss.iobyxmoadg f11252esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private oxmwwwfdhm f11253iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final p3.zoijcleaow f11254jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private iobyxmoadg f11255lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f11256pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f11257yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final oxmwwwfdhm.zoijcleaow f11258zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private long f11259zynmafqrjb = -9223372036854775807L;

    public interface iobyxmoadg {
        void iobyxmoadg(oxmwwwfdhm.zoijcleaow zoijcleaowVar, IOException iOException);

        void zoijcleaow(oxmwwwfdhm.zoijcleaow zoijcleaowVar);
    }

    public ojitshcjhn(oxmwwwfdhm.zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13) {
        this.f11258zdlpuopuiu = zoijcleaowVar;
        this.f11254jyumaefscl = zoijcleaowVar2;
        this.f11257yggfygwlhe = j13;
    }

    private long agtfadlqog(long j13) {
        long j14 = this.f11259zynmafqrjb;
        return j14 != -9223372036854775807L ? j14 : j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long btonecajqb() {
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).btonecajqb();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void draadjrbmk() throws IOException {
        try {
            vdvldrhtss vdvldrhtssVar = this.f11251cqumvgiudr;
            if (vdvldrhtssVar != null) {
                vdvldrhtssVar.draadjrbmk();
            } else {
                oxmwwwfdhm oxmwwwfdhmVar = this.f11253iwizpuwonk;
                if (oxmwwwfdhmVar != null) {
                    oxmwwwfdhmVar.wflxmlrfwp();
                }
            }
        } catch (IOException e13) {
            iobyxmoadg iobyxmoadgVar = this.f11255lereixgezr;
            if (iobyxmoadgVar == null) {
                throw e13;
            }
            if (this.f11256pmvmpeiblj) {
                return;
            }
            this.f11256pmvmpeiblj = true;
            iobyxmoadgVar.iobyxmoadg(this.f11258zdlpuopuiu, e13);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long dxjokdxxww(long j13) {
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).dxjokdxxww(j13);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
        ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).eablkybsjg(j13);
    }

    public long gtknphoqwx() {
        return this.f11259zynmafqrjb;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg
    public void gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
        ((vdvldrhtss.iobyxmoadg) stevsuqkhv.nufgyqmvbu(this.f11252esjtqupxsv)).gxszxtbevo(this);
        iobyxmoadg iobyxmoadgVar = this.f11255lereixgezr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.zoijcleaow(this.f11258zdlpuopuiu);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        vdvldrhtss vdvldrhtssVar = this.f11251cqumvgiudr;
        return vdvldrhtssVar != null && vdvldrhtssVar.iobyxmoadg(uwvvkdfqfpVar);
    }

    public void iwizpuwonk(oxmwwwfdhm oxmwwwfdhmVar) {
        y2.iobyxmoadg.lqeggnwhkg(this.f11253iwizpuwonk == null);
        this.f11253iwizpuwonk = oxmwwwfdhmVar;
    }

    public void jyumaefscl() {
        if (this.f11251cqumvgiudr != null) {
            ((oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f11253iwizpuwonk)).lqeggnwhkg(this.f11251cqumvgiudr);
        }
    }

    public void kcexrzcfyt(long j13) {
        this.f11259zynmafqrjb = j13;
    }

    public void nufgyqmvbu(oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        long jAgtfadlqog = agtfadlqog(this.f11257yggfygwlhe);
        vdvldrhtss vdvldrhtssVarRgvfuqvkyq = ((oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f11253iwizpuwonk)).rgvfuqvkyq(zoijcleaowVar, this.f11254jyumaefscl, jAgtfadlqog);
        this.f11251cqumvgiudr = vdvldrhtssVarRgvfuqvkyq;
        if (this.f11252esjtqupxsv != null) {
            vdvldrhtssVarRgvfuqvkyq.rgvfuqvkyq(this, jAgtfadlqog);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        long j14 = this.f11259zynmafqrjb;
        long j15 = (j14 == -9223372036854775807L || j13 != this.f11257yggfygwlhe) ? j13 : j14;
        this.f11259zynmafqrjb = -9223372036854775807L;
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).ojitshcjhn(esjtqupxsvVarArr, zArr, oxmwwwfdhmVarArr, zArr2, j15);
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public void lqeggnwhkg(vdvldrhtss vdvldrhtssVar) {
        ((vdvldrhtss.iobyxmoadg) stevsuqkhv.nufgyqmvbu(this.f11252esjtqupxsv)).lqeggnwhkg(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        vdvldrhtss vdvldrhtssVar = this.f11251cqumvgiudr;
        return vdvldrhtssVar != null && vdvldrhtssVar.ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        this.f11252esjtqupxsv = iobyxmoadgVar;
        vdvldrhtss vdvldrhtssVar = this.f11251cqumvgiudr;
        if (vdvldrhtssVar != null) {
            vdvldrhtssVar.rgvfuqvkyq(this, agtfadlqog(this.f11257yggfygwlhe));
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).vdvldrhtss();
    }

    public long wflxmlrfwp() {
        return this.f11257yggfygwlhe;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).wkgbmnqykc();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long yggfygwlhe(long j13, hkdspvbjdz hkdspvbjdzVar) {
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).yggfygwlhe(j13, hkdspvbjdzVar);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void zdlpuopuiu(long j13, boolean z13) {
        ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).zdlpuopuiu(j13, z13);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        return ((vdvldrhtss) stevsuqkhv.nufgyqmvbu(this.f11251cqumvgiudr)).zoijcleaow();
    }
}
