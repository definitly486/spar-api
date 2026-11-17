package gy;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f38737gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f38738eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38739iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f38740ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f38741wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f38742zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public wflxmlrfwp(String title, String subtitle, String str, String str2, String str3) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.f38739iobyxmoadg = title;
        this.f38742zoijcleaow = subtitle;
        this.f38740ppxfxbqfkf = str;
        this.f38741wkgbmnqykc = str2;
        this.f38738eablkybsjg = str3;
    }

    public final String eablkybsjg() {
        return this.f38739iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f38739iobyxmoadg, wflxmlrfwpVar.f38739iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38742zoijcleaow, wflxmlrfwpVar.f38742zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f38740ppxfxbqfkf, wflxmlrfwpVar.f38740ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f38741wkgbmnqykc, wflxmlrfwpVar.f38741wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f38738eablkybsjg, wflxmlrfwpVar.f38738eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f38739iobyxmoadg.hashCode() * 31) + this.f38742zoijcleaow.hashCode()) * 31;
        String str = this.f38740ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f38741wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38738eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f38741wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f38738eablkybsjg;
    }

    public String toString() {
        return "DeliveryInfoEntity(title=" + this.f38739iobyxmoadg + ", subtitle=" + this.f38742zoijcleaow + ", price=" + this.f38740ppxfxbqfkf + ", deliveryType=" + this.f38741wkgbmnqykc + ", shopId=" + this.f38738eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f38742zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f38740ppxfxbqfkf;
    }
}
