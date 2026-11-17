package jd0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import m60.weqkydbzbr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof ld0.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f51133zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar, ld0.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onDeleteListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteListener, "onDeleteListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: jd0.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: jd0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.lqeggnwhkg(onDeleteListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f51133zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final weqkydbzbr gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        weqkydbzbr weqkydbzbrVarPpxfxbqfkf = weqkydbzbr.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(weqkydbzbrVarPpxfxbqfkf, "inflate(...)");
        return weqkydbzbrVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final weqkydbzbr weqkydbzbrVar = (weqkydbzbr) adapterDelegateViewBinding.ppxfxbqfkf();
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: jd0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.nufgyqmvbu(weqkydbzbrVar, adapterDelegateViewBinding, draadjrbmkVar, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(weqkydbzbr weqkydbzbrVar, ef.iobyxmoadg iobyxmoadgVar, final tg.draadjrbmk draadjrbmkVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        MaterialTextView tvEmptyCards = weqkydbzbrVar.f66058ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvEmptyCards, "tvEmptyCards");
        tvEmptyCards.setVisibility(((ld0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().isEmpty() ? 0 : 8);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(iobyxmoadgVar.wkgbmnqykc());
        flexboxLayoutManager.Y0(1);
        flexboxLayoutManager.X0(0);
        flexboxLayoutManager.Z0(0);
        flexboxLayoutManager.W0(0);
        weqkydbzbrVar.f66059zoijcleaow.setLayoutManager(flexboxLayoutManager);
        weqkydbzbrVar.f66059zoijcleaow.btonecajqb(new jd0.iobyxmoadg());
        jd0.zoijcleaow zoijcleaowVar = new jd0.zoijcleaow(new tg.draadjrbmk() { // from class: jd0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.dxjokdxxww(draadjrbmkVar, (ld0.iobyxmoadg) obj);
            }
        });
        weqkydbzbrVar.f66059zoijcleaow.setAdapter(zoijcleaowVar);
        zoijcleaowVar.wkgbmnqykc(((ld0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
