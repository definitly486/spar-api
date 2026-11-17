package o12;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends jyumaefscl implements vdvldrhtss {
        public iobyxmoadg() {
            super(3);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(obj, (List) obj2, ((Number) obj3).intValue());
        }

        public final Boolean iobyxmoadg(Object obj, List noName_1, int i13) {
            zdlpuopuiu.btonecajqb(noName_1, "$noName_1");
            return Boolean.valueOf(obj instanceof p12.iobyxmoadg.zoijcleaow);
        }
    }

    public static final class ppxfxbqfkf extends ClickableSpan {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f71552yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ef.iobyxmoadg f71553zdlpuopuiu;

        ppxfxbqfkf(ef.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
            this.f71553zdlpuopuiu = iobyxmoadgVar;
            this.f71552yggfygwlhe = iobyxmoadgVar2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zdlpuopuiu.btonecajqb(view, "view");
            this.f71552yggfygwlhe.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            zdlpuopuiu.btonecajqb(textPaint, "textPaint");
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f71553zdlpuopuiu.wkgbmnqykc().getColor(s40.wkgbmnqykc.green_1));
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f71554zdlpuopuiu = new zoijcleaow();

        public zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final LayoutInflater invoke(ViewGroup parent) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            zdlpuopuiu.dxjokdxxww(layoutInflaterFrom, "from(parent.context)");
            return layoutInflaterFrom;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l12.iobyxmoadg eablkybsjg(LayoutInflater layoutInflater, ViewGroup root) {
        zdlpuopuiu.btonecajqb(layoutInflater, "layoutInflater");
        zdlpuopuiu.btonecajqb(root, "root");
        l12.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = l12.iobyxmoadg.ppxfxbqfkf(layoutInflater, root, false);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarPpxfxbqfkf, "inflate(...)");
        return iobyxmoadgVarPpxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, final tg.iobyxmoadg iobyxmoadgVar2, ef.iobyxmoadg adapterDelegateViewBinding) {
        zdlpuopuiu.btonecajqb(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(adapterDelegateViewBinding, iobyxmoadgVar);
        MaterialTextView materialTextView = ((l12.iobyxmoadg) adapterDelegateViewBinding.ppxfxbqfkf()).f61344ppxfxbqfkf;
        materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
        materialTextView.setHighlightColor(materialTextView.getContext().getColor(s40.wkgbmnqykc.green_3));
        materialTextView.setText(lqeggnwhkg(adapterDelegateViewBinding, ppxfxbqfkfVar), TextView.BufferType.SPANNABLE);
        ((l12.iobyxmoadg) adapterDelegateViewBinding.ppxfxbqfkf()).f61345zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: o12.wkgbmnqykc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eablkybsjg.nufgyqmvbu(iobyxmoadgVar2, view);
            }
        });
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final Spannable lqeggnwhkg(ef.iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
        String string = iobyxmoadgVar.wkgbmnqykc().getString(k12.ppxfxbqfkf.sbp_payment_method_hint);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        String string2 = iobyxmoadgVar.wkgbmnqykc().getString(k12.ppxfxbqfkf.sbp_payment_method_hint_selection);
        zdlpuopuiu.dxjokdxxww(string2, "getString(...)");
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(string, string2, 0, false, 6, null);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(ppxfxbqfkfVar, iYdmasvzmpa, string2.length() + iYdmasvzmpa, 34);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar, View view) {
        iobyxmoadgVar.invoke();
    }

    public static final df.zoijcleaow wkgbmnqykc(final tg.iobyxmoadg onUrlSbpRecurringClicked, final tg.iobyxmoadg onBtnAcceptClicked) {
        zdlpuopuiu.btonecajqb(onUrlSbpRecurringClicked, "onUrlSbpRecurringClicked");
        zdlpuopuiu.btonecajqb(onBtnAcceptClicked, "onBtnAcceptClicked");
        return new ef.zoijcleaow(new rgvfuqvkyq() { // from class: o12.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return eablkybsjg.eablkybsjg((LayoutInflater) obj, (ViewGroup) obj2);
            }
        }, new iobyxmoadg(), new draadjrbmk() { // from class: o12.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return eablkybsjg.gxszxtbevo(onUrlSbpRecurringClicked, onBtnAcceptClicked, (ef.iobyxmoadg) obj);
            }
        }, zoijcleaow.f71554zdlpuopuiu);
    }
}
