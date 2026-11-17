package s10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f105198iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f105199zoijcleaow;

    public wkgbmnqykc(List shops, gxszxtbevo shopsReferences) {
        zdlpuopuiu.btonecajqb(shops, "shops");
        zdlpuopuiu.btonecajqb(shopsReferences, "shopsReferences");
        this.f105198iobyxmoadg = shops;
        this.f105199zoijcleaow = shopsReferences;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f105198iobyxmoadg, wkgbmnqykcVar.f105198iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105199zoijcleaow, wkgbmnqykcVar.f105199zoijcleaow);
    }

    public int hashCode() {
        return (this.f105198iobyxmoadg.hashCode() * 31) + this.f105199zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f105198iobyxmoadg;
    }

    public String toString() {
        return "Shops(shops=" + this.f105198iobyxmoadg + ", shopsReferences=" + this.f105199zoijcleaow + ")";
    }

    public final gxszxtbevo zoijcleaow() {
        return this.f105199zoijcleaow;
    }
}
