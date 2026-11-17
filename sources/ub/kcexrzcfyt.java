package ub;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class kcexrzcfyt implements qc.wkgbmnqykc, qc.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Executor f113144ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f113143iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Queue f113145zoijcleaow = new ArrayDeque();

    kcexrzcfyt(Executor executor) {
        this.f113144ppxfxbqfkf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void eablkybsjg(Map.Entry entry, qc.iobyxmoadg iobyxmoadgVar) {
        ((qc.zoijcleaow) entry.getKey()).iobyxmoadg(iobyxmoadgVar);
    }

    private synchronized Set wkgbmnqykc(qc.iobyxmoadg iobyxmoadgVar) {
        throw null;
    }

    public void gxszxtbevo(final qc.iobyxmoadg iobyxmoadgVar) {
        lereixgezr.zoijcleaow(iobyxmoadgVar);
        synchronized (this) {
            try {
                Queue queue = this.f113145zoijcleaow;
                if (queue != null) {
                    queue.add(iobyxmoadgVar);
                    return;
                }
                for (final Map.Entry entry : wkgbmnqykc(iobyxmoadgVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, iobyxmoadgVar) { // from class: ub.oxmwwwfdhm

                        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f113147zdlpuopuiu;

                        @Override // java.lang.Runnable
                        public final void run() {
                            kcexrzcfyt.eablkybsjg(this.f113147zdlpuopuiu, null);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qc.wkgbmnqykc
    public void iobyxmoadg(Class cls, qc.zoijcleaow zoijcleaowVar) {
        lqeggnwhkg(cls, this.f113144ppxfxbqfkf, zoijcleaowVar);
    }

    public synchronized void lqeggnwhkg(Class cls, Executor executor, qc.zoijcleaow zoijcleaowVar) {
        try {
            lereixgezr.zoijcleaow(cls);
            lereixgezr.zoijcleaow(zoijcleaowVar);
            lereixgezr.zoijcleaow(executor);
            if (!this.f113143iobyxmoadg.containsKey(cls)) {
                this.f113143iobyxmoadg.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f113143iobyxmoadg.get(cls)).put(zoijcleaowVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void ppxfxbqfkf() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f113145zoijcleaow;
                if (queue != null) {
                    this.f113145zoijcleaow = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
                gxszxtbevo(null);
            }
        }
    }
}
