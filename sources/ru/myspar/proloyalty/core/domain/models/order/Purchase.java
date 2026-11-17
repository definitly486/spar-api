package ru.myspar.proloyalty.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010\"R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010 R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010)\u001a\u0004\bM\u0010\"¨\u0006N"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/Purchase;", "Landroid/os/Parcelable;", "", "id", "Ljava/time/LocalDateTime;", "dateCreate", "Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "ordersStatus", "", "canRepeat", "", "bonuses", "appliedBonuses", "deliveryType", "", "price", "address", "", "page", "", "Lru/myspar/proloyalty/core/domain/models/order/PurchaseHistoryProduct;", "basket", "npsUrl", "<init>", "(Ljava/lang/String;Ljava/time/LocalDateTime;Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;DLjava/lang/String;ILjava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "Ljava/time/LocalDateTime;", "nufgyqmvbu", "()Ljava/time/LocalDateTime;", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "getOrdersStatus", "()Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "iwizpuwonk", "Z", "lqeggnwhkg", "()Z", "cqumvgiudr", "Ljava/lang/Float;", "gxszxtbevo", "()Ljava/lang/Float;", "esjtqupxsv", "ppxfxbqfkf", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "D", "gtknphoqwx", "()D", "zynmafqrjb", "zoijcleaow", "istkbnxepw", "I", "getPage", "cdpycssgdh", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "yadqdtsiqt", "btonecajqb", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Purchase implements Parcelable {
    public static final Parcelable.Creator<Purchase> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final List basket;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float bonuses;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float appliedBonuses;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final int page;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canRepeat;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderStatus ordersStatus;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryType;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String npsUrl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime dateCreate;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Purchase createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            OrderStatus orderStatusCreateFromParcel = OrderStatus.CREATOR.createFromParcel(parcel);
            boolean z13 = parcel.readInt() != 0;
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null;
            String string2 = parcel.readString();
            double d13 = parcel.readDouble();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(PurchaseHistoryProduct.CREATOR.createFromParcel(parcel));
            }
            return new Purchase(string, localDateTime, orderStatusCreateFromParcel, z13, fValueOf, fValueOf2, string2, d13, string3, i13, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Purchase[] newArray(int i13) {
            return new Purchase[i13];
        }
    }

    public Purchase(String id2, LocalDateTime localDateTime, OrderStatus ordersStatus, boolean z13, Float f13, Float f14, String str, double d13, String address, int i13, List basket, String npsUrl) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(basket, "basket");
        zdlpuopuiu.btonecajqb(npsUrl, "npsUrl");
        this.id = id2;
        this.dateCreate = localDateTime;
        this.ordersStatus = ordersStatus;
        this.canRepeat = z13;
        this.bonuses = f13;
        this.appliedBonuses = f14;
        this.deliveryType = str;
        this.price = d13;
        this.address = address;
        this.page = i13;
        this.basket = basket;
        this.npsUrl = npsUrl;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getNpsUrl() {
        return this.npsUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getDeliveryType() {
        return this.deliveryType;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getBasket() {
        return this.basket;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) other;
        return zdlpuopuiu.eablkybsjg(this.id, purchase.id) && zdlpuopuiu.eablkybsjg(this.dateCreate, purchase.dateCreate) && this.ordersStatus == purchase.ordersStatus && this.canRepeat == purchase.canRepeat && zdlpuopuiu.eablkybsjg(this.bonuses, purchase.bonuses) && zdlpuopuiu.eablkybsjg(this.appliedBonuses, purchase.appliedBonuses) && zdlpuopuiu.eablkybsjg(this.deliveryType, purchase.deliveryType) && Double.compare(this.price, purchase.price) == 0 && zdlpuopuiu.eablkybsjg(this.address, purchase.address) && this.page == purchase.page && zdlpuopuiu.eablkybsjg(this.basket, purchase.basket) && zdlpuopuiu.eablkybsjg(this.npsUrl, purchase.npsUrl);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Float getBonuses() {
        return this.bonuses;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        LocalDateTime localDateTime = this.dateCreate;
        int iHashCode2 = (((((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31) + this.ordersStatus.hashCode()) * 31) + Boolean.hashCode(this.canRepeat)) * 31;
        Float f13 = this.bonuses;
        int iHashCode3 = (iHashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.appliedBonuses;
        int iHashCode4 = (iHashCode3 + (f14 == null ? 0 : f14.hashCode())) * 31;
        String str = this.deliveryType;
        return ((((((((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + Double.hashCode(this.price)) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.page)) * 31) + this.basket.hashCode()) * 31) + this.npsUrl.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getCanRepeat() {
        return this.canRepeat;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final LocalDateTime getDateCreate() {
        return this.dateCreate;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Float getAppliedBonuses() {
        return this.appliedBonuses;
    }

    public String toString() {
        return "Purchase(id=" + this.id + ", dateCreate=" + this.dateCreate + ", ordersStatus=" + this.ordersStatus + ", canRepeat=" + this.canRepeat + ", bonuses=" + this.bonuses + ", appliedBonuses=" + this.appliedBonuses + ", deliveryType=" + this.deliveryType + ", price=" + this.price + ", address=" + this.address + ", page=" + this.page + ", basket=" + this.basket + ", npsUrl=" + this.npsUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeSerializable(this.dateCreate);
        this.ordersStatus.writeToParcel(dest, flags);
        dest.writeInt(this.canRepeat ? 1 : 0);
        Float f13 = this.bonuses;
        if (f13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f13.floatValue());
        }
        Float f14 = this.appliedBonuses;
        if (f14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f14.floatValue());
        }
        dest.writeString(this.deliveryType);
        dest.writeDouble(this.price);
        dest.writeString(this.address);
        dest.writeInt(this.page);
        List list = this.basket;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((PurchaseHistoryProduct) it.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.npsUrl);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public /* synthetic */ Purchase(String str, LocalDateTime localDateTime, OrderStatus orderStatus, boolean z13, Float f13, Float f14, String str2, double d13, String str3, int i13, List list, String str4, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? dxjokdxxww.ppxfxbqfkf() : str, (i14 & 2) != 0 ? null : localDateTime, (i14 & 4) != 0 ? OrderStatus.UNDEFINED : orderStatus, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? null : f13, (i14 & 32) != 0 ? null : f14, (i14 & 64) == 0 ? str2 : null, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0d : d13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? dxjokdxxww.ppxfxbqfkf() : str3, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 1 : i13, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 2048) != 0 ? dxjokdxxww.ppxfxbqfkf() : str4);
    }
}
