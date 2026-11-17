package npi.spay;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.core.content.iobyxmoadg;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.jpowsppfya;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import da.gxszxtbevo;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import hg.agtfadlqog;
import ja.zoijcleaow;
import java.io.File;
import kk.bc;
import kk.dvvnrvtcbc;
import kk.fr;
import kk.h40;
import kk.hy;
import kk.jf0;
import kk.js;
import kk.l50;
import kk.lz;
import kk.n60;
import kk.o;
import kk.q70;
import kk.r3;
import kk.r80;
import kk.t80;
import kk.va;
import kk.ve;
import kk.wv;
import kk.x90;
import kk.y90;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.presentation.fragment.EcomLoggerFragment;
import modern.payments.ecomAndroid.presentation.fragment.EmptyFragment;
import sj.dxjokdxxww;
import sj.wypolnanlu;
import spay.sdk.R;
import spay.sdk.domain.model.BiometricSuggestionModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/uo;", "Lnpi/spay/O;", "Lkk/dvvnrvtcbc;", "Lkk/r3;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class uo extends O<dvvnrvtcbc, r3> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final /* synthetic */ int f70585cdpycssgdh = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public va f70586esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public Dialog f70587istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public final gtknphoqwx f70588lereixgezr = draadjrbmk.zoijcleaow(x90.f59276zdlpuopuiu);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public SensorManager f70589pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public Sensor f70590zynmafqrjb;

    public static final void dsvhmnatus(Dialog dialog, uo this$0, DialogInterface dialogInterface) {
        zdlpuopuiu.btonecajqb(dialog, "$dialog");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehaviorIyctptxqzt = BottomSheetBehavior.iyctptxqzt(dialog.findViewById(gxszxtbevo.design_bottom_sheet));
        zdlpuopuiu.dxjokdxxww(bottomSheetBehaviorIyctptxqzt, "from<View>(\n            …et)\n                    )");
        this$0.getClass();
        bottomSheetBehaviorIyctptxqzt.c(3);
        bottomSheetBehaviorIyctptxqzt.fmlbqenlif(true);
        bottomSheetBehaviorIyctptxqzt.b(true);
    }

    public static final void kegysxyocb(uo this$0, Dialog this_apply, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
        this$0.getClass();
        this$0.wypolnanlu(new db(), EcomLoggerFragment.TAG);
        this_apply.dismiss();
    }

    public static final void mbcevpiqjq(uo this$0, DialogInterface dialogInterface, int i13) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((jf0) ((dvvnrvtcbc) this$0.hcddaimhww()).f56345lqeggnwhkg).iobyxmoadg(false);
        ((ve) ((dvvnrvtcbc) this$0.hcddaimhww()).f56341gxszxtbevo).zoijcleaow(js.f57221iobyxmoadg);
    }

    public static final void sopmlzcsov(uo this$0, DialogInterface dialogInterface, int i13) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((jf0) ((dvvnrvtcbc) this$0.hcddaimhww()).f56345lqeggnwhkg).iobyxmoadg(true);
        ((ve) ((dvvnrvtcbc) this$0.hcddaimhww()).f56341gxszxtbevo).zoijcleaow(js.f57221iobyxmoadg);
    }

    public static final void stevsuqkhv(uo uoVar) {
        Object systemService = uoVar.requireContext().getSystemService("sensor");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        uoVar.f70589pmvmpeiblj = sensorManager;
        uoVar.f70590zynmafqrjb = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        ((y90) uoVar.f70588lereixgezr.getValue()).f59398iobyxmoadg = new t80(uoVar);
    }

    public static final void tzroggbefp(uo this$0, DialogInterface dialogInterface) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ve) ((dvvnrvtcbc) this$0.hcddaimhww()).f56341gxszxtbevo).zoijcleaow(hy.f56967iobyxmoadg);
    }

    public static final void ulzqkzuiru(uo this$0, Dialog this_apply, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(this_apply, "$this_apply");
        this$0.crxdokpmqz();
        this_apply.dismiss();
    }

    @Override // npi.spay.O
    public final void cllcsxoeiz() {
        getChildFragmentManager().kcexrzcfyt().zoijcleaow(R.id.sbss_fcv_content, new P5()).nufgyqmvbu(EmptyFragment.TAG).dxjokdxxww();
    }

    public final void crxdokpmqz() {
        Context context = requireContext();
        zdlpuopuiu.dxjokdxxww(context, "requireContext()");
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb("SDK_logs", "directory");
        File[] externalFilesDirs = iobyxmoadg.getExternalFilesDirs(context, null);
        zdlpuopuiu.dxjokdxxww(externalFilesDirs, "getExternalFilesDirs(context, null)");
        File file = new File((File) agtfadlqog.ydmasvzmpa(externalFilesDirs), "SDK_logs");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.STREAM", FileProvider.nufgyqmvbu(requireContext(), requireContext().getApplicationContext().getPackageName() + ".fileprovider", file2));
        startActivity(intent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        fr block = new fr(this);
        zdlpuopuiu.btonecajqb(block, "block");
        ((dvvnrvtcbc) hcddaimhww()).gtknphoqwx(bc.f55967iobyxmoadg);
        super.dismiss();
    }

    @Override // npi.spay.O
    public final void hkdspvbjdz() {
        wypolnanlu wypolnanluVar = ((dvvnrvtcbc) hcddaimhww()).f56344kcexrzcfyt;
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new h40(this, zoijcleaowVar, wypolnanluVar, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new wv(this, zoijcleaowVar, ((dvvnrvtcbc) hcddaimhww()).f56353zdlpuopuiu, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new lz(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((dvvnrvtcbc) hcddaimhww()).f56352yggfygwlhe), null, this), 3, null);
    }

    public final void jlmebxxoox() {
        wwaezpbzkn wwaezpbzknVar;
        Dialog dialog = this.f70587istkbnxepw;
        if (dialog != null) {
            if (!dialog.isShowing()) {
                dialog.show();
            }
            wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } else {
            wwaezpbzknVar = null;
        }
        if (wwaezpbzknVar == null) {
            final Dialog dialog2 = new Dialog(requireContext(), R.style.SpayLoggerDialog);
            dialog2.requestWindowFeature(1);
            dialog2.setCancelable(false);
            dialog2.setContentView(R.layout.spay_layout_logger_dialog);
            ((CardView) dialog2.findViewById(R.id.show_logger)).setOnClickListener(new View.OnClickListener() { // from class: kk.kc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    npi.spay.uo.kegysxyocb(this.f57289zdlpuopuiu, dialog2, view);
                }
            });
            ((CardView) dialog2.findViewById(R.id.send_logger_file)).setOnClickListener(new View.OnClickListener() { // from class: kk.lc0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    npi.spay.uo.ulzqkzuiru(this.f57444zdlpuopuiu, dialog2, view);
                }
            });
            dialog2.setCanceledOnTouchOutside(true);
            dialog2.show();
            this.f70587istkbnxepw = dialog2;
        }
    }

    @Override // npi.spay.O
    public final void jpowsppfya() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70564cqumvgiudr = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
            this.f70586esjtqupxsv = (va) ag.dxjokdxxww.eablkybsjg(new va());
        }
    }

    public final void ntlheqmsrt(BiometricSuggestionModel biometricSuggestionModel) {
        new zoijcleaow(requireActivity(), R.style.Spay_ThemeOverlay_MaterialAlertDialog).setTitle(biometricSuggestionModel.getTitle()).wkgbmnqykc(biometricSuggestionModel.getMessage()).gxszxtbevo(biometricSuggestionModel.getNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: kk.hc0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                npi.spay.uo.mbcevpiqjq(this.f56893zdlpuopuiu, dialogInterface, i13);
            }
        }).dxjokdxxww(biometricSuggestionModel.getPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: kk.ic0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                npi.spay.uo.sopmlzcsov(this.f57027zdlpuopuiu, dialogInterface, i13);
            }
        }).iwizpuwonk(new DialogInterface.OnCancelListener() { // from class: kk.jc0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                npi.spay.uo.tzroggbefp(this.f57178zdlpuopuiu, dialogInterface);
            }
        }).draadjrbmk();
    }

    @Override // npi.spay.O, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l50 block = new l50(this);
        zdlpuopuiu.btonecajqb(block, "block");
    }

    @Override // npi.spay.O, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        final Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(((dvvnrvtcbc) hcddaimhww()).f56336cqumvgiudr);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: kk.gc0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                npi.spay.uo.dsvhmnatus(dialogOnCreateDialog, this, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        fr block = new fr(this);
        zdlpuopuiu.btonecajqb(block, "block");
        ((dvvnrvtcbc) hcddaimhww()).gtknphoqwx(bc.f55967iobyxmoadg);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        n60 block = new n60(this);
        zdlpuopuiu.btonecajqb(block, "block");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q70 block = new q70(this);
        zdlpuopuiu.btonecajqb(block, "block");
    }

    public final void wypolnanlu(S s13, String str) {
        if (zdlpuopuiu.eablkybsjg(((Fragment) getChildFragmentManager().igdgnonuha().get(0)).getTag(), str)) {
            return;
        }
        View viewRequireView = ((Fragment) getChildFragmentManager().igdgnonuha().get(0)).requireView();
        zdlpuopuiu.dxjokdxxww(viewRequireView, "childFragmentManager.fragments[0].requireView()");
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getChildFragmentManager().kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.lqeggnwhkg(viewRequireView, viewRequireView.getTransitionName());
        jpowsppfyaVarKcexrzcfyt.iwizpuwonk(true);
        s13.setSharedElementEnterTransition(s13 instanceof Da ? new o(0L) : new o(600L));
        jpowsppfyaVarKcexrzcfyt.oxmwwwfdhm(R.id.sbss_fcv_content, s13, str).dxjokdxxww();
    }

    @Override // npi.spay.O
    public final a6.iobyxmoadg ylkuphrtab() {
        View viewIobyxmoadg;
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_bottom_sheet_sdk, (ViewGroup) null, false);
        int i13 = R.id.sbss_aciv_background;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatImageView != null) {
            i13 = R.id.sbss_fcv_content;
            if (((FragmentContainerView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13)) != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(viewInflate, (i13 = R.id.sbss_include_indicator))) != null) {
                r3 r3Var = new r3((ConstraintLayout) viewInflate, appCompatImageView);
                zdlpuopuiu.dxjokdxxww(r3Var, "inflate(layoutInflater)");
                return r3Var;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }
}
