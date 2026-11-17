package ru.myspar.address.impl.map.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.address.api.model.AddressMapScreenFlow;
import ru.myspar.address.impl.map.domain.models.AddressMapCameraState;
import ru.myspar.address.impl.map.domain.models.AddressMapShop;
import ru.myspar.common.models.LocationData;

/* JADX INFO: renamed from: ru.myspar.address.impl.map.domain.AddressMapStore$State, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H×\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b&\u0010\u001fJ\u001a\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H×\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\b/\u0010:R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010:¨\u0006N"}, d2 = {"ru/myspar/address/impl/map/domain/AddressMapStore$State", "Landroid/os/Parcelable;", "Lru/myspar/address/api/model/AddressMapScreenFlow;", "currentFlow", "Lrm/iobyxmoadg;", "mode", "Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;", "mapCameraState", "", "isAddressTypeSelectionEnabled", "Lru/myspar/address/api/model/AddressMapScreenFlow$Delivery;", "deliveryFlow", "Lru/myspar/address/api/model/AddressMapScreenFlow$PickUp;", "pickUpFlow", "Lru/myspar/common/models/LocationData;", "userLocation", "", "Lru/myspar/address/impl/map/domain/models/AddressMapShop;", "pickUpShopList", "isNeededShowAddressShimmer", "isLoading", "<init>", "(Lru/myspar/address/api/model/AddressMapScreenFlow;Lrm/iobyxmoadg;Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;ZLru/myspar/address/api/model/AddressMapScreenFlow$Delivery;Lru/myspar/address/api/model/AddressMapScreenFlow$PickUp;Lru/myspar/common/models/LocationData;Ljava/util/List;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/address/impl/map/domain/AddressMapStore$State;", "zoijcleaow", "(Lru/myspar/address/api/model/AddressMapScreenFlow;Lrm/iobyxmoadg;Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;ZLru/myspar/address/api/model/AddressMapScreenFlow$Delivery;Lru/myspar/address/api/model/AddressMapScreenFlow$PickUp;Lru/myspar/common/models/LocationData;Ljava/util/List;ZZ)Lru/myspar/address/impl/map/domain/AddressMapStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/address/api/model/AddressMapScreenFlow;", "eablkybsjg", "()Lru/myspar/address/api/model/AddressMapScreenFlow;", "yggfygwlhe", "Lrm/iobyxmoadg;", "nufgyqmvbu", "()Lrm/iobyxmoadg;", "jyumaefscl", "Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;", "lqeggnwhkg", "()Lru/myspar/address/impl/map/domain/models/AddressMapCameraState;", "iwizpuwonk", "Z", "wflxmlrfwp", "()Z", "cqumvgiudr", "Lru/myspar/address/api/model/AddressMapScreenFlow$Delivery;", "gxszxtbevo", "()Lru/myspar/address/api/model/AddressMapScreenFlow$Delivery;", "esjtqupxsv", "Lru/myspar/address/api/model/AddressMapScreenFlow$PickUp;", "dxjokdxxww", "()Lru/myspar/address/api/model/AddressMapScreenFlow$PickUp;", "lereixgezr", "Lru/myspar/common/models/LocationData;", "gtknphoqwx", "()Lru/myspar/common/models/LocationData;", "pmvmpeiblj", "Ljava/util/List;", "btonecajqb", "()Ljava/util/List;", "zynmafqrjb", "istkbnxepw", "oxmwwwfdhm", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressMapScreenFlow.Delivery deliveryFlow;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressMapScreenFlow.PickUp pickUpFlow;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddressTypeSelectionEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressMapCameraState mapCameraState;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData userLocation;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List pickUpShopList;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final rm.iobyxmoadg mode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressMapScreenFlow currentFlow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeededShowAddressShimmer;

    /* JADX INFO: renamed from: ru.myspar.address.impl.map.domain.AddressMapStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            AddressMapScreenFlow addressMapScreenFlow = (AddressMapScreenFlow) parcel.readParcelable(State.class.getClassLoader());
            rm.iobyxmoadg iobyxmoadgVarValueOf = rm.iobyxmoadg.valueOf(parcel.readString());
            AddressMapCameraState addressMapCameraStateCreateFromParcel = AddressMapCameraState.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            AddressMapScreenFlow.Delivery delivery = (AddressMapScreenFlow.Delivery) parcel.readParcelable(State.class.getClassLoader());
            AddressMapScreenFlow.PickUp pickUp = (AddressMapScreenFlow.PickUp) parcel.readParcelable(State.class.getClassLoader());
            LocationData locationData = (LocationData) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(AddressMapShop.CREATOR.createFromParcel(parcel));
            }
            return new State(addressMapScreenFlow, iobyxmoadgVarValueOf, addressMapCameraStateCreateFromParcel, z13, delivery, pickUp, locationData, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(AddressMapScreenFlow currentFlow, rm.iobyxmoadg mode, AddressMapCameraState mapCameraState, boolean z13, AddressMapScreenFlow.Delivery deliveryFlow, AddressMapScreenFlow.PickUp pickUpFlow, LocationData locationData, List pickUpShopList, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(currentFlow, "currentFlow");
        zdlpuopuiu.btonecajqb(mode, "mode");
        zdlpuopuiu.btonecajqb(mapCameraState, "mapCameraState");
        zdlpuopuiu.btonecajqb(deliveryFlow, "deliveryFlow");
        zdlpuopuiu.btonecajqb(pickUpFlow, "pickUpFlow");
        zdlpuopuiu.btonecajqb(pickUpShopList, "pickUpShopList");
        this.currentFlow = currentFlow;
        this.mode = mode;
        this.mapCameraState = mapCameraState;
        this.isAddressTypeSelectionEnabled = z13;
        this.deliveryFlow = deliveryFlow;
        this.pickUpFlow = pickUpFlow;
        this.userLocation = locationData;
        this.pickUpShopList = pickUpShopList;
        this.isNeededShowAddressShimmer = z14;
        this.isLoading = z15;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getPickUpShopList() {
        return this.pickUpShopList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final AddressMapScreenFlow.PickUp getPickUpFlow() {
        return this.pickUpFlow;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final AddressMapScreenFlow getCurrentFlow() {
        return this.currentFlow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.currentFlow, state.currentFlow) && this.mode == state.mode && zdlpuopuiu.eablkybsjg(this.mapCameraState, state.mapCameraState) && this.isAddressTypeSelectionEnabled == state.isAddressTypeSelectionEnabled && zdlpuopuiu.eablkybsjg(this.deliveryFlow, state.deliveryFlow) && zdlpuopuiu.eablkybsjg(this.pickUpFlow, state.pickUpFlow) && zdlpuopuiu.eablkybsjg(this.userLocation, state.userLocation) && zdlpuopuiu.eablkybsjg(this.pickUpShopList, state.pickUpShopList) && this.isNeededShowAddressShimmer == state.isNeededShowAddressShimmer && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final LocationData getUserLocation() {
        return this.userLocation;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final AddressMapScreenFlow.Delivery getDeliveryFlow() {
        return this.deliveryFlow;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.currentFlow.hashCode() * 31) + this.mode.hashCode()) * 31) + this.mapCameraState.hashCode()) * 31) + Boolean.hashCode(this.isAddressTypeSelectionEnabled)) * 31) + this.deliveryFlow.hashCode()) * 31) + this.pickUpFlow.hashCode()) * 31;
        LocationData locationData = this.userLocation;
        return ((((((iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31) + this.pickUpShopList.hashCode()) * 31) + Boolean.hashCode(this.isNeededShowAddressShimmer)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final AddressMapCameraState getMapCameraState() {
        return this.mapCameraState;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final rm.iobyxmoadg getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(currentFlow=" + this.currentFlow + ", mode=" + this.mode + ", mapCameraState=" + this.mapCameraState + ", isAddressTypeSelectionEnabled=" + this.isAddressTypeSelectionEnabled + ", deliveryFlow=" + this.deliveryFlow + ", pickUpFlow=" + this.pickUpFlow + ", userLocation=" + this.userLocation + ", pickUpShopList=" + this.pickUpShopList + ", isNeededShowAddressShimmer=" + this.isNeededShowAddressShimmer + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsAddressTypeSelectionEnabled() {
        return this.isAddressTypeSelectionEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.currentFlow, flags);
        dest.writeString(this.mode.name());
        this.mapCameraState.writeToParcel(dest, flags);
        dest.writeInt(this.isAddressTypeSelectionEnabled ? 1 : 0);
        dest.writeParcelable(this.deliveryFlow, flags);
        dest.writeParcelable(this.pickUpFlow, flags);
        dest.writeParcelable(this.userLocation, flags);
        List list = this.pickUpShopList;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AddressMapShop) it.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.isNeededShowAddressShimmer ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsNeededShowAddressShimmer() {
        return this.isNeededShowAddressShimmer;
    }

    public final State zoijcleaow(AddressMapScreenFlow currentFlow, rm.iobyxmoadg mode, AddressMapCameraState mapCameraState, boolean isAddressTypeSelectionEnabled, AddressMapScreenFlow.Delivery deliveryFlow, AddressMapScreenFlow.PickUp pickUpFlow, LocationData userLocation, List pickUpShopList, boolean isNeededShowAddressShimmer, boolean isLoading) {
        zdlpuopuiu.btonecajqb(currentFlow, "currentFlow");
        zdlpuopuiu.btonecajqb(mode, "mode");
        zdlpuopuiu.btonecajqb(mapCameraState, "mapCameraState");
        zdlpuopuiu.btonecajqb(deliveryFlow, "deliveryFlow");
        zdlpuopuiu.btonecajqb(pickUpFlow, "pickUpFlow");
        zdlpuopuiu.btonecajqb(pickUpShopList, "pickUpShopList");
        return new State(currentFlow, mode, mapCameraState, isAddressTypeSelectionEnabled, deliveryFlow, pickUpFlow, userLocation, pickUpShopList, isNeededShowAddressShimmer, isLoading);
    }

    public /* synthetic */ State(AddressMapScreenFlow addressMapScreenFlow, rm.iobyxmoadg iobyxmoadgVar, AddressMapCameraState addressMapCameraState, boolean z13, AddressMapScreenFlow.Delivery delivery, AddressMapScreenFlow.PickUp pickUp, LocationData locationData, List list, boolean z14, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this(addressMapScreenFlow, iobyxmoadgVar, addressMapCameraState, z13, (i13 & 16) != 0 ? AddressMapScreenFlow.INSTANCE.iobyxmoadg() : delivery, (i13 & 32) != 0 ? AddressMapScreenFlow.INSTANCE.zoijcleaow() : pickUp, (i13 & 64) != 0 ? null : locationData, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? true : z14, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z15);
    }
}
