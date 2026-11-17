package al;

import bl.ppxfxbqfkf;
import java.io.EOFException;
import kotlin.jvm.internal.zdlpuopuiu;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final boolean iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        try {
            ppxfxbqfkf ppxfxbqfkfVar2 = new ppxfxbqfkf();
            ppxfxbqfkfVar.draadjrbmk(ppxfxbqfkfVar2, 0L, gtknphoqwx.gtknphoqwx(ppxfxbqfkfVar.dsvhmnatus(), 64L));
            for (int i13 = 0; i13 < 16 && !ppxfxbqfkfVar2.n(); i13++) {
                int iCdpycssgdh = ppxfxbqfkfVar2.cdpycssgdh();
                if (Character.isISOControl(iCdpycssgdh) && !Character.isWhitespace(iCdpycssgdh)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
