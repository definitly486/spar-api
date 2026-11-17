package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn extends cb.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f19470iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f19471ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f19472wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f19473zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private vdvldrhtss f19474iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f19475ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pb.zoijcleaow f19476zoijcleaow;

        private pb.iobyxmoadg zoijcleaow() {
            if (this.f19474iobyxmoadg.eablkybsjg() == vdvldrhtss.ppxfxbqfkf.f19488wkgbmnqykc) {
                return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
            }
            if (this.f19474iobyxmoadg.eablkybsjg() == vdvldrhtss.ppxfxbqfkf.f19487ppxfxbqfkf) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f19475ppxfxbqfkf.intValue()).array());
            }
            if (this.f19474iobyxmoadg.eablkybsjg() == vdvldrhtss.ppxfxbqfkf.f19489zoijcleaow) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f19475ppxfxbqfkf.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f19474iobyxmoadg.eablkybsjg());
        }

        public zoijcleaow eablkybsjg(vdvldrhtss vdvldrhtssVar) {
            this.f19474iobyxmoadg = vdvldrhtssVar;
            return this;
        }

        public ojitshcjhn iobyxmoadg() throws GeneralSecurityException {
            vdvldrhtss vdvldrhtssVar = this.f19474iobyxmoadg;
            if (vdvldrhtssVar == null || this.f19476zoijcleaow == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vdvldrhtssVar.ppxfxbqfkf() != this.f19476zoijcleaow.zoijcleaow()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f19474iobyxmoadg.gxszxtbevo() && this.f19475ppxfxbqfkf == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f19474iobyxmoadg.gxszxtbevo() && this.f19475ppxfxbqfkf != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new ojitshcjhn(this.f19474iobyxmoadg, this.f19476zoijcleaow, zoijcleaow(), this.f19475ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(Integer num) {
            this.f19475ppxfxbqfkf = num;
            return this;
        }

        public zoijcleaow wkgbmnqykc(pb.zoijcleaow zoijcleaowVar) {
            this.f19476zoijcleaow = zoijcleaowVar;
            return this;
        }

        private zoijcleaow() {
            this.f19474iobyxmoadg = null;
            this.f19476zoijcleaow = null;
            this.f19475ppxfxbqfkf = null;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    private ojitshcjhn(vdvldrhtss vdvldrhtssVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f19470iobyxmoadg = vdvldrhtssVar;
        this.f19473zoijcleaow = zoijcleaowVar;
        this.f19471ppxfxbqfkf = iobyxmoadgVar;
        this.f19472wkgbmnqykc = num;
    }
}
