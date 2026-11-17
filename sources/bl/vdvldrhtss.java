package bl;

import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss extends lqeggnwhkg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final RandomAccessFile f16751cqumvgiudr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdvldrhtss(boolean z13, RandomAccessFile randomAccessFile) {
        super(z13);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(randomAccessFile, "randomAccessFile");
        this.f16751cqumvgiudr = randomAccessFile;
    }

    @Override // bl.lqeggnwhkg
    protected synchronized long agtfadlqog() {
        return this.f16751cqumvgiudr.length();
    }

    @Override // bl.lqeggnwhkg
    protected synchronized void btonecajqb() {
        this.f16751cqumvgiudr.close();
    }

    @Override // bl.lqeggnwhkg
    protected synchronized int draadjrbmk(long j13, byte[] array, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        this.f16751cqumvgiudr.seek(j13);
        int i15 = 0;
        while (i15 < i14) {
            int i16 = this.f16751cqumvgiudr.read(array, i13, i14 - i15);
            if (i16 == -1) {
                if (i15 != 0) {
                    break;
                }
                return -1;
            }
            i15 += i16;
        }
        return i15;
    }
}
