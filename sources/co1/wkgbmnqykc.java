package co1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f20257iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bo1.zoijcleaow f20258zoijcleaow;

    public wkgbmnqykc(String message, bo1.zoijcleaow error) {
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(error, "error");
        this.f20257iobyxmoadg = message;
        this.f20258zoijcleaow = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f20257iobyxmoadg, wkgbmnqykcVar.f20257iobyxmoadg) && this.f20258zoijcleaow == wkgbmnqykcVar.f20258zoijcleaow;
    }

    public int hashCode() {
        return (this.f20257iobyxmoadg.hashCode() * 31) + this.f20258zoijcleaow.hashCode();
    }

    public final bo1.zoijcleaow iobyxmoadg() {
        return this.f20258zoijcleaow;
    }

    public String toString() {
        return "ScanGoWarning(message=" + this.f20257iobyxmoadg + ", error=" + this.f20258zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f20257iobyxmoadg;
    }
}
