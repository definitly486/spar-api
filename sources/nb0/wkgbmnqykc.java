package nb0;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import he0.nufgyqmvbu;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f69531wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f69532iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f69533ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f69534zoijcleaow;

    public wkgbmnqykc(String str, List banners) {
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.f69532iobyxmoadg = str;
        this.f69534zoijcleaow = banners;
        this.f69533ppxfxbqfkf = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: nb0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.zoijcleaow(this.f69530zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he0.iobyxmoadg zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        return nufgyqmvbu.iobyxmoadg(wkgbmnqykcVar);
    }

    public final String eablkybsjg() {
        return this.f69532iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f69532iobyxmoadg, wkgbmnqykcVar.f69532iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69534zoijcleaow, wkgbmnqykcVar.f69534zoijcleaow);
    }

    public int hashCode() {
        String str = this.f69532iobyxmoadg;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f69534zoijcleaow.hashCode();
    }

    public final he0.iobyxmoadg ppxfxbqfkf() {
        return (he0.iobyxmoadg) this.f69533ppxfxbqfkf.getValue();
    }

    public String toString() {
        return "BannerGroupUiModel(title=" + this.f69532iobyxmoadg + ", banners=" + this.f69534zoijcleaow + ")";
    }

    public final List wkgbmnqykc() {
        return this.f69534zoijcleaow;
    }
}
