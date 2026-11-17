package e80;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserSharePromo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f30904iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f30904iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f30904iobyxmoadg == ((iobyxmoadg) obj).f30904iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f30904iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f30904iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f30904iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserSharePromo f30905iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(UserSharePromo data) {
            super(null);
            zdlpuopuiu.btonecajqb(data, "data");
            this.f30905iobyxmoadg = data;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30905iobyxmoadg, ((zoijcleaow) obj).f30905iobyxmoadg);
        }

        public int hashCode() {
            return this.f30905iobyxmoadg.hashCode();
        }

        public final UserSharePromo iobyxmoadg() {
            return this.f30905iobyxmoadg;
        }

        public String toString() {
            return "SharePromoInfoUpdated(data=" + this.f30905iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
