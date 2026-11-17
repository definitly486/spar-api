package ru.myspar.legacy.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0005\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\u0006\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/myspar/legacy/presentation/model/AddProductParams;", "Landroid/os/Parcelable;", "", "productId", "", "isProductAvailableToBuy", "isPmProduct", "availableOnlyForPickup", "", "quantity", "Lru/myspar/core/models/measure_type/MeasureType;", "measureType", "<init>", "(Ljava/lang/String;ZZZDLru/myspar/core/models/measure_type/MeasureType;)V", "Lru/myspar/common/view/product/model/product/ProductUiModel;", "product", "(Lru/myspar/common/view/product/model/product/ProductUiModel;DLru/myspar/core/models/measure_type/MeasureType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "Z", "()Z", "jyumaefscl", "iwizpuwonk", "zoijcleaow", "cqumvgiudr", "D", "gxszxtbevo", "()D", "esjtqupxsv", "Lru/myspar/core/models/measure_type/MeasureType;", "ppxfxbqfkf", "()Lru/myspar/core/models/measure_type/MeasureType;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddProductParams implements Parcelable {
    public static final Parcelable.Creator<AddProductParams> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f88839lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType measureType;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean availableOnlyForPickup;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPmProduct;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductAvailableToBuy;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AddProductParams createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AddProductParams(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readDouble(), (MeasureType) parcel.readParcelable(AddProductParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddProductParams[] newArray(int i13) {
            return new AddProductParams[i13];
        }
    }

    public AddProductParams(String productId, boolean z13, boolean z14, boolean z15, double d13, MeasureType measureType) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        this.productId = productId;
        this.isProductAvailableToBuy = z13;
        this.isPmProduct = z14;
        this.availableOnlyForPickup = z15;
        this.quantity = d13;
        this.measureType = measureType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddProductParams)) {
            return false;
        }
        AddProductParams addProductParams = (AddProductParams) other;
        return zdlpuopuiu.eablkybsjg(this.productId, addProductParams.productId) && this.isProductAvailableToBuy == addProductParams.isProductAvailableToBuy && this.isPmProduct == addProductParams.isPmProduct && this.availableOnlyForPickup == addProductParams.availableOnlyForPickup && Double.compare(this.quantity, addProductParams.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.measureType, addProductParams.measureType);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (((((((((this.productId.hashCode() * 31) + Boolean.hashCode(this.isProductAvailableToBuy)) * 31) + Boolean.hashCode(this.isPmProduct)) * 31) + Boolean.hashCode(this.availableOnlyForPickup)) * 31) + Double.hashCode(this.quantity)) * 31) + this.measureType.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final MeasureType getMeasureType() {
        return this.measureType;
    }

    public String toString() {
        return "AddProductParams(productId=" + this.productId + ", isProductAvailableToBuy=" + this.isProductAvailableToBuy + ", isPmProduct=" + this.isPmProduct + ", availableOnlyForPickup=" + this.availableOnlyForPickup + ", quantity=" + this.quantity + ", measureType=" + this.measureType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.productId);
        dest.writeInt(this.isProductAvailableToBuy ? 1 : 0);
        dest.writeInt(this.isPmProduct ? 1 : 0);
        dest.writeInt(this.availableOnlyForPickup ? 1 : 0);
        dest.writeDouble(this.quantity);
        dest.writeParcelable(this.measureType, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getAvailableOnlyForPickup() {
        return this.availableOnlyForPickup;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddProductParams(ProductUiModel product, double d13, MeasureType measureType) {
        this(product.getId(), product.getAvailabilityModel().getIsAvailableToBuy(), product.getIsPmProduct(), product.getAvailabilityModel().getAvailableOnlyForPickup(), d13, measureType);
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
    }
}
