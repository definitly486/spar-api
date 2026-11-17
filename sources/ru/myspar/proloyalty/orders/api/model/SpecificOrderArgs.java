package ru.myspar.proloyalty.orders.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import sz0.eablkybsjg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/myspar/proloyalty/orders/api/model/SpecificOrderArgs;", "Landroid/os/Parcelable;", "", "orderId", "Lsz0/eablkybsjg;", "orderServerStatus", "", "openPaymentScreenOnStart", "<init>", "(Ljava/lang/String;Lsz0/eablkybsjg;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "Lsz0/eablkybsjg;", "eablkybsjg", "()Lsz0/eablkybsjg;", "jyumaefscl", "Z", "zoijcleaow", "()Z", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpecificOrderArgs implements Parcelable {
    public static final Parcelable.Creator<SpecificOrderArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean openPaymentScreenOnStart;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final eablkybsjg orderServerStatus;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SpecificOrderArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SpecificOrderArgs(parcel.readString(), eablkybsjg.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SpecificOrderArgs[] newArray(int i13) {
            return new SpecificOrderArgs[i13];
        }
    }

    public SpecificOrderArgs(String orderId, eablkybsjg orderServerStatus, boolean z13) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(orderServerStatus, "orderServerStatus");
        this.orderId = orderId;
        this.orderServerStatus = orderServerStatus;
        this.openPaymentScreenOnStart = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final eablkybsjg getOrderServerStatus() {
        return this.orderServerStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecificOrderArgs)) {
            return false;
        }
        SpecificOrderArgs specificOrderArgs = (SpecificOrderArgs) other;
        return zdlpuopuiu.eablkybsjg(this.orderId, specificOrderArgs.orderId) && this.orderServerStatus == specificOrderArgs.orderServerStatus && this.openPaymentScreenOnStart == specificOrderArgs.openPaymentScreenOnStart;
    }

    public int hashCode() {
        return (((this.orderId.hashCode() * 31) + this.orderServerStatus.hashCode()) * 31) + Boolean.hashCode(this.openPaymentScreenOnStart);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public String toString() {
        return "SpecificOrderArgs(orderId=" + this.orderId + ", orderServerStatus=" + this.orderServerStatus + ", openPaymentScreenOnStart=" + this.openPaymentScreenOnStart + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.orderServerStatus.name());
        dest.writeInt(this.openPaymentScreenOnStart ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getOpenPaymentScreenOnStart() {
        return this.openPaymentScreenOnStart;
    }

    public /* synthetic */ SpecificOrderArgs(String str, eablkybsjg eablkybsjgVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? eablkybsjg.CURRENT : eablkybsjgVar, (i13 & 4) != 0 ? false : z13);
    }
}
