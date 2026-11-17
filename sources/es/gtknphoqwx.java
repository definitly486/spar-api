package es;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.dvvnrvtcbc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gtknphoqwx {

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
            return Boolean.valueOf(obj instanceof draadjrbmk.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f31868zdlpuopuiu = new zoijcleaow();

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
    public static final dvvnrvtcbc eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        dvvnrvtcbc dvvnrvtcbcVarPpxfxbqfkf = dvvnrvtcbc.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(dvvnrvtcbcVarPpxfxbqfkf, "inflate(...)");
        return dvvnrvtcbcVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: es.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gtknphoqwx.lqeggnwhkg(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        boolean z13 = ((draadjrbmk.zoijcleaow) iobyxmoadgVar.eablkybsjg()).zoijcleaow() != null;
        ImageView imageView = ((dvvnrvtcbc) iobyxmoadgVar.ppxfxbqfkf()).f65464zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(imageView);
        imageView.setVisibility(z13 ? 0 : 8);
        if (((draadjrbmk.zoijcleaow) iobyxmoadgVar.eablkybsjg()).zoijcleaow() != null) {
            c60.wkgbmnqykc.zoijcleaow(imageView, ((draadjrbmk.zoijcleaow) iobyxmoadgVar.eablkybsjg()).zoijcleaow());
        }
        MaterialTextView materialTextView = ((dvvnrvtcbc) iobyxmoadgVar.ppxfxbqfkf()).f65463ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(materialTextView);
        materialTextView.setVisibility(z13 ? 8 : 0);
        materialTextView.setText(((draadjrbmk.zoijcleaow) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow wkgbmnqykc() {
        return new ef.zoijcleaow(new tg.rgvfuqvkyq() { // from class: es.nufgyqmvbu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return gtknphoqwx.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: es.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gtknphoqwx.gxszxtbevo((ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f31868zdlpuopuiu);
    }
}
