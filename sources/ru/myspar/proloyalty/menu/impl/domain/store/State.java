package ru.myspar.proloyalty.menu.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.user.domain.model.UserSharePromo;

/* JADX INFO: renamed from: ru.myspar.proloyalty.menu.impl.domain.store.MenuStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"ru/myspar/proloyalty/menu/impl/domain/store/MenuStore$State", "Landroid/os/Parcelable;", "", "isLoading", "Lru/myspar/proloyalty/user/domain/model/UserSharePromo;", "userSharePromo", "", "Lnd1/iobyxmoadg;", "menuItems", "<init>", "(ZLru/myspar/proloyalty/user/domain/model/UserSharePromo;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/menu/impl/domain/store/MenuStore$State;", "zoijcleaow", "(ZLru/myspar/proloyalty/user/domain/model/UserSharePromo;Ljava/util/List;)Lru/myspar/proloyalty/menu/impl/domain/store/MenuStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "lqeggnwhkg", "()Z", "yggfygwlhe", "Lru/myspar/proloyalty/user/domain/model/UserSharePromo;", "gxszxtbevo", "()Lru/myspar/proloyalty/user/domain/model/UserSharePromo;", "jyumaefscl", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List menuItems;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserSharePromo userSharePromo;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.menu.impl.domain.store.MenuStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            UserSharePromo userSharePromo = (UserSharePromo) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(nd1.iobyxmoadg.valueOf(parcel.readString()));
            }
            return new State(z13, userSharePromo, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, UserSharePromo userSharePromo, List menuItems) {
        zdlpuopuiu.btonecajqb(menuItems, "menuItems");
        this.isLoading = z13;
        this.userSharePromo = userSharePromo;
        this.menuItems = menuItems;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, UserSharePromo userSharePromo, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            userSharePromo = state.userSharePromo;
        }
        if ((i13 & 4) != 0) {
            list = state.menuItems;
        }
        return state.zoijcleaow(z13, userSharePromo, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getMenuItems() {
        return this.menuItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.userSharePromo, state.userSharePromo) && zdlpuopuiu.eablkybsjg(this.menuItems, state.menuItems);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final UserSharePromo getUserSharePromo() {
        return this.userSharePromo;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UserSharePromo userSharePromo = this.userSharePromo;
        return ((iHashCode + (userSharePromo == null ? 0 : userSharePromo.hashCode())) * 31) + this.menuItems.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", userSharePromo=" + this.userSharePromo + ", menuItems=" + this.menuItems + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.userSharePromo, flags);
        List list = this.menuItems;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(((nd1.iobyxmoadg) it.next()).name());
        }
    }

    public final State zoijcleaow(boolean isLoading, UserSharePromo userSharePromo, List menuItems) {
        zdlpuopuiu.btonecajqb(menuItems, "menuItems");
        return new State(isLoading, userSharePromo, menuItems);
    }

    public /* synthetic */ State(boolean z13, UserSharePromo userSharePromo, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? true : z13, (i13 & 2) != 0 ? null : userSharePromo, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
