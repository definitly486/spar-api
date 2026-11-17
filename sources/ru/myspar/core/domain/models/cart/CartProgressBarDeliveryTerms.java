package ru.myspar.core.domain.models.cart;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/myspar/core/domain/models/cart/CartProgressBarDeliveryTerms;", "Landroid/os/Parcelable;", "", "deliveryTypeTitle", "deliveryPriceTitle", "sumForFreeDeliveryText", "", "Lru/myspar/core/models/progress_bar/CartProgressBarRapid;", "rapids", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartProgressBarDeliveryTerms implements Parcelable {
    public static final Parcelable.Creator<CartProgressBarDeliveryTerms> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List rapids;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sumForFreeDeliveryText;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryPriceTitle;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryTypeTitle;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartProgressBarDeliveryTerms createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(CartProgressBarDeliveryTerms.class.getClassLoader()));
            }
            return new CartProgressBarDeliveryTerms(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartProgressBarDeliveryTerms[] newArray(int i13) {
            return new CartProgressBarDeliveryTerms[i13];
        }
    }

    public CartProgressBarDeliveryTerms(String deliveryTypeTitle, String deliveryPriceTitle, String sumForFreeDeliveryText, List rapids) {
        zdlpuopuiu.btonecajqb(deliveryTypeTitle, "deliveryTypeTitle");
        zdlpuopuiu.btonecajqb(deliveryPriceTitle, "deliveryPriceTitle");
        zdlpuopuiu.btonecajqb(sumForFreeDeliveryText, "sumForFreeDeliveryText");
        zdlpuopuiu.btonecajqb(rapids, "rapids");
        this.deliveryTypeTitle = deliveryTypeTitle;
        this.deliveryPriceTitle = deliveryPriceTitle;
        this.sumForFreeDeliveryText = sumForFreeDeliveryText;
        this.rapids = rapids;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getRapids() {
        return this.rapids;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProgressBarDeliveryTerms)) {
            return false;
        }
        CartProgressBarDeliveryTerms cartProgressBarDeliveryTerms = (CartProgressBarDeliveryTerms) other;
        return zdlpuopuiu.eablkybsjg(this.deliveryTypeTitle, cartProgressBarDeliveryTerms.deliveryTypeTitle) && zdlpuopuiu.eablkybsjg(this.deliveryPriceTitle, cartProgressBarDeliveryTerms.deliveryPriceTitle) && zdlpuopuiu.eablkybsjg(this.sumForFreeDeliveryText, cartProgressBarDeliveryTerms.sumForFreeDeliveryText) && zdlpuopuiu.eablkybsjg(this.rapids, cartProgressBarDeliveryTerms.rapids);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSumForFreeDeliveryText() {
        return this.sumForFreeDeliveryText;
    }

    public int hashCode() {
        return (((((this.deliveryTypeTitle.hashCode() * 31) + this.deliveryPriceTitle.hashCode()) * 31) + this.sumForFreeDeliveryText.hashCode()) * 31) + this.rapids.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getDeliveryTypeTitle() {
        return this.deliveryTypeTitle;
    }

    public String toString() {
        return "CartProgressBarDeliveryTerms(deliveryTypeTitle=" + this.deliveryTypeTitle + ", deliveryPriceTitle=" + this.deliveryPriceTitle + ", sumForFreeDeliveryText=" + this.sumForFreeDeliveryText + ", rapids=" + this.rapids + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.deliveryTypeTitle);
        dest.writeString(this.deliveryPriceTitle);
        dest.writeString(this.sumForFreeDeliveryText);
        List list = this.rapids;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getDeliveryPriceTitle() {
        return this.deliveryPriceTitle;
    }
}
