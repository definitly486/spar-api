package qf0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import o72.Splash;
import ru.myspar.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes4.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Integer f78704btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ru.myspar.main_activity.impl.dxjokdxxww f78705draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final l40.ppxfxbqfkf f78706dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f78707eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f78708gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f78709gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MainTab f78710iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Splash f78711lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f78712nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f78713ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f78714wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f78715wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f78716zoijcleaow;

    public jyumaefscl(MainTab selectedTab, int i13, int i14, boolean z13, boolean z14, String str, Splash splash, boolean z15, l40.ppxfxbqfkf ppxfxbqfkfVar, Integer num, boolean z16, ru.myspar.main_activity.impl.dxjokdxxww dxjokdxxwwVar, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        this.f78710iobyxmoadg = selectedTab;
        this.f78716zoijcleaow = i13;
        this.f78713ppxfxbqfkf = i14;
        this.f78715wkgbmnqykc = z13;
        this.f78707eablkybsjg = z14;
        this.f78709gxszxtbevo = str;
        this.f78711lqeggnwhkg = splash;
        this.f78712nufgyqmvbu = z15;
        this.f78706dxjokdxxww = ppxfxbqfkfVar;
        this.f78704btonecajqb = num;
        this.f78708gtknphoqwx = z16;
        this.f78705draadjrbmk = dxjokdxxwwVar;
        this.f78714wflxmlrfwp = z17;
    }

    public final boolean agtfadlqog() {
        return this.f78715wkgbmnqykc;
    }

    public final Splash btonecajqb() {
        return this.f78711lqeggnwhkg;
    }

    public final boolean draadjrbmk() {
        return this.f78712nufgyqmvbu;
    }

    public final MainTab dxjokdxxww() {
        return this.f78710iobyxmoadg;
    }

    public final ru.myspar.main_activity.impl.dxjokdxxww eablkybsjg() {
        return this.f78705draadjrbmk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return this.f78710iobyxmoadg == jyumaefsclVar.f78710iobyxmoadg && this.f78716zoijcleaow == jyumaefsclVar.f78716zoijcleaow && this.f78713ppxfxbqfkf == jyumaefsclVar.f78713ppxfxbqfkf && this.f78715wkgbmnqykc == jyumaefsclVar.f78715wkgbmnqykc && this.f78707eablkybsjg == jyumaefsclVar.f78707eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f78709gxszxtbevo, jyumaefsclVar.f78709gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f78711lqeggnwhkg, jyumaefsclVar.f78711lqeggnwhkg) && this.f78712nufgyqmvbu == jyumaefsclVar.f78712nufgyqmvbu && this.f78706dxjokdxxww == jyumaefsclVar.f78706dxjokdxxww && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f78704btonecajqb, jyumaefsclVar.f78704btonecajqb) && this.f78708gtknphoqwx == jyumaefsclVar.f78708gtknphoqwx && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f78705draadjrbmk, jyumaefsclVar.f78705draadjrbmk) && this.f78714wflxmlrfwp == jyumaefsclVar.f78714wflxmlrfwp;
    }

    public final boolean gtknphoqwx() {
        return this.f78714wflxmlrfwp;
    }

    public final String gxszxtbevo() {
        return this.f78709gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f78710iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f78716zoijcleaow)) * 31) + Integer.hashCode(this.f78713ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f78715wkgbmnqykc)) * 31) + Boolean.hashCode(this.f78707eablkybsjg)) * 31;
        String str = this.f78709gxszxtbevo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Splash splash = this.f78711lqeggnwhkg;
        int iHashCode3 = (((iHashCode2 + (splash == null ? 0 : splash.hashCode())) * 31) + Boolean.hashCode(this.f78712nufgyqmvbu)) * 31;
        l40.ppxfxbqfkf ppxfxbqfkfVar = this.f78706dxjokdxxww;
        int iHashCode4 = (iHashCode3 + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode())) * 31;
        Integer num = this.f78704btonecajqb;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f78708gtknphoqwx)) * 31;
        ru.myspar.main_activity.impl.dxjokdxxww dxjokdxxwwVar = this.f78705draadjrbmk;
        return ((iHashCode5 + (dxjokdxxwwVar != null ? dxjokdxxwwVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f78714wflxmlrfwp);
    }

    public final jyumaefscl iobyxmoadg(MainTab selectedTab, int i13, int i14, boolean z13, boolean z14, String str, Splash splash, boolean z15, l40.ppxfxbqfkf ppxfxbqfkfVar, Integer num, boolean z16, ru.myspar.main_activity.impl.dxjokdxxww dxjokdxxwwVar, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        return new jyumaefscl(selectedTab, i13, i14, z13, z14, str, splash, z15, ppxfxbqfkfVar, num, z16, dxjokdxxwwVar, z17);
    }

    public final Integer lqeggnwhkg() {
        return this.f78704btonecajqb;
    }

    public final int nufgyqmvbu() {
        return this.f78713ppxfxbqfkf;
    }

    public final int ppxfxbqfkf() {
        return this.f78716zoijcleaow;
    }

    public String toString() {
        return "Model(selectedTab=" + this.f78710iobyxmoadg + ", cartBadge=" + this.f78716zoijcleaow + ", profileBadge=" + this.f78713ppxfxbqfkf + ", isVisibleSplashScreen=" + this.f78715wkgbmnqykc + ", isVisibleGreetingSplashScreen=" + this.f78707eablkybsjg + ", greetingText=" + this.f78709gxszxtbevo + ", splash=" + this.f78711lqeggnwhkg + ", isVisibleGlobalRouter=" + this.f78712nufgyqmvbu + ", currentApiEndPoint=" + this.f78706dxjokdxxww + ", networkCount=" + this.f78704btonecajqb + ", connectionErrorIsVisible=" + this.f78708gtknphoqwx + ", errorState=" + this.f78705draadjrbmk + ", isLoading=" + this.f78714wflxmlrfwp + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.f78707eablkybsjg;
    }

    public final l40.ppxfxbqfkf wkgbmnqykc() {
        return this.f78706dxjokdxxww;
    }

    public /* synthetic */ jyumaefscl(MainTab mainTab, int i13, int i14, boolean z13, boolean z14, String str, Splash splash, boolean z15, l40.ppxfxbqfkf ppxfxbqfkfVar, Integer num, boolean z16, ru.myspar.main_activity.impl.dxjokdxxww dxjokdxxwwVar, boolean z17, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? MainTab.MY_SPAR : mainTab, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? true : z13, (i15 & 16) == 0 ? z14 : true, (i15 & 32) != 0 ? null : str, (i15 & 64) != 0 ? null : splash, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z15, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : ppxfxbqfkfVar, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z16, (i15 & 2048) == 0 ? dxjokdxxwwVar : null, (i15 & 4096) == 0 ? z17 : false);
    }
}
