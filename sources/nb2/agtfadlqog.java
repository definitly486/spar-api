package nb2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final dxjokdxxww f69544iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final draadjrbmk f69545ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final hkdspvbjdz f69546wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final gtknphoqwx f69547zoijcleaow;

    public agtfadlqog(dxjokdxxww persistentMetricsEventDataSource, gtknphoqwx persistentMetricsEventDtoFactory, draadjrbmk persistentMetricsEventMapper, iwizpuwonk.zoijcleaow logger) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventDataSource, "persistentMetricsEventDataSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventDtoFactory, "persistentMetricsEventDtoFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventMapper, "persistentMetricsEventMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logger, "logger");
        this.f69544iobyxmoadg = persistentMetricsEventDataSource;
        this.f69547zoijcleaow = persistentMetricsEventDtoFactory;
        this.f69545ppxfxbqfkf = persistentMetricsEventMapper;
        this.f69546wkgbmnqykc = logger;
    }

    public final void iobyxmoadg(List persistentMetricsEvents) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEvents, "persistentMetricsEvents");
        dxjokdxxww dxjokdxxwwVar = this.f69544iobyxmoadg;
        draadjrbmk draadjrbmkVar = this.f69545ppxfxbqfkf;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(persistentMetricsEvents, 10));
        Iterator it = persistentMetricsEvents.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmkVar.iobyxmoadg((wkgbmnqykc) it.next()));
        }
        dxjokdxxwwVar.iobyxmoadg(arrayList);
    }
}
