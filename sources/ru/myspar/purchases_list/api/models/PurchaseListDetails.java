package ru.myspar.purchases_list.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101¨\u00064"}, d2 = {"Lru/myspar/purchases_list/api/models/PurchaseListDetails;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "count", "", "sum", ImagesContract.URL, "", "Lru/myspar/purchases_list/api/models/PurchaseProduct;", "productsBought", "productsBuy", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "I", "zoijcleaow", "iwizpuwonk", "D", "gxszxtbevo", "()D", "cqumvgiudr", "agtfadlqog", "esjtqupxsv", "Ljava/util/List;", "ppxfxbqfkf", "()Ljava/util/List;", "lereixgezr", "eablkybsjg", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseListDetails implements Parcelable {
    public static final Parcelable.Creator<PurchaseListDetails> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsBought;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double sum;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final int count;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsBuy;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PurchaseListDetails createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            double d13 = parcel.readDouble();
            String string3 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(PurchaseProduct.CREATOR.createFromParcel(parcel));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(PurchaseProduct.CREATOR.createFromParcel(parcel));
            }
            return new PurchaseListDetails(string, string2, i13, d13, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PurchaseListDetails[] newArray(int i13) {
            return new PurchaseListDetails[i13];
        }
    }

    public PurchaseListDetails(String id2, String name, int i13, double d13, String url, List productsBought, List productsBuy) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(productsBought, "productsBought");
        zdlpuopuiu.btonecajqb(productsBuy, "productsBuy");
        this.id = id2;
        this.name = name;
        this.count = i13;
        this.sum = d13;
        this.url = url;
        this.productsBought = productsBought;
        this.productsBuy = productsBuy;
    }

    /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getProductsBuy() {
        return this.productsBuy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseListDetails)) {
            return false;
        }
        PurchaseListDetails purchaseListDetails = (PurchaseListDetails) other;
        return zdlpuopuiu.eablkybsjg(this.id, purchaseListDetails.id) && zdlpuopuiu.eablkybsjg(this.name, purchaseListDetails.name) && this.count == purchaseListDetails.count && Double.compare(this.sum, purchaseListDetails.sum) == 0 && zdlpuopuiu.eablkybsjg(this.url, purchaseListDetails.url) && zdlpuopuiu.eablkybsjg(this.productsBought, purchaseListDetails.productsBought) && zdlpuopuiu.eablkybsjg(this.productsBuy, purchaseListDetails.productsBuy);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Double.hashCode(this.sum)) * 31) + this.url.hashCode()) * 31) + this.productsBought.hashCode()) * 31) + this.productsBuy.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getProductsBought() {
        return this.productsBought;
    }

    public String toString() {
        return "PurchaseListDetails(id=" + this.id + ", name=" + this.name + ", count=" + this.count + ", sum=" + this.sum + ", url=" + this.url + ", productsBought=" + this.productsBought + ", productsBuy=" + this.productsBuy + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.count);
        dest.writeDouble(this.sum);
        dest.writeString(this.url);
        List list = this.productsBought;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((PurchaseProduct) it.next()).writeToParcel(dest, flags);
        }
        List list2 = this.productsBuy;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((PurchaseProduct) it2.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getCount() {
        return this.count;
    }
}
