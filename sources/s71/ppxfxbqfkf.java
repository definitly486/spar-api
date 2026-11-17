package s71;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f105651iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f105652zoijcleaow;

    public ppxfxbqfkf(int i13, String text) {
        zdlpuopuiu.btonecajqb(text, "text");
        this.f105651iobyxmoadg = i13;
        this.f105652zoijcleaow = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f105651iobyxmoadg == ppxfxbqfkfVar.f105651iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f105652zoijcleaow, ppxfxbqfkfVar.f105652zoijcleaow);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f105651iobyxmoadg) * 31) + this.f105652zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f105652zoijcleaow;
    }

    public String toString() {
        return "EvropolisStickerUiModel(id=" + this.f105651iobyxmoadg + ", text=" + this.f105652zoijcleaow + ")";
    }
}
