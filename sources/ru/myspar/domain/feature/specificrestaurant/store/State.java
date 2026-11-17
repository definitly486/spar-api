package ru.myspar.domain.feature.specificrestaurant.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: renamed from: ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0007¢\u0006\u0004\b$\u0010%JØ\u0001\u0010'\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0016H×\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b+\u0010%J\u001a\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010,H×\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b:\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\b\u000e\u00103R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b2\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b5\u0010Q\u001a\u0004\bR\u0010*R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u0010=R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010*R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\b4\u0010*¨\u0006X"}, d2 = {"ru/myspar/domain/feature/specificrestaurant/store/SpecificRestaurantStore$State", "Landroid/os/Parcelable;", "", "isLoading", "isRestaurantVisible", "Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "restaurantDetails", "", "Lru/myspar/core/domain/models/BaseProduct;", "products", "Lru/myspar/core/domain/models/restaurants/RestaurantSection;", "sections", "selectedSection", "restaurant", "isOrderDataCompleted", "productList", "", "currentPage", "Lru/myspar/core/models/paging/Paging;", "paging", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryType", "", "partnerCode", "Lru/myspar/core/domain/models/cart/CartProduct;", "currentCartProducts", "catalogSectionId", "restaurantId", "<init>", "(ZZLru/myspar/core/domain/models/restaurants/RestaurantDetails;Ljava/util/List;Ljava/util/List;Lru/myspar/core/domain/models/restaurants/RestaurantSection;Lru/myspar/core/domain/models/restaurants/RestaurantDetails;ZLjava/util/List;ILru/myspar/core/models/paging/Paging;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/specificrestaurant/store/SpecificRestaurantStore$State;", "zoijcleaow", "(ZZLru/myspar/core/domain/models/restaurants/RestaurantDetails;Ljava/util/List;Ljava/util/List;Lru/myspar/core/domain/models/restaurants/RestaurantSection;Lru/myspar/core/domain/models/restaurants/RestaurantDetails;ZLjava/util/List;ILru/myspar/core/models/paging/Paging;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lru/myspar/domain/feature/specificrestaurant/store/SpecificRestaurantStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "yadqdtsiqt", "()Z", "yggfygwlhe", "iozdgvuglv", "jyumaefscl", "Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "oxmwwwfdhm", "()Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "iwizpuwonk", "Ljava/util/List;", "gtknphoqwx", "()Ljava/util/List;", "cqumvgiudr", "esjtqupxsv", "Lru/myspar/core/domain/models/restaurants/RestaurantSection;", "()Lru/myspar/core/domain/models/restaurants/RestaurantSection;", "lereixgezr", "wflxmlrfwp", "pmvmpeiblj", "zynmafqrjb", "btonecajqb", "istkbnxepw", "I", "lqeggnwhkg", "cdpycssgdh", "Lru/myspar/core/models/paging/Paging;", "dxjokdxxww", "()Lru/myspar/core/models/paging/Paging;", "Lru/myspar/core/models/delivery/DeliveryCode;", "nufgyqmvbu", "()Lru/myspar/core/models/delivery/DeliveryCode;", "Ljava/lang/String;", "getPartnerCode", "lmojexxdyd", "gxszxtbevo", "wwaezpbzkn", "eablkybsjg", "ylkuphrtab", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List sections;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestaurantSection selectedSection;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCode;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List products;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestaurantDetails restaurantDetails;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestaurantDetails restaurant;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final List currentCartProducts;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderDataCompleted;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String catalogSectionId;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryType;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRestaurantVisible;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final String restaurantId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productList;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            RestaurantDetails restaurantDetails = (RestaurantDetails) parcel.readParcelable(State.class.getClassLoader());
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            RestaurantSection restaurantSection = (RestaurantSection) parcel.readParcelable(State.class.getClassLoader());
            RestaurantDetails restaurantDetails2 = (RestaurantDetails) parcel.readParcelable(State.class.getClassLoader());
            boolean z15 = parcel.readInt() != 0;
            int i18 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                arrayList4.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i23 = parcel.readInt();
            Paging paging = (Paging) parcel.readParcelable(State.class.getClassLoader());
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(State.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i24);
                while (i13 != i24) {
                    arrayList5.add(parcel.readParcelable(State.class.getClassLoader()));
                    i13++;
                    i24 = i24;
                }
                arrayList = arrayList5;
            }
            return new State(z13, z14, restaurantDetails, arrayList2, arrayList3, restaurantSection, restaurantDetails2, z15, arrayList4, i23, paging, deliveryCode, string, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, boolean z14, RestaurantDetails restaurantDetails, List products, List sections, RestaurantSection restaurantSection, RestaurantDetails restaurantDetails2, boolean z15, List productList, int i13, Paging paging, DeliveryCode deliveryCode, String str, List list, String str2, String restaurantId) {
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(sections, "sections");
        zdlpuopuiu.btonecajqb(productList, "productList");
        zdlpuopuiu.btonecajqb(restaurantId, "restaurantId");
        this.isLoading = z13;
        this.isRestaurantVisible = z14;
        this.restaurantDetails = restaurantDetails;
        this.products = products;
        this.sections = sections;
        this.selectedSection = restaurantSection;
        this.restaurant = restaurantDetails2;
        this.isOrderDataCompleted = z15;
        this.productList = productList;
        this.currentPage = i13;
        this.paging = paging;
        this.deliveryType = deliveryCode;
        this.partnerCode = str;
        this.currentCartProducts = list;
        this.catalogSectionId = str2;
        this.restaurantId = restaurantId;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getProductList() {
        return this.productList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCatalogSectionId() {
        return this.catalogSectionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && this.isRestaurantVisible == state.isRestaurantVisible && zdlpuopuiu.eablkybsjg(this.restaurantDetails, state.restaurantDetails) && zdlpuopuiu.eablkybsjg(this.products, state.products) && zdlpuopuiu.eablkybsjg(this.sections, state.sections) && zdlpuopuiu.eablkybsjg(this.selectedSection, state.selectedSection) && zdlpuopuiu.eablkybsjg(this.restaurant, state.restaurant) && this.isOrderDataCompleted == state.isOrderDataCompleted && zdlpuopuiu.eablkybsjg(this.productList, state.productList) && this.currentPage == state.currentPage && zdlpuopuiu.eablkybsjg(this.paging, state.paging) && this.deliveryType == state.deliveryType && zdlpuopuiu.eablkybsjg(this.partnerCode, state.partnerCode) && zdlpuopuiu.eablkybsjg(this.currentCartProducts, state.currentCartProducts) && zdlpuopuiu.eablkybsjg(this.catalogSectionId, state.catalogSectionId) && zdlpuopuiu.eablkybsjg(this.restaurantId, state.restaurantId);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final RestaurantSection getSelectedSection() {
        return this.selectedSection;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getCurrentCartProducts() {
        return this.currentCartProducts;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRestaurantVisible)) * 31;
        RestaurantDetails restaurantDetails = this.restaurantDetails;
        int iHashCode2 = (((((iHashCode + (restaurantDetails == null ? 0 : restaurantDetails.hashCode())) * 31) + this.products.hashCode()) * 31) + this.sections.hashCode()) * 31;
        RestaurantSection restaurantSection = this.selectedSection;
        int iHashCode3 = (iHashCode2 + (restaurantSection == null ? 0 : restaurantSection.hashCode())) * 31;
        RestaurantDetails restaurantDetails2 = this.restaurant;
        int iHashCode4 = (((((((iHashCode3 + (restaurantDetails2 == null ? 0 : restaurantDetails2.hashCode())) * 31) + Boolean.hashCode(this.isOrderDataCompleted)) * 31) + this.productList.hashCode()) * 31) + Integer.hashCode(this.currentPage)) * 31;
        Paging paging = this.paging;
        int iHashCode5 = (iHashCode4 + (paging == null ? 0 : paging.hashCode())) * 31;
        DeliveryCode deliveryCode = this.deliveryType;
        int iHashCode6 = (iHashCode5 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        String str = this.partnerCode;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.currentCartProducts;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.catalogSectionId;
        return ((iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.restaurantId.hashCode();
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsRestaurantVisible() {
        return this.isRestaurantVisible;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final DeliveryCode getDeliveryType() {
        return this.deliveryType;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final RestaurantDetails getRestaurantDetails() {
        return this.restaurantDetails;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", isRestaurantVisible=" + this.isRestaurantVisible + ", restaurantDetails=" + this.restaurantDetails + ", products=" + this.products + ", sections=" + this.sections + ", selectedSection=" + this.selectedSection + ", restaurant=" + this.restaurant + ", isOrderDataCompleted=" + this.isOrderDataCompleted + ", productList=" + this.productList + ", currentPage=" + this.currentPage + ", paging=" + this.paging + ", deliveryType=" + this.deliveryType + ", partnerCode=" + this.partnerCode + ", currentCartProducts=" + this.currentCartProducts + ", catalogSectionId=" + this.catalogSectionId + ", restaurantId=" + this.restaurantId + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final RestaurantDetails getRestaurant() {
        return this.restaurant;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isRestaurantVisible ? 1 : 0);
        dest.writeParcelable(this.restaurantDetails, flags);
        List list = this.products;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        List list2 = this.sections;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.selectedSection, flags);
        dest.writeParcelable(this.restaurant, flags);
        dest.writeInt(this.isOrderDataCompleted ? 1 : 0);
        List list3 = this.productList;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
        dest.writeInt(this.currentPage);
        dest.writeParcelable(this.paging, flags);
        dest.writeParcelable(this.deliveryType, flags);
        dest.writeString(this.partnerCode);
        List list4 = this.currentCartProducts;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeParcelable((Parcelable) it4.next(), flags);
            }
        }
        dest.writeString(this.catalogSectionId);
        dest.writeString(this.restaurantId);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getRestaurantId() {
        return this.restaurantId;
    }

    public final State zoijcleaow(boolean isLoading, boolean isRestaurantVisible, RestaurantDetails restaurantDetails, List products, List sections, RestaurantSection selectedSection, RestaurantDetails restaurant, boolean isOrderDataCompleted, List productList, int currentPage, Paging paging, DeliveryCode deliveryType, String partnerCode, List currentCartProducts, String catalogSectionId, String restaurantId) {
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(sections, "sections");
        zdlpuopuiu.btonecajqb(productList, "productList");
        zdlpuopuiu.btonecajqb(restaurantId, "restaurantId");
        return new State(isLoading, isRestaurantVisible, restaurantDetails, products, sections, selectedSection, restaurant, isOrderDataCompleted, productList, currentPage, paging, deliveryType, partnerCode, currentCartProducts, catalogSectionId, restaurantId);
    }

    public /* synthetic */ State(boolean z13, boolean z14, RestaurantDetails restaurantDetails, List list, List list2, RestaurantSection restaurantSection, RestaurantDetails restaurantDetails2, boolean z15, List list3, int i13, Paging paging, DeliveryCode deliveryCode, String str, List list4, String str2, String str3, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? false : z13, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : restaurantDetails, (i14 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & 32) != 0 ? null : restaurantSection, (i14 & 64) != 0 ? null : restaurantDetails2, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z15, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 0 : i13, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : paging, (i14 & 2048) != 0 ? null : deliveryCode, (i14 & 4096) != 0 ? null : str, (i14 & 8192) != 0 ? null : list4, (i14 & 16384) != 0 ? null : str2, str3);
    }
}
