package ru.myspar.proloyalty.scango.impl.screens.cart.presentation;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import go1.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.esjtqupxsv;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;
import ru.myspar.proloyalty.scango.impl.screens.cart.presentation.adapter.ScanGoCartContentLayoutManager;
import uo1.wflxmlrfwp;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final wg.eablkybsjg f100744cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final gtknphoqwx f100745esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f100746iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f100747jyumaefscl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f100742pmvmpeiblj = {cllcsxoeiz.eablkybsjg(new esjtqupxsv(gxszxtbevo.class, "contentLayoutManager", "getContentLayoutManager()Lru/myspar/proloyalty/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager;", 0))};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final iobyxmoadg f100741lereixgezr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f100743zynmafqrjb = 8;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100748iobyxmoadg;

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
            f100748iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(tg.iobyxmoadg binding, final q41.iobyxmoadg resourcesManager) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        this.f100747jyumaefscl = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: to1.vdvldrhtss
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.cdpycssgdh(this.f111131zdlpuopuiu);
            }
        });
        this.f100746iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: to1.oxmwwwfdhm
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.oxmwwwfdhm(this.f111129zdlpuopuiu);
            }
        });
        this.f100744cqumvgiudr = wg.iobyxmoadg.f119567iobyxmoadg.iobyxmoadg();
        this.f100745esjtqupxsv = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: to1.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.jpowsppfya(this.f111124zdlpuopuiu, resourcesManager);
            }
        });
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) binding.invoke();
        AppCompatImageButton btnTutorial = lqeggnwhkgVar.f38063eablkybsjg;
        zdlpuopuiu.dxjokdxxww(btnTutorial, "btnTutorial");
        btnTutorial.setVisibility(uw0.ppxfxbqfkf.f114521iobyxmoadg.cllcsxoeiz() ? 0 : 8);
        lqeggnwhkgVar.f38063eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: to1.zdlpuopuiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.esjtqupxsv(this.f111134zdlpuopuiu, view);
            }
        });
        lqeggnwhkgVar.f38069ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: to1.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.lereixgezr(this.f111133zdlpuopuiu, view);
            }
        });
        lqeggnwhkgVar.f38072zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: to1.jyumaefscl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.pmvmpeiblj(this.f111122zdlpuopuiu, view);
            }
        });
        wwaezpbzkn(new ScanGoCartContentLayoutManager(wkgbmnqykc(), new tg.iobyxmoadg() { // from class: to1.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.zynmafqrjb(this.f111121zdlpuopuiu);
            }
        }));
        lqeggnwhkgVar.f38067lqeggnwhkg.setLayoutManager(jyumaefscl());
        RecyclerView rvCartContent = lqeggnwhkgVar.f38067lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(rvCartContent, "rvCartContent");
        k91.zoijcleaow.iobyxmoadg(rvCartContent);
        lqeggnwhkgVar.f38067lqeggnwhkg.setAdapter(yggfygwlhe());
        cqumvgiudr().lqeggnwhkg(lqeggnwhkgVar.f38067lqeggnwhkg);
        lqeggnwhkgVar.f38059agtfadlqog.setMax(5000);
        lqeggnwhkgVar.f38059agtfadlqog.setOnReturn(new tg.iobyxmoadg() { // from class: to1.cqumvgiudr
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.istkbnxepw(this.f111115zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho1.zoijcleaow cdpycssgdh(gxszxtbevo gxszxtbevoVar) {
        return new ho1.zoijcleaow(gxszxtbevoVar.wkgbmnqykc());
    }

    private final androidx.recyclerview.widget.draadjrbmk cqumvgiudr() {
        return (androidx.recyclerview.widget.draadjrbmk) this.f100745esjtqupxsv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gtknphoqwx.f100756iobyxmoadg);
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
        co1.zoijcleaow zoijcleaowVar;
        int i13 = zoijcleaow.f100748iobyxmoadg[wkgbmnqykcVar.iobyxmoadg().ordinal()];
        if (i13 == 1) {
            zoijcleaowVar = co1.zoijcleaow.CONTINUE;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zoijcleaowVar = co1.zoijcleaow.EMPTY;
        }
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.btonecajqb(zoijcleaowVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.dxjokdxxww.f100754iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final ho1.zoijcleaow iwizpuwonk() {
        return (ho1.zoijcleaow) this.f100747jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.recyclerview.widget.draadjrbmk jpowsppfya(final gxszxtbevo gxszxtbevoVar, q41.iobyxmoadg iobyxmoadgVar) {
        return new androidx.recyclerview.widget.draadjrbmk(new wflxmlrfwp(gxszxtbevoVar.wkgbmnqykc(), iobyxmoadgVar, new tg.draadjrbmk() { // from class: to1.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.hkdspvbjdz(this.f111118zdlpuopuiu, ((Integer) obj).intValue());
            }
        }));
    }

    private final ScanGoCartContentLayoutManager jyumaefscl() {
        return (ScanGoCartContentLayoutManager) this.f100744cqumvgiudr.iobyxmoadg(this, f100742pmvmpeiblj[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(gxszxtbevo gxszxtbevoVar, ScanGoProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        gxszxtbevoVar.ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lereixgezr(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f100757iobyxmoadg);
    }

    private final ScanGoProductUiModel lmojexxdyd(int i13) {
        Object obj = yggfygwlhe().ppxfxbqfkf().get(i13);
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel");
        return (ScanGoProductUiModel) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uo1.gxszxtbevo oxmwwwfdhm(final gxszxtbevo gxszxtbevoVar) {
        return new uo1.gxszxtbevo(new tg.draadjrbmk() { // from class: to1.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.kcexrzcfyt(this.f111130zdlpuopuiu, (ScanGoProductUiModel) obj);
            }
        });
    }

    private final void pkzmftpjix(lqeggnwhkg lqeggnwhkgVar, long j13) {
        lqeggnwhkgVar.f38059agtfadlqog.setProgress(j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(gxszxtbevo gxszxtbevoVar, View view) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.C2428ppxfxbqfkf.f100761iobyxmoadg);
    }

    private final void wwaezpbzkn(ScanGoCartContentLayoutManager scanGoCartContentLayoutManager) {
        this.f100744cqumvgiudr.zoijcleaow(this, f100742pmvmpeiblj[0], scanGoCartContentLayoutManager);
    }

    private final uo1.gxszxtbevo yggfygwlhe() {
        return (uo1.gxszxtbevo) this.f100746iwizpuwonk.getValue();
    }

    private final void ylkuphrtab(lqeggnwhkg lqeggnwhkgVar, boolean z13) {
        lqeggnwhkgVar.f38059agtfadlqog.setEnabled(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevoVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f100755iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(lqeggnwhkg binding, final wkgbmnqykc model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        hcddaimhww(model.nufgyqmvbu());
        binding.f38061draadjrbmk.setText(model.gxszxtbevo());
        binding.f38064gtknphoqwx.setText(model.eablkybsjg());
        binding.f38072zoijcleaow.setEnabled(model.lqeggnwhkg());
        ConstraintLayout root = binding.f38065gxszxtbevo.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = model.iobyxmoadg();
        wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.EMPTY;
        root.setVisibility(iobyxmoadgVarIobyxmoadg == iobyxmoadgVar ? 0 : 8);
        RecyclerView rvCartContent = binding.f38067lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(rvCartContent, "rvCartContent");
        rvCartContent.setVisibility(model.iobyxmoadg() == wkgbmnqykc.iobyxmoadg.FILL ? 0 : 8);
        yggfygwlhe().wkgbmnqykc(model.zoijcleaow());
        MaterialTextView tvPriceFract = binding.f38064gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(tvPriceFract, "tvPriceFract");
        tvPriceFract.setVisibility(model.iobyxmoadg() != iobyxmoadgVar ? 0 : 8);
        binding.f38071wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: to1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.scango.impl.screens.cart.presentation.gxszxtbevo.iozdgvuglv(model, this, view);
            }
        });
        ylkuphrtab(binding, model.dxjokdxxww());
        pkzmftpjix(binding, model.wkgbmnqykc());
        binding.f38065gxszxtbevo.f38096ppxfxbqfkf.setText(t1.zoijcleaow.iobyxmoadg(model.ppxfxbqfkf(), 0, null, null));
        MaterialTextView tvMessage = binding.f38065gxszxtbevo.f38096ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvMessage, "tvMessage");
        tvMessage.setVisibility(model.iobyxmoadg() == iobyxmoadgVar && model.ppxfxbqfkf().length() > 0 ? 0 : 8);
    }

    public final ScanGoCartContentLayoutManager.iobyxmoadg zdlpuopuiu() {
        return jyumaefscl().j1();
    }
}
