package sr1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f108455cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f108456iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ojitshcjhn f108457jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f108458yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f108459zdlpuopuiu;

    public draadjrbmk(String itemId, String image, ojitshcjhn navlink, String reference, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f108459zdlpuopuiu = itemId;
        this.f108458yggfygwlhe = image;
        this.f108457jyumaefscl = navlink;
        this.f108456iwizpuwonk = reference;
        this.f108455cqumvgiudr = adv;
    }

    public final ojitshcjhn eablkybsjg() {
        return this.f108457jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return zdlpuopuiu.eablkybsjg(this.f108459zdlpuopuiu, draadjrbmkVar.f108459zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f108458yggfygwlhe, draadjrbmkVar.f108458yggfygwlhe) && this.f108457jyumaefscl == draadjrbmkVar.f108457jyumaefscl && zdlpuopuiu.eablkybsjg(this.f108456iwizpuwonk, draadjrbmkVar.f108456iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f108455cqumvgiudr, draadjrbmkVar.f108455cqumvgiudr);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f108459zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((this.f108459zdlpuopuiu.hashCode() * 31) + this.f108458yggfygwlhe.hashCode()) * 31) + this.f108457jyumaefscl.hashCode()) * 31) + this.f108456iwizpuwonk.hashCode()) * 31) + this.f108455cqumvgiudr.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f108455cqumvgiudr;
    }

    public final String lqeggnwhkg() {
        return this.f108456iwizpuwonk;
    }

    public String toString() {
        return "ImageExtSpecialBannerUiModel(itemId=" + this.f108459zdlpuopuiu + ", image=" + this.f108458yggfygwlhe + ", navlink=" + this.f108457jyumaefscl + ", reference=" + this.f108456iwizpuwonk + ", adv=" + this.f108455cqumvgiudr + ")";
    }

    public final String wkgbmnqykc() {
        return this.f108458yggfygwlhe;
    }
}
