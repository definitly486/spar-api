package ru.myspar.proloyalty.scango.impl.component.domain.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import bo1.ppxfxbqfkf;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoScanMatrixPayload;", "Landroid/os/Parcelable;", "", "barcode", "", "quantity", "Lbo1/iobyxmoadg;", "scanGoAmountMode", "Lbo1/ppxfxbqfkf;", "scanGoProductType", "<init>", "(Ljava/lang/String;DLbo1/iobyxmoadg;Lbo1/ppxfxbqfkf;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "D", "ppxfxbqfkf", "()D", "jyumaefscl", "Lbo1/iobyxmoadg;", "eablkybsjg", "()Lbo1/iobyxmoadg;", "iwizpuwonk", "Lbo1/ppxfxbqfkf;", "gxszxtbevo", "()Lbo1/ppxfxbqfkf;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScanGoScanMatrixPayload implements Parcelable {
    public static final Parcelable.Creator<ScanGoScanMatrixPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf scanGoProductType;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final bo1.iobyxmoadg scanGoAmountMode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String barcode;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScanGoScanMatrixPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ScanGoScanMatrixPayload(parcel.readString(), parcel.readDouble(), bo1.iobyxmoadg.valueOf(parcel.readString()), ppxfxbqfkf.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ScanGoScanMatrixPayload[] newArray(int i13) {
            return new ScanGoScanMatrixPayload[i13];
        }
    }

    public ScanGoScanMatrixPayload(String barcode, double d13, bo1.iobyxmoadg scanGoAmountMode, ppxfxbqfkf scanGoProductType) {
        zdlpuopuiu.btonecajqb(barcode, "barcode");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        zdlpuopuiu.btonecajqb(scanGoProductType, "scanGoProductType");
        this.barcode = barcode;
        this.quantity = d13;
        this.scanGoAmountMode = scanGoAmountMode;
        this.scanGoProductType = scanGoProductType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final bo1.iobyxmoadg getScanGoAmountMode() {
        return this.scanGoAmountMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanGoScanMatrixPayload)) {
            return false;
        }
        ScanGoScanMatrixPayload scanGoScanMatrixPayload = (ScanGoScanMatrixPayload) other;
        return zdlpuopuiu.eablkybsjg(this.barcode, scanGoScanMatrixPayload.barcode) && Double.compare(this.quantity, scanGoScanMatrixPayload.quantity) == 0 && this.scanGoAmountMode == scanGoScanMatrixPayload.scanGoAmountMode && this.scanGoProductType == scanGoScanMatrixPayload.scanGoProductType;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ppxfxbqfkf getScanGoProductType() {
        return this.scanGoProductType;
    }

    public int hashCode() {
        return (((((this.barcode.hashCode() * 31) + Double.hashCode(this.quantity)) * 31) + this.scanGoAmountMode.hashCode()) * 31) + this.scanGoProductType.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "ScanGoScanMatrixPayload(barcode=" + this.barcode + ", quantity=" + this.quantity + ", scanGoAmountMode=" + this.scanGoAmountMode + ", scanGoProductType=" + this.scanGoProductType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.barcode);
        dest.writeDouble(this.quantity);
        dest.writeString(this.scanGoAmountMode.name());
        dest.writeString(this.scanGoProductType.name());
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBarcode() {
        return this.barcode;
    }

    public /* synthetic */ ScanGoScanMatrixPayload(String str, double d13, bo1.iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? 0.0d : d13, (i13 & 4) != 0 ? bo1.iobyxmoadg.INCREASE : iobyxmoadgVar, (i13 & 8) != 0 ? ppxfxbqfkf.AMOUNT : ppxfxbqfkfVar);
    }
}
