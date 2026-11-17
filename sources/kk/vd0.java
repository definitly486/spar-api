package kk;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vd0 extends ClickableSpan {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ String f58989jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ int f58990yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f58991zdlpuopuiu;

    public vd0(npi.spay.x1 x1Var, int i13, String str) {
        this.f58991zdlpuopuiu = x1Var;
        this.f58990yggfygwlhe = i13;
        this.f58989jyumaefscl = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(widget, "widget");
        ((c6) this.f58991zdlpuopuiu.yadqdtsiqt()).draadjrbmk(new sl(this.f58990yggfygwlhe, this.f58989jyumaefscl));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ds2, "ds");
        npi.spay.x1 x1Var = this.f58991zdlpuopuiu;
        int i13 = R.color.spay_main_bank_green_color;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(x1Var, "<this>");
        ds2.setColor(i1.nufgyqmvbu.wkgbmnqykc(x1Var.getResources(), i13, null));
        ds2.setUnderlineText(false);
    }
}
