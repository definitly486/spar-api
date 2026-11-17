package jd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import m60.lrnfpwlwnk;

/* JADX INFO: loaded from: classes4.dex */
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
            return Boolean.valueOf(obj instanceof ld0.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f51121zdlpuopuiu = new zoijcleaow();

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
            dxjokdxxww(iobyxmoadgVar, (ld0.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg());
        } else {
            gtknphoqwx(iobyxmoadgVar, payloads);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, ld0.ppxfxbqfkf ppxfxbqfkfVar) {
        MaterialTextView tvAnswer = ((lrnfpwlwnk) iobyxmoadgVar.ppxfxbqfkf()).f65778wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(tvAnswer, "tvAnswer");
        tvAnswer.setVisibility(ppxfxbqfkfVar.lqeggnwhkg() ? 0 : 8);
        ((lrnfpwlwnk) iobyxmoadgVar.ppxfxbqfkf()).f65777ppxfxbqfkf.setRotation(ppxfxbqfkfVar.lqeggnwhkg() ? 180.0f : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }

    private static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, ld0.ppxfxbqfkf ppxfxbqfkfVar) {
        lrnfpwlwnk lrnfpwlwnkVar = (lrnfpwlwnk) iobyxmoadgVar.ppxfxbqfkf();
        lrnfpwlwnkVar.f65775eablkybsjg.setText(ppxfxbqfkfVar.wkgbmnqykc());
        lrnfpwlwnkVar.f65778wkgbmnqykc.setText(ppxfxbqfkfVar.iobyxmoadg());
        btonecajqb(iobyxmoadgVar, ppxfxbqfkfVar);
    }

    private static final void gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List list) {
        for (Object obj : list) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof nufgyqmvbu.iobyxmoadg) {
                    btonecajqb(iobyxmoadgVar, (ld0.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg());
                }
            }
        }
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.draadjrbmk questionClickListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(questionClickListener, "questionClickListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: jd0.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return agtfadlqog.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: jd0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return agtfadlqog.nufgyqmvbu(questionClickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f51121zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lrnfpwlwnk lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        lrnfpwlwnk lrnfpwlwnkVarPpxfxbqfkf = lrnfpwlwnk.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lrnfpwlwnkVarPpxfxbqfkf, "inflate(...)");
        return lrnfpwlwnkVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((lrnfpwlwnk) adapterDelegateViewBinding.ppxfxbqfkf()).f65777ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: jd0.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.draadjrbmk(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((lrnfpwlwnk) adapterDelegateViewBinding.ppxfxbqfkf()).f65775eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: jd0.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                agtfadlqog.wflxmlrfwp(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: jd0.wflxmlrfwp
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
