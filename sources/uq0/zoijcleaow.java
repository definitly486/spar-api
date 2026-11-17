package uq0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114146iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f114147zoijcleaow;

    public zoijcleaow(String image) {
        zdlpuopuiu.btonecajqb(image, "image");
        this.f114146iobyxmoadg = image;
        String name = zoijcleaow.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        this.f114147zoijcleaow = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f114146iobyxmoadg, ((zoijcleaow) obj).f114146iobyxmoadg);
    }

    @Override // uq0.iobyxmoadg
    public String getId() {
        return this.f114147zoijcleaow;
    }

    public int hashCode() {
        return this.f114146iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f114146iobyxmoadg;
    }

    public String toString() {
        return "Image(image=" + this.f114146iobyxmoadg + ")";
    }
}
