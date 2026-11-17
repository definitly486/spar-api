package wr1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f120532yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f120533zdlpuopuiu;

    public iobyxmoadg(String itemId, int i13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f120533zdlpuopuiu = itemId;
        this.f120532yggfygwlhe = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f120533zdlpuopuiu, iobyxmoadgVar.f120533zdlpuopuiu) && this.f120532yggfygwlhe == iobyxmoadgVar.f120532yggfygwlhe;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f120533zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f120533zdlpuopuiu.hashCode() * 31) + Integer.hashCode(this.f120532yggfygwlhe);
    }

    public final int iobyxmoadg() {
        return this.f120532yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerDividerUiModel(itemId=" + this.f120533zdlpuopuiu + ", dividerRes=" + this.f120532yggfygwlhe + ")";
    }
}
