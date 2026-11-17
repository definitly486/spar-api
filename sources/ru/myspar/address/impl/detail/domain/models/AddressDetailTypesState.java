package ru.myspar.address.impl.detail.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import hn.iobyxmoadg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/myspar/address/impl/detail/domain/models/AddressDetailTypesState;", "Landroid/os/Parcelable;", "", "Lhn/iobyxmoadg;", "types", "selectedType", "<init>", "(Ljava/util/List;Lhn/iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ppxfxbqfkf", "(Ljava/util/List;Lhn/iobyxmoadg;)Lru/myspar/address/impl/detail/domain/models/AddressDetailTypesState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/util/List;", "lqeggnwhkg", "()Ljava/util/List;", "yggfygwlhe", "Lhn/iobyxmoadg;", "gxszxtbevo", "()Lhn/iobyxmoadg;", "jyumaefscl", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddressDetailTypesState implements Parcelable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final iobyxmoadg selectedType;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List types;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f83899iwizpuwonk = 8;
    public static final Parcelable.Creator<AddressDetailTypesState> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final AddressDetailTypesState f83898cqumvgiudr = new AddressDetailTypesState(iobyxmoadg.wkgbmnqykc(), null);

    /* JADX INFO: renamed from: ru.myspar.address.impl.detail.domain.models.AddressDetailTypesState$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final AddressDetailTypesState iobyxmoadg() {
            return AddressDetailTypesState.f83898cqumvgiudr;
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AddressDetailTypesState createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(iobyxmoadg.valueOf(parcel.readString()));
            }
            return new AddressDetailTypesState(arrayList, parcel.readInt() == 0 ? null : iobyxmoadg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddressDetailTypesState[] newArray(int i13) {
            return new AddressDetailTypesState[i13];
        }
    }

    public AddressDetailTypesState(List types, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(types, "types");
        this.types = types;
        this.selectedType = iobyxmoadgVar;
    }

    public static /* synthetic */ AddressDetailTypesState eablkybsjg(AddressDetailTypesState addressDetailTypesState, List list, iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = addressDetailTypesState.types;
        }
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = addressDetailTypesState.selectedType;
        }
        return addressDetailTypesState.ppxfxbqfkf(list, iobyxmoadgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailTypesState)) {
            return false;
        }
        AddressDetailTypesState addressDetailTypesState = (AddressDetailTypesState) other;
        return zdlpuopuiu.eablkybsjg(this.types, addressDetailTypesState.types) && this.selectedType == addressDetailTypesState.selectedType;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final iobyxmoadg getSelectedType() {
        return this.selectedType;
    }

    public int hashCode() {
        int iHashCode = this.types.hashCode() * 31;
        iobyxmoadg iobyxmoadgVar = this.selectedType;
        return iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getTypes() {
        return this.types;
    }

    public final AddressDetailTypesState ppxfxbqfkf(List types, iobyxmoadg selectedType) {
        zdlpuopuiu.btonecajqb(types, "types");
        return new AddressDetailTypesState(types, selectedType);
    }

    public String toString() {
        return "AddressDetailTypesState(types=" + this.types + ", selectedType=" + this.selectedType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        List list = this.types;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(((iobyxmoadg) it.next()).name());
        }
        iobyxmoadg iobyxmoadgVar = this.selectedType;
        if (iobyxmoadgVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iobyxmoadgVar.name());
        }
    }
}
