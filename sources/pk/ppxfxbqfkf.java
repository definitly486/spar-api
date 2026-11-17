package pk;

import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f76860eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f76861gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f76862iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f76863ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private pk.iobyxmoadg f76864wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76865zoijcleaow;

    public static final class iobyxmoadg extends pk.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f76866eablkybsjg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, boolean z13, tg.iobyxmoadg iobyxmoadgVar) {
            super(str, z13);
            this.f76866eablkybsjg = iobyxmoadgVar;
        }

        @Override // pk.iobyxmoadg
        public long gxszxtbevo() {
            this.f76866eablkybsjg.invoke();
            return -1L;
        }
    }

    public static final class zoijcleaow extends pk.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f76867eablkybsjg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, tg.iobyxmoadg iobyxmoadgVar) {
            super(str, false, 2, null);
            this.f76867eablkybsjg = iobyxmoadgVar;
        }

        @Override // pk.iobyxmoadg
        public long gxszxtbevo() {
            return ((Number) this.f76867eablkybsjg.invoke()).longValue();
        }
    }

    public ppxfxbqfkf(wkgbmnqykc taskRunner, String name) {
        zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f76862iobyxmoadg = taskRunner;
        this.f76865zoijcleaow = name;
        this.f76860eablkybsjg = new ArrayList();
    }

    public static /* synthetic */ void wflxmlrfwp(ppxfxbqfkf ppxfxbqfkfVar, pk.iobyxmoadg iobyxmoadgVar, long j13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j13 = 0;
        }
        ppxfxbqfkfVar.draadjrbmk(iobyxmoadgVar, j13);
    }

    public static /* synthetic */ void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, String str, long j13, boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j13 = 0;
        }
        long j14 = j13;
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        ppxfxbqfkfVar.ppxfxbqfkf(str, j14, z13, iobyxmoadgVar);
    }

    public final boolean agtfadlqog(pk.iobyxmoadg task, long j13, boolean z13) {
        String str;
        zdlpuopuiu.btonecajqb(task, "task");
        task.eablkybsjg(this);
        long jNanoTime = this.f76862iobyxmoadg.gxszxtbevo().nanoTime();
        long j14 = jNanoTime + j13;
        int iIndexOf = this.f76860eablkybsjg.indexOf(task);
        if (iIndexOf != -1) {
            if (task.ppxfxbqfkf() <= j14) {
                Logger loggerLqeggnwhkg = this.f76862iobyxmoadg.lqeggnwhkg();
                if (loggerLqeggnwhkg.isLoggable(Level.FINE)) {
                    pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg, task, this, "already scheduled");
                }
                return false;
            }
            this.f76860eablkybsjg.remove(iIndexOf);
        }
        task.lqeggnwhkg(j14);
        Logger loggerLqeggnwhkg2 = this.f76862iobyxmoadg.lqeggnwhkg();
        if (loggerLqeggnwhkg2.isLoggable(Level.FINE)) {
            if (z13) {
                str = "run again after " + pk.zoijcleaow.zoijcleaow(j14 - jNanoTime);
            } else {
                str = "scheduled after " + pk.zoijcleaow.zoijcleaow(j14 - jNanoTime);
            }
            pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg2, task, this, str);
        }
        Iterator it = this.f76860eablkybsjg.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((pk.iobyxmoadg) it.next()).ppxfxbqfkf() - jNanoTime > j13) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f76860eablkybsjg.size();
        }
        this.f76860eablkybsjg.add(size, task);
        return size == 0;
    }

    public final wkgbmnqykc btonecajqb() {
        return this.f76862iobyxmoadg;
    }

    public final void draadjrbmk(pk.iobyxmoadg task, long j13) {
        zdlpuopuiu.btonecajqb(task, "task");
        synchronized (this.f76862iobyxmoadg) {
            if (!this.f76863ppxfxbqfkf) {
                if (agtfadlqog(task, j13, false)) {
                    this.f76862iobyxmoadg.nufgyqmvbu(this);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } else if (task.iobyxmoadg()) {
                Logger loggerLqeggnwhkg = this.f76862iobyxmoadg.lqeggnwhkg();
                if (loggerLqeggnwhkg.isLoggable(Level.FINE)) {
                    pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerLqeggnwhkg2 = this.f76862iobyxmoadg.lqeggnwhkg();
                if (loggerLqeggnwhkg2.isLoggable(Level.FINE)) {
                    pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean dxjokdxxww() {
        return this.f76863ppxfxbqfkf;
    }

    public final pk.iobyxmoadg eablkybsjg() {
        return this.f76864wkgbmnqykc;
    }

    public final void gtknphoqwx(String name, long j13, tg.iobyxmoadg block) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(block, "block");
        draadjrbmk(new zoijcleaow(name, block), j13);
    }

    public final boolean gxszxtbevo() {
        return this.f76861gxszxtbevo;
    }

    public final void iobyxmoadg() {
        if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f76862iobyxmoadg) {
            try {
                if (zoijcleaow()) {
                    this.f76862iobyxmoadg.nufgyqmvbu(this);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List lqeggnwhkg() {
        return this.f76860eablkybsjg;
    }

    public final String nufgyqmvbu() {
        return this.f76865zoijcleaow;
    }

    public final void ojitshcjhn(pk.iobyxmoadg iobyxmoadgVar) {
        this.f76864wkgbmnqykc = iobyxmoadgVar;
    }

    public final void ppxfxbqfkf(String name, long j13, boolean z13, tg.iobyxmoadg block) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(block, "block");
        draadjrbmk(new iobyxmoadg(name, z13, block), j13);
    }

    public final void rgvfuqvkyq(boolean z13) {
        this.f76861gxszxtbevo = z13;
    }

    public String toString() {
        return this.f76865zoijcleaow;
    }

    public final void vdvldrhtss() {
        if (rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f76862iobyxmoadg) {
            try {
                this.f76863ppxfxbqfkf = true;
                if (zoijcleaow()) {
                    this.f76862iobyxmoadg.nufgyqmvbu(this);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zoijcleaow() {
        pk.iobyxmoadg iobyxmoadgVar = this.f76864wkgbmnqykc;
        if (iobyxmoadgVar != null) {
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            if (iobyxmoadgVar.iobyxmoadg()) {
                this.f76861gxszxtbevo = true;
            }
        }
        boolean z13 = false;
        for (int size = this.f76860eablkybsjg.size() - 1; -1 < size; size--) {
            if (((pk.iobyxmoadg) this.f76860eablkybsjg.get(size)).iobyxmoadg()) {
                Logger loggerLqeggnwhkg = this.f76862iobyxmoadg.lqeggnwhkg();
                pk.iobyxmoadg iobyxmoadgVar2 = (pk.iobyxmoadg) this.f76860eablkybsjg.get(size);
                if (loggerLqeggnwhkg.isLoggable(Level.FINE)) {
                    pk.zoijcleaow.ppxfxbqfkf(loggerLqeggnwhkg, iobyxmoadgVar2, this, "canceled");
                }
                this.f76860eablkybsjg.remove(size);
                z13 = true;
            }
        }
        return z13;
    }
}
