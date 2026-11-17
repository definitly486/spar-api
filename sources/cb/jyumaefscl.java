package cb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jyumaefscl extends cb.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f19443iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f19444zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19448iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f19447zoijcleaow = new ppxfxbqfkf("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f19445ppxfxbqfkf = new ppxfxbqfkf("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f19446wkgbmnqykc = new ppxfxbqfkf("NO_PREFIX");

        private ppxfxbqfkf(String str) {
            this.f19448iobyxmoadg = str;
        }

        public String toString() {
            return this.f19448iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Integer f19449iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ppxfxbqfkf f19450zoijcleaow;

        public jyumaefscl iobyxmoadg() throws GeneralSecurityException {
            Integer num = this.f19449iobyxmoadg;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f19450zoijcleaow != null) {
                return new jyumaefscl(num.intValue(), this.f19450zoijcleaow);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public zoijcleaow ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f19450zoijcleaow = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow zoijcleaow(int i13) throws InvalidAlgorithmParameterException {
            if (i13 != 16 && i13 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
            }
            this.f19449iobyxmoadg = Integer.valueOf(i13);
            return this;
        }

        private zoijcleaow() {
            this.f19449iobyxmoadg = null;
            this.f19450zoijcleaow = ppxfxbqfkf.f19446wkgbmnqykc;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return jyumaefsclVar.zoijcleaow() == zoijcleaow() && jyumaefsclVar.ppxfxbqfkf() == ppxfxbqfkf();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f19443iobyxmoadg), this.f19444zoijcleaow);
    }

    public ppxfxbqfkf ppxfxbqfkf() {
        return this.f19444zoijcleaow;
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f19444zoijcleaow + ", " + this.f19443iobyxmoadg + "-byte key)";
    }

    public boolean wkgbmnqykc() {
        return this.f19444zoijcleaow != ppxfxbqfkf.f19446wkgbmnqykc;
    }

    public int zoijcleaow() {
        return this.f19443iobyxmoadg;
    }

    private jyumaefscl(int i13, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f19443iobyxmoadg = i13;
        this.f19444zoijcleaow = ppxfxbqfkfVar;
    }
}
