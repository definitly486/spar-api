package ru.myspar.proloyalty.purchases.impl.list_add_product.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.list_add_product.domain.model.AddProductType;

/* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_add_product.domain.store.PurchaseListAddProductDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"ru/myspar/proloyalty/purchases/impl/list_add_product/domain/store/PurchaseListAddProductDialogStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/model/AddProductType;", "typeOfUse", "", "Lru/myspar/proloyalty/purchases_list/api/models/PurchaseList;", "purchaseLists", "", "isLoading", "<init>", "(Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/model/AddProductType;Ljava/util/List;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/store/PurchaseListAddProductDialogStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/model/AddProductType;Ljava/util/List;Z)Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/store/PurchaseListAddProductDialogStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/model/AddProductType;", "gxszxtbevo", "()Lru/myspar/proloyalty/purchases/impl/list_add_product/domain/model/AddProductType;", "yggfygwlhe", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "jyumaefscl", "Z", "lqeggnwhkg", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List purchaseLists;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddProductType typeOfUse;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_add_product.domain.store.PurchaseListAddProductDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            AddProductType addProductType = (AddProductType) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(addProductType, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(AddProductType typeOfUse, List purchaseLists, boolean z13) {
        zdlpuopuiu.btonecajqb(typeOfUse, "typeOfUse");
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        this.typeOfUse = typeOfUse;
        this.purchaseLists = purchaseLists;
        this.isLoading = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, AddProductType addProductType, List list, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            addProductType = state.typeOfUse;
        }
        if ((i13 & 2) != 0) {
            list = state.purchaseLists;
        }
        if ((i13 & 4) != 0) {
            z13 = state.isLoading;
        }
        return state.zoijcleaow(addProductType, list, z13);
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
        return zdlpuopuiu.eablkybsjg(this.typeOfUse, state.typeOfUse) && zdlpuopuiu.eablkybsjg(this.purchaseLists, state.purchaseLists) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final AddProductType getTypeOfUse() {
        return this.typeOfUse;
    }

    public int hashCode() {
        return (((this.typeOfUse.hashCode() * 31) + this.purchaseLists.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(typeOfUse=" + this.typeOfUse + ", purchaseLists=" + this.purchaseLists + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.typeOfUse, flags);
        List list = this.purchaseLists;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(AddProductType typeOfUse, List purchaseLists, boolean isLoading) {
        zdlpuopuiu.btonecajqb(typeOfUse, "typeOfUse");
        zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
        return new State(typeOfUse, purchaseLists, isLoading);
    }

    public /* synthetic */ State(AddProductType addProductType, List list, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(addProductType, list, (i13 & 4) != 0 ? false : z13);
    }
}
