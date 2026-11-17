package ua0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.wizcaqwiak;
import m60.ydmasvzmpa;
import mj.kcexrzcfyt;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.ui.view.popup_text.PopupTextView;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;
import v40.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class eablkybsjg extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f113060zdlpuopuiu = new eablkybsjg();

        public eablkybsjg() {
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

    public static final class gxszxtbevo implements c9.eablkybsjg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wizcaqwiak f113061zdlpuopuiu;

        gxszxtbevo(wizcaqwiak wizcaqwiakVar) {
            this.f113061zdlpuopuiu = wizcaqwiakVar;
        }

        @Override // c9.eablkybsjg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public boolean eablkybsjg(Drawable resource, Object model, d9.dxjokdxxww dxjokdxxwwVar, l8.iobyxmoadg dataSource, boolean z13) {
            zdlpuopuiu.btonecajqb(resource, "resource");
            zdlpuopuiu.btonecajqb(model, "model");
            zdlpuopuiu.btonecajqb(dataSource, "dataSource");
            this.f113061zdlpuopuiu.f66072ppxfxbqfkf.setImageDrawable(resource);
            FloatingActionButton fabPlay = this.f113061zdlpuopuiu.f66074zoijcleaow;
            zdlpuopuiu.dxjokdxxww(fabPlay, "fabPlay");
            fabPlay.setVisibility(0);
            return true;
        }

        @Override // c9.eablkybsjg
        public boolean wkgbmnqykc(GlideException glideException, Object obj, d9.dxjokdxxww target, boolean z13) {
            zdlpuopuiu.btonecajqb(target, "target");
            return true;
        }
    }

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
            return Boolean.valueOf(obj instanceof he0.lqeggnwhkg);
        }
    }

    /* JADX INFO: renamed from: ua0.lqeggnwhkg$lqeggnwhkg, reason: collision with other inner class name */
    public static final class ViewOnClickListenerC2803lqeggnwhkg implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f113062iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f113063jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f113064yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f113065zdlpuopuiu;

        public ViewOnClickListenerC2803lqeggnwhkg(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
            this.f113065zdlpuopuiu = jpowsppfyaVar;
            this.f113064yggfygwlhe = j13;
            this.f113063jyumaefscl = iobyxmoadgVar;
            this.f113062iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f113065zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f113064yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f113063jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f113062iwizpuwonk.invoke(Integer.valueOf(this.f113063jyumaefscl.getBindingAdapterPosition()));
            }
        }
    }

    public static final class nufgyqmvbu implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wizcaqwiak f113066jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f113067yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f113068zdlpuopuiu;

        public nufgyqmvbu(jpowsppfya jpowsppfyaVar, long j13, wizcaqwiak wizcaqwiakVar) {
            this.f113068zdlpuopuiu = jpowsppfyaVar;
            this.f113067yggfygwlhe = j13;
            this.f113066jyumaefscl = wizcaqwiakVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f113068zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f113067yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f113066jyumaefscl.f66073wkgbmnqykc.yadqdtsiqt();
        }
    }

    public static final class ppxfxbqfkf implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f113069iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f113070jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f113071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f113072zdlpuopuiu;

        public ppxfxbqfkf(jpowsppfya jpowsppfyaVar, long j13, ef.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar) {
            this.f113072zdlpuopuiu = jpowsppfyaVar;
            this.f113071yggfygwlhe = j13;
            this.f113070jyumaefscl = iobyxmoadgVar;
            this.f113069iwizpuwonk = draadjrbmkVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f113072zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f113071yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            if (this.f113070jyumaefscl.getBindingAdapterPosition() != -1) {
                this.f113069iwizpuwonk.invoke(Integer.valueOf(this.f113070jyumaefscl.getBindingAdapterPosition()));
            }
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements vdvldrhtss {
        public wkgbmnqykc() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof he0.lqeggnwhkg);
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f113073zdlpuopuiu = new zoijcleaow();

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
    public static final wizcaqwiak agtfadlqog(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        wizcaqwiak wizcaqwiakVarPpxfxbqfkf = wizcaqwiak.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(wizcaqwiakVarPpxfxbqfkf, "inflate(...)");
        return wizcaqwiakVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(ydmasvzmpa ydmasvzmpaVar, ef.iobyxmoadg iobyxmoadgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ShapeableImageView ivBanner = ydmasvzmpaVar.f66137ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivBanner, "ivBanner");
        String strEablkybsjg = ((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).eablkybsjg();
        int i13 = s40.gxszxtbevo.placeholder;
        c9.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = new c9.gxszxtbevo().ppxfxbqfkf();
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "centerCrop(...)");
        c60.wkgbmnqykc.gxszxtbevo(ivBanner, strEablkybsjg, i13, (c9.gxszxtbevo) iobyxmoadgVarPpxfxbqfkf, null, 8, null);
        ComposeView composeView = ydmasvzmpaVar.f66138zoijcleaow;
        zdlpuopuiu.lqeggnwhkg(composeView);
        composeView.setVisibility(((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg().length() > 0 ? 0 : 8);
        if (composeView.getVisibility() == 0) {
            gt.zoijcleaow.iobyxmoadg(composeView, e.eablkybsjg.iobyxmoadg(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, bfopjjpdmp.lqeggnwhkg.eablkybsjg(0.0f, 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 11, null)), esjtqupxsv.BottomRight, ((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg(), o50.iobyxmoadg.Auto);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final wizcaqwiak wizcaqwiakVar = (wizcaqwiak) adapterDelegateViewBinding.ppxfxbqfkf();
        final gxszxtbevo gxszxtbevoVar = new gxszxtbevo(wizcaqwiakVar);
        FrameLayout root = wizcaqwiakVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setOnClickListener(new ViewOnClickListenerC2803lqeggnwhkg(new jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        PopupTextView tvAdvertisement = wizcaqwiakVar.f66073wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvAdvertisement, "tvAdvertisement");
        tvAdvertisement.setOnClickListener(new nufgyqmvbu(new jpowsppfya(), 400L, wizcaqwiakVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: ua0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.wflxmlrfwp(wizcaqwiakVar, adapterDelegateViewBinding, gxszxtbevoVar, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(draadjrbmk draadjrbmkVar, final ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        final ydmasvzmpa ydmasvzmpaVar = (ydmasvzmpa) adapterDelegateViewBinding.ppxfxbqfkf();
        MaterialCardView root = ydmasvzmpaVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setOnClickListener(new ppxfxbqfkf(new jpowsppfya(), 400L, adapterDelegateViewBinding, draadjrbmkVar));
        adapterDelegateViewBinding.zoijcleaow(new draadjrbmk() { // from class: ua0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.btonecajqb(ydmasvzmpaVar, adapterDelegateViewBinding, (List) obj);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final df.zoijcleaow gtknphoqwx(final draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ua0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.agtfadlqog((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new wkgbmnqykc(), new draadjrbmk() { // from class: ua0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.draadjrbmk(listener, (ef.iobyxmoadg) obj);
            }
        }, eablkybsjg.f113060zdlpuopuiu);
    }

    public static final df.zoijcleaow lqeggnwhkg(final draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: ua0.ppxfxbqfkf
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return lqeggnwhkg.nufgyqmvbu((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: ua0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return lqeggnwhkg.dxjokdxxww(listener, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f113073zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ydmasvzmpa nufgyqmvbu(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        ydmasvzmpa ydmasvzmpaVarPpxfxbqfkf = ydmasvzmpa.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ydmasvzmpaVarPpxfxbqfkf, "inflate(...)");
        return ydmasvzmpaVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(wizcaqwiak wizcaqwiakVar, ef.iobyxmoadg iobyxmoadgVar, c9.eablkybsjg eablkybsjgVar, List it) {
        zdlpuopuiu.btonecajqb(it, "it");
        ShapeableImageView ivBanner = wizcaqwiakVar.f66072ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(ivBanner, "ivBanner");
        c60.wkgbmnqykc.eablkybsjg(ivBanner, ((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).eablkybsjg(), eablkybsjgVar, s40.gxszxtbevo.placeholder);
        PopupTextView popupTextView = wizcaqwiakVar.f66073wkgbmnqykc;
        zdlpuopuiu.lqeggnwhkg(popupTextView);
        popupTextView.setVisibility(!kcexrzcfyt.zfvoamnweg(((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg()) ? 0 : 8);
        popupTextView.setPopupText(((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).iobyxmoadg());
        ColorsUiModel colorsUiModelWkgbmnqykc = ((he0.lqeggnwhkg) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc();
        if (colorsUiModelWkgbmnqykc != null) {
            wizcaqwiakVar.f66074zoijcleaow.setImageTintList(ColorStateList.valueOf(colorsUiModelWkgbmnqykc.wypolnanlu(iobyxmoadgVar.wkgbmnqykc(), ColorsUiModel.iobyxmoadg.PRIMARY)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
