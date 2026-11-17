package ru.myspar.proloyalty.profile.impl.profile_screen.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.user.domain.model.UserNews;

/* JADX INFO: renamed from: ru.myspar.proloyalty.profile.impl.profile_screen.domain.store.ProfileStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$¨\u00063"}, d2 = {"ru/myspar/proloyalty/profile/impl/profile_screen/domain/store/ProfileStore$State", "Landroid/os/Parcelable;", "", "isLoading", "Lru/myspar/proloyalty/card/domain/model/UserBalance;", "balance", "Lru/myspar/proloyalty/user/domain/model/UserNews;", "news", "isMyDiscountEnabled", "isSavedCardsEnabled", "isPurchasesListEnabled", "<init>", "(ZLru/myspar/proloyalty/card/domain/model/UserBalance;Lru/myspar/proloyalty/user/domain/model/UserNews;ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/profile/impl/profile_screen/domain/store/ProfileStore$State;", "zoijcleaow", "(ZLru/myspar/proloyalty/card/domain/model/UserBalance;Lru/myspar/proloyalty/user/domain/model/UserNews;ZZZ)Lru/myspar/proloyalty/profile/impl/profile_screen/domain/store/ProfileStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "lqeggnwhkg", "()Z", "yggfygwlhe", "Lru/myspar/proloyalty/card/domain/model/UserBalance;", "eablkybsjg", "()Lru/myspar/proloyalty/card/domain/model/UserBalance;", "jyumaefscl", "Lru/myspar/proloyalty/user/domain/model/UserNews;", "gxszxtbevo", "()Lru/myspar/proloyalty/user/domain/model/UserNews;", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "btonecajqb", "esjtqupxsv", "dxjokdxxww", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSavedCardsEnabled;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchasesListEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMyDiscountEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserNews news;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserBalance balance;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.profile.impl.profile_screen.domain.store.ProfileStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, (UserBalance) parcel.readParcelable(State.class.getClassLoader()), (UserNews) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, UserBalance userBalance, UserNews userNews, boolean z14, boolean z15, boolean z16) {
        this.isLoading = z13;
        this.balance = userBalance;
        this.news = userNews;
        this.isMyDiscountEnabled = z14;
        this.isSavedCardsEnabled = z15;
        this.isPurchasesListEnabled = z16;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, UserBalance userBalance, UserNews userNews, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            userBalance = state.balance;
        }
        UserBalance userBalance2 = userBalance;
        if ((i13 & 4) != 0) {
            userNews = state.news;
        }
        UserNews userNews2 = userNews;
        if ((i13 & 8) != 0) {
            z14 = state.isMyDiscountEnabled;
        }
        boolean z17 = z14;
        if ((i13 & 16) != 0) {
            z15 = state.isSavedCardsEnabled;
        }
        boolean z18 = z15;
        if ((i13 & 32) != 0) {
            z16 = state.isPurchasesListEnabled;
        }
        return state.zoijcleaow(z13, userBalance2, userNews2, z17, z18, z16);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsSavedCardsEnabled() {
        return this.isSavedCardsEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsPurchasesListEnabled() {
        return this.isPurchasesListEnabled;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final UserBalance getBalance() {
        return this.balance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.balance, state.balance) && zdlpuopuiu.eablkybsjg(this.news, state.news) && this.isMyDiscountEnabled == state.isMyDiscountEnabled && this.isSavedCardsEnabled == state.isSavedCardsEnabled && this.isPurchasesListEnabled == state.isPurchasesListEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final UserNews getNews() {
        return this.news;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UserBalance userBalance = this.balance;
        int iHashCode2 = (iHashCode + (userBalance == null ? 0 : userBalance.hashCode())) * 31;
        UserNews userNews = this.news;
        return ((((((iHashCode2 + (userNews != null ? userNews.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMyDiscountEnabled)) * 31) + Boolean.hashCode(this.isSavedCardsEnabled)) * 31) + Boolean.hashCode(this.isPurchasesListEnabled);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsMyDiscountEnabled() {
        return this.isMyDiscountEnabled;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", balance=" + this.balance + ", news=" + this.news + ", isMyDiscountEnabled=" + this.isMyDiscountEnabled + ", isSavedCardsEnabled=" + this.isSavedCardsEnabled + ", isPurchasesListEnabled=" + this.isPurchasesListEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.balance, flags);
        dest.writeParcelable(this.news, flags);
        dest.writeInt(this.isMyDiscountEnabled ? 1 : 0);
        dest.writeInt(this.isSavedCardsEnabled ? 1 : 0);
        dest.writeInt(this.isPurchasesListEnabled ? 1 : 0);
    }

    public final State zoijcleaow(boolean isLoading, UserBalance balance, UserNews news, boolean isMyDiscountEnabled, boolean isSavedCardsEnabled, boolean isPurchasesListEnabled) {
        return new State(isLoading, balance, news, isMyDiscountEnabled, isSavedCardsEnabled, isPurchasesListEnabled);
    }

    public /* synthetic */ State(boolean z13, UserBalance userBalance, UserNews userNews, boolean z14, boolean z15, boolean z16, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? null : userBalance, (i13 & 4) == 0 ? userNews : null, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? false : z15, (i13 & 32) != 0 ? false : z16);
    }
}
