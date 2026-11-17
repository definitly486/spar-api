package ru.myspar.proloyalty.address.impl.address_search.domain;

import android.os.Parcel;
import android.os.Parcelable;
import cm0.eablkybsjg;
import hg.jyumaefscl;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.address_search.domain.AddressSearchStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"ru/myspar/proloyalty/address/impl/address_search/domain/AddressSearchStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/common/models/LocationData;", "location", "", "isLoading", "Lp0/tzroggbefp;", "searchInput", "", "Lru/myspar/proloyalty/components/search_address/api/model/SearchAddress;", "searchResult", "Lcm0/eablkybsjg;", "inputWarning", "<init>", "(Lru/myspar/proloyalty/common/models/LocationData;ZLp0/tzroggbefp;Ljava/util/List;Lcm0/eablkybsjg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/address/impl/address_search/domain/AddressSearchStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/common/models/LocationData;ZLp0/tzroggbefp;Ljava/util/List;Lcm0/eablkybsjg;)Lru/myspar/proloyalty/address/impl/address_search/domain/AddressSearchStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/proloyalty/common/models/LocationData;", "yggfygwlhe", "Z", "nufgyqmvbu", "()Z", "jyumaefscl", "Lp0/tzroggbefp;", "gxszxtbevo", "()Lp0/tzroggbefp;", "iwizpuwonk", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "cqumvgiudr", "Lcm0/eablkybsjg;", "eablkybsjg", "()Lcm0/eablkybsjg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final eablkybsjg inputWarning;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List searchResult;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp searchInput;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData location;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.address_search.domain.AddressSearchStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            LocationData locationData = (LocationData) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            tzroggbefp tzroggbefpVarIobyxmoadg = yr0.iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(locationData, z13, tzroggbefpVarIobyxmoadg, arrayList, parcel.readInt() == 0 ? null : eablkybsjg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(LocationData location, boolean z13, tzroggbefp searchInput, List searchResult, eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(location, "location");
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(searchResult, "searchResult");
        this.location = location;
        this.isLoading = z13;
        this.searchInput = searchInput;
        this.searchResult = searchResult;
        this.inputWarning = eablkybsjgVar;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, LocationData locationData, boolean z13, tzroggbefp tzroggbefpVar, List list, eablkybsjg eablkybsjgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            locationData = state.location;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isLoading;
        }
        boolean z14 = z13;
        if ((i13 & 4) != 0) {
            tzroggbefpVar = state.searchInput;
        }
        tzroggbefp tzroggbefpVar2 = tzroggbefpVar;
        if ((i13 & 8) != 0) {
            list = state.searchResult;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            eablkybsjgVar = state.inputWarning;
        }
        return state.zoijcleaow(locationData, z14, tzroggbefpVar2, list2, eablkybsjgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final eablkybsjg getInputWarning() {
        return this.inputWarning;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.location, state.location) && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.searchInput, state.searchInput) && zdlpuopuiu.eablkybsjg(this.searchResult, state.searchResult) && this.inputWarning == state.inputWarning;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final tzroggbefp getSearchInput() {
        return this.searchInput;
    }

    public int hashCode() {
        int iHashCode = ((((((this.location.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.searchInput.hashCode()) * 31) + this.searchResult.hashCode()) * 31;
        eablkybsjg eablkybsjgVar = this.inputWarning;
        return iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode());
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final LocationData getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getSearchResult() {
        return this.searchResult;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(location=" + this.location + ", isLoading=" + this.isLoading + ", searchInput=" + this.searchInput + ", searchResult=" + this.searchResult + ", inputWarning=" + this.inputWarning + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.location, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        yr0.iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.searchInput, dest, flags);
        List list = this.searchResult;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        eablkybsjg eablkybsjgVar = this.inputWarning;
        if (eablkybsjgVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eablkybsjgVar.name());
        }
    }

    public final State zoijcleaow(LocationData location, boolean isLoading, tzroggbefp searchInput, List searchResult, eablkybsjg inputWarning) {
        zdlpuopuiu.btonecajqb(location, "location");
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(searchResult, "searchResult");
        return new State(location, isLoading, searchInput, searchResult, inputWarning);
    }

    public /* synthetic */ State(LocationData locationData, boolean z13, tzroggbefp tzroggbefpVar, List list, eablkybsjg eablkybsjgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(locationData, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 16) != 0 ? eablkybsjg.INPUT_EMPTY : eablkybsjgVar);
    }
}
