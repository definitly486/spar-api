package ru.myspar.rate.feedback.impl.presentation;

import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import ge0.oxmwwwfdhm;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import ru.tinkoff.decoro.MaskImpl;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f102732jyumaefscl;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f102731iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f102730cqumvgiudr = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f102732jyumaefscl = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(n30.ppxfxbqfkf.f68498iobyxmoadg.iobyxmoadg()));
        tz1.iobyxmoadg iobyxmoadgVar = (tz1.iobyxmoadg) binding.invoke();
        rgvfuqvkyq(iobyxmoadgVar);
        ComposeView cvActionBar = iobyxmoadgVar.f112348nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.feedback_caption);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: vz1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.vdvldrhtss(this.f118214zdlpuopuiu);
            }
        }, null, null, 109, null);
        TextInputEditText etReason = iobyxmoadgVar.f112341gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etReason, "etReason");
        oxmwwwfdhm.iobyxmoadg(etReason, new draadjrbmk() { // from class: vz1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.oxmwwwfdhm(this.f118225zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etPhone = iobyxmoadgVar.f112335btonecajqb;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        oxmwwwfdhm.iobyxmoadg(etPhone, new draadjrbmk() { // from class: vz1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.kcexrzcfyt(this.f118215zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etName = iobyxmoadgVar.f112338dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(etName, "etName");
        oxmwwwfdhm.iobyxmoadg(etName, new draadjrbmk() { // from class: vz1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.zdlpuopuiu(this.f118232zdlpuopuiu, (CharSequence) obj);
            }
        });
        iobyxmoadgVar.f112339eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: vz1.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.yggfygwlhe(this.f118213zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f112355wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: vz1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.jyumaefscl(this.f118228zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f112342gxszxtbevo.setOnClickListener(new View.OnClickListener() { // from class: vz1.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.iwizpuwonk(this.f118230zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f112357zdlpuopuiu.setOnClickListener(new View.OnClickListener() { // from class: vz1.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.cqumvgiudr(this.f118231zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f112356yggfygwlhe.setOnClickListener(new View.OnClickListener() { // from class: vz1.oxmwwwfdhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.rate.feedback.impl.presentation.wkgbmnqykc.esjtqupxsv(this.f118229zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cqumvgiudr(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f102737iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f102741iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.dxjokdxxww.f102734iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f102740iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(wkgbmnqykc wkgbmnqykcVar, CharSequence charSequence) {
        String strCrxdokpmqz = wkgbmnqykcVar.f102732jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.lqeggnwhkg(strCrxdokpmqz));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(wkgbmnqykc wkgbmnqykcVar, CharSequence charSequence) {
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.nufgyqmvbu(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void rgvfuqvkyq(tz1.iobyxmoadg iobyxmoadgVar) {
        this.f102732jyumaefscl.ppxfxbqfkf().M(true);
        this.f102732jyumaefscl.wkgbmnqykc(iobyxmoadgVar.f112335btonecajqb);
        Editable text = iobyxmoadgVar.f112335btonecajqb.getText();
        if (text == null || text.length() == 0) {
            iobyxmoadgVar.f112335btonecajqb.setText("7");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2484zoijcleaow.f102742iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2484zoijcleaow.f102742iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(wkgbmnqykc wkgbmnqykcVar, CharSequence charSequence) {
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.gxszxtbevo(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(tz1.iobyxmoadg binding, vz1.dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f112347lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.gxszxtbevo());
        TextInputEditText etReason = binding.f112341gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etReason, "etReason");
        oxmwwwfdhm.zoijcleaow(etReason, model.eablkybsjg());
        binding.f112346kcexrzcfyt.setErrorEnabled(model.iobyxmoadg());
        if (model.iobyxmoadg()) {
            binding.f112346kcexrzcfyt.setError(wkgbmnqykc().getString(dxjokdxxww.enter_feedback_reason));
        }
        binding.f112350oxmwwwfdhm.setErrorEnabled(model.wkgbmnqykc());
        if (model.wkgbmnqykc()) {
            binding.f112350oxmwwwfdhm.setError(wkgbmnqykc().getString(dxjokdxxww.enter_feedback_reason));
        }
        binding.f112336cqumvgiudr.setText(model.zoijcleaow());
        MaterialTextView tvFilename = binding.f112336cqumvgiudr;
        zdlpuopuiu.dxjokdxxww(tvFilename, "tvFilename");
        tvFilename.setVisibility(model.zoijcleaow() == null ? 4 : 0);
        AppCompatImageView ivDelete = binding.f112356yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(ivDelete, "ivDelete");
        ivDelete.setVisibility(model.zoijcleaow() == null ? 4 : 0);
        Group groupNoAuthForm = binding.f112337draadjrbmk;
        zdlpuopuiu.dxjokdxxww(groupNoAuthForm, "groupNoAuthForm");
        groupNoAuthForm.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
    }
}
