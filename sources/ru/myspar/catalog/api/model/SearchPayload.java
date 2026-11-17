package ru.myspar.catalog.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import v00.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/myspar/catalog/api/model/SearchPayload;", "Landroid/os/Parcelable;", "Lv00/iobyxmoadg;", "flow", "", "orderEditId", "sectionId", "Lv00/ppxfxbqfkf;", "sortType", "<init>", "(Lv00/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;Lv00/ppxfxbqfkf;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lv00/iobyxmoadg;", "zoijcleaow", "()Lv00/iobyxmoadg;", "yggfygwlhe", "Ljava/lang/String;", "ppxfxbqfkf", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Lv00/ppxfxbqfkf;", "gxszxtbevo", "()Lv00/ppxfxbqfkf;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchPayload implements Parcelable {
    public static final Parcelable.Creator<SearchPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf sortType;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sectionId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderEditId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final v00.iobyxmoadg flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SearchPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SearchPayload(v00.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ppxfxbqfkf.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SearchPayload[] newArray(int i13) {
            return new SearchPayload[i13];
        }
    }

    public SearchPayload(v00.iobyxmoadg flow, String str, String str2, ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        this.flow = flow;
        this.orderEditId = str;
        this.sectionId = str2;
        this.sortType = ppxfxbqfkfVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchPayload)) {
            return false;
        }
        SearchPayload searchPayload = (SearchPayload) other;
        return this.flow == searchPayload.flow && zdlpuopuiu.eablkybsjg(this.orderEditId, searchPayload.orderEditId) && zdlpuopuiu.eablkybsjg(this.sectionId, searchPayload.sectionId) && this.sortType == searchPayload.sortType;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ppxfxbqfkf getSortType() {
        return this.sortType;
    }

    public int hashCode() {
        int iHashCode = this.flow.hashCode() * 31;
        String str = this.orderEditId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sectionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ppxfxbqfkf ppxfxbqfkfVar = this.sortType;
        return iHashCode3 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getOrderEditId() {
        return this.orderEditId;
    }

    public String toString() {
        return "SearchPayload(flow=" + this.flow + ", orderEditId=" + this.orderEditId + ", sectionId=" + this.sectionId + ", sortType=" + this.sortType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.orderEditId);
        dest.writeString(this.sectionId);
        ppxfxbqfkf ppxfxbqfkfVar = this.sortType;
        if (ppxfxbqfkfVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ppxfxbqfkfVar.name());
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final v00.iobyxmoadg getFlow() {
        return this.flow;
    }

    public /* synthetic */ SearchPayload(v00.iobyxmoadg iobyxmoadgVar, String str, String str2, ppxfxbqfkf ppxfxbqfkfVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? v00.iobyxmoadg.DEFAULT : iobyxmoadgVar, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : ppxfxbqfkfVar);
    }
}
