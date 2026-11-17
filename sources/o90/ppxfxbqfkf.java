package o90;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f72350iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72351zoijcleaow;

    public ppxfxbqfkf(int i13, String text) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f72350iobyxmoadg = i13;
        this.f72351zoijcleaow = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f72350iobyxmoadg == ppxfxbqfkfVar.f72350iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f72351zoijcleaow, ppxfxbqfkfVar.f72351zoijcleaow);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f72350iobyxmoadg) * 31) + this.f72351zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f72351zoijcleaow;
    }

    public String toString() {
        return "EvropolisStickerUiModel(id=" + this.f72350iobyxmoadg + ", text=" + this.f72351zoijcleaow + ")";
    }
}
