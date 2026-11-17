package ru.myspar.legacy.presentation.screen.personaldata;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ge0.oxmwwwfdhm;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.yadqdtsiqt;
import pm.dxjokdxxww;
import ru.tinkoff.decoro.MaskImpl;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends zs.iobyxmoadg implements d8.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ru.tinkoff.decoro.watchers.zoijcleaow f89361jyumaefscl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(tg.iobyxmoadg binding) {
        super(binding);
        zdlpuopuiu.btonecajqb(binding, "binding");
        this.f89361jyumaefscl = new ru.tinkoff.decoro.watchers.ppxfxbqfkf(MaskImpl.zoijcleaow(n30.ppxfxbqfkf.f68498iobyxmoadg.iobyxmoadg()));
        yadqdtsiqt yadqdtsiqtVar = (yadqdtsiqt) binding.invoke();
        ComposeView cvActionBar = yadqdtsiqtVar.f66124lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = wkgbmnqykc().getString(dxjokdxxww.personal_data);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: qc0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.rgvfuqvkyq(this.f78481zdlpuopuiu);
            }
        }, null, null, 109, null);
        TextInputEditText etFirstName = yadqdtsiqtVar.f66116dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        oxmwwwfdhm.iobyxmoadg(etFirstName, new draadjrbmk() { // from class: qc0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.vdvldrhtss(this.f78497zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etLastName = yadqdtsiqtVar.f66118gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        oxmwwwfdhm.iobyxmoadg(etLastName, new draadjrbmk() { // from class: qc0.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.oxmwwwfdhm(this.f78482zdlpuopuiu, (CharSequence) obj);
            }
        });
        TextInputEditText etEmail = yadqdtsiqtVar.f66125nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(etEmail, "etEmail");
        oxmwwwfdhm.iobyxmoadg(etEmail, new draadjrbmk() { // from class: qc0.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.kcexrzcfyt(this.f78502zdlpuopuiu, (CharSequence) obj);
            }
        });
        yadqdtsiqtVar.f66113btonecajqb.setOnClickListener(new View.OnClickListener() { // from class: qc0.agtfadlqog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.zdlpuopuiu(this.f78480zdlpuopuiu, view);
            }
        });
        yadqdtsiqtVar.f66132wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: qc0.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.yggfygwlhe(this.f78499zdlpuopuiu, view);
            }
        });
        yadqdtsiqtVar.f66128ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: qc0.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.jyumaefscl(this.f78500zdlpuopuiu, view);
            }
        });
        yadqdtsiqtVar.f66117eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: qc0.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ru.myspar.legacy.presentation.screen.personaldata.eablkybsjg.iwizpuwonk(this.f78501zdlpuopuiu, view);
            }
        });
        ojitshcjhn(yadqdtsiqtVar);
    }

    private final void esjtqupxsv(TextInputLayout textInputLayout, boolean z13, int i13) {
        if (z13) {
            textInputLayout.setError(wkgbmnqykc().getString(i13));
        } else {
            textInputLayout.setErrorEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.dxjokdxxww.f89365iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.zoijcleaow.f89373iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kcexrzcfyt(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.C2046ppxfxbqfkf(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ojitshcjhn(yadqdtsiqt yadqdtsiqtVar) {
        this.f89361jyumaefscl.ppxfxbqfkf().M(true);
        this.f89361jyumaefscl.wkgbmnqykc(yadqdtsiqtVar.f66121iwizpuwonk.getTitleView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.lqeggnwhkg(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.iobyxmoadg.f89368iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(eablkybsjg eablkybsjgVar, CharSequence charSequence) {
        eablkybsjgVar.ppxfxbqfkf(new ppxfxbqfkf.wkgbmnqykc(String.valueOf(charSequence)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yggfygwlhe(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.nufgyqmvbu.f89370iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zdlpuopuiu(eablkybsjg eablkybsjgVar, View view) {
        eablkybsjgVar.ppxfxbqfkf(ppxfxbqfkf.gxszxtbevo.f89367iobyxmoadg);
    }

    @Override // zs.iobyxmoadg
    /* JADX INFO: renamed from: cqumvgiudr, reason: merged with bridge method [inline-methods] */
    public void eablkybsjg(yadqdtsiqt binding, qc0.dxjokdxxww model) {
        zdlpuopuiu.btonecajqb(binding, "binding");
        zdlpuopuiu.btonecajqb(model, "model");
        binding.f66121iwizpuwonk.setTitle(model.gtknphoqwx());
        binding.f66133yggfygwlhe.setTitle(model.iobyxmoadg());
        binding.f66122jyumaefscl.setTitle(model.zoijcleaow());
        TextInputEditText etGender = binding.f66113btonecajqb;
        zdlpuopuiu.dxjokdxxww(etGender, "etGender");
        oxmwwwfdhm.zoijcleaow(etGender, model.lqeggnwhkg());
        TextInputEditText etFirstName = binding.f66116dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(etFirstName, "etFirstName");
        oxmwwwfdhm.zoijcleaow(etFirstName, model.eablkybsjg());
        TextInputEditText etLastName = binding.f66118gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etLastName, "etLastName");
        oxmwwwfdhm.zoijcleaow(etLastName, model.dxjokdxxww());
        TextInputEditText etEmail = binding.f66125nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(etEmail, "etEmail");
        oxmwwwfdhm.zoijcleaow(etEmail, model.ppxfxbqfkf());
        Group groupVerifyEmail = binding.f66115draadjrbmk;
        zdlpuopuiu.dxjokdxxww(groupVerifyEmail, "groupVerifyEmail");
        groupVerifyEmail.setVisibility(!model.draadjrbmk() ? 0 : 8);
        binding.f66125nufgyqmvbu.setTextColor(c60.zoijcleaow.ppxfxbqfkf(wkgbmnqykc(), model.draadjrbmk() ? da.zoijcleaow.colorOnSurface : da.zoijcleaow.colorSecondary));
        ComposeView clLoading = binding.f66119gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, model.wflxmlrfwp());
        TextInputLayout ilFirstName = binding.f66127oxmwwwfdhm;
        zdlpuopuiu.dxjokdxxww(ilFirstName, "ilFirstName");
        esjtqupxsv(ilFirstName, model.gxszxtbevo(), dxjokdxxww.enter_first_name);
        TextInputLayout ilLastName = binding.f66134zdlpuopuiu;
        zdlpuopuiu.dxjokdxxww(ilLastName, "ilLastName");
        esjtqupxsv(ilLastName, model.btonecajqb(), dxjokdxxww.enter_last_name);
        TextInputLayout ilEmail = binding.f66130vdvldrhtss;
        zdlpuopuiu.dxjokdxxww(ilEmail, "ilEmail");
        esjtqupxsv(ilEmail, model.wkgbmnqykc(), dxjokdxxww.enter_email);
        TextInputLayout ilGender = binding.f66123kcexrzcfyt;
        zdlpuopuiu.dxjokdxxww(ilGender, "ilGender");
        esjtqupxsv(ilGender, model.nufgyqmvbu(), dxjokdxxww.choose_gender);
    }
}
