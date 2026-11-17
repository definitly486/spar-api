package ru.myspar.core.domain.models.payload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/myspar/core/domain/models/payload/PaymentMethodPayload;", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/payload/PaymentMethodPayload$zoijcleaow;", "flow", "", "editingOrderId", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "<init>", "(Lru/myspar/core/domain/models/payload/PaymentMethodPayload$zoijcleaow;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/payload/PaymentMethodPayload$zoijcleaow;", "getFlow", "()Lru/myspar/core/domain/models/payload/PaymentMethodPayload$zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "getEditingOrderId", "jyumaefscl", "Lru/myspar/core/models/delivery/DeliveryCode;", "getDeliveryCode", "()Lru/myspar/core/models/delivery/DeliveryCode;", "zoijcleaow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentMethodPayload implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String editingOrderId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PaymentMethodPayload(zoijcleaow.valueOf(parcel.readString()), parcel.readString(), (DeliveryCode) parcel.readParcelable(PaymentMethodPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodPayload[] newArray(int i13) {
            return new PaymentMethodPayload[i13];
        }
    }

    public enum zoijcleaow {
        DEFAULT,
        EDIT_ORDER;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f87167iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public PaymentMethodPayload(zoijcleaow flow, String str, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        this.flow = flow;
        this.editingOrderId = str;
        this.deliveryCode = deliveryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodPayload)) {
            return false;
        }
        PaymentMethodPayload paymentMethodPayload = (PaymentMethodPayload) other;
        return this.flow == paymentMethodPayload.flow && zdlpuopuiu.eablkybsjg(this.editingOrderId, paymentMethodPayload.editingOrderId) && this.deliveryCode == paymentMethodPayload.deliveryCode;
    }

    public int hashCode() {
        int iHashCode = this.flow.hashCode() * 31;
        String str = this.editingOrderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return iHashCode2 + (deliveryCode != null ? deliveryCode.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodPayload(flow=" + this.flow + ", editingOrderId=" + this.editingOrderId + ", deliveryCode=" + this.deliveryCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.editingOrderId);
        dest.writeParcelable(this.deliveryCode, flags);
    }
}
