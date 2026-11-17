package ru.myspar.domain.feature.qrcode.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: renamed from: ru.myspar.domain.feature.qrcode.store.QrCodeDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"ru/myspar/domain/feature/qrcode/store/QrCodeDialogStore$State", "Landroid/os/Parcelable;", "", "title", "desc", "qrCode", "productTitle", "image", "", "productPrice", "oldPrice", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "measure", "unit", "", "useUnit", "Lru/myspar/domain/feature/qrcode/store/QrCodeButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lru/myspar/core/models/measure_type/MeasureTypeModel;Ljava/lang/String;ZLru/myspar/domain/feature/qrcode/store/QrCodeButton;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gtknphoqwx", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "btonecajqb", "iwizpuwonk", "dxjokdxxww", "cqumvgiudr", "eablkybsjg", "esjtqupxsv", "Ljava/lang/Double;", "nufgyqmvbu", "()Ljava/lang/Double;", "lereixgezr", "lqeggnwhkg", "pmvmpeiblj", "Lru/myspar/core/models/measure_type/MeasureTypeModel;", "gxszxtbevo", "()Lru/myspar/core/models/measure_type/MeasureTypeModel;", "zynmafqrjb", "wflxmlrfwp", "istkbnxepw", "Z", "oxmwwwfdhm", "()Z", "cdpycssgdh", "Lru/myspar/domain/feature/qrcode/store/QrCodeButton;", "zoijcleaow", "()Lru/myspar/domain/feature/qrcode/store/QrCodeButton;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final QrCodeButton button;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double productPrice;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useUnit;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productTitle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrCode;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measure;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String desc;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.qrcode.store.QrCodeDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (MeasureTypeModel) parcel.readParcelable(State.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? QrCodeButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String title, String desc, String qrCode, String productTitle, String image, Double d13, Double d14, MeasureTypeModel measureTypeModel, String str, boolean z13, QrCodeButton qrCodeButton) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(desc, "desc");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        zdlpuopuiu.btonecajqb(productTitle, "productTitle");
        zdlpuopuiu.btonecajqb(image, "image");
        this.title = title;
        this.desc = desc;
        this.qrCode = qrCode;
        this.productTitle = productTitle;
        this.image = image;
        this.productPrice = d13;
        this.oldPrice = d14;
        this.measure = measureTypeModel;
        this.unit = str;
        this.useUnit = z13;
        this.button = qrCodeButton;
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
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.title, state.title) && zdlpuopuiu.eablkybsjg(this.desc, state.desc) && zdlpuopuiu.eablkybsjg(this.qrCode, state.qrCode) && zdlpuopuiu.eablkybsjg(this.productTitle, state.productTitle) && zdlpuopuiu.eablkybsjg(this.image, state.image) && zdlpuopuiu.eablkybsjg(this.productPrice, state.productPrice) && zdlpuopuiu.eablkybsjg(this.oldPrice, state.oldPrice) && zdlpuopuiu.eablkybsjg(this.measure, state.measure) && zdlpuopuiu.eablkybsjg(this.unit, state.unit) && this.useUnit == state.useUnit && zdlpuopuiu.eablkybsjg(this.button, state.button);
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
        int iHashCode = ((((((((this.title.hashCode() * 31) + this.desc.hashCode()) * 31) + this.qrCode.hashCode()) * 31) + this.productTitle.hashCode()) * 31) + this.image.hashCode()) * 31;
        Double d13 = this.productPrice;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.oldPrice;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        MeasureTypeModel measureTypeModel = this.measure;
        int iHashCode4 = (iHashCode3 + (measureTypeModel == null ? 0 : measureTypeModel.hashCode())) * 31;
        String str = this.unit;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.useUnit)) * 31;
        QrCodeButton qrCodeButton = this.button;
        return iHashCode5 + (qrCodeButton != null ? qrCodeButton.hashCode() : 0);
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
        return "State(title=" + this.title + ", desc=" + this.desc + ", qrCode=" + this.qrCode + ", productTitle=" + this.productTitle + ", image=" + this.image + ", productPrice=" + this.productPrice + ", oldPrice=" + this.oldPrice + ", measure=" + this.measure + ", unit=" + this.unit + ", useUnit=" + this.useUnit + ", button=" + this.button + ")";
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
        QrCodeButton qrCodeButton = this.button;
        if (qrCodeButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            qrCodeButton.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final QrCodeButton getButton() {
        return this.button;
    }
}
