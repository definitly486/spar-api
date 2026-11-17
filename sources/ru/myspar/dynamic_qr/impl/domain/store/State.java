package ru.myspar.dynamic_qr.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserCard;

/* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.domain.store.DynamicQrCodeStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u0004\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"ru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$State", "Landroid/os/Parcelable;", "", "isLoading", "isManuallyOpened", "Lru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrCodeType;", "qrcodeType", "Lru/myspar/user/models/UserCard;", "userCard", "<init>", "(ZZLru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrCodeType;Lru/myspar/user/models/UserCard;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$State;", "zoijcleaow", "(ZZLru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrCodeType;Lru/myspar/user/models/UserCard;)Lru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "lqeggnwhkg", "()Z", "yggfygwlhe", "jyumaefscl", "Lru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrCodeType;", "eablkybsjg", "()Lru/myspar/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrCodeType;", "iwizpuwonk", "Lru/myspar/user/models/UserCard;", "gxszxtbevo", "()Lru/myspar/user/models/UserCard;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserCard userCard;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final DynamicQrCodeStore$QrCodeType qrcodeType;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isManuallyOpened;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.dynamic_qr.impl.domain.store.DynamicQrCodeStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readInt() != 0, (DynamicQrCodeStore$QrCodeType) parcel.readParcelable(State.class.getClassLoader()), (UserCard) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, boolean z14, DynamicQrCodeStore$QrCodeType dynamicQrCodeStore$QrCodeType, UserCard userCard) {
        this.isLoading = z13;
        this.isManuallyOpened = z14;
        this.qrcodeType = dynamicQrCodeStore$QrCodeType;
        this.userCard = userCard;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, boolean z14, DynamicQrCodeStore$QrCodeType dynamicQrCodeStore$QrCodeType, UserCard userCard, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            z14 = state.isManuallyOpened;
        }
        if ((i13 & 4) != 0) {
            dynamicQrCodeStore$QrCodeType = state.qrcodeType;
        }
        if ((i13 & 8) != 0) {
            userCard = state.userCard;
        }
        return state.zoijcleaow(z13, z14, dynamicQrCodeStore$QrCodeType, userCard);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final DynamicQrCodeStore$QrCodeType getQrcodeType() {
        return this.qrcodeType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && this.isManuallyOpened == state.isManuallyOpened && zdlpuopuiu.eablkybsjg(this.qrcodeType, state.qrcodeType) && zdlpuopuiu.eablkybsjg(this.userCard, state.userCard);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final UserCard getUserCard() {
        return this.userCard;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isManuallyOpened)) * 31;
        DynamicQrCodeStore$QrCodeType dynamicQrCodeStore$QrCodeType = this.qrcodeType;
        int iHashCode2 = (iHashCode + (dynamicQrCodeStore$QrCodeType == null ? 0 : dynamicQrCodeStore$QrCodeType.hashCode())) * 31;
        UserCard userCard = this.userCard;
        return iHashCode2 + (userCard != null ? userCard.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", isManuallyOpened=" + this.isManuallyOpened + ", qrcodeType=" + this.qrcodeType + ", userCard=" + this.userCard + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isManuallyOpened ? 1 : 0);
        dest.writeParcelable(this.qrcodeType, flags);
        dest.writeParcelable(this.userCard, flags);
    }

    public final State zoijcleaow(boolean isLoading, boolean isManuallyOpened, DynamicQrCodeStore$QrCodeType qrcodeType, UserCard userCard) {
        return new State(isLoading, isManuallyOpened, qrcodeType, userCard);
    }
}
