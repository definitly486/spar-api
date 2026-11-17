package ru.myspar.domain.feature.specificrestaurantproduct.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import o00.zoijcleaow;
import ru.myspar.core.domain.models.restaurants.RestaurantProductDetails;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: renamed from: ru.myspar.domain.feature.specificrestaurantproduct.store.SpecificRestaurantProductStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 J\u008a\u0001\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'H×\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010.R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"ru/myspar/domain/feature/specificrestaurantproduct/store/SpecificRestaurantProductStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "partnerCode", "article", "Lru/myspar/core/domain/models/restaurants/RestaurantProductDetails;", "productDetails", "", "currentAmount", "enableDecrease", "", "Lru/myspar/core/domain/models/cart/CartProduct;", "currentCartProducts", "cartPartnerCode", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryType", "Lru/myspar/core/models/measure_type/MeasureType;", "measure", "Lo00/zoijcleaow;", "buyState", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/myspar/core/domain/models/restaurants/RestaurantProductDetails;DZLjava/util/List;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;Lru/myspar/core/models/measure_type/MeasureType;Lo00/zoijcleaow;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/specificrestaurantproduct/store/SpecificRestaurantProductStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;Lru/myspar/core/domain/models/restaurants/RestaurantProductDetails;DZLjava/util/List;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;Lru/myspar/core/models/measure_type/MeasureType;Lo00/zoijcleaow;)Lru/myspar/domain/feature/specificrestaurantproduct/store/SpecificRestaurantProductStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "wflxmlrfwp", "()Z", "yggfygwlhe", "Ljava/lang/String;", "btonecajqb", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Lru/myspar/core/domain/models/restaurants/RestaurantProductDetails;", "gtknphoqwx", "()Lru/myspar/core/domain/models/restaurants/RestaurantProductDetails;", "cqumvgiudr", "D", "lqeggnwhkg", "()D", "esjtqupxsv", "nufgyqmvbu", "lereixgezr", "Ljava/util/List;", "getCurrentCartProducts", "()Ljava/util/List;", "pmvmpeiblj", "getCartPartnerCode", "zynmafqrjb", "Lru/myspar/core/models/delivery/DeliveryCode;", "getDeliveryType", "()Lru/myspar/core/models/delivery/DeliveryCode;", "istkbnxepw", "Lru/myspar/core/models/measure_type/MeasureType;", "dxjokdxxww", "()Lru/myspar/core/models/measure_type/MeasureType;", "cdpycssgdh", "Lo00/zoijcleaow;", "gxszxtbevo", "()Lo00/zoijcleaow;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow buyState;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double currentAmount;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enableDecrease;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType measure;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestaurantProductDetails productDetails;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List currentCartProducts;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartPartnerCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryType;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.specificrestaurantproduct.store.SpecificRestaurantProductStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            RestaurantProductDetails restaurantProductDetails = (RestaurantProductDetails) parcel.readParcelable(State.class.getClassLoader());
            double d13 = parcel.readDouble();
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new State(z13, string, string2, restaurantProductDetails, d13, z14, arrayList, parcel.readString(), (DeliveryCode) parcel.readParcelable(State.class.getClassLoader()), (MeasureType) parcel.readParcelable(State.class.getClassLoader()), zoijcleaow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String partnerCode, String article, RestaurantProductDetails productDetails, double d13, boolean z14, List list, String str, DeliveryCode deliveryCode, MeasureType measure, zoijcleaow buyState) {
        zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(productDetails, "productDetails");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(buyState, "buyState");
        this.isLoading = z13;
        this.partnerCode = partnerCode;
        this.article = article;
        this.productDetails = productDetails;
        this.currentAmount = d13;
        this.enableDecrease = z14;
        this.currentCartProducts = list;
        this.cartPartnerCode = str;
        this.deliveryType = deliveryCode;
        this.measure = measure;
        this.buyState = buyState;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final MeasureType getMeasure() {
        return this.measure;
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
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.partnerCode, state.partnerCode) && zdlpuopuiu.eablkybsjg(this.article, state.article) && zdlpuopuiu.eablkybsjg(this.productDetails, state.productDetails) && Double.compare(this.currentAmount, state.currentAmount) == 0 && this.enableDecrease == state.enableDecrease && zdlpuopuiu.eablkybsjg(this.currentCartProducts, state.currentCartProducts) && zdlpuopuiu.eablkybsjg(this.cartPartnerCode, state.cartPartnerCode) && this.deliveryType == state.deliveryType && zdlpuopuiu.eablkybsjg(this.measure, state.measure) && this.buyState == state.buyState;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final RestaurantProductDetails getProductDetails() {
        return this.productDetails;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final zoijcleaow getBuyState() {
        return this.buyState;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.isLoading) * 31) + this.partnerCode.hashCode()) * 31) + this.article.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + Double.hashCode(this.currentAmount)) * 31) + Boolean.hashCode(this.enableDecrease)) * 31;
        List list = this.currentCartProducts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.cartPartnerCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryCode deliveryCode = this.deliveryType;
        return ((((iHashCode3 + (deliveryCode != null ? deliveryCode.hashCode() : 0)) * 31) + this.measure.hashCode()) * 31) + this.buyState.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getCurrentAmount() {
        return this.currentAmount;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getEnableDecrease() {
        return this.enableDecrease;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", partnerCode=" + this.partnerCode + ", article=" + this.article + ", productDetails=" + this.productDetails + ", currentAmount=" + this.currentAmount + ", enableDecrease=" + this.enableDecrease + ", currentCartProducts=" + this.currentCartProducts + ", cartPartnerCode=" + this.cartPartnerCode + ", deliveryType=" + this.deliveryType + ", measure=" + this.measure + ", buyState=" + this.buyState + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.partnerCode);
        dest.writeString(this.article);
        dest.writeParcelable(this.productDetails, flags);
        dest.writeDouble(this.currentAmount);
        dest.writeInt(this.enableDecrease ? 1 : 0);
        List list = this.currentCartProducts;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }
        dest.writeString(this.cartPartnerCode);
        dest.writeParcelable(this.deliveryType, flags);
        dest.writeParcelable(this.measure, flags);
        dest.writeString(this.buyState.name());
    }

    public final State zoijcleaow(boolean isLoading, String partnerCode, String article, RestaurantProductDetails productDetails, double currentAmount, boolean enableDecrease, List currentCartProducts, String cartPartnerCode, DeliveryCode deliveryType, MeasureType measure, zoijcleaow buyState) {
        zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(productDetails, "productDetails");
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(buyState, "buyState");
        return new State(isLoading, partnerCode, article, productDetails, currentAmount, enableDecrease, currentCartProducts, cartPartnerCode, deliveryType, measure, buyState);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, RestaurantProductDetails restaurantProductDetails, double d13, boolean z14, List list, String str3, DeliveryCode deliveryCode, MeasureType measureType, zoijcleaow zoijcleaowVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? "" : str, (i13 & 4) == 0 ? str2 : "", (i13 & 8) != 0 ? new RestaurantProductDetails(null, null, null, 0.0d, null, 0.0d, false, null, null, null, null, null, null, 8191, null) : restaurantProductDetails, (i13 & 16) != 0 ? 1.0d : d13, (i13 & 32) == 0 ? z14 : false, (i13 & 64) != 0 ? null : list, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? deliveryCode : null, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? MeasureType.INSTANCE.zoijcleaow() : measureType, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? zoijcleaow.READY : zoijcleaowVar);
    }
}
