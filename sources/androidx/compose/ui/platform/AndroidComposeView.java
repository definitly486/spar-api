package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.v0;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements z.opjhrmiecq, f.oxmwwwfdhm, z, t.lqeggnwhkg, androidx.lifecycle.gxszxtbevo, z.oipsdeybqn {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final iobyxmoadg f6583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f6584l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Class f6585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Method f6586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Method f6587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final androidx.collection.jpowsppfya f6588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Runnable f6589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Method f6590r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6591a;

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private final n0.draadjrbmk.iobyxmoadg f6592ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private final i1 f6593auzgnhcxok;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zdlpuopuiu f6594b;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private long f6595bfopjjpdmp;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f6596c;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private lg.btonecajqb f6597cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final androidx.collection.iozdgvuglv f6598cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private View f6599cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private List f6600crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private final z.weqkydbzbr f6601czzsidtyhn;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6602d;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final h0.zoijcleaow f6603dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f6604dvvnrvtcbc;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final tg.iobyxmoadg f6605e;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f6606esjtqupxsv;

    /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
    private final androidx.collection.jpowsppfya f6607eslsurpljm;

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private MotionEvent f6608ezmngbhpjk;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ydmasvzmpa f6609f;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private final m f6610fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private final o f6611fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f6612fyldjkxazc;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6613g;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f6614grlcpdaxtj;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0.gtknphoqwx f6615h;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final w f6616hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final z.pkzmftpjix f6617hkdspvbjdz;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    private final AtomicReference f6618hszhottldk;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f6619i;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f6620igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private tg.draadjrbmk f6621ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final rhgxfdycjh f6622iozdgvuglv;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    private int f6623ipoelvxyzq;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final f.btonecajqb f6624istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f6625iwizpuwonk;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private tg.draadjrbmk f6626iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    private final p.ppxfxbqfkf f6627ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private final float[] f6628iyctptxqzt;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t.cqumvgiudr f6629j;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private final t.yadqdtsiqt f6630jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f6631jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final androidx.compose.ui.layout.gxszxtbevo f6632jpowsppfya;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private final y.gxszxtbevo f6633jrbgnlbqoe;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final z.jpowsppfya f6634jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private final b.zoijcleaow f6635jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final androidx.compose.ui.platform.cqumvgiudr f6636kegysxyocb;

    /* JADX INFO: renamed from: krqnebusok, reason: collision with root package name */
    private float f6637krqnebusok;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final g0.wkgbmnqykc f6638lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f6639lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private final float[] f6640lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private final p0.sopmlzcsov f6641lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final androidx.compose.ui.platform.btonecajqb f6642mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private final androidx.compose.ui.platform.draadjrbmk f6643metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    private final o.iobyxmoadg f6644mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final h.auzgnhcxok f6645ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private boolean f6646nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private final z.ulzqkzuiru f6647oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private final b.iobyxmoadg f6648okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private final int[] f6649opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final h.rlfsiqarku f6650pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final EmptySemanticsElement f6651pmvmpeiblj;

    /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
    private long f6652rhgxfdycjh;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f6653ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private final androidx.compose.ui.platform.gtknphoqwx f6654rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private boolean f6655roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private w0.zoijcleaow f6656sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f6657skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final List f6658sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final g0.iwizpuwonk f6659stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private long f6660tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private c.zoijcleaow f6661tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f6662uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private final b.ojitshcjhn f6663ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f6664uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private final t.nufgyqmvbu f6665vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private final float[] f6666weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    private final p0.ntlheqmsrt f6667wizcaqwiak;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final androidx.compose.ui.wkgbmnqykc f6668wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final z.uawqvzlxes f6669wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f6670xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final AndroidDragAndDropManager f6671yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private iwxlajgraz f6672ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private sopmlzcsov f6673yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f6674yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final androidx.compose.ui.wkgbmnqykc f6675ylkuphrtab;

    /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
    private final a0 f6676yzdjzghtvl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f6677zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private long f6678zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private boolean f6679zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final AndroidComposeView$bringIntoViewNode$1 f6680zynmafqrjb;

    static final class agtfadlqog extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        agtfadlqog() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            return w0.oxmwwwfdhm.zoijcleaow(iobyxmoadg());
        }

        public final long iobyxmoadg() {
            return ribwqtqdhb.wkgbmnqykc(AndroidComposeView.this);
        }
    }

    static final class btonecajqb extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f6683zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar) {
            super(1);
            this.f6683zdlpuopuiu = hkdspvbjdzVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f6683zdlpuopuiu.f60015zdlpuopuiu = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    static final class cqumvgiudr extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        cqumvgiudr() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final hkdspvbjdz invoke(pj.cllcsxoeiz cllcsxoeizVar) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new hkdspvbjdz(androidComposeView, androidComposeView.getTextInputService(), cllcsxoeizVar);
        }
    }

    static final class draadjrbmk extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MotionEvent f6685yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(MotionEvent motionEvent) {
            super(0);
            this.f6685yggfygwlhe = motionEvent;
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.f6685yggfygwlhe));
        }
    }

    /* synthetic */ class dxjokdxxww extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {
        dxjokdxxww(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
            return iobyxmoadg(null, ((g.gtknphoqwx) obj2).ojitshcjhn(), (tg.draadjrbmk) obj3);
        }

        public final Boolean iobyxmoadg(d.lqeggnwhkg lqeggnwhkgVar, long j13, tg.draadjrbmk draadjrbmkVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).l(lqeggnwhkgVar, j13, draadjrbmkVar));
        }
    }

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f6687zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Configuration) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Configuration configuration) {
        }
    }

    static final class esjtqupxsv extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        esjtqupxsv() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final zoijcleaow invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    static final class gtknphoqwx extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gtknphoqwx f6689zdlpuopuiu = new gtknphoqwx();

        gtknphoqwx() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    /* synthetic */ class gxszxtbevo extends kotlin.jvm.internal.vdvldrhtss implements tg.iobyxmoadg {
        gxszxtbevo(Object obj) {
            super(0, obj, hcddaimhww.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final c0.ppxfxbqfkf invoke() {
            return hcddaimhww.lqeggnwhkg((View) this.receiver);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void dxjokdxxww(AndroidComposeView androidComposeView) {
            if (Build.VERSION.SDK_INT > 28) {
                synchronized (AndroidComposeView.f6588p) {
                    AndroidComposeView.f6588p.lereixgezr(androidComposeView);
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void eablkybsjg(AndroidComposeView androidComposeView) {
            if (Build.VERSION.SDK_INT > 28) {
                if (AndroidComposeView.f6589q == null) {
                    Runnable runnable = new Runnable() { // from class: androidx.compose.ui.platform.kcexrzcfyt
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidComposeView.iobyxmoadg.gxszxtbevo();
                        }
                    };
                    AndroidComposeView.f6589q = runnable;
                    StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                    try {
                        try {
                            if (AndroidComposeView.f6585m == null) {
                                AndroidComposeView.f6585m = Class.forName("android.os.SystemProperties");
                            }
                            if (AndroidComposeView.f6587o == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = AndroidComposeView.f6585m;
                                AndroidComposeView.f6587o = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            }
                            Method method = AndroidComposeView.f6587o;
                            if (method != null) {
                                method.invoke(null, runnable);
                            }
                        } catch (Throwable unused) {
                            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    } catch (Throwable th2) {
                        StrictMode.setVmPolicy(vmPolicy);
                        throw th2;
                    }
                }
                synchronized (AndroidComposeView.f6588p) {
                    AndroidComposeView.f6588p.agtfadlqog(androidComposeView);
                    gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void gxszxtbevo() {
            synchronized (AndroidComposeView.f6588p) {
                try {
                    int i13 = 0;
                    if (Build.VERSION.SDK_INT < 30) {
                        androidx.collection.jpowsppfya jpowsppfyaVar = AndroidComposeView.f6588p;
                        Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
                        int i14 = jpowsppfyaVar.f4344zoijcleaow;
                        while (i13 < i14) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i13];
                            boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                            androidComposeView.setShowLayoutBounds(AndroidComposeView.f6583k.nufgyqmvbu());
                            if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                androidComposeView.ageimvtcrz();
                            }
                            i13++;
                        }
                    } else {
                        androidx.collection.jpowsppfya jpowsppfyaVar2 = AndroidComposeView.f6588p;
                        Object[] objArr2 = jpowsppfyaVar2.f4343iobyxmoadg;
                        int i15 = jpowsppfyaVar2.f4344zoijcleaow;
                        while (i13 < i15) {
                            ((AndroidComposeView) objArr2[i13]).ageimvtcrz();
                            i13++;
                        }
                    }
                    gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean nufgyqmvbu() {
            try {
                if (AndroidComposeView.f6585m == null) {
                    AndroidComposeView.f6585m = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.f6586n == null) {
                    Class cls = AndroidComposeView.f6585m;
                    AndroidComposeView.f6586n = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f6586n;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }

        public final void lqeggnwhkg(ViewTreeObserver viewTreeObserver) {
            try {
                if (AndroidComposeView.f6590r == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.f6590r = declaredMethod;
                }
                Method method = AndroidComposeView.f6590r;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }

        private iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f6690jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f6692zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f6692zdlpuopuiu = obj;
            this.f6690jyumaefscl |= Integer.MIN_VALUE;
            return AndroidComposeView.this.wwaezpbzkn(null, this);
        }
    }

    static final class jyumaefscl extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        jyumaefscl() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.invoke();
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            lqeggnwhkg((tg.iobyxmoadg) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void lqeggnwhkg(final tg.iobyxmoadg iobyxmoadgVar) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                iobyxmoadgVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.zdlpuopuiu
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.jyumaefscl.btonecajqb(iobyxmoadgVar);
                    }
                });
            }
        }
    }

    static final class kcexrzcfyt extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {
        kcexrzcfyt() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            MotionEvent motionEvent = AndroidComposeView.this.f6608ezmngbhpjk;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f6652rhgxfdycjh = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.f6594b);
                }
            }
        }
    }

    static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ MotionEvent f6695yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(MotionEvent motionEvent) {
            super(0);
            this.f6695yggfygwlhe = motionEvent;
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.f6695yggfygwlhe));
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ KeyEvent f6697yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(KeyEvent keyEvent) {
            super(0);
            this.f6697yggfygwlhe = keyEvent;
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f6697yggfygwlhe));
        }
    }

    public static final class ojitshcjhn implements t.cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private t.jyumaefscl f6699iobyxmoadg = t.jyumaefscl.f109088iobyxmoadg.iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private t.jyumaefscl f6701zoijcleaow;

        ojitshcjhn() {
        }

        @Override // t.cqumvgiudr
        public void iobyxmoadg(t.jyumaefscl jyumaefsclVar) {
            if (jyumaefsclVar == null) {
                jyumaefsclVar = t.jyumaefscl.f109088iobyxmoadg.iobyxmoadg();
            }
            this.f6699iobyxmoadg = jyumaefsclVar;
            ylkuphrtab.f7141iobyxmoadg.iobyxmoadg(AndroidComposeView.this, jyumaefsclVar);
        }

        @Override // t.cqumvgiudr
        public t.jyumaefscl ppxfxbqfkf() {
            return this.f6701zoijcleaow;
        }

        @Override // t.cqumvgiudr
        public void zoijcleaow(t.jyumaefscl jyumaefsclVar) {
            this.f6701zoijcleaow = jyumaefsclVar;
        }
    }

    static final class oxmwwwfdhm extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f6702yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.ylkuphrtab f6703zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        oxmwwwfdhm(kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, int i13) {
            super(1);
            this.f6703zdlpuopuiu = ylkuphrtabVar;
            this.f6702yggfygwlhe = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f6703zdlpuopuiu.f60038zdlpuopuiu = true;
            return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6702yggfygwlhe));
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {
        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((p.iobyxmoadg) obj).dxjokdxxww());
        }

        public final Boolean iobyxmoadg(int i13) {
            boolean zRequestFocusFromTouch;
            p.iobyxmoadg.C1644iobyxmoadg c1644iobyxmoadg = p.iobyxmoadg.f75180zoijcleaow;
            if (p.iobyxmoadg.gxszxtbevo(i13, c1644iobyxmoadg.zoijcleaow())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else if (p.iobyxmoadg.gxszxtbevo(i13, c1644iobyxmoadg.iobyxmoadg())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    static final class rgvfuqvkyq extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f6705zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(int i13) {
            super(1);
            this.f6705zdlpuopuiu = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6705zdlpuopuiu));
        }
    }

    static final class vdvldrhtss extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f6706zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(int i13) {
            super(1);
            this.f6706zdlpuopuiu = i13;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6706zdlpuopuiu));
        }
    }

    static final class wflxmlrfwp extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.wkgbmnqykc f6708zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVar) {
                super(1);
                this.f6708zdlpuopuiu = wkgbmnqykcVar;
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6708zdlpuopuiu.ojitshcjhn()));
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.wkgbmnqykc f6709zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVar) {
                super(1);
                this.f6709zdlpuopuiu = wkgbmnqykcVar;
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.hkdspvbjdz(this.f6709zdlpuopuiu.ojitshcjhn()));
            }
        }

        wflxmlrfwp() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((r.zoijcleaow) obj).gxszxtbevo());
        }

        public final Boolean iobyxmoadg(KeyEvent keyEvent) {
            androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.focus.gxszxtbevo.eablkybsjg(keyEvent);
            if (wkgbmnqykcVarEablkybsjg == null || !r.ppxfxbqfkf.eablkybsjg(r.wkgbmnqykc.zoijcleaow(keyEvent), r.ppxfxbqfkf.f81321iobyxmoadg.iobyxmoadg())) {
                return Boolean.FALSE;
            }
            Integer numPpxfxbqfkf = androidx.compose.ui.focus.gxszxtbevo.ppxfxbqfkf(wkgbmnqykcVarEablkybsjg.ojitshcjhn());
            if (a.nufgyqmvbu.f65wkgbmnqykc && AndroidComposeView.this.hasFocus() && numPpxfxbqfkf != null && AndroidComposeView.this.wkgbmnqykc(wkgbmnqykcVarEablkybsjg.ojitshcjhn())) {
                return Boolean.TRUE;
            }
            g.lqeggnwhkg embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect();
            Boolean boolBtonecajqb = AndroidComposeView.this.getFocusOwner().btonecajqb(wkgbmnqykcVarEablkybsjg.ojitshcjhn(), embeddedViewFocusRect, new zoijcleaow(wkgbmnqykcVarEablkybsjg));
            if (boolBtonecajqb != null ? boolBtonecajqb.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.nufgyqmvbu.iobyxmoadg(wkgbmnqykcVarEablkybsjg.ojitshcjhn())) {
                return Boolean.FALSE;
            }
            if (numPpxfxbqfkf != null) {
                View viewDvvnrvtcbc = AndroidComposeView.this.dvvnrvtcbc(numPpxfxbqfkf.intValue());
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(viewDvvnrvtcbc, AndroidComposeView.this)) {
                    viewDvvnrvtcbc = null;
                }
                if (viewDvvnrvtcbc != null) {
                    Rect rectIobyxmoadg = embeddedViewFocusRect != null ? h.yzdjzghtvl.iobyxmoadg(embeddedViewFocusRect) : null;
                    if (rectIobyxmoadg == null) {
                        throw new IllegalStateException("Invalid rect");
                    }
                    View rootView = AndroidComposeView.this.getRootView();
                    kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) rootView;
                    viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this, rectIobyxmoadg);
                    viewGroup.offsetRectIntoDescendantCoords(viewDvvnrvtcbc, rectIobyxmoadg);
                    if (androidx.compose.ui.focus.gxszxtbevo.zoijcleaow(viewDvvnrvtcbc, numPpxfxbqfkf, rectIobyxmoadg)) {
                        return Boolean.TRUE;
                    }
                }
            }
            if (!AndroidComposeView.this.getFocusOwner().rgvfuqvkyq(false, true, false, wkgbmnqykcVarEablkybsjg.ojitshcjhn())) {
                return Boolean.TRUE;
            }
            Boolean boolBtonecajqb2 = AndroidComposeView.this.getFocusOwner().btonecajqb(wkgbmnqykcVarEablkybsjg.ojitshcjhn(), null, new iobyxmoadg(wkgbmnqykcVarEablkybsjg));
            return Boolean.valueOf(boolBtonecajqb2 != null ? boolBtonecajqb2.booleanValue() : true);
        }
    }

    public static final class wkgbmnqykc extends v1.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ z.pkzmftpjix f6710eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6711gxszxtbevo;

        wkgbmnqykc(z.pkzmftpjix pkzmftpjixVar, AndroidComposeView androidComposeView) {
            this.f6710eablkybsjg = pkzmftpjixVar;
            this.f6711gxszxtbevo = androidComposeView;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0054  */
        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            if (AndroidComposeView.this.f6636kegysxyocb.bfopjjpdmp()) {
                zdlpuopuiuVar.e(false);
            }
            z.pkzmftpjix pkzmftpjixVarAuzgnhcxok = this.f6710eablkybsjg.auzgnhcxok();
            while (true) {
                if (pkzmftpjixVarAuzgnhcxok == null) {
                    pkzmftpjixVarAuzgnhcxok = null;
                    break;
                } else if (pkzmftpjixVarAuzgnhcxok.weqkydbzbr().rgvfuqvkyq(z.rlfsiqarku.iobyxmoadg(8))) {
                    break;
                } else {
                    pkzmftpjixVarAuzgnhcxok = pkzmftpjixVarAuzgnhcxok.auzgnhcxok();
                }
            }
            Integer numValueOf = pkzmftpjixVarAuzgnhcxok != null ? Integer.valueOf(pkzmftpjixVarAuzgnhcxok.zynmafqrjb()) : null;
            if (numValueOf != null) {
                if (numValueOf.intValue() == AndroidComposeView.this.getSemanticsOwner().wkgbmnqykc().vdvldrhtss()) {
                    numValueOf = -1;
                }
            } else {
                numValueOf = -1;
            }
            zdlpuopuiuVar.fiwbwshyhd(this.f6711gxszxtbevo, numValueOf.intValue());
            int iZynmafqrjb = this.f6710eablkybsjg.zynmafqrjb();
            int iEablkybsjg = AndroidComposeView.this.f6636kegysxyocb.rlfsiqarku().eablkybsjg(iZynmafqrjb, -1);
            if (iEablkybsjg != -1) {
                View viewWkgbmnqykc = k.wkgbmnqykc(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iEablkybsjg);
                if (viewWkgbmnqykc != null) {
                    zdlpuopuiuVar.b(viewWkgbmnqykc);
                } else {
                    zdlpuopuiuVar.c(this.f6711gxszxtbevo, iEablkybsjg);
                }
                AndroidComposeView.this.weqkydbzbr(iZynmafqrjb, zdlpuopuiuVar.f(), AndroidComposeView.this.f6636kegysxyocb.xrmfcynszj());
            }
            int iEablkybsjg2 = AndroidComposeView.this.f6636kegysxyocb.metgxyhuhe().eablkybsjg(iZynmafqrjb, -1);
            if (iEablkybsjg2 != -1) {
                View viewWkgbmnqykc2 = k.wkgbmnqykc(AndroidComposeView.this.getAndroidViewsHandler$ui_release(), iEablkybsjg2);
                if (viewWkgbmnqykc2 != null) {
                    zdlpuopuiuVar.krqnebusok(viewWkgbmnqykc2);
                } else {
                    zdlpuopuiuVar.a(this.f6711gxszxtbevo, iEablkybsjg2);
                }
                AndroidComposeView.this.weqkydbzbr(iZynmafqrjb, zdlpuopuiuVar.f(), AndroidComposeView.this.f6636kegysxyocb.jztzpxfvev());
            }
        }
    }

    static final class yggfygwlhe extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final yggfygwlhe f6713zdlpuopuiu = new yggfygwlhe();

        yggfygwlhe() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(v.zoijcleaow zoijcleaowVar) {
            return Boolean.FALSE;
        }
    }

    public static final class zdlpuopuiu implements Runnable {
        zdlpuopuiu() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f6608ezmngbhpjk;
            if (motionEvent != null) {
                boolean z13 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z13) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i13 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i13 = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.j(motionEvent, i13, androidComposeView.f6652rhgxfdycjh, false);
            }
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.lifecycle.vdvldrhtss f6715iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final q5.dxjokdxxww f6716zoijcleaow;

        public zoijcleaow(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, q5.dxjokdxxww dxjokdxxwwVar) {
            this.f6715iobyxmoadg = vdvldrhtssVar;
            this.f6716zoijcleaow = dxjokdxxwwVar;
        }

        public final androidx.lifecycle.vdvldrhtss iobyxmoadg() {
            return this.f6715iobyxmoadg;
        }

        public final q5.dxjokdxxww zoijcleaow() {
            return this.f6716zoijcleaow;
        }
    }

    static {
        kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
        f6583k = new iobyxmoadg(gtknphoqwxVar);
        f6588p = new androidx.collection.jpowsppfya(0, 1, gtknphoqwxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1, androidx.compose.ui.wkgbmnqykc] */
    public AndroidComposeView(Context context, lg.btonecajqb btonecajqbVar) {
        b.zoijcleaow zoijcleaowVar;
        super(context);
        g.eablkybsjg.iobyxmoadg iobyxmoadgVar = g.eablkybsjg.f35584zoijcleaow;
        this.f6677zdlpuopuiu = iobyxmoadgVar.zoijcleaow();
        int i13 = 1;
        this.f6674yggfygwlhe = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        this.f6634jyumaefscl = new z.jpowsppfya(0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        this.f6625iwizpuwonk = v0.lqeggnwhkg(w0.iobyxmoadg.iobyxmoadg(context), v0.wflxmlrfwp());
        boolean z13 = false;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        boolean z14 = a.nufgyqmvbu.f54btonecajqb && Build.VERSION.SDK_INT >= 35;
        this.f6606esjtqupxsv = z14;
        g0.wkgbmnqykc wkgbmnqykcVar = new g0.wkgbmnqykc();
        this.f6638lereixgezr = wkgbmnqykcVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(wkgbmnqykcVar);
        this.f6651pmvmpeiblj = emptySemanticsElement;
        ?? r13 = new z.ribwqtqdhb() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public boolean equals(Object other) {
                return other == this;
            }

            public int hashCode() {
                return this.f6682zoijcleaow.hashCode();
            }

            @Override // z.ribwqtqdhb
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public void draadjrbmk(yfnezrywwk node) {
                node.H0(this.f6682zoijcleaow);
            }

            @Override // z.ribwqtqdhb
            /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
            public yfnezrywwk getNode() {
                return new yfnezrywwk(this.f6682zoijcleaow);
            }
        };
        this.f6680zynmafqrjb = r13;
        this.f6624istkbnxepw = new FocusOwnerImpl(this, this);
        this.f6597cdpycssgdh = btonecajqbVar;
        this.f6671yadqdtsiqt = new AndroidDragAndDropManager(new dxjokdxxww(this));
        this.f6622iozdgvuglv = new rhgxfdycjh();
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.compose.ui.input.key.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar2, new wflxmlrfwp());
        this.f6668wwaezpbzkn = wkgbmnqykcVarIobyxmoadg;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = androidx.compose.ui.input.rotary.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar2, yggfygwlhe.f6713zdlpuopuiu);
        this.f6675ylkuphrtab = wkgbmnqykcVarIobyxmoadg2;
        this.f6650pkzmftpjix = new h.rlfsiqarku();
        this.f6616hcddaimhww = new tzroggbefp(ViewConfiguration.get(context));
        androidx.compose.ui.layout.gxszxtbevo gxszxtbevoVar = new androidx.compose.ui.layout.gxszxtbevo(this);
        this.f6632jpowsppfya = gxszxtbevoVar;
        z.pkzmftpjix pkzmftpjixVar = new z.pkzmftpjix(z13, objArr6 == true ? 1 : 0, 3, objArr4 == true ? 1 : 0);
        pkzmftpjixVar.wflxmlrfwp(androidx.compose.ui.layout.cqumvgiudr.f6472zoijcleaow);
        pkzmftpjixVar.ppxfxbqfkf(getDensity());
        pkzmftpjixVar.btonecajqb(getViewConfiguration());
        pkzmftpjixVar.agtfadlqog((a.nufgyqmvbu.f57eablkybsjg ? androidx.compose.ui.layout.wwaezpbzkn.eablkybsjg(wkgbmnqykcVar2, gxszxtbevoVar) : wkgbmnqykcVar2).eablkybsjg(emptySemanticsElement).eablkybsjg(wkgbmnqykcVarIobyxmoadg2).eablkybsjg(wkgbmnqykcVarIobyxmoadg).eablkybsjg(getFocusOwner().wflxmlrfwp()).eablkybsjg(getDragAndDropManager().wkgbmnqykc()).eablkybsjg(r13));
        this.f6617hkdspvbjdz = pkzmftpjixVar;
        this.f6598cllcsxoeiz = androidx.collection.rgvfuqvkyq.ppxfxbqfkf();
        this.f6603dsvhmnatus = new h0.zoijcleaow(m0getLayoutNodes());
        this.f6669wypolnanlu = this;
        this.f6659stevsuqkhv = new g0.iwizpuwonk(getRoot(), wkgbmnqykcVar, m0getLayoutNodes());
        androidx.compose.ui.platform.cqumvgiudr cqumvgiudrVar = new androidx.compose.ui.platform.cqumvgiudr(this);
        this.f6636kegysxyocb = cqumvgiudrVar;
        this.f6661tzroggbefp = new c.zoijcleaow(this, new gxszxtbevo(this));
        this.f6642mbcevpiqjq = new androidx.compose.ui.platform.btonecajqb(context);
        this.f6645ntlheqmsrt = h.hcddaimhww.iobyxmoadg(this);
        this.f6663ulzqkzuiru = new b.ojitshcjhn();
        this.f6658sopmlzcsov = new ArrayList();
        this.f6665vipkmwdibw = new t.nufgyqmvbu();
        this.f6630jhduphickx = new t.yadqdtsiqt(getRoot());
        this.f6621ikoacuggdj = eablkybsjg.f6687zdlpuopuiu;
        this.f6648okpsazkaxt = lrnfpwlwnk() ? new b.iobyxmoadg(this, getAutofillTree()) : null;
        if (lrnfpwlwnk()) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager == null) {
                w.iobyxmoadg.ppxfxbqfkf("Autofill service could not be located.");
                throw new KotlinNothingValueException();
            }
            zoijcleaowVar = new b.zoijcleaow(new b.yggfygwlhe(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            zoijcleaowVar = null;
        }
        this.f6635jztzpxfvev = zoijcleaowVar;
        this.f6643metgxyhuhe = new androidx.compose.ui.platform.draadjrbmk(context);
        this.f6654rlfsiqarku = new androidx.compose.ui.platform.gtknphoqwx(getClipboardManager());
        this.f6601czzsidtyhn = new z.weqkydbzbr(new jyumaefscl());
        this.f6647oipsdeybqn = new z.ulzqkzuiru(getRoot());
        long j13 = Integer.MAX_VALUE;
        this.f6595bfopjjpdmp = w0.agtfadlqog.wkgbmnqykc((j13 & 4294967295L) | (j13 << 32));
        this.f6649opjhrmiecq = new int[]{0, 0};
        float[] fArrPpxfxbqfkf = h.hszhottldk.ppxfxbqfkf(null, 1, null);
        this.f6628iyctptxqzt = fArrPpxfxbqfkf;
        this.f6666weqkydbzbr = h.hszhottldk.ppxfxbqfkf(null, 1, null);
        this.f6640lrnfpwlwnk = h.hszhottldk.ppxfxbqfkf(null, 1, null);
        this.f6678zeieaojujs = -1L;
        this.f6660tbqsvytpvh = iobyxmoadgVar.iobyxmoadg();
        this.f6655roivzttewh = true;
        this.f6662uawqvzlxes = c1.ppxfxbqfkf(null, null, 2, null);
        this.f6593auzgnhcxok = v0.eablkybsjg(new esjtqupxsv());
        this.f6604dvvnrvtcbc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.agtfadlqog
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.lxfrhoxuzk(this.f6763zdlpuopuiu);
            }
        };
        this.f6657skhdrjzrfn = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.ojitshcjhn
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.g(this.f7024iobyxmoadg);
            }
        };
        this.f6620igdgnonuha = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.rgvfuqvkyq
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z15) {
                AndroidComposeView.m(this.f7038zdlpuopuiu, z15);
            }
        };
        p0.sopmlzcsov sopmlzcsovVar = new p0.sopmlzcsov(getView(), this);
        this.f6641lxfrhoxuzk = sopmlzcsovVar;
        this.f6667wizcaqwiak = new p0.ntlheqmsrt((p0.jpowsppfya) hcddaimhww.nufgyqmvbu().invoke(sopmlzcsovVar));
        this.f6618hszhottldk = a.agtfadlqog.iobyxmoadg();
        this.f6610fiwbwshyhd = new tbqsvytpvh(getTextInputService());
        this.f6592ageimvtcrz = new jpowsppfya(context);
        this.f6612fyldjkxazc = v0.lqeggnwhkg(n0.kcexrzcfyt.iobyxmoadg(context), v0.wflxmlrfwp());
        this.f6623ipoelvxyzq = igdgnonuha(context.getResources().getConfiguration());
        w0.zdlpuopuiu zdlpuopuiuVarGxszxtbevo = androidx.compose.ui.focus.gxszxtbevo.gxszxtbevo(context.getResources().getConfiguration().getLayoutDirection());
        this.f6614grlcpdaxtj = c1.ppxfxbqfkf(zdlpuopuiuVarGxszxtbevo == null ? w0.zdlpuopuiu.Ltr : zdlpuopuiuVarGxszxtbevo, null, 2, null);
        this.f6644mhtqkkgtqm = new o.ppxfxbqfkf(this);
        this.f6627ixidwrxhsl = new p.ppxfxbqfkf(isInTouchMode() ? p.iobyxmoadg.f75180zoijcleaow.zoijcleaow() : p.iobyxmoadg.f75180zoijcleaow.iobyxmoadg(), new ppxfxbqfkf(), objArr3 == true ? 1 : 0);
        this.f6633jrbgnlbqoe = new y.gxszxtbevo(this);
        this.f6611fmlbqenlif = new cllcsxoeiz(this);
        this.f6676yzdjzghtvl = new a0();
        this.f6607eslsurpljm = new androidx.collection.jpowsppfya(objArr5 == true ? 1 : 0, i13, objArr2 == true ? 1 : 0);
        this.f6594b = new zdlpuopuiu();
        this.f6596c = new Runnable() { // from class: androidx.compose.ui.platform.vdvldrhtss
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.h(this.f7098zdlpuopuiu);
            }
        };
        this.f6605e = new kcexrzcfyt();
        int i14 = Build.VERSION.SDK_INT;
        this.f6609f = i14 < 29 ? new sflfametgt(fArrPpxfxbqfkf, objArr == true ? 1 : 0) : new oipsdeybqn();
        addOnAttachStateChangeListener(this.f6661tzroggbefp);
        setWillNotDraw(false);
        setFocusable(true);
        pkzmftpjix.f7029iobyxmoadg.iobyxmoadg(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        v1.jhduphickx.oipsdeybqn(this, cqumvgiudrVar);
        tg.draadjrbmk draadjrbmkVarIobyxmoadg = z.f7145eablkybsjg.iobyxmoadg();
        if (draadjrbmkVarIobyxmoadg != null) {
            draadjrbmkVarIobyxmoadg.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().cqumvgiudr(this);
        if (i14 >= 29) {
            zynmafqrjb.f7201iobyxmoadg.iobyxmoadg(this);
        }
        if (z14) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(a.gtknphoqwx.hide_in_inspector_tag, Boolean.TRUE);
            this.f6599cqumvgiudr = view;
            addView(view);
        }
        this.f6615h = i14 >= 31 ? new f0.gtknphoqwx() : null;
        this.f6629j = new ojitshcjhn();
    }

    private final void auzgnhcxok() {
        if (this.f6653ribwqtqdhb) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f6653ribwqtqdhb = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(tg.iobyxmoadg iobyxmoadgVar) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        try {
            iobyxmoadgVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View dvvnrvtcbc(int i13) {
        skhdrjzrfn skhdrjzrfnVarIobyxmoadg = skhdrjzrfn.f7064gxszxtbevo.iobyxmoadg();
        View viewWkgbmnqykc = this;
        while (viewWkgbmnqykc != null) {
            View rootView = getRootView();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewWkgbmnqykc = skhdrjzrfnVarIobyxmoadg.wkgbmnqykc((ViewGroup) rootView, viewWkgbmnqykc, i13);
            if (viewWkgbmnqykc != null && !hcddaimhww.eablkybsjg(this, viewWkgbmnqykc)) {
                return viewWkgbmnqykc;
            }
        }
        return null;
    }

    private final void e(z.pkzmftpjix pkzmftpjixVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (pkzmftpjixVar != null) {
            while (pkzmftpjixVar != null && pkzmftpjixVar.oipsdeybqn() == z.pkzmftpjix.lqeggnwhkg.InMeasureBlock && tbqsvytpvh(pkzmftpjixVar)) {
                pkzmftpjixVar = pkzmftpjixVar.auzgnhcxok();
            }
            if (pkzmftpjixVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void eslsurpljm(MotionEvent motionEvent) {
        this.f6678zeieaojujs = AnimationUtils.currentAnimationTimeMillis();
        krqnebusok();
        float[] fArr = this.f6666weqkydbzbr;
        float x13 = motionEvent.getX();
        long jGxszxtbevo = h.hszhottldk.gxszxtbevo(fArr, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x13) << 32)));
        this.f6660tbqsvytpvh = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jGxszxtbevo >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jGxszxtbevo & 4294967295L)))) & 4294967295L));
    }

    static /* synthetic */ void f(AndroidComposeView androidComposeView, z.pkzmftpjix pkzmftpjixVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            pkzmftpjixVar = null;
        }
        androidComposeView.e(pkzmftpjixVar);
    }

    private final boolean fiwbwshyhd(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final boolean fmlbqenlif(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f6608ezmngbhpjk) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final void fyldjkxazc(z.pkzmftpjix pkzmftpjixVar) {
        pkzmftpjixVar.jrbgnlbqoe();
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarFiwbwshyhd = pkzmftpjixVar.fiwbwshyhd();
        Object[] objArr = ppxfxbqfkfVarFiwbwshyhd.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVarFiwbwshyhd.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            fyldjkxazc((z.pkzmftpjix) objArr[i13]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AndroidComposeView androidComposeView) {
        androidComposeView.n();
    }

    @gg.eablkybsjg
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @gg.eablkybsjg
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zoijcleaow get_viewTreeOwners() {
        return (zoijcleaow) this.f6662uawqvzlxes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AndroidComposeView androidComposeView) {
        androidComposeView.f6602d = false;
        MotionEvent motionEvent = androidComposeView.f6608ezmngbhpjk;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.i(motionEvent);
    }

    private final boolean hszhottldk(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f13 = -motionEvent.getAxisValue(26);
        return getFocusOwner().wkgbmnqykc(new v.zoijcleaow(f13 * v1.jztzpxfvev.nufgyqmvbu(viewConfiguration, getContext()), f13 * v1.jztzpxfvev.eablkybsjg(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new draadjrbmk(motionEvent));
    }

    private final int i(MotionEvent motionEvent) {
        Object obj;
        if (this.f6613g) {
            this.f6613g = false;
            this.f6622iozdgvuglv.ppxfxbqfkf(t.hkdspvbjdz.zoijcleaow(motionEvent.getMetaState()));
        }
        t.istkbnxepw istkbnxepwVarPpxfxbqfkf = this.f6665vipkmwdibw.ppxfxbqfkf(motionEvent, this);
        if (istkbnxepwVarPpxfxbqfkf == null) {
            this.f6630jhduphickx.ppxfxbqfkf();
            return t.iozdgvuglv.iobyxmoadg(false, false, false);
        }
        List listZoijcleaow = istkbnxepwVarPpxfxbqfkf.zoijcleaow();
        int size = listZoijcleaow.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i13 = size - 1;
            obj = listZoijcleaow.get(size);
            if (((t.cdpycssgdh) obj).zoijcleaow()) {
                break;
            }
            if (i13 < 0) {
                obj = null;
                break;
            }
            size = i13;
        }
        t.cdpycssgdh cdpycssgdhVar = (t.cdpycssgdh) obj;
        if (cdpycssgdhVar != null) {
            this.f6677zdlpuopuiu = cdpycssgdhVar.gxszxtbevo();
        }
        int iZoijcleaow = this.f6630jhduphickx.zoijcleaow(istkbnxepwVarPpxfxbqfkf, this, jrbgnlbqoe(motionEvent));
        istkbnxepwVarPpxfxbqfkf.ppxfxbqfkf(null);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iZoijcleaow & 1) != 0) {
            return iZoijcleaow;
        }
        this.f6665vipkmwdibw.eablkybsjg(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iZoijcleaow;
    }

    private final int igdgnonuha(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    private final void ipoelvxyzq(z.pkzmftpjix pkzmftpjixVar) {
        z.ulzqkzuiru.pkzmftpjix(this.f6647oipsdeybqn, pkzmftpjixVar, false, 2, null);
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarFiwbwshyhd = pkzmftpjixVar.fiwbwshyhd();
        Object[] objArr = ppxfxbqfkfVarFiwbwshyhd.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVarFiwbwshyhd.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            ipoelvxyzq((z.pkzmftpjix) objArr[i13]);
        }
    }

    private final boolean ixidwrxhsl(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(MotionEvent motionEvent, int i13, long j13, boolean z13) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i13 != 9 && i13 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i14 = 0; i14 < pointerCount; i14++) {
            pointerPropertiesArr[i14] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i15 = 0; i15 < pointerCount; i15++) {
            pointerCoordsArr[i15] = new MotionEvent.PointerCoords();
        }
        int i16 = 0;
        while (i16 < pointerCount) {
            int i17 = ((actionIndex < 0 || i16 < actionIndex) ? 0 : 1) + i16;
            motionEvent.getPointerProperties(i17, pointerPropertiesArr[i16]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i16];
            motionEvent.getPointerCoords(i17, pointerCoords);
            float f13 = pointerCoords.x;
            long jOxmwwwfdhm = oxmwwwfdhm(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (jOxmwwwfdhm >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jOxmwwwfdhm & 4294967295L));
            i16++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j13 : motionEvent.getDownTime(), j13, i13, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z13 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        t.istkbnxepw istkbnxepwVarPpxfxbqfkf = this.f6665vipkmwdibw.ppxfxbqfkf(motionEventObtain, this);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(istkbnxepwVarPpxfxbqfkf);
        this.f6630jhduphickx.zoijcleaow(istkbnxepwVarPpxfxbqfkf, this, true);
        motionEventObtain.recycle();
    }

    private final boolean jrbgnlbqoe(MotionEvent motionEvent) {
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        return 0.0f <= x13 && x13 <= ((float) getWidth()) && 0.0f <= y13 && y13 <= ((float) getHeight());
    }

    static /* synthetic */ void k(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i13, long j13, boolean z13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            z13 = true;
        }
        androidComposeView.j(motionEvent, i13, j13, z13);
    }

    private final void krqnebusok() {
        this.f6609f.iobyxmoadg(this, this.f6666weqkydbzbr);
        fmlbqenlif.iobyxmoadg(this.f6666weqkydbzbr, this.f6640lrnfpwlwnk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(d.lqeggnwhkg lqeggnwhkgVar, long j13, tg.draadjrbmk draadjrbmkVar) {
        Resources resources = getContext().getResources();
        return istkbnxepw.f6989iobyxmoadg.iobyxmoadg(this, lqeggnwhkgVar, new d.iobyxmoadg(w0.gxszxtbevo.iobyxmoadg(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j13, draadjrbmkVar, null));
    }

    private final boolean lrnfpwlwnk() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lxfrhoxuzk(AndroidComposeView androidComposeView) {
        androidComposeView.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AndroidComposeView androidComposeView, boolean z13) {
        androidComposeView.f6627ixidwrxhsl.zoijcleaow(z13 ? p.iobyxmoadg.f75180zoijcleaow.zoijcleaow() : p.iobyxmoadg.f75180zoijcleaow.iobyxmoadg());
    }

    private final boolean mhtqkkgtqm(MotionEvent motionEvent) {
        boolean z13 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z13) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 1; i13 < pointerCount; i13++) {
                z13 = (Float.floatToRawIntBits(motionEvent.getX(i13)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i13)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !krqnebusok.f7000iobyxmoadg.iobyxmoadg(motionEvent, i13));
                if (z13) {
                    break;
                }
            }
        }
        return z13;
    }

    private final void n() {
        getLocationOnScreen(this.f6649opjhrmiecq);
        long j13 = this.f6595bfopjjpdmp;
        int iDxjokdxxww = w0.agtfadlqog.dxjokdxxww(j13);
        int iBtonecajqb = w0.agtfadlqog.btonecajqb(j13);
        int[] iArr = this.f6649opjhrmiecq;
        boolean z13 = false;
        int i13 = iArr[0];
        if (iDxjokdxxww != i13 || iBtonecajqb != iArr[1] || this.f6678zeieaojujs < 0) {
            this.f6595bfopjjpdmp = w0.agtfadlqog.wkgbmnqykc((((long) i13) << 32) | (((long) iArr[1]) & 4294967295L));
            if (iDxjokdxxww != Integer.MAX_VALUE && iBtonecajqb != Integer.MAX_VALUE) {
                getRoot().okpsazkaxt().jyumaefscl().l0();
                z13 = true;
            }
        }
        yzdjzghtvl();
        View rootView = this.f6619i;
        if (rootView == null) {
            rootView = getRootView();
            this.f6619i = rootView;
        }
        getRectManager().oxmwwwfdhm(this.f6595bfopjjpdmp, w0.ojitshcjhn.ppxfxbqfkf(this.f6660tbqsvytpvh), this.f6666weqkydbzbr, rootView.getWidth(), rootView.getHeight());
        this.f6647oipsdeybqn.eablkybsjg(z13);
        if (a.nufgyqmvbu.f66zoijcleaow) {
            getRectManager().wkgbmnqykc();
        }
    }

    private final void o() {
        androidx.compose.runtime.iwxlajgraz iwxlajgrazVar = this.f6622iozdgvuglv.f7041zoijcleaow;
        if (iwxlajgrazVar != null) {
            iwxlajgrazVar.setValue(w0.oxmwwwfdhm.zoijcleaow(ribwqtqdhb.wkgbmnqykc(this)));
        }
    }

    private final long rhgxfdycjh(int i13, int i14) {
        return gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(i14) | gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(i13) << 32));
    }

    private final void roivzttewh(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).hcddaimhww();
            } else if (childAt instanceof ViewGroup) {
                roivzttewh((ViewGroup) childAt);
            }
        }
    }

    private void setDensity(w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f6625iwizpuwonk.setValue(wkgbmnqykcVar);
    }

    private void setFontFamilyResolver(n0.wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        this.f6612fyldjkxazc.setValue(zoijcleaowVar);
    }

    private void setLayoutDirection(w0.zdlpuopuiu zdlpuopuiuVar) {
        this.f6614grlcpdaxtj.setValue(zdlpuopuiuVar);
    }

    private final void set_viewTreeOwners(zoijcleaow zoijcleaowVar) {
        this.f6662uawqvzlxes.setValue(zoijcleaowVar);
    }

    private final View skhdrjzrfn(int i13, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(declaredMethod.invoke(view, null), Integer.valueOf(i13))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View viewSkhdrjzrfn = skhdrjzrfn(i13, viewGroup.getChildAt(i14));
                    if (viewSkhdrjzrfn != null) {
                        return viewSkhdrjzrfn;
                    }
                }
            }
        }
        return null;
    }

    private final boolean tbqsvytpvh(z.pkzmftpjix pkzmftpjixVar) {
        z.pkzmftpjix pkzmftpjixVarAuzgnhcxok;
        return this.f6679zfvoamnweg || !((pkzmftpjixVarAuzgnhcxok = pkzmftpjixVar.auzgnhcxok()) == null || pkzmftpjixVarAuzgnhcxok.ulzqkzuiru());
    }

    private final long uawqvzlxes(int i13) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            return rhgxfdycjh(0, size);
        }
        if (mode == 0) {
            return rhgxfdycjh(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return rhgxfdycjh(size, size);
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr(int i13, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iEablkybsjg;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, this.f6636kegysxyocb.xrmfcynszj())) {
            int iEablkybsjg2 = this.f6636kegysxyocb.rlfsiqarku().eablkybsjg(i13, -1);
            if (iEablkybsjg2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iEablkybsjg2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, this.f6636kegysxyocb.jztzpxfvev()) || (iEablkybsjg = this.f6636kegysxyocb.metgxyhuhe().eablkybsjg(i13, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iEablkybsjg);
    }

    private final int wizcaqwiak(MotionEvent motionEvent) {
        removeCallbacks(this.f6594b);
        try {
            eslsurpljm(motionEvent);
            this.f6646nuxfzjnpeb = true;
            ppxfxbqfkf(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f6608ezmngbhpjk;
                boolean z13 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && fiwbwshyhd(motionEvent, motionEvent2)) {
                    if (ixidwrxhsl(motionEvent2)) {
                        this.f6630jhduphickx.ppxfxbqfkf();
                    } else if (motionEvent2.getActionMasked() != 10 && z13) {
                        k(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                boolean z14 = motionEvent.getToolType(0) == 3;
                if (!z13 && z14 && actionMasked != 3 && actionMasked != 9 && jrbgnlbqoe(motionEvent)) {
                    k(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f6608ezmngbhpjk;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f6608ezmngbhpjk;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.f6665vipkmwdibw.eablkybsjg(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f6608ezmngbhpjk;
                        float x13 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f6608ezmngbhpjk;
                        boolean z15 = (x13 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f6608ezmngbhpjk;
                        boolean z16 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z15 || z16) {
                            if (pointerId >= 0) {
                                this.f6665vipkmwdibw.eablkybsjg(pointerId);
                            }
                            this.f6630jhduphickx.iobyxmoadg();
                        }
                    }
                }
                this.f6608ezmngbhpjk = MotionEvent.obtainNoHistory(motionEvent);
                int i13 = i(motionEvent);
                Trace.endSection();
                this.f6646nuxfzjnpeb = false;
                return i13;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f6646nuxfzjnpeb = false;
            throw th3;
        }
    }

    private final void yzdjzghtvl() {
        if (this.f6646nuxfzjnpeb) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f6678zeieaojujs) {
            this.f6678zeieaojujs = jCurrentAnimationTimeMillis;
            krqnebusok();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f6649opjhrmiecq);
            int[] iArr = this.f6649opjhrmiecq;
            float f13 = iArr[0];
            float f14 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f6649opjhrmiecq;
            this.f6660tbqsvytpvh = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13 - iArr2[0])) << 32) | (((long) Float.floatToRawIntBits(f14 - iArr2[1])) & 4294967295L));
        }
    }

    public final boolean a(z.bfopjjpdmp bfopjjpdmpVar) {
        this.f6676yzdjzghtvl.ppxfxbqfkf(bfopjjpdmpVar);
        this.f6658sopmlzcsov.remove(bfopjjpdmpVar);
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    public void ageimvtcrz() {
        fyldjkxazc(getRoot());
    }

    @Override // z.opjhrmiecq
    public void agtfadlqog(long j13) {
        f6583k.lqeggnwhkg(getViewTreeObserver());
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        b.zoijcleaow zoijcleaowVar;
        if (lrnfpwlwnk()) {
            if (a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
                zoijcleaowVar.gtknphoqwx(sparseArray);
            }
            b.iobyxmoadg iobyxmoadgVar = this.f6648okpsazkaxt;
            if (iobyxmoadgVar != null) {
                b.wkgbmnqykc.iobyxmoadg(iobyxmoadgVar, sparseArray);
            }
        }
    }

    public final void b(androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar) {
        getAndroidViewsHandler$ui_release().removeViewInLayout(zoijcleaowVar);
        HashMap<z.pkzmftpjix, androidx.compose.ui.viewinterop.zoijcleaow> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        kotlin.jvm.internal.mbcevpiqjq.ppxfxbqfkf(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(zoijcleaowVar));
        zoijcleaowVar.setImportantForAccessibility(0);
    }

    @Override // z.opjhrmiecq
    public void btonecajqb(z.pkzmftpjix pkzmftpjixVar) {
        this.f6636kegysxyocb.lrnfpwlwnk(pkzmftpjixVar);
        this.f6661tzroggbefp.iwizpuwonk();
    }

    public final void c() {
        this.f6670xrmfcynszj = true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i13) {
        return this.f6636kegysxyocb.stevsuqkhv(false, i13, this.f6677zdlpuopuiu);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i13) {
        return this.f6636kegysxyocb.stevsuqkhv(true, i13, this.f6677zdlpuopuiu);
    }

    @Override // z.opjhrmiecq
    public void cdpycssgdh(float f13) {
        if (this.f6606esjtqupxsv) {
            if (f13 > 0.0f) {
                if (Float.isNaN(this.f6637krqnebusok) || f13 > this.f6637krqnebusok) {
                    this.f6637krqnebusok = f13;
                    return;
                }
                return;
            }
            if (f13 < 0.0f) {
                if (Float.isNaN(this.f6591a) || f13 < this.f6591a) {
                    this.f6591a = f13;
                }
            }
        }
    }

    @Override // z.opjhrmiecq
    public void cllcsxoeiz(tg.iobyxmoadg iobyxmoadgVar) {
        if (this.f6607eslsurpljm.iobyxmoadg(iobyxmoadgVar)) {
            return;
        }
        this.f6607eslsurpljm.agtfadlqog(iobyxmoadgVar);
    }

    @Override // z.opjhrmiecq
    public void cqumvgiudr(z.pkzmftpjix pkzmftpjixVar, boolean z13) {
        this.f6647oipsdeybqn.gtknphoqwx(pkzmftpjixVar, z13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            fyldjkxazc(getRoot());
        }
        View view = null;
        z.opjhrmiecq.lereixgezr(this, false, 1, null);
        androidx.compose.runtime.snapshots.lqeggnwhkg.f6010eablkybsjg.lqeggnwhkg();
        this.f6631jlmebxxoox = true;
        h.rlfsiqarku rlfsiqarkuVar = this.f6650pkzmftpjix;
        Canvas canvasIobyxmoadg = rlfsiqarkuVar.iobyxmoadg().iobyxmoadg();
        rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvas);
        getRoot().ylkuphrtab(rlfsiqarkuVar.iobyxmoadg(), null);
        rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasIobyxmoadg);
        if (!this.f6658sopmlzcsov.isEmpty()) {
            int size = this.f6658sopmlzcsov.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((z.bfopjjpdmp) this.f6658sopmlzcsov.get(i13)).draadjrbmk();
            }
        }
        if (x.f7134yggfygwlhe.iobyxmoadg()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f6658sopmlzcsov.clear();
        this.f6631jlmebxxoox = false;
        List list = this.f6600crxdokpmqz;
        if (list != null) {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
            this.f6658sopmlzcsov.addAll(list);
            list.clear();
        }
        if (this.f6606esjtqupxsv) {
            jztzpxfvev.iobyxmoadg(this, this.f6637krqnebusok);
            View view2 = this.f6599cqumvgiudr;
            if (view2 == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("frameRateCategoryView");
                view2 = null;
            }
            jztzpxfvev.iobyxmoadg(view2, this.f6591a);
            if (!Float.isNaN(this.f6591a)) {
                View view3 = this.f6599cqumvgiudr;
                if (view3 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("frameRateCategoryView");
                    view3 = null;
                }
                view3.invalidate();
                View view4 = this.f6599cqumvgiudr;
                if (view4 == null) {
                    kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("frameRateCategoryView");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.f6637krqnebusok = Float.NaN;
            this.f6591a = Float.NaN;
        }
        if (a.nufgyqmvbu.f66zoijcleaow) {
            getRectManager().wkgbmnqykc();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f6602d) {
            removeCallbacks(this.f6596c);
            if (motionEvent.getActionMasked() == 8) {
                this.f6602d = false;
            } else {
                this.f6596c.run();
            }
        }
        if (mhtqkkgtqm(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return hszhottldk(motionEvent);
            }
            return (wizcaqwiak(motionEvent) & 1) != 0;
        }
        if (!motionEvent.isFromSource(2)) {
            float x13 = motionEvent.getX();
            if (getFocusOwner().ppxfxbqfkf(new q.iobyxmoadg(g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (((long) Float.floatToRawIntBits(x13)) << 32)), motionEvent.getEventTime(), q.zoijcleaow.iobyxmoadg(motionEvent.getActionMasked()), motionEvent, null), new lqeggnwhkg(motionEvent))) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f6602d) {
            removeCallbacks(this.f6596c);
            this.f6596c.run();
        }
        if (mhtqkkgtqm(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f6636kegysxyocb.jlmebxxoox(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && jrbgnlbqoe(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f6608ezmngbhpjk;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f6608ezmngbhpjk = MotionEvent.obtainNoHistory(motionEvent);
                this.f6602d = true;
                postDelayed(this.f6596c, 8L);
                return false;
            }
        } else if (!fmlbqenlif(motionEvent)) {
            return false;
        }
        return (wizcaqwiak(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().yggfygwlhe(r.zoijcleaow.zoijcleaow(keyEvent), new nufgyqmvbu(keyEvent));
        }
        this.f6622iozdgvuglv.ppxfxbqfkf(t.hkdspvbjdz.zoijcleaow(keyEvent.getMetaState()));
        return f.btonecajqb.lqeggnwhkg(getFocusOwner(), r.zoijcleaow.zoijcleaow(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().gxszxtbevo(r.zoijcleaow.zoijcleaow(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            lereixgezr.f7001iobyxmoadg.iobyxmoadg(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f6602d) {
            removeCallbacks(this.f6596c);
            MotionEvent motionEvent2 = this.f6608ezmngbhpjk;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || fiwbwshyhd(motionEvent, motionEvent2)) {
                this.f6596c.run();
            } else {
                this.f6602d = false;
            }
        }
        if (mhtqkkgtqm(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !fmlbqenlif(motionEvent)) {
            return false;
        }
        int iWizcaqwiak = wizcaqwiak(motionEvent);
        if ((iWizcaqwiak & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iWizcaqwiak & 1) != 0;
    }

    @Override // z.opjhrmiecq
    public void draadjrbmk(z.pkzmftpjix pkzmftpjixVar, int i13) {
        b.zoijcleaow zoijcleaowVar;
        if (lrnfpwlwnk() && a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.btonecajqb(pkzmftpjixVar, i13);
        }
        getRectManager().draadjrbmk(pkzmftpjixVar, true);
    }

    @Override // z.opjhrmiecq
    public long dxjokdxxww(long j13) {
        yzdjzghtvl();
        return h.hszhottldk.gxszxtbevo(this.f6666weqkydbzbr, j13);
    }

    public final void ezmngbhpjk(z.bfopjjpdmp bfopjjpdmpVar, boolean z13) {
        if (!z13) {
            if (this.f6631jlmebxxoox) {
                return;
            }
            this.f6658sopmlzcsov.remove(bfopjjpdmpVar);
            List list = this.f6600crxdokpmqz;
            if (list != null) {
                list.remove(bfopjjpdmpVar);
                return;
            }
            return;
        }
        if (!this.f6631jlmebxxoox) {
            this.f6658sopmlzcsov.add(bfopjjpdmpVar);
            return;
        }
        List arrayList = this.f6600crxdokpmqz;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f6600crxdokpmqz = arrayList;
        }
        arrayList.add(bfopjjpdmpVar);
    }

    public final View findViewByAccessibilityIdTraversal(int i13) throws IllegalAccessException, InvocationTargetException {
        View viewSkhdrjzrfn = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i13));
                if (objInvoke instanceof View) {
                    viewSkhdrjzrfn = (View) objInvoke;
                }
            } else {
                viewSkhdrjzrfn = skhdrjzrfn(i13, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewSkhdrjzrfn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (androidx.compose.ui.focus.cqumvgiudr.wflxmlrfwp(androidx.compose.ui.focus.zdlpuopuiu.wkgbmnqykc((androidx.compose.ui.focus.FocusTargetNode) r3.f60015zdlpuopuiu), androidx.compose.ui.focus.gxszxtbevo.iobyxmoadg(r0, r6), r1, r2) != false) goto L24;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L7c
            z.ulzqkzuiru r0 = r6.f6647oipsdeybqn
            boolean r0 = r0.ojitshcjhn()
            if (r0 == 0) goto Lc
            goto L7c
        Lc:
            androidx.compose.ui.platform.skhdrjzrfn$zoijcleaow r0 = androidx.compose.ui.platform.skhdrjzrfn.f7064gxszxtbevo
            androidx.compose.ui.platform.skhdrjzrfn r0 = r0.iobyxmoadg()
            android.view.View r0 = r0.wkgbmnqykc(r6, r7, r8)
            if (r7 != r6) goto L27
            f.btonecajqb r1 = r6.getFocusOwner()
            g.lqeggnwhkg r1 = r1.getFocusRect()
            if (r1 != 0) goto L2b
            g.lqeggnwhkg r1 = androidx.compose.ui.focus.gxszxtbevo.iobyxmoadg(r7, r6)
            goto L2b
        L27:
            g.lqeggnwhkg r1 = androidx.compose.ui.focus.gxszxtbevo.iobyxmoadg(r7, r6)
        L2b:
            androidx.compose.ui.focus.wkgbmnqykc r2 = androidx.compose.ui.focus.gxszxtbevo.wkgbmnqykc(r8)
            if (r2 == 0) goto L36
            int r2 = r2.ojitshcjhn()
            goto L3c
        L36:
            androidx.compose.ui.focus.wkgbmnqykc$iobyxmoadg r2 = androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow
            int r2 = r2.iobyxmoadg()
        L3c:
            kotlin.jvm.internal.hkdspvbjdz r3 = new kotlin.jvm.internal.hkdspvbjdz
            r3.<init>()
            f.btonecajqb r4 = r6.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$btonecajqb r5 = new androidx.compose.ui.platform.AndroidComposeView$btonecajqb
            r5.<init>(r3)
            java.lang.Boolean r4 = r4.btonecajqb(r2, r1, r5)
            if (r4 != 0) goto L51
            goto L7b
        L51:
            java.lang.Object r4 = r3.f60015zdlpuopuiu
            if (r4 != 0) goto L58
            if (r0 != 0) goto L7a
            goto L7b
        L58:
            if (r0 != 0) goto L5c
        L5a:
            r7 = r6
            goto L7b
        L5c:
            boolean r4 = androidx.compose.ui.focus.nufgyqmvbu.iobyxmoadg(r2)
            if (r4 == 0) goto L67
            android.view.View r7 = super.focusSearch(r7, r8)
            goto L7b
        L67:
            java.lang.Object r7 = r3.f60015zdlpuopuiu
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            g.lqeggnwhkg r7 = androidx.compose.ui.focus.zdlpuopuiu.wkgbmnqykc(r7)
            g.lqeggnwhkg r8 = androidx.compose.ui.focus.gxszxtbevo.iobyxmoadg(r0, r6)
            boolean r7 = androidx.compose.ui.focus.cqumvgiudr.wflxmlrfwp(r7, r8, r1, r2)
            if (r7 == 0) goto L7a
            goto L5a
        L7a:
            r7 = r0
        L7b:
            return r7
        L7c:
            android.view.View r7 = super.focusSearch(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.focusSearch(android.view.View, int):android.view.View");
    }

    public final sopmlzcsov getAndroidViewsHandler$ui_release() {
        if (this.f6673yfnezrywwk == null) {
            sopmlzcsov sopmlzcsovVar = new sopmlzcsov(getContext());
            this.f6673yfnezrywwk = sopmlzcsovVar;
            addView(sopmlzcsovVar);
            requestLayout();
        }
        sopmlzcsov sopmlzcsovVar2 = this.f6673yfnezrywwk;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(sopmlzcsovVar2);
        return sopmlzcsovVar2;
    }

    @Override // z.opjhrmiecq
    public b.lqeggnwhkg getAutofill() {
        return this.f6648okpsazkaxt;
    }

    @Override // z.opjhrmiecq
    public b.agtfadlqog getAutofillManager() {
        return this.f6635jztzpxfvev;
    }

    @Override // z.opjhrmiecq
    public b.ojitshcjhn getAutofillTree() {
        return this.f6663ulzqkzuiru;
    }

    public final tg.draadjrbmk getConfigurationChangeObserver() {
        return this.f6621ikoacuggdj;
    }

    public final c.zoijcleaow getContentCaptureManager$ui_release() {
        return this.f6661tzroggbefp;
    }

    @Override // z.opjhrmiecq
    public lg.btonecajqb getCoroutineContext() {
        return this.f6597cdpycssgdh;
    }

    @Override // z.opjhrmiecq
    public w0.wkgbmnqykc getDensity() {
        return (w0.wkgbmnqykc) this.f6625iwizpuwonk.getValue();
    }

    @Override // f.oxmwwwfdhm
    public g.lqeggnwhkg getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.gxszxtbevo.iobyxmoadg(viewFindFocus, this);
        }
        return null;
    }

    @Override // z.opjhrmiecq
    public f.btonecajqb getFocusOwner() {
        return this.f6624istkbnxepw;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        g.lqeggnwhkg embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.nufgyqmvbu());
            rect.top = Math.round(embeddedViewFocusRect.gtknphoqwx());
            rect.right = Math.round(embeddedViewFocusRect.dxjokdxxww());
            rect.bottom = Math.round(embeddedViewFocusRect.eablkybsjg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getFocusOwner().btonecajqb(androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.iobyxmoadg(), null, gtknphoqwx.f6689zdlpuopuiu), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // z.opjhrmiecq
    public n0.wflxmlrfwp.zoijcleaow getFontFamilyResolver() {
        return (n0.wflxmlrfwp.zoijcleaow) this.f6612fyldjkxazc.getValue();
    }

    @Override // z.opjhrmiecq
    public n0.draadjrbmk.iobyxmoadg getFontLoader() {
        return this.f6592ageimvtcrz;
    }

    @Override // z.opjhrmiecq
    public h.auzgnhcxok getGraphicsContext() {
        return this.f6645ntlheqmsrt;
    }

    @Override // z.opjhrmiecq
    public o.iobyxmoadg getHapticFeedBack() {
        return this.f6644mhtqkkgtqm;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f6647oipsdeybqn.rgvfuqvkyq();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // z.opjhrmiecq
    public p.zoijcleaow getInputModeManager() {
        return this.f6627ixidwrxhsl;
    }

    public final androidx.compose.ui.layout.gxszxtbevo getInsetsListener() {
        return this.f6632jpowsppfya;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f6678zeieaojujs;
    }

    @Override // android.view.View, android.view.ViewParent, z.opjhrmiecq
    public w0.zdlpuopuiu getLayoutDirection() {
        return (w0.zdlpuopuiu) this.f6614grlcpdaxtj.getValue();
    }

    public long getMeasureIteration() {
        return this.f6647oipsdeybqn.kcexrzcfyt();
    }

    @Override // z.opjhrmiecq
    public y.gxszxtbevo getModifierLocalManager() {
        return this.f6633jrbgnlbqoe;
    }

    @Override // z.opjhrmiecq
    public androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg getPlacementScope() {
        return androidx.compose.ui.layout.zdlpuopuiu.zoijcleaow(this);
    }

    @Override // z.opjhrmiecq
    public t.cqumvgiudr getPointerIconService() {
        return this.f6629j;
    }

    @Override // z.opjhrmiecq
    public h0.zoijcleaow getRectManager() {
        return this.f6603dsvhmnatus;
    }

    @Override // z.opjhrmiecq
    public z.pkzmftpjix getRoot() {
        return this.f6617hkdspvbjdz;
    }

    public z.uawqvzlxes getRootForTest() {
        return this.f6669wypolnanlu;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        f0.gtknphoqwx gtknphoqwxVar;
        if (Build.VERSION.SDK_INT < 31 || (gtknphoqwxVar = this.f6615h) == null) {
            return false;
        }
        return gtknphoqwxVar.ppxfxbqfkf();
    }

    @Override // z.opjhrmiecq
    public g0.iwizpuwonk getSemanticsOwner() {
        return this.f6659stevsuqkhv;
    }

    @Override // z.opjhrmiecq
    public z.jpowsppfya getSharedDrawScope() {
        return this.f6634jyumaefscl;
    }

    @Override // z.opjhrmiecq
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? okpsazkaxt.f7025iobyxmoadg.iobyxmoadg(this) : this.f6664uwvvkdfqfp;
    }

    @Override // z.opjhrmiecq
    public z.weqkydbzbr getSnapshotObserver() {
        return this.f6601czzsidtyhn;
    }

    @Override // z.opjhrmiecq
    public m getSoftwareKeyboardController() {
        return this.f6610fiwbwshyhd;
    }

    @Override // z.opjhrmiecq
    public p0.ntlheqmsrt getTextInputService() {
        return this.f6667wizcaqwiak;
    }

    @Override // z.opjhrmiecq
    public o getTextToolbar() {
        return this.f6611fmlbqenlif;
    }

    public final z.uawqvzlxes.iobyxmoadg getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // z.opjhrmiecq
    public w getViewConfiguration() {
        return this.f6616hcddaimhww;
    }

    public final zoijcleaow getViewTreeOwners() {
        return (zoijcleaow) this.f6593auzgnhcxok.getValue();
    }

    @Override // z.opjhrmiecq
    public b0 getWindowInfo() {
        return this.f6622iozdgvuglv;
    }

    public final b.zoijcleaow get_autofillManager$ui_release() {
        return this.f6635jztzpxfvev;
    }

    public final boolean grlcpdaxtj() {
        return this.f6606esjtqupxsv;
    }

    @Override // z.opjhrmiecq
    public void gtknphoqwx(View view) {
        this.f6653ribwqtqdhb = true;
    }

    @Override // z.opjhrmiecq
    public void gxszxtbevo(z.pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14) {
        if (z13) {
            if (this.f6647oipsdeybqn.yadqdtsiqt(pkzmftpjixVar, z14)) {
                f(this, null, 1, null);
            }
        } else if (this.f6647oipsdeybqn.wwaezpbzkn(pkzmftpjixVar, z14)) {
            f(this, null, 1, null);
        }
    }

    @Override // z.opjhrmiecq
    public void hcddaimhww() {
        b.zoijcleaow zoijcleaowVar;
        if (this.f6670xrmfcynszj) {
            getSnapshotObserver().zoijcleaow();
            this.f6670xrmfcynszj = false;
        }
        sopmlzcsov sopmlzcsovVar = this.f6673yfnezrywwk;
        if (sopmlzcsovVar != null) {
            roivzttewh(sopmlzcsovVar);
        }
        if (lrnfpwlwnk() && a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.lqeggnwhkg();
        }
        while (this.f6607eslsurpljm.nufgyqmvbu() && this.f6607eslsurpljm.wkgbmnqykc(0) != null) {
            int iEablkybsjg = this.f6607eslsurpljm.eablkybsjg();
            for (int i13 = 0; i13 < iEablkybsjg; i13++) {
                tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) this.f6607eslsurpljm.wkgbmnqykc(i13);
                this.f6607eslsurpljm.iozdgvuglv(i13, null);
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.invoke();
                }
            }
            this.f6607eslsurpljm.istkbnxepw(0, iEablkybsjg);
        }
    }

    @Override // f.oxmwwwfdhm
    public boolean iobyxmoadg(androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVar, g.lqeggnwhkg lqeggnwhkgVar) {
        Integer numPpxfxbqfkf;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((wkgbmnqykcVar == null || (numPpxfxbqfkf = androidx.compose.ui.focus.gxszxtbevo.ppxfxbqfkf(wkgbmnqykcVar.ojitshcjhn())) == null) ? 130 : numPpxfxbqfkf.intValue(), lqeggnwhkgVar != null ? h.yzdjzghtvl.iobyxmoadg(lqeggnwhkgVar) : null);
    }

    @Override // z.opjhrmiecq
    public void iozdgvuglv(z.pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14, boolean z15) {
        if (z13) {
            if (this.f6647oipsdeybqn.iozdgvuglv(pkzmftpjixVar, z14) && z15) {
                e(pkzmftpjixVar);
                return;
            }
            return;
        }
        if (this.f6647oipsdeybqn.ylkuphrtab(pkzmftpjixVar, z14) && z15) {
            e(pkzmftpjixVar);
        }
    }

    @Override // z.opjhrmiecq
    public long istkbnxepw(long j13) {
        yzdjzghtvl();
        return h.hszhottldk.gxszxtbevo(this.f6640lrnfpwlwnk, j13);
    }

    @Override // z.opjhrmiecq
    public void iwizpuwonk(z.pkzmftpjix pkzmftpjixVar) {
        this.f6647oipsdeybqn.lmojexxdyd(pkzmftpjixVar);
        f(this, null, 1, null);
    }

    public final void iwxlajgraz(androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar, Canvas canvas) {
        getAndroidViewsHandler$ui_release().iobyxmoadg(zoijcleaowVar, canvas);
    }

    public final void iyctptxqzt(androidx.compose.ui.viewinterop.zoijcleaow zoijcleaowVar, z.pkzmftpjix pkzmftpjixVar) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(zoijcleaowVar, pkzmftpjixVar);
        getAndroidViewsHandler$ui_release().addView(zoijcleaowVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(pkzmftpjixVar, zoijcleaowVar);
        zoijcleaowVar.setImportantForAccessibility(1);
        v1.jhduphickx.oipsdeybqn(zoijcleaowVar, new wkgbmnqykc(pkzmftpjixVar, this));
    }

    @Override // z.opjhrmiecq
    public void jpowsppfya() {
        this.f6636kegysxyocb.zeieaojujs();
        this.f6661tzroggbefp.cqumvgiudr();
    }

    @Override // z.opjhrmiecq
    public void jyumaefscl(z.pkzmftpjix pkzmftpjixVar) {
        b.zoijcleaow zoijcleaowVar;
        m0getLayoutNodes().ojitshcjhn(pkzmftpjixVar.zynmafqrjb());
        this.f6647oipsdeybqn.lereixgezr(pkzmftpjixVar);
        c();
        if (a.nufgyqmvbu.f66zoijcleaow) {
            getRectManager().ojitshcjhn(pkzmftpjixVar);
        }
        if (lrnfpwlwnk() && a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.gxszxtbevo(pkzmftpjixVar);
        }
    }

    @Override // z.opjhrmiecq
    public void kcexrzcfyt(z.pkzmftpjix pkzmftpjixVar, long j13) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f6647oipsdeybqn.iwizpuwonk(pkzmftpjixVar, j13);
            if (!this.f6647oipsdeybqn.rgvfuqvkyq()) {
                z.ulzqkzuiru.gxszxtbevo(this.f6647oipsdeybqn, false, 1, null);
                auzgnhcxok();
            }
            if (a.nufgyqmvbu.f66zoijcleaow) {
                getRectManager().wkgbmnqykc();
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            Trace.endSection();
        }
    }

    @Override // z.opjhrmiecq
    public void lmojexxdyd(z.pkzmftpjix pkzmftpjixVar, int i13) {
        m0getLayoutNodes().ojitshcjhn(i13);
        m0getLayoutNodes().oxmwwwfdhm(pkzmftpjixVar.zynmafqrjb(), pkzmftpjixVar);
    }

    public final Object nuxfzjnpeb(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = this.f6661tzroggbefp.wkgbmnqykc(gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        androidx.lifecycle.gtknphoqwx lifecycle;
        androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg2;
        b.iobyxmoadg iobyxmoadgVar;
        super.onAttachedToWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30) {
            setShowLayoutBounds(f6583k.nufgyqmvbu());
        }
        if (a.nufgyqmvbu.f57eablkybsjg) {
            this.f6632jpowsppfya.onViewAttachedToWindow(this);
        }
        f6583k.eablkybsjg(this);
        this.f6622iozdgvuglv.eablkybsjg(hasWindowFocus());
        this.f6622iozdgvuglv.wkgbmnqykc(new agtfadlqog());
        o();
        ipoelvxyzq(getRoot());
        fyldjkxazc(getRoot());
        getSnapshotObserver().gtknphoqwx();
        if (lrnfpwlwnk() && (iobyxmoadgVar = this.f6648okpsazkaxt) != null) {
            b.wflxmlrfwp.f14882iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
        }
        androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg3 = androidx.lifecycle.vipkmwdibw.iobyxmoadg(this);
        q5.dxjokdxxww dxjokdxxwwVarIobyxmoadg = q5.wflxmlrfwp.iobyxmoadg(this);
        zoijcleaow viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.gtknphoqwx lifecycle2 = null;
        if (viewTreeOwners == null || (vdvldrhtssVarIobyxmoadg3 != null && dxjokdxxwwVarIobyxmoadg != null && (vdvldrhtssVarIobyxmoadg3 != viewTreeOwners.iobyxmoadg() || dxjokdxxwwVarIobyxmoadg != viewTreeOwners.iobyxmoadg()))) {
            if (vdvldrhtssVarIobyxmoadg3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (dxjokdxxwwVarIobyxmoadg == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (vdvldrhtssVarIobyxmoadg = viewTreeOwners.iobyxmoadg()) != null && (lifecycle = vdvldrhtssVarIobyxmoadg.getLifecycle()) != null) {
                lifecycle.wkgbmnqykc(this);
            }
            vdvldrhtssVarIobyxmoadg3.getLifecycle().iobyxmoadg(this);
            zoijcleaow zoijcleaowVar = new zoijcleaow(vdvldrhtssVarIobyxmoadg3, dxjokdxxwwVarIobyxmoadg);
            set_viewTreeOwners(zoijcleaowVar);
            tg.draadjrbmk draadjrbmkVar = this.f6626iwxlajgraz;
            if (draadjrbmkVar != null) {
                draadjrbmkVar.invoke(zoijcleaowVar);
            }
            this.f6626iwxlajgraz = null;
        }
        this.f6627ixidwrxhsl.zoijcleaow(isInTouchMode() ? p.iobyxmoadg.f75180zoijcleaow.zoijcleaow() : p.iobyxmoadg.f75180zoijcleaow.iobyxmoadg());
        zoijcleaow viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (vdvldrhtssVarIobyxmoadg2 = viewTreeOwners2.iobyxmoadg()) != null) {
            lifecycle2 = vdvldrhtssVarIobyxmoadg2.getLifecycle();
        }
        if (lifecycle2 == null) {
            w.iobyxmoadg.ppxfxbqfkf("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.iobyxmoadg(this);
        lifecycle2.iobyxmoadg(this.f6661tzroggbefp);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f6604dvvnrvtcbc);
        getViewTreeObserver().addOnScrollChangedListener(this.f6657skhdrjzrfn);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f6620igdgnonuha);
        if (i13 >= 31) {
            wwaezpbzkn.f7129iobyxmoadg.zoijcleaow(this);
        }
        b.zoijcleaow zoijcleaowVar2 = this.f6635jztzpxfvev;
        if (zoijcleaowVar2 != null) {
            getFocusOwner().zdlpuopuiu().agtfadlqog(zoijcleaowVar2);
            getSemanticsOwner().zoijcleaow().agtfadlqog(zoijcleaowVar2);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) a.agtfadlqog.ppxfxbqfkf(this.f6618hszhottldk);
        return hkdspvbjdzVar == null ? this.f6641lxfrhoxuzk.oxmwwwfdhm() : hkdspvbjdzVar.eablkybsjg();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(w0.iobyxmoadg.iobyxmoadg(getContext()));
        o();
        if (igdgnonuha(configuration) != this.f6623ipoelvxyzq) {
            this.f6623ipoelvxyzq = igdgnonuha(configuration);
            setFontFamilyResolver(n0.kcexrzcfyt.iobyxmoadg(getContext()));
        }
        this.f6621ikoacuggdj.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) a.agtfadlqog.ppxfxbqfkf(this.f6618hszhottldk);
        return hkdspvbjdzVar == null ? this.f6641lxfrhoxuzk.ojitshcjhn(editorInfo) : hkdspvbjdzVar.wkgbmnqykc(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f6661tzroggbefp.yggfygwlhe(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        b.iobyxmoadg iobyxmoadgVar;
        androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        super.onDetachedFromWindow();
        if (a.nufgyqmvbu.f57eablkybsjg) {
            this.f6632jpowsppfya.onViewDetachedFromWindow(this);
        }
        androidx.lifecycle.gtknphoqwx lifecycle = null;
        if (this.f6606esjtqupxsv) {
            View view = this.f6599cqumvgiudr;
            if (view == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        f6583k.dxjokdxxww(this);
        getSnapshotObserver().draadjrbmk();
        this.f6622iozdgvuglv.wkgbmnqykc(null);
        zoijcleaow viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (vdvldrhtssVarIobyxmoadg = viewTreeOwners.iobyxmoadg()) != null) {
            lifecycle = vdvldrhtssVarIobyxmoadg.getLifecycle();
        }
        if (lifecycle == null) {
            w.iobyxmoadg.ppxfxbqfkf("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.wkgbmnqykc(this.f6661tzroggbefp);
        lifecycle.wkgbmnqykc(this);
        if (lrnfpwlwnk() && (iobyxmoadgVar = this.f6648okpsazkaxt) != null) {
            b.wflxmlrfwp.f14882iobyxmoadg.zoijcleaow(iobyxmoadgVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f6604dvvnrvtcbc);
        getViewTreeObserver().removeOnScrollChangedListener(this.f6657skhdrjzrfn);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f6620igdgnonuha);
        if (Build.VERSION.SDK_INT >= 31) {
            wwaezpbzkn.f7129iobyxmoadg.iobyxmoadg(this);
        }
        b.zoijcleaow zoijcleaowVar = this.f6635jztzpxfvev;
        if (zoijcleaowVar != null) {
            getSemanticsOwner().zoijcleaow().lereixgezr(zoijcleaowVar);
            getFocusOwner().zdlpuopuiu().lereixgezr(zoijcleaowVar);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
        if (z13 || hasFocus()) {
            return;
        }
        getFocusOwner().kcexrzcfyt();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.f6678zeieaojujs = 0L;
        this.f6647oipsdeybqn.jyumaefscl(this.f6605e);
        this.f6656sflfametgt = null;
        n();
        if (this.f6673yfnezrywwk != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                ipoelvxyzq(getRoot());
            }
            long jUawqvzlxes = uawqvzlxes(i13);
            int iZoijcleaow = (int) gg.istkbnxepw.zoijcleaow(jUawqvzlxes >>> 32);
            int iZoijcleaow2 = (int) gg.istkbnxepw.zoijcleaow(jUawqvzlxes & 4294967295L);
            long jUawqvzlxes2 = uawqvzlxes(i14);
            long jIobyxmoadg = w0.zoijcleaow.f118283zoijcleaow.iobyxmoadg(iZoijcleaow, iZoijcleaow2, (int) gg.istkbnxepw.zoijcleaow(jUawqvzlxes2 >>> 32), (int) gg.istkbnxepw.zoijcleaow(4294967295L & jUawqvzlxes2));
            w0.zoijcleaow zoijcleaowVar = this.f6656sflfametgt;
            boolean zGxszxtbevo = false;
            if (zoijcleaowVar == null) {
                this.f6656sflfametgt = w0.zoijcleaow.iobyxmoadg(jIobyxmoadg);
                this.f6679zfvoamnweg = false;
            } else {
                if (zoijcleaowVar != null) {
                    zGxszxtbevo = w0.zoijcleaow.gxszxtbevo(zoijcleaowVar.vdvldrhtss(), jIobyxmoadg);
                }
                if (!zGxszxtbevo) {
                    this.f6679zfvoamnweg = true;
                }
            }
            this.f6647oipsdeybqn.jpowsppfya(jIobyxmoadg);
            this.f6647oipsdeybqn.cqumvgiudr();
            setMeasuredDimension(getRoot().lxfrhoxuzk(), getRoot().sopmlzcsov());
            if (this.f6673yfnezrywwk != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().lxfrhoxuzk(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().sopmlzcsov(), 1073741824));
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i13) {
        b.zoijcleaow zoijcleaowVar;
        if (!lrnfpwlwnk() || viewStructure == null) {
            return;
        }
        if (a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.draadjrbmk(viewStructure);
        }
        b.iobyxmoadg iobyxmoadgVar = this.f6648okpsazkaxt;
        if (iobyxmoadgVar != null) {
            b.wkgbmnqykc.zoijcleaow(iobyxmoadgVar, viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i13) {
        t.jyumaefscl jyumaefsclVarPpxfxbqfkf;
        int toolType = motionEvent.getToolType(i13);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (jyumaefsclVarPpxfxbqfkf = getPointerIconService().ppxfxbqfkf()) == null) ? super.onResolvePointerIcon(motionEvent, i13) : ylkuphrtab.f7141iobyxmoadg.zoijcleaow(getContext(), jyumaefsclVarPpxfxbqfkf);
    }

    @Override // androidx.lifecycle.gxszxtbevo
    public void onResume(androidx.lifecycle.vdvldrhtss vdvldrhtssVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(f6583k.nufgyqmvbu());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        if (this.f6674yggfygwlhe) {
            w0.zdlpuopuiu zdlpuopuiuVarGxszxtbevo = androidx.compose.ui.focus.gxszxtbevo.gxszxtbevo(i13);
            if (zdlpuopuiuVarGxszxtbevo == null) {
                zdlpuopuiuVarGxszxtbevo = w0.zdlpuopuiu.Ltr;
            }
            setLayoutDirection(zdlpuopuiuVarGxszxtbevo);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        f0.gtknphoqwx gtknphoqwxVar;
        if (Build.VERSION.SDK_INT < 31 || (gtknphoqwxVar = this.f6615h) == null) {
            return;
        }
        gtknphoqwxVar.wkgbmnqykc(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        c.zoijcleaow zoijcleaowVar = this.f6661tzroggbefp;
        zoijcleaowVar.lereixgezr(zoijcleaowVar, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z13) {
        boolean zNufgyqmvbu;
        this.f6622iozdgvuglv.eablkybsjg(z13);
        this.f6613g = true;
        super.onWindowFocusChanged(z13);
        if (!z13 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zNufgyqmvbu = f6583k.nufgyqmvbu())) {
            return;
        }
        setShowLayoutBounds(zNufgyqmvbu);
        ageimvtcrz();
    }

    @Override // t.dsvhmnatus
    public long oxmwwwfdhm(long j13) {
        yzdjzghtvl();
        long jGxszxtbevo = h.hszhottldk.gxszxtbevo(this.f6666weqkydbzbr, j13);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jGxszxtbevo >> 32)) + Float.intBitsToFloat((int) (this.f6660tbqsvytpvh >> 32));
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jGxszxtbevo & 4294967295L)) + Float.intBitsToFloat((int) (this.f6660tbqsvytpvh & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // z.opjhrmiecq
    public z.bfopjjpdmp pkzmftpjix(tg.rgvfuqvkyq rgvfuqvkyqVar, tg.iobyxmoadg iobyxmoadgVar, k.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar != null) {
            return new wizcaqwiak(ppxfxbqfkfVar, null, this, rgvfuqvkyqVar, iobyxmoadgVar);
        }
        z.bfopjjpdmp bfopjjpdmpVar = (z.bfopjjpdmp) this.f6676yzdjzghtvl.zoijcleaow();
        if (bfopjjpdmpVar == null) {
            return new wizcaqwiak(getGraphicsContext().zoijcleaow(), getGraphicsContext(), this, rgvfuqvkyqVar, iobyxmoadgVar);
        }
        bfopjjpdmpVar.zoijcleaow(rgvfuqvkyqVar, iobyxmoadgVar);
        return bfopjjpdmpVar;
    }

    @Override // z.oipsdeybqn
    public void pmvmpeiblj(final tg.iobyxmoadg iobyxmoadgVar) {
        Handler handler = getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new Runnable() { // from class: androidx.compose.ui.platform.oxmwwwfdhm
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.d(iobyxmoadgVar);
            }
        });
    }

    @Override // z.opjhrmiecq
    public void ppxfxbqfkf(boolean z13) {
        tg.iobyxmoadg iobyxmoadgVar;
        if (this.f6647oipsdeybqn.rgvfuqvkyq() || this.f6647oipsdeybqn.vdvldrhtss()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z13) {
                try {
                    iobyxmoadgVar = this.f6605e;
                } finally {
                    Trace.endSection();
                }
            } else {
                iobyxmoadgVar = null;
            }
            if (this.f6647oipsdeybqn.jyumaefscl(iobyxmoadgVar)) {
                requestLayout();
            }
            z.ulzqkzuiru.gxszxtbevo(this.f6647oipsdeybqn, false, 1, null);
            auzgnhcxok();
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i13, Rect rect) {
        View viewDvvnrvtcbc;
        if (!a.nufgyqmvbu.f65wkgbmnqykc) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().vdvldrhtss().wkgbmnqykc()) {
                return super.requestFocus(i13, rect);
            }
            androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.ui.focus.gxszxtbevo.wkgbmnqykc(i13);
            int iOjitshcjhn = wkgbmnqykcVarWkgbmnqykc != null ? wkgbmnqykcVarWkgbmnqykc.ojitshcjhn() : androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.zoijcleaow();
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getFocusOwner().btonecajqb(iOjitshcjhn, rect != null ? h.yzdjzghtvl.eablkybsjg(rect) : null, new rgvfuqvkyq(iOjitshcjhn)), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        if (this.f6639lmojexxdyd) {
            return false;
        }
        androidx.compose.ui.focus.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc2 = androidx.compose.ui.focus.gxszxtbevo.wkgbmnqykc(i13);
        int iOjitshcjhn2 = wkgbmnqykcVarWkgbmnqykc2 != null ? wkgbmnqykcVarWkgbmnqykc2.ojitshcjhn() : androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.zoijcleaow();
        if (hasFocus() && wkgbmnqykc(iOjitshcjhn2)) {
            return true;
        }
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar = new kotlin.jvm.internal.ylkuphrtab();
        Boolean boolBtonecajqb = getFocusOwner().btonecajqb(iOjitshcjhn2, rect != null ? h.yzdjzghtvl.eablkybsjg(rect) : null, new oxmwwwfdhm(ylkuphrtabVar, iOjitshcjhn2));
        if (boolBtonecajqb == null) {
            return false;
        }
        if (boolBtonecajqb.booleanValue()) {
            return true;
        }
        if (ylkuphrtabVar.f60038zdlpuopuiu) {
            return false;
        }
        if ((rect != null && !hasFocus() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getFocusOwner().btonecajqb(iOjitshcjhn2, null, new vdvldrhtss(iOjitshcjhn2)), Boolean.TRUE)) || (viewDvvnrvtcbc = dvvnrvtcbc(i13)) == null || viewDvvnrvtcbc == this) {
            return true;
        }
        this.f6639lmojexxdyd = true;
        boolean zRequestFocus = viewDvvnrvtcbc.requestFocus(i13);
        this.f6639lmojexxdyd = false;
        return zRequestFocus;
    }

    @Override // z.opjhrmiecq
    public void rgvfuqvkyq(z.pkzmftpjix pkzmftpjixVar) {
        m0getLayoutNodes().oxmwwwfdhm(pkzmftpjixVar.zynmafqrjb(), pkzmftpjixVar);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j13) {
        this.f6636kegysxyocb.rhgxfdycjh(j13);
    }

    public final void setConfigurationChangeObserver(tg.draadjrbmk draadjrbmkVar) {
        this.f6621ikoacuggdj = draadjrbmkVar;
    }

    public final void setContentCaptureManager$ui_release(c.zoijcleaow zoijcleaowVar) {
        this.f6661tzroggbefp = zoijcleaowVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.wkgbmnqykc$ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [ipoelvxyzq.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public void setCoroutineContext(lg.btonecajqb btonecajqbVar) {
        this.f6597cdpycssgdh = btonecajqbVar;
        z.btonecajqb btonecajqbVarGtknphoqwx = getRoot().weqkydbzbr().gtknphoqwx();
        if (btonecajqbVarGtknphoqwx instanceof t.ntlheqmsrt) {
            ((t.ntlheqmsrt) btonecajqbVarGtknphoqwx).ezmngbhpjk();
        }
        int iIobyxmoadg = z.rlfsiqarku.iobyxmoadg(16);
        if (!btonecajqbVarGtknphoqwx.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitSubtreeIf called on an unattached node");
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = btonecajqbVarGtknphoqwx.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null) {
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar, btonecajqbVarGtknphoqwx.wflxmlrfwp(), false);
        } else {
            ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarE0);
        }
        while (ppxfxbqfkfVar.draadjrbmk() != 0) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar2 = (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkfVar.draadjrbmk() - 1);
            if ((ppxfxbqfkfVar2.d0() & iIobyxmoadg) != 0) {
                for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE1 = ppxfxbqfkfVar2; ppxfxbqfkfVarE1 != null; ppxfxbqfkfVarE1 = ppxfxbqfkfVarE1.e0()) {
                    if ((ppxfxbqfkfVarE1.i0() & iIobyxmoadg) != 0) {
                        ?? Dxjokdxxww = ppxfxbqfkfVarE1;
                        ?? ppxfxbqfkfVar3 = 0;
                        while (Dxjokdxxww != 0) {
                            if (Dxjokdxxww instanceof z.tbqsvytpvh) {
                                z.tbqsvytpvh tbqsvytpvhVar = (z.tbqsvytpvh) Dxjokdxxww;
                                if (tbqsvytpvhVar instanceof t.ntlheqmsrt) {
                                    ((t.ntlheqmsrt) tbqsvytpvhVar).ezmngbhpjk();
                                }
                            } else if ((Dxjokdxxww.i0() & iIobyxmoadg) != 0 && (Dxjokdxxww instanceof z.wflxmlrfwp)) {
                                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((z.wflxmlrfwp) Dxjokdxxww).I0();
                                int i13 = 0;
                                while (ppxfxbqfkfVarI0 != null) {
                                    if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            Dxjokdxxww = Dxjokdxxww;
                                            ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                            ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                            Dxjokdxxww = ppxfxbqfkfVarI0;
                                        } else {
                                            if (ppxfxbqfkfVar3 == 0) {
                                                ppxfxbqfkfVar3 = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                            }
                                            if (Dxjokdxxww != 0) {
                                                ppxfxbqfkfVar3.zoijcleaow(Dxjokdxxww);
                                                Dxjokdxxww = 0;
                                            }
                                            ppxfxbqfkfVar3.zoijcleaow(ppxfxbqfkfVarI0);
                                        }
                                    } else {
                                        Dxjokdxxww = Dxjokdxxww;
                                        ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                    }
                                    ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0();
                                    Dxjokdxxww = Dxjokdxxww;
                                    ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                }
                                if (i13 == 1) {
                                    Dxjokdxxww = Dxjokdxxww;
                                    ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                } else {
                                    Dxjokdxxww = Dxjokdxxww;
                                    ppxfxbqfkfVar3 = ppxfxbqfkfVar3;
                                }
                            }
                            Dxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar3);
                        }
                    }
                }
            }
            z.gtknphoqwx.ppxfxbqfkf(ppxfxbqfkfVar, ppxfxbqfkfVar2, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j13) {
        this.f6678zeieaojujs = j13;
    }

    public final void setOnViewTreeOwnersAvailable(tg.draadjrbmk draadjrbmkVar) {
        zoijcleaow viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            draadjrbmkVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f6626iwxlajgraz = draadjrbmkVar;
    }

    @Override // z.opjhrmiecq
    public void setShowLayoutBounds(boolean z13) {
        this.f6664uwvvkdfqfp = z13;
    }

    public void setUncaughtExceptionHandler(z.uawqvzlxes.iobyxmoadg iobyxmoadgVar) {
        this.f6647oipsdeybqn.hcddaimhww(iobyxmoadgVar);
    }

    public final void setUncaughtExceptionHandler$ui_release(z.uawqvzlxes.iobyxmoadg iobyxmoadgVar) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // t.lqeggnwhkg
    public void vdvldrhtss(float[] fArr) {
        yzdjzghtvl();
        h.hszhottldk.draadjrbmk(fArr, this.f6666weqkydbzbr);
        hcddaimhww.btonecajqb(fArr, Float.intBitsToFloat((int) (this.f6660tbqsvytpvh >> 32)), Float.intBitsToFloat((int) (this.f6660tbqsvytpvh & 4294967295L)), this.f6628iyctptxqzt);
    }

    @Override // t.dsvhmnatus
    public long wflxmlrfwp(long j13) {
        yzdjzghtvl();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat((int) (this.f6660tbqsvytpvh >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat((int) (this.f6660tbqsvytpvh & 4294967295L));
        return h.hszhottldk.gxszxtbevo(this.f6640lrnfpwlwnk, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))));
    }

    @Override // f.oxmwwwfdhm
    public boolean wkgbmnqykc(int i13) {
        sopmlzcsov sopmlzcsovVar;
        Rect rectIobyxmoadg = null;
        if (!a.nufgyqmvbu.f65wkgbmnqykc) {
            androidx.compose.ui.focus.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow;
            if (androidx.compose.ui.focus.wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.zoijcleaow()) || androidx.compose.ui.focus.wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar.ppxfxbqfkf())) {
                return false;
            }
            Integer numPpxfxbqfkf = androidx.compose.ui.focus.gxszxtbevo.ppxfxbqfkf(i13);
            if (numPpxfxbqfkf == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numPpxfxbqfkf.intValue();
            g.lqeggnwhkg embeddedViewFocusRect = getEmbeddedViewFocusRect();
            rectIobyxmoadg = embeddedViewFocusRect != null ? h.yzdjzghtvl.iobyxmoadg(embeddedViewFocusRect) : null;
            skhdrjzrfn skhdrjzrfnVarIobyxmoadg = skhdrjzrfn.f7064gxszxtbevo.iobyxmoadg();
            View viewWkgbmnqykc = rectIobyxmoadg == null ? skhdrjzrfnVarIobyxmoadg.wkgbmnqykc(this, findFocus(), iIntValue) : skhdrjzrfnVarIobyxmoadg.gxszxtbevo(this, rectIobyxmoadg, iIntValue);
            if (viewWkgbmnqykc != null) {
                return androidx.compose.ui.focus.gxszxtbevo.zoijcleaow(viewWkgbmnqykc, Integer.valueOf(iIntValue), rectIobyxmoadg);
            }
            return false;
        }
        androidx.compose.ui.focus.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow;
        if (androidx.compose.ui.focus.wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar2.zoijcleaow()) || androidx.compose.ui.focus.wkgbmnqykc.draadjrbmk(i13, iobyxmoadgVar2.ppxfxbqfkf()) || !hasFocus() || (sopmlzcsovVar = this.f6673yfnezrywwk) == null) {
            return false;
        }
        Integer numPpxfxbqfkf2 = androidx.compose.ui.focus.gxszxtbevo.ppxfxbqfkf(i13);
        if (numPpxfxbqfkf2 == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue2 = numPpxfxbqfkf2.intValue();
        View rootView = getRootView();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        View viewWkgbmnqykc2 = skhdrjzrfn.f7064gxszxtbevo.iobyxmoadg().wkgbmnqykc(viewGroup, viewFindFocus, iIntValue2);
        if (!androidx.compose.ui.focus.nufgyqmvbu.iobyxmoadg(i13) || !sopmlzcsovVar.hasFocus()) {
            g.lqeggnwhkg embeddedViewFocusRect2 = getEmbeddedViewFocusRect();
            rectIobyxmoadg = embeddedViewFocusRect2 != null ? h.yzdjzghtvl.iobyxmoadg(embeddedViewFocusRect2) : null;
            if (viewWkgbmnqykc2 != null && rectIobyxmoadg != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, rectIobyxmoadg);
                viewGroup.offsetRectIntoDescendantCoords(viewWkgbmnqykc2, rectIobyxmoadg);
            }
        }
        if (viewWkgbmnqykc2 == null || viewWkgbmnqykc2 == viewFindFocus) {
            return false;
        }
        View focusedChild = sopmlzcsovVar.getFocusedChild();
        ViewParent parent = viewWkgbmnqykc2.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return androidx.compose.ui.focus.gxszxtbevo.zoijcleaow(viewWkgbmnqykc2, Integer.valueOf(iIntValue2), rectIobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z.opjhrmiecq
    public Object wwaezpbzkn(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        iwizpuwonk iwizpuwonkVar;
        if (gxszxtbevoVar instanceof iwizpuwonk) {
            iwizpuwonkVar = (iwizpuwonk) gxszxtbevoVar;
            int i13 = iwizpuwonkVar.f6690jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iwizpuwonkVar.f6690jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
            }
        } else {
            iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
        }
        Object obj = iwizpuwonkVar.f6692zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iwizpuwonkVar.f6690jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            AtomicReference atomicReference = this.f6618hszhottldk;
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr();
            iwizpuwonkVar.f6690jyumaefscl = 1;
            if (a.agtfadlqog.wkgbmnqykc(atomicReference, cqumvgiudrVar, rgvfuqvkyqVar, iwizpuwonkVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // z.opjhrmiecq
    public void yadqdtsiqt(z.pkzmftpjix pkzmftpjixVar) {
        b.zoijcleaow zoijcleaowVar;
        if (a.nufgyqmvbu.f66zoijcleaow) {
            getRectManager().ojitshcjhn(pkzmftpjixVar);
        }
        if (lrnfpwlwnk() && a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.nufgyqmvbu(pkzmftpjixVar);
        }
    }

    @Override // z.opjhrmiecq
    public void yggfygwlhe(z.pkzmftpjix pkzmftpjixVar) {
        b.zoijcleaow zoijcleaowVar;
        if (lrnfpwlwnk() && a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.dxjokdxxww(pkzmftpjixVar);
        }
    }

    @Override // z.opjhrmiecq
    public void ylkuphrtab(z.pkzmftpjix pkzmftpjixVar) {
        b.zoijcleaow zoijcleaowVar;
        if (lrnfpwlwnk() && a.nufgyqmvbu.f63ppxfxbqfkf && (zoijcleaowVar = this.f6635jztzpxfvev) != null) {
            zoijcleaowVar.wflxmlrfwp(pkzmftpjixVar);
        }
    }

    public final Object zeieaojujs(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWypolnanlu = this.f6636kegysxyocb.wypolnanlu(gxszxtbevoVar);
        return objWypolnanlu == mg.zoijcleaow.gxszxtbevo() ? objWypolnanlu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // f.oxmwwwfdhm
    public void zoijcleaow() {
        if (isFocused() || (!a.nufgyqmvbu.f65wkgbmnqykc && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i13, layoutParams);
    }

    @Override // z.opjhrmiecq
    public androidx.compose.ui.platform.btonecajqb getAccessibilityManager() {
        return this.f6642mbcevpiqjq;
    }

    @Override // z.opjhrmiecq
    public androidx.compose.ui.platform.gtknphoqwx getClipboard() {
        return this.f6654rlfsiqarku;
    }

    @Override // z.opjhrmiecq
    public androidx.compose.ui.platform.draadjrbmk getClipboardManager() {
        return this.f6643metgxyhuhe;
    }

    @Override // z.opjhrmiecq
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.f6671yadqdtsiqt;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public androidx.collection.iozdgvuglv m0getLayoutNodes() {
        return this.f6598cllcsxoeiz;
    }

    @Override // z.opjhrmiecq
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, int i14) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i13;
        layoutParamsGenerateDefaultLayoutParams.height = i14;
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i13, layoutParams, true);
    }
}
