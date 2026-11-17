package ru.myspar.purchases.impl.specific.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010$¨\u0006'"}, d2 = {"Lru/myspar/purchases/impl/specific/domain/store/SpecificPurchaseArgs;", "Landroid/os/Parcelable;", "Lg10/iobyxmoadg;", "flow", "", "orderId", "", "isFutureBasket", "<init>", "(Lg10/iobyxmoadg;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lg10/iobyxmoadg;", "zoijcleaow", "()Lg10/iobyxmoadg;", "yggfygwlhe", "Ljava/lang/String;", "ppxfxbqfkf", "jyumaefscl", "Z", "eablkybsjg", "()Z", "gxszxtbevo", "isOrder", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SpecificPurchaseArgs implements Parcelable {
    public static final Parcelable.Creator<SpecificPurchaseArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFutureBasket;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final g10.iobyxmoadg flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SpecificPurchaseArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SpecificPurchaseArgs(g10.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SpecificPurchaseArgs[] newArray(int i13) {
            return new SpecificPurchaseArgs[i13];
        }
    }

    public SpecificPurchaseArgs(g10.iobyxmoadg flow, String orderId, boolean z13) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.flow = flow;
        this.orderId = orderId;
        this.isFutureBasket = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsFutureBasket() {
        return this.isFutureBasket;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecificPurchaseArgs)) {
            return false;
        }
        SpecificPurchaseArgs specificPurchaseArgs = (SpecificPurchaseArgs) other;
        return this.flow == specificPurchaseArgs.flow && zdlpuopuiu.eablkybsjg(this.orderId, specificPurchaseArgs.orderId) && this.isFutureBasket == specificPurchaseArgs.isFutureBasket;
    }

    public final boolean gxszxtbevo() {
        return this.flow == g10.iobyxmoadg.DEFAULT;
    }

    public int hashCode() {
        return (((this.flow.hashCode() * 31) + this.orderId.hashCode()) * 31) + Boolean.hashCode(this.isFutureBasket);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public String toString() {
        return "SpecificPurchaseArgs(flow=" + this.flow + ", orderId=" + this.orderId + ", isFutureBasket=" + this.isFutureBasket + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.orderId);
        dest.writeInt(this.isFutureBasket ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final g10.iobyxmoadg getFlow() {
        return this.flow;
    }
}
