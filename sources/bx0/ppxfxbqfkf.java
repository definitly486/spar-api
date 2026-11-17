package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements u41.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f17300iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f17301ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f17302zoijcleaow;

    public ppxfxbqfkf(int i13, String image, String text) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f17300iobyxmoadg = i13;
        this.f17302zoijcleaow = image;
        this.f17301ppxfxbqfkf = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f17300iobyxmoadg == ppxfxbqfkfVar.f17300iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f17302zoijcleaow, ppxfxbqfkfVar.f17302zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17301ppxfxbqfkf, ppxfxbqfkfVar.f17301ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f17300iobyxmoadg) * 31) + this.f17302zoijcleaow.hashCode()) * 31) + this.f17301ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f17302zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f17301ppxfxbqfkf;
    }

    public String toString() {
        return "CartEvropolisEntity(progress=" + this.f17300iobyxmoadg + ", image=" + this.f17302zoijcleaow + ", text=" + this.f17301ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f17300iobyxmoadg;
    }
}
