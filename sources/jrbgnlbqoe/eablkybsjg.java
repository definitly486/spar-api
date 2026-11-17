package jrbgnlbqoe;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends wkgbmnqykc implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Object f52238cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f52239esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ppxfxbqfkf f52240iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f52241lereixgezr;

    public eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar) {
        super(ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar.dxjokdxxww());
        this.f52240iwizpuwonk = ppxfxbqfkfVar;
        this.f52241lereixgezr = ppxfxbqfkfVar.dxjokdxxww().gxszxtbevo();
    }

    private final void eablkybsjg() {
        if (!this.f52239esjtqupxsv) {
            throw new IllegalStateException();
        }
    }

    private final void wkgbmnqykc() {
        if (this.f52240iwizpuwonk.dxjokdxxww().gxszxtbevo() != this.f52241lereixgezr) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // jrbgnlbqoe.wkgbmnqykc, java.util.Iterator
    public Object next() {
        wkgbmnqykc();
        Object next = super.next();
        this.f52238cqumvgiudr = next;
        this.f52239esjtqupxsv = true;
        return next;
    }

    @Override // jrbgnlbqoe.wkgbmnqykc, java.util.Iterator
    public void remove() {
        eablkybsjg();
        mbcevpiqjq.iobyxmoadg(this.f52240iwizpuwonk).remove(this.f52238cqumvgiudr);
        this.f52238cqumvgiudr = null;
        this.f52239esjtqupxsv = false;
        this.f52241lereixgezr = this.f52240iwizpuwonk.dxjokdxxww().gxszxtbevo();
        ppxfxbqfkf(zoijcleaow() - 1);
    }
}
