package ru.myspar.proloyalty.rate.feedback.impl.presentation;

import android.text.Editable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ml1.btonecajqb;
import ru.tinkoff.decoro.MaskImpl;
import tg.draadjrbmk;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends tr0.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f100020jyumaefscl;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f100019iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f100018cqumvgiudr = 8;

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
        this.f100020jyumaefscl = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(t11.zoijcleaow.f109309iobyxmoadg.iobyxmoadg()));
        kl1.iobyxmoadg iobyxmoadgVar = (kl1.iobyxmoadg) binding.invoke();
        rgvfuqvkyq(iobyxmoadgVar);
        ComposeView cvActionBar = iobyxmoadgVar.f59796nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(lqeggnwhkg.proloyalty_feedback_caption);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: ml1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.vdvldrhtss(this.f67460zdlpuopuiu);
            }
        }, null, null, 109, null);
        TextInputEditText etReason = iobyxmoadgVar.f59789gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etReason, "etReason");
        bc1.lqeggnwhkg.iobyxmoadg(etReason, new draadjrbmk() { // from class: ml1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.oxmwwwfdhm(this.f67458zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etPhone = iobyxmoadgVar.f59783btonecajqb;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        bc1.lqeggnwhkg.iobyxmoadg(etPhone, new draadjrbmk() { // from class: ml1.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.kcexrzcfyt(this.f67468zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etName = iobyxmoadgVar.f59786dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(etName, "etName");
        bc1.lqeggnwhkg.iobyxmoadg(etName, new draadjrbmk() { // from class: ml1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.zdlpuopuiu(this.f67449zdlpuopuiu, (CharSequence) obj);
            }
        });
        iobyxmoadgVar.f59787eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: ml1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.yggfygwlhe(this.f67464zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f59803wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: ml1.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.jyumaefscl(this.f67466zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f59790gxszxtbevo.setOnClickListener(new View.OnClickListener() { // from class: ml1.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.iwizpuwonk(this.f67467zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f59805zdlpuopuiu.setOnClickListener(new View.OnClickListener() { // from class: ml1.oxmwwwfdhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.cqumvgiudr(this.f67465zdlpuopuiu, view);
            }
        });
        iobyxmoadgVar.f59804yggfygwlhe.setOnClickListener(new View.OnClickListener() { // from class: ml1.kcexrzcfyt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.proloyalty.rate.feedback.impl.presentation.wkgbmnqykc.esjtqupxsv(this.f67462zdlpuopuiu, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cqumvgiudr(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.iobyxmoadg.f100025iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void esjtqupxsv(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.wkgbmnqykc.f100029iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.dxjokdxxww.f100022iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.ppxfxbqfkf.f100028iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(wkgbmnqykc wkgbmnqykcVar, CharSequence charSequence) {
        String strCrxdokpmqz = wkgbmnqykcVar.f100020jyumaefscl.ppxfxbqfkf().crxdokpmqz();
        zdlpuopuiu.dxjokdxxww(strCrxdokpmqz, "toUnformattedString(...)");
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.lqeggnwhkg(strCrxdokpmqz));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(wkgbmnqykc wkgbmnqykcVar, CharSequence charSequence) {
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.nufgyqmvbu(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void rgvfuqvkyq(kl1.iobyxmoadg iobyxmoadgVar) {
        this.f100020jyumaefscl.ppxfxbqfkf().M(true);
        this.f100020jyumaefscl.wkgbmnqykc(iobyxmoadgVar.f59783btonecajqb);
        Editable text = iobyxmoadgVar.f59783btonecajqb.getText();
        if (text == null || text.length() == 0) {
            iobyxmoadgVar.f59783btonecajqb.setText("7");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2402zoijcleaow.f100030iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(wkgbmnqykc wkgbmnqykcVar, View view) {
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaow.C2402zoijcleaow.f100030iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zdlpuopuiu(wkgbmnqykc wkgbmnqykcVar, CharSequence charSequence) {
        wkgbmnqykcVar.ppxfxbqfkf(new zoijcleaow.gxszxtbevo(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tr0.iobyxmoadg
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(kl1.iobyxmoadg binding, btonecajqb model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        ComposeView clLoading = binding.f59795lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, model.gxszxtbevo());
        TextInputEditText etReason = binding.f59789gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etReason, "etReason");
        bc1.lqeggnwhkg.zoijcleaow(etReason, model.eablkybsjg());
        binding.f59794kcexrzcfyt.setErrorEnabled(model.iobyxmoadg());
        if (model.iobyxmoadg()) {
            binding.f59794kcexrzcfyt.setError(wkgbmnqykc().getString(lqeggnwhkg.proloyalty_enter_feedback_reason));
        }
        binding.f59798oxmwwwfdhm.setErrorEnabled(model.wkgbmnqykc());
        if (model.wkgbmnqykc()) {
            binding.f59798oxmwwwfdhm.setError(wkgbmnqykc().getString(lqeggnwhkg.proloyalty_enter_feedback_reason));
        }
        binding.f59784cqumvgiudr.setText(model.zoijcleaow());
        MaterialTextView tvFilename = binding.f59784cqumvgiudr;
        zdlpuopuiu.dxjokdxxww(tvFilename, "tvFilename");
        tvFilename.setVisibility(model.zoijcleaow() == null ? 4 : 0);
        AppCompatImageView ivDelete = binding.f59804yggfygwlhe;
        zdlpuopuiu.dxjokdxxww(ivDelete, "ivDelete");
        ivDelete.setVisibility(model.zoijcleaow() == null ? 4 : 0);
        Group groupNoAuthForm = binding.f59785draadjrbmk;
        zdlpuopuiu.dxjokdxxww(groupNoAuthForm, "groupNoAuthForm");
        groupNoAuthForm.setVisibility(model.ppxfxbqfkf() ? 0 : 8);
    }
}
