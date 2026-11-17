package ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store.RestaurantDescriptionDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"ru/myspar/proloyalty/domain/feature/restaurantdescriptiondialog/store/RestaurantDescriptionDialogStore$State", "Landroid/os/Parcelable;", "", "deliveryPrice", "", "deliveryTime", "workingHours", "address", "", "isLoading", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/domain/feature/restaurantdescriptiondialog/store/RestaurantDescriptionDialogStore$State;", "zoijcleaow", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/myspar/proloyalty/domain/feature/restaurantdescriptiondialog/store/RestaurantDescriptionDialogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "D", "gxszxtbevo", "()D", "yggfygwlhe", "Ljava/lang/String;", "lqeggnwhkg", "jyumaefscl", "nufgyqmvbu", "iwizpuwonk", "eablkybsjg", "cqumvgiudr", "Z", "dxjokdxxww", "()Z", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String workingHours;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryTime;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final double deliveryPrice;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store.RestaurantDescriptionDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(double d13, String deliveryTime, String workingHours, String address, boolean z13) {
        zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
        zdlpuopuiu.btonecajqb(workingHours, "workingHours");
        zdlpuopuiu.btonecajqb(address, "address");
        this.deliveryPrice = d13;
        this.deliveryTime = deliveryTime;
        this.workingHours = workingHours;
        this.address = address;
        this.isLoading = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, double d13, String str, String str2, String str3, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d13 = state.deliveryPrice;
        }
        double d14 = d13;
        if ((i13 & 2) != 0) {
            str = state.deliveryTime;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            str2 = state.workingHours;
        }
        String str5 = str2;
        if ((i13 & 8) != 0) {
            str3 = state.address;
        }
        String str6 = str3;
        if ((i13 & 16) != 0) {
            z13 = state.isLoading;
        }
        return state.zoijcleaow(d14, str4, str5, str6, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return Double.compare(this.deliveryPrice, state.deliveryPrice) == 0 && zdlpuopuiu.eablkybsjg(this.deliveryTime, state.deliveryTime) && zdlpuopuiu.eablkybsjg(this.workingHours, state.workingHours) && zdlpuopuiu.eablkybsjg(this.address, state.address) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final double getDeliveryPrice() {
        return this.deliveryPrice;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.deliveryPrice) * 31) + this.deliveryTime.hashCode()) * 31) + this.workingHours.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getDeliveryTime() {
        return this.deliveryTime;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getWorkingHours() {
        return this.workingHours;
    }

    public String toString() {
        return "State(deliveryPrice=" + this.deliveryPrice + ", deliveryTime=" + this.deliveryTime + ", workingHours=" + this.workingHours + ", address=" + this.address + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeDouble(this.deliveryPrice);
        dest.writeString(this.deliveryTime);
        dest.writeString(this.workingHours);
        dest.writeString(this.address);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(double deliveryPrice, String deliveryTime, String workingHours, String address, boolean isLoading) {
        zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
        zdlpuopuiu.btonecajqb(workingHours, "workingHours");
        zdlpuopuiu.btonecajqb(address, "address");
        return new State(deliveryPrice, deliveryTime, workingHours, address, isLoading);
    }

    public /* synthetic */ State(double d13, String str, String str2, String str3, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 0.0d : d13, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? false : z13);
    }
}
