package ru.myspar.proloyalty.promo_collection.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/promo_collection/api/models/PromoCollectionPayload;", "Landroid/os/Parcelable;", "", "landingPageId", "specialPromoBannerId", "promoCollectionInfoId", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/ColorsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "zoijcleaow", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromoCollectionPayload implements Parcelable {
    public static final Parcelable.Creator<PromoCollectionPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorModel;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCollectionInfoId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String specialPromoBannerId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String landingPageId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PromoCollectionPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PromoCollectionPayload(parcel.readString(), parcel.readString(), parcel.readString(), (ColorsModel) parcel.readParcelable(PromoCollectionPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PromoCollectionPayload[] newArray(int i13) {
            return new PromoCollectionPayload[i13];
        }
    }

    public PromoCollectionPayload(String landingPageId, String specialPromoBannerId, String promoCollectionInfoId, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(landingPageId, "landingPageId");
        zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
        zdlpuopuiu.btonecajqb(promoCollectionInfoId, "promoCollectionInfoId");
        this.landingPageId = landingPageId;
        this.specialPromoBannerId = specialPromoBannerId;
        this.promoCollectionInfoId = promoCollectionInfoId;
        this.colorModel = colorsModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getPromoCollectionInfoId() {
        return this.promoCollectionInfoId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCollectionPayload)) {
            return false;
        }
        PromoCollectionPayload promoCollectionPayload = (PromoCollectionPayload) other;
        return zdlpuopuiu.eablkybsjg(this.landingPageId, promoCollectionPayload.landingPageId) && zdlpuopuiu.eablkybsjg(this.specialPromoBannerId, promoCollectionPayload.specialPromoBannerId) && zdlpuopuiu.eablkybsjg(this.promoCollectionInfoId, promoCollectionPayload.promoCollectionInfoId) && zdlpuopuiu.eablkybsjg(this.colorModel, promoCollectionPayload.colorModel);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSpecialPromoBannerId() {
        return this.specialPromoBannerId;
    }

    public int hashCode() {
        int iHashCode = ((((this.landingPageId.hashCode() * 31) + this.specialPromoBannerId.hashCode()) * 31) + this.promoCollectionInfoId.hashCode()) * 31;
        ColorsModel colorsModel = this.colorModel;
        return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getLandingPageId() {
        return this.landingPageId;
    }

    public String toString() {
        return "PromoCollectionPayload(landingPageId=" + this.landingPageId + ", specialPromoBannerId=" + this.specialPromoBannerId + ", promoCollectionInfoId=" + this.promoCollectionInfoId + ", colorModel=" + this.colorModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.landingPageId);
        dest.writeString(this.specialPromoBannerId);
        dest.writeString(this.promoCollectionInfoId);
        dest.writeParcelable(this.colorModel, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final ColorsModel getColorModel() {
        return this.colorModel;
    }
}
