package ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.args;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set_counter/args/ProductSetCounterArgs;", "Landroid/os/Parcelable;", "", "productSetName", "", "productsCount", "", "sum", "oldSum", "initialProductSetCount", "<init>", "(Ljava/lang/String;IDLjava/lang/Double;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "I", "gxszxtbevo", "jyumaefscl", "D", "lqeggnwhkg", "()D", "iwizpuwonk", "Ljava/lang/Double;", "ppxfxbqfkf", "()Ljava/lang/Double;", "cqumvgiudr", "Ljava/lang/Integer;", "zoijcleaow", "()Ljava/lang/Integer;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSetCounterArgs implements Parcelable {
    public static final Parcelable.Creator<ProductSetCounterArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer initialProductSetCount;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldSum;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productsCount;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productSetName;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductSetCounterArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ProductSetCounterArgs(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductSetCounterArgs[] newArray(int i13) {
            return new ProductSetCounterArgs[i13];
        }
    }

    public ProductSetCounterArgs(String productSetName, int i13, double d13, Double d14, Integer num) {
        zdlpuopuiu.btonecajqb(productSetName, "productSetName");
        this.productSetName = productSetName;
        this.productsCount = i13;
        this.sum = d13;
        this.oldSum = d14;
        this.initialProductSetCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getProductSetName() {
        return this.productSetName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSetCounterArgs)) {
            return false;
        }
        ProductSetCounterArgs productSetCounterArgs = (ProductSetCounterArgs) other;
        return zdlpuopuiu.eablkybsjg(this.productSetName, productSetCounterArgs.productSetName) && this.productsCount == productSetCounterArgs.productsCount && Double.compare(this.sum, productSetCounterArgs.sum) == 0 && zdlpuopuiu.eablkybsjg(this.oldSum, productSetCounterArgs.oldSum) && zdlpuopuiu.eablkybsjg(this.initialProductSetCount, productSetCounterArgs.initialProductSetCount);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getProductsCount() {
        return this.productsCount;
    }

    public int hashCode() {
        int iHashCode = ((((this.productSetName.hashCode() * 31) + Integer.hashCode(this.productsCount)) * 31) + Double.hashCode(this.sum)) * 31;
        Double d13 = this.oldSum;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.initialProductSetCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Double getOldSum() {
        return this.oldSum;
    }

    public String toString() {
        return "ProductSetCounterArgs(productSetName=" + this.productSetName + ", productsCount=" + this.productsCount + ", sum=" + this.sum + ", oldSum=" + this.oldSum + ", initialProductSetCount=" + this.initialProductSetCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.productSetName);
        dest.writeInt(this.productsCount);
        dest.writeDouble(this.sum);
        Double d13 = this.oldSum;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Integer num = this.initialProductSetCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Integer getInitialProductSetCount() {
        return this.initialProductSetCount;
    }
}
