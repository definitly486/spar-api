package ld0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f62134iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f62135jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f62136yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f62137zdlpuopuiu;

    public iobyxmoadg(String itemId, String cardNumberMask, String date, String icon) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(cardNumberMask, "cardNumberMask");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(icon, "icon");
        this.f62137zdlpuopuiu = itemId;
        this.f62136yggfygwlhe = cardNumberMask;
        this.f62135jyumaefscl = date;
        this.f62134iwizpuwonk = icon;
    }

    public final String eablkybsjg() {
        return this.f62134iwizpuwonk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f62137zdlpuopuiu, iobyxmoadgVar.f62137zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f62136yggfygwlhe, iobyxmoadgVar.f62136yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f62135jyumaefscl, iobyxmoadgVar.f62135jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f62134iwizpuwonk, iobyxmoadgVar.f62134iwizpuwonk);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f62137zdlpuopuiu;
    }

    public int hashCode() {
        return (((((this.f62137zdlpuopuiu.hashCode() * 31) + this.f62136yggfygwlhe.hashCode()) * 31) + this.f62135jyumaefscl.hashCode()) * 31) + this.f62134iwizpuwonk.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f62136yggfygwlhe;
    }

    public String toString() {
        return "CardItemUiModel(itemId=" + this.f62137zdlpuopuiu + ", cardNumberMask=" + this.f62136yggfygwlhe + ", date=" + this.f62135jyumaefscl + ", icon=" + this.f62134iwizpuwonk + ")";
    }

    public final String wkgbmnqykc() {
        return this.f62135jyumaefscl;
    }
}
