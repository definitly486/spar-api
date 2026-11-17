package p00;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.error_handler.exceptions.DomainException;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private p00.iobyxmoadg f75341eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f75342gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f75343iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f75344ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f75345wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f75346zoijcleaow;

    public /* synthetic */ ppxfxbqfkf(boolean z13, boolean z14, String str, String str2, p00.iobyxmoadg iobyxmoadgVar, boolean z15, gtknphoqwx gtknphoqwxVar) {
        this(z13, z14, str, str2, iobyxmoadgVar, z15);
    }

    public final boolean eablkybsjg() {
        return this.f75342gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f75346zoijcleaow;
    }

    public final String iobyxmoadg() {
        return this.f75345wkgbmnqykc;
    }

    public final void lqeggnwhkg() {
        this.f75342gxszxtbevo = true;
    }

    public final p00.iobyxmoadg ppxfxbqfkf() {
        return this.f75341eablkybsjg;
    }

    public String toString() {
        return kcexrzcfyt.draadjrbmk("UpdateMessage(\n            |forceUpdate=" + this.f75343iobyxmoadg + ", \n            |update=" + this.f75346zoijcleaow + ", \n            |updateMessage='" + this.f75344ppxfxbqfkf + "', \n            |title='" + this.f75345wkgbmnqykc + "', \n            |updateVersion=" + this.f75341eablkybsjg + ", \n            |skipUpdate=" + this.f75342gxszxtbevo + "\n            |)\n        ", null, 1, null);
    }

    public final boolean wkgbmnqykc() {
        return this.f75343iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f75344ppxfxbqfkf;
    }

    private ppxfxbqfkf(boolean z13, boolean z14, String str, String str2, p00.iobyxmoadg iobyxmoadgVar, boolean z15) {
        this.f75343iobyxmoadg = z13;
        this.f75346zoijcleaow = z14;
        this.f75344ppxfxbqfkf = str;
        this.f75345wkgbmnqykc = str2;
        this.f75341eablkybsjg = iobyxmoadgVar;
        this.f75342gxszxtbevo = z15;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private String f75347eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private Boolean f75348gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Boolean f75349iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f75350ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private p00.iobyxmoadg f75351wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Boolean f75352zoijcleaow;

        public iobyxmoadg(Boolean bool, Boolean bool2, String str, p00.iobyxmoadg updateVersion, String str2, Boolean bool3) {
            zdlpuopuiu.btonecajqb(updateVersion, "updateVersion");
            this.f75349iobyxmoadg = bool;
            this.f75352zoijcleaow = bool2;
            this.f75350ppxfxbqfkf = str;
            this.f75351wkgbmnqykc = updateVersion;
            this.f75347eablkybsjg = str2;
            this.f75348gxszxtbevo = bool3;
        }

        public final iobyxmoadg eablkybsjg() {
            this.f75352zoijcleaow = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            this.f75349iobyxmoadg = bool;
            this.f75348gxszxtbevo = bool;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f75349iobyxmoadg, iobyxmoadgVar.f75349iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75352zoijcleaow, iobyxmoadgVar.f75352zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75350ppxfxbqfkf, iobyxmoadgVar.f75350ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75351wkgbmnqykc, iobyxmoadgVar.f75351wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f75347eablkybsjg, iobyxmoadgVar.f75347eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f75348gxszxtbevo, iobyxmoadgVar.f75348gxszxtbevo);
        }

        public final iobyxmoadg gxszxtbevo(String title) {
            zdlpuopuiu.btonecajqb(title, "title");
            this.f75347eablkybsjg = title;
            return this;
        }

        public int hashCode() {
            Boolean bool = this.f75349iobyxmoadg;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f75352zoijcleaow;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f75350ppxfxbqfkf;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f75351wkgbmnqykc.hashCode()) * 31;
            String str2 = this.f75347eablkybsjg;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.f75348gxszxtbevo;
            return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final ppxfxbqfkf iobyxmoadg() throws DomainException {
            try {
                Boolean bool = this.f75349iobyxmoadg;
                zdlpuopuiu.lqeggnwhkg(bool);
                boolean zBooleanValue = bool.booleanValue();
                Boolean bool2 = this.f75352zoijcleaow;
                zdlpuopuiu.lqeggnwhkg(bool2);
                boolean zBooleanValue2 = bool2.booleanValue();
                String str = this.f75350ppxfxbqfkf;
                zdlpuopuiu.lqeggnwhkg(str);
                String str2 = this.f75347eablkybsjg;
                zdlpuopuiu.lqeggnwhkg(str2);
                p00.iobyxmoadg iobyxmoadgVar = this.f75351wkgbmnqykc;
                Boolean bool3 = this.f75348gxszxtbevo;
                zdlpuopuiu.lqeggnwhkg(bool3);
                return new ppxfxbqfkf(zBooleanValue, zBooleanValue2, str, str2, iobyxmoadgVar, bool3.booleanValue(), null);
            } catch (Throwable unused) {
                throw new DomainException("Can't build UpdateMessage from " + this, null, 2, null);
            }
        }

        public final iobyxmoadg lqeggnwhkg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f75350ppxfxbqfkf = message;
            return this;
        }

        public final iobyxmoadg nufgyqmvbu(p00.iobyxmoadg version) {
            zdlpuopuiu.btonecajqb(version, "version");
            this.f75351wkgbmnqykc = version;
            return this;
        }

        public final iobyxmoadg ppxfxbqfkf() {
            this.f75349iobyxmoadg = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            this.f75352zoijcleaow = bool;
            this.f75348gxszxtbevo = bool;
            return this;
        }

        public String toString() {
            return "Builder(isForceUpdate=" + this.f75349iobyxmoadg + ", isSoftUpdate=" + this.f75352zoijcleaow + ", updateMessage=" + this.f75350ppxfxbqfkf + ", updateVersion=" + this.f75351wkgbmnqykc + ", titleMessage=" + this.f75347eablkybsjg + ", isSkipUpdate=" + this.f75348gxszxtbevo + ")";
        }

        public final void wkgbmnqykc() {
            this.f75348gxszxtbevo = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            this.f75349iobyxmoadg = bool;
            this.f75352zoijcleaow = bool;
        }

        public final ppxfxbqfkf zoijcleaow() {
            return new ppxfxbqfkf(false, false, null, null, null, false, 63, null);
        }

        public /* synthetic */ iobyxmoadg(Boolean bool, Boolean bool2, String str, p00.iobyxmoadg iobyxmoadgVar, String str2, Boolean bool3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? p00.iobyxmoadg.f75338iobyxmoadg.iobyxmoadg() : iobyxmoadgVar, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : bool3);
        }
    }

    /* synthetic */ ppxfxbqfkf(boolean z13, boolean z14, String str, String str2, p00.iobyxmoadg iobyxmoadgVar, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? p00.iobyxmoadg.f75338iobyxmoadg.iobyxmoadg() : iobyxmoadgVar, (i13 & 32) != 0 ? false : z15);
    }
}
