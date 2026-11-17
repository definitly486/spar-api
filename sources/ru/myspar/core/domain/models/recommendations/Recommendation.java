package ru.myspar.core.domain.models.recommendations;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Product;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/myspar/core/domain/models/recommendations/Recommendation;", "Landroid/os/Parcelable;", "", "title", "Ln10/iobyxmoadg;", "type", "recommendationBlockId", "", "Lru/myspar/core/domain/models/product/Product;", "productList", "<init>", "(Ljava/lang/String;Ln10/iobyxmoadg;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ln10/iobyxmoadg;Ljava/lang/String;Ljava/util/List;)Lru/myspar/core/domain/models/recommendations/Recommendation;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "Ln10/iobyxmoadg;", "nufgyqmvbu", "()Ln10/iobyxmoadg;", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Recommendation implements Parcelable {
    public static final Parcelable.Creator<Recommendation> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productList;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String recommendationBlockId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final n10.iobyxmoadg type;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Recommendation createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            n10.iobyxmoadg iobyxmoadgVarValueOf = n10.iobyxmoadg.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Product.CREATOR.createFromParcel(parcel));
            }
            return new Recommendation(string, iobyxmoadgVarValueOf, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Recommendation[] newArray(int i13) {
            return new Recommendation[i13];
        }
    }

    public Recommendation(String title, n10.iobyxmoadg type, String recommendationBlockId, List productList) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(recommendationBlockId, "recommendationBlockId");
        zdlpuopuiu.btonecajqb(productList, "productList");
        this.title = title;
        this.type = type;
        this.recommendationBlockId = recommendationBlockId;
        this.productList = productList;
    }

    public static /* synthetic */ Recommendation ppxfxbqfkf(Recommendation recommendation, String str, n10.iobyxmoadg iobyxmoadgVar, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recommendation.title;
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = recommendation.type;
        }
        if ((i13 & 4) != 0) {
            str2 = recommendation.recommendationBlockId;
        }
        if ((i13 & 8) != 0) {
            list = recommendation.productList;
        }
        return recommendation.zoijcleaow(str, iobyxmoadgVar, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getProductList() {
        return this.productList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Recommendation)) {
            return false;
        }
        Recommendation recommendation = (Recommendation) other;
        return zdlpuopuiu.eablkybsjg(this.title, recommendation.title) && this.type == recommendation.type && zdlpuopuiu.eablkybsjg(this.recommendationBlockId, recommendation.recommendationBlockId) && zdlpuopuiu.eablkybsjg(this.productList, recommendation.productList);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getRecommendationBlockId() {
        return this.recommendationBlockId;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.recommendationBlockId.hashCode()) * 31) + this.productList.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final n10.iobyxmoadg getType() {
        return this.type;
    }

    public String toString() {
        return "Recommendation(title=" + this.title + ", type=" + this.type + ", recommendationBlockId=" + this.recommendationBlockId + ", productList=" + this.productList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.type.name());
        dest.writeString(this.recommendationBlockId);
        List list = this.productList;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Product) it.next()).writeToParcel(dest, flags);
        }
    }

    public final Recommendation zoijcleaow(String title, n10.iobyxmoadg type, String recommendationBlockId, List productList) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(recommendationBlockId, "recommendationBlockId");
        zdlpuopuiu.btonecajqb(productList, "productList");
        return new Recommendation(title, type, recommendationBlockId, productList);
    }
}
