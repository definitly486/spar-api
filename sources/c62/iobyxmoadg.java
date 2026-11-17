package c62;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f19117yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f19118zdlpuopuiu;

    public iobyxmoadg(String itemId, List comboSetList) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        this.f19118zdlpuopuiu = itemId;
        this.f19117yggfygwlhe = comboSetList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f19118zdlpuopuiu, iobyxmoadgVar.f19118zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f19117yggfygwlhe, iobyxmoadgVar.f19117yggfygwlhe);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f19118zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f19118zdlpuopuiu.hashCode() * 31) + this.f19117yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f19117yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerComboSetSectionUiModel(itemId=" + this.f19118zdlpuopuiu + ", comboSetList=" + this.f19117yggfygwlhe + ")";
    }
}
