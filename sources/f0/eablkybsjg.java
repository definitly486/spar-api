package f0;

import android.os.CancellationSignal;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f32497zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(CancellationSignal cancellationSignal) {
            super(1);
            this.f32497zdlpuopuiu = cancellationSignal;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            if (th2 != null) {
                this.f32497zdlpuopuiu.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final auzgnhcxok ppxfxbqfkf(cllcsxoeiz cllcsxoeizVar, CancellationSignal cancellationSignal, rgvfuqvkyq rgvfuqvkyqVar) {
        final auzgnhcxok auzgnhcxokVarWkgbmnqykc = pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, rgvfuqvkyqVar, 3, null);
        auzgnhcxokVarWkgbmnqykc.pmvmpeiblj(new iobyxmoadg(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: f0.wkgbmnqykc
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                eablkybsjg.wkgbmnqykc(auzgnhcxokVarWkgbmnqykc);
            }
        });
        return auzgnhcxokVarWkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(auzgnhcxok auzgnhcxokVar) {
        auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
    }
}
