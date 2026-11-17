package ru.myspar.proloyalty.domain.feature.qrcode.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeArgs;", "Landroid/os/Parcelable;", "", "title", "desc", "Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeButton;", "button", "qrCode", "productTitle", "image", "", "productPrice", "oldPrice", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measure", "unit", "", "useUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gtknphoqwx", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeButton;", "zoijcleaow", "()Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeButton;", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "dxjokdxxww", "esjtqupxsv", "eablkybsjg", "lereixgezr", "Ljava/lang/Double;", "nufgyqmvbu", "()Ljava/lang/Double;", "pmvmpeiblj", "lqeggnwhkg", "zynmafqrjb", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "istkbnxepw", "wflxmlrfwp", "cdpycssgdh", "Z", "oxmwwwfdhm", "()Z", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrCodeArgs implements Parcelable {
    public static final Parcelable.Creator<QrCodeArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f95553yadqdtsiqt = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useUnit;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productTitle;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrCode;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final QrCodeButton button;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double productPrice;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String desc;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measure;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final QrCodeArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new QrCodeArgs(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : QrCodeButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (MeasureTypeModel) parcel.readParcelable(QrCodeArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final QrCodeArgs[] newArray(int i13) {
            return new QrCodeArgs[i13];
        }
    }

    public QrCodeArgs(String title, String desc, QrCodeButton qrCodeButton, String qrCode, String productTitle, String image, Double d13, Double d14, MeasureTypeModel measureTypeModel, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(productTitle, "productTitle");
        zdlpuopuiu.btonecajqb(image, "image");
        this.title = title;
        this.desc = desc;
        this.button = qrCodeButton;
        this.qrCode = qrCode;
        this.productTitle = productTitle;
        this.image = image;
        this.productPrice = d13;
        this.oldPrice = d14;
        this.measure = measureTypeModel;
        this.unit = str;
        this.useUnit = z13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getProductTitle() {
        return this.productTitle;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrCodeArgs)) {
            return false;
        }
        QrCodeArgs qrCodeArgs = (QrCodeArgs) other;
        return zdlpuopuiu.eablkybsjg(this.title, qrCodeArgs.title) && zdlpuopuiu.eablkybsjg(this.desc, qrCodeArgs.desc) && zdlpuopuiu.eablkybsjg(this.button, qrCodeArgs.button) && zdlpuopuiu.eablkybsjg(this.qrCode, qrCodeArgs.qrCode) && zdlpuopuiu.eablkybsjg(this.productTitle, qrCodeArgs.productTitle) && zdlpuopuiu.eablkybsjg(this.image, qrCodeArgs.image) && zdlpuopuiu.eablkybsjg(this.productPrice, qrCodeArgs.productPrice) && zdlpuopuiu.eablkybsjg(this.oldPrice, qrCodeArgs.oldPrice) && zdlpuopuiu.eablkybsjg(this.measure, qrCodeArgs.measure) && zdlpuopuiu.eablkybsjg(this.unit, qrCodeArgs.unit) && this.useUnit == qrCodeArgs.useUnit;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final MeasureTypeModel getMeasure() {
        return this.measure;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.desc.hashCode()) * 31;
        QrCodeButton qrCodeButton = this.button;
        int iHashCode2 = (((((((iHashCode + (qrCodeButton == null ? 0 : qrCodeButton.hashCode())) * 31) + this.qrCode.hashCode()) * 31) + this.productTitle.hashCode()) * 31) + this.image.hashCode()) * 31;
        Double d13 = this.productPrice;
        int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.oldPrice;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        MeasureTypeModel measureTypeModel = this.measure;
        int iHashCode5 = (iHashCode4 + (measureTypeModel == null ? 0 : measureTypeModel.hashCode())) * 31;
        String str = this.unit;
        return ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.useUnit);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Double getOldPrice() {
        return this.oldPrice;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Double getProductPrice() {
        return this.productPrice;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getUseUnit() {
        return this.useUnit;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public String toString() {
        return "QrCodeArgs(title=" + this.title + ", desc=" + this.desc + ", button=" + this.button + ", qrCode=" + this.qrCode + ", productTitle=" + this.productTitle + ", image=" + this.image + ", productPrice=" + this.productPrice + ", oldPrice=" + this.oldPrice + ", measure=" + this.measure + ", unit=" + this.unit + ", useUnit=" + this.useUnit + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.desc);
        QrCodeButton qrCodeButton = this.button;
        if (qrCodeButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            qrCodeButton.writeToParcel(dest, flags);
        }
        dest.writeString(this.qrCode);
        dest.writeString(this.productTitle);
        dest.writeString(this.image);
        Double d13 = this.productPrice;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Double d14 = this.oldPrice;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeParcelable(this.measure, flags);
        dest.writeString(this.unit);
        dest.writeInt(this.useUnit ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final QrCodeButton getButton() {
        return this.button;
    }
}
