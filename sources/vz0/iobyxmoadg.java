package vz0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f118210iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f118211ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f118212zoijcleaow;

    public iobyxmoadg(String image, String name, String description) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(description, "description");
        this.f118210iobyxmoadg = image;
        this.f118212zoijcleaow = name;
        this.f118211ppxfxbqfkf = description;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f118210iobyxmoadg, iobyxmoadgVar.f118210iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118212zoijcleaow, iobyxmoadgVar.f118212zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118211ppxfxbqfkf, iobyxmoadgVar.f118211ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f118210iobyxmoadg.hashCode() * 31) + this.f118212zoijcleaow.hashCode()) * 31) + this.f118211ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f118211ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f118212zoijcleaow;
    }

    public String toString() {
        return "StickerPromotionArgs(image=" + this.f118210iobyxmoadg + ", name=" + this.f118212zoijcleaow + ", description=" + this.f118211ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f118210iobyxmoadg;
    }
}
