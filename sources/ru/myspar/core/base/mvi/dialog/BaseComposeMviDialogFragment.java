package ru.myspar.core.base.mvi.dialog;

import ah.lqeggnwhkg;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import ezmngbhpjk.nufgyqmvbu;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import ru.myspar.core.base.api.dialog.BaseDialogFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import vs.ppxfxbqfkf;
import vs.wkgbmnqykc;
import ws.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u0002H&¢\u0006\u0004\b\u0016\u0010\u0011R2\u0010\u001a\u001a \u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00178$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/myspar/core/base/mvi/dialog/BaseComposeMviDialogFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/core/base/api/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "event", "hcddaimhww", "(Ljava/lang/Object;)V", CommonUrlParts.MODEL, "pkzmftpjix", "(Ljava/lang/Object;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "hkdspvbjdz", "Lws/zoijcleaow;", "jpowsppfya", "()Lws/zoijcleaow;", "binder", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseComposeMviDialogFragment<Model, Event, UiLabel> extends BaseDialogFragment {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: ru.myspar.core.base.mvi.dialog.BaseComposeMviDialogFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        /* synthetic */ class C1991iobyxmoadg extends vdvldrhtss implements draadjrbmk {
            C1991iobyxmoadg(Object obj) {
                super(1, obj, BaseComposeMviDialogFragment.class, "handleUiLabel", "handleUiLabel(Ljava/lang/Object;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                ((BaseComposeMviDialogFragment) this.receiver).hkdspvbjdz(p13);
            }
        }

        static final class zoijcleaow implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ BaseComposeMviDialogFragment f86548zdlpuopuiu;

            zoijcleaow(BaseComposeMviDialogFragment baseComposeMviDialogFragment) {
                this.f86548zdlpuopuiu = baseComposeMviDialogFragment;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                iobyxmoadg(obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object it, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                zdlpuopuiu.btonecajqb(it, "it");
                if ((i13 & 6) == 0) {
                    i13 |= (i13 & 8) == 0 ? draadjrbmkVar.ulzqkzuiru(it) : draadjrbmkVar.lmojexxdyd(it) ? 4 : 2;
                }
                if ((i13 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-437238661, i13, -1, "ru.myspar.core.base.mvi.dialog.BaseComposeMviDialogFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (BaseComposeMviDialogFragment.kt:29)");
                }
                this.f86548zdlpuopuiu.pkzmftpjix(it, draadjrbmkVar, i13 & 14);
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
                jyumaefscl.ntlheqmsrt(127132028, i13, -1, "ru.myspar.core.base.mvi.dialog.BaseComposeMviDialogFragment.onViewCreated.<anonymous>.<anonymous> (BaseComposeMviDialogFragment.kt:26)");
            }
            ws.zoijcleaow zoijcleaowVarJpowsppfya = BaseComposeMviDialogFragment.this.jpowsppfya();
            BaseComposeMviDialogFragment baseComposeMviDialogFragment = BaseComposeMviDialogFragment.this;
            draadjrbmkVar.sopmlzcsov(-427828645);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(baseComposeMviDialogFragment);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new C1991iobyxmoadg(baseComposeMviDialogFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            ux.zoijcleaow.zoijcleaow(zoijcleaowVarJpowsppfya, (draadjrbmk) ((lqeggnwhkg) objYadqdtsiqt), nufgyqmvbu.eablkybsjg(-437238661, true, new zoijcleaow(BaseComposeMviDialogFragment.this), draadjrbmkVar, 54), draadjrbmkVar, ws.zoijcleaow.f120553dxjokdxxww | 384);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public BaseComposeMviDialogFragment() {
        super(wkgbmnqykc.fragment_compose);
    }

    public final void hcddaimhww(Object event) {
        zdlpuopuiu.btonecajqb(event, "event");
        jpowsppfya().jyumaefscl(event);
    }

    public abstract void hkdspvbjdz(Object uiLabel);

    protected abstract zoijcleaow jpowsppfya();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ComposeView composeView = (ComposeView) view.findViewById(ppxfxbqfkf.composeContainer);
        composeView.removeAllViews();
        composeView.setViewCompositionStrategy(s.wkgbmnqykc.f7052zoijcleaow);
        composeView.setContent(nufgyqmvbu.ppxfxbqfkf(127132028, true, new iobyxmoadg()));
    }

    public abstract void pkzmftpjix(Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13);
}
