package u70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class btonecajqb extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final User f112904iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(User user) {
            super(null);
            zdlpuopuiu.btonecajqb(user, "user");
            this.f112904iobyxmoadg = user;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f112904iobyxmoadg, ((btonecajqb) obj).f112904iobyxmoadg);
        }

        public int hashCode() {
            return this.f112904iobyxmoadg.hashCode();
        }

        public final User iobyxmoadg() {
            return this.f112904iobyxmoadg;
        }

        public String toString() {
            return "UpdateState(user=" + this.f112904iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112905iobyxmoadg;

        public dxjokdxxww(boolean z13) {
            super(null);
            this.f112905iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f112905iobyxmoadg == ((dxjokdxxww) obj).f112905iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f112905iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f112905iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f112905iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final b10.iobyxmoadg f112906iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(b10.iobyxmoadg gender) {
            super(null);
            zdlpuopuiu.btonecajqb(gender, "gender");
            this.f112906iobyxmoadg = gender;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f112906iobyxmoadg == ((eablkybsjg) obj).f112906iobyxmoadg;
        }

        public int hashCode() {
            return this.f112906iobyxmoadg.hashCode();
        }

        public final b10.iobyxmoadg iobyxmoadg() {
            return this.f112906iobyxmoadg;
        }

        public String toString() {
            return "GenderChange(gender=" + this.f112906iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: u70.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C2795gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2795gxszxtbevo f112907iobyxmoadg = new C2795gxszxtbevo();

        private C2795gxszxtbevo() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112908iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f112909ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112910zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(boolean z13, String email, boolean z14) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f112908iobyxmoadg = z13;
            this.f112910zoijcleaow = email;
            this.f112909ppxfxbqfkf = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f112908iobyxmoadg == iobyxmoadgVar.f112908iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f112910zoijcleaow, iobyxmoadgVar.f112910zoijcleaow) && this.f112909ppxfxbqfkf == iobyxmoadgVar.f112909ppxfxbqfkf;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f112908iobyxmoadg) * 31) + this.f112910zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f112909ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f112910zoijcleaow;
        }

        public final boolean ppxfxbqfkf() {
            return this.f112909ppxfxbqfkf;
        }

        public String toString() {
            return "EmailChange(emailError=" + this.f112908iobyxmoadg + ", email=" + this.f112910zoijcleaow + ", isEmailVerified=" + this.f112909ppxfxbqfkf + ")";
        }

        public final boolean zoijcleaow() {
            return this.f112908iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112911iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112912zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(boolean z13, String lastName) {
            super(null);
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f112911iobyxmoadg = z13;
            this.f112912zoijcleaow = lastName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return this.f112911iobyxmoadg == lqeggnwhkgVar.f112911iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f112912zoijcleaow, lqeggnwhkgVar.f112912zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f112911iobyxmoadg) * 31) + this.f112912zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112912zoijcleaow;
        }

        public String toString() {
            return "LastNameChange(lastNameError=" + this.f112911iobyxmoadg + ", lastName=" + this.f112912zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f112911iobyxmoadg;
        }
    }

    public static final class nufgyqmvbu extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final nufgyqmvbu f112913iobyxmoadg = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f112914iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f112915zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(boolean z13, String firstName) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f112914iobyxmoadg = z13;
            this.f112915zoijcleaow = firstName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f112914iobyxmoadg == ppxfxbqfkfVar.f112914iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f112915zoijcleaow, ppxfxbqfkfVar.f112915zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f112914iobyxmoadg) * 31) + this.f112915zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112915zoijcleaow;
        }

        public String toString() {
            return "FirstNameChange(firstNameError=" + this.f112914iobyxmoadg + ", firstName=" + this.f112915zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f112914iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f112916iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f112917iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
