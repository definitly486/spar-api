package es;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.imageview.ShapeableImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.skhdrjzrfn;
import v40.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oxmwwwfdhm {

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
            return Boolean.valueOf(obj instanceof draadjrbmk.ppxfxbqfkf);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f31871zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(skhdrjzrfn skhdrjzrfnVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        skhdrjzrfnVar.f65972eablkybsjg.setText(((draadjrbmk.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        ShapeableImageView ivIcon = skhdrjzrfnVar.f65974ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.ppxfxbqfkf(ivIcon, ((draadjrbmk.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).zoijcleaow(), s40.gxszxtbevo.placeholder_transparent);
        ComposeView composeView = skhdrjzrfnVar.f65976zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(((draadjrbmk.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().length() > 0 ? 0 : 8);
        if (composeView.getVisibility() == 0) {
            gt.zoijcleaow.iobyxmoadg(composeView, e.eablkybsjg.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, bfopjjpdmp.lqeggnwhkg.eablkybsjg(0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(8), 0.0f, 11, null)), esjtqupxsv.BottomRight, ((draadjrbmk.ppxfxbqfkf) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), o50.iobyxmoadg.Auto);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: es.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return oxmwwwfdhm.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: es.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return oxmwwwfdhm.lqeggnwhkg(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f31871zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final skhdrjzrfn gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        skhdrjzrfn skhdrjzrfnVarPpxfxbqfkf = skhdrjzrfn.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(skhdrjzrfnVarPpxfxbqfkf, "inflate(...)");
        return skhdrjzrfnVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final skhdrjzrfn skhdrjzrfnVar = (skhdrjzrfn) adapterDelegateViewBinding.ppxfxbqfkf();
        adapterDelegateViewBinding.itemView.setOnClickListener(new View.OnClickListener() { // from class: es.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oxmwwwfdhm.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: es.vdvldrhtss
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return oxmwwwfdhm.dxjokdxxww(skhdrjzrfnVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, View view) {
        draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
    }
}
