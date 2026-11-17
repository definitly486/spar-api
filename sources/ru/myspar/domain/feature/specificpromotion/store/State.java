package ru.myspar.domain.feature.specificpromotion.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: renamed from: ru.myspar.domain.feature.specificpromotion.store.SpecificPromotionDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"ru/myspar/domain/feature/specificpromotion/store/SpecificPromotionDialogStore$State", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/promo/Promotion$PromotionItem;", "product", "", "qrCode", "<init>", "(Lru/myspar/core/domain/models/promo/Promotion$PromotionItem;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/specificpromotion/store/SpecificPromotionDialogStore$State;", "zoijcleaow", "(Lru/myspar/core/domain/models/promo/Promotion$PromotionItem;Ljava/lang/String;)Lru/myspar/domain/feature/specificpromotion/store/SpecificPromotionDialogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/promo/Promotion$PromotionItem;", "eablkybsjg", "()Lru/myspar/core/domain/models/promo/Promotion$PromotionItem;", "yggfygwlhe", "Ljava/lang/String;", "gxszxtbevo", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String qrCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promotion.PromotionItem product;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.specificpromotion.store.SpecificPromotionDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((Promotion.PromotionItem) parcel.readParcelable(State.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(Promotion.PromotionItem product, String qrCode) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        this.product = product;
        this.qrCode = qrCode;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, Promotion.PromotionItem promotionItem, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            promotionItem = state.product;
        }
        if ((i13 & 2) != 0) {
            str = state.qrCode;
        }
        return state.zoijcleaow(promotionItem, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final Promotion.PromotionItem getProduct() {
        return this.product;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.product, state.product) && zdlpuopuiu.eablkybsjg(this.qrCode, state.qrCode);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + this.qrCode.hashCode();
    }

    public String toString() {
        return "State(product=" + this.product + ", qrCode=" + this.qrCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.product, flags);
        dest.writeString(this.qrCode);
    }

    public final State zoijcleaow(Promotion.PromotionItem product, String qrCode) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(qrCode, "qrCode");
        return new State(product, qrCode);
    }

    public /* synthetic */ State(Promotion.PromotionItem promotionItem, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new Promotion.PromotionItem(null, null, 0.0d, 0.0d, null, 0, null, null, null, null, false, 2047, null) : promotionItem, (i13 & 2) != 0 ? "" : str);
    }
}
