package a62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f951jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final double f952yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f953zdlpuopuiu;

    public iobyxmoadg(String itemId, double d13, String text) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f953zdlpuopuiu = itemId;
        this.f952yggfygwlhe = d13;
        this.f951jyumaefscl = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f953zdlpuopuiu, iobyxmoadgVar.f953zdlpuopuiu) && Double.compare(this.f952yggfygwlhe, iobyxmoadgVar.f952yggfygwlhe) == 0 && zdlpuopuiu.eablkybsjg(this.f951jyumaefscl, iobyxmoadgVar.f951jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f953zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f953zdlpuopuiu.hashCode() * 31) + Double.hashCode(this.f952yggfygwlhe)) * 31) + this.f951jyumaefscl.hashCode();
    }

    public final double iobyxmoadg() {
        return this.f952yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerBonusCardUiModel(itemId=" + this.f953zdlpuopuiu + ", bonuses=" + this.f952yggfygwlhe + ", text=" + this.f951jyumaefscl + ")";
    }

    public final String wkgbmnqykc() {
        return this.f951jyumaefscl;
    }
}
