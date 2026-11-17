package ru.myspar.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/myspar/core/domain/models/order/Purchases;", "Landroid/os/Parcelable;", "", "Lru/myspar/core/domain/models/order/Purchase;", "purchases", "Lru/myspar/core/domain/models/order/PurchaseFuture;", "future", "Lru/myspar/core/models/paging/Paging;", "paging", "", "isReviewsAvailable", "<init>", "(Ljava/util/List;Lru/myspar/core/domain/models/order/PurchaseFuture;Lru/myspar/core/models/paging/Paging;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/util/List;Lru/myspar/core/domain/models/order/PurchaseFuture;Lru/myspar/core/models/paging/Paging;Z)Lru/myspar/core/domain/models/order/Purchases;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "yggfygwlhe", "Lru/myspar/core/domain/models/order/PurchaseFuture;", "eablkybsjg", "()Lru/myspar/core/domain/models/order/PurchaseFuture;", "jyumaefscl", "Lru/myspar/core/models/paging/Paging;", "gxszxtbevo", "()Lru/myspar/core/models/paging/Paging;", "iwizpuwonk", "Z", "nufgyqmvbu", "()Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Purchases implements Parcelable {
    public static final Parcelable.Creator<Purchases> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isReviewsAvailable;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final PurchaseFuture future;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List purchases;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Purchases createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Purchase.CREATOR.createFromParcel(parcel));
            }
            return new Purchases(arrayList, parcel.readInt() == 0 ? null : PurchaseFuture.CREATOR.createFromParcel(parcel), (Paging) parcel.readParcelable(Purchases.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Purchases[] newArray(int i13) {
            return new Purchases[i13];
        }
    }

    public Purchases(List purchases, PurchaseFuture purchaseFuture, Paging paging, boolean z13) {
        zdlpuopuiu.btonecajqb(purchases, "purchases");
        zdlpuopuiu.btonecajqb(paging, "paging");
        this.purchases = purchases;
        this.future = purchaseFuture;
        this.paging = paging;
        this.isReviewsAvailable = z13;
    }

    public static /* synthetic */ Purchases ppxfxbqfkf(Purchases purchases, List list, PurchaseFuture purchaseFuture, Paging paging, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = purchases.purchases;
        }
        if ((i13 & 2) != 0) {
            purchaseFuture = purchases.future;
        }
        if ((i13 & 4) != 0) {
            paging = purchases.paging;
        }
        if ((i13 & 8) != 0) {
            z13 = purchases.isReviewsAvailable;
        }
        return purchases.zoijcleaow(list, purchaseFuture, paging, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final PurchaseFuture getFuture() {
        return this.future;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Purchases)) {
            return false;
        }
        Purchases purchases = (Purchases) other;
        return zdlpuopuiu.eablkybsjg(this.purchases, purchases.purchases) && zdlpuopuiu.eablkybsjg(this.future, purchases.future) && zdlpuopuiu.eablkybsjg(this.paging, purchases.paging) && this.isReviewsAvailable == purchases.isReviewsAvailable;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    public int hashCode() {
        int iHashCode = this.purchases.hashCode() * 31;
        PurchaseFuture purchaseFuture = this.future;
        return ((((iHashCode + (purchaseFuture == null ? 0 : purchaseFuture.hashCode())) * 31) + this.paging.hashCode()) * 31) + Boolean.hashCode(this.isReviewsAvailable);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getPurchases() {
        return this.purchases;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsReviewsAvailable() {
        return this.isReviewsAvailable;
    }

    public String toString() {
        return "Purchases(purchases=" + this.purchases + ", future=" + this.future + ", paging=" + this.paging + ", isReviewsAvailable=" + this.isReviewsAvailable + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        List list = this.purchases;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Purchase) it.next()).writeToParcel(dest, flags);
        }
        PurchaseFuture purchaseFuture = this.future;
        if (purchaseFuture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            purchaseFuture.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.paging, flags);
        dest.writeInt(this.isReviewsAvailable ? 1 : 0);
    }

    public final Purchases zoijcleaow(List purchases, PurchaseFuture future, Paging paging, boolean isReviewsAvailable) {
        zdlpuopuiu.btonecajqb(purchases, "purchases");
        zdlpuopuiu.btonecajqb(paging, "paging");
        return new Purchases(purchases, future, paging, isReviewsAvailable);
    }
}
