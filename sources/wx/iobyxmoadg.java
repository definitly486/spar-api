package wx;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import sj.dxjokdxxww;
import sj.iozdgvuglv;
import sj.pmvmpeiblj;
import sj.wwaezpbzkn;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f120672iobyxmoadg;

    public iobyxmoadg(int i13, int i14, rj.iobyxmoadg onBufferOverflow) {
        zdlpuopuiu.btonecajqb(onBufferOverflow, "onBufferOverflow");
        this.f120672iobyxmoadg = wwaezpbzkn.iobyxmoadg(i13, i14, onBufferOverflow);
    }

    public final iozdgvuglv btonecajqb() {
        return dxjokdxxww.iobyxmoadg(this.f120672iobyxmoadg);
    }

    public final Object dxjokdxxww(Object obj, gxszxtbevo gxszxtbevoVar) {
        Object objEmit = this.f120672iobyxmoadg.emit(obj, gxszxtbevoVar);
        return objEmit == zoijcleaow.gxszxtbevo() ? objEmit : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public /* synthetic */ iobyxmoadg(int i13, int i14, rj.iobyxmoadg iobyxmoadgVar, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }
}
