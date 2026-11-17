package bb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import nb.istkbnxepw;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final byte[] f15668iobyxmoadg = new byte[0];

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f15669iobyxmoadg;

        static {
            int[] iArr = new int[ylkuphrtab.values().length];
            f15669iobyxmoadg = iArr;
            try {
                iArr[ylkuphrtab.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15669iobyxmoadg[ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15669iobyxmoadg[ylkuphrtab.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15669iobyxmoadg[ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] iobyxmoadg(istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f15669iobyxmoadg[ppxfxbqfkfVar.ulzqkzuiru().ordinal()];
        if (i13 == 1 || i13 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(ppxfxbqfkfVar.ntlheqmsrt()).array();
        }
        if (i13 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(ppxfxbqfkfVar.ntlheqmsrt()).array();
        }
        if (i13 == 4) {
            return f15668iobyxmoadg;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
