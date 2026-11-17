package ru.myspar.domain.feature.shops.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lru/myspar/domain/feature/shops/store/ShopsArgs;", "Landroid/os/Parcelable;", "Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;", "flow", "", "bannerId", "blockId", "<init>", "(Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;", "eablkybsjg", "()Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;", "yggfygwlhe", "Ljava/lang/String;", "zoijcleaow", "jyumaefscl", "ppxfxbqfkf", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShopsArgs implements Parcelable {
    public static final Parcelable.Creator<ShopsArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ShopsArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ShopsArgs(zoijcleaow.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ShopsArgs[] newArray(int i13) {
            return new ShopsArgs[i13];
        }
    }

    public enum zoijcleaow {
        DEFAULT,
        SPECIAL_BANNER;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f87894iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public ShopsArgs(zoijcleaow flow, String bannerId, String blockId) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        this.flow = flow;
        this.bannerId = bannerId;
        this.blockId = blockId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final zoijcleaow getFlow() {
        return this.flow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopsArgs)) {
            return false;
        }
        ShopsArgs shopsArgs = (ShopsArgs) other;
        return this.flow == shopsArgs.flow && zdlpuopuiu.eablkybsjg(this.bannerId, shopsArgs.bannerId) && zdlpuopuiu.eablkybsjg(this.blockId, shopsArgs.blockId);
    }

    public int hashCode() {
        return (((this.flow.hashCode() * 31) + this.bannerId.hashCode()) * 31) + this.blockId.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    public String toString() {
        return "ShopsArgs(flow=" + this.flow + ", bannerId=" + this.bannerId + ", blockId=" + this.blockId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.bannerId);
        dest.writeString(this.blockId);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    public /* synthetic */ ShopsArgs(zoijcleaow zoijcleaowVar, String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.DEFAULT : zoijcleaowVar, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2);
    }
}
