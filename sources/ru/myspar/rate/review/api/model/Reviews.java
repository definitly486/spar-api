package ru.myspar.rate.review.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/myspar/rate/review/api/model/Reviews;", "Landroid/os/Parcelable;", "Lru/myspar/rate/review/api/model/ReviewHeaderItem;", "sumHeaderItem", "Lru/myspar/rate/review/api/model/ReviewUser;", "user", "", "Lru/myspar/rate/review/api/model/ReviewItem;", "items", "Lru/myspar/core/models/paging/Paging;", "paging", "<init>", "(Lru/myspar/rate/review/api/model/ReviewHeaderItem;Lru/myspar/rate/review/api/model/ReviewUser;Ljava/util/List;Lru/myspar/core/models/paging/Paging;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Lru/myspar/rate/review/api/model/ReviewHeaderItem;Lru/myspar/rate/review/api/model/ReviewUser;Ljava/util/List;Lru/myspar/core/models/paging/Paging;)Lru/myspar/rate/review/api/model/Reviews;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/rate/review/api/model/ReviewHeaderItem;", "lqeggnwhkg", "()Lru/myspar/rate/review/api/model/ReviewHeaderItem;", "yggfygwlhe", "Lru/myspar/rate/review/api/model/ReviewUser;", "nufgyqmvbu", "()Lru/myspar/rate/review/api/model/ReviewUser;", "jyumaefscl", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "iwizpuwonk", "Lru/myspar/core/models/paging/Paging;", "gxszxtbevo", "()Lru/myspar/core/models/paging/Paging;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Reviews implements Parcelable {
    public static final Parcelable.Creator<Reviews> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReviewUser user;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReviewHeaderItem sumHeaderItem;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Reviews createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ReviewHeaderItem reviewHeaderItemCreateFromParcel = ReviewHeaderItem.CREATOR.createFromParcel(parcel);
            ReviewUser reviewUserCreateFromParcel = ReviewUser.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ReviewItem.CREATOR.createFromParcel(parcel));
            }
            return new Reviews(reviewHeaderItemCreateFromParcel, reviewUserCreateFromParcel, arrayList, (Paging) parcel.readParcelable(Reviews.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Reviews[] newArray(int i13) {
            return new Reviews[i13];
        }
    }

    public Reviews(ReviewHeaderItem sumHeaderItem, ReviewUser user, List items, Paging paging) {
        zdlpuopuiu.btonecajqb(sumHeaderItem, "sumHeaderItem");
        zdlpuopuiu.btonecajqb(user, "user");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(paging, "paging");
        this.sumHeaderItem = sumHeaderItem;
        this.user = user;
        this.items = items;
        this.paging = paging;
    }

    public static /* synthetic */ Reviews ppxfxbqfkf(Reviews reviews, ReviewHeaderItem reviewHeaderItem, ReviewUser reviewUser, List list, Paging paging, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            reviewHeaderItem = reviews.sumHeaderItem;
        }
        if ((i13 & 2) != 0) {
            reviewUser = reviews.user;
        }
        if ((i13 & 4) != 0) {
            list = reviews.items;
        }
        if ((i13 & 8) != 0) {
            paging = reviews.paging;
        }
        return reviews.zoijcleaow(reviewHeaderItem, reviewUser, list, paging);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reviews)) {
            return false;
        }
        Reviews reviews = (Reviews) other;
        return zdlpuopuiu.eablkybsjg(this.sumHeaderItem, reviews.sumHeaderItem) && zdlpuopuiu.eablkybsjg(this.user, reviews.user) && zdlpuopuiu.eablkybsjg(this.items, reviews.items) && zdlpuopuiu.eablkybsjg(this.paging, reviews.paging);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    public int hashCode() {
        return (((((this.sumHeaderItem.hashCode() * 31) + this.user.hashCode()) * 31) + this.items.hashCode()) * 31) + this.paging.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ReviewHeaderItem getSumHeaderItem() {
        return this.sumHeaderItem;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ReviewUser getUser() {
        return this.user;
    }

    public String toString() {
        return "Reviews(sumHeaderItem=" + this.sumHeaderItem + ", user=" + this.user + ", items=" + this.items + ", paging=" + this.paging + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.sumHeaderItem.writeToParcel(dest, flags);
        this.user.writeToParcel(dest, flags);
        List list = this.items;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ReviewItem) it.next()).writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.paging, flags);
    }

    public final Reviews zoijcleaow(ReviewHeaderItem sumHeaderItem, ReviewUser user, List items, Paging paging) {
        zdlpuopuiu.btonecajqb(sumHeaderItem, "sumHeaderItem");
        zdlpuopuiu.btonecajqb(user, "user");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(paging, "paging");
        return new Reviews(sumHeaderItem, user, items, paging);
    }
}
