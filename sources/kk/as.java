package kk;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import npi.spay.Nf;

/* JADX INFO: loaded from: classes3.dex */
public final class as implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ Nf f55835jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f55836yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ u00 f55837zdlpuopuiu;

    public as(u00 u00Var, Context context, Nf nf2) {
        this.f55837zdlpuopuiu = u00Var;
        this.f55836yggfygwlhe = context;
        this.f55835jyumaefscl = nf2;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        lx lxVar = (lx) obj;
        if (lxVar.gxszxtbevo() != null) {
            ConstraintLayout constraintLayout = this.f55837zdlpuopuiu.f58741eablkybsjg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout, "spaySloIncludeCompoundWallet.root");
            constraintLayout.setVisibility(0);
            ConstraintLayout constraintLayout2 = this.f55837zdlpuopuiu.f58743gxszxtbevo.f56286iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout2, "spaySloIncludeSelectedCard.root");
            ConstraintLayout constraintLayout3 = this.f55837zdlpuopuiu.f58741eablkybsjg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout3, "spaySloIncludeCompoundWallet.root");
            constraintLayout2.setVisibility(constraintLayout3.getVisibility() != 0 ? 0 : 8);
            zf zfVar = this.f55837zdlpuopuiu.f58741eablkybsjg;
            zfVar.f59575ppxfxbqfkf.setText(zv.iobyxmoadg(lxVar.nufgyqmvbu(), this.f55836yggfygwlhe));
            Integer numGxszxtbevo = lxVar.gxszxtbevo();
            String quantityString = numGxszxtbevo != null ? this.f55835jyumaefscl.getResources().getQuantityString(numGxszxtbevo.intValue(), qa0.iobyxmoadg(lxVar.iobyxmoadg()), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(qa0.iobyxmoadg(lxVar.iobyxmoadg()))) : null;
            zfVar.f59576wkgbmnqykc.setText(lxVar.eablkybsjg() ? this.f55835jyumaefscl.getString(lxVar.wkgbmnqykc(), lxVar.ppxfxbqfkf(), quantityString) : this.f55835jyumaefscl.getString(lxVar.wkgbmnqykc(), lxVar.zoijcleaow(), lxVar.ppxfxbqfkf(), quantityString));
            zfVar.f59573eablkybsjg.a(lxVar.f57542lqeggnwhkg);
        } else {
            ConstraintLayout constraintLayout4 = this.f55837zdlpuopuiu.f58741eablkybsjg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout4, "spaySloIncludeCompoundWallet.root");
            constraintLayout4.setVisibility(8);
            ConstraintLayout constraintLayout5 = this.f55837zdlpuopuiu.f58743gxszxtbevo.f56286iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout5, "spaySloIncludeSelectedCard.root");
            ConstraintLayout constraintLayout6 = this.f55837zdlpuopuiu.f58741eablkybsjg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout6, "spaySloIncludeCompoundWallet.root");
            constraintLayout5.setVisibility(constraintLayout6.getVisibility() != 0 ? 0 : 8);
            dh dhVar = this.f55837zdlpuopuiu.f58743gxszxtbevo;
            dhVar.f56285eablkybsjg.setText(zv.iobyxmoadg(lxVar.nufgyqmvbu(), this.f55836yggfygwlhe));
            dhVar.f56288wkgbmnqykc.setText(lxVar.eablkybsjg() ? this.f55835jyumaefscl.getString(lxVar.wkgbmnqykc(), lxVar.ppxfxbqfkf()) : this.f55835jyumaefscl.getString(lxVar.wkgbmnqykc(), lxVar.zoijcleaow(), lxVar.ppxfxbqfkf()));
            dhVar.f56289zoijcleaow.a(lxVar.f57542lqeggnwhkg);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
