package ud;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yggfygwlhe f113373eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f113374gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113375iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f113376ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f113377wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f113378zoijcleaow;

    public iobyxmoadg(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, yggfygwlhe currentProcessDetails, List appProcessDetails) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageName, "packageName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(versionName, "versionName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appProcessDetails, "appProcessDetails");
        this.f113375iobyxmoadg = packageName;
        this.f113378zoijcleaow = versionName;
        this.f113376ppxfxbqfkf = appBuildVersion;
        this.f113377wkgbmnqykc = deviceManufacturer;
        this.f113373eablkybsjg = currentProcessDetails;
        this.f113374gxszxtbevo = appProcessDetails;
    }

    public final String eablkybsjg() {
        return this.f113375iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113375iobyxmoadg, iobyxmoadgVar.f113375iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113378zoijcleaow, iobyxmoadgVar.f113378zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113376ppxfxbqfkf, iobyxmoadgVar.f113376ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113377wkgbmnqykc, iobyxmoadgVar.f113377wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113373eablkybsjg, iobyxmoadgVar.f113373eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113374gxszxtbevo, iobyxmoadgVar.f113374gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f113378zoijcleaow;
    }

    public int hashCode() {
        return (((((((((this.f113375iobyxmoadg.hashCode() * 31) + this.f113378zoijcleaow.hashCode()) * 31) + this.f113376ppxfxbqfkf.hashCode()) * 31) + this.f113377wkgbmnqykc.hashCode()) * 31) + this.f113373eablkybsjg.hashCode()) * 31) + this.f113374gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f113376ppxfxbqfkf;
    }

    public final yggfygwlhe ppxfxbqfkf() {
        return this.f113373eablkybsjg;
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f113375iobyxmoadg + ", versionName=" + this.f113378zoijcleaow + ", appBuildVersion=" + this.f113376ppxfxbqfkf + ", deviceManufacturer=" + this.f113377wkgbmnqykc + ", currentProcessDetails=" + this.f113373eablkybsjg + ", appProcessDetails=" + this.f113374gxszxtbevo + ')';
    }

    public final String wkgbmnqykc() {
        return this.f113377wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f113374gxszxtbevo;
    }
}
