package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class tl implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.i2 f58707yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ j40 f58708zdlpuopuiu;

    public tl(j40 j40Var, npi.spay.i2 i2Var) {
        this.f58708zdlpuopuiu = j40Var;
        this.f58707yggfygwlhe = i2Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        lx lxVar = (lx) obj;
        if (lxVar.gxszxtbevo() != null) {
            ConstraintLayout constraintLayout = this.f58708zdlpuopuiu.f57146lqeggnwhkg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout, "spaySloIncludeCompoundWallet.root");
            constraintLayout.setVisibility(0);
            ConstraintLayout constraintLayout2 = this.f58708zdlpuopuiu.f57147nufgyqmvbu.f56286iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout2, "spaySloIncludeSelectedCard.root");
            ConstraintLayout constraintLayout3 = this.f58708zdlpuopuiu.f57146lqeggnwhkg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout3, "spaySloIncludeCompoundWallet.root");
            constraintLayout2.setVisibility(constraintLayout3.getVisibility() != 0 ? 0 : 8);
            zf zfVar = this.f58708zdlpuopuiu.f57146lqeggnwhkg;
            AppCompatTextView appCompatTextView = zfVar.f59575ppxfxbqfkf;
            vu vuVarNufgyqmvbu = lxVar.nufgyqmvbu();
            Context contextRequireContext = this.f58707yggfygwlhe.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
            appCompatTextView.setText(zv.iobyxmoadg(vuVarNufgyqmvbu, contextRequireContext));
            Integer numGxszxtbevo = lxVar.gxszxtbevo();
            String quantityString = numGxszxtbevo != null ? this.f58707yggfygwlhe.getResources().getQuantityString(numGxszxtbevo.intValue(), qa0.iobyxmoadg(lxVar.iobyxmoadg()), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(qa0.iobyxmoadg(lxVar.iobyxmoadg()))) : null;
            zfVar.f59576wkgbmnqykc.setText(lxVar.eablkybsjg() ? this.f58707yggfygwlhe.getString(lxVar.wkgbmnqykc(), lxVar.ppxfxbqfkf(), quantityString) : this.f58707yggfygwlhe.getString(lxVar.wkgbmnqykc(), lxVar.zoijcleaow(), lxVar.ppxfxbqfkf(), quantityString));
            zfVar.f59573eablkybsjg.a(lxVar.f57542lqeggnwhkg);
        } else {
            ConstraintLayout constraintLayout4 = this.f58708zdlpuopuiu.f57146lqeggnwhkg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout4, "spaySloIncludeCompoundWallet.root");
            constraintLayout4.setVisibility(8);
            ConstraintLayout constraintLayout5 = this.f58708zdlpuopuiu.f57147nufgyqmvbu.f56286iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout5, "spaySloIncludeSelectedCard.root");
            ConstraintLayout constraintLayout6 = this.f58708zdlpuopuiu.f57146lqeggnwhkg.f59574iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(constraintLayout6, "spaySloIncludeCompoundWallet.root");
            constraintLayout5.setVisibility(constraintLayout6.getVisibility() != 0 ? 0 : 8);
            dh dhVar = this.f58708zdlpuopuiu.f57147nufgyqmvbu;
            AppCompatTextView appCompatTextView2 = dhVar.f56285eablkybsjg;
            vu vuVarNufgyqmvbu2 = lxVar.nufgyqmvbu();
            Context contextRequireContext2 = this.f58707yggfygwlhe.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext2, "requireContext()");
            appCompatTextView2.setText(zv.iobyxmoadg(vuVarNufgyqmvbu2, contextRequireContext2));
            dhVar.f56288wkgbmnqykc.setText(lxVar.eablkybsjg() ? this.f58707yggfygwlhe.getString(lxVar.wkgbmnqykc(), lxVar.ppxfxbqfkf()) : this.f58707yggfygwlhe.getString(lxVar.wkgbmnqykc(), lxVar.zoijcleaow(), lxVar.ppxfxbqfkf()));
            dhVar.f56289zoijcleaow.a(lxVar.f57542lqeggnwhkg);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
