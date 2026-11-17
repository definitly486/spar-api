package ru.myspar.core.domain.models.order.edit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/myspar/core/domain/models/order/edit/OrderSum;", "Landroid/os/Parcelable;", "", "products", "discount", "weight", "delivery", "deliveryOver", "sum", "", "bonuses", "<init>", "(DDDDDDLjava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "D", "getProducts", "()D", "yggfygwlhe", "getDiscount", "jyumaefscl", "getWeight", "iwizpuwonk", "getDelivery", "cqumvgiudr", "getDeliveryOver", "esjtqupxsv", "ppxfxbqfkf", "lereixgezr", "Ljava/lang/Integer;", "zoijcleaow", "()Ljava/lang/Integer;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderSum implements Parcelable {
    public static final Parcelable.Creator<OrderSum> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryOver;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double delivery;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double weight;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bonuses;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final double discount;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final double products;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final OrderSum createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new OrderSum(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final OrderSum[] newArray(int i13) {
            return new OrderSum[i13];
        }
    }

    public OrderSum(double d13, double d14, double d15, double d16, double d17, double d18, Integer num) {
        this.products = d13;
        this.discount = d14;
        this.weight = d15;
        this.delivery = d16;
        this.deliveryOver = d17;
        this.sum = d18;
        this.bonuses = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSum)) {
            return false;
        }
        OrderSum orderSum = (OrderSum) other;
        return Double.compare(this.products, orderSum.products) == 0 && Double.compare(this.discount, orderSum.discount) == 0 && Double.compare(this.weight, orderSum.weight) == 0 && Double.compare(this.delivery, orderSum.delivery) == 0 && Double.compare(this.deliveryOver, orderSum.deliveryOver) == 0 && Double.compare(this.sum, orderSum.sum) == 0 && zdlpuopuiu.eablkybsjg(this.bonuses, orderSum.bonuses);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Double.hashCode(this.products) * 31) + Double.hashCode(this.discount)) * 31) + Double.hashCode(this.weight)) * 31) + Double.hashCode(this.delivery)) * 31) + Double.hashCode(this.deliveryOver)) * 31) + Double.hashCode(this.sum)) * 31;
        Integer num = this.bonuses;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    public String toString() {
        return "OrderSum(products=" + this.products + ", discount=" + this.discount + ", weight=" + this.weight + ", delivery=" + this.delivery + ", deliveryOver=" + this.deliveryOver + ", sum=" + this.sum + ", bonuses=" + this.bonuses + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeDouble(this.products);
        dest.writeDouble(this.discount);
        dest.writeDouble(this.weight);
        dest.writeDouble(this.delivery);
        dest.writeDouble(this.deliveryOver);
        dest.writeDouble(this.sum);
        Integer num = this.bonuses;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Integer getBonuses() {
        return this.bonuses;
    }

    public /* synthetic */ OrderSum(double d13, double d14, double d15, double d16, double d17, double d18, Integer num, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 0.0d : d13, (i13 & 2) != 0 ? 0.0d : d14, (i13 & 4) != 0 ? 0.0d : d15, (i13 & 8) != 0 ? 0.0d : d16, (i13 & 16) != 0 ? 0.0d : d17, (i13 & 32) == 0 ? d18 : 0.0d, (i13 & 64) != 0 ? null : num);
    }
}
