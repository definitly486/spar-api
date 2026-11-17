package ru.myspar.proloyalty.legacy.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0005\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u0006\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/model/AddProductParams;", "Landroid/os/Parcelable;", "", "productId", "", "isProductAvailableToBuy", "isPmProduct", "", "quantity", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measureType", "<init>", "(Ljava/lang/String;ZZDLru/myspar/proloyalty/core/models/measure_type/MeasureType;)V", "Lru/myspar/proloyalty/common/view/product/model/product/ProductUiModel;", "product", "(Lru/myspar/proloyalty/common/view/product/model/product/ProductUiModel;DLru/myspar/proloyalty/core/models/measure_type/MeasureType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "Z", "()Z", "jyumaefscl", "iwizpuwonk", "D", "eablkybsjg", "()D", "cqumvgiudr", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "zoijcleaow", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddProductParams implements Parcelable {
    public static final Parcelable.Creator<AddProductParams> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType measureType;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

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
            return new AddProductParams(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readDouble(), (MeasureType) parcel.readParcelable(AddProductParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddProductParams[] newArray(int i13) {
            return new AddProductParams[i13];
        }
    }

    public AddProductParams(String productId, boolean z13, boolean z14, double d13, MeasureType measureType) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        this.productId = productId;
        this.isProductAvailableToBuy = z13;
        this.isPmProduct = z14;
        this.quantity = d13;
        this.measureType = measureType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddProductParams)) {
            return false;
        }
        AddProductParams addProductParams = (AddProductParams) other;
        return zdlpuopuiu.eablkybsjg(this.productId, addProductParams.productId) && this.isProductAvailableToBuy == addProductParams.isProductAvailableToBuy && this.isPmProduct == addProductParams.isPmProduct && Double.compare(this.quantity, addProductParams.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.measureType, addProductParams.measureType);
    }

    public int hashCode() {
        return (((((((this.productId.hashCode() * 31) + Boolean.hashCode(this.isProductAvailableToBuy)) * 31) + Boolean.hashCode(this.isPmProduct)) * 31) + Double.hashCode(this.quantity)) * 31) + this.measureType.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public String toString() {
        return "AddProductParams(productId=" + this.productId + ", isProductAvailableToBuy=" + this.isProductAvailableToBuy + ", isPmProduct=" + this.isPmProduct + ", quantity=" + this.quantity + ", measureType=" + this.measureType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.productId);
        dest.writeInt(this.isProductAvailableToBuy ? 1 : 0);
        dest.writeInt(this.isPmProduct ? 1 : 0);
        dest.writeDouble(this.quantity);
        dest.writeParcelable(this.measureType, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final MeasureType getMeasureType() {
        return this.measureType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddProductParams(ProductUiModel product, double d13, MeasureType measureType) {
        this(product.getId(), product.getAvailabilityModel().getIsAvailableToBuy(), product.getIsPmProduct(), d13, measureType);
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
    }
}
