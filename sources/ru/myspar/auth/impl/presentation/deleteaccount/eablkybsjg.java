package ru.myspar.auth.impl.presentation.deleteaccount;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import ge0.oxmwwwfdhm;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import np.wflxmlrfwp;
import ru.tinkoff.decoro.MaskImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f84585esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f84586lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow f84587cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f84588iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f84589jyumaefscl;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow implements TextWatcher {
        zoijcleaow() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            eablkybsjg.this.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(String.valueOf(editable)));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f84589jyumaefscl = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: np.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg.gtknphoqwx(this.f70476zdlpuopuiu);
            }
        });
        this.f84588iwizpuwonk = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(n30.ppxfxbqfkf.f68498iobyxmoadg.iobyxmoadg()));
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f84587cqumvgiudr = zoijcleaowVar;
        yo.iobyxmoadg iobyxmoadgVar = (yo.iobyxmoadg) binding.invoke();
        wflxmlrfwp(iobyxmoadgVar);
        ComposeView cvActionBar = iobyxmoadgVar.f125974ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(uo.wkgbmnqykc.options);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: np.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg.agtfadlqog(this.f70487zdlpuopuiu);
            }
        }, null, null, 109, null);
        iobyxmoadgVar.f125969eablkybsjg.addTextChangedListener(zoijcleaowVar);
        iobyxmoadgVar.f125976zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: np.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg.ojitshcjhn(this.f70488zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f125967btonecajqb.setOnClickListener(new View.OnClickListener() { // from class: np.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.deleteaccount.eablkybsjg.rgvfuqvkyq(this.f70489zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f84595iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final String draadjrbmk() {
        return (String) this.f84589jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gtknphoqwx(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(uo.wkgbmnqykc.enter_correct_sms_code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C1913ppxfxbqfkf.f84596iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f84598iobyxmoadg);
    }

    private final void wflxmlrfwp(yo.iobyxmoadg iobyxmoadgVar) {
        this.f84588iwizpuwonk.ppxfxbqfkf().M(true);
        this.f84588iwizpuwonk.wkgbmnqykc(iobyxmoadgVar.f125975wkgbmnqykc);
        Editable text = iobyxmoadgVar.f125975wkgbmnqykc.getText();
        if (text == null || text.length() == 0) {
            iobyxmoadgVar.f125975wkgbmnqykc.setText("7");
        }
    }

    public final void oxmwwwfdhm(yo.iobyxmoadg binding, String smsCode) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        binding.f125969eablkybsjg.removeTextChangedListener(this.f84587cqumvgiudr);
        TextInputEditText etSms = binding.f125969eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etSms, "etSms");
        oxmwwwfdhm.zoijcleaow(etSms, smsCode);
        binding.f125969eablkybsjg.setSelection(smsCode.length());
        binding.f125969eablkybsjg.addTextChangedListener(this.f84587cqumvgiudr);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yo.iobyxmoadg binding, wflxmlrfwp model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f125975wkgbmnqykc.setText(model.ppxfxbqfkf());
        TextInputLayout ilSmsCode = binding.f125972lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ilSmsCode, "ilSmsCode");
        ilSmsCode.setVisibility(model.eablkybsjg() ? 0 : 8);
        binding.f125972lqeggnwhkg.setErrorEnabled(model.wkgbmnqykc());
        if (model.wkgbmnqykc()) {
            binding.f125972lqeggnwhkg.setError(draadjrbmk());
        }
        binding.f125973nufgyqmvbu.setText(model.zoijcleaow());
        binding.f125976zoijcleaow.setText(model.iobyxmoadg());
        MaterialTextView tvSmsRepeatHint = binding.f125968dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(tvSmsRepeatHint, "tvSmsRepeatHint");
        tvSmsRepeatHint.setVisibility(model.gxszxtbevo() ? 0 : 8);
        binding.f125968dxjokdxxww.setText(model.lqeggnwhkg());
        MaterialTextView tvSmsRepeatRequest = binding.f125967btonecajqb;
        zdlpuopuiu.dxjokdxxww(tvSmsRepeatRequest, "tvSmsRepeatRequest");
        tvSmsRepeatRequest.setVisibility(model.nufgyqmvbu() ? 0 : 8);
    }
}
