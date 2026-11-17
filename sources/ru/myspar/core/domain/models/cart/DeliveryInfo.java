package ru.myspar.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001-B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015R\u0011\u0010+\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/myspar/core/domain/models/cart/DeliveryInfo;", "Landroid/os/Parcelable;", "", "title", "subtitle", "price", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryType", "shopId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "Lru/myspar/core/models/delivery/DeliveryCode;", "zoijcleaow", "()Lru/myspar/core/models/delivery/DeliveryCode;", "cqumvgiudr", "eablkybsjg", "nufgyqmvbu", "()Z", "isCartHasAddress", "esjtqupxsv", "iobyxmoadg", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeliveryInfo implements Parcelable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopId;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryType;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String price;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeliveryInfo> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.core.domain.models.cart.DeliveryInfo$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final DeliveryInfo iobyxmoadg() {
            return new DeliveryInfo("", "", null, null, null);
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final DeliveryInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new DeliveryInfo(parcel.readString(), parcel.readString(), parcel.readString(), (DeliveryCode) parcel.readParcelable(DeliveryInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final DeliveryInfo[] newArray(int i13) {
            return new DeliveryInfo[i13];
        }
    }

    public DeliveryInfo(String title, String subtitle, String str, DeliveryCode deliveryCode, String str2) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        this.title = title;
        this.subtitle = subtitle;
        this.price = str;
        this.deliveryType = deliveryCode;
        this.shopId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryInfo)) {
            return false;
        }
        DeliveryInfo deliveryInfo = (DeliveryInfo) other;
        return zdlpuopuiu.eablkybsjg(this.title, deliveryInfo.title) && zdlpuopuiu.eablkybsjg(this.subtitle, deliveryInfo.subtitle) && zdlpuopuiu.eablkybsjg(this.price, deliveryInfo.price) && this.deliveryType == deliveryInfo.deliveryType && zdlpuopuiu.eablkybsjg(this.shopId, deliveryInfo.shopId);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
        String str = this.price;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryCode deliveryCode = this.deliveryType;
        int iHashCode3 = (iHashCode2 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        String str2 = this.shopId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean nufgyqmvbu() {
        return this.deliveryType != null;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    public String toString() {
        return "DeliveryInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", price=" + this.price + ", deliveryType=" + this.deliveryType + ", shopId=" + this.shopId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.price);
        dest.writeParcelable(this.deliveryType, flags);
        dest.writeString(this.shopId);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final DeliveryCode getDeliveryType() {
        return this.deliveryType;
    }
}
