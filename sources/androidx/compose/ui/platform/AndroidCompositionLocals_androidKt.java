package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.c1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\" \u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019\" \u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", "content", "iobyxmoadg", "(Landroidx/compose/ui/platform/AndroidComposeView;Ltg/rgvfuqvkyq;Landroidx/compose/runtime/draadjrbmk;I)V", "Landroid/content/Context;", "context", "Le0/eablkybsjg;", "agtfadlqog", "(Landroid/content/Context;Landroidx/compose/runtime/draadjrbmk;I)Le0/eablkybsjg;", "Landroid/content/res/Configuration;", "configuration", "Le0/ppxfxbqfkf;", "wflxmlrfwp", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/draadjrbmk;I)Le0/ppxfxbqfkf;", "", ExternalMetricsManagerImpl.NAME, "", "draadjrbmk", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/a;", "Landroidx/compose/runtime/a;", "gxszxtbevo", "()Landroidx/compose/runtime/a;", "LocalConfiguration", "zoijcleaow", "lqeggnwhkg", "LocalContext", "Landroid/content/res/Resources;", "ppxfxbqfkf", "btonecajqb", "LocalResources", "wkgbmnqykc", "nufgyqmvbu", "LocalImageVectorCache", "eablkybsjg", "dxjokdxxww", "LocalResourceIdCache", "Landroid/view/View;", "gtknphoqwx", "LocalView", "Landroidx/lifecycle/vdvldrhtss;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6719iobyxmoadg = androidx.compose.runtime.lmojexxdyd.nufgyqmvbu(null, iobyxmoadg.f6738zdlpuopuiu, 1, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6722zoijcleaow = androidx.compose.runtime.lmojexxdyd.btonecajqb(zoijcleaow.f6748zdlpuopuiu);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6720ppxfxbqfkf = androidx.compose.runtime.lmojexxdyd.dxjokdxxww(eablkybsjg.f6732zdlpuopuiu);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6721wkgbmnqykc = androidx.compose.runtime.lmojexxdyd.btonecajqb(ppxfxbqfkf.f6742zdlpuopuiu);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6717eablkybsjg = androidx.compose.runtime.lmojexxdyd.btonecajqb(wkgbmnqykc.f6747zdlpuopuiu);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final androidx.compose.runtime.a f6718gxszxtbevo = androidx.compose.runtime.lmojexxdyd.btonecajqb(gxszxtbevo.f6737zdlpuopuiu);

    public static final class agtfadlqog implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ e0.eablkybsjg f6723zdlpuopuiu;

        agtfadlqog(e0.eablkybsjg eablkybsjgVar) {
            this.f6723zdlpuopuiu = eablkybsjgVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f6723zdlpuopuiu.iobyxmoadg();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f6723zdlpuopuiu.iobyxmoadg();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i13) {
            this.f6723zdlpuopuiu.iobyxmoadg();
        }
    }

    static final class btonecajqb extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f6724jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6725yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6726zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(AndroidComposeView androidComposeView, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13) {
            super(2);
            this.f6726zdlpuopuiu = androidComposeView;
            this.f6725yggfygwlhe = rgvfuqvkyqVar;
            this.f6724jyumaefscl = i13;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            AndroidCompositionLocals_androidKt.iobyxmoadg(this.f6726zdlpuopuiu, this.f6725yggfygwlhe, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(this.f6724jyumaefscl | 1));
        }
    }

    public static final class draadjrbmk implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ e0.ppxfxbqfkf f6727yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Configuration f6728zdlpuopuiu;

        draadjrbmk(Configuration configuration, e0.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f6728zdlpuopuiu = configuration;
            this.f6727yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f6727yggfygwlhe.ppxfxbqfkf(this.f6728zdlpuopuiu.updateFrom(configuration));
            this.f6728zdlpuopuiu.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f6727yggfygwlhe.iobyxmoadg();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i13) {
            this.f6727yggfygwlhe.iobyxmoadg();
        }
    }

    static final class dxjokdxxww extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tg.rgvfuqvkyq f6729jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ kegysxyocb f6730yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f6731zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(AndroidComposeView androidComposeView, kegysxyocb kegysxyocbVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            super(2);
            this.f6731zdlpuopuiu = androidComposeView;
            this.f6730yggfygwlhe = kegysxyocbVar;
            this.f6729jyumaefscl = rgvfuqvkyqVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if (!draadjrbmkVar.vdvldrhtss((i13 & 3) != 2, i13 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1059770793, i13, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:144)");
            }
            zeieaojujs.iobyxmoadg(this.f6731zdlpuopuiu, this.f6730yggfygwlhe, this.f6729jyumaefscl, draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final eablkybsjg f6732zdlpuopuiu = new eablkybsjg();

        eablkybsjg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Resources invoke(androidx.compose.runtime.cdpycssgdh cdpycssgdhVar) {
            cdpycssgdhVar.yggfygwlhe(AndroidCompositionLocals_androidKt.gxszxtbevo());
            return ((Context) cdpycssgdhVar.yggfygwlhe(AndroidCompositionLocals_androidKt.lqeggnwhkg())).getResources();
        }
    }

    static final class gtknphoqwx extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f6733yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Context f6734zdlpuopuiu;

        public static final class iobyxmoadg implements androidx.compose.runtime.ntlheqmsrt {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ Context f6735iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f6736zoijcleaow;

            public iobyxmoadg(Context context, draadjrbmk draadjrbmkVar) {
                this.f6735iobyxmoadg = context;
                this.f6736zoijcleaow = draadjrbmkVar;
            }

            @Override // androidx.compose.runtime.ntlheqmsrt
            public void iobyxmoadg() {
                this.f6735iobyxmoadg.getApplicationContext().unregisterComponentCallbacks(this.f6736zoijcleaow);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(Context context, draadjrbmk draadjrbmkVar) {
            super(1);
            this.f6734zdlpuopuiu = context;
            this.f6733yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.ntlheqmsrt invoke(androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
            this.f6734zdlpuopuiu.getApplicationContext().registerComponentCallbacks(this.f6733yggfygwlhe);
            return new iobyxmoadg(this.f6734zdlpuopuiu, this.f6733yggfygwlhe);
        }
    }

    static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final gxszxtbevo f6737zdlpuopuiu = new gxszxtbevo();

        gxszxtbevo() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.draadjrbmk("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6738zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.draadjrbmk("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.iwxlajgraz f6739zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar) {
            super(1);
            this.f6739zdlpuopuiu = iwxlajgrazVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Configuration) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Configuration configuration) {
            AndroidCompositionLocals_androidKt.ppxfxbqfkf(this.f6739zdlpuopuiu, new Configuration(configuration));
        }
    }

    static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ roivzttewh f6740zdlpuopuiu;

        public static final class iobyxmoadg implements androidx.compose.runtime.ntlheqmsrt {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ roivzttewh f6741iobyxmoadg;

            public iobyxmoadg(roivzttewh roivzttewhVar) {
                this.f6741iobyxmoadg = roivzttewhVar;
            }

            @Override // androidx.compose.runtime.ntlheqmsrt
            public void iobyxmoadg() {
                this.f6741iobyxmoadg.ppxfxbqfkf();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(roivzttewh roivzttewhVar) {
            super(1);
            this.f6740zdlpuopuiu = roivzttewhVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.ntlheqmsrt invoke(androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
            return new iobyxmoadg(this.f6740zdlpuopuiu);
        }
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f6742zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final e0.ppxfxbqfkf invoke() {
            AndroidCompositionLocals_androidKt.draadjrbmk("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    static final class wflxmlrfwp extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ agtfadlqog f6743yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Context f6744zdlpuopuiu;

        public static final class iobyxmoadg implements androidx.compose.runtime.ntlheqmsrt {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ Context f6745iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ agtfadlqog f6746zoijcleaow;

            public iobyxmoadg(Context context, agtfadlqog agtfadlqogVar) {
                this.f6745iobyxmoadg = context;
                this.f6746zoijcleaow = agtfadlqogVar;
            }

            @Override // androidx.compose.runtime.ntlheqmsrt
            public void iobyxmoadg() {
                this.f6745iobyxmoadg.getApplicationContext().unregisterComponentCallbacks(this.f6746zoijcleaow);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(Context context, agtfadlqog agtfadlqogVar) {
            super(1);
            this.f6744zdlpuopuiu = context;
            this.f6743yggfygwlhe = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.ntlheqmsrt invoke(androidx.compose.runtime.ulzqkzuiru ulzqkzuiruVar) {
            this.f6744zdlpuopuiu.getApplicationContext().registerComponentCallbacks(this.f6743yggfygwlhe);
            return new iobyxmoadg(this.f6744zdlpuopuiu, this.f6743yggfygwlhe);
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f6747zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final e0.eablkybsjg invoke() {
            AndroidCompositionLocals_androidKt.draadjrbmk("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    }

    static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f6748zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.draadjrbmk("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    private static final e0.eablkybsjg agtfadlqog(Context context, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1348507246, i13, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:150)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = new e0.eablkybsjg();
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        e0.eablkybsjg eablkybsjgVar = (e0.eablkybsjg) objYadqdtsiqt;
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new agtfadlqog(eablkybsjgVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) objYadqdtsiqt2;
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(context);
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt3 = new wflxmlrfwp(context, agtfadlqogVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
        }
        androidx.compose.runtime.jlmebxxoox.zoijcleaow(eablkybsjgVar, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return eablkybsjgVar;
    }

    public static final androidx.compose.runtime.a btonecajqb() {
        return f6720ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void draadjrbmk(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final androidx.compose.runtime.a dxjokdxxww() {
        return f6717eablkybsjg;
    }

    public static final androidx.compose.runtime.a getLocalLifecycleOwner() {
        return q2.kcexrzcfyt.ppxfxbqfkf();
    }

    public static final androidx.compose.runtime.a gtknphoqwx() {
        return f6718gxszxtbevo;
    }

    public static final androidx.compose.runtime.a gxszxtbevo() {
        return f6719iobyxmoadg;
    }

    public static final void iobyxmoadg(AndroidComposeView androidComposeView, tg.rgvfuqvkyq rgvfuqvkyqVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-520299287);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(androidComposeView) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 32 : 16;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 19) != 18, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-520299287, i14, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:99)");
            }
            Context context = androidComposeView.getContext();
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            androidx.compose.runtime.iwxlajgraz iwxlajgrazVar = (androidx.compose.runtime.iwxlajgraz) objYadqdtsiqt;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new lqeggnwhkg(iwxlajgrazVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            androidComposeView.setConfigurationChangeObserver((tg.draadjrbmk) objYadqdtsiqt2);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new kegysxyocb(context);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            kegysxyocb kegysxyocbVar = (kegysxyocb) objYadqdtsiqt3;
            AndroidComposeView.zoijcleaow viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = auzgnhcxok.zoijcleaow(androidComposeView, viewTreeOwners.zoijcleaow());
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            roivzttewh roivzttewhVar = (roivzttewh) objYadqdtsiqt4;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(roivzttewhVar);
            Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt5 = new nufgyqmvbu(roivzttewhVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
            }
            androidx.compose.runtime.jlmebxxoox.zoijcleaow(wwaezpbzknVar, (tg.draadjrbmk) objYadqdtsiqt5, draadjrbmkVarBtonecajqb, 6);
            Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt6 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt6 = fiwbwshyhd.f6888iobyxmoadg.iobyxmoadg(context) ? new nuxfzjnpeb(androidComposeView.getView()) : new c();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
            }
            androidx.compose.runtime.lmojexxdyd.wkgbmnqykc(new androidx.compose.runtime.b[]{f6719iobyxmoadg.wkgbmnqykc(zoijcleaow(iwxlajgrazVar)), f6722zoijcleaow.wkgbmnqykc(context), q2.kcexrzcfyt.ppxfxbqfkf().wkgbmnqykc(viewTreeOwners.iobyxmoadg()), r5.zoijcleaow.ppxfxbqfkf().wkgbmnqykc(viewTreeOwners.zoijcleaow()), rhgxfdycjh.kcexrzcfyt.lqeggnwhkg().wkgbmnqykc(roivzttewhVar), f6718gxszxtbevo.wkgbmnqykc(androidComposeView.getView()), f6721wkgbmnqykc.wkgbmnqykc(wflxmlrfwp(context, zoijcleaow(iwxlajgrazVar), draadjrbmkVarBtonecajqb, 0)), f6717eablkybsjg.wkgbmnqykc(agtfadlqog(context, draadjrbmkVarBtonecajqb, 0)), zeieaojujs.agtfadlqog().wkgbmnqykc(Boolean.valueOf(((Boolean) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.ojitshcjhn())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), zeieaojujs.btonecajqb().wkgbmnqykc((o.iobyxmoadg) objYadqdtsiqt6)}, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1059770793, true, new dxjokdxxww(androidComposeView, kegysxyocbVar, rgvfuqvkyqVar), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, androidx.compose.runtime.b.f5523dxjokdxxww | 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        androidx.compose.runtime.a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new btonecajqb(androidComposeView, rgvfuqvkyqVar, i13));
        }
    }

    public static final androidx.compose.runtime.a lqeggnwhkg() {
        return f6722zoijcleaow;
    }

    public static final androidx.compose.runtime.a nufgyqmvbu() {
        return f6721wkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar, Configuration configuration) {
        iwxlajgrazVar.setValue(configuration);
    }

    private static final e0.ppxfxbqfkf wflxmlrfwp(Context context, Configuration configuration, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-485908294, i13, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:180)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = new e0.ppxfxbqfkf();
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        e0.ppxfxbqfkf ppxfxbqfkfVar = (e0.ppxfxbqfkf) objYadqdtsiqt;
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        Object obj = objYadqdtsiqt2;
        if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            draadjrbmkVar.jyumaefscl(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt3 = new draadjrbmk(configuration3, ppxfxbqfkfVar);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
        }
        draadjrbmk draadjrbmkVar2 = (draadjrbmk) objYadqdtsiqt3;
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(context);
        Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt4 = new gtknphoqwx(context, draadjrbmkVar2);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
        }
        androidx.compose.runtime.jlmebxxoox.zoijcleaow(ppxfxbqfkfVar, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVar, 0);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return ppxfxbqfkfVar;
    }

    private static final Configuration zoijcleaow(androidx.compose.runtime.iwxlajgraz iwxlajgrazVar) {
        return (Configuration) iwxlajgrazVar.getValue();
    }
}
