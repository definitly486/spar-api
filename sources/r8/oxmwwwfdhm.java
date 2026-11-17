package r8;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class oxmwwwfdhm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ppxfxbqfkf f82087eablkybsjg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final agtfadlqog f82088gxszxtbevo = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f82089iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f82090ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u1.eablkybsjg f82091wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f82092zoijcleaow;

    private static class iobyxmoadg implements agtfadlqog {
        iobyxmoadg() {
        }

        @Override // r8.agtfadlqog
        public boolean iobyxmoadg(Object obj) {
            return false;
        }

        @Override // r8.agtfadlqog
        public agtfadlqog.iobyxmoadg zoijcleaow(Object obj, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
            return null;
        }
    }

    static class ppxfxbqfkf {
        ppxfxbqfkf() {
        }

        public vdvldrhtss iobyxmoadg(List list, u1.eablkybsjg eablkybsjgVar) {
            return new vdvldrhtss(list, eablkybsjgVar);
        }
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f82093iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final ojitshcjhn f82094ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Class f82095zoijcleaow;

        public zoijcleaow(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
            this.f82093iobyxmoadg = cls;
            this.f82095zoijcleaow = cls2;
            this.f82094ppxfxbqfkf = ojitshcjhnVar;
        }

        public boolean iobyxmoadg(Class cls) {
            return this.f82093iobyxmoadg.isAssignableFrom(cls);
        }

        public boolean zoijcleaow(Class cls, Class cls2) {
            return iobyxmoadg(cls) && this.f82095zoijcleaow.isAssignableFrom(cls2);
        }
    }

    public oxmwwwfdhm(u1.eablkybsjg eablkybsjgVar) {
        this(eablkybsjgVar, f82087eablkybsjg);
    }

    private agtfadlqog eablkybsjg(zoijcleaow zoijcleaowVar) {
        return (agtfadlqog) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar.f82094ppxfxbqfkf.wkgbmnqykc(this));
    }

    private static agtfadlqog gxszxtbevo() {
        return f82088gxszxtbevo;
    }

    private void iobyxmoadg(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar, boolean z13) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(cls, cls2, ojitshcjhnVar);
        List list = this.f82089iobyxmoadg;
        list.add(z13 ? list.size() : 0, zoijcleaowVar);
    }

    private ojitshcjhn nufgyqmvbu(zoijcleaow zoijcleaowVar) {
        return zoijcleaowVar.f82094ppxfxbqfkf;
    }

    synchronized List btonecajqb(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f82089iobyxmoadg.iterator();
        while (it.hasNext()) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) it.next();
            if (zoijcleaowVar.zoijcleaow(cls, cls2)) {
                it.remove();
                arrayList.add(nufgyqmvbu(zoijcleaowVar));
            }
        }
        return arrayList;
    }

    synchronized void dxjokdxxww(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
        iobyxmoadg(cls, cls2, ojitshcjhnVar, false);
    }

    synchronized List gtknphoqwx(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
        List listBtonecajqb;
        listBtonecajqb = btonecajqb(cls, cls2);
        zoijcleaow(cls, cls2, ojitshcjhnVar);
        return listBtonecajqb;
    }

    synchronized List lqeggnwhkg(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (zoijcleaow zoijcleaowVar : this.f82089iobyxmoadg) {
            if (!arrayList.contains(zoijcleaowVar.f82095zoijcleaow) && zoijcleaowVar.iobyxmoadg(cls)) {
                arrayList.add(zoijcleaowVar.f82095zoijcleaow);
            }
        }
        return arrayList;
    }

    synchronized List ppxfxbqfkf(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (zoijcleaow zoijcleaowVar : this.f82089iobyxmoadg) {
                if (!this.f82090ppxfxbqfkf.contains(zoijcleaowVar) && zoijcleaowVar.iobyxmoadg(cls)) {
                    this.f82090ppxfxbqfkf.add(zoijcleaowVar);
                    arrayList.add(eablkybsjg(zoijcleaowVar));
                    this.f82090ppxfxbqfkf.remove(zoijcleaowVar);
                }
            }
        } catch (Throwable th2) {
            this.f82090ppxfxbqfkf.clear();
            throw th2;
        }
        return arrayList;
    }

    public synchronized agtfadlqog wkgbmnqykc(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z13 = false;
            for (zoijcleaow zoijcleaowVar : this.f82089iobyxmoadg) {
                if (this.f82090ppxfxbqfkf.contains(zoijcleaowVar)) {
                    z13 = true;
                } else if (zoijcleaowVar.zoijcleaow(cls, cls2)) {
                    this.f82090ppxfxbqfkf.add(zoijcleaowVar);
                    arrayList.add(eablkybsjg(zoijcleaowVar));
                    this.f82090ppxfxbqfkf.remove(zoijcleaowVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f82092zoijcleaow.iobyxmoadg(arrayList, this.f82091wkgbmnqykc);
            }
            if (arrayList.size() == 1) {
                return (agtfadlqog) arrayList.get(0);
            }
            if (!z13) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return gxszxtbevo();
        } catch (Throwable th2) {
            this.f82090ppxfxbqfkf.clear();
            throw th2;
        }
    }

    synchronized void zoijcleaow(Class cls, Class cls2, ojitshcjhn ojitshcjhnVar) {
        iobyxmoadg(cls, cls2, ojitshcjhnVar, true);
    }

    oxmwwwfdhm(u1.eablkybsjg eablkybsjgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        this.f82089iobyxmoadg = new ArrayList();
        this.f82090ppxfxbqfkf = new HashSet();
        this.f82091wkgbmnqykc = eablkybsjgVar;
        this.f82092zoijcleaow = ppxfxbqfkfVar;
    }
}
