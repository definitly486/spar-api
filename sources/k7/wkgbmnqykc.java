package k7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.hcddaimhww;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc implements eablkybsjg, wflxmlrfwp, l7.iobyxmoadg.zoijcleaow, o7.gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private List f54078btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final hcddaimhww f54079dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final RectF f54080eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private l7.rgvfuqvkyq f54081gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f54082gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Paint f54083iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f54084lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final List f54085nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Matrix f54086ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Path f54087wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final RectF f54088zoijcleaow;

    public wkgbmnqykc(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, q7.vdvldrhtss vdvldrhtssVar, com.airbnb.lottie.btonecajqb btonecajqbVar) {
        this(hcddaimhwwVar, zoijcleaowVar, vdvldrhtssVar.ppxfxbqfkf(), vdvldrhtssVar.wkgbmnqykc(), lqeggnwhkg(hcddaimhwwVar, btonecajqbVar, zoijcleaowVar, vdvldrhtssVar.zoijcleaow()), btonecajqb(vdvldrhtssVar.zoijcleaow()));
    }

    private boolean agtfadlqog() {
        int i13 = 0;
        for (int i14 = 0; i14 < this.f54085nufgyqmvbu.size(); i14++) {
            if ((this.f54085nufgyqmvbu.get(i14) instanceof eablkybsjg) && (i13 = i13 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    static p7.draadjrbmk btonecajqb(List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            q7.ppxfxbqfkf ppxfxbqfkfVar = (q7.ppxfxbqfkf) list.get(i13);
            if (ppxfxbqfkfVar instanceof p7.draadjrbmk) {
                return (p7.draadjrbmk) ppxfxbqfkfVar;
            }
        }
        return null;
    }

    private static List lqeggnwhkg(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((q7.ppxfxbqfkf) list.get(i13)).iobyxmoadg(hcddaimhwwVar, btonecajqbVar, zoijcleaowVar);
            if (ppxfxbqfkfVarIobyxmoadg != null) {
                arrayList.add(ppxfxbqfkfVarIobyxmoadg);
            }
        }
        return arrayList;
    }

    List draadjrbmk() {
        if (this.f54078btonecajqb == null) {
            this.f54078btonecajqb = new ArrayList();
            for (int i13 = 0; i13 < this.f54085nufgyqmvbu.size(); i13++) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f54085nufgyqmvbu.get(i13);
                if (ppxfxbqfkfVar instanceof wflxmlrfwp) {
                    this.f54078btonecajqb.add((wflxmlrfwp) ppxfxbqfkfVar);
                }
            }
        }
        return this.f54078btonecajqb;
    }

    @Override // k7.eablkybsjg
    public void dxjokdxxww(Canvas canvas, Matrix matrix, int i13) {
        if (this.f54084lqeggnwhkg) {
            return;
        }
        this.f54086ppxfxbqfkf.set(matrix);
        l7.rgvfuqvkyq rgvfuqvkyqVar = this.f54081gtknphoqwx;
        if (rgvfuqvkyqVar != null) {
            this.f54086ppxfxbqfkf.preConcat(rgvfuqvkyqVar.gxszxtbevo());
            i13 = (int) (((((this.f54081gtknphoqwx.nufgyqmvbu() == null ? 100 : ((Integer) this.f54081gtknphoqwx.nufgyqmvbu().nufgyqmvbu()).intValue()) / 100.0f) * i13) / 255.0f) * 255.0f);
        }
        boolean z13 = this.f54079dxjokdxxww.xrmfcynszj() && agtfadlqog() && i13 != 255;
        if (z13) {
            this.f54088zoijcleaow.set(0.0f, 0.0f, 0.0f, 0.0f);
            eablkybsjg(this.f54088zoijcleaow, this.f54086ppxfxbqfkf, true);
            this.f54083iobyxmoadg.setAlpha(i13);
            v7.btonecajqb.wflxmlrfwp(canvas, this.f54088zoijcleaow, this.f54083iobyxmoadg);
        }
        if (z13) {
            i13 = 255;
        }
        for (int size = this.f54085nufgyqmvbu.size() - 1; size >= 0; size--) {
            Object obj = this.f54085nufgyqmvbu.get(size);
            if (obj instanceof eablkybsjg) {
                ((eablkybsjg) obj).dxjokdxxww(canvas, this.f54086ppxfxbqfkf, i13);
            }
        }
        if (z13) {
            canvas.restore();
        }
    }

    @Override // k7.eablkybsjg
    public void eablkybsjg(RectF rectF, Matrix matrix, boolean z13) {
        this.f54086ppxfxbqfkf.set(matrix);
        l7.rgvfuqvkyq rgvfuqvkyqVar = this.f54081gtknphoqwx;
        if (rgvfuqvkyqVar != null) {
            this.f54086ppxfxbqfkf.preConcat(rgvfuqvkyqVar.gxszxtbevo());
        }
        this.f54080eablkybsjg.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f54085nufgyqmvbu.size() - 1; size >= 0; size--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f54085nufgyqmvbu.get(size);
            if (ppxfxbqfkfVar instanceof eablkybsjg) {
                ((eablkybsjg) ppxfxbqfkfVar).eablkybsjg(this.f54080eablkybsjg, this.f54086ppxfxbqfkf, z13);
                rectF.union(this.f54080eablkybsjg);
            }
        }
    }

    @Override // k7.ppxfxbqfkf
    public String getName() {
        return this.f54082gxszxtbevo;
    }

    public List gtknphoqwx() {
        return this.f54085nufgyqmvbu;
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        this.f54086ppxfxbqfkf.reset();
        l7.rgvfuqvkyq rgvfuqvkyqVar = this.f54081gtknphoqwx;
        if (rgvfuqvkyqVar != null) {
            this.f54086ppxfxbqfkf.set(rgvfuqvkyqVar.gxszxtbevo());
        }
        this.f54087wkgbmnqykc.reset();
        if (this.f54084lqeggnwhkg) {
            return this.f54087wkgbmnqykc;
        }
        for (int size = this.f54085nufgyqmvbu.size() - 1; size >= 0; size--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f54085nufgyqmvbu.get(size);
            if (ppxfxbqfkfVar instanceof wflxmlrfwp) {
                this.f54087wkgbmnqykc.addPath(((wflxmlrfwp) ppxfxbqfkfVar).gxszxtbevo(), this.f54086ppxfxbqfkf);
            }
        }
        return this.f54087wkgbmnqykc;
    }

    @Override // l7.iobyxmoadg.zoijcleaow
    public void iobyxmoadg() {
        this.f54079dxjokdxxww.invalidateSelf();
    }

    @Override // o7.gxszxtbevo
    public void nufgyqmvbu(Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        l7.rgvfuqvkyq rgvfuqvkyqVar = this.f54081gtknphoqwx;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.ppxfxbqfkf(obj, ppxfxbqfkfVar);
        }
    }

    @Override // o7.gxszxtbevo
    public void ppxfxbqfkf(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2) {
        if (eablkybsjgVar.lqeggnwhkg(getName(), i13) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eablkybsjgVar2 = eablkybsjgVar2.iobyxmoadg(getName());
                if (eablkybsjgVar.ppxfxbqfkf(getName(), i13)) {
                    list.add(eablkybsjgVar2.dxjokdxxww(this));
                }
            }
            if (eablkybsjgVar.nufgyqmvbu(getName(), i13)) {
                int iEablkybsjg = i13 + eablkybsjgVar.eablkybsjg(getName(), i13);
                for (int i14 = 0; i14 < this.f54085nufgyqmvbu.size(); i14++) {
                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f54085nufgyqmvbu.get(i14);
                    if (ppxfxbqfkfVar instanceof o7.gxszxtbevo) {
                        ((o7.gxszxtbevo) ppxfxbqfkfVar).ppxfxbqfkf(eablkybsjgVar, iEablkybsjg, list, eablkybsjgVar2);
                    }
                }
            }
        }
    }

    Matrix wflxmlrfwp() {
        l7.rgvfuqvkyq rgvfuqvkyqVar = this.f54081gtknphoqwx;
        if (rgvfuqvkyqVar != null) {
            return rgvfuqvkyqVar.gxszxtbevo();
        }
        this.f54086ppxfxbqfkf.reset();
        return this.f54086ppxfxbqfkf;
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f54085nufgyqmvbu.size());
        arrayList.addAll(list);
        for (int size = this.f54085nufgyqmvbu.size() - 1; size >= 0; size--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f54085nufgyqmvbu.get(size);
            ppxfxbqfkfVar.zoijcleaow(arrayList, this.f54085nufgyqmvbu.subList(0, size));
            arrayList.add(ppxfxbqfkfVar);
        }
    }

    wkgbmnqykc(hcddaimhww hcddaimhwwVar, r7.zoijcleaow zoijcleaowVar, String str, boolean z13, List list, p7.draadjrbmk draadjrbmkVar) {
        this.f54083iobyxmoadg = new j7.iobyxmoadg();
        this.f54088zoijcleaow = new RectF();
        this.f54086ppxfxbqfkf = new Matrix();
        this.f54087wkgbmnqykc = new Path();
        this.f54080eablkybsjg = new RectF();
        this.f54082gxszxtbevo = str;
        this.f54079dxjokdxxww = hcddaimhwwVar;
        this.f54084lqeggnwhkg = z13;
        this.f54085nufgyqmvbu = list;
        if (draadjrbmkVar != null) {
            l7.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = draadjrbmkVar.zoijcleaow();
            this.f54081gtknphoqwx = rgvfuqvkyqVarZoijcleaow;
            rgvfuqvkyqVarZoijcleaow.iobyxmoadg(zoijcleaowVar);
            this.f54081gtknphoqwx.zoijcleaow(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) list.get(size);
            if (ppxfxbqfkfVar instanceof btonecajqb) {
                arrayList.add((btonecajqb) ppxfxbqfkfVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((btonecajqb) arrayList.get(size2)).lqeggnwhkg(list.listIterator(list.size()));
        }
    }
}
