package hm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40812iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40813zoijcleaow;

    public wkgbmnqykc(String name, String iconUrl) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        this.f40812iobyxmoadg = name;
        this.f40813zoijcleaow = iconUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f40812iobyxmoadg, wkgbmnqykcVar.f40812iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40813zoijcleaow, wkgbmnqykcVar.f40813zoijcleaow);
    }

    public int hashCode() {
        return (this.f40812iobyxmoadg.hashCode() * 31) + this.f40813zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f40813zoijcleaow;
    }

    public String toString() {
        return "ShopTagUiModel(name=" + this.f40812iobyxmoadg + ", iconUrl=" + this.f40813zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f40812iobyxmoadg;
    }
}
