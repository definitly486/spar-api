package j90;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f50883iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f50884zoijcleaow;

        public iobyxmoadg(boolean z13, boolean z14) {
            super(null);
            this.f50883iobyxmoadg = z13;
            this.f50884zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f50883iobyxmoadg == iobyxmoadgVar.f50883iobyxmoadg && this.f50884zoijcleaow == iobyxmoadgVar.f50884zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f50883iobyxmoadg) * 31) + Boolean.hashCode(this.f50884zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f50884zoijcleaow;
        }

        public String toString() {
            return "UpdateInfo(isLoading=" + this.f50883iobyxmoadg + ", switchEchecksIsEnabled=" + this.f50884zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f50883iobyxmoadg;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
