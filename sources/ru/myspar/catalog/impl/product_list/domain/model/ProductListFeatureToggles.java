package ru.myspar.catalog.impl.product_list.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006#"}, d2 = {"Lru/myspar/catalog/impl/product_list/domain/model/ProductListFeatureToggles;", "Landroid/os/Parcelable;", "", "isPurchasesListEnabled", "isVivinoEnabled", "isRatingEnabled", "<init>", "(ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "zoijcleaow", "()Z", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductListFeatureToggles implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRatingEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVivinoEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchasesListEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ProductListFeatureToggles> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.domain.model.ProductListFeatureToggles$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductListFeatureToggles iobyxmoadg() {
            return new ProductListFeatureToggles(false, false, false);
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductListFeatureToggles createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ProductListFeatureToggles(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductListFeatureToggles[] newArray(int i13) {
            return new ProductListFeatureToggles[i13];
        }
    }

    public ProductListFeatureToggles(boolean z13, boolean z14, boolean z15) {
        this.isPurchasesListEnabled = z13;
        this.isVivinoEnabled = z14;
        this.isRatingEnabled = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsVivinoEnabled() {
        return this.isVivinoEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListFeatureToggles)) {
            return false;
        }
        ProductListFeatureToggles productListFeatureToggles = (ProductListFeatureToggles) other;
        return this.isPurchasesListEnabled == productListFeatureToggles.isPurchasesListEnabled && this.isVivinoEnabled == productListFeatureToggles.isVivinoEnabled && this.isRatingEnabled == productListFeatureToggles.isRatingEnabled;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isPurchasesListEnabled) * 31) + Boolean.hashCode(this.isVivinoEnabled)) * 31) + Boolean.hashCode(this.isRatingEnabled);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getIsRatingEnabled() {
        return this.isRatingEnabled;
    }

    public String toString() {
        return "ProductListFeatureToggles(isPurchasesListEnabled=" + this.isPurchasesListEnabled + ", isVivinoEnabled=" + this.isVivinoEnabled + ", isRatingEnabled=" + this.isRatingEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isPurchasesListEnabled ? 1 : 0);
        dest.writeInt(this.isVivinoEnabled ? 1 : 0);
        dest.writeInt(this.isRatingEnabled ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getIsPurchasesListEnabled() {
        return this.isPurchasesListEnabled;
    }
}
