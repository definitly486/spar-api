package ta0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lj.btonecajqb;
import lj.wflxmlrfwp;
import m60.ikoacuggdj;
import nb0.gxszxtbevo;
import ru.myspar.legacy.presentation.view.myspar.MySparFeature;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
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
            return Boolean.valueOf(obj instanceof gxszxtbevo);
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f110149yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f110150zdlpuopuiu;

        public static final class iobyxmoadg implements draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f110151zdlpuopuiu = new iobyxmoadg();

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof nb0.zoijcleaow);
            }
        }

        public ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, ef.iobyxmoadg iobyxmoadgVar2) {
            this.f110150zdlpuopuiu = iobyxmoadgVar;
            this.f110149yggfygwlhe = iobyxmoadgVar2;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((List) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(List payloads) {
            zdlpuopuiu.btonecajqb(payloads, "payloads");
            btonecajqb btonecajqbVarIstkbnxepw = wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(payloads), iobyxmoadg.f110151zdlpuopuiu);
            zdlpuopuiu.nufgyqmvbu(btonecajqbVarIstkbnxepw, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Object objLmojexxdyd = wflxmlrfwp.lmojexxdyd(btonecajqbVarIstkbnxepw);
            if (objLmojexxdyd == null) {
                wkgbmnqykc.btonecajqb(this.f110150zdlpuopuiu);
            } else {
                wkgbmnqykc.gtknphoqwx(this.f110149yggfygwlhe, (nb0.zoijcleaow) objLmojexxdyd);
            }
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f110152zdlpuopuiu = new zoijcleaow();

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
        MySparFeature mySparFeature = ((ikoacuggdj) iobyxmoadgVar.ppxfxbqfkf()).f65576zoijcleaow;
        mySparFeature.setButtonImage(((gxszxtbevo) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        zdlpuopuiu.lqeggnwhkg(mySparFeature);
        draadjrbmk(mySparFeature, ((gxszxtbevo) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
    }

    private static final void draadjrbmk(MySparFeature mySparFeature, nb0.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof nb0.zoijcleaow.C1496zoijcleaow) {
            mySparFeature.setBadgeIsVisible(false);
            mySparFeature.setBadgeCount(0);
        } else {
            if (!(zoijcleaowVar instanceof nb0.zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            mySparFeature.setBadgeIsVisible(true);
            mySparFeature.setBadgeCount(((nb0.zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyqVar.invoke(iobyxmoadgVar.eablkybsjg(), Integer.valueOf(iobyxmoadgVar.getAdapterPosition()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, nb0.zoijcleaow zoijcleaowVar) {
        MySparFeature btnSpar = ((ikoacuggdj) iobyxmoadgVar.ppxfxbqfkf()).f65576zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btnSpar, "btnSpar");
        draadjrbmk(btnSpar, ((gxszxtbevo) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg());
    }

    public static final df.zoijcleaow gxszxtbevo(final rgvfuqvkyq onFeatureClicked) {
        zdlpuopuiu.btonecajqb(onFeatureClicked, "onFeatureClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ta0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wkgbmnqykc.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: ta0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.nufgyqmvbu(onFeatureClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f110152zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ikoacuggdj lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup parent) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(parent, "parent");
        ikoacuggdj ikoacuggdjVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf(layoutInflater, parent, false);
        zdlpuopuiu.dxjokdxxww(ikoacuggdjVarPpxfxbqfkf, "inflate(...)");
        return ikoacuggdjVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((ikoacuggdj) adapterDelegateViewBinding.ppxfxbqfkf()).f65576zoijcleaow.setOnFeatureBannerClickListener(new tg.iobyxmoadg() { // from class: ta0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return wkgbmnqykc.dxjokdxxww(rgvfuqvkyqVar, adapterDelegateViewBinding);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new ppxfxbqfkf(adapterDelegateViewBinding, adapterDelegateViewBinding));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
