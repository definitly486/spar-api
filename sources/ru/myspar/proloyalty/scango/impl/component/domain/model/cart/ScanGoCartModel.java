package ru.myspar.proloyalty.scango.impl.component.domain.model.cart;

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
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rH×\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/myspar/proloyalty/scango/impl/component/domain/model/cart/ScanGoCartModel;", "Landroid/os/Parcelable;", "Ljava/time/LocalDateTime;", "sessionExpiresAt", "", "secondsToComplete", "", "shopId", "", "Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "products", "", "totalCost", "", "numberOfProducts", "actionedProduct", "", "isWalletPayNeedVerify", "Lru/myspar/proloyalty/scango/impl/component/domain/model/cart/ScanGoCartReferences;", "cartReferences", "<init>", "(Ljava/time/LocalDateTime;JLjava/lang/String;Ljava/util/List;DILru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;Ljava/lang/Boolean;Lru/myspar/proloyalty/scango/impl/component/domain/model/cart/ScanGoCartReferences;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/time/LocalDateTime;", "nufgyqmvbu", "()Ljava/time/LocalDateTime;", "yggfygwlhe", "J", "lqeggnwhkg", "()J", "jyumaefscl", "Ljava/lang/String;", "dxjokdxxww", "iwizpuwonk", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "cqumvgiudr", "D", "btonecajqb", "()D", "esjtqupxsv", "I", "eablkybsjg", "lereixgezr", "Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "zoijcleaow", "()Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;", "pmvmpeiblj", "Ljava/lang/Boolean;", "gtknphoqwx", "()Ljava/lang/Boolean;", "zynmafqrjb", "Lru/myspar/proloyalty/scango/impl/component/domain/model/cart/ScanGoCartReferences;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/scango/impl/component/domain/model/cart/ScanGoCartReferences;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScanGoCartModel implements Parcelable {
    public static final Parcelable.Creator<ScanGoCartModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalCost;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfProducts;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List products;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopId;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoProductModel actionedProduct;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isWalletPayNeedVerify;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondsToComplete;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime sessionExpiresAt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoCartReferences cartReferences;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScanGoCartModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            long j13 = parcel.readLong();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ScanGoProductModel.CREATOR.createFromParcel(parcel));
            }
            return new ScanGoCartModel(localDateTime, j13, string, arrayList, parcel.readDouble(), parcel.readInt(), parcel.readInt() == 0 ? null : ScanGoProductModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? ScanGoCartReferences.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ScanGoCartModel[] newArray(int i13) {
            return new ScanGoCartModel[i13];
        }
    }

    public ScanGoCartModel(LocalDateTime sessionExpiresAt, long j13, String shopId, List products, double d13, int i13, ScanGoProductModel scanGoProductModel, Boolean bool, ScanGoCartReferences scanGoCartReferences) {
        zdlpuopuiu.btonecajqb(sessionExpiresAt, "sessionExpiresAt");
        zdlpuopuiu.btonecajqb(shopId, "shopId");
        zdlpuopuiu.btonecajqb(products, "products");
        this.sessionExpiresAt = sessionExpiresAt;
        this.secondsToComplete = j13;
        this.shopId = shopId;
        this.products = products;
        this.totalCost = d13;
        this.numberOfProducts = i13;
        this.actionedProduct = scanGoProductModel;
        this.isWalletPayNeedVerify = bool;
        this.cartReferences = scanGoCartReferences;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final double getTotalCost() {
        return this.totalCost;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getNumberOfProducts() {
        return this.numberOfProducts;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanGoCartModel)) {
            return false;
        }
        ScanGoCartModel scanGoCartModel = (ScanGoCartModel) other;
        return zdlpuopuiu.eablkybsjg(this.sessionExpiresAt, scanGoCartModel.sessionExpiresAt) && this.secondsToComplete == scanGoCartModel.secondsToComplete && zdlpuopuiu.eablkybsjg(this.shopId, scanGoCartModel.shopId) && zdlpuopuiu.eablkybsjg(this.products, scanGoCartModel.products) && Double.compare(this.totalCost, scanGoCartModel.totalCost) == 0 && this.numberOfProducts == scanGoCartModel.numberOfProducts && zdlpuopuiu.eablkybsjg(this.actionedProduct, scanGoCartModel.actionedProduct) && zdlpuopuiu.eablkybsjg(this.isWalletPayNeedVerify, scanGoCartModel.isWalletPayNeedVerify) && zdlpuopuiu.eablkybsjg(this.cartReferences, scanGoCartModel.cartReferences);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final Boolean getIsWalletPayNeedVerify() {
        return this.isWalletPayNeedVerify;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.sessionExpiresAt.hashCode() * 31) + Long.hashCode(this.secondsToComplete)) * 31) + this.shopId.hashCode()) * 31) + this.products.hashCode()) * 31) + Double.hashCode(this.totalCost)) * 31) + Integer.hashCode(this.numberOfProducts)) * 31;
        ScanGoProductModel scanGoProductModel = this.actionedProduct;
        int iHashCode2 = (iHashCode + (scanGoProductModel == null ? 0 : scanGoProductModel.hashCode())) * 31;
        Boolean bool = this.isWalletPayNeedVerify;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ScanGoCartReferences scanGoCartReferences = this.cartReferences;
        return iHashCode3 + (scanGoCartReferences != null ? scanGoCartReferences.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final long getSecondsToComplete() {
        return this.secondsToComplete;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final LocalDateTime getSessionExpiresAt() {
        return this.sessionExpiresAt;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final ScanGoCartReferences getCartReferences() {
        return this.cartReferences;
    }

    public String toString() {
        return "ScanGoCartModel(sessionExpiresAt=" + this.sessionExpiresAt + ", secondsToComplete=" + this.secondsToComplete + ", shopId=" + this.shopId + ", products=" + this.products + ", totalCost=" + this.totalCost + ", numberOfProducts=" + this.numberOfProducts + ", actionedProduct=" + this.actionedProduct + ", isWalletPayNeedVerify=" + this.isWalletPayNeedVerify + ", cartReferences=" + this.cartReferences + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeSerializable(this.sessionExpiresAt);
        dest.writeLong(this.secondsToComplete);
        dest.writeString(this.shopId);
        List list = this.products;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ScanGoProductModel) it.next()).writeToParcel(dest, flags);
        }
        dest.writeDouble(this.totalCost);
        dest.writeInt(this.numberOfProducts);
        ScanGoProductModel scanGoProductModel = this.actionedProduct;
        if (scanGoProductModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            scanGoProductModel.writeToParcel(dest, flags);
        }
        Boolean bool = this.isWalletPayNeedVerify;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ScanGoCartReferences scanGoCartReferences = this.cartReferences;
        if (scanGoCartReferences == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            scanGoCartReferences.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final ScanGoProductModel getActionedProduct() {
        return this.actionedProduct;
    }

    public /* synthetic */ ScanGoCartModel(LocalDateTime localDateTime, long j13, String str, List list, double d13, int i13, ScanGoProductModel scanGoProductModel, Boolean bool, ScanGoCartReferences scanGoCartReferences, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? LocalDateTime.now() : localDateTime, (i14 & 2) != 0 ? 0L : j13, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 16) != 0 ? 0.0d : d13, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? null : scanGoProductModel, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? scanGoCartReferences : null);
    }
}
