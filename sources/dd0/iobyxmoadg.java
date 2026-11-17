package dd0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27860iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27861ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f27862wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27863zoijcleaow;

    public iobyxmoadg(String title, String description, String image, int i13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(image, "image");
        this.f27860iobyxmoadg = title;
        this.f27863zoijcleaow = description;
        this.f27861ppxfxbqfkf = image;
        this.f27862wkgbmnqykc = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f27860iobyxmoadg, iobyxmoadgVar.f27860iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f27863zoijcleaow, iobyxmoadgVar.f27863zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f27861ppxfxbqfkf, iobyxmoadgVar.f27861ppxfxbqfkf) && this.f27862wkgbmnqykc == iobyxmoadgVar.f27862wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f27860iobyxmoadg.hashCode() * 31) + this.f27863zoijcleaow.hashCode()) * 31) + this.f27861ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f27862wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f27863zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f27860iobyxmoadg;
    }

    public String toString() {
        return "PromotionOnboardingUiModel(title=" + this.f27860iobyxmoadg + ", description=" + this.f27863zoijcleaow + ", image=" + this.f27861ppxfxbqfkf + ", order=" + this.f27862wkgbmnqykc + ")";
    }

    public final String zoijcleaow() {
        return this.f27861ppxfxbqfkf;
    }
}
