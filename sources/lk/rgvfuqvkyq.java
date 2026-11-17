package lk;

import gg.wwaezpbzkn;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Runnable f63194ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private ExecutorService f63195wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f63192iobyxmoadg = 64;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f63196zoijcleaow = 5;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ArrayDeque f63190eablkybsjg = new ArrayDeque();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ArrayDeque f63191gxszxtbevo = new ArrayDeque();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ArrayDeque f63193lqeggnwhkg = new ArrayDeque();

    private final void eablkybsjg(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f63194ppxfxbqfkf;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        if (nufgyqmvbu() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean nufgyqmvbu() {
        int i13;
        boolean z13;
        if (mk.rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f63190eablkybsjg.iterator();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    qk.nufgyqmvbu.iobyxmoadg asyncCall = (qk.nufgyqmvbu.iobyxmoadg) it.next();
                    if (this.f63191gxszxtbevo.size() >= this.f63192iobyxmoadg) {
                        break;
                    }
                    if (asyncCall.eablkybsjg().get() < this.f63196zoijcleaow) {
                        it.remove();
                        asyncCall.eablkybsjg().incrementAndGet();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f63191gxszxtbevo.add(asyncCall);
                    }
                }
                i13 = 0;
                z13 = dxjokdxxww() > 0;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (ppxfxbqfkf().isShutdown()) {
            int size = arrayList.size();
            while (i13 < size) {
                qk.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = (qk.nufgyqmvbu.iobyxmoadg) arrayList.get(i13);
                iobyxmoadgVar.eablkybsjg().decrementAndGet();
                synchronized (this) {
                    this.f63191gxszxtbevo.remove(iobyxmoadgVar);
                }
                qk.nufgyqmvbu.iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar, null, 1, null);
                i13++;
            }
            Runnable runnable = this.f63194ppxfxbqfkf;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            int size2 = arrayList.size();
            while (i13 < size2) {
                ((qk.nufgyqmvbu.iobyxmoadg) arrayList.get(i13)).iobyxmoadg(ppxfxbqfkf());
                i13++;
            }
        }
        return z13;
    }

    private final qk.nufgyqmvbu.iobyxmoadg wkgbmnqykc(String str) {
        for (qk.nufgyqmvbu.iobyxmoadg iobyxmoadgVar : this.f63191gxszxtbevo) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar.gxszxtbevo(), str)) {
                return iobyxmoadgVar;
            }
        }
        for (qk.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2 : this.f63190eablkybsjg) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadgVar2.gxszxtbevo(), str)) {
                return iobyxmoadgVar2;
            }
        }
        return null;
    }

    public final synchronized int dxjokdxxww() {
        return this.f63191gxszxtbevo.size() + this.f63193lqeggnwhkg.size();
    }

    public final void gxszxtbevo(qk.nufgyqmvbu.iobyxmoadg call) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        call.eablkybsjg().decrementAndGet();
        eablkybsjg(this.f63191gxszxtbevo, call);
    }

    public final void iobyxmoadg(qk.nufgyqmvbu.iobyxmoadg call) {
        qk.nufgyqmvbu.iobyxmoadg iobyxmoadgVarWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        synchronized (this) {
            try {
                this.f63190eablkybsjg.add(call);
                if (!call.wkgbmnqykc().ojitshcjhn() && (iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(call.gxszxtbevo())) != null) {
                    call.lqeggnwhkg(iobyxmoadgVarWkgbmnqykc);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        nufgyqmvbu();
    }

    public final void lqeggnwhkg(qk.nufgyqmvbu call) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        eablkybsjg(this.f63193lqeggnwhkg, call);
    }

    public final synchronized ExecutorService ppxfxbqfkf() {
        ExecutorService executorService;
        try {
            if (this.f63195wkgbmnqykc == null) {
                this.f63195wkgbmnqykc = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), mk.rgvfuqvkyq.ojitshcjhn(mk.rgvfuqvkyq.f67371gxszxtbevo + " Dispatcher", false));
            }
            executorService = this.f63195wkgbmnqykc;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final synchronized void zoijcleaow(qk.nufgyqmvbu call) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(call, "call");
        this.f63193lqeggnwhkg.add(call);
    }
}
