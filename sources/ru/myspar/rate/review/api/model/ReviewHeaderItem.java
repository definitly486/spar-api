package ru.myspar.rate.review.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/rate/review/api/model/ReviewHeaderItem;", "Landroid/os/Parcelable;", "", "reviewsCount", "", "Lru/myspar/rate/review/api/model/ReviewSumItem;", "reviewsByRating", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/Integer;", "ppxfxbqfkf", "()Ljava/lang/Integer;", "yggfygwlhe", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReviewHeaderItem implements Parcelable {
    public static final Parcelable.Creator<ReviewHeaderItem> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List reviewsByRating;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer reviewsCount;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ReviewHeaderItem createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ReviewSumItem.CREATOR.createFromParcel(parcel));
            }
            return new ReviewHeaderItem(numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ReviewHeaderItem[] newArray(int i13) {
            return new ReviewHeaderItem[i13];
        }
    }

    public ReviewHeaderItem(Integer num, List reviewsByRating) {
        zdlpuopuiu.btonecajqb(reviewsByRating, "reviewsByRating");
        this.reviewsCount = num;
        this.reviewsByRating = reviewsByRating;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewHeaderItem)) {
            return false;
        }
        ReviewHeaderItem reviewHeaderItem = (ReviewHeaderItem) other;
        return zdlpuopuiu.eablkybsjg(this.reviewsCount, reviewHeaderItem.reviewsCount) && zdlpuopuiu.eablkybsjg(this.reviewsByRating, reviewHeaderItem.reviewsByRating);
    }

    public int hashCode() {
        Integer num = this.reviewsCount;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.reviewsByRating.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Integer getReviewsCount() {
        return this.reviewsCount;
    }

    public String toString() {
        return "ReviewHeaderItem(reviewsCount=" + this.reviewsCount + ", reviewsByRating=" + this.reviewsByRating + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        Integer num = this.reviewsCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        List list = this.reviewsByRating;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ReviewSumItem) it.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getReviewsByRating() {
        return this.reviewsByRating;
    }

    public /* synthetic */ ReviewHeaderItem(Integer num, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
