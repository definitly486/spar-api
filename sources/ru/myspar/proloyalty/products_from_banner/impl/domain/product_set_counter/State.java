package ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.ProductSetCounterStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"ru/myspar/proloyalty/products_from_banner/impl/domain/product_set_counter/ProductSetCounterStore$State", "Landroid/os/Parcelable;", "", "productSetName", "", "productsCount", "", "sum", "oldSum", "productSetCount", "<init>", "(Ljava/lang/String;IDLjava/lang/Double;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set_counter/ProductSetCounterStore$State;", "zoijcleaow", "(Ljava/lang/String;IDLjava/lang/Double;I)Lru/myspar/proloyalty/products_from_banner/impl/domain/product_set_counter/ProductSetCounterStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "I", "nufgyqmvbu", "jyumaefscl", "D", "dxjokdxxww", "()D", "iwizpuwonk", "Ljava/lang/Double;", "eablkybsjg", "()Ljava/lang/Double;", "cqumvgiudr", "gxszxtbevo", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productSetCount;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldSum;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productsCount;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productSetName;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.products_from_banner.impl.domain.product_set_counter.ProductSetCounterStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String productSetName, int i13, double d13, Double d14, int i14) {
        zdlpuopuiu.btonecajqb(productSetName, "productSetName");
        this.productSetName = productSetName;
        this.productsCount = i13;
        this.sum = d13;
        this.oldSum = d14;
        this.productSetCount = i14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, String str, int i13, double d13, Double d14, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.productSetName;
        }
        if ((i15 & 2) != 0) {
            i13 = state.productsCount;
        }
        int i16 = i13;
        if ((i15 & 4) != 0) {
            d13 = state.sum;
        }
        double d15 = d13;
        if ((i15 & 8) != 0) {
            d14 = state.oldSum;
        }
        Double d16 = d14;
        if ((i15 & 16) != 0) {
            i14 = state.productSetCount;
        }
        return state.zoijcleaow(str, i16, d15, d16, i14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Double getOldSum() {
        return this.oldSum;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.productSetName, state.productSetName) && this.productsCount == state.productsCount && Double.compare(this.sum, state.sum) == 0 && zdlpuopuiu.eablkybsjg(this.oldSum, state.oldSum) && this.productSetCount == state.productSetCount;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getProductSetCount() {
        return this.productSetCount;
    }

    public int hashCode() {
        int iHashCode = ((((this.productSetName.hashCode() * 31) + Integer.hashCode(this.productsCount)) * 31) + Double.hashCode(this.sum)) * 31;
        Double d13 = this.oldSum;
        return ((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Integer.hashCode(this.productSetCount);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getProductSetName() {
        return this.productSetName;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final int getProductsCount() {
        return this.productsCount;
    }

    public String toString() {
        return "State(productSetName=" + this.productSetName + ", productsCount=" + this.productsCount + ", sum=" + this.sum + ", oldSum=" + this.oldSum + ", productSetCount=" + this.productSetCount + ")";
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
        dest.writeInt(this.productSetCount);
    }

    public final State zoijcleaow(String productSetName, int productsCount, double sum, Double oldSum, int productSetCount) {
        zdlpuopuiu.btonecajqb(productSetName, "productSetName");
        return new State(productSetName, productsCount, sum, oldSum, productSetCount);
    }
}
