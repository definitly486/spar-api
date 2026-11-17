package p5;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static final void iobyxmoadg(ReadableByteChannel input, FileChannel output) throws IOException {
        zdlpuopuiu.btonecajqb(input, "input");
        zdlpuopuiu.btonecajqb(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
