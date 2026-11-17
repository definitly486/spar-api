package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import v1.sflfametgt;
import v1.ydmasvzmpa;
import v1.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f2944eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Interpolator f2947ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    ydmasvzmpa f2948wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f2949zoijcleaow = -1;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final sflfametgt f2945gxszxtbevo = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final ArrayList f2946iobyxmoadg = new ArrayList();

    class iobyxmoadg extends sflfametgt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f2950iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f2952zoijcleaow = 0;

        iobyxmoadg() {
        }

        @Override // v1.sflfametgt, v1.ydmasvzmpa
        public void ppxfxbqfkf(View view) {
            if (this.f2950iobyxmoadg) {
                return;
            }
            this.f2950iobyxmoadg = true;
            ydmasvzmpa ydmasvzmpaVar = nufgyqmvbu.this.f2948wkgbmnqykc;
            if (ydmasvzmpaVar != null) {
                ydmasvzmpaVar.ppxfxbqfkf(null);
            }
        }

        void wkgbmnqykc() {
            this.f2952zoijcleaow = 0;
            this.f2950iobyxmoadg = false;
            nufgyqmvbu.this.zoijcleaow();
        }

        @Override // v1.ydmasvzmpa
        public void zoijcleaow(View view) {
            int i13 = this.f2952zoijcleaow + 1;
            this.f2952zoijcleaow = i13;
            if (i13 == nufgyqmvbu.this.f2946iobyxmoadg.size()) {
                ydmasvzmpa ydmasvzmpaVar = nufgyqmvbu.this.f2948wkgbmnqykc;
                if (ydmasvzmpaVar != null) {
                    ydmasvzmpaVar.zoijcleaow(null);
                }
                wkgbmnqykc();
            }
        }
    }

    public nufgyqmvbu eablkybsjg(long j13) {
        if (!this.f2944eablkybsjg) {
            this.f2949zoijcleaow = j13;
        }
        return this;
    }

    public nufgyqmvbu gxszxtbevo(Interpolator interpolator) {
        if (!this.f2944eablkybsjg) {
            this.f2947ppxfxbqfkf = interpolator;
        }
        return this;
    }

    public void iobyxmoadg() {
        if (this.f2944eablkybsjg) {
            Iterator it = this.f2946iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((yfnezrywwk) it.next()).ppxfxbqfkf();
            }
            this.f2944eablkybsjg = false;
        }
    }

    public nufgyqmvbu lqeggnwhkg(ydmasvzmpa ydmasvzmpaVar) {
        if (!this.f2944eablkybsjg) {
            this.f2948wkgbmnqykc = ydmasvzmpaVar;
        }
        return this;
    }

    public void nufgyqmvbu() {
        if (this.f2944eablkybsjg) {
            return;
        }
        for (yfnezrywwk yfnezrywwkVar : this.f2946iobyxmoadg) {
            long j13 = this.f2949zoijcleaow;
            if (j13 >= 0) {
                yfnezrywwkVar.gxszxtbevo(j13);
            }
            Interpolator interpolator = this.f2947ppxfxbqfkf;
            if (interpolator != null) {
                yfnezrywwkVar.lqeggnwhkg(interpolator);
            }
            if (this.f2948wkgbmnqykc != null) {
                yfnezrywwkVar.nufgyqmvbu(this.f2945gxszxtbevo);
            }
            yfnezrywwkVar.draadjrbmk();
        }
        this.f2944eablkybsjg = true;
    }

    public nufgyqmvbu ppxfxbqfkf(yfnezrywwk yfnezrywwkVar) {
        if (!this.f2944eablkybsjg) {
            this.f2946iobyxmoadg.add(yfnezrywwkVar);
        }
        return this;
    }

    public nufgyqmvbu wkgbmnqykc(yfnezrywwk yfnezrywwkVar, yfnezrywwk yfnezrywwkVar2) {
        this.f2946iobyxmoadg.add(yfnezrywwkVar);
        yfnezrywwkVar2.btonecajqb(yfnezrywwkVar.wkgbmnqykc());
        this.f2946iobyxmoadg.add(yfnezrywwkVar2);
        return this;
    }

    void zoijcleaow() {
        this.f2944eablkybsjg = false;
    }
}
