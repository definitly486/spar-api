package ru.myspar.proloyalty.purchases.impl.specific.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.order.Purchase;
import ru.myspar.proloyalty.core.domain.models.order.PurchaseFuture;

/* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001eR\u0011\u0010<\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001eR\u0011\u0010>\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b=\u00107R\u0011\u0010B\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"ru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseArgs;", "args", "", "Lru/myspar/proloyalty/core/domain/models/cart/CartProduct;", "productsInBasket", "Lru/myspar/proloyalty/core/domain/models/order/PurchaseFuture;", "futurePurchases", "Lru/myspar/proloyalty/core/domain/models/order/Purchase;", "purchase", "", "isLoading", "", "cartPartnerCode", "<init>", "(Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseArgs;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/order/PurchaseFuture;Lru/myspar/proloyalty/core/domain/models/order/Purchase;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseArgs;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/order/PurchaseFuture;Lru/myspar/proloyalty/core/domain/models/order/Purchase;ZLjava/lang/String;)Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseArgs;", "eablkybsjg", "()Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseArgs;", "yggfygwlhe", "Ljava/util/List;", "dxjokdxxww", "()Ljava/util/List;", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/order/PurchaseFuture;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/domain/models/order/PurchaseFuture;", "iwizpuwonk", "Lru/myspar/proloyalty/core/domain/models/order/Purchase;", "btonecajqb", "()Lru/myspar/proloyalty/core/domain/models/order/Purchase;", "cqumvgiudr", "Z", "wflxmlrfwp", "()Z", "esjtqupxsv", "Ljava/lang/String;", "lqeggnwhkg", "getId", "id", "gxszxtbevo", "buyIsAvailable", "Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseStore$State$zoijcleaow;", "gtknphoqwx", "()Lru/myspar/proloyalty/purchases/impl/specific/domain/store/SpecificPurchaseStore$State$zoijcleaow;", "purchaseType", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartPartnerCode;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Purchase purchase;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final PurchaseFuture futurePurchases;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsInBasket;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpecificPurchaseArgs args;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            SpecificPurchaseArgs specificPurchaseArgsCreateFromParcel = SpecificPurchaseArgs.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(specificPurchaseArgsCreateFromParcel, arrayList, (PurchaseFuture) parcel.readParcelable(State.class.getClassLoader()), (Purchase) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseStore$State$ppxfxbqfkf */
    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f99851iobyxmoadg;

        static {
            int[] iArr = new int[wz0.iobyxmoadg.values().length];
            try {
                iArr[wz0.iobyxmoadg.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wz0.iobyxmoadg.COMPILATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wz0.iobyxmoadg.SHOW_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f99851iobyxmoadg = iArr;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.domain.store.SpecificPurchaseStore$State$zoijcleaow */
    public enum zoijcleaow {
        DEFAULT,
        COMPILATION;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f99852iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public State(SpecificPurchaseArgs args, List productsInBasket, PurchaseFuture purchaseFuture, Purchase purchase, boolean z13, String str) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(productsInBasket, "productsInBasket");
        this.args = args;
        this.productsInBasket = productsInBasket;
        this.futurePurchases = purchaseFuture;
        this.purchase = purchase;
        this.isLoading = z13;
        this.cartPartnerCode = str;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, SpecificPurchaseArgs specificPurchaseArgs, List list, PurchaseFuture purchaseFuture, Purchase purchase, boolean z13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            specificPurchaseArgs = state.args;
        }
        if ((i13 & 2) != 0) {
            list = state.productsInBasket;
        }
        List list2 = list;
        if ((i13 & 4) != 0) {
            purchaseFuture = state.futurePurchases;
        }
        PurchaseFuture purchaseFuture2 = purchaseFuture;
        if ((i13 & 8) != 0) {
            purchase = state.purchase;
        }
        Purchase purchase2 = purchase;
        if ((i13 & 16) != 0) {
            z13 = state.isLoading;
        }
        boolean z14 = z13;
        if ((i13 & 32) != 0) {
            str = state.cartPartnerCode;
        }
        return state.zoijcleaow(specificPurchaseArgs, list2, purchaseFuture2, purchase2, z14, str);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final Purchase getPurchase() {
        return this.purchase;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final List getProductsInBasket() {
        return this.productsInBasket;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final SpecificPurchaseArgs getArgs() {
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
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && zdlpuopuiu.eablkybsjg(this.productsInBasket, state.productsInBasket) && zdlpuopuiu.eablkybsjg(this.futurePurchases, state.futurePurchases) && zdlpuopuiu.eablkybsjg(this.purchase, state.purchase) && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.cartPartnerCode, state.cartPartnerCode);
    }

    public final String getId() {
        return this.args.getOrderId();
    }

    public final zoijcleaow gtknphoqwx() {
        int i13 = ppxfxbqfkf.f99851iobyxmoadg[this.args.getFlow().ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return zoijcleaow.COMPILATION;
            }
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return zoijcleaow.DEFAULT;
    }

    public final boolean gxszxtbevo() {
        int i13 = ppxfxbqfkf.f99851iobyxmoadg[this.args.getFlow().ordinal()];
        if (i13 == 1 || i13 == 2) {
            return true;
        }
        if (i13 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        int iHashCode = ((this.args.hashCode() * 31) + this.productsInBasket.hashCode()) * 31;
        PurchaseFuture purchaseFuture = this.futurePurchases;
        int iHashCode2 = (iHashCode + (purchaseFuture == null ? 0 : purchaseFuture.hashCode())) * 31;
        Purchase purchase = this.purchase;
        int iHashCode3 = (((iHashCode2 + (purchase == null ? 0 : purchase.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.cartPartnerCode;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getCartPartnerCode() {
        return this.cartPartnerCode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final PurchaseFuture getFuturePurchases() {
        return this.futurePurchases;
    }

    public String toString() {
        return "State(args=" + this.args + ", productsInBasket=" + this.productsInBasket + ", futurePurchases=" + this.futurePurchases + ", purchase=" + this.purchase + ", isLoading=" + this.isLoading + ", cartPartnerCode=" + this.cartPartnerCode + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.args.writeToParcel(dest, flags);
        List list = this.productsInBasket;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.futurePurchases, flags);
        dest.writeParcelable(this.purchase, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.cartPartnerCode);
    }

    public final State zoijcleaow(SpecificPurchaseArgs args, List productsInBasket, PurchaseFuture futurePurchases, Purchase purchase, boolean isLoading, String cartPartnerCode) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(productsInBasket, "productsInBasket");
        return new State(args, productsInBasket, futurePurchases, purchase, isLoading, cartPartnerCode);
    }

    public /* synthetic */ State(SpecificPurchaseArgs specificPurchaseArgs, List list, PurchaseFuture purchaseFuture, Purchase purchase, boolean z13, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this(specificPurchaseArgs, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 4) != 0 ? null : purchaseFuture, (i13 & 8) != 0 ? null : purchase, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? null : str);
    }
}
