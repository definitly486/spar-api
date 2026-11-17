package ru.myspar.proloyalty.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.delivery.Delivery;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderSum;
import ru.myspar.proloyalty.core.domain.models.recipient.Recipient;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b?\u0010\u001d¨\u0006@"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/OrderItem;", "Landroid/os/Parcelable;", "", "id", "Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "ordersStatus", "Lru/myspar/proloyalty/core/domain/models/delivery/Delivery;", "delivery", "Lru/myspar/proloyalty/core/domain/models/recipient/Recipient;", "recipient", "Lru/myspar/proloyalty/core/domain/models/order/edit/OrderSum;", "sum", "", "isPhoneEnabled", "withProductReplacement", "isOrderHasPostamatCode", "npsUrl", "<init>", "(Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;Lru/myspar/proloyalty/core/domain/models/delivery/Delivery;Lru/myspar/proloyalty/core/domain/models/recipient/Recipient;Lru/myspar/proloyalty/core/domain/models/order/edit/OrderSum;ZZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "eablkybsjg", "()Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/delivery/Delivery;", "zoijcleaow", "()Lru/myspar/proloyalty/core/domain/models/delivery/Delivery;", "iwizpuwonk", "Lru/myspar/proloyalty/core/domain/models/recipient/Recipient;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/domain/models/recipient/Recipient;", "cqumvgiudr", "Lru/myspar/proloyalty/core/domain/models/order/edit/OrderSum;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/domain/models/order/edit/OrderSum;", "esjtqupxsv", "Z", "btonecajqb", "()Z", "lereixgezr", "nufgyqmvbu", "pmvmpeiblj", "dxjokdxxww", "zynmafqrjb", "ppxfxbqfkf", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderItem implements Parcelable {
    public static final Parcelable.Creator<OrderItem> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderSum sum;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPhoneEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Recipient recipient;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Delivery delivery;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean withProductReplacement;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderHasPostamatCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderStatus ordersStatus;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String npsUrl;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final OrderItem createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new OrderItem(parcel.readString(), OrderStatus.CREATOR.createFromParcel(parcel), Delivery.CREATOR.createFromParcel(parcel), Recipient.CREATOR.createFromParcel(parcel), OrderSum.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final OrderItem[] newArray(int i13) {
            return new OrderItem[i13];
        }
    }

    public OrderItem(String id2, OrderStatus ordersStatus, Delivery delivery, Recipient recipient, OrderSum sum, boolean z13, boolean z14, boolean z15, String npsUrl) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(recipient, "recipient");
        zdlpuopuiu.btonecajqb(sum, "sum");
        zdlpuopuiu.btonecajqb(npsUrl, "npsUrl");
        this.id = id2;
        this.ordersStatus = ordersStatus;
        this.delivery = delivery;
        this.recipient = recipient;
        this.sum = sum;
        this.isPhoneEnabled = z13;
        this.withProductReplacement = z14;
        this.isOrderHasPostamatCode = z15;
        this.npsUrl = npsUrl;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsPhoneEnabled() {
        return this.isPhoneEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsOrderHasPostamatCode() {
        return this.isOrderHasPostamatCode;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final OrderStatus getOrdersStatus() {
        return this.ordersStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderItem)) {
            return false;
        }
        OrderItem orderItem = (OrderItem) other;
        return zdlpuopuiu.eablkybsjg(this.id, orderItem.id) && this.ordersStatus == orderItem.ordersStatus && zdlpuopuiu.eablkybsjg(this.delivery, orderItem.delivery) && zdlpuopuiu.eablkybsjg(this.recipient, orderItem.recipient) && zdlpuopuiu.eablkybsjg(this.sum, orderItem.sum) && this.isPhoneEnabled == orderItem.isPhoneEnabled && this.withProductReplacement == orderItem.withProductReplacement && this.isOrderHasPostamatCode == orderItem.isOrderHasPostamatCode && zdlpuopuiu.eablkybsjg(this.npsUrl, orderItem.npsUrl);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Recipient getRecipient() {
        return this.recipient;
    }

    public int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + this.ordersStatus.hashCode()) * 31) + this.delivery.hashCode()) * 31) + this.recipient.hashCode()) * 31) + this.sum.hashCode()) * 31) + Boolean.hashCode(this.isPhoneEnabled)) * 31) + Boolean.hashCode(this.withProductReplacement)) * 31) + Boolean.hashCode(this.isOrderHasPostamatCode)) * 31) + this.npsUrl.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final OrderSum getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getWithProductReplacement() {
        return this.withProductReplacement;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getNpsUrl() {
        return this.npsUrl;
    }

    public String toString() {
        return "OrderItem(id=" + this.id + ", ordersStatus=" + this.ordersStatus + ", delivery=" + this.delivery + ", recipient=" + this.recipient + ", sum=" + this.sum + ", isPhoneEnabled=" + this.isPhoneEnabled + ", withProductReplacement=" + this.withProductReplacement + ", isOrderHasPostamatCode=" + this.isOrderHasPostamatCode + ", npsUrl=" + this.npsUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        this.ordersStatus.writeToParcel(dest, flags);
        this.delivery.writeToParcel(dest, flags);
        this.recipient.writeToParcel(dest, flags);
        this.sum.writeToParcel(dest, flags);
        dest.writeInt(this.isPhoneEnabled ? 1 : 0);
        dest.writeInt(this.withProductReplacement ? 1 : 0);
        dest.writeInt(this.isOrderHasPostamatCode ? 1 : 0);
        dest.writeString(this.npsUrl);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Delivery getDelivery() {
        return this.delivery;
    }
}
