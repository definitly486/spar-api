package ru.myspar.rate.review.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0082\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\b(\u00108¨\u0006D"}, d2 = {"Lru/myspar/rate/review/api/model/ReviewItem;", "Landroid/os/Parcelable;", "", "id", "Ljava/time/LocalDate;", ExternalMetricsManagerImpl.DATE, "user", "", "rating", "comment", "answer", "", "isCollapsed", "", "fromDegrees", "toDegrees", "answerTitleRes", "isNeedToAnimate", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZFFLjava/lang/Integer;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZFFLjava/lang/Integer;Z)Lru/myspar/rate/review/api/model/ReviewItem;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "Ljava/time/LocalDate;", "nufgyqmvbu", "()Ljava/time/LocalDate;", "jyumaefscl", "wflxmlrfwp", "iwizpuwonk", "I", "btonecajqb", "cqumvgiudr", "lqeggnwhkg", "esjtqupxsv", "eablkybsjg", "lereixgezr", "Z", "oxmwwwfdhm", "()Z", "pmvmpeiblj", "F", "dxjokdxxww", "()F", "zynmafqrjb", "gtknphoqwx", "istkbnxepw", "Ljava/lang/Integer;", "gxszxtbevo", "()Ljava/lang/Integer;", "cdpycssgdh", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReviewItem implements Parcelable {
    public static final Parcelable.Creator<ReviewItem> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedToAnimate;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comment;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String answer;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer answerTitleRes;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String user;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCollapsed;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final float fromDegrees;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final float toDegrees;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ReviewItem createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ReviewItem(parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ReviewItem[] newArray(int i13) {
            return new ReviewItem[i13];
        }
    }

    public ReviewItem(String id2, LocalDate localDate, String user, int i13, String comment, String answer, boolean z13, float f13, float f14, Integer num, boolean z14) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(user, "user");
        zdlpuopuiu.btonecajqb(comment, "comment");
        zdlpuopuiu.btonecajqb(answer, "answer");
        this.id = id2;
        this.date = localDate;
        this.user = user;
        this.rating = i13;
        this.comment = comment;
        this.answer = answer;
        this.isCollapsed = z13;
        this.fromDegrees = f13;
        this.toDegrees = f14;
        this.answerTitleRes = num;
        this.isNeedToAnimate = z14;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final float getFromDegrees() {
        return this.fromDegrees;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewItem)) {
            return false;
        }
        ReviewItem reviewItem = (ReviewItem) other;
        return zdlpuopuiu.eablkybsjg(this.id, reviewItem.id) && zdlpuopuiu.eablkybsjg(this.date, reviewItem.date) && zdlpuopuiu.eablkybsjg(this.user, reviewItem.user) && this.rating == reviewItem.rating && zdlpuopuiu.eablkybsjg(this.comment, reviewItem.comment) && zdlpuopuiu.eablkybsjg(this.answer, reviewItem.answer) && this.isCollapsed == reviewItem.isCollapsed && Float.compare(this.fromDegrees, reviewItem.fromDegrees) == 0 && Float.compare(this.toDegrees, reviewItem.toDegrees) == 0 && zdlpuopuiu.eablkybsjg(this.answerTitleRes, reviewItem.answerTitleRes) && this.isNeedToAnimate == reviewItem.isNeedToAnimate;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final float getToDegrees() {
        return this.toDegrees;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Integer getAnswerTitleRes() {
        return this.answerTitleRes;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        LocalDate localDate = this.date;
        int iHashCode2 = (((((((((((((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.user.hashCode()) * 31) + Integer.hashCode(this.rating)) * 31) + this.comment.hashCode()) * 31) + this.answer.hashCode()) * 31) + Boolean.hashCode(this.isCollapsed)) * 31) + Float.hashCode(this.fromDegrees)) * 31) + Float.hashCode(this.toDegrees)) * 31;
        Integer num = this.answerTitleRes;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNeedToAnimate);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    public String toString() {
        return "ReviewItem(id=" + this.id + ", date=" + this.date + ", user=" + this.user + ", rating=" + this.rating + ", comment=" + this.comment + ", answer=" + this.answer + ", isCollapsed=" + this.isCollapsed + ", fromDegrees=" + this.fromDegrees + ", toDegrees=" + this.toDegrees + ", answerTitleRes=" + this.answerTitleRes + ", isNeedToAnimate=" + this.isNeedToAnimate + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeSerializable(this.date);
        dest.writeString(this.user);
        dest.writeInt(this.rating);
        dest.writeString(this.comment);
        dest.writeString(this.answer);
        dest.writeInt(this.isCollapsed ? 1 : 0);
        dest.writeFloat(this.fromDegrees);
        dest.writeFloat(this.toDegrees);
        Integer num = this.answerTitleRes;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeInt(this.isNeedToAnimate ? 1 : 0);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsNeedToAnimate() {
        return this.isNeedToAnimate;
    }

    public final ReviewItem zoijcleaow(String id2, LocalDate date, String user, int rating, String comment, String answer, boolean isCollapsed, float fromDegrees, float toDegrees, Integer answerTitleRes, boolean isNeedToAnimate) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(user, "user");
        zdlpuopuiu.btonecajqb(comment, "comment");
        zdlpuopuiu.btonecajqb(answer, "answer");
        return new ReviewItem(id2, date, user, rating, comment, answer, isCollapsed, fromDegrees, toDegrees, answerTitleRes, isNeedToAnimate);
    }

    public /* synthetic */ ReviewItem(String str, LocalDate localDate, String str2, int i13, String str3, String str4, boolean z13, float f13, float f14, Integer num, boolean z14, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, localDate, str2, i13, str3, str4, (i14 & 64) != 0 ? false : z13, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0f : f13, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 0.0f : f14, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z14);
    }
}
