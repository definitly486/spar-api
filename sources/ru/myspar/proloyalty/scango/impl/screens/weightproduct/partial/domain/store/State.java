package ru.myspar.proloyalty.scango.impl.screens.weightproduct.partial.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.weightproduct.partial.domain.store.ScanGoWeightProductPartialStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"ru/myspar/proloyalty/scango/impl/screens/weightproduct/partial/domain/store/ScanGoWeightProductPartialStore$State", "Landroid/os/Parcelable;", "", "productId", "", "warningMessage", "Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "product", "", "isLoading", "<init>", "(ILjava/lang/String;Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/scango/impl/screens/weightproduct/partial/domain/store/ScanGoWeightProductPartialStore$State;", "zoijcleaow", "(ILjava/lang/String;Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;Z)Lru/myspar/proloyalty/scango/impl/screens/weightproduct/partial/domain/store/ScanGoWeightProductPartialStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "gxszxtbevo", "yggfygwlhe", "Ljava/lang/String;", "lqeggnwhkg", "jyumaefscl", "Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "eablkybsjg", "()Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "iwizpuwonk", "Z", "nufgyqmvbu", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoProductModel product;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String warningMessage;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productId;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.weightproduct.partial.domain.store.ScanGoWeightProductPartialStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt(), parcel.readString(), ScanGoProductModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(int i13, String warningMessage, ScanGoProductModel product, boolean z13) {
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(product, "product");
        this.productId = i13;
        this.warningMessage = warningMessage;
        this.product = product;
        this.isLoading = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, int i13, String str, ScanGoProductModel scanGoProductModel, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = state.productId;
        }
        if ((i14 & 2) != 0) {
            str = state.warningMessage;
        }
        if ((i14 & 4) != 0) {
            scanGoProductModel = state.product;
        }
        if ((i14 & 8) != 0) {
            z13 = state.isLoading;
        }
        return state.zoijcleaow(i13, str, scanGoProductModel, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ScanGoProductModel getProduct() {
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
        return this.productId == state.productId && zdlpuopuiu.eablkybsjg(this.warningMessage, state.warningMessage) && zdlpuopuiu.eablkybsjg(this.product, state.product) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.productId) * 31) + this.warningMessage.hashCode()) * 31) + this.product.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(productId=" + this.productId + ", warningMessage=" + this.warningMessage + ", product=" + this.product + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.productId);
        dest.writeString(this.warningMessage);
        this.product.writeToParcel(dest, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(int productId, String warningMessage, ScanGoProductModel product, boolean isLoading) {
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(product, "product");
        return new State(productId, warningMessage, product, isLoading);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ State(int i13, String str, ScanGoProductModel scanGoProductModel, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        boolean z14 = false;
        int i15 = (i14 & 1) != 0 ? 0 : i13;
        String str2 = (i14 & 2) != 0 ? "" : str;
        ScanGoProductModel scanGoProductModel2 = (i14 & 4) != 0 ? new ScanGoProductModel(null, 0, null, null, null, 0.0d, 0.0d, null, KotlinVersion.MAX_COMPONENT_VALUE, null) : scanGoProductModel;
        if ((i14 & 8) == 0) {
            z14 = z13;
        }
        this(i15, str2, scanGoProductModel2, z14);
    }
}
