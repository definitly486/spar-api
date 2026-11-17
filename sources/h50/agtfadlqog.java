package h50;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f39436eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f39437gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vipkmwdibw.gtknphoqwx f39438iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f39439ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f39440wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f39441zoijcleaow;

    public /* synthetic */ agtfadlqog(vipkmwdibw.gtknphoqwx gtknphoqwxVar, int i13, float f13, List list, List list2, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(gtknphoqwxVar, i13, f13, list, list2, f14);
    }

    public static /* synthetic */ agtfadlqog zoijcleaow(agtfadlqog agtfadlqogVar, vipkmwdibw.gtknphoqwx gtknphoqwxVar, int i13, float f13, List list, List list2, float f14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            gtknphoqwxVar = agtfadlqogVar.f39438iobyxmoadg;
        }
        if ((i14 & 2) != 0) {
            i13 = agtfadlqogVar.f39441zoijcleaow;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            f13 = agtfadlqogVar.f39439ppxfxbqfkf;
        }
        float f15 = f13;
        if ((i14 & 8) != 0) {
            list = agtfadlqogVar.f39440wkgbmnqykc;
        }
        List list3 = list;
        if ((i14 & 16) != 0) {
            list2 = agtfadlqogVar.f39436eablkybsjg;
        }
        List list4 = list2;
        if ((i14 & 32) != 0) {
            f14 = agtfadlqogVar.f39437gxszxtbevo;
        }
        return agtfadlqogVar.iobyxmoadg(gtknphoqwxVar, i15, f15, list3, list4, f14);
    }

    public final float eablkybsjg() {
        return this.f39439ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f39438iobyxmoadg, agtfadlqogVar.f39438iobyxmoadg) && androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(this.f39441zoijcleaow, agtfadlqogVar.f39441zoijcleaow) && Float.compare(this.f39439ppxfxbqfkf, agtfadlqogVar.f39439ppxfxbqfkf) == 0 && zdlpuopuiu.eablkybsjg(this.f39440wkgbmnqykc, agtfadlqogVar.f39440wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f39436eablkybsjg, agtfadlqogVar.f39436eablkybsjg) && w0.nufgyqmvbu.dxjokdxxww(this.f39437gxszxtbevo, agtfadlqogVar.f39437gxszxtbevo);
    }

    public final List gxszxtbevo() {
        return this.f39436eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f39438iobyxmoadg.hashCode() * 31) + androidx.compose.ui.graphics.ppxfxbqfkf.iozdgvuglv(this.f39441zoijcleaow)) * 31) + Float.hashCode(this.f39439ppxfxbqfkf)) * 31) + this.f39440wkgbmnqykc.hashCode()) * 31;
        List list = this.f39436eablkybsjg;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + w0.nufgyqmvbu.btonecajqb(this.f39437gxszxtbevo);
    }

    public final agtfadlqog iobyxmoadg(vipkmwdibw.gtknphoqwx animationSpec, int i13, float f13, List shaderColors, List list, float f14) {
        zdlpuopuiu.btonecajqb(animationSpec, "animationSpec");
        zdlpuopuiu.btonecajqb(shaderColors, "shaderColors");
        return new agtfadlqog(animationSpec, i13, f13, shaderColors, list, f14, null);
    }

    public final List lqeggnwhkg() {
        return this.f39440wkgbmnqykc;
    }

    public final float nufgyqmvbu() {
        return this.f39437gxszxtbevo;
    }

    public final vipkmwdibw.gtknphoqwx ppxfxbqfkf() {
        return this.f39438iobyxmoadg;
    }

    public String toString() {
        return "ShimmerTheme(animationSpec=" + this.f39438iobyxmoadg + ", blendMode=" + androidx.compose.ui.graphics.ppxfxbqfkf.lmojexxdyd(this.f39441zoijcleaow) + ", rotation=" + this.f39439ppxfxbqfkf + ", shaderColors=" + this.f39440wkgbmnqykc + ", shaderColorStops=" + this.f39436eablkybsjg + ", shimmerWidth=" + w0.nufgyqmvbu.gtknphoqwx(this.f39437gxszxtbevo) + ")";
    }

    public final int wkgbmnqykc() {
        return this.f39441zoijcleaow;
    }

    private agtfadlqog(vipkmwdibw.gtknphoqwx animationSpec, int i13, float f13, List shaderColors, List list, float f14) {
        zdlpuopuiu.btonecajqb(animationSpec, "animationSpec");
        zdlpuopuiu.btonecajqb(shaderColors, "shaderColors");
        this.f39438iobyxmoadg = animationSpec;
        this.f39441zoijcleaow = i13;
        this.f39439ppxfxbqfkf = f13;
        this.f39440wkgbmnqykc = shaderColors;
        this.f39436eablkybsjg = list;
        this.f39437gxszxtbevo = f14;
    }
}
