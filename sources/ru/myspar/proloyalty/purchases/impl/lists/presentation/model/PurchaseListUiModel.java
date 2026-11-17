package ru.myspar.proloyalty.purchases.impl.lists.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/purchases/impl/lists/presentation/model/PurchaseListUiModel;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "productCount", "", "hasProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "I", "ppxfxbqfkf", "iwizpuwonk", "Z", "zoijcleaow", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseListUiModel implements Parcelable {
    public static final Parcelable.Creator<PurchaseListUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasProduct;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productCount;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PurchaseListUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PurchaseListUiModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PurchaseListUiModel[] newArray(int i13) {
            return new PurchaseListUiModel[i13];
        }
    }

    public PurchaseListUiModel(String id2, String name, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.id = id2;
        this.name = name;
        this.productCount = i13;
        this.hasProduct = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseListUiModel)) {
            return false;
        }
        PurchaseListUiModel purchaseListUiModel = (PurchaseListUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.id, purchaseListUiModel.id) && zdlpuopuiu.eablkybsjg(this.name, purchaseListUiModel.name) && this.productCount == purchaseListUiModel.productCount && this.hasProduct == purchaseListUiModel.hasProduct;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.productCount)) * 31) + Boolean.hashCode(this.hasProduct);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getProductCount() {
        return this.productCount;
    }

    public String toString() {
        return "PurchaseListUiModel(id=" + this.id + ", name=" + this.name + ", productCount=" + this.productCount + ", hasProduct=" + this.hasProduct + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.productCount);
        dest.writeInt(this.hasProduct ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getHasProduct() {
        return this.hasProduct;
    }

    public /* synthetic */ PurchaseListUiModel(String str, String str2, int i13, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, (i14 & 8) != 0 ? false : z13);
    }
}
