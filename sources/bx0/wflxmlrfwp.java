package bx0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f17303gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f17304eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f17305iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f17306ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f17307wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f17308zoijcleaow;

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
        this.f17305iobyxmoadg = title;
        this.f17308zoijcleaow = subtitle;
        this.f17306ppxfxbqfkf = str;
        this.f17307wkgbmnqykc = str2;
        this.f17304eablkybsjg = str3;
    }

    public final String eablkybsjg() {
        return this.f17305iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f17305iobyxmoadg, wflxmlrfwpVar.f17305iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17308zoijcleaow, wflxmlrfwpVar.f17308zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17306ppxfxbqfkf, wflxmlrfwpVar.f17306ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17307wkgbmnqykc, wflxmlrfwpVar.f17307wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f17304eablkybsjg, wflxmlrfwpVar.f17304eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((this.f17305iobyxmoadg.hashCode() * 31) + this.f17308zoijcleaow.hashCode()) * 31;
        String str = this.f17306ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17307wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17304eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f17307wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f17304eablkybsjg;
    }

    public String toString() {
        return "DeliveryInfoEntity(title=" + this.f17305iobyxmoadg + ", subtitle=" + this.f17308zoijcleaow + ", price=" + this.f17306ppxfxbqfkf + ", deliveryType=" + this.f17307wkgbmnqykc + ", shopId=" + this.f17304eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f17308zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f17306ppxfxbqfkf;
    }
}
