package ru.myspar.proloyalty.core.models.measure_type;

import android.os.Parcel;
import android.os.Parcelable;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0011\u0010)\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "Landroid/os/Parcelable;", "", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "units", "originalMeasure", "currentMeasure", "<init>", "(Ljava/util/List;Lru/myspar/proloyalty/core/models/measure_type/MeasureType;Lru/myspar/proloyalty/core/models/measure_type/MeasureType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/util/List;Lru/myspar/proloyalty/core/models/measure_type/MeasureType;Lru/myspar/proloyalty/core/models/measure_type/MeasureType;)Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "yggfygwlhe", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "jyumaefscl", "eablkybsjg", "nufgyqmvbu", "()Z", "isSwitchable", "iwizpuwonk", "iobyxmoadg", "models_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MeasureTypeModel implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType currentMeasure;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureType originalMeasure;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List units;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MeasureTypeModel> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final MeasureTypeModel iobyxmoadg() {
            MeasureType.Companion iobyxmoadgVar = MeasureType.INSTANCE;
            return new MeasureTypeModel(jyumaefscl.eablkybsjg(iobyxmoadgVar.zoijcleaow()), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.zoijcleaow());
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final MeasureTypeModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(MeasureTypeModel.class.getClassLoader()));
            }
            return new MeasureTypeModel(arrayList, (MeasureType) parcel.readParcelable(MeasureTypeModel.class.getClassLoader()), (MeasureType) parcel.readParcelable(MeasureTypeModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final MeasureTypeModel[] newArray(int i13) {
            return new MeasureTypeModel[i13];
        }
    }

    public MeasureTypeModel(List units, MeasureType originalMeasure, MeasureType currentMeasure) {
        zdlpuopuiu.btonecajqb(units, "units");
        zdlpuopuiu.btonecajqb(originalMeasure, "originalMeasure");
        zdlpuopuiu.btonecajqb(currentMeasure, "currentMeasure");
        this.units = units;
        this.originalMeasure = originalMeasure;
        this.currentMeasure = currentMeasure;
    }

    public static /* synthetic */ MeasureTypeModel ppxfxbqfkf(MeasureTypeModel measureTypeModel, List list, MeasureType measureType, MeasureType measureType2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = measureTypeModel.units;
        }
        if ((i13 & 2) != 0) {
            measureType = measureTypeModel.originalMeasure;
        }
        if ((i13 & 4) != 0) {
            measureType2 = measureTypeModel.currentMeasure;
        }
        return measureTypeModel.zoijcleaow(list, measureType, measureType2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final MeasureType getCurrentMeasure() {
        return this.currentMeasure;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureTypeModel)) {
            return false;
        }
        MeasureTypeModel measureTypeModel = (MeasureTypeModel) other;
        return zdlpuopuiu.eablkybsjg(this.units, measureTypeModel.units) && zdlpuopuiu.eablkybsjg(this.originalMeasure, measureTypeModel.originalMeasure) && zdlpuopuiu.eablkybsjg(this.currentMeasure, measureTypeModel.currentMeasure);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final MeasureType getOriginalMeasure() {
        return this.originalMeasure;
    }

    public int hashCode() {
        return (((this.units.hashCode() * 31) + this.originalMeasure.hashCode()) * 31) + this.currentMeasure.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getUnits() {
        return this.units;
    }

    public final boolean nufgyqmvbu() {
        return this.units.size() > 1;
    }

    public String toString() {
        return "MeasureTypeModel(units=" + this.units + ", originalMeasure=" + this.originalMeasure + ", currentMeasure=" + this.currentMeasure + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        List list = this.units;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.originalMeasure, flags);
        dest.writeParcelable(this.currentMeasure, flags);
    }

    public final MeasureTypeModel zoijcleaow(List units, MeasureType originalMeasure, MeasureType currentMeasure) {
        zdlpuopuiu.btonecajqb(units, "units");
        zdlpuopuiu.btonecajqb(originalMeasure, "originalMeasure");
        zdlpuopuiu.btonecajqb(currentMeasure, "currentMeasure");
        return new MeasureTypeModel(units, originalMeasure, currentMeasure);
    }
}
