package qf1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f78742dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f78743eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f78744gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f78745iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f78746lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final oz0.iobyxmoadg f78747nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78748ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f78749wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f78750zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List userSubscriptions, boolean z18, oz0.iobyxmoadg darkModeState, boolean z19) {
        zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        this.f78745iobyxmoadg = z13;
        this.f78750zoijcleaow = z14;
        this.f78748ppxfxbqfkf = z15;
        this.f78749wkgbmnqykc = z16;
        this.f78743eablkybsjg = z17;
        this.f78744gxszxtbevo = userSubscriptions;
        this.f78746lqeggnwhkg = z18;
        this.f78747nufgyqmvbu = darkModeState;
        this.f78742dxjokdxxww = z19;
    }

    public final boolean dxjokdxxww() {
        return this.f78750zoijcleaow;
    }

    public final boolean eablkybsjg() {
        return this.f78745iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f78745iobyxmoadg == lqeggnwhkgVar.f78745iobyxmoadg && this.f78750zoijcleaow == lqeggnwhkgVar.f78750zoijcleaow && this.f78748ppxfxbqfkf == lqeggnwhkgVar.f78748ppxfxbqfkf && this.f78749wkgbmnqykc == lqeggnwhkgVar.f78749wkgbmnqykc && this.f78743eablkybsjg == lqeggnwhkgVar.f78743eablkybsjg && zdlpuopuiu.eablkybsjg(this.f78744gxszxtbevo, lqeggnwhkgVar.f78744gxszxtbevo) && this.f78746lqeggnwhkg == lqeggnwhkgVar.f78746lqeggnwhkg && this.f78747nufgyqmvbu == lqeggnwhkgVar.f78747nufgyqmvbu && this.f78742dxjokdxxww == lqeggnwhkgVar.f78742dxjokdxxww;
    }

    public final boolean gxszxtbevo() {
        return this.f78742dxjokdxxww;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f78745iobyxmoadg) * 31) + Boolean.hashCode(this.f78750zoijcleaow)) * 31) + Boolean.hashCode(this.f78748ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f78749wkgbmnqykc)) * 31) + Boolean.hashCode(this.f78743eablkybsjg)) * 31) + this.f78744gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f78746lqeggnwhkg)) * 31) + this.f78747nufgyqmvbu.hashCode()) * 31) + Boolean.hashCode(this.f78742dxjokdxxww);
    }

    public final oz0.iobyxmoadg iobyxmoadg() {
        return this.f78747nufgyqmvbu;
    }

    public final boolean lqeggnwhkg() {
        return this.f78748ppxfxbqfkf;
    }

    public final boolean nufgyqmvbu() {
        return this.f78743eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f78749wkgbmnqykc;
    }

    public String toString() {
        return "UiModel(isEmailNotificationEnabled=" + this.f78745iobyxmoadg + ", isSmsNotificationEnabled=" + this.f78750zoijcleaow + ", isPushNotificationEnabled=" + this.f78748ppxfxbqfkf + ", isAutoBrightnessEnabled=" + this.f78749wkgbmnqykc + ", isShowQrEnabled=" + this.f78743eablkybsjg + ", userSubscriptions=" + this.f78744gxszxtbevo + ", isDarkModeOptionVisible=" + this.f78746lqeggnwhkg + ", darkModeState=" + this.f78747nufgyqmvbu + ", isLoading=" + this.f78742dxjokdxxww + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f78746lqeggnwhkg;
    }

    public final List zoijcleaow() {
        return this.f78744gxszxtbevo;
    }
}
