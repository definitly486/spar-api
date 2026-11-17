package pk;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(Logger logger, iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(ppxfxbqfkfVar.nufgyqmvbu());
        sb3.append(' ');
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        zdlpuopuiu.dxjokdxxww(str2, "format(format, *args)");
        sb3.append(str2);
        sb3.append(": ");
        sb3.append(iobyxmoadgVar.zoijcleaow());
        logger.fine(sb3.toString());
    }

    public static final String zoijcleaow(long j13) {
        String str;
        if (j13 <= -999500000) {
            str = ((j13 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j13 <= -999500) {
            str = ((j13 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j13 <= 0) {
            str = ((j13 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j13 < 999500) {
            str = ((j13 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j13 < 999500000) {
            str = ((j13 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j13 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        zdlpuopuiu.dxjokdxxww(str2, "format(format, *args)");
        return str2;
    }
}
