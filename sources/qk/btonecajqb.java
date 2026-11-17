package qk;

import gg.wwaezpbzkn;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f78953gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ConcurrentLinkedQueue f78954eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f78955iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pk.ppxfxbqfkf f78956ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f78957wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f78958zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow extends pk.iobyxmoadg {
        zoijcleaow(String str) {
            super(str, false, 2, null);
        }

        @Override // pk.iobyxmoadg
        public long gxszxtbevo() {
            return btonecajqb.this.zoijcleaow(System.nanoTime());
        }
    }

    public btonecajqb(pk.wkgbmnqykc taskRunner, int i13, long j13, TimeUnit timeUnit) {
        zdlpuopuiu.btonecajqb(taskRunner, "taskRunner");
        zdlpuopuiu.btonecajqb(timeUnit, "timeUnit");
        this.f78955iobyxmoadg = i13;
        this.f78958zoijcleaow = timeUnit.toNanos(j13);
        this.f78956ppxfxbqfkf = taskRunner.dxjokdxxww();
        this.f78957wkgbmnqykc = new zoijcleaow(mk.rgvfuqvkyq.f67371gxszxtbevo + " ConnectionPool");
        this.f78954eablkybsjg = new ConcurrentLinkedQueue();
        if (j13 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j13).toString());
    }

    private final int wkgbmnqykc(dxjokdxxww dxjokdxxwwVar, long j13) {
        if (mk.rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(dxjokdxxwwVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dxjokdxxwwVar);
        }
        List listDxjokdxxww = dxjokdxxwwVar.dxjokdxxww();
        int i13 = 0;
        while (i13 < listDxjokdxxww.size()) {
            Reference reference = (Reference) listDxjokdxxww.get(i13);
            if (reference.get() != null) {
                i13++;
            } else {
                zdlpuopuiu.nufgyqmvbu(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().draadjrbmk("A connection to " + dxjokdxxwwVar.zdlpuopuiu().iobyxmoadg().draadjrbmk() + " was leaked. Did you forget to close a response body?", ((nufgyqmvbu.zoijcleaow) reference).iobyxmoadg());
                listDxjokdxxww.remove(i13);
                dxjokdxxwwVar.iwizpuwonk(true);
                if (listDxjokdxxww.isEmpty()) {
                    dxjokdxxwwVar.jyumaefscl(j13 - this.f78958zoijcleaow);
                    return 0;
                }
            }
        }
        return listDxjokdxxww.size();
    }

    public final void eablkybsjg(dxjokdxxww connection) {
        zdlpuopuiu.btonecajqb(connection, "connection");
        if (!mk.rgvfuqvkyq.f67370eablkybsjg || Thread.holdsLock(connection)) {
            this.f78954eablkybsjg.add(connection);
            pk.ppxfxbqfkf.wflxmlrfwp(this.f78956ppxfxbqfkf, this.f78957wkgbmnqykc, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:9:0x0026, B:14:0x002f, B:17:0x0036), top: B:38:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:9:0x0026, B:14:0x002f, B:17:0x0036), top: B:38:0x0026 }] */
    public final dxjokdxxww iobyxmoadg(boolean z13, lk.iobyxmoadg address, nufgyqmvbu call, List list, boolean z14) {
        boolean z15;
        Socket socketCqumvgiudr;
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(call, "call");
        for (dxjokdxxww connection : this.f78954eablkybsjg) {
            zdlpuopuiu.dxjokdxxww(connection, "connection");
            synchronized (connection) {
                z15 = false;
                if (z14) {
                    try {
                        if (connection.vdvldrhtss()) {
                            if (!connection.ojitshcjhn(address, list)) {
                                call.ppxfxbqfkf(connection);
                                z15 = true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (!connection.ojitshcjhn(address, list)) {
                    call.ppxfxbqfkf(connection);
                    z15 = true;
                }
            }
            if (z15) {
                if (connection.rgvfuqvkyq(z13)) {
                    return connection;
                }
                synchronized (connection) {
                    connection.iwizpuwonk(true);
                    socketCqumvgiudr = call.cqumvgiudr();
                }
                if (socketCqumvgiudr != null) {
                    mk.rgvfuqvkyq.lqeggnwhkg(socketCqumvgiudr);
                }
            }
        }
        return null;
    }

    public final boolean ppxfxbqfkf(dxjokdxxww connection) {
        zdlpuopuiu.btonecajqb(connection, "connection");
        if (mk.rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.gtknphoqwx() && this.f78955iobyxmoadg != 0) {
            pk.ppxfxbqfkf.wflxmlrfwp(this.f78956ppxfxbqfkf, this.f78957wkgbmnqykc, 0L, 2, null);
            return false;
        }
        connection.iwizpuwonk(true);
        this.f78954eablkybsjg.remove(connection);
        if (this.f78954eablkybsjg.isEmpty()) {
            this.f78956ppxfxbqfkf.iobyxmoadg();
        }
        return true;
    }

    public final long zoijcleaow(long j13) {
        int i13 = 0;
        long j14 = Long.MIN_VALUE;
        dxjokdxxww dxjokdxxwwVar = null;
        int i14 = 0;
        for (dxjokdxxww connection : this.f78954eablkybsjg) {
            zdlpuopuiu.dxjokdxxww(connection, "connection");
            synchronized (connection) {
                if (wkgbmnqykc(connection, j13) > 0) {
                    i14++;
                } else {
                    i13++;
                    long jBtonecajqb = j13 - connection.btonecajqb();
                    if (jBtonecajqb > j14) {
                        dxjokdxxwwVar = connection;
                        j14 = jBtonecajqb;
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                }
            }
        }
        long j15 = this.f78958zoijcleaow;
        if (j14 < j15 && i13 <= this.f78955iobyxmoadg) {
            if (i13 > 0) {
                return j15 - j14;
            }
            if (i14 > 0) {
                return j15;
            }
            return -1L;
        }
        zdlpuopuiu.lqeggnwhkg(dxjokdxxwwVar);
        synchronized (dxjokdxxwwVar) {
            if (!dxjokdxxwwVar.dxjokdxxww().isEmpty()) {
                return 0L;
            }
            if (dxjokdxxwwVar.btonecajqb() + j14 != j13) {
                return 0L;
            }
            dxjokdxxwwVar.iwizpuwonk(true);
            this.f78954eablkybsjg.remove(dxjokdxxwwVar);
            mk.rgvfuqvkyq.lqeggnwhkg(dxjokdxxwwVar.cqumvgiudr());
            if (this.f78954eablkybsjg.isEmpty()) {
                this.f78956ppxfxbqfkf.iobyxmoadg();
            }
            return 0L;
        }
    }
}
