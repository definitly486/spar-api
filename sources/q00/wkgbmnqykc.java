package q00;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f77587iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f77588zoijcleaow;

    public wkgbmnqykc(String str, String str2) {
        this.f77587iobyxmoadg = str;
        this.f77588zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f77587iobyxmoadg, wkgbmnqykcVar.f77587iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77588zoijcleaow, wkgbmnqykcVar.f77588zoijcleaow);
    }

    public int hashCode() {
        String str = this.f77587iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77588zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f77587iobyxmoadg;
    }

    public String toString() {
        return "Subtitle(title=" + this.f77587iobyxmoadg + ", value=" + this.f77588zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f77588zoijcleaow;
    }
}
