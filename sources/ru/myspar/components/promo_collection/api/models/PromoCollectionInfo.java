package ru.myspar.components.promo_collection.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lru/myspar/components/promo_collection/api/models/PromoCollectionInfo;", "Landroid/os/Parcelable;", "", "collectionId", ExternalMetricsManagerImpl.NAME, "balance", "balanceStickerImageUrl", "textForCollection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "getName", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "ppxfxbqfkf", "cqumvgiudr", "gxszxtbevo", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromoCollectionInfo implements Parcelable {
    public static final Parcelable.Creator<PromoCollectionInfo> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String textForCollection;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String balanceStickerImageUrl;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String balance;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String collectionId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PromoCollectionInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PromoCollectionInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PromoCollectionInfo[] newArray(int i13) {
            return new PromoCollectionInfo[i13];
        }
    }

    public PromoCollectionInfo(String collectionId, String name, String balance, String balanceStickerImageUrl, String textForCollection) {
        zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(balance, "balance");
        zdlpuopuiu.btonecajqb(balanceStickerImageUrl, "balanceStickerImageUrl");
        zdlpuopuiu.btonecajqb(textForCollection, "textForCollection");
        this.collectionId = collectionId;
        this.name = name;
        this.balance = balance;
        this.balanceStickerImageUrl = balanceStickerImageUrl;
        this.textForCollection = textForCollection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCollectionInfo)) {
            return false;
        }
        PromoCollectionInfo promoCollectionInfo = (PromoCollectionInfo) other;
        return zdlpuopuiu.eablkybsjg(this.collectionId, promoCollectionInfo.collectionId) && zdlpuopuiu.eablkybsjg(this.name, promoCollectionInfo.name) && zdlpuopuiu.eablkybsjg(this.balance, promoCollectionInfo.balance) && zdlpuopuiu.eablkybsjg(this.balanceStickerImageUrl, promoCollectionInfo.balanceStickerImageUrl) && zdlpuopuiu.eablkybsjg(this.textForCollection, promoCollectionInfo.textForCollection);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getTextForCollection() {
        return this.textForCollection;
    }

    public int hashCode() {
        return (((((((this.collectionId.hashCode() * 31) + this.name.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.balanceStickerImageUrl.hashCode()) * 31) + this.textForCollection.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getBalanceStickerImageUrl() {
        return this.balanceStickerImageUrl;
    }

    public String toString() {
        return "PromoCollectionInfo(collectionId=" + this.collectionId + ", name=" + this.name + ", balance=" + this.balance + ", balanceStickerImageUrl=" + this.balanceStickerImageUrl + ", textForCollection=" + this.textForCollection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.collectionId);
        dest.writeString(this.name);
        dest.writeString(this.balance);
        dest.writeString(this.balanceStickerImageUrl);
        dest.writeString(this.textForCollection);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }
}
