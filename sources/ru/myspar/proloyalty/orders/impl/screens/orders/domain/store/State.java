package ru.myspar.proloyalty.orders.impl.screens.orders.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.paging.Paging;
import sz0.eablkybsjg;

/* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.orders.domain.store.OrdersStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u0016J\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"ru/myspar/proloyalty/orders/impl/screens/orders/domain/store/OrdersStore$State", "Landroid/os/Parcelable;", "", "currentPage", "", "Lru/myspar/proloyalty/core/domain/models/order/OrderItem;", "orders", "Lru/myspar/proloyalty/core/models/paging/Paging;", "paging", "Lsz0/eablkybsjg;", "ordersStatus", "", "isLoading", "<init>", "(ILjava/util/List;Lru/myspar/proloyalty/core/models/paging/Paging;Lsz0/eablkybsjg;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/orders/impl/screens/orders/domain/store/OrdersStore$State;", "zoijcleaow", "(ILjava/util/List;Lru/myspar/proloyalty/core/models/paging/Paging;Lsz0/eablkybsjg;Z)Lru/myspar/proloyalty/orders/impl/screens/orders/domain/store/OrdersStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "eablkybsjg", "yggfygwlhe", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "jyumaefscl", "Lru/myspar/proloyalty/core/models/paging/Paging;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/models/paging/Paging;", "iwizpuwonk", "Lsz0/eablkybsjg;", "lqeggnwhkg", "()Lsz0/eablkybsjg;", "cqumvgiudr", "Z", "dxjokdxxww", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final eablkybsjg ordersStatus;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List orders;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.orders.domain.store.OrdersStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(i13, arrayList, (Paging) parcel.readParcelable(State.class.getClassLoader()), eablkybsjg.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(int i13, List orders, Paging paging, eablkybsjg ordersStatus, boolean z13) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        this.currentPage = i13;
        this.orders = orders;
        this.paging = paging;
        this.ordersStatus = ordersStatus;
        this.isLoading = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, int i13, List list, Paging paging, eablkybsjg eablkybsjgVar, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = state.currentPage;
        }
        if ((i14 & 2) != 0) {
            list = state.orders;
        }
        List list2 = list;
        if ((i14 & 4) != 0) {
            paging = state.paging;
        }
        Paging paging2 = paging;
        if ((i14 & 8) != 0) {
            eablkybsjgVar = state.ordersStatus;
        }
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar;
        if ((i14 & 16) != 0) {
            z13 = state.isLoading;
        }
        return state.zoijcleaow(i13, list2, paging2, eablkybsjgVar2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.currentPage == state.currentPage && zdlpuopuiu.eablkybsjg(this.orders, state.orders) && zdlpuopuiu.eablkybsjg(this.paging, state.paging) && this.ordersStatus == state.ordersStatus && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getOrders() {
        return this.orders;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.currentPage) * 31) + this.orders.hashCode()) * 31) + this.paging.hashCode()) * 31) + this.ordersStatus.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final eablkybsjg getOrdersStatus() {
        return this.ordersStatus;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    public String toString() {
        return "State(currentPage=" + this.currentPage + ", orders=" + this.orders + ", paging=" + this.paging + ", ordersStatus=" + this.ordersStatus + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.currentPage);
        List list = this.orders;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.paging, flags);
        dest.writeString(this.ordersStatus.name());
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(int currentPage, List orders, Paging paging, eablkybsjg ordersStatus, boolean isLoading) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        return new State(currentPage, orders, paging, ordersStatus, isLoading);
    }

    public /* synthetic */ State(int i13, List list, Paging paging, eablkybsjg eablkybsjgVar, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 4) != 0 ? new Paging(0, 0, 0, 7, null) : paging, eablkybsjgVar, (i14 & 16) != 0 ? false : z13);
    }
}
