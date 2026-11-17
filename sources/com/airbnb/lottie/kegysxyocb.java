package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class kegysxyocb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static Executor f20482eablkybsjg = Executors.newCachedThreadPool(new v7.eablkybsjg());

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f20483iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Handler f20484ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile wypolnanlu f20485wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f20486zoijcleaow;

    private static class iobyxmoadg extends FutureTask {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private kegysxyocb f20487zdlpuopuiu;

        iobyxmoadg(kegysxyocb kegysxyocbVar, Callable callable) {
            super(callable);
            this.f20487zdlpuopuiu = kegysxyocbVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f20487zdlpuopuiu.draadjrbmk((wypolnanlu) get());
                } catch (InterruptedException | ExecutionException e13) {
                    this.f20487zdlpuopuiu.draadjrbmk(new wypolnanlu(e13));
                }
            } finally {
                this.f20487zdlpuopuiu = null;
            }
        }
    }

    public kegysxyocb(Callable callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void draadjrbmk(wypolnanlu wypolnanluVar) {
        if (this.f20485wkgbmnqykc != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f20485wkgbmnqykc = wypolnanluVar;
        lqeggnwhkg();
    }

    private synchronized void dxjokdxxww(Object obj) {
        Iterator it = new ArrayList(this.f20483iobyxmoadg).iterator();
        while (it.hasNext()) {
            ((hkdspvbjdz) it.next()).iobyxmoadg(obj);
        }
    }

    private synchronized void gxszxtbevo(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f20486zoijcleaow);
        if (arrayList.isEmpty()) {
            v7.wkgbmnqykc.wkgbmnqykc("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hkdspvbjdz) it.next()).iobyxmoadg(th2);
        }
    }

    private void lqeggnwhkg() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            nufgyqmvbu();
        } else {
            this.f20484ppxfxbqfkf.post(new Runnable() { // from class: com.airbnb.lottie.stevsuqkhv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20504zdlpuopuiu.nufgyqmvbu();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nufgyqmvbu() {
        wypolnanlu wypolnanluVar = this.f20485wkgbmnqykc;
        if (wypolnanluVar == null) {
            return;
        }
        if (wypolnanluVar.zoijcleaow() != null) {
            dxjokdxxww(wypolnanluVar.zoijcleaow());
        } else {
            gxszxtbevo(wypolnanluVar.iobyxmoadg());
        }
    }

    public synchronized kegysxyocb btonecajqb(hkdspvbjdz hkdspvbjdzVar) {
        this.f20486zoijcleaow.remove(hkdspvbjdzVar);
        return this;
    }

    public wypolnanlu eablkybsjg() {
        return this.f20485wkgbmnqykc;
    }

    public synchronized kegysxyocb gtknphoqwx(hkdspvbjdz hkdspvbjdzVar) {
        this.f20483iobyxmoadg.remove(hkdspvbjdzVar);
        return this;
    }

    public synchronized kegysxyocb ppxfxbqfkf(hkdspvbjdz hkdspvbjdzVar) {
        try {
            wypolnanlu wypolnanluVar = this.f20485wkgbmnqykc;
            if (wypolnanluVar != null && wypolnanluVar.iobyxmoadg() != null) {
                hkdspvbjdzVar.iobyxmoadg(wypolnanluVar.iobyxmoadg());
            }
            this.f20486zoijcleaow.add(hkdspvbjdzVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized kegysxyocb wkgbmnqykc(hkdspvbjdz hkdspvbjdzVar) {
        try {
            wypolnanlu wypolnanluVar = this.f20485wkgbmnqykc;
            if (wypolnanluVar != null && wypolnanluVar.zoijcleaow() != null) {
                hkdspvbjdzVar.iobyxmoadg(wypolnanluVar.zoijcleaow());
            }
            this.f20483iobyxmoadg.add(hkdspvbjdzVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public kegysxyocb(Object obj) {
        this.f20483iobyxmoadg = new LinkedHashSet(1);
        this.f20486zoijcleaow = new LinkedHashSet(1);
        this.f20484ppxfxbqfkf = new Handler(Looper.getMainLooper());
        this.f20485wkgbmnqykc = null;
        draadjrbmk(new wypolnanlu(obj));
    }

    kegysxyocb(Callable callable, boolean z13) {
        this.f20483iobyxmoadg = new LinkedHashSet(1);
        this.f20486zoijcleaow = new LinkedHashSet(1);
        this.f20484ppxfxbqfkf = new Handler(Looper.getMainLooper());
        this.f20485wkgbmnqykc = null;
        if (z13) {
            try {
                draadjrbmk((wypolnanlu) callable.call());
                return;
            } catch (Throwable th2) {
                draadjrbmk(new wypolnanlu(th2));
                return;
            }
        }
        f20482eablkybsjg.execute(new iobyxmoadg(this, callable));
    }
}
