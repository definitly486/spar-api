package ru.myspar.tipsorder.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u0015R\u001f\u00107\u001a\u0004\u0018\u0001008\u0006¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lru/myspar/tipsorder/impl/domain/model/TipValue;", "Landroid/os/Parcelable;", "", ExternalMetricsManagerImpl.NAME, "", "Lru/myspar/tipsorder/impl/domain/model/TipOption;", "options", "Lp0/tzroggbefp;", "field", "", "max", "min", "<init>", "(Ljava/lang/String;Ljava/util/List;Lp0/tzroggbefp;II)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/util/List;Lp0/tzroggbefp;II)Lru/myspar/tipsorder/impl/domain/model/TipValue;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getName", "yggfygwlhe", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "jyumaefscl", "Lp0/tzroggbefp;", "eablkybsjg", "()Lp0/tzroggbefp;", "iwizpuwonk", "I", "gxszxtbevo", "cqumvgiudr", "lqeggnwhkg", "", "esjtqupxsv", "Ljava/lang/Long;", "dxjokdxxww", "()Ljava/lang/Long;", "getValue$annotations", "()V", "value", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TipValue implements Parcelable {
    public static final Parcelable.Creator<TipValue> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int min;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final Long value;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final int max;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp field;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List options;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final TipValue createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(TipOption.CREATOR.createFromParcel(parcel));
            }
            return new TipValue(string, arrayList, et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final TipValue[] newArray(int i13) {
            return new TipValue[i13];
        }
    }

    public TipValue(String name, List options, tzroggbefp field, int i13, int i14) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(options, "options");
        zdlpuopuiu.btonecajqb(field, "field");
        this.name = name;
        this.options = options;
        this.field = field;
        this.max = i13;
        this.min = i14;
        this.value = kcexrzcfyt.kcexrzcfyt(field.draadjrbmk());
    }

    public static /* synthetic */ TipValue ppxfxbqfkf(TipValue tipValue, String str, List list, tzroggbefp tzroggbefpVar, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = tipValue.name;
        }
        if ((i15 & 2) != 0) {
            list = tipValue.options;
        }
        List list2 = list;
        if ((i15 & 4) != 0) {
            tzroggbefpVar = tipValue.field;
        }
        tzroggbefp tzroggbefpVar2 = tzroggbefpVar;
        if ((i15 & 8) != 0) {
            i13 = tipValue.max;
        }
        int i16 = i13;
        if ((i15 & 16) != 0) {
            i14 = tipValue.min;
        }
        return tipValue.zoijcleaow(str, list2, tzroggbefpVar2, i16, i14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final tzroggbefp getField() {
        return this.field;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipValue)) {
            return false;
        }
        TipValue tipValue = (TipValue) other;
        return zdlpuopuiu.eablkybsjg(this.name, tipValue.name) && zdlpuopuiu.eablkybsjg(this.options, tipValue.options) && zdlpuopuiu.eablkybsjg(this.field, tipValue.field) && this.max == tipValue.max && this.min == tipValue.min;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.options.hashCode()) * 31) + this.field.hashCode()) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.min);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    public String toString() {
        return "TipValue(name=" + this.name + ", options=" + this.options + ", field=" + this.field + ", max=" + this.max + ", min=" + this.min + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.name);
        List list = this.options;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TipOption) it.next()).writeToParcel(dest, flags);
        }
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.field, dest, flags);
        dest.writeInt(this.max);
        dest.writeInt(this.min);
    }

    public final TipValue zoijcleaow(String name, List options, tzroggbefp field, int max, int min) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(options, "options");
        zdlpuopuiu.btonecajqb(field, "field");
        return new TipValue(name, options, field, max, min);
    }
}
