package ru.myspar.rate.rate_bonus_product.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0017¨\u0006+"}, d2 = {"Lru/myspar/rate/rate_bonus_product/api/model/ReviewWithBonusesDialogArgs;", "Landroid/os/Parcelable;", "", "article", ExternalMetricsManagerImpl.NAME, "imageUrl", "", "bonusQuantity", "placeholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonuses;", "reviewWithBonuses", "(Lru/myspar/core/domain/models/reviewWithBonuses/ReviewWithBonuses;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "ojitshcjhn", "iwizpuwonk", "Ljava/lang/Integer;", "ppxfxbqfkf", "()Ljava/lang/Integer;", "cqumvgiudr", "eablkybsjg", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReviewWithBonusesDialogArgs implements Parcelable {
    public static final Parcelable.Creator<ReviewWithBonusesDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeholder;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bonusQuantity;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ReviewWithBonusesDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ReviewWithBonusesDialogArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ReviewWithBonusesDialogArgs[] newArray(int i13) {
            return new ReviewWithBonusesDialogArgs[i13];
        }
    }

    public ReviewWithBonusesDialogArgs(String article, String name, String imageUrl, Integer num, String placeholder) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(placeholder, "placeholder");
        this.article = article;
        this.name = name;
        this.imageUrl = imageUrl;
        this.bonusQuantity = num;
        this.placeholder = placeholder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewWithBonusesDialogArgs)) {
            return false;
        }
        ReviewWithBonusesDialogArgs reviewWithBonusesDialogArgs = (ReviewWithBonusesDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.article, reviewWithBonusesDialogArgs.article) && zdlpuopuiu.eablkybsjg(this.name, reviewWithBonusesDialogArgs.name) && zdlpuopuiu.eablkybsjg(this.imageUrl, reviewWithBonusesDialogArgs.imageUrl) && zdlpuopuiu.eablkybsjg(this.bonusQuantity, reviewWithBonusesDialogArgs.bonusQuantity) && zdlpuopuiu.eablkybsjg(this.placeholder, reviewWithBonusesDialogArgs.placeholder);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((this.article.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        Integer num = this.bonusQuantity;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.placeholder.hashCode();
    }

    /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Integer getBonusQuantity() {
        return this.bonusQuantity;
    }

    public String toString() {
        return "ReviewWithBonusesDialogArgs(article=" + this.article + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", bonusQuantity=" + this.bonusQuantity + ", placeholder=" + this.placeholder + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeString(this.imageUrl);
        Integer num = this.bonusQuantity;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.placeholder);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReviewWithBonusesDialogArgs(ReviewWithBonuses reviewWithBonuses) {
        this(reviewWithBonuses.getReviewItem().getArticle(), reviewWithBonuses.getReviewItem().getProductName(), reviewWithBonuses.getReviewItem().getProductImageUrl(), reviewWithBonuses.getBonusQuantity(), reviewWithBonuses.getPlaceholder());
        zdlpuopuiu.btonecajqb(reviewWithBonuses, "reviewWithBonuses");
    }
}
