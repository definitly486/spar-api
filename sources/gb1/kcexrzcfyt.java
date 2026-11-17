package gb1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import gg.wwaezpbzkn;
import java.util.List;
import z41.dsvhmnatus;

/* JADX INFO: loaded from: classes5.dex */
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
            return Boolean.valueOf(obj instanceof ib1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f36755zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(dsvhmnatus dsvhmnatusVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        dsvhmnatusVar.f127914gxszxtbevo.setText(((ib1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        dsvhmnatusVar.f127913eablkybsjg.setText(((ib1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        AppCompatImageView ivLogo = dsvhmnatusVar.f127917wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ivLogo, "ivLogo");
        p41.eablkybsjg.zoijcleaow(ivLogo, ((ib1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onDeleteClickedListener) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDeleteClickedListener, "onDeleteClickedListener");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: gb1.ojitshcjhn
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return kcexrzcfyt.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: gb1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.lqeggnwhkg(onDeleteClickedListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f36755zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dsvhmnatus gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        dsvhmnatus dsvhmnatusVarPpxfxbqfkf = dsvhmnatus.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(dsvhmnatusVarPpxfxbqfkf, "inflate(...)");
        return dsvhmnatusVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((dsvhmnatus) adapterDelegateViewBinding.ppxfxbqfkf()).f127918zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: gb1.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kcexrzcfyt.nufgyqmvbu(draadjrbmkVar, adapterDelegateViewBinding, view);
            }
        });
        final dsvhmnatus dsvhmnatusVar = (dsvhmnatus) adapterDelegateViewBinding.ppxfxbqfkf();
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: gb1.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return kcexrzcfyt.dxjokdxxww(dsvhmnatusVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar, View view) {
        draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
    }
}
