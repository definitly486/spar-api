package or1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f74130yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f74131zdlpuopuiu;

    public zoijcleaow(String itemId, List levels) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(levels, "levels");
        this.f74131zdlpuopuiu = itemId;
        this.f74130yggfygwlhe = levels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f74131zdlpuopuiu, zoijcleaowVar.f74131zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f74130yggfygwlhe, zoijcleaowVar.f74130yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f74131zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f74131zdlpuopuiu.hashCode() * 31) + this.f74130yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f74130yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerLoyaltyProgramUiModel(itemId=" + this.f74131zdlpuopuiu + ", levels=" + this.f74130yggfygwlhe + ")";
    }
}
