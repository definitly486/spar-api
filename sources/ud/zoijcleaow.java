package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zdlpuopuiu f113465eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final iobyxmoadg f113466gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113467iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f113468ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f113469wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f113470zoijcleaow;

    public zoijcleaow(String appId, String deviceModel, String sessionSdkVersion, String osVersion, zdlpuopuiu logEnvironment, iobyxmoadg androidAppInfo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appId, "appId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceModel, "deviceModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(osVersion, "osVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(androidAppInfo, "androidAppInfo");
        this.f113467iobyxmoadg = appId;
        this.f113470zoijcleaow = deviceModel;
        this.f113468ppxfxbqfkf = sessionSdkVersion;
        this.f113469wkgbmnqykc = osVersion;
        this.f113465eablkybsjg = logEnvironment;
        this.f113466gxszxtbevo = androidAppInfo;
    }

    public final String eablkybsjg() {
        return this.f113469wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113467iobyxmoadg, zoijcleaowVar.f113467iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113470zoijcleaow, zoijcleaowVar.f113470zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113468ppxfxbqfkf, zoijcleaowVar.f113468ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113469wkgbmnqykc, zoijcleaowVar.f113469wkgbmnqykc) && this.f113465eablkybsjg == zoijcleaowVar.f113465eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113466gxszxtbevo, zoijcleaowVar.f113466gxszxtbevo);
    }

    public final String gxszxtbevo() {
        return this.f113468ppxfxbqfkf;
    }

    public int hashCode() {
        return (((((((((this.f113467iobyxmoadg.hashCode() * 31) + this.f113470zoijcleaow.hashCode()) * 31) + this.f113468ppxfxbqfkf.hashCode()) * 31) + this.f113469wkgbmnqykc.hashCode()) * 31) + this.f113465eablkybsjg.hashCode()) * 31) + this.f113466gxszxtbevo.hashCode();
    }

    public final iobyxmoadg iobyxmoadg() {
        return this.f113466gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f113470zoijcleaow;
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f113467iobyxmoadg + ", deviceModel=" + this.f113470zoijcleaow + ", sessionSdkVersion=" + this.f113468ppxfxbqfkf + ", osVersion=" + this.f113469wkgbmnqykc + ", logEnvironment=" + this.f113465eablkybsjg + ", androidAppInfo=" + this.f113466gxszxtbevo + ')';
    }

    public final zdlpuopuiu wkgbmnqykc() {
        return this.f113465eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f113467iobyxmoadg;
    }
}
