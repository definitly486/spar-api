package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class ydmasvzmpa {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final boolean f11625btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final boolean f11626dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final long f11627eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final boolean f11628gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f11629iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final boolean f11630lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final boolean f11631nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f11632ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long f11633wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f11634zoijcleaow;

    ydmasvzmpa(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, long j14, long j15, long j16, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean z18 = true;
        y2.iobyxmoadg.iobyxmoadg(!z17 || z15);
        y2.iobyxmoadg.iobyxmoadg(!z16 || z15);
        if (z14 && (z15 || z16 || z17)) {
            z18 = false;
        }
        y2.iobyxmoadg.iobyxmoadg(z18);
        this.f11629iobyxmoadg = zoijcleaowVar;
        this.f11634zoijcleaow = j13;
        this.f11632ppxfxbqfkf = j14;
        this.f11633wkgbmnqykc = j15;
        this.f11627eablkybsjg = j16;
        this.f11628gxszxtbevo = z13;
        this.f11630lqeggnwhkg = z14;
        this.f11631nufgyqmvbu = z15;
        this.f11626dxjokdxxww = z16;
        this.f11625btonecajqb = z17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ydmasvzmpa.class != obj.getClass()) {
            return false;
        }
        ydmasvzmpa ydmasvzmpaVar = (ydmasvzmpa) obj;
        return this.f11634zoijcleaow == ydmasvzmpaVar.f11634zoijcleaow && this.f11632ppxfxbqfkf == ydmasvzmpaVar.f11632ppxfxbqfkf && this.f11633wkgbmnqykc == ydmasvzmpaVar.f11633wkgbmnqykc && this.f11627eablkybsjg == ydmasvzmpaVar.f11627eablkybsjg && this.f11628gxszxtbevo == ydmasvzmpaVar.f11628gxszxtbevo && this.f11630lqeggnwhkg == ydmasvzmpaVar.f11630lqeggnwhkg && this.f11631nufgyqmvbu == ydmasvzmpaVar.f11631nufgyqmvbu && this.f11626dxjokdxxww == ydmasvzmpaVar.f11626dxjokdxxww && this.f11625btonecajqb == ydmasvzmpaVar.f11625btonecajqb && Objects.equals(this.f11629iobyxmoadg, ydmasvzmpaVar.f11629iobyxmoadg);
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f11629iobyxmoadg.hashCode()) * 31) + ((int) this.f11634zoijcleaow)) * 31) + ((int) this.f11632ppxfxbqfkf)) * 31) + ((int) this.f11633wkgbmnqykc)) * 31) + ((int) this.f11627eablkybsjg)) * 31) + (this.f11628gxszxtbevo ? 1 : 0)) * 31) + (this.f11630lqeggnwhkg ? 1 : 0)) * 31) + (this.f11631nufgyqmvbu ? 1 : 0)) * 31) + (this.f11626dxjokdxxww ? 1 : 0)) * 31) + (this.f11625btonecajqb ? 1 : 0);
    }

    public ydmasvzmpa iobyxmoadg(long j13) {
        return j13 == this.f11632ppxfxbqfkf ? this : new ydmasvzmpa(this.f11629iobyxmoadg, this.f11634zoijcleaow, j13, this.f11633wkgbmnqykc, this.f11627eablkybsjg, this.f11628gxszxtbevo, this.f11630lqeggnwhkg, this.f11631nufgyqmvbu, this.f11626dxjokdxxww, this.f11625btonecajqb);
    }

    public ydmasvzmpa zoijcleaow(long j13) {
        return j13 == this.f11634zoijcleaow ? this : new ydmasvzmpa(this.f11629iobyxmoadg, j13, this.f11632ppxfxbqfkf, this.f11633wkgbmnqykc, this.f11627eablkybsjg, this.f11628gxszxtbevo, this.f11630lqeggnwhkg, this.f11631nufgyqmvbu, this.f11626dxjokdxxww, this.f11625btonecajqb);
    }
}
