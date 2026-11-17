package l91;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f61959gxszxtbevo = 0;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f61960eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61961iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f61962ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ojitshcjhn f61963wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f61964zoijcleaow;

    public iobyxmoadg(String code, String name, String str, ojitshcjhn navigationLink, String reference) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f61961iobyxmoadg = code;
        this.f61964zoijcleaow = name;
        this.f61962ppxfxbqfkf = str;
        this.f61963wkgbmnqykc = navigationLink;
        this.f61960eablkybsjg = reference;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61961iobyxmoadg, iobyxmoadgVar.f61961iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61964zoijcleaow, iobyxmoadgVar.f61964zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61962ppxfxbqfkf, iobyxmoadgVar.f61962ppxfxbqfkf) && this.f61963wkgbmnqykc == iobyxmoadgVar.f61963wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f61960eablkybsjg, iobyxmoadgVar.f61960eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f61961iobyxmoadg.hashCode() * 31) + this.f61964zoijcleaow.hashCode()) * 31;
        String str = this.f61962ppxfxbqfkf;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f61963wkgbmnqykc.hashCode()) * 31) + this.f61960eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f61961iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f61962ppxfxbqfkf;
    }

    public String toString() {
        return "BrandUiModel(code=" + this.f61961iobyxmoadg + ", name=" + this.f61964zoijcleaow + ", pic=" + this.f61962ppxfxbqfkf + ", navigationLink=" + this.f61963wkgbmnqykc + ", reference=" + this.f61960eablkybsjg + ")";
    }

    public final String zoijcleaow() {
        return this.f61964zoijcleaow;
    }
}
