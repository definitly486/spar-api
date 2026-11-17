package ru.myspar.proloyalty.legacy.presentation.screen.editreceiver;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.tinkoff.decoro.MaskImpl;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;
import z41.jyumaefscl;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f96961jyumaefscl;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f96960iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f96959cqumvgiudr = 8;

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
        this.f96961jyumaefscl = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(t11.zoijcleaow.f109309iobyxmoadg.iobyxmoadg()));
        jyumaefscl jyumaefsclVar = (jyumaefscl) binding.invoke();
        draadjrbmk(jyumaefsclVar);
        ComposeView cvActionBar = jyumaefsclVar.f128192ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        ConstraintLayout constraintLayoutZoijcleaow = jyumaefsclVar.getRoot();
        zdlpuopuiu.dxjokdxxww(constraintLayoutZoijcleaow, "getRoot(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, dxjokdxxww.wkgbmnqykc(constraintLayoutZoijcleaow, lqeggnwhkg.proloyalty_receiver_data_title), null, false, new tg.iobyxmoadg() { // from class: ia1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.eablkybsjg.wflxmlrfwp(this.f42259zdlpuopuiu);
            }
        }, null, null, 109, null);
        TextInputEditText etFirstName = jyumaefsclVar.f128194wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        bc1.lqeggnwhkg.iobyxmoadg(etFirstName, new draadjrbmk() { // from class: ia1.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.eablkybsjg.agtfadlqog(this.f42248zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etLastName = jyumaefsclVar.f128186eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        bc1.lqeggnwhkg.iobyxmoadg(etLastName, new draadjrbmk() { // from class: ia1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.eablkybsjg.ojitshcjhn(this.f42246zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etPhone = jyumaefsclVar.f128188gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        bc1.lqeggnwhkg.iobyxmoadg(etPhone, new draadjrbmk() { // from class: ia1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.eablkybsjg.rgvfuqvkyq(this.f42249zdlpuopuiu, (CharSequence) obj);
            }
        });
        jyumaefsclVar.f128195zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: ia1.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.eablkybsjg.vdvldrhtss(this.f42247zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.zoijcleaow(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void draadjrbmk(jyumaefscl jyumaefsclVar) {
        this.f96961jyumaefscl.wkgbmnqykc(jyumaefsclVar.f128188gxszxtbevo);
        this.f96961jyumaefscl.ppxfxbqfkf().M(true);
        Editable text = jyumaefsclVar.f128188gxszxtbevo.getText();
        if (text == null || text.length() == 0) {
            jyumaefsclVar.f128188gxszxtbevo.setText("7");
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
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2287ppxfxbqfkf(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        String strCrxdokpmqz = eablkybsjgVar.f96961jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(strCrxdokpmqz));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.eablkybsjg.f96964iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f96965iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zdlpuopuiu(EditText editText, String str) {
        String strCrxdokpmqz = this.f96961jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        if (zdlpuopuiu.eablkybsjg(strCrxdokpmqz, str)) {
            return;
        }
        editText.setText(str);
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(jyumaefscl binding, ia1.lqeggnwhkg model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        boolean z13 = (model.zoijcleaow() || model.wkgbmnqykc() || model.gxszxtbevo()) ? false : true;
        TextInputEditText etFirstName = binding.f128194wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        kcexrzcfyt(etFirstName, model.iobyxmoadg());
        TextInputEditText etLastName = binding.f128186eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        kcexrzcfyt(etLastName, model.ppxfxbqfkf());
        TextInputEditText etPhone = binding.f128188gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        zdlpuopuiu(etPhone, model.eablkybsjg());
        if (model.zoijcleaow()) {
            TextInputLayout textInputLayout = binding.f128187gtknphoqwx;
            ConstraintLayout constraintLayoutZoijcleaow = binding.getRoot();
            zdlpuopuiu.dxjokdxxww(constraintLayoutZoijcleaow, "getRoot(...)");
            textInputLayout.setError(dxjokdxxww.wkgbmnqykc(constraintLayoutZoijcleaow, lqeggnwhkg.proloyalty_edit_order_enter_first_name));
        }
        binding.f128187gtknphoqwx.setErrorEnabled(model.zoijcleaow());
        if (model.wkgbmnqykc()) {
            TextInputLayout textInputLayout2 = binding.f128184draadjrbmk;
            ConstraintLayout constraintLayoutZoijcleaow2 = binding.getRoot();
            zdlpuopuiu.dxjokdxxww(constraintLayoutZoijcleaow2, "getRoot(...)");
            textInputLayout2.setError(dxjokdxxww.wkgbmnqykc(constraintLayoutZoijcleaow2, lqeggnwhkg.proloyalty_edit_order_enter_last_name));
        }
        binding.f128184draadjrbmk.setErrorEnabled(model.wkgbmnqykc());
        if (model.gxszxtbevo()) {
            TextInputLayout textInputLayout3 = binding.f128193wflxmlrfwp;
            ConstraintLayout constraintLayoutZoijcleaow3 = binding.getRoot();
            zdlpuopuiu.dxjokdxxww(constraintLayoutZoijcleaow3, "getRoot(...)");
            textInputLayout3.setError(dxjokdxxww.wkgbmnqykc(constraintLayoutZoijcleaow3, lqeggnwhkg.proloyalty_enter_correct_phone));
        }
        binding.f128193wflxmlrfwp.setErrorEnabled(model.gxszxtbevo());
        MaterialButton btSave = binding.f128195zoijcleaow;
        zdlpuopuiu.dxjokdxxww(btSave, "btSave");
        btSave.setVisibility(model.lqeggnwhkg() ? 0 : 8);
        binding.f128195zoijcleaow.setEnabled(z13);
    }
}
