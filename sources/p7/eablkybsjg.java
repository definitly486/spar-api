package p7;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg implements wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f75868iobyxmoadg;

    public eablkybsjg(List list) {
        this.f75868iobyxmoadg = list;
    }

    @Override // p7.wflxmlrfwp
    public l7.iobyxmoadg eablkybsjg() {
        return ((w7.iobyxmoadg) this.f75868iobyxmoadg.get(0)).dxjokdxxww() ? new l7.gtknphoqwx(this.f75868iobyxmoadg) : new l7.btonecajqb(this.f75868iobyxmoadg);
    }

    @Override // p7.wflxmlrfwp
    public List gxszxtbevo() {
        return this.f75868iobyxmoadg;
    }

    @Override // p7.wflxmlrfwp
    public boolean wkgbmnqykc() {
        return this.f75868iobyxmoadg.size() == 1 && ((w7.iobyxmoadg) this.f75868iobyxmoadg.get(0)).dxjokdxxww();
    }
}
