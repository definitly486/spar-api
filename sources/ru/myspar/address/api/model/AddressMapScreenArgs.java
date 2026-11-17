package ru.myspar.address.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/myspar/address/api/model/AddressMapScreenArgs;", "Landroid/os/Parcelable;", "Lru/myspar/address/api/model/AddressMapScreenFlow;", "flow", "Lrm/iobyxmoadg;", "mode", "", "isAddressTypeSelectionEnabled", "<init>", "(Lru/myspar/address/api/model/AddressMapScreenFlow;Lrm/iobyxmoadg;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/address/api/model/AddressMapScreenFlow;", "zoijcleaow", "()Lru/myspar/address/api/model/AddressMapScreenFlow;", "yggfygwlhe", "Lrm/iobyxmoadg;", "ppxfxbqfkf", "()Lrm/iobyxmoadg;", "jyumaefscl", "Z", "eablkybsjg", "()Z", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddressMapScreenArgs implements Parcelable {
    public static final Parcelable.Creator<AddressMapScreenArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddressTypeSelectionEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final rm.iobyxmoadg mode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressMapScreenFlow flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AddressMapScreenArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AddressMapScreenArgs((AddressMapScreenFlow) parcel.readParcelable(AddressMapScreenArgs.class.getClassLoader()), rm.iobyxmoadg.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddressMapScreenArgs[] newArray(int i13) {
            return new AddressMapScreenArgs[i13];
        }
    }

    public AddressMapScreenArgs(AddressMapScreenFlow flow, rm.iobyxmoadg mode, boolean z13) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(mode, "mode");
        this.flow = flow;
        this.mode = mode;
        this.isAddressTypeSelectionEnabled = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsAddressTypeSelectionEnabled() {
        return this.isAddressTypeSelectionEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressMapScreenArgs)) {
            return false;
        }
        AddressMapScreenArgs addressMapScreenArgs = (AddressMapScreenArgs) other;
        return zdlpuopuiu.eablkybsjg(this.flow, addressMapScreenArgs.flow) && this.mode == addressMapScreenArgs.mode && this.isAddressTypeSelectionEnabled == addressMapScreenArgs.isAddressTypeSelectionEnabled;
    }

    public int hashCode() {
        return (((this.flow.hashCode() * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.isAddressTypeSelectionEnabled);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final rm.iobyxmoadg getMode() {
        return this.mode;
    }

    public String toString() {
        return "AddressMapScreenArgs(flow=" + this.flow + ", mode=" + this.mode + ", isAddressTypeSelectionEnabled=" + this.isAddressTypeSelectionEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.flow, flags);
        dest.writeString(this.mode.name());
        dest.writeInt(this.isAddressTypeSelectionEnabled ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final AddressMapScreenFlow getFlow() {
        return this.flow;
    }
}
