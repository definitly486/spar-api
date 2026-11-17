package ru.myspar.auth.impl.presentation.deleteaccount;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import np.wflxmlrfwp;
import ru.myspar.auth.impl.presentation.deleteaccount.DeleteAccountFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001:B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0007J)\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lru/myspar/auth/impl/presentation/deleteaccount/DeleteAccountFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lnp/wflxmlrfwp;", "Lru/myspar/auth/impl/presentation/deleteaccount/ppxfxbqfkf;", "Lru/myspar/auth/impl/presentation/deleteaccount/wkgbmnqykc;", "Lp42/iobyxmoadg;", "<init>", "()V", "Lgg/wwaezpbzkn;", "ikoacuggdj", "onStart", "onStop", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "msg", "dxjokdxxww", "(Ljava/lang/String;)V", "uiLabel", "vipkmwdibw", "(Lru/myspar/auth/impl/presentation/deleteaccount/wkgbmnqykc;)V", "Lp42/zoijcleaow;", "esjtqupxsv", "Lp42/zoijcleaow;", "jlmebxxoox", "()Lp42/zoijcleaow;", "setSmsRetrievedUtils", "(Lp42/zoijcleaow;)V", "smsRetrievedUtils", "Lru/myspar/auth/impl/presentation/deleteaccount/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "ulzqkzuiru", "()Lru/myspar/auth/impl/presentation/deleteaccount/iobyxmoadg;", "binder", "Lru/myspar/auth/impl/presentation/deleteaccount/eablkybsjg;", "pmvmpeiblj", "Lzs/ppxfxbqfkf;", "ribwqtqdhb", "()Lru/myspar/auth/impl/presentation/deleteaccount/eablkybsjg;", "viewImpl", "Lyo/iobyxmoadg;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "sopmlzcsov", "()Lyo/iobyxmoadg;", "binding", "Lp42/ppxfxbqfkf;", "istkbnxepw", "crxdokpmqz", "()Lp42/ppxfxbqfkf;", "smsReceiver", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteAccountFragment extends Hilt_DeleteAccountFragment<wflxmlrfwp, ru.myspar.auth.impl.presentation.deleteaccount.ppxfxbqfkf, ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc> implements p42.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public p42.zoijcleaow smsRetrievedUtils;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx smsReceiver;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f84566yadqdtsiqt = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(DeleteAccountFragment.class, "viewImpl", "getViewImpl()Lru/myspar/auth/impl/presentation/deleteaccount/DeleteAccountViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(DeleteAccountFragment.class, "binding", "getBinding()Lru/myspar/auth/impl/databinding/FragmentDeleteAccountBinding;", 0))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f84565iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f84572zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84572zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f84572zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f84573yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84574zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84574zdlpuopuiu = iobyxmoadgVar;
            this.f84573yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f84574zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84573yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.deleteaccount.DeleteAccountFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final DeleteAccountFragment iobyxmoadg() {
            return new DeleteAccountFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f84575yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84576zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f84576zdlpuopuiu = fragment;
            this.f84575yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f84575yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f84576zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f84577zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f84577zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f84577zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f84578zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f84578zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f84578zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f84579zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yo.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/auth/impl/databinding/FragmentDeleteAccountBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yo.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yo.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public DeleteAccountFragment() {
        super(uo.ppxfxbqfkf.fragment_delete_account);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: np.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return DeleteAccountFragment.okpsazkaxt(this.f70486zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f84579zdlpuopuiu);
        this.smsReceiver = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: np.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return DeleteAccountFragment.jhduphickx(this.f70477zdlpuopuiu);
            }
        });
    }

    private final p42.ppxfxbqfkf crxdokpmqz() {
        return (p42.ppxfxbqfkf) this.smsReceiver.getValue();
    }

    private final void ikoacuggdj() {
        p42.zoijcleaow zoijcleaowVarJlmebxxoox = jlmebxxoox();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        zoijcleaowVarJlmebxxoox.wkgbmnqykc(oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p42.ppxfxbqfkf jhduphickx(DeleteAccountFragment deleteAccountFragment) {
        return new p42.ppxfxbqfkf(deleteAccountFragment.jlmebxxoox(), new WeakReference(deleteAccountFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg okpsazkaxt(DeleteAccountFragment deleteAccountFragment) {
        return new ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg(new istkbnxepw(deleteAccountFragment) { // from class: ru.myspar.auth.impl.presentation.deleteaccount.DeleteAccountFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((DeleteAccountFragment) this.receiver).sopmlzcsov();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yo.iobyxmoadg sopmlzcsov() {
        return (yo.iobyxmoadg) this.binding.iobyxmoadg(this, f84566yadqdtsiqt[1]);
    }

    @Override // p42.iobyxmoadg
    public void dxjokdxxww(String msg) {
        zdlpuopuiu.btonecajqb(msg, "msg");
        pkzmftpjix().jyumaefscl(new ru.myspar.auth.impl.presentation.deleteaccount.ppxfxbqfkf.eablkybsjg(msg));
    }

    public final p42.zoijcleaow jlmebxxoox() {
        p42.zoijcleaow zoijcleaowVar = this.smsRetrievedUtils;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("smsRetrievedUtils");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == -1 && data != null) {
            pkzmftpjix().jyumaefscl(new ru.myspar.auth.impl.presentation.deleteaccount.ppxfxbqfkf.eablkybsjg(jlmebxxoox().ppxfxbqfkf(data)));
        }
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        if (Build.VERSION.SDK_INT >= 33) {
            oxmwwwfdhmVarRequireActivity.registerReceiver(crxdokpmqz(), jlmebxxoox().eablkybsjg(), 2);
        } else {
            oxmwwwfdhmVarRequireActivity.registerReceiver(crxdokpmqz(), jlmebxxoox().eablkybsjg());
        }
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        requireActivity().unregisterReceiver(crxdokpmqz());
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg hcddaimhww() {
        return (ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg) this.viewImpl.iobyxmoadg(this, f84566yadqdtsiqt[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc.iobyxmoadg) {
            lmojexxdyd(((ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc.zoijcleaow) {
            hcddaimhww().oxmwwwfdhm(sopmlzcsov(), ((ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.auth.impl.presentation.deleteaccount.wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ikoacuggdj();
        }
    }
}
