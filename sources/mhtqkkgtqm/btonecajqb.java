package mhtqkkgtqm;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb extends iobyxmoadg implements ListIterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private wflxmlrfwp f67205cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f67206esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f67207iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final nufgyqmvbu f67208jyumaefscl;

    public btonecajqb(nufgyqmvbu nufgyqmvbuVar, int i13) {
        super(i13, nufgyqmvbuVar.size());
        this.f67208jyumaefscl = nufgyqmvbuVar;
        this.f67207iwizpuwonk = nufgyqmvbuVar.agtfadlqog();
        this.f67206esjtqupxsv = -1;
        draadjrbmk();
    }

    private final void btonecajqb() {
        if (this.f67206esjtqupxsv == -1) {
            throw new IllegalStateException();
        }
    }

    private final void draadjrbmk() {
        Object[] objArrOjitshcjhn = this.f67208jyumaefscl.ojitshcjhn();
        if (objArrOjitshcjhn == null) {
            this.f67205cqumvgiudr = null;
            return;
        }
        int iWkgbmnqykc = agtfadlqog.wkgbmnqykc(this.f67208jyumaefscl.size());
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb(ppxfxbqfkf(), iWkgbmnqykc);
        int iRgvfuqvkyq = (this.f67208jyumaefscl.rgvfuqvkyq() / 5) + 1;
        wflxmlrfwp wflxmlrfwpVar = this.f67205cqumvgiudr;
        if (wflxmlrfwpVar == null) {
            this.f67205cqumvgiudr = new wflxmlrfwp(objArrOjitshcjhn, iBtonecajqb, iWkgbmnqykc, iRgvfuqvkyq);
        } else {
            zdlpuopuiu.lqeggnwhkg(wflxmlrfwpVar);
            wflxmlrfwpVar.draadjrbmk(objArrOjitshcjhn, iBtonecajqb, iWkgbmnqykc, iRgvfuqvkyq);
        }
    }

    private final void dxjokdxxww() {
        if (this.f67207iwizpuwonk != this.f67208jyumaefscl.agtfadlqog()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void gtknphoqwx() {
        gxszxtbevo(this.f67208jyumaefscl.size());
        this.f67207iwizpuwonk = this.f67208jyumaefscl.agtfadlqog();
        this.f67206esjtqupxsv = -1;
        draadjrbmk();
    }

    @Override // mhtqkkgtqm.iobyxmoadg, java.util.ListIterator
    public void add(Object obj) {
        dxjokdxxww();
        this.f67208jyumaefscl.add(ppxfxbqfkf(), obj);
        eablkybsjg(ppxfxbqfkf() + 1);
        gtknphoqwx();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        dxjokdxxww();
        iobyxmoadg();
        this.f67206esjtqupxsv = ppxfxbqfkf();
        wflxmlrfwp wflxmlrfwpVar = this.f67205cqumvgiudr;
        if (wflxmlrfwpVar == null) {
            Object[] objArrVdvldrhtss = this.f67208jyumaefscl.vdvldrhtss();
            int iPpxfxbqfkf = ppxfxbqfkf();
            eablkybsjg(iPpxfxbqfkf + 1);
            return objArrVdvldrhtss[iPpxfxbqfkf];
        }
        if (wflxmlrfwpVar.hasNext()) {
            eablkybsjg(ppxfxbqfkf() + 1);
            return wflxmlrfwpVar.next();
        }
        Object[] objArrVdvldrhtss2 = this.f67208jyumaefscl.vdvldrhtss();
        int iPpxfxbqfkf2 = ppxfxbqfkf();
        eablkybsjg(iPpxfxbqfkf2 + 1);
        return objArrVdvldrhtss2[iPpxfxbqfkf2 - wflxmlrfwpVar.wkgbmnqykc()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        dxjokdxxww();
        zoijcleaow();
        this.f67206esjtqupxsv = ppxfxbqfkf() - 1;
        wflxmlrfwp wflxmlrfwpVar = this.f67205cqumvgiudr;
        if (wflxmlrfwpVar == null) {
            Object[] objArrVdvldrhtss = this.f67208jyumaefscl.vdvldrhtss();
            eablkybsjg(ppxfxbqfkf() - 1);
            return objArrVdvldrhtss[ppxfxbqfkf()];
        }
        if (ppxfxbqfkf() <= wflxmlrfwpVar.wkgbmnqykc()) {
            eablkybsjg(ppxfxbqfkf() - 1);
            return wflxmlrfwpVar.previous();
        }
        Object[] objArrVdvldrhtss2 = this.f67208jyumaefscl.vdvldrhtss();
        eablkybsjg(ppxfxbqfkf() - 1);
        return objArrVdvldrhtss2[ppxfxbqfkf() - wflxmlrfwpVar.wkgbmnqykc()];
    }

    @Override // mhtqkkgtqm.iobyxmoadg, java.util.ListIterator, java.util.Iterator
    public void remove() {
        dxjokdxxww();
        btonecajqb();
        this.f67208jyumaefscl.remove(this.f67206esjtqupxsv);
        if (this.f67206esjtqupxsv < ppxfxbqfkf()) {
            eablkybsjg(this.f67206esjtqupxsv);
        }
        gtknphoqwx();
    }

    @Override // mhtqkkgtqm.iobyxmoadg, java.util.ListIterator
    public void set(Object obj) {
        dxjokdxxww();
        btonecajqb();
        this.f67208jyumaefscl.set(this.f67206esjtqupxsv, obj);
        this.f67207iwizpuwonk = this.f67208jyumaefscl.agtfadlqog();
        draadjrbmk();
    }
}
