package ru.myspar.domain.feature.comboset.buildyourcombo.strore;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "selectedProductFirst", "selectedProductSecond", "", "productsFirst", "productsSecond", "<init>", "(Lru/myspar/core/domain/models/comboset/ComboSetProduct;Lru/myspar/core/domain/models/comboset/ComboSetProduct;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "eablkybsjg", "()Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "iwizpuwonk", "ppxfxbqfkf", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BuildYourComboDialogArgs implements Parcelable {
    public static final Parcelable.Creator<BuildYourComboDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f87699cqumvgiudr = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsSecond;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productsFirst;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSetProduct selectedProductSecond;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSetProduct selectedProductFirst;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final BuildYourComboDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ComboSetProduct comboSetProduct = (ComboSetProduct) parcel.readParcelable(BuildYourComboDialogArgs.class.getClassLoader());
            ComboSetProduct comboSetProduct2 = (ComboSetProduct) parcel.readParcelable(BuildYourComboDialogArgs.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(BuildYourComboDialogArgs.class.getClassLoader()));
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(BuildYourComboDialogArgs.class.getClassLoader()));
            }
            return new BuildYourComboDialogArgs(comboSetProduct, comboSetProduct2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final BuildYourComboDialogArgs[] newArray(int i13) {
            return new BuildYourComboDialogArgs[i13];
        }
    }

    public BuildYourComboDialogArgs(ComboSetProduct selectedProductFirst, ComboSetProduct selectedProductSecond, List productsFirst, List productsSecond) {
        zdlpuopuiu.btonecajqb(selectedProductFirst, "selectedProductFirst");
        zdlpuopuiu.btonecajqb(selectedProductSecond, "selectedProductSecond");
        zdlpuopuiu.btonecajqb(productsFirst, "productsFirst");
        zdlpuopuiu.btonecajqb(productsSecond, "productsSecond");
        this.selectedProductFirst = selectedProductFirst;
        this.selectedProductSecond = selectedProductSecond;
        this.productsFirst = productsFirst;
        this.productsSecond = productsSecond;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ComboSetProduct getSelectedProductFirst() {
        return this.selectedProductFirst;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildYourComboDialogArgs)) {
            return false;
        }
        BuildYourComboDialogArgs buildYourComboDialogArgs = (BuildYourComboDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.selectedProductFirst, buildYourComboDialogArgs.selectedProductFirst) && zdlpuopuiu.eablkybsjg(this.selectedProductSecond, buildYourComboDialogArgs.selectedProductSecond) && zdlpuopuiu.eablkybsjg(this.productsFirst, buildYourComboDialogArgs.productsFirst) && zdlpuopuiu.eablkybsjg(this.productsSecond, buildYourComboDialogArgs.productsSecond);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ComboSetProduct getSelectedProductSecond() {
        return this.selectedProductSecond;
    }

    public int hashCode() {
        return (((((this.selectedProductFirst.hashCode() * 31) + this.selectedProductSecond.hashCode()) * 31) + this.productsFirst.hashCode()) * 31) + this.productsSecond.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getProductsSecond() {
        return this.productsSecond;
    }

    public String toString() {
        return "BuildYourComboDialogArgs(selectedProductFirst=" + this.selectedProductFirst + ", selectedProductSecond=" + this.selectedProductSecond + ", productsFirst=" + this.productsFirst + ", productsSecond=" + this.productsSecond + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.selectedProductFirst, flags);
        dest.writeParcelable(this.selectedProductSecond, flags);
        List list = this.productsFirst;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        List list2 = this.productsSecond;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getProductsFirst() {
        return this.productsFirst;
    }
}
