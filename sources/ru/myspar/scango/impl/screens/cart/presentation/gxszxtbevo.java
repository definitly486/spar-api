package ru.myspar.scango.impl.screens.cart.presentation;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import k22.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.esjtqupxsv;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;
import ru.myspar.scango.impl.screens.cart.presentation.adapter.ScanGoCartContentLayoutManager;
import y22.wflxmlrfwp;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final wg.eablkybsjg f103401cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final gtknphoqwx f103402esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f103403iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f103404jyumaefscl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f103399pmvmpeiblj = {cllcsxoeiz.eablkybsjg(new esjtqupxsv(gxszxtbevo.class, "contentLayoutManager", "getContentLayoutManager()Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager;", 0))};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final iobyxmoadg f103398lereixgezr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f103400zynmafqrjb = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f103405iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.iobyxmoadg.values().length];
            try {
                iArr[wkgbmnqykc.iobyxmoadg.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wkgbmnqykc.iobyxmoadg.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103405iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding, final d60.iobyxmoadg resourcesManager) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f103404jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x22.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.cdpycssgdh(this.f121067zdlpuopuiu);
            }
        });
        this.f103403iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x22.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.oxmwwwfdhm(this.f121071zdlpuopuiu);
            }
        });
        this.f103401cqumvgiudr = wg.iobyxmoadg.f119567iobyxmoadg.iobyxmoadg();
        this.f103402esjtqupxsv = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x22.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.jpowsppfya(this.f121069zdlpuopuiu, resourcesManager);
            }
        });
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) binding.invoke();
        AppCompatImageButton btnTutorial = lqeggnwhkgVar.f53596eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnTutorial, "btnTutorial");
        btnTutorial.setVisibility(xx.iobyxmoadg.f123319iobyxmoadg.weqkydbzbr() ? 0 : 8);
        lqeggnwhkgVar.f53596eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: x22.kcexrzcfyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.esjtqupxsv(this.f121064zdlpuopuiu, view);
            }
        });
        lqeggnwhkgVar.f53602ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: x22.zdlpuopuiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.lereixgezr(this.f121074zdlpuopuiu, view);
            }
        });
        lqeggnwhkgVar.f53605zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: x22.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.pmvmpeiblj(this.f121073zdlpuopuiu, view);
            }
        });
        wwaezpbzkn(new ScanGoCartContentLayoutManager(wkgbmnqykc(), new tg.iobyxmoadg() { // from class: x22.jyumaefscl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.zynmafqrjb(this.f121063zdlpuopuiu);
            }
        }));
        lqeggnwhkgVar.f53600lqeggnwhkg.setLayoutManager(jyumaefscl());
        RecyclerView rvCartContent = lqeggnwhkgVar.f53600lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(rvCartContent, "rvCartContent");
        lb0.zoijcleaow.iobyxmoadg(rvCartContent);
        lqeggnwhkgVar.f53600lqeggnwhkg.setAdapter(yggfygwlhe());
        cqumvgiudr().lqeggnwhkg(lqeggnwhkgVar.f53600lqeggnwhkg);
        lqeggnwhkgVar.f53592agtfadlqog.setMax(5000);
        lqeggnwhkgVar.f53592agtfadlqog.setOnReturn(new tg.iobyxmoadg() { // from class: x22.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.istkbnxepw(this.f121062zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l22.zoijcleaow cdpycssgdh(gxszxtbevo gxszxtbevoVar) {
        return new l22.zoijcleaow(gxszxtbevoVar.wkgbmnqykc());
    }

    private final androidx.recyclerview.widget.draadjrbmk cqumvgiudr() {
        return (androidx.recyclerview.widget.draadjrbmk) this.f103402esjtqupxsv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gtknphoqwx.f103413iobyxmoadg);
    }

    private final void hcddaimhww(boolean z13) {
        if (z13) {
            iwizpuwonk().show();
        } else {
            iwizpuwonk().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hkdspvbjdz(gxszxtbevo gxszxtbevoVar, int i13) {
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.nufgyqmvbu(gxszxtbevoVar.lmojexxdyd(i13)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar, View view) {
        g22.zoijcleaow zoijcleaowVar;
        int i13 = zoijcleaow.f103405iobyxmoadg[wkgbmnqykcVar.iobyxmoadg().ordinal()];
        if (i13 == 1) {
            zoijcleaowVar = g22.zoijcleaow.CONTINUE;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = g22.zoijcleaow.EMPTY;
        }
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.btonecajqb(zoijcleaowVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.dxjokdxxww.f103411iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final l22.zoijcleaow iwizpuwonk() {
        return (l22.zoijcleaow) this.f103404jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.recyclerview.widget.draadjrbmk jpowsppfya(final gxszxtbevo gxszxtbevoVar, d60.iobyxmoadg iobyxmoadgVar) {
        return new androidx.recyclerview.widget.draadjrbmk(new wflxmlrfwp(gxszxtbevoVar.wkgbmnqykc(), iobyxmoadgVar, new tg.draadjrbmk() { // from class: x22.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.hkdspvbjdz(this.f121059zdlpuopuiu, ((Integer) obj).intValue());
            }
        }));
    }

    private final ScanGoCartContentLayoutManager jyumaefscl() {
        return (ScanGoCartContentLayoutManager) this.f103401cqumvgiudr.iobyxmoadg(this, f103399pmvmpeiblj[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(gxszxtbevo gxszxtbevoVar, ScanGoProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lereixgezr(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f103414iobyxmoadg);
    }

    private final ScanGoProductUiModel lmojexxdyd(int i13) {
        Object obj = yggfygwlhe().ppxfxbqfkf().get(i13);
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel");
        return (ScanGoProductUiModel) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y22.gxszxtbevo oxmwwwfdhm(final gxszxtbevo gxszxtbevoVar) {
        return new y22.gxszxtbevo(new tg.draadjrbmk() { // from class: x22.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.kcexrzcfyt(this.f121070zdlpuopuiu, (ScanGoProductUiModel) obj);
            }
        });
    }

    private final void pkzmftpjix(lqeggnwhkg lqeggnwhkgVar, long j13) {
        lqeggnwhkgVar.f53592agtfadlqog.setProgress(j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.C2507ppxfxbqfkf.f103418iobyxmoadg);
    }

    private final void wwaezpbzkn(ScanGoCartContentLayoutManager scanGoCartContentLayoutManager) {
        this.f103401cqumvgiudr.zoijcleaow(this, f103399pmvmpeiblj[0], scanGoCartContentLayoutManager);
    }

    private final y22.gxszxtbevo yggfygwlhe() {
        return (y22.gxszxtbevo) this.f103403iwizpuwonk.getValue();
    }

    private final void ylkuphrtab(lqeggnwhkg lqeggnwhkgVar, boolean z13) {
        lqeggnwhkgVar.f53592agtfadlqog.setEnabled(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f103412iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lqeggnwhkg binding, final wkgbmnqykc model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        hcddaimhww(model.nufgyqmvbu());
        binding.f53594draadjrbmk.setText(model.gxszxtbevo());
        binding.f53597gtknphoqwx.setText(model.eablkybsjg());
        binding.f53605zoijcleaow.setEnabled(model.lqeggnwhkg());
        ConstraintLayout root = binding.f53598gxszxtbevo.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = model.iobyxmoadg();
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.EMPTY;
        root.setVisibility(iobyxmoadgVarIobyxmoadg == iobyxmoadgVar ? 0 : 8);
        RecyclerView rvCartContent = binding.f53600lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(rvCartContent, "rvCartContent");
        rvCartContent.setVisibility(model.iobyxmoadg() == wkgbmnqykc.iobyxmoadg.FILL ? 0 : 8);
        yggfygwlhe().wkgbmnqykc(model.zoijcleaow());
        MaterialTextView tvPriceFract = binding.f53597gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(tvPriceFract, "tvPriceFract");
        tvPriceFract.setVisibility(model.iobyxmoadg() != iobyxmoadgVar ? 0 : 8);
        binding.f53604wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: x22.cqumvgiudr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo.iozdgvuglv(model, this, view);
            }
        });
        ylkuphrtab(binding, model.dxjokdxxww());
        pkzmftpjix(binding, model.wkgbmnqykc());
        binding.f53598gxszxtbevo.f53629ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(model.ppxfxbqfkf(), 0, null, null));
        MaterialTextView tvMessage = binding.f53598gxszxtbevo.f53629ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvMessage, "tvMessage");
        tvMessage.setVisibility(model.iobyxmoadg() == iobyxmoadgVar && model.ppxfxbqfkf().length() > 0 ? 0 : 8);
    }

    public final ScanGoCartContentLayoutManager.iobyxmoadg zdlpuopuiu() {
        return jyumaefscl().j1();
    }
}
