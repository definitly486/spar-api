package ru.myspar.myspar.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import f40.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lru/myspar/myspar/impl/domain/model/Promotion;", "Landroid/os/Parcelable;", "", "dashboardName", "dashboardShortDescription", "promoSticker", "color", "Lf40/zoijcleaow;", "navigationLink", "reference", "codePromo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf40/zoijcleaow;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "nufgyqmvbu", "iwizpuwonk", "ppxfxbqfkf", "cqumvgiudr", "Lf40/zoijcleaow;", "lqeggnwhkg", "()Lf40/zoijcleaow;", "esjtqupxsv", "dxjokdxxww", "lereixgezr", "zoijcleaow", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow navigationLink;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String color;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoSticker;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String codePromo;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dashboardShortDescription;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dashboardName;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Promotion createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new Promotion(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : zoijcleaow.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Promotion[] newArray(int i13) {
            return new Promotion[i13];
        }
    }

    public Promotion(String dashboardName, String dashboardShortDescription, String promoSticker, String color, zoijcleaow zoijcleaowVar, String str, String codePromo) {
        zdlpuopuiu.btonecajqb(dashboardName, "dashboardName");
        zdlpuopuiu.btonecajqb(dashboardShortDescription, "dashboardShortDescription");
        zdlpuopuiu.btonecajqb(promoSticker, "promoSticker");
        zdlpuopuiu.btonecajqb(color, "color");
        zdlpuopuiu.btonecajqb(codePromo, "codePromo");
        this.dashboardName = dashboardName;
        this.dashboardShortDescription = dashboardShortDescription;
        this.promoSticker = promoSticker;
        this.color = color;
        this.navigationLink = zoijcleaowVar;
        this.reference = str;
        this.codePromo = codePromo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getDashboardName() {
        return this.dashboardName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return zdlpuopuiu.eablkybsjg(this.dashboardName, promotion.dashboardName) && zdlpuopuiu.eablkybsjg(this.dashboardShortDescription, promotion.dashboardShortDescription) && zdlpuopuiu.eablkybsjg(this.promoSticker, promotion.promoSticker) && zdlpuopuiu.eablkybsjg(this.color, promotion.color) && this.navigationLink == promotion.navigationLink && zdlpuopuiu.eablkybsjg(this.reference, promotion.reference) && zdlpuopuiu.eablkybsjg(this.codePromo, promotion.codePromo);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getDashboardShortDescription() {
        return this.dashboardShortDescription;
    }

    public int hashCode() {
        int iHashCode = ((((((this.dashboardName.hashCode() * 31) + this.dashboardShortDescription.hashCode()) * 31) + this.promoSticker.hashCode()) * 31) + this.color.hashCode()) * 31;
        zoijcleaow zoijcleaowVar = this.navigationLink;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.reference;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.codePromo.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final zoijcleaow getNavigationLink() {
        return this.navigationLink;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getPromoSticker() {
        return this.promoSticker;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public String toString() {
        return "Promotion(dashboardName=" + this.dashboardName + ", dashboardShortDescription=" + this.dashboardShortDescription + ", promoSticker=" + this.promoSticker + ", color=" + this.color + ", navigationLink=" + this.navigationLink + ", reference=" + this.reference + ", codePromo=" + this.codePromo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.dashboardName);
        dest.writeString(this.dashboardShortDescription);
        dest.writeString(this.promoSticker);
        dest.writeString(this.color);
        zoijcleaow zoijcleaowVar = this.navigationLink;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
        dest.writeString(this.reference);
        dest.writeString(this.codePromo);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getCodePromo() {
        return this.codePromo;
    }
}
