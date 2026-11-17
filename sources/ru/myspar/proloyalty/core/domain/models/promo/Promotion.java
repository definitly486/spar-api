package ru.myspar.proloyalty.core.domain.models.promo;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001:\u0005mnop8B\u009b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u001d\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010.J\u001a\u00104\u001a\u00020\u001e2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00100R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u00100R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u00100R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\b:\u00100R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u00100R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010;\u001a\u0004\bQ\u00100R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\bR\u00100R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u00100R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010;\u001a\u0004\b?\u00100R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bE\u00100R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010;\u001a\u0004\bW\u00100R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010;\u001a\u0004\bY\u00100R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010;\u001a\u0004\b[\u00100R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010;\u001a\u0004\bN\u00100R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f8\u0006¢\u0006\f\n\u0004\ba\u0010J\u001a\u0004\bb\u0010LR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bS\u0010eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f8\u0006¢\u0006\f\n\u0004\bf\u0010J\u001a\u0004\bU\u0010LR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bk\u0010;\u001a\u0004\bl\u00100¨\u0006q"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/promo/Promotion;", "Landroid/os/Parcelable;", "", "balance", "", "balanceFormat", "lastUpdatedBalance", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$zoijcleaow;", "type", "codePromo", "dashboardName", "dashboardShortDescription", "", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionOnboarding;", "onboardings", "promoName", "shortDescription", "fullDescription", "productsText", "commonRulesDescription", "promoSticker", "promoStickers", "imagePromo", "color", "colorNotActive", "buttonText", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionDate;", "expirationDate", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionItem;", "items", "", "showSponsors", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$SponsorItem;", "sponsors", "Lk21/ojitshcjhn;", "navigationLink", "reference", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/promo/Promotion$zoijcleaow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionDate;Ljava/util/List;ZLjava/util/List;Lk21/ojitshcjhn;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/Integer;", "zoijcleaow", "()Ljava/lang/Integer;", "yggfygwlhe", "Ljava/lang/String;", "getBalanceFormat", "jyumaefscl", "getLastUpdatedBalance", "iwizpuwonk", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$zoijcleaow;", "wwaezpbzkn", "()Lru/myspar/proloyalty/core/domain/models/promo/Promotion$zoijcleaow;", "cqumvgiudr", "ppxfxbqfkf", "esjtqupxsv", "getDashboardName", "lereixgezr", "getDashboardShortDescription", "pmvmpeiblj", "Ljava/util/List;", "wflxmlrfwp", "()Ljava/util/List;", "zynmafqrjb", "istkbnxepw", "yadqdtsiqt", "cdpycssgdh", "dxjokdxxww", "oxmwwwfdhm", "iozdgvuglv", "lqeggnwhkg", "lmojexxdyd", "ylkuphrtab", "btonecajqb", "pkzmftpjix", "eablkybsjg", "hcddaimhww", "gxszxtbevo", "jpowsppfya", "hkdspvbjdz", "Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionDate;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionDate;", "cllcsxoeiz", "gtknphoqwx", "dsvhmnatus", "Z", "()Z", "wypolnanlu", "stevsuqkhv", "Lk21/ojitshcjhn;", "getNavigationLink", "()Lk21/ojitshcjhn;", "kegysxyocb", "getReference", "PromotionOnboarding", "PromotionDate", "PromotionItem", "SponsorItem", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullDescription;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String codePromo;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showSponsors;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dashboardName;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final String colorNotActive;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final PromotionDate expirationDate;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commonRulesDescription;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortDescription;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow type;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastUpdatedBalance;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dashboardShortDescription;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoSticker;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final String color;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List onboardings;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ojitshcjhn navigationLink;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoStickers;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List sponsors;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productsText;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String balanceFormat;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imagePromo;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer balance;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoName;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionOnboarding;", "Landroid/os/Parcelable;", "", "title", "description", "image", "", "order", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "I", "getOrder", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PromotionOnboarding implements Parcelable {
        public static final Parcelable.Creator<PromotionOnboarding> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final int order;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String image;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PromotionOnboarding createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PromotionOnboarding(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PromotionOnboarding[] newArray(int i13) {
                return new PromotionOnboarding[i13];
            }
        }

        public PromotionOnboarding(String title, String description, String image, int i13) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(image, "image");
            this.title = title;
            this.description = description;
            this.image = image;
            this.order = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromotionOnboarding)) {
                return false;
            }
            PromotionOnboarding promotionOnboarding = (PromotionOnboarding) other;
            return zdlpuopuiu.eablkybsjg(this.title, promotionOnboarding.title) && zdlpuopuiu.eablkybsjg(this.description, promotionOnboarding.description) && zdlpuopuiu.eablkybsjg(this.image, promotionOnboarding.image) && this.order == promotionOnboarding.order;
        }

        public final int getOrder() {
            return this.order;
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.order);
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        public String toString() {
            return "PromotionOnboarding(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", order=" + this.order + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.image);
            dest.writeInt(this.order);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/core/domain/models/promo/Promotion$SponsorItem;", "Landroid/os/Parcelable;", "", "code", ExternalMetricsManagerImpl.NAME, "pic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "getName", "jyumaefscl", "ppxfxbqfkf", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SponsorItem implements Parcelable {
        public static final Parcelable.Creator<SponsorItem> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pic;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final SponsorItem createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new SponsorItem(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final SponsorItem[] newArray(int i13) {
                return new SponsorItem[i13];
            }
        }

        public SponsorItem(String code, String name, String str) {
            zdlpuopuiu.btonecajqb(code, "code");
            zdlpuopuiu.btonecajqb(name, "name");
            this.code = code;
            this.name = name;
            this.pic = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SponsorItem)) {
                return false;
            }
            SponsorItem sponsorItem = (SponsorItem) other;
            return zdlpuopuiu.eablkybsjg(this.code, sponsorItem.code) && zdlpuopuiu.eablkybsjg(this.name, sponsorItem.name) && zdlpuopuiu.eablkybsjg(this.pic, sponsorItem.pic);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = ((this.code.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.pic;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getPic() {
            return this.pic;
        }

        public String toString() {
            return "SponsorItem(code=" + this.code + ", name=" + this.name + ", pic=" + this.pic + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.code);
            dest.writeString(this.name);
            dest.writeString(this.pic);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Promotion createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zoijcleaow zoijcleaowVarValueOf = zoijcleaow.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(PromotionOnboarding.CREATOR.createFromParcel(parcel));
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            PromotionDate promotionDateCreateFromParcel = PromotionDate.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList2.add(PromotionItem.CREATOR.createFromParcel(parcel));
                i16++;
                i15 = i15;
            }
            boolean z13 = parcel.readInt() != 0;
            int i17 = parcel.readInt();
            boolean z14 = z13;
            ArrayList arrayList3 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList3.add(SponsorItem.CREATOR.createFromParcel(parcel));
                i18++;
                i17 = i17;
            }
            return new Promotion(numValueOf, string, string2, zoijcleaowVarValueOf, string3, string4, string5, arrayList, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, promotionDateCreateFromParcel, arrayList2, z14, arrayList3, parcel.readInt() == 0 ? null : ojitshcjhn.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Promotion[] newArray(int i13) {
            return new Promotion[i13];
        }
    }

    public enum zoijcleaow {
        CARD_OPENING("card_opening"),
        DEFAULT("");


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f95112zdlpuopuiu;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f95108esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final iobyxmoadg f95111yggfygwlhe = new iobyxmoadg(null);

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            public final zoijcleaow iobyxmoadg(String value) {
                zdlpuopuiu.btonecajqb(value, "value");
                for (zoijcleaow zoijcleaowVar : zoijcleaow.values()) {
                    if (zdlpuopuiu.eablkybsjg(zoijcleaowVar.wkgbmnqykc(), value)) {
                        if (zoijcleaowVar == null) {
                            return zoijcleaow.DEFAULT;
                        }
                        return zoijcleaowVar;
                    }
                }
                zoijcleaowVar = null;
                if (zoijcleaowVar == null) {
                    return zoijcleaow.DEFAULT;
                }
                return zoijcleaowVar;
            }

            private iobyxmoadg() {
            }
        }

        zoijcleaow(String str) {
            this.f95112zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f95112zdlpuopuiu;
        }
    }

    public Promotion(Integer num, String str, String lastUpdatedBalance, zoijcleaow type, String codePromo, String dashboardName, String dashboardShortDescription, List onboardings, String promoName, String shortDescription, String fullDescription, String productsText, String commonRulesDescription, String promoSticker, String promoStickers, String imagePromo, String color, String colorNotActive, String buttonText, PromotionDate expirationDate, List items, boolean z13, List sponsors, ojitshcjhn ojitshcjhnVar, String str2) {
        zdlpuopuiu.btonecajqb(lastUpdatedBalance, "lastUpdatedBalance");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(codePromo, "codePromo");
        zdlpuopuiu.btonecajqb(dashboardName, "dashboardName");
        zdlpuopuiu.btonecajqb(dashboardShortDescription, "dashboardShortDescription");
        zdlpuopuiu.btonecajqb(onboardings, "onboardings");
        zdlpuopuiu.btonecajqb(promoName, "promoName");
        zdlpuopuiu.btonecajqb(shortDescription, "shortDescription");
        zdlpuopuiu.btonecajqb(fullDescription, "fullDescription");
        zdlpuopuiu.btonecajqb(productsText, "productsText");
        zdlpuopuiu.btonecajqb(commonRulesDescription, "commonRulesDescription");
        zdlpuopuiu.btonecajqb(promoSticker, "promoSticker");
        zdlpuopuiu.btonecajqb(promoStickers, "promoStickers");
        zdlpuopuiu.btonecajqb(imagePromo, "imagePromo");
        zdlpuopuiu.btonecajqb(color, "color");
        zdlpuopuiu.btonecajqb(colorNotActive, "colorNotActive");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(expirationDate, "expirationDate");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(sponsors, "sponsors");
        this.balance = num;
        this.balanceFormat = str;
        this.lastUpdatedBalance = lastUpdatedBalance;
        this.type = type;
        this.codePromo = codePromo;
        this.dashboardName = dashboardName;
        this.dashboardShortDescription = dashboardShortDescription;
        this.onboardings = onboardings;
        this.promoName = promoName;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.productsText = productsText;
        this.commonRulesDescription = commonRulesDescription;
        this.promoSticker = promoSticker;
        this.promoStickers = promoStickers;
        this.imagePromo = imagePromo;
        this.color = color;
        this.colorNotActive = colorNotActive;
        this.buttonText = buttonText;
        this.expirationDate = expirationDate;
        this.items = items;
        this.showSponsors = z13;
        this.sponsors = sponsors;
        this.navigationLink = ojitshcjhnVar;
        this.reference = str2;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getImagePromo() {
        return this.imagePromo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getFullDescription() {
        return this.fullDescription;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return zdlpuopuiu.eablkybsjg(this.balance, promotion.balance) && zdlpuopuiu.eablkybsjg(this.balanceFormat, promotion.balanceFormat) && zdlpuopuiu.eablkybsjg(this.lastUpdatedBalance, promotion.lastUpdatedBalance) && this.type == promotion.type && zdlpuopuiu.eablkybsjg(this.codePromo, promotion.codePromo) && zdlpuopuiu.eablkybsjg(this.dashboardName, promotion.dashboardName) && zdlpuopuiu.eablkybsjg(this.dashboardShortDescription, promotion.dashboardShortDescription) && zdlpuopuiu.eablkybsjg(this.onboardings, promotion.onboardings) && zdlpuopuiu.eablkybsjg(this.promoName, promotion.promoName) && zdlpuopuiu.eablkybsjg(this.shortDescription, promotion.shortDescription) && zdlpuopuiu.eablkybsjg(this.fullDescription, promotion.fullDescription) && zdlpuopuiu.eablkybsjg(this.productsText, promotion.productsText) && zdlpuopuiu.eablkybsjg(this.commonRulesDescription, promotion.commonRulesDescription) && zdlpuopuiu.eablkybsjg(this.promoSticker, promotion.promoSticker) && zdlpuopuiu.eablkybsjg(this.promoStickers, promotion.promoStickers) && zdlpuopuiu.eablkybsjg(this.imagePromo, promotion.imagePromo) && zdlpuopuiu.eablkybsjg(this.color, promotion.color) && zdlpuopuiu.eablkybsjg(this.colorNotActive, promotion.colorNotActive) && zdlpuopuiu.eablkybsjg(this.buttonText, promotion.buttonText) && zdlpuopuiu.eablkybsjg(this.expirationDate, promotion.expirationDate) && zdlpuopuiu.eablkybsjg(this.items, promotion.items) && this.showSponsors == promotion.showSponsors && zdlpuopuiu.eablkybsjg(this.sponsors, promotion.sponsors) && this.navigationLink == promotion.navigationLink && zdlpuopuiu.eablkybsjg(this.reference, promotion.reference);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getPromoStickers() {
        return this.promoStickers;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getColorNotActive() {
        return this.colorNotActive;
    }

    public int hashCode() {
        Integer num = this.balance;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.balanceFormat;
        int iHashCode2 = (((((((((((((((((((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.lastUpdatedBalance.hashCode()) * 31) + this.type.hashCode()) * 31) + this.codePromo.hashCode()) * 31) + this.dashboardName.hashCode()) * 31) + this.dashboardShortDescription.hashCode()) * 31) + this.onboardings.hashCode()) * 31) + this.promoName.hashCode()) * 31) + this.shortDescription.hashCode()) * 31) + this.fullDescription.hashCode()) * 31) + this.productsText.hashCode()) * 31) + this.commonRulesDescription.hashCode()) * 31) + this.promoSticker.hashCode()) * 31) + this.promoStickers.hashCode()) * 31) + this.imagePromo.hashCode()) * 31) + this.color.hashCode()) * 31) + this.colorNotActive.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.items.hashCode()) * 31) + Boolean.hashCode(this.showSponsors)) * 31) + this.sponsors.hashCode()) * 31;
        ojitshcjhn ojitshcjhnVar = this.navigationLink;
        int iHashCode3 = (iHashCode2 + (ojitshcjhnVar == null ? 0 : ojitshcjhnVar.hashCode())) * 31;
        String str2 = this.reference;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getShowSponsors() {
        return this.showSponsors;
    }

    /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getPromoSticker() {
        return this.promoSticker;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final List getSponsors() {
        return this.sponsors;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getCommonRulesDescription() {
        return this.commonRulesDescription;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final PromotionDate getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getProductsText() {
        return this.productsText;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getCodePromo() {
        return this.codePromo;
    }

    public String toString() {
        return "Promotion(balance=" + this.balance + ", balanceFormat=" + this.balanceFormat + ", lastUpdatedBalance=" + this.lastUpdatedBalance + ", type=" + this.type + ", codePromo=" + this.codePromo + ", dashboardName=" + this.dashboardName + ", dashboardShortDescription=" + this.dashboardShortDescription + ", onboardings=" + this.onboardings + ", promoName=" + this.promoName + ", shortDescription=" + this.shortDescription + ", fullDescription=" + this.fullDescription + ", productsText=" + this.productsText + ", commonRulesDescription=" + this.commonRulesDescription + ", promoSticker=" + this.promoSticker + ", promoStickers=" + this.promoStickers + ", imagePromo=" + this.imagePromo + ", color=" + this.color + ", colorNotActive=" + this.colorNotActive + ", buttonText=" + this.buttonText + ", expirationDate=" + this.expirationDate + ", items=" + this.items + ", showSponsors=" + this.showSponsors + ", sponsors=" + this.sponsors + ", navigationLink=" + this.navigationLink + ", reference=" + this.reference + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getOnboardings() {
        return this.onboardings;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        Integer num = this.balance;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.balanceFormat);
        dest.writeString(this.lastUpdatedBalance);
        dest.writeString(this.type.name());
        dest.writeString(this.codePromo);
        dest.writeString(this.dashboardName);
        dest.writeString(this.dashboardShortDescription);
        List list = this.onboardings;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((PromotionOnboarding) it.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.promoName);
        dest.writeString(this.shortDescription);
        dest.writeString(this.fullDescription);
        dest.writeString(this.productsText);
        dest.writeString(this.commonRulesDescription);
        dest.writeString(this.promoSticker);
        dest.writeString(this.promoStickers);
        dest.writeString(this.imagePromo);
        dest.writeString(this.color);
        dest.writeString(this.colorNotActive);
        dest.writeString(this.buttonText);
        this.expirationDate.writeToParcel(dest, flags);
        List list2 = this.items;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((PromotionItem) it2.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.showSponsors ? 1 : 0);
        List list3 = this.sponsors;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((SponsorItem) it3.next()).writeToParcel(dest, flags);
        }
        ojitshcjhn ojitshcjhnVar = this.navigationLink;
        if (ojitshcjhnVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ojitshcjhnVar.name());
        }
        dest.writeString(this.reference);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final zoijcleaow getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getPromoName() {
        return this.promoName;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Integer getBalance() {
        return this.balance;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionDate;", "Landroid/os/Parcelable;", "Ljava/time/LocalDateTime;", "start", "end", "<init>", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/time/LocalDateTime;", "ppxfxbqfkf", "()Ljava/time/LocalDateTime;", "yggfygwlhe", "zoijcleaow", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PromotionDate implements Parcelable {
        public static final Parcelable.Creator<PromotionDate> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDateTime end;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDateTime start;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PromotionDate createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PromotionDate((LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PromotionDate[] newArray(int i13) {
                return new PromotionDate[i13];
            }
        }

        public PromotionDate(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
            this.start = localDateTime;
            this.end = localDateTime2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromotionDate)) {
                return false;
            }
            PromotionDate promotionDate = (PromotionDate) other;
            return zdlpuopuiu.eablkybsjg(this.start, promotionDate.start) && zdlpuopuiu.eablkybsjg(this.end, promotionDate.end);
        }

        public int hashCode() {
            LocalDateTime localDateTime = this.start;
            int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
            LocalDateTime localDateTime2 = this.end;
            return iHashCode + (localDateTime2 != null ? localDateTime2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final LocalDateTime getStart() {
            return this.start;
        }

        public String toString() {
            return "PromotionDate(start=" + this.start + ", end=" + this.end + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeSerializable(this.start);
            dest.writeSerializable(this.end);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final LocalDateTime getEnd() {
            return this.end;
        }

        public /* synthetic */ PromotionDate(LocalDateTime localDateTime, LocalDateTime localDateTime2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : localDateTime, (i13 & 2) != 0 ? null : localDateTime2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/promo/Promotion$PromotionItem;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "price", "oldPrice", "unit", "", "needs", "qrCode", "image", "description", "rewardText", "", "isOpen", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "D", "lqeggnwhkg", "()D", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "btonecajqb", "esjtqupxsv", "I", "eablkybsjg", "lereixgezr", "nufgyqmvbu", "pmvmpeiblj", "ppxfxbqfkf", "zynmafqrjb", "zoijcleaow", "istkbnxepw", "dxjokdxxww", "cdpycssgdh", "Z", "gtknphoqwx", "()Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PromotionItem implements Parcelable {
        public static final Parcelable.Creator<PromotionItem> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOpen;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String unit;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final int needs;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardText;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final double oldPrice;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final double price;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String qrCode;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
        private final String image;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PromotionItem createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PromotionItem(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PromotionItem[] newArray(int i13) {
                return new PromotionItem[i13];
            }
        }

        public PromotionItem(String id2, String name, double d13, double d14, String unit, int i13, String qrCode, String str, String description, String rewardText, boolean z13) {
            zdlpuopuiu.btonecajqb(id2, "id");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(unit, "unit");
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(rewardText, "rewardText");
            this.id = id2;
            this.name = name;
            this.price = d13;
            this.oldPrice = d14;
            this.unit = unit;
            this.needs = i13;
            this.qrCode = qrCode;
            this.image = str;
            this.description = description;
            this.rewardText = rewardText;
            this.isOpen = z13;
        }

        /* JADX INFO: renamed from: btonecajqb, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
        public final String getRewardText() {
            return this.rewardText;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final int getNeeds() {
            return this.needs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromotionItem)) {
                return false;
            }
            PromotionItem promotionItem = (PromotionItem) other;
            return zdlpuopuiu.eablkybsjg(this.id, promotionItem.id) && zdlpuopuiu.eablkybsjg(this.name, promotionItem.name) && Double.compare(this.price, promotionItem.price) == 0 && Double.compare(this.oldPrice, promotionItem.oldPrice) == 0 && zdlpuopuiu.eablkybsjg(this.unit, promotionItem.unit) && this.needs == promotionItem.needs && zdlpuopuiu.eablkybsjg(this.qrCode, promotionItem.qrCode) && zdlpuopuiu.eablkybsjg(this.image, promotionItem.image) && zdlpuopuiu.eablkybsjg(this.description, promotionItem.description) && zdlpuopuiu.eablkybsjg(this.rewardText, promotionItem.rewardText) && this.isOpen == promotionItem.isOpen;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
        public final boolean getIsOpen() {
            return this.isOpen;
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final double getOldPrice() {
            return this.oldPrice;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.oldPrice)) * 31) + this.unit.hashCode()) * 31) + Integer.hashCode(this.needs)) * 31) + this.qrCode.hashCode()) * 31;
            String str = this.image;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31) + this.rewardText.hashCode()) * 31) + Boolean.hashCode(this.isOpen);
        }

        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public final double getPrice() {
            return this.price;
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getQrCode() {
            return this.qrCode;
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        public String toString() {
            return "PromotionItem(id=" + this.id + ", name=" + this.name + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", unit=" + this.unit + ", needs=" + this.needs + ", qrCode=" + this.qrCode + ", image=" + this.image + ", description=" + this.description + ", rewardText=" + this.rewardText + ", isOpen=" + this.isOpen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeDouble(this.price);
            dest.writeDouble(this.oldPrice);
            dest.writeString(this.unit);
            dest.writeInt(this.needs);
            dest.writeString(this.qrCode);
            dest.writeString(this.image);
            dest.writeString(this.description);
            dest.writeString(this.rewardText);
            dest.writeInt(this.isOpen ? 1 : 0);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public /* synthetic */ PromotionItem(String str, String str2, double d13, double d14, String str3, int i13, String str4, String str5, String str6, String str7, boolean z13, int i14, gtknphoqwx gtknphoqwxVar) {
            this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? 0.0d : d13, (i14 & 8) == 0 ? d14 : 0.0d, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? "" : str4, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str6, (i14 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? str7 : "", (i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? z13 : false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r52v1, types: [k21.ojitshcjhn] */
    public /* synthetic */ Promotion(Integer num, String str, String str2, zoijcleaow zoijcleaowVar, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, PromotionDate promotionDate, List list2, boolean z13, List list3, ojitshcjhn ojitshcjhnVar, String str17, int i13, gtknphoqwx gtknphoqwxVar) {
        String str18;
        PromotionDate promotionDate2;
        Integer num2 = (i13 & 1) != 0 ? null : num;
        String str19 = (i13 & 2) != 0 ? null : str;
        String str20 = (i13 & 4) != 0 ? "" : str2;
        zoijcleaow zoijcleaowVar2 = (i13 & 8) != 0 ? zoijcleaow.DEFAULT : zoijcleaowVar;
        String str21 = (i13 & 16) != 0 ? "" : str3;
        String str22 = (i13 & 32) != 0 ? "" : str4;
        String str23 = (i13 & 64) != 0 ? "" : str5;
        List listWflxmlrfwp = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list;
        String str24 = (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str6;
        String str25 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str7;
        String str26 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str8;
        String str27 = (i13 & 2048) != 0 ? "" : str9;
        String str28 = (i13 & 4096) != 0 ? "" : str10;
        String str29 = (i13 & 8192) != 0 ? "" : str11;
        String str30 = (i13 & 16384) != 0 ? "" : str12;
        String str31 = (i13 & 32768) != 0 ? "" : str13;
        String str32 = (i13 & 65536) != 0 ? "" : str14;
        String str33 = (i13 & 131072) != 0 ? "" : str15;
        String str34 = (i13 & 262144) != 0 ? "" : str16;
        if ((i13 & 524288) != 0) {
            str18 = null;
            promotionDate2 = new PromotionDate(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            str18 = null;
            promotionDate2 = promotionDate;
        }
        this(num2, str19, str20, zoijcleaowVar2, str21, str22, str23, listWflxmlrfwp, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, promotionDate2, (1048576 & i13) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & 2097152) != 0 ? false : z13, (i13 & 4194304) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i13 & 8388608) != 0 ? str18 : ojitshcjhnVar, (i13 & 16777216) == 0 ? str17 : str18);
    }
}
