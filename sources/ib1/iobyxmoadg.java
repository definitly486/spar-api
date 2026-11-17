package ib1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f42331iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f42332jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f42333yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f42334zdlpuopuiu;

    public iobyxmoadg(String itemId, String cardNumberMask, String date, String icon) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(cardNumberMask, "cardNumberMask");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(icon, "icon");
        this.f42334zdlpuopuiu = itemId;
        this.f42333yggfygwlhe = cardNumberMask;
        this.f42332jyumaefscl = date;
        this.f42331iwizpuwonk = icon;
    }

    public final String eablkybsjg() {
        return this.f42331iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f42334zdlpuopuiu, iobyxmoadgVar.f42334zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f42333yggfygwlhe, iobyxmoadgVar.f42333yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f42332jyumaefscl, iobyxmoadgVar.f42332jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f42331iwizpuwonk, iobyxmoadgVar.f42331iwizpuwonk);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f42334zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f42334zdlpuopuiu.hashCode() * 31) + this.f42333yggfygwlhe.hashCode()) * 31) + this.f42332jyumaefscl.hashCode()) * 31) + this.f42331iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f42333yggfygwlhe;
    }

    public String toString() {
        return "CardItemUiModel(itemId=" + this.f42334zdlpuopuiu + ", cardNumberMask=" + this.f42333yggfygwlhe + ", date=" + this.f42332jyumaefscl + ", icon=" + this.f42331iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f42332jyumaefscl;
    }
}
