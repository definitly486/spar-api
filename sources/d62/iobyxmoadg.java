package d62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f27114yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f27115zdlpuopuiu;

    public iobyxmoadg(String itemId, int i13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f27115zdlpuopuiu = itemId;
        this.f27114yggfygwlhe = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f27115zdlpuopuiu, iobyxmoadgVar.f27115zdlpuopuiu) && this.f27114yggfygwlhe == iobyxmoadgVar.f27114yggfygwlhe;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f27115zdlpuopuiu;
    }

    public int hashCode() {
        return (this.f27115zdlpuopuiu.hashCode() * 31) + Integer.hashCode(this.f27114yggfygwlhe);
    }

    public final int iobyxmoadg() {
        return this.f27114yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerDividerUiModel(itemId=" + this.f27115zdlpuopuiu + ", dividerRes=" + this.f27114yggfygwlhe + ")";
    }
}
