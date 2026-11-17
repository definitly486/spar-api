package ru.myspar.proloyalty.story.impl.presentation;

import android.R;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.lmojexxdyd;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import b31.agtfadlqog;
import ezmngbhpjk.nufgyqmvbu;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import ru.myspar.proloyalty.story.impl.presentation.StoryFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import v1.g;
import v1.oipsdeybqn;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/story/impl/presentation/StoryFragment;", "Lru/myspar/proloyalty/core/base/mvi/dialog/BaseComposeMviDialogFragment;", "Lru/myspar/proloyalty/story/impl/presentation/ppxfxbqfkf;", "Lru/myspar/proloyalty/story/impl/presentation/zoijcleaow;", "Lru/myspar/proloyalty/story/impl/presentation/wkgbmnqykc;", "Lj21/iobyxmoadg;", "<init>", "()V", "", "gxszxtbevo", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "uiLabel", "ulzqkzuiru", "(Lru/myspar/proloyalty/story/impl/presentation/wkgbmnqykc;)V", CommonUrlParts.MODEL, "kegysxyocb", "(Lru/myspar/proloyalty/story/impl/presentation/ppxfxbqfkf;Landroidx/compose/runtime/draadjrbmk;I)V", "Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;", "lereixgezr", "Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;", "ntlheqmsrt", "()Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;", "setMediaSourceFactory", "(Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;)V", "mediaSourceFactory", "Lru/myspar/proloyalty/story/impl/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "mbcevpiqjq", "()Lru/myspar/proloyalty/story/impl/presentation/iobyxmoadg;", "binder", "zynmafqrjb", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StoryFragment extends Hilt_StoryFragment<ru.myspar.proloyalty.story.impl.presentation.ppxfxbqfkf, ru.myspar.proloyalty.story.impl.presentation.zoijcleaow, ru.myspar.proloyalty.story.impl.presentation.wkgbmnqykc> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public oxmwwwfdhm.iobyxmoadg mediaSourceFactory;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f101646istkbnxepw = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f101650zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101650zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f101650zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f101651yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f101652zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101652zdlpuopuiu = iobyxmoadgVar;
            this.f101651yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f101652zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f101651yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.StoryFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final StoryFragment iobyxmoadg(StoryPayload args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (StoryFragment) g21.iobyxmoadg.iobyxmoadg(new StoryFragment(), args, false);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f101653yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f101654zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101654zdlpuopuiu = fragment;
            this.f101653yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f101653yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f101654zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f101655zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f101655zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f101655zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f101656zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f101656zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f101656zdlpuopuiu.invoke();
        }
    }

    static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ StoryFragment f101657yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.story.impl.presentation.ppxfxbqfkf f101658zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, StoryFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((ru.myspar.proloyalty.story.impl.presentation.zoijcleaow) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(ru.myspar.proloyalty.story.impl.presentation.zoijcleaow p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                ((StoryFragment) this.receiver).hcddaimhww(p13);
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.StoryFragment$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        /* synthetic */ class C2441zoijcleaow extends kotlin.jvm.internal.iobyxmoadg implements draadjrbmk {
            C2441zoijcleaow(Object obj) {
                super(1, obj, kr0.wkgbmnqykc.class, "logError", "logError(Ljava/lang/Throwable;[Lru/myspar/proloyalty/services/crash_logger/api/CrashlyticsKey;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((Throwable) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(Throwable p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                ((kr0.wkgbmnqykc) this.f60022zdlpuopuiu).gxszxtbevo(p13, new CrashlyticsKey[0]);
            }
        }

        zoijcleaow(ru.myspar.proloyalty.story.impl.presentation.ppxfxbqfkf ppxfxbqfkfVar, StoryFragment storyFragment) {
            this.f101658zdlpuopuiu = ppxfxbqfkfVar;
            this.f101657yggfygwlhe = storyFragment;
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
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(437486494, i13, -1, "ru.myspar.proloyalty.story.impl.presentation.StoryFragment.Render.<anonymous> (StoryFragment.kt:88)");
            }
            ru.myspar.proloyalty.story.impl.presentation.ppxfxbqfkf ppxfxbqfkfVar = this.f101658zdlpuopuiu;
            StoryFragment storyFragment = this.f101657yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(1409388275);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(storyFragment);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(storyFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            draadjrbmk draadjrbmkVar2 = (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt);
            kr0.wkgbmnqykc wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
            draadjrbmkVar.sopmlzcsov(1409389497);
            boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(wkgbmnqykcVar);
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new C2441zoijcleaow(wkgbmnqykcVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            xt1.eablkybsjg.eablkybsjg(ppxfxbqfkfVar, draadjrbmkVar2, (draadjrbmk) objYadqdtsiqt2, draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public StoryFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(StoryFragment storyFragment, ru.myspar.proloyalty.story.impl.presentation.ppxfxbqfkf ppxfxbqfkfVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        storyFragment.pkzmftpjix(ppxfxbqfkfVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        hcddaimhww(ru.myspar.proloyalty.story.impl.presentation.zoijcleaow.iobyxmoadg.f101693iobyxmoadg);
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.dialog.BaseComposeMviDialogFragment
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public void pkzmftpjix(final ru.myspar.proloyalty.story.impl.presentation.ppxfxbqfkf model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-833695650);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-833695650, i14, -1, "ru.myspar.proloyalty.story.impl.presentation.StoryFragment.Render (StoryFragment.kt:84)");
            }
            lmojexxdyd.ppxfxbqfkf(wt1.gxszxtbevo.ppxfxbqfkf().wkgbmnqykc(ntlheqmsrt()), nufgyqmvbu.eablkybsjg(437486494, true, new zoijcleaow(model, this), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, b.f5523dxjokdxxww | 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: wt1.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return StoryFragment.tzroggbefp(this.f120627zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.dialog.BaseComposeMviDialogFragment
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg jpowsppfya() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final oxmwwwfdhm.iobyxmoadg ntlheqmsrt() {
        oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = this.mediaSourceFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("mediaSourceFactory");
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, agtfadlqog.EdgeToEdgeDialogTheme);
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
        window.setDimAmount(0.0f);
        window.setBackgroundDrawableResource(R.color.transparent);
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
        gVarIobyxmoadg.ppxfxbqfkf(true);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.dialog.BaseComposeMviDialogFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public void hkdspvbjdz(ru.myspar.proloyalty.story.impl.presentation.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.story.impl.presentation.wkgbmnqykc.iobyxmoadg) {
            dismiss();
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.story.impl.presentation.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ylkuphrtab(((ru.myspar.proloyalty.story.impl.presentation.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
        }
    }
}
