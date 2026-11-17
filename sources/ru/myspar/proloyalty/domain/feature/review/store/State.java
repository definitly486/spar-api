package ru.myspar.proloyalty.domain.feature.review.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.rate.review.api.model.ReviewHeaderItem;

/* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.review.store.ReviewProductStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0007¢\u0006\u0004\b%\u0010&JÎ\u0001\u0010(\u001a\u00020'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tH×\u0001¢\u0006\u0004\b,\u0010&J\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-H×\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010+R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b:\u0010CR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bP\u0010B\u001a\u0004\bA\u0010CR\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010CR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bS\u0010B\u001a\u0004\b4\u0010CR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u00102\u001a\u0004\bU\u0010+R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u00102\u001a\u0004\bW\u0010+R\u0017\u0010\u0019\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bX\u0010B\u001a\u0004\bS\u0010CR\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bY\u0010B\u001a\u0004\b\u001a\u0010CR\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010B\u001a\u0004\b\u001b\u0010CR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b[\u0010B\u001a\u0004\b\u001c\u0010C¨\u0006\\"}, d2 = {"ru/myspar/proloyalty/domain/feature/review/store/ReviewProductStore$State", "Landroid/os/Parcelable;", "", "productArticle", "productName", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "", "ratingReview", "", "currentPage", "", "isInitLoad", "Lru/myspar/proloyalty/rate/review/api/model/ReviewHeaderItem;", "sumHeaderItem", "", "Lru/myspar/proloyalty/rate/review/api/model/ReviewItem;", "items", "Lru/myspar/proloyalty/core/models/paging/Paging;", "paging", "isLoading", "isCanAddReview", "isCanEditReview", "commentText", "answer", "isNeedScrollToTop", "isExpanded", "isNeedToExpand", "isNeedToCollapse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/ColorsModel;DIZLru/myspar/proloyalty/rate/review/api/model/ReviewHeaderItem;Ljava/util/List;Lru/myspar/proloyalty/core/models/paging/Paging;ZZZLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/domain/feature/review/store/ReviewProductStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/ColorsModel;DIZLru/myspar/proloyalty/rate/review/api/model/ReviewHeaderItem;Ljava/util/List;Lru/myspar/proloyalty/core/models/paging/Paging;ZZZLjava/lang/String;Ljava/lang/String;ZZZZ)Lru/myspar/proloyalty/domain/feature/review/store/ReviewProductStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "dxjokdxxww", "yggfygwlhe", "btonecajqb", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "eablkybsjg", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "iwizpuwonk", "D", "gtknphoqwx", "()D", "cqumvgiudr", "I", "gxszxtbevo", "esjtqupxsv", "Z", "()Z", "lereixgezr", "Lru/myspar/proloyalty/rate/review/api/model/ReviewHeaderItem;", "wflxmlrfwp", "()Lru/myspar/proloyalty/rate/review/api/model/ReviewHeaderItem;", "pmvmpeiblj", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "zynmafqrjb", "Lru/myspar/proloyalty/core/models/paging/Paging;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/models/paging/Paging;", "istkbnxepw", "cdpycssgdh", "oxmwwwfdhm", "yadqdtsiqt", "iozdgvuglv", "getCommentText", "lmojexxdyd", "getAnswer", "wwaezpbzkn", "ylkuphrtab", "pkzmftpjix", "hcddaimhww", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCanAddReview;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInitLoad;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedToCollapse;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commentText;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double ratingReview;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReviewHeaderItem sumHeaderItem;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final String answer;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedToExpand;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedScrollToTop;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCanEditReview;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productArticle;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Paging paging;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.review.store.ReviewProductStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ColorsModel colorsModel = (ColorsModel) parcel.readParcelable(State.class.getClassLoader());
            double d13 = parcel.readDouble();
            int i13 = parcel.readInt();
            boolean z13 = parcel.readInt() != 0;
            ReviewHeaderItem reviewHeaderItem = (ReviewHeaderItem) parcel.readParcelable(State.class.getClassLoader());
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(string, string2, colorsModel, d13, i13, z13, reviewHeaderItem, arrayList, (Paging) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String productArticle, String productName, ColorsModel colorsModel, double d13, int i13, boolean z13, ReviewHeaderItem reviewHeaderItem, List items, Paging paging, boolean z14, boolean z15, boolean z16, String commentText, String answer, boolean z17, boolean z18, boolean z19, boolean z23) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(commentText, "commentText");
        zdlpuopuiu.btonecajqb(answer, "answer");
        this.productArticle = productArticle;
        this.productName = productName;
        this.colorsModel = colorsModel;
        this.ratingReview = d13;
        this.currentPage = i13;
        this.isInitLoad = z13;
        this.sumHeaderItem = reviewHeaderItem;
        this.items = items;
        this.paging = paging;
        this.isLoading = z14;
        this.isCanAddReview = z15;
        this.isCanEditReview = z16;
        this.commentText = commentText;
        this.answer = answer;
        this.isNeedScrollToTop = z17;
        this.isExpanded = z18;
        this.isNeedToExpand = z19;
        this.isNeedToCollapse = z23;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getProductArticle() {
        return this.productArticle;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.productArticle, state.productArticle) && zdlpuopuiu.eablkybsjg(this.productName, state.productName) && zdlpuopuiu.eablkybsjg(this.colorsModel, state.colorsModel) && Double.compare(this.ratingReview, state.ratingReview) == 0 && this.currentPage == state.currentPage && this.isInitLoad == state.isInitLoad && zdlpuopuiu.eablkybsjg(this.sumHeaderItem, state.sumHeaderItem) && zdlpuopuiu.eablkybsjg(this.items, state.items) && zdlpuopuiu.eablkybsjg(this.paging, state.paging) && this.isLoading == state.isLoading && this.isCanAddReview == state.isCanAddReview && this.isCanEditReview == state.isCanEditReview && zdlpuopuiu.eablkybsjg(this.commentText, state.commentText) && zdlpuopuiu.eablkybsjg(this.answer, state.answer) && this.isNeedScrollToTop == state.isNeedScrollToTop && this.isExpanded == state.isExpanded && this.isNeedToExpand == state.isNeedToExpand && this.isNeedToCollapse == state.isNeedToCollapse;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final double getRatingReview() {
        return this.ratingReview;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public int hashCode() {
        int iHashCode = ((this.productArticle.hashCode() * 31) + this.productName.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        int iHashCode2 = (((((((iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31) + Double.hashCode(this.ratingReview)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.isInitLoad)) * 31;
        ReviewHeaderItem reviewHeaderItem = this.sumHeaderItem;
        return ((((((((((((((((((((((iHashCode2 + (reviewHeaderItem != null ? reviewHeaderItem.hashCode() : 0)) * 31) + this.items.hashCode()) * 31) + this.paging.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isCanAddReview)) * 31) + Boolean.hashCode(this.isCanEditReview)) * 31) + this.commentText.hashCode()) * 31) + this.answer.hashCode()) * 31) + Boolean.hashCode(this.isNeedScrollToTop)) * 31) + Boolean.hashCode(this.isExpanded)) * 31) + Boolean.hashCode(this.isNeedToExpand)) * 31) + Boolean.hashCode(this.isNeedToCollapse);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsInitLoad() {
        return this.isInitLoad;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Paging getPaging() {
        return this.paging;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsCanAddReview() {
        return this.isCanAddReview;
    }

    public String toString() {
        return "State(productArticle=" + this.productArticle + ", productName=" + this.productName + ", colorsModel=" + this.colorsModel + ", ratingReview=" + this.ratingReview + ", currentPage=" + this.currentPage + ", isInitLoad=" + this.isInitLoad + ", sumHeaderItem=" + this.sumHeaderItem + ", items=" + this.items + ", paging=" + this.paging + ", isLoading=" + this.isLoading + ", isCanAddReview=" + this.isCanAddReview + ", isCanEditReview=" + this.isCanEditReview + ", commentText=" + this.commentText + ", answer=" + this.answer + ", isNeedScrollToTop=" + this.isNeedScrollToTop + ", isExpanded=" + this.isExpanded + ", isNeedToExpand=" + this.isNeedToExpand + ", isNeedToCollapse=" + this.isNeedToCollapse + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final ReviewHeaderItem getSumHeaderItem() {
        return this.sumHeaderItem;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.productArticle);
        dest.writeString(this.productName);
        dest.writeParcelable(this.colorsModel, flags);
        dest.writeDouble(this.ratingReview);
        dest.writeInt(this.currentPage);
        dest.writeInt(this.isInitLoad ? 1 : 0);
        dest.writeParcelable(this.sumHeaderItem, flags);
        List list = this.items;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.paging, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isCanAddReview ? 1 : 0);
        dest.writeInt(this.isCanEditReview ? 1 : 0);
        dest.writeString(this.commentText);
        dest.writeString(this.answer);
        dest.writeInt(this.isNeedScrollToTop ? 1 : 0);
        dest.writeInt(this.isExpanded ? 1 : 0);
        dest.writeInt(this.isNeedToExpand ? 1 : 0);
        dest.writeInt(this.isNeedToCollapse ? 1 : 0);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsNeedScrollToTop() {
        return this.isNeedScrollToTop;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsCanEditReview() {
        return this.isCanEditReview;
    }

    public final State zoijcleaow(String productArticle, String productName, ColorsModel colorsModel, double ratingReview, int currentPage, boolean isInitLoad, ReviewHeaderItem sumHeaderItem, List items, Paging paging, boolean isLoading, boolean isCanAddReview, boolean isCanEditReview, String commentText, String answer, boolean isNeedScrollToTop, boolean isExpanded, boolean isNeedToExpand, boolean isNeedToCollapse) {
        zdlpuopuiu.btonecajqb(productArticle, "productArticle");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(commentText, "commentText");
        zdlpuopuiu.btonecajqb(answer, "answer");
        return new State(productArticle, productName, colorsModel, ratingReview, currentPage, isInitLoad, sumHeaderItem, items, paging, isLoading, isCanAddReview, isCanEditReview, commentText, answer, isNeedScrollToTop, isExpanded, isNeedToExpand, isNeedToCollapse);
    }

    public /* synthetic */ State(String str, String str2, ColorsModel colorsModel, double d13, int i13, boolean z13, ReviewHeaderItem reviewHeaderItem, List list, Paging paging, boolean z14, boolean z15, boolean z16, String str3, String str4, boolean z17, boolean z18, boolean z19, boolean z23, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, colorsModel, d13, (i14 & 16) != 0 ? 1 : i13, (i14 & 32) != 0 ? false : z13, (i14 & 64) != 0 ? null : reviewHeaderItem, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new Paging(0, 0, 0, 7, null) : paging, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z15, (i14 & 2048) != 0 ? false : z16, (i14 & 4096) != 0 ? "" : str3, (i14 & 8192) != 0 ? "" : str4, (i14 & 16384) != 0 ? false : z17, (32768 & i14) != 0 ? false : z18, (65536 & i14) != 0 ? false : z19, (i14 & 131072) != 0 ? false : z23);
    }
}
