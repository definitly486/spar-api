package jd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import gg.wwaezpbzkn;
import java.util.List;
import m60.sopmlzcsov;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kcexrzcfyt {

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
            return Boolean.valueOf(obj instanceof ld0.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f51132zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(sopmlzcsov sopmlzcsovVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        sopmlzcsovVar.f65978gxszxtbevo.setText(((ld0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        sopmlzcsovVar.f65977eablkybsjg.setText(((ld0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        AppCompatImageView ivLogo = sopmlzcsovVar.f65981wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivLogo, "ivLogo");
        c60.wkgbmnqykc.zoijcleaow(ivLogo, ((ld0.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onDeleteClickedListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteClickedListener, "onDeleteClickedListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: jd0.ojitshcjhn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: jd0.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.lqeggnwhkg(onDeleteClickedListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f51132zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sopmlzcsov gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        sopmlzcsov sopmlzcsovVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sopmlzcsovVarPpxfxbqfkf, "inflate(...)");
        return sopmlzcsovVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((sopmlzcsov) adapterDelegateViewBinding.ppxfxbqfkf()).f65982zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: jd0.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kcexrzcfyt.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, view);
            }
        });
        final sopmlzcsov sopmlzcsovVar = (sopmlzcsov) adapterDelegateViewBinding.ppxfxbqfkf();
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: jd0.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.dxjokdxxww(sopmlzcsovVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, View view) {
        draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
    }
}
