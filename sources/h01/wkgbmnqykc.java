package h01;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f39032iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f39033zoijcleaow;

    public wkgbmnqykc(List shops, gxszxtbevo shopsReferences) {
        zdlpuopuiu.btonecajqb(shops, "shops");
        zdlpuopuiu.btonecajqb(shopsReferences, "shopsReferences");
        this.f39032iobyxmoadg = shops;
        this.f39033zoijcleaow = shopsReferences;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f39032iobyxmoadg, wkgbmnqykcVar.f39032iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39033zoijcleaow, wkgbmnqykcVar.f39033zoijcleaow);
    }

    public int hashCode() {
        return (this.f39032iobyxmoadg.hashCode() * 31) + this.f39033zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f39032iobyxmoadg;
    }

    public String toString() {
        return "Shops(shops=" + this.f39032iobyxmoadg + ", shopsReferences=" + this.f39033zoijcleaow + ")";
    }

    public final gxszxtbevo zoijcleaow() {
        return this.f39033zoijcleaow;
    }
}
