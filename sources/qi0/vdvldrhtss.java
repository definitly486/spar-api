package qi0;

import android.view.View;
import android.widget.CompoundButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class vdvldrhtss extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78894cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78895esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78896iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78897jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final CompoundButton.OnCheckedChangeListener f78898lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ri0.iobyxmoadg f78899pmvmpeiblj;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f78900iobyxmoadg;

        static {
            int[] iArr = new int[x00.iobyxmoadg.values().length];
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78900iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdvldrhtss(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f78897jyumaefscl = new CompoundButton.OnCheckedChangeListener() { // from class: qi0.nufgyqmvbu
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.vdvldrhtss(this.f78890iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78896iwizpuwonk = new CompoundButton.OnCheckedChangeListener() { // from class: qi0.dxjokdxxww
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.iozdgvuglv(this.f78879iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78894cqumvgiudr = new CompoundButton.OnCheckedChangeListener() { // from class: qi0.btonecajqb
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.jyumaefscl(this.f78877iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78895esjtqupxsv = new CompoundButton.OnCheckedChangeListener() { // from class: qi0.gtknphoqwx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.yadqdtsiqt(this.f78880iobyxmoadg, compoundButton, z13);
            }
        };
        this.f78898lereixgezr = new CompoundButton.OnCheckedChangeListener() { // from class: qi0.draadjrbmk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                vdvldrhtss.rgvfuqvkyq(this.f78878iobyxmoadg, compoundButton, z13);
            }
        };
        ni0.zoijcleaow zoijcleaowVar = (ni0.zoijcleaow) binding.invoke();
        zoijcleaowVar.f70126draadjrbmk.setOnClickListener(new View.OnClickListener() { // from class: qi0.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.oxmwwwfdhm(this.f78901zdlpuopuiu, view);
            }
        });
        this.f78899pmvmpeiblj = new ri0.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: qi0.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return vdvldrhtss.kcexrzcfyt(this.f78876zdlpuopuiu, (String) obj, ((Boolean) obj2).booleanValue());
            }
        });
        zoijcleaowVar.f70138wflxmlrfwp.setOnClickListener(new View.OnClickListener() { // from class: qi0.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vdvldrhtss.zdlpuopuiu(this.f78891zdlpuopuiu, view);
            }
        });
        zoijcleaowVar.f70128eablkybsjg.setLayoutManager(new LinearLayoutManager(wkgbmnqykc()));
        ri0.iobyxmoadg iobyxmoadgVar = this.f78899pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            zoijcleaowVar.f70128eablkybsjg.setAdapter(iobyxmoadgVar);
        }
        ComposeView cvActionBar = zoijcleaowVar.f70135ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(mi0.eablkybsjg.options);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: qi0.rgvfuqvkyq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return vdvldrhtss.yggfygwlhe(this.f78893zdlpuopuiu);
            }
        }, null, null, 109, null);
    }

    private final void cdpycssgdh(ni0.zoijcleaow zoijcleaowVar, List list) {
        MaterialTextView tvSubscriptionHeader = zoijcleaowVar.f70136rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(tvSubscriptionHeader, "tvSubscriptionHeader");
        tvSubscriptionHeader.setVisibility(!list.isEmpty() ? 0 : 8);
        ri0.iobyxmoadg iobyxmoadgVar = this.f78899pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.wkgbmnqykc(list);
        }
    }

    private final void cqumvgiudr(ni0.zoijcleaow zoijcleaowVar, boolean z13, x00.iobyxmoadg iobyxmoadgVar) {
        String string;
        MaterialTextView materialTextView = zoijcleaowVar.f70126draadjrbmk;
        int i13 = iobyxmoadg.f78900iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1) {
            string = wkgbmnqykc().getString(mi0.eablkybsjg.option_item_system_theme);
        } else if (i13 == 2) {
            string = wkgbmnqykc().getString(mi0.eablkybsjg.option_item_dark_theme);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = wkgbmnqykc().getString(mi0.eablkybsjg.option_item_light_theme);
        }
        materialTextView.setText(string);
        Group groupAppearance = zoijcleaowVar.f70139wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(groupAppearance, "groupAppearance");
        groupAppearance.setVisibility(z13 ? 0 : 8);
    }

    private final void esjtqupxsv(ni0.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70130gxszxtbevo.setListener(null);
        zoijcleaowVar.f70130gxszxtbevo.setChecked(z13);
        zoijcleaowVar.f70130gxszxtbevo.setListener(this.f78898lereixgezr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new oi0.wkgbmnqykc.dxjokdxxww(z13));
    }

    private final void istkbnxepw(ni0.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70125btonecajqb.setListener(null);
        zoijcleaowVar.f70125btonecajqb.setChecked(z13);
        zoijcleaowVar.f70125btonecajqb.setListener(this.f78896iwizpuwonk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new oi0.wkgbmnqykc.lqeggnwhkg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(vdvldrhtss vdvldrhtssVar, String id2, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        vdvldrhtssVar.ppxfxbqfkf(new oi0.wkgbmnqykc.zoijcleaow(id2, z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void lereixgezr(ni0.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70132lqeggnwhkg.setListener(null);
        zoijcleaowVar.f70132lqeggnwhkg.setChecked(z13);
        zoijcleaowVar.f70132lqeggnwhkg.setListener(this.f78897jyumaefscl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oxmwwwfdhm(vdvldrhtss vdvldrhtssVar, View view) {
        vdvldrhtssVar.ppxfxbqfkf(oi0.wkgbmnqykc.C1586wkgbmnqykc.f72962iobyxmoadg);
    }

    private final void pmvmpeiblj(ni0.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70133nufgyqmvbu.setListener(null);
        zoijcleaowVar.f70133nufgyqmvbu.setChecked(z13);
        zoijcleaowVar.f70133nufgyqmvbu.setListener(this.f78894cqumvgiudr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new oi0.wkgbmnqykc.iobyxmoadg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new oi0.wkgbmnqykc.gxszxtbevo(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yadqdtsiqt(vdvldrhtss vdvldrhtssVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        vdvldrhtssVar.ppxfxbqfkf(new oi0.wkgbmnqykc.nufgyqmvbu(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yggfygwlhe(vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.ppxfxbqfkf(oi0.wkgbmnqykc.ppxfxbqfkf.f72961iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(vdvldrhtss vdvldrhtssVar, View view) {
        vdvldrhtssVar.ppxfxbqfkf(oi0.wkgbmnqykc.btonecajqb.f72954iobyxmoadg);
    }

    private final void zynmafqrjb(ni0.zoijcleaow zoijcleaowVar, boolean z13) {
        zoijcleaowVar.f70127dxjokdxxww.setListener(null);
        zoijcleaowVar.f70127dxjokdxxww.setChecked(z13);
        zoijcleaowVar.f70127dxjokdxxww.setListener(this.f78895esjtqupxsv);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: iwizpuwonk, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(ni0.zoijcleaow binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f70140zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.gxszxtbevo());
        esjtqupxsv(binding, model.ppxfxbqfkf());
        zynmafqrjb(binding, model.nufgyqmvbu());
        lereixgezr(binding, model.eablkybsjg());
        istkbnxepw(binding, model.dxjokdxxww());
        pmvmpeiblj(binding, model.lqeggnwhkg());
        cdpycssgdh(binding, model.zoijcleaow());
        cqumvgiudr(binding, model.wkgbmnqykc(), model.iobyxmoadg());
    }
}
