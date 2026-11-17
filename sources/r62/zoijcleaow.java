package r62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f81855yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f81856zdlpuopuiu;

    public zoijcleaow(String itemId, List items) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f81856zdlpuopuiu = itemId;
        this.f81855yggfygwlhe = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f81856zdlpuopuiu, zoijcleaowVar.f81856zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f81855yggfygwlhe, zoijcleaowVar.f81855yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f81856zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f81856zdlpuopuiu.hashCode() * 31) + this.f81855yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f81855yggfygwlhe;
    }

    public String toString() {
        return "SquareCardsListUiModel(itemId=" + this.f81856zdlpuopuiu + ", items=" + this.f81855yggfygwlhe + ")";
    }
}
