package cb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class lmojexxdyd extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ylkuphrtab f19458iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pb.iobyxmoadg f19459ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f19460wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb.zoijcleaow f19461zoijcleaow;

    private lmojexxdyd(ylkuphrtab ylkuphrtabVar, pb.zoijcleaow zoijcleaowVar, pb.iobyxmoadg iobyxmoadgVar, Integer num) {
        this.f19458iobyxmoadg = ylkuphrtabVar;
        this.f19461zoijcleaow = zoijcleaowVar;
        this.f19459ppxfxbqfkf = iobyxmoadgVar;
        this.f19460wkgbmnqykc = num;
    }

    public static lmojexxdyd iobyxmoadg(ylkuphrtab.iobyxmoadg iobyxmoadgVar, pb.zoijcleaow zoijcleaowVar, Integer num) throws GeneralSecurityException {
        ylkuphrtab.iobyxmoadg iobyxmoadgVar2 = ylkuphrtab.iobyxmoadg.f19507wkgbmnqykc;
        if (iobyxmoadgVar != iobyxmoadgVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + iobyxmoadgVar + " the value of idRequirement must be non-null");
        }
        if (iobyxmoadgVar == iobyxmoadgVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zoijcleaowVar.zoijcleaow() == 32) {
            ylkuphrtab ylkuphrtabVarIobyxmoadg = ylkuphrtab.iobyxmoadg(iobyxmoadgVar);
            return new lmojexxdyd(ylkuphrtabVarIobyxmoadg, zoijcleaowVar, zoijcleaow(ylkuphrtabVarIobyxmoadg, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zoijcleaowVar.zoijcleaow());
    }

    private static pb.iobyxmoadg zoijcleaow(ylkuphrtab ylkuphrtabVar, Integer num) {
        if (ylkuphrtabVar.zoijcleaow() == ylkuphrtab.iobyxmoadg.f19507wkgbmnqykc) {
            return pb.iobyxmoadg.iobyxmoadg(new byte[0]);
        }
        if (ylkuphrtabVar.zoijcleaow() == ylkuphrtab.iobyxmoadg.f19506ppxfxbqfkf) {
            return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (ylkuphrtabVar.zoijcleaow() == ylkuphrtab.iobyxmoadg.f19508zoijcleaow) {
            return pb.iobyxmoadg.iobyxmoadg(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + ylkuphrtabVar.zoijcleaow());
    }
}
