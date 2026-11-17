package ru.myspar.auth.impl.presentation.registrationverification;

import android.text.Editable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textfield.TextInputEditText;
import ge0.oxmwwwfdhm;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.tinkoff.decoro.MaskImpl;
import sp.dxjokdxxww;
import v0.btonecajqb;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final iobyxmoadg f84726pmvmpeiblj = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f84727zynmafqrjb = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gtknphoqwx f84728cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final gtknphoqwx f84729esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f84730iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f84731jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gtknphoqwx f84732lereixgezr;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f84733iobyxmoadg;

        static {
            int[] iArr = new int[t10.ppxfxbqfkf.values().length];
            try {
                iArr[t10.ppxfxbqfkf.VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t10.ppxfxbqfkf.TAKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84733iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f84731jyumaefscl = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(n30.ppxfxbqfkf.f68498iobyxmoadg.iobyxmoadg()));
        ojitshcjhn ojitshcjhnVar = ojitshcjhn.NONE;
        this.f84730iwizpuwonk = draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: sp.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.zynmafqrjb(this.f107792zdlpuopuiu);
            }
        });
        this.f84728cqumvgiudr = draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: sp.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.ojitshcjhn(this.f107800zdlpuopuiu);
            }
        });
        this.f84729esjtqupxsv = draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: sp.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.vdvldrhtss(this.f107793zdlpuopuiu);
            }
        });
        this.f84732lereixgezr = draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: sp.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.rgvfuqvkyq(this.f107806zdlpuopuiu);
            }
        });
        yo.wkgbmnqykc wkgbmnqykcVar = (yo.wkgbmnqykc) binding.invoke();
        iwizpuwonk(wkgbmnqykcVar);
        ComposeView cvActionBar = wkgbmnqykcVar.f126016wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, jyumaefscl(), btonecajqb.nufgyqmvbu(btonecajqb.f114934zoijcleaow.iobyxmoadg()), false, new tg.iobyxmoadg() { // from class: sp.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.cqumvgiudr(this.f107791zdlpuopuiu);
            }
        }, null, null, 105, null);
        TextInputEditText etPhone = wkgbmnqykcVar.f126011gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        lb0.iobyxmoadg.iobyxmoadg(etPhone, new tg.draadjrbmk() { // from class: sp.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.esjtqupxsv(this.f107803zdlpuopuiu, (String) obj);
            }
        });
        wkgbmnqykcVar.f126010eablkybsjg.setFilters(new n30.zoijcleaow[]{new n30.zoijcleaow()});
        TextInputEditText etEmail = wkgbmnqykcVar.f126010eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etEmail, "etEmail");
        oxmwwwfdhm.iobyxmoadg(etEmail, new tg.draadjrbmk() { // from class: sp.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.lereixgezr(this.f107804zdlpuopuiu, (CharSequence) obj);
            }
        });
        wkgbmnqykcVar.f126017zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: sp.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.registrationverification.eablkybsjg.pmvmpeiblj(this.f107805zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f84739iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(eablkybsjg eablkybsjgVar, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        String strCrxdokpmqz = eablkybsjgVar.f84731jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.gxszxtbevo(strCrxdokpmqz));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iwizpuwonk(yo.wkgbmnqykc wkgbmnqykcVar) {
        this.f84731jyumaefscl.ppxfxbqfkf().M(true);
        this.f84731jyumaefscl.wkgbmnqykc(wkgbmnqykcVar.f126011gxszxtbevo);
        Editable text = wkgbmnqykcVar.f126011gxszxtbevo.getText();
        if (text == null || text.length() == 0) {
            wkgbmnqykcVar.f126011gxszxtbevo.setText("7");
        }
    }

    private final String jyumaefscl() {
        return (String) this.f84730iwizpuwonk.getValue();
    }

    private final String kcexrzcfyt() {
        return (String) this.f84728cqumvgiudr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ojitshcjhn(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(uo.wkgbmnqykc.error_email_taken);
    }

    private final String oxmwwwfdhm(t10.ppxfxbqfkf ppxfxbqfkfVar) {
        int i13 = zoijcleaow.f84733iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? "" : kcexrzcfyt();
        }
        return yggfygwlhe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pmvmpeiblj(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C1918ppxfxbqfkf.f84740iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(uo.wkgbmnqykc.enter_correct_phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String vdvldrhtss(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(uo.wkgbmnqykc.enter_email);
    }

    private final String yggfygwlhe() {
        return (String) this.f84729esjtqupxsv.getValue();
    }

    private final String zdlpuopuiu() {
        return (String) this.f84732lereixgezr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zynmafqrjb(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(uo.wkgbmnqykc.registration);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: istkbnxepw, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yo.wkgbmnqykc binding, dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f126015ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.wkgbmnqykc());
        if (!zdlpuopuiu.eablkybsjg(model.zoijcleaow(), this.f84731jyumaefscl.ppxfxbqfkf().crxdokpmqz())) {
            TextInputEditText etPhone = binding.f126011gxszxtbevo;
            zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
            oxmwwwfdhm.zoijcleaow(etPhone, model.zoijcleaow());
        }
        if (model.ppxfxbqfkf()) {
            binding.f126014nufgyqmvbu.setError(zdlpuopuiu());
        }
        binding.f126014nufgyqmvbu.setErrorEnabled(model.ppxfxbqfkf());
        if (model.iobyxmoadg() == t10.ppxfxbqfkf.NONE) {
            binding.f126013lqeggnwhkg.setErrorEnabled(false);
        } else {
            binding.f126013lqeggnwhkg.setError(oxmwwwfdhm(model.iobyxmoadg()));
            binding.f126013lqeggnwhkg.requestLayout();
        }
    }
}
