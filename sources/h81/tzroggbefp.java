package h81;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tzroggbefp {

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
            return Boolean.valueOf(obj instanceof yggfygwlhe.dxjokdxxww);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39875zdlpuopuiu = new zoijcleaow();

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
    public static final c81.btonecajqb eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        c81.btonecajqb btonecajqbVarPpxfxbqfkf = c81.btonecajqb.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btonecajqbVarPpxfxbqfkf, "inflate(...)");
        return btonecajqbVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h81.kegysxyocb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return tzroggbefp.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((c81.btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).getRoot().setText(((yggfygwlhe.dxjokdxxww) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h81.wypolnanlu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return tzroggbefp.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h81.stevsuqkhv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return tzroggbefp.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39875zdlpuopuiu);
    }
}
