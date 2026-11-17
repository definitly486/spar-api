package ru.myspar.core.base.api.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.ppxfxbqfkf;
import da.gxszxtbevo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment;
import v1.g;
import v1.oipsdeybqn;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0006*\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u001b\u0010&\u001a\u00020\u00002\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u0002008\u0014X\u0094D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u0002008\u0014X\u0094D¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\"\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010B\u001a\u00020=8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/myspar/core/base/api/bottomsheet/FixedBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "layoutId", "<init>", "(I)V", "Lgg/wwaezpbzkn;", "hcddaimhww", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lcom/google/android/material/bottomsheet/ppxfxbqfkf;", "jpowsppfya", "(Lcom/google/android/material/bottomsheet/ppxfxbqfkf;)V", "stevsuqkhv", "bottomSheet", "mbcevpiqjq", "(Landroid/view/View;)V", "onStart", "dismiss", "dismissAllowingStateLoss", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onCancel", "Lkotlin/Function0;", "action", "tzroggbefp", "(Ltg/iobyxmoadg;)Lru/myspar/core/base/api/bottomsheet/FixedBottomSheetFragment;", "Landroidx/fragment/app/FragmentManager;", "manager", "ntlheqmsrt", "(Landroidx/fragment/app/FragmentManager;)V", "zdlpuopuiu", "I", "cllcsxoeiz", "()I", "", "yggfygwlhe", "Z", "wypolnanlu", "()Z", "isFullScreen", "jyumaefscl", "dsvhmnatus", "isDraggable", "", "iwizpuwonk", "Ljava/util/List;", "dismissActions", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$lqeggnwhkg;", "cqumvgiudr", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$lqeggnwhkg;", "hkdspvbjdz", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior$lqeggnwhkg;", "callback", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FixedBottomSheetFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final boolean isFullScreen;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final int layoutId;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final boolean isDraggable = true;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private List dismissActions = new ArrayList();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final BottomSheetBehavior.lqeggnwhkg callback = new iobyxmoadg();

    public static final class iobyxmoadg extends BottomSheetBehavior.lqeggnwhkg {
        iobyxmoadg() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void ppxfxbqfkf(View bottomSheet, int i13) {
            zdlpuopuiu.btonecajqb(bottomSheet, "bottomSheet");
            if (i13 == 5) {
                FixedBottomSheetFragment.this.hcddaimhww();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void zoijcleaow(View bottomSheet, float f13) {
            zdlpuopuiu.btonecajqb(bottomSheet, "bottomSheet");
        }
    }

    public static final class zoijcleaow extends BottomSheetBehavior.lqeggnwhkg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f86502iobyxmoadg;

        zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f86502iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void ppxfxbqfkf(View bottomSheet, int i13) {
            zdlpuopuiu.btonecajqb(bottomSheet, "bottomSheet");
            if (i13 == 4) {
                this.f86502iobyxmoadg.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void zoijcleaow(View bottomSheet, float f13) {
            zdlpuopuiu.btonecajqb(bottomSheet, "bottomSheet");
        }
    }

    public FixedBottomSheetFragment(int i13) {
        this.layoutId = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hcddaimhww() {
        Iterator it = this.dismissActions.iterator();
        while (it.hasNext()) {
            ((tg.iobyxmoadg) it.next()).invoke();
        }
        this.dismissActions.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kegysxyocb(ppxfxbqfkf ppxfxbqfkfVar, FixedBottomSheetFragment fixedBottomSheetFragment, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(gxszxtbevo.design_bottom_sheet);
        if (!fixedBottomSheetFragment.getIsFullScreen() || viewFindViewById == null) {
            return;
        }
        fixedBottomSheetFragment.mbcevpiqjq(viewFindViewById);
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        hcddaimhww();
        super.dismiss();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        hcddaimhww();
        super.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: dsvhmnatus, reason: from getter */
    protected boolean getIsDraggable() {
        return this.isDraggable;
    }

    /* JADX INFO: renamed from: hkdspvbjdz, reason: from getter */
    protected final BottomSheetBehavior.lqeggnwhkg getCallback() {
        return this.callback;
    }

    protected void jpowsppfya(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        ppxfxbqfkfVar.ojitshcjhn().c(3);
        ppxfxbqfkfVar.ojitshcjhn().b(true);
        ppxfxbqfkfVar.ojitshcjhn().ipoelvxyzq(getIsDraggable());
        ppxfxbqfkfVar.ojitshcjhn().ikoacuggdj(new zoijcleaow(ppxfxbqfkfVar));
    }

    protected void mbcevpiqjq(View bottomSheet) {
        zdlpuopuiu.btonecajqb(bottomSheet, "bottomSheet");
        ViewGroup.LayoutParams layoutParams = bottomSheet.getLayoutParams();
        layoutParams.height = -1;
        bottomSheet.setLayoutParams(layoutParams);
    }

    public final void ntlheqmsrt(FragmentManager manager) {
        zdlpuopuiu.btonecajqb(manager, "manager");
        if (manager.oipsdeybqn(getClass().getSimpleName()) == null) {
            super.show(manager, getClass().getSimpleName());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        hcddaimhww();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) dialogOnCreateDialog;
        jpowsppfya(ppxfxbqfkfVar);
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qx.iobyxmoadg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FixedBottomSheetFragment.kegysxyocb(ppxfxbqfkfVar, this, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        return getLayoutInflater().inflate(getLayoutId(), container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        zdlpuopuiu.btonecajqb(dialog, "dialog");
        hcddaimhww();
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        oipsdeybqn.zoijcleaow(window, false);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 35) {
            window.setStatusBarColor(0);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.flags &= -67108865;
        window.setAttributes(attributes);
        if (i13 < 30) {
            window.clearFlags(67108864);
            return;
        }
        g gVarIobyxmoadg = oipsdeybqn.iobyxmoadg(window, window.getDecorView());
        zdlpuopuiu.dxjokdxxww(gVarIobyxmoadg, "getInsetsController(...)");
        gVarIobyxmoadg.eablkybsjg(skhdrjzrfn.draadjrbmk.nufgyqmvbu());
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        gVarIobyxmoadg.ppxfxbqfkf(!c60.zoijcleaow.eablkybsjg(contextRequireContext));
    }

    protected void stevsuqkhv(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        ppxfxbqfkfVar.ojitshcjhn().c(3);
        ppxfxbqfkfVar.ojitshcjhn().b(false);
        ppxfxbqfkfVar.ojitshcjhn().ipoelvxyzq(false);
    }

    public final FixedBottomSheetFragment tzroggbefp(tg.iobyxmoadg action) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.dismissActions.add(action);
        return this;
    }

    /* JADX INFO: renamed from: wypolnanlu, reason: from getter */
    protected boolean getIsFullScreen() {
        return this.isFullScreen;
    }
}
