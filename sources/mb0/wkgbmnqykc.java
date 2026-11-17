package mb0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mapkit.geometry.Point;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f66742cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f66743esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final List f66744istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f66745iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f66746jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Point f66747lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final double f66748pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f66749yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f66750zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final List f66751zynmafqrjb;

    public wkgbmnqykc(String itemId, String str, String str2, String str3, String type, boolean z13, Point point, double d13, List servicesNames, List services) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(point, "point");
        zdlpuopuiu.btonecajqb(servicesNames, "servicesNames");
        zdlpuopuiu.btonecajqb(services, "services");
        this.f66750zdlpuopuiu = itemId;
        this.f66749yggfygwlhe = str;
        this.f66746jyumaefscl = str2;
        this.f66745iwizpuwonk = str3;
        this.f66742cqumvgiudr = type;
        this.f66743esjtqupxsv = z13;
        this.f66747lereixgezr = point;
        this.f66748pmvmpeiblj = d13;
        this.f66751zynmafqrjb = servicesNames;
        this.f66744istkbnxepw = services;
    }

    public final Point eablkybsjg() {
        return this.f66747lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f66750zdlpuopuiu, wkgbmnqykcVar.f66750zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f66749yggfygwlhe, wkgbmnqykcVar.f66749yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f66746jyumaefscl, wkgbmnqykcVar.f66746jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f66745iwizpuwonk, wkgbmnqykcVar.f66745iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f66742cqumvgiudr, wkgbmnqykcVar.f66742cqumvgiudr) && this.f66743esjtqupxsv == wkgbmnqykcVar.f66743esjtqupxsv && zdlpuopuiu.eablkybsjg(this.f66747lereixgezr, wkgbmnqykcVar.f66747lereixgezr) && Double.compare(this.f66748pmvmpeiblj, wkgbmnqykcVar.f66748pmvmpeiblj) == 0 && zdlpuopuiu.eablkybsjg(this.f66751zynmafqrjb, wkgbmnqykcVar.f66751zynmafqrjb) && zdlpuopuiu.eablkybsjg(this.f66744istkbnxepw, wkgbmnqykcVar.f66744istkbnxepw);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f66750zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = this.f66750zdlpuopuiu.hashCode() * 31;
        String str = this.f66749yggfygwlhe;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66746jyumaefscl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66745iwizpuwonk;
        return ((((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f66742cqumvgiudr.hashCode()) * 31) + Boolean.hashCode(this.f66743esjtqupxsv)) * 31) + this.f66747lereixgezr.hashCode()) * 31) + Double.hashCode(this.f66748pmvmpeiblj)) * 31) + this.f66751zynmafqrjb.hashCode()) * 31) + this.f66744istkbnxepw.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f66746jyumaefscl;
    }

    public final List lqeggnwhkg() {
        return this.f66751zynmafqrjb;
    }

    public final String nufgyqmvbu() {
        return this.f66742cqumvgiudr;
    }

    public String toString() {
        return "ShopUiModel(itemId=" + this.f66750zdlpuopuiu + ", name=" + this.f66749yggfygwlhe + ", address=" + this.f66746jyumaefscl + ", hours=" + this.f66745iwizpuwonk + ", type=" + this.f66742cqumvgiudr + ", isSelected=" + this.f66743esjtqupxsv + ", point=" + this.f66747lereixgezr + ", distanceFromUser=" + this.f66748pmvmpeiblj + ", servicesNames=" + this.f66751zynmafqrjb + ", services=" + this.f66744istkbnxepw + ")";
    }

    public final String wkgbmnqykc() {
        return this.f66745iwizpuwonk;
    }

    public /* synthetic */ wkgbmnqykc(String str, String str2, String str3, String str4, String str5, boolean z13, Point point, double d13, List list, List list2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, str4, str5, z13, point, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0d : d13, list, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list2);
    }
}
