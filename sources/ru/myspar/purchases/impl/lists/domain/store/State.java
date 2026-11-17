package ru.myspar.purchases.impl.lists.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.purchases.impl.lists.domain.store.PurchaseListsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"ru/myspar/purchases/impl/lists/domain/store/PurchaseListsStore$State", "Landroid/os/Parcelable;", "", "Lru/myspar/purchases_list/api/models/PurchaseList;", "purchaseLists", "", "isPurchaseListsLoading", "isInitializing", "<init>", "(Ljava/util/List;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/purchases/impl/lists/domain/store/PurchaseListsStore$State;", "zoijcleaow", "(Ljava/util/List;ZZ)Lru/myspar/purchases/impl/lists/domain/store/PurchaseListsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "yggfygwlhe", "Z", "lqeggnwhkg", "()Z", "jyumaefscl", "gxszxtbevo", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInitializing;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchaseListsLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List purchaseLists;

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.lists.domain.store.PurchaseListsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(List purchaseLists, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        this.purchaseLists = purchaseLists;
        this.isPurchaseListsLoading = z13;
        this.isInitializing = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, List list, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = state.purchaseLists;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isPurchaseListsLoading;
        }
        if ((i13 & 4) != 0) {
            z14 = state.isInitializing;
        }
        return state.zoijcleaow(list, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getPurchaseLists() {
        return this.purchaseLists;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.purchaseLists, state.purchaseLists) && this.isPurchaseListsLoading == state.isPurchaseListsLoading && this.isInitializing == state.isInitializing;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsInitializing() {
        return this.isInitializing;
    }

    public int hashCode() {
        return (((this.purchaseLists.hashCode() * 31) + Boolean.hashCode(this.isPurchaseListsLoading)) * 31) + Boolean.hashCode(this.isInitializing);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsPurchaseListsLoading() {
        return this.isPurchaseListsLoading;
    }

    public String toString() {
        return "State(purchaseLists=" + this.purchaseLists + ", isPurchaseListsLoading=" + this.isPurchaseListsLoading + ", isInitializing=" + this.isInitializing + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        List list = this.purchaseLists;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.isPurchaseListsLoading ? 1 : 0);
        dest.writeInt(this.isInitializing ? 1 : 0);
    }

    public final State zoijcleaow(List purchaseLists, boolean isPurchaseListsLoading, boolean isInitializing) {
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        return new State(purchaseLists, isPurchaseListsLoading, isInitializing);
    }

    public /* synthetic */ State(List list, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? true : z14);
    }
}
