package ru.myspar.proloyalty.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import ru.myspar.proloyalty.core.navigation.model.DeepLink;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u000e\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\tH\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\r#$%&'()*+,-./¨\u00060"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "Landroid/os/Parcelable;", "", "linkType", "<init>", "(Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lgg/wwaezpbzkn;", "builderAction", "eablkybsjg", "(Ljava/lang/String;Ltg/draadjrbmk;)Ljava/lang/String;", "zdlpuopuiu", "Ljava/lang/String;", "getLinkType", "()Ljava/lang/String;", "yggfygwlhe", "None", "Purchases", "Catalog", "Partner", "Product", "Subscription", "BlockBanners", "RedirectPayment", "PurchaseList", "ReturnFromPaySystem", "MyDiscounts", "Combo", "ActivationCard", "iobyxmoadg", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$ActivationCard;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$BlockBanners;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Combo;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$MyDiscounts;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$None;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Partner;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Product;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$PurchaseList;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Purchases;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$RedirectPayment;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$ReturnFromPaySystem;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Subscription;", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeepLink implements Parcelable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String linkType;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final List f95303jyumaefscl = jyumaefscl.rgvfuqvkyq("catalog", "partner", "product", "subscription", "blockbanners", "purchases", "successPayment", "lists", "return_from_pay_system", "discounts", "combo", "activation_card");

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$ActivationCard;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "<init>", "()V", "", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivationCard extends DeepLink {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final ActivationCard f95306iwizpuwonk = new ActivationCard();
        public static final Parcelable.Creator<ActivationCard> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final ActivationCard createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return ActivationCard.f95306iwizpuwonk;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final ActivationCard[] newArray(int i13) {
                return new ActivationCard[i13];
            }
        }

        private ActivationCard() {
            super("activation_card", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("activation_card");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActivationCard);
        }

        public int hashCode() {
            return 1663188242;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.ActivationCard.lqeggnwhkg((StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "ActivationCard";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$BlockBanners;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "", "id", "<init>", "(Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "getId", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockBanners extends DeepLink {
        public static final Parcelable.Creator<BlockBanners> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final BlockBanners createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new BlockBanners(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final BlockBanners[] newArray(int i13) {
                return new BlockBanners[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockBanners(String id2) {
            super("blockbanners", null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.id = id2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(BlockBanners blockBanners, StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("blockbanners?id=" + blockBanners.id);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BlockBanners) && zdlpuopuiu.eablkybsjg(this.id, ((BlockBanners) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.zoijcleaow
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.BlockBanners.lqeggnwhkg(this.f53533zdlpuopuiu, (StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "BlockBanners(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.id);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "<init>", "()V", "iwizpuwonk", "Tab", "SubCatalog", "ProductList", "iobyxmoadg", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog$ProductList;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog$SubCatalog;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog$Tab;", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Catalog extends DeepLink {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog$ProductList;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog;", "", "sectionId", "parentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cqumvgiudr", "Ljava/lang/String;", "dxjokdxxww", "esjtqupxsv", "nufgyqmvbu", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProductList extends Catalog {
            public static final Parcelable.Creator<ProductList> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sectionId;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
            private final String parentId;

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final ProductList createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new ProductList(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final ProductList[] newArray(int i13) {
                    return new ProductList[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProductList(String sectionId, String parentId) {
                super(null);
                zdlpuopuiu.btonecajqb(sectionId, "sectionId");
                zdlpuopuiu.btonecajqb(parentId, "parentId");
                this.sectionId = sectionId;
                this.parentId = parentId;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn lqeggnwhkg(ProductList productList, StringBuilder deepLinkUrl) {
                zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
                deepLinkUrl.append("catalog?section=" + productList.sectionId + "&parent=" + productList.parentId);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
            public final String getSectionId() {
                return this.sectionId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductList)) {
                    return false;
                }
                ProductList productList = (ProductList) other;
                return zdlpuopuiu.eablkybsjg(this.sectionId, productList.sectionId) && zdlpuopuiu.eablkybsjg(this.parentId, productList.parentId);
            }

            public int hashCode() {
                return (this.sectionId.hashCode() * 31) + this.parentId.hashCode();
            }

            /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
            public final String getParentId() {
                return this.parentId;
            }

            @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
            public String ppxfxbqfkf(String currentHost) {
                zdlpuopuiu.btonecajqb(currentHost, "currentHost");
                return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return DeepLink.Catalog.ProductList.lqeggnwhkg(this.f53521zdlpuopuiu, (StringBuilder) obj);
                    }
                });
            }

            public String toString() {
                return "ProductList(sectionId=" + this.sectionId + ", parentId=" + this.parentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeString(this.sectionId);
                dest.writeString(this.parentId);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog$SubCatalog;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog;", "", "sectionId", "<init>", "(Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cqumvgiudr", "Ljava/lang/String;", "nufgyqmvbu", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SubCatalog extends Catalog {
            public static final Parcelable.Creator<SubCatalog> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sectionId;

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final SubCatalog createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new SubCatalog(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final SubCatalog[] newArray(int i13) {
                    return new SubCatalog[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubCatalog(String sectionId) {
                super(null);
                zdlpuopuiu.btonecajqb(sectionId, "sectionId");
                this.sectionId = sectionId;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn lqeggnwhkg(SubCatalog subCatalog, StringBuilder deepLinkUrl) {
                zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
                deepLinkUrl.append("catalog/" + subCatalog.sectionId);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubCatalog) && zdlpuopuiu.eablkybsjg(this.sectionId, ((SubCatalog) other).sectionId);
            }

            public int hashCode() {
                return this.sectionId.hashCode();
            }

            /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
            public final String getSectionId() {
                return this.sectionId;
            }

            @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
            public String ppxfxbqfkf(String currentHost) {
                zdlpuopuiu.btonecajqb(currentHost, "currentHost");
                return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.wkgbmnqykc
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return DeepLink.Catalog.SubCatalog.lqeggnwhkg(this.f53532zdlpuopuiu, (StringBuilder) obj);
                    }
                });
            }

            public String toString() {
                return "SubCatalog(sectionId=" + this.sectionId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeString(this.sectionId);
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog$Tab;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink$Catalog;", "<init>", "()V", "", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tab extends Catalog {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            public static final Tab f95312cqumvgiudr = new Tab();
            public static final Parcelable.Creator<Tab> CREATOR = new iobyxmoadg();

            public static final class iobyxmoadg implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public final Tab createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    parcel.readInt();
                    return Tab.f95312cqumvgiudr;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public final Tab[] newArray(int i13) {
                    return new Tab[i13];
                }
            }

            private Tab() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn lqeggnwhkg(StringBuilder deepLinkUrl) {
                zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
                deepLinkUrl.append("catalog");
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Tab);
            }

            public int hashCode() {
                return -1345746988;
            }

            @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
            public String ppxfxbqfkf(String currentHost) {
                zdlpuopuiu.btonecajqb(currentHost, "currentHost");
                return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.eablkybsjg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return DeepLink.Catalog.Tab.lqeggnwhkg((StringBuilder) obj);
                    }
                });
            }

            public String toString() {
                return "Tab";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                zdlpuopuiu.btonecajqb(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.navigation.model.DeepLink$Catalog$iobyxmoadg, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final Catalog iobyxmoadg(String str, String str2) {
                if (str == null || kcexrzcfyt.zfvoamnweg(str)) {
                    return Tab.f95312cqumvgiudr;
                }
                return (str2 == null || kcexrzcfyt.zfvoamnweg(str2)) ? new SubCatalog(str) : new ProductList(str, str2);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Catalog(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Catalog() {
            super("catalog", null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Combo;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "", "comboId", "<init>", "(Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "nufgyqmvbu", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Combo extends DeepLink {
        public static final Parcelable.Creator<Combo> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String comboId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Combo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Combo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Combo[] newArray(int i13) {
                return new Combo[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Combo(String comboId) {
            super("combo", null);
            zdlpuopuiu.btonecajqb(comboId, "comboId");
            this.comboId = comboId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(Combo combo, StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("combo?id=" + combo.comboId);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Combo) && zdlpuopuiu.eablkybsjg(this.comboId, ((Combo) other).comboId);
        }

        public int hashCode() {
            return this.comboId.hashCode();
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getComboId() {
            return this.comboId;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.gxszxtbevo
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.Combo.lqeggnwhkg(this.f53468zdlpuopuiu, (StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "Combo(comboId=" + this.comboId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.comboId);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$MyDiscounts;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "<init>", "()V", "", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MyDiscounts extends DeepLink {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final MyDiscounts f95314iwizpuwonk = new MyDiscounts();
        public static final Parcelable.Creator<MyDiscounts> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final MyDiscounts createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return MyDiscounts.f95314iwizpuwonk;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final MyDiscounts[] newArray(int i13) {
                return new MyDiscounts[i13];
            }
        }

        private MyDiscounts() {
            super("discounts", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("discounts");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MyDiscounts);
        }

        public int hashCode() {
            return 942838458;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.lqeggnwhkg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.MyDiscounts.lqeggnwhkg((StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "MyDiscounts";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$None;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "<init>", "()V", "", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends DeepLink {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final None f95315iwizpuwonk = new None();
        public static final Parcelable.Creator<None> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final None createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return None.f95315iwizpuwonk;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final None[] newArray(int i13) {
                return new None[i13];
            }
        }

        private None() {
            super("", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -1678572028;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return "";
        }

        public String toString() {
            return "None";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Partner;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "", "type", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "getType", "cqumvgiudr", "nufgyqmvbu", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Partner extends DeepLink {
        public static final Parcelable.Creator<Partner> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Partner createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Partner(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Partner[] newArray(int i13) {
                return new Partner[i13];
            }
        }

        public Partner(String str, String str2) {
            super("partner", null);
            this.type = str;
            this.code = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(String str, StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("partner?" + str);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Partner)) {
                return false;
            }
            Partner partner = (Partner) other;
            return zdlpuopuiu.eablkybsjg(this.type, partner.type) && zdlpuopuiu.eablkybsjg(this.code, partner.code);
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            final String str;
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            String str2 = this.type;
            if (str2 != null) {
                str = "type=" + str2;
            } else {
                String str3 = this.code;
                if (str3 != null) {
                    str = "code=" + str3;
                } else {
                    str = null;
                }
            }
            String strEablkybsjg = str != null ? eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.nufgyqmvbu
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.Partner.lqeggnwhkg(str, (StringBuilder) obj);
                }
            }) : null;
            return strEablkybsjg == null ? "" : strEablkybsjg;
        }

        public String toString() {
            return "Partner(type=" + this.type + ", code=" + this.code + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.code);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Product;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "", "id", "<init>", "(Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "getId", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Product extends DeepLink {
        public static final Parcelable.Creator<Product> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Product createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Product(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Product[] newArray(int i13) {
                return new Product[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(String id2) {
            super("product", null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.id = id2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(Product product, StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("product?id=" + product.id);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Product) && zdlpuopuiu.eablkybsjg(this.id, ((Product) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.dxjokdxxww
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.Product.lqeggnwhkg(this.f53467zdlpuopuiu, (StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "Product(id=" + this.id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.id);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$PurchaseList;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "", "purchaseListId", "<init>", "(Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "nufgyqmvbu", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PurchaseList extends DeepLink {
        public static final Parcelable.Creator<PurchaseList> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purchaseListId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PurchaseList createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PurchaseList(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PurchaseList[] newArray(int i13) {
                return new PurchaseList[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseList(String purchaseListId) {
            super("lists", null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.purchaseListId = purchaseListId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(PurchaseList purchaseList, StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("lists?id=" + purchaseList.purchaseListId);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PurchaseList) && zdlpuopuiu.eablkybsjg(this.purchaseListId, ((PurchaseList) other).purchaseListId);
        }

        public int hashCode() {
            return this.purchaseListId.hashCode();
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getPurchaseListId() {
            return this.purchaseListId;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.btonecajqb
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.PurchaseList.lqeggnwhkg(this.f53466zdlpuopuiu, (StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "PurchaseList(purchaseListId=" + this.purchaseListId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.purchaseListId);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Purchases;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "<init>", "()V", "", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Purchases extends DeepLink {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final Purchases f95320iwizpuwonk = new Purchases();
        public static final Parcelable.Creator<Purchases> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Purchases createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return Purchases.f95320iwizpuwonk;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Purchases[] newArray(int i13) {
                return new Purchases[i13];
            }
        }

        private Purchases() {
            super("purchases", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("purchases");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Purchases);
        }

        public int hashCode() {
            return -1782930362;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.gtknphoqwx
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.Purchases.lqeggnwhkg((StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "Purchases";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$RedirectPayment;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "", "orderId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Ljava/lang/String;", "gxszxtbevo", "cqumvgiudr", "getType", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RedirectPayment extends DeepLink {
        public static final Parcelable.Creator<RedirectPayment> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final RedirectPayment createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new RedirectPayment(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final RedirectPayment[] newArray(int i13) {
                return new RedirectPayment[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectPayment(String orderId, String type) {
            super("", null);
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(type, "type");
            this.orderId = orderId;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedirectPayment)) {
                return false;
            }
            RedirectPayment redirectPayment = (RedirectPayment) other;
            return zdlpuopuiu.eablkybsjg(this.orderId, redirectPayment.orderId) && zdlpuopuiu.eablkybsjg(this.type, redirectPayment.type);
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            return (this.orderId.hashCode() * 31) + this.type.hashCode();
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return "";
        }

        public String toString() {
            return "RedirectPayment(orderId=" + this.orderId + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.orderId);
            dest.writeString(this.type);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$ReturnFromPaySystem;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "<init>", "()V", "", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReturnFromPaySystem extends DeepLink {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final ReturnFromPaySystem f95323iwizpuwonk = new ReturnFromPaySystem();
        public static final Parcelable.Creator<ReturnFromPaySystem> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final ReturnFromPaySystem createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return ReturnFromPaySystem.f95323iwizpuwonk;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final ReturnFromPaySystem[] newArray(int i13) {
                return new ReturnFromPaySystem[i13];
            }
        }

        private ReturnFromPaySystem() {
            super("return_from_pay_system", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("return_from_pay_system");
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ReturnFromPaySystem);
        }

        public int hashCode() {
            return -1499492143;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.draadjrbmk
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.ReturnFromPaySystem.lqeggnwhkg((StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "ReturnFromPaySystem";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/core/navigation/model/DeepLink$Subscription;", "Lru/myspar/proloyalty/core/navigation/model/DeepLink;", "Le21/iobyxmoadg;", "subscriptionTicketType", "", "subscriptionId", "<init>", "(Le21/iobyxmoadg;Ljava/lang/String;)V", "currentHost", "ppxfxbqfkf", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "iwizpuwonk", "Le21/iobyxmoadg;", "getSubscriptionTicketType", "()Le21/iobyxmoadg;", "cqumvgiudr", "Ljava/lang/String;", "nufgyqmvbu", "navigation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Subscription extends DeepLink {
        public static final Parcelable.Creator<Subscription> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subscriptionId;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final e21.iobyxmoadg subscriptionTicketType;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Subscription createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Subscription(e21.iobyxmoadg.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Subscription[] newArray(int i13) {
                return new Subscription[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(e21.iobyxmoadg subscriptionTicketType, String str) {
            super("subscription", null);
            zdlpuopuiu.btonecajqb(subscriptionTicketType, "subscriptionTicketType");
            this.subscriptionTicketType = subscriptionTicketType;
            this.subscriptionId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn lqeggnwhkg(Subscription subscription, StringBuilder deepLinkUrl) {
            zdlpuopuiu.btonecajqb(deepLinkUrl, "$this$deepLinkUrl");
            deepLinkUrl.append("subscription");
            String str = subscription.subscriptionId;
            if (str != null && !kcexrzcfyt.zfvoamnweg(str)) {
                deepLinkUrl.append("?id=" + subscription.subscriptionId);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return this.subscriptionTicketType == subscription.subscriptionTicketType && zdlpuopuiu.eablkybsjg(this.subscriptionId, subscription.subscriptionId);
        }

        public int hashCode() {
            int iHashCode = this.subscriptionTicketType.hashCode() * 31;
            String str = this.subscriptionId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
        public final String getSubscriptionId() {
            return this.subscriptionId;
        }

        @Override // ru.myspar.proloyalty.core.navigation.model.DeepLink
        public String ppxfxbqfkf(String currentHost) {
            zdlpuopuiu.btonecajqb(currentHost, "currentHost");
            return eablkybsjg(currentHost, new draadjrbmk() { // from class: k21.wflxmlrfwp
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return DeepLink.Subscription.lqeggnwhkg(this.f53531zdlpuopuiu, (StringBuilder) obj);
                }
            });
        }

        public String toString() {
            return "Subscription(subscriptionTicketType=" + this.subscriptionTicketType + ", subscriptionId=" + this.subscriptionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.subscriptionTicketType.name());
            dest.writeString(this.subscriptionId);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.navigation.model.DeepLink$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final List iobyxmoadg() {
            return DeepLink.f95303jyumaefscl;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeepLink(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    protected final String eablkybsjg(String currentHost, draadjrbmk builderAction) {
        zdlpuopuiu.btonecajqb(currentHost, "currentHost");
        zdlpuopuiu.btonecajqb(builderAction, "builderAction");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(EcomSbpViewModel.HTTPS_PATTERN);
        sb3.append(currentHost);
        sb3.append(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
        builderAction.invoke(sb3);
        return sb3.toString();
    }

    public abstract String ppxfxbqfkf(String currentHost);

    private DeepLink(String str) {
        this.linkType = str;
    }
}
