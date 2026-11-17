package gs1;

import b21.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f38418cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f38419iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f38420jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f38421yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f38422zdlpuopuiu;

    public iobyxmoadg(String itemId, String productPhoto, String productTitle, String productPrice, String productActionsDate) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(productPhoto, "productPhoto");
        zdlpuopuiu.btonecajqb(productTitle, "productTitle");
        zdlpuopuiu.btonecajqb(productPrice, "productPrice");
        zdlpuopuiu.btonecajqb(productActionsDate, "productActionsDate");
        this.f38422zdlpuopuiu = itemId;
        this.f38421yggfygwlhe = productPhoto;
        this.f38420jyumaefscl = productTitle;
        this.f38419iwizpuwonk = productPrice;
        this.f38418cqumvgiudr = productActionsDate;
    }

    public final String eablkybsjg() {
        return this.f38419iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f38422zdlpuopuiu, iobyxmoadgVar.f38422zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f38421yggfygwlhe, iobyxmoadgVar.f38421yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f38420jyumaefscl, iobyxmoadgVar.f38420jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f38419iwizpuwonk, iobyxmoadgVar.f38419iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f38418cqumvgiudr, iobyxmoadgVar.f38418cqumvgiudr);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f38422zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f38422zdlpuopuiu.hashCode() * 31) + this.f38421yggfygwlhe.hashCode()) * 31) + this.f38420jyumaefscl.hashCode()) * 31) + this.f38419iwizpuwonk.hashCode()) * 31) + this.f38418cqumvgiudr.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f38418cqumvgiudr;
    }

    public final String lqeggnwhkg() {
        return this.f38420jyumaefscl;
    }

    public String toString() {
        return "ProductBlockUiModel(itemId=" + this.f38422zdlpuopuiu + ", productPhoto=" + this.f38421yggfygwlhe + ", productTitle=" + this.f38420jyumaefscl + ", productPrice=" + this.f38419iwizpuwonk + ", productActionsDate=" + this.f38418cqumvgiudr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f38421yggfygwlhe;
    }
}
