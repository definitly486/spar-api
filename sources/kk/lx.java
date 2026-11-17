package kk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes3.dex */
public class lx {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final Integer f57538dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String f57539eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final Integer f57540gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final vu f57541iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final String f57542lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final boolean f57543nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f57544ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Integer f57545wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f57546zoijcleaow;

    public lx(vu title, String name, int i13, Integer num, String number, Integer num2, String str, boolean z13, Integer num3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
        this.f57541iobyxmoadg = title;
        this.f57546zoijcleaow = name;
        this.f57544ppxfxbqfkf = i13;
        this.f57545wkgbmnqykc = num;
        this.f57539eablkybsjg = number;
        this.f57540gxszxtbevo = num2;
        this.f57542lqeggnwhkg = str;
        this.f57543nufgyqmvbu = z13;
        this.f57538dxjokdxxww = num3;
    }

    public boolean eablkybsjg() {
        return this.f57543nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), lxVar.nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), lxVar.zoijcleaow()) && wkgbmnqykc() == lxVar.wkgbmnqykc() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevo(), lxVar.gxszxtbevo()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkf(), lxVar.ppxfxbqfkf()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), lxVar.iobyxmoadg()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57542lqeggnwhkg, lxVar.f57542lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkg(), lxVar.lqeggnwhkg());
    }

    public Integer gxszxtbevo() {
        return this.f57545wkgbmnqykc;
    }

    public int hashCode() {
        int iWkgbmnqykc = (wkgbmnqykc() + ((zoijcleaow().hashCode() + (nufgyqmvbu().hashCode() * 31)) * 31)) * 31;
        Integer numGxszxtbevo = gxszxtbevo();
        int iHashCode = (ppxfxbqfkf().hashCode() + ((iWkgbmnqykc + (numGxszxtbevo != null ? numGxszxtbevo.intValue() : 0)) * 31)) * 31;
        Integer numIobyxmoadg = iobyxmoadg();
        int iIntValue = (iHashCode + (numIobyxmoadg != null ? numIobyxmoadg.intValue() : 0)) * 31;
        String str = this.f57542lqeggnwhkg;
        int iHashCode2 = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        Integer numLqeggnwhkg = lqeggnwhkg();
        return iHashCode2 + (numLqeggnwhkg != null ? numLqeggnwhkg.hashCode() : 0);
    }

    public Integer iobyxmoadg() {
        return this.f57540gxszxtbevo;
    }

    public Integer lqeggnwhkg() {
        return this.f57538dxjokdxxww;
    }

    public vu nufgyqmvbu() {
        return this.f57541iobyxmoadg;
    }

    public String ppxfxbqfkf() {
        return this.f57539eablkybsjg;
    }

    public String toString() {
        return "CardPresentationData(title=" + nufgyqmvbu() + ", name='" + zoijcleaow() + "', numberResId=" + wkgbmnqykc() + ", pluralsResId=" + gxszxtbevo() + ", number='" + ppxfxbqfkf() + "', cardsCount=" + iobyxmoadg() + ", image=" + this.f57542lqeggnwhkg + ", precalculateBonuses=" + lqeggnwhkg() + ")";
    }

    public int wkgbmnqykc() {
        return this.f57544ppxfxbqfkf;
    }

    public String zoijcleaow() {
        return this.f57546zoijcleaow;
    }

    public /* synthetic */ lx(vu vuVar, String str, int i13, Integer num, String str2, Integer num2, String str3, boolean z13, Integer num3, int i14) {
        this(vuVar, str, i13, (i14 & 8) != 0 ? null : num, str2, (i14 & 32) != 0 ? null : num2, str3, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : num3);
    }
}
