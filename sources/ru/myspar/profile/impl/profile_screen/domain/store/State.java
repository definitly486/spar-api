package ru.myspar.profile.impl.profile_screen.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserState;

/* JADX INFO: renamed from: ru.myspar.profile.impl.profile_screen.domain.store.ProfileStore$State, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006-"}, d2 = {"ru/myspar/profile/impl/profile_screen/domain/store/ProfileStore$State", "Landroid/os/Parcelable;", "", "isLoading", "Lru/myspar/user/models/UserState;", "userState", "isMyDiscountEnabled", "isSavedCardsEnabled", "isPurchasesListEnabled", "<init>", "(ZLru/myspar/user/models/UserState;ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/profile/impl/profile_screen/domain/store/ProfileStore$State;", "zoijcleaow", "(ZLru/myspar/user/models/UserState;ZZZ)Lru/myspar/profile/impl/profile_screen/domain/store/ProfileStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "gxszxtbevo", "()Z", "yggfygwlhe", "Lru/myspar/user/models/UserState;", "eablkybsjg", "()Lru/myspar/user/models/UserState;", "jyumaefscl", "lqeggnwhkg", "iwizpuwonk", "dxjokdxxww", "cqumvgiudr", "nufgyqmvbu", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchasesListEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSavedCardsEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMyDiscountEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserState userState;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.profile.impl.profile_screen.domain.store.ProfileStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, (UserState) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, UserState userState, boolean z14, boolean z15, boolean z16) {
        this.isLoading = z13;
        this.userState = userState;
        this.isMyDiscountEnabled = z14;
        this.isSavedCardsEnabled = z15;
        this.isPurchasesListEnabled = z16;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, UserState userState, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            userState = state.userState;
        }
        UserState userState2 = userState;
        if ((i13 & 4) != 0) {
            z14 = state.isMyDiscountEnabled;
        }
        boolean z17 = z14;
        if ((i13 & 8) != 0) {
            z15 = state.isSavedCardsEnabled;
        }
        boolean z18 = z15;
        if ((i13 & 16) != 0) {
            z16 = state.isPurchasesListEnabled;
        }
        return state.zoijcleaow(z13, userState2, z17, z18, z16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsSavedCardsEnabled() {
        return this.isSavedCardsEnabled;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final UserState getUserState() {
        return this.userState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.userState, state.userState) && this.isMyDiscountEnabled == state.isMyDiscountEnabled && this.isSavedCardsEnabled == state.isSavedCardsEnabled && this.isPurchasesListEnabled == state.isPurchasesListEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UserState userState = this.userState;
        return ((((((iHashCode + (userState == null ? 0 : userState.hashCode())) * 31) + Boolean.hashCode(this.isMyDiscountEnabled)) * 31) + Boolean.hashCode(this.isSavedCardsEnabled)) * 31) + Boolean.hashCode(this.isPurchasesListEnabled);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsMyDiscountEnabled() {
        return this.isMyDiscountEnabled;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsPurchasesListEnabled() {
        return this.isPurchasesListEnabled;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", userState=" + this.userState + ", isMyDiscountEnabled=" + this.isMyDiscountEnabled + ", isSavedCardsEnabled=" + this.isSavedCardsEnabled + ", isPurchasesListEnabled=" + this.isPurchasesListEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.userState, flags);
        dest.writeInt(this.isMyDiscountEnabled ? 1 : 0);
        dest.writeInt(this.isSavedCardsEnabled ? 1 : 0);
        dest.writeInt(this.isPurchasesListEnabled ? 1 : 0);
    }

    public final State zoijcleaow(boolean isLoading, UserState userState, boolean isMyDiscountEnabled, boolean isSavedCardsEnabled, boolean isPurchasesListEnabled) {
        return new State(isLoading, userState, isMyDiscountEnabled, isSavedCardsEnabled, isPurchasesListEnabled);
    }

    public /* synthetic */ State(boolean z13, UserState userState, boolean z14, boolean z15, boolean z16, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? null : userState, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? false : z16);
    }
}
