package za1;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import z41.vipkmwdibw;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dxjokdxxww {

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
            return Boolean.valueOf(obj instanceof ab1.iobyxmoadg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f129449zdlpuopuiu = new zoijcleaow();

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
    public static final void agtfadlqog(ef.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, View view) {
        if (iobyxmoadgVar.getBindingAdapterPosition() != -1) {
            iobyxmoadgVar2.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(final draadjrbmk draadjrbmkVar, final draadjrbmk draadjrbmkVar2, final tg.iobyxmoadg iobyxmoadgVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        vipkmwdibw vipkmwdibwVar = (vipkmwdibw) adapterDelegateViewBinding.ppxfxbqfkf();
        vipkmwdibwVar.f128432lqeggnwhkg.setOnTouchListener(new View.OnTouchListener() { // from class: za1.wkgbmnqykc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return dxjokdxxww.gtknphoqwx(adapterDelegateViewBinding, draadjrbmkVar, draadjrbmkVar2, view, motionEvent);
            }
        });
        vipkmwdibwVar.f128434ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: za1.eablkybsjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.draadjrbmk(adapterDelegateViewBinding, draadjrbmkVar, view);
            }
        });
        vipkmwdibwVar.f128429eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: za1.gxszxtbevo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.wflxmlrfwp(adapterDelegateViewBinding, draadjrbmkVar2, view);
            }
        });
        vipkmwdibwVar.f128435wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: za1.lqeggnwhkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxjokdxxww.agtfadlqog(adapterDelegateViewBinding, iobyxmoadgVar, view);
            }
        });
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: za1.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.ojitshcjhn(adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        vdvldrhtss(iobyxmoadgVar, draadjrbmkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vipkmwdibw dxjokdxxww(LayoutInflater layoutInflater, ViewGroup parent) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(parent, "parent");
        vipkmwdibw vipkmwdibwVarPpxfxbqfkf = vipkmwdibw.ppxfxbqfkf(layoutInflater, parent, false);
        zdlpuopuiu.dxjokdxxww(vipkmwdibwVarPpxfxbqfkf, "inflate(...)");
        return vipkmwdibwVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gtknphoqwx(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (motionEvent.getX() < view.getWidth() / 2) {
                vdvldrhtss(iobyxmoadgVar, draadjrbmkVar);
            } else {
                rgvfuqvkyq(iobyxmoadgVar, draadjrbmkVar2);
            }
        }
        return true;
    }

    public static final df.zoijcleaow nufgyqmvbu(final draadjrbmk onBackClicked, final draadjrbmk onNextClicked, final tg.iobyxmoadg onCloseClicked) {
        zdlpuopuiu.btonecajqb(onBackClicked, "onBackClicked");
        zdlpuopuiu.btonecajqb(onNextClicked, "onNextClicked");
        zdlpuopuiu.btonecajqb(onCloseClicked, "onCloseClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: za1.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return dxjokdxxww.dxjokdxxww((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: za1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.btonecajqb(onBackClicked, onNextClicked, onCloseClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f129449zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128433nufgyqmvbu.setText(((ab1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).ppxfxbqfkf());
        ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128428dxjokdxxww.setText(((ab1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        AppCompatImageView ivOnboardingPicture = ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128430gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(ivOnboardingPicture, "ivOnboardingPicture");
        p41.eablkybsjg.zoijcleaow(ivOnboardingPicture, ((ab1.iobyxmoadg) iobyxmoadgVar.eablkybsjg()).zoijcleaow());
        if (iobyxmoadgVar.getBindingAdapterPosition() == 0) {
            MaterialTextView btnBack = ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128434ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(btnBack, "btnBack");
            btnBack.setVisibility(8);
            MaterialTextView btnNext = ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128429eablkybsjg;
            zdlpuopuiu.dxjokdxxww(btnNext, "btnNext");
            ViewGroup.LayoutParams layoutParams = btnNext.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.zoijcleaow zoijcleaowVar = (ConstraintLayout.zoijcleaow) layoutParams;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar).width = 0;
            btnNext.setLayoutParams(zoijcleaowVar);
        } else {
            MaterialTextView btnBack2 = ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128434ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(btnBack2, "btnBack");
            btnBack2.setVisibility(0);
            MaterialTextView btnNext2 = ((vipkmwdibw) iobyxmoadgVar.ppxfxbqfkf()).f128429eablkybsjg;
            zdlpuopuiu.dxjokdxxww(btnNext2, "btnNext");
            ViewGroup.LayoutParams layoutParams2 = btnNext2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.zoijcleaow zoijcleaowVar2 = (ConstraintLayout.zoijcleaow) layoutParams2;
            ((ViewGroup.MarginLayoutParams) zoijcleaowVar2).width = -2;
            btnNext2.setLayoutParams(zoijcleaowVar2);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void rgvfuqvkyq(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
        int bindingAdapterPosition = iobyxmoadgVar.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(bindingAdapterPosition));
        }
    }

    private static final void vdvldrhtss(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
        int bindingAdapterPosition = iobyxmoadgVar.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            draadjrbmkVar.invoke(Integer.valueOf(bindingAdapterPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, View view) {
        rgvfuqvkyq(iobyxmoadgVar, draadjrbmkVar);
    }
}
