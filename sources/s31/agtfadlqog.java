package s31;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f105353eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f105354gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vipkmwdibw.gtknphoqwx f105355iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f105356ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f105357wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f105358zoijcleaow;

    public /* synthetic */ agtfadlqog(vipkmwdibw.gtknphoqwx gtknphoqwxVar, int i13, float f13, List list, List list2, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, i13, f13, list, list2, f14);
    }

    public static /* synthetic */ agtfadlqog zoijcleaow(agtfadlqog agtfadlqogVar, vipkmwdibw.gtknphoqwx gtknphoqwxVar, int i13, float f13, List list, List list2, float f14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            gtknphoqwxVar = agtfadlqogVar.f105355iobyxmoadg;
        }
        if ((i14 & 2) != 0) {
            i13 = agtfadlqogVar.f105358zoijcleaow;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            f13 = agtfadlqogVar.f105356ppxfxbqfkf;
        }
        float f15 = f13;
        if ((i14 & 8) != 0) {
            list = agtfadlqogVar.f105357wkgbmnqykc;
        }
        List list3 = list;
        if ((i14 & 16) != 0) {
            list2 = agtfadlqogVar.f105353eablkybsjg;
        }
        List list4 = list2;
        if ((i14 & 32) != 0) {
            f14 = agtfadlqogVar.f105354gxszxtbevo;
        }
        return agtfadlqogVar.iobyxmoadg(gtknphoqwxVar, i15, f15, list3, list4, f14);
    }

    public final float eablkybsjg() {
        return this.f105356ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f105355iobyxmoadg, agtfadlqogVar.f105355iobyxmoadg) && androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(this.f105358zoijcleaow, agtfadlqogVar.f105358zoijcleaow) && Float.compare(this.f105356ppxfxbqfkf, agtfadlqogVar.f105356ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f105357wkgbmnqykc, agtfadlqogVar.f105357wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f105353eablkybsjg, agtfadlqogVar.f105353eablkybsjg) && w0.nufgyqmvbu.dxjokdxxww(this.f105354gxszxtbevo, agtfadlqogVar.f105354gxszxtbevo);
    }

    public final List gxszxtbevo() {
        return this.f105353eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f105355iobyxmoadg.hashCode() * 31) + androidx.compose.ui.graphics.ppxfxbqfkf.iozdgvuglv(this.f105358zoijcleaow)) * 31) + Float.hashCode(this.f105356ppxfxbqfkf)) * 31) + this.f105357wkgbmnqykc.hashCode()) * 31;
        List list = this.f105353eablkybsjg;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + w0.nufgyqmvbu.btonecajqb(this.f105354gxszxtbevo);
    }

    public final agtfadlqog iobyxmoadg(vipkmwdibw.gtknphoqwx animationSpec, int i13, float f13, List shaderColors, List list, float f14) {
        zdlpuopuiu.btonecajqb(animationSpec, "animationSpec");
        zdlpuopuiu.btonecajqb(shaderColors, "shaderColors");
        return new agtfadlqog(animationSpec, i13, f13, shaderColors, list, f14, null);
    }

    public final List lqeggnwhkg() {
        return this.f105357wkgbmnqykc;
    }

    public final float nufgyqmvbu() {
        return this.f105354gxszxtbevo;
    }

    public final vipkmwdibw.gtknphoqwx ppxfxbqfkf() {
        return this.f105355iobyxmoadg;
    }

    public String toString() {
        return "ShimmerTheme(animationSpec=" + this.f105355iobyxmoadg + ", blendMode=" + androidx.compose.ui.graphics.ppxfxbqfkf.lmojexxdyd(this.f105358zoijcleaow) + ", rotation=" + this.f105356ppxfxbqfkf + ", shaderColors=" + this.f105357wkgbmnqykc + ", shaderColorStops=" + this.f105353eablkybsjg + ", shimmerWidth=" + w0.nufgyqmvbu.gtknphoqwx(this.f105354gxszxtbevo) + ")";
    }

    public final int wkgbmnqykc() {
        return this.f105358zoijcleaow;
    }

    private agtfadlqog(vipkmwdibw.gtknphoqwx animationSpec, int i13, float f13, List shaderColors, List list, float f14) {
        zdlpuopuiu.btonecajqb(animationSpec, "animationSpec");
        zdlpuopuiu.btonecajqb(shaderColors, "shaderColors");
        this.f105355iobyxmoadg = animationSpec;
        this.f105358zoijcleaow = i13;
        this.f105356ppxfxbqfkf = f13;
        this.f105357wkgbmnqykc = shaderColors;
        this.f105353eablkybsjg = list;
        this.f105354gxszxtbevo = f14;
    }
}
