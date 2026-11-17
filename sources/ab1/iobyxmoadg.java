package ab1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1290iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1291ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f1292wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1293zoijcleaow;

    public iobyxmoadg(String title, String description, String image, int i13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(image, "image");
        this.f1290iobyxmoadg = title;
        this.f1293zoijcleaow = description;
        this.f1291ppxfxbqfkf = image;
        this.f1292wkgbmnqykc = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f1290iobyxmoadg, iobyxmoadgVar.f1290iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f1293zoijcleaow, iobyxmoadgVar.f1293zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1291ppxfxbqfkf, iobyxmoadgVar.f1291ppxfxbqfkf) && this.f1292wkgbmnqykc == iobyxmoadgVar.f1292wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f1290iobyxmoadg.hashCode() * 31) + this.f1293zoijcleaow.hashCode()) * 31) + this.f1291ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f1292wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f1293zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f1290iobyxmoadg;
    }

    public String toString() {
        return "PromotionOnboardingUiModel(title=" + this.f1290iobyxmoadg + ", description=" + this.f1293zoijcleaow + ", image=" + this.f1291ppxfxbqfkf + ", order=" + this.f1292wkgbmnqykc + ")";
    }

    public final String zoijcleaow() {
        return this.f1291ppxfxbqfkf;
    }
}
