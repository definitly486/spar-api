package p51;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75643iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f75644zoijcleaow;

        public iobyxmoadg(boolean z13, boolean z14) {
            super(null);
            this.f75643iobyxmoadg = z13;
            this.f75644zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f75643iobyxmoadg == iobyxmoadgVar.f75643iobyxmoadg && this.f75644zoijcleaow == iobyxmoadgVar.f75644zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f75643iobyxmoadg) * 31) + Boolean.hashCode(this.f75644zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f75644zoijcleaow;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f75643iobyxmoadg + ", hideScreen=" + this.f75644zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f75643iobyxmoadg;
        }

        public /* synthetic */ iobyxmoadg(boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
            this(z13, (i13 & 2) != 0 ? false : z14);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f75645iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List commentsGroupList) {
            super(null);
            zdlpuopuiu.btonecajqb(commentsGroupList, "commentsGroupList");
            this.f75645iobyxmoadg = commentsGroupList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75645iobyxmoadg, ((zoijcleaow) obj).f75645iobyxmoadg);
        }

        public int hashCode() {
            return this.f75645iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f75645iobyxmoadg;
        }

        public String toString() {
            return "UpdateCommentGroup(commentsGroupList=" + this.f75645iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
