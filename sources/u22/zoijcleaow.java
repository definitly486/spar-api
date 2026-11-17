package u22;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final x30.iobyxmoadg f112530dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f112531eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f112532gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f112533iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f112534lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f112535nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f112536ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f112537wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f112538zoijcleaow;

    public zoijcleaow(int i13, String article, String name, int i14, String amount, double d13, String pricePerUnit, String totalPrice, x30.iobyxmoadg measureType) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        this.f112533iobyxmoadg = i13;
        this.f112538zoijcleaow = article;
        this.f112536ppxfxbqfkf = name;
        this.f112537wkgbmnqykc = i14;
        this.f112531eablkybsjg = amount;
        this.f112532gxszxtbevo = d13;
        this.f112534lqeggnwhkg = pricePerUnit;
        this.f112535nufgyqmvbu = totalPrice;
        this.f112530dxjokdxxww = measureType;
    }

    public final String eablkybsjg() {
        return this.f112535nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f112533iobyxmoadg == zoijcleaowVar.f112533iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f112538zoijcleaow, zoijcleaowVar.f112538zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f112536ppxfxbqfkf, zoijcleaowVar.f112536ppxfxbqfkf) && this.f112537wkgbmnqykc == zoijcleaowVar.f112537wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f112531eablkybsjg, zoijcleaowVar.f112531eablkybsjg) && Double.compare(this.f112532gxszxtbevo, zoijcleaowVar.f112532gxszxtbevo) == 0 && zdlpuopuiu.eablkybsjg(this.f112534lqeggnwhkg, zoijcleaowVar.f112534lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f112535nufgyqmvbu, zoijcleaowVar.f112535nufgyqmvbu) && this.f112530dxjokdxxww == zoijcleaowVar.f112530dxjokdxxww;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f112533iobyxmoadg) * 31) + this.f112538zoijcleaow.hashCode()) * 31) + this.f112536ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f112537wkgbmnqykc)) * 31) + this.f112531eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f112532gxszxtbevo)) * 31) + this.f112534lqeggnwhkg.hashCode()) * 31) + this.f112535nufgyqmvbu.hashCode()) * 31) + this.f112530dxjokdxxww.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f112531eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f112537wkgbmnqykc;
    }

    public String toString() {
        return "ScanGoTutorialProductUiModel(id=" + this.f112533iobyxmoadg + ", article=" + this.f112538zoijcleaow + ", name=" + this.f112536ppxfxbqfkf + ", pictureRes=" + this.f112537wkgbmnqykc + ", amount=" + this.f112531eablkybsjg + ", quantity=" + this.f112532gxszxtbevo + ", pricePerUnit=" + this.f112534lqeggnwhkg + ", totalPrice=" + this.f112535nufgyqmvbu + ", measureType=" + this.f112530dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f112534lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f112536ppxfxbqfkf;
    }

    public /* synthetic */ zoijcleaow(int i13, String str, String str2, int i14, String str3, double d13, String str4, String str5, x30.iobyxmoadg iobyxmoadgVar, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, i14, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? 0.0d : d13, (i15 & 64) != 0 ? "" : str4, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str5, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? x30.iobyxmoadg.UNDEFINED : iobyxmoadgVar);
    }
}
