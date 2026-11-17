package h5;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f39433iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Bundle f39434ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private androidx.navigation.gtknphoqwx f39435zoijcleaow;

    public wkgbmnqykc(int i13, androidx.navigation.gtknphoqwx gtknphoqwxVar, Bundle bundle) {
        this.f39433iobyxmoadg = i13;
        this.f39435zoijcleaow = gtknphoqwxVar;
        this.f39434ppxfxbqfkf = bundle;
    }

    public final void eablkybsjg(androidx.navigation.gtknphoqwx gtknphoqwxVar) {
        this.f39435zoijcleaow = gtknphoqwxVar;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        if (this.f39433iobyxmoadg == wkgbmnqykcVar.f39433iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f39435zoijcleaow, wkgbmnqykcVar.f39435zoijcleaow)) {
            if (zdlpuopuiu.eablkybsjg(this.f39434ppxfxbqfkf, wkgbmnqykcVar.f39434ppxfxbqfkf)) {
                return true;
            }
            Bundle bundle = this.f39434ppxfxbqfkf;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    Bundle bundle2 = this.f39434ppxfxbqfkf;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = wkgbmnqykcVar.f39434ppxfxbqfkf;
                    if (!zdlpuopuiu.eablkybsjg(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f39433iobyxmoadg) * 31;
        androidx.navigation.gtknphoqwx gtknphoqwxVar = this.f39435zoijcleaow;
        int iHashCode2 = iHashCode + (gtknphoqwxVar != null ? gtknphoqwxVar.hashCode() : 0);
        Bundle bundle = this.f39434ppxfxbqfkf;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i13 = iHashCode2 * 31;
                Bundle bundle2 = this.f39434ppxfxbqfkf;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i13 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final Bundle iobyxmoadg() {
        return this.f39434ppxfxbqfkf;
    }

    public final androidx.navigation.gtknphoqwx ppxfxbqfkf() {
        return this.f39435zoijcleaow;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(wkgbmnqykc.class.getSimpleName());
        sb3.append("(0x");
        sb3.append(Integer.toHexString(this.f39433iobyxmoadg));
        sb3.append(")");
        if (this.f39435zoijcleaow != null) {
            sb3.append(" navOptions=");
            sb3.append(this.f39435zoijcleaow);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }

    public final void wkgbmnqykc(Bundle bundle) {
        this.f39434ppxfxbqfkf = bundle;
    }

    public final int zoijcleaow() {
        return this.f39433iobyxmoadg;
    }

    public /* synthetic */ wkgbmnqykc(int i13, androidx.navigation.gtknphoqwx gtknphoqwxVar, Bundle bundle, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this(i13, (i14 & 2) != 0 ? null : gtknphoqwxVar, (i14 & 4) != 0 ? null : bundle);
    }
}
