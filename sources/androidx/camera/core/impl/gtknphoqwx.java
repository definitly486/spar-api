package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ boolean f3783iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f3784zoijcleaow;

        iobyxmoadg(boolean z13, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.f3783iobyxmoadg = z13;
            this.f3784zoijcleaow = iobyxmoadgVar;
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List list) {
            u1.nufgyqmvbu.gxszxtbevo(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f3783iobyxmoadg) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f3784zoijcleaow.ppxfxbqfkf(arrayList);
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            if (th2 instanceof TimeoutException) {
                this.f3784zoijcleaow.gxszxtbevo(th2);
            } else {
                this.f3784zoijcleaow.ppxfxbqfkf(Collections.emptyList());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object gxszxtbevo(final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, Executor executor, boolean z13, Collection collection, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iobyxmoadg(new Runnable() { // from class: istkbnxepw.ylkuphrtab
            @Override // java.lang.Runnable
            public final void run() {
                wkgbmnqykcVar.cancel(true);
            }
        }, executor);
        iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVar, new iobyxmoadg(z13, iobyxmoadgVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static com.google.common.util.concurrent.wkgbmnqykc lqeggnwhkg(final Collection collection, final boolean z13, long j13, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(iozdgvuglv.gtknphoqwx.zdlpuopuiu(((DeferrableSurface) it.next()).btonecajqb()));
        }
        final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarKcexrzcfyt = iozdgvuglv.gtknphoqwx.kcexrzcfyt(j13, scheduledExecutorService, iozdgvuglv.gtknphoqwx.cqumvgiudr(arrayList));
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: istkbnxepw.wwaezpbzkn
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return androidx.camera.core.impl.gtknphoqwx.gxszxtbevo(wkgbmnqykcVarKcexrzcfyt, executor, z13, collection, iobyxmoadgVar);
            }
        });
    }

    public static void ppxfxbqfkf(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((DeferrableSurface) it.next()).eablkybsjg();
        }
    }

    public static void wkgbmnqykc(List list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i13 = 0;
        do {
            try {
                ((DeferrableSurface) list.get(i13)).draadjrbmk();
                i13++;
            } catch (DeferrableSurface.SurfaceClosedException e13) {
                for (int i14 = i13 - 1; i14 >= 0; i14--) {
                    ((DeferrableSurface) list.get(i14)).eablkybsjg();
                }
                throw e13;
            }
        } while (i13 < list.size());
    }
}
