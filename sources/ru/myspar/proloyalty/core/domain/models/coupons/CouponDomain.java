package ru.myspar.proloyalty.core.domain.models.coupons;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b%\u0010\"J\u001a\u0010(\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b-\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b0\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b4\u0010AR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\b?\u0010$R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010+\u001a\u0004\bH\u0010$R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010$R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010AR\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010A¨\u0006O"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/coupons/CouponDomain;", "Landroid/os/Parcelable;", "", "id", "title", "description", "image", "backgroundColor", "Lru/myspar/proloyalty/core/domain/models/coupons/CouponColorsDomain;", "promocodeBackgroundColors", "promoCode", "Ljava/time/LocalDate;", "expiredDate", "until", "", "isHot", "", "Lru/myspar/proloyalty/core/domain/models/coupons/CouponHintDomain;", "hints", "buttonText", "action", "reference", "disabled", "qrButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/coupons/CouponColorsDomain;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "dxjokdxxww", "cqumvgiudr", "ppxfxbqfkf", "esjtqupxsv", "Lru/myspar/proloyalty/core/domain/models/coupons/CouponColorsDomain;", "gtknphoqwx", "()Lru/myspar/proloyalty/core/domain/models/coupons/CouponColorsDomain;", "lereixgezr", "btonecajqb", "pmvmpeiblj", "Ljava/time/LocalDate;", "lqeggnwhkg", "()Ljava/time/LocalDate;", "zynmafqrjb", "istkbnxepw", "Z", "()Z", "cdpycssgdh", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "yadqdtsiqt", "iozdgvuglv", "zoijcleaow", "lmojexxdyd", "oxmwwwfdhm", "wwaezpbzkn", "gxszxtbevo", "ylkuphrtab", "wflxmlrfwp", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CouponDomain implements Parcelable {
    public static final Parcelable.Creator<CouponDomain> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String backgroundColor;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponColorsDomain promocodeBackgroundColors;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String action;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHot;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCode;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reference;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expiredDate;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean disabled;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buttonText;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean qrButton;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String until;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CouponDomain createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            CouponColorsDomain couponColorsDomainCreateFromParcel = CouponColorsDomain.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            String string7 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(CouponHintDomain.CREATOR.createFromParcel(parcel));
            }
            return new CouponDomain(string, string2, string3, string4, string5, couponColorsDomainCreateFromParcel, string6, localDate, string7, z13, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CouponDomain[] newArray(int i13) {
            return new CouponDomain[i13];
        }
    }

    public CouponDomain(String id2, String title, String description, String image, String backgroundColor, CouponColorsDomain promocodeBackgroundColors, String promoCode, LocalDate localDate, String str, boolean z13, List hints, String buttonText, String action, String reference, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(backgroundColor, "backgroundColor");
        zdlpuopuiu.btonecajqb(promocodeBackgroundColors, "promocodeBackgroundColors");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.id = id2;
        this.title = title;
        this.description = description;
        this.image = image;
        this.backgroundColor = backgroundColor;
        this.promocodeBackgroundColors = promocodeBackgroundColors;
        this.promoCode = promoCode;
        this.expiredDate = localDate;
        this.until = str;
        this.isHot = z13;
        this.hints = hints;
        this.buttonText = buttonText;
        this.action = action;
        this.reference = reference;
        this.disabled = z14;
        this.qrButton = z15;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponDomain)) {
            return false;
        }
        CouponDomain couponDomain = (CouponDomain) other;
        return zdlpuopuiu.eablkybsjg(this.id, couponDomain.id) && zdlpuopuiu.eablkybsjg(this.title, couponDomain.title) && zdlpuopuiu.eablkybsjg(this.description, couponDomain.description) && zdlpuopuiu.eablkybsjg(this.image, couponDomain.image) && zdlpuopuiu.eablkybsjg(this.backgroundColor, couponDomain.backgroundColor) && zdlpuopuiu.eablkybsjg(this.promocodeBackgroundColors, couponDomain.promocodeBackgroundColors) && zdlpuopuiu.eablkybsjg(this.promoCode, couponDomain.promoCode) && zdlpuopuiu.eablkybsjg(this.expiredDate, couponDomain.expiredDate) && zdlpuopuiu.eablkybsjg(this.until, couponDomain.until) && this.isHot == couponDomain.isHot && zdlpuopuiu.eablkybsjg(this.hints, couponDomain.hints) && zdlpuopuiu.eablkybsjg(this.buttonText, couponDomain.buttonText) && zdlpuopuiu.eablkybsjg(this.action, couponDomain.action) && zdlpuopuiu.eablkybsjg(this.reference, couponDomain.reference) && this.disabled == couponDomain.disabled && this.qrButton == couponDomain.qrButton;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsHot() {
        return this.isHot;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final CouponColorsDomain getPromocodeBackgroundColors() {
        return this.promocodeBackgroundColors;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.image.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.promocodeBackgroundColors.hashCode()) * 31) + this.promoCode.hashCode()) * 31;
        LocalDate localDate = this.expiredDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.until;
        return ((((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isHot)) * 31) + this.hints.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.action.hashCode()) * 31) + this.reference.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.qrButton);
    }

    /* JADX INFO: renamed from: istkbnxepw, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getUntil() {
        return this.until;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final LocalDate getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String toString() {
        return "CouponDomain(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", backgroundColor=" + this.backgroundColor + ", promocodeBackgroundColors=" + this.promocodeBackgroundColors + ", promoCode=" + this.promoCode + ", expiredDate=" + this.expiredDate + ", until=" + this.until + ", isHot=" + this.isHot + ", hints=" + this.hints + ", buttonText=" + this.buttonText + ", action=" + this.action + ", reference=" + this.reference + ", disabled=" + this.disabled + ", qrButton=" + this.qrButton + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getQrButton() {
        return this.qrButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.image);
        dest.writeString(this.backgroundColor);
        this.promocodeBackgroundColors.writeToParcel(dest, flags);
        dest.writeString(this.promoCode);
        dest.writeSerializable(this.expiredDate);
        dest.writeString(this.until);
        dest.writeInt(this.isHot ? 1 : 0);
        List list = this.hints;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CouponHintDomain) it.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.buttonText);
        dest.writeString(this.action);
        dest.writeString(this.reference);
        dest.writeInt(this.disabled ? 1 : 0);
        dest.writeInt(this.qrButton ? 1 : 0);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAction() {
        return this.action;
    }
}
