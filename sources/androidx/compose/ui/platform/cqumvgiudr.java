package androidx.compose.ui.platform;

import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr extends v1.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Handler f6783agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f6784btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private gxszxtbevo f6785cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f6786cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private androidx.collection.xrmfcynszj f6787cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private List f6788draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final androidx.collection.cdpycssgdh f6789dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f6790dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f6792esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f6793gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final s0.iwizpuwonk f6795hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private j f6796hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private androidx.collection.lmojexxdyd f6797iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f6798istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private androidx.collection.xrmfcynszj f6799iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private androidx.collection.iozdgvuglv f6800jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f6801jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private w1.zdlpuopuiu f6802kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final tg.draadjrbmk f6803kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Integer f6804lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private androidx.collection.cdpycssgdh f6805lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final AccessibilityManager f6806lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f6807nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private eablkybsjg f6808ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private w1.zdlpuopuiu f6809oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final String f6810pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final androidx.collection.zoijcleaow f6811pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f6812rgvfuqvkyq;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final List f6813stevsuqkhv;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f6814vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Boolean f6815wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AndroidComposeView f6816wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private androidx.collection.cdpycssgdh f6817wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final Runnable f6818wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private androidx.collection.ojitshcjhn f6819yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f6820yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final String f6821ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f6822zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final rj.lqeggnwhkg f6823zynmafqrjb;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    public static final wkgbmnqykc f6782tzroggbefp = new wkgbmnqykc(null);

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    public static final int f6780mbcevpiqjq = 8;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private static final androidx.collection.wflxmlrfwp f6781ntlheqmsrt = androidx.collection.agtfadlqog.ppxfxbqfkf(a.gtknphoqwx.accessibility_custom_action_0, a.gtknphoqwx.accessibility_custom_action_1, a.gtknphoqwx.accessibility_custom_action_2, a.gtknphoqwx.accessibility_custom_action_3, a.gtknphoqwx.accessibility_custom_action_4, a.gtknphoqwx.accessibility_custom_action_5, a.gtknphoqwx.accessibility_custom_action_6, a.gtknphoqwx.accessibility_custom_action_7, a.gtknphoqwx.accessibility_custom_action_8, a.gtknphoqwx.accessibility_custom_action_9, a.gtknphoqwx.accessibility_custom_action_10, a.gtknphoqwx.accessibility_custom_action_11, a.gtknphoqwx.accessibility_custom_action_12, a.gtknphoqwx.accessibility_custom_action_13, a.gtknphoqwx.accessibility_custom_action_14, a.gtknphoqwx.accessibility_custom_action_15, a.gtknphoqwx.accessibility_custom_action_16, a.gtknphoqwx.accessibility_custom_action_17, a.gtknphoqwx.accessibility_custom_action_18, a.gtknphoqwx.accessibility_custom_action_19, a.gtknphoqwx.accessibility_custom_action_20, a.gtknphoqwx.accessibility_custom_action_21, a.gtknphoqwx.accessibility_custom_action_22, a.gtknphoqwx.accessibility_custom_action_23, a.gtknphoqwx.accessibility_custom_action_24, a.gtknphoqwx.accessibility_custom_action_25, a.gtknphoqwx.accessibility_custom_action_26, a.gtknphoqwx.accessibility_custom_action_27, a.gtknphoqwx.accessibility_custom_action_28, a.gtknphoqwx.accessibility_custom_action_29, a.gtknphoqwx.accessibility_custom_action_30, a.gtknphoqwx.accessibility_custom_action_31);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f6791eablkybsjg = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private tg.draadjrbmk f6794gxszxtbevo = new nufgyqmvbu();

    static final class btonecajqb extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        btonecajqb() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((i) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(i iVar) {
            cqumvgiudr.this.igdgnonuha(iVar);
        }
    }

    static final class draadjrbmk extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final draadjrbmk f6825zdlpuopuiu = new draadjrbmk();

        draadjrbmk() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z.pkzmftpjix pkzmftpjixVar) {
            return Boolean.valueOf(pkzmftpjixVar.weqkydbzbr().rgvfuqvkyq(z.rlfsiqarku.iobyxmoadg(8)));
        }
    }

    static final class dxjokdxxww extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ cqumvgiudr f6826yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ i f6827zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(i iVar, cqumvgiudr cqumvgiudrVar) {
            super(0);
            this.f6827zdlpuopuiu = iVar;
            this.f6826yggfygwlhe = cqumvgiudrVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            g0.zdlpuopuiu zdlpuopuiuVarZoijcleaow;
            z.pkzmftpjix pkzmftpjixVarKcexrzcfyt;
            g0.btonecajqb btonecajqbVarIobyxmoadg = this.f6827zdlpuopuiu.iobyxmoadg();
            g0.btonecajqb btonecajqbVarEablkybsjg = this.f6827zdlpuopuiu.eablkybsjg();
            Float fZoijcleaow = this.f6827zdlpuopuiu.zoijcleaow();
            Float fPpxfxbqfkf = this.f6827zdlpuopuiu.ppxfxbqfkf();
            float fFloatValue = (btonecajqbVarIobyxmoadg == null || fZoijcleaow == null) ? 0.0f : ((Number) btonecajqbVarIobyxmoadg.ppxfxbqfkf().invoke()).floatValue() - fZoijcleaow.floatValue();
            float fFloatValue2 = (btonecajqbVarEablkybsjg == null || fPpxfxbqfkf == null) ? 0.0f : ((Number) btonecajqbVarEablkybsjg.ppxfxbqfkf().invoke()).floatValue() - fPpxfxbqfkf.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iWizcaqwiak = this.f6826yggfygwlhe.wizcaqwiak(this.f6827zdlpuopuiu.wkgbmnqykc());
                g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) this.f6826yggfygwlhe.okpsazkaxt().zoijcleaow(this.f6826yggfygwlhe.f6812rgvfuqvkyq);
                if (jyumaefsclVar != null) {
                    cqumvgiudr cqumvgiudrVar = this.f6826yggfygwlhe;
                    try {
                        w1.zdlpuopuiu zdlpuopuiuVar = cqumvgiudrVar.f6809oxmwwwfdhm;
                        if (zdlpuopuiuVar != null) {
                            zdlpuopuiuVar.metgxyhuhe(cqumvgiudrVar.dsvhmnatus(jyumaefsclVar));
                            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                    } catch (IllegalStateException unused) {
                        gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
                g0.jyumaefscl jyumaefsclVar2 = (g0.jyumaefscl) this.f6826yggfygwlhe.okpsazkaxt().zoijcleaow(this.f6826yggfygwlhe.f6814vdvldrhtss);
                if (jyumaefsclVar2 != null) {
                    cqumvgiudr cqumvgiudrVar2 = this.f6826yggfygwlhe;
                    try {
                        w1.zdlpuopuiu zdlpuopuiuVar2 = cqumvgiudrVar2.f6802kcexrzcfyt;
                        if (zdlpuopuiuVar2 != null) {
                            zdlpuopuiuVar2.metgxyhuhe(cqumvgiudrVar2.dsvhmnatus(jyumaefsclVar2));
                            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                    } catch (IllegalStateException unused2) {
                        gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
                this.f6826yggfygwlhe.ydmasvzmpa().invalidate();
                g0.jyumaefscl jyumaefsclVar3 = (g0.jyumaefscl) this.f6826yggfygwlhe.okpsazkaxt().zoijcleaow(iWizcaqwiak);
                if (jyumaefsclVar3 != null && (zdlpuopuiuVarZoijcleaow = jyumaefsclVar3.zoijcleaow()) != null && (pkzmftpjixVarKcexrzcfyt = zdlpuopuiuVarZoijcleaow.kcexrzcfyt()) != null) {
                    cqumvgiudr cqumvgiudrVar3 = this.f6826yggfygwlhe;
                    if (btonecajqbVarIobyxmoadg != null) {
                        cqumvgiudrVar3.f6820yggfygwlhe.oxmwwwfdhm(iWizcaqwiak, btonecajqbVarIobyxmoadg);
                    }
                    if (btonecajqbVarEablkybsjg != null) {
                        cqumvgiudrVar3.f6801jyumaefscl.oxmwwwfdhm(iWizcaqwiak, btonecajqbVarEablkybsjg);
                    }
                    cqumvgiudrVar3.weqkydbzbr(pkzmftpjixVarKcexrzcfyt);
                }
            }
            if (btonecajqbVarIobyxmoadg != null) {
                this.f6827zdlpuopuiu.lqeggnwhkg((Float) btonecajqbVarIobyxmoadg.ppxfxbqfkf().invoke());
            }
            if (btonecajqbVarEablkybsjg != null) {
                this.f6827zdlpuopuiu.nufgyqmvbu((Float) btonecajqbVarEablkybsjg.ppxfxbqfkf().invoke());
            }
        }
    }

    private final class eablkybsjg extends w1.yggfygwlhe {
        public eablkybsjg() {
        }

        @Override // w1.yggfygwlhe
        public boolean gxszxtbevo(int i13, int i14, Bundle bundle) {
            return cqumvgiudr.this.nuxfzjnpeb(i13, i14, bundle);
        }

        @Override // w1.yggfygwlhe
        public void iobyxmoadg(int i13, w1.zdlpuopuiu zdlpuopuiuVar, String str, Bundle bundle) {
            cqumvgiudr.this.cllcsxoeiz(i13, zdlpuopuiuVar, str, bundle);
        }

        @Override // w1.yggfygwlhe
        public w1.zdlpuopuiu wkgbmnqykc(int i13) {
            if (i13 == 1) {
                if (cqumvgiudr.this.f6814vdvldrhtss == Integer.MIN_VALUE) {
                    return null;
                }
                return zoijcleaow(cqumvgiudr.this.f6814vdvldrhtss);
            }
            if (i13 == 2) {
                return zoijcleaow(cqumvgiudr.this.f6812rgvfuqvkyq);
            }
            throw new IllegalArgumentException("Unknown focus type: " + i13);
        }

        @Override // w1.yggfygwlhe
        public w1.zdlpuopuiu zoijcleaow(int i13) {
            w1.zdlpuopuiu zdlpuopuiuVarUlzqkzuiru = cqumvgiudr.this.ulzqkzuiru(i13);
            cqumvgiudr cqumvgiudrVar = cqumvgiudr.this;
            if (cqumvgiudrVar.f6822zdlpuopuiu) {
                if (i13 == cqumvgiudrVar.f6812rgvfuqvkyq) {
                    cqumvgiudrVar.f6809oxmwwwfdhm = zdlpuopuiuVarUlzqkzuiru;
                }
                if (i13 == cqumvgiudrVar.f6814vdvldrhtss) {
                    cqumvgiudrVar.f6802kcexrzcfyt = zdlpuopuiuVarUlzqkzuiru;
                }
            }
            return zdlpuopuiuVarUlzqkzuiru;
        }
    }

    static final class gtknphoqwx extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gtknphoqwx f6829zdlpuopuiu = new gtknphoqwx();

        gtknphoqwx() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z.pkzmftpjix pkzmftpjixVar) {
            g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = pkzmftpjixVar.wkgbmnqykc();
            boolean z13 = false;
            if (wflxmlrfwpVarWkgbmnqykc != null && wflxmlrfwpVarWkgbmnqykc.agtfadlqog()) {
                z13 = true;
            }
            return Boolean.valueOf(z13);
        }
    }

    private static final class gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f6830eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final long f6831gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final g0.zdlpuopuiu f6832iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f6833ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f6834wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f6835zoijcleaow;

        public gxszxtbevo(g0.zdlpuopuiu zdlpuopuiuVar, int i13, int i14, int i15, int i16, long j13) {
            this.f6832iobyxmoadg = zdlpuopuiuVar;
            this.f6835zoijcleaow = i13;
            this.f6833ppxfxbqfkf = i14;
            this.f6834wkgbmnqykc = i15;
            this.f6830eablkybsjg = i16;
            this.f6831gxszxtbevo = j13;
        }

        public final int eablkybsjg() {
            return this.f6830eablkybsjg;
        }

        public final long gxszxtbevo() {
            return this.f6831gxszxtbevo;
        }

        public final int iobyxmoadg() {
            return this.f6835zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return this.f6833ppxfxbqfkf;
        }

        public final g0.zdlpuopuiu wkgbmnqykc() {
            return this.f6832iobyxmoadg;
        }

        public final int zoijcleaow() {
            return this.f6834wkgbmnqykc;
        }
    }

    public static final class iobyxmoadg implements View.OnAttachStateChangeListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = cqumvgiudr.this.f6806lqeggnwhkg;
            cqumvgiudr cqumvgiudrVar = cqumvgiudr.this;
            cqumvgiudrVar.f6788draadjrbmk = cqumvgiudrVar.f6806lqeggnwhkg.getEnabledAccessibilityServiceList(-1);
            accessibilityManager.addAccessibilityStateChangeListener(cqumvgiudrVar.f6784btonecajqb);
            accessibilityManager.addTouchExplorationStateChangeListener(cqumvgiudrVar.f6793gtknphoqwx);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            cqumvgiudr.this.f6783agtfadlqog.removeCallbacks(cqumvgiudr.this.f6818wypolnanlu);
            AccessibilityManager accessibilityManager = cqumvgiudr.this.f6806lqeggnwhkg;
            cqumvgiudr cqumvgiudrVar = cqumvgiudr.this;
            accessibilityManager.removeAccessibilityStateChangeListener(cqumvgiudrVar.f6784btonecajqb);
            accessibilityManager.removeTouchExplorationStateChangeListener(cqumvgiudrVar.f6793gtknphoqwx);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f6837cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f6839jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f6840yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f6841zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f6839jyumaefscl = obj;
            this.f6837cqumvgiudr |= Integer.MIN_VALUE;
            return cqumvgiudr.this.wypolnanlu(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        nufgyqmvbu() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(cqumvgiudr.this.ydmasvzmpa().getParent().requestSendAccessibilityEvent(cqumvgiudr.this.ydmasvzmpa(), accessibilityEvent));
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f6843iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public static final void iobyxmoadg(w1.zdlpuopuiu zdlpuopuiuVar, g0.zdlpuopuiu zdlpuopuiuVar2) {
            g0.nufgyqmvbu nufgyqmvbuVar = (g0.nufgyqmvbu) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), g0.esjtqupxsv.f35662iobyxmoadg.cdpycssgdh());
            if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
                if (nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), g0.nufgyqmvbu.f35737zoijcleaow.zoijcleaow())) {
                    return;
                }
                g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar2.esjtqupxsv();
                g0.draadjrbmk draadjrbmkVar = g0.draadjrbmk.f35622iobyxmoadg;
                g0.iobyxmoadg iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv, draadjrbmkVar.oxmwwwfdhm());
                if (iobyxmoadgVar != null) {
                    zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionPageUp, iobyxmoadgVar.zoijcleaow()));
                }
                g0.iobyxmoadg iobyxmoadgVar2 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.ojitshcjhn());
                if (iobyxmoadgVar2 != null) {
                    zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionPageDown, iobyxmoadgVar2.zoijcleaow()));
                }
                g0.iobyxmoadg iobyxmoadgVar3 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.rgvfuqvkyq());
                if (iobyxmoadgVar3 != null) {
                    zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionPageLeft, iobyxmoadgVar3.zoijcleaow()));
                }
                g0.iobyxmoadg iobyxmoadgVar4 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.vdvldrhtss());
                if (iobyxmoadgVar4 != null) {
                    zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionPageRight, iobyxmoadgVar4.zoijcleaow()));
                }
            }
        }
    }

    public static final class wkgbmnqykc {
        public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private wkgbmnqykc() {
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f6844iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public static final void iobyxmoadg(w1.zdlpuopuiu zdlpuopuiuVar, g0.zdlpuopuiu zdlpuopuiuVar2) {
            g0.iobyxmoadg iobyxmoadgVar;
            if (!esjtqupxsv.agtfadlqog(zdlpuopuiuVar2) || (iobyxmoadgVar = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), g0.draadjrbmk.f35622iobyxmoadg.cqumvgiudr())) == null) {
                return;
            }
            zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionSetProgress, iobyxmoadgVar.zoijcleaow()));
        }
    }

    public cqumvgiudr(AndroidComposeView androidComposeView) {
        this.f6816wkgbmnqykc = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f6806lqeggnwhkg = accessibilityManager;
        this.f6790dxjokdxxww = 100L;
        this.f6784btonecajqb = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.yggfygwlhe
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z13) {
                cqumvgiudr.vipkmwdibw(this.f7140iobyxmoadg, z13);
            }
        };
        this.f6793gtknphoqwx = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.jyumaefscl
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z13) {
                cqumvgiudr.e(this.f6997iobyxmoadg, z13);
            }
        };
        this.f6788draadjrbmk = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f6783agtfadlqog = new Handler(Looper.getMainLooper());
        this.f6808ojitshcjhn = new eablkybsjg();
        this.f6812rgvfuqvkyq = Integer.MIN_VALUE;
        this.f6814vdvldrhtss = Integer.MIN_VALUE;
        this.f6820yggfygwlhe = new androidx.collection.iozdgvuglv(0, 1, null);
        this.f6801jyumaefscl = new androidx.collection.iozdgvuglv(0, 1, null);
        this.f6799iwizpuwonk = new androidx.collection.xrmfcynszj(0, 1, null);
        this.f6787cqumvgiudr = new androidx.collection.xrmfcynszj(0, 1, null);
        this.f6792esjtqupxsv = -1;
        this.f6811pmvmpeiblj = new androidx.collection.zoijcleaow(0, 1, null);
        this.f6823zynmafqrjb = rj.btonecajqb.zoijcleaow(1, null, null, 6, null);
        this.f6798istkbnxepw = true;
        this.f6819yadqdtsiqt = androidx.collection.rgvfuqvkyq.zoijcleaow();
        this.f6797iozdgvuglv = new androidx.collection.lmojexxdyd(0, 1, null);
        this.f6805lmojexxdyd = new androidx.collection.cdpycssgdh(0, 1, null);
        this.f6817wwaezpbzkn = new androidx.collection.cdpycssgdh(0, 1, null);
        this.f6821ylkuphrtab = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f6810pkzmftpjix = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f6795hcddaimhww = new s0.iwizpuwonk();
        this.f6800jpowsppfya = androidx.collection.rgvfuqvkyq.ppxfxbqfkf();
        this.f6796hkdspvbjdz = new j(androidComposeView.getSemanticsOwner().wkgbmnqykc(), androidx.collection.rgvfuqvkyq.zoijcleaow());
        this.f6789dsvhmnatus = androidx.collection.gtknphoqwx.iobyxmoadg();
        androidComposeView.addOnAttachStateChangeListener(new iobyxmoadg());
        this.f6818wypolnanlu = new Runnable() { // from class: androidx.compose.ui.platform.iwizpuwonk
            @Override // java.lang.Runnable
            public final void run() {
                cqumvgiudr.lxfrhoxuzk(this.f6990zdlpuopuiu);
            }
        };
        this.f6813stevsuqkhv = new ArrayList();
        this.f6803kegysxyocb = new btonecajqb();
    }

    private final float[] a(h.ageimvtcrz ageimvtcrzVar) {
        if (!(ageimvtcrzVar instanceof h.ageimvtcrz.ppxfxbqfkf)) {
            return null;
        }
        h.ageimvtcrz.ppxfxbqfkf ppxfxbqfkfVar = (h.ageimvtcrz.ppxfxbqfkf) ageimvtcrzVar;
        return new float[]{Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().nufgyqmvbu() >> 32)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().nufgyqmvbu() & 4294967295L)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().dxjokdxxww() >> 32)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().dxjokdxxww() & 4294967295L)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().ppxfxbqfkf() >> 32)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().ppxfxbqfkf() & 4294967295L)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().zoijcleaow() >> 32)), Float.intBitsToFloat((int) (ppxfxbqfkfVar.zoijcleaow().zoijcleaow() & 4294967295L))};
    }

    private final boolean ageimvtcrz(int i13, int i14, Integer num, List list) {
        if (i13 == Integer.MIN_VALUE || !bfopjjpdmp()) {
            return false;
        }
        AccessibilityEvent accessibilityEventNtlheqmsrt = ntlheqmsrt(i13, i14);
        if (num != null) {
            accessibilityEventNtlheqmsrt.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventNtlheqmsrt.setContentDescription(y0.ppxfxbqfkf.eablkybsjg(list, StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        return fiwbwshyhd(accessibilityEventNtlheqmsrt);
    }

    private static final boolean auzgnhcxok(g0.btonecajqb btonecajqbVar) {
        return (((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() > 0.0f && !btonecajqbVar.zoijcleaow()) || (((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() < ((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue() && btonecajqbVar.zoijcleaow());
    }

    private final Region b(h.ageimvtcrz ageimvtcrzVar) {
        if (!(ageimvtcrzVar instanceof h.ageimvtcrz.iobyxmoadg)) {
            return null;
        }
        h.ageimvtcrz.iobyxmoadg iobyxmoadgVar = (h.ageimvtcrz.iobyxmoadg) ageimvtcrzVar;
        Region region = new Region(eslsurpljm(iobyxmoadgVar.iobyxmoadg()));
        Region region2 = new Region();
        h.mhtqkkgtqm mhtqkkgtqmVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        if (!(mhtqkkgtqmVarZoijcleaow instanceof h.wypolnanlu)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((h.wypolnanlu) mhtqkkgtqmVarZoijcleaow).cqumvgiudr(), region);
        return region2;
    }

    private final RectF c(g0.zdlpuopuiu zdlpuopuiuVar, g.lqeggnwhkg lqeggnwhkgVar) {
        if (zdlpuopuiuVar == null) {
            return null;
        }
        g.lqeggnwhkg lqeggnwhkgVarOxmwwwfdhm = lqeggnwhkgVar.oxmwwwfdhm(zdlpuopuiuVar.yggfygwlhe());
        g.lqeggnwhkg lqeggnwhkgVarGtknphoqwx = zdlpuopuiuVar.gtknphoqwx();
        g.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = lqeggnwhkgVarOxmwwwfdhm.rgvfuqvkyq(lqeggnwhkgVarGtknphoqwx) ? lqeggnwhkgVarOxmwwwfdhm.agtfadlqog(lqeggnwhkgVarGtknphoqwx) : null;
        if (lqeggnwhkgVarAgtfadlqog == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.f6816wkgbmnqykc;
        float fNufgyqmvbu = lqeggnwhkgVarAgtfadlqog.nufgyqmvbu();
        long jOxmwwwfdhm = androidComposeView.oxmwwwfdhm(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(lqeggnwhkgVarAgtfadlqog.gtknphoqwx())) & 4294967295L) | (((long) Float.floatToRawIntBits(fNufgyqmvbu)) << 32)));
        long jOxmwwwfdhm2 = this.f6816wkgbmnqykc.oxmwwwfdhm(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(lqeggnwhkgVarAgtfadlqog.dxjokdxxww())) << 32) | (((long) Float.floatToRawIntBits(lqeggnwhkgVarAgtfadlqog.eablkybsjg())) & 4294967295L)));
        int i13 = (int) (jOxmwwwfdhm >> 32);
        int i14 = (int) (jOxmwwwfdhm2 >> 32);
        int i15 = (int) (jOxmwwwfdhm & 4294967295L);
        int i16 = (int) (jOxmwwwfdhm2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cllcsxoeiz(int i13, w1.zdlpuopuiu zdlpuopuiuVar, String str, Bundle bundle) {
        g0.zdlpuopuiu zdlpuopuiuVarZoijcleaow;
        Region regionB;
        float[] fArrA;
        Rect rectKrqnebusok;
        g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) okpsazkaxt().zoijcleaow(i13);
        if (jyumaefsclVar == null || (zdlpuopuiuVarZoijcleaow = jyumaefsclVar.zoijcleaow()) == null) {
            return;
        }
        String strCzzsidtyhn = czzsidtyhn(zdlpuopuiuVarZoijcleaow);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, this.f6821ylkuphrtab)) {
            int iEablkybsjg = this.f6805lmojexxdyd.eablkybsjg(i13, -1);
            if (iEablkybsjg != -1) {
                zdlpuopuiuVar.zdlpuopuiu().putInt(str, iEablkybsjg);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, this.f6810pkzmftpjix)) {
            int iEablkybsjg2 = this.f6817wwaezpbzkn.eablkybsjg(i13, -1);
            if (iEablkybsjg2 != -1) {
                zdlpuopuiuVar.zdlpuopuiu().putInt(str, iEablkybsjg2);
                return;
            }
            return;
        }
        if (zdlpuopuiuVarZoijcleaow.esjtqupxsv().ppxfxbqfkf(g0.draadjrbmk.f35622iobyxmoadg.dxjokdxxww()) && bundle != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i15 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i15 > 0 && i14 >= 0) {
                if (i14 < (strCzzsidtyhn != null ? strCzzsidtyhn.length() : Integer.MAX_VALUE)) {
                    j0.f fVarPpxfxbqfkf = k.ppxfxbqfkf(zdlpuopuiuVarZoijcleaow.esjtqupxsv());
                    if (fVarPpxfxbqfkf == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i16 = 0; i16 < i15; i16++) {
                        int i17 = i14 + i16;
                        if (i17 >= fVarPpxfxbqfkf.draadjrbmk().btonecajqb().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(c(zdlpuopuiuVarZoijcleaow, fVarPpxfxbqfkf.wkgbmnqykc(i17)));
                        }
                    }
                    zdlpuopuiuVar.zdlpuopuiu().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVarZoijcleaow.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.ylkuphrtab()) && bundle != null && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar.ylkuphrtab());
            if (str2 != null) {
                zdlpuopuiuVar.zdlpuopuiu().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "androidx.compose.ui.semantics.id")) {
            zdlpuopuiuVar.zdlpuopuiu().putInt(str, zdlpuopuiuVarZoijcleaow.vdvldrhtss());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "androidx.compose.ui.semantics.shapeType")) {
            h.e eVar = (h.e) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar.lmojexxdyd());
            if (eVar != null) {
                h.ageimvtcrz ageimvtcrzVarSopmlzcsov = sopmlzcsov(eVar, zdlpuopuiuVarZoijcleaow);
                if (ageimvtcrzVarSopmlzcsov instanceof h.ageimvtcrz.zoijcleaow) {
                    zdlpuopuiuVar.zdlpuopuiu().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    zdlpuopuiuVar.zdlpuopuiu().putParcelable("androidx.compose.ui.semantics.shapeRect", krqnebusok(ageimvtcrzVarSopmlzcsov));
                    return;
                } else if (ageimvtcrzVarSopmlzcsov instanceof h.ageimvtcrz.ppxfxbqfkf) {
                    zdlpuopuiuVar.zdlpuopuiu().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    zdlpuopuiuVar.zdlpuopuiu().putParcelable("androidx.compose.ui.semantics.shapeRect", krqnebusok(ageimvtcrzVarSopmlzcsov));
                    zdlpuopuiuVar.zdlpuopuiu().putFloatArray("androidx.compose.ui.semantics.shapeCorners", a(ageimvtcrzVarSopmlzcsov));
                    return;
                } else {
                    if (!(ageimvtcrzVarSopmlzcsov instanceof h.ageimvtcrz.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zdlpuopuiuVar.zdlpuopuiu().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    zdlpuopuiuVar.zdlpuopuiu().putParcelable("androidx.compose.ui.semantics.shapeRegion", b(ageimvtcrzVarSopmlzcsov));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "androidx.compose.ui.semantics.shapeRect")) {
            h.e eVar2 = (h.e) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar.lmojexxdyd());
            if (eVar2 == null || (rectKrqnebusok = krqnebusok(sopmlzcsov(eVar2, zdlpuopuiuVarZoijcleaow))) == null) {
                return;
            }
            zdlpuopuiuVar.zdlpuopuiu().putParcelable("androidx.compose.ui.semantics.shapeRect", rectKrqnebusok);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "androidx.compose.ui.semantics.shapeCorners")) {
            h.e eVar3 = (h.e) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar.lmojexxdyd());
            if (eVar3 == null || (fArrA = a(sopmlzcsov(eVar3, zdlpuopuiuVarZoijcleaow))) == null) {
                return;
            }
            zdlpuopuiuVar.zdlpuopuiu().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrA);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "androidx.compose.ui.semantics.shapeRegion")) {
            h.e eVar4 = (h.e) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), esjtqupxsvVar.lmojexxdyd());
            if (eVar4 == null || (regionB = b(sopmlzcsov(eVar4, zdlpuopuiuVarZoijcleaow))) == null) {
                return;
            }
            zdlpuopuiuVar.zdlpuopuiu().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionB);
            return;
        }
        androidx.collection.vipkmwdibw vipkmwdibwVarDxjokdxxww = zdlpuopuiuVarZoijcleaow.esjtqupxsv().dxjokdxxww();
        if (vipkmwdibwVarDxjokdxxww == null) {
            return;
        }
        Object[] objArr = vipkmwdibwVarDxjokdxxww.f4398zoijcleaow;
        long[] jArr = vipkmwdibwVarDxjokdxxww.f4395iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j13 = jArr[i18];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8 - ((~(i18 - length)) >>> 31);
                for (int i23 = 0; i23 < i19; i23++) {
                    if ((255 & j13) < 128) {
                        g0.cdpycssgdh cdpycssgdhVar = (g0.cdpycssgdh) objArr[(i18 << 3) + i23];
                        String strIobyxmoadg = cdpycssgdhVar.iobyxmoadg();
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strIobyxmoadg, str)) {
                            Object objIobyxmoadg = g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.esjtqupxsv(), cdpycssgdhVar);
                            if (objIobyxmoadg instanceof Serializable) {
                                zdlpuopuiuVar.zdlpuopuiu().putSerializable(strIobyxmoadg, (Serializable) objIobyxmoadg);
                            } else {
                                if (!(objIobyxmoadg instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                zdlpuopuiuVar.zdlpuopuiu().putParcelable(strIobyxmoadg, (Parcelable) objIobyxmoadg);
                            }
                        } else {
                            continue;
                        }
                    }
                    j13 >>= 8;
                }
                if (i19 != 8) {
                    return;
                }
            }
            if (i18 == length) {
                return;
            } else {
                i18++;
            }
        }
    }

    private final AccessibilityEvent crxdokpmqz(int i13, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventNtlheqmsrt = ntlheqmsrt(i13, 8192);
        if (num != null) {
            accessibilityEventNtlheqmsrt.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventNtlheqmsrt.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventNtlheqmsrt.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventNtlheqmsrt.getText().add(charSequence);
        }
        return accessibilityEventNtlheqmsrt;
    }

    private final String czzsidtyhn(g0.zdlpuopuiu zdlpuopuiuVar) {
        j0.eablkybsjg eablkybsjgVar;
        if (zdlpuopuiuVar == null) {
            return null;
        }
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.wkgbmnqykc())) {
            return y0.ppxfxbqfkf.eablkybsjg((List) zdlpuopuiuVar.esjtqupxsv().gxszxtbevo(esjtqupxsvVar.wkgbmnqykc()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        }
        if (zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.lqeggnwhkg())) {
            j0.eablkybsjg eablkybsjgVarYfnezrywwk = yfnezrywwk(zdlpuopuiuVar.esjtqupxsv());
            if (eablkybsjgVarYfnezrywwk != null) {
                return eablkybsjgVarYfnezrywwk.btonecajqb();
            }
            return null;
        }
        List list = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.pkzmftpjix());
        if (list == null || (eablkybsjgVar = (j0.eablkybsjg) hg.jyumaefscl.weqkydbzbr(list)) == null) {
            return null;
        }
        return eablkybsjgVar.btonecajqb();
    }

    private final SpannableString d(j0.eablkybsjg eablkybsjgVar) {
        return (SpannableString) g(s0.iobyxmoadg.zoijcleaow(eablkybsjgVar, this.f6816wkgbmnqykc.getDensity(), this.f6816wkgbmnqykc.getFontFamilyResolver(), this.f6795hcddaimhww), 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect dsvhmnatus(g0.jyumaefscl jyumaefsclVar) {
        w0.rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = jyumaefsclVar.iobyxmoadg();
        AndroidComposeView androidComposeView = this.f6816wkgbmnqykc;
        float fGxszxtbevo = rgvfuqvkyqVarIobyxmoadg.gxszxtbevo();
        long jOxmwwwfdhm = androidComposeView.oxmwwwfdhm(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(rgvfuqvkyqVarIobyxmoadg.dxjokdxxww())) & 4294967295L) | (Float.floatToRawIntBits(fGxszxtbevo) << 32)));
        long jOxmwwwfdhm2 = this.f6816wkgbmnqykc.oxmwwwfdhm(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(rgvfuqvkyqVarIobyxmoadg.lqeggnwhkg())) << 32) | (((long) Float.floatToRawIntBits(rgvfuqvkyqVarIobyxmoadg.wkgbmnqykc())) & 4294967295L)));
        int i13 = (int) (jOxmwwwfdhm >> 32);
        int i14 = (int) (jOxmwwwfdhm2 >> 32);
        int i15 = (int) (jOxmwwwfdhm & 4294967295L);
        int i16 = (int) (jOxmwwwfdhm2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), (int) Math.floor(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16))));
    }

    private final boolean dvvnrvtcbc(int i13, List list) {
        boolean z13;
        i iVarIobyxmoadg = k.iobyxmoadg(list, i13);
        if (iVarIobyxmoadg != null) {
            z13 = false;
        } else {
            iVarIobyxmoadg = new i(i13, this.f6813stevsuqkhv, null, null, null, null);
            z13 = true;
        }
        this.f6813stevsuqkhv.add(iVarIobyxmoadg);
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(cqumvgiudr cqumvgiudrVar, boolean z13) {
        cqumvgiudrVar.f6788draadjrbmk = cqumvgiudrVar.f6806lqeggnwhkg.getEnabledAccessibilityServiceList(-1);
    }

    private final Rect eslsurpljm(g.lqeggnwhkg lqeggnwhkgVar) {
        return new Rect((int) lqeggnwhkgVar.nufgyqmvbu(), (int) lqeggnwhkgVar.gtknphoqwx(), (int) lqeggnwhkgVar.dxjokdxxww(), (int) lqeggnwhkgVar.eablkybsjg());
    }

    private final void ezmngbhpjk(g0.zdlpuopuiu zdlpuopuiuVar, w1.zdlpuopuiu zdlpuopuiuVar2) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.nufgyqmvbu())) {
            zdlpuopuiuVar2.oipsdeybqn(true);
            zdlpuopuiuVar2.lrnfpwlwnk((CharSequence) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsvVar.nufgyqmvbu()));
        }
    }

    private final boolean f(g0.zdlpuopuiu zdlpuopuiuVar, int i13, boolean z13, boolean z14) {
        int iIkoacuggdj;
        int i14;
        int iVdvldrhtss = zdlpuopuiuVar.vdvldrhtss();
        Integer num = this.f6804lereixgezr;
        if (num == null || iVdvldrhtss != num.intValue()) {
            this.f6792esjtqupxsv = -1;
            this.f6804lereixgezr = Integer.valueOf(zdlpuopuiuVar.vdvldrhtss());
        }
        String strCzzsidtyhn = czzsidtyhn(zdlpuopuiuVar);
        boolean z15 = false;
        if (strCzzsidtyhn != null && strCzzsidtyhn.length() != 0) {
            androidx.compose.ui.platform.lqeggnwhkg lqeggnwhkgVarUwvvkdfqfp = uwvvkdfqfp(zdlpuopuiuVar, i13);
            if (lqeggnwhkgVarUwvvkdfqfp == null) {
                return false;
            }
            int iJhduphickx = jhduphickx(zdlpuopuiuVar);
            if (iJhduphickx == -1) {
                iJhduphickx = z13 ? 0 : strCzzsidtyhn.length();
            }
            int[] iArrIobyxmoadg = z13 ? lqeggnwhkgVarUwvvkdfqfp.iobyxmoadg(iJhduphickx) : lqeggnwhkgVarUwvvkdfqfp.zoijcleaow(iJhduphickx);
            if (iArrIobyxmoadg == null) {
                return false;
            }
            int i15 = iArrIobyxmoadg[0];
            z15 = true;
            int i16 = iArrIobyxmoadg[1];
            if (z14 && oipsdeybqn(zdlpuopuiuVar)) {
                iIkoacuggdj = ikoacuggdj(zdlpuopuiuVar);
                if (iIkoacuggdj == -1) {
                    iIkoacuggdj = z13 ? i15 : i16;
                }
                i14 = z13 ? i16 : i15;
            } else {
                iIkoacuggdj = z13 ? i16 : i15;
                i14 = iIkoacuggdj;
            }
            this.f6785cdpycssgdh = new gxszxtbevo(zdlpuopuiuVar, z13 ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_NONE, i13, i15, i16, SystemClock.uptimeMillis());
            fmlbqenlif(zdlpuopuiuVar, iIkoacuggdj, i14, true);
        }
        return z15;
    }

    private final boolean fiwbwshyhd(AccessibilityEvent accessibilityEvent) {
        if (!bfopjjpdmp()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f6822zdlpuopuiu = true;
        }
        try {
            return ((Boolean) this.f6794gxszxtbevo.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f6822zdlpuopuiu = false;
        }
    }

    private final boolean fmlbqenlif(g0.zdlpuopuiu zdlpuopuiuVar, int i13, int i14, boolean z13) {
        String strCzzsidtyhn;
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.draadjrbmk draadjrbmkVar = g0.draadjrbmk.f35622iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(draadjrbmkVar.esjtqupxsv()) && esjtqupxsv.agtfadlqog(zdlpuopuiuVar)) {
            tg.vdvldrhtss vdvldrhtssVar = (tg.vdvldrhtss) ((g0.iobyxmoadg) zdlpuopuiuVar.esjtqupxsv().gxszxtbevo(draadjrbmkVar.esjtqupxsv())).iobyxmoadg();
            if (vdvldrhtssVar != null) {
                return ((Boolean) vdvldrhtssVar.invoke(Integer.valueOf(i13), Integer.valueOf(i14), Boolean.valueOf(z13))).booleanValue();
            }
            return false;
        }
        if ((i13 == i14 && i14 == this.f6792esjtqupxsv) || (strCzzsidtyhn = czzsidtyhn(zdlpuopuiuVar)) == null) {
            return false;
        }
        if (i13 < 0 || i13 != i14 || i14 > strCzzsidtyhn.length()) {
            i13 = -1;
        }
        this.f6792esjtqupxsv = i13;
        boolean z14 = strCzzsidtyhn.length() > 0;
        fiwbwshyhd(crxdokpmqz(wizcaqwiak(zdlpuopuiuVar.vdvldrhtss()), z14 ? Integer.valueOf(this.f6792esjtqupxsv) : null, z14 ? Integer.valueOf(this.f6792esjtqupxsv) : null, z14 ? Integer.valueOf(strCzzsidtyhn.length()) : null, strCzzsidtyhn));
        grlcpdaxtj(zdlpuopuiuVar.vdvldrhtss());
        return true;
    }

    static /* synthetic */ boolean fyldjkxazc(cqumvgiudr cqumvgiudrVar, int i13, int i14, Integer num, List list, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            num = null;
        }
        if ((i15 & 8) != 0) {
            list = null;
        }
        return cqumvgiudrVar.ageimvtcrz(i13, i14, num, list);
    }

    private final CharSequence g(CharSequence charSequence, int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i13) {
            return charSequence;
        }
        int i14 = i13 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i14)) && Character.isLowSurrogate(charSequence.charAt(i13))) {
            i13 = i14;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i13);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    private final void grlcpdaxtj(int i13) {
        gxszxtbevo gxszxtbevoVar = this.f6785cdpycssgdh;
        if (gxszxtbevoVar != null) {
            if (i13 != gxszxtbevoVar.wkgbmnqykc().vdvldrhtss()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gxszxtbevoVar.gxszxtbevo() <= 1000) {
                AccessibilityEvent accessibilityEventNtlheqmsrt = ntlheqmsrt(wizcaqwiak(gxszxtbevoVar.wkgbmnqykc().vdvldrhtss()), 131072);
                accessibilityEventNtlheqmsrt.setFromIndex(gxszxtbevoVar.zoijcleaow());
                accessibilityEventNtlheqmsrt.setToIndex(gxszxtbevoVar.eablkybsjg());
                accessibilityEventNtlheqmsrt.setAction(gxszxtbevoVar.iobyxmoadg());
                accessibilityEventNtlheqmsrt.setMovementGranularity(gxszxtbevoVar.ppxfxbqfkf());
                accessibilityEventNtlheqmsrt.getText().add(czzsidtyhn(gxszxtbevoVar.wkgbmnqykc()));
                fiwbwshyhd(accessibilityEventNtlheqmsrt);
            }
        }
        this.f6785cdpycssgdh = null;
    }

    private final void h(int i13) {
        int i14 = this.f6791eablkybsjg;
        if (i14 == i13) {
            return;
        }
        this.f6791eablkybsjg = i13;
        fyldjkxazc(this, i13, UserVerificationMethods.USER_VERIFY_PATTERN, null, null, 12, null);
        fyldjkxazc(this, i14, UserVerificationMethods.USER_VERIFY_HANDPRINT, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[LOOP:1: B:15:0x0054->B:28:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0097 A[EDGE_INSN: B:44:0x0097->B:29:0x0097 BREAK  A[LOOP:1: B:15:0x0054->B:28:0x0094], SYNTHETIC] */
    private final void hszhottldk(g0.zdlpuopuiu zdlpuopuiuVar, j jVar) {
        androidx.collection.lmojexxdyd lmojexxdydVarZoijcleaow = androidx.collection.oxmwwwfdhm.zoijcleaow();
        List listJyumaefscl = zdlpuopuiuVar.jyumaefscl();
        int size = listJyumaefscl.size();
        for (int i13 = 0; i13 < size; i13++) {
            g0.zdlpuopuiu zdlpuopuiuVar2 = (g0.zdlpuopuiu) listJyumaefscl.get(i13);
            if (okpsazkaxt().iobyxmoadg(zdlpuopuiuVar2.vdvldrhtss())) {
                if (!jVar.iobyxmoadg().iobyxmoadg(zdlpuopuiuVar2.vdvldrhtss())) {
                    weqkydbzbr(zdlpuopuiuVar.kcexrzcfyt());
                    return;
                }
                lmojexxdydVarZoijcleaow.lqeggnwhkg(zdlpuopuiuVar2.vdvldrhtss());
            }
        }
        androidx.collection.lmojexxdyd lmojexxdydVarIobyxmoadg = jVar.iobyxmoadg();
        int[] iArr = lmojexxdydVarIobyxmoadg.f4394zoijcleaow;
        long[] jArr = lmojexxdydVarIobyxmoadg.f4391iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128 && !lmojexxdydVarZoijcleaow.iobyxmoadg(iArr[(i14 << 3) + i16])) {
                            weqkydbzbr(zdlpuopuiuVar.kcexrzcfyt());
                            return;
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        List listJyumaefscl2 = zdlpuopuiuVar.jyumaefscl();
        int size2 = listJyumaefscl2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            g0.zdlpuopuiu zdlpuopuiuVar3 = (g0.zdlpuopuiu) listJyumaefscl2.get(i17);
            j jVar2 = (j) this.f6800jpowsppfya.zoijcleaow(zdlpuopuiuVar3.vdvldrhtss());
            if (jVar2 != null && okpsazkaxt().iobyxmoadg(zdlpuopuiuVar3.vdvldrhtss())) {
                hszhottldk(zdlpuopuiuVar3, jVar2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:0: B:5:0x0024->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7 A[EDGE_INSN: B:54:0x00a7->B:29:0x00a7 BREAK  A[LOOP:0: B:5:0x0024->B:28:0x009c], SYNTHETIC] */
    private final void i() {
        g0.wflxmlrfwp wflxmlrfwpVarZoijcleaow;
        androidx.collection.lmojexxdyd lmojexxdydVar = new androidx.collection.lmojexxdyd(0, 1, null);
        androidx.collection.lmojexxdyd lmojexxdydVar2 = this.f6797iozdgvuglv;
        int[] iArr = lmojexxdydVar2.f4394zoijcleaow;
        long[] jArr = lmojexxdydVar2.f4391iobyxmoadg;
        int length = jArr.length - 2;
        long j13 = 128;
        long j14 = 255;
        char c13 = 7;
        long j15 = -9187201950435737472L;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j16 = jArr[i13];
                long[] jArr2 = jArr;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                    jArr = jArr2;
                    j13 = 128;
                    j14 = 255;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j16 & j14) < j13) {
                            int i16 = iArr[(i13 << 3) + i15];
                            g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) okpsazkaxt().zoijcleaow(i16);
                            g0.zdlpuopuiu zdlpuopuiuVarZoijcleaow = jyumaefsclVar != null ? jyumaefsclVar.zoijcleaow() : null;
                            if (zdlpuopuiuVarZoijcleaow == null || !zdlpuopuiuVarZoijcleaow.esjtqupxsv().ppxfxbqfkf(g0.esjtqupxsv.f35662iobyxmoadg.pmvmpeiblj())) {
                                lmojexxdydVar.lqeggnwhkg(i16);
                                j jVar = (j) this.f6800jpowsppfya.zoijcleaow(i16);
                                ipoelvxyzq(i16, 32, (jVar == null || (wflxmlrfwpVarZoijcleaow = jVar.zoijcleaow()) == null) ? null : (String) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarZoijcleaow, g0.esjtqupxsv.f35662iobyxmoadg.pmvmpeiblj()));
                            }
                        }
                        j16 >>= 8;
                        i15++;
                        j13 = 128;
                        j14 = 255;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                    jArr = jArr2;
                    j13 = 128;
                    j14 = 255;
                }
            }
        }
        this.f6797iozdgvuglv.zdlpuopuiu(lmojexxdydVar);
        this.f6800jpowsppfya.lqeggnwhkg();
        androidx.collection.ojitshcjhn ojitshcjhnVarOkpsazkaxt = okpsazkaxt();
        int[] iArr2 = ojitshcjhnVarOkpsazkaxt.f4353zoijcleaow;
        Object[] objArr = ojitshcjhnVarOkpsazkaxt.f4351ppxfxbqfkf;
        long[] jArr3 = ojitshcjhnVarOkpsazkaxt.f4350iobyxmoadg;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j17 = jArr3[i17];
                if ((((~j17) << c13) & j17 & j15) != j15) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j17 & 255) < 128) {
                            int i23 = (i17 << 3) + i19;
                            int i24 = iArr2[i23];
                            g0.jyumaefscl jyumaefsclVar2 = (g0.jyumaefscl) objArr[i23];
                            g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = jyumaefsclVar2.zoijcleaow().esjtqupxsv();
                            g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
                            if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.pmvmpeiblj()) && this.f6797iozdgvuglv.lqeggnwhkg(i24)) {
                                ipoelvxyzq(i24, 16, (String) jyumaefsclVar2.zoijcleaow().esjtqupxsv().gxszxtbevo(esjtqupxsvVar.pmvmpeiblj()));
                            }
                            this.f6800jpowsppfya.oxmwwwfdhm(i24, new j(jyumaefsclVar2.zoijcleaow(), okpsazkaxt()));
                        }
                        j17 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    }
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                c13 = 7;
                j15 = -9187201950435737472L;
            }
        }
        this.f6796hkdspvbjdz = new j(this.f6816wkgbmnqykc.getSemanticsOwner().wkgbmnqykc(), okpsazkaxt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha(i iVar) {
        if (iVar.j()) {
            this.f6816wkgbmnqykc.getSnapshotObserver().dxjokdxxww(iVar, this.f6803kegysxyocb, new dxjokdxxww(iVar, this));
        }
    }

    private final int ikoacuggdj(g0.zdlpuopuiu zdlpuopuiuVar) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        return (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.wkgbmnqykc()) || !zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.hcddaimhww())) ? this.f6792esjtqupxsv : j0.l.agtfadlqog(((j0.l) zdlpuopuiuVar.esjtqupxsv().gxszxtbevo(esjtqupxsvVar.hcddaimhww())).oxmwwwfdhm());
    }

    private final void ipoelvxyzq(int i13, int i14, String str) {
        AccessibilityEvent accessibilityEventNtlheqmsrt = ntlheqmsrt(wizcaqwiak(i13), 32);
        accessibilityEventNtlheqmsrt.setContentChangeTypes(i14);
        if (str != null) {
            accessibilityEventNtlheqmsrt.getText().add(str);
        }
        fiwbwshyhd(accessibilityEventNtlheqmsrt);
    }

    private static final boolean iwxlajgraz(g0.btonecajqb btonecajqbVar) {
        return (((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() < ((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue() && !btonecajqbVar.zoijcleaow()) || (((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() > 0.0f && btonecajqbVar.zoijcleaow());
    }

    private final void ixidwrxhsl(z.pkzmftpjix pkzmftpjixVar, androidx.collection.lmojexxdyd lmojexxdydVar) {
        g0.wflxmlrfwp wflxmlrfwpVarWkgbmnqykc;
        z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq;
        if (pkzmftpjixVar.gxszxtbevo() && !this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(pkzmftpjixVar)) {
            if (!pkzmftpjixVar.weqkydbzbr().rgvfuqvkyq(z.rlfsiqarku.iobyxmoadg(8))) {
                pkzmftpjixVar = esjtqupxsv.rgvfuqvkyq(pkzmftpjixVar, draadjrbmk.f6825zdlpuopuiu);
            }
            if (pkzmftpjixVar == null || (wflxmlrfwpVarWkgbmnqykc = pkzmftpjixVar.wkgbmnqykc()) == null) {
                return;
            }
            if (!wflxmlrfwpVarWkgbmnqykc.agtfadlqog() && (pkzmftpjixVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(pkzmftpjixVar, gtknphoqwx.f6829zdlpuopuiu)) != null) {
                pkzmftpjixVar = pkzmftpjixVarRgvfuqvkyq;
            }
            int iZynmafqrjb = pkzmftpjixVar.zynmafqrjb();
            if (lmojexxdydVar.lqeggnwhkg(iZynmafqrjb)) {
                fyldjkxazc(this, wizcaqwiak(iZynmafqrjb), 2048, 1, null, 8, null);
            }
        }
    }

    private final boolean iyctptxqzt() {
        return this.f6807nufgyqmvbu || (this.f6806lqeggnwhkg.isEnabled() && this.f6806lqeggnwhkg.isTouchExplorationEnabled());
    }

    private final int jhduphickx(g0.zdlpuopuiu zdlpuopuiuVar) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        return (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.wkgbmnqykc()) || !zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.hcddaimhww())) ? this.f6792esjtqupxsv : j0.l.dxjokdxxww(((j0.l) zdlpuopuiuVar.esjtqupxsv().gxszxtbevo(esjtqupxsvVar.hcddaimhww())).oxmwwwfdhm());
    }

    private final void jrbgnlbqoe(z.pkzmftpjix pkzmftpjixVar) {
        if (pkzmftpjixVar.gxszxtbevo() && !this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(pkzmftpjixVar)) {
            int iZynmafqrjb = pkzmftpjixVar.zynmafqrjb();
            g0.btonecajqb btonecajqbVar = (g0.btonecajqb) this.f6820yggfygwlhe.zoijcleaow(iZynmafqrjb);
            g0.btonecajqb btonecajqbVar2 = (g0.btonecajqb) this.f6801jyumaefscl.zoijcleaow(iZynmafqrjb);
            if (btonecajqbVar == null && btonecajqbVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventNtlheqmsrt = ntlheqmsrt(iZynmafqrjb, 4096);
            if (btonecajqbVar != null) {
                accessibilityEventNtlheqmsrt.setScrollX((int) ((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue());
                accessibilityEventNtlheqmsrt.setMaxScrollX((int) ((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue());
            }
            if (btonecajqbVar2 != null) {
                accessibilityEventNtlheqmsrt.setScrollY((int) ((Number) btonecajqbVar2.ppxfxbqfkf().invoke()).floatValue());
                accessibilityEventNtlheqmsrt.setMaxScrollY((int) ((Number) btonecajqbVar2.iobyxmoadg().invoke()).floatValue());
            }
            fiwbwshyhd(accessibilityEventNtlheqmsrt);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    private final boolean kegysxyocb(androidx.collection.ojitshcjhn ojitshcjhnVar, boolean z13, int i13, long j13) {
        g0.cdpycssgdh cdpycssgdhVarDraadjrbmk;
        boolean z14;
        g0.btonecajqb btonecajqbVar;
        if (g.eablkybsjg.btonecajqb(j13, g.eablkybsjg.f35584zoijcleaow.zoijcleaow()) || (((9223372034707292159L & j13) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z13) {
            cdpycssgdhVarDraadjrbmk = g0.esjtqupxsv.f35662iobyxmoadg.dsvhmnatus();
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            cdpycssgdhVarDraadjrbmk = g0.esjtqupxsv.f35662iobyxmoadg.draadjrbmk();
        }
        Object[] objArr = ojitshcjhnVar.f4351ppxfxbqfkf;
        long[] jArr = ojitshcjhnVar.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            boolean z15 = false;
            while (true) {
                long j14 = jArr[i14];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j14 & 255) < 128) {
                            g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) objArr[(i14 << 3) + i16];
                            if (w0.vdvldrhtss.ppxfxbqfkf(jyumaefsclVar.iobyxmoadg()).zoijcleaow(j13) && (btonecajqbVar = (g0.btonecajqb) g0.agtfadlqog.iobyxmoadg(jyumaefsclVar.zoijcleaow().esjtqupxsv(), cdpycssgdhVarDraadjrbmk)) != null) {
                                int i17 = btonecajqbVar.zoijcleaow() ? -i13 : i13;
                                if (i13 == 0 && btonecajqbVar.zoijcleaow()) {
                                    i17 = -1;
                                }
                                if (i17 < 0) {
                                    if (((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() > 0.0f) {
                                        z15 = true;
                                    }
                                } else if (((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() < ((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue()) {
                                    z15 = true;
                                }
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i15 != 8) {
                        return z15;
                    }
                }
                if (i14 != length) {
                    i14++;
                } else {
                    z14 = z15;
                }
            }
        } else {
            z14 = false;
        }
        return z14;
    }

    private final Rect krqnebusok(h.ageimvtcrz ageimvtcrzVar) {
        if ((ageimvtcrzVar instanceof h.ageimvtcrz.zoijcleaow) || (ageimvtcrzVar instanceof h.ageimvtcrz.ppxfxbqfkf)) {
            return eslsurpljm(ageimvtcrzVar.iobyxmoadg());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lxfrhoxuzk(cqumvgiudr cqumvgiudrVar) {
        Trace.beginSection("measureAndLayout");
        try {
            z.opjhrmiecq.lereixgezr(cqumvgiudrVar.f6816wkgbmnqykc, false, 1, null);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                cqumvgiudrVar.tzroggbefp();
                Trace.endSection();
                cqumvgiudrVar.f6786cllcsxoeiz = false;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    private final boolean mbcevpiqjq(int i13) {
        if (!zfvoamnweg(i13)) {
            return false;
        }
        this.f6812rgvfuqvkyq = Integer.MIN_VALUE;
        this.f6809oxmwwwfdhm = null;
        this.f6816wkgbmnqykc.invalidate();
        fyldjkxazc(this, i13, 65536, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x06a5  */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void mhtqkkgtqm(androidx.collection.ojitshcjhn r55) {
        /*
            Method dump skipped, instruction units count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.cqumvgiudr.mhtqkkgtqm(androidx.collection.ojitshcjhn):void");
    }

    private final AccessibilityEvent ntlheqmsrt(int i13, int i14) {
        g0.jyumaefscl jyumaefsclVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i14);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f6816wkgbmnqykc.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f6816wkgbmnqykc, i13);
        if (bfopjjpdmp() && (jyumaefsclVar = (g0.jyumaefscl) okpsazkaxt().zoijcleaow(i13)) != null) {
            g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = jyumaefsclVar.zoijcleaow().esjtqupxsv();
            g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
            accessibilityEventObtain.setPassword(wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.zynmafqrjb()));
            w1.zoijcleaow.zoijcleaow(accessibilityEventObtain, kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(jyumaefsclVar.zoijcleaow().esjtqupxsv(), esjtqupxsvVar.yggfygwlhe()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01aa -> B:94:0x01ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:94:0x01ab
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean nuxfzjnpeb(int r17, int r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.cqumvgiudr.nuxfzjnpeb(int, int, android.os.Bundle):boolean");
    }

    private final boolean oipsdeybqn(g0.zdlpuopuiu zdlpuopuiuVar) {
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        return !wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.wkgbmnqykc()) && zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.lqeggnwhkg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.collection.ojitshcjhn okpsazkaxt() {
        if (this.f6798istkbnxepw) {
            this.f6798istkbnxepw = false;
            this.f6819yadqdtsiqt = g0.cqumvgiudr.iobyxmoadg(this.f6816wkgbmnqykc.getSemanticsOwner(), -1);
            if (bfopjjpdmp()) {
                esjtqupxsv.iwizpuwonk(this.f6819yadqdtsiqt, this.f6805lmojexxdyd, this.f6817wwaezpbzkn, this.f6816wkgbmnqykc.getContext().getResources());
            }
        }
        return this.f6819yadqdtsiqt;
    }

    private final boolean opjhrmiecq() {
        Boolean bool = this.f6815wflxmlrfwp;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.TRUE)) {
            return true;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, Boolean.FALSE)) {
            return false;
        }
        return w1.ppxfxbqfkf.zoijcleaow(this.f6806lqeggnwhkg);
    }

    private final w1.zdlpuopuiu ribwqtqdhb() {
        if (this.f6806lqeggnwhkg.isEnabled()) {
            return null;
        }
        return w1.zdlpuopuiu.ulzqkzuiru();
    }

    private static final float roivzttewh(float f13, float f14) {
        if (Math.signum(f13) == Math.signum(f14)) {
            return Math.abs(f13) < Math.abs(f14) ? f13 : f14;
        }
        return 0.0f;
    }

    private final boolean skhdrjzrfn(int i13) {
        if (!iyctptxqzt() || zfvoamnweg(i13)) {
            return false;
        }
        int i14 = this.f6812rgvfuqvkyq;
        if (i14 != Integer.MIN_VALUE) {
            fyldjkxazc(this, i14, 65536, null, null, 12, null);
        }
        this.f6812rgvfuqvkyq = i13;
        this.f6816wkgbmnqykc.invalidate();
        fyldjkxazc(this, i13, 32768, null, null, 12, null);
        return true;
    }

    private final h.ageimvtcrz sopmlzcsov(h.e eVar, g0.zdlpuopuiu zdlpuopuiuVar) {
        return eVar.iobyxmoadg(w0.kcexrzcfyt.wkgbmnqykc(zdlpuopuiuVar.iwizpuwonk()), zdlpuopuiuVar.oxmwwwfdhm().getLayoutDirection(), this.f6816wkgbmnqykc.getDensity());
    }

    private static final boolean tbqsvytpvh(g0.btonecajqb btonecajqbVar, float f13) {
        return (f13 < 0.0f && ((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() > 0.0f) || (f13 > 0.0f && ((Number) btonecajqbVar.ppxfxbqfkf().invoke()).floatValue() < ((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue());
    }

    private final void tzroggbefp() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (bfopjjpdmp()) {
                hszhottldk(this.f6816wkgbmnqykc.getSemanticsOwner().wkgbmnqykc(), this.f6796hkdspvbjdz);
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                mhtqkkgtqm(okpsazkaxt());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    i();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0385  */
    /* JADX WARN: Code duplicated, block: B:237:0x05db A[DONT_INVERT, PHI: r4
      0x05db: PHI (r4v49 int) = (r4v48 int), (r4v50 int) binds: [B:224:0x05a3, B:236:0x05d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:238:0x05dd A[LOOP:2: B:223:0x0592->B:238:0x05dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:363:0x05df A[EDGE_INSN: B:363:0x05df->B:239:0x05df BREAK  A[LOOP:2: B:223:0x0592->B:238:0x05dd], SYNTHETIC] */
    private final void uawqvzlxes(int i13, w1.zdlpuopuiu zdlpuopuiuVar, g0.zdlpuopuiu zdlpuopuiuVar2) {
        View viewWkgbmnqykc;
        String strIobyxmoadg;
        boolean z13;
        boolean zBooleanValue;
        g0.zdlpuopuiu zdlpuopuiuVarZoijcleaow;
        g0.wflxmlrfwp wflxmlrfwpVarRgvfuqvkyq;
        int i14 = 1;
        Resources resources = this.f6816wkgbmnqykc.getContext().getResources();
        zdlpuopuiuVar.uwvvkdfqfp("android.view.View");
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv = zdlpuopuiuVar2.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar = g0.esjtqupxsv.f35662iobyxmoadg;
        if (wflxmlrfwpVarEsjtqupxsv.ppxfxbqfkf(esjtqupxsvVar.lqeggnwhkg())) {
            zdlpuopuiuVar.uwvvkdfqfp("android.widget.EditText");
        }
        if (zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar.pkzmftpjix())) {
            zdlpuopuiuVar.uwvvkdfqfp("android.widget.TextView");
        }
        g0.nufgyqmvbu nufgyqmvbuVar = (g0.nufgyqmvbu) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar.cdpycssgdh());
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.rgvfuqvkyq();
            if (zdlpuopuiuVar2.lereixgezr() || zdlpuopuiuVar2.jyumaefscl().isEmpty()) {
                g0.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = g0.nufgyqmvbu.f35737zoijcleaow;
                if (g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), iobyxmoadgVar.nufgyqmvbu())) {
                    zdlpuopuiuVar.ipoelvxyzq(resources.getString(a.draadjrbmk.tab));
                } else if (g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), iobyxmoadgVar.lqeggnwhkg())) {
                    zdlpuopuiuVar.ipoelvxyzq(resources.getString(a.draadjrbmk.switch_role));
                } else {
                    String strEablkybsjg = k.eablkybsjg(nufgyqmvbuVar.rgvfuqvkyq());
                    if (!g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), iobyxmoadgVar.eablkybsjg()) || zdlpuopuiuVar2.istkbnxepw() || zdlpuopuiuVar2.esjtqupxsv().agtfadlqog()) {
                        zdlpuopuiuVar.uwvvkdfqfp(strEablkybsjg);
                    }
                }
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiuVar.lxfrhoxuzk(this.f6816wkgbmnqykc.getContext().getPackageName());
        zdlpuopuiuVar.uawqvzlxes(g0.cqumvgiudr.wkgbmnqykc(zdlpuopuiuVar2));
        boolean zOpjhrmiecq = opjhrmiecq();
        List listJyumaefscl = zdlpuopuiuVar2.jyumaefscl();
        int size = listJyumaefscl.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            g0.zdlpuopuiu zdlpuopuiuVar3 = (g0.zdlpuopuiu) listJyumaefscl.get(i16);
            if (okpsazkaxt().iobyxmoadg(zdlpuopuiuVar3.vdvldrhtss())) {
                androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar = this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(zdlpuopuiuVar3.kcexrzcfyt());
                if (zdlpuopuiuVar3.vdvldrhtss() != -1) {
                    if (zoijcleaowVar != null) {
                        zdlpuopuiuVar.ppxfxbqfkf(zoijcleaowVar);
                    } else {
                        g0.jyumaefscl jyumaefsclVar = (g0.jyumaefscl) okpsazkaxt().zoijcleaow(zdlpuopuiuVar3.vdvldrhtss());
                        boolean zEablkybsjg = (jyumaefsclVar == null || (zdlpuopuiuVarZoijcleaow = jyumaefsclVar.zoijcleaow()) == null || (wflxmlrfwpVarRgvfuqvkyq = zdlpuopuiuVarZoijcleaow.rgvfuqvkyq()) == null) ? false : kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarRgvfuqvkyq, g0.esjtqupxsv.f35662iobyxmoadg.yggfygwlhe()), Boolean.TRUE);
                        if (zOpjhrmiecq || !zEablkybsjg) {
                            zdlpuopuiuVar.wkgbmnqykc(this.f6816wkgbmnqykc, zdlpuopuiuVar3.vdvldrhtss());
                        }
                    }
                    this.f6789dsvhmnatus.rgvfuqvkyq(zdlpuopuiuVar3.vdvldrhtss(), i15);
                    i15++;
                }
            }
        }
        if (i13 == this.f6812rgvfuqvkyq) {
            zdlpuopuiuVar.ikoacuggdj(true);
            zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118515draadjrbmk);
        } else {
            zdlpuopuiuVar.ikoacuggdj(false);
            zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118520gtknphoqwx);
        }
        yzdjzghtvl(zdlpuopuiuVar2, zdlpuopuiuVar);
        ezmngbhpjk(zdlpuopuiuVar2, zdlpuopuiuVar);
        zdlpuopuiuVar.rhgxfdycjh(esjtqupxsv.oxmwwwfdhm(zdlpuopuiuVar2, resources));
        zdlpuopuiuVar.rlfsiqarku(esjtqupxsv.vdvldrhtss(zdlpuopuiuVar2));
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv2 = zdlpuopuiuVar2.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar2 = g0.esjtqupxsv.f35662iobyxmoadg;
        i0.iobyxmoadg iobyxmoadgVar2 = (i0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv2, esjtqupxsvVar2.hkdspvbjdz());
        if (iobyxmoadgVar2 != null) {
            if (iobyxmoadgVar2 == i0.iobyxmoadg.On) {
                zdlpuopuiuVar.czzsidtyhn(true);
            } else if (iobyxmoadgVar2 == i0.iobyxmoadg.Off) {
                zdlpuopuiuVar.czzsidtyhn(false);
            }
            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        Boolean bool = (Boolean) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar2.iozdgvuglv());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), g0.nufgyqmvbu.f35737zoijcleaow.nufgyqmvbu())) {
                zdlpuopuiuVar.ixidwrxhsl(zBooleanValue2);
            } else {
                zdlpuopuiuVar.czzsidtyhn(zBooleanValue2);
            }
            gg.wwaezpbzkn wwaezpbzknVar3 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!zdlpuopuiuVar2.esjtqupxsv().agtfadlqog() || zdlpuopuiuVar2.jyumaefscl().isEmpty()) {
            List list = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar2.wkgbmnqykc());
            zdlpuopuiuVar.zfvoamnweg(list != null ? (String) hg.jyumaefscl.weqkydbzbr(list) : null);
        }
        String str = (String) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar2.ylkuphrtab());
        if (str != null) {
            g0.zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVar2;
            while (true) {
                if (zdlpuopuiuVarZdlpuopuiu == null) {
                    zBooleanValue = false;
                    break;
                }
                g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv3 = zdlpuopuiuVarZdlpuopuiu.esjtqupxsv();
                g0.lereixgezr lereixgezrVar = g0.lereixgezr.f35717iobyxmoadg;
                if (wflxmlrfwpVarEsjtqupxsv3.ppxfxbqfkf(lereixgezrVar.zoijcleaow())) {
                    zBooleanValue = ((Boolean) zdlpuopuiuVarZdlpuopuiu.esjtqupxsv().gxszxtbevo(lereixgezrVar.zoijcleaow())).booleanValue();
                    break;
                }
                zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVarZdlpuopuiu.zdlpuopuiu();
            }
            if (zBooleanValue) {
                zdlpuopuiuVar.d(str);
            }
        }
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv4 = zdlpuopuiuVar2.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar3 = g0.esjtqupxsv.f35662iobyxmoadg;
        if (((gg.wwaezpbzkn) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv4, esjtqupxsvVar3.btonecajqb())) != null) {
            zdlpuopuiuVar.tbqsvytpvh(true);
            gg.wwaezpbzkn wwaezpbzknVar4 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i13 != -1) {
            int iEablkybsjg = this.f6789dsvhmnatus.eablkybsjg(zdlpuopuiuVar2.vdvldrhtss(), -1);
            if (iEablkybsjg != -1) {
                zdlpuopuiuVar.opjhrmiecq(iEablkybsjg);
                gg.wwaezpbzkn wwaezpbzknVar5 = gg.wwaezpbzkn.f37140iobyxmoadg;
            } else {
                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        zdlpuopuiuVar.ageimvtcrz(zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar3.zynmafqrjb()));
        zdlpuopuiuVar.iyctptxqzt(zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar3.kcexrzcfyt()));
        Integer num = (Integer) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar3.lereixgezr());
        zdlpuopuiuVar.skhdrjzrfn(num != null ? num.intValue() : -1);
        zdlpuopuiuVar.weqkydbzbr(esjtqupxsv.agtfadlqog(zdlpuopuiuVar2));
        zdlpuopuiuVar.zeieaojujs(zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar3.dxjokdxxww()));
        if (zdlpuopuiuVar.hcddaimhww()) {
            zdlpuopuiuVar.nuxfzjnpeb(((Boolean) zdlpuopuiuVar2.esjtqupxsv().gxszxtbevo(esjtqupxsvVar3.dxjokdxxww())).booleanValue());
            if (zdlpuopuiuVar.jpowsppfya()) {
                zdlpuopuiuVar.iobyxmoadg(2);
                this.f6814vdvldrhtss = i13;
            } else {
                zdlpuopuiuVar.iobyxmoadg(1);
            }
        }
        zdlpuopuiuVar.e(!g0.cqumvgiudr.ppxfxbqfkf(zdlpuopuiuVar2));
        g0.eablkybsjg eablkybsjgVar = (g0.eablkybsjg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar3.esjtqupxsv());
        if (eablkybsjgVar != null) {
            int iDxjokdxxww = eablkybsjgVar.dxjokdxxww();
            g0.eablkybsjg.iobyxmoadg iobyxmoadgVar3 = g0.eablkybsjg.f35646zoijcleaow;
            zdlpuopuiuVar.iwxlajgraz((!g0.eablkybsjg.gxszxtbevo(iDxjokdxxww, iobyxmoadgVar3.zoijcleaow()) && g0.eablkybsjg.gxszxtbevo(iDxjokdxxww, iobyxmoadgVar3.iobyxmoadg())) ? 2 : 1);
            gg.wwaezpbzkn wwaezpbzknVar6 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiuVar.yfnezrywwk(false);
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv5 = zdlpuopuiuVar2.esjtqupxsv();
        g0.draadjrbmk draadjrbmkVar = g0.draadjrbmk.f35622iobyxmoadg;
        g0.iobyxmoadg iobyxmoadgVar4 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv5, draadjrbmkVar.draadjrbmk());
        if (iobyxmoadgVar4 != null) {
            boolean zEablkybsjg2 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar3.iozdgvuglv()), Boolean.TRUE);
            g0.nufgyqmvbu.iobyxmoadg iobyxmoadgVar5 = g0.nufgyqmvbu.f35737zoijcleaow;
            if (nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), iobyxmoadgVar5.nufgyqmvbu())) {
                z13 = true;
            } else if (nufgyqmvbuVar == null ? false : g0.nufgyqmvbu.wflxmlrfwp(nufgyqmvbuVar.rgvfuqvkyq(), iobyxmoadgVar5.gxszxtbevo())) {
                z13 = true;
            } else {
                z13 = false;
            }
            zdlpuopuiuVar.yfnezrywwk(!z13 || (z13 && !zEablkybsjg2));
            if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2) && zdlpuopuiuVar.wwaezpbzkn()) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(16, iobyxmoadgVar4.zoijcleaow()));
            }
            gg.wwaezpbzkn wwaezpbzknVar7 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiuVar.dvvnrvtcbc(false);
        g0.iobyxmoadg iobyxmoadgVar6 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.agtfadlqog());
        if (iobyxmoadgVar6 != null) {
            zdlpuopuiuVar.dvvnrvtcbc(true);
            if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(32, iobyxmoadgVar6.zoijcleaow()));
            }
            gg.wwaezpbzkn wwaezpbzknVar8 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        g0.iobyxmoadg iobyxmoadgVar7 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.ppxfxbqfkf());
        if (iobyxmoadgVar7 != null) {
            zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(16384, iobyxmoadgVar7.zoijcleaow()));
            gg.wwaezpbzkn wwaezpbzknVar9 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
            g0.iobyxmoadg iobyxmoadgVar8 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.lereixgezr());
            if (iobyxmoadgVar8 != null) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(2097152, iobyxmoadgVar8.zoijcleaow()));
                gg.wwaezpbzkn wwaezpbzknVar10 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            g0.iobyxmoadg iobyxmoadgVar9 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.wflxmlrfwp());
            if (iobyxmoadgVar9 != null) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(R.id.accessibilityActionImeEnter, iobyxmoadgVar9.zoijcleaow()));
                gg.wwaezpbzkn wwaezpbzknVar11 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            g0.iobyxmoadg iobyxmoadgVar10 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.eablkybsjg());
            if (iobyxmoadgVar10 != null) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(65536, iobyxmoadgVar10.zoijcleaow()));
                gg.wwaezpbzkn wwaezpbzknVar12 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            g0.iobyxmoadg iobyxmoadgVar11 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.kcexrzcfyt());
            if (iobyxmoadgVar11 != null) {
                if (zdlpuopuiuVar.jpowsppfya() && this.f6816wkgbmnqykc.getClipboardManager().zoijcleaow()) {
                    zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(32768, iobyxmoadgVar11.zoijcleaow()));
                }
                gg.wwaezpbzkn wwaezpbzknVar13 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        String strCzzsidtyhn = czzsidtyhn(zdlpuopuiuVar2);
        if (!(strCzzsidtyhn == null || strCzzsidtyhn.length() == 0)) {
            zdlpuopuiuVar.eslsurpljm(ikoacuggdj(zdlpuopuiuVar2), jhduphickx(zdlpuopuiuVar2));
            g0.iobyxmoadg iobyxmoadgVar12 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar.esjtqupxsv());
            zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(131072, iobyxmoadgVar12 != null ? iobyxmoadgVar12.zoijcleaow() : null));
            zdlpuopuiuVar.iobyxmoadg(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            zdlpuopuiuVar.iobyxmoadg(UserVerificationMethods.USER_VERIFY_NONE);
            zdlpuopuiuVar.igdgnonuha(11);
            List list2 = (List) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar3.wkgbmnqykc());
            if ((list2 == null || list2.isEmpty()) && zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(draadjrbmkVar.dxjokdxxww()) && !esjtqupxsv.ojitshcjhn(zdlpuopuiuVar2)) {
                zdlpuopuiuVar.igdgnonuha(zdlpuopuiuVar.jyumaefscl() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence charSequenceEsjtqupxsv = zdlpuopuiuVar.esjtqupxsv();
        if (!(charSequenceEsjtqupxsv == null || charSequenceEsjtqupxsv.length() == 0) && zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(draadjrbmkVar.dxjokdxxww())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar3.ylkuphrtab())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        if (zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsvVar3.lmojexxdyd())) {
            arrayList.add("androidx.compose.ui.semantics.shapeType");
            arrayList.add("androidx.compose.ui.semantics.shapeRect");
            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
        }
        androidx.collection.vipkmwdibw vipkmwdibwVarDxjokdxxww = zdlpuopuiuVar2.esjtqupxsv().dxjokdxxww();
        if (vipkmwdibwVarDxjokdxxww != null) {
            Object[] objArr = vipkmwdibwVarDxjokdxxww.f4398zoijcleaow;
            long[] jArr = vipkmwdibwVarDxjokdxxww.f4395iobyxmoadg;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i17 = 0;
                while (true) {
                    long j13 = jArr[i17];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i17 != length) {
                            break;
                            break;
                        }
                        i17 += i14;
                    } else {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if (((j13 & 255) < 128 ? i14 : 0) != 0 && (strIobyxmoadg = ((g0.cdpycssgdh) objArr[(i17 << 3) + i19]).iobyxmoadg()) != null) {
                                arrayList.add(strIobyxmoadg);
                                gg.wwaezpbzkn wwaezpbzknVar14 = gg.wwaezpbzkn.f37140iobyxmoadg;
                            }
                            j13 >>= 8;
                            i14 = 1;
                        }
                        if (i18 != 8) {
                            break;
                        } else if (i17 != length) {
                            break;
                        } else {
                            i17 += i14;
                        }
                    }
                }
            }
            gg.wwaezpbzkn wwaezpbzknVar15 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiuVar.okpsazkaxt(arrayList);
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv6 = zdlpuopuiuVar2.esjtqupxsv();
        g0.esjtqupxsv esjtqupxsvVar4 = g0.esjtqupxsv.f35662iobyxmoadg;
        g0.lqeggnwhkg lqeggnwhkgVar = (g0.lqeggnwhkg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv6, esjtqupxsvVar4.istkbnxepw());
        if (lqeggnwhkgVar != null) {
            g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv7 = zdlpuopuiuVar2.esjtqupxsv();
            g0.draadjrbmk draadjrbmkVar2 = g0.draadjrbmk.f35622iobyxmoadg;
            if (wflxmlrfwpVarEsjtqupxsv7.ppxfxbqfkf(draadjrbmkVar2.cqumvgiudr())) {
                zdlpuopuiuVar.uwvvkdfqfp("android.widget.SeekBar");
            } else {
                zdlpuopuiuVar.uwvvkdfqfp("android.widget.ProgressBar");
            }
            if (lqeggnwhkgVar != g0.lqeggnwhkg.f35724wkgbmnqykc.iobyxmoadg()) {
                zdlpuopuiuVar.fyldjkxazc(w1.zdlpuopuiu.lqeggnwhkg.iobyxmoadg(1, ((Number) lqeggnwhkgVar.ppxfxbqfkf().getStart()).floatValue(), ((Number) lqeggnwhkgVar.ppxfxbqfkf().ppxfxbqfkf()).floatValue(), lqeggnwhkgVar.zoijcleaow()));
            }
            if (zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(draadjrbmkVar2.cqumvgiudr()) && esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
                if (lqeggnwhkgVar.zoijcleaow() < zg.gtknphoqwx.eablkybsjg(((Number) lqeggnwhkgVar.ppxfxbqfkf().ppxfxbqfkf()).floatValue(), ((Number) lqeggnwhkgVar.ppxfxbqfkf().getStart()).floatValue())) {
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118545vdvldrhtss);
                }
                if (lqeggnwhkgVar.zoijcleaow() > zg.gtknphoqwx.dxjokdxxww(((Number) lqeggnwhkgVar.ppxfxbqfkf().getStart()).floatValue(), ((Number) lqeggnwhkgVar.ppxfxbqfkf().ppxfxbqfkf()).floatValue())) {
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
                }
            }
        }
        int i23 = Build.VERSION.SDK_INT;
        zoijcleaow.iobyxmoadg(zdlpuopuiuVar, zdlpuopuiuVar2);
        a0.iobyxmoadg.wkgbmnqykc(zdlpuopuiuVar2, zdlpuopuiuVar);
        a0.iobyxmoadg.eablkybsjg(zdlpuopuiuVar2, zdlpuopuiuVar);
        g0.btonecajqb btonecajqbVar = (g0.btonecajqb) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar4.draadjrbmk());
        g0.wflxmlrfwp wflxmlrfwpVarEsjtqupxsv8 = zdlpuopuiuVar2.esjtqupxsv();
        g0.draadjrbmk draadjrbmkVar3 = g0.draadjrbmk.f35622iobyxmoadg;
        g0.iobyxmoadg iobyxmoadgVar13 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVarEsjtqupxsv8, draadjrbmkVar3.yggfygwlhe());
        if (btonecajqbVar != null && iobyxmoadgVar13 != null) {
            if (!a0.iobyxmoadg.zoijcleaow(zdlpuopuiuVar2)) {
                zdlpuopuiuVar.uwvvkdfqfp("android.widget.HorizontalScrollView");
            }
            if (((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue() > 0.0f) {
                zdlpuopuiuVar.mhtqkkgtqm(true);
            }
            if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
                if (iwxlajgraz(btonecajqbVar)) {
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118545vdvldrhtss);
                    zdlpuopuiuVar.zoijcleaow(!esjtqupxsv.zdlpuopuiu(zdlpuopuiuVar2) ? w1.zdlpuopuiu.iobyxmoadg.f118524iozdgvuglv : w1.zdlpuopuiu.iobyxmoadg.f118512cdpycssgdh);
                }
                if (auzgnhcxok(btonecajqbVar)) {
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
                    zdlpuopuiuVar.zoijcleaow(!esjtqupxsv.zdlpuopuiu(zdlpuopuiuVar2) ? w1.zdlpuopuiu.iobyxmoadg.f118512cdpycssgdh : w1.zdlpuopuiu.iobyxmoadg.f118524iozdgvuglv);
                }
            }
        }
        g0.btonecajqb btonecajqbVar2 = (g0.btonecajqb) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar4.dsvhmnatus());
        if (btonecajqbVar2 != null && iobyxmoadgVar13 != null) {
            if (!a0.iobyxmoadg.zoijcleaow(zdlpuopuiuVar2)) {
                zdlpuopuiuVar.uwvvkdfqfp("android.widget.ScrollView");
            }
            if (((Number) btonecajqbVar2.iobyxmoadg().invoke()).floatValue() > 0.0f) {
                zdlpuopuiuVar.mhtqkkgtqm(true);
            }
            if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
                if (iwxlajgraz(btonecajqbVar2)) {
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118545vdvldrhtss);
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118549yadqdtsiqt);
                }
                if (auzgnhcxok(btonecajqbVar2)) {
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
                    zdlpuopuiuVar.zoijcleaow(w1.zdlpuopuiu.iobyxmoadg.f118525istkbnxepw);
                }
            }
        }
        if (i23 >= 29) {
            ppxfxbqfkf.iobyxmoadg(zdlpuopuiuVar, zdlpuopuiuVar2);
        }
        zdlpuopuiuVar.wizcaqwiak((CharSequence) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), esjtqupxsvVar4.pmvmpeiblj()));
        if (esjtqupxsv.agtfadlqog(zdlpuopuiuVar2)) {
            g0.iobyxmoadg iobyxmoadgVar14 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar3.lqeggnwhkg());
            if (iobyxmoadgVar14 != null) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(262144, iobyxmoadgVar14.zoijcleaow()));
                gg.wwaezpbzkn wwaezpbzknVar16 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            g0.iobyxmoadg iobyxmoadgVar15 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar3.zoijcleaow());
            if (iobyxmoadgVar15 != null) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(524288, iobyxmoadgVar15.zoijcleaow()));
                gg.wwaezpbzkn wwaezpbzknVar17 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            g0.iobyxmoadg iobyxmoadgVar16 = (g0.iobyxmoadg) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), draadjrbmkVar3.gxszxtbevo());
            if (iobyxmoadgVar16 != null) {
                zdlpuopuiuVar.zoijcleaow(new w1.zdlpuopuiu.iobyxmoadg(1048576, iobyxmoadgVar16.zoijcleaow()));
                gg.wwaezpbzkn wwaezpbzknVar18 = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(draadjrbmkVar3.wkgbmnqykc())) {
                List list3 = (List) zdlpuopuiuVar2.esjtqupxsv().gxszxtbevo(draadjrbmkVar3.wkgbmnqykc());
                int size2 = list3.size();
                androidx.collection.wflxmlrfwp wflxmlrfwpVar = f6781ntlheqmsrt;
                if (size2 >= wflxmlrfwpVar.f4401zoijcleaow) {
                    throw new IllegalStateException("Can't have more than " + wflxmlrfwpVar.f4401zoijcleaow + " custom actions for one widget");
                }
                androidx.collection.xrmfcynszj xrmfcynszjVar = new androidx.collection.xrmfcynszj(0, 1, null);
                androidx.collection.hcddaimhww hcddaimhwwVarZoijcleaow = androidx.collection.tzroggbefp.zoijcleaow();
                if (this.f6787cqumvgiudr.wkgbmnqykc(i13)) {
                    androidx.collection.hcddaimhww hcddaimhwwVar = (androidx.collection.hcddaimhww) this.f6787cqumvgiudr.eablkybsjg(i13);
                    androidx.collection.yadqdtsiqt yadqdtsiqtVar = new androidx.collection.yadqdtsiqt(0, 1, null);
                    int[] iArr = wflxmlrfwpVar.f4400iobyxmoadg;
                    int i24 = wflxmlrfwpVar.f4401zoijcleaow;
                    for (int i25 = 0; i25 < i24; i25++) {
                        yadqdtsiqtVar.btonecajqb(iArr[i25]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (list3.size() > 0) {
                        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(list3.get(0));
                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(hcddaimhwwVar);
                        throw null;
                    }
                    if (arrayList2.size() > 0) {
                        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(arrayList2.get(0));
                        yadqdtsiqtVar.eablkybsjg(0);
                        throw null;
                    }
                } else if (list3.size() > 0) {
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(list3.get(0));
                    wflxmlrfwpVar.eablkybsjg(0);
                    throw null;
                }
                this.f6799iwizpuwonk.draadjrbmk(i13, xrmfcynszjVar);
                this.f6787cqumvgiudr.draadjrbmk(i13, hcddaimhwwVarZoijcleaow);
            }
        }
        zdlpuopuiuVar.grlcpdaxtj(esjtqupxsv.yggfygwlhe(zdlpuopuiuVar2, resources));
        int iEablkybsjg2 = this.f6805lmojexxdyd.eablkybsjg(i13, -1);
        if (iEablkybsjg2 != -1) {
            View viewWkgbmnqykc2 = k.wkgbmnqykc(this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release(), iEablkybsjg2);
            if (viewWkgbmnqykc2 != null) {
                zdlpuopuiuVar.b(viewWkgbmnqykc2);
            } else {
                zdlpuopuiuVar.c(this.f6816wkgbmnqykc, iEablkybsjg2);
            }
            cllcsxoeiz(i13, zdlpuopuiuVar, this.f6821ylkuphrtab, null);
        }
        int iEablkybsjg3 = this.f6817wwaezpbzkn.eablkybsjg(i13, -1);
        if (iEablkybsjg3 != -1 && (viewWkgbmnqykc = k.wkgbmnqykc(this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release(), iEablkybsjg3)) != null) {
            zdlpuopuiuVar.krqnebusok(viewWkgbmnqykc);
            cllcsxoeiz(i13, zdlpuopuiuVar, this.f6810pkzmftpjix, null);
        }
        String str2 = (String) g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVar2.esjtqupxsv(), g0.lereixgezr.f35717iobyxmoadg.iobyxmoadg());
        if (str2 != null) {
            zdlpuopuiuVar.uwvvkdfqfp(str2);
            gg.wwaezpbzkn wwaezpbzknVar19 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final w1.zdlpuopuiu ulzqkzuiru(int i13) {
        g0.jyumaefscl jyumaefsclVar;
        androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        androidx.lifecycle.gtknphoqwx lifecycle;
        AndroidComposeView.zoijcleaow viewTreeOwners = this.f6816wkgbmnqykc.getViewTreeOwners();
        if (((viewTreeOwners == null || (vdvldrhtssVarIobyxmoadg = viewTreeOwners.iobyxmoadg()) == null || (lifecycle = vdvldrhtssVarIobyxmoadg.getLifecycle()) == null) ? null : lifecycle.zoijcleaow()) != androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED && (jyumaefsclVar = (g0.jyumaefscl) okpsazkaxt().zoijcleaow(i13)) != null) {
            g0.zdlpuopuiu zdlpuopuiuVarZoijcleaow = jyumaefsclVar.zoijcleaow();
            boolean zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g0.agtfadlqog.iobyxmoadg(zdlpuopuiuVarZoijcleaow.rgvfuqvkyq(), g0.esjtqupxsv.f35662iobyxmoadg.yggfygwlhe()), Boolean.TRUE);
            if (zEablkybsjg && !opjhrmiecq()) {
                return null;
            }
            w1.zdlpuopuiu zdlpuopuiuVarUlzqkzuiru = w1.zdlpuopuiu.ulzqkzuiru();
            zdlpuopuiuVarUlzqkzuiru.jhduphickx(zEablkybsjg);
            if (i13 == -1) {
                ViewParent parentForAccessibility = this.f6816wkgbmnqykc.getParentForAccessibility();
                zdlpuopuiuVarUlzqkzuiru.hszhottldk(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
            } else {
                g0.zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVarZoijcleaow.zdlpuopuiu();
                Integer numValueOf = zdlpuopuiuVarZdlpuopuiu != null ? Integer.valueOf(zdlpuopuiuVarZdlpuopuiu.vdvldrhtss()) : null;
                if (numValueOf == null) {
                    w.iobyxmoadg.ppxfxbqfkf("semanticsNode " + i13 + " has null parent");
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numValueOf.intValue();
                zdlpuopuiuVarUlzqkzuiru.fiwbwshyhd(this.f6816wkgbmnqykc, iIntValue != this.f6816wkgbmnqykc.getSemanticsOwner().wkgbmnqykc().vdvldrhtss() ? iIntValue : -1);
            }
            zdlpuopuiuVarUlzqkzuiru.ezmngbhpjk(this.f6816wkgbmnqykc, i13);
            zdlpuopuiuVarUlzqkzuiru.metgxyhuhe(dsvhmnatus(jyumaefsclVar));
            uawqvzlxes(i13, zdlpuopuiuVarUlzqkzuiru, zdlpuopuiuVarZoijcleaow);
            return zdlpuopuiuVarUlzqkzuiru;
        }
        return ribwqtqdhb();
    }

    private final androidx.compose.ui.platform.lqeggnwhkg uwvvkdfqfp(g0.zdlpuopuiu zdlpuopuiuVar, int i13) {
        String strCzzsidtyhn;
        j0.f fVarPpxfxbqfkf;
        if (zdlpuopuiuVar == null || (strCzzsidtyhn = czzsidtyhn(zdlpuopuiuVar)) == null || strCzzsidtyhn.length() == 0) {
            return null;
        }
        if (i13 == 1) {
            androidx.compose.ui.platform.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = androidx.compose.ui.platform.ppxfxbqfkf.f7032wkgbmnqykc.iobyxmoadg(this.f6816wkgbmnqykc.getContext().getResources().getConfiguration().locale);
            ppxfxbqfkfVarIobyxmoadg.eablkybsjg(strCzzsidtyhn);
            return ppxfxbqfkfVarIobyxmoadg;
        }
        if (i13 == 2) {
            androidx.compose.ui.platform.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = androidx.compose.ui.platform.nufgyqmvbu.f7019wkgbmnqykc.iobyxmoadg(this.f6816wkgbmnqykc.getContext().getResources().getConfiguration().locale);
            nufgyqmvbuVarIobyxmoadg.eablkybsjg(strCzzsidtyhn);
            return nufgyqmvbuVarIobyxmoadg;
        }
        if (i13 != 4) {
            if (i13 == 8) {
                androidx.compose.ui.platform.gxszxtbevo gxszxtbevoVarIobyxmoadg = androidx.compose.ui.platform.gxszxtbevo.f6928ppxfxbqfkf.iobyxmoadg();
                gxszxtbevoVarIobyxmoadg.eablkybsjg(strCzzsidtyhn);
                return gxszxtbevoVarIobyxmoadg;
            }
            if (i13 != 16) {
                return null;
            }
        }
        if (!zdlpuopuiuVar.esjtqupxsv().ppxfxbqfkf(g0.draadjrbmk.f35622iobyxmoadg.dxjokdxxww()) || (fVarPpxfxbqfkf = k.ppxfxbqfkf(zdlpuopuiuVar.esjtqupxsv())) == null) {
            return null;
        }
        if (i13 == 4) {
            androidx.compose.ui.platform.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.compose.ui.platform.wkgbmnqykc.f7127wkgbmnqykc.iobyxmoadg();
            wkgbmnqykcVarIobyxmoadg.btonecajqb(strCzzsidtyhn, fVarPpxfxbqfkf);
            return wkgbmnqykcVarIobyxmoadg;
        }
        androidx.compose.ui.platform.eablkybsjg eablkybsjgVarIobyxmoadg = androidx.compose.ui.platform.eablkybsjg.f6870gxszxtbevo.iobyxmoadg();
        eablkybsjgVarIobyxmoadg.btonecajqb(strCzzsidtyhn, fVarPpxfxbqfkf, zdlpuopuiuVar);
        return eablkybsjgVarIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vipkmwdibw(cqumvgiudr cqumvgiudrVar, boolean z13) {
        cqumvgiudrVar.f6788draadjrbmk = z13 ? cqumvgiudrVar.f6806lqeggnwhkg.getEnabledAccessibilityServiceList(-1) : hg.jyumaefscl.wflxmlrfwp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(z.pkzmftpjix pkzmftpjixVar) {
        if (this.f6811pmvmpeiblj.add(pkzmftpjixVar)) {
            this.f6823zynmafqrjb.eablkybsjg(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int wizcaqwiak(int i13) {
        if (i13 == this.f6816wkgbmnqykc.getSemanticsOwner().wkgbmnqykc().vdvldrhtss()) {
            return -1;
        }
        return i13;
    }

    private final j0.eablkybsjg yfnezrywwk(g0.wflxmlrfwp wflxmlrfwpVar) {
        return (j0.eablkybsjg) g0.agtfadlqog.iobyxmoadg(wflxmlrfwpVar, g0.esjtqupxsv.f35662iobyxmoadg.lqeggnwhkg());
    }

    private final void yzdjzghtvl(g0.zdlpuopuiu zdlpuopuiuVar, w1.zdlpuopuiu zdlpuopuiuVar2) {
        j0.eablkybsjg eablkybsjgVarKcexrzcfyt = esjtqupxsv.kcexrzcfyt(zdlpuopuiuVar);
        zdlpuopuiuVar2.yzdjzghtvl(eablkybsjgVarKcexrzcfyt != null ? d(eablkybsjgVarKcexrzcfyt) : null);
    }

    private final boolean zfvoamnweg(int i13) {
        return this.f6812rgvfuqvkyq == i13;
    }

    public final boolean bfopjjpdmp() {
        return this.f6807nufgyqmvbu || (this.f6806lqeggnwhkg.isEnabled() && !this.f6788draadjrbmk.isEmpty());
    }

    public final boolean jlmebxxoox(MotionEvent motionEvent) {
        if (!iyctptxqzt()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iSflfametgt = sflfametgt(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            h(iSflfametgt);
            if (iSflfametgt == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f6791eablkybsjg == Integer.MIN_VALUE) {
            return this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        h(Integer.MIN_VALUE);
        return true;
    }

    public final String jztzpxfvev() {
        return this.f6810pkzmftpjix;
    }

    public final void lrnfpwlwnk(z.pkzmftpjix pkzmftpjixVar) {
        this.f6798istkbnxepw = true;
        if (bfopjjpdmp()) {
            weqkydbzbr(pkzmftpjixVar);
        }
    }

    public final androidx.collection.cdpycssgdh metgxyhuhe() {
        return this.f6817wwaezpbzkn;
    }

    public final void rhgxfdycjh(long j13) {
        this.f6790dxjokdxxww = j13;
    }

    public final androidx.collection.cdpycssgdh rlfsiqarku() {
        return this.f6805lmojexxdyd;
    }

    public final int sflfametgt(float f13, float f14) {
        int iWizcaqwiak;
        z.opjhrmiecq.lereixgezr(this.f6816wkgbmnqykc, false, 1, null);
        z.iwizpuwonk iwizpuwonkVar = new z.iwizpuwonk();
        z.pkzmftpjix.grlcpdaxtj(this.f6816wkgbmnqykc.getRoot(), g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32)), iwizpuwonkVar, 0, false, 12, null);
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(iwizpuwonkVar);
        while (true) {
            iWizcaqwiak = Integer.MIN_VALUE;
            if (-1 >= iOjitshcjhn) {
                break;
            }
            z.pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(iwizpuwonkVar.get(iOjitshcjhn));
            if (this.f6816wkgbmnqykc.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pkzmftpjixVarRgvfuqvkyq) != null) {
                return Integer.MIN_VALUE;
            }
            if (pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().rgvfuqvkyq(z.rlfsiqarku.iobyxmoadg(8))) {
                iWizcaqwiak = wizcaqwiak(pkzmftpjixVarRgvfuqvkyq.zynmafqrjb());
                g0.zdlpuopuiu zdlpuopuiuVarIobyxmoadg = g0.yggfygwlhe.iobyxmoadg(pkzmftpjixVarRgvfuqvkyq, false);
                if (g0.cqumvgiudr.wkgbmnqykc(zdlpuopuiuVarIobyxmoadg) && !zdlpuopuiuVarIobyxmoadg.rgvfuqvkyq().ppxfxbqfkf(g0.esjtqupxsv.f35662iobyxmoadg.cqumvgiudr())) {
                    break;
                }
            }
            iOjitshcjhn--;
        }
        return iWizcaqwiak;
    }

    public final boolean stevsuqkhv(boolean z13, int i13, long j13) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return kegysxyocb(okpsazkaxt(), z13, i13, j13);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:37:0x009e, B:38:0x00a7, B:20:0x0049, B:23:0x0050), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:37:0x009e, B:38:0x00a7, B:20:0x0049, B:23:0x0050), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0036, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:37:0x009e, B:38:0x00a7, B:20:0x0049, B:23:0x0050), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:37:0x009e, B:38:0x00a7, B:20:0x0049, B:23:0x0050), top: B:45:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c2 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object wypolnanlu(lg.gxszxtbevo r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.cqumvgiudr.wypolnanlu(lg.gxszxtbevo):java.lang.Object");
    }

    public final String xrmfcynszj() {
        return this.f6821ylkuphrtab;
    }

    public final AndroidComposeView ydmasvzmpa() {
        return this.f6816wkgbmnqykc;
    }

    public final void zeieaojujs() {
        this.f6798istkbnxepw = true;
        if (!bfopjjpdmp() || this.f6786cllcsxoeiz) {
            return;
        }
        this.f6786cllcsxoeiz = true;
        this.f6783agtfadlqog.post(this.f6818wypolnanlu);
    }

    @Override // v1.iobyxmoadg
    public w1.yggfygwlhe zoijcleaow(View view) {
        return this.f6808ojitshcjhn;
    }
}
