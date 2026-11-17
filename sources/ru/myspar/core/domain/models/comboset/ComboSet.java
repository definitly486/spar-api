package ru.myspar.core.domain.models.comboset;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0019R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010\u0019¨\u00063"}, d2 = {"Lru/myspar/core/domain/models/comboset/ComboSet;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "", "price", "", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "productsFirst", "productsFirstMessage", "productsSecond", "productsSecondMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "D", "zoijcleaow", "()D", "iwizpuwonk", "Ljava/util/List;", "ppxfxbqfkf", "()Ljava/util/List;", "cqumvgiudr", "getProductsFirstMessage", "esjtqupxsv", "eablkybsjg", "lereixgezr", "getProductsSecondMessage", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComboSet implements Parcelable {
    public static final Parcelable.Creator<ComboSet> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productsFirstMessage;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsSecond;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsFirst;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productsSecondMessage;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ComboSet createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            double d13 = parcel.readDouble();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ComboSetProduct.CREATOR.createFromParcel(parcel));
            }
            String string3 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(ComboSetProduct.CREATOR.createFromParcel(parcel));
            }
            return new ComboSet(string, string2, d13, arrayList, string3, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ComboSet[] newArray(int i13) {
            return new ComboSet[i13];
        }
    }

    public ComboSet(String id2, String name, double d13, List productsFirst, String str, List productsSecond, String str2) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(productsFirst, "productsFirst");
        zdlpuopuiu.btonecajqb(productsSecond, "productsSecond");
        this.id = id2;
        this.name = name;
        this.price = d13;
        this.productsFirst = productsFirst;
        this.productsFirstMessage = str;
        this.productsSecond = productsSecond;
        this.productsSecondMessage = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getProductsSecond() {
        return this.productsSecond;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboSet)) {
            return false;
        }
        ComboSet comboSet = (ComboSet) other;
        return zdlpuopuiu.eablkybsjg(this.id, comboSet.id) && zdlpuopuiu.eablkybsjg(this.name, comboSet.name) && Double.compare(this.price, comboSet.price) == 0 && zdlpuopuiu.eablkybsjg(this.productsFirst, comboSet.productsFirst) && zdlpuopuiu.eablkybsjg(this.productsFirstMessage, comboSet.productsFirstMessage) && zdlpuopuiu.eablkybsjg(this.productsSecond, comboSet.productsSecond) && zdlpuopuiu.eablkybsjg(this.productsSecondMessage, comboSet.productsSecondMessage);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + this.productsFirst.hashCode()) * 31;
        String str = this.productsFirstMessage;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.productsSecond.hashCode()) * 31;
        String str2 = this.productsSecondMessage;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getProductsFirst() {
        return this.productsFirst;
    }

    public String toString() {
        return "ComboSet(id=" + this.id + ", name=" + this.name + ", price=" + this.price + ", productsFirst=" + this.productsFirst + ", productsFirstMessage=" + this.productsFirstMessage + ", productsSecond=" + this.productsSecond + ", productsSecondMessage=" + this.productsSecondMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeDouble(this.price);
        List list = this.productsFirst;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ComboSetProduct) it.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.productsFirstMessage);
        List list2 = this.productsSecond;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ComboSetProduct) it2.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.productsSecondMessage);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final double getPrice() {
        return this.price;
    }
}
