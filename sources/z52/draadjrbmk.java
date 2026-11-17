package z52;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f129146cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f129147iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final f40.zoijcleaow f129148jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f129149yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f129150zdlpuopuiu;

    public draadjrbmk(String itemId, String image, f40.zoijcleaow navlink, String reference, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f129150zdlpuopuiu = itemId;
        this.f129149yggfygwlhe = image;
        this.f129148jyumaefscl = navlink;
        this.f129147iwizpuwonk = reference;
        this.f129146cqumvgiudr = adv;
    }

    public final f40.zoijcleaow eablkybsjg() {
        return this.f129148jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return zdlpuopuiu.eablkybsjg(this.f129150zdlpuopuiu, draadjrbmkVar.f129150zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f129149yggfygwlhe, draadjrbmkVar.f129149yggfygwlhe) && this.f129148jyumaefscl == draadjrbmkVar.f129148jyumaefscl && zdlpuopuiu.eablkybsjg(this.f129147iwizpuwonk, draadjrbmkVar.f129147iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f129146cqumvgiudr, draadjrbmkVar.f129146cqumvgiudr);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f129150zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f129150zdlpuopuiu.hashCode() * 31) + this.f129149yggfygwlhe.hashCode()) * 31) + this.f129148jyumaefscl.hashCode()) * 31) + this.f129147iwizpuwonk.hashCode()) * 31) + this.f129146cqumvgiudr.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f129146cqumvgiudr;
    }

    public final String lqeggnwhkg() {
        return this.f129147iwizpuwonk;
    }

    public String toString() {
        return "ImageExtSpecialBannerUiModel(itemId=" + this.f129150zdlpuopuiu + ", image=" + this.f129149yggfygwlhe + ", navlink=" + this.f129148jyumaefscl + ", reference=" + this.f129147iwizpuwonk + ", adv=" + this.f129146cqumvgiudr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f129149yggfygwlhe;
    }
}
