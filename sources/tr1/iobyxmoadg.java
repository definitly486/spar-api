package tr1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f111424jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f111425yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f111426zdlpuopuiu;

    public iobyxmoadg(String itemId, String bonuses, String text) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(bonuses, "bonuses");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f111426zdlpuopuiu = itemId;
        this.f111425yggfygwlhe = bonuses;
        this.f111424jyumaefscl = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f111426zdlpuopuiu, iobyxmoadgVar.f111426zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f111425yggfygwlhe, iobyxmoadgVar.f111425yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f111424jyumaefscl, iobyxmoadgVar.f111424jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f111426zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f111426zdlpuopuiu.hashCode() * 31) + this.f111425yggfygwlhe.hashCode()) * 31) + this.f111424jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f111425yggfygwlhe;
    }

    public String toString() {
        return "SpecialBannerBonusCardUiModel(itemId=" + this.f111426zdlpuopuiu + ", bonuses=" + this.f111425yggfygwlhe + ", text=" + this.f111424jyumaefscl + ")";
    }

    public final String wkgbmnqykc() {
        return this.f111424jyumaefscl;
    }
}
