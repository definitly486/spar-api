package h62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zoijcleaow f39735yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f39736zdlpuopuiu;

    public ppxfxbqfkf(String itemId, zoijcleaow iconsOneBlockUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(iconsOneBlockUiModel, "iconsOneBlockUiModel");
        this.f39736zdlpuopuiu = itemId;
        this.f39735yggfygwlhe = iconsOneBlockUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f39736zdlpuopuiu, ppxfxbqfkfVar.f39736zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f39735yggfygwlhe, ppxfxbqfkfVar.f39735yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f39736zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f39736zdlpuopuiu.hashCode() * 31) + this.f39735yggfygwlhe.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f39735yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerIconsOneBlockUiModel(itemId=" + this.f39736zdlpuopuiu + ", iconsOneBlockUiModel=" + this.f39735yggfygwlhe + ")";
    }
}
