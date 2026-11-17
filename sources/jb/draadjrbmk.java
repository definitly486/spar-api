package jb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk extends vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f50956iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f50957ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f50958wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50959zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50965iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f50964zoijcleaow = new ppxfxbqfkf("SHA1");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f50962ppxfxbqfkf = new ppxfxbqfkf("SHA224");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f50963wkgbmnqykc = new ppxfxbqfkf("SHA256");

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final ppxfxbqfkf f50960eablkybsjg = new ppxfxbqfkf("SHA384");

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final ppxfxbqfkf f50961gxszxtbevo = new ppxfxbqfkf("SHA512");

        private ppxfxbqfkf(String str) {
            this.f50965iobyxmoadg = str;
        }

        public String toString() {
            return this.f50965iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50970iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final wkgbmnqykc f50969zoijcleaow = new wkgbmnqykc("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final wkgbmnqykc f50967ppxfxbqfkf = new wkgbmnqykc("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final wkgbmnqykc f50968wkgbmnqykc = new wkgbmnqykc("LEGACY");

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final wkgbmnqykc f50966eablkybsjg = new wkgbmnqykc("NO_PREFIX");

        private wkgbmnqykc(String str) {
            this.f50970iobyxmoadg = str;
        }

        public String toString() {
            return this.f50970iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Integer f50971iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private ppxfxbqfkf f50972ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private wkgbmnqykc f50973wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Integer f50974zoijcleaow;

        private static void gxszxtbevo(int i13, ppxfxbqfkf ppxfxbqfkfVar) throws GeneralSecurityException {
            if (i13 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i13)));
            }
            if (ppxfxbqfkfVar == ppxfxbqfkf.f50964zoijcleaow) {
                if (i13 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i13)));
                }
                return;
            }
            if (ppxfxbqfkfVar == ppxfxbqfkf.f50962ppxfxbqfkf) {
                if (i13 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i13)));
                }
                return;
            }
            if (ppxfxbqfkfVar == ppxfxbqfkf.f50963wkgbmnqykc) {
                if (i13 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i13)));
                }
            } else if (ppxfxbqfkfVar == ppxfxbqfkf.f50960eablkybsjg) {
                if (i13 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i13)));
                }
            } else {
                if (ppxfxbqfkfVar != ppxfxbqfkf.f50961gxszxtbevo) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i13 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i13)));
                }
            }
        }

        public zoijcleaow eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
            this.f50973wkgbmnqykc = wkgbmnqykcVar;
            return this;
        }

        public draadjrbmk iobyxmoadg() throws GeneralSecurityException {
            Integer num = this.f50971iobyxmoadg;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f50974zoijcleaow == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f50972ppxfxbqfkf == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f50973wkgbmnqykc == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f50971iobyxmoadg));
            }
            gxszxtbevo(this.f50974zoijcleaow.intValue(), this.f50972ppxfxbqfkf);
            return new draadjrbmk(this.f50971iobyxmoadg.intValue(), this.f50974zoijcleaow.intValue(), this.f50973wkgbmnqykc, this.f50972ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(int i13) {
            this.f50971iobyxmoadg = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow wkgbmnqykc(int i13) {
            this.f50974zoijcleaow = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f50972ppxfxbqfkf = ppxfxbqfkfVar;
            return this;
        }

        private zoijcleaow() {
            this.f50971iobyxmoadg = null;
            this.f50974zoijcleaow = null;
            this.f50972ppxfxbqfkf = null;
            this.f50973wkgbmnqykc = wkgbmnqykc.f50966eablkybsjg;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public int eablkybsjg() {
        wkgbmnqykc wkgbmnqykcVar = this.f50957ppxfxbqfkf;
        if (wkgbmnqykcVar == wkgbmnqykc.f50966eablkybsjg) {
            return zoijcleaow();
        }
        if (wkgbmnqykcVar != wkgbmnqykc.f50969zoijcleaow && wkgbmnqykcVar != wkgbmnqykc.f50967ppxfxbqfkf && wkgbmnqykcVar != wkgbmnqykc.f50968wkgbmnqykc) {
            throw new IllegalStateException("Unknown variant");
        }
        int iZoijcleaow = zoijcleaow();
        return iZoijcleaow + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return draadjrbmkVar.wkgbmnqykc() == wkgbmnqykc() && draadjrbmkVar.eablkybsjg() == eablkybsjg() && draadjrbmkVar.gxszxtbevo() == gxszxtbevo() && draadjrbmkVar.ppxfxbqfkf() == ppxfxbqfkf();
    }

    public wkgbmnqykc gxszxtbevo() {
        return this.f50957ppxfxbqfkf;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f50956iobyxmoadg), Integer.valueOf(this.f50959zoijcleaow), this.f50957ppxfxbqfkf, this.f50958wkgbmnqykc);
    }

    public boolean lqeggnwhkg() {
        return this.f50957ppxfxbqfkf != wkgbmnqykc.f50966eablkybsjg;
    }

    public ppxfxbqfkf ppxfxbqfkf() {
        return this.f50958wkgbmnqykc;
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f50957ppxfxbqfkf + ", hashType: " + this.f50958wkgbmnqykc + ", " + this.f50959zoijcleaow + "-byte tags, and " + this.f50956iobyxmoadg + "-byte key)";
    }

    public int wkgbmnqykc() {
        return this.f50956iobyxmoadg;
    }

    public int zoijcleaow() {
        return this.f50959zoijcleaow;
    }

    private draadjrbmk(int i13, int i14, wkgbmnqykc wkgbmnqykcVar, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f50956iobyxmoadg = i13;
        this.f50959zoijcleaow = i14;
        this.f50957ppxfxbqfkf = wkgbmnqykcVar;
        this.f50958wkgbmnqykc = ppxfxbqfkfVar;
    }
}
