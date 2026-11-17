package ru.myspar.core.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/core/domain/models/product/ProductLimit;", "Landroid/os/Parcelable;", "Lru/myspar/core/models/measure_type/MeasureType;", "measureType", "", "quantity", "<init>", "(Lru/myspar/core/models/measure_type/MeasureType;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/models/measure_type/MeasureType;", "zoijcleaow", "()Lru/myspar/core/models/measure_type/MeasureType;", "yggfygwlhe", "D", "ppxfxbqfkf", "()D", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductLimit implements Parcelable {
    public static final Parcelable.Creator<ProductLimit> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType measureType;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductLimit createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ProductLimit((MeasureType) parcel.readParcelable(ProductLimit.class.getClassLoader()), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductLimit[] newArray(int i13) {
            return new ProductLimit[i13];
        }
    }

    public ProductLimit(MeasureType measureType, double d13) {
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        this.measureType = measureType;
        this.quantity = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductLimit)) {
            return false;
        }
        ProductLimit productLimit = (ProductLimit) other;
        return zdlpuopuiu.eablkybsjg(this.measureType, productLimit.measureType) && Double.compare(this.quantity, productLimit.quantity) == 0;
    }

    public int hashCode() {
        return (this.measureType.hashCode() * 31) + Double.hashCode(this.quantity);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "ProductLimit(measureType=" + this.measureType + ", quantity=" + this.quantity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.measureType, flags);
        dest.writeDouble(this.quantity);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final MeasureType getMeasureType() {
        return this.measureType;
    }
}
