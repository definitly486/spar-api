package l91;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mapkit.geometry.Point;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f61970cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f61971esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final List f61972istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f61973iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f61974jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Point f61975lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final double f61976pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f61977yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f61978zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final List f61979zynmafqrjb;

    public wkgbmnqykc(String itemId, String str, String str2, String str3, String type, boolean z13, Point point, double d13, List servicesNames, List services) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(point, "point");
        zdlpuopuiu.btonecajqb(servicesNames, "servicesNames");
        zdlpuopuiu.btonecajqb(services, "services");
        this.f61978zdlpuopuiu = itemId;
        this.f61977yggfygwlhe = str;
        this.f61974jyumaefscl = str2;
        this.f61973iwizpuwonk = str3;
        this.f61970cqumvgiudr = type;
        this.f61971esjtqupxsv = z13;
        this.f61975lereixgezr = point;
        this.f61976pmvmpeiblj = d13;
        this.f61979zynmafqrjb = servicesNames;
        this.f61972istkbnxepw = services;
    }

    public final Point eablkybsjg() {
        return this.f61975lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f61978zdlpuopuiu, wkgbmnqykcVar.f61978zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f61977yggfygwlhe, wkgbmnqykcVar.f61977yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f61974jyumaefscl, wkgbmnqykcVar.f61974jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f61973iwizpuwonk, wkgbmnqykcVar.f61973iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f61970cqumvgiudr, wkgbmnqykcVar.f61970cqumvgiudr) && this.f61971esjtqupxsv == wkgbmnqykcVar.f61971esjtqupxsv && zdlpuopuiu.eablkybsjg(this.f61975lereixgezr, wkgbmnqykcVar.f61975lereixgezr) && Double.compare(this.f61976pmvmpeiblj, wkgbmnqykcVar.f61976pmvmpeiblj) == 0 && zdlpuopuiu.eablkybsjg(this.f61979zynmafqrjb, wkgbmnqykcVar.f61979zynmafqrjb) && zdlpuopuiu.eablkybsjg(this.f61972istkbnxepw, wkgbmnqykcVar.f61972istkbnxepw);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f61978zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = this.f61978zdlpuopuiu.hashCode() * 31;
        String str = this.f61977yggfygwlhe;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61974jyumaefscl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61973iwizpuwonk;
        return ((((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f61970cqumvgiudr.hashCode()) * 31) + Boolean.hashCode(this.f61971esjtqupxsv)) * 31) + this.f61975lereixgezr.hashCode()) * 31) + Double.hashCode(this.f61976pmvmpeiblj)) * 31) + this.f61979zynmafqrjb.hashCode()) * 31) + this.f61972istkbnxepw.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f61974jyumaefscl;
    }

    public final List lqeggnwhkg() {
        return this.f61979zynmafqrjb;
    }

    public final String nufgyqmvbu() {
        return this.f61970cqumvgiudr;
    }

    public String toString() {
        return "ShopUiModel(itemId=" + this.f61978zdlpuopuiu + ", name=" + this.f61977yggfygwlhe + ", address=" + this.f61974jyumaefscl + ", hours=" + this.f61973iwizpuwonk + ", type=" + this.f61970cqumvgiudr + ", isSelected=" + this.f61971esjtqupxsv + ", point=" + this.f61975lereixgezr + ", distanceFromUser=" + this.f61976pmvmpeiblj + ", servicesNames=" + this.f61979zynmafqrjb + ", services=" + this.f61972istkbnxepw + ")";
    }

    public final String wkgbmnqykc() {
        return this.f61973iwizpuwonk;
    }

    public /* synthetic */ wkgbmnqykc(String str, String str2, String str3, String str4, String str5, boolean z13, Point point, double d13, List list, List list2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, str4, str5, z13, point, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0d : d13, list, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list2);
    }
}
