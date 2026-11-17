package ru.myspar.proloyalty.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;", "Landroid/os/Parcelable;", "", "available", "balance", "applied", "", "tooltip", "<init>", "(IIILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(IIILjava/lang/String;)Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "gxszxtbevo", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Ljava/lang/String;", "nufgyqmvbu", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartBonuses implements Parcelable {
    public static final Parcelable.Creator<CartBonuses> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tooltip;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int applied;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int balance;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int available;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartBonuses createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CartBonuses(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartBonuses[] newArray(int i13) {
            return new CartBonuses[i13];
        }
    }

    public CartBonuses(int i13, int i14, int i15, String tooltip) {
        zdlpuopuiu.btonecajqb(tooltip, "tooltip");
        this.available = i13;
        this.balance = i14;
        this.applied = i15;
        this.tooltip = tooltip;
    }

    public static /* synthetic */ CartBonuses ppxfxbqfkf(CartBonuses cartBonuses, int i13, int i14, int i15, String str, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = cartBonuses.available;
        }
        if ((i16 & 2) != 0) {
            i14 = cartBonuses.balance;
        }
        if ((i16 & 4) != 0) {
            i15 = cartBonuses.applied;
        }
        if ((i16 & 8) != 0) {
            str = cartBonuses.tooltip;
        }
        return cartBonuses.zoijcleaow(i13, i14, i15, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getApplied() {
        return this.applied;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartBonuses)) {
            return false;
        }
        CartBonuses cartBonuses = (CartBonuses) other;
        return this.available == cartBonuses.available && this.balance == cartBonuses.balance && this.applied == cartBonuses.applied && zdlpuopuiu.eablkybsjg(this.tooltip, cartBonuses.tooltip);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getAvailable() {
        return this.available;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.available) * 31) + Integer.hashCode(this.balance)) * 31) + Integer.hashCode(this.applied)) * 31) + this.tooltip.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final int getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getTooltip() {
        return this.tooltip;
    }

    public String toString() {
        return "CartBonuses(available=" + this.available + ", balance=" + this.balance + ", applied=" + this.applied + ", tooltip=" + this.tooltip + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.available);
        dest.writeInt(this.balance);
        dest.writeInt(this.applied);
        dest.writeString(this.tooltip);
    }

    public final CartBonuses zoijcleaow(int available, int balance, int applied, String tooltip) {
        zdlpuopuiu.btonecajqb(tooltip, "tooltip");
        return new CartBonuses(available, balance, applied, tooltip);
    }
}
