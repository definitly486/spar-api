package lq1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f63855eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f63856iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final DeliveryCode f63857ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f63858wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f63859zoijcleaow;

    public iobyxmoadg(String bannerId, String str, DeliveryCode deliveryCode, String str2, boolean z13) {
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        this.f63856iobyxmoadg = bannerId;
        this.f63859zoijcleaow = str;
        this.f63857ppxfxbqfkf = deliveryCode;
        this.f63858wkgbmnqykc = str2;
        this.f63855eablkybsjg = z13;
    }

    public final boolean eablkybsjg() {
        return this.f63855eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f63856iobyxmoadg, iobyxmoadgVar.f63856iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63859zoijcleaow, iobyxmoadgVar.f63859zoijcleaow) && this.f63857ppxfxbqfkf == iobyxmoadgVar.f63857ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f63858wkgbmnqykc, iobyxmoadgVar.f63858wkgbmnqykc) && this.f63855eablkybsjg == iobyxmoadgVar.f63855eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f63856iobyxmoadg.hashCode() * 31;
        String str = this.f63859zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryCode deliveryCode = this.f63857ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        String str2 = this.f63858wkgbmnqykc;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f63855eablkybsjg);
    }

    public final String iobyxmoadg() {
        return this.f63856iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f63859zoijcleaow;
    }

    public String toString() {
        return "LandingPageParams(bannerId=" + this.f63856iobyxmoadg + ", shopId=" + this.f63859zoijcleaow + ", deliveryType=" + this.f63857ppxfxbqfkf + ", title=" + this.f63858wkgbmnqykc + ", isAdultConfirmed=" + this.f63855eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f63858wkgbmnqykc;
    }

    public final DeliveryCode zoijcleaow() {
        return this.f63857ppxfxbqfkf;
    }
}
