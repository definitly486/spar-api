package ru.myspar.proloyalty.rate.rate_product.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import gg.pmvmpeiblj;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lru/myspar/proloyalty/rate/rate_product/impl/domain/model/RateProductReviewData;", "Landroid/os/Parcelable;", "Lgg/pmvmpeiblj;", "rating", "", "comment", "<init>", "(ILjava/lang/String;Lkotlin/jvm/internal/gtknphoqwx;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(ILjava/lang/String;)Lru/myspar/proloyalty/rate/rate_product/impl/domain/model/RateProductReviewData;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "gxszxtbevo", "yggfygwlhe", "Ljava/lang/String;", "eablkybsjg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RateProductReviewData implements Parcelable {
    public static final Parcelable.Creator<RateProductReviewData> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comment;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RateProductReviewData createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new RateProductReviewData(parcel.readInt(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RateProductReviewData[] newArray(int i13) {
            return new RateProductReviewData[i13];
        }
    }

    public /* synthetic */ RateProductReviewData(int i13, String str, gtknphoqwx gtknphoqwxVar) {
        this(i13, str);
    }

    public static /* synthetic */ RateProductReviewData ppxfxbqfkf(RateProductReviewData rateProductReviewData, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = rateProductReviewData.rating;
        }
        if ((i14 & 2) != 0) {
            str = rateProductReviewData.comment;
        }
        return rateProductReviewData.zoijcleaow(i13, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateProductReviewData)) {
            return false;
        }
        RateProductReviewData rateProductReviewData = (RateProductReviewData) other;
        return this.rating == rateProductReviewData.rating && zdlpuopuiu.eablkybsjg(this.comment, rateProductReviewData.comment);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    public int hashCode() {
        return (pmvmpeiblj.wkgbmnqykc(this.rating) * 31) + this.comment.hashCode();
    }

    public String toString() {
        return "RateProductReviewData(rating=" + pmvmpeiblj.eablkybsjg(this.rating) + ", comment=" + this.comment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.rating);
        dest.writeString(this.comment);
    }

    public final RateProductReviewData zoijcleaow(int rating, String comment) {
        zdlpuopuiu.btonecajqb(comment, "comment");
        return new RateProductReviewData(rating, comment, null);
    }

    private RateProductReviewData(int i13, String comment) {
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.rating = i13;
        this.comment = comment;
    }
}
