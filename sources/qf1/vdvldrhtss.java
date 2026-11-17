package qf1;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.options.impl.options.presentation.models.UserSubscriptionUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class vdvldrhtss extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78755cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78756esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78757iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78758jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78759lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private rf1.iobyxmoadg f78760pmvmpeiblj;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f78761iobyxmoadg;

        static {
            int[] iArr = new int[oz0.iobyxmoadg.values().length];
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78761iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdvldrhtss(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f78758jyumaefscl = new CompoundButton.OnCheckedChangeListener() { // from class: qf1.nufgyqmvbu
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.vdvldrhtss(this.f78751iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78757iwizpuwonk = new CompoundButton.OnCheckedChangeListener() { // from class: qf1.dxjokdxxww
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.iozdgvuglv(this.f78740iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78755cqumvgiudr = new CompoundButton.OnCheckedChangeListener() { // from class: qf1.btonecajqb
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.jyumaefscl(this.f78738iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78756esjtqupxsv = new CompoundButton.OnCheckedChangeListener() { // from class: qf1.gtknphoqwx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.yadqdtsiqt(this.f78741iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78759lereixgezr = new CompoundButton.OnCheckedChangeListener() { // from class: qf1.draadjrbmk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.rgvfuqvkyq(this.f78739iobyxmoadg, compoundButton, z13);
            }
        };
        nf1.zoijcleaow zoijcleaowVar = (nf1.zoijcleaow) binding.invoke();
        zoijcleaowVar.f70032draadjrbmk.setOnClickListener(new View.OnClickListener() { // from class: qf1.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.oxmwwwfdhm(this.f78762zdlpuopuiu, view);
            }
        });
        this.f78760pmvmpeiblj = new rf1.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qf1.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return vdvldrhtss.kcexrzcfyt(this.f78737zdlpuopuiu, (String) obj, ((Boolean) obj2).booleanValue());
            }
        });
        zoijcleaowVar.f70044wflxmlrfwp.setOnClickListener(new View.OnClickListener() { // from class: qf1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.zdlpuopuiu(this.f78752zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f70034eablkybsjg.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        rf1.iobyxmoadg iobyxmoadgVar = this.f78760pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            zoijcleaowVar.f70034eablkybsjg.setAdapter(iobyxmoadgVar);
        }
        ComposeView cvActionBar = zoijcleaowVar.f70041ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(mf1.eablkybsjg.proloyalty_options);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: qf1.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return vdvldrhtss.yggfygwlhe(this.f78754zdlpuopuiu);
            }
        }, null, null, 109, null);
    }

    private final void cdpycssgdh(nf1.zoijcleaow zoijcleaowVar, List list, boolean z13) {
        MaterialTextView tvSubscriptionHeader = zoijcleaowVar.f70042rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(tvSubscriptionHeader, "tvSubscriptionHeader");
        tvSubscriptionHeader.setVisibility(!list.isEmpty() ? 0 : 8);
        rf1.iobyxmoadg iobyxmoadgVar = this.f78760pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UserSubscriptionUiModel.lqeggnwhkg((UserSubscriptionUiModel) it.next(), null, null, false, !z13, 7, null));
            }
            iobyxmoadgVar.wkgbmnqykc(arrayList);
        }
    }

    private final void cqumvgiudr(nf1.zoijcleaow zoijcleaowVar, boolean z13, oz0.iobyxmoadg iobyxmoadgVar) {
        String string;
        MaterialTextView materialTextView = zoijcleaowVar.f70032draadjrbmk;
        int i13 = iobyxmoadg.f78761iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            string = wkgbmnqykc().getString(mf1.eablkybsjg.proloyalty_option_item_system_theme);
        } else if (i13 == 2) {
            string = wkgbmnqykc().getString(mf1.eablkybsjg.proloyalty_option_item_dark_theme);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = wkgbmnqykc().getString(mf1.eablkybsjg.proloyalty_option_item_light_theme);
        }
        materialTextView.setText(string);
        Group groupAppearance = zoijcleaowVar.f70045wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(groupAppearance, "groupAppearance");
        groupAppearance.setVisibility(z13 ? 0 : 8);
    }

    private final void esjtqupxsv(nf1.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70036gxszxtbevo.setListener(null);
        zoijcleaowVar.f70036gxszxtbevo.setChecked(z13);
        zoijcleaowVar.f70036gxszxtbevo.setListener(this.f78759lereixgezr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new of1.wkgbmnqykc.dxjokdxxww(z13));
    }

    private final void istkbnxepw(nf1.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70031btonecajqb.setListener(null);
        zoijcleaowVar.f70031btonecajqb.setChecked(z13);
        zoijcleaowVar.f70031btonecajqb.setListener(this.f78757iwizpuwonk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new of1.wkgbmnqykc.lqeggnwhkg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(vdvldrhtss vdvldrhtssVar, String id2, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        vdvldrhtssVar.ppxfxbqfkf(new of1.wkgbmnqykc.zoijcleaow(id2, z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void lereixgezr(nf1.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70038lqeggnwhkg.setListener(null);
        zoijcleaowVar.f70038lqeggnwhkg.setChecked(z13);
        zoijcleaowVar.f70038lqeggnwhkg.setListener(this.f78758jyumaefscl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(vdvldrhtss vdvldrhtssVar, View view) {
        vdvldrhtssVar.ppxfxbqfkf(of1.wkgbmnqykc.C1581wkgbmnqykc.f72823iobyxmoadg);
    }

    private final void pmvmpeiblj(nf1.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70039nufgyqmvbu.setListener(null);
        zoijcleaowVar.f70039nufgyqmvbu.setChecked(z13);
        zoijcleaowVar.f70039nufgyqmvbu.setListener(this.f78755cqumvgiudr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new of1.wkgbmnqykc.iobyxmoadg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new of1.wkgbmnqykc.gxszxtbevo(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yadqdtsiqt(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new of1.wkgbmnqykc.nufgyqmvbu(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.ppxfxbqfkf(of1.wkgbmnqykc.ppxfxbqfkf.f72822iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(vdvldrhtss vdvldrhtssVar, View view) {
        vdvldrhtssVar.ppxfxbqfkf(of1.wkgbmnqykc.btonecajqb.f72815iobyxmoadg);
    }

    private final void zynmafqrjb(nf1.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70033dxjokdxxww.setListener(null);
        zoijcleaowVar.f70033dxjokdxxww.setChecked(z13);
        zoijcleaowVar.f70033dxjokdxxww.setListener(this.f78756esjtqupxsv);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(nf1.zoijcleaow binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f70046zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.gxszxtbevo());
        esjtqupxsv(binding, model.ppxfxbqfkf());
        zynmafqrjb(binding, model.nufgyqmvbu());
        lereixgezr(binding, model.eablkybsjg());
        istkbnxepw(binding, model.dxjokdxxww());
        pmvmpeiblj(binding, model.lqeggnwhkg());
        cdpycssgdh(binding, model.zoijcleaow(), model.gxszxtbevo());
        cqumvgiudr(binding, model.wkgbmnqykc(), model.iobyxmoadg());
    }
}
