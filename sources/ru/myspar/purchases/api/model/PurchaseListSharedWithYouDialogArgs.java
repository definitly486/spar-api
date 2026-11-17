package ru.myspar.purchases.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs;", "Landroid/os/Parcelable;", "", "purchaseListId", "purchaseListName", "", "productsCount", "", "isUserHasTheSamePurchaseList", "isPurchaseListFeatureEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZ)V", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "()Ljava/lang/String;", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "I", "zoijcleaow", "()I", "iwizpuwonk", "Z", "lqeggnwhkg", "()Z", "cqumvgiudr", "gxszxtbevo", "FeatureEnabled", "FeatureDisabled", "Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs$FeatureDisabled;", "Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs$FeatureEnabled;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PurchaseListSharedWithYouDialogArgs implements Parcelable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final boolean isPurchaseListFeatureEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final boolean isUserHasTheSamePurchaseList;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final int productsCount;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final String purchaseListName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String purchaseListId;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs$FeatureDisabled;", "Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeatureDisabled extends PurchaseListSharedWithYouDialogArgs {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        public static final FeatureDisabled f102217esjtqupxsv = new FeatureDisabled();
        public static final Parcelable.Creator<FeatureDisabled> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final FeatureDisabled createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return FeatureDisabled.f102217esjtqupxsv;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final FeatureDisabled[] newArray(int i13) {
                return new FeatureDisabled[i13];
            }
        }

        private FeatureDisabled() {
            super("", "", 0, false, false, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FeatureDisabled);
        }

        public int hashCode() {
            return -1571140224;
        }

        public String toString() {
            return "FeatureDisabled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs$FeatureEnabled;", "Lru/myspar/purchases/api/model/PurchaseListSharedWithYouDialogArgs;", "", "purchaseListId", "purchaseListName", "", "productsCount", "", "isUserHasTheSamePurchaseList", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "esjtqupxsv", "Ljava/lang/String;", "ppxfxbqfkf", "lereixgezr", "eablkybsjg", "pmvmpeiblj", "I", "zoijcleaow", "zynmafqrjb", "Z", "lqeggnwhkg", "()Z", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeatureEnabled extends PurchaseListSharedWithYouDialogArgs {
        public static final Parcelable.Creator<FeatureEnabled> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purchaseListId;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purchaseListName;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
        private final int productsCount;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUserHasTheSamePurchaseList;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final FeatureEnabled createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new FeatureEnabled(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final FeatureEnabled[] newArray(int i13) {
                return new FeatureEnabled[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeatureEnabled(String purchaseListId, String purchaseListName, int i13, boolean z13) {
            super(purchaseListId, purchaseListName, i13, z13, true, null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            zdlpuopuiu.btonecajqb(purchaseListName, "purchaseListName");
            this.purchaseListId = purchaseListId;
            this.purchaseListName = purchaseListName;
            this.productsCount = i13;
            this.isUserHasTheSamePurchaseList = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs
        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public String getPurchaseListName() {
            return this.purchaseListName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureEnabled)) {
                return false;
            }
            FeatureEnabled featureEnabled = (FeatureEnabled) other;
            return zdlpuopuiu.eablkybsjg(this.purchaseListId, featureEnabled.purchaseListId) && zdlpuopuiu.eablkybsjg(this.purchaseListName, featureEnabled.purchaseListName) && this.productsCount == featureEnabled.productsCount && this.isUserHasTheSamePurchaseList == featureEnabled.isUserHasTheSamePurchaseList;
        }

        public int hashCode() {
            return (((((this.purchaseListId.hashCode() * 31) + this.purchaseListName.hashCode()) * 31) + Integer.hashCode(this.productsCount)) * 31) + Boolean.hashCode(this.isUserHasTheSamePurchaseList);
        }

        @Override // ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs
        /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
        public boolean getIsUserHasTheSamePurchaseList() {
            return this.isUserHasTheSamePurchaseList;
        }

        @Override // ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public String getPurchaseListId() {
            return this.purchaseListId;
        }

        public String toString() {
            return "FeatureEnabled(purchaseListId=" + this.purchaseListId + ", purchaseListName=" + this.purchaseListName + ", productsCount=" + this.productsCount + ", isUserHasTheSamePurchaseList=" + this.isUserHasTheSamePurchaseList + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.purchaseListId);
            dest.writeString(this.purchaseListName);
            dest.writeInt(this.productsCount);
            dest.writeInt(this.isUserHasTheSamePurchaseList ? 1 : 0);
        }

        @Override // ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs
        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public int getProductsCount() {
            return this.productsCount;
        }
    }

    public /* synthetic */ PurchaseListSharedWithYouDialogArgs(String str, String str2, int i13, boolean z13, boolean z14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, z13, z14);
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public String getPurchaseListName() {
        return this.purchaseListName;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public boolean getIsPurchaseListFeatureEnabled() {
        return this.isPurchaseListFeatureEnabled;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public boolean getIsUserHasTheSamePurchaseList() {
        return this.isUserHasTheSamePurchaseList;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public String getPurchaseListId() {
        return this.purchaseListId;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public int getProductsCount() {
        return this.productsCount;
    }

    private PurchaseListSharedWithYouDialogArgs(String str, String str2, int i13, boolean z13, boolean z14) {
        this.purchaseListId = str;
        this.purchaseListName = str2;
        this.productsCount = i13;
        this.isUserHasTheSamePurchaseList = z13;
        this.isPurchaseListFeatureEnabled = z14;
    }
}
