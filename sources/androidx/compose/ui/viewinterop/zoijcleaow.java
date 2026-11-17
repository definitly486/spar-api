package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.cqumvgiudr;
import androidx.compose.ui.layout.kcexrzcfyt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.b;
import androidx.compose.ui.platform.g0;
import androidx.lifecycle.vipkmwdibw;
import gg.zdlpuopuiu;
import h.metgxyhuhe;
import h.yadqdtsiqt;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import pj.cllcsxoeiz;
import t.hcddaimhww;
import v1.bfopjjpdmp;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;
import v1.wwaezpbzkn;
import v1.ylkuphrtab;
import w0.esjtqupxsv;
import w0.lereixgezr;
import x.istkbnxepw;
import x.zynmafqrjb;
import z.iyctptxqzt;
import z.opjhrmiecq;
import z.weqkydbzbr;
import z.xrmfcynszj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow extends ViewGroup implements wwaezpbzkn, androidx.compose.runtime.dxjokdxxww, iyctptxqzt, pkzmftpjix {

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    public static final ppxfxbqfkf f7262mbcevpiqjq = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    public static final int f7263ntlheqmsrt = 8;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private static final tg.draadjrbmk f7264ulzqkzuiru = C0123zoijcleaow.f7321zdlpuopuiu;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private w0.wkgbmnqykc f7265cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final int[] f7266cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private tg.iobyxmoadg f7267cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f7268dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f7269esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final tg.iobyxmoadg f7270hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private tg.draadjrbmk f7271hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private androidx.lifecycle.vdvldrhtss f7272iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private tg.draadjrbmk f7273istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final opjhrmiecq f7274iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final tg.iobyxmoadg f7275jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final View f7276jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f7277kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private tg.iobyxmoadg f7278lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private q5.dxjokdxxww f7279lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private skhdrjzrfn f7280pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private tg.iobyxmoadg f7281pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final ylkuphrtab f7282stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final z.pkzmftpjix f7283tzroggbefp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final int[] f7284wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f7285wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private tg.draadjrbmk f7286yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final s.zoijcleaow f7287yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private long f7288ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f7289zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private androidx.compose.ui.wkgbmnqykc f7290zynmafqrjb;

    static final class agtfadlqog extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final agtfadlqog f7291zdlpuopuiu = new agtfadlqog();

        agtfadlqog() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
        }
    }

    static final class btonecajqb extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f7292jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f7293yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(z.pkzmftpjix pkzmftpjixVar, zoijcleaow zoijcleaowVar) {
            super(1);
            this.f7293yggfygwlhe = pkzmftpjixVar;
            this.f7292jyumaefscl = zoijcleaowVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((j.gxszxtbevo) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(j.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            z.pkzmftpjix pkzmftpjixVar = this.f7293yggfygwlhe;
            zoijcleaow zoijcleaowVar2 = this.f7292jyumaefscl;
            metgxyhuhe metgxyhuheVarGxszxtbevo = gxszxtbevoVar.K().gxszxtbevo();
            if (zoijcleaowVar.getView().getVisibility() != 8) {
                zoijcleaowVar.f7277kegysxyocb = true;
                opjhrmiecq opjhrmiecqVarUawqvzlxes = pkzmftpjixVar.uawqvzlxes();
                AndroidComposeView androidComposeView = opjhrmiecqVarUawqvzlxes instanceof AndroidComposeView ? (AndroidComposeView) opjhrmiecqVarUawqvzlxes : null;
                if (androidComposeView != null) {
                    androidComposeView.iwxlajgraz(zoijcleaowVar2, yadqdtsiqt.wkgbmnqykc(metgxyhuheVarGxszxtbevo));
                }
                zoijcleaowVar.f7277kegysxyocb = false;
            }
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ long f7295iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f7296jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f7297yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f7298zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(boolean z13, zoijcleaow zoijcleaowVar, long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f7297yggfygwlhe = z13;
            this.f7296jyumaefscl = zoijcleaowVar;
            this.f7295iwizpuwonk = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new draadjrbmk(this.f7297yggfygwlhe, this.f7296jyumaefscl, this.f7295iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f7298zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (this.f7297yggfygwlhe) {
                    s.zoijcleaow zoijcleaowVar = this.f7296jyumaefscl.f7287yggfygwlhe;
                    long j13 = this.f7295iwizpuwonk;
                    long jIobyxmoadg = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
                    this.f7298zdlpuopuiu = 2;
                    obj = zoijcleaowVar.iobyxmoadg(j13, jIobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ((esjtqupxsv) obj).ojitshcjhn();
                } else {
                    s.zoijcleaow zoijcleaowVar2 = this.f7296jyumaefscl.f7287yggfygwlhe;
                    long jIobyxmoadg2 = esjtqupxsv.f118251zoijcleaow.iobyxmoadg();
                    long j14 = this.f7295iwizpuwonk;
                    this.f7298zdlpuopuiu = 1;
                    obj = zoijcleaowVar2.iobyxmoadg(jIobyxmoadg2, j14, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ((esjtqupxsv) obj).ojitshcjhn();
                }
            } else if (i13 == 1) {
                zdlpuopuiu.zoijcleaow(obj);
                ((esjtqupxsv) obj).ojitshcjhn();
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                ((esjtqupxsv) obj).ojitshcjhn();
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final dxjokdxxww f7299zdlpuopuiu = new dxjokdxxww();

        dxjokdxxww() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((g0.yadqdtsiqt) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(g0.yadqdtsiqt yadqdtsiqtVar) {
        }
    }

    static final class eablkybsjg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f7300zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(z.pkzmftpjix pkzmftpjixVar) {
            super(1);
            this.f7300zdlpuopuiu = pkzmftpjixVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((w0.wkgbmnqykc) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar) {
            this.f7300zdlpuopuiu.ppxfxbqfkf(wkgbmnqykcVar);
        }
    }

    static final class gtknphoqwx extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f7301yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(z.pkzmftpjix pkzmftpjixVar) {
            super(1);
            this.f7301yggfygwlhe = pkzmftpjixVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((x.rgvfuqvkyq) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(x.rgvfuqvkyq rgvfuqvkyqVar) {
            WindowInsets windowInsetsCqumvgiudr;
            androidx.compose.ui.viewinterop.wkgbmnqykc.gxszxtbevo(zoijcleaow.this, this.f7301yggfygwlhe);
            zoijcleaow.this.f7274iwizpuwonk.gtknphoqwx(zoijcleaow.this);
            int i13 = zoijcleaow.this.f7284wwaezpbzkn[0];
            int i14 = zoijcleaow.this.f7284wwaezpbzkn[1];
            zoijcleaow.this.getView().getLocationOnScreen(zoijcleaow.this.f7284wwaezpbzkn);
            long j13 = zoijcleaow.this.f7288ylkuphrtab;
            zoijcleaow.this.f7288ylkuphrtab = rgvfuqvkyqVar.iobyxmoadg();
            skhdrjzrfn skhdrjzrfnVar = zoijcleaow.this.f7280pkzmftpjix;
            if (skhdrjzrfnVar != null) {
                if ((i13 == zoijcleaow.this.f7284wwaezpbzkn[0] && i14 == zoijcleaow.this.f7284wwaezpbzkn[1] && w0.oxmwwwfdhm.eablkybsjg(j13, zoijcleaow.this.f7288ylkuphrtab)) || (windowInsetsCqumvgiudr = zoijcleaow.this.pmvmpeiblj(skhdrjzrfnVar).cqumvgiudr()) == null) {
                    return;
                }
                zoijcleaow.this.getView().dispatchApplyWindowInsets(windowInsetsCqumvgiudr);
            }
        }
    }

    static final class gxszxtbevo extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f7303yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(z.pkzmftpjix pkzmftpjixVar) {
            super(1);
            this.f7303yggfygwlhe = pkzmftpjixVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((opjhrmiecq) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(opjhrmiecq opjhrmiecqVar) {
            AndroidComposeView androidComposeView = opjhrmiecqVar instanceof AndroidComposeView ? (AndroidComposeView) opjhrmiecqVar : null;
            if (androidComposeView != null) {
                androidComposeView.iyctptxqzt(zoijcleaow.this, this.f7303yggfygwlhe);
            }
            ViewParent parent = zoijcleaow.this.getView().getParent();
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            if (parent != zoijcleaowVar) {
                zoijcleaowVar.addView(zoijcleaowVar.getView());
            }
        }
    }

    public static final class iobyxmoadg extends bfopjjpdmp.zoijcleaow {
        iobyxmoadg() {
            super(1);
        }

        @Override // v1.bfopjjpdmp.zoijcleaow
        public skhdrjzrfn eablkybsjg(skhdrjzrfn skhdrjzrfnVar, List list) {
            return zoijcleaow.this.pmvmpeiblj(skhdrjzrfnVar);
        }

        @Override // v1.bfopjjpdmp.zoijcleaow
        public bfopjjpdmp.iobyxmoadg gxszxtbevo(bfopjjpdmp bfopjjpdmpVar, bfopjjpdmp.iobyxmoadg iobyxmoadgVar) {
            return zoijcleaow.this.lereixgezr(iobyxmoadgVar);
        }
    }

    static final class lqeggnwhkg extends jyumaefscl implements tg.draadjrbmk {
        lqeggnwhkg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((opjhrmiecq) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(opjhrmiecq opjhrmiecqVar) {
            if (a.nufgyqmvbu.f65wkgbmnqykc && zoijcleaow.this.hasFocus()) {
                opjhrmiecqVar.getFocusOwner().jyumaefscl(true);
            }
            AndroidComposeView androidComposeView = opjhrmiecqVar instanceof AndroidComposeView ? (AndroidComposeView) opjhrmiecqVar : null;
            if (androidComposeView != null) {
                androidComposeView.b(zoijcleaow.this);
            }
            zoijcleaow.this.removeAllViewsInLayout();
        }
    }

    public static final class nufgyqmvbu implements zynmafqrjb {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f7308zoijcleaow;

        static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f7309zdlpuopuiu = new iobyxmoadg();

            iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.zoijcleaow$nufgyqmvbu$zoijcleaow, reason: collision with other inner class name */
        static final class C0122zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ z.pkzmftpjix f7310yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f7311zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0122zoijcleaow(zoijcleaow zoijcleaowVar, z.pkzmftpjix pkzmftpjixVar) {
                super(1);
                this.f7311zdlpuopuiu = zoijcleaowVar;
                this.f7310yggfygwlhe = pkzmftpjixVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
                androidx.compose.ui.viewinterop.wkgbmnqykc.gxszxtbevo(this.f7311zdlpuopuiu, this.f7310yggfygwlhe);
            }
        }

        nufgyqmvbu(z.pkzmftpjix pkzmftpjixVar) {
            this.f7308zoijcleaow = pkzmftpjixVar;
        }

        private final int ppxfxbqfkf(int i13) {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            ViewGroup.LayoutParams layoutParams = zoijcleaowVar.getLayoutParams();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(layoutParams);
            zoijcleaowVar.measure(zoijcleaowVar.cdpycssgdh(0, i13, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return zoijcleaow.this.getMeasuredHeight();
        }

        private final int wkgbmnqykc(int i13) {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            ViewGroup.LayoutParams layoutParams = zoijcleaowVar2.getLayoutParams();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(layoutParams);
            zoijcleaowVar.measure(iMakeMeasureSpec, zoijcleaowVar2.cdpycssgdh(0, i13, layoutParams.height));
            return zoijcleaow.this.getMeasuredWidth();
        }

        @Override // x.zynmafqrjb
        public int btonecajqb(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
            return ppxfxbqfkf(i13);
        }

        @Override // x.zynmafqrjb
        public int gxszxtbevo(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
            return ppxfxbqfkf(i13);
        }

        @Override // x.zynmafqrjb
        public int iobyxmoadg(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
            return wkgbmnqykc(i13);
        }

        @Override // x.zynmafqrjb
        public istkbnxepw lqeggnwhkg(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, List list, long j13) {
            if (zoijcleaow.this.getChildCount() == 0) {
                return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.zoijcleaow.agtfadlqog(j13), w0.zoijcleaow.wflxmlrfwp(j13), null, iobyxmoadg.f7309zdlpuopuiu, 4, null);
            }
            if (w0.zoijcleaow.agtfadlqog(j13) != 0) {
                zoijcleaow.this.getChildAt(0).setMinimumWidth(w0.zoijcleaow.agtfadlqog(j13));
            }
            if (w0.zoijcleaow.wflxmlrfwp(j13) != 0) {
                zoijcleaow.this.getChildAt(0).setMinimumHeight(w0.zoijcleaow.wflxmlrfwp(j13));
            }
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            int iAgtfadlqog = w0.zoijcleaow.agtfadlqog(j13);
            int iDraadjrbmk = w0.zoijcleaow.draadjrbmk(j13);
            ViewGroup.LayoutParams layoutParams = zoijcleaow.this.getLayoutParams();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(layoutParams);
            int iCdpycssgdh = zoijcleaowVar.cdpycssgdh(iAgtfadlqog, iDraadjrbmk, layoutParams.width);
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            int iWflxmlrfwp = w0.zoijcleaow.wflxmlrfwp(j13);
            int iGtknphoqwx = w0.zoijcleaow.gtknphoqwx(j13);
            ViewGroup.LayoutParams layoutParams2 = zoijcleaow.this.getLayoutParams();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(layoutParams2);
            zoijcleaowVar.measure(iCdpycssgdh, zoijcleaowVar2.cdpycssgdh(iWflxmlrfwp, iGtknphoqwx, layoutParams2.height));
            return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, zoijcleaow.this.getMeasuredWidth(), zoijcleaow.this.getMeasuredHeight(), null, new C0122zoijcleaow(zoijcleaow.this, this.f7308zoijcleaow), 4, null);
        }

        @Override // x.zynmafqrjb
        public int zoijcleaow(x.wflxmlrfwp wflxmlrfwpVar, List list, int i13) {
            return wkgbmnqykc(i13);
        }
    }

    static final class ojitshcjhn extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ojitshcjhn f7312zdlpuopuiu = new ojitshcjhn();

        ojitshcjhn() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
        }
    }

    static final class oxmwwwfdhm extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final oxmwwwfdhm f7313zdlpuopuiu = new oxmwwwfdhm();

        oxmwwwfdhm() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf {
        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private ppxfxbqfkf() {
        }
    }

    static final class rgvfuqvkyq extends jyumaefscl implements tg.iobyxmoadg {
        rgvfuqvkyq() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            zoijcleaow.this.getLayoutNode().ixidwrxhsl();
        }
    }

    static final class vdvldrhtss extends jyumaefscl implements tg.iobyxmoadg {
        vdvldrhtss() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            if (zoijcleaow.this.f7269esjtqupxsv && zoijcleaow.this.isAttachedToWindow()) {
                ViewParent parent = zoijcleaow.this.getView().getParent();
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                if (parent == zoijcleaowVar) {
                    zoijcleaowVar.getSnapshotObserver().dxjokdxxww(zoijcleaow.this, zoijcleaow.f7264ulzqkzuiru, zoijcleaow.this.getUpdate());
                }
            }
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ long f7316jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f7318zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(long j13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f7316jyumaefscl = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new wflxmlrfwp(this.f7316jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f7318zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                s.zoijcleaow zoijcleaowVar = zoijcleaow.this.f7287yggfygwlhe;
                long j13 = this.f7316jyumaefscl;
                this.f7318zdlpuopuiu = 1;
                if (zoijcleaowVar.ppxfxbqfkf(j13, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc f7319yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f7320zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(z.pkzmftpjix pkzmftpjixVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar) {
            super(1);
            this.f7320zdlpuopuiu = pkzmftpjixVar;
            this.f7319yggfygwlhe = wkgbmnqykcVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((androidx.compose.ui.wkgbmnqykc) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar) {
            this.f7320zdlpuopuiu.agtfadlqog(wkgbmnqykcVar.eablkybsjg(this.f7319yggfygwlhe));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0123zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C0123zoijcleaow f7321zdlpuopuiu = new C0123zoijcleaow();

        C0123zoijcleaow() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.invoke();
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            lqeggnwhkg((zoijcleaow) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void lqeggnwhkg(zoijcleaow zoijcleaowVar) {
            Handler handler = zoijcleaowVar.getHandler();
            final tg.iobyxmoadg iobyxmoadgVar = zoijcleaowVar.f7270hcddaimhww;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.ppxfxbqfkf
                @Override // java.lang.Runnable
                public final void run() {
                    zoijcleaow.C0123zoijcleaow.btonecajqb(iobyxmoadgVar);
                }
            });
        }
    }

    public zoijcleaow(Context context, cqumvgiudr cqumvgiudrVar, int i13, s.zoijcleaow zoijcleaowVar, View view, opjhrmiecq opjhrmiecqVar) {
        super(context);
        this.f7289zdlpuopuiu = i13;
        this.f7287yggfygwlhe = zoijcleaowVar;
        this.f7276jyumaefscl = view;
        this.f7274iwizpuwonk = opjhrmiecqVar;
        if (cqumvgiudrVar != null) {
            g0.dxjokdxxww(this, cqumvgiudrVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        jhduphickx.grlcpdaxtj(this, new iobyxmoadg());
        jhduphickx.igdgnonuha(this, this);
        this.f7267cqumvgiudr = oxmwwwfdhm.f7313zdlpuopuiu;
        this.f7278lereixgezr = ojitshcjhn.f7312zdlpuopuiu;
        this.f7281pmvmpeiblj = agtfadlqog.f7291zdlpuopuiu;
        androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
        this.f7290zynmafqrjb = iobyxmoadgVar;
        this.f7265cdpycssgdh = w0.gxszxtbevo.zoijcleaow(1.0f, 0.0f, 2, null);
        this.f7284wwaezpbzkn = new int[2];
        this.f7288ylkuphrtab = w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
        this.f7270hcddaimhww = new vdvldrhtss();
        this.f7275jpowsppfya = new rgvfuqvkyq();
        this.f7266cllcsxoeiz = new int[2];
        this.f7268dsvhmnatus = Integer.MIN_VALUE;
        this.f7285wypolnanlu = Integer.MIN_VALUE;
        this.f7282stevsuqkhv = new ylkuphrtab(this);
        z.pkzmftpjix pkzmftpjixVar = new z.pkzmftpjix(false, 0, 3, null);
        pkzmftpjixVar.W(this);
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.compose.ui.layout.agtfadlqog.iobyxmoadg(androidx.compose.ui.draw.zoijcleaow.zoijcleaow(hcddaimhww.iobyxmoadg(g0.kcexrzcfyt.zoijcleaow(androidx.compose.ui.input.nestedscroll.iobyxmoadg.iobyxmoadg(iobyxmoadgVar, androidx.compose.ui.viewinterop.wkgbmnqykc.f7261iobyxmoadg, zoijcleaowVar), true, dxjokdxxww.f7299zdlpuopuiu), this), new btonecajqb(pkzmftpjixVar, this)), new gtknphoqwx(pkzmftpjixVar));
        pkzmftpjixVar.eablkybsjg(i13);
        pkzmftpjixVar.agtfadlqog(this.f7290zynmafqrjb.eablkybsjg(wkgbmnqykcVarIobyxmoadg));
        this.f7273istkbnxepw = new wkgbmnqykc(pkzmftpjixVar, wkgbmnqykcVarIobyxmoadg);
        pkzmftpjixVar.ppxfxbqfkf(this.f7265cdpycssgdh);
        this.f7286yadqdtsiqt = new eablkybsjg(pkzmftpjixVar);
        pkzmftpjixVar.c0(new gxszxtbevo(pkzmftpjixVar));
        pkzmftpjixVar.d0(new lqeggnwhkg());
        pkzmftpjixVar.wflxmlrfwp(new nufgyqmvbu(pkzmftpjixVar));
        this.f7283tzroggbefp = pkzmftpjixVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int cdpycssgdh(int i13, int i14, int i15) {
        if (i15 >= 0 || i13 == i14) {
            return View.MeasureSpec.makeMeasureSpec(zg.gtknphoqwx.agtfadlqog(i15, i13, i14), 1073741824);
        }
        if (i15 != -2 || i14 == Integer.MAX_VALUE) {
            return (i15 != -1 || i14 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
    }

    private final j1.wkgbmnqykc esjtqupxsv(j1.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, int i15, int i16) {
        int i17 = wkgbmnqykcVar.f50505iobyxmoadg - i13;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = wkgbmnqykcVar.f50508zoijcleaow - i14;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = wkgbmnqykcVar.f50506ppxfxbqfkf - i15;
        if (i19 < 0) {
            i19 = 0;
        }
        int i23 = wkgbmnqykcVar.f50507wkgbmnqykc - i16;
        return j1.wkgbmnqykc.zoijcleaow(i17, i18, i19, i23 >= 0 ? i23 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final weqkydbzbr getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            w.iobyxmoadg.zoijcleaow("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f7274iwizpuwonk.getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void istkbnxepw(tg.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bfopjjpdmp.iobyxmoadg lereixgezr(bfopjjpdmp.iobyxmoadg iobyxmoadgVar) {
        xrmfcynszj xrmfcynszjVarCrxdokpmqz = this.f7283tzroggbefp.crxdokpmqz();
        if (xrmfcynszjVarCrxdokpmqz.gxszxtbevo()) {
            long jPpxfxbqfkf = w0.ojitshcjhn.ppxfxbqfkf(x.vdvldrhtss.eablkybsjg(xrmfcynszjVarCrxdokpmqz));
            int iDxjokdxxww = w0.agtfadlqog.dxjokdxxww(jPpxfxbqfkf);
            int i13 = iDxjokdxxww < 0 ? 0 : iDxjokdxxww;
            int iBtonecajqb = w0.agtfadlqog.btonecajqb(jPpxfxbqfkf);
            int i14 = iBtonecajqb < 0 ? 0 : iBtonecajqb;
            long jIobyxmoadg = x.vdvldrhtss.wkgbmnqykc(xrmfcynszjVarCrxdokpmqz).iobyxmoadg();
            int i15 = (int) (jIobyxmoadg >> 32);
            int i16 = (int) (jIobyxmoadg & 4294967295L);
            long jIobyxmoadg2 = xrmfcynszjVarCrxdokpmqz.iobyxmoadg();
            long jPpxfxbqfkf2 = w0.ojitshcjhn.ppxfxbqfkf(xrmfcynszjVarCrxdokpmqz.opjhrmiecq(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits((int) (jIobyxmoadg2 >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (jIobyxmoadg2 & 4294967295L)))))));
            int iDxjokdxxww2 = i15 - w0.agtfadlqog.dxjokdxxww(jPpxfxbqfkf2);
            int i17 = iDxjokdxxww2 < 0 ? 0 : iDxjokdxxww2;
            int iBtonecajqb2 = i16 - w0.agtfadlqog.btonecajqb(jPpxfxbqfkf2);
            int i18 = iBtonecajqb2 < 0 ? 0 : iBtonecajqb2;
            if (i13 != 0 || i14 != 0 || i17 != 0 || i18 != 0) {
                int i19 = i13;
                int i23 = i14;
                int i24 = i17;
                int i25 = i18;
                return new bfopjjpdmp.iobyxmoadg(esjtqupxsv(iobyxmoadgVar.iobyxmoadg(), i19, i23, i24, i25), esjtqupxsv(iobyxmoadgVar.zoijcleaow(), i19, i23, i24, i25));
            }
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final skhdrjzrfn pmvmpeiblj(skhdrjzrfn skhdrjzrfnVar) {
        if (!skhdrjzrfnVar.agtfadlqog()) {
            return skhdrjzrfnVar;
        }
        xrmfcynszj xrmfcynszjVarCrxdokpmqz = this.f7283tzroggbefp.crxdokpmqz();
        if (!xrmfcynszjVarCrxdokpmqz.gxszxtbevo()) {
            return skhdrjzrfnVar;
        }
        long jPpxfxbqfkf = w0.ojitshcjhn.ppxfxbqfkf(x.vdvldrhtss.eablkybsjg(xrmfcynszjVarCrxdokpmqz));
        int iDxjokdxxww = w0.agtfadlqog.dxjokdxxww(jPpxfxbqfkf);
        if (iDxjokdxxww < 0) {
            iDxjokdxxww = 0;
        }
        int iBtonecajqb = w0.agtfadlqog.btonecajqb(jPpxfxbqfkf);
        if (iBtonecajqb < 0) {
            iBtonecajqb = 0;
        }
        long jIobyxmoadg = x.vdvldrhtss.wkgbmnqykc(xrmfcynszjVarCrxdokpmqz).iobyxmoadg();
        int i13 = (int) (jIobyxmoadg >> 32);
        int i14 = (int) (jIobyxmoadg & 4294967295L);
        long jIobyxmoadg2 = xrmfcynszjVarCrxdokpmqz.iobyxmoadg();
        long jPpxfxbqfkf2 = w0.ojitshcjhn.ppxfxbqfkf(xrmfcynszjVarCrxdokpmqz.opjhrmiecq(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits((int) (jIobyxmoadg2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jIobyxmoadg2 >> 32))) << 32))));
        int iDxjokdxxww2 = i13 - w0.agtfadlqog.dxjokdxxww(jPpxfxbqfkf2);
        if (iDxjokdxxww2 < 0) {
            iDxjokdxxww2 = 0;
        }
        int iBtonecajqb2 = i14 - w0.agtfadlqog.btonecajqb(jPpxfxbqfkf2);
        int i15 = iBtonecajqb2 < 0 ? 0 : iBtonecajqb2;
        return (iDxjokdxxww == 0 && iBtonecajqb == 0 && iDxjokdxxww2 == 0 && i15 == 0) ? skhdrjzrfnVar : skhdrjzrfnVar.ojitshcjhn(iDxjokdxxww, iBtonecajqb, iDxjokdxxww2, i15);
    }

    @Override // v1.lmojexxdyd
    public void agtfadlqog(View view, int i13, int i14, int i15, int i16, int i17) {
        if (isNestedScrollingEnabled()) {
            s.zoijcleaow zoijcleaowVar = this.f7287yggfygwlhe;
            float fLqeggnwhkg = androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i13);
            long jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i14))) & 4294967295L) | (Float.floatToRawIntBits(fLqeggnwhkg) << 32));
            float fLqeggnwhkg2 = androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i15);
            zoijcleaowVar.zoijcleaow(jEablkybsjg, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i16))) & 4294967295L) | (Float.floatToRawIntBits(fLqeggnwhkg2) << 32)), androidx.compose.ui.viewinterop.wkgbmnqykc.dxjokdxxww(i17));
        }
    }

    @Override // v1.lmojexxdyd
    public void btonecajqb(View view, int i13) {
        this.f7282stevsuqkhv.eablkybsjg(view, i13);
    }

    @Override // v1.lmojexxdyd
    public void dxjokdxxww(View view, View view2, int i13, int i14) {
        this.f7282stevsuqkhv.ppxfxbqfkf(view, view2, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f7266cllcsxoeiz);
        int[] iArr = this.f7266cllcsxoeiz;
        int i13 = iArr[0];
        region.op(i13, iArr[1], i13 + getWidth(), this.f7266cllcsxoeiz[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final w0.wkgbmnqykc getDensity() {
        return this.f7265cdpycssgdh;
    }

    public final View getInteropView() {
        return this.f7276jyumaefscl;
    }

    public final z.pkzmftpjix getLayoutNode() {
        return this.f7283tzroggbefp;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f7276jyumaefscl.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.lifecycle.vdvldrhtss getLifecycleOwner() {
        return this.f7272iozdgvuglv;
    }

    public final androidx.compose.ui.wkgbmnqykc getModifier() {
        return this.f7290zynmafqrjb;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7282stevsuqkhv.iobyxmoadg();
    }

    public final tg.draadjrbmk getOnDensityChanged$ui_release() {
        return this.f7286yadqdtsiqt;
    }

    public final tg.draadjrbmk getOnModifierChanged$ui_release() {
        return this.f7273istkbnxepw;
    }

    public final tg.draadjrbmk getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f7271hkdspvbjdz;
    }

    public final tg.iobyxmoadg getRelease() {
        return this.f7281pmvmpeiblj;
    }

    public final tg.iobyxmoadg getReset() {
        return this.f7278lereixgezr;
    }

    public final q5.dxjokdxxww getSavedStateRegistryOwner() {
        return this.f7279lmojexxdyd;
    }

    public final tg.iobyxmoadg getUpdate() {
        return this.f7267cqumvgiudr;
    }

    public final View getView() {
        return this.f7276jyumaefscl;
    }

    @Override // v1.lmojexxdyd
    public void gtknphoqwx(View view, int i13, int i14, int[] iArr, int i15) {
        if (isNestedScrollingEnabled()) {
            s.zoijcleaow zoijcleaowVar = this.f7287yggfygwlhe;
            float fLqeggnwhkg = androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i13);
            long jWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i14))) & 4294967295L) | (Float.floatToRawIntBits(fLqeggnwhkg) << 32)), androidx.compose.ui.viewinterop.wkgbmnqykc.dxjokdxxww(i15));
            iArr[0] = b.gxszxtbevo(Float.intBitsToFloat((int) (jWkgbmnqykc >> 32)));
            iArr[1] = b.gxszxtbevo(Float.intBitsToFloat((int) (jWkgbmnqykc & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        zynmafqrjb();
        return null;
    }

    @Override // v1.pkzmftpjix
    public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
        this.f7280pkzmftpjix = new skhdrjzrfn(skhdrjzrfnVar);
        return pmvmpeiblj(skhdrjzrfnVar);
    }

    public final void iozdgvuglv() {
        int i13;
        int i14 = this.f7268dsvhmnatus;
        if (i14 == Integer.MIN_VALUE || (i13 = this.f7285wypolnanlu) == Integer.MIN_VALUE) {
            return;
        }
        measure(i14, i13);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f7276jyumaefscl.isNestedScrollingEnabled();
    }

    @Override // z.iyctptxqzt
    public boolean j() {
        return isAttachedToWindow();
    }

    @Override // androidx.compose.runtime.dxjokdxxww
    public void nufgyqmvbu() {
        this.f7278lereixgezr.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7270hcddaimhww.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        zynmafqrjb();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().iobyxmoadg(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.f7276jyumaefscl.layout(0, 0, i15 - i13, i16 - i14);
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        if (this.f7276jyumaefscl.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
            return;
        }
        if (this.f7276jyumaefscl.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f7276jyumaefscl.measure(i13, i14);
        setMeasuredDimension(this.f7276jyumaefscl.getMeasuredWidth(), this.f7276jyumaefscl.getMeasuredHeight());
        this.f7268dsvhmnatus = i13;
        this.f7285wypolnanlu = i14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        pj.gtknphoqwx.wkgbmnqykc(this.f7287yggfygwlhe.eablkybsjg(), null, null, new draadjrbmk(z13, this, lereixgezr.iobyxmoadg(androidx.compose.ui.viewinterop.wkgbmnqykc.nufgyqmvbu(f13), androidx.compose.ui.viewinterop.wkgbmnqykc.nufgyqmvbu(f14)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        pj.gtknphoqwx.wkgbmnqykc(this.f7287yggfygwlhe.eablkybsjg(), null, null, new wflxmlrfwp(lereixgezr.iobyxmoadg(androidx.compose.ui.viewinterop.wkgbmnqykc.nufgyqmvbu(f13), androidx.compose.ui.viewinterop.wkgbmnqykc.nufgyqmvbu(f14)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z13) {
        tg.draadjrbmk draadjrbmkVar = this.f7271hkdspvbjdz;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(Boolean.valueOf(z13));
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // v1.lmojexxdyd
    public boolean rgvfuqvkyq(View view, View view2, int i13, int i14) {
        return ((i13 & 2) == 0 && (i13 & 1) == 0) ? false : true;
    }

    public final void setDensity(w0.wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar != this.f7265cdpycssgdh) {
            this.f7265cdpycssgdh = wkgbmnqykcVar;
            tg.draadjrbmk draadjrbmkVar = this.f7286yadqdtsiqt;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(wkgbmnqykcVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        if (vdvldrhtssVar != this.f7272iozdgvuglv) {
            this.f7272iozdgvuglv = vdvldrhtssVar;
            vipkmwdibw.zoijcleaow(this, vdvldrhtssVar);
        }
    }

    public final void setModifier(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar != this.f7290zynmafqrjb) {
            this.f7290zynmafqrjb = wkgbmnqykcVar;
            tg.draadjrbmk draadjrbmkVar = this.f7273istkbnxepw;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(wkgbmnqykcVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(tg.draadjrbmk draadjrbmkVar) {
        this.f7286yadqdtsiqt = draadjrbmkVar;
    }

    public final void setOnModifierChanged$ui_release(tg.draadjrbmk draadjrbmkVar) {
        this.f7273istkbnxepw = draadjrbmkVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(tg.draadjrbmk draadjrbmkVar) {
        this.f7271hkdspvbjdz = draadjrbmkVar;
    }

    protected final void setRelease(tg.iobyxmoadg iobyxmoadgVar) {
        this.f7281pmvmpeiblj = iobyxmoadgVar;
    }

    protected final void setReset(tg.iobyxmoadg iobyxmoadgVar) {
        this.f7278lereixgezr = iobyxmoadgVar;
    }

    public final void setSavedStateRegistryOwner(q5.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar != this.f7279lmojexxdyd) {
            this.f7279lmojexxdyd = dxjokdxxwwVar;
            q5.wflxmlrfwp.zoijcleaow(this, dxjokdxxwwVar);
        }
    }

    protected final void setUpdate(tg.iobyxmoadg iobyxmoadgVar) {
        this.f7267cqumvgiudr = iobyxmoadgVar;
        this.f7269esjtqupxsv = true;
        this.f7270hcddaimhww.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // v1.wwaezpbzkn
    public void wflxmlrfwp(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            s.zoijcleaow zoijcleaowVar = this.f7287yggfygwlhe;
            float fLqeggnwhkg = androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i13);
            long jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i14))) & 4294967295L) | (Float.floatToRawIntBits(fLqeggnwhkg) << 32));
            float fLqeggnwhkg2 = androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i15);
            long jZoijcleaow = zoijcleaowVar.zoijcleaow(jEablkybsjg, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.wkgbmnqykc.lqeggnwhkg(i16))) & 4294967295L) | (Float.floatToRawIntBits(fLqeggnwhkg2) << 32)), androidx.compose.ui.viewinterop.wkgbmnqykc.dxjokdxxww(i17));
            iArr[0] = b.gxszxtbevo(Float.intBitsToFloat((int) (jZoijcleaow >> 32)));
            iArr[1] = b.gxszxtbevo(Float.intBitsToFloat((int) (jZoijcleaow & 4294967295L)));
        }
    }

    public void yadqdtsiqt() {
        if (this.f7276jyumaefscl.getParent() != this) {
            addView(this.f7276jyumaefscl);
        } else {
            this.f7278lereixgezr.invoke();
        }
    }

    @Override // androidx.compose.runtime.dxjokdxxww
    public void zoijcleaow() {
        this.f7281pmvmpeiblj.invoke();
    }

    public final void zynmafqrjb() {
        if (!this.f7277kegysxyocb) {
            this.f7283tzroggbefp.ixidwrxhsl();
            return;
        }
        View view = this.f7276jyumaefscl;
        final tg.iobyxmoadg iobyxmoadgVar = this.f7275jpowsppfya;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                zoijcleaow.istkbnxepw(iobyxmoadgVar);
            }
        });
    }
}
