package as1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f14446yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f14447zdlpuopuiu;

    public ppxfxbqfkf(String itemId, zoijcleaow iconsOneBlockUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(iconsOneBlockUiModel, "iconsOneBlockUiModel");
        this.f14447zdlpuopuiu = itemId;
        this.f14446yggfygwlhe = iconsOneBlockUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f14447zdlpuopuiu, ppxfxbqfkfVar.f14447zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f14446yggfygwlhe, ppxfxbqfkfVar.f14446yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f14447zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f14447zdlpuopuiu.hashCode() * 31) + this.f14446yggfygwlhe.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f14446yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerIconsOneBlockUiModel(itemId=" + this.f14447zdlpuopuiu + ", iconsOneBlockUiModel=" + this.f14446yggfygwlhe + ")";
    }
}
