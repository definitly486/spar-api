package v50;

import igdgnonuha.wypolnanlu;
import kotlin.jvm.internal.zdlpuopuiu;
import w50.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Boolean f116099iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f116100ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final x50.zoijcleaow f116101wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wypolnanlu f116102zoijcleaow;

    public iobyxmoadg(Boolean bool, wypolnanlu colorScheme, zoijcleaow customColorScheme, x50.zoijcleaow types) {
        zdlpuopuiu.btonecajqb(colorScheme, "colorScheme");
        zdlpuopuiu.btonecajqb(customColorScheme, "customColorScheme");
        zdlpuopuiu.btonecajqb(types, "types");
        this.f116099iobyxmoadg = bool;
        this.f116102zoijcleaow = colorScheme;
        this.f116100ppxfxbqfkf = customColorScheme;
        this.f116101wkgbmnqykc = types;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f116099iobyxmoadg, iobyxmoadgVar.f116099iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116102zoijcleaow, iobyxmoadgVar.f116102zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116100ppxfxbqfkf, iobyxmoadgVar.f116100ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f116101wkgbmnqykc, iobyxmoadgVar.f116101wkgbmnqykc);
    }

    public int hashCode() {
        Boolean bool = this.f116099iobyxmoadg;
        return ((((((bool == null ? 0 : bool.hashCode()) * 31) + this.f116102zoijcleaow.hashCode()) * 31) + this.f116100ppxfxbqfkf.hashCode()) * 31) + this.f116101wkgbmnqykc.hashCode();
    }

    public final wypolnanlu iobyxmoadg() {
        return this.f116102zoijcleaow;
    }

    public final x50.zoijcleaow ppxfxbqfkf() {
        return this.f116101wkgbmnqykc;
    }

    public String toString() {
        return "CustomTheme(isDark=" + this.f116099iobyxmoadg + ", colorScheme=" + this.f116102zoijcleaow + ", customColorScheme=" + this.f116100ppxfxbqfkf + ", types=" + this.f116101wkgbmnqykc + ")";
    }

    public final zoijcleaow zoijcleaow() {
        return this.f116100ppxfxbqfkf;
    }
}
