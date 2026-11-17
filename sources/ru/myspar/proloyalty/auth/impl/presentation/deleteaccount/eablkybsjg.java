package ru.myspar.proloyalty.auth.impl.presentation.deleteaccount;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import bc1.lqeggnwhkg;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pn0.wflxmlrfwp;
import ru.tinkoff.decoro.MaskImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f92578esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f92579lereixgezr = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow f92580cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f92581iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final gtknphoqwx f92582jyumaefscl;

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
        this.f92582jyumaefscl = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: pn0.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.eablkybsjg.gtknphoqwx(this.f77000zdlpuopuiu);
            }
        });
        this.f92581iwizpuwonk = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(t11.zoijcleaow.f109309iobyxmoadg.iobyxmoadg()));
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f92580cqumvgiudr = zoijcleaowVar;
        cn0.zoijcleaow zoijcleaowVar2 = (cn0.zoijcleaow) binding.invoke();
        wflxmlrfwp(zoijcleaowVar2);
        ComposeView cvActionBar = zoijcleaowVar2.f20230ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(bn0.eablkybsjg.proloyalty_options);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: pn0.ojitshcjhn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.eablkybsjg.agtfadlqog(this.f77011zdlpuopuiu);
            }
        }, null, null, 109, null);
        zoijcleaowVar2.f20225eablkybsjg.addTextChangedListener(zoijcleaowVar);
        zoijcleaowVar2.f20232zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: pn0.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.eablkybsjg.ojitshcjhn(this.f77012zdlpuopuiu, view);
            }
        });
        zoijcleaowVar2.f20223btonecajqb.setOnClickListener(new View.OnClickListener() { // from class: pn0.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.eablkybsjg.rgvfuqvkyq(this.f77013zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f92588iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final String draadjrbmk() {
        return (String) this.f92582jyumaefscl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gtknphoqwx(eablkybsjg eablkybsjgVar) {
        return eablkybsjgVar.wkgbmnqykc().getString(bn0.eablkybsjg.proloyalty_enter_correct_sms_code);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ojitshcjhn(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.C2156ppxfxbqfkf.f92589iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rgvfuqvkyq(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f92591iobyxmoadg);
    }

    private final void wflxmlrfwp(cn0.zoijcleaow zoijcleaowVar) {
        this.f92581iwizpuwonk.ppxfxbqfkf().M(true);
        this.f92581iwizpuwonk.wkgbmnqykc(zoijcleaowVar.f20231wkgbmnqykc);
        Editable text = zoijcleaowVar.f20231wkgbmnqykc.getText();
        if (text == null || text.length() == 0) {
            zoijcleaowVar.f20231wkgbmnqykc.setText("7");
        }
    }

    public final void oxmwwwfdhm(cn0.zoijcleaow binding, String smsCode) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        binding.f20225eablkybsjg.removeTextChangedListener(this.f92580cqumvgiudr);
        TextInputEditText etSms = binding.f20225eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etSms, "etSms");
        lqeggnwhkg.zoijcleaow(etSms, smsCode);
        binding.f20225eablkybsjg.setSelection(smsCode.length());
        binding.f20225eablkybsjg.addTextChangedListener(this.f92580cqumvgiudr);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(cn0.zoijcleaow binding, wflxmlrfwp model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f20231wkgbmnqykc.setText(model.ppxfxbqfkf());
        TextInputLayout ilSmsCode = binding.f20228lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(ilSmsCode, "ilSmsCode");
        ilSmsCode.setVisibility(model.gxszxtbevo() ? 0 : 8);
        binding.f20228lqeggnwhkg.setErrorEnabled(model.eablkybsjg());
        if (model.eablkybsjg()) {
            binding.f20228lqeggnwhkg.setError(draadjrbmk());
        }
        oxmwwwfdhm(binding, model.wkgbmnqykc());
        binding.f20229nufgyqmvbu.setText(model.zoijcleaow());
        binding.f20232zoijcleaow.setText(model.iobyxmoadg());
        MaterialTextView tvSmsRepeatHint = binding.f20224dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(tvSmsRepeatHint, "tvSmsRepeatHint");
        tvSmsRepeatHint.setVisibility(model.lqeggnwhkg() ? 0 : 8);
        binding.f20224dxjokdxxww.setText(model.nufgyqmvbu());
        MaterialTextView tvSmsRepeatRequest = binding.f20223btonecajqb;
        zdlpuopuiu.dxjokdxxww(tvSmsRepeatRequest, "tvSmsRepeatRequest");
        tvSmsRepeatRequest.setVisibility(model.dxjokdxxww() ? 0 : 8);
    }
}
