package ru.myspar.proloyalty.ads.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/myspar/proloyalty/ads/api/model/ProductDayPopupDialogArgs;", "", "Landroid/os/Parcelable;", "", "popupId", "groupCode", "title", "subtitle", "subtitleText", "text", "shopId", "buttonText", "productId", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "gtknphoqwx", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "dxjokdxxww", "esjtqupxsv", "btonecajqb", "lereixgezr", "lqeggnwhkg", "pmvmpeiblj", "istkbnxepw", "zynmafqrjb", "gxszxtbevo", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "zoijcleaow", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDayPopupDialogArgs implements Parcelable {
    public static final Parcelable.Creator<ProductDayPopupDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitleText;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopId;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String popupId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductDayPopupDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ProductDayPopupDialogArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeliveryCode) parcel.readParcelable(ProductDayPopupDialogArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductDayPopupDialogArgs[] newArray(int i13) {
            return new ProductDayPopupDialogArgs[i13];
        }
    }

    public ProductDayPopupDialogArgs(String popupId, String groupCode, String title, String subtitle, String subtitleText, String text, String shopId, String str, String productId, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(popupId, "popupId");
        zdlpuopuiu.btonecajqb(groupCode, "groupCode");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(productId, "productId");
        this.popupId = popupId;
        this.groupCode = groupCode;
        this.title = title;
        this.subtitle = subtitle;
        this.subtitleText = subtitleText;
        this.text = text;
        this.shopId = shopId;
        this.buttonText = str;
        this.productId = productId;
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
    public String getPopupId() {
        return this.popupId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDayPopupDialogArgs)) {
            return false;
        }
        ProductDayPopupDialogArgs productDayPopupDialogArgs = (ProductDayPopupDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.popupId, productDayPopupDialogArgs.popupId) && zdlpuopuiu.eablkybsjg(this.groupCode, productDayPopupDialogArgs.groupCode) && zdlpuopuiu.eablkybsjg(this.title, productDayPopupDialogArgs.title) && zdlpuopuiu.eablkybsjg(this.subtitle, productDayPopupDialogArgs.subtitle) && zdlpuopuiu.eablkybsjg(this.subtitleText, productDayPopupDialogArgs.subtitleText) && zdlpuopuiu.eablkybsjg(this.text, productDayPopupDialogArgs.text) && zdlpuopuiu.eablkybsjg(this.shopId, productDayPopupDialogArgs.shopId) && zdlpuopuiu.eablkybsjg(this.buttonText, productDayPopupDialogArgs.buttonText) && zdlpuopuiu.eablkybsjg(this.productId, productDayPopupDialogArgs.productId) && this.deliveryCode == productDayPopupDialogArgs.deliveryCode;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.popupId.hashCode() * 31) + this.groupCode.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.text.hashCode()) * 31) + this.shopId.hashCode()) * 31;
        String str = this.buttonText;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.productId.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return iHashCode2 + (deliveryCode != null ? deliveryCode.hashCode() : 0);
    }

    /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public String getGroupCode() {
        return this.groupCode;
    }

    public String toString() {
        return "ProductDayPopupDialogArgs(popupId=" + this.popupId + ", groupCode=" + this.groupCode + ", title=" + this.title + ", subtitle=" + this.subtitle + ", subtitleText=" + this.subtitleText + ", text=" + this.text + ", shopId=" + this.shopId + ", buttonText=" + this.buttonText + ", productId=" + this.productId + ", deliveryCode=" + this.deliveryCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.popupId);
        dest.writeString(this.groupCode);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.subtitleText);
        dest.writeString(this.text);
        dest.writeString(this.shopId);
        dest.writeString(this.buttonText);
        dest.writeString(this.productId);
        dest.writeParcelable(this.deliveryCode, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    public /* synthetic */ ProductDayPopupDialogArgs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DeliveryCode deliveryCode, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str9, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : deliveryCode);
    }
}
