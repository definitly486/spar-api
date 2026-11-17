package ll1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f63360iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f63360iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f63360iobyxmoadg == ((eablkybsjg) obj).f63360iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f63360iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f63360iobyxmoadg;
        }

        public String toString() {
            return "LoggedInChanged(isLoggedIn=" + this.f63360iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ll1.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1290gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63361iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1290gxszxtbevo(String name) {
            super(null);
            zdlpuopuiu.btonecajqb(name, "name");
            this.f63361iobyxmoadg = name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1290gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f63361iobyxmoadg, ((C1290gxszxtbevo) obj).f63361iobyxmoadg);
        }

        public int hashCode() {
            return this.f63361iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f63361iobyxmoadg;
        }

        public String toString() {
            return "NameChanged(name=" + this.f63361iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f63362iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63363iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f63363iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f63363iobyxmoadg, ((lqeggnwhkg) obj).f63363iobyxmoadg);
        }

        public int hashCode() {
            return this.f63363iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f63363iobyxmoadg;
        }

        public String toString() {
            return "PhoneChanged(phone=" + this.f63363iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63364iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(String reason) {
            super(null);
            zdlpuopuiu.btonecajqb(reason, "reason");
            this.f63364iobyxmoadg = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f63364iobyxmoadg, ((nufgyqmvbu) obj).f63364iobyxmoadg);
        }

        public int hashCode() {
            return this.f63364iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f63364iobyxmoadg;
        }

        public String toString() {
            return "ReasonChanged(reason=" + this.f63364iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f63365iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f63366zoijcleaow;

        public ppxfxbqfkf(boolean z13, boolean z14) {
            super(null);
            this.f63365iobyxmoadg = z13;
            this.f63366zoijcleaow = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f63365iobyxmoadg == ppxfxbqfkfVar.f63365iobyxmoadg && this.f63366zoijcleaow == ppxfxbqfkfVar.f63366zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f63365iobyxmoadg) * 31) + Boolean.hashCode(this.f63366zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f63365iobyxmoadg;
        }

        public String toString() {
            return "FormValidation(phoneIsValid=" + this.f63365iobyxmoadg + ", reasonIsValid=" + this.f63366zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f63366zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f63367iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f63367iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f63367iobyxmoadg == ((wkgbmnqykc) obj).f63367iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f63367iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f63367iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f63367iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63368iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f63369zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String displayName, String uriString) {
            super(null);
            zdlpuopuiu.btonecajqb(displayName, "displayName");
            zdlpuopuiu.btonecajqb(uriString, "uriString");
            this.f63368iobyxmoadg = displayName;
            this.f63369zoijcleaow = uriString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f63368iobyxmoadg, zoijcleaowVar.f63368iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63369zoijcleaow, zoijcleaowVar.f63369zoijcleaow);
        }

        public int hashCode() {
            return (this.f63368iobyxmoadg.hashCode() * 31) + this.f63369zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f63368iobyxmoadg;
        }

        public String toString() {
            return "FileAttached(displayName=" + this.f63368iobyxmoadg + ", uriString=" + this.f63369zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f63369zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
