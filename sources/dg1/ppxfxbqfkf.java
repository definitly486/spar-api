package dg1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f28140iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f28141zoijcleaow;

    public ppxfxbqfkf(String value, zoijcleaow title) {
        zdlpuopuiu.btonecajqb(value, "value");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f28140iobyxmoadg = value;
        this.f28141zoijcleaow = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f28140iobyxmoadg, ppxfxbqfkfVar.f28140iobyxmoadg) && this.f28141zoijcleaow == ppxfxbqfkfVar.f28141zoijcleaow;
    }

    public int hashCode() {
        return (this.f28140iobyxmoadg.hashCode() * 31) + this.f28141zoijcleaow.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f28141zoijcleaow;
    }

    public String toString() {
        return "OrderInfoUiModel(value=" + this.f28140iobyxmoadg + ", title=" + this.f28141zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f28140iobyxmoadg;
    }
}
