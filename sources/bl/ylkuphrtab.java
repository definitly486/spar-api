package bl;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f16758iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f16759ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f16760zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f16757wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final ylkuphrtab f16756eablkybsjg = new iobyxmoadg();

    public static final class iobyxmoadg extends ylkuphrtab {
        iobyxmoadg() {
        }

        @Override // bl.ylkuphrtab
        public void gxszxtbevo() {
        }

        @Override // bl.ylkuphrtab
        public ylkuphrtab lqeggnwhkg(long j13, TimeUnit unit) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(unit, "unit");
            return this;
        }

        @Override // bl.ylkuphrtab
        public ylkuphrtab wkgbmnqykc(long j13) {
            return this;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public boolean eablkybsjg() {
        return this.f16758iobyxmoadg;
    }

    public void gxszxtbevo() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f16758iobyxmoadg && this.f16760zoijcleaow - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public ylkuphrtab iobyxmoadg() {
        this.f16758iobyxmoadg = false;
        return this;
    }

    public ylkuphrtab lqeggnwhkg(long j13, TimeUnit unit) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(unit, "unit");
        if (j13 >= 0) {
            this.f16759ppxfxbqfkf = unit.toNanos(j13);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j13).toString());
    }

    public long nufgyqmvbu() {
        return this.f16759ppxfxbqfkf;
    }

    public long ppxfxbqfkf() {
        if (this.f16758iobyxmoadg) {
            return this.f16760zoijcleaow;
        }
        throw new IllegalStateException("No deadline");
    }

    public ylkuphrtab wkgbmnqykc(long j13) {
        this.f16758iobyxmoadg = true;
        this.f16760zoijcleaow = j13;
        return this;
    }

    public ylkuphrtab zoijcleaow() {
        this.f16759ppxfxbqfkf = 0L;
        return this;
    }
}
