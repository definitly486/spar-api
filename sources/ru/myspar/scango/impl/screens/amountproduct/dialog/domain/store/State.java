package ru.myspar.scango.impl.screens.amountproduct.dialog.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.dialog.domain.store.ScanGoAmountProductDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"ru/myspar/scango/impl/screens/amountproduct/dialog/domain/store/ScanGoAmountProductDialogStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "productId", "Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;", "product", "isFirstMessage", "", "warningMessage", "Lf22/iobyxmoadg;", "scanGoAmountMode", "<init>", "(ZILru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;ZLjava/lang/String;Lf22/iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/scango/impl/screens/amountproduct/dialog/domain/store/ScanGoAmountProductDialogStore$State;", "zoijcleaow", "(ZILru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;ZLjava/lang/String;Lf22/iobyxmoadg;)Lru/myspar/scango/impl/screens/amountproduct/dialog/domain/store/ScanGoAmountProductDialogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "dxjokdxxww", "()Z", "yggfygwlhe", "I", "gxszxtbevo", "jyumaefscl", "Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;", "eablkybsjg", "()Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "Ljava/lang/String;", "getWarningMessage", "esjtqupxsv", "Lf22/iobyxmoadg;", "lqeggnwhkg", "()Lf22/iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String warningMessage;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final f22.iobyxmoadg scanGoAmountMode;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFirstMessage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoProductModel product;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.dialog.domain.store.ScanGoAmountProductDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readInt(), ScanGoProductModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), f22.iobyxmoadg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, int i13, ScanGoProductModel product, boolean z14, String warningMessage, f22.iobyxmoadg scanGoAmountMode) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        this.isLoading = z13;
        this.productId = i13;
        this.product = product;
        this.isFirstMessage = z14;
        this.warningMessage = warningMessage;
        this.scanGoAmountMode = scanGoAmountMode;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, int i13, ScanGoProductModel scanGoProductModel, boolean z14, String str, f22.iobyxmoadg iobyxmoadgVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i14 & 2) != 0) {
            i13 = state.productId;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            scanGoProductModel = state.product;
        }
        ScanGoProductModel scanGoProductModel2 = scanGoProductModel;
        if ((i14 & 8) != 0) {
            z14 = state.isFirstMessage;
        }
        boolean z15 = z14;
        if ((i14 & 16) != 0) {
            str = state.warningMessage;
        }
        String str2 = str;
        if ((i14 & 32) != 0) {
            iobyxmoadgVar = state.scanGoAmountMode;
        }
        return state.zoijcleaow(z13, i15, scanGoProductModel2, z15, str2, iobyxmoadgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
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
        return this.isLoading == state.isLoading && this.productId == state.productId && zdlpuopuiu.eablkybsjg(this.product, state.product) && this.isFirstMessage == state.isFirstMessage && zdlpuopuiu.eablkybsjg(this.warningMessage, state.warningMessage) && this.scanGoAmountMode == state.scanGoAmountMode;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + Integer.hashCode(this.productId)) * 31) + this.product.hashCode()) * 31) + Boolean.hashCode(this.isFirstMessage)) * 31) + this.warningMessage.hashCode()) * 31) + this.scanGoAmountMode.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final f22.iobyxmoadg getScanGoAmountMode() {
        return this.scanGoAmountMode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsFirstMessage() {
        return this.isFirstMessage;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", productId=" + this.productId + ", product=" + this.product + ", isFirstMessage=" + this.isFirstMessage + ", warningMessage=" + this.warningMessage + ", scanGoAmountMode=" + this.scanGoAmountMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.productId);
        this.product.writeToParcel(dest, flags);
        dest.writeInt(this.isFirstMessage ? 1 : 0);
        dest.writeString(this.warningMessage);
        dest.writeString(this.scanGoAmountMode.name());
    }

    public final State zoijcleaow(boolean isLoading, int productId, ScanGoProductModel product, boolean isFirstMessage, String warningMessage, f22.iobyxmoadg scanGoAmountMode) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        return new State(isLoading, productId, product, isFirstMessage, warningMessage, scanGoAmountMode);
    }

    public /* synthetic */ State(boolean z13, int i13, ScanGoProductModel scanGoProductModel, boolean z14, String str, f22.iobyxmoadg iobyxmoadgVar, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? false : z13, i13, (i14 & 4) != 0 ? new ScanGoProductModel(null, 0, null, null, null, 0.0d, 0.0d, null, KotlinVersion.MAX_COMPONENT_VALUE, null) : scanGoProductModel, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? "" : str, (i14 & 32) != 0 ? f22.iobyxmoadg.INCREASE : iobyxmoadgVar);
    }
}
