package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends cb.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f19462iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f19463ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f19464wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f19465zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private dxjokdxxww f19466iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f19467ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pb.zoijcleaow f19468zoijcleaow;

        private pb.iobyxmoadg zoijcleaow() {
            if (this.f19466iobyxmoadg.eablkybsjg() == dxjokdxxww.ppxfxbqfkf.f19406wkgbmnqykc) {
                return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
            }
            if (this.f19466iobyxmoadg.eablkybsjg() == dxjokdxxww.ppxfxbqfkf.f19405ppxfxbqfkf) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f19467ppxfxbqfkf.intValue()).array());
            }
            if (this.f19466iobyxmoadg.eablkybsjg() == dxjokdxxww.ppxfxbqfkf.f19407zoijcleaow) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f19467ppxfxbqfkf.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f19466iobyxmoadg.eablkybsjg());
        }

        public zoijcleaow eablkybsjg(dxjokdxxww dxjokdxxwwVar) {
            this.f19466iobyxmoadg = dxjokdxxwwVar;
            return this;
        }

        public lqeggnwhkg iobyxmoadg() throws GeneralSecurityException {
            dxjokdxxww dxjokdxxwwVar = this.f19466iobyxmoadg;
            if (dxjokdxxwwVar == null || this.f19468zoijcleaow == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dxjokdxxwwVar.ppxfxbqfkf() != this.f19468zoijcleaow.zoijcleaow()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f19466iobyxmoadg.gxszxtbevo() && this.f19467ppxfxbqfkf == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f19466iobyxmoadg.gxszxtbevo() && this.f19467ppxfxbqfkf != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new lqeggnwhkg(this.f19466iobyxmoadg, this.f19468zoijcleaow, zoijcleaow(), this.f19467ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(Integer num) {
            this.f19467ppxfxbqfkf = num;
            return this;
        }

        public zoijcleaow wkgbmnqykc(pb.zoijcleaow zoijcleaowVar) {
            this.f19468zoijcleaow = zoijcleaowVar;
            return this;
        }

        private zoijcleaow() {
            this.f19466iobyxmoadg = null;
            this.f19468zoijcleaow = null;
            this.f19467ppxfxbqfkf = null;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    private lqeggnwhkg(dxjokdxxww dxjokdxxwwVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f19462iobyxmoadg = dxjokdxxwwVar;
        this.f19465zoijcleaow = zoijcleaowVar;
        this.f19463ppxfxbqfkf = iobyxmoadgVar;
        this.f19464wkgbmnqykc = num;
    }
}
