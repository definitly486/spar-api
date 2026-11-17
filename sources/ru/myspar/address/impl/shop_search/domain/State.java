package ru.myspar.address.impl.shop_search.domain;

import android.os.Parcel;
import android.os.Parcelable;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import rn.eablkybsjg;
import ru.myspar.common.models.LocationData;

/* JADX INFO: renamed from: ru.myspar.address.impl.shop_search.domain.ShopSearchStore$State, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"ru/myspar/address/impl/shop_search/domain/ShopSearchStore$State", "Landroid/os/Parcelable;", "Lru/myspar/common/models/LocationData;", "location", "Lp0/tzroggbefp;", "searchInput", "Lrn/eablkybsjg;", "searchInputWarning", "", "isLoading", "", "", "", "Lru/myspar/components/search_address/api/model/SearchShop;", "shopsMap", "<init>", "(Lru/myspar/common/models/LocationData;Lp0/tzroggbefp;Lrn/eablkybsjg;ZLjava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/address/impl/shop_search/domain/ShopSearchStore$State;", "zoijcleaow", "(Lru/myspar/common/models/LocationData;Lp0/tzroggbefp;Lrn/eablkybsjg;ZLjava/util/Map;)Lru/myspar/address/impl/shop_search/domain/ShopSearchStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/common/models/LocationData;", "iobyxmoadg", "()Lru/myspar/common/models/LocationData;", "yggfygwlhe", "Lp0/tzroggbefp;", "eablkybsjg", "()Lp0/tzroggbefp;", "jyumaefscl", "Lrn/eablkybsjg;", "gxszxtbevo", "()Lrn/eablkybsjg;", "iwizpuwonk", "Z", "nufgyqmvbu", "()Z", "cqumvgiudr", "Ljava/util/Map;", "lqeggnwhkg", "()Ljava/util/Map;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map shopsMap;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final eablkybsjg searchInputWarning;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp searchInput;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData location;

    /* JADX INFO: renamed from: ru.myspar.address.impl.shop_search.domain.ShopSearchStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            LocationData locationData = (LocationData) parcel.readParcelable(State.class.getClassLoader());
            tzroggbefp tzroggbefpVarIobyxmoadg = et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel);
            eablkybsjg eablkybsjgVarValueOf = parcel.readInt() == 0 ? null : eablkybsjg.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                String string = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
                }
                linkedHashMap.put(string, arrayList);
            }
            return new State(locationData, tzroggbefpVarIobyxmoadg, eablkybsjgVarValueOf, z13, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(LocationData location, tzroggbefp searchInput, eablkybsjg eablkybsjgVar, boolean z13, Map shopsMap) {
        zdlpuopuiu.btonecajqb(location, "location");
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(shopsMap, "shopsMap");
        this.location = location;
        this.searchInput = searchInput;
        this.searchInputWarning = eablkybsjgVar;
        this.isLoading = z13;
        this.shopsMap = shopsMap;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, LocationData locationData, tzroggbefp tzroggbefpVar, eablkybsjg eablkybsjgVar, boolean z13, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            locationData = state.location;
        }
        if ((i13 & 2) != 0) {
            tzroggbefpVar = state.searchInput;
        }
        tzroggbefp tzroggbefpVar2 = tzroggbefpVar;
        if ((i13 & 4) != 0) {
            eablkybsjgVar = state.searchInputWarning;
        }
        eablkybsjg eablkybsjgVar2 = eablkybsjgVar;
        if ((i13 & 8) != 0) {
            z13 = state.isLoading;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            map = state.shopsMap;
        }
        return state.zoijcleaow(locationData, tzroggbefpVar2, eablkybsjgVar2, z14, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final tzroggbefp getSearchInput() {
        return this.searchInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.location, state.location) && zdlpuopuiu.eablkybsjg(this.searchInput, state.searchInput) && this.searchInputWarning == state.searchInputWarning && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.shopsMap, state.shopsMap);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final eablkybsjg getSearchInputWarning() {
        return this.searchInputWarning;
    }

    public int hashCode() {
        int iHashCode = ((this.location.hashCode() * 31) + this.searchInput.hashCode()) * 31;
        eablkybsjg eablkybsjgVar = this.searchInputWarning;
        return ((((iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.shopsMap.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final LocationData getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Map getShopsMap() {
        return this.shopsMap;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(location=" + this.location + ", searchInput=" + this.searchInput + ", searchInputWarning=" + this.searchInputWarning + ", isLoading=" + this.isLoading + ", shopsMap=" + this.shopsMap + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.location, flags);
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.searchInput, dest, flags);
        eablkybsjg eablkybsjgVar = this.searchInputWarning;
        if (eablkybsjgVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eablkybsjgVar.name());
        }
        dest.writeInt(this.isLoading ? 1 : 0);
        Map map = this.shopsMap;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            List list = (List) entry.getValue();
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }
    }

    public final State zoijcleaow(LocationData location, tzroggbefp searchInput, eablkybsjg searchInputWarning, boolean isLoading, Map shopsMap) {
        zdlpuopuiu.btonecajqb(location, "location");
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(shopsMap, "shopsMap");
        return new State(location, searchInput, searchInputWarning, isLoading, shopsMap);
    }

    public /* synthetic */ State(LocationData locationData, tzroggbefp tzroggbefpVar, eablkybsjg eablkybsjgVar, boolean z13, Map map, int i13, gtknphoqwx gtknphoqwxVar) {
        this(locationData, (i13 & 2) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 4) != 0 ? eablkybsjg.INPUT_EMPTY : eablkybsjgVar, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? hg.tzroggbefp.dxjokdxxww() : map);
    }
}
