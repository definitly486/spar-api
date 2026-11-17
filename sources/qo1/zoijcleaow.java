package qo1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final c21.iobyxmoadg f80423dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f80424eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f80425gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f80426iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f80427lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f80428nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f80429ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f80430wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f80431zoijcleaow;

    public zoijcleaow(int i13, String article, String name, int i14, String amount, double d13, String pricePerUnit, String totalPrice, c21.iobyxmoadg measureType) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        this.f80426iobyxmoadg = i13;
        this.f80431zoijcleaow = article;
        this.f80429ppxfxbqfkf = name;
        this.f80430wkgbmnqykc = i14;
        this.f80424eablkybsjg = amount;
        this.f80425gxszxtbevo = d13;
        this.f80427lqeggnwhkg = pricePerUnit;
        this.f80428nufgyqmvbu = totalPrice;
        this.f80423dxjokdxxww = measureType;
    }

    public final String eablkybsjg() {
        return this.f80428nufgyqmvbu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f80426iobyxmoadg == zoijcleaowVar.f80426iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f80431zoijcleaow, zoijcleaowVar.f80431zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80429ppxfxbqfkf, zoijcleaowVar.f80429ppxfxbqfkf) && this.f80430wkgbmnqykc == zoijcleaowVar.f80430wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f80424eablkybsjg, zoijcleaowVar.f80424eablkybsjg) && Double.compare(this.f80425gxszxtbevo, zoijcleaowVar.f80425gxszxtbevo) == 0 && zdlpuopuiu.eablkybsjg(this.f80427lqeggnwhkg, zoijcleaowVar.f80427lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f80428nufgyqmvbu, zoijcleaowVar.f80428nufgyqmvbu) && this.f80423dxjokdxxww == zoijcleaowVar.f80423dxjokdxxww;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f80426iobyxmoadg) * 31) + this.f80431zoijcleaow.hashCode()) * 31) + this.f80429ppxfxbqfkf.hashCode()) * 31) + Integer.hashCode(this.f80430wkgbmnqykc)) * 31) + this.f80424eablkybsjg.hashCode()) * 31) + Double.hashCode(this.f80425gxszxtbevo)) * 31) + this.f80427lqeggnwhkg.hashCode()) * 31) + this.f80428nufgyqmvbu.hashCode()) * 31) + this.f80423dxjokdxxww.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f80424eablkybsjg;
    }

    public final int ppxfxbqfkf() {
        return this.f80430wkgbmnqykc;
    }

    public String toString() {
        return "ScanGoTutorialProductUiModel(id=" + this.f80426iobyxmoadg + ", article=" + this.f80431zoijcleaow + ", name=" + this.f80429ppxfxbqfkf + ", pictureRes=" + this.f80430wkgbmnqykc + ", amount=" + this.f80424eablkybsjg + ", quantity=" + this.f80425gxszxtbevo + ", pricePerUnit=" + this.f80427lqeggnwhkg + ", totalPrice=" + this.f80428nufgyqmvbu + ", measureType=" + this.f80423dxjokdxxww + ")";
    }

    public final String wkgbmnqykc() {
        return this.f80427lqeggnwhkg;
    }

    public final String zoijcleaow() {
        return this.f80429ppxfxbqfkf;
    }

    public /* synthetic */ zoijcleaow(int i13, String str, String str2, int i14, String str3, double d13, String str4, String str5, c21.iobyxmoadg iobyxmoadgVar, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, i14, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? 0.0d : d13, (i15 & 64) != 0 ? "" : str4, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str5, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? c21.iobyxmoadg.UNDEFINED : iobyxmoadgVar);
    }
}
