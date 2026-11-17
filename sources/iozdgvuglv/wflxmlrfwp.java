package iozdgvuglv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
class wflxmlrfwp implements com.google.common.util.concurrent.wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f49122cqumvgiudr = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new iobyxmoadg());

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f49123esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final AtomicInteger f49124iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f49125jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    List f49126yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    List f49127zdlpuopuiu;

    class iobyxmoadg implements androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
        public Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            u1.nufgyqmvbu.dxjokdxxww(wflxmlrfwp.this.f49123esjtqupxsv == null, "The result can only set once!");
            wflxmlrfwp.this.f49123esjtqupxsv = iobyxmoadgVar;
            return "ListFuture[" + this + "]";
        }
    }

    class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc f49130yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f49131zdlpuopuiu;

        ppxfxbqfkf(int i13, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
            this.f49131zdlpuopuiu = i13;
            this.f49130yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            wflxmlrfwp.this.gxszxtbevo(this.f49131zdlpuopuiu, this.f49130yggfygwlhe);
        }
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.this;
            wflxmlrfwpVar.f49126yggfygwlhe = null;
            wflxmlrfwpVar.f49127zdlpuopuiu = null;
        }
    }

    wflxmlrfwp(List list, boolean z13, Executor executor) {
        this.f49127zdlpuopuiu = (List) u1.nufgyqmvbu.gxszxtbevo(list);
        this.f49126yggfygwlhe = new ArrayList(list.size());
        this.f49125jyumaefscl = z13;
        this.f49124iwizpuwonk = new AtomicInteger(list.size());
        eablkybsjg(executor);
    }

    private void eablkybsjg(Executor executor) {
        iobyxmoadg(new zoijcleaow(), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        if (this.f49127zdlpuopuiu.isEmpty()) {
            this.f49123esjtqupxsv.ppxfxbqfkf(new ArrayList(this.f49126yggfygwlhe));
            return;
        }
        for (int i13 = 0; i13 < this.f49127zdlpuopuiu.size(); i13++) {
            this.f49126yggfygwlhe.add(null);
        }
        List list = this.f49127zdlpuopuiu;
        for (int i14 = 0; i14 < list.size(); i14++) {
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = (com.google.common.util.concurrent.wkgbmnqykc) list.get(i14);
            wkgbmnqykcVar.iobyxmoadg(new ppxfxbqfkf(i14, wkgbmnqykcVar), executor);
        }
    }

    private void zoijcleaow() throws InterruptedException {
        List<com.google.common.util.concurrent.wkgbmnqykc> list = this.f49127zdlpuopuiu;
        if (list == null || isDone()) {
            return;
        }
        for (com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar : list) {
            while (!wkgbmnqykcVar.isDone()) {
                try {
                    wkgbmnqykcVar.get();
                } catch (Error e13) {
                    throw e13;
                } catch (InterruptedException e14) {
                    throw e14;
                } catch (Throwable unused) {
                    if (this.f49125jyumaefscl) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        List list = this.f49127zdlpuopuiu;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.google.common.util.concurrent.wkgbmnqykc) it.next()).cancel(z13);
            }
        }
        return this.f49122cqumvgiudr.cancel(z13);
    }

    void gxszxtbevo(int i13, Future future) {
        List list;
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar;
        ArrayList arrayList;
        List list2 = this.f49126yggfygwlhe;
        if (isDone() || list2 == null) {
            u1.nufgyqmvbu.dxjokdxxww(this.f49125jyumaefscl, "Future was done before all dependencies completed");
            return;
        }
        try {
            u1.nufgyqmvbu.dxjokdxxww(future.isDone(), "Tried to set value from future which is not done");
            list2.set(i13, gtknphoqwx.dxjokdxxww(future));
            int iDecrementAndGet = this.f49124iwizpuwonk.decrementAndGet();
            u1.nufgyqmvbu.dxjokdxxww(iDecrementAndGet >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet == 0) {
                if (list != null) {
                    iobyxmoadgVar = this.f49123esjtqupxsv;
                    arrayList = new ArrayList(list);
                    iobyxmoadgVar.ppxfxbqfkf(arrayList);
                }
            }
        } catch (RuntimeException e13) {
            if (this.f49125jyumaefscl) {
                this.f49123esjtqupxsv.gxszxtbevo(e13);
            }
            int iDecrementAndGet2 = this.f49124iwizpuwonk.decrementAndGet();
            u1.nufgyqmvbu.dxjokdxxww(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet2 == 0) {
                if (list != null) {
                    iobyxmoadgVar = this.f49123esjtqupxsv;
                    arrayList = new ArrayList(list);
                }
            }
        } catch (ExecutionException e14) {
            if (this.f49125jyumaefscl) {
                this.f49123esjtqupxsv.gxszxtbevo(e14.getCause());
            }
            int iDecrementAndGet3 = this.f49124iwizpuwonk.decrementAndGet();
            u1.nufgyqmvbu.dxjokdxxww(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet3 == 0) {
                if (list != null) {
                    iobyxmoadgVar = this.f49123esjtqupxsv;
                    arrayList = new ArrayList(list);
                }
            }
        } catch (Error e15) {
            this.f49123esjtqupxsv.gxszxtbevo(e15);
            int iDecrementAndGet4 = this.f49124iwizpuwonk.decrementAndGet();
            u1.nufgyqmvbu.dxjokdxxww(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet4 == 0) {
                if (list != null) {
                    iobyxmoadgVar = this.f49123esjtqupxsv;
                    arrayList = new ArrayList(list);
                }
            }
        } catch (CancellationException unused) {
            if (this.f49125jyumaefscl) {
                cancel(false);
            }
            int iDecrementAndGet5 = this.f49124iwizpuwonk.decrementAndGet();
            u1.nufgyqmvbu.dxjokdxxww(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet5 == 0) {
                if (list != null) {
                    iobyxmoadgVar = this.f49123esjtqupxsv;
                    arrayList = new ArrayList(list);
                }
            }
        } finally {
            int iDecrementAndGet6 = this.f49124iwizpuwonk.decrementAndGet();
            u1.nufgyqmvbu.dxjokdxxww(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                list = this.f49126yggfygwlhe;
                if (list != null) {
                    this.f49123esjtqupxsv.ppxfxbqfkf(new ArrayList(list));
                } else {
                    u1.nufgyqmvbu.nufgyqmvbu(isDone());
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.wkgbmnqykc
    public void iobyxmoadg(Runnable runnable, Executor executor) {
        this.f49122cqumvgiudr.iobyxmoadg(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f49122cqumvgiudr.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f49122cqumvgiudr.isDone();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public List get() throws InterruptedException {
        zoijcleaow();
        return (List) this.f49122cqumvgiudr.get();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public List get(long j13, TimeUnit timeUnit) {
        return (List) this.f49122cqumvgiudr.get(j13, timeUnit);
    }
}
