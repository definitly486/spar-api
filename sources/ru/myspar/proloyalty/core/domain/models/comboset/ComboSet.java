package ru.myspar.proloyalty.core.domain.models.comboset;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import xg.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b*\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b0\u00107R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=R\u001d\u0010N\u001a\u00020\u00108\u0006¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR\u001d\u0010R\u001a\u00020\u00108\u0006¢\u0006\u0012\n\u0004\bO\u0010I\u0012\u0004\bQ\u0010M\u001a\u0004\bP\u0010K¨\u0006S"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "price", "subtitle", "description", "backgroundColorHex", "", "isSelectable", "discountHintColorHex", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboHint;", "hint", "", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "productsFirst", "productsFirstHint", "productsSecond", "productsSecondHint", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/myspar/proloyalty/core/domain/models/comboset/ComboHint;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/comboset/ComboHint;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/comboset/ComboHint;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "D", "lqeggnwhkg", "()D", "iwizpuwonk", "cqumvgiudr", "ppxfxbqfkf", "esjtqupxsv", "zoijcleaow", "lereixgezr", "Z", "()Z", "pmvmpeiblj", "eablkybsjg", "zynmafqrjb", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboHint;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/domain/models/comboset/ComboHint;", "istkbnxepw", "Ljava/util/List;", "btonecajqb", "()Ljava/util/List;", "cdpycssgdh", "gtknphoqwx", "yadqdtsiqt", "wflxmlrfwp", "iozdgvuglv", "oxmwwwfdhm", "lmojexxdyd", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "nufgyqmvbu", "()Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "getProductFirstForDisplay$annotations", "()V", "productFirstForDisplay", "wwaezpbzkn", "dxjokdxxww", "getProductSecondForDisplay$annotations", "productSecondForDisplay", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComboSet implements Parcelable {
    public static final Parcelable.Creator<ComboSet> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboHint productsFirstHint;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String backgroundColorHex;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboHint productsSecondHint;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsFirst;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelectable;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ComboSetProduct productFirstForDisplay;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String discountHintColorHex;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final ComboSetProduct productSecondForDisplay;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsSecond;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboHint hint;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ComboSet createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d13 = parcel.readDouble();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            ComboHint comboHintCreateFromParcel = parcel.readInt() == 0 ? null : ComboHint.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ComboSetProduct.CREATOR.createFromParcel(parcel));
            }
            ComboHint comboHintCreateFromParcel2 = parcel.readInt() == 0 ? null : ComboHint.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList2.add(ComboSetProduct.CREATOR.createFromParcel(parcel));
                i16++;
                i15 = i15;
            }
            return new ComboSet(string, string2, d13, string3, string4, string5, z13, string6, comboHintCreateFromParcel, arrayList, comboHintCreateFromParcel2, arrayList2, parcel.readInt() == 0 ? null : ComboHint.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ComboSet[] newArray(int i13) {
            return new ComboSet[i13];
        }
    }

    public ComboSet(String id2, String name, double d13, String subtitle, String description, String backgroundColorHex, boolean z13, String discountHintColorHex, ComboHint comboHint, List productsFirst, ComboHint comboHint2, List productsSecond, ComboHint comboHint3) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(backgroundColorHex, "backgroundColorHex");
        zdlpuopuiu.btonecajqb(discountHintColorHex, "discountHintColorHex");
        zdlpuopuiu.btonecajqb(productsFirst, "productsFirst");
        zdlpuopuiu.btonecajqb(productsSecond, "productsSecond");
        this.id = id2;
        this.name = name;
        this.price = d13;
        this.subtitle = subtitle;
        this.description = description;
        this.backgroundColorHex = backgroundColorHex;
        this.isSelectable = z13;
        this.discountHintColorHex = discountHintColorHex;
        this.hint = comboHint;
        this.productsFirst = productsFirst;
        this.productsFirstHint = comboHint2;
        this.productsSecond = productsSecond;
        this.productsSecondHint = comboHint3;
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = ppxfxbqfkf.f122316zdlpuopuiu;
        this.productFirstForDisplay = (ComboSetProduct) jyumaefscl.fmlbqenlif(productsFirst, iobyxmoadgVar);
        this.productSecondForDisplay = (ComboSetProduct) jyumaefscl.fmlbqenlif(productsSecond, iobyxmoadgVar);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final List getProductsFirst() {
        return this.productsFirst;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final ComboSetProduct getProductSecondForDisplay() {
        return this.productSecondForDisplay;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getDiscountHintColorHex() {
        return this.discountHintColorHex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboSet)) {
            return false;
        }
        ComboSet comboSet = (ComboSet) other;
        return zdlpuopuiu.eablkybsjg(this.id, comboSet.id) && zdlpuopuiu.eablkybsjg(this.name, comboSet.name) && Double.compare(this.price, comboSet.price) == 0 && zdlpuopuiu.eablkybsjg(this.subtitle, comboSet.subtitle) && zdlpuopuiu.eablkybsjg(this.description, comboSet.description) && zdlpuopuiu.eablkybsjg(this.backgroundColorHex, comboSet.backgroundColorHex) && this.isSelectable == comboSet.isSelectable && zdlpuopuiu.eablkybsjg(this.discountHintColorHex, comboSet.discountHintColorHex) && zdlpuopuiu.eablkybsjg(this.hint, comboSet.hint) && zdlpuopuiu.eablkybsjg(this.productsFirst, comboSet.productsFirst) && zdlpuopuiu.eablkybsjg(this.productsFirstHint, comboSet.productsFirstHint) && zdlpuopuiu.eablkybsjg(this.productsSecond, comboSet.productsSecond) && zdlpuopuiu.eablkybsjg(this.productsSecondHint, comboSet.productsSecondHint);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final ComboHint getProductsFirstHint() {
        return this.productsFirstHint;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ComboHint getHint() {
        return this.hint;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.subtitle.hashCode()) * 31) + this.description.hashCode()) * 31) + this.backgroundColorHex.hashCode()) * 31) + Boolean.hashCode(this.isSelectable)) * 31) + this.discountHintColorHex.hashCode()) * 31;
        ComboHint comboHint = this.hint;
        int iHashCode2 = (((iHashCode + (comboHint == null ? 0 : comboHint.hashCode())) * 31) + this.productsFirst.hashCode()) * 31;
        ComboHint comboHint2 = this.productsFirstHint;
        int iHashCode3 = (((iHashCode2 + (comboHint2 == null ? 0 : comboHint2.hashCode())) * 31) + this.productsSecond.hashCode()) * 31;
        ComboHint comboHint3 = this.productsSecondHint;
        return iHashCode3 + (comboHint3 != null ? comboHint3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsSelectable() {
        return this.isSelectable;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ComboSetProduct getProductFirstForDisplay() {
        return this.productFirstForDisplay;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final ComboHint getProductsSecondHint() {
        return this.productsSecondHint;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public String toString() {
        return "ComboSet(id=" + this.id + ", name=" + this.name + ", price=" + this.price + ", subtitle=" + this.subtitle + ", description=" + this.description + ", backgroundColorHex=" + this.backgroundColorHex + ", isSelectable=" + this.isSelectable + ", discountHintColorHex=" + this.discountHintColorHex + ", hint=" + this.hint + ", productsFirst=" + this.productsFirst + ", productsFirstHint=" + this.productsFirstHint + ", productsSecond=" + this.productsSecond + ", productsSecondHint=" + this.productsSecondHint + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getProductsSecond() {
        return this.productsSecond;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        dest.writeString(this.subtitle);
        dest.writeString(this.description);
        dest.writeString(this.backgroundColorHex);
        dest.writeInt(this.isSelectable ? 1 : 0);
        dest.writeString(this.discountHintColorHex);
        ComboHint comboHint = this.hint;
        if (comboHint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            comboHint.writeToParcel(dest, flags);
        }
        List list = this.productsFirst;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ComboSetProduct) it.next()).writeToParcel(dest, flags);
        }
        ComboHint comboHint2 = this.productsFirstHint;
        if (comboHint2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            comboHint2.writeToParcel(dest, flags);
        }
        List list2 = this.productsSecond;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ComboSetProduct) it2.next()).writeToParcel(dest, flags);
        }
        ComboHint comboHint3 = this.productsSecondHint;
        if (comboHint3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            comboHint3.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBackgroundColorHex() {
        return this.backgroundColorHex;
    }
}
