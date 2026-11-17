package d91;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.models.QrcodeDialogButtonUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final String f27229btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final MeasureTypeModel f27230dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f27231eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f27232gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Double f27233gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27234iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Double f27235lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final QrcodeDialogButtonUiModel f27236nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27237ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f27238wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27239zoijcleaow;

    public nufgyqmvbu(String title, String desc, String qrCode, String productTitle, String image, Double d13, Double d14, QrcodeDialogButtonUiModel qrcodeDialogButtonUiModel, MeasureTypeModel measureTypeModel, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(productTitle, "productTitle");
        zdlpuopuiu.btonecajqb(image, "image");
        this.f27234iobyxmoadg = title;
        this.f27239zoijcleaow = desc;
        this.f27237ppxfxbqfkf = qrCode;
        this.f27238wkgbmnqykc = productTitle;
        this.f27231eablkybsjg = image;
        this.f27233gxszxtbevo = d13;
        this.f27235lqeggnwhkg = d14;
        this.f27236nufgyqmvbu = qrcodeDialogButtonUiModel;
        this.f27230dxjokdxxww = measureTypeModel;
        this.f27229btonecajqb = str;
        this.f27232gtknphoqwx = z13;
    }

    public final String btonecajqb() {
        return this.f27229btonecajqb;
    }

    public final String dxjokdxxww() {
        return this.f27234iobyxmoadg;
    }

    public final Double eablkybsjg() {
        return this.f27235lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f27234iobyxmoadg, nufgyqmvbuVar.f27234iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f27239zoijcleaow, nufgyqmvbuVar.f27239zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f27237ppxfxbqfkf, nufgyqmvbuVar.f27237ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f27238wkgbmnqykc, nufgyqmvbuVar.f27238wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f27231eablkybsjg, nufgyqmvbuVar.f27231eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f27233gxszxtbevo, nufgyqmvbuVar.f27233gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f27235lqeggnwhkg, nufgyqmvbuVar.f27235lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f27236nufgyqmvbu, nufgyqmvbuVar.f27236nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f27230dxjokdxxww, nufgyqmvbuVar.f27230dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f27229btonecajqb, nufgyqmvbuVar.f27229btonecajqb) && this.f27232gtknphoqwx == nufgyqmvbuVar.f27232gtknphoqwx;
    }

    public final boolean gtknphoqwx() {
        return this.f27232gtknphoqwx;
    }

    public final Double gxszxtbevo() {
        return this.f27233gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f27234iobyxmoadg.hashCode() * 31) + this.f27239zoijcleaow.hashCode()) * 31) + this.f27237ppxfxbqfkf.hashCode()) * 31) + this.f27238wkgbmnqykc.hashCode()) * 31) + this.f27231eablkybsjg.hashCode()) * 31;
        Double d13 = this.f27233gxszxtbevo;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f27235lqeggnwhkg;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        QrcodeDialogButtonUiModel qrcodeDialogButtonUiModel = this.f27236nufgyqmvbu;
        int iHashCode4 = (iHashCode3 + (qrcodeDialogButtonUiModel == null ? 0 : qrcodeDialogButtonUiModel.hashCode())) * 31;
        MeasureTypeModel measureTypeModel = this.f27230dxjokdxxww;
        int iHashCode5 = (iHashCode4 + (measureTypeModel == null ? 0 : measureTypeModel.hashCode())) * 31;
        String str = this.f27229btonecajqb;
        return ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f27232gtknphoqwx);
    }

    public final QrcodeDialogButtonUiModel iobyxmoadg() {
        return this.f27236nufgyqmvbu;
    }

    public final String lqeggnwhkg() {
        return this.f27238wkgbmnqykc;
    }

    public final String nufgyqmvbu() {
        return this.f27237ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f27231eablkybsjg;
    }

    public String toString() {
        return "Model(title=" + this.f27234iobyxmoadg + ", desc=" + this.f27239zoijcleaow + ", qrCode=" + this.f27237ppxfxbqfkf + ", productTitle=" + this.f27238wkgbmnqykc + ", image=" + this.f27231eablkybsjg + ", productPrice=" + this.f27233gxszxtbevo + ", oldPrice=" + this.f27235lqeggnwhkg + ", button=" + this.f27236nufgyqmvbu + ", measure=" + this.f27230dxjokdxxww + ", unit=" + this.f27229btonecajqb + ", useUnit=" + this.f27232gtknphoqwx + ")";
    }

    public final MeasureTypeModel wkgbmnqykc() {
        return this.f27230dxjokdxxww;
    }

    public final String zoijcleaow() {
        return this.f27239zoijcleaow;
    }
}
