package o50;

import androidx.compose.ui.window.zdlpuopuiu;
import w0.agtfadlqog;
import w0.kcexrzcfyt;
import w0.oxmwwwfdhm;
import w0.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
final class zoijcleaow implements zdlpuopuiu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.draadjrbmk f72127eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a.eablkybsjg f72128iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f72129ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f72130wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f72131zoijcleaow;

    public /* synthetic */ zoijcleaow(a.eablkybsjg eablkybsjgVar, long j13, float f13, float f14, tg.draadjrbmk draadjrbmkVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(eablkybsjgVar, j13, f13, f14, draadjrbmkVar);
    }

    @Override // androidx.compose.ui.window.zdlpuopuiu
    public long iobyxmoadg(rgvfuqvkyq anchorBounds, long j13, w0.zdlpuopuiu layoutDirection, long j14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutDirection, "layoutDirection");
        long j15 = 0;
        long j16 = j15 << 32;
        long jWkgbmnqykc = agtfadlqog.wkgbmnqykc((j15 & 4294967295L) | j16);
        a.eablkybsjg eablkybsjgVar = this.f72128iobyxmoadg;
        oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = oxmwwwfdhm.f118270zoijcleaow;
        long jIobyxmoadg = eablkybsjgVar.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), oxmwwwfdhm.ppxfxbqfkf((((long) anchorBounds.eablkybsjg()) & 4294967295L) | (((long) anchorBounds.gtknphoqwx()) << 32)), layoutDirection);
        int i13 = (int) (j14 >> 32);
        long jIobyxmoadg2 = this.f72128iobyxmoadg.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), oxmwwwfdhm.ppxfxbqfkf((((long) i13) << 32) | (((long) ((int) (j14 & 4294967295L))) & 4294967295L)), layoutDirection);
        long jWflxmlrfwp = agtfadlqog.wflxmlrfwp(agtfadlqog.draadjrbmk(agtfadlqog.wflxmlrfwp(agtfadlqog.wflxmlrfwp(jWkgbmnqykc, agtfadlqog.wkgbmnqykc((((long) anchorBounds.gxszxtbevo()) << 32) | (((long) anchorBounds.dxjokdxxww()) & 4294967295L))), jIobyxmoadg), agtfadlqog.wkgbmnqykc((((long) agtfadlqog.btonecajqb(jIobyxmoadg2)) & 4294967295L) | (((long) agtfadlqog.dxjokdxxww(jIobyxmoadg2)) << 32))), agtfadlqog.wkgbmnqykc((((long) (agtfadlqog.dxjokdxxww(this.f72131zoijcleaow) * (layoutDirection == w0.zdlpuopuiu.Ltr ? 1 : -1))) << 32) | (((long) agtfadlqog.btonecajqb(this.f72131zoijcleaow)) & 4294967295L)));
        float f13 = this.f72129ppxfxbqfkf;
        int i14 = (int) (j13 >> 32);
        float f14 = i14 - f13;
        int iDxjokdxxww = agtfadlqog.dxjokdxxww(kcexrzcfyt.zoijcleaow(j14));
        float f15 = iDxjokdxxww;
        if (f15 <= f13 && f15 <= f14) {
            long jWkgbmnqykc2 = agtfadlqog.wkgbmnqykc((((long) (((int) this.f72129ppxfxbqfkf) - iDxjokdxxww)) << 32) | (((long) agtfadlqog.btonecajqb(jWflxmlrfwp)) & 4294967295L));
            this.f72127eablkybsjg.invoke(Float.valueOf(f15 - this.f72130wkgbmnqykc));
            return jWkgbmnqykc2;
        }
        if (i13 >= i14) {
            long jWkgbmnqykc3 = agtfadlqog.wkgbmnqykc((((long) (agtfadlqog.dxjokdxxww(kcexrzcfyt.zoijcleaow(j13)) - iDxjokdxxww)) << 32) | (((long) agtfadlqog.btonecajqb(jWflxmlrfwp)) & 4294967295L));
            this.f72127eablkybsjg.invoke(Float.valueOf((this.f72129ppxfxbqfkf - agtfadlqog.dxjokdxxww(jWkgbmnqykc3)) - this.f72130wkgbmnqykc));
            return jWkgbmnqykc3;
        }
        if (f15 > f14) {
            long jWkgbmnqykc4 = agtfadlqog.wkgbmnqykc((((long) ((int) this.f72129ppxfxbqfkf)) << 32) | (((long) agtfadlqog.btonecajqb(jWflxmlrfwp)) & 4294967295L));
            this.f72127eablkybsjg.invoke(Float.valueOf((f15 + (f15 - f14)) - this.f72130wkgbmnqykc));
            return jWkgbmnqykc4;
        }
        if (f15 <= f13) {
            this.f72127eablkybsjg.invoke(Float.valueOf(this.f72129ppxfxbqfkf - this.f72130wkgbmnqykc));
            return jWflxmlrfwp;
        }
        long jWkgbmnqykc5 = agtfadlqog.wkgbmnqykc(j16 | (((long) agtfadlqog.btonecajqb(jWflxmlrfwp)) & 4294967295L));
        this.f72127eablkybsjg.invoke(Float.valueOf(this.f72129ppxfxbqfkf - this.f72130wkgbmnqykc));
        return jWkgbmnqykc5;
    }

    private zoijcleaow(a.eablkybsjg alignment, long j13, float f13, float f14, tg.draadjrbmk onArrowPositionX) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(alignment, "alignment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onArrowPositionX, "onArrowPositionX");
        this.f72128iobyxmoadg = alignment;
        this.f72131zoijcleaow = j13;
        this.f72129ppxfxbqfkf = f13;
        this.f72130wkgbmnqykc = f14;
        this.f72127eablkybsjg = onArrowPositionX;
    }
}
