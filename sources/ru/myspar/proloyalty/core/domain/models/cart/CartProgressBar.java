package ru.myspar.proloyalty.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBar;", "Landroid/os/Parcelable;", "", "title", "", "currentValue", "neededValue", "valuesDifference", "progressColor", "Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBarDeliveryTerms;", "deliveryTerms", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBarDeliveryTerms;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "D", "zoijcleaow", "()D", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "gxszxtbevo", "esjtqupxsv", "Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBarDeliveryTerms;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBarDeliveryTerms;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartProgressBar implements Parcelable {
    public static final Parcelable.Creator<CartProgressBar> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String progressColor;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartProgressBarDeliveryTerms deliveryTerms;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String valuesDifference;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double neededValue;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final double currentValue;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartProgressBar createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CartProgressBar(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CartProgressBarDeliveryTerms.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartProgressBar[] newArray(int i13) {
            return new CartProgressBar[i13];
        }
    }

    public CartProgressBar(String title, double d13, double d14, String valuesDifference, String progressColor, CartProgressBarDeliveryTerms cartProgressBarDeliveryTerms) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(valuesDifference, "valuesDifference");
        zdlpuopuiu.btonecajqb(progressColor, "progressColor");
        this.title = title;
        this.currentValue = d13;
        this.neededValue = d14;
        this.valuesDifference = valuesDifference;
        this.progressColor = progressColor;
        this.deliveryTerms = cartProgressBarDeliveryTerms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final double getNeededValue() {
        return this.neededValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProgressBar)) {
            return false;
        }
        CartProgressBar cartProgressBar = (CartProgressBar) other;
        return zdlpuopuiu.eablkybsjg(this.title, cartProgressBar.title) && Double.compare(this.currentValue, cartProgressBar.currentValue) == 0 && Double.compare(this.neededValue, cartProgressBar.neededValue) == 0 && zdlpuopuiu.eablkybsjg(this.valuesDifference, cartProgressBar.valuesDifference) && zdlpuopuiu.eablkybsjg(this.progressColor, cartProgressBar.progressColor) && zdlpuopuiu.eablkybsjg(this.deliveryTerms, cartProgressBar.deliveryTerms);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getProgressColor() {
        return this.progressColor;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.title.hashCode() * 31) + Double.hashCode(this.currentValue)) * 31) + Double.hashCode(this.neededValue)) * 31) + this.valuesDifference.hashCode()) * 31) + this.progressColor.hashCode()) * 31;
        CartProgressBarDeliveryTerms cartProgressBarDeliveryTerms = this.deliveryTerms;
        return iHashCode + (cartProgressBarDeliveryTerms == null ? 0 : cartProgressBarDeliveryTerms.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getValuesDifference() {
        return this.valuesDifference;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final CartProgressBarDeliveryTerms getDeliveryTerms() {
        return this.deliveryTerms;
    }

    public String toString() {
        return "CartProgressBar(title=" + this.title + ", currentValue=" + this.currentValue + ", neededValue=" + this.neededValue + ", valuesDifference=" + this.valuesDifference + ", progressColor=" + this.progressColor + ", deliveryTerms=" + this.deliveryTerms + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.title);
        dest.writeDouble(this.currentValue);
        dest.writeDouble(this.neededValue);
        dest.writeString(this.valuesDifference);
        dest.writeString(this.progressColor);
        CartProgressBarDeliveryTerms cartProgressBarDeliveryTerms = this.deliveryTerms;
        if (cartProgressBarDeliveryTerms == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cartProgressBarDeliveryTerms.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final double getCurrentValue() {
        return this.currentValue;
    }
}
