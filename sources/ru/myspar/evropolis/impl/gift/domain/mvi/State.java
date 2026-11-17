package ru.myspar.evropolis.impl.gift.domain.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.evropolis.api.model.EvropolisGift;

/* JADX INFO: renamed from: ru.myspar.evropolis.impl.gift.domain.mvi.EvropolisDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"ru/myspar/evropolis/impl/gift/domain/mvi/EvropolisDialogStore$State", "Landroid/os/Parcelable;", "Lru/myspar/evropolis/api/model/EvropolisGift;", "gift", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "Lru/myspar/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "selectedTab", "", "isLoading", "<init>", "(Lru/myspar/evropolis/api/model/EvropolisGift;Lru/myspar/core/models/delivery/DeliveryCode;Lru/myspar/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/evropolis/impl/gift/domain/mvi/EvropolisDialogStore$State;", "zoijcleaow", "(Lru/myspar/evropolis/api/model/EvropolisGift;Lru/myspar/core/models/delivery/DeliveryCode;Lru/myspar/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;Z)Lru/myspar/evropolis/impl/gift/domain/mvi/EvropolisDialogStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/evropolis/api/model/EvropolisGift;", "gxszxtbevo", "()Lru/myspar/evropolis/api/model/EvropolisGift;", "yggfygwlhe", "Lru/myspar/core/models/delivery/DeliveryCode;", "eablkybsjg", "()Lru/myspar/core/models/delivery/DeliveryCode;", "jyumaefscl", "Lru/myspar/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "lqeggnwhkg", "()Lru/myspar/evropolis/api/model/EvropolisGift$Tab$zoijcleaow;", "iwizpuwonk", "Z", "nufgyqmvbu", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final EvropolisGift.Tab.zoijcleaow selectedTab;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final EvropolisGift gift;

    /* JADX INFO: renamed from: ru.myspar.evropolis.impl.gift.domain.mvi.EvropolisDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((EvropolisGift) parcel.readParcelable(State.class.getClassLoader()), (DeliveryCode) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? null : EvropolisGift.Tab.zoijcleaow.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(EvropolisGift gift, DeliveryCode deliveryCode, EvropolisGift.Tab.zoijcleaow zoijcleaowVar, boolean z13) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        this.gift = gift;
        this.deliveryCode = deliveryCode;
        this.selectedTab = zoijcleaowVar;
        this.isLoading = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, EvropolisGift evropolisGift, DeliveryCode deliveryCode, EvropolisGift.Tab.zoijcleaow zoijcleaowVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            evropolisGift = state.gift;
        }
        if ((i13 & 2) != 0) {
            deliveryCode = state.deliveryCode;
        }
        if ((i13 & 4) != 0) {
            zoijcleaowVar = state.selectedTab;
        }
        if ((i13 & 8) != 0) {
            z13 = state.isLoading;
        }
        return state.zoijcleaow(evropolisGift, deliveryCode, zoijcleaowVar, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.gift, state.gift) && this.deliveryCode == state.deliveryCode && this.selectedTab == state.selectedTab && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final EvropolisGift getGift() {
        return this.gift;
    }

    public int hashCode() {
        int iHashCode = this.gift.hashCode() * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        EvropolisGift.Tab.zoijcleaow zoijcleaowVar = this.selectedTab;
        return ((iHashCode2 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final EvropolisGift.Tab.zoijcleaow getSelectedTab() {
        return this.selectedTab;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(gift=" + this.gift + ", deliveryCode=" + this.deliveryCode + ", selectedTab=" + this.selectedTab + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.gift, flags);
        dest.writeParcelable(this.deliveryCode, flags);
        EvropolisGift.Tab.zoijcleaow zoijcleaowVar = this.selectedTab;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(EvropolisGift gift, DeliveryCode deliveryCode, EvropolisGift.Tab.zoijcleaow selectedTab, boolean isLoading) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        return new State(gift, deliveryCode, selectedTab, isLoading);
    }

    public /* synthetic */ State(EvropolisGift evropolisGift, DeliveryCode deliveryCode, EvropolisGift.Tab.zoijcleaow zoijcleaowVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(evropolisGift, (i13 & 2) != 0 ? null : deliveryCode, zoijcleaowVar, (i13 & 8) != 0 ? false : z13);
    }
}
