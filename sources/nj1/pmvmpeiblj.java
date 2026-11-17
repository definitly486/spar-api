package nj1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import gg.wwaezpbzkn;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pmvmpeiblj {

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
            return Boolean.valueOf(obj instanceof pj1.iobyxmoadg.wkgbmnqykc);
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f70246zdlpuopuiu = new zoijcleaow();

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
    public static final wwaezpbzkn dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, List it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        ((yi1.gtknphoqwx) iobyxmoadgVar.ppxfxbqfkf()).f125420ppxfxbqfkf.setText(((pj1.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc());
        MaterialButton btnChooseAll = ((yi1.gtknphoqwx) iobyxmoadgVar.ppxfxbqfkf()).f125421zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(btnChooseAll, "btnChooseAll");
        btnChooseAll.setVisibility(((pj1.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).eablkybsjg() ? 4 : 0);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final tg.draadjrbmk onBtnChooseAllClicked) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onBtnChooseAllClicked, "onBtnChooseAllClicked");
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: nj1.iwizpuwonk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return pmvmpeiblj.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: nj1.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return pmvmpeiblj.lqeggnwhkg(onBtnChooseAllClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f70246zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yi1.gtknphoqwx gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(root, "root");
        yi1.gtknphoqwx gtknphoqwxVarPpxfxbqfkf = yi1.gtknphoqwx.ppxfxbqfkf(layoutInflater, root, false);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gtknphoqwxVarPpxfxbqfkf, "inflate(...)");
        return gtknphoqwxVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((yi1.gtknphoqwx) adapterDelegateViewBinding.ppxfxbqfkf()).f125421zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: nj1.esjtqupxsv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pmvmpeiblj.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: nj1.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return pmvmpeiblj.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getAdapterPosition() != -1) {
            draadjrbmkVar.invoke(((pj1.iobyxmoadg.wkgbmnqykc) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        }
    }
}
