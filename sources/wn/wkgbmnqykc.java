package wn;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120266iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120267zoijcleaow;

    public wkgbmnqykc(String name, String iconUrl) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        this.f120266iobyxmoadg = name;
        this.f120267zoijcleaow = iconUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f120266iobyxmoadg, wkgbmnqykcVar.f120266iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120267zoijcleaow, wkgbmnqykcVar.f120267zoijcleaow);
    }

    public int hashCode() {
        return (this.f120266iobyxmoadg.hashCode() * 31) + this.f120267zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f120267zoijcleaow;
    }

    public String toString() {
        return "ShopTagUiModel(name=" + this.f120266iobyxmoadg + ", iconUrl=" + this.f120267zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f120266iobyxmoadg;
    }
}
