package mb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f66734gxszxtbevo = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f66735eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66736iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f66737ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f40.zoijcleaow f66738wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66739zoijcleaow;

    public iobyxmoadg(String code, String name, String str, f40.zoijcleaow navigationLink, String reference) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f66736iobyxmoadg = code;
        this.f66739zoijcleaow = name;
        this.f66737ppxfxbqfkf = str;
        this.f66738wkgbmnqykc = navigationLink;
        this.f66735eablkybsjg = reference;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f66736iobyxmoadg, iobyxmoadgVar.f66736iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66739zoijcleaow, iobyxmoadgVar.f66739zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f66737ppxfxbqfkf, iobyxmoadgVar.f66737ppxfxbqfkf) && this.f66738wkgbmnqykc == iobyxmoadgVar.f66738wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f66735eablkybsjg, iobyxmoadgVar.f66735eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f66736iobyxmoadg.hashCode() * 31) + this.f66739zoijcleaow.hashCode()) * 31;
        String str = this.f66737ppxfxbqfkf;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f66738wkgbmnqykc.hashCode()) * 31) + this.f66735eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f66736iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f66737ppxfxbqfkf;
    }

    public String toString() {
        return "BrandUiModel(code=" + this.f66736iobyxmoadg + ", name=" + this.f66739zoijcleaow + ", pic=" + this.f66737ppxfxbqfkf + ", navigationLink=" + this.f66738wkgbmnqykc + ", reference=" + this.f66735eablkybsjg + ")";
    }

    public final String zoijcleaow() {
        return this.f66739zoijcleaow;
    }
}
