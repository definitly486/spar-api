package l7;

import android.graphics.Path;
import java.util.List;
import k7.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp extends iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Path f61768btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Path f61769draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final q7.ojitshcjhn f61770dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Path f61771gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private List f61772wflxmlrfwp;

    public wflxmlrfwp(List list) {
        super(list);
        this.f61770dxjokdxxww = new q7.ojitshcjhn();
        this.f61768btonecajqb = new Path();
    }

    public void oxmwwwfdhm(List list) {
        this.f61772wflxmlrfwp = list;
    }

    @Override // l7.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public Path dxjokdxxww(w7.iobyxmoadg iobyxmoadgVar, float f13) {
        q7.ojitshcjhn ojitshcjhnVar = (q7.ojitshcjhn) iobyxmoadgVar.f118920zoijcleaow;
        q7.ojitshcjhn ojitshcjhnVar2 = (q7.ojitshcjhn) iobyxmoadgVar.f118916ppxfxbqfkf;
        this.f61770dxjokdxxww.ppxfxbqfkf(ojitshcjhnVar, ojitshcjhnVar2 == null ? ojitshcjhnVar : ojitshcjhnVar2, f13);
        q7.ojitshcjhn ojitshcjhnVarWkgbmnqykc = this.f61770dxjokdxxww;
        List list = this.f61772wflxmlrfwp;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ojitshcjhnVarWkgbmnqykc = ((kcexrzcfyt) this.f61772wflxmlrfwp.get(size)).wkgbmnqykc(ojitshcjhnVarWkgbmnqykc);
            }
        }
        v7.dxjokdxxww.nufgyqmvbu(ojitshcjhnVarWkgbmnqykc, this.f61768btonecajqb);
        if (this.f61722eablkybsjg == null) {
            return this.f61768btonecajqb;
        }
        if (this.f61771gtknphoqwx == null) {
            this.f61771gtknphoqwx = new Path();
            this.f61769draadjrbmk = new Path();
        }
        v7.dxjokdxxww.nufgyqmvbu(ojitshcjhnVar, this.f61771gtknphoqwx);
        if (ojitshcjhnVar2 != null) {
            v7.dxjokdxxww.nufgyqmvbu(ojitshcjhnVar2, this.f61769draadjrbmk);
        }
        w7.ppxfxbqfkf ppxfxbqfkfVar = this.f61722eablkybsjg;
        float f14 = iobyxmoadgVar.f118913lqeggnwhkg;
        float fFloatValue = iobyxmoadgVar.f118914nufgyqmvbu.floatValue();
        Path path = this.f61771gtknphoqwx;
        return (Path) ppxfxbqfkfVar.zoijcleaow(f14, fFloatValue, path, ojitshcjhnVar2 == null ? path : this.f61769draadjrbmk, f13, eablkybsjg(), gxszxtbevo());
    }
}
