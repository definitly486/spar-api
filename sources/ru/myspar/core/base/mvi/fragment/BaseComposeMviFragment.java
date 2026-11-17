package ru.myspar.core.base.mvi.fragment;

import ah.lqeggnwhkg;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s;
import androidx.core.content.zoijcleaow;
import ezmngbhpjk.nufgyqmvbu;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import ru.myspar.core.base.api.fragment.BaseFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import vs.ppxfxbqfkf;
import vs.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J!\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0002H&¢\u0006\u0004\b\u001c\u0010\u0017R2\u0010 \u001a \u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001d8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/myspar/core/base/mvi/fragment/BaseComposeMviFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/core/base/api/fragment/BaseFragment;", "<init>", "()V", "Lgg/wwaezpbzkn;", "jpowsppfya", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "", "isHidden", "onHiddenChanged", "(Z)V", "event", "ylkuphrtab", "(Ljava/lang/Object;)V", CommonUrlParts.MODEL, "wwaezpbzkn", "(Ljava/lang/Object;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "hcddaimhww", "Lws/zoijcleaow;", "pkzmftpjix", "()Lws/zoijcleaow;", "binder", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseComposeMviFragment<Model, Event, UiLabel> extends BaseFragment {

    static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        /* synthetic */ class C1993iobyxmoadg extends vdvldrhtss implements draadjrbmk {
            C1993iobyxmoadg(Object obj) {
                super(1, obj, BaseComposeMviFragment.class, "handleUiLabel", "handleUiLabel(Ljava/lang/Object;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg(obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                ((BaseComposeMviFragment) this.receiver).hcddaimhww(p13);
            }
        }

        static final class zoijcleaow implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ BaseComposeMviFragment f86573zdlpuopuiu;

            zoijcleaow(BaseComposeMviFragment baseComposeMviFragment) {
                this.f86573zdlpuopuiu = baseComposeMviFragment;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                iobyxmoadg(obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Object model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                zdlpuopuiu.btonecajqb(model, "model");
                if ((i13 & 6) == 0) {
                    i13 |= (i13 & 8) == 0 ? draadjrbmkVar.ulzqkzuiru(model) : draadjrbmkVar.lmojexxdyd(model) ? 4 : 2;
                }
                if ((i13 & 19) == 18 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1840370509, i13, -1, "ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (BaseComposeMviFragment.kt:31)");
                }
                this.f86573zdlpuopuiu.wwaezpbzkn(model, draadjrbmkVar, i13 & 14);
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
                jyumaefscl.ntlheqmsrt(-763304204, i13, -1, "ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment.onViewCreated.<anonymous>.<anonymous> (BaseComposeMviFragment.kt:28)");
            }
            ws.zoijcleaow zoijcleaowVarPkzmftpjix = BaseComposeMviFragment.this.pkzmftpjix();
            BaseComposeMviFragment baseComposeMviFragment = BaseComposeMviFragment.this;
            draadjrbmkVar.sopmlzcsov(430814891);
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(baseComposeMviFragment);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new C1993iobyxmoadg(baseComposeMviFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            ux.zoijcleaow.zoijcleaow(zoijcleaowVarPkzmftpjix, (draadjrbmk) ((lqeggnwhkg) objYadqdtsiqt), nufgyqmvbu.eablkybsjg(-1840370509, true, new zoijcleaow(BaseComposeMviFragment.this), draadjrbmkVar, 54), draadjrbmkVar, ws.zoijcleaow.f120553dxjokdxxww | 384);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public BaseComposeMviFragment() {
        super(wkgbmnqykc.fragment_compose);
    }

    private final void jpowsppfya() {
        zoijcleaow zoijcleaowVarRequireActivity = requireActivity();
        sx.zoijcleaow zoijcleaowVar = zoijcleaowVarRequireActivity instanceof sx.zoijcleaow ? (sx.zoijcleaow) zoijcleaowVarRequireActivity : null;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this);
        }
    }

    public abstract void hcddaimhww(Object uiLabel);

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        if (isVisible()) {
            jpowsppfya();
        }
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (isHidden()) {
            return;
        }
        jpowsppfya();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ComposeView composeView = (ComposeView) view.findViewById(ppxfxbqfkf.composeContainer);
        composeView.removeAllViews();
        composeView.setViewCompositionStrategy(s.wkgbmnqykc.f7052zoijcleaow);
        composeView.setContent(nufgyqmvbu.ppxfxbqfkf(-763304204, true, new iobyxmoadg()));
    }

    protected abstract ws.zoijcleaow pkzmftpjix();

    public abstract void wwaezpbzkn(Object obj, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13);

    public final void ylkuphrtab(Object event) {
        zdlpuopuiu.btonecajqb(event, "event");
        pkzmftpjix().jyumaefscl(event);
    }
}
