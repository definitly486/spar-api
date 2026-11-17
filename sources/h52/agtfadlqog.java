package h52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.jztzpxfvev;

/* JADX INFO: loaded from: classes6.dex */
public abstract class agtfadlqog {

    public static final class iobyxmoadg extends jyumaefscl implements tg.vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof z52.lqeggnwhkg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39491zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(jztzpxfvev jztzpxfvevVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        jztzpxfvevVar.f65683zoijcleaow.setData(((z52.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.rgvfuqvkyq onBannerClicked) {
        zdlpuopuiu.btonecajqb(onBannerClicked, "onBannerClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: h52.btonecajqb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: h52.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.lqeggnwhkg(onBannerClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f39491zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jztzpxfvev gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        jztzpxfvev jztzpxfvevVarPpxfxbqfkf = jztzpxfvev.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(jztzpxfvevVarPpxfxbqfkf, "inflate(...)");
        return jztzpxfvevVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final jztzpxfvev jztzpxfvevVar = (jztzpxfvev) adapterDelegateViewBinding.ppxfxbqfkf();
        jztzpxfvevVar.f65683zoijcleaow.setListener(new tg.rgvfuqvkyq() { // from class: h52.draadjrbmk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.nufgyqmvbu(rgvfuqvkyqVar, adapterDelegateViewBinding, (mb0.iobyxmoadg) obj, ((Integer) obj2).intValue());
            }
        });
        jztzpxfvevVar.f65683zoijcleaow.setHeaderVisibility(false);
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: h52.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.dxjokdxxww(jztzpxfvevVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, mb0.iobyxmoadg iobyxmoadgVar2, int i13) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar2, "<unused var>");
        rgvfuqvkyqVar.invoke(((z52.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).getItemId(), ((z52.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg().get(i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
