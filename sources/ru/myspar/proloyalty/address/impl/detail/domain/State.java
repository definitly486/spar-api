package ru.myspar.proloyalty.address.impl.detail.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.address.api.model.AddressDetailScreenMode;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailInputState;
import ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailTypesState;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.detail.domain.AddressDetailStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0092\u0001\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H×\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b1\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010?R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b:\u00109R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b2\u0010J¨\u0006K"}, d2 = {"ru/myspar/proloyalty/address/impl/detail/domain/AddressDetailStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/address/api/model/AddressDetailScreenMode;", "mode", "", "shortAddressText", "fullAddressText", "Lru/myspar/proloyalty/common/models/LocationData;", "addressLocation", "", "isPrivateHouseChecked", "hasGateChecked", "Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;", "inputCustomName", "inputFlat", "inputEntrance", "inputFloor", "inputIntercom", "isLoading", "Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailTypesState;", "typesState", "<init>", "(Lru/myspar/proloyalty/address/api/model/AddressDetailScreenMode;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;ZZLru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;ZLru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailTypesState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/address/impl/detail/domain/AddressDetailStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/address/api/model/AddressDetailScreenMode;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/common/models/LocationData;ZZLru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;ZLru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailTypesState;)Lru/myspar/proloyalty/address/impl/detail/domain/AddressDetailStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/address/api/model/AddressDetailScreenMode;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/address/api/model/AddressDetailScreenMode;", "yggfygwlhe", "Ljava/lang/String;", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Lru/myspar/proloyalty/common/models/LocationData;", "eablkybsjg", "()Lru/myspar/proloyalty/common/models/LocationData;", "cqumvgiudr", "Z", "yadqdtsiqt", "()Z", "esjtqupxsv", "lqeggnwhkg", "lereixgezr", "Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;", "nufgyqmvbu", "()Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;", "pmvmpeiblj", "btonecajqb", "zynmafqrjb", "dxjokdxxww", "istkbnxepw", "gtknphoqwx", "cdpycssgdh", "wflxmlrfwp", "iozdgvuglv", "Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailTypesState;", "()Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailTypesState;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailInputState inputIntercom;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrivateHouseChecked;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasGateChecked;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailTypesState typesState;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailInputState inputFloor;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData addressLocation;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullAddressText;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailInputState inputCustomName;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailInputState inputFlat;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortAddressText;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailScreenMode mode;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressDetailInputState inputEntrance;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.detail.domain.AddressDetailStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            AddressDetailScreenMode addressDetailScreenMode = (AddressDetailScreenMode) parcel.readParcelable(State.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocationData locationData = (LocationData) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            Parcelable.Creator<AddressDetailInputState> creator = AddressDetailInputState.CREATOR;
            return new State(addressDetailScreenMode, string, string2, locationData, z13, z14, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0, AddressDetailTypesState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(AddressDetailScreenMode mode, String shortAddressText, String fullAddressText, LocationData addressLocation, boolean z13, boolean z14, AddressDetailInputState inputCustomName, AddressDetailInputState inputFlat, AddressDetailInputState inputEntrance, AddressDetailInputState inputFloor, AddressDetailInputState inputIntercom, boolean z15, AddressDetailTypesState typesState) {
        zdlpuopuiu.btonecajqb(mode, "mode");
        zdlpuopuiu.btonecajqb(shortAddressText, "shortAddressText");
        zdlpuopuiu.btonecajqb(fullAddressText, "fullAddressText");
        zdlpuopuiu.btonecajqb(addressLocation, "addressLocation");
        zdlpuopuiu.btonecajqb(inputCustomName, "inputCustomName");
        zdlpuopuiu.btonecajqb(inputFlat, "inputFlat");
        zdlpuopuiu.btonecajqb(inputEntrance, "inputEntrance");
        zdlpuopuiu.btonecajqb(inputFloor, "inputFloor");
        zdlpuopuiu.btonecajqb(inputIntercom, "inputIntercom");
        zdlpuopuiu.btonecajqb(typesState, "typesState");
        this.mode = mode;
        this.shortAddressText = shortAddressText;
        this.fullAddressText = fullAddressText;
        this.addressLocation = addressLocation;
        this.isPrivateHouseChecked = z13;
        this.hasGateChecked = z14;
        this.inputCustomName = inputCustomName;
        this.inputFlat = inputFlat;
        this.inputEntrance = inputEntrance;
        this.inputFloor = inputFloor;
        this.inputIntercom = inputIntercom;
        this.isLoading = z15;
        this.typesState = typesState;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final AddressDetailInputState getInputFlat() {
        return this.inputFlat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final AddressDetailInputState getInputEntrance() {
        return this.inputEntrance;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final LocationData getAddressLocation() {
        return this.addressLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.mode, state.mode) && zdlpuopuiu.eablkybsjg(this.shortAddressText, state.shortAddressText) && zdlpuopuiu.eablkybsjg(this.fullAddressText, state.fullAddressText) && zdlpuopuiu.eablkybsjg(this.addressLocation, state.addressLocation) && this.isPrivateHouseChecked == state.isPrivateHouseChecked && this.hasGateChecked == state.hasGateChecked && zdlpuopuiu.eablkybsjg(this.inputCustomName, state.inputCustomName) && zdlpuopuiu.eablkybsjg(this.inputFlat, state.inputFlat) && zdlpuopuiu.eablkybsjg(this.inputEntrance, state.inputEntrance) && zdlpuopuiu.eablkybsjg(this.inputFloor, state.inputFloor) && zdlpuopuiu.eablkybsjg(this.inputIntercom, state.inputIntercom) && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.typesState, state.typesState);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final AddressDetailInputState getInputFloor() {
        return this.inputFloor;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getFullAddressText() {
        return this.fullAddressText;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.mode.hashCode() * 31) + this.shortAddressText.hashCode()) * 31) + this.fullAddressText.hashCode()) * 31) + this.addressLocation.hashCode()) * 31) + Boolean.hashCode(this.isPrivateHouseChecked)) * 31) + Boolean.hashCode(this.hasGateChecked)) * 31) + this.inputCustomName.hashCode()) * 31) + this.inputFlat.hashCode()) * 31) + this.inputEntrance.hashCode()) * 31) + this.inputFloor.hashCode()) * 31) + this.inputIntercom.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.typesState.hashCode();
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final AddressDetailTypesState getTypesState() {
        return this.typesState;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getHasGateChecked() {
        return this.hasGateChecked;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final AddressDetailInputState getInputCustomName() {
        return this.inputCustomName;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final AddressDetailScreenMode getMode() {
        return this.mode;
    }

    public String toString() {
        return "State(mode=" + this.mode + ", shortAddressText=" + this.shortAddressText + ", fullAddressText=" + this.fullAddressText + ", addressLocation=" + this.addressLocation + ", isPrivateHouseChecked=" + this.isPrivateHouseChecked + ", hasGateChecked=" + this.hasGateChecked + ", inputCustomName=" + this.inputCustomName + ", inputFlat=" + this.inputFlat + ", inputEntrance=" + this.inputEntrance + ", inputFloor=" + this.inputFloor + ", inputIntercom=" + this.inputIntercom + ", isLoading=" + this.isLoading + ", typesState=" + this.typesState + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final AddressDetailInputState getInputIntercom() {
        return this.inputIntercom;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.mode, flags);
        dest.writeString(this.shortAddressText);
        dest.writeString(this.fullAddressText);
        dest.writeParcelable(this.addressLocation, flags);
        dest.writeInt(this.isPrivateHouseChecked ? 1 : 0);
        dest.writeInt(this.hasGateChecked ? 1 : 0);
        this.inputCustomName.writeToParcel(dest, flags);
        this.inputFlat.writeToParcel(dest, flags);
        this.inputEntrance.writeToParcel(dest, flags);
        this.inputFloor.writeToParcel(dest, flags);
        this.inputIntercom.writeToParcel(dest, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        this.typesState.writeToParcel(dest, flags);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsPrivateHouseChecked() {
        return this.isPrivateHouseChecked;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getShortAddressText() {
        return this.shortAddressText;
    }

    public final State zoijcleaow(AddressDetailScreenMode mode, String shortAddressText, String fullAddressText, LocationData addressLocation, boolean isPrivateHouseChecked, boolean hasGateChecked, AddressDetailInputState inputCustomName, AddressDetailInputState inputFlat, AddressDetailInputState inputEntrance, AddressDetailInputState inputFloor, AddressDetailInputState inputIntercom, boolean isLoading, AddressDetailTypesState typesState) {
        zdlpuopuiu.btonecajqb(mode, "mode");
        zdlpuopuiu.btonecajqb(shortAddressText, "shortAddressText");
        zdlpuopuiu.btonecajqb(fullAddressText, "fullAddressText");
        zdlpuopuiu.btonecajqb(addressLocation, "addressLocation");
        zdlpuopuiu.btonecajqb(inputCustomName, "inputCustomName");
        zdlpuopuiu.btonecajqb(inputFlat, "inputFlat");
        zdlpuopuiu.btonecajqb(inputEntrance, "inputEntrance");
        zdlpuopuiu.btonecajqb(inputFloor, "inputFloor");
        zdlpuopuiu.btonecajqb(inputIntercom, "inputIntercom");
        zdlpuopuiu.btonecajqb(typesState, "typesState");
        return new State(mode, shortAddressText, fullAddressText, addressLocation, isPrivateHouseChecked, hasGateChecked, inputCustomName, inputFlat, inputEntrance, inputFloor, inputIntercom, isLoading, typesState);
    }

    public /* synthetic */ State(AddressDetailScreenMode addressDetailScreenMode, String str, String str2, LocationData locationData, boolean z13, boolean z14, AddressDetailInputState addressDetailInputState, AddressDetailInputState addressDetailInputState2, AddressDetailInputState addressDetailInputState3, AddressDetailInputState addressDetailInputState4, AddressDetailInputState addressDetailInputState5, boolean z15, AddressDetailTypesState addressDetailTypesState, int i13, gtknphoqwx gtknphoqwxVar) {
        this(addressDetailScreenMode, str, str2, locationData, z13, z14, addressDetailInputState, addressDetailInputState2, addressDetailInputState3, addressDetailInputState4, addressDetailInputState5, (i13 & 2048) != 0 ? false : z15, (i13 & 4096) != 0 ? AddressDetailTypesState.INSTANCE.iobyxmoadg() : addressDetailTypesState);
    }
}
