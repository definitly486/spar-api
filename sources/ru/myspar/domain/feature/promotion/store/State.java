package ru.myspar.domain.feature.promotion.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: renamed from: ru.myspar.domain.feature.promotion.store.PromotionStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'¨\u00061"}, d2 = {"ru/myspar/domain/feature/promotion/store/PromotionStore$State", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/promo/Promotion;", "promotion", "", "isLoggedIn", "Lru/myspar/core/domain/models/promo/Promotion$zoijcleaow;", "type", "", "selectedItemId", "isLoading", "<init>", "(Lru/myspar/core/domain/models/promo/Promotion;ZLru/myspar/core/domain/models/promo/Promotion$zoijcleaow;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/promotion/store/PromotionStore$State;", "zoijcleaow", "(Lru/myspar/core/domain/models/promo/Promotion;ZLru/myspar/core/domain/models/promo/Promotion$zoijcleaow;Ljava/lang/String;Z)Lru/myspar/domain/feature/promotion/store/PromotionStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/promo/Promotion;", "eablkybsjg", "()Lru/myspar/core/domain/models/promo/Promotion;", "yggfygwlhe", "Z", "dxjokdxxww", "()Z", "jyumaefscl", "Lru/myspar/core/domain/models/promo/Promotion$zoijcleaow;", "lqeggnwhkg", "()Lru/myspar/core/domain/models/promo/Promotion$zoijcleaow;", "iwizpuwonk", "Ljava/lang/String;", "gxszxtbevo", "cqumvgiudr", "nufgyqmvbu", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedItemId;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promotion.zoijcleaow type;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoggedIn;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promotion promotion;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.promotion.store.PromotionStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((Promotion) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, Promotion.zoijcleaow.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(Promotion promotion, boolean z13, Promotion.zoijcleaow type, String str, boolean z14) {
        zdlpuopuiu.btonecajqb(promotion, "promotion");
        zdlpuopuiu.btonecajqb(type, "type");
        this.promotion = promotion;
        this.isLoggedIn = z13;
        this.type = type;
        this.selectedItemId = str;
        this.isLoading = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, Promotion promotion, boolean z13, Promotion.zoijcleaow zoijcleaowVar, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            promotion = state.promotion;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isLoggedIn;
        }
        boolean z15 = z13;
        if ((i13 & 4) != 0) {
            zoijcleaowVar = state.type;
        }
        Promotion.zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        if ((i13 & 8) != 0) {
            str = state.selectedItemId;
        }
        String str2 = str;
        if ((i13 & 16) != 0) {
            z14 = state.isLoading;
        }
        return state.zoijcleaow(promotion, z15, zoijcleaowVar2, str2, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Promotion getPromotion() {
        return this.promotion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.promotion, state.promotion) && this.isLoggedIn == state.isLoggedIn && this.type == state.type && zdlpuopuiu.eablkybsjg(this.selectedItemId, state.selectedItemId) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSelectedItemId() {
        return this.selectedItemId;
    }

    public int hashCode() {
        int iHashCode = ((((this.promotion.hashCode() * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + this.type.hashCode()) * 31;
        String str = this.selectedItemId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Promotion.zoijcleaow getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(promotion=" + this.promotion + ", isLoggedIn=" + this.isLoggedIn + ", type=" + this.type + ", selectedItemId=" + this.selectedItemId + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.promotion, flags);
        dest.writeInt(this.isLoggedIn ? 1 : 0);
        dest.writeString(this.type.name());
        dest.writeString(this.selectedItemId);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(Promotion promotion, boolean isLoggedIn, Promotion.zoijcleaow type, String selectedItemId, boolean isLoading) {
        zdlpuopuiu.btonecajqb(promotion, "promotion");
        zdlpuopuiu.btonecajqb(type, "type");
        return new State(promotion, isLoggedIn, type, selectedItemId, isLoading);
    }

    public /* synthetic */ State(Promotion promotion, boolean z13, Promotion.zoijcleaow zoijcleaowVar, String str, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new Promotion(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 33554431, null) : promotion, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? Promotion.zoijcleaow.DEFAULT : zoijcleaowVar, (i13 & 8) != 0 ? null : str, (i13 & 16) == 0 ? z14 : false);
    }
}
