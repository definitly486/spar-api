package s42;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f105508eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105509iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DeliveryCode f105510ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f105511wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f105512zoijcleaow;

    public iobyxmoadg(String bannerId, String str, DeliveryCode deliveryCode, String str2, boolean z13) {
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        this.f105509iobyxmoadg = bannerId;
        this.f105512zoijcleaow = str;
        this.f105510ppxfxbqfkf = deliveryCode;
        this.f105511wkgbmnqykc = str2;
        this.f105508eablkybsjg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f105508eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f105509iobyxmoadg, iobyxmoadgVar.f105509iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105512zoijcleaow, iobyxmoadgVar.f105512zoijcleaow) && this.f105510ppxfxbqfkf == iobyxmoadgVar.f105510ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f105511wkgbmnqykc, iobyxmoadgVar.f105511wkgbmnqykc) && this.f105508eablkybsjg == iobyxmoadgVar.f105508eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f105509iobyxmoadg.hashCode() * 31;
        String str = this.f105512zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryCode deliveryCode = this.f105510ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        String str2 = this.f105511wkgbmnqykc;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f105508eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f105509iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f105512zoijcleaow;
    }

    public String toString() {
        return "LandingPageParams(bannerId=" + this.f105509iobyxmoadg + ", shopId=" + this.f105512zoijcleaow + ", deliveryType=" + this.f105510ppxfxbqfkf + ", title=" + this.f105511wkgbmnqykc + ", isAdultConfirmed=" + this.f105508eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f105511wkgbmnqykc;
    }

    public final DeliveryCode zoijcleaow() {
        return this.f105510ppxfxbqfkf;
    }
}
