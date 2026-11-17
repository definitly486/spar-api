package ru.myspar.cart.impl.domain.store;

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
import ru.myspar.cart.impl.utils.BonusesEditorState;
import ru.myspar.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.core.domain.models.LoadInfo;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;
import t00.dxjokdxxww;

/* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.CartStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020 H\u0007¢\u0006\u0004\b%\u0010&Jº\u0001\u0010(\u001a\u00020'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*H×\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020 H×\u0001¢\u0006\u0004\b-\u0010&J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.H×\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b\u0005\u00105R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00103\u001a\u0004\bU\u00105R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0006¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010TR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u00103\u001a\u0004\b8\u00105¨\u0006]"}, d2 = {"ru/myspar/cart/impl/domain/store/CartStore$State", "Landroid/os/Parcelable;", "", "isLoading", "isPartnerCart", "isOrderSend", "isCartFetched", "Lru/myspar/core/domain/models/cart/Cart;", "cart", "Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "restaurant", "Lt00/dxjokdxxww;", "warningState", "Lru/myspar/common/view/promo_code/PromoCodeEditorState;", "promoCodeEditorState", "Lru/myspar/cart/impl/utils/BonusesEditorState;", "bonusesEditorState", "Lru/myspar/core/domain/models/LoadInfo;", "loadInfo", "", "Lru/myspar/core/domain/models/cart/ProductUIData;", "productDataList", "isRemoveProductLoading", "Lru/myspar/core/domain/models/catalog/ProductRecommendationsBlock;", "recommendations", "Lru/myspar/cart/impl/domain/store/CartStore$CartDialogType;", "currentDialogType", "isNeededScrollContentToTop", "<init>", "(ZZZZLru/myspar/core/domain/models/cart/Cart;Lru/myspar/core/domain/models/restaurants/RestaurantDetails;Lt00/dxjokdxxww;Lru/myspar/common/view/promo_code/PromoCodeEditorState;Lru/myspar/cart/impl/utils/BonusesEditorState;Lru/myspar/core/domain/models/LoadInfo;Ljava/util/List;ZLjava/util/List;Lru/myspar/cart/impl/domain/store/CartStore$CartDialogType;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/cart/impl/domain/store/CartStore$State;", "zoijcleaow", "(ZZZZLru/myspar/core/domain/models/cart/Cart;Lru/myspar/core/domain/models/restaurants/RestaurantDetails;Lt00/dxjokdxxww;Lru/myspar/common/view/promo_code/PromoCodeEditorState;Lru/myspar/cart/impl/utils/BonusesEditorState;Lru/myspar/core/domain/models/LoadInfo;Ljava/util/List;ZLjava/util/List;Lru/myspar/cart/impl/domain/store/CartStore$CartDialogType;Z)Lru/myspar/cart/impl/domain/store/CartStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "yggfygwlhe", "()Z", "esjtqupxsv", "jyumaefscl", "iwizpuwonk", "oxmwwwfdhm", "cqumvgiudr", "Lru/myspar/core/domain/models/cart/Cart;", "gxszxtbevo", "()Lru/myspar/core/domain/models/cart/Cart;", "Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "getRestaurant", "()Lru/myspar/core/domain/models/restaurants/RestaurantDetails;", "lereixgezr", "Lt00/dxjokdxxww;", "wflxmlrfwp", "()Lt00/dxjokdxxww;", "pmvmpeiblj", "Lru/myspar/common/view/promo_code/PromoCodeEditorState;", "btonecajqb", "()Lru/myspar/common/view/promo_code/PromoCodeEditorState;", "zynmafqrjb", "Lru/myspar/cart/impl/utils/BonusesEditorState;", "eablkybsjg", "()Lru/myspar/cart/impl/utils/BonusesEditorState;", "istkbnxepw", "Lru/myspar/core/domain/models/LoadInfo;", "nufgyqmvbu", "()Lru/myspar/core/domain/models/LoadInfo;", "cdpycssgdh", "Ljava/util/List;", "dxjokdxxww", "()Ljava/util/List;", "yadqdtsiqt", "iozdgvuglv", "gtknphoqwx", "lmojexxdyd", "Lru/myspar/cart/impl/domain/store/CartStore$CartDialogType;", "lqeggnwhkg", "()Lru/myspar/cart/impl/domain/store/CartStore$CartDialogType;", "wwaezpbzkn", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productDataList;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cart cart;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final RestaurantDetails restaurant;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List recommendations;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final LoadInfo loadInfo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCartFetched;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderSend;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final dxjokdxxww warningState;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartStore$CartDialogType currentDialogType;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final PromoCodeEditorState promoCodeEditorState;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeededScrollContentToTop;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRemoveProductLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPartnerCart;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final BonusesEditorState bonusesEditorState;

    /* JADX INFO: renamed from: ru.myspar.cart.impl.domain.store.CartStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            Cart cart = (Cart) parcel.readParcelable(State.class.getClassLoader());
            RestaurantDetails restaurantDetails = (RestaurantDetails) parcel.readParcelable(State.class.getClassLoader());
            dxjokdxxww dxjokdxxwwVarValueOf = parcel.readInt() == 0 ? null : dxjokdxxww.valueOf(parcel.readString());
            PromoCodeEditorState promoCodeEditorState = (PromoCodeEditorState) parcel.readParcelable(State.class.getClassLoader());
            BonusesEditorState bonusesEditorStateCreateFromParcel = BonusesEditorState.CREATOR.createFromParcel(parcel);
            LoadInfo loadInfo = (LoadInfo) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            boolean z17 = parcel.readInt() != 0;
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            boolean z18 = z17;
            int i16 = 0;
            while (i16 != i15) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
                i16++;
                i15 = i15;
            }
            return new State(z13, z14, z15, z16, cart, restaurantDetails, dxjokdxxwwVarValueOf, promoCodeEditorState, bonusesEditorStateCreateFromParcel, loadInfo, arrayList, z18, arrayList2, (CartStore$CartDialogType) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, boolean z14, boolean z15, boolean z16, Cart cart, RestaurantDetails restaurantDetails, dxjokdxxww dxjokdxxwwVar, PromoCodeEditorState promoCodeEditorState, BonusesEditorState bonusesEditorState, LoadInfo loadInfo, List productDataList, boolean z17, List recommendations, CartStore$CartDialogType cartStore$CartDialogType, boolean z18) {
        zdlpuopuiu.btonecajqb(cart, "cart");
        zdlpuopuiu.btonecajqb(promoCodeEditorState, "promoCodeEditorState");
        zdlpuopuiu.btonecajqb(bonusesEditorState, "bonusesEditorState");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        this.isLoading = z13;
        this.isPartnerCart = z14;
        this.isOrderSend = z15;
        this.isCartFetched = z16;
        this.cart = cart;
        this.restaurant = restaurantDetails;
        this.warningState = dxjokdxxwwVar;
        this.promoCodeEditorState = promoCodeEditorState;
        this.bonusesEditorState = bonusesEditorState;
        this.loadInfo = loadInfo;
        this.productDataList = productDataList;
        this.isRemoveProductLoading = z17;
        this.recommendations = recommendations;
        this.currentDialogType = cartStore$CartDialogType;
        this.isNeededScrollContentToTop = z18;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final PromoCodeEditorState getPromoCodeEditorState() {
        return this.promoCodeEditorState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getProductDataList() {
        return this.productDataList;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final BonusesEditorState getBonusesEditorState() {
        return this.bonusesEditorState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && this.isPartnerCart == state.isPartnerCart && this.isOrderSend == state.isOrderSend && this.isCartFetched == state.isCartFetched && zdlpuopuiu.eablkybsjg(this.cart, state.cart) && zdlpuopuiu.eablkybsjg(this.restaurant, state.restaurant) && this.warningState == state.warningState && zdlpuopuiu.eablkybsjg(this.promoCodeEditorState, state.promoCodeEditorState) && zdlpuopuiu.eablkybsjg(this.bonusesEditorState, state.bonusesEditorState) && zdlpuopuiu.eablkybsjg(this.loadInfo, state.loadInfo) && zdlpuopuiu.eablkybsjg(this.productDataList, state.productDataList) && this.isRemoveProductLoading == state.isRemoveProductLoading && zdlpuopuiu.eablkybsjg(this.recommendations, state.recommendations) && zdlpuopuiu.eablkybsjg(this.currentDialogType, state.currentDialogType) && this.isNeededScrollContentToTop == state.isNeededScrollContentToTop;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsPartnerCart() {
        return this.isPartnerCart;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final List getRecommendations() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Cart getCart() {
        return this.cart;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isPartnerCart)) * 31) + Boolean.hashCode(this.isOrderSend)) * 31) + Boolean.hashCode(this.isCartFetched)) * 31) + this.cart.hashCode()) * 31;
        RestaurantDetails restaurantDetails = this.restaurant;
        int iHashCode2 = (iHashCode + (restaurantDetails == null ? 0 : restaurantDetails.hashCode())) * 31;
        dxjokdxxww dxjokdxxwwVar = this.warningState;
        int iHashCode3 = (((((iHashCode2 + (dxjokdxxwwVar == null ? 0 : dxjokdxxwwVar.hashCode())) * 31) + this.promoCodeEditorState.hashCode()) * 31) + this.bonusesEditorState.hashCode()) * 31;
        LoadInfo loadInfo = this.loadInfo;
        int iHashCode4 = (((((((iHashCode3 + (loadInfo == null ? 0 : loadInfo.hashCode())) * 31) + this.productDataList.hashCode()) * 31) + Boolean.hashCode(this.isRemoveProductLoading)) * 31) + this.recommendations.hashCode()) * 31;
        CartStore$CartDialogType cartStore$CartDialogType = this.currentDialogType;
        return ((iHashCode4 + (cartStore$CartDialogType != null ? cartStore$CartDialogType.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNeededScrollContentToTop);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsNeededScrollContentToTop() {
        return this.isNeededScrollContentToTop;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final CartStore$CartDialogType getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final LoadInfo getLoadInfo() {
        return this.loadInfo;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsCartFetched() {
        return this.isCartFetched;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", isPartnerCart=" + this.isPartnerCart + ", isOrderSend=" + this.isOrderSend + ", isCartFetched=" + this.isCartFetched + ", cart=" + this.cart + ", restaurant=" + this.restaurant + ", warningState=" + this.warningState + ", promoCodeEditorState=" + this.promoCodeEditorState + ", bonusesEditorState=" + this.bonusesEditorState + ", loadInfo=" + this.loadInfo + ", productDataList=" + this.productDataList + ", isRemoveProductLoading=" + this.isRemoveProductLoading + ", recommendations=" + this.recommendations + ", currentDialogType=" + this.currentDialogType + ", isNeededScrollContentToTop=" + this.isNeededScrollContentToTop + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final dxjokdxxww getWarningState() {
        return this.warningState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isPartnerCart ? 1 : 0);
        dest.writeInt(this.isOrderSend ? 1 : 0);
        dest.writeInt(this.isCartFetched ? 1 : 0);
        dest.writeParcelable(this.cart, flags);
        dest.writeParcelable(this.restaurant, flags);
        dxjokdxxww dxjokdxxwwVar = this.warningState;
        if (dxjokdxxwwVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dxjokdxxwwVar.name());
        }
        dest.writeParcelable(this.promoCodeEditorState, flags);
        this.bonusesEditorState.writeToParcel(dest, flags);
        dest.writeParcelable(this.loadInfo, flags);
        List list = this.productDataList;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.isRemoveProductLoading ? 1 : 0);
        List list2 = this.recommendations;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.currentDialogType, flags);
        dest.writeInt(this.isNeededScrollContentToTop ? 1 : 0);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsRemoveProductLoading() {
        return this.isRemoveProductLoading;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final State zoijcleaow(boolean isLoading, boolean isPartnerCart, boolean isOrderSend, boolean isCartFetched, Cart cart, RestaurantDetails restaurant, dxjokdxxww warningState, PromoCodeEditorState promoCodeEditorState, BonusesEditorState bonusesEditorState, LoadInfo loadInfo, List productDataList, boolean isRemoveProductLoading, List recommendations, CartStore$CartDialogType currentDialogType, boolean isNeededScrollContentToTop) {
        zdlpuopuiu.btonecajqb(cart, "cart");
        zdlpuopuiu.btonecajqb(promoCodeEditorState, "promoCodeEditorState");
        zdlpuopuiu.btonecajqb(bonusesEditorState, "bonusesEditorState");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        return new State(isLoading, isPartnerCart, isOrderSend, isCartFetched, cart, restaurant, warningState, promoCodeEditorState, bonusesEditorState, loadInfo, productDataList, isRemoveProductLoading, recommendations, currentDialogType, isNeededScrollContentToTop);
    }

    public /* synthetic */ State(boolean z13, boolean z14, boolean z15, boolean z16, Cart cart, RestaurantDetails restaurantDetails, dxjokdxxww dxjokdxxwwVar, PromoCodeEditorState promoCodeEditorState, BonusesEditorState bonusesEditorState, LoadInfo loadInfo, List list, boolean z17, List list2, CartStore$CartDialogType cartStore$CartDialogType, boolean z18, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? false : z15, (i13 & 8) != 0 ? false : z16, (i13 & 16) != 0 ? new Cart(0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, 16777215, null) : cart, (i13 & 32) != 0 ? null : restaurantDetails, (i13 & 64) != 0 ? null : dxjokdxxwwVar, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? PromoCodeEditorState.INSTANCE.iobyxmoadg() : promoCodeEditorState, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? BonusesEditorState.INSTANCE.iobyxmoadg() : bonusesEditorState, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : loadInfo, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2048) != 0 ? false : z17, (i13 & 4096) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 8192) == 0 ? cartStore$CartDialogType : null, (i13 & 16384) != 0 ? false : z18);
    }
}
