package ru.myspar.proloyalty.purchases.impl.history.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import q11.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/history/presentation/model/PurchaseHistoryUiModel;", "Landroid/os/Parcelable;", "", "itemId", "", "orderId", "price", "priceDecimal", "bonuses", "appliedBonuses", "deliveryType", ExternalMetricsManagerImpl.DATE, "address", "", "isRateButtonVisible", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "nufgyqmvbu", "yggfygwlhe", "Ljava/lang/String;", "dxjokdxxww", "jyumaefscl", "btonecajqb", "iwizpuwonk", "gtknphoqwx", "cqumvgiudr", "eablkybsjg", "esjtqupxsv", "ppxfxbqfkf", "lereixgezr", "lqeggnwhkg", "pmvmpeiblj", "gxszxtbevo", "zynmafqrjb", "zoijcleaow", "istkbnxepw", "Z", "wflxmlrfwp", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseHistoryUiModel implements Parcelable {
    public static final Parcelable.Creator<PurchaseHistoryUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bonuses;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appliedBonuses;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRateButtonVisible;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceDecimal;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String price;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryType;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int itemId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PurchaseHistoryUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PurchaseHistoryUiModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PurchaseHistoryUiModel[] newArray(int i13) {
            return new PurchaseHistoryUiModel[i13];
        }
    }

    public PurchaseHistoryUiModel(int i13, String orderId, String price, String priceDecimal, String bonuses, String appliedBonuses, String deliveryType, String date, String address, boolean z13) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceDecimal, "priceDecimal");
        zdlpuopuiu.btonecajqb(bonuses, "bonuses");
        zdlpuopuiu.btonecajqb(appliedBonuses, "appliedBonuses");
        zdlpuopuiu.btonecajqb(deliveryType, "deliveryType");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(address, "address");
        this.itemId = i13;
        this.orderId = orderId;
        this.price = price;
        this.priceDecimal = priceDecimal;
        this.bonuses = bonuses;
        this.appliedBonuses = appliedBonuses;
        this.deliveryType = deliveryType;
        this.date = date;
        this.address = address;
        this.isRateButtonVisible = z13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getBonuses() {
        return this.bonuses;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHistoryUiModel)) {
            return false;
        }
        PurchaseHistoryUiModel purchaseHistoryUiModel = (PurchaseHistoryUiModel) other;
        return this.itemId == purchaseHistoryUiModel.itemId && zdlpuopuiu.eablkybsjg(this.orderId, purchaseHistoryUiModel.orderId) && zdlpuopuiu.eablkybsjg(this.price, purchaseHistoryUiModel.price) && zdlpuopuiu.eablkybsjg(this.priceDecimal, purchaseHistoryUiModel.priceDecimal) && zdlpuopuiu.eablkybsjg(this.bonuses, purchaseHistoryUiModel.bonuses) && zdlpuopuiu.eablkybsjg(this.appliedBonuses, purchaseHistoryUiModel.appliedBonuses) && zdlpuopuiu.eablkybsjg(this.deliveryType, purchaseHistoryUiModel.deliveryType) && zdlpuopuiu.eablkybsjg(this.date, purchaseHistoryUiModel.date) && zdlpuopuiu.eablkybsjg(this.address, purchaseHistoryUiModel.address) && this.isRateButtonVisible == purchaseHistoryUiModel.isRateButtonVisible;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getPriceDecimal() {
        return this.priceDecimal;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.itemId) * 31) + this.orderId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.priceDecimal.hashCode()) * 31) + this.bonuses.hashCode()) * 31) + this.appliedBonuses.hashCode()) * 31) + this.deliveryType.hashCode()) * 31) + this.date.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.isRateButtonVisible);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getDeliveryType() {
        return this.deliveryType;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final int getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getAppliedBonuses() {
        return this.appliedBonuses;
    }

    public String toString() {
        return "PurchaseHistoryUiModel(itemId=" + this.itemId + ", orderId=" + this.orderId + ", price=" + this.price + ", priceDecimal=" + this.priceDecimal + ", bonuses=" + this.bonuses + ", appliedBonuses=" + this.appliedBonuses + ", deliveryType=" + this.deliveryType + ", date=" + this.date + ", address=" + this.address + ", isRateButtonVisible=" + this.isRateButtonVisible + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsRateButtonVisible() {
        return this.isRateButtonVisible;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.itemId);
        dest.writeString(this.orderId);
        dest.writeString(this.price);
        dest.writeString(this.priceDecimal);
        dest.writeString(this.bonuses);
        dest.writeString(this.appliedBonuses);
        dest.writeString(this.deliveryType);
        dest.writeString(this.date);
        dest.writeString(this.address);
        dest.writeInt(this.isRateButtonVisible ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public /* synthetic */ PurchaseHistoryUiModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? dxjokdxxww.ppxfxbqfkf() : str, (i14 & 4) != 0 ? dxjokdxxww.ppxfxbqfkf() : str2, (i14 & 8) != 0 ? dxjokdxxww.ppxfxbqfkf() : str3, (i14 & 16) != 0 ? dxjokdxxww.ppxfxbqfkf() : str4, (i14 & 32) != 0 ? dxjokdxxww.ppxfxbqfkf() : str5, (i14 & 64) != 0 ? dxjokdxxww.ppxfxbqfkf() : str6, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dxjokdxxww.ppxfxbqfkf() : str7, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? dxjokdxxww.ppxfxbqfkf() : str8, z13);
    }
}
