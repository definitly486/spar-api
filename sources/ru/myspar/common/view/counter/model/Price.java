package ru.myspar.common.view.counter.model;

import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.SuperscriptSpan;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.common.view.counter.model.Price;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001d¨\u00060"}, d2 = {"Lru/myspar/common/view/counter/model/Price;", "Landroid/os/Parcelable;", "", "price", "priceFractional", "", "priceDouble", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "", "maxLength", "", "btonecajqb", "(I)Z", "measure", "Landroid/graphics/Typeface;", "typeface", "", "ppxfxbqfkf", "(Ljava/lang/String;Landroid/graphics/Typeface;)Ljava/lang/CharSequence;", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "nufgyqmvbu", "jyumaefscl", "D", "lqeggnwhkg", "()D", "iwizpuwonk", "Lgg/gtknphoqwx;", "eablkybsjg", "joined", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f86139cqumvgiudr = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx joined;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double priceDouble;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceFractional;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String price;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Price createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Price[] newArray(int i13) {
            return new Price[i13];
        }
    }

    public Price(String price, String priceFractional, double d13) {
        zdlpuopuiu.btonecajqb(price, "price");
        zdlpuopuiu.btonecajqb(priceFractional, "priceFractional");
        this.price = price;
        this.priceFractional = priceFractional;
        this.priceDouble = d13;
        this.joined = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: qt.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Price.dxjokdxxww(this.f80620zdlpuopuiu);
            }
        });
    }

    private final boolean btonecajqb(int maxLength) {
        return (kcexrzcfyt.zfvoamnweg(this.priceFractional) || zdlpuopuiu.eablkybsjg(this.priceFractional, "00") || this.price.length() >= maxLength) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dxjokdxxww(Price price) {
        StringBuilder sb3 = new StringBuilder(price.price);
        if (gtknphoqwx(price, 0, 1, null)) {
            sb3.append(".");
            sb3.append(price.priceFractional);
        }
        return sb3.toString();
    }

    static /* synthetic */ boolean gtknphoqwx(Price price, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 5;
        }
        return price.btonecajqb(i13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String eablkybsjg() {
        return (String) this.joined.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return zdlpuopuiu.eablkybsjg(this.price, price.price) && zdlpuopuiu.eablkybsjg(this.priceFractional, price.priceFractional) && Double.compare(this.priceDouble, price.priceDouble) == 0;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (((this.price.hashCode() * 31) + this.priceFractional.hashCode()) * 31) + Double.hashCode(this.priceDouble);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getPriceDouble() {
        return this.priceDouble;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getPriceFractional() {
        return this.priceFractional;
    }

    public final CharSequence ppxfxbqfkf(String measure, Typeface typeface) {
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(typeface, "typeface");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ss.iobyxmoadg iobyxmoadgVar = new ss.iobyxmoadg(typeface);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.price);
        spannableStringBuilder.setSpan(iobyxmoadgVar, length, spannableStringBuilder.length(), 17);
        Object[] objArr = {new SuperscriptSpan(), new ss.iobyxmoadg(typeface), new RelativeSizeSpan(0.6f), new StyleSpan(1)};
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.priceFractional);
        for (int i13 = 0; i13 < 4; i13++) {
            spannableStringBuilder.setSpan(objArr[i13], length2, spannableStringBuilder.length(), 17);
        }
        Object[] objArr2 = {new ss.iobyxmoadg(typeface), new RelativeSizeSpan(1.0f)};
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "₽");
        for (int i14 = 0; i14 < 2; i14++) {
            spannableStringBuilder.setSpan(objArr2[i14], length3, spannableStringBuilder.length(), 17);
        }
        if (!kcexrzcfyt.zfvoamnweg(measure)) {
            Object[] objArr3 = {new ForegroundColorSpan(-5855578), new RelativeSizeSpan(0.65f), new StyleSpan(0)};
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) measure);
            for (int i15 = 0; i15 < 3; i15++) {
                spannableStringBuilder.setSpan(objArr3[i15], length4, spannableStringBuilder.length(), 17);
            }
        }
        return new SpannedString(spannableStringBuilder);
    }

    public String toString() {
        return "Price(price=" + this.price + ", priceFractional=" + this.priceFractional + ", priceDouble=" + this.priceDouble + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.price);
        dest.writeString(this.priceFractional);
        dest.writeDouble(this.priceDouble);
    }
}
