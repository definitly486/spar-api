package bl;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg implements Closeable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ReentrantLock f16717iwizpuwonk = hkdspvbjdz.zoijcleaow();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f16718jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f16719yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f16720zdlpuopuiu;

    private static final class iobyxmoadg implements wwaezpbzkn {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f16721jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private long f16722yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lqeggnwhkg f16723zdlpuopuiu;

        public iobyxmoadg(lqeggnwhkg fileHandle, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fileHandle, "fileHandle");
            this.f16723zdlpuopuiu = fileHandle;
            this.f16722yggfygwlhe = j13;
        }

        @Override // bl.wwaezpbzkn, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16721jyumaefscl) {
                return;
            }
            this.f16721jyumaefscl = true;
            ReentrantLock reentrantLockDxjokdxxww = this.f16723zdlpuopuiu.dxjokdxxww();
            reentrantLockDxjokdxxww.lock();
            try {
                this.f16723zdlpuopuiu.f16718jyumaefscl--;
                if (this.f16723zdlpuopuiu.f16718jyumaefscl == 0 && this.f16723zdlpuopuiu.f16719yggfygwlhe) {
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    reentrantLockDxjokdxxww.unlock();
                    this.f16723zdlpuopuiu.btonecajqb();
                    return;
                }
                reentrantLockDxjokdxxww.unlock();
            } catch (Throwable th2) {
                reentrantLockDxjokdxxww.unlock();
                throw th2;
            }
        }

        @Override // bl.wwaezpbzkn
        public long fmlbqenlif(ppxfxbqfkf sink, long j13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sink, "sink");
            if (this.f16721jyumaefscl) {
                throw new IllegalStateException("closed");
            }
            long jOjitshcjhn = this.f16723zdlpuopuiu.ojitshcjhn(this.f16722yggfygwlhe, sink, j13);
            if (jOjitshcjhn != -1) {
                this.f16722yggfygwlhe += jOjitshcjhn;
            }
            return jOjitshcjhn;
        }

        @Override // bl.wwaezpbzkn
        public ylkuphrtab ppxfxbqfkf() {
            return ylkuphrtab.f16756eablkybsjg;
        }
    }

    public lqeggnwhkg(boolean z13) {
        this.f16720zdlpuopuiu = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ojitshcjhn(long j13, ppxfxbqfkf ppxfxbqfkfVar, long j14) {
        if (j14 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j14).toString());
        }
        long j15 = j14 + j13;
        long j16 = j13;
        while (j16 < j15) {
            istkbnxepw istkbnxepwVarNtlheqmsrt = ppxfxbqfkfVar.ntlheqmsrt(1);
            byte[] bArr = istkbnxepwVarNtlheqmsrt.f16700iobyxmoadg;
            int i13 = istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf;
            int iDraadjrbmk = draadjrbmk(j16, bArr, i13, (int) Math.min(j15 - j16, 8192 - i13));
            if (iDraadjrbmk == -1) {
                if (istkbnxepwVarNtlheqmsrt.f16704zoijcleaow == istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf) {
                    ppxfxbqfkfVar.f16740zdlpuopuiu = istkbnxepwVarNtlheqmsrt.zoijcleaow();
                    cdpycssgdh.zoijcleaow(istkbnxepwVarNtlheqmsrt);
                }
                if (j13 != j16) {
                    break;
                }
                return -1L;
            }
            istkbnxepwVarNtlheqmsrt.f16702ppxfxbqfkf += iDraadjrbmk;
            long j17 = iDraadjrbmk;
            j16 += j17;
            ppxfxbqfkfVar.hkdspvbjdz(ppxfxbqfkfVar.dsvhmnatus() + j17);
        }
        return j16 - j13;
    }

    protected abstract long agtfadlqog();

    protected abstract void btonecajqb();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f16717iwizpuwonk;
        reentrantLock.lock();
        try {
            if (this.f16719yggfygwlhe) {
                reentrantLock.unlock();
                return;
            }
            this.f16719yggfygwlhe = true;
            if (this.f16718jyumaefscl != 0) {
                reentrantLock.unlock();
                return;
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            reentrantLock.unlock();
            btonecajqb();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    protected abstract int draadjrbmk(long j13, byte[] bArr, int i13, int i14);

    public final ReentrantLock dxjokdxxww() {
        return this.f16717iwizpuwonk;
    }

    public final long rgvfuqvkyq() {
        ReentrantLock reentrantLock = this.f16717iwizpuwonk;
        reentrantLock.lock();
        try {
            if (this.f16719yggfygwlhe) {
                throw new IllegalStateException("closed");
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            reentrantLock.unlock();
            return agtfadlqog();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final wwaezpbzkn vdvldrhtss(long j13) {
        ReentrantLock reentrantLock = this.f16717iwizpuwonk;
        reentrantLock.lock();
        try {
            if (this.f16719yggfygwlhe) {
                throw new IllegalStateException("closed");
            }
            this.f16718jyumaefscl++;
            reentrantLock.unlock();
            return new iobyxmoadg(this, j13);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
