package bs1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ppxfxbqfkf f17045yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f17046zdlpuopuiu;

    public zoijcleaow(String itemId, ppxfxbqfkf iconsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(iconsUiModel, "iconsUiModel");
        this.f17046zdlpuopuiu = itemId;
        this.f17045yggfygwlhe = iconsUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f17046zdlpuopuiu, zoijcleaowVar.f17046zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f17045yggfygwlhe, zoijcleaowVar.f17045yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f17046zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f17046zdlpuopuiu.hashCode() * 31) + this.f17045yggfygwlhe.hashCode();
    }

    public final ppxfxbqfkf iobyxmoadg() {
        return this.f17045yggfygwlhe;
    }

    public String toString() {
        return "IconsTwoSpecialBannerUiModel(itemId=" + this.f17046zdlpuopuiu + ", iconsUiModel=" + this.f17045yggfygwlhe + ")";
    }
}
