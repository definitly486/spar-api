package kk;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import npi.spay.Nf;
import spay.sdk.view.SpayBnplGraphCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ u00 f56822yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Nf f56823zdlpuopuiu;

    public h3(Nf nf2, u00 u00Var) {
        this.f56823zdlpuopuiu = nf2;
        this.f56822yggfygwlhe = u00Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        List list = (List) obj;
        gp gpVar = this.f56823zdlpuopuiu.f70563iwizpuwonk;
        r6 r6Var = null;
        if (gpVar == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("amountAdapter");
            gpVar = null;
        }
        gpVar.ppxfxbqfkf(list);
        if (hg.jyumaefscl.opjhrmiecq(list) instanceof qe) {
            RecyclerView recyclerView = this.f56822yggfygwlhe.f58746nufgyqmvbu;
            r6 r6Var2 = this.f56823zdlpuopuiu.f70562esjtqupxsv;
            if (r6Var2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("disabledScrollOnItemTouchListener");
            } else {
                r6Var = r6Var2;
            }
            recyclerView.wflxmlrfwp(r6Var);
            SpayBnplGraphCompositeView spaySloSbgcvGraph = this.f56822yggfygwlhe.f58738btonecajqb;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySloSbgcvGraph, "spaySloSbgcvGraph");
            spaySloSbgcvGraph.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = this.f56822yggfygwlhe.f58746nufgyqmvbu;
            r6 r6Var3 = this.f56823zdlpuopuiu.f70562esjtqupxsv;
            if (r6Var3 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("disabledScrollOnItemTouchListener");
            } else {
                r6Var = r6Var3;
            }
            recyclerView2.q(r6Var);
            SpayBnplGraphCompositeView spaySloSbgcvGraph2 = this.f56822yggfygwlhe.f58738btonecajqb;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySloSbgcvGraph2, "spaySloSbgcvGraph");
            spaySloSbgcvGraph2.setVisibility(0);
            SpayBnplGraphCompositeView spaySloSbgcvGraph3 = this.f56822yggfygwlhe.f58738btonecajqb;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySloSbgcvGraph3, "spaySloSbgcvGraph");
            int size = list.size();
            int i13 = SpayBnplGraphCompositeView.f107870d;
            spaySloSbgcvGraph3.a(size, 0);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
