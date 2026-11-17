package ru.myspar.purchases.impl.history.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.Purchases;

/* JADX INFO: renamed from: ru.myspar.purchases.impl.history.domain.store.PurchasesHistoryStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.¨\u00061"}, d2 = {"ru/myspar/purchases/impl/history/domain/store/PurchasesHistoryStore$State", "Landroid/os/Parcelable;", "Lg10/iobyxmoadg;", "flow", "Lru/myspar/core/domain/models/order/Purchases;", "purchaseInfo", "", "currentPage", "", "catalogIsShowOnly", "isLoading", "<init>", "(Lg10/iobyxmoadg;Lru/myspar/core/domain/models/order/Purchases;IZZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/purchases/impl/history/domain/store/PurchasesHistoryStore$State;", "zoijcleaow", "(Lg10/iobyxmoadg;Lru/myspar/core/domain/models/order/Purchases;IZZ)Lru/myspar/purchases/impl/history/domain/store/PurchasesHistoryStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lg10/iobyxmoadg;", "gxszxtbevo", "()Lg10/iobyxmoadg;", "yggfygwlhe", "Lru/myspar/core/domain/models/order/Purchases;", "lqeggnwhkg", "()Lru/myspar/core/domain/models/order/Purchases;", "jyumaefscl", "I", "eablkybsjg", "iwizpuwonk", "Z", "getCatalogIsShowOnly", "()Z", "cqumvgiudr", "nufgyqmvbu", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean catalogIsShowOnly;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Purchases purchaseInfo;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final g10.iobyxmoadg flow;

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.history.domain.store.PurchasesHistoryStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(g10.iobyxmoadg.valueOf(parcel.readString()), (Purchases) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(g10.iobyxmoadg flow, Purchases purchases, int i13, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        this.flow = flow;
        this.purchaseInfo = purchases;
        this.currentPage = i13;
        this.catalogIsShowOnly = z13;
        this.isLoading = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, g10.iobyxmoadg iobyxmoadgVar, Purchases purchases, int i13, boolean z13, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            iobyxmoadgVar = state.flow;
        }
        if ((i14 & 2) != 0) {
            purchases = state.purchaseInfo;
        }
        Purchases purchases2 = purchases;
        if ((i14 & 4) != 0) {
            i13 = state.currentPage;
        }
        int i15 = i13;
        if ((i14 & 8) != 0) {
            z13 = state.catalogIsShowOnly;
        }
        boolean z15 = z13;
        if ((i14 & 16) != 0) {
            z14 = state.isLoading;
        }
        return state.zoijcleaow(iobyxmoadgVar, purchases2, i15, z15, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        return this.flow == state.flow && zdlpuopuiu.eablkybsjg(this.purchaseInfo, state.purchaseInfo) && this.currentPage == state.currentPage && this.catalogIsShowOnly == state.catalogIsShowOnly && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final g10.iobyxmoadg getFlow() {
        return this.flow;
    }

    public int hashCode() {
        int iHashCode = this.flow.hashCode() * 31;
        Purchases purchases = this.purchaseInfo;
        return ((((((iHashCode + (purchases == null ? 0 : purchases.hashCode())) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.catalogIsShowOnly)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Purchases getPurchaseInfo() {
        return this.purchaseInfo;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(flow=" + this.flow + ", purchaseInfo=" + this.purchaseInfo + ", currentPage=" + this.currentPage + ", catalogIsShowOnly=" + this.catalogIsShowOnly + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeParcelable(this.purchaseInfo, flags);
        dest.writeInt(this.currentPage);
        dest.writeInt(this.catalogIsShowOnly ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(g10.iobyxmoadg flow, Purchases purchaseInfo, int currentPage, boolean catalogIsShowOnly, boolean isLoading) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        return new State(flow, purchaseInfo, currentPage, catalogIsShowOnly, isLoading);
    }

    public /* synthetic */ State(g10.iobyxmoadg iobyxmoadgVar, Purchases purchases, int i13, boolean z13, boolean z14, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? g10.iobyxmoadg.DEFAULT : iobyxmoadgVar, (i14 & 2) != 0 ? null : purchases, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? false : z13, (i14 & 16) == 0 ? z14 : false);
    }
}
