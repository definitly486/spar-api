package androidx.compose.ui.platform;

import android.view.View;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f7045iobyxmoadg = iobyxmoadg.f7046iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f7046iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public final s iobyxmoadg() {
            return ppxfxbqfkf.f7047zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf implements s {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f7047zoijcleaow = new ppxfxbqfkf();

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ a2.zoijcleaow f7048jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f7049yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.iobyxmoadg f7050zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, a2.zoijcleaow zoijcleaowVar2) {
                super(0);
                this.f7050zdlpuopuiu = iobyxmoadgVar;
                this.f7049yggfygwlhe = zoijcleaowVar;
                this.f7048jyumaefscl = zoijcleaowVar2;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f7050zdlpuopuiu.removeOnAttachStateChangeListener(this.f7049yggfygwlhe);
                a2.iobyxmoadg.lqeggnwhkg(this.f7050zdlpuopuiu, this.f7048jyumaefscl);
            }
        }

        public static final class zoijcleaow implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.iobyxmoadg f7051zdlpuopuiu;

            zoijcleaow(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar) {
                this.f7051zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (a2.iobyxmoadg.gxszxtbevo(this.f7051zdlpuopuiu)) {
                    return;
                }
                this.f7051zdlpuopuiu.gxszxtbevo();
            }
        }

        private ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ppxfxbqfkf(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.gxszxtbevo();
        }

        @Override // androidx.compose.ui.platform.s
        public tg.iobyxmoadg iobyxmoadg(final androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadgVar);
            iobyxmoadgVar.addOnAttachStateChangeListener(zoijcleaowVar);
            a2.zoijcleaow zoijcleaowVar2 = new a2.zoijcleaow() { // from class: androidx.compose.ui.platform.t
                @Override // a2.zoijcleaow
                public final void zoijcleaow() {
                    s.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar);
                }
            };
            a2.iobyxmoadg.iobyxmoadg(iobyxmoadgVar, zoijcleaowVar2);
            return new iobyxmoadg(iobyxmoadgVar, zoijcleaowVar, zoijcleaowVar2);
        }
    }

    public static final class wkgbmnqykc implements s {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final wkgbmnqykc f7052zoijcleaow = new wkgbmnqykc();

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f7053yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.iobyxmoadg f7054zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar, ppxfxbqfkf ppxfxbqfkfVar) {
                super(0);
                this.f7054zdlpuopuiu = iobyxmoadgVar;
                this.f7053yggfygwlhe = ppxfxbqfkfVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f7054zdlpuopuiu.removeOnAttachStateChangeListener(this.f7053yggfygwlhe);
            }
        }

        public static final class ppxfxbqfkf implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f7055yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.iobyxmoadg f7056zdlpuopuiu;

            ppxfxbqfkf(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar) {
                this.f7056zdlpuopuiu = iobyxmoadgVar;
                this.f7055yggfygwlhe = hkdspvbjdzVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg = androidx.lifecycle.vipkmwdibw.iobyxmoadg(this.f7056zdlpuopuiu);
                androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar = this.f7056zdlpuopuiu;
                if (vdvldrhtssVarIobyxmoadg != null) {
                    this.f7055yggfygwlhe.f60015zdlpuopuiu = v.ppxfxbqfkf(iobyxmoadgVar, vdvldrhtssVarIobyxmoadg.getLifecycle());
                    this.f7056zdlpuopuiu.removeOnAttachStateChangeListener(this);
                } else {
                    w.iobyxmoadg.ppxfxbqfkf("View tree for " + iobyxmoadgVar + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f7057zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar) {
                super(0);
                this.f7057zdlpuopuiu = hkdspvbjdzVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                ((tg.iobyxmoadg) this.f7057zdlpuopuiu.f60015zdlpuopuiu).invoke();
            }
        }

        private wkgbmnqykc() {
        }

        @Override // androidx.compose.ui.platform.s
        public tg.iobyxmoadg iobyxmoadg(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar) {
            if (!iobyxmoadgVar.isAttachedToWindow()) {
                kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(iobyxmoadgVar, hkdspvbjdzVar);
                iobyxmoadgVar.addOnAttachStateChangeListener(ppxfxbqfkfVar);
                hkdspvbjdzVar.f60015zdlpuopuiu = new iobyxmoadg(iobyxmoadgVar, ppxfxbqfkfVar);
                return new zoijcleaow(hkdspvbjdzVar);
            }
            androidx.lifecycle.vdvldrhtss vdvldrhtssVarIobyxmoadg = androidx.lifecycle.vipkmwdibw.iobyxmoadg(iobyxmoadgVar);
            if (vdvldrhtssVarIobyxmoadg != null) {
                return v.ppxfxbqfkf(iobyxmoadgVar, vdvldrhtssVarIobyxmoadg.getLifecycle());
            }
            w.iobyxmoadg.ppxfxbqfkf("View tree for " + iobyxmoadgVar + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    public static final class zoijcleaow implements s {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f7058zoijcleaow = new zoijcleaow();

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0120zoijcleaow f7059yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.iobyxmoadg f7060zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar, ViewOnAttachStateChangeListenerC0120zoijcleaow viewOnAttachStateChangeListenerC0120zoijcleaow) {
                super(0);
                this.f7060zdlpuopuiu = iobyxmoadgVar;
                this.f7059yggfygwlhe = viewOnAttachStateChangeListenerC0120zoijcleaow;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f7060zdlpuopuiu.removeOnAttachStateChangeListener(this.f7059yggfygwlhe);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.s$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0120zoijcleaow implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.iobyxmoadg f7061zdlpuopuiu;

            ViewOnAttachStateChangeListenerC0120zoijcleaow(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar) {
                this.f7061zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.f7061zdlpuopuiu.gxszxtbevo();
            }
        }

        private zoijcleaow() {
        }

        @Override // androidx.compose.ui.platform.s
        public tg.iobyxmoadg iobyxmoadg(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar) {
            ViewOnAttachStateChangeListenerC0120zoijcleaow viewOnAttachStateChangeListenerC0120zoijcleaow = new ViewOnAttachStateChangeListenerC0120zoijcleaow(iobyxmoadgVar);
            iobyxmoadgVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0120zoijcleaow);
            return new iobyxmoadg(iobyxmoadgVar, viewOnAttachStateChangeListenerC0120zoijcleaow);
        }
    }

    tg.iobyxmoadg iobyxmoadg(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar);
}
