package en;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f31586iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f31587ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f31588wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rm.zoijcleaow f31589zoijcleaow;

    public wkgbmnqykc(boolean z13, rm.zoijcleaow currentAddressType, List addressList, boolean z14) {
        zdlpuopuiu.btonecajqb(currentAddressType, "currentAddressType");
        zdlpuopuiu.btonecajqb(addressList, "addressList");
        this.f31586iobyxmoadg = z13;
        this.f31589zoijcleaow = currentAddressType;
        this.f31587ppxfxbqfkf = addressList;
        this.f31588wkgbmnqykc = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f31586iobyxmoadg == wkgbmnqykcVar.f31586iobyxmoadg && this.f31589zoijcleaow == wkgbmnqykcVar.f31589zoijcleaow && zdlpuopuiu.eablkybsjg(this.f31587ppxfxbqfkf, wkgbmnqykcVar.f31587ppxfxbqfkf) && this.f31588wkgbmnqykc == wkgbmnqykcVar.f31588wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f31586iobyxmoadg) * 31) + this.f31589zoijcleaow.hashCode()) * 31) + this.f31587ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f31588wkgbmnqykc);
    }

    public final List iobyxmoadg() {
        return this.f31587ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f31588wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f31586iobyxmoadg + ", currentAddressType=" + this.f31589zoijcleaow + ", addressList=" + this.f31587ppxfxbqfkf + ", typeSelectionEnable=" + this.f31588wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f31586iobyxmoadg;
    }

    public final rm.zoijcleaow zoijcleaow() {
        return this.f31589zoijcleaow;
    }
}
