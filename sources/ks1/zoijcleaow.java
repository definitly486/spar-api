package ks1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f60517yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f60518zdlpuopuiu;

    public zoijcleaow(String itemId, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f60518zdlpuopuiu = itemId;
        this.f60517yggfygwlhe = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f60518zdlpuopuiu, zoijcleaowVar.f60518zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f60517yggfygwlhe, zoijcleaowVar.f60517yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f60518zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f60518zdlpuopuiu.hashCode() * 31) + this.f60517yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f60517yggfygwlhe;
    }

    public String toString() {
        return "SquareCardsListUiModel(itemId=" + this.f60518zdlpuopuiu + ", items=" + this.f60517yggfygwlhe + ")";
    }
}
