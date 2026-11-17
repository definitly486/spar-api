package jr1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.jlmebxxoox;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

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
            return Boolean.valueOf(obj instanceof gs1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f52234zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) iobyxmoadgVar.ppxfxbqfkf();
        AppCompatImageView ivProductPhoto = jlmebxxooxVar.f128160zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivProductPhoto, "ivProductPhoto");
        p41.eablkybsjg.ppxfxbqfkf(ivProductPhoto, ((gs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), b31.gxszxtbevo.placeholder);
        jlmebxxooxVar.f128156gxszxtbevo.setText(t1.zoijcleaow.iobyxmoadg(((gs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg(), 0, null, null));
        jlmebxxooxVar.f128155eablkybsjg.setText(t1.zoijcleaow.iobyxmoadg(((gs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), 0, null, null));
        jlmebxxooxVar.f128158ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(((gs1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), 0, null, null));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk onProductClicked) {
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: jr1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: jr1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.lqeggnwhkg(onProductClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f52234zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jlmebxxoox gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        jlmebxxoox jlmebxxooxVarPpxfxbqfkf = jlmebxxoox.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(jlmebxxooxVarPpxfxbqfkf, "inflate(...)");
        return jlmebxxooxVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((jlmebxxoox) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: jr1.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: jr1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(iobyxmoadgVar.eablkybsjg());
        }
    }
}
