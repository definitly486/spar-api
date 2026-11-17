package da1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27340iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27341zoijcleaow;

    public ppxfxbqfkf(String title, String str) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f27340iobyxmoadg = title;
        this.f27341zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f27340iobyxmoadg, ppxfxbqfkfVar.f27340iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f27341zoijcleaow, ppxfxbqfkfVar.f27341zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f27340iobyxmoadg.hashCode() * 31;
        String str = this.f27341zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f27341zoijcleaow;
    }

    public String toString() {
        return "CouponHintUiModel(title=" + this.f27340iobyxmoadg + ", color=" + this.f27341zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f27340iobyxmoadg;
    }
}
