package jb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc extends vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f51012iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f51013ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f51014zoijcleaow;

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f51019iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f51018zoijcleaow = new ppxfxbqfkf("TINK");

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f51016ppxfxbqfkf = new ppxfxbqfkf("CRUNCHY");

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final ppxfxbqfkf f51017wkgbmnqykc = new ppxfxbqfkf("LEGACY");

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final ppxfxbqfkf f51015eablkybsjg = new ppxfxbqfkf("NO_PREFIX");

        private ppxfxbqfkf(String str) {
            this.f51019iobyxmoadg = str;
        }

        public String toString() {
            return this.f51019iobyxmoadg;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Integer f51020iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private ppxfxbqfkf f51021ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Integer f51022zoijcleaow;

        public wkgbmnqykc iobyxmoadg() throws GeneralSecurityException {
            Integer num = this.f51020iobyxmoadg;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f51022zoijcleaow == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f51021ppxfxbqfkf != null) {
                return new wkgbmnqykc(num.intValue(), this.f51022zoijcleaow.intValue(), this.f51021ppxfxbqfkf);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public zoijcleaow ppxfxbqfkf(int i13) throws GeneralSecurityException {
            if (i13 >= 10 && 16 >= i13) {
                this.f51022zoijcleaow = Integer.valueOf(i13);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i13);
        }

        public zoijcleaow wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f51021ppxfxbqfkf = ppxfxbqfkfVar;
            return this;
        }

        public zoijcleaow zoijcleaow(int i13) throws InvalidAlgorithmParameterException {
            if (i13 != 16 && i13 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i13 * 8)));
            }
            this.f51020iobyxmoadg = Integer.valueOf(i13);
            return this;
        }

        private zoijcleaow() {
            this.f51020iobyxmoadg = null;
            this.f51022zoijcleaow = null;
            this.f51021ppxfxbqfkf = ppxfxbqfkf.f51015eablkybsjg;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public ppxfxbqfkf eablkybsjg() {
        return this.f51013ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return wkgbmnqykcVar.ppxfxbqfkf() == ppxfxbqfkf() && wkgbmnqykcVar.wkgbmnqykc() == wkgbmnqykc() && wkgbmnqykcVar.eablkybsjg() == eablkybsjg();
    }

    public boolean gxszxtbevo() {
        return this.f51013ppxfxbqfkf != ppxfxbqfkf.f51015eablkybsjg;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f51012iobyxmoadg), Integer.valueOf(this.f51014zoijcleaow), this.f51013ppxfxbqfkf);
    }

    public int ppxfxbqfkf() {
        return this.f51012iobyxmoadg;
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f51013ppxfxbqfkf + ", " + this.f51014zoijcleaow + "-byte tags, and " + this.f51012iobyxmoadg + "-byte key)";
    }

    public int wkgbmnqykc() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f51013ppxfxbqfkf;
        if (ppxfxbqfkfVar == ppxfxbqfkf.f51015eablkybsjg) {
            return zoijcleaow();
        }
        if (ppxfxbqfkfVar != ppxfxbqfkf.f51018zoijcleaow && ppxfxbqfkfVar != ppxfxbqfkf.f51016ppxfxbqfkf && ppxfxbqfkfVar != ppxfxbqfkf.f51017wkgbmnqykc) {
            throw new IllegalStateException("Unknown variant");
        }
        int iZoijcleaow = zoijcleaow();
        return iZoijcleaow + 5;
    }

    public int zoijcleaow() {
        return this.f51014zoijcleaow;
    }

    private wkgbmnqykc(int i13, int i14, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f51012iobyxmoadg = i13;
        this.f51014zoijcleaow = i14;
        this.f51013ppxfxbqfkf = ppxfxbqfkfVar;
    }
}
