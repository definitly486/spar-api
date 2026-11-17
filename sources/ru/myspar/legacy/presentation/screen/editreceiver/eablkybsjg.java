package ru.myspar.legacy.presentation.screen.editreceiver;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c60.nufgyqmvbu;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ge0.oxmwwwfdhm;
import gg.wwaezpbzkn;
import jc0.lqeggnwhkg;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.pmvmpeiblj;
import pm.dxjokdxxww;
import ru.tinkoff.decoro.MaskImpl;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f89173jyumaefscl;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f89172iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f89171cqumvgiudr = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89173jyumaefscl = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(n30.ppxfxbqfkf.f68498iobyxmoadg.iobyxmoadg()));
        pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) binding.invoke();
        draadjrbmk(pmvmpeibljVar);
        ComposeView cvActionBar = pmvmpeibljVar.f65901ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        ConstraintLayout root = pmvmpeibljVar.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, nufgyqmvbu.wkgbmnqykc(root, dxjokdxxww.receiver_data_title), null, false, new tg.iobyxmoadg() { // from class: jc0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.editreceiver.eablkybsjg.wflxmlrfwp(this.f51097zdlpuopuiu);
            }
        }, null, null, 109, null);
        TextInputEditText etFirstName = pmvmpeibljVar.f65903wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        oxmwwwfdhm.iobyxmoadg(etFirstName, new draadjrbmk() { // from class: jc0.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.editreceiver.eablkybsjg.agtfadlqog(this.f51086zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etLastName = pmvmpeibljVar.f65895eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        oxmwwwfdhm.iobyxmoadg(etLastName, new draadjrbmk() { // from class: jc0.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.editreceiver.eablkybsjg.ojitshcjhn(this.f51084zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etPhone = pmvmpeibljVar.f65897gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        oxmwwwfdhm.iobyxmoadg(etPhone, new draadjrbmk() { // from class: jc0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.editreceiver.eablkybsjg.rgvfuqvkyq(this.f51087zdlpuopuiu, (CharSequence) obj);
            }
        });
        pmvmpeibljVar.f65904zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: jc0.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.editreceiver.eablkybsjg.vdvldrhtss(this.f51085zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.zoijcleaow(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void draadjrbmk(pmvmpeiblj pmvmpeibljVar) {
        this.f89173jyumaefscl.wkgbmnqykc(pmvmpeibljVar.f65897gxszxtbevo);
        this.f89173jyumaefscl.ppxfxbqfkf().M(true);
        Editable text = pmvmpeibljVar.f65897gxszxtbevo.getText();
        if (text == null || text.length() == 0) {
            pmvmpeibljVar.f65897gxszxtbevo.setText("7");
        }
    }

    private final void kcexrzcfyt(EditText editText, String str) {
        Editable text = editText.getText();
        if (zdlpuopuiu.eablkybsjg(text != null ? text.toString() : null, str)) {
            return;
        }
        editText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2042ppxfxbqfkf(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        String strCrxdokpmqz = eablkybsjgVar.f89173jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(strCrxdokpmqz));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f89176iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f89177iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zdlpuopuiu(EditText editText, String str) {
        String strCrxdokpmqz = this.f89173jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        if (zdlpuopuiu.eablkybsjg(strCrxdokpmqz, str)) {
            return;
        }
        editText.setText(str);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(pmvmpeiblj binding, lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        boolean z13 = (model.zoijcleaow() || model.wkgbmnqykc() || model.gxszxtbevo()) ? false : true;
        TextInputEditText etFirstName = binding.f65903wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        kcexrzcfyt(etFirstName, model.iobyxmoadg());
        TextInputEditText etLastName = binding.f65895eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        kcexrzcfyt(etLastName, model.ppxfxbqfkf());
        TextInputEditText etPhone = binding.f65897gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        zdlpuopuiu(etPhone, model.eablkybsjg());
        if (model.zoijcleaow()) {
            TextInputLayout textInputLayout = binding.f65896gtknphoqwx;
            ConstraintLayout root = binding.getRoot();
            zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
            textInputLayout.setError(nufgyqmvbu.wkgbmnqykc(root, dxjokdxxww.edit_order_enter_first_name));
        }
        binding.f65896gtknphoqwx.setErrorEnabled(model.zoijcleaow());
        if (model.wkgbmnqykc()) {
            TextInputLayout textInputLayout2 = binding.f65893draadjrbmk;
            ConstraintLayout root2 = binding.getRoot();
            zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
            textInputLayout2.setError(nufgyqmvbu.wkgbmnqykc(root2, dxjokdxxww.edit_order_enter_last_name));
        }
        binding.f65893draadjrbmk.setErrorEnabled(model.wkgbmnqykc());
        if (model.gxszxtbevo()) {
            TextInputLayout textInputLayout3 = binding.f65902wflxmlrfwp;
            ConstraintLayout root3 = binding.getRoot();
            zdlpuopuiu.dxjokdxxww(root3, "getRoot(...)");
            textInputLayout3.setError(nufgyqmvbu.wkgbmnqykc(root3, dxjokdxxww.enter_correct_phone));
        }
        binding.f65902wflxmlrfwp.setErrorEnabled(model.gxszxtbevo());
        MaterialButton btSave = binding.f65904zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btSave, "btSave");
        btSave.setVisibility(model.lqeggnwhkg() ? 0 : 8);
        binding.f65904zoijcleaow.setEnabled(z13);
    }
}
