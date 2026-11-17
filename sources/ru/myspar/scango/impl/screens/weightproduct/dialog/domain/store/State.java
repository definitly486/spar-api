package ru.myspar.scango.impl.screens.weightproduct.dialog.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: renamed from: ru.myspar.scango.impl.screens.weightproduct.dialog.domain.store.ScanGoWeightProductDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u009a\u0001\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010%H×\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010#R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010#R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"ru/myspar/scango/impl/screens/weightproduct/dialog/domain/store/ScanGoWeightProductDialogStore$State", "Landroid/os/Parcelable;", "", "id", "", "article", ExternalMetricsManagerImpl.NAME, "pictureUrl", "amount", "", "quantity", "pricePerUnit", "totalPrice", "Lx30/iobyxmoadg;", "measureType", "", "markCodes", "warningMessage", "price", "", "isLoading", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lx30/iobyxmoadg;Ljava/util/List;Ljava/lang/String;DZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/scango/impl/screens/weightproduct/dialog/domain/store/ScanGoWeightProductDialogStore$State;", "zoijcleaow", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lx30/iobyxmoadg;Ljava/util/List;Ljava/lang/String;DZ)Lru/myspar/scango/impl/screens/weightproduct/dialog/domain/store/ScanGoWeightProductDialogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "gxszxtbevo", "yggfygwlhe", "Ljava/lang/String;", "eablkybsjg", "jyumaefscl", "getName", "iwizpuwonk", "dxjokdxxww", "cqumvgiudr", "getAmount", "esjtqupxsv", "D", "gtknphoqwx", "()D", "lereixgezr", "getPricePerUnit", "pmvmpeiblj", "getTotalPrice", "zynmafqrjb", "Lx30/iobyxmoadg;", "nufgyqmvbu", "()Lx30/iobyxmoadg;", "istkbnxepw", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "cdpycssgdh", "getWarningMessage", "yadqdtsiqt", "btonecajqb", "iozdgvuglv", "Z", "wflxmlrfwp", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String warningMessage;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amount;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final List markCodes;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pictureUrl;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pricePerUnit;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPrice;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.iobyxmoadg measureType;

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.weightproduct.dialog.domain.store.ScanGoWeightProductDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), x30.iobyxmoadg.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.readString(), parcel.readDouble(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(int i13, String article, String name, String str, String amount, double d13, String pricePerUnit, String totalPrice, x30.iobyxmoadg measureType, List markCodes, String warningMessage, double d14, boolean z13) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        this.id = i13;
        this.article = article;
        this.name = name;
        this.pictureUrl = str;
        this.amount = amount;
        this.quantity = d13;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
        this.measureType = measureType;
        this.markCodes = markCodes;
        this.warningMessage = warningMessage;
        this.price = d14;
        this.isLoading = z13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.id == state.id && zdlpuopuiu.eablkybsjg(this.article, state.article) && zdlpuopuiu.eablkybsjg(this.name, state.name) && zdlpuopuiu.eablkybsjg(this.pictureUrl, state.pictureUrl) && zdlpuopuiu.eablkybsjg(this.amount, state.amount) && Double.compare(this.quantity, state.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.pricePerUnit, state.pricePerUnit) && zdlpuopuiu.eablkybsjg(this.totalPrice, state.totalPrice) && this.measureType == state.measureType && zdlpuopuiu.eablkybsjg(this.markCodes, state.markCodes) && zdlpuopuiu.eablkybsjg(this.warningMessage, state.warningMessage) && Double.compare(this.price, state.price) == 0 && this.isLoading == state.isLoading;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.pictureUrl;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.amount.hashCode()) * 31) + Double.hashCode(this.quantity)) * 31) + this.pricePerUnit.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.measureType.hashCode()) * 31) + this.markCodes.hashCode()) * 31) + this.warningMessage.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getMarkCodes() {
        return this.markCodes;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final x30.iobyxmoadg getMeasureType() {
        return this.measureType;
    }

    public String toString() {
        return "State(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", pictureUrl=" + this.pictureUrl + ", amount=" + this.amount + ", quantity=" + this.quantity + ", pricePerUnit=" + this.pricePerUnit + ", totalPrice=" + this.totalPrice + ", measureType=" + this.measureType + ", markCodes=" + this.markCodes + ", warningMessage=" + this.warningMessage + ", price=" + this.price + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeString(this.pictureUrl);
        dest.writeString(this.amount);
        dest.writeDouble(this.quantity);
        dest.writeString(this.pricePerUnit);
        dest.writeString(this.totalPrice);
        dest.writeString(this.measureType.name());
        dest.writeStringList(this.markCodes);
        dest.writeString(this.warningMessage);
        dest.writeDouble(this.price);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(int id2, String article, String name, String pictureUrl, String amount, double quantity, String pricePerUnit, String totalPrice, x30.iobyxmoadg measureType, List markCodes, String warningMessage, double price, boolean isLoading) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(amount, "amount");
        zdlpuopuiu.btonecajqb(pricePerUnit, "pricePerUnit");
        zdlpuopuiu.btonecajqb(totalPrice, "totalPrice");
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        return new State(id2, article, name, pictureUrl, amount, quantity, pricePerUnit, totalPrice, measureType, markCodes, warningMessage, price, isLoading);
    }

    public /* synthetic */ State(int i13, String str, String str2, String str3, String str4, double d13, String str5, String str6, x30.iobyxmoadg iobyxmoadgVar, List list, String str7, double d14, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) != 0 ? "" : str5, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str6, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? x30.iobyxmoadg.UNDEFINED : iobyxmoadgVar, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? str7 : "", (i14 & 2048) == 0 ? d14 : 0.0d, (i14 & 4096) != 0 ? false : z13);
    }
}
