package ru.myspar.specialbanner.impl.presentation.views;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import c52.pmvmpeiblj;
import c60.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ge0.oxmwwwfdhm;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.a0;
import mj.kcexrzcfyt;
import pm.dxjokdxxww;
import pm.eablkybsjg;
import ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView;
import tg.draadjrbmk;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002?@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u001b\u0010\u0017\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0017\u0010\u000eJ\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b \u0010\u001bJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R$\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010%R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lru/myspar/specialbanner/impl/presentation/views/RegistrationFormView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSendClickListener", "(Ltg/iobyxmoadg;)V", "setAttachCheckListener", "setDeleteCheckListener", "setViewTermsListener", "Lkotlin/Function1;", "Lru/myspar/specialbanner/impl/presentation/views/RegistrationFormView$zoijcleaow;", "setFormChangedListener", "(Ltg/draadjrbmk;)V", "setReceiptDateClickedListener", "setReceiptDateClearClickListener", "Lf62/iobyxmoadg;", "data", "setData", "(Lf62/iobyxmoadg;)V", "item", "tzroggbefp", "ntlheqmsrt", "mbcevpiqjq", "kegysxyocb", "ulzqkzuiru", "stevsuqkhv", "()V", "zdlpuopuiu", "Ltg/iobyxmoadg;", "sendClickListener", "yggfygwlhe", "attachCheckClickListener", "jyumaefscl", "deleteCheckClickListener", "iwizpuwonk", "viewTermsClickListener", "cqumvgiudr", "Ltg/draadjrbmk;", "formChangedListener", "esjtqupxsv", "receiptDateClickedListener", "lereixgezr", "receiptDateClearClickListener", "Lm60/a0;", "pmvmpeiblj", "Lm60/a0;", "binding", "", "zynmafqrjb", "Lgg/gtknphoqwx;", "getAdditionalFieldHint", "()Ljava/lang/String;", "additionalFieldHint", "istkbnxepw", "zoijcleaow", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegistrationFormView extends ConstraintLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk formChangedListener;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg receiptDateClickedListener;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg viewTermsClickListener;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg deleteCheckClickListener;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg receiptDateClearClickListener;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private a0 binding;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg attachCheckClickListener;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg sendClickListener;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx additionalFieldHint;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f104218cdpycssgdh = 8;

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f104229iobyxmoadg;

        static {
            int[] iArr = new int[pmvmpeiblj.values().length];
            try {
                iArr[pmvmpeiblj.IN_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pmvmpeiblj.ONLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pmvmpeiblj.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104229iobyxmoadg = iArr;
        }
    }

    public static final class wkgbmnqykc extends ClickableSpan {
        wkgbmnqykc() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            zdlpuopuiu.btonecajqb(widget, "widget");
            iobyxmoadg iobyxmoadgVar = RegistrationFormView.this.viewTermsClickListener;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.invoke();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            zdlpuopuiu.btonecajqb(ds2, "ds");
            Context context = RegistrationFormView.this.getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            ds2.setColor(c60.zoijcleaow.ppxfxbqfkf(context, lqeggnwhkg.iobyxmoadg.colorPrimary));
            ds2.setUnderlineText(false);
        }
    }

    public static abstract class zoijcleaow {

        public static final class eablkybsjg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final pmvmpeiblj f104231iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public eablkybsjg(pmvmpeiblj orderType) {
                super(null);
                zdlpuopuiu.btonecajqb(orderType, "orderType");
                this.f104231iobyxmoadg = orderType;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof eablkybsjg) && this.f104231iobyxmoadg == ((eablkybsjg) obj).f104231iobyxmoadg;
            }

            public int hashCode() {
                return this.f104231iobyxmoadg.hashCode();
            }

            public final pmvmpeiblj iobyxmoadg() {
                return this.f104231iobyxmoadg;
            }

            public String toString() {
                return "OrderTypeChanged(orderType=" + this.f104231iobyxmoadg + ")";
            }
        }

        public static final class gxszxtbevo extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104232iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public gxszxtbevo(String phone) {
                super(null);
                zdlpuopuiu.btonecajqb(phone, "phone");
                this.f104232iobyxmoadg = phone;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f104232iobyxmoadg, ((gxszxtbevo) obj).f104232iobyxmoadg);
            }

            public int hashCode() {
                return this.f104232iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104232iobyxmoadg;
            }

            public String toString() {
                return "PhoneChanged(phone=" + this.f104232iobyxmoadg + ")";
            }
        }

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104233iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(String additionalField) {
                super(null);
                zdlpuopuiu.btonecajqb(additionalField, "additionalField");
                this.f104233iobyxmoadg = additionalField;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104233iobyxmoadg, ((iobyxmoadg) obj).f104233iobyxmoadg);
            }

            public int hashCode() {
                return this.f104233iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104233iobyxmoadg;
            }

            public String toString() {
                return "AdditionalChanged(additionalField=" + this.f104233iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104234iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ppxfxbqfkf(String name) {
                super(null);
                zdlpuopuiu.btonecajqb(name, "name");
                this.f104234iobyxmoadg = name;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104234iobyxmoadg, ((ppxfxbqfkf) obj).f104234iobyxmoadg);
            }

            public int hashCode() {
                return this.f104234iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104234iobyxmoadg;
            }

            public String toString() {
                return "NameChanged(name=" + this.f104234iobyxmoadg + ")";
            }
        }

        public static final class wkgbmnqykc extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104235iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wkgbmnqykc(String orderNumber) {
                super(null);
                zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
                this.f104235iobyxmoadg = orderNumber;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f104235iobyxmoadg, ((wkgbmnqykc) obj).f104235iobyxmoadg);
            }

            public int hashCode() {
                return this.f104235iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104235iobyxmoadg;
            }

            public String toString() {
                return "OrderNumberChanged(orderNumber=" + this.f104235iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2519zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f104236iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2519zoijcleaow(String email) {
                super(null);
                zdlpuopuiu.btonecajqb(email, "email");
                this.f104236iobyxmoadg = email;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2519zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f104236iobyxmoadg, ((C2519zoijcleaow) obj).f104236iobyxmoadg);
            }

            public int hashCode() {
                return this.f104236iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f104236iobyxmoadg;
            }

            public String toString() {
                return "EmailChanged(email=" + this.f104236iobyxmoadg + ")";
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegistrationFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cdpycssgdh(Context context) {
        return context.getString(dxjokdxxww.city_of_residence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cllcsxoeiz(RegistrationFormView registrationFormView, View view) {
        iobyxmoadg iobyxmoadgVar = registrationFormView.receiptDateClearClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dsvhmnatus(RegistrationFormView registrationFormView, CompoundButton compoundButton, boolean z13) {
        draadjrbmk draadjrbmkVar;
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        if (!z13 || (draadjrbmkVar = registrationFormView.formChangedListener) == null) {
            return;
        }
        draadjrbmkVar.invoke(new zoijcleaow.eablkybsjg(pmvmpeiblj.IN_STORE));
    }

    private final String getAdditionalFieldHint() {
        return (String) this.additionalFieldHint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hcddaimhww(RegistrationFormView registrationFormView, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = registrationFormView.formChangedListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new zoijcleaow.iobyxmoadg(it));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hkdspvbjdz(RegistrationFormView registrationFormView, View view) {
        iobyxmoadg iobyxmoadgVar = registrationFormView.receiptDateClickedListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iozdgvuglv(RegistrationFormView registrationFormView, View view) {
        iobyxmoadg iobyxmoadgVar = registrationFormView.attachCheckClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jpowsppfya(RegistrationFormView registrationFormView, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = registrationFormView.formChangedListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new zoijcleaow.wkgbmnqykc(it));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lmojexxdyd(RegistrationFormView registrationFormView, View view) {
        iobyxmoadg iobyxmoadgVar = registrationFormView.deleteCheckClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pkzmftpjix(RegistrationFormView registrationFormView, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = registrationFormView.formChangedListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new zoijcleaow.C2519zoijcleaow(it));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void stevsuqkhv() {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        String string = getContext().getString(dxjokdxxww.terms);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        int iYdmasvzmpa = kcexrzcfyt.ydmasvzmpa(string, "условия публичной оферты", 0, false, 6, null);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(wkgbmnqykcVar, iYdmasvzmpa, iYdmasvzmpa + 24, 33);
        this.binding.f65308hcddaimhww.setMovementMethod(LinkMovementMethod.getInstance());
        this.binding.f65308hcddaimhww.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wwaezpbzkn(RegistrationFormView registrationFormView, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = registrationFormView.formChangedListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new zoijcleaow.ppxfxbqfkf(it));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wypolnanlu(RegistrationFormView registrationFormView, CompoundButton compoundButton, boolean z13) {
        draadjrbmk draadjrbmkVar;
        zdlpuopuiu.btonecajqb(compoundButton, "<unused var>");
        if (!z13 || (draadjrbmkVar = registrationFormView.formChangedListener) == null) {
            return;
        }
        draadjrbmkVar.invoke(new zoijcleaow.eablkybsjg(pmvmpeiblj.ONLINE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yadqdtsiqt(RegistrationFormView registrationFormView, View view) {
        iobyxmoadg iobyxmoadgVar = registrationFormView.sendClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ylkuphrtab(RegistrationFormView registrationFormView, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = registrationFormView.formChangedListener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(new zoijcleaow.gxszxtbevo(it));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void kegysxyocb(f62.iobyxmoadg item) {
        zdlpuopuiu.btonecajqb(item, "item");
        this.binding.f65307gxszxtbevo.setEnabled(item.kcexrzcfyt());
    }

    public final void mbcevpiqjq(f62.iobyxmoadg item) {
        zdlpuopuiu.btonecajqb(item, "item");
        a0 a0Var = this.binding;
        int i13 = ppxfxbqfkf.f104229iobyxmoadg[item.vdvldrhtss().ordinal()];
        if (i13 == 1) {
            int checkedRadioButtonId = a0Var.f65310iozdgvuglv.getCheckedRadioButtonId();
            int i14 = eablkybsjg.rbInStore;
            if (checkedRadioButtonId != i14) {
                a0Var.f65310iozdgvuglv.check(i14);
            }
            Group groupOrderNumber = a0Var.f65314kcexrzcfyt;
            zdlpuopuiu.dxjokdxxww(groupOrderNumber, "groupOrderNumber");
            groupOrderNumber.setVisibility(8);
            Group groupAttachCheck = a0Var.f65325vdvldrhtss;
            zdlpuopuiu.dxjokdxxww(groupAttachCheck, "groupAttachCheck");
            groupAttachCheck.setVisibility(item.btonecajqb() == null ? 0 : 8);
            Group groupFile = a0Var.f65320oxmwwwfdhm;
            zdlpuopuiu.dxjokdxxww(groupFile, "groupFile");
            groupFile.setVisibility(item.btonecajqb() != null ? 0 : 8);
        } else if (i13 == 2) {
            int checkedRadioButtonId2 = a0Var.f65310iozdgvuglv.getCheckedRadioButtonId();
            int i15 = eablkybsjg.rbOnline;
            if (checkedRadioButtonId2 != i15) {
                a0Var.f65310iozdgvuglv.check(i15);
            }
            Group groupOrderNumber2 = a0Var.f65314kcexrzcfyt;
            zdlpuopuiu.dxjokdxxww(groupOrderNumber2, "groupOrderNumber");
            groupOrderNumber2.setVisibility(0);
            Group groupAttachCheck2 = a0Var.f65325vdvldrhtss;
            zdlpuopuiu.dxjokdxxww(groupAttachCheck2, "groupAttachCheck");
            groupAttachCheck2.setVisibility(8);
            Group groupFile2 = a0Var.f65320oxmwwwfdhm;
            zdlpuopuiu.dxjokdxxww(groupFile2, "groupFile");
            groupFile2.setVisibility(8);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a0Var.f65310iozdgvuglv.clearCheck();
            Group groupOrderNumber3 = a0Var.f65314kcexrzcfyt;
            zdlpuopuiu.dxjokdxxww(groupOrderNumber3, "groupOrderNumber");
            groupOrderNumber3.setVisibility(8);
            Group groupAttachCheck3 = a0Var.f65325vdvldrhtss;
            zdlpuopuiu.dxjokdxxww(groupAttachCheck3, "groupAttachCheck");
            groupAttachCheck3.setVisibility(8);
            Group groupFile3 = a0Var.f65320oxmwwwfdhm;
            zdlpuopuiu.dxjokdxxww(groupFile3, "groupFile");
            groupFile3.setVisibility(8);
        }
        ntlheqmsrt(item);
    }

    public final void ntlheqmsrt(f62.iobyxmoadg item) {
        zdlpuopuiu.btonecajqb(item, "item");
        a0 a0Var = this.binding;
        TextInputLayout ilDateReceipt = a0Var.f65313jyumaefscl;
        zdlpuopuiu.dxjokdxxww(ilDateReceipt, "ilDateReceipt");
        boolean z13 = true;
        ilDateReceipt.setVisibility(item.vdvldrhtss() == pmvmpeiblj.IN_STORE ? 0 : 8);
        AppCompatImageView ivDateClear = a0Var.f65334zynmafqrjb;
        zdlpuopuiu.dxjokdxxww(ivDateClear, "ivDateClear");
        String strRgvfuqvkyq = item.rgvfuqvkyq();
        if (strRgvfuqvkyq != null && strRgvfuqvkyq.length() != 0) {
            z13 = false;
        }
        ivDateClear.setVisibility(z13 ? 8 : 0);
        TextInputEditText etDateReceipt = a0Var.f65318nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(etDateReceipt, "etDateReceipt");
        String strRgvfuqvkyq2 = item.rgvfuqvkyq();
        if (strRgvfuqvkyq2 == null) {
            strRgvfuqvkyq2 = "";
        }
        oxmwwwfdhm.zoijcleaow(etDateReceipt, strRgvfuqvkyq2);
    }

    public final void setAttachCheckListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.attachCheckClickListener = listener;
    }

    public final void setData(f62.iobyxmoadg data) {
        zdlpuopuiu.btonecajqb(data, "data");
        a0 a0Var = this.binding;
        a0Var.f65299btonecajqb.setText(data.oxmwwwfdhm());
        a0Var.f65302draadjrbmk.setText(data.ojitshcjhn());
        a0Var.f65303dxjokdxxww.setText(data.dxjokdxxww());
        a0Var.f65317lqeggnwhkg.setText(data.eablkybsjg());
        a0Var.f65306gtknphoqwx.setText(data.wflxmlrfwp());
        TextInputLayout textInputLayout = a0Var.f65330yggfygwlhe;
        String strLqeggnwhkg = data.lqeggnwhkg();
        if (strLqeggnwhkg.length() == 0) {
            strLqeggnwhkg = getAdditionalFieldHint();
        }
        textInputLayout.setHint(strLqeggnwhkg);
        Group groupOrderType = a0Var.f65332zdlpuopuiu;
        zdlpuopuiu.dxjokdxxww(groupOrderType, "groupOrderType");
        groupOrderType.setVisibility(data.draadjrbmk() ? 0 : 8);
        mbcevpiqjq(data);
        tzroggbefp(data);
        kegysxyocb(data);
        ntlheqmsrt(data);
    }

    public final void setDeleteCheckListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.deleteCheckClickListener = listener;
    }

    public final void setFormChangedListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.formChangedListener = listener;
    }

    public final void setReceiptDateClearClickListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.receiptDateClearClickListener = listener;
    }

    public final void setReceiptDateClickedListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.receiptDateClickedListener = listener;
    }

    public final void setSendClickListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.sendClickListener = listener;
    }

    public final void setViewTermsListener(iobyxmoadg listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.viewTermsClickListener = listener;
    }

    public final void tzroggbefp(f62.iobyxmoadg item) {
        zdlpuopuiu.btonecajqb(item, "item");
        a0 a0Var = this.binding;
        if (item.btonecajqb() != null && item.vdvldrhtss() == pmvmpeiblj.IN_STORE) {
            Group groupAttachCheck = a0Var.f65325vdvldrhtss;
            zdlpuopuiu.dxjokdxxww(groupAttachCheck, "groupAttachCheck");
            groupAttachCheck.setVisibility(8);
            Group groupFile = a0Var.f65320oxmwwwfdhm;
            zdlpuopuiu.dxjokdxxww(groupFile, "groupFile");
            groupFile.setVisibility(0);
            a0Var.f65331ylkuphrtab.setText(item.gtknphoqwx());
            return;
        }
        if (item.vdvldrhtss() == pmvmpeiblj.IN_STORE) {
            Group groupAttachCheck2 = a0Var.f65325vdvldrhtss;
            zdlpuopuiu.dxjokdxxww(groupAttachCheck2, "groupAttachCheck");
            groupAttachCheck2.setVisibility(0);
            Group groupFile2 = a0Var.f65320oxmwwwfdhm;
            zdlpuopuiu.dxjokdxxww(groupFile2, "groupFile");
            groupFile2.setVisibility(8);
        }
    }

    public final void ulzqkzuiru(f62.iobyxmoadg item) {
        zdlpuopuiu.btonecajqb(item, "item");
        a0 a0Var = this.binding;
        TextInputEditText etName = a0Var.f65299btonecajqb;
        zdlpuopuiu.dxjokdxxww(etName, "etName");
        oxmwwwfdhm.zoijcleaow(etName, item.oxmwwwfdhm());
        TextInputEditText etPhone = a0Var.f65302draadjrbmk;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        oxmwwwfdhm.zoijcleaow(etPhone, item.ojitshcjhn());
        TextInputEditText etEmail = a0Var.f65303dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(etEmail, "etEmail");
        oxmwwwfdhm.zoijcleaow(etEmail, item.dxjokdxxww());
        TextInputEditText etAdditionalField = a0Var.f65317lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(etAdditionalField, "etAdditionalField");
        oxmwwwfdhm.zoijcleaow(etAdditionalField, item.eablkybsjg());
        TextInputEditText etOrderNumber = a0Var.f65306gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etOrderNumber, "etOrderNumber");
        oxmwwwfdhm.zoijcleaow(etOrderNumber, item.wflxmlrfwp());
    }

    public /* synthetic */ RegistrationFormView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationFormView(final Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        a0 a0VarZoijcleaow = a0.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(a0VarZoijcleaow, "inflate(...)");
        this.binding = a0VarZoijcleaow;
        this.additionalFieldHint = gg.draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: b72.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RegistrationFormView.cdpycssgdh(context);
            }
        });
        stevsuqkhv();
        a0 a0Var = this.binding;
        a0Var.f65300cdpycssgdh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b72.wflxmlrfwp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                RegistrationFormView.dsvhmnatus(this.f15461iobyxmoadg, compoundButton, z13);
            }
        });
        a0Var.f65329yadqdtsiqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b72.agtfadlqog
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                RegistrationFormView.wypolnanlu(this.f15444iobyxmoadg, compoundButton, z13);
            }
        });
        a0Var.f65307gxszxtbevo.setOnClickListener(new View.OnClickListener() { // from class: b72.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationFormView.yadqdtsiqt(this.f15456zdlpuopuiu, view);
            }
        });
        a0Var.f65304eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: b72.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationFormView.iozdgvuglv(this.f15459zdlpuopuiu, view);
            }
        });
        a0Var.f65311istkbnxepw.setOnClickListener(new View.OnClickListener() { // from class: b72.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationFormView.lmojexxdyd(this.f15460zdlpuopuiu, view);
            }
        });
        TextInputEditText etName = a0Var.f65299btonecajqb;
        zdlpuopuiu.dxjokdxxww(etName, "etName");
        lb0.iobyxmoadg.iobyxmoadg(etName, new draadjrbmk() { // from class: b72.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFormView.wwaezpbzkn(this.f15457zdlpuopuiu, (String) obj);
            }
        });
        TextInputEditText etPhone = a0Var.f65302draadjrbmk;
        zdlpuopuiu.dxjokdxxww(etPhone, "etPhone");
        lb0.iobyxmoadg.iobyxmoadg(etPhone, new draadjrbmk() { // from class: b72.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFormView.ylkuphrtab(this.f15454zdlpuopuiu, (String) obj);
            }
        });
        TextInputEditText etEmail = a0Var.f65303dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(etEmail, "etEmail");
        lb0.iobyxmoadg.iobyxmoadg(etEmail, new draadjrbmk() { // from class: b72.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFormView.pkzmftpjix(this.f15455zdlpuopuiu, (String) obj);
            }
        });
        TextInputEditText etAdditionalField = a0Var.f65317lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(etAdditionalField, "etAdditionalField");
        lb0.iobyxmoadg.iobyxmoadg(etAdditionalField, new draadjrbmk() { // from class: b72.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFormView.hcddaimhww(this.f15447zdlpuopuiu, (String) obj);
            }
        });
        TextInputEditText etOrderNumber = a0Var.f65306gtknphoqwx;
        zdlpuopuiu.dxjokdxxww(etOrderNumber, "etOrderNumber");
        lb0.iobyxmoadg.iobyxmoadg(etOrderNumber, new draadjrbmk() { // from class: b72.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return RegistrationFormView.jpowsppfya(this.f15445zdlpuopuiu, (String) obj);
            }
        });
        a0Var.f65318nufgyqmvbu.setOnClickListener(new View.OnClickListener() { // from class: b72.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationFormView.hkdspvbjdz(this.f15449zdlpuopuiu, view);
            }
        });
        a0Var.f65334zynmafqrjb.setOnClickListener(new View.OnClickListener() { // from class: b72.draadjrbmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationFormView.cllcsxoeiz(this.f15446zdlpuopuiu, view);
            }
        });
    }
}
