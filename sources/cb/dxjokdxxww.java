package cb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww extends cb.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19401iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f19402ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ppxfxbqfkf f19403wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f19404zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19408iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f19407zoijcleaow = new ppxfxbqfkf("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f19405ppxfxbqfkf = new ppxfxbqfkf("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f19406wkgbmnqykc = new ppxfxbqfkf("NO_PREFIX");

        private ppxfxbqfkf(String str) {
            this.f19408iobyxmoadg = str;
        }

        public String toString() {
            return this.f19408iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Integer f19409iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f19410ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private ppxfxbqfkf f19411wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Integer f19412zoijcleaow;

        public zoijcleaow eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f19411wkgbmnqykc = ppxfxbqfkfVar;
            return this;
        }

        public dxjokdxxww iobyxmoadg() throws GeneralSecurityException {
            Integer num = this.f19409iobyxmoadg;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f19412zoijcleaow == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f19411wkgbmnqykc == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f19410ppxfxbqfkf != null) {
                return new dxjokdxxww(num.intValue(), this.f19412zoijcleaow.intValue(), this.f19410ppxfxbqfkf.intValue(), this.f19411wkgbmnqykc);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public zoijcleaow ppxfxbqfkf(int i13) throws InvalidAlgorithmParameterException {
            if (i13 != 16 && i13 != 24 && i13 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
            }
            this.f19409iobyxmoadg = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow wkgbmnqykc(int i13) throws GeneralSecurityException {
            if (i13 < 0 || i13 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i13)));
            }
            this.f19410ppxfxbqfkf = Integer.valueOf(i13);
            return this;
        }

        public zoijcleaow zoijcleaow(int i13) throws GeneralSecurityException {
            if (i13 != 12 && i13 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i13)));
            }
            this.f19412zoijcleaow = Integer.valueOf(i13);
            return this;
        }

        private zoijcleaow() {
            this.f19409iobyxmoadg = null;
            this.f19412zoijcleaow = null;
            this.f19410ppxfxbqfkf = null;
            this.f19411wkgbmnqykc = ppxfxbqfkf.f19406wkgbmnqykc;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public ppxfxbqfkf eablkybsjg() {
        return this.f19403wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return dxjokdxxwwVar.ppxfxbqfkf() == ppxfxbqfkf() && dxjokdxxwwVar.zoijcleaow() == zoijcleaow() && dxjokdxxwwVar.wkgbmnqykc() == wkgbmnqykc() && dxjokdxxwwVar.eablkybsjg() == eablkybsjg();
    }

    public boolean gxszxtbevo() {
        return this.f19403wkgbmnqykc != ppxfxbqfkf.f19406wkgbmnqykc;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19401iobyxmoadg), Integer.valueOf(this.f19404zoijcleaow), Integer.valueOf(this.f19402ppxfxbqfkf), this.f19403wkgbmnqykc);
    }

    public int ppxfxbqfkf() {
        return this.f19401iobyxmoadg;
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f19403wkgbmnqykc + ", " + this.f19404zoijcleaow + "-byte IV, " + this.f19402ppxfxbqfkf + "-byte tag, and " + this.f19401iobyxmoadg + "-byte key)";
    }

    public int wkgbmnqykc() {
        return this.f19402ppxfxbqfkf;
    }

    public int zoijcleaow() {
        return this.f19404zoijcleaow;
    }

    private dxjokdxxww(int i13, int i14, int i15, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f19401iobyxmoadg = i13;
        this.f19404zoijcleaow = i14;
        this.f19402ppxfxbqfkf = i15;
        this.f19403wkgbmnqykc = ppxfxbqfkfVar;
    }
}
