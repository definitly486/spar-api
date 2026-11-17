package kk;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dw extends ClickableSpan {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ String f56354jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ int f56355yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ npi.spay.i2 f56356zdlpuopuiu;

    public dw(npi.spay.i2 i2Var, int i13, String str) {
        this.f56356zdlpuopuiu = i2Var;
        this.f56355yggfygwlhe = i13;
        this.f56354jyumaefscl = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(widget, "widget");
        ((bf0) this.f56356zdlpuopuiu.yadqdtsiqt()).draadjrbmk(new ds(this.f56355yggfygwlhe, this.f56354jyumaefscl));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ds2, "ds");
        npi.spay.i2 i2Var = this.f56356zdlpuopuiu;
        int i13 = R.color.spay_main_bank_green_color;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(i2Var, "<this>");
        ds2.setColor(i1.nufgyqmvbu.wkgbmnqykc(i2Var.getResources(), i13, null));
        ds2.setUnderlineText(false);
    }
}
