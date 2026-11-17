package ru.myspar.favorites.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Products;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.FavoritesStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0007¢\u0006\u0004\b$\u0010%JÆ\u0001\u0010'\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00062\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aHÇ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b+\u0010%J\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,H×\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010*R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b:\u0010*R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u00109R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u00107\u001a\u0004\bD\u00109R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b>\u0010GR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bD\u0010L\u001a\u0004\bM\u0010%R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\b\u0014\u00109R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b@\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"ru/myspar/favorites/impl/domain/store/FavoritesStore$State", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/product/Products;", "products", "", "counterMessageProductId", "", "expandCounter", "counterMessage", "autoHideCounterMessage", "selectedFilterId", "isRefreshLayoutLoading", "isFullScreenLoading", "isFilterVisible", "Lru/myspar/favorites/impl/domain/store/FavoritesStore$State$zoijcleaow;", "warningState", "Lru/myspar/core/models/paging/Paging;", "paging", "", "currentPage", "isOrderDataCompleted", "", "Lru/myspar/core/domain/models/cart/ProductUIData;", "productDataList", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "", "changingFavoriteProductsIds", "<init>", "(Lru/myspar/core/domain/models/product/Products;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLru/myspar/favorites/impl/domain/store/FavoritesStore$State$zoijcleaow;Lru/myspar/core/models/paging/Paging;IZLjava/util/List;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/util/Set;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/favorites/impl/domain/store/FavoritesStore$State;", "zoijcleaow", "(Lru/myspar/core/domain/models/product/Products;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZLru/myspar/favorites/impl/domain/store/FavoritesStore$State$zoijcleaow;Lru/myspar/core/models/paging/Paging;IZLjava/util/List;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/util/Set;)Lru/myspar/favorites/impl/domain/store/FavoritesStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/product/Products;", "yggfygwlhe", "()Lru/myspar/core/domain/models/product/Products;", "Ljava/lang/String;", "nufgyqmvbu", "jyumaefscl", "Z", "gtknphoqwx", "()Z", "iwizpuwonk", "lqeggnwhkg", "cqumvgiudr", "eablkybsjg", "esjtqupxsv", "lereixgezr", "lmojexxdyd", "pmvmpeiblj", "iozdgvuglv", "zynmafqrjb", "yadqdtsiqt", "istkbnxepw", "Lru/myspar/favorites/impl/domain/store/FavoritesStore$State$zoijcleaow;", "()Lru/myspar/favorites/impl/domain/store/FavoritesStore$State$zoijcleaow;", "cdpycssgdh", "Lru/myspar/core/models/paging/Paging;", "wflxmlrfwp", "()Lru/myspar/core/models/paging/Paging;", "I", "dxjokdxxww", "Ljava/util/List;", "oxmwwwfdhm", "()Ljava/util/List;", "wwaezpbzkn", "Lru/myspar/core/models/delivery/DeliveryCode;", "btonecajqb", "()Lru/myspar/core/models/delivery/DeliveryCode;", "ylkuphrtab", "Ljava/util/Set;", "gxszxtbevo", "()Ljava/util/Set;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoHideCounterMessage;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedFilterId;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderDataCompleted;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow warningState;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String counterMessage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean expandCounter;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRefreshLayoutLoading;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productDataList;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFullScreenLoading;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String counterMessageProductId;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set changingFavoriteProductsIds;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Products products;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFilterVisible;

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.FavoritesStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            Products products = (Products) parcel.readParcelable(State.class.getClassLoader());
            String string = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            zoijcleaow zoijcleaowVarValueOf = zoijcleaow.valueOf(parcel.readString());
            Paging paging = (Paging) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            boolean z18 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int i15 = 0;
                while (i15 != i14) {
                    arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
                    i15++;
                    i14 = i14;
                }
                arrayList = arrayList2;
            }
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(State.class.getClassLoader());
            int i16 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashSet.add(parcel.readString());
            }
            return new State(products, string, z13, string2, z14, string3, z15, z16, z17, zoijcleaowVarValueOf, paging, i13, z18, arrayList, deliveryCode, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    /* JADX INFO: renamed from: ru.myspar.favorites.impl.domain.store.FavoritesStore$State$zoijcleaow */
    public enum zoijcleaow {
        NO_AUTH,
        EMPTY,
        HIDE;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f88366cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public State(Products products, String str, boolean z13, String str2, boolean z14, String selectedFilterId, boolean z15, boolean z16, boolean z17, zoijcleaow warningState, Paging paging, int i13, boolean z18, List list, DeliveryCode deliveryCode, Set changingFavoriteProductsIds) {
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(selectedFilterId, "selectedFilterId");
        zdlpuopuiu.btonecajqb(warningState, "warningState");
        zdlpuopuiu.btonecajqb(changingFavoriteProductsIds, "changingFavoriteProductsIds");
        this.products = products;
        this.counterMessageProductId = str;
        this.expandCounter = z13;
        this.counterMessage = str2;
        this.autoHideCounterMessage = z14;
        this.selectedFilterId = selectedFilterId;
        this.isRefreshLayoutLoading = z15;
        this.isFullScreenLoading = z16;
        this.isFilterVisible = z17;
        this.warningState = warningState;
        this.paging = paging;
        this.currentPage = i13;
        this.isOrderDataCompleted = z18;
        this.productDataList = list;
        this.deliveryCode = deliveryCode;
        this.changingFavoriteProductsIds = changingFavoriteProductsIds;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getAutoHideCounterMessage() {
        return this.autoHideCounterMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.products, state.products) && zdlpuopuiu.eablkybsjg(this.counterMessageProductId, state.counterMessageProductId) && this.expandCounter == state.expandCounter && zdlpuopuiu.eablkybsjg(this.counterMessage, state.counterMessage) && this.autoHideCounterMessage == state.autoHideCounterMessage && zdlpuopuiu.eablkybsjg(this.selectedFilterId, state.selectedFilterId) && this.isRefreshLayoutLoading == state.isRefreshLayoutLoading && this.isFullScreenLoading == state.isFullScreenLoading && this.isFilterVisible == state.isFilterVisible && this.warningState == state.warningState && zdlpuopuiu.eablkybsjg(this.paging, state.paging) && this.currentPage == state.currentPage && this.isOrderDataCompleted == state.isOrderDataCompleted && zdlpuopuiu.eablkybsjg(this.productDataList, state.productDataList) && this.deliveryCode == state.deliveryCode && zdlpuopuiu.eablkybsjg(this.changingFavoriteProductsIds, state.changingFavoriteProductsIds);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final zoijcleaow getWarningState() {
        return this.warningState;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getExpandCounter() {
        return this.expandCounter;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Set getChangingFavoriteProductsIds() {
        return this.changingFavoriteProductsIds;
    }

    public int hashCode() {
        int iHashCode = this.products.hashCode() * 31;
        String str = this.counterMessageProductId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.expandCounter)) * 31;
        String str2 = this.counterMessage;
        int iHashCode3 = (((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.autoHideCounterMessage)) * 31) + this.selectedFilterId.hashCode()) * 31) + Boolean.hashCode(this.isRefreshLayoutLoading)) * 31) + Boolean.hashCode(this.isFullScreenLoading)) * 31) + Boolean.hashCode(this.isFilterVisible)) * 31) + this.warningState.hashCode()) * 31;
        Paging paging = this.paging;
        int iHashCode4 = (((((iHashCode3 + (paging == null ? 0 : paging.hashCode())) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.isOrderDataCompleted)) * 31;
        List list = this.productDataList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return ((iHashCode5 + (deliveryCode != null ? deliveryCode.hashCode() : 0)) * 31) + this.changingFavoriteProductsIds.hashCode();
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsFullScreenLoading() {
        return this.isFullScreenLoading;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getSelectedFilterId() {
        return this.selectedFilterId;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final boolean getIsRefreshLayoutLoading() {
        return this.isRefreshLayoutLoading;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getCounterMessage() {
        return this.counterMessage;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getCounterMessageProductId() {
        return this.counterMessageProductId;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final List getProductDataList() {
        return this.productDataList;
    }

    public String toString() {
        return "State(products=" + this.products + ", counterMessageProductId=" + this.counterMessageProductId + ", expandCounter=" + this.expandCounter + ", counterMessage=" + this.counterMessage + ", autoHideCounterMessage=" + this.autoHideCounterMessage + ", selectedFilterId=" + this.selectedFilterId + ", isRefreshLayoutLoading=" + this.isRefreshLayoutLoading + ", isFullScreenLoading=" + this.isFullScreenLoading + ", isFilterVisible=" + this.isFilterVisible + ", warningState=" + this.warningState + ", paging=" + this.paging + ", currentPage=" + this.currentPage + ", isOrderDataCompleted=" + this.isOrderDataCompleted + ", productDataList=" + this.productDataList + ", deliveryCode=" + this.deliveryCode + ", changingFavoriteProductsIds=" + this.changingFavoriteProductsIds + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.products, flags);
        dest.writeString(this.counterMessageProductId);
        dest.writeInt(this.expandCounter ? 1 : 0);
        dest.writeString(this.counterMessage);
        dest.writeInt(this.autoHideCounterMessage ? 1 : 0);
        dest.writeString(this.selectedFilterId);
        dest.writeInt(this.isRefreshLayoutLoading ? 1 : 0);
        dest.writeInt(this.isFullScreenLoading ? 1 : 0);
        dest.writeInt(this.isFilterVisible ? 1 : 0);
        dest.writeString(this.warningState.name());
        dest.writeParcelable(this.paging, flags);
        dest.writeInt(this.currentPage);
        dest.writeInt(this.isOrderDataCompleted ? 1 : 0);
        List list = this.productDataList;
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
        dest.writeParcelable(this.deliveryCode, flags);
        Set set = this.changingFavoriteProductsIds;
        dest.writeInt(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            dest.writeString((String) it2.next());
        }
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsFilterVisible() {
        return this.isFilterVisible;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final Products getProducts() {
        return this.products;
    }

    public final State zoijcleaow(Products products, String counterMessageProductId, boolean expandCounter, String counterMessage, boolean autoHideCounterMessage, String selectedFilterId, boolean isRefreshLayoutLoading, boolean isFullScreenLoading, boolean isFilterVisible, zoijcleaow warningState, Paging paging, int currentPage, boolean isOrderDataCompleted, List productDataList, DeliveryCode deliveryCode, Set changingFavoriteProductsIds) {
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(selectedFilterId, "selectedFilterId");
        zdlpuopuiu.btonecajqb(warningState, "warningState");
        zdlpuopuiu.btonecajqb(changingFavoriteProductsIds, "changingFavoriteProductsIds");
        return new State(products, counterMessageProductId, expandCounter, counterMessage, autoHideCounterMessage, selectedFilterId, isRefreshLayoutLoading, isFullScreenLoading, isFilterVisible, warningState, paging, currentPage, isOrderDataCompleted, productDataList, deliveryCode, changingFavoriteProductsIds);
    }

    public /* synthetic */ State(Products products, String str, boolean z13, String str2, boolean z14, String str3, boolean z15, boolean z16, boolean z17, zoijcleaow zoijcleaowVar, Paging paging, int i13, boolean z18, List list, DeliveryCode deliveryCode, Set set, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? new Products(null, null, null, false, 15, null) : products, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? false : z13, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? "FAVORITE_ITEM_ALL_ID" : str3, (i14 & 64) != 0 ? false : z15, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z16, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z17, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? zoijcleaow.HIDE : zoijcleaowVar, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : paging, (i14 & 2048) == 0 ? i13 : 1, (i14 & 4096) == 0 ? z18 : false, (i14 & 8192) != 0 ? null : list, (i14 & 16384) != 0 ? null : deliveryCode, (i14 & 32768) != 0 ? ikoacuggdj.eablkybsjg() : set);
    }
}
