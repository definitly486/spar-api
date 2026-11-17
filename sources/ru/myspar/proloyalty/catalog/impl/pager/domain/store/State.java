package ru.myspar.proloyalty.catalog.impl.pager.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.CatalogArgs;
import ru.myspar.proloyalty.core.domain.models.delivery.CatalogPagerAddressData;

/* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.pager.domain.store.CatalogPagerStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJn\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH×\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H×\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"ru/myspar/proloyalty/catalog/impl/pager/domain/store/CatalogPagerStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/delivery/CatalogPagerAddressData;", "addressData", "", "isLoading", "", "Lru/myspar/proloyalty/core/domain/models/catalog/CatalogSection;", "sections", "adultDialogWasShown", "isRestaurantsEnabled", "Ljp0/iobyxmoadg;", "selectedTab", "Lru/myspar/proloyalty/core/domain/models/restaurants/Restaurant;", "restaurants", "Lru/myspar/proloyalty/catalog/api/model/CatalogArgs;", "args", "<init>", "(Lru/myspar/proloyalty/core/domain/models/delivery/CatalogPagerAddressData;ZLjava/util/List;ZZLjp0/iobyxmoadg;Ljava/util/List;Lru/myspar/proloyalty/catalog/api/model/CatalogArgs;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/catalog/impl/pager/domain/store/CatalogPagerStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/core/domain/models/delivery/CatalogPagerAddressData;ZLjava/util/List;ZZLjp0/iobyxmoadg;Ljava/util/List;Lru/myspar/proloyalty/catalog/api/model/CatalogArgs;)Lru/myspar/proloyalty/catalog/impl/pager/domain/store/CatalogPagerStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/delivery/CatalogPagerAddressData;", "eablkybsjg", "()Lru/myspar/proloyalty/core/domain/models/delivery/CatalogPagerAddressData;", "yggfygwlhe", "Z", "gtknphoqwx", "()Z", "jyumaefscl", "Ljava/util/List;", "dxjokdxxww", "()Ljava/util/List;", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "wflxmlrfwp", "esjtqupxsv", "Ljp0/iobyxmoadg;", "btonecajqb", "()Ljp0/iobyxmoadg;", "lereixgezr", "nufgyqmvbu", "pmvmpeiblj", "Lru/myspar/proloyalty/catalog/api/model/CatalogArgs;", "lqeggnwhkg", "()Lru/myspar/proloyalty/catalog/api/model/CatalogArgs;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRestaurantsEnabled;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final jp0.iobyxmoadg selectedTab;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean adultDialogWasShown;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List sections;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List restaurants;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final CatalogArgs args;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final CatalogPagerAddressData addressData;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.pager.domain.store.CatalogPagerStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            CatalogPagerAddressData catalogPagerAddressData = (CatalogPagerAddressData) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            jp0.iobyxmoadg iobyxmoadgVarValueOf = jp0.iobyxmoadg.valueOf(parcel.readString());
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(catalogPagerAddressData, z13, arrayList, z14, z15, iobyxmoadgVarValueOf, arrayList2, (CatalogArgs) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(CatalogPagerAddressData catalogPagerAddressData, boolean z13, List sections, boolean z14, boolean z15, jp0.iobyxmoadg selectedTab, List restaurants, CatalogArgs args) {
        zdlpuopuiu.btonecajqb(sections, "sections");
        zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        zdlpuopuiu.btonecajqb(restaurants, "restaurants");
        zdlpuopuiu.btonecajqb(args, "args");
        this.addressData = catalogPagerAddressData;
        this.isLoading = z13;
        this.sections = sections;
        this.adultDialogWasShown = z14;
        this.isRestaurantsEnabled = z15;
        this.selectedTab = selectedTab;
        this.restaurants = restaurants;
        this.args = args;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final jp0.iobyxmoadg getSelectedTab() {
        return this.selectedTab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final CatalogPagerAddressData getAddressData() {
        return this.addressData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.addressData, state.addressData) && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.sections, state.sections) && this.adultDialogWasShown == state.adultDialogWasShown && this.isRestaurantsEnabled == state.isRestaurantsEnabled && this.selectedTab == state.selectedTab && zdlpuopuiu.eablkybsjg(this.restaurants, state.restaurants) && zdlpuopuiu.eablkybsjg(this.args, state.args);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getAdultDialogWasShown() {
        return this.adultDialogWasShown;
    }

    public int hashCode() {
        CatalogPagerAddressData catalogPagerAddressData = this.addressData;
        return ((((((((((((((catalogPagerAddressData == null ? 0 : catalogPagerAddressData.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.sections.hashCode()) * 31) + Boolean.hashCode(this.adultDialogWasShown)) * 31) + Boolean.hashCode(this.isRestaurantsEnabled)) * 31) + this.selectedTab.hashCode()) * 31) + this.restaurants.hashCode()) * 31) + this.args.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final CatalogArgs getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getRestaurants() {
        return this.restaurants;
    }

    public String toString() {
        return "State(addressData=" + this.addressData + ", isLoading=" + this.isLoading + ", sections=" + this.sections + ", adultDialogWasShown=" + this.adultDialogWasShown + ", isRestaurantsEnabled=" + this.isRestaurantsEnabled + ", selectedTab=" + this.selectedTab + ", restaurants=" + this.restaurants + ", args=" + this.args + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsRestaurantsEnabled() {
        return this.isRestaurantsEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.addressData, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        List list = this.sections;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.adultDialogWasShown ? 1 : 0);
        dest.writeInt(this.isRestaurantsEnabled ? 1 : 0);
        dest.writeString(this.selectedTab.name());
        List list2 = this.restaurants;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.args, flags);
    }

    public final State zoijcleaow(CatalogPagerAddressData addressData, boolean isLoading, List sections, boolean adultDialogWasShown, boolean isRestaurantsEnabled, jp0.iobyxmoadg selectedTab, List restaurants, CatalogArgs args) {
        zdlpuopuiu.btonecajqb(sections, "sections");
        zdlpuopuiu.btonecajqb(selectedTab, "selectedTab");
        zdlpuopuiu.btonecajqb(restaurants, "restaurants");
        zdlpuopuiu.btonecajqb(args, "args");
        return new State(addressData, isLoading, sections, adultDialogWasShown, isRestaurantsEnabled, selectedTab, restaurants, args);
    }

    public /* synthetic */ State(CatalogPagerAddressData catalogPagerAddressData, boolean z13, List list, boolean z14, boolean z15, jp0.iobyxmoadg iobyxmoadgVar, List list2, CatalogArgs catalogArgs, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : catalogPagerAddressData, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? false : z15, (i13 & 32) != 0 ? jp0.iobyxmoadg.Spar : iobyxmoadgVar, (i13 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, catalogArgs);
    }
}
