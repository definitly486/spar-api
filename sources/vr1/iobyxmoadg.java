package vr1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f117987yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f117988zdlpuopuiu;

    public iobyxmoadg(String itemId, List comboSetList) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        this.f117988zdlpuopuiu = itemId;
        this.f117987yggfygwlhe = comboSetList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f117988zdlpuopuiu, iobyxmoadgVar.f117988zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f117987yggfygwlhe, iobyxmoadgVar.f117987yggfygwlhe);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f117988zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f117988zdlpuopuiu.hashCode() * 31) + this.f117987yggfygwlhe.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117987yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerComboSetSectionUiModel(itemId=" + this.f117988zdlpuopuiu + ", comboSetList=" + this.f117987yggfygwlhe + ")";
    }
}
