package v52;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f116121yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f116122zdlpuopuiu;

    public zoijcleaow(String itemId, List levels) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(levels, "levels");
        this.f116122zdlpuopuiu = itemId;
        this.f116121yggfygwlhe = levels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f116122zdlpuopuiu, zoijcleaowVar.f116122zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f116121yggfygwlhe, zoijcleaowVar.f116121yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f116122zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f116122zdlpuopuiu.hashCode() * 31) + this.f116121yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f116121yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerLoyaltyProgramUiModel(itemId=" + this.f116122zdlpuopuiu + ", levels=" + this.f116121yggfygwlhe + ")";
    }
}
