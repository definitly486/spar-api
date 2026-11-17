package jb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww extends rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f50975iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f50976ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f50977wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f50978zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private draadjrbmk f50979iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f50980ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pb.zoijcleaow f50981zoijcleaow;

        private pb.iobyxmoadg zoijcleaow() {
            if (this.f50979iobyxmoadg.gxszxtbevo() == draadjrbmk.wkgbmnqykc.f50966eablkybsjg) {
                return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
            }
            if (this.f50979iobyxmoadg.gxszxtbevo() == draadjrbmk.wkgbmnqykc.f50968wkgbmnqykc || this.f50979iobyxmoadg.gxszxtbevo() == draadjrbmk.wkgbmnqykc.f50967ppxfxbqfkf) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f50980ppxfxbqfkf.intValue()).array());
            }
            if (this.f50979iobyxmoadg.gxszxtbevo() == draadjrbmk.wkgbmnqykc.f50969zoijcleaow) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f50980ppxfxbqfkf.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f50979iobyxmoadg.gxszxtbevo());
        }

        public zoijcleaow eablkybsjg(draadjrbmk draadjrbmkVar) {
            this.f50979iobyxmoadg = draadjrbmkVar;
            return this;
        }

        public dxjokdxxww iobyxmoadg() throws GeneralSecurityException {
            draadjrbmk draadjrbmkVar = this.f50979iobyxmoadg;
            if (draadjrbmkVar == null || this.f50981zoijcleaow == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (draadjrbmkVar.wkgbmnqykc() != this.f50981zoijcleaow.zoijcleaow()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f50979iobyxmoadg.lqeggnwhkg() && this.f50980ppxfxbqfkf == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f50979iobyxmoadg.lqeggnwhkg() && this.f50980ppxfxbqfkf != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new dxjokdxxww(this.f50979iobyxmoadg, this.f50981zoijcleaow, zoijcleaow(), this.f50980ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(Integer num) {
            this.f50980ppxfxbqfkf = num;
            return this;
        }

        public zoijcleaow wkgbmnqykc(pb.zoijcleaow zoijcleaowVar) {
            this.f50981zoijcleaow = zoijcleaowVar;
            return this;
        }

        private zoijcleaow() {
            this.f50979iobyxmoadg = null;
            this.f50981zoijcleaow = null;
            this.f50980ppxfxbqfkf = null;
        }
    }

    public static zoijcleaow ppxfxbqfkf() {
        return new zoijcleaow();
    }

    @Override // jb.rgvfuqvkyq
    public pb.iobyxmoadg iobyxmoadg() {
        return this.f50976ppxfxbqfkf;
    }

    @Override // jb.rgvfuqvkyq
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public draadjrbmk zoijcleaow() {
        return this.f50975iobyxmoadg;
    }

    private dxjokdxxww(draadjrbmk draadjrbmkVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f50975iobyxmoadg = draadjrbmkVar;
        this.f50978zoijcleaow = zoijcleaowVar;
        this.f50976ppxfxbqfkf = iobyxmoadgVar;
        this.f50977wkgbmnqykc = num;
    }
}
