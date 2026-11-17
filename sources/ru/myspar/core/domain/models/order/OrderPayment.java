package ru.myspar.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import k30.draadjrbmk;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.payment.api.models.PaymentCode;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b\b\u0010'R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b\t\u0010'R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0017¨\u0006,"}, d2 = {"Lru/myspar/core/domain/models/order/OrderPayment;", "Landroid/os/Parcelable;", "Lru/myspar/components/payment/api/models/PaymentCode;", "code", "", "title", "", "isCanBePaid", "isPaid", "isNeedVerify", "change", "<init>", "(Lru/myspar/components/payment/api/models/PaymentCode;Ljava/lang/String;ZZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/components/payment/api/models/PaymentCode;", "ppxfxbqfkf", "()Lru/myspar/components/payment/api/models/PaymentCode;", "yggfygwlhe", "Ljava/lang/String;", "eablkybsjg", "jyumaefscl", "Z", "gxszxtbevo", "()Z", "iwizpuwonk", "cqumvgiudr", "esjtqupxsv", "zoijcleaow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderPayment implements Parcelable {
    public static final Parcelable.Creator<OrderPayment> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedVerify;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String change;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaid;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCanBePaid;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCode code;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final OrderPayment createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new OrderPayment((PaymentCode) parcel.readParcelable(OrderPayment.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final OrderPayment[] newArray(int i13) {
            return new OrderPayment[i13];
        }
    }

    public OrderPayment(PaymentCode code, String title, boolean z13, boolean z14, boolean z15, String change) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(change, "change");
        this.code = code;
        this.title = title;
        this.isCanBePaid = z13;
        this.isPaid = z14;
        this.isNeedVerify = z15;
        this.change = change;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPayment)) {
            return false;
        }
        OrderPayment orderPayment = (OrderPayment) other;
        return this.code == orderPayment.code && zdlpuopuiu.eablkybsjg(this.title, orderPayment.title) && this.isCanBePaid == orderPayment.isCanBePaid && this.isPaid == orderPayment.isPaid && this.isNeedVerify == orderPayment.isNeedVerify && zdlpuopuiu.eablkybsjg(this.change, orderPayment.change);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsCanBePaid() {
        return this.isCanBePaid;
    }

    public int hashCode() {
        return (((((((((this.code.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isCanBePaid)) * 31) + Boolean.hashCode(this.isPaid)) * 31) + Boolean.hashCode(this.isNeedVerify)) * 31) + this.change.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final PaymentCode getCode() {
        return this.code;
    }

    public String toString() {
        return "OrderPayment(code=" + this.code + ", title=" + this.title + ", isCanBePaid=" + this.isCanBePaid + ", isPaid=" + this.isPaid + ", isNeedVerify=" + this.isNeedVerify + ", change=" + this.change + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.code, flags);
        dest.writeString(this.title);
        dest.writeInt(this.isCanBePaid ? 1 : 0);
        dest.writeInt(this.isPaid ? 1 : 0);
        dest.writeInt(this.isNeedVerify ? 1 : 0);
        dest.writeString(this.change);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getChange() {
        return this.change;
    }

    public /* synthetic */ OrderPayment(PaymentCode paymentCode, String str, boolean z13, boolean z14, boolean z15, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? PaymentCode.UNDEFINED : paymentCode, (i13 & 2) != 0 ? draadjrbmk.ppxfxbqfkf() : str, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) == 0 ? z15 : false, (i13 & 32) != 0 ? draadjrbmk.ppxfxbqfkf() : str2);
    }
}
