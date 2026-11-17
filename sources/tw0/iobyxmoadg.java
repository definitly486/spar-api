package tw0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import sj.pmvmpeiblj;
import sj.wwaezpbzkn;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f111622iobyxmoadg;

    public iobyxmoadg(int i13, int i14, rj.iobyxmoadg onBufferOverflow) {
        zdlpuopuiu.btonecajqb(onBufferOverflow, "onBufferOverflow");
        this.f111622iobyxmoadg = wwaezpbzkn.iobyxmoadg(i13, i14, onBufferOverflow);
    }

    public final void dxjokdxxww(Object obj) {
        this.f111622iobyxmoadg.iobyxmoadg(obj);
    }

    public final Object lqeggnwhkg(Object obj, gxszxtbevo gxszxtbevoVar) {
        Object objEmit = this.f111622iobyxmoadg.emit(obj, gxszxtbevoVar);
        return objEmit == zoijcleaow.gxszxtbevo() ? objEmit : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final lqeggnwhkg nufgyqmvbu() {
        return dxjokdxxww.iobyxmoadg(this.f111622iobyxmoadg);
    }

    public /* synthetic */ iobyxmoadg(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }
}
