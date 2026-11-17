package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.agtfadlqog f7096yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx f7097zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(androidx.lifecycle.gtknphoqwx gtknphoqwxVar, androidx.lifecycle.agtfadlqog agtfadlqogVar) {
            super(0);
            this.f7097zdlpuopuiu = gtknphoqwxVar;
            this.f7096yggfygwlhe = agtfadlqogVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            this.f7097zdlpuopuiu.wkgbmnqykc(this.f7096yggfygwlhe);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.iobyxmoadg ppxfxbqfkf(final androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar, androidx.lifecycle.gtknphoqwx gtknphoqwxVar) {
        if (gtknphoqwxVar.zoijcleaow().compareTo(androidx.lifecycle.gtknphoqwx.zoijcleaow.DESTROYED) > 0) {
            androidx.lifecycle.agtfadlqog agtfadlqogVar = new androidx.lifecycle.agtfadlqog() { // from class: androidx.compose.ui.platform.u
                @Override // androidx.lifecycle.agtfadlqog
                public final void nufgyqmvbu(androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar2) {
                    v.wkgbmnqykc(iobyxmoadgVar, vdvldrhtssVar, iobyxmoadgVar2);
                }
            };
            gtknphoqwxVar.iobyxmoadg(agtfadlqogVar);
            return new iobyxmoadg(gtknphoqwxVar, agtfadlqogVar);
        }
        throw new IllegalStateException(("Cannot configure " + iobyxmoadgVar + " to disposeComposition at Lifecycle ON_DESTROY: " + gtknphoqwxVar + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(androidx.compose.ui.platform.iobyxmoadg iobyxmoadgVar, androidx.lifecycle.vdvldrhtss vdvldrhtssVar, androidx.lifecycle.gtknphoqwx.iobyxmoadg iobyxmoadgVar2) {
        if (iobyxmoadgVar2 == androidx.lifecycle.gtknphoqwx.iobyxmoadg.ON_DESTROY) {
            iobyxmoadgVar.gxszxtbevo();
        }
    }
}
