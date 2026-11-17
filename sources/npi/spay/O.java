package npi.spay;

import a6.iobyxmoadg;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.lifecycle.crxdokpmqz;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.ppxfxbqfkf;
import kk.dvvnrvtcbc;
import kk.ed;
import kk.od0;
import kk.pc0;
import kk.q8;
import kk.r3;
import kk.r80;
import kk.t9;
import kk.tc;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.O;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnpi/spay/O;", "Lkk/ed;", "VM", "La6/iobyxmoadg;", "B", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class O<VM extends ed, B extends iobyxmoadg> extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public tc f70564cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public iobyxmoadg f70565iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final int f70566jyumaefscl = 3;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public BottomSheetBehavior f70567yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public ed f70568zdlpuopuiu;

    public static final void pkzmftpjix(O this$0, DialogInterface dialogInterface) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.f70567yggfygwlhe;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.c(this$0.f70566jyumaefscl);
        }
    }

    public void cllcsxoeiz() {
    }

    public final ed hcddaimhww() {
        ed edVar = this.f70568zdlpuopuiu;
        if (edVar != null) {
            return edVar;
        }
        zdlpuopuiu.pmvmpeiblj("viewModel");
        return null;
    }

    public void hkdspvbjdz() {
    }

    public abstract void jpowsppfya();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        jpowsppfya();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.SpayBaseBottomSheetDialog);
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
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
            ed edVar = (ed) new crxdokpmqz(this, pc0Var).zoijcleaow(dvvnrvtcbc.class);
            zdlpuopuiu.btonecajqb(edVar, "<set-?>");
            this.f70568zdlpuopuiu = edVar;
            return;
        }
        od0 od0Var = r80.f58284ppxfxbqfkf;
        if (od0Var != null) {
            tc tcVar2 = this.f70564cqumvgiudr;
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

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        zdlpuopuiu.dxjokdxxww(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        ed edVarHcddaimhww = hcddaimhww();
        q8 action = new q8(this);
        edVarHcddaimhww.getClass();
        zdlpuopuiu.btonecajqb(action, "action");
        edVarHcddaimhww.f56402ppxfxbqfkf = action;
        t9 action2 = new t9(this);
        zdlpuopuiu.btonecajqb(action2, "action");
        edVarHcddaimhww.f56403wkgbmnqykc = action2;
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        iobyxmoadg iobyxmoadgVarYlkuphrtab = ylkuphrtab();
        this.f70565iwizpuwonk = iobyxmoadgVarYlkuphrtab;
        if (iobyxmoadgVarYlkuphrtab == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ConstraintLayout constraintLayout = ((r3) iobyxmoadgVarYlkuphrtab).f58261iobyxmoadg;
        zdlpuopuiu.dxjokdxxww(constraintLayout, "binding.root");
        hkdspvbjdz();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        ppxfxbqfkf ppxfxbqfkfVar = dialog instanceof ppxfxbqfkf ? (ppxfxbqfkf) dialog : null;
        this.f70567yggfygwlhe = ppxfxbqfkfVar != null ? ppxfxbqfkfVar.ojitshcjhn() : null;
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kk.pa
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    O.pkzmftpjix(this.f58060iobyxmoadg, dialogInterface);
                }
            });
        }
        cllcsxoeiz();
    }

    public iobyxmoadg ylkuphrtab() {
        return null;
    }
}
