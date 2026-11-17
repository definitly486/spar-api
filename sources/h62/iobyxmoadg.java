package h62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f39731iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f39732jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f39733yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f39734zdlpuopuiu;

    public iobyxmoadg(String itemId, String icon, String description, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f39734zdlpuopuiu = itemId;
        this.f39733yggfygwlhe = icon;
        this.f39732jyumaefscl = description;
        this.f39731iwizpuwonk = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f39734zdlpuopuiu, iobyxmoadgVar.f39734zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f39733yggfygwlhe, iobyxmoadgVar.f39733yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f39732jyumaefscl, iobyxmoadgVar.f39732jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f39731iwizpuwonk, iobyxmoadgVar.f39731iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f39734zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f39734zdlpuopuiu.hashCode() * 31) + this.f39733yggfygwlhe.hashCode()) * 31) + this.f39732jyumaefscl.hashCode()) * 31) + this.f39731iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f39732jyumaefscl;
    }

    public String toString() {
        return "IconOneBlockUiModel(itemId=" + this.f39734zdlpuopuiu + ", icon=" + this.f39733yggfygwlhe + ", description=" + this.f39732jyumaefscl + ", adv=" + this.f39731iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f39733yggfygwlhe;
    }
}
