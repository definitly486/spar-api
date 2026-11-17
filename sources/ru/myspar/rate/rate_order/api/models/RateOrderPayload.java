package ru.myspar.rate.rate_order.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*\u001fB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/myspar/rate/rate_order/api/models/RateOrderPayload;", "Landroid/os/Parcelable;", "Lru/myspar/rate/rate_order/api/models/RateOrderPayload$zoijcleaow;", "flow", "Lru/myspar/rate/rate_order/api/models/RateOrderPayload$ppxfxbqfkf;", "rateType", "", "orderId", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryType", "<init>", "(Lru/myspar/rate/rate_order/api/models/RateOrderPayload$zoijcleaow;Lru/myspar/rate/rate_order/api/models/RateOrderPayload$ppxfxbqfkf;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/rate/rate_order/api/models/RateOrderPayload$zoijcleaow;", "ppxfxbqfkf", "()Lru/myspar/rate/rate_order/api/models/RateOrderPayload$zoijcleaow;", "yggfygwlhe", "Lru/myspar/rate/rate_order/api/models/RateOrderPayload$ppxfxbqfkf;", "gxszxtbevo", "()Lru/myspar/rate/rate_order/api/models/RateOrderPayload$ppxfxbqfkf;", "jyumaefscl", "Ljava/lang/String;", "eablkybsjg", "iwizpuwonk", "Lru/myspar/core/models/delivery/DeliveryCode;", "zoijcleaow", "()Lru/myspar/core/models/delivery/DeliveryCode;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RateOrderPayload implements Parcelable {
    public static final Parcelable.Creator<RateOrderPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryType;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf rateType;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RateOrderPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new RateOrderPayload(zoijcleaow.valueOf(parcel.readString()), ppxfxbqfkf.valueOf(parcel.readString()), parcel.readString(), (DeliveryCode) parcel.readParcelable(RateOrderPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RateOrderPayload[] newArray(int i13) {
            return new RateOrderPayload[i13];
        }
    }

    public enum ppxfxbqfkf {
        CANCEL,
        ACTUAL;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f102788iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public enum zoijcleaow {
        DEFAULT,
        SCAN_GO;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f102792iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public RateOrderPayload(zoijcleaow flow, ppxfxbqfkf rateType, String orderId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(rateType, "rateType");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.flow = flow;
        this.rateType = rateType;
        this.orderId = orderId;
        this.deliveryType = deliveryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateOrderPayload)) {
            return false;
        }
        RateOrderPayload rateOrderPayload = (RateOrderPayload) other;
        return this.flow == rateOrderPayload.flow && this.rateType == rateOrderPayload.rateType && zdlpuopuiu.eablkybsjg(this.orderId, rateOrderPayload.orderId) && this.deliveryType == rateOrderPayload.deliveryType;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ppxfxbqfkf getRateType() {
        return this.rateType;
    }

    public int hashCode() {
        int iHashCode = ((((this.flow.hashCode() * 31) + this.rateType.hashCode()) * 31) + this.orderId.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryType;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final zoijcleaow getFlow() {
        return this.flow;
    }

    public String toString() {
        return "RateOrderPayload(flow=" + this.flow + ", rateType=" + this.rateType + ", orderId=" + this.orderId + ", deliveryType=" + this.deliveryType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.rateType.name());
        dest.writeString(this.orderId);
        dest.writeParcelable(this.deliveryType, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final DeliveryCode getDeliveryType() {
        return this.deliveryType;
    }

    public /* synthetic */ RateOrderPayload(zoijcleaow zoijcleaowVar, ppxfxbqfkf ppxfxbqfkfVar, String str, DeliveryCode deliveryCode, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.DEFAULT : zoijcleaowVar, (i13 & 2) != 0 ? ppxfxbqfkf.ACTUAL : ppxfxbqfkfVar, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : deliveryCode);
    }
}
