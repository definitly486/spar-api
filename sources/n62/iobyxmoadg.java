package n62;

import kotlin.jvm.internal.zdlpuopuiu;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f69209cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f69210iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f69211jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f69212yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f69213zdlpuopuiu;

    public iobyxmoadg(String itemId, String productPhoto, String productTitle, String productPrice, String productActionsDate) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(productPhoto, "productPhoto");
        zdlpuopuiu.btonecajqb(productTitle, "productTitle");
        zdlpuopuiu.btonecajqb(productPrice, "productPrice");
        zdlpuopuiu.btonecajqb(productActionsDate, "productActionsDate");
        this.f69213zdlpuopuiu = itemId;
        this.f69212yggfygwlhe = productPhoto;
        this.f69211jyumaefscl = productTitle;
        this.f69210iwizpuwonk = productPrice;
        this.f69209cqumvgiudr = productActionsDate;
    }

    public final String eablkybsjg() {
        return this.f69210iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f69213zdlpuopuiu, iobyxmoadgVar.f69213zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f69212yggfygwlhe, iobyxmoadgVar.f69212yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f69211jyumaefscl, iobyxmoadgVar.f69211jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f69210iwizpuwonk, iobyxmoadgVar.f69210iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f69209cqumvgiudr, iobyxmoadgVar.f69209cqumvgiudr);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f69213zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f69213zdlpuopuiu.hashCode() * 31) + this.f69212yggfygwlhe.hashCode()) * 31) + this.f69211jyumaefscl.hashCode()) * 31) + this.f69210iwizpuwonk.hashCode()) * 31) + this.f69209cqumvgiudr.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f69209cqumvgiudr;
    }

    public final String lqeggnwhkg() {
        return this.f69211jyumaefscl;
    }

    public String toString() {
        return "ProductBlockUiModel(itemId=" + this.f69213zdlpuopuiu + ", productPhoto=" + this.f69212yggfygwlhe + ", productTitle=" + this.f69211jyumaefscl + ", productPrice=" + this.f69210iwizpuwonk + ", productActionsDate=" + this.f69209cqumvgiudr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f69212yggfygwlhe;
    }
}
