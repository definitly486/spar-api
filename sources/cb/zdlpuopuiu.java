package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zdlpuopuiu extends cb.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f19510iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f19511ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f19512wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f19513zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private jyumaefscl f19514iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Integer f19515ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pb.zoijcleaow f19516zoijcleaow;

        private pb.iobyxmoadg zoijcleaow() {
            if (this.f19514iobyxmoadg.ppxfxbqfkf() == jyumaefscl.ppxfxbqfkf.f19446wkgbmnqykc) {
                return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
            }
            if (this.f19514iobyxmoadg.ppxfxbqfkf() == jyumaefscl.ppxfxbqfkf.f19445ppxfxbqfkf) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f19515ppxfxbqfkf.intValue()).array());
            }
            if (this.f19514iobyxmoadg.ppxfxbqfkf() == jyumaefscl.ppxfxbqfkf.f19447zoijcleaow) {
                return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f19515ppxfxbqfkf.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f19514iobyxmoadg.ppxfxbqfkf());
        }

        public zoijcleaow eablkybsjg(jyumaefscl jyumaefsclVar) {
            this.f19514iobyxmoadg = jyumaefsclVar;
            return this;
        }

        public zdlpuopuiu iobyxmoadg() throws GeneralSecurityException {
            jyumaefscl jyumaefsclVar = this.f19514iobyxmoadg;
            if (jyumaefsclVar == null || this.f19516zoijcleaow == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (jyumaefsclVar.zoijcleaow() != this.f19516zoijcleaow.zoijcleaow()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f19514iobyxmoadg.wkgbmnqykc() && this.f19515ppxfxbqfkf == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f19514iobyxmoadg.wkgbmnqykc() && this.f19515ppxfxbqfkf != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new zdlpuopuiu(this.f19514iobyxmoadg, this.f19516zoijcleaow, zoijcleaow(), this.f19515ppxfxbqfkf);
        }

        public zoijcleaow ppxfxbqfkf(Integer num) {
            this.f19515ppxfxbqfkf = num;
            return this;
        }

        public zoijcleaow wkgbmnqykc(pb.zoijcleaow zoijcleaowVar) {
            this.f19516zoijcleaow = zoijcleaowVar;
            return this;
        }

        private zoijcleaow() {
            this.f19514iobyxmoadg = null;
            this.f19516zoijcleaow = null;
            this.f19515ppxfxbqfkf = null;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    private zdlpuopuiu(jyumaefscl jyumaefsclVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f19510iobyxmoadg = jyumaefsclVar;
        this.f19513zoijcleaow = zoijcleaowVar;
        this.f19511ppxfxbqfkf = iobyxmoadgVar;
        this.f19512wkgbmnqykc = num;
    }
}
