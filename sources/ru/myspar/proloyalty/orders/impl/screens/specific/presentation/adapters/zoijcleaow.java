package ru.myspar.proloyalty.orders.impl.screens.specific.presentation.adapters;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import ds0.gxszxtbevo;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import lj.btonecajqb;
import lj.wflxmlrfwp;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class eablkybsjg implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f98978iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f98979jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f98980yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f98981zdlpuopuiu;

        public eablkybsjg(jpowsppfya jpowsppfyaVar, long j13, draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f98981zdlpuopuiu = jpowsppfyaVar;
            this.f98980yggfygwlhe = j13;
            this.f98979jyumaefscl = draadjrbmkVar;
            this.f98978iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f98981zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f98980yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f98979jyumaefscl.invoke(this.f98978iwizpuwonk.eablkybsjg());
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
            return Boolean.valueOf(obj instanceof lt0.zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f98982iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f98983jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f98984yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f98985zdlpuopuiu;

        public static final class iobyxmoadg implements draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f98986zdlpuopuiu = new iobyxmoadg();

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof ReplaceAdapterPayload);
            }
        }

        public ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, ef.iobyxmoadg iobyxmoadgVar2) {
            this.f98985zdlpuopuiu = iobyxmoadgVar;
            this.f98984yggfygwlhe = rgvfuqvkyqVar;
            this.f98983jyumaefscl = draadjrbmkVar;
            this.f98982iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((List) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(List payloads) {
            zdlpuopuiu.btonecajqb(payloads, "payloads");
            btonecajqb btonecajqbVarIstkbnxepw = wflxmlrfwp.istkbnxepw(hg.jyumaefscl.ikoacuggdj(payloads), iobyxmoadg.f98986zdlpuopuiu);
            zdlpuopuiu.nufgyqmvbu(btonecajqbVarIstkbnxepw, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Object objLmojexxdyd = wflxmlrfwp.lmojexxdyd(btonecajqbVarIstkbnxepw);
            if (objLmojexxdyd == null) {
                zoijcleaow.nufgyqmvbu(this.f98985zdlpuopuiu, this.f98984yggfygwlhe, this.f98983jyumaefscl);
            } else {
                zoijcleaow.dxjokdxxww(this.f98982iwizpuwonk, (ReplaceAdapterPayload) objLmojexxdyd);
            }
        }
    }

    public static final class wkgbmnqykc implements View.OnClickListener {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f98987iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f98988jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f98989yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f98990zdlpuopuiu;

        public wkgbmnqykc(jpowsppfya jpowsppfyaVar, long j13, rgvfuqvkyq rgvfuqvkyqVar, ef.iobyxmoadg iobyxmoadgVar) {
            this.f98990zdlpuopuiu = jpowsppfyaVar;
            this.f98989yggfygwlhe = j13;
            this.f98988jyumaefscl = rgvfuqvkyqVar;
            this.f98987iwizpuwonk = iobyxmoadgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f98990zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f98989yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f98988jyumaefscl.invoke(((lt0.zoijcleaow) this.f98987iwizpuwonk.eablkybsjg()).iobyxmoadg(), ((lt0.zoijcleaow) this.f98987iwizpuwonk.eablkybsjg()).eablkybsjg());
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.adapters.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2366zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C2366zoijcleaow f98991zdlpuopuiu = new C2366zoijcleaow();

        public C2366zoijcleaow() {
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
    public static final void dxjokdxxww(ef.iobyxmoadg iobyxmoadgVar, ReplaceAdapterPayload replaceAdapterPayload) {
        if (replaceAdapterPayload instanceof ReplaceAdapterPayload.SelectableChanged) {
            ((yf1.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf()).f124735wkgbmnqykc.setChecked(((ReplaceAdapterPayload.SelectableChanged) replaceAdapterPayload).getIsSelected());
        }
    }

    public static final df.zoijcleaow eablkybsjg(final rgvfuqvkyq onProductClickedByArticle, final draadjrbmk onReplaceClicked) {
        zdlpuopuiu.btonecajqb(onProductClickedByArticle, "onProductClickedByArticle");
        zdlpuopuiu.btonecajqb(onReplaceClicked, "onReplaceClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: gg1.gtknphoqwx
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.adapters.zoijcleaow.gxszxtbevo((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: gg1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.orders.impl.screens.specific.presentation.adapters.zoijcleaow.lqeggnwhkg(onProductClickedByArticle, onReplaceClicked, (ef.iobyxmoadg) obj);
            }
        }, C2366zoijcleaow.f98991zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yf1.ppxfxbqfkf gxszxtbevo(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        yf1.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = yf1.ppxfxbqfkf.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarPpxfxbqfkf, "inflate(...)");
        return ppxfxbqfkfVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.zoijcleaow(new ppxfxbqfkf(adapterDelegateViewBinding, rgvfuqvkyqVar, draadjrbmkVar, adapterDelegateViewBinding));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(ef.iobyxmoadg iobyxmoadgVar, rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar) {
        yf1.ppxfxbqfkf ppxfxbqfkfVar = (yf1.ppxfxbqfkf) iobyxmoadgVar.ppxfxbqfkf();
        ConstraintLayout root = ppxfxbqfkfVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setOnClickListener(new wkgbmnqykc(new jpowsppfya(), 400L, rgvfuqvkyqVar, iobyxmoadgVar));
        MaterialRadioButton rbProduct = ppxfxbqfkfVar.f124735wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(rbProduct, "rbProduct");
        rbProduct.setOnClickListener(new eablkybsjg(new jpowsppfya(), 400L, draadjrbmkVar, iobyxmoadgVar));
        ppxfxbqfkfVar.f124731gxszxtbevo.setText(((lt0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).eablkybsjg());
        ppxfxbqfkfVar.f124730eablkybsjg.setText(((lt0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).getCountry());
        TextView tvWeight = ppxfxbqfkfVar.f124733lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(tvWeight, "tvWeight");
        tvWeight.setVisibility(8);
        ComposeView cvCounter = ppxfxbqfkfVar.f124736zoijcleaow;
        zdlpuopuiu.dxjokdxxww(cvCounter, "cvCounter");
        gxszxtbevo.gxszxtbevo(cvCounter, ((lt0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).wkgbmnqykc(), js0.zoijcleaow.PRICE_AND_AMOUNT, null, null, null, null, 60, null);
        ppxfxbqfkfVar.f124735wkgbmnqykc.setChecked(((lt0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).dxjokdxxww());
        com.bumptech.glide.zoijcleaow.zdlpuopuiu(iobyxmoadgVar.wkgbmnqykc()).eablkybsjg().grlcpdaxtj(((lt0.zoijcleaow) iobyxmoadgVar.eablkybsjg()).nufgyqmvbu()).wizcaqwiak(ppxfxbqfkfVar.f124734ppxfxbqfkf);
    }
}
