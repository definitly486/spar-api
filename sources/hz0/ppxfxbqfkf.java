package hz0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private hz0.iobyxmoadg f41450eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f41451gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f41452iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private String f41453ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private String f41454wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f41455zoijcleaow;

    public /* synthetic */ ppxfxbqfkf(boolean z13, boolean z14, String str, String str2, hz0.iobyxmoadg iobyxmoadgVar, boolean z15, gtknphoqwx gtknphoqwxVar) {
        this(z13, z14, str, str2, iobyxmoadgVar, z15);
    }

    public final boolean eablkybsjg() {
        return this.f41451gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f41455zoijcleaow;
    }

    public final String iobyxmoadg() {
        return this.f41454wkgbmnqykc;
    }

    public final void lqeggnwhkg() {
        this.f41451gxszxtbevo = true;
    }

    public final hz0.iobyxmoadg ppxfxbqfkf() {
        return this.f41450eablkybsjg;
    }

    public String toString() {
        return kcexrzcfyt.draadjrbmk("UpdateMessage(\n            |forceUpdate=" + this.f41452iobyxmoadg + ", \n            |update=" + this.f41455zoijcleaow + ", \n            |updateMessage='" + this.f41453ppxfxbqfkf + "', \n            |title='" + this.f41454wkgbmnqykc + "', \n            |updateVersion=" + this.f41450eablkybsjg + ", \n            |skipUpdate=" + this.f41451gxszxtbevo + "\n            |)\n        ", null, 1, null);
    }

    public final boolean wkgbmnqykc() {
        return this.f41452iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f41453ppxfxbqfkf;
    }

    private ppxfxbqfkf(boolean z13, boolean z14, String str, String str2, hz0.iobyxmoadg iobyxmoadgVar, boolean z15) {
        this.f41452iobyxmoadg = z13;
        this.f41455zoijcleaow = z14;
        this.f41453ppxfxbqfkf = str;
        this.f41454wkgbmnqykc = str2;
        this.f41450eablkybsjg = iobyxmoadgVar;
        this.f41451gxszxtbevo = z15;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private String f41456eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private Boolean f41457gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Boolean f41458iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f41459ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private hz0.iobyxmoadg f41460wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Boolean f41461zoijcleaow;

        public iobyxmoadg(Boolean bool, Boolean bool2, String str, hz0.iobyxmoadg updateVersion, String str2, Boolean bool3) {
            zdlpuopuiu.btonecajqb(updateVersion, "updateVersion");
            this.f41458iobyxmoadg = bool;
            this.f41461zoijcleaow = bool2;
            this.f41459ppxfxbqfkf = str;
            this.f41460wkgbmnqykc = updateVersion;
            this.f41456eablkybsjg = str2;
            this.f41457gxszxtbevo = bool3;
        }

        public final iobyxmoadg eablkybsjg() {
            this.f41461zoijcleaow = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            this.f41458iobyxmoadg = bool;
            this.f41457gxszxtbevo = bool;
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
            return zdlpuopuiu.eablkybsjg(this.f41458iobyxmoadg, iobyxmoadgVar.f41458iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41461zoijcleaow, iobyxmoadgVar.f41461zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41459ppxfxbqfkf, iobyxmoadgVar.f41459ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f41460wkgbmnqykc, iobyxmoadgVar.f41460wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f41456eablkybsjg, iobyxmoadgVar.f41456eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f41457gxszxtbevo, iobyxmoadgVar.f41457gxszxtbevo);
        }

        public final iobyxmoadg gxszxtbevo(String title) {
            zdlpuopuiu.btonecajqb(title, "title");
            this.f41456eablkybsjg = title;
            return this;
        }

        public int hashCode() {
            Boolean bool = this.f41458iobyxmoadg;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f41461zoijcleaow;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f41459ppxfxbqfkf;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f41460wkgbmnqykc.hashCode()) * 31;
            String str2 = this.f41456eablkybsjg;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.f41457gxszxtbevo;
            return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final ppxfxbqfkf iobyxmoadg() throws DomainException {
            try {
                Boolean bool = this.f41458iobyxmoadg;
                zdlpuopuiu.lqeggnwhkg(bool);
                boolean zBooleanValue = bool.booleanValue();
                Boolean bool2 = this.f41461zoijcleaow;
                zdlpuopuiu.lqeggnwhkg(bool2);
                boolean zBooleanValue2 = bool2.booleanValue();
                String str = this.f41459ppxfxbqfkf;
                zdlpuopuiu.lqeggnwhkg(str);
                String str2 = this.f41456eablkybsjg;
                zdlpuopuiu.lqeggnwhkg(str2);
                hz0.iobyxmoadg iobyxmoadgVar = this.f41460wkgbmnqykc;
                Boolean bool3 = this.f41457gxszxtbevo;
                zdlpuopuiu.lqeggnwhkg(bool3);
                return new ppxfxbqfkf(zBooleanValue, zBooleanValue2, str, str2, iobyxmoadgVar, bool3.booleanValue(), null);
            } catch (Throwable unused) {
                throw new DomainException("Can't build UpdateMessage from " + this, null, 2, null);
            }
        }

        public final iobyxmoadg lqeggnwhkg(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f41459ppxfxbqfkf = message;
            return this;
        }

        public final iobyxmoadg nufgyqmvbu(hz0.iobyxmoadg version) {
            zdlpuopuiu.btonecajqb(version, "version");
            this.f41460wkgbmnqykc = version;
            return this;
        }

        public final iobyxmoadg ppxfxbqfkf() {
            this.f41458iobyxmoadg = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            this.f41461zoijcleaow = bool;
            this.f41457gxszxtbevo = bool;
            return this;
        }

        public String toString() {
            return "Builder(isForceUpdate=" + this.f41458iobyxmoadg + ", isSoftUpdate=" + this.f41461zoijcleaow + ", updateMessage=" + this.f41459ppxfxbqfkf + ", updateVersion=" + this.f41460wkgbmnqykc + ", titleMessage=" + this.f41456eablkybsjg + ", isSkipUpdate=" + this.f41457gxszxtbevo + ")";
        }

        public final void wkgbmnqykc() {
            this.f41457gxszxtbevo = Boolean.TRUE;
            Boolean bool = Boolean.FALSE;
            this.f41458iobyxmoadg = bool;
            this.f41461zoijcleaow = bool;
        }

        public final ppxfxbqfkf zoijcleaow() {
            return new ppxfxbqfkf(false, false, null, null, null, false, 63, null);
        }

        public /* synthetic */ iobyxmoadg(Boolean bool, Boolean bool2, String str, hz0.iobyxmoadg iobyxmoadgVar, String str2, Boolean bool3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? hz0.iobyxmoadg.f41447iobyxmoadg.iobyxmoadg() : iobyxmoadgVar, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : bool3);
        }
    }

    /* synthetic */ ppxfxbqfkf(boolean z13, boolean z14, String str, String str2, hz0.iobyxmoadg iobyxmoadgVar, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? hz0.iobyxmoadg.f41447iobyxmoadg.iobyxmoadg() : iobyxmoadgVar, (i13 & 32) != 0 ? false : z15);
    }
}
