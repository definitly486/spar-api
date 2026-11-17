package ru.myspar.purchases.impl.create_list.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: renamed from: ru.myspar.purchases.impl.create_list.domain.store.CreatePurchaseListsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"ru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsStore$State", "Landroid/os/Parcelable;", "", "isLoading", "Lru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "fragmentArgs", "Lp0/tzroggbefp;", "listName", "<init>", "(ZLru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;Lp0/tzroggbefp;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsStore$State;", "zoijcleaow", "(ZLru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;Lp0/tzroggbefp;)Lru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "lqeggnwhkg", "()Z", "yggfygwlhe", "Lru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "eablkybsjg", "()Lru/myspar/purchases/impl/create_list/domain/store/CreatePurchaseListsFragmentArgs;", "jyumaefscl", "Lp0/tzroggbefp;", "gxszxtbevo", "()Lp0/tzroggbefp;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp listName;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final CreatePurchaseListsFragmentArgs fragmentArgs;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.create_list.domain.store.CreatePurchaseListsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, (CreatePurchaseListsFragmentArgs) parcel.readParcelable(State.class.getClassLoader()), et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, CreatePurchaseListsFragmentArgs fragmentArgs, tzroggbefp listName) {
        zdlpuopuiu.btonecajqb(fragmentArgs, "fragmentArgs");
        zdlpuopuiu.btonecajqb(listName, "listName");
        this.isLoading = z13;
        this.fragmentArgs = fragmentArgs;
        this.listName = listName;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs, tzroggbefp tzroggbefpVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            createPurchaseListsFragmentArgs = state.fragmentArgs;
        }
        if ((i13 & 4) != 0) {
            tzroggbefpVar = state.listName;
        }
        return state.zoijcleaow(z13, createPurchaseListsFragmentArgs, tzroggbefpVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final CreatePurchaseListsFragmentArgs getFragmentArgs() {
        return this.fragmentArgs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.fragmentArgs, state.fragmentArgs) && zdlpuopuiu.eablkybsjg(this.listName, state.listName);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final tzroggbefp getListName() {
        return this.listName;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.fragmentArgs.hashCode()) * 31) + this.listName.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", fragmentArgs=" + this.fragmentArgs + ", listName=" + this.listName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.fragmentArgs, flags);
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.listName, dest, flags);
    }

    public final State zoijcleaow(boolean isLoading, CreatePurchaseListsFragmentArgs fragmentArgs, tzroggbefp listName) {
        zdlpuopuiu.btonecajqb(fragmentArgs, "fragmentArgs");
        zdlpuopuiu.btonecajqb(listName, "listName");
        return new State(isLoading, fragmentArgs, listName);
    }

    public /* synthetic */ State(boolean z13, CreatePurchaseListsFragmentArgs createPurchaseListsFragmentArgs, tzroggbefp tzroggbefpVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, createPurchaseListsFragmentArgs, tzroggbefpVar);
    }
}
