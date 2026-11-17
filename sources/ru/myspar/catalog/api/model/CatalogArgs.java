package ru.myspar.catalog.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/myspar/catalog/api/model/CatalogArgs;", "Landroid/os/Parcelable;", "Lv00/iobyxmoadg;", "flow", "", "orderEditId", "<init>", "(Lv00/iobyxmoadg;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lv00/iobyxmoadg;", "zoijcleaow", "()Lv00/iobyxmoadg;", "yggfygwlhe", "Ljava/lang/String;", "ppxfxbqfkf", "eablkybsjg", "()Z", "isEditOrderMode", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CatalogArgs implements Parcelable {
    public static final Parcelable.Creator<CatalogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderEditId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final v00.iobyxmoadg flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CatalogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CatalogArgs(v00.iobyxmoadg.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CatalogArgs[] newArray(int i13) {
            return new CatalogArgs[i13];
        }
    }

    public CatalogArgs(v00.iobyxmoadg flow, String str) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        this.flow = flow;
        this.orderEditId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean eablkybsjg() {
        return this.flow == v00.iobyxmoadg.ORDER_EDIT;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogArgs)) {
            return false;
        }
        CatalogArgs catalogArgs = (CatalogArgs) other;
        return this.flow == catalogArgs.flow && zdlpuopuiu.eablkybsjg(this.orderEditId, catalogArgs.orderEditId);
    }

    public int hashCode() {
        int iHashCode = this.flow.hashCode() * 31;
        String str = this.orderEditId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getOrderEditId() {
        return this.orderEditId;
    }

    public String toString() {
        return "CatalogArgs(flow=" + this.flow + ", orderEditId=" + this.orderEditId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.orderEditId);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final v00.iobyxmoadg getFlow() {
        return this.flow;
    }

    public /* synthetic */ CatalogArgs(v00.iobyxmoadg iobyxmoadgVar, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? v00.iobyxmoadg.DEFAULT : iobyxmoadgVar, (i13 & 2) != 0 ? null : str);
    }
}
