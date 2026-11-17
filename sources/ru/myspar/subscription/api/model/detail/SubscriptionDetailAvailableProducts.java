package ru.myspar.subscription.api.model.detail;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts;", "Landroid/os/Parcelable;", "", "title", "", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts$Product;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "Product", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubscriptionDetailAvailableProducts implements Parcelable {
    public static final Parcelable.Creator<SubscriptionDetailAvailableProducts> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts$Product;", "Landroid/os/Parcelable;", "", "imageUrl", ExternalMetricsManagerImpl.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ojitshcjhn", "yggfygwlhe", "getName", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product implements Parcelable {
        public static final Parcelable.Creator<Product> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String imageUrl;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Product createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Product(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Product[] newArray(int i13) {
                return new Product[i13];
            }
        }

        public Product(String imageUrl, String name) {
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            zdlpuopuiu.btonecajqb(name, "name");
            this.imageUrl = imageUrl;
            this.name = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return zdlpuopuiu.eablkybsjg(this.imageUrl, product.imageUrl) && zdlpuopuiu.eablkybsjg(this.name, product.name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.imageUrl.hashCode() * 31) + this.name.hashCode();
        }

        /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public String toString() {
            return "Product(imageUrl=" + this.imageUrl + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.imageUrl);
            dest.writeString(this.name);
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailAvailableProducts createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Product.CREATOR.createFromParcel(parcel));
            }
            return new SubscriptionDetailAvailableProducts(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailAvailableProducts[] newArray(int i13) {
            return new SubscriptionDetailAvailableProducts[i13];
        }
    }

    public SubscriptionDetailAvailableProducts(String title, List items) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        this.title = title;
        this.items = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDetailAvailableProducts)) {
            return false;
        }
        SubscriptionDetailAvailableProducts subscriptionDetailAvailableProducts = (SubscriptionDetailAvailableProducts) other;
        return zdlpuopuiu.eablkybsjg(this.title, subscriptionDetailAvailableProducts.title) && zdlpuopuiu.eablkybsjg(this.items, subscriptionDetailAvailableProducts.items);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.items.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "SubscriptionDetailAvailableProducts(title=" + this.title + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        List list = this.items;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Product) it.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getItems() {
        return this.items;
    }
}
