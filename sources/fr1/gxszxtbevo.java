package fr1;

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
            return Boolean.valueOf(obj instanceof xr1.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f34907zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(uq1.eablkybsjg eablkybsjgVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ImageView ivIcon = eablkybsjgVar.f114161zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        p41.eablkybsjg.ppxfxbqfkf(ivIcon, ((xr1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), b31.gxszxtbevo.placeholder);
        eablkybsjgVar.f114160wkgbmnqykc.setText(t1.zoijcleaow.iobyxmoadg(((xr1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), 0, null, null));
        eablkybsjgVar.f114159ppxfxbqfkf.setText(((xr1.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk onDocumentClicked) {
        zdlpuopuiu.btonecajqb(onDocumentClicked, "onDocumentClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: fr1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gxszxtbevo.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: fr1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.lqeggnwhkg(onDocumentClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f34907zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uq1.eablkybsjg gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        uq1.eablkybsjg eablkybsjgVarPpxfxbqfkf = uq1.eablkybsjg.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(eablkybsjgVarPpxfxbqfkf, "inflate(...)");
        return eablkybsjgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final uq1.eablkybsjg eablkybsjgVar = (uq1.eablkybsjg) adapterDelegateViewBinding.ppxfxbqfkf();
        ((uq1.eablkybsjg) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: fr1.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gxszxtbevo.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: fr1.eablkybsjg
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
