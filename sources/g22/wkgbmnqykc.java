package g22;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35882iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final f22.zoijcleaow f35883zoijcleaow;

    public wkgbmnqykc(String message, f22.zoijcleaow error) {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(error, "error");
        this.f35882iobyxmoadg = message;
        this.f35883zoijcleaow = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f35882iobyxmoadg, wkgbmnqykcVar.f35882iobyxmoadg) && this.f35883zoijcleaow == wkgbmnqykcVar.f35883zoijcleaow;
    }

    public int hashCode() {
        return (this.f35882iobyxmoadg.hashCode() * 31) + this.f35883zoijcleaow.hashCode();
    }

    public final f22.zoijcleaow iobyxmoadg() {
        return this.f35883zoijcleaow;
    }

    public String toString() {
        return "ScanGoWarning(message=" + this.f35882iobyxmoadg + ", error=" + this.f35883zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f35882iobyxmoadg;
    }
}
