package ru.myspar.proloyalty.common.view.counter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 J¦\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b%\u0010 J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&H×\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b\u0004\u0010-R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b.\u0010>R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b@\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\bH\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\bI\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b@\u0010J\u001a\u0004\bK\u0010LR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010-R\u0011\u0010O\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010-¨\u0006P"}, d2 = {"Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "Landroid/os/Parcelable;", "", "isLoading", "isAvailableToBuy", "isExpand", "Lru/myspar/proloyalty/common/view/counter/model/Price;", "priceModel", "oldPriceModel", "", "avgWeight", "isDispPer100", "quantity", "isMeasureTypeSwitchable", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measureType", "", "productLimitText", "message", "autoHideMessage", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel$Hex;", "colorsModel", "<init>", "(ZZZLru/myspar/proloyalty/common/view/counter/model/Price;Lru/myspar/proloyalty/common/view/counter/model/Price;Ljava/lang/Double;ZDZLru/myspar/proloyalty/core/models/measure_type/MeasureType;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/proloyalty/core/domain/models/ColorsUiModel$Hex;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(ZZZLru/myspar/proloyalty/common/view/counter/model/Price;Lru/myspar/proloyalty/common/view/counter/model/Price;Ljava/lang/Double;ZDZLru/myspar/proloyalty/core/models/measure_type/MeasureType;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/proloyalty/core/domain/models/ColorsUiModel$Hex;)Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "iozdgvuglv", "()Z", "yggfygwlhe", "jyumaefscl", "yadqdtsiqt", "iwizpuwonk", "Lru/myspar/proloyalty/common/view/counter/model/Price;", "wflxmlrfwp", "()Lru/myspar/proloyalty/common/view/counter/model/Price;", "cqumvgiudr", "gtknphoqwx", "esjtqupxsv", "Ljava/lang/Double;", "gxszxtbevo", "()Ljava/lang/Double;", "lereixgezr", "pmvmpeiblj", "D", "()D", "zynmafqrjb", "lmojexxdyd", "istkbnxepw", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "dxjokdxxww", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "cdpycssgdh", "Ljava/lang/String;", "oxmwwwfdhm", "btonecajqb", "eablkybsjg", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel$Hex;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/domain/models/ColorsUiModel$Hex;", "nufgyqmvbu", "inCart", "isEnabled", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CounterModel implements Parcelable {
    public static final Parcelable.Creator<CounterModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f93858wwaezpbzkn = 8;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productLimitText;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Price oldPriceModel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double avgWeight;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoHideMessage;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType measureType;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Price priceModel;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpand;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsUiModel.Hex colorsModel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableToBuy;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMeasureTypeSwitchable;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CounterModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            Parcelable.Creator<Price> creator = Price.CREATOR;
            return new CounterModel(z13, z14, z15, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0, parcel.readDouble(), parcel.readInt() != 0, (MeasureType) parcel.readParcelable(CounterModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (ColorsUiModel.Hex) parcel.readParcelable(CounterModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CounterModel[] newArray(int i13) {
            return new CounterModel[i13];
        }
    }

    public CounterModel(boolean z13, boolean z14, boolean z15, Price priceModel, Price price, Double d13, boolean z16, double d14, boolean z17, MeasureType measureType, String str, String str2, boolean z18, ColorsUiModel.Hex hex) {
        zdlpuopuiu.btonecajqb(priceModel, "priceModel");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        this.isLoading = z13;
        this.isAvailableToBuy = z14;
        this.isExpand = z15;
        this.priceModel = priceModel;
        this.oldPriceModel = price;
        this.avgWeight = d13;
        this.isDispPer100 = z16;
        this.quantity = d14;
        this.isMeasureTypeSwitchable = z17;
        this.measureType = measureType;
        this.productLimitText = str;
        this.message = str2;
        this.autoHideMessage = z18;
        this.colorsModel = hex;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final MeasureType getMeasureType() {
        return this.measureType;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getAutoHideMessage() {
        return this.autoHideMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterModel)) {
            return false;
        }
        CounterModel counterModel = (CounterModel) other;
        return this.isLoading == counterModel.isLoading && this.isAvailableToBuy == counterModel.isAvailableToBuy && this.isExpand == counterModel.isExpand && zdlpuopuiu.eablkybsjg(this.priceModel, counterModel.priceModel) && zdlpuopuiu.eablkybsjg(this.oldPriceModel, counterModel.oldPriceModel) && zdlpuopuiu.eablkybsjg(this.avgWeight, counterModel.avgWeight) && this.isDispPer100 == counterModel.isDispPer100 && Double.compare(this.quantity, counterModel.quantity) == 0 && this.isMeasureTypeSwitchable == counterModel.isMeasureTypeSwitchable && zdlpuopuiu.eablkybsjg(this.measureType, counterModel.measureType) && zdlpuopuiu.eablkybsjg(this.productLimitText, counterModel.productLimitText) && zdlpuopuiu.eablkybsjg(this.message, counterModel.message) && this.autoHideMessage == counterModel.autoHideMessage && zdlpuopuiu.eablkybsjg(this.colorsModel, counterModel.colorsModel);
    }

    public final boolean esjtqupxsv() {
        return this.isAvailableToBuy || !nufgyqmvbu();
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final Price getOldPriceModel() {
        return this.oldPriceModel;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Double getAvgWeight() {
        return this.avgWeight;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isAvailableToBuy)) * 31) + Boolean.hashCode(this.isExpand)) * 31) + this.priceModel.hashCode()) * 31;
        Price price = this.oldPriceModel;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        Double d13 = this.avgWeight;
        int iHashCode3 = (((((((((iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + Double.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.isMeasureTypeSwitchable)) * 31) + this.measureType.hashCode()) * 31;
        String str = this.productLimitText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.autoHideMessage)) * 31;
        ColorsUiModel.Hex hex = this.colorsModel;
        return iHashCode5 + (hex != null ? hex.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final boolean getIsMeasureTypeSwitchable() {
        return this.isMeasureTypeSwitchable;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ColorsUiModel.Hex getColorsModel() {
        return this.colorsModel;
    }

    public final boolean nufgyqmvbu() {
        return this.quantity > 0.0d;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getProductLimitText() {
        return this.productLimitText;
    }

    public String toString() {
        return "CounterModel(isLoading=" + this.isLoading + ", isAvailableToBuy=" + this.isAvailableToBuy + ", isExpand=" + this.isExpand + ", priceModel=" + this.priceModel + ", oldPriceModel=" + this.oldPriceModel + ", avgWeight=" + this.avgWeight + ", isDispPer100=" + this.isDispPer100 + ", quantity=" + this.quantity + ", isMeasureTypeSwitchable=" + this.isMeasureTypeSwitchable + ", measureType=" + this.measureType + ", productLimitText=" + this.productLimitText + ", message=" + this.message + ", autoHideMessage=" + this.autoHideMessage + ", colorsModel=" + this.colorsModel + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final Price getPriceModel() {
        return this.priceModel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isAvailableToBuy ? 1 : 0);
        dest.writeInt(this.isExpand ? 1 : 0);
        this.priceModel.writeToParcel(dest, flags);
        Price price = this.oldPriceModel;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Double d13 = this.avgWeight;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeInt(this.isDispPer100 ? 1 : 0);
        dest.writeDouble(this.quantity);
        dest.writeInt(this.isMeasureTypeSwitchable ? 1 : 0);
        dest.writeParcelable(this.measureType, flags);
        dest.writeString(this.productLimitText);
        dest.writeString(this.message);
        dest.writeInt(this.autoHideMessage ? 1 : 0);
        dest.writeParcelable(this.colorsModel, flags);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public final CounterModel zoijcleaow(boolean isLoading, boolean isAvailableToBuy, boolean isExpand, Price priceModel, Price oldPriceModel, Double avgWeight, boolean isDispPer100, double quantity, boolean isMeasureTypeSwitchable, MeasureType measureType, String productLimitText, String message, boolean autoHideMessage, ColorsUiModel.Hex colorsModel) {
        zdlpuopuiu.btonecajqb(priceModel, "priceModel");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        return new CounterModel(isLoading, isAvailableToBuy, isExpand, priceModel, oldPriceModel, avgWeight, isDispPer100, quantity, isMeasureTypeSwitchable, measureType, productLimitText, message, autoHideMessage, colorsModel);
    }

    public /* synthetic */ CounterModel(boolean z13, boolean z14, boolean z15, Price price, Price price2, Double d13, boolean z16, double d14, boolean z17, MeasureType measureType, String str, String str2, boolean z18, ColorsUiModel.Hex hex, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? true : z14, (i13 & 4) != 0 ? false : z15, price, (i13 & 16) != 0 ? null : price2, (i13 & 32) != 0 ? null : d13, z16, d14, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z17, measureType, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str, (i13 & 2048) != 0 ? null : str2, (i13 & 4096) != 0 ? false : z18, (i13 & 8192) != 0 ? null : hex);
    }
}
