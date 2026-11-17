package dw1;

import dk.eablkybsjg;
import dk.gxszxtbevo;
import dk.wflxmlrfwp;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f29722iobyxmoadg = wflxmlrfwp.btonecajqb(wflxmlrfwp.ppxfxbqfkf("tokenEndTime", eablkybsjg.dxjokdxxww.f29077iobyxmoadg));

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public LocalDateTime zoijcleaow(ek.eablkybsjg decoder) {
        zdlpuopuiu.btonecajqb(decoder, "decoder");
        LocalDateTime localDateTime = LocalDateTime.parse(decoder.pmvmpeiblj());
        zdlpuopuiu.dxjokdxxww(localDateTime, "parse(...)");
        return localDateTime;
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public gxszxtbevo iobyxmoadg() {
        return this.f29722iobyxmoadg;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, LocalDateTime value) {
        zdlpuopuiu.btonecajqb(encoder, "encoder");
        zdlpuopuiu.btonecajqb(value, "value");
        String string = value.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        encoder.lmojexxdyd(string);
    }
}
