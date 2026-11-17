package npi.spay;

import a6.iobyxmoadg;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.lifecycle.crxdokpmqz;
import kk.bw;
import kk.cp;
import kk.gq;
import kk.kr;
import kk.od0;
import kk.os;
import kk.pc0;
import kk.r80;
import kk.tc;
import kk.tt;
import kk.xn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.RedirectActivity;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnpi/spay/S;", "Lkk/bw;", "VM", "La6/iobyxmoadg;", "B", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class S<VM extends bw, B extends iobyxmoadg> extends Fragment {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public tc f70569jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public iobyxmoadg f70570yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public bw f70571zdlpuopuiu;

    public iobyxmoadg cdpycssgdh() {
        return null;
    }

    /* JADX INFO: renamed from: iozdgvuglv */
    public abstract Class getF70578cqumvgiudr();

    public void lmojexxdyd() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        wwaezpbzkn();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.nufgyqmvbu(oxmwwwfdhmVarRequireActivity, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        tc tcVar = null;
        pc0 pc0Var = null;
        if (((RedirectActivity) oxmwwwfdhmVarRequireActivity).f107823a != null) {
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity2 = requireActivity();
            zdlpuopuiu.nufgyqmvbu(oxmwwwfdhmVarRequireActivity2, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
            pc0 pc0Var2 = ((RedirectActivity) oxmwwwfdhmVarRequireActivity2).f107823a;
            if (pc0Var2 != null) {
                pc0Var = pc0Var2;
            } else {
                zdlpuopuiu.pmvmpeiblj("viewModelFactory");
            }
            bw bwVar = (bw) new crxdokpmqz(this, pc0Var).zoijcleaow(getF70578cqumvgiudr());
            zdlpuopuiu.btonecajqb(bwVar, "<set-?>");
            this.f70571zdlpuopuiu = bwVar;
            yadqdtsiqt().gtknphoqwx(xn.f59318iobyxmoadg);
            return;
        }
        od0 od0Var = r80.f58284ppxfxbqfkf;
        if (od0Var != null) {
            tc tcVar2 = this.f70569jyumaefscl;
            if (tcVar2 != null) {
                tcVar = tcVar2;
            } else {
                zdlpuopuiu.pmvmpeiblj("userIdManager");
            }
            od0Var.invoke(new PaymentResult.Error(tcVar.iobyxmoadg(), "000000000000", new MerchantError.UnexpectedError("Ошибка внутренних компонентов SPaySdk")));
        }
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity3 = requireActivity();
        zdlpuopuiu.nufgyqmvbu(oxmwwwfdhmVarRequireActivity3, "null cannot be cast to non-null type spay.sdk.RedirectActivity");
        ((RedirectActivity) oxmwwwfdhmVarRequireActivity3).finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        iobyxmoadg iobyxmoadgVarCdpycssgdh = cdpycssgdh();
        this.f70570yggfygwlhe = iobyxmoadgVarCdpycssgdh;
        if (iobyxmoadgVarCdpycssgdh == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        View root = iobyxmoadgVarCdpycssgdh.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "binding.root");
        ylkuphrtab();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.f70571zdlpuopuiu == null) {
            requireActivity().finish();
        } else {
            yadqdtsiqt().gtknphoqwx(cp.f56177iobyxmoadg);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        yadqdtsiqt().gtknphoqwx(gq.f56729iobyxmoadg);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        yadqdtsiqt().gtknphoqwx(kr.f57337iobyxmoadg);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        yadqdtsiqt().gtknphoqwx(os.f57991iobyxmoadg);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        yadqdtsiqt().gtknphoqwx(tt.f58723iobyxmoadg);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, bundle);
        pkzmftpjix();
        lmojexxdyd();
    }

    public void pkzmftpjix() {
    }

    public abstract void wwaezpbzkn();

    public final bw yadqdtsiqt() {
        bw bwVar = this.f70571zdlpuopuiu;
        if (bwVar != null) {
            return bwVar;
        }
        zdlpuopuiu.pmvmpeiblj("viewModel");
        return null;
    }

    public void ylkuphrtab() {
    }
}
