package as1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f14442iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f14443jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f14444yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f14445zdlpuopuiu;

    public iobyxmoadg(String itemId, String icon, String description, String adv) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f14445zdlpuopuiu = itemId;
        this.f14444yggfygwlhe = icon;
        this.f14443jyumaefscl = description;
        this.f14442iwizpuwonk = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f14445zdlpuopuiu, iobyxmoadgVar.f14445zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f14444yggfygwlhe, iobyxmoadgVar.f14444yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f14443jyumaefscl, iobyxmoadgVar.f14443jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f14442iwizpuwonk, iobyxmoadgVar.f14442iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f14445zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f14445zdlpuopuiu.hashCode() * 31) + this.f14444yggfygwlhe.hashCode()) * 31) + this.f14443jyumaefscl.hashCode()) * 31) + this.f14442iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f14443jyumaefscl;
    }

    public String toString() {
        return "IconOneBlockUiModel(itemId=" + this.f14445zdlpuopuiu + ", icon=" + this.f14444yggfygwlhe + ", description=" + this.f14443jyumaefscl + ", adv=" + this.f14442iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f14444yggfygwlhe;
    }
}
