package f10;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f32544iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f32545ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f32546zoijcleaow;

    public iobyxmoadg(String image, String name, String description) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(description, "description");
        this.f32544iobyxmoadg = image;
        this.f32546zoijcleaow = name;
        this.f32545ppxfxbqfkf = description;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f32544iobyxmoadg, iobyxmoadgVar.f32544iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32546zoijcleaow, iobyxmoadgVar.f32546zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f32545ppxfxbqfkf, iobyxmoadgVar.f32545ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f32544iobyxmoadg.hashCode() * 31) + this.f32546zoijcleaow.hashCode()) * 31) + this.f32545ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f32545ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f32546zoijcleaow;
    }

    public String toString() {
        return "StickerPromotionArgs(image=" + this.f32544iobyxmoadg + ", name=" + this.f32546zoijcleaow + ", description=" + this.f32545ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f32544iobyxmoadg;
    }
}
