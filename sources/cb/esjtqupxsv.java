package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class esjtqupxsv extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f19414iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f19415ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f19416wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f19417zoijcleaow;

    private esjtqupxsv(pmvmpeiblj pmvmpeibljVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f19414iobyxmoadg = pmvmpeibljVar;
        this.f19417zoijcleaow = zoijcleaowVar;
        this.f19415ppxfxbqfkf = iobyxmoadgVar;
        this.f19416wkgbmnqykc = num;
    }

    public static esjtqupxsv iobyxmoadg(pmvmpeiblj.iobyxmoadg iobyxmoadgVar, pb.zoijcleaow zoijcleaowVar, Integer num) throws GeneralSecurityException {
        pmvmpeiblj.iobyxmoadg iobyxmoadgVar2 = pmvmpeiblj.iobyxmoadg.f19479wkgbmnqykc;
        if (iobyxmoadgVar != iobyxmoadgVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + iobyxmoadgVar + " the value of idRequirement must be non-null");
        }
        if (iobyxmoadgVar == iobyxmoadgVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zoijcleaowVar.zoijcleaow() == 32) {
            pmvmpeiblj pmvmpeibljVarIobyxmoadg = pmvmpeiblj.iobyxmoadg(iobyxmoadgVar);
            return new esjtqupxsv(pmvmpeibljVarIobyxmoadg, zoijcleaowVar, zoijcleaow(pmvmpeibljVarIobyxmoadg, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zoijcleaowVar.zoijcleaow());
    }

    private static pb.iobyxmoadg zoijcleaow(pmvmpeiblj pmvmpeibljVar, Integer num) {
        if (pmvmpeibljVar.zoijcleaow() == pmvmpeiblj.iobyxmoadg.f19479wkgbmnqykc) {
            return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
        }
        if (pmvmpeibljVar.zoijcleaow() == pmvmpeiblj.iobyxmoadg.f19478ppxfxbqfkf) {
            return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (pmvmpeibljVar.zoijcleaow() == pmvmpeiblj.iobyxmoadg.f19480zoijcleaow) {
            return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + pmvmpeibljVar.zoijcleaow());
    }
}
