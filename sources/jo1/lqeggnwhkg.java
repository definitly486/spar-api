package jo1;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import go1.btonecajqb;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lqeggnwhkg {

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
            return Boolean.valueOf(obj instanceof ko1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f51888zdlpuopuiu = new zoijcleaow();

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
        ((btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).getRoot().setBackground(iobyxmoadgVar.getBindingAdapterPosition() == it.size() + (-1) ? androidx.core.content.iobyxmoadg.getDrawable(iobyxmoadgVar.wkgbmnqykc(), b31.gxszxtbevo.scan_go_tutorial_last_item_background) : androidx.core.content.iobyxmoadg.getDrawable(iobyxmoadgVar.wkgbmnqykc(), b31.gxszxtbevo.scan_go_tutorial_item_background));
        MaterialTextView materialTextView = ((btonecajqb) iobyxmoadgVar.ppxfxbqfkf()).f38006zoijcleaow;
        materialTextView.setText(((ko1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu());
        materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(androidx.core.content.iobyxmoadg.getDrawable(materialTextView.getContext(), ((ko1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).lqeggnwhkg()), (Drawable) null, androidx.core.content.iobyxmoadg.getDrawable(materialTextView.getContext(), b31.gxszxtbevo.ic_arrow_right_expand), (Drawable) null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow eablkybsjg(final draadjrbmk draadjrbmkVar) {
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: jo1.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: jo1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.lqeggnwhkg(draadjrbmkVar, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f51888zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final btonecajqb gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        btonecajqb btonecajqbVarPpxfxbqfkf = btonecajqb.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(btonecajqbVarPpxfxbqfkf, "inflate(...)");
        return btonecajqbVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(final draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ((btonecajqb) adapterDelegateViewBinding.ppxfxbqfkf()).getRoot().setOnClickListener(new View.OnClickListener() { // from class: jo1.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lqeggnwhkg.nufgyqmvbu(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: jo1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.dxjokdxxww(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        int bindingAdapterPosition = iobyxmoadgVar.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || draadjrbmkVar == null) {
            return;
        }
        draadjrbmkVar.invoke(Integer.valueOf(bindingAdapterPosition));
    }
}
