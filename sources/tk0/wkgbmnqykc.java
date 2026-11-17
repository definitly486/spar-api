package tk0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f110986btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f110987dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f110988eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Integer f110989gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f110990iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f110991lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f110992nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f110993ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f110994wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final uk0.iobyxmoadg f110995zoijcleaow;

    public wkgbmnqykc(boolean z13, uk0.iobyxmoadg authState, boolean z14, int i13, int i14, Integer num, boolean z15, boolean z16, boolean z17, List items) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authState, "authState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        this.f110990iobyxmoadg = z13;
        this.f110995zoijcleaow = authState;
        this.f110993ppxfxbqfkf = z14;
        this.f110994wkgbmnqykc = i13;
        this.f110988eablkybsjg = i14;
        this.f110989gxszxtbevo = num;
        this.f110991lqeggnwhkg = z15;
        this.f110992nufgyqmvbu = z16;
        this.f110987dxjokdxxww = z17;
        this.f110986btonecajqb = items;
    }

    public final List eablkybsjg() {
        return this.f110986btonecajqb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f110990iobyxmoadg == wkgbmnqykcVar.f110990iobyxmoadg && this.f110995zoijcleaow == wkgbmnqykcVar.f110995zoijcleaow && this.f110993ppxfxbqfkf == wkgbmnqykcVar.f110993ppxfxbqfkf && this.f110994wkgbmnqykc == wkgbmnqykcVar.f110994wkgbmnqykc && this.f110988eablkybsjg == wkgbmnqykcVar.f110988eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f110989gxszxtbevo, wkgbmnqykcVar.f110989gxszxtbevo) && this.f110991lqeggnwhkg == wkgbmnqykcVar.f110991lqeggnwhkg && this.f110992nufgyqmvbu == wkgbmnqykcVar.f110992nufgyqmvbu && this.f110987dxjokdxxww == wkgbmnqykcVar.f110987dxjokdxxww && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f110986btonecajqb, wkgbmnqykcVar.f110986btonecajqb);
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f110990iobyxmoadg) * 31) + this.f110995zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f110993ppxfxbqfkf)) * 31) + Integer.hashCode(this.f110994wkgbmnqykc)) * 31) + Integer.hashCode(this.f110988eablkybsjg)) * 31;
        Integer num = this.f110989gxszxtbevo;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f110991lqeggnwhkg)) * 31) + Boolean.hashCode(this.f110992nufgyqmvbu)) * 31) + Boolean.hashCode(this.f110987dxjokdxxww)) * 31) + this.f110986btonecajqb.hashCode();
    }

    public final wkgbmnqykc iobyxmoadg(boolean z13, uk0.iobyxmoadg authState, boolean z14, int i13, int i14, Integer num, boolean z15, boolean z16, boolean z17, List items) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authState, "authState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        return new wkgbmnqykc(z13, authState, z14, i13, i14, num, z15, z16, z17, items);
    }

    public final uk0.iobyxmoadg ppxfxbqfkf() {
        return this.f110995zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f110990iobyxmoadg + ", authState=" + this.f110995zoijcleaow + ", optionsIsVisible=" + this.f110993ppxfxbqfkf + ", notificationsNew=" + this.f110994wkgbmnqykc + ", discountsNew=" + this.f110988eablkybsjg + ", balance=" + this.f110989gxszxtbevo + ", isMyDiscountEnabled=" + this.f110991lqeggnwhkg + ", isSavedCardsEnabled=" + this.f110992nufgyqmvbu + ", isPurchasesListEnabled=" + this.f110987dxjokdxxww + ", items=" + this.f110986btonecajqb + ")";
    }

    public final Integer wkgbmnqykc() {
        return this.f110989gxszxtbevo;
    }

    public /* synthetic */ wkgbmnqykc(boolean z13, uk0.iobyxmoadg iobyxmoadgVar, boolean z14, int i13, int i14, Integer num, boolean z15, boolean z16, boolean z17, List list, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? false : z13, iobyxmoadgVar, (i15 & 4) != 0 ? false : z14, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? false : z15, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z16, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z17, list);
    }
}
