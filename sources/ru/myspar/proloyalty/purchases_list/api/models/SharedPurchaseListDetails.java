package ru.myspar.proloyalty.purchases_list.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/purchases_list/api/models/SharedPurchaseListDetails;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "productsCount", "", "productsArticle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "I", "ppxfxbqfkf", "iwizpuwonk", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedPurchaseListDetails implements Parcelable {
    public static final Parcelable.Creator<SharedPurchaseListDetails> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsArticle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productsCount;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SharedPurchaseListDetails createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SharedPurchaseListDetails(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SharedPurchaseListDetails[] newArray(int i13) {
            return new SharedPurchaseListDetails[i13];
        }
    }

    public SharedPurchaseListDetails(String id2, String name, int i13, List productsArticle) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(productsArticle, "productsArticle");
        this.id = id2;
        this.name = name;
        this.productsCount = i13;
        this.productsArticle = productsArticle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPurchaseListDetails)) {
            return false;
        }
        SharedPurchaseListDetails sharedPurchaseListDetails = (SharedPurchaseListDetails) other;
        return zdlpuopuiu.eablkybsjg(this.id, sharedPurchaseListDetails.id) && zdlpuopuiu.eablkybsjg(this.name, sharedPurchaseListDetails.name) && this.productsCount == sharedPurchaseListDetails.productsCount && zdlpuopuiu.eablkybsjg(this.productsArticle, sharedPurchaseListDetails.productsArticle);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.productsCount)) * 31) + this.productsArticle.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getProductsCount() {
        return this.productsCount;
    }

    public String toString() {
        return "SharedPurchaseListDetails(id=" + this.id + ", name=" + this.name + ", productsCount=" + this.productsCount + ", productsArticle=" + this.productsArticle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.productsCount);
        dest.writeStringList(this.productsArticle);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getProductsArticle() {
        return this.productsArticle;
    }
}
