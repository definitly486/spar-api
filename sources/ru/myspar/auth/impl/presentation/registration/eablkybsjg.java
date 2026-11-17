package ru.myspar.auth.impl.presentation.registration;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ge0.oxmwwwfdhm;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.tinkoff.decoro.MaskImpl;
import v0.btonecajqb;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final iobyxmoadg f84668pmvmpeiblj = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f84669zynmafqrjb = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f84670cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final zoijcleaow f84671esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final gtknphoqwx f84672iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final tg.iobyxmoadg f84673jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Calendar f84674lereixgezr;

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
            eablkybsjg.this.ppxfxbqfkf(new ppxfxbqfkf.vdvldrhtss(String.valueOf(editable)));
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
        this.f84673jyumaefscl = binding;
        this.f84672iwizpuwonk = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: rp.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.jyumaefscl();
            }
        });
        this.f84670cqumvgiudr = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(n30.ppxfxbqfkf.f68498iobyxmoadg.iobyxmoadg()));
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f84671esjtqupxsv = zoijcleaowVar;
        this.f84674lereixgezr = Calendar.getInstance();
        yo.ppxfxbqfkf ppxfxbqfkfVar = (yo.ppxfxbqfkf) binding.invoke();
        cqumvgiudr(ppxfxbqfkfVar);
        ComposeView cvActionBar = ppxfxbqfkfVar.f125995nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(uo.wkgbmnqykc.registration);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, btonecajqb.nufgyqmvbu(btonecajqb.f114934zoijcleaow.iobyxmoadg()), false, new tg.iobyxmoadg() { // from class: rp.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.esjtqupxsv(this.f83278zdlpuopuiu);
            }
        }, null, null, 105, null);
        ppxfxbqfkfVar.f126001vdvldrhtss.addTextChangedListener(zoijcleaowVar);
        TextInputEditText etFirstName = ppxfxbqfkfVar.f125981draadjrbmk;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        oxmwwwfdhm.iobyxmoadg(etFirstName, new tg.draadjrbmk() { // from class: rp.cqumvgiudr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.yadqdtsiqt(this.f83251zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etLastName = ppxfxbqfkfVar.f125977agtfadlqog;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        oxmwwwfdhm.iobyxmoadg(etLastName, new tg.draadjrbmk() { // from class: rp.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.iozdgvuglv(this.f83253zdlpuopuiu, (CharSequence) obj);
            }
        });
        ppxfxbqfkfVar.f126002wflxmlrfwp.setOnClickListener(new View.OnClickListener() { // from class: rp.lereixgezr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.lmojexxdyd(this.f83281zdlpuopuiu, view);
            }
        });
        ppxfxbqfkfVar.f125982dxjokdxxww.setOnClickListener(new View.OnClickListener() { // from class: rp.wflxmlrfwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.wwaezpbzkn(this.f83287zdlpuopuiu, view);
            }
        });
        TextInputEditText etPromo = ppxfxbqfkfVar.f126000rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(etPromo, "etPromo");
        oxmwwwfdhm.iobyxmoadg(etPromo, new tg.draadjrbmk() { // from class: rp.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.ylkuphrtab(this.f83249zdlpuopuiu, (CharSequence) obj);
            }
        });
        ppxfxbqfkfVar.f125979cdpycssgdh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rp.ojitshcjhn
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.pkzmftpjix(this.f83283iobyxmoadg, compoundButton, z13);
            }
        });
        ppxfxbqfkfVar.f125989istkbnxepw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rp.rgvfuqvkyq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.hcddaimhww(this.f83285iobyxmoadg, compoundButton, z13);
            }
        });
        ppxfxbqfkfVar.f125983eablkybsjg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rp.vdvldrhtss
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.jpowsppfya(this.f83286iobyxmoadg, compoundButton, z13);
            }
        });
        TextInputEditText etCardNumber = ppxfxbqfkfVar.f125978btonecajqb;
        zdlpuopuiu.dxjokdxxww(etCardNumber, "etCardNumber");
        oxmwwwfdhm.iobyxmoadg(etCardNumber, new tg.draadjrbmk() { // from class: rp.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.lereixgezr(this.f83284zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etPromo2 = ppxfxbqfkfVar.f126000rgvfuqvkyq;
        zdlpuopuiu.dxjokdxxww(etPromo2, "etPromo");
        oxmwwwfdhm.iobyxmoadg(etPromo2, new tg.draadjrbmk() { // from class: rp.kcexrzcfyt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.auth.impl.presentation.registration.eablkybsjg.pmvmpeiblj(this.f83280zdlpuopuiu, (CharSequence) obj);
            }
        });
        ppxfxbqfkfVar.f126003wkgbmnqykc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rp.zdlpuopuiu
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.zynmafqrjb(this.f83290iobyxmoadg, compoundButton, z13);
            }
        });
        ppxfxbqfkfVar.f125999ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: rp.yggfygwlhe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.istkbnxepw(this.f83289zdlpuopuiu, view);
            }
        });
        ppxfxbqfkfVar.f126007zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: rp.jyumaefscl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.auth.impl.presentation.registration.eablkybsjg.cdpycssgdh(this.f83279zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cdpycssgdh(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f84685iobyxmoadg);
    }

    private final void cqumvgiudr(yo.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f84670cqumvgiudr.ppxfxbqfkf().M(true);
        this.f84670cqumvgiudr.wkgbmnqykc(ppxfxbqfkfVar.f125996ojitshcjhn);
        Editable text = ppxfxbqfkfVar.f125996ojitshcjhn.getText();
        if (text == null || text.length() == 0) {
            ppxfxbqfkfVar.f125996ojitshcjhn.setText("7");
        }
    }

    private final void dsvhmnatus(View view) {
        view.getParent().requestChildFocus(view, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f84696iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hcddaimhww(eablkybsjg eablkybsjgVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        if (z13) {
            eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f84686iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iozdgvuglv(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.draadjrbmk(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.rgvfuqvkyq.f84692iobyxmoadg);
    }

    private final SimpleDateFormat iwizpuwonk() {
        return (SimpleDateFormat) this.f84672iwizpuwonk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jpowsppfya(eablkybsjg eablkybsjgVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.gtknphoqwx(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat jyumaefscl() {
        return new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    }

    private final void kegysxyocb(TextInputLayout textInputLayout, boolean z13, String str) {
        if (!z13) {
            textInputLayout.setErrorEnabled(false);
        } else {
            textInputLayout.setError(str);
            dsvhmnatus(textInputLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lmojexxdyd(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.btonecajqb.f84680iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pkzmftpjix(eablkybsjg eablkybsjgVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        if (z13) {
            eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.wflxmlrfwp.f84694iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.ojitshcjhn(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void stevsuqkhv(TextInputLayout textInputLayout, boolean z13, int i13) {
        String string = wkgbmnqykc().getString(i13);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        kegysxyocb(textInputLayout, z13, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wwaezpbzkn(eablkybsjg eablkybsjgVar, View view) {
        Date time = eablkybsjgVar.f84674lereixgezr.getTime();
        zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C1916ppxfxbqfkf(time));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.nufgyqmvbu(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ylkuphrtab(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.ojitshcjhn(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zynmafqrjb(eablkybsjg eablkybsjgVar, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.agtfadlqog(z13));
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: cllcsxoeiz, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yo.ppxfxbqfkf binding, rp.gtknphoqwx model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f125994lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.agtfadlqog());
        binding.f125996ojitshcjhn.setText(model.draadjrbmk());
        binding.f125985gtknphoqwx.setText(model.lqeggnwhkg());
        TextInputLayout ilSmsCode = binding.f125993lereixgezr;
        zdlpuopuiu.dxjokdxxww(ilSmsCode, "ilSmsCode");
        stevsuqkhv(ilSmsCode, model.wflxmlrfwp(), uo.wkgbmnqykc.enter_correct_sms_code);
        TextInputLayout ilFirstName = binding.f126005yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(ilFirstName, "ilFirstName");
        stevsuqkhv(ilFirstName, model.nufgyqmvbu(), uo.wkgbmnqykc.enter_first_name);
        TextInputLayout ilLastName = binding.f125990iwizpuwonk;
        zdlpuopuiu.dxjokdxxww(ilLastName, "ilLastName");
        stevsuqkhv(ilLastName, model.gtknphoqwx(), uo.wkgbmnqykc.enter_last_name);
        TextInputLayout ilGender = binding.f125991jyumaefscl;
        zdlpuopuiu.dxjokdxxww(ilGender, "ilGender");
        stevsuqkhv(ilGender, model.dxjokdxxww(), uo.wkgbmnqykc.choose_gender);
        TextInputLayout ilBirthDate = binding.f125997oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ilBirthDate, "ilBirthDate");
        stevsuqkhv(ilBirthDate, model.iobyxmoadg(), uo.wkgbmnqykc.choose_birth_date);
        TextInputLayout ilCardNumber = binding.f125992kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(ilCardNumber, "ilCardNumber");
        stevsuqkhv(ilCardNumber, model.ppxfxbqfkf(), uo.wkgbmnqykc.enter_card_number);
        TextInputLayout ilCardNumber2 = binding.f125992kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(ilCardNumber2, "ilCardNumber");
        ilCardNumber2.setVisibility(model.wkgbmnqykc() ? 0 : 8);
        LinearLayout llCardOptions = binding.f125998pmvmpeiblj;
        zdlpuopuiu.dxjokdxxww(llCardOptions, "llCardOptions");
        llCardOptions.setVisibility(model.eablkybsjg() ? 0 : 8);
        TextInputLayout ilPromo = binding.f125984esjtqupxsv;
        zdlpuopuiu.dxjokdxxww(ilPromo, "ilPromo");
        ilPromo.setVisibility(model.btonecajqb() ? 0 : 8);
        if (model.zoijcleaow()) {
            binding.f125988iozdgvuglv.setText(uo.wkgbmnqykc.card_exist_caption);
        }
        if (model.gxszxtbevo()) {
            binding.f125988iozdgvuglv.setText(uo.wkgbmnqykc.card_registration_caption);
        }
    }

    public final void hkdspvbjdz(Date date) {
        zdlpuopuiu.btonecajqb(date, "date");
        this.f84674lereixgezr.setTime(date);
        String str = iwizpuwonk().format(date);
        ((yo.ppxfxbqfkf) this.f84673jyumaefscl.invoke()).f125982dxjokdxxww.setText(str);
        zdlpuopuiu.lqeggnwhkg(str);
        ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(str));
    }

    public final void wypolnanlu(yo.ppxfxbqfkf binding, String smsCode) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        binding.f126001vdvldrhtss.removeTextChangedListener(this.f84671esjtqupxsv);
        TextInputEditText etSms = binding.f126001vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(etSms, "etSms");
        oxmwwwfdhm.zoijcleaow(etSms, smsCode);
        binding.f126001vdvldrhtss.addTextChangedListener(this.f84671esjtqupxsv);
    }
}
