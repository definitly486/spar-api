package ru.myspar.domain.feature.promocatalog.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: renamed from: ru.myspar.domain.feature.promocatalog.store.PromotionCatalogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 ¨\u0006'"}, d2 = {"ru/myspar/domain/feature/promocatalog/store/PromotionCatalogStore$State", "Landroid/os/Parcelable;", "", "isLoggedIn", "Lru/myspar/core/domain/models/promo/Promotion;", "promoModel", "isLoading", "<init>", "(ZLru/myspar/core/domain/models/promo/Promotion;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/promocatalog/store/PromotionCatalogStore$State;", "zoijcleaow", "(ZLru/myspar/core/domain/models/promo/Promotion;Z)Lru/myspar/domain/feature/promocatalog/store/PromotionCatalogStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "lqeggnwhkg", "()Z", "yggfygwlhe", "Lru/myspar/core/domain/models/promo/Promotion;", "eablkybsjg", "()Lru/myspar/core/domain/models/promo/Promotion;", "jyumaefscl", "gxszxtbevo", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promotion promoModel;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoggedIn;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.promocatalog.store.PromotionCatalogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, (Promotion) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, Promotion promoModel, boolean z14) {
        zdlpuopuiu.btonecajqb(promoModel, "promoModel");
        this.isLoggedIn = z13;
        this.promoModel = promoModel;
        this.isLoading = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, Promotion promotion, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoggedIn;
        }
        if ((i13 & 2) != 0) {
            promotion = state.promoModel;
        }
        if ((i13 & 4) != 0) {
            z14 = state.isLoading;
        }
        return state.zoijcleaow(z13, promotion, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Promotion getPromoModel() {
        return this.promoModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoggedIn == state.isLoggedIn && zdlpuopuiu.eablkybsjg(this.promoModel, state.promoModel) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoggedIn) * 31) + this.promoModel.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public String toString() {
        return "State(isLoggedIn=" + this.isLoggedIn + ", promoModel=" + this.promoModel + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoggedIn ? 1 : 0);
        dest.writeParcelable(this.promoModel, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(boolean isLoggedIn, Promotion promoModel, boolean isLoading) {
        zdlpuopuiu.btonecajqb(promoModel, "promoModel");
        return new State(isLoggedIn, promoModel, isLoading);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ State(boolean z13, Promotion promotion, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        boolean z15 = false;
        boolean z16 = (i13 & 1) != 0 ? false : z13;
        Promotion promotion2 = (i13 & 2) != 0 ? new Promotion(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 33554431, null) : promotion;
        if ((i13 & 4) == 0) {
            z15 = z14;
        }
        this(z16, promotion2, z15);
    }
}
