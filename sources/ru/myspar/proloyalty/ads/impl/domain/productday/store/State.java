package ru.myspar.proloyalty.ads.impl.domain.productday.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.domain.productday.store.ProductDayPopupDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0096\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0017H×\u0001¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$H×\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b?\u00100R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\bC\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"ru/myspar/proloyalty/ads/impl/domain/productday/store/ProductDayPopupDialogStore$State", "Landroid/os/Parcelable;", "", "popupId", "groupCode", "", "isLoading", "title", "subtitle", "subtitleText", "text", "buttonText", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "productDay", "isCorrectData", "productId", "shopId", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/Product;ZLjava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/ads/impl/domain/productday/store/ProductDayPopupDialogStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/Product;ZLjava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;)Lru/myspar/proloyalty/ads/impl/domain/productday/store/ProductDayPopupDialogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getPopupId", "yggfygwlhe", "getGroupCode", "jyumaefscl", "Z", "oxmwwwfdhm", "()Z", "iwizpuwonk", "gtknphoqwx", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "dxjokdxxww", "lereixgezr", "btonecajqb", "pmvmpeiblj", "istkbnxepw", "zynmafqrjb", "Lru/myspar/proloyalty/core/domain/models/product/Product;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/domain/models/product/Product;", "wflxmlrfwp", "cdpycssgdh", "lqeggnwhkg", "yadqdtsiqt", "getShopId", "iozdgvuglv", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "eablkybsjg", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitleText;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCorrectData;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String popupId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Product productDay;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.ads.impl.domain.productday.store.ProductDayPopupDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Product) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (DeliveryCode) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String popupId, String groupCode, boolean z13, String title, String subtitle, String subtitleText, String text, String str, Product productDay, boolean z14, String productId, String shopId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(popupId, "popupId");
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(productDay, "productDay");
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        this.popupId = popupId;
        this.groupCode = groupCode;
        this.isLoading = z13;
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleText = subtitleText;
        this.text = text;
        this.buttonText = str;
        this.productDay = productDay;
        this.isCorrectData = z14;
        this.productId = productId;
        this.shopId = shopId;
        this.deliveryCode = deliveryCode;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.popupId, state.popupId) && zdlpuopuiu.eablkybsjg(this.groupCode, state.groupCode) && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.title, state.title) && zdlpuopuiu.eablkybsjg(this.subtitle, state.subtitle) && zdlpuopuiu.eablkybsjg(this.subtitleText, state.subtitleText) && zdlpuopuiu.eablkybsjg(this.text, state.text) && zdlpuopuiu.eablkybsjg(this.buttonText, state.buttonText) && zdlpuopuiu.eablkybsjg(this.productDay, state.productDay) && this.isCorrectData == state.isCorrectData && zdlpuopuiu.eablkybsjg(this.productId, state.productId) && zdlpuopuiu.eablkybsjg(this.shopId, state.shopId) && this.deliveryCode == state.deliveryCode;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Product getProductDay() {
        return this.productDay;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.popupId.hashCode() * 31) + this.groupCode.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.text.hashCode()) * 31;
        String str = this.buttonText;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.productDay.hashCode()) * 31) + Boolean.hashCode(this.isCorrectData)) * 31) + this.productId.hashCode()) * 31) + this.shopId.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return iHashCode2 + (deliveryCode != null ? deliveryCode.hashCode() : 0);
    }

    /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(popupId=" + this.popupId + ", groupCode=" + this.groupCode + ", isLoading=" + this.isLoading + ", title=" + this.title + ", subtitle=" + this.subtitle + ", subtitleText=" + this.subtitleText + ", text=" + this.text + ", buttonText=" + this.buttonText + ", productDay=" + this.productDay + ", isCorrectData=" + this.isCorrectData + ", productId=" + this.productId + ", shopId=" + this.shopId + ", deliveryCode=" + this.deliveryCode + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsCorrectData() {
        return this.isCorrectData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.popupId);
        dest.writeString(this.groupCode);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.subtitleText);
        dest.writeString(this.text);
        dest.writeString(this.buttonText);
        dest.writeParcelable(this.productDay, flags);
        dest.writeInt(this.isCorrectData ? 1 : 0);
        dest.writeString(this.productId);
        dest.writeString(this.shopId);
        dest.writeParcelable(this.deliveryCode, flags);
    }

    public final State zoijcleaow(String popupId, String groupCode, boolean isLoading, String title, String subtitle, String subtitleText, String text, String buttonText, Product productDay, boolean isCorrectData, String productId, String shopId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(popupId, "popupId");
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(productDay, "productDay");
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        return new State(popupId, groupCode, isLoading, title, subtitle, subtitleText, text, buttonText, productDay, isCorrectData, productId, shopId, deliveryCode);
    }

    public /* synthetic */ State(String str, String str2, boolean z13, String str3, String str4, String str5, String str6, String str7, Product product, boolean z14, String str8, String str9, DeliveryCode deliveryCode, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) != 0 ? "" : str6, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str7, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new Product(null, null, null, 0.0d, null, null, false, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0.0d, null, -1, 32767, null) : product, (i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? z14 : false, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str8, (i13 & 2048) == 0 ? str9 : "", (i13 & 4096) == 0 ? deliveryCode : null);
    }
}
