package ru.myspar.proloyalty.activation_card.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.card.domain.model.UserCardData;

/* JADX INFO: renamed from: ru.myspar.proloyalty.activation_card.impl.domain.store.ActivationCardStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'¨\u00060"}, d2 = {"ru/myspar/proloyalty/activation_card/impl/domain/store/ActivationCardStore$State", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", "cardNumber", "", "isNeedActivateCard", "Lru/myspar/proloyalty/card/domain/model/UserCardData;", "userCardData", "isShowConfirmDialog", "isLoading", "<init>", "(Lp0/tzroggbefp;ZLru/myspar/proloyalty/card/domain/model/UserCardData;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/activation_card/impl/domain/store/ActivationCardStore$State;", "zoijcleaow", "(Lp0/tzroggbefp;ZLru/myspar/proloyalty/card/domain/model/UserCardData;ZZ)Lru/myspar/proloyalty/activation_card/impl/domain/store/ActivationCardStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "eablkybsjg", "()Lp0/tzroggbefp;", "yggfygwlhe", "Z", "nufgyqmvbu", "()Z", "jyumaefscl", "Lru/myspar/proloyalty/card/domain/model/UserCardData;", "gxszxtbevo", "()Lru/myspar/proloyalty/card/domain/model/UserCardData;", "iwizpuwonk", "dxjokdxxww", "cqumvgiudr", "lqeggnwhkg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowConfirmDialog;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserCardData userCardData;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedActivateCard;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp cardNumber;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.activation_card.impl.domain.store.ActivationCardStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(yr0.iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() != 0, (UserCardData) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(tzroggbefp cardNumber, boolean z13, UserCardData userCardData, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        this.cardNumber = cardNumber;
        this.isNeedActivateCard = z13;
        this.userCardData = userCardData;
        this.isShowConfirmDialog = z14;
        this.isLoading = z15;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, tzroggbefp tzroggbefpVar, boolean z13, UserCardData userCardData, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tzroggbefpVar = state.cardNumber;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isNeedActivateCard;
        }
        boolean z16 = z13;
        if ((i13 & 4) != 0) {
            userCardData = state.userCardData;
        }
        UserCardData userCardData2 = userCardData;
        if ((i13 & 8) != 0) {
            z14 = state.isShowConfirmDialog;
        }
        boolean z17 = z14;
        if ((i13 & 16) != 0) {
            z15 = state.isLoading;
        }
        return state.zoijcleaow(tzroggbefpVar, z16, userCardData2, z17, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsShowConfirmDialog() {
        return this.isShowConfirmDialog;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final tzroggbefp getCardNumber() {
        return this.cardNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.cardNumber, state.cardNumber) && this.isNeedActivateCard == state.isNeedActivateCard && zdlpuopuiu.eablkybsjg(this.userCardData, state.userCardData) && this.isShowConfirmDialog == state.isShowConfirmDialog && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final UserCardData getUserCardData() {
        return this.userCardData;
    }

    public int hashCode() {
        int iHashCode = ((this.cardNumber.hashCode() * 31) + Boolean.hashCode(this.isNeedActivateCard)) * 31;
        UserCardData userCardData = this.userCardData;
        return ((((iHashCode + (userCardData == null ? 0 : userCardData.hashCode())) * 31) + Boolean.hashCode(this.isShowConfirmDialog)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsNeedActivateCard() {
        return this.isNeedActivateCard;
    }

    public String toString() {
        return "State(cardNumber=" + this.cardNumber + ", isNeedActivateCard=" + this.isNeedActivateCard + ", userCardData=" + this.userCardData + ", isShowConfirmDialog=" + this.isShowConfirmDialog + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        yr0.iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.cardNumber, dest, flags);
        dest.writeInt(this.isNeedActivateCard ? 1 : 0);
        dest.writeParcelable(this.userCardData, flags);
        dest.writeInt(this.isShowConfirmDialog ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(tzroggbefp cardNumber, boolean isNeedActivateCard, UserCardData userCardData, boolean isShowConfirmDialog, boolean isLoading) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        return new State(cardNumber, isNeedActivateCard, userCardData, isShowConfirmDialog, isLoading);
    }

    public /* synthetic */ State(tzroggbefp tzroggbefpVar, boolean z13, UserCardData userCardData, boolean z14, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : userCardData, (i13 & 8) == 0 ? z14 : false, (i13 & 16) != 0 ? true : z15);
    }
}
