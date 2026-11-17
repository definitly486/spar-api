package cb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vdvldrhtss extends cb.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19483iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f19484ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f19485wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f19486zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19490iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f19489zoijcleaow = new ppxfxbqfkf("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f19487ppxfxbqfkf = new ppxfxbqfkf("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f19488wkgbmnqykc = new ppxfxbqfkf("NO_PREFIX");

        private ppxfxbqfkf(String str) {
            this.f19490iobyxmoadg = str;
        }

        public String toString() {
            return this.f19490iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Integer f19491iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f19492ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ppxfxbqfkf f19493wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Integer f19494zoijcleaow;

        public zoijcleaow eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f19493wkgbmnqykc = ppxfxbqfkfVar;
            return this;
        }

        public vdvldrhtss iobyxmoadg() throws GeneralSecurityException {
            Integer num = this.f19491iobyxmoadg;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f19493wkgbmnqykc == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f19494zoijcleaow == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f19492ppxfxbqfkf != null) {
                return new vdvldrhtss(num.intValue(), this.f19494zoijcleaow.intValue(), this.f19492ppxfxbqfkf.intValue(), this.f19493wkgbmnqykc);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public zoijcleaow ppxfxbqfkf(int i13) throws InvalidAlgorithmParameterException {
            if (i13 != 16 && i13 != 24 && i13 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
            }
            this.f19491iobyxmoadg = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow wkgbmnqykc(int i13) throws GeneralSecurityException {
            if (i13 != 12 && i13 != 13 && i13 != 14 && i13 != 15 && i13 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i13)));
            }
            this.f19492ppxfxbqfkf = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow zoijcleaow(int i13) throws GeneralSecurityException {
            if (i13 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i13)));
            }
            this.f19494zoijcleaow = Integer.valueOf(i13);
            return this;
        }

        private zoijcleaow() {
            this.f19491iobyxmoadg = null;
            this.f19494zoijcleaow = null;
            this.f19492ppxfxbqfkf = null;
            this.f19493wkgbmnqykc = ppxfxbqfkf.f19488wkgbmnqykc;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public ppxfxbqfkf eablkybsjg() {
        return this.f19485wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return vdvldrhtssVar.ppxfxbqfkf() == ppxfxbqfkf() && vdvldrhtssVar.zoijcleaow() == zoijcleaow() && vdvldrhtssVar.wkgbmnqykc() == wkgbmnqykc() && vdvldrhtssVar.eablkybsjg() == eablkybsjg();
    }

    public boolean gxszxtbevo() {
        return this.f19485wkgbmnqykc != ppxfxbqfkf.f19488wkgbmnqykc;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19483iobyxmoadg), Integer.valueOf(this.f19486zoijcleaow), Integer.valueOf(this.f19484ppxfxbqfkf), this.f19485wkgbmnqykc);
    }

    public int ppxfxbqfkf() {
        return this.f19483iobyxmoadg;
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f19485wkgbmnqykc + ", " + this.f19486zoijcleaow + "-byte IV, " + this.f19484ppxfxbqfkf + "-byte tag, and " + this.f19483iobyxmoadg + "-byte key)";
    }

    public int wkgbmnqykc() {
        return this.f19484ppxfxbqfkf;
    }

    public int zoijcleaow() {
        return this.f19486zoijcleaow;
    }

    private vdvldrhtss(int i13, int i14, int i15, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f19483iobyxmoadg = i13;
        this.f19486zoijcleaow = i14;
        this.f19484ppxfxbqfkf = i15;
        this.f19485wkgbmnqykc = ppxfxbqfkfVar;
    }
}
