package r01;

import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {
    static /* synthetic */ void vdvldrhtss(zoijcleaow zoijcleaowVar, List list, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onChangeProductParams");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        zoijcleaowVar.dxjokdxxww(list, z13);
    }

    boolean btonecajqb();

    default void dxjokdxxww(List params, boolean z13) {
        zdlpuopuiu.btonecajqb(params, "params");
        List listLqeggnwhkg = lqeggnwhkg(params);
        List list = btonecajqb() ? listLqeggnwhkg : params;
        if (!((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            zoijcleaow();
            return;
        }
        if (listLqeggnwhkg.isEmpty()) {
            gtknphoqwx(params);
        } else if (z13) {
            nufgyqmvbu(list);
        } else {
            ppxfxbqfkf(null);
            nufgyqmvbu(list);
        }
    }

    void gtknphoqwx(List list);

    List lqeggnwhkg(List list);

    void nufgyqmvbu(List list);

    void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar);

    esjtqupxsv wkgbmnqykc();

    void zoijcleaow();
}
