package ru.myspar.subscription.api.model.detail;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J®\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b*\u0010%J\u001a\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b2\u0010PR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00128\u0006¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010P¨\u0006["}, d2 = {"Lru/myspar/subscription/api/model/detail/SubscriptionDetailInfo;", "Landroid/os/Parcelable;", "", "id", "title", "", "isAvailableForOrder", "autoRenewal", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailImageBanner;", "imageBanner", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailProgressBar;", "progressBar", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts;", "availableProducts", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParametersBlock;", "customizableParameters", "Lru/myspar/core/models/promocode/Promocode;", "promoCode", "", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailTerm;", "terms", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailAgreement;", "agreement", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailPriceInfo;", "priceInfo", "Lru/myspar/components/payment/api/models/PaymentModel;", "payments", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lru/myspar/subscription/api/model/detail/SubscriptionDetailImageBanner;Lru/myspar/subscription/api/model/detail/SubscriptionDetailProgressBar;Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts;Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParametersBlock;Lru/myspar/core/models/promocode/Promocode;Ljava/util/List;Lru/myspar/subscription/api/model/detail/SubscriptionDetailAgreement;Lru/myspar/subscription/api/model/detail/SubscriptionDetailPriceInfo;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lru/myspar/subscription/api/model/detail/SubscriptionDetailImageBanner;Lru/myspar/subscription/api/model/detail/SubscriptionDetailProgressBar;Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts;Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParametersBlock;Lru/myspar/core/models/promocode/Promocode;Ljava/util/List;Lru/myspar/subscription/api/model/detail/SubscriptionDetailAgreement;Lru/myspar/subscription/api/model/detail/SubscriptionDetailPriceInfo;Ljava/util/List;)Lru/myspar/subscription/api/model/detail/SubscriptionDetailInfo;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "iwizpuwonk", "jyumaefscl", "Z", "esjtqupxsv", "()Z", "Ljava/lang/Boolean;", "gxszxtbevo", "()Ljava/lang/Boolean;", "cqumvgiudr", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailImageBanner;", "dxjokdxxww", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailImageBanner;", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailProgressBar;", "wflxmlrfwp", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailProgressBar;", "lereixgezr", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts;", "lqeggnwhkg", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailAvailableProducts;", "pmvmpeiblj", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParametersBlock;", "nufgyqmvbu", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailCustomizableParametersBlock;", "zynmafqrjb", "Lru/myspar/core/models/promocode/Promocode;", "oxmwwwfdhm", "()Lru/myspar/core/models/promocode/Promocode;", "istkbnxepw", "Ljava/util/List;", "()Ljava/util/List;", "cdpycssgdh", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailAgreement;", "eablkybsjg", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailAgreement;", "yadqdtsiqt", "Lru/myspar/subscription/api/model/detail/SubscriptionDetailPriceInfo;", "gtknphoqwx", "()Lru/myspar/subscription/api/model/detail/SubscriptionDetailPriceInfo;", "iozdgvuglv", "btonecajqb", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubscriptionDetailInfo implements Parcelable {
    public static final Parcelable.Creator<SubscriptionDetailInfo> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailAgreement agreement;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailImageBanner imageBanner;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailProgressBar progressBar;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List payments;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final List terms;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean autoRenewal;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableForOrder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailAvailableProducts availableProducts;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailCustomizableParametersBlock customizableParameters;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailPriceInfo priceInfo;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promocode promoCode;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            SubscriptionDetailImageBanner subscriptionDetailImageBannerCreateFromParcel = parcel.readInt() == 0 ? null : SubscriptionDetailImageBanner.CREATOR.createFromParcel(parcel);
            SubscriptionDetailProgressBar subscriptionDetailProgressBarCreateFromParcel = parcel.readInt() == 0 ? null : SubscriptionDetailProgressBar.CREATOR.createFromParcel(parcel);
            SubscriptionDetailAvailableProducts subscriptionDetailAvailableProductsCreateFromParcel = parcel.readInt() == 0 ? null : SubscriptionDetailAvailableProducts.CREATOR.createFromParcel(parcel);
            SubscriptionDetailCustomizableParametersBlock subscriptionDetailCustomizableParametersBlockCreateFromParcel = parcel.readInt() == 0 ? null : SubscriptionDetailCustomizableParametersBlock.CREATOR.createFromParcel(parcel);
            Promocode promocode = (Promocode) parcel.readParcelable(SubscriptionDetailInfo.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(SubscriptionDetailTerm.CREATOR.createFromParcel(parcel));
            }
            SubscriptionDetailAgreement subscriptionDetailAgreementCreateFromParcel = parcel.readInt() == 0 ? null : SubscriptionDetailAgreement.CREATOR.createFromParcel(parcel);
            SubscriptionDetailPriceInfo subscriptionDetailPriceInfoCreateFromParcel = parcel.readInt() != 0 ? SubscriptionDetailPriceInfo.CREATOR.createFromParcel(parcel) : null;
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList2.add(parcel.readParcelable(SubscriptionDetailInfo.class.getClassLoader()));
                i16++;
                i15 = i15;
            }
            return new SubscriptionDetailInfo(string, string2, z13, boolValueOf, subscriptionDetailImageBannerCreateFromParcel, subscriptionDetailProgressBarCreateFromParcel, subscriptionDetailAvailableProductsCreateFromParcel, subscriptionDetailCustomizableParametersBlockCreateFromParcel, promocode, arrayList, subscriptionDetailAgreementCreateFromParcel, subscriptionDetailPriceInfoCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SubscriptionDetailInfo[] newArray(int i13) {
            return new SubscriptionDetailInfo[i13];
        }
    }

    public SubscriptionDetailInfo(String id2, String title, boolean z13, Boolean bool, SubscriptionDetailImageBanner subscriptionDetailImageBanner, SubscriptionDetailProgressBar subscriptionDetailProgressBar, SubscriptionDetailAvailableProducts subscriptionDetailAvailableProducts, SubscriptionDetailCustomizableParametersBlock subscriptionDetailCustomizableParametersBlock, Promocode promocode, List terms, SubscriptionDetailAgreement subscriptionDetailAgreement, SubscriptionDetailPriceInfo subscriptionDetailPriceInfo, List payments) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(terms, "terms");
        zdlpuopuiu.btonecajqb(payments, "payments");
        this.id = id2;
        this.title = title;
        this.isAvailableForOrder = z13;
        this.autoRenewal = bool;
        this.imageBanner = subscriptionDetailImageBanner;
        this.progressBar = subscriptionDetailProgressBar;
        this.availableProducts = subscriptionDetailAvailableProducts;
        this.customizableParameters = subscriptionDetailCustomizableParametersBlock;
        this.promoCode = promocode;
        this.terms = terms;
        this.agreement = subscriptionDetailAgreement;
        this.priceInfo = subscriptionDetailPriceInfo;
        this.payments = payments;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final SubscriptionDetailImageBanner getImageBanner() {
        return this.imageBanner;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final SubscriptionDetailAgreement getAgreement() {
        return this.agreement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionDetailInfo)) {
            return false;
        }
        SubscriptionDetailInfo subscriptionDetailInfo = (SubscriptionDetailInfo) other;
        return zdlpuopuiu.eablkybsjg(this.id, subscriptionDetailInfo.id) && zdlpuopuiu.eablkybsjg(this.title, subscriptionDetailInfo.title) && this.isAvailableForOrder == subscriptionDetailInfo.isAvailableForOrder && zdlpuopuiu.eablkybsjg(this.autoRenewal, subscriptionDetailInfo.autoRenewal) && zdlpuopuiu.eablkybsjg(this.imageBanner, subscriptionDetailInfo.imageBanner) && zdlpuopuiu.eablkybsjg(this.progressBar, subscriptionDetailInfo.progressBar) && zdlpuopuiu.eablkybsjg(this.availableProducts, subscriptionDetailInfo.availableProducts) && zdlpuopuiu.eablkybsjg(this.customizableParameters, subscriptionDetailInfo.customizableParameters) && zdlpuopuiu.eablkybsjg(this.promoCode, subscriptionDetailInfo.promoCode) && zdlpuopuiu.eablkybsjg(this.terms, subscriptionDetailInfo.terms) && zdlpuopuiu.eablkybsjg(this.agreement, subscriptionDetailInfo.agreement) && zdlpuopuiu.eablkybsjg(this.priceInfo, subscriptionDetailInfo.priceInfo) && zdlpuopuiu.eablkybsjg(this.payments, subscriptionDetailInfo.payments);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsAvailableForOrder() {
        return this.isAvailableForOrder;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final SubscriptionDetailPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isAvailableForOrder)) * 31;
        Boolean bool = this.autoRenewal;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SubscriptionDetailImageBanner subscriptionDetailImageBanner = this.imageBanner;
        int iHashCode3 = (iHashCode2 + (subscriptionDetailImageBanner == null ? 0 : subscriptionDetailImageBanner.hashCode())) * 31;
        SubscriptionDetailProgressBar subscriptionDetailProgressBar = this.progressBar;
        int iHashCode4 = (iHashCode3 + (subscriptionDetailProgressBar == null ? 0 : subscriptionDetailProgressBar.hashCode())) * 31;
        SubscriptionDetailAvailableProducts subscriptionDetailAvailableProducts = this.availableProducts;
        int iHashCode5 = (iHashCode4 + (subscriptionDetailAvailableProducts == null ? 0 : subscriptionDetailAvailableProducts.hashCode())) * 31;
        SubscriptionDetailCustomizableParametersBlock subscriptionDetailCustomizableParametersBlock = this.customizableParameters;
        int iHashCode6 = (iHashCode5 + (subscriptionDetailCustomizableParametersBlock == null ? 0 : subscriptionDetailCustomizableParametersBlock.hashCode())) * 31;
        Promocode promocode = this.promoCode;
        int iHashCode7 = (((iHashCode6 + (promocode == null ? 0 : promocode.hashCode())) * 31) + this.terms.hashCode()) * 31;
        SubscriptionDetailAgreement subscriptionDetailAgreement = this.agreement;
        int iHashCode8 = (iHashCode7 + (subscriptionDetailAgreement == null ? 0 : subscriptionDetailAgreement.hashCode())) * 31;
        SubscriptionDetailPriceInfo subscriptionDetailPriceInfo = this.priceInfo;
        return ((iHashCode8 + (subscriptionDetailPriceInfo != null ? subscriptionDetailPriceInfo.hashCode() : 0)) * 31) + this.payments.hashCode();
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final SubscriptionDetailAvailableProducts getAvailableProducts() {
        return this.availableProducts;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final SubscriptionDetailCustomizableParametersBlock getCustomizableParameters() {
        return this.customizableParameters;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final Promocode getPromoCode() {
        return this.promoCode;
    }

    public String toString() {
        return "SubscriptionDetailInfo(id=" + this.id + ", title=" + this.title + ", isAvailableForOrder=" + this.isAvailableForOrder + ", autoRenewal=" + this.autoRenewal + ", imageBanner=" + this.imageBanner + ", progressBar=" + this.progressBar + ", availableProducts=" + this.availableProducts + ", customizableParameters=" + this.customizableParameters + ", promoCode=" + this.promoCode + ", terms=" + this.terms + ", agreement=" + this.agreement + ", priceInfo=" + this.priceInfo + ", payments=" + this.payments + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final SubscriptionDetailProgressBar getProgressBar() {
        return this.progressBar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeInt(this.isAvailableForOrder ? 1 : 0);
        Boolean bool = this.autoRenewal;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SubscriptionDetailImageBanner subscriptionDetailImageBanner = this.imageBanner;
        if (subscriptionDetailImageBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subscriptionDetailImageBanner.writeToParcel(dest, flags);
        }
        SubscriptionDetailProgressBar subscriptionDetailProgressBar = this.progressBar;
        if (subscriptionDetailProgressBar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subscriptionDetailProgressBar.writeToParcel(dest, flags);
        }
        SubscriptionDetailAvailableProducts subscriptionDetailAvailableProducts = this.availableProducts;
        if (subscriptionDetailAvailableProducts == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subscriptionDetailAvailableProducts.writeToParcel(dest, flags);
        }
        SubscriptionDetailCustomizableParametersBlock subscriptionDetailCustomizableParametersBlock = this.customizableParameters;
        if (subscriptionDetailCustomizableParametersBlock == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subscriptionDetailCustomizableParametersBlock.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.promoCode, flags);
        List list = this.terms;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((SubscriptionDetailTerm) it.next()).writeToParcel(dest, flags);
        }
        SubscriptionDetailAgreement subscriptionDetailAgreement = this.agreement;
        if (subscriptionDetailAgreement == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subscriptionDetailAgreement.writeToParcel(dest, flags);
        }
        SubscriptionDetailPriceInfo subscriptionDetailPriceInfo = this.priceInfo;
        if (subscriptionDetailPriceInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            subscriptionDetailPriceInfo.writeToParcel(dest, flags);
        }
        List list2 = this.payments;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    public final SubscriptionDetailInfo zoijcleaow(String id2, String title, boolean isAvailableForOrder, Boolean autoRenewal, SubscriptionDetailImageBanner imageBanner, SubscriptionDetailProgressBar progressBar, SubscriptionDetailAvailableProducts availableProducts, SubscriptionDetailCustomizableParametersBlock customizableParameters, Promocode promoCode, List terms, SubscriptionDetailAgreement agreement, SubscriptionDetailPriceInfo priceInfo, List payments) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(terms, "terms");
        zdlpuopuiu.btonecajqb(payments, "payments");
        return new SubscriptionDetailInfo(id2, title, isAvailableForOrder, autoRenewal, imageBanner, progressBar, availableProducts, customizableParameters, promoCode, terms, agreement, priceInfo, payments);
    }
}
