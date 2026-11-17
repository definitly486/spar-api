package kcexrzcfyt;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Executor f55110iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Object f55113zoijcleaow = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Set f55111ppxfxbqfkf = new LinkedHashSet();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Set f55112wkgbmnqykc = new LinkedHashSet();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final Set f55108eablkybsjg = new LinkedHashSet();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CameraDevice.StateCallback f55109gxszxtbevo = new iobyxmoadg();

    class iobyxmoadg extends CameraDevice.StateCallback {
        iobyxmoadg() {
        }

        private void eablkybsjg() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (zeieaojujs.this.f55113zoijcleaow) {
                linkedHashSet.addAll(zeieaojujs.this.f55108eablkybsjg);
                linkedHashSet.addAll(zeieaojujs.this.f55111ppxfxbqfkf);
            }
            zeieaojujs.this.f55110iobyxmoadg.execute(new Runnable() { // from class: kcexrzcfyt.weqkydbzbr
                @Override // java.lang.Runnable
                public final void run() {
                    zeieaojujs.zoijcleaow(linkedHashSet);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void gxszxtbevo(LinkedHashSet linkedHashSet, int i13) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((e) it.next()).gxszxtbevo(i13);
            }
        }

        private void ppxfxbqfkf() {
            List listGxszxtbevo;
            synchronized (zeieaojujs.this.f55113zoijcleaow) {
                listGxszxtbevo = zeieaojujs.this.gxszxtbevo();
                zeieaojujs.this.f55108eablkybsjg.clear();
                zeieaojujs.this.f55111ppxfxbqfkf.clear();
                zeieaojujs.this.f55112wkgbmnqykc.clear();
            }
            Iterator it = listGxszxtbevo.iterator();
            while (it.hasNext()) {
                ((e) it.next()).eablkybsjg();
            }
        }

        private void wkgbmnqykc(final int i13) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (zeieaojujs.this.f55113zoijcleaow) {
                linkedHashSet.addAll(zeieaojujs.this.f55108eablkybsjg);
                linkedHashSet.addAll(zeieaojujs.this.f55111ppxfxbqfkf);
            }
            zeieaojujs.this.f55110iobyxmoadg.execute(new Runnable() { // from class: kcexrzcfyt.lrnfpwlwnk
                @Override // java.lang.Runnable
                public final void run() {
                    zeieaojujs.iobyxmoadg.gxszxtbevo(linkedHashSet, i13);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            eablkybsjg();
            ppxfxbqfkf();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            eablkybsjg();
            ppxfxbqfkf();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i13) {
            eablkybsjg();
            wkgbmnqykc(i13);
            ppxfxbqfkf();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    zeieaojujs(Executor executor) {
        this.f55110iobyxmoadg = executor;
    }

    private void iobyxmoadg(e eVar) {
        e eVar2;
        Iterator it = gxszxtbevo().iterator();
        while (it.hasNext() && (eVar2 = (e) it.next()) != eVar) {
            eVar2.eablkybsjg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zoijcleaow(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.wkgbmnqykc().rgvfuqvkyq(eVar);
        }
    }

    void btonecajqb(e eVar) {
        synchronized (this.f55113zoijcleaow) {
            this.f55111ppxfxbqfkf.add(eVar);
            this.f55108eablkybsjg.remove(eVar);
        }
        iobyxmoadg(eVar);
    }

    void dxjokdxxww(e eVar) {
        iobyxmoadg(eVar);
        synchronized (this.f55113zoijcleaow) {
            this.f55108eablkybsjg.remove(eVar);
        }
    }

    List eablkybsjg() {
        ArrayList arrayList;
        synchronized (this.f55113zoijcleaow) {
            arrayList = new ArrayList(this.f55108eablkybsjg);
        }
        return arrayList;
    }

    void gtknphoqwx(e eVar) {
        synchronized (this.f55113zoijcleaow) {
            this.f55108eablkybsjg.add(eVar);
        }
    }

    List gxszxtbevo() {
        ArrayList arrayList;
        synchronized (this.f55113zoijcleaow) {
            arrayList = new ArrayList();
            arrayList.addAll(wkgbmnqykc());
            arrayList.addAll(eablkybsjg());
        }
        return arrayList;
    }

    void lqeggnwhkg(e eVar) {
        synchronized (this.f55113zoijcleaow) {
            this.f55111ppxfxbqfkf.remove(eVar);
            this.f55112wkgbmnqykc.remove(eVar);
        }
    }

    void nufgyqmvbu(e eVar) {
        synchronized (this.f55113zoijcleaow) {
            this.f55112wkgbmnqykc.add(eVar);
        }
    }

    CameraDevice.StateCallback ppxfxbqfkf() {
        return this.f55109gxszxtbevo;
    }

    List wkgbmnqykc() {
        ArrayList arrayList;
        synchronized (this.f55113zoijcleaow) {
            arrayList = new ArrayList(this.f55111ppxfxbqfkf);
        }
        return arrayList;
    }
}
