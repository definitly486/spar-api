package k7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk implements wflxmlrfwp, btonecajqb {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final q7.btonecajqb f53968gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f53971wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Path f53969iobyxmoadg = new Path();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path f53972zoijcleaow = new Path();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Path f53970ppxfxbqfkf = new Path();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f53967eablkybsjg = new ArrayList();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f53973iobyxmoadg;

        static {
            int[] iArr = new int[q7.btonecajqb.iobyxmoadg.values().length];
            f53973iobyxmoadg = iArr;
            try {
                iArr[q7.btonecajqb.iobyxmoadg.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53973iobyxmoadg[q7.btonecajqb.iobyxmoadg.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53973iobyxmoadg[q7.btonecajqb.iobyxmoadg.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53973iobyxmoadg[q7.btonecajqb.iobyxmoadg.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53973iobyxmoadg[q7.btonecajqb.iobyxmoadg.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public draadjrbmk(q7.btonecajqb btonecajqbVar) {
        this.f53971wkgbmnqykc = btonecajqbVar.ppxfxbqfkf();
        this.f53968gxszxtbevo = btonecajqbVar;
    }

    private void iobyxmoadg() {
        for (int i13 = 0; i13 < this.f53967eablkybsjg.size(); i13++) {
            this.f53970ppxfxbqfkf.addPath(((wflxmlrfwp) this.f53967eablkybsjg.get(i13)).gxszxtbevo());
        }
    }

    private void ppxfxbqfkf(Path.Op op2) {
        this.f53972zoijcleaow.reset();
        this.f53969iobyxmoadg.reset();
        for (int size = this.f53967eablkybsjg.size() - 1; size >= 1; size--) {
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) this.f53967eablkybsjg.get(size);
            if (wflxmlrfwpVar instanceof wkgbmnqykc) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) wflxmlrfwpVar;
                List listDraadjrbmk = wkgbmnqykcVar.draadjrbmk();
                for (int size2 = listDraadjrbmk.size() - 1; size2 >= 0; size2--) {
                    Path pathGxszxtbevo = ((wflxmlrfwp) listDraadjrbmk.get(size2)).gxszxtbevo();
                    pathGxszxtbevo.transform(wkgbmnqykcVar.wflxmlrfwp());
                    this.f53972zoijcleaow.addPath(pathGxszxtbevo);
                }
            } else {
                this.f53972zoijcleaow.addPath(wflxmlrfwpVar.gxszxtbevo());
            }
        }
        wflxmlrfwp wflxmlrfwpVar2 = (wflxmlrfwp) this.f53967eablkybsjg.get(0);
        if (wflxmlrfwpVar2 instanceof wkgbmnqykc) {
            wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) wflxmlrfwpVar2;
            List listDraadjrbmk2 = wkgbmnqykcVar2.draadjrbmk();
            for (int i13 = 0; i13 < listDraadjrbmk2.size(); i13++) {
                Path pathGxszxtbevo2 = ((wflxmlrfwp) listDraadjrbmk2.get(i13)).gxszxtbevo();
                pathGxszxtbevo2.transform(wkgbmnqykcVar2.wflxmlrfwp());
                this.f53969iobyxmoadg.addPath(pathGxszxtbevo2);
            }
        } else {
            this.f53969iobyxmoadg.set(wflxmlrfwpVar2.gxszxtbevo());
        }
        this.f53970ppxfxbqfkf.op(this.f53969iobyxmoadg, this.f53972zoijcleaow, op2);
    }

    @Override // k7.wflxmlrfwp
    public Path gxszxtbevo() {
        this.f53970ppxfxbqfkf.reset();
        if (this.f53968gxszxtbevo.wkgbmnqykc()) {
            return this.f53970ppxfxbqfkf;
        }
        int i13 = iobyxmoadg.f53973iobyxmoadg[this.f53968gxszxtbevo.zoijcleaow().ordinal()];
        if (i13 == 1) {
            iobyxmoadg();
        } else if (i13 == 2) {
            ppxfxbqfkf(Path.Op.UNION);
        } else if (i13 == 3) {
            ppxfxbqfkf(Path.Op.REVERSE_DIFFERENCE);
        } else if (i13 == 4) {
            ppxfxbqfkf(Path.Op.INTERSECT);
        } else if (i13 == 5) {
            ppxfxbqfkf(Path.Op.XOR);
        }
        return this.f53970ppxfxbqfkf;
    }

    @Override // k7.btonecajqb
    public void lqeggnwhkg(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) listIterator.previous();
            if (ppxfxbqfkfVar instanceof wflxmlrfwp) {
                this.f53967eablkybsjg.add((wflxmlrfwp) ppxfxbqfkfVar);
                listIterator.remove();
            }
        }
    }

    @Override // k7.ppxfxbqfkf
    public void zoijcleaow(List list, List list2) {
        for (int i13 = 0; i13 < this.f53967eablkybsjg.size(); i13++) {
            ((wflxmlrfwp) this.f53967eablkybsjg.get(i13)).zoijcleaow(list, list2);
        }
    }
}
