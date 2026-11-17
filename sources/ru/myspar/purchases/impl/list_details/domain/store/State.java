package ru.myspar.purchases.impl.list_details.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.purchases.api.model.PurchasesListDetailsArgs;

/* JADX INFO: renamed from: ru.myspar.purchases.impl.list_details.domain.store.PurchasesListDetailsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u009c\u0001\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bHÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bH×\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H×\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b/\u0010GR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\bI\u0010GR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\b6\u0010GR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b8\u0006¢\u0006\f\n\u0004\bK\u0010<\u001a\u0004\bL\u0010>¨\u0006M"}, d2 = {"ru/myspar/purchases/impl/list_details/domain/store/PurchasesListDetailsStore$State", "Landroid/os/Parcelable;", "Lru/myspar/purchases/api/model/PurchasesListDetailsArgs;", "args", "", "listName", "", "sum", "", "count", ImagesContract.URL, "", "Lru/myspar/purchases_list/api/models/PurchaseProduct;", "productsBuy", "productsBought", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "", "isLoading", "isEmptyViewVisible", "isShareListFeatureEnabled", "Lru/myspar/core/domain/models/cart/ProductData;", "productDataList", "<init>", "(Lru/myspar/purchases/api/model/PurchasesListDetailsArgs;Ljava/lang/String;DILjava/lang/String;Ljava/util/List;Ljava/util/List;Lru/myspar/core/models/delivery/DeliveryCode;ZZZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/purchases/impl/list_details/domain/store/PurchasesListDetailsStore$State;", "zoijcleaow", "(Lru/myspar/purchases/api/model/PurchasesListDetailsArgs;Ljava/lang/String;DILjava/lang/String;Ljava/util/List;Ljava/util/List;Lru/myspar/core/models/delivery/DeliveryCode;ZZZLjava/util/List;)Lru/myspar/purchases/impl/list_details/domain/store/PurchasesListDetailsStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/purchases/api/model/PurchasesListDetailsArgs;", "eablkybsjg", "()Lru/myspar/purchases/api/model/PurchasesListDetailsArgs;", "yggfygwlhe", "Ljava/lang/String;", "nufgyqmvbu", "jyumaefscl", "D", "wflxmlrfwp", "()D", "iwizpuwonk", "I", "gxszxtbevo", "cqumvgiudr", "agtfadlqog", "esjtqupxsv", "Ljava/util/List;", "gtknphoqwx", "()Ljava/util/List;", "lereixgezr", "btonecajqb", "pmvmpeiblj", "Lru/myspar/core/models/delivery/DeliveryCode;", "lqeggnwhkg", "()Lru/myspar/core/models/delivery/DeliveryCode;", "zynmafqrjb", "Z", "()Z", "istkbnxepw", "oxmwwwfdhm", "cdpycssgdh", "yadqdtsiqt", "dxjokdxxww", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShareListFeatureEnabled;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsBuy;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmptyViewVisible;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final int count;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsBought;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productDataList;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String listName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final PurchasesListDetailsArgs args;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_details.domain.store.PurchasesListDetailsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            PurchasesListDetailsArgs purchasesListDetailsArgs = (PurchasesListDetailsArgs) parcel.readParcelable(State.class.getClassLoader());
            String string = parcel.readString();
            double d13 = parcel.readDouble();
            int i13 = parcel.readInt();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int i15 = 0;
            for (int i16 = 0; i16 != i14; i16++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(State.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            int i19 = parcel.readInt();
            boolean z16 = z15;
            ArrayList arrayList3 = new ArrayList(i19);
            while (i15 != i19) {
                arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
                i15++;
                i19 = i19;
            }
            return new State(purchasesListDetailsArgs, string, d13, i13, string2, arrayList, arrayList2, deliveryCode, z13, z14, z16, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(PurchasesListDetailsArgs args, String listName, double d13, int i13, String url, List productsBuy, List productsBought, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, List productDataList) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(listName, "listName");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(productsBuy, "productsBuy");
        zdlpuopuiu.btonecajqb(productsBought, "productsBought");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        this.args = args;
        this.listName = listName;
        this.sum = d13;
        this.count = i13;
        this.url = url;
        this.productsBuy = productsBuy;
        this.productsBought = productsBought;
        this.deliveryCode = deliveryCode;
        this.isLoading = z13;
        this.isEmptyViewVisible = z14;
        this.isShareListFeatureEnabled = z15;
        this.productDataList = productDataList;
    }

    /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getProductsBought() {
        return this.productsBought;
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
    public final PurchasesListDetailsArgs getArgs() {
        return this.args;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && zdlpuopuiu.eablkybsjg(this.listName, state.listName) && Double.compare(this.sum, state.sum) == 0 && this.count == state.count && zdlpuopuiu.eablkybsjg(this.url, state.url) && zdlpuopuiu.eablkybsjg(this.productsBuy, state.productsBuy) && zdlpuopuiu.eablkybsjg(this.productsBought, state.productsBought) && this.deliveryCode == state.deliveryCode && this.isLoading == state.isLoading && this.isEmptyViewVisible == state.isEmptyViewVisible && this.isShareListFeatureEnabled == state.isShareListFeatureEnabled && zdlpuopuiu.eablkybsjg(this.productDataList, state.productDataList);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final List getProductsBuy() {
        return this.productsBuy;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.args.hashCode() * 31) + this.listName.hashCode()) * 31) + Double.hashCode(this.sum)) * 31) + Integer.hashCode(this.count)) * 31) + this.url.hashCode()) * 31) + this.productsBuy.hashCode()) * 31) + this.productsBought.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return ((((((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isEmptyViewVisible)) * 31) + Boolean.hashCode(this.isShareListFeatureEnabled)) * 31) + this.productDataList.hashCode();
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsShareListFeatureEnabled() {
        return this.isShareListFeatureEnabled;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getListName() {
        return this.listName;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsEmptyViewVisible() {
        return this.isEmptyViewVisible;
    }

    public String toString() {
        return "State(args=" + this.args + ", listName=" + this.listName + ", sum=" + this.sum + ", count=" + this.count + ", url=" + this.url + ", productsBuy=" + this.productsBuy + ", productsBought=" + this.productsBought + ", deliveryCode=" + this.deliveryCode + ", isLoading=" + this.isLoading + ", isEmptyViewVisible=" + this.isEmptyViewVisible + ", isShareListFeatureEnabled=" + this.isShareListFeatureEnabled + ", productDataList=" + this.productDataList + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.args, flags);
        dest.writeString(this.listName);
        dest.writeDouble(this.sum);
        dest.writeInt(this.count);
        dest.writeString(this.url);
        List list = this.productsBuy;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        List list2 = this.productsBought;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.deliveryCode, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isEmptyViewVisible ? 1 : 0);
        dest.writeInt(this.isShareListFeatureEnabled ? 1 : 0);
        List list3 = this.productDataList;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final State zoijcleaow(PurchasesListDetailsArgs args, String listName, double sum, int count, String url, List productsBuy, List productsBought, DeliveryCode deliveryCode, boolean isLoading, boolean isEmptyViewVisible, boolean isShareListFeatureEnabled, List productDataList) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(listName, "listName");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(productsBuy, "productsBuy");
        zdlpuopuiu.btonecajqb(productsBought, "productsBought");
        zdlpuopuiu.btonecajqb(productDataList, "productDataList");
        return new State(args, listName, sum, count, url, productsBuy, productsBought, deliveryCode, isLoading, isEmptyViewVisible, isShareListFeatureEnabled, productDataList);
    }

    public /* synthetic */ State(PurchasesListDetailsArgs purchasesListDetailsArgs, String str, double d13, int i13, String str2, List list, List list2, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, List list3, int i14, gtknphoqwx gtknphoqwxVar) {
        this(purchasesListDetailsArgs, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0.0d : d13, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) == 0 ? str2 : "", (i14 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : deliveryCode, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z13, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? z15 : false, (i14 & 2048) != 0 ? jyumaefscl.wflxmlrfwp() : list3);
    }
}
