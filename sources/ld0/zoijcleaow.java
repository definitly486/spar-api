package ld0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f62144yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f62145zdlpuopuiu;

    public zoijcleaow(String itemId, List cards) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(cards, "cards");
        this.f62145zdlpuopuiu = itemId;
        this.f62144yggfygwlhe = cards;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f62145zdlpuopuiu, zoijcleaowVar.f62145zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f62144yggfygwlhe, zoijcleaowVar.f62144yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f62145zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f62145zdlpuopuiu.hashCode() * 31) + this.f62144yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f62144yggfygwlhe;
    }

    public String toString() {
        return "CardsItemUiModel(itemId=" + this.f62145zdlpuopuiu + ", cards=" + this.f62144yggfygwlhe + ")";
    }
}
