package ef;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow extends df.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f31242iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f31243ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final draadjrbmk f31244wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vdvldrhtss f31245zoijcleaow;

    public zoijcleaow(rgvfuqvkyq binding, vdvldrhtss on2, draadjrbmk initializerBlock, draadjrbmk layoutInflater) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(on2, "on");
        zdlpuopuiu.btonecajqb(initializerBlock, "initializerBlock");
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        this.f31242iobyxmoadg = binding;
        this.f31245zoijcleaow = on2;
        this.f31243ppxfxbqfkf = initializerBlock;
        this.f31244wkgbmnqykc = layoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.iobyxmoadg
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(Object obj, iobyxmoadg holder, List payloads) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        holder.draadjrbmk(obj);
        draadjrbmk draadjrbmkVarLqeggnwhkg = holder.lqeggnwhkg();
        if (draadjrbmkVarLqeggnwhkg == null) {
            return;
        }
        draadjrbmkVarLqeggnwhkg.invoke(payloads);
    }

    @Override // df.zoijcleaow
    protected void eablkybsjg(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        tg.iobyxmoadg iobyxmoadgVarDxjokdxxww = ((iobyxmoadg) holder).dxjokdxxww();
        if (iobyxmoadgVarDxjokdxxww == null) {
            return;
        }
        iobyxmoadgVarDxjokdxxww.invoke();
    }

    @Override // df.zoijcleaow
    protected void gxszxtbevo(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        tg.iobyxmoadg iobyxmoadgVarBtonecajqb = ((iobyxmoadg) holder).btonecajqb();
        if (iobyxmoadgVarBtonecajqb == null) {
            return;
        }
        iobyxmoadgVarBtonecajqb.invoke();
    }

    @Override // df.zoijcleaow
    protected void lqeggnwhkg(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        tg.iobyxmoadg iobyxmoadgVarGtknphoqwx = ((iobyxmoadg) holder).gtknphoqwx();
        if (iobyxmoadgVarGtknphoqwx == null) {
            return;
        }
        iobyxmoadgVarGtknphoqwx.invoke();
    }

    @Override // df.iobyxmoadg
    protected boolean nufgyqmvbu(Object obj, List items, int i13) {
        zdlpuopuiu.btonecajqb(items, "items");
        return ((Boolean) this.f31245zoijcleaow.invoke(obj, items, Integer.valueOf(i13))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // df.zoijcleaow
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ppxfxbqfkf(ViewGroup parent) {
        zdlpuopuiu.btonecajqb(parent, "parent");
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg((a6.iobyxmoadg) this.f31242iobyxmoadg.invoke(this.f31244wkgbmnqykc.invoke(parent), parent), null, 2, null);
        this.f31243ppxfxbqfkf.invoke(iobyxmoadgVar);
        return iobyxmoadgVar;
    }

    @Override // df.zoijcleaow
    protected boolean wkgbmnqykc(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        tg.iobyxmoadg iobyxmoadgVarNufgyqmvbu = ((iobyxmoadg) holder).nufgyqmvbu();
        return iobyxmoadgVarNufgyqmvbu == null ? super.wkgbmnqykc(holder) : ((Boolean) iobyxmoadgVarNufgyqmvbu.invoke()).booleanValue();
    }
}
