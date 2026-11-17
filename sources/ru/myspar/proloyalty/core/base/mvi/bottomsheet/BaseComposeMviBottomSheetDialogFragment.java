package ru.myspar.proloyalty.core.base.mvi.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.nufgyqmvbu;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.b;
import androidx.compose.ui.platform.s;
import androidx.compose.ui.wkgbmnqykc;
import com.google.android.material.bottomsheet.ppxfxbqfkf;
import czzsidtyhn.eablkybsjg;
import czzsidtyhn.wflxmlrfwp;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import ikoacuggdj.lrnfpwlwnk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import jztzpxfvev.jlmebxxoox;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import pj.cllcsxoeiz;
import pr0.zoijcleaow;
import ru.myspar.proloyalty.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import v1.jhduphickx;
import x.zynmafqrjb;
import z.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00028\u0002H&¢\u0006\u0004\b\u001f\u0010\u001aR\u001a\u0010%\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R2\u0010)\u001a \u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/myspar/proloyalty/core/base/mvi/bottomsheet/BaseComposeMviBottomSheetDialogFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/proloyalty/core/base/api/bottomsheet/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "view", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "event", "ribwqtqdhb", "(Ljava/lang/Object;)V", CommonUrlParts.MODEL, "jlmebxxoox", "(Ljava/lang/Object;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "ikoacuggdj", "", "lereixgezr", "I", "jhduphickx", "()I", "verticalSpacerAfterCurtain", "Lpr0/zoijcleaow;", "vipkmwdibw", "()Lpr0/zoijcleaow;", "binder", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseComposeMviBottomSheetDialogFragment<Model, Event, UiLabel> extends BaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final int verticalSpacerAfterCurtain;

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ BaseComposeMviBottomSheetDialogFragment f94252yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f94253zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2224iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ View f94254yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f94255zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2224iobyxmoadg(View view, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f94254yggfygwlhe = view;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C2224iobyxmoadg(this.f94254yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f94255zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                jhduphickx.grlcpdaxtj(this.f94254yggfygwlhe, null);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C2224iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf implements vdvldrhtss {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ BaseComposeMviBottomSheetDialogFragment f94256zdlpuopuiu;

            ppxfxbqfkf(BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragment) {
                this.f94256zdlpuopuiu = baseComposeMviBottomSheetDialogFragment;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                iobyxmoadg(obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object it, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                int i14;
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                if ((i13 & 6) == 0) {
                    i14 = i13 | ((i13 & 8) == 0 ? draadjrbmkVar.ulzqkzuiru(it) : draadjrbmkVar.lmojexxdyd(it) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                if ((i14 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(630666494, i14, -1, "ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (BaseComposeMviBottomSheetDialogFragment.kt:77)");
                }
                wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.f7471iobyxmoadg;
                wkgbmnqykc wkgbmnqykcVarWflxmlrfwp = androidx.compose.foundation.gestures.iobyxmoadg.wflxmlrfwp(androidx.compose.ui.input.nestedscroll.iobyxmoadg.zoijcleaow(iobyxmoadgVar, b.nufgyqmvbu(null, draadjrbmkVar, 0, 1), null, 2, null), lrnfpwlwnk.wkgbmnqykc(0, draadjrbmkVar, 6, 0), jlmebxxoox.Vertical, false, false, null, null, 60, null);
                BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragment = this.f94256zdlpuopuiu;
                eablkybsjg.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = eablkybsjg.f26292iobyxmoadg.dxjokdxxww();
                a.eablkybsjg.iobyxmoadg iobyxmoadgVar2 = a.eablkybsjg.f20iobyxmoadg;
                zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(wflxmlrfwpVarDxjokdxxww, iobyxmoadgVar2.gtknphoqwx(), draadjrbmkVar, 0);
                int iHashCode = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
                wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarWflxmlrfwp);
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
                k31.gxszxtbevo.zoijcleaow(czzsidtyhn.vdvldrhtss.f26487iobyxmoadg, null, draadjrbmkVar, 6, 1);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(baseComposeMviBottomSheetDialogFragment.getVerticalSpacerAfterCurtain()), draadjrbmkVar, 0);
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(iobyxmoadgVar2.ojitshcjhn(), false);
                int iHashCode2 = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVar.kcexrzcfyt();
                wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, iobyxmoadgVar);
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
                baseComposeMviBottomSheetDialogFragment.jlmebxxoox(it, draadjrbmkVar, i14 & 14);
                draadjrbmkVar.cqumvgiudr();
                draadjrbmkVar.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
            }
        }

        /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            zoijcleaow(Object obj) {
                super(1, obj, BaseComposeMviBottomSheetDialogFragment.class, "handleUiLabel", "handleUiLabel(Ljava/lang/Object;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((BaseComposeMviBottomSheetDialogFragment) this.receiver).ikoacuggdj(p13);
            }
        }

        iobyxmoadg(View view, BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragment) {
            this.f94253zdlpuopuiu = view;
            this.f94252yggfygwlhe = baseComposeMviBottomSheetDialogFragment;
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
                jyumaefscl.ntlheqmsrt(1436420415, i13, -1, "ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous> (BaseComposeMviBottomSheetDialogFragment.kt:69)");
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(217070238);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f94253zdlpuopuiu);
            View view = this.f94253zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new C2224iobyxmoadg(view, null);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(wwaezpbzknVar, (rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, 6);
            pr0.zoijcleaow zoijcleaowVarVipkmwdibw = this.f94252yggfygwlhe.vipkmwdibw();
            BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragment = this.f94252yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(217076398);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(baseComposeMviBottomSheetDialogFragment);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new zoijcleaow(baseComposeMviBottomSheetDialogFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            rw0.zoijcleaow.zoijcleaow(zoijcleaowVarVipkmwdibw, (tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt2), ezmngbhpjk.nufgyqmvbu.eablkybsjg(630666494, true, new ppxfxbqfkf(this.f94252yggfygwlhe), draadjrbmkVar, 54), draadjrbmkVar, pr0.zoijcleaow.f77194dxjokdxxww | 384);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public BaseComposeMviBottomSheetDialogFragment() {
        super(or0.wkgbmnqykc.fragment_compose);
        this.verticalSpacerAfterCurtain = 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void okpsazkaxt(ppxfxbqfkf ppxfxbqfkfVar, BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragment, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(b31.gxszxtbevo.bottom_sheet_background);
            baseComposeMviBottomSheetDialogFragment.ulzqkzuiru(viewFindViewById);
        }
    }

    public abstract void ikoacuggdj(Object uiLabel);

    /* JADX INFO: renamed from: jhduphickx, reason: from getter */
    public int getVerticalSpacerAfterCurtain() {
        return this.verticalSpacerAfterCurtain;
    }

    public abstract void jlmebxxoox(Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13);

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qw0.iobyxmoadg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BaseComposeMviBottomSheetDialogFragment.okpsazkaxt(ppxfxbqfkfVar, this, dialogInterface);
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
        ComposeView composeView = (ComposeView) view.findViewById(or0.ppxfxbqfkf.composeContainer);
        composeView.removeAllViews();
        composeView.setViewCompositionStrategy(s.wkgbmnqykc.f7052zoijcleaow);
        composeView.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1436420415, true, new iobyxmoadg(view, this)));
    }

    public final void ribwqtqdhb(Object event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        vipkmwdibw().jyumaefscl(event);
    }

    protected abstract zoijcleaow vipkmwdibw();
}
