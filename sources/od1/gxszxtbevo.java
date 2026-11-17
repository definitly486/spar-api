package od1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.user.domain.model.UserSharePromo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f72652iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f72652iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f72652iobyxmoadg == ((iobyxmoadg) obj).f72652iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f72652iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f72652iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f72652iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserSharePromo f72653iobyxmoadg;

        public ppxfxbqfkf(UserSharePromo userSharePromo) {
            super(null);
            this.f72653iobyxmoadg = userSharePromo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f72653iobyxmoadg, ((ppxfxbqfkf) obj).f72653iobyxmoadg);
        }

        public int hashCode() {
            UserSharePromo userSharePromo = this.f72653iobyxmoadg;
            if (userSharePromo == null) {
                return 0;
            }
            return userSharePromo.hashCode();
        }

        public final UserSharePromo iobyxmoadg() {
            return this.f72653iobyxmoadg;
        }

        public String toString() {
            return "UpdateSharePromo(userSharePromo=" + this.f72653iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f72654iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List menuItems) {
            super(null);
            zdlpuopuiu.btonecajqb(menuItems, "menuItems");
            this.f72654iobyxmoadg = menuItems;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f72654iobyxmoadg, ((zoijcleaow) obj).f72654iobyxmoadg);
        }

        public int hashCode() {
            return this.f72654iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f72654iobyxmoadg;
        }

        public String toString() {
            return "SetMenuItems(menuItems=" + this.f72654iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
