package ru.myspar.proloyalty.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006!"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/cart/CartUnavailableOrderReason;", "Landroid/os/Parcelable;", "", "canCreateOrder", "", "reasonMessage", "<init>", "(ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "zoijcleaow", "()Z", "yggfygwlhe", "Ljava/lang/String;", "ppxfxbqfkf", "jyumaefscl", "iobyxmoadg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartUnavailableOrderReason implements Parcelable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reasonMessage;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canCreateOrder;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CartUnavailableOrderReason> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.domain.models.cart.CartUnavailableOrderReason$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final CartUnavailableOrderReason iobyxmoadg() {
            return new CartUnavailableOrderReason(true, dxjokdxxww.ppxfxbqfkf());
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartUnavailableOrderReason createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CartUnavailableOrderReason(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartUnavailableOrderReason[] newArray(int i13) {
            return new CartUnavailableOrderReason[i13];
        }
    }

    public CartUnavailableOrderReason(boolean z13, String reasonMessage) {
        zdlpuopuiu.btonecajqb(reasonMessage, "reasonMessage");
        this.canCreateOrder = z13;
        this.reasonMessage = reasonMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartUnavailableOrderReason)) {
            return false;
        }
        CartUnavailableOrderReason cartUnavailableOrderReason = (CartUnavailableOrderReason) other;
        return this.canCreateOrder == cartUnavailableOrderReason.canCreateOrder && zdlpuopuiu.eablkybsjg(this.reasonMessage, cartUnavailableOrderReason.reasonMessage);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.canCreateOrder) * 31) + this.reasonMessage.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getReasonMessage() {
        return this.reasonMessage;
    }

    public String toString() {
        return "CartUnavailableOrderReason(canCreateOrder=" + this.canCreateOrder + ", reasonMessage=" + this.reasonMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.canCreateOrder ? 1 : 0);
        dest.writeString(this.reasonMessage);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getCanCreateOrder() {
        return this.canCreateOrder;
    }
}
