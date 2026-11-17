package ub2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final sb2.iobyxmoadg f113245iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final vb2.iobyxmoadg f113246zoijcleaow;

    public zoijcleaow(sb2.iobyxmoadg analyticsRepository, vb2.iobyxmoadg eventBuilder) {
        zdlpuopuiu.btonecajqb(analyticsRepository, "analyticsRepository");
        zdlpuopuiu.btonecajqb(eventBuilder, "eventBuilder");
        this.f113245iobyxmoadg = analyticsRepository;
        this.f113246zoijcleaow = eventBuilder;
    }

    @Override // ub2.iobyxmoadg
    public void iobyxmoadg(rb2.iobyxmoadg clickstreamEvent) {
        zdlpuopuiu.btonecajqb(clickstreamEvent, "clickstreamEvent");
        this.f113245iobyxmoadg.iobyxmoadg(this.f113246zoijcleaow.iobyxmoadg(clickstreamEvent));
    }
}
