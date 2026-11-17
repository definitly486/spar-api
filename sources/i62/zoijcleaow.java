package i62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ppxfxbqfkf f42046yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f42047zdlpuopuiu;

    public zoijcleaow(String itemId, ppxfxbqfkf iconsUiModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(iconsUiModel, "iconsUiModel");
        this.f42047zdlpuopuiu = itemId;
        this.f42046yggfygwlhe = iconsUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f42047zdlpuopuiu, zoijcleaowVar.f42047zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f42046yggfygwlhe, zoijcleaowVar.f42046yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f42047zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f42047zdlpuopuiu.hashCode() * 31) + this.f42046yggfygwlhe.hashCode();
    }

    public final ppxfxbqfkf iobyxmoadg() {
        return this.f42046yggfygwlhe;
    }

    public String toString() {
        return "IconsTwoSpecialBannerUiModel(itemId=" + this.f42047zdlpuopuiu + ", iconsUiModel=" + this.f42046yggfygwlhe + ")";
    }
}
