package i41;

import igdgnonuha.wypolnanlu;
import j41.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Boolean f41966iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f41967ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k41.zoijcleaow f41968wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wypolnanlu f41969zoijcleaow;

    public iobyxmoadg(Boolean bool, wypolnanlu colorScheme, zoijcleaow customColorScheme, k41.zoijcleaow types) {
        zdlpuopuiu.btonecajqb(colorScheme, "colorScheme");
        zdlpuopuiu.btonecajqb(customColorScheme, "customColorScheme");
        zdlpuopuiu.btonecajqb(types, "types");
        this.f41966iobyxmoadg = bool;
        this.f41969zoijcleaow = colorScheme;
        this.f41967ppxfxbqfkf = customColorScheme;
        this.f41968wkgbmnqykc = types;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f41966iobyxmoadg, iobyxmoadgVar.f41966iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41969zoijcleaow, iobyxmoadgVar.f41969zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41967ppxfxbqfkf, iobyxmoadgVar.f41967ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f41968wkgbmnqykc, iobyxmoadgVar.f41968wkgbmnqykc);
    }

    public int hashCode() {
        Boolean bool = this.f41966iobyxmoadg;
        return ((((((bool == null ? 0 : bool.hashCode()) * 31) + this.f41969zoijcleaow.hashCode()) * 31) + this.f41967ppxfxbqfkf.hashCode()) * 31) + this.f41968wkgbmnqykc.hashCode();
    }

    public final wypolnanlu iobyxmoadg() {
        return this.f41969zoijcleaow;
    }

    public final k41.zoijcleaow ppxfxbqfkf() {
        return this.f41968wkgbmnqykc;
    }

    public String toString() {
        return "CustomTheme(isDark=" + this.f41966iobyxmoadg + ", colorScheme=" + this.f41969zoijcleaow + ", customColorScheme=" + this.f41967ppxfxbqfkf + ", types=" + this.f41968wkgbmnqykc + ")";
    }

    public final zoijcleaow zoijcleaow() {
        return this.f41967ppxfxbqfkf;
    }
}
