package tzroggbefp;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.istkbnxepw;
import androidx.lifecycle.rgvfuqvkyq;
import androidx.lifecycle.vdvldrhtss;
import istkbnxepw.rlfsiqarku;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lereixgezr.uawqvzlxes;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    pmvmpeiblj.iobyxmoadg f112377eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f112378iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f112381zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f112379ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ArrayDeque f112380wkgbmnqykc = new ArrayDeque();

    static abstract class iobyxmoadg {
        iobyxmoadg() {
        }

        static iobyxmoadg iobyxmoadg(vdvldrhtss vdvldrhtssVar, CameraUseCaseAdapter.iobyxmoadg iobyxmoadgVar) {
            return new tzroggbefp.iobyxmoadg(vdvldrhtssVar, iobyxmoadgVar);
        }

        public abstract vdvldrhtss ppxfxbqfkf();

        public abstract CameraUseCaseAdapter.iobyxmoadg zoijcleaow();
    }

    private static class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final vdvldrhtss f112382yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ppxfxbqfkf f112383zdlpuopuiu;

        zoijcleaow(vdvldrhtss vdvldrhtssVar, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f112382yggfygwlhe = vdvldrhtssVar;
            this.f112383zdlpuopuiu = ppxfxbqfkfVar;
        }

        vdvldrhtss iobyxmoadg() {
            return this.f112382yggfygwlhe;
        }

        @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_DESTROY)
        public void onDestroy(vdvldrhtss vdvldrhtssVar) {
            this.f112383zdlpuopuiu.draadjrbmk(vdvldrhtssVar);
        }

        @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_START)
        public void onStart(vdvldrhtss vdvldrhtssVar) {
            this.f112383zdlpuopuiu.nufgyqmvbu(vdvldrhtssVar);
        }

        @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_STOP)
        public void onStop(vdvldrhtss vdvldrhtssVar) {
            this.f112383zdlpuopuiu.dxjokdxxww(vdvldrhtssVar);
        }
    }

    ppxfxbqfkf() {
    }

    private void btonecajqb(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(vdvldrhtssVar);
                if (zoijcleaowVarWkgbmnqykc == null) {
                    return;
                }
                Iterator it = ((Set) this.f112379ppxfxbqfkf.get(zoijcleaowVarWkgbmnqykc)).iterator();
                while (it.hasNext()) {
                    ((tzroggbefp.zoijcleaow) nufgyqmvbu.gxszxtbevo((tzroggbefp.zoijcleaow) this.f112381zoijcleaow.get((iobyxmoadg) it.next()))).iwizpuwonk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean gxszxtbevo(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(vdvldrhtssVar);
                if (zoijcleaowVarWkgbmnqykc == null) {
                    return false;
                }
                Iterator it = ((Set) this.f112379ppxfxbqfkf.get(zoijcleaowVarWkgbmnqykc)).iterator();
                while (it.hasNext()) {
                    if (!((tzroggbefp.zoijcleaow) nufgyqmvbu.gxszxtbevo((tzroggbefp.zoijcleaow) this.f112381zoijcleaow.get((iobyxmoadg) it.next()))).yggfygwlhe().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void lqeggnwhkg(tzroggbefp.zoijcleaow zoijcleaowVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                vdvldrhtss vdvldrhtssVarKcexrzcfyt = zoijcleaowVar.kcexrzcfyt();
                iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(vdvldrhtssVarKcexrzcfyt, CameraUseCaseAdapter.zynmafqrjb((rlfsiqarku) zoijcleaowVar.zoijcleaow(), (rlfsiqarku) zoijcleaowVar.zdlpuopuiu()));
                zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(vdvldrhtssVarKcexrzcfyt);
                Set hashSet = zoijcleaowVarWkgbmnqykc != null ? (Set) this.f112379ppxfxbqfkf.get(zoijcleaowVarWkgbmnqykc) : new HashSet();
                hashSet.add(iobyxmoadgVarIobyxmoadg);
                this.f112381zoijcleaow.put(iobyxmoadgVarIobyxmoadg, zoijcleaowVar);
                if (zoijcleaowVarWkgbmnqykc == null) {
                    zoijcleaow zoijcleaowVar2 = new zoijcleaow(vdvldrhtssVarKcexrzcfyt, this);
                    this.f112379ppxfxbqfkf.put(zoijcleaowVar2, hashSet);
                    vdvldrhtssVarKcexrzcfyt.getLifecycle().iobyxmoadg(zoijcleaowVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void wflxmlrfwp(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                Iterator it = ((Set) this.f112379ppxfxbqfkf.get(wkgbmnqykc(vdvldrhtssVar))).iterator();
                while (it.hasNext()) {
                    tzroggbefp.zoijcleaow zoijcleaowVar = (tzroggbefp.zoijcleaow) this.f112381zoijcleaow.get((iobyxmoadg) it.next());
                    if (!((tzroggbefp.zoijcleaow) nufgyqmvbu.gxszxtbevo(zoijcleaowVar)).yggfygwlhe().isEmpty()) {
                        zoijcleaowVar.esjtqupxsv();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private zoijcleaow wkgbmnqykc(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                for (zoijcleaow zoijcleaowVar : this.f112379ppxfxbqfkf.keySet()) {
                    if (vdvldrhtssVar.equals(zoijcleaowVar.iobyxmoadg())) {
                        return zoijcleaowVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(vdvldrhtssVar);
                if (zoijcleaowVarWkgbmnqykc == null) {
                    return;
                }
                dxjokdxxww(vdvldrhtssVar);
                Iterator it = ((Set) this.f112379ppxfxbqfkf.get(zoijcleaowVarWkgbmnqykc)).iterator();
                while (it.hasNext()) {
                    this.f112381zoijcleaow.remove((iobyxmoadg) it.next());
                }
                this.f112379ppxfxbqfkf.remove(zoijcleaowVarWkgbmnqykc);
                zoijcleaowVarWkgbmnqykc.iobyxmoadg().getLifecycle().wkgbmnqykc(zoijcleaowVarWkgbmnqykc);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void dxjokdxxww(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                this.f112380wkgbmnqykc.remove(vdvldrhtssVar);
                btonecajqb(vdvldrhtssVar);
                if (!this.f112380wkgbmnqykc.isEmpty()) {
                    wflxmlrfwp((vdvldrhtss) this.f112380wkgbmnqykc.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Collection eablkybsjg() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f112378iobyxmoadg) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f112381zoijcleaow.values());
        }
        return collectionUnmodifiableCollection;
    }

    void gtknphoqwx() {
        synchronized (this.f112378iobyxmoadg) {
            try {
                Iterator it = this.f112381zoijcleaow.keySet().iterator();
                while (it.hasNext()) {
                    tzroggbefp.zoijcleaow zoijcleaowVar = (tzroggbefp.zoijcleaow) this.f112381zoijcleaow.get((iobyxmoadg) it.next());
                    zoijcleaowVar.cqumvgiudr();
                    dxjokdxxww(zoijcleaowVar.kcexrzcfyt());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void iobyxmoadg(tzroggbefp.zoijcleaow zoijcleaowVar, uawqvzlxes uawqvzlxesVar, List list, Collection collection, pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                nufgyqmvbu.iobyxmoadg(!collection.isEmpty());
                this.f112377eablkybsjg = iobyxmoadgVar;
                vdvldrhtss vdvldrhtssVarKcexrzcfyt = zoijcleaowVar.kcexrzcfyt();
                zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc(vdvldrhtssVarKcexrzcfyt);
                if (zoijcleaowVarWkgbmnqykc == null) {
                    return;
                }
                Set set = (Set) this.f112379ppxfxbqfkf.get(zoijcleaowVarWkgbmnqykc);
                pmvmpeiblj.iobyxmoadg iobyxmoadgVar2 = this.f112377eablkybsjg;
                if (iobyxmoadgVar2 == null || iobyxmoadgVar2.ppxfxbqfkf() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        tzroggbefp.zoijcleaow zoijcleaowVar2 = (tzroggbefp.zoijcleaow) nufgyqmvbu.gxszxtbevo((tzroggbefp.zoijcleaow) this.f112381zoijcleaow.get((iobyxmoadg) it.next()));
                        if (!zoijcleaowVar2.equals(zoijcleaowVar) && !zoijcleaowVar2.yggfygwlhe().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    zoijcleaowVar.wkgbmnqykc().okpsazkaxt(uawqvzlxesVar);
                    zoijcleaowVar.wkgbmnqykc().jhduphickx(list);
                    zoijcleaowVar.ppxfxbqfkf(collection);
                    if (vdvldrhtssVarKcexrzcfyt.getLifecycle().zoijcleaow().wkgbmnqykc(gtknphoqwx.zoijcleaow.STARTED)) {
                        nufgyqmvbu(vdvldrhtssVarKcexrzcfyt);
                    }
                } catch (CameraUseCaseAdapter.CameraException e13) {
                    throw new IllegalArgumentException(e13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void nufgyqmvbu(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                if (gxszxtbevo(vdvldrhtssVar)) {
                    if (this.f112380wkgbmnqykc.isEmpty()) {
                        this.f112380wkgbmnqykc.push(vdvldrhtssVar);
                    } else {
                        pmvmpeiblj.iobyxmoadg iobyxmoadgVar = this.f112377eablkybsjg;
                        if (iobyxmoadgVar == null || iobyxmoadgVar.ppxfxbqfkf() != 2) {
                            vdvldrhtss vdvldrhtssVar2 = (vdvldrhtss) this.f112380wkgbmnqykc.peek();
                            if (!vdvldrhtssVar.equals(vdvldrhtssVar2)) {
                                btonecajqb(vdvldrhtssVar2);
                                this.f112380wkgbmnqykc.remove(vdvldrhtssVar);
                                this.f112380wkgbmnqykc.push(vdvldrhtssVar);
                            }
                        }
                    }
                    wflxmlrfwp(vdvldrhtssVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    tzroggbefp.zoijcleaow ppxfxbqfkf(vdvldrhtss vdvldrhtssVar, CameraUseCaseAdapter.iobyxmoadg iobyxmoadgVar) {
        tzroggbefp.zoijcleaow zoijcleaowVar;
        synchronized (this.f112378iobyxmoadg) {
            zoijcleaowVar = (tzroggbefp.zoijcleaow) this.f112381zoijcleaow.get(iobyxmoadg.iobyxmoadg(vdvldrhtssVar, iobyxmoadgVar));
        }
        return zoijcleaowVar;
    }

    tzroggbefp.zoijcleaow zoijcleaow(vdvldrhtss vdvldrhtssVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.f112378iobyxmoadg) {
            try {
                nufgyqmvbu.zoijcleaow(this.f112381zoijcleaow.get(iobyxmoadg.iobyxmoadg(vdvldrhtssVar, cameraUseCaseAdapter.cdpycssgdh())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                tzroggbefp.zoijcleaow zoijcleaowVar = new tzroggbefp.zoijcleaow(vdvldrhtssVar, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.pkzmftpjix().isEmpty()) {
                    zoijcleaowVar.iwizpuwonk();
                }
                if (vdvldrhtssVar.getLifecycle().zoijcleaow() == gtknphoqwx.zoijcleaow.DESTROYED) {
                    return zoijcleaowVar;
                }
                lqeggnwhkg(zoijcleaowVar);
                return zoijcleaowVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
