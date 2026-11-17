package sr1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f108462iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f108463jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f108464yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108465zdlpuopuiu;

    public iobyxmoadg(String itemId, String imageUrl, String description, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f108465zdlpuopuiu = itemId;
        this.f108464yggfygwlhe = imageUrl;
        this.f108463jyumaefscl = description;
        this.f108462iwizpuwonk = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f108465zdlpuopuiu, iobyxmoadgVar.f108465zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f108464yggfygwlhe, iobyxmoadgVar.f108464yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f108463jyumaefscl, iobyxmoadgVar.f108463jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f108462iwizpuwonk, iobyxmoadgVar.f108462iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108465zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f108465zdlpuopuiu.hashCode() * 31) + this.f108464yggfygwlhe.hashCode()) * 31) + this.f108463jyumaefscl.hashCode()) * 31) + this.f108462iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f108462iwizpuwonk;
    }

    public String toString() {
        return "BannerOneSpecialBannerUiModel(itemId=" + this.f108465zdlpuopuiu + ", imageUrl=" + this.f108464yggfygwlhe + ", description=" + this.f108463jyumaefscl + ", adv=" + this.f108462iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f108464yggfygwlhe;
    }
}
