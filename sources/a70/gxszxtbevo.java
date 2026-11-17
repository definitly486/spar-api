package a70;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f1044iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f1045zoijcleaow;

        public iobyxmoadg(boolean z13, boolean z14) {
            super(null);
            this.f1044iobyxmoadg = z13;
            this.f1045zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f1044iobyxmoadg == iobyxmoadgVar.f1044iobyxmoadg && this.f1045zoijcleaow == iobyxmoadgVar.f1045zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f1044iobyxmoadg) * 31) + Boolean.hashCode(this.f1045zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f1045zoijcleaow;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f1044iobyxmoadg + ", hideScreen=" + this.f1045zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f1044iobyxmoadg;
        }

        public /* synthetic */ iobyxmoadg(boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
            this(z13, (i13 & 2) != 0 ? false : z14);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f1046iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List commentsGroupList) {
            super(null);
            zdlpuopuiu.btonecajqb(commentsGroupList, "commentsGroupList");
            this.f1046iobyxmoadg = commentsGroupList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f1046iobyxmoadg, ((zoijcleaow) obj).f1046iobyxmoadg);
        }

        public int hashCode() {
            return this.f1046iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f1046iobyxmoadg;
        }

        public String toString() {
            return "UpdateCommentGroup(commentsGroupList=" + this.f1046iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
