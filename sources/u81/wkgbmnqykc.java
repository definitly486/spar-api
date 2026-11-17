package u81;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lj.btonecajqb;
import lj.wflxmlrfwp;
import m91.nufgyqmvbu;
import ru.myspar.proloyalty.legacy.presentation.view.myspar.MySparFeature;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.mbcevpiqjq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof nufgyqmvbu);
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f113015yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f113016zdlpuopuiu;

        public static final class iobyxmoadg implements draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f113017zdlpuopuiu = new iobyxmoadg();

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof m91.zoijcleaow);
            }
        }

        public ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, ef.iobyxmoadg iobyxmoadgVar2) {
            this.f113016zdlpuopuiu = iobyxmoadgVar;
            this.f113015yggfygwlhe = iobyxmoadgVar2;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((List) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(List payloads) {
            zdlpuopuiu.btonecajqb(payloads, "payloads");
            btonecajqb btonecajqbVarIstkbnxepw = wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(payloads), iobyxmoadg.f113017zdlpuopuiu);
            zdlpuopuiu.nufgyqmvbu(btonecajqbVarIstkbnxepw, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Object objLmojexxdyd = wflxmlrfwp.lmojexxdyd(btonecajqbVarIstkbnxepw);
            if (objLmojexxdyd == null) {
                wkgbmnqykc.btonecajqb(this.f113016zdlpuopuiu);
            } else {
                wkgbmnqykc.gtknphoqwx(this.f113015yggfygwlhe, (m91.zoijcleaow) objLmojexxdyd);
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f113018zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar) {
        MySparFeature mySparFeature = ((mbcevpiqjq) iobyxmoadgVar.ppxfxbqfkf()).f128259zoijcleaow;
        mySparFeature.setButtonImage(((nufgyqmvbu) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        zdlpuopuiu.lqeggnwhkg(mySparFeature);
        draadjrbmk(mySparFeature, ((nufgyqmvbu) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
    }

    private static final void draadjrbmk(MySparFeature mySparFeature, m91.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof m91.zoijcleaow.C1377zoijcleaow) {
            mySparFeature.setBadgeIsVisible(false);
            mySparFeature.setBadgeCount(0);
        } else {
            if (!(zoijcleaowVar instanceof m91.zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            mySparFeature.setBadgeIsVisible(true);
            mySparFeature.setBadgeCount(((m91.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.eablkybsjg(), Integer.valueOf(iobyxmoadgVar.getAdapterPosition()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, m91.zoijcleaow zoijcleaowVar) {
        MySparFeature btnSpar = ((mbcevpiqjq) iobyxmoadgVar.ppxfxbqfkf()).f128259zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnSpar, "btnSpar");
        draadjrbmk(btnSpar, ((nufgyqmvbu) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
    }

    public static final df.zoijcleaow gxszxtbevo(final rgvfuqvkyq onFeatureClicked) {
        zdlpuopuiu.btonecajqb(onFeatureClicked, "onFeatureClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: u81.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: u81.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.nufgyqmvbu(onFeatureClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f113018zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mbcevpiqjq lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup parent) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(parent, "parent");
        mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf = mbcevpiqjq.ppxfxbqfkf(layoutInflater, parent, false);
        zdlpuopuiu.dxjokdxxww(mbcevpiqjqVarPpxfxbqfkf, "inflate(...)");
        return mbcevpiqjqVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((mbcevpiqjq) adapterDelegateViewBinding.ppxfxbqfkf()).f128259zoijcleaow.setOnFeatureBannerClickListener(new tg.iobyxmoadg() { // from class: u81.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.dxjokdxxww(rgvfuqvkyqVar, adapterDelegateViewBinding);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new ppxfxbqfkf(adapterDelegateViewBinding, adapterDelegateViewBinding));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
