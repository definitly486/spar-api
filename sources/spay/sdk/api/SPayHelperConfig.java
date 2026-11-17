package spay.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lspay/sdk/api/SPayHelperConfig;", "Landroid/os/Parcelable;", "", "isHelperEnabled", "", "Lspay/sdk/api/SPayHelpers;", "disabledHelpers", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lspay/sdk/api/SPayHelperConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/util/List;", "getDisabledHelpers", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPayHelperConfig implements Parcelable {
    public static final Parcelable.Creator<SPayHelperConfig> CREATOR = new Creator();
    private final List<SPayHelpers> disabledHelpers;
    private final boolean isHelperEnabled;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SPayHelperConfig> {
        @Override // android.os.Parcelable.Creator
        public final SPayHelperConfig createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(SPayHelpers.valueOf(parcel.readString()));
            }
            return new SPayHelperConfig(z13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SPayHelperConfig[] newArray(int i13) {
            return new SPayHelperConfig[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SPayHelperConfig(boolean z13, List<? extends SPayHelpers> disabledHelpers) {
        zdlpuopuiu.btonecajqb(disabledHelpers, "disabledHelpers");
        this.isHelperEnabled = z13;
        this.disabledHelpers = disabledHelpers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SPayHelperConfig copy$default(SPayHelperConfig sPayHelperConfig, boolean z13, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = sPayHelperConfig.isHelperEnabled;
        }
        if ((i13 & 2) != 0) {
            list = sPayHelperConfig.disabledHelpers;
        }
        return sPayHelperConfig.copy(z13, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsHelperEnabled() {
        return this.isHelperEnabled;
    }

    public final List<SPayHelpers> component2() {
        return this.disabledHelpers;
    }

    public final SPayHelperConfig copy(boolean isHelperEnabled, List<? extends SPayHelpers> disabledHelpers) {
        zdlpuopuiu.btonecajqb(disabledHelpers, "disabledHelpers");
        return new SPayHelperConfig(isHelperEnabled, disabledHelpers);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayHelperConfig)) {
            return false;
        }
        SPayHelperConfig sPayHelperConfig = (SPayHelperConfig) other;
        return this.isHelperEnabled == sPayHelperConfig.isHelperEnabled && zdlpuopuiu.eablkybsjg(this.disabledHelpers, sPayHelperConfig.disabledHelpers);
    }

    public final List<SPayHelpers> getDisabledHelpers() {
        return this.disabledHelpers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z13 = this.isHelperEnabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return this.disabledHelpers.hashCode() + (r13 * 31);
    }

    public final boolean isHelperEnabled() {
        return this.isHelperEnabled;
    }

    public String toString() {
        return "SPayHelperConfig(isHelperEnabled=" + this.isHelperEnabled + ", disabledHelpers=" + this.disabledHelpers + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeInt(this.isHelperEnabled ? 1 : 0);
        List<SPayHelpers> list = this.disabledHelpers;
        parcel.writeInt(list.size());
        Iterator<SPayHelpers> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }

    public /* synthetic */ SPayHelperConfig(boolean z13, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? true : z13, list);
    }
}
