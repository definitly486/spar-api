package ru.myspar.scango.impl.screens.amountproduct.partial.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.partial.domain.store.ScanGoAmountProductPartialStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0090\u0001\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010%H×\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\b,\u0010#R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\b3\u0010I¨\u0006K"}, d2 = {"ru/myspar/scango/impl/screens/amountproduct/partial/domain/store/ScanGoAmountProductPartialStore$State", "Landroid/os/Parcelable;", "", "article", "", "id", "Lx30/iobyxmoadg;", "measure", ExternalMetricsManagerImpl.NAME, "pictureUrl", "", "price", "quantity", "", "markCodes", "warningMessage", "Lf22/iobyxmoadg;", "scanGoAmountMode", "", "allowChangeQuantityAction", "isLoading", "<init>", "(Ljava/lang/String;ILx30/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;Ljava/lang/String;Lf22/iobyxmoadg;ZZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/scango/impl/screens/amountproduct/partial/domain/store/ScanGoAmountProductPartialStore$State;", "zoijcleaow", "(Ljava/lang/String;ILx30/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;Ljava/lang/String;Lf22/iobyxmoadg;ZZ)Lru/myspar/scango/impl/screens/amountproduct/partial/domain/store/ScanGoAmountProductPartialStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "I", "lqeggnwhkg", "jyumaefscl", "Lx30/iobyxmoadg;", "dxjokdxxww", "()Lx30/iobyxmoadg;", "iwizpuwonk", "getName", "cqumvgiudr", "btonecajqb", "esjtqupxsv", "D", "gtknphoqwx", "()D", "lereixgezr", "wflxmlrfwp", "pmvmpeiblj", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "zynmafqrjb", "istkbnxepw", "Lf22/iobyxmoadg;", "oxmwwwfdhm", "()Lf22/iobyxmoadg;", "cdpycssgdh", "Z", "eablkybsjg", "()Z", "yadqdtsiqt", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowChangeQuantityAction;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pictureUrl;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final f22.iobyxmoadg scanGoAmountMode;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.iobyxmoadg measure;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List markCodes;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String warningMessage;

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.amountproduct.partial.domain.store.ScanGoAmountProductPartialStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readInt(), x30.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.createStringArrayList(), parcel.readString(), f22.iobyxmoadg.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String article, int i13, x30.iobyxmoadg measure, String name, String str, double d13, double d14, List markCodes, String warningMessage, f22.iobyxmoadg scanGoAmountMode, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        this.article = article;
        this.id = i13;
        this.measure = measure;
        this.name = name;
        this.pictureUrl = str;
        this.price = d13;
        this.quantity = d14;
        this.markCodes = markCodes;
        this.warningMessage = warningMessage;
        this.scanGoAmountMode = scanGoAmountMode;
        this.allowChangeQuantityAction = z13;
        this.isLoading = z14;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final x30.iobyxmoadg getMeasure() {
        return this.measure;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getAllowChangeQuantityAction() {
        return this.allowChangeQuantityAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.article, state.article) && this.id == state.id && this.measure == state.measure && zdlpuopuiu.eablkybsjg(this.name, state.name) && zdlpuopuiu.eablkybsjg(this.pictureUrl, state.pictureUrl) && Double.compare(this.price, state.price) == 0 && Double.compare(this.quantity, state.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.markCodes, state.markCodes) && zdlpuopuiu.eablkybsjg(this.warningMessage, state.warningMessage) && this.scanGoAmountMode == state.scanGoAmountMode && this.allowChangeQuantityAction == state.allowChangeQuantityAction && this.isLoading == state.isLoading;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public int hashCode() {
        int iHashCode = ((((((this.article.hashCode() * 31) + Integer.hashCode(this.id)) * 31) + this.measure.hashCode()) * 31) + this.name.hashCode()) * 31;
        String str = this.pictureUrl;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.quantity)) * 31) + this.markCodes.hashCode()) * 31) + this.warningMessage.hashCode()) * 31) + this.scanGoAmountMode.hashCode()) * 31) + Boolean.hashCode(this.allowChangeQuantityAction)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getMarkCodes() {
        return this.markCodes;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final f22.iobyxmoadg getScanGoAmountMode() {
        return this.scanGoAmountMode;
    }

    public String toString() {
        return "State(article=" + this.article + ", id=" + this.id + ", measure=" + this.measure + ", name=" + this.name + ", pictureUrl=" + this.pictureUrl + ", price=" + this.price + ", quantity=" + this.quantity + ", markCodes=" + this.markCodes + ", warningMessage=" + this.warningMessage + ", scanGoAmountMode=" + this.scanGoAmountMode + ", allowChangeQuantityAction=" + this.allowChangeQuantityAction + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.article);
        dest.writeInt(this.id);
        dest.writeString(this.measure.name());
        dest.writeString(this.name);
        dest.writeString(this.pictureUrl);
        dest.writeDouble(this.price);
        dest.writeDouble(this.quantity);
        dest.writeStringList(this.markCodes);
        dest.writeString(this.warningMessage);
        dest.writeString(this.scanGoAmountMode.name());
        dest.writeInt(this.allowChangeQuantityAction ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public final State zoijcleaow(String article, int id2, x30.iobyxmoadg measure, String name, String pictureUrl, double price, double quantity, List markCodes, String warningMessage, f22.iobyxmoadg scanGoAmountMode, boolean allowChangeQuantityAction, boolean isLoading) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(markCodes, "markCodes");
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        return new State(article, id2, measure, name, pictureUrl, price, quantity, markCodes, warningMessage, scanGoAmountMode, allowChangeQuantityAction, isLoading);
    }

    public /* synthetic */ State(String str, int i13, x30.iobyxmoadg iobyxmoadgVar, String str2, String str3, double d13, double d14, List list, String str4, f22.iobyxmoadg iobyxmoadgVar2, boolean z13, boolean z14, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? x30.iobyxmoadg.UNDEFINED : iobyxmoadgVar, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) == 0 ? d14 : 0.0d, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str4 : "", (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? f22.iobyxmoadg.INCREASE : iobyxmoadgVar2, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z13, (i14 & 2048) == 0 ? z14 : false);
    }
}
