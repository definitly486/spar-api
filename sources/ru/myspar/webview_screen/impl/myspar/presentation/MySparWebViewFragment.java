package ru.myspar.webview_screen.impl.myspar.presentation;

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
import ru.myspar.webview_screen.impl.myspar.domain.args.MySparWebViewArgs;
import ru.myspar.webview_screen.impl.myspar.presentation.MySparWebViewFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00010B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/myspar/webview_screen/impl/myspar/presentation/MySparWebViewFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lfb2/iobyxmoadg;", "Lru/myspar/webview_screen/impl/myspar/presentation/zoijcleaow;", "Lfb2/zoijcleaow;", "Le40/iobyxmoadg;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "ribwqtqdhb", "(Lfb2/zoijcleaow;)V", "onResume", "onPause", "onDestroyView", "", "gxszxtbevo", "()Z", "Leb2/iobyxmoadg;", "esjtqupxsv", "Lgg/gtknphoqwx;", "crxdokpmqz", "()Leb2/iobyxmoadg;", "scenario", "Lru/myspar/webview_screen/impl/myspar/presentation/ppxfxbqfkf;", "lereixgezr", "ulzqkzuiru", "()Lru/myspar/webview_screen/impl/myspar/presentation/ppxfxbqfkf;", "binder", "Lru/myspar/webview_screen/impl/myspar/presentation/wkgbmnqykc;", "pmvmpeiblj", "Lzs/ppxfxbqfkf;", "jlmebxxoox", "()Lru/myspar/webview_screen/impl/myspar/presentation/wkgbmnqykc;", "viewImpl", "Lcb2/ppxfxbqfkf;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "sopmlzcsov", "()Lcb2/ppxfxbqfkf;", "binding", "istkbnxepw", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MySparWebViewFragment extends iobyxmoadg implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f104746cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(MySparWebViewFragment.class, "viewImpl", "getViewImpl()Lru/myspar/webview_screen/impl/myspar/presentation/MySparWebViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(MySparWebViewFragment.class, "binding", "getBinding()Lru/myspar/webview_screen/impl/databinding/FragmentWebViewScreenBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f104748yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx scenario;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f104753zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f104753zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f104753zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f104754yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f104755zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f104755zdlpuopuiu = iobyxmoadgVar;
            this.f104754yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f104755zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f104754yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.webview_screen.impl.myspar.presentation.MySparWebViewFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final MySparWebViewFragment iobyxmoadg(MySparWebViewArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (MySparWebViewFragment) b40.iobyxmoadg.zoijcleaow(new MySparWebViewFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f104756yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f104757zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f104757zdlpuopuiu = fragment;
            this.f104756yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f104756yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f104757zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f104758zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f104758zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f104758zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f104759zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f104759zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f104759zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f104760zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, cb2.ppxfxbqfkf.class, "bind", "bind(Landroid/view/View;)Lru/myspar/webview_screen/impl/databinding/FragmentWebViewScreenBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final cb2.ppxfxbqfkf invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return cb2.ppxfxbqfkf.iobyxmoadg(p13);
        }
    }

    public MySparWebViewFragment() {
        super(za2.zoijcleaow.fragment_web_view_screen);
        this.scenario = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fb2.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparWebViewFragment.vipkmwdibw(this.f33400zdlpuopuiu);
            }
        });
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.webview_screen.impl.myspar.presentation.ppxfxbqfkf.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: fb2.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparWebViewFragment.jhduphickx(this.f33404zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f104760zdlpuopuiu);
    }

    private final eb2.iobyxmoadg crxdokpmqz() {
        return (eb2.iobyxmoadg) this.scenario.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc jhduphickx(MySparWebViewFragment mySparWebViewFragment) {
        return new ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc(new istkbnxepw(mySparWebViewFragment) { // from class: ru.myspar.webview_screen.impl.myspar.presentation.MySparWebViewFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((MySparWebViewFragment) this.receiver).sopmlzcsov();
            }
        }, mySparWebViewFragment.crxdokpmqz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cb2.ppxfxbqfkf sopmlzcsov() {
        return (cb2.ppxfxbqfkf) this.binding.iobyxmoadg(this, f104746cdpycssgdh[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eb2.iobyxmoadg vipkmwdibw(MySparWebViewFragment mySparWebViewFragment) {
        return ((MySparWebViewArgs) qs.ppxfxbqfkf.wkgbmnqykc(mySparWebViewFragment, cllcsxoeiz.zoijcleaow(MySparWebViewArgs.class))).getScenario();
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        pkzmftpjix().jyumaefscl(ru.myspar.webview_screen.impl.myspar.presentation.zoijcleaow.iobyxmoadg.f104770iobyxmoadg);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.webview_screen.impl.myspar.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f104746cdpycssgdh[0]);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    public /* bridge */ /* synthetic */ void jpowsppfya(Object obj) {
        yggfygwlhe.iobyxmoadg(obj);
        ribwqtqdhb(null);
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (crxdokpmqz() == eb2.iobyxmoadg.GAMES) {
            sopmlzcsov().f19558ppxfxbqfkf.destroy();
        }
        super.onDestroyView();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        if (crxdokpmqz() == eb2.iobyxmoadg.GAMES) {
            sopmlzcsov().f19558ppxfxbqfkf.evaluateJavascript("onAppPause()", null);
        }
        super.onPause();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (crxdokpmqz() == eb2.iobyxmoadg.GAMES) {
            sopmlzcsov().f19558ppxfxbqfkf.evaluateJavascript("onAppResume()", null);
        }
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (crxdokpmqz() == eb2.iobyxmoadg.GAMES) {
            sopmlzcsov().f19558ppxfxbqfkf.getSettings().setCacheMode(2);
        }
    }

    public void ribwqtqdhb(fb2.zoijcleaow uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public ru.myspar.webview_screen.impl.myspar.presentation.ppxfxbqfkf pkzmftpjix() {
        return (ru.myspar.webview_screen.impl.myspar.presentation.ppxfxbqfkf) this.binder.getValue();
    }
}
