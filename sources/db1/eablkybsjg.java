package db1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.cllcsxoeiz;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

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
            return Boolean.valueOf(obj instanceof p91.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f27396zdlpuopuiu = new zoijcleaow();

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
    public static final cllcsxoeiz eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        cllcsxoeiz cllcsxoeizVarPpxfxbqfkf = cllcsxoeiz.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(cllcsxoeizVarPpxfxbqfkf, "inflate(...)");
        return cllcsxoeizVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((cllcsxoeiz) adapterDelegateViewBinding.ppxfxbqfkf()).f127890zoijcleaow.setOnShowAnswerListener(draadjrbmkVar);
        ((cllcsxoeiz) adapterDelegateViewBinding.ppxfxbqfkf()).f127890zoijcleaow.setOnAnimatedListener(draadjrbmkVar2);
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: db1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ((cllcsxoeiz) iobyxmoadgVar.ppxfxbqfkf()).f127890zoijcleaow.ojitshcjhn((p91.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg(), gc1.wkgbmnqykc.EXPANDED);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc(final draadjrbmk onShowAnswerListener, final draadjrbmk onAnimatedListener) {
        zdlpuopuiu.btonecajqb(onShowAnswerListener, "onShowAnswerListener");
        zdlpuopuiu.btonecajqb(onAnimatedListener, "onAnimatedListener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: db1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: db1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.gxszxtbevo(onShowAnswerListener, onAnimatedListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f27396zdlpuopuiu);
    }
}
