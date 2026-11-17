package xn0;

import dk.eablkybsjg;
import dk.gxszxtbevo;
import dk.wflxmlrfwp;
import java.time.LocalDate;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class iobyxmoadg implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f122926iobyxmoadg = wflxmlrfwp.ppxfxbqfkf(ExternalMetricsManagerImpl.DATE, eablkybsjg.lqeggnwhkg.f29081iobyxmoadg);

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public LocalDate zoijcleaow(ek.eablkybsjg decoder) {
        zdlpuopuiu.btonecajqb(decoder, "decoder");
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(decoder.agtfadlqog());
        zdlpuopuiu.dxjokdxxww(localDateOfEpochDay, "ofEpochDay(...)");
        return localDateOfEpochDay;
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public gxszxtbevo iobyxmoadg() {
        return this.f122926iobyxmoadg;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, LocalDate value) {
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        zdlpuopuiu.btonecajqb(value, "value");
        encoder.kcexrzcfyt(value.toEpochDay());
    }
}
