package nc0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.czzsidtyhn;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

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
            return Boolean.valueOf(obj instanceof pc0.zoijcleaow);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f69656zdlpuopuiu = new zoijcleaow();

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
    public static final void btonecajqb(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
            ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65423ppxfxbqfkf.f65543zoijcleaow.yggfygwlhe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, tg.draadjrbmk draadjrbmkVar, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(iobyxmoadgVar.getBindingAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, List it) {
        String string;
        zdlpuopuiu.btonecajqb(it, "it");
        pc0.zoijcleaow zoijcleaowVar = (pc0.zoijcleaow) iobyxmoadgVar.eablkybsjg();
        MaterialTextView materialTextView = ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65421gxszxtbevo;
        if (zoijcleaowVar.gxszxtbevo().length() > 0) {
            string = zoijcleaowVar.gxszxtbevo();
        } else {
            string = iobyxmoadgVar.wkgbmnqykc().getString(pm.dxjokdxxww.title_notification);
            zdlpuopuiu.lqeggnwhkg(string);
        }
        materialTextView.setText(string);
        ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65420eablkybsjg.setText(zoijcleaowVar.ppxfxbqfkf());
        ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65424wkgbmnqykc.setText(zoijcleaowVar.zoijcleaow());
        MaterialTextView tvBody = ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65424wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvBody, "tvBody");
        tvBody.setVisibility(zoijcleaowVar.zoijcleaow().length() > 0 ? 0 : 8);
        MaterialTextView tvBody2 = ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65424wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvBody2, "tvBody");
        tvBody2.setVisibility(zoijcleaowVar.zoijcleaow().length() > 0 ? 0 : 8);
        FrameLayout flCopyPromoCode = ((czzsidtyhn) iobyxmoadgVar.ppxfxbqfkf()).f65425zoijcleaow;
        zdlpuopuiu.dxjokdxxww(flCopyPromoCode, "flCopyPromoCode");
        flCopyPromoCode.setVisibility(zoijcleaowVar.lqeggnwhkg() ? 0 : 8);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow gxszxtbevo(final tg.draadjrbmk clickListener) {
        zdlpuopuiu.btonecajqb(clickListener, "clickListener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: nc0.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return nufgyqmvbu.lqeggnwhkg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new tg.draadjrbmk() { // from class: nc0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.nufgyqmvbu(clickListener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f69656zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final czzsidtyhn lqeggnwhkg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        czzsidtyhn czzsidtyhnVarPpxfxbqfkf = czzsidtyhn.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(czzsidtyhnVarPpxfxbqfkf, "inflate(...)");
        return czzsidtyhnVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(final tg.draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.itemView.setOnClickListener(new View.OnClickListener() { // from class: nc0.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nufgyqmvbu.dxjokdxxww(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        ((czzsidtyhn) adapterDelegateViewBinding.ppxfxbqfkf()).f65425zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: nc0.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nufgyqmvbu.btonecajqb(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new tg.draadjrbmk() { // from class: nc0.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return nufgyqmvbu.gtknphoqwx(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
