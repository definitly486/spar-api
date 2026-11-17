package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements h60.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f38734iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f38735ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38736zoijcleaow;

    public ppxfxbqfkf(int i13, String image, String text) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f38734iobyxmoadg = i13;
        this.f38736zoijcleaow = image;
        this.f38735ppxfxbqfkf = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f38734iobyxmoadg == ppxfxbqfkfVar.f38734iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f38736zoijcleaow, ppxfxbqfkfVar.f38736zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f38735ppxfxbqfkf, ppxfxbqfkfVar.f38735ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f38734iobyxmoadg) * 31) + this.f38736zoijcleaow.hashCode()) * 31) + this.f38735ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f38736zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f38735ppxfxbqfkf;
    }

    public String toString() {
        return "CartEvropolisEntity(progress=" + this.f38734iobyxmoadg + ", image=" + this.f38736zoijcleaow + ", text=" + this.f38735ppxfxbqfkf + ")";
    }

    public final int zoijcleaow() {
        return this.f38734iobyxmoadg;
    }
}
