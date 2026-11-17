package s52;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import b52.cqumvgiudr;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class agtfadlqog {

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
            return Boolean.valueOf(obj instanceof q62.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f105578zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn btonecajqb(cqumvgiudr cqumvgiudrVar, ef.iobyxmoadg iobyxmoadgVar, List payload) {
        zdlpuopuiu.btonecajqb(payload, "payload");
        if (payload.isEmpty()) {
            cqumvgiudrVar.f15291zoijcleaow.setData(((q62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        } else {
            nufgyqmvbu(cqumvgiudrVar, iobyxmoadgVar, payload);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar, q62.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        rgvfuqvkyqVar.invoke(((q62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).getItemId(), it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final rgvfuqvkyq questionClickListener) {
        zdlpuopuiu.btonecajqb(questionClickListener, "questionClickListener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: s52.btonecajqb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: s52.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.lqeggnwhkg(questionClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f105578zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cqumvgiudr gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        cqumvgiudr cqumvgiudrVarPpxfxbqfkf = cqumvgiudr.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(cqumvgiudrVarPpxfxbqfkf, "inflate(...)");
        return cqumvgiudrVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final rgvfuqvkyq rgvfuqvkyqVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final cqumvgiudr cqumvgiudrVar = (cqumvgiudr) adapterDelegateViewBinding.ppxfxbqfkf();
        cqumvgiudrVar.f15291zoijcleaow.setClickListener(new tg.draadjrbmk() { // from class: s52.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.dxjokdxxww(rgvfuqvkyqVar, adapterDelegateViewBinding, (q62.iobyxmoadg) obj);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: s52.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.btonecajqb(cqumvgiudrVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void nufgyqmvbu(cqumvgiudr cqumvgiudrVar, ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof f52.zoijcleaow.eablkybsjg) {
                    cqumvgiudrVar.f15291zoijcleaow.gxszxtbevo(((q62.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
                }
            }
        }
    }
}
