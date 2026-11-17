package jb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f50991iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f50992ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f50993wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f50994zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private wkgbmnqykc f50995iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f50996ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pb.zoijcleaow f50997zoijcleaow;

        private pb.iobyxmoadg zoijcleaow() {
            if (this.f50995iobyxmoadg.eablkybsjg() == wkgbmnqykc.ppxfxbqfkf.f51015eablkybsjg) {
                return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
            }
            if (this.f50995iobyxmoadg.eablkybsjg() == wkgbmnqykc.ppxfxbqfkf.f51017wkgbmnqykc || this.f50995iobyxmoadg.eablkybsjg() == wkgbmnqykc.ppxfxbqfkf.f51016ppxfxbqfkf) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f50996ppxfxbqfkf.intValue()).array());
            }
            if (this.f50995iobyxmoadg.eablkybsjg() == wkgbmnqykc.ppxfxbqfkf.f51018zoijcleaow) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f50996ppxfxbqfkf.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f50995iobyxmoadg.eablkybsjg());
        }

        public zoijcleaow eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
            this.f50995iobyxmoadg = wkgbmnqykcVar;
            return this;
        }

        public iobyxmoadg iobyxmoadg() throws GeneralSecurityException {
            wkgbmnqykc wkgbmnqykcVar = this.f50995iobyxmoadg;
            if (wkgbmnqykcVar == null || this.f50997zoijcleaow == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (wkgbmnqykcVar.ppxfxbqfkf() != this.f50997zoijcleaow.zoijcleaow()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f50995iobyxmoadg.gxszxtbevo() && this.f50996ppxfxbqfkf == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f50995iobyxmoadg.gxszxtbevo() && this.f50996ppxfxbqfkf != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new iobyxmoadg(this.f50995iobyxmoadg, this.f50997zoijcleaow, zoijcleaow(), this.f50996ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(pb.zoijcleaow zoijcleaowVar) {
            this.f50997zoijcleaow = zoijcleaowVar;
            return this;
        }

        public zoijcleaow wkgbmnqykc(Integer num) {
            this.f50996ppxfxbqfkf = num;
            return this;
        }

        private zoijcleaow() {
            this.f50995iobyxmoadg = null;
            this.f50997zoijcleaow = null;
            this.f50996ppxfxbqfkf = null;
        }
    }

    public static zoijcleaow ppxfxbqfkf() {
        return new zoijcleaow();
    }

    @Override // jb.rgvfuqvkyq
    public pb.iobyxmoadg iobyxmoadg() {
        return this.f50992ppxfxbqfkf;
    }

    @Override // jb.rgvfuqvkyq
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc zoijcleaow() {
        return this.f50991iobyxmoadg;
    }

    private iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f50991iobyxmoadg = wkgbmnqykcVar;
        this.f50994zoijcleaow = zoijcleaowVar;
        this.f50992ppxfxbqfkf = iobyxmoadgVar;
        this.f50993wkgbmnqykc = num;
    }
}
