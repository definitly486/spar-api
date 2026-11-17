package ru.myspar.proloyalty.core.base.api.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.nufgyqmvbu;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.b;
import androidx.compose.ui.platform.s;
import androidx.compose.ui.ppxfxbqfkf;
import androidx.compose.ui.wkgbmnqykc;
import czzsidtyhn.eablkybsjg;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import ikoacuggdj.lrnfpwlwnk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import jztzpxfvev.jlmebxxoox;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment;
import tg.rgvfuqvkyq;
import v1.jhduphickx;
import x.zynmafqrjb;
import z.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Lru/myspar/proloyalty/core/base/api/bottomsheet/SimpleComposeBottomSheetDialogFragment;", "", "Model", "Lru/myspar/proloyalty/core/base/api/bottomsheet/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroidx/compose/ui/platform/ComposeView;", "Lgg/wwaezpbzkn;", "okpsazkaxt", "(Landroidx/compose/ui/platform/ComposeView;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "jhduphickx", "()Ljava/lang/Object;", CommonUrlParts.MODEL, "jlmebxxoox", "(Ljava/lang/Object;Landroidx/compose/runtime/draadjrbmk;I)V", "lereixgezr", "Landroidx/compose/ui/platform/ComposeView;", "composeContainer", "", "pmvmpeiblj", "I", "ribwqtqdhb", "()I", "composeContainerId", "zynmafqrjb", "vipkmwdibw", "marginAfterDialogCurtain", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SimpleComposeBottomSheetDialogFragment<Model> extends BaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private ComposeView composeContainer;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final int composeContainerId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final int marginAfterDialogCurtain;

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2223iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ View f94247yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f94248zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2223iobyxmoadg(View view, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f94247yggfygwlhe = view;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C2223iobyxmoadg(this.f94247yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f94248zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                jhduphickx.grlcpdaxtj(this.f94247yggfygwlhe, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C2223iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow implements rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SimpleComposeBottomSheetDialogFragment f94249zdlpuopuiu;

            zoijcleaow(SimpleComposeBottomSheetDialogFragment simpleComposeBottomSheetDialogFragment) {
                this.f94249zdlpuopuiu = simpleComposeBottomSheetDialogFragment;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(983622658, i13, -1, "ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment.render.<anonymous>.<anonymous> (SimpleComposeBottomSheetDialogFragment.kt:87)");
                }
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f7471iobyxmoadg;
                wkgbmnqykc wkgbmnqykcVarWflxmlrfwp = androidx.compose.foundation.gestures.iobyxmoadg.wflxmlrfwp(androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(iobyxmoadgVar, b.nufgyqmvbu(null, draadjrbmkVar, 0, 1), null, 2, null), lrnfpwlwnk.wkgbmnqykc(0, draadjrbmkVar, 6, 0), jlmebxxoox.Vertical, false, false, null, null, 60, null);
                SimpleComposeBottomSheetDialogFragment simpleComposeBottomSheetDialogFragment = this.f94249zdlpuopuiu;
                eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVar, 0);
                int iHashCode = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
                wkgbmnqykc wkgbmnqykcVarEablkybsjg = ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarWflxmlrfwp);
                lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = lqeggnwhkg.f127047oxmwwwfdhm;
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVar.draadjrbmk() == null) {
                    nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar.pkzmftpjix();
                if (draadjrbmkVar.lqeggnwhkg()) {
                    draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVar.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
                k31.gxszxtbevo.zoijcleaow(vdvldrhtss.f26487iobyxmoadg, null, draadjrbmkVar, 6, 1);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(simpleComposeBottomSheetDialogFragment.getMarginAfterDialogCurtain()), draadjrbmkVar, 0);
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
                int iHashCode2 = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar.kcexrzcfyt();
                wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
                tg.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar3.iobyxmoadg();
                if (draadjrbmkVar.draadjrbmk() == null) {
                    nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVar.pkzmftpjix();
                if (draadjrbmkVar.lqeggnwhkg()) {
                    draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg2);
                } else {
                    draadjrbmkVar.yggfygwlhe();
                }
                androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg2 = m1.iobyxmoadg(draadjrbmkVar);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
                rgvfuqvkyq rgvfuqvkyqVarZoijcleaow2 = iobyxmoadgVar3.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg2.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg2.yadqdtsiqt(), Integer.valueOf(iHashCode2))) {
                    draadjrbmkVarIobyxmoadg2.jyumaefscl(Integer.valueOf(iHashCode2));
                    draadjrbmkVarIobyxmoadg2.zdlpuopuiu(Integer.valueOf(iHashCode2), rgvfuqvkyqVarZoijcleaow2);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg2, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
                androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
                simpleComposeBottomSheetDialogFragment.jlmebxxoox(simpleComposeBottomSheetDialogFragment.jhduphickx(), draadjrbmkVar, 0);
                draadjrbmkVar.cqumvgiudr();
                draadjrbmkVar.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        iobyxmoadg() {
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1595507751, i13, -1, "ru.myspar.proloyalty.core.base.api.bottomsheet.SimpleComposeBottomSheetDialogFragment.render.<anonymous> (SimpleComposeBottomSheetDialogFragment.kt:79)");
            }
            View view = (View) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(-50176314);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(view);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new C2223iobyxmoadg(view, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, 6);
            Context contextRequireContext = SimpleComposeBottomSheetDialogFragment.this.requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            l41.zoijcleaow.zoijcleaow(p41.ppxfxbqfkf.eablkybsjg(contextRequireContext) ? l41.nufgyqmvbu.Dark : l41.nufgyqmvbu.Light, ezmngbhpjk.nufgyqmvbu.eablkybsjg(983622658, true, new zoijcleaow(SimpleComposeBottomSheetDialogFragment.this), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public SimpleComposeBottomSheetDialogFragment() {
        super(or0.wkgbmnqykc.fragment_compose);
        this.composeContainerId = or0.ppxfxbqfkf.composeContainer;
        this.marginAfterDialogCurtain = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ikoacuggdj(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, SimpleComposeBottomSheetDialogFragment simpleComposeBottomSheetDialogFragment, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(b31.gxszxtbevo.bottom_sheet_background);
            simpleComposeBottomSheetDialogFragment.ulzqkzuiru(viewFindViewById);
        }
    }

    private final void okpsazkaxt(ComposeView composeView) {
        composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1595507751, true, new iobyxmoadg()));
    }

    public abstract Object jhduphickx();

    public abstract void jlmebxxoox(Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13);

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: nw0.ppxfxbqfkf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SimpleComposeBottomSheetDialogFragment.ikoacuggdj(ppxfxbqfkfVar, this, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ComposeView composeView = (ComposeView) view.findViewById(getComposeContainerId());
        this.composeContainer = composeView;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(s.wkgbmnqykc.f7052zoijcleaow);
        }
        ComposeView composeView2 = this.composeContainer;
        if (composeView2 != null) {
            okpsazkaxt(composeView2);
        }
    }

    /* JADX INFO: renamed from: ribwqtqdhb, reason: from getter */
    public int getComposeContainerId() {
        return this.composeContainerId;
    }

    /* JADX INFO: renamed from: vipkmwdibw, reason: from getter */
    public int getMarginAfterDialogCurtain() {
        return this.marginAfterDialogCurtain;
    }
}
