package zf1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f129867iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f129867iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f129867iobyxmoadg == ((iobyxmoadg) obj).f129867iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f129867iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f129867iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f129867iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f129868iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final sz0.wkgbmnqykc f129869ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f129870zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(boolean z13, int i13, sz0.wkgbmnqykc data) {
            super(null);
            zdlpuopuiu.btonecajqb(data, "data");
            this.f129868iobyxmoadg = z13;
            this.f129870zoijcleaow = i13;
            this.f129869ppxfxbqfkf = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f129868iobyxmoadg == zoijcleaowVar.f129868iobyxmoadg && this.f129870zoijcleaow == zoijcleaowVar.f129870zoijcleaow && zdlpuopuiu.eablkybsjg(this.f129869ppxfxbqfkf, zoijcleaowVar.f129869ppxfxbqfkf);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f129868iobyxmoadg) * 31) + Integer.hashCode(this.f129870zoijcleaow)) * 31) + this.f129869ppxfxbqfkf.hashCode();
        }

        public final int iobyxmoadg() {
            return this.f129870zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f129868iobyxmoadg;
        }

        public String toString() {
            return "OrdersLoaded(isFirstPage=" + this.f129868iobyxmoadg + ", currentPage=" + this.f129870zoijcleaow + ", data=" + this.f129869ppxfxbqfkf + ")";
        }

        public final sz0.wkgbmnqykc zoijcleaow() {
            return this.f129869ppxfxbqfkf;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
