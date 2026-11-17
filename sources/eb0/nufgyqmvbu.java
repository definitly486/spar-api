package eb0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.legacy.presentation.dialogs.qrcode.models.QrcodeDialogButtonUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final String f31065btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final MeasureTypeModel f31066dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f31067eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f31068gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Double f31069gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31070iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Double f31071lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final QrcodeDialogButtonUiModel f31072nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f31073ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f31074wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f31075zoijcleaow;

    public nufgyqmvbu(String title, String desc, String qrCode, String productTitle, String image, Double d13, Double d14, QrcodeDialogButtonUiModel qrcodeDialogButtonUiModel, MeasureTypeModel measureTypeModel, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(productTitle, "productTitle");
        zdlpuopuiu.btonecajqb(image, "image");
        this.f31070iobyxmoadg = title;
        this.f31075zoijcleaow = desc;
        this.f31073ppxfxbqfkf = qrCode;
        this.f31074wkgbmnqykc = productTitle;
        this.f31067eablkybsjg = image;
        this.f31069gxszxtbevo = d13;
        this.f31071lqeggnwhkg = d14;
        this.f31072nufgyqmvbu = qrcodeDialogButtonUiModel;
        this.f31066dxjokdxxww = measureTypeModel;
        this.f31065btonecajqb = str;
        this.f31068gtknphoqwx = z13;
    }

    public final String btonecajqb() {
        return this.f31065btonecajqb;
    }

    public final String dxjokdxxww() {
        return this.f31070iobyxmoadg;
    }

    public final Double eablkybsjg() {
        return this.f31071lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f31070iobyxmoadg, nufgyqmvbuVar.f31070iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31075zoijcleaow, nufgyqmvbuVar.f31075zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31073ppxfxbqfkf, nufgyqmvbuVar.f31073ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31074wkgbmnqykc, nufgyqmvbuVar.f31074wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f31067eablkybsjg, nufgyqmvbuVar.f31067eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f31069gxszxtbevo, nufgyqmvbuVar.f31069gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f31071lqeggnwhkg, nufgyqmvbuVar.f31071lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f31072nufgyqmvbu, nufgyqmvbuVar.f31072nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f31066dxjokdxxww, nufgyqmvbuVar.f31066dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f31065btonecajqb, nufgyqmvbuVar.f31065btonecajqb) && this.f31068gtknphoqwx == nufgyqmvbuVar.f31068gtknphoqwx;
    }

    public final boolean gtknphoqwx() {
        return this.f31068gtknphoqwx;
    }

    public final Double gxszxtbevo() {
        return this.f31069gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f31070iobyxmoadg.hashCode() * 31) + this.f31075zoijcleaow.hashCode()) * 31) + this.f31073ppxfxbqfkf.hashCode()) * 31) + this.f31074wkgbmnqykc.hashCode()) * 31) + this.f31067eablkybsjg.hashCode()) * 31;
        Double d13 = this.f31069gxszxtbevo;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f31071lqeggnwhkg;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        QrcodeDialogButtonUiModel qrcodeDialogButtonUiModel = this.f31072nufgyqmvbu;
        int iHashCode4 = (iHashCode3 + (qrcodeDialogButtonUiModel == null ? 0 : qrcodeDialogButtonUiModel.hashCode())) * 31;
        MeasureTypeModel measureTypeModel = this.f31066dxjokdxxww;
        int iHashCode5 = (iHashCode4 + (measureTypeModel == null ? 0 : measureTypeModel.hashCode())) * 31;
        String str = this.f31065btonecajqb;
        return ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f31068gtknphoqwx);
    }

    public final QrcodeDialogButtonUiModel iobyxmoadg() {
        return this.f31072nufgyqmvbu;
    }

    public final String lqeggnwhkg() {
        return this.f31074wkgbmnqykc;
    }

    public final String nufgyqmvbu() {
        return this.f31073ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f31067eablkybsjg;
    }

    public String toString() {
        return "Model(title=" + this.f31070iobyxmoadg + ", desc=" + this.f31075zoijcleaow + ", qrCode=" + this.f31073ppxfxbqfkf + ", productTitle=" + this.f31074wkgbmnqykc + ", image=" + this.f31067eablkybsjg + ", productPrice=" + this.f31069gxszxtbevo + ", oldPrice=" + this.f31071lqeggnwhkg + ", button=" + this.f31072nufgyqmvbu + ", measure=" + this.f31066dxjokdxxww + ", unit=" + this.f31065btonecajqb + ", useUnit=" + this.f31068gtknphoqwx + ")";
    }

    public final MeasureTypeModel wkgbmnqykc() {
        return this.f31066dxjokdxxww;
    }

    public final String zoijcleaow() {
        return this.f31075zoijcleaow;
    }
}
