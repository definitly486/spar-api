package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Executor f13134nufgyqmvbu = new ppxfxbqfkf();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private List f13135eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private List f13136gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f13137iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    int f13138lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    Executor f13139ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f13140wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final androidx.recyclerview.widget.ppxfxbqfkf f13141zoijcleaow;

    class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Runnable f13143iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f13144jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f13145yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f13146zdlpuopuiu;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0184iobyxmoadg extends nufgyqmvbu.zoijcleaow {
            C0184iobyxmoadg() {
            }

            @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
            public boolean areContentsTheSame(int i13, int i14) {
                Object obj = iobyxmoadg.this.f13146zdlpuopuiu.get(i13);
                Object obj2 = iobyxmoadg.this.f13145yggfygwlhe.get(i14);
                if (obj != null && obj2 != null) {
                    return wkgbmnqykc.this.f13141zoijcleaow.zoijcleaow().iobyxmoadg(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
            public boolean areItemsTheSame(int i13, int i14) {
                Object obj = iobyxmoadg.this.f13146zdlpuopuiu.get(i13);
                Object obj2 = iobyxmoadg.this.f13145yggfygwlhe.get(i14);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return wkgbmnqykc.this.f13141zoijcleaow.zoijcleaow().zoijcleaow(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
            public Object getChangePayload(int i13, int i14) {
                Object obj = iobyxmoadg.this.f13146zdlpuopuiu.get(i13);
                Object obj2 = iobyxmoadg.this.f13145yggfygwlhe.get(i14);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return wkgbmnqykc.this.f13141zoijcleaow.zoijcleaow().ppxfxbqfkf(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
            public int getNewListSize() {
                return iobyxmoadg.this.f13145yggfygwlhe.size();
            }

            @Override // androidx.recyclerview.widget.nufgyqmvbu.zoijcleaow
            public int getOldListSize() {
                return iobyxmoadg.this.f13146zdlpuopuiu.size();
            }
        }

        class zoijcleaow implements Runnable {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu.eablkybsjg f13149zdlpuopuiu;

            zoijcleaow(nufgyqmvbu.eablkybsjg eablkybsjgVar) {
                this.f13149zdlpuopuiu = eablkybsjgVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.this;
                if (wkgbmnqykcVar.f13138lqeggnwhkg == iobyxmoadgVar.f13144jyumaefscl) {
                    wkgbmnqykcVar.ppxfxbqfkf(iobyxmoadgVar.f13145yggfygwlhe, this.f13149zdlpuopuiu, iobyxmoadgVar.f13143iwizpuwonk);
                }
            }
        }

        iobyxmoadg(List list, List list2, int i13, Runnable runnable) {
            this.f13146zdlpuopuiu = list;
            this.f13145yggfygwlhe = list2;
            this.f13144jyumaefscl = i13;
            this.f13143iwizpuwonk = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            wkgbmnqykc.this.f13139ppxfxbqfkf.execute(new zoijcleaow(nufgyqmvbu.zoijcleaow(new C0184iobyxmoadg())));
        }
    }

    private static class ppxfxbqfkf implements Executor {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Handler f13150zdlpuopuiu = new Handler(Looper.getMainLooper());

        ppxfxbqfkf() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f13150zdlpuopuiu.post(runnable);
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(List list, List list2);
    }

    public wkgbmnqykc(RecyclerView.nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
        this(new androidx.recyclerview.widget.zoijcleaow(nufgyqmvbuVar), new androidx.recyclerview.widget.ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar).iobyxmoadg());
    }

    private void wkgbmnqykc(List list, Runnable runnable) {
        Iterator it = this.f13140wkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((zoijcleaow) it.next()).iobyxmoadg(list, this.f13136gxszxtbevo);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void eablkybsjg(List list) {
        gxszxtbevo(list, null);
    }

    public void gxszxtbevo(List list, Runnable runnable) {
        int i13 = this.f13138lqeggnwhkg + 1;
        this.f13138lqeggnwhkg = i13;
        List list2 = this.f13135eablkybsjg;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f13136gxszxtbevo;
        if (list == null) {
            int size = list2.size();
            this.f13135eablkybsjg = null;
            this.f13136gxszxtbevo = Collections.emptyList();
            this.f13137iobyxmoadg.zoijcleaow(0, size);
            wkgbmnqykc(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f13141zoijcleaow.iobyxmoadg().execute(new iobyxmoadg(list2, list, i13, runnable));
            return;
        }
        this.f13135eablkybsjg = list;
        this.f13136gxszxtbevo = Collections.unmodifiableList(list);
        this.f13137iobyxmoadg.iobyxmoadg(0, list.size());
        wkgbmnqykc(list3, runnable);
    }

    public void iobyxmoadg(zoijcleaow zoijcleaowVar) {
        this.f13140wkgbmnqykc.add(zoijcleaowVar);
    }

    void ppxfxbqfkf(List list, nufgyqmvbu.eablkybsjg eablkybsjgVar, Runnable runnable) {
        List list2 = this.f13136gxszxtbevo;
        this.f13135eablkybsjg = list;
        this.f13136gxszxtbevo = Collections.unmodifiableList(list);
        eablkybsjgVar.zoijcleaow(this.f13137iobyxmoadg);
        wkgbmnqykc(list2, runnable);
    }

    public List zoijcleaow() {
        return this.f13136gxszxtbevo;
    }

    public wkgbmnqykc(kcexrzcfyt kcexrzcfytVar, androidx.recyclerview.widget.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f13140wkgbmnqykc = new CopyOnWriteArrayList();
        this.f13136gxszxtbevo = Collections.emptyList();
        this.f13137iobyxmoadg = kcexrzcfytVar;
        this.f13141zoijcleaow = ppxfxbqfkfVar;
        if (ppxfxbqfkfVar.ppxfxbqfkf() != null) {
            this.f13139ppxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        } else {
            this.f13139ppxfxbqfkf = f13134nufgyqmvbu;
        }
    }
}
