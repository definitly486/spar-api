package qi0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f78881dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f78882eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f78883gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f78884iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f78885lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final x00.iobyxmoadg f78886nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78887ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f78888wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f78889zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List userSubscriptions, boolean z18, x00.iobyxmoadg darkModeState, boolean z19) {
        zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        this.f78884iobyxmoadg = z13;
        this.f78889zoijcleaow = z14;
        this.f78887ppxfxbqfkf = z15;
        this.f78888wkgbmnqykc = z16;
        this.f78882eablkybsjg = z17;
        this.f78883gxszxtbevo = userSubscriptions;
        this.f78885lqeggnwhkg = z18;
        this.f78886nufgyqmvbu = darkModeState;
        this.f78881dxjokdxxww = z19;
    }

    public final boolean dxjokdxxww() {
        return this.f78889zoijcleaow;
    }

    public final boolean eablkybsjg() {
        return this.f78884iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f78884iobyxmoadg == lqeggnwhkgVar.f78884iobyxmoadg && this.f78889zoijcleaow == lqeggnwhkgVar.f78889zoijcleaow && this.f78887ppxfxbqfkf == lqeggnwhkgVar.f78887ppxfxbqfkf && this.f78888wkgbmnqykc == lqeggnwhkgVar.f78888wkgbmnqykc && this.f78882eablkybsjg == lqeggnwhkgVar.f78882eablkybsjg && zdlpuopuiu.eablkybsjg(this.f78883gxszxtbevo, lqeggnwhkgVar.f78883gxszxtbevo) && this.f78885lqeggnwhkg == lqeggnwhkgVar.f78885lqeggnwhkg && this.f78886nufgyqmvbu == lqeggnwhkgVar.f78886nufgyqmvbu && this.f78881dxjokdxxww == lqeggnwhkgVar.f78881dxjokdxxww;
    }

    public final boolean gxszxtbevo() {
        return this.f78881dxjokdxxww;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f78884iobyxmoadg) * 31) + Boolean.hashCode(this.f78889zoijcleaow)) * 31) + Boolean.hashCode(this.f78887ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f78888wkgbmnqykc)) * 31) + Boolean.hashCode(this.f78882eablkybsjg)) * 31) + this.f78883gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f78885lqeggnwhkg)) * 31) + this.f78886nufgyqmvbu.hashCode()) * 31) + Boolean.hashCode(this.f78881dxjokdxxww);
    }

    public final x00.iobyxmoadg iobyxmoadg() {
        return this.f78886nufgyqmvbu;
    }

    public final boolean lqeggnwhkg() {
        return this.f78887ppxfxbqfkf;
    }

    public final boolean nufgyqmvbu() {
        return this.f78882eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f78888wkgbmnqykc;
    }

    public String toString() {
        return "UiModel(isEmailNotificationEnabled=" + this.f78884iobyxmoadg + ", isSmsNotificationEnabled=" + this.f78889zoijcleaow + ", isPushNotificationEnabled=" + this.f78887ppxfxbqfkf + ", isAutoBrightnessEnabled=" + this.f78888wkgbmnqykc + ", isShowQrEnabled=" + this.f78882eablkybsjg + ", userSubscriptions=" + this.f78883gxszxtbevo + ", isDarkModeOptionVisible=" + this.f78885lqeggnwhkg + ", darkModeState=" + this.f78886nufgyqmvbu + ", isLoading=" + this.f78881dxjokdxxww + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f78885lqeggnwhkg;
    }

    public final List zoijcleaow() {
        return this.f78883gxszxtbevo;
    }
}
