package ec0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31103iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f31104zoijcleaow;

    public ppxfxbqfkf(String title, String str) {
        zdlpuopuiu.btonecajqb(title, "title");
        this.f31103iobyxmoadg = title;
        this.f31104zoijcleaow = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f31103iobyxmoadg, ppxfxbqfkfVar.f31103iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31104zoijcleaow, ppxfxbqfkfVar.f31104zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f31103iobyxmoadg.hashCode() * 31;
        String str = this.f31104zoijcleaow;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f31104zoijcleaow;
    }

    public String toString() {
        return "CouponHintUiModel(title=" + this.f31103iobyxmoadg + ", color=" + this.f31104zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f31103iobyxmoadg;
    }
}
