package jg0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.UserSharePromo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f51236iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f51236iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f51236iobyxmoadg == ((iobyxmoadg) obj).f51236iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f51236iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f51236iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f51236iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserSharePromo f51237iobyxmoadg;

        public ppxfxbqfkf(UserSharePromo userSharePromo) {
            super(null);
            this.f51237iobyxmoadg = userSharePromo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f51237iobyxmoadg, ((ppxfxbqfkf) obj).f51237iobyxmoadg);
        }

        public int hashCode() {
            UserSharePromo userSharePromo = this.f51237iobyxmoadg;
            if (userSharePromo == null) {
                return 0;
            }
            return userSharePromo.hashCode();
        }

        public final UserSharePromo iobyxmoadg() {
            return this.f51237iobyxmoadg;
        }

        public String toString() {
            return "UpdateSharePromo(userSharePromo=" + this.f51237iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f51238iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List menuItems) {
            super(null);
            zdlpuopuiu.btonecajqb(menuItems, "menuItems");
            this.f51238iobyxmoadg = menuItems;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51238iobyxmoadg, ((zoijcleaow) obj).f51238iobyxmoadg);
        }

        public int hashCode() {
            return this.f51238iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f51238iobyxmoadg;
        }

        public String toString() {
            return "SetMenuItems(menuItems=" + this.f51238iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
