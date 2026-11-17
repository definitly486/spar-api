package pl0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f76917iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f76918ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f76919wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cl0.zoijcleaow f76920zoijcleaow;

    public wkgbmnqykc(boolean z13, cl0.zoijcleaow currentAddressType, List addressList, boolean z14) {
        zdlpuopuiu.btonecajqb(currentAddressType, "currentAddressType");
        zdlpuopuiu.btonecajqb(addressList, "addressList");
        this.f76917iobyxmoadg = z13;
        this.f76920zoijcleaow = currentAddressType;
        this.f76918ppxfxbqfkf = addressList;
        this.f76919wkgbmnqykc = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f76917iobyxmoadg == wkgbmnqykcVar.f76917iobyxmoadg && this.f76920zoijcleaow == wkgbmnqykcVar.f76920zoijcleaow && zdlpuopuiu.eablkybsjg(this.f76918ppxfxbqfkf, wkgbmnqykcVar.f76918ppxfxbqfkf) && this.f76919wkgbmnqykc == wkgbmnqykcVar.f76919wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f76917iobyxmoadg) * 31) + this.f76920zoijcleaow.hashCode()) * 31) + this.f76918ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f76919wkgbmnqykc);
    }

    public final List iobyxmoadg() {
        return this.f76918ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f76919wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f76917iobyxmoadg + ", currentAddressType=" + this.f76920zoijcleaow + ", addressList=" + this.f76918ppxfxbqfkf + ", typeSelectionEnable=" + this.f76919wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f76917iobyxmoadg;
    }

    public final cl0.zoijcleaow zoijcleaow() {
        return this.f76920zoijcleaow;
    }
}
