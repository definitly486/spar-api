package m91;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f66628wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66629iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f66630ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f66631zoijcleaow;

    public wkgbmnqykc(String str, List banners) {
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.f66629iobyxmoadg = str;
        this.f66631zoijcleaow = banners;
        this.f66630ppxfxbqfkf = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: m91.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.zoijcleaow(this.f66627zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cc1.iobyxmoadg zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        return cc1.gxszxtbevo.iobyxmoadg(wkgbmnqykcVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f66629iobyxmoadg, wkgbmnqykcVar.f66629iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66631zoijcleaow, wkgbmnqykcVar.f66631zoijcleaow);
    }

    public int hashCode() {
        String str = this.f66629iobyxmoadg;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f66631zoijcleaow.hashCode();
    }

    public final List ppxfxbqfkf() {
        return this.f66631zoijcleaow;
    }

    public String toString() {
        return "BannerGroupUiModel(title=" + this.f66629iobyxmoadg + ", banners=" + this.f66631zoijcleaow + ")";
    }

    public final String wkgbmnqykc() {
        return this.f66629iobyxmoadg;
    }
}
