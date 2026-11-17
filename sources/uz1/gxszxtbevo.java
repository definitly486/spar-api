package uz1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f114875iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f114875iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f114875iobyxmoadg == ((eablkybsjg) obj).f114875iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f114875iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f114875iobyxmoadg;
        }

        public String toString() {
            return "LoggedInChanged(isLoggedIn=" + this.f114875iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: uz1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2857gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114876iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2857gxszxtbevo(String name) {
            super(null);
            zdlpuopuiu.btonecajqb(name, "name");
            this.f114876iobyxmoadg = name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2857gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f114876iobyxmoadg, ((C2857gxszxtbevo) obj).f114876iobyxmoadg);
        }

        public int hashCode() {
            return this.f114876iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f114876iobyxmoadg;
        }

        public String toString() {
            return "NameChanged(name=" + this.f114876iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f114877iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114878iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f114878iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f114878iobyxmoadg, ((lqeggnwhkg) obj).f114878iobyxmoadg);
        }

        public int hashCode() {
            return this.f114878iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f114878iobyxmoadg;
        }

        public String toString() {
            return "PhoneChanged(phone=" + this.f114878iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114879iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String reason) {
            super(null);
            zdlpuopuiu.btonecajqb(reason, "reason");
            this.f114879iobyxmoadg = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f114879iobyxmoadg, ((nufgyqmvbu) obj).f114879iobyxmoadg);
        }

        public int hashCode() {
            return this.f114879iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f114879iobyxmoadg;
        }

        public String toString() {
            return "ReasonChanged(reason=" + this.f114879iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f114880iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f114881zoijcleaow;

        public ppxfxbqfkf(boolean z13, boolean z14) {
            super(null);
            this.f114880iobyxmoadg = z13;
            this.f114881zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f114880iobyxmoadg == ppxfxbqfkfVar.f114880iobyxmoadg && this.f114881zoijcleaow == ppxfxbqfkfVar.f114881zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f114880iobyxmoadg) * 31) + Boolean.hashCode(this.f114881zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f114880iobyxmoadg;
        }

        public String toString() {
            return "FormValidation(phoneIsValid=" + this.f114880iobyxmoadg + ", reasonIsValid=" + this.f114881zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f114881zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f114882iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f114882iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f114882iobyxmoadg == ((wkgbmnqykc) obj).f114882iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f114882iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f114882iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f114882iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f114883iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f114884zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String displayName, String uriString) {
            super(null);
            zdlpuopuiu.btonecajqb(displayName, "displayName");
            zdlpuopuiu.btonecajqb(uriString, "uriString");
            this.f114883iobyxmoadg = displayName;
            this.f114884zoijcleaow = uriString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f114883iobyxmoadg, zoijcleaowVar.f114883iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114884zoijcleaow, zoijcleaowVar.f114884zoijcleaow);
        }

        public int hashCode() {
            return (this.f114883iobyxmoadg.hashCode() * 31) + this.f114884zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f114883iobyxmoadg;
        }

        public String toString() {
            return "FileAttached(displayName=" + this.f114883iobyxmoadg + ", uriString=" + this.f114884zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f114884zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
