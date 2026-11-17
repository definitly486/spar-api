package ib2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.IntentSender;
import gg.cqumvgiudr;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import hg.tzroggbefp;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pb2.rgvfuqvkyq;
import pb2.wflxmlrfwp;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final C0998iobyxmoadg f42343zoijcleaow = new C0998iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f42344iobyxmoadg;

    /* JADX INFO: renamed from: ib2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0998iobyxmoadg {
        public /* synthetic */ C0998iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0998iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f42345zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable it) {
            zdlpuopuiu.btonecajqb(it, "it");
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f42346zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((wwaezpbzkn) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(wwaezpbzkn it) {
            zdlpuopuiu.btonecajqb(it, "it");
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Context f42347zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(Context context) {
            super(0);
            this.f42347zdlpuopuiu = context;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final mb2.zoijcleaow invoke() {
            return mb2.zoijcleaow.f66778zoijcleaow.iobyxmoadg(this.f42347zdlpuopuiu);
        }
    }

    public iobyxmoadg(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f42344iobyxmoadg = gg.draadjrbmk.zoijcleaow(new zoijcleaow(context));
    }

    private final mb2.zoijcleaow iobyxmoadg() {
        return (mb2.zoijcleaow) this.f42344iobyxmoadg.getValue();
    }

    private final pb2.iobyxmoadg zoijcleaow(pb2.iobyxmoadg iobyxmoadgVar) {
        return pb2.draadjrbmk.iobyxmoadg(rgvfuqvkyq.iobyxmoadg(iobyxmoadgVar, ob2.ppxfxbqfkf.f72563iobyxmoadg.zoijcleaow()), ppxfxbqfkf.f42345zdlpuopuiu);
    }

    public final void ppxfxbqfkf(Exception reason) {
        String str;
        zdlpuopuiu.btonecajqb(reason, "reason");
        if (reason instanceof ActivityNotFoundException) {
            str = "ActivityLauncher.ActivityNotFoundException";
        } else if (reason instanceof IntentSender.SendIntentException) {
            str = "ActivityLauncher.SendIntentException";
        } else {
            str = cllcsxoeiz.zoijcleaow(reason.getClass()).yggfygwlhe() + " || " + reason.getMessage() + " ||| " + reason.getCause();
        }
        wflxmlrfwp.zoijcleaow(zoijcleaow(iobyxmoadg().iobyxmoadg(new mb2.ppxfxbqfkf("launchActivity.error", tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("errorDescription", str))))), null, wkgbmnqykc.f42346zdlpuopuiu, 1, null);
    }
}
