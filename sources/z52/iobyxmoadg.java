package z52;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f129153iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f129154jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f129155yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129156zdlpuopuiu;

    public iobyxmoadg(String itemId, String imageUrl, String description, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f129156zdlpuopuiu = itemId;
        this.f129155yggfygwlhe = imageUrl;
        this.f129154jyumaefscl = description;
        this.f129153iwizpuwonk = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f129156zdlpuopuiu, iobyxmoadgVar.f129156zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f129155yggfygwlhe, iobyxmoadgVar.f129155yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f129154jyumaefscl, iobyxmoadgVar.f129154jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f129153iwizpuwonk, iobyxmoadgVar.f129153iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129156zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f129156zdlpuopuiu.hashCode() * 31) + this.f129155yggfygwlhe.hashCode()) * 31) + this.f129154jyumaefscl.hashCode()) * 31) + this.f129153iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f129153iwizpuwonk;
    }

    public String toString() {
        return "BannerOneSpecialBannerUiModel(itemId=" + this.f129156zdlpuopuiu + ", imageUrl=" + this.f129155yggfygwlhe + ", description=" + this.f129154jyumaefscl + ", adv=" + this.f129153iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f129155yggfygwlhe;
    }
}
