package ru.myspar.proloyalty.dynamic_qr.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalance;

/* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.DynamicQrCodeStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006-"}, d2 = {"ru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$State", "Landroid/os/Parcelable;", "", "isLoading", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;", "qrType", "Lru/myspar/proloyalty/card/domain/model/UserBalance;", "userBalance", "hasActiveDiscount", "<init>", "(ZLru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;Lru/myspar/proloyalty/card/domain/model/UserBalance;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$State;", "zoijcleaow", "(ZLru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;Lru/myspar/proloyalty/card/domain/model/UserBalance;Z)Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "nufgyqmvbu", "()Z", "yggfygwlhe", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;", "gxszxtbevo", "()Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;", "jyumaefscl", "Lru/myspar/proloyalty/card/domain/model/UserBalance;", "lqeggnwhkg", "()Lru/myspar/proloyalty/card/domain/model/UserBalance;", "iwizpuwonk", "eablkybsjg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasActiveDiscount;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserBalance userBalance;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicQrCodeStore$QrType qrType;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.dynamic_qr.impl.domain.store.DynamicQrCodeStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, (DynamicQrCodeStore$QrType) parcel.readParcelable(State.class.getClassLoader()), (UserBalance) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, DynamicQrCodeStore$QrType dynamicQrCodeStore$QrType, UserBalance userBalance, boolean z14) {
        this.isLoading = z13;
        this.qrType = dynamicQrCodeStore$QrType;
        this.userBalance = userBalance;
        this.hasActiveDiscount = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, DynamicQrCodeStore$QrType dynamicQrCodeStore$QrType, UserBalance userBalance, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            dynamicQrCodeStore$QrType = state.qrType;
        }
        if ((i13 & 4) != 0) {
            userBalance = state.userBalance;
        }
        if ((i13 & 8) != 0) {
            z14 = state.hasActiveDiscount;
        }
        return state.zoijcleaow(z13, dynamicQrCodeStore$QrType, userBalance, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getHasActiveDiscount() {
        return this.hasActiveDiscount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.qrType, state.qrType) && zdlpuopuiu.eablkybsjg(this.userBalance, state.userBalance) && this.hasActiveDiscount == state.hasActiveDiscount;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final DynamicQrCodeStore$QrType getQrType() {
        return this.qrType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        DynamicQrCodeStore$QrType dynamicQrCodeStore$QrType = this.qrType;
        int iHashCode2 = (iHashCode + (dynamicQrCodeStore$QrType == null ? 0 : dynamicQrCodeStore$QrType.hashCode())) * 31;
        UserBalance userBalance = this.userBalance;
        return ((iHashCode2 + (userBalance != null ? userBalance.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasActiveDiscount);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final UserBalance getUserBalance() {
        return this.userBalance;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", qrType=" + this.qrType + ", userBalance=" + this.userBalance + ", hasActiveDiscount=" + this.hasActiveDiscount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.qrType, flags);
        dest.writeParcelable(this.userBalance, flags);
        dest.writeInt(this.hasActiveDiscount ? 1 : 0);
    }

    public final State zoijcleaow(boolean isLoading, DynamicQrCodeStore$QrType qrType, UserBalance userBalance, boolean hasActiveDiscount) {
        return new State(isLoading, qrType, userBalance, hasActiveDiscount);
    }

    public /* synthetic */ State(boolean z13, DynamicQrCodeStore$QrType dynamicQrCodeStore$QrType, UserBalance userBalance, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? null : dynamicQrCodeStore$QrType, (i13 & 4) != 0 ? null : userBalance, (i13 & 8) != 0 ? false : z14);
    }
}
