package m52;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

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
            return Boolean.valueOf(obj instanceof e62.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f65273zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(b52.eablkybsjg eablkybsjgVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ImageView ivIcon = eablkybsjgVar.f15299zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        c60.wkgbmnqykc.ppxfxbqfkf(ivIcon, ((e62.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), s40.gxszxtbevo.placeholder);
        eablkybsjgVar.f15298wkgbmnqykc.setText(t1.zoijcleaow.iobyxmoadg(((e62.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        eablkybsjgVar.f15297ppxfxbqfkf.setText(((e62.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk onDocumentClicked) {
        zdlpuopuiu.btonecajqb(onDocumentClicked, "onDocumentClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: m52.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: m52.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.lqeggnwhkg(onDocumentClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f65273zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b52.eablkybsjg gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        b52.eablkybsjg eablkybsjgVarPpxfxbqfkf = b52.eablkybsjg.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(eablkybsjgVarPpxfxbqfkf, "inflate(...)");
        return eablkybsjgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final b52.eablkybsjg eablkybsjgVar = (b52.eablkybsjg) adapterDelegateViewBinding.ppxfxbqfkf();
        ((b52.eablkybsjg) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: m52.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: m52.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.dxjokdxxww(eablkybsjgVar, adapterDelegateViewBinding, (List) obj);
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
