package gb1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import z41.rlfsiqarku;

/* JADX INFO: loaded from: classes5.dex */
public abstract class agtfadlqog {

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
            return Boolean.valueOf(obj instanceof ib1.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36744zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn agtfadlqog(ef.iobyxmoadg iobyxmoadgVar, List payloads) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payloads, "payloads");
        if (payloads.isEmpty()) {
            dxjokdxxww(iobyxmoadgVar, (ib1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg());
        } else {
            gtknphoqwx(iobyxmoadgVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, ib1.ppxfxbqfkf ppxfxbqfkfVar) {
        MaterialTextView tvAnswer = ((rlfsiqarku) iobyxmoadgVar.ppxfxbqfkf()).f128374wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvAnswer, "tvAnswer");
        tvAnswer.setVisibility(ppxfxbqfkfVar.lqeggnwhkg() ? 0 : 8);
        ((rlfsiqarku) iobyxmoadgVar.ppxfxbqfkf()).f128373ppxfxbqfkf.setRotation(ppxfxbqfkfVar.lqeggnwhkg() ? 180.0f : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, ib1.ppxfxbqfkf ppxfxbqfkfVar) {
        rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) iobyxmoadgVar.ppxfxbqfkf();
        rlfsiqarkuVar.f128371eablkybsjg.setText(ppxfxbqfkfVar.wkgbmnqykc());
        rlfsiqarkuVar.f128374wkgbmnqykc.setText(ppxfxbqfkfVar.iobyxmoadg());
        btonecajqb(iobyxmoadgVar, ppxfxbqfkfVar);
    }

    private static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof nufgyqmvbu.iobyxmoadg) {
                    btonecajqb(iobyxmoadgVar, (ib1.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.draadjrbmk questionClickListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(questionClickListener, "questionClickListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: gb1.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: gb1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.nufgyqmvbu(questionClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36744zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rlfsiqarku lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        rlfsiqarku rlfsiqarkuVarPpxfxbqfkf = rlfsiqarku.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(rlfsiqarkuVarPpxfxbqfkf, "inflate(...)");
        return rlfsiqarkuVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((rlfsiqarku) adapterDelegateViewBinding.ppxfxbqfkf()).f128373ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: gb1.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.draadjrbmk(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((rlfsiqarku) adapterDelegateViewBinding.ppxfxbqfkf()).f128371eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: gb1.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.wflxmlrfwp(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: gb1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.agtfadlqog(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }
}
