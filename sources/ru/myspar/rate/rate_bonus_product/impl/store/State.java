package ru.myspar.rate.rate_bonus_product.impl.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: renamed from: ru.myspar.rate.rate_bonus_product.impl.store.RateBonusProductDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jl\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:¨\u0006="}, d2 = {"ru/myspar/rate/rate_bonus_product/impl/store/RateBonusProductDialogStore$State", "Landroid/os/Parcelable;", "", "article", "imageUrl", "productName", "", "bonusQuantity", "starsQuantity", "Lp0/tzroggbefp;", "review", "placeholder", "", "isSendButtonEnabled", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILp0/tzroggbefp;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/rate/rate_bonus_product/impl/store/RateBonusProductDialogStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILp0/tzroggbefp;Ljava/lang/String;ZZ)Lru/myspar/rate/rate_bonus_product/impl/store/RateBonusProductDialogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "ojitshcjhn", "jyumaefscl", "lqeggnwhkg", "iwizpuwonk", "Ljava/lang/Integer;", "gxszxtbevo", "()Ljava/lang/Integer;", "cqumvgiudr", "I", "dxjokdxxww", "esjtqupxsv", "Lp0/tzroggbefp;", "nufgyqmvbu", "()Lp0/tzroggbefp;", "lereixgezr", "getPlaceholder", "pmvmpeiblj", "Z", "gtknphoqwx", "()Z", "zynmafqrjb", "btonecajqb", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int starsQuantity;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp review;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer bonusQuantity;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeholder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSendButtonEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.rate.rate_bonus_product.impl.store.RateBonusProductDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String article, String imageUrl, String productName, Integer num, int i13, tzroggbefp review, String placeholder, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(review, "review");
        zdlpuopuiu.btonecajqb(placeholder, "placeholder");
        this.article = article;
        this.imageUrl = imageUrl;
        this.productName = productName;
        this.bonusQuantity = num;
        this.starsQuantity = i13;
        this.review = review;
        this.placeholder = placeholder;
        this.isSendButtonEnabled = z13;
        this.isLoading = z14;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final int getStarsQuantity() {
        return this.starsQuantity;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.article, state.article) && zdlpuopuiu.eablkybsjg(this.imageUrl, state.imageUrl) && zdlpuopuiu.eablkybsjg(this.productName, state.productName) && zdlpuopuiu.eablkybsjg(this.bonusQuantity, state.bonusQuantity) && this.starsQuantity == state.starsQuantity && zdlpuopuiu.eablkybsjg(this.review, state.review) && zdlpuopuiu.eablkybsjg(this.placeholder, state.placeholder) && this.isSendButtonEnabled == state.isSendButtonEnabled && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsSendButtonEnabled() {
        return this.isSendButtonEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Integer getBonusQuantity() {
        return this.bonusQuantity;
    }

    public int hashCode() {
        int iHashCode = ((((this.article.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.productName.hashCode()) * 31;
        Integer num = this.bonusQuantity;
        return ((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.starsQuantity)) * 31) + this.review.hashCode()) * 31) + this.placeholder.hashCode()) * 31) + Boolean.hashCode(this.isSendButtonEnabled)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final tzroggbefp getReview() {
        return this.review;
    }

    /* JADX INFO: renamed from: ojitshcjhn, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public String toString() {
        return "State(article=" + this.article + ", imageUrl=" + this.imageUrl + ", productName=" + this.productName + ", bonusQuantity=" + this.bonusQuantity + ", starsQuantity=" + this.starsQuantity + ", review=" + this.review + ", placeholder=" + this.placeholder + ", isSendButtonEnabled=" + this.isSendButtonEnabled + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.article);
        dest.writeString(this.imageUrl);
        dest.writeString(this.productName);
        Integer num = this.bonusQuantity;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeInt(this.starsQuantity);
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.review, dest, flags);
        dest.writeString(this.placeholder);
        dest.writeInt(this.isSendButtonEnabled ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(String article, String imageUrl, String productName, Integer bonusQuantity, int starsQuantity, tzroggbefp review, String placeholder, boolean isSendButtonEnabled, boolean isLoading) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(review, "review");
        zdlpuopuiu.btonecajqb(placeholder, "placeholder");
        return new State(article, imageUrl, productName, bonusQuantity, starsQuantity, review, placeholder, isSendButtonEnabled, isLoading);
    }
}
