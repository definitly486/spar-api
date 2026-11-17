package ru.myspar.proloyalty.webview_screen.impl.myspar.presentation;

import ah.gtknphoqwx;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.yggfygwlhe;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewArgs;
import ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.MySparWebViewFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00010B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/MySparWebViewFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lcx1/iobyxmoadg;", "Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/zoijcleaow;", "Lcx1/zoijcleaow;", "Lj21/iobyxmoadg;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "vipkmwdibw", "(Lcx1/zoijcleaow;)V", "onResume", "onPause", "onDestroyView", "", "gxszxtbevo", "()Z", "Lru/myspar/proloyalty/webview_screen/impl/myspar/domain/args/MySparWebViewArgs;", "esjtqupxsv", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/proloyalty/webview_screen/impl/myspar/domain/args/MySparWebViewArgs;", "args", "Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/ppxfxbqfkf;", "lereixgezr", "crxdokpmqz", "()Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/ppxfxbqfkf;", "binder", "Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/wkgbmnqykc;", "pmvmpeiblj", "Ltr0/ppxfxbqfkf;", "ribwqtqdhb", "()Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/wkgbmnqykc;", "viewImpl", "Lax1/ppxfxbqfkf;", "zynmafqrjb", "Lsr0/ppxfxbqfkf;", "jlmebxxoox", "()Lax1/ppxfxbqfkf;", "binding", "istkbnxepw", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MySparWebViewFragment extends iobyxmoadg implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f102105cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(MySparWebViewFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/webview_screen/impl/myspar/presentation/MySparWebViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(MySparWebViewFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/webview_screen/impl/databinding/FragmentWebViewScreenProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f102107yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx args;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f102112zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102112zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f102112zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f102113yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102114zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102114zdlpuopuiu = iobyxmoadgVar;
            this.f102113yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f102114zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102113yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.MySparWebViewFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final MySparWebViewFragment iobyxmoadg(MySparWebViewArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (MySparWebViewFragment) g21.iobyxmoadg.zoijcleaow(new MySparWebViewFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f102115yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102116zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102116zdlpuopuiu = fragment;
            this.f102115yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102115yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f102116zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102117zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f102117zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f102117zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102118zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f102118zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f102118zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f102119zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, ax1.ppxfxbqfkf.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/webview_screen/impl/databinding/FragmentWebViewScreenProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ax1.ppxfxbqfkf invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ax1.ppxfxbqfkf.iobyxmoadg(p13);
        }
    }

    public MySparWebViewFragment() {
        super(xw1.zoijcleaow.fragment_web_view_screen_proloyalty);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: cx1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparWebViewFragment.ulzqkzuiru(this.f26106zdlpuopuiu);
            }
        });
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.ppxfxbqfkf.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: cx1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparWebViewFragment.jhduphickx(this.f26111zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f102119zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc jhduphickx(MySparWebViewFragment mySparWebViewFragment) {
        return new ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc(new istkbnxepw(mySparWebViewFragment) { // from class: ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.MySparWebViewFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((MySparWebViewFragment) this.receiver).jlmebxxoox();
            }
        }, mySparWebViewFragment.sopmlzcsov().getScenario(), mySparWebViewFragment.sopmlzcsov().getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ax1.ppxfxbqfkf jlmebxxoox() {
        return (ax1.ppxfxbqfkf) this.binding.iobyxmoadg(this, f102105cdpycssgdh[1]);
    }

    private final MySparWebViewArgs sopmlzcsov() {
        return (MySparWebViewArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MySparWebViewArgs ulzqkzuiru(MySparWebViewFragment mySparWebViewFragment) {
        return (MySparWebViewArgs) jr0.zoijcleaow.wkgbmnqykc(mySparWebViewFragment, cllcsxoeiz.zoijcleaow(MySparWebViewArgs.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.ppxfxbqfkf pkzmftpjix() {
        return (ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.ppxfxbqfkf) this.binder.getValue();
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.zoijcleaow.iobyxmoadg.f102130iobyxmoadg);
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    public /* bridge */ /* synthetic */ void jpowsppfya(Object obj) {
        yggfygwlhe.iobyxmoadg(obj);
        vipkmwdibw(null);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (sopmlzcsov().getScenario() == ww1.iobyxmoadg.GAMES) {
            jlmebxxoox().f14723ppxfxbqfkf.destroy();
        }
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        if (sopmlzcsov().getScenario() == ww1.iobyxmoadg.GAMES) {
            jlmebxxoox().f14723ppxfxbqfkf.evaluateJavascript("onAppPause()", null);
        }
        super.onPause();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (sopmlzcsov().getScenario() == ww1.iobyxmoadg.GAMES) {
            jlmebxxoox().f14723ppxfxbqfkf.evaluateJavascript("onAppResume()", null);
        }
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (sopmlzcsov().getScenario() == ww1.iobyxmoadg.GAMES) {
            jlmebxxoox().f14723ppxfxbqfkf.getSettings().setCacheMode(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f102105cdpycssgdh[0]);
    }

    public void vipkmwdibw(cx1.zoijcleaow uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
    }
}
